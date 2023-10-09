package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int[] iarr = new int[7];

        for(int i = 0; i < iarr.length; i++) {
            iarr[i] = (int)(Math.random() * 45) + 1;
            for(int j = 0; j < i; j++) {
                if(iarr[i] == iarr[j]) {
                    i--;
                    break;
                } else {
                    if(iarr[i] < iarr[j]) {
                        int temp;
                        temp = iarr[i];
                        iarr[i] = iarr[j];
                        iarr[j] = temp;
                    }
                }
            }
        }
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }
}
