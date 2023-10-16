package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] employee = new EmployeeDTO[3];

        employee[0] = new EmployeeDTO();
        employee[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        employee[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for(int i = 0; i < employee.length; i++) {
            System.out.println("emp["+i+"] : " + employee[i].information());
        }

        System.out.println("===========================================");

        employee[0].setEmpNo(0);
        employee[0].setEmpName("김말똥");
        employee[0].setDept("영업부");
        employee[0].setJob("팀장");
        employee[0].setAge(30);
        employee[0].setGender('M');
        employee[0].setSalary(3000000);
        employee[0].setBonusPoint(0.2);
        employee[0].setPhone("01055559999");
        employee[0].setAddress("전라도 광주");

        employee[1].setDept("기획부");
        employee[1].setJob("부장");
        employee[1].setSalary(4000000);
        employee[1].setBonusPoint(0.3);

        for(int i = 0; i < employee.length -1 ; i++) {
            System.out.println("emp["+i+"] : " + employee[i].information());
        }

        System.out.println("===========================================");

        int sumSalary = 0;
        for(int i = 0; i < employee.length; i++) {
            int yearSalary = (int)((employee[i].getSalary() + (employee[i].getSalary() * employee[i].getBonusPoint())) * 12);
            System.out.println(employee[i].getEmpName() + "의 연봉 : " + yearSalary + "원");

            sumSalary += yearSalary;

        }
        System.out.println("===========================================");

        System.out.println("직원들의 연봉의 평균 : " + sumSalary / (employee.length) + "원");
    }
}
