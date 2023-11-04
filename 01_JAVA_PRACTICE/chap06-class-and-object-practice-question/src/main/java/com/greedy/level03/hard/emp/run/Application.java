package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO employee = new EmployeeDTO();
        Scanner sc = new Scanner(System.in);

        System.out.print("사원번호 : ");
        int number = sc.nextInt();
        System.out.print("이름 : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("부서 : ");
        String dept = sc.nextLine();
        System.out.print("직급 : ");
        String job = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        System.out.print("급여 : ");
        int salary = sc.nextInt();
        System.out.print("보너스 : ");
        double bonuspoint = sc.nextDouble();
        System.out.print("전화번호 : ");
        sc.nextLine();
        String phone = sc.nextLine();
        System.out.print("주소 : ");
        String address = sc.nextLine();

        employee.setNumber(number);
        employee.setName(name);
        employee.setDept(dept);
        employee.setJob(job);
        employee.setAge(age);
        employee.setGender(gender);
        employee.setSalary(salary);
        employee.setBonusPoint(bonuspoint);
        employee.setPhone(phone);
        employee.setAddress(address);

        System.out.println(employee.getNumber());
        System.out.println(employee.getName());
        System.out.println(employee.getDept());
        System.out.println(employee.getJob());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBonusPoint());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress());

    }
}