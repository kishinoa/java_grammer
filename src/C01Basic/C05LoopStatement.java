package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatement {
    public static void main(String[] args) {
//        int a = 0;
//        while(a < 10) {
//            System.out.println("hello world");
//            a++;
//        }
//
//        while문을 활용하여 2~10까지 출력
//        int i = 2;
//        while(i <= 10) {
//            System.out.println(i);
//            i++;
//        }

//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            int i = sc.nextInt();
//            if(i==1234) {
//                System.out.println("문이 열렸다.");
//                break;
//            }
//            else {
//                System.out.println("비밀번호가 틀렸다.");
//            }
//        }

//        int count = 0;
//        while(true) {
//            int i = sc.nextInt();
//            if(i==1234) {
//                System.out.println("문이 열렸다.");
////                break키워드를 통해 가장 가까이에 있는 반복문을 즉시종료
//                break;
//            }
//            else {
//                System.out.println("비밀번호가 틀렸다.");
//            }
//            count++;
//            if(count==5) {
//                System.out.println("입력횟수 초과");
//                break;
//            }
//        }

//        입력한 숫자의 구구단 단수 출력
//        while (true) {
//            System.out.println("구구단 단수를 입력해주세요");
//            int i = sc.nextInt();
//            int count = 1;
//            if(i == 10) break;
//            while(count < 10) {
//                System.out.println(i + " X " + count + " = " + i*count);
//                count++;
//            }
//        }

//        do while문 : 무조건 1번은 실행되는 while문
//        int a = 100;
//        do {
//            System.out.println(a);
//        }
//        while(a<10);

//        for문 : 초기식, 조건식, 증감식이 모두 포함된 반복문
//        for문은 사용했던 변수명을 for문이 끝난 이후에 재선언이 가능
//        for(int a = 0; a < 10; a++) {
//            System.out.println(a);
//        }

//        1~10중에 홀수만 출력하기
//        for(int i = 1; i < 11; i++) {
//            if(i%2==1) {
//                System.out.println(i);
//            }
//        }

//        1~20중에 짝수의 총합 출력
//        int sum = 0;
//        for (int i = 0; i < 21; i++) {
//            if(i%2==0) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

//        두수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int min = a>b?b:a;
//        for(int i = min; i>0; i--) {
//            if(a%i==0&&b%i==0) {
//                System.out.println(i);
//                break;
//            }
//        }

//        소수구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는수
//        사용자가 입력한 값이 소수인지 아닌지 판별해주는 프로그램
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int count = 0;
//        for(int i = 2; i <= input; i++) {
//            if(input % i == 0) {
//                count++;
//            }
//        }
//        if(count==1) {
//            System.out.println("소수");
//        }
//        else {
//            System.out.println("소수 아님");
//        }

//        continue : 반복문의 조건식으로 이동하는 명령어
//        홀수만 출력
//        for(int i = 1; i < 11; i++) {
//            continue는 코드의 직관성과 가독성을 위해 사용
//            if(i%2==0) continue;
//            System.out.println(i);
//        }

//        향상된(enhanced) for문 - for each문
//        int[] arr = {1,3,5,7};
//        일반 for문을 활용한 배열 접근 방식
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        향상된 for문을 활용한 배열 접근 방식
//        for(int i : arr) {
//            System.out.println(i);
//        }
//        일반 for문을 통한 arr의 저장된 값 변경
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] += 10;
//        }
//        참조형변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리값이 출력
//        System.out.println(Arrays.toString(arr));
//        향상된 for문을 통한 arr의 저장된 값 변경 -> 원본 값 변경 불가
/*        for(int i : arr) {
            i += 10;
        }
        System.out.println(Arrays.toString(arr));*/

//        자바 변수의 유효범위 : {}
//        int num = 10;
//        if(true) {
//            num = 20;
//            int num2 = 20;
//        }
//        num2 = 30 // if문 중괄호 내에서 정의된 변수는 해당 중괄호 밖에서는 사용불가

//        다중반복문
//        2~9단까지 한꺼번에 출력 + 각 단마다 몇단입니다. 출력
//        for(int i = 2; i < 10; i++) {
//            System.out.println(i + "단 입니다.");
//            for(int j = 1; j < 10; j++) {
//                System.out.println(i + " X " + j + " = " + i*j);
//            }
//        }

//        라벨문 : 반복문에 이름을 붙이는 것
//        loop1:
//        for(int i = 0; i < 10; i++) {
//            loop2:
//            for(int j = 0; j < 10; j++) {
//                if(true) {
//                    System.out.println(i);
//                    break loop1;  // 원하는 for문을 라벨링을 통해 종료시킬 수 있다
//                }
//            }
//        }

        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9}, {10, 11, 12}};
        System.out.println(arr[1][2]); // 1번째 배열의 2번째 값을 찾는 것
//        숫자 11이 위치한 배열의 index값(1,2 또는 3,1) 출력
//        가장 먼저 찾아지는 11의 위차만 출력
        loop1:
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==11) {
                    System.out.println(i + ", " + j);
                    break loop1;  // 원하는 for문을 라벨링을 통해 종료시킬 수 있다
                }
            }
        }

//        라벨링 활용 문제풀이
//        100~200까지 수 중에서 가장 작은 소수를 출력
        loop1 :
        for(int i = 100; i < 201; i++) {
            loop2 :
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0) {
                    break loop2;
                }
                System.out.println(i);
                break loop1;
            }
        }
    }
}
