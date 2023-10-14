package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        StudentVO student = new StudentVO(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.next().charAt(0));

        student.printInformation();
    }
}
