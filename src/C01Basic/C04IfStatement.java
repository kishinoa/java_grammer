package C01Basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04IfStatement {
    public static void main(String[] args) {
//        도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        if(i==answer) {
//            System.out.println("문이 열렸습니다.");
//        }
//        else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

//        교통카드 예제
//        현재 가지고 있는돈은 얼마인지 묻는다
//        입력값을 받아서, 10000원 이상이면 택시를 타라고 출력
//        3000원 이상이면 버스를 타라고 출력
//        그렇지 않으면 걸아가라고 출력
//        Scanner sc = new Scanner(System.in);
//        int in = sc.nextInt();
//        if, else if 구문에서 조건식은 택1로서, 한 조건에 해당하면 실행후 구문밖으로 빠져나감
//        if(in >= 10000) {
//            System.out.println("택시타");
//        }
//        else if(in >= 3000){
//            System.out.println("버스타");
//        }
//        else {
//            System.out.println("걸어가");
//        }

//        if(in >= 10000) {
//            System.out.println("택시타");
//        }
//        if(in >= 3000 && in < 10000){
//            System.out.println("버스타");
//        }
//        else if(in < 3000){
//            System.out.println("걸어가");
//        }

//        삼항연산자 : 결과값=조건식?반환값1:반환값2
//        조건식이 참인경우 반환값1이 결과값에 담기고, 거짓인경우 바환값2가 결과값에 당김
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(i==answer?"문이 열렸다":"비밀번호가 틀렸다");

//        switch문 : if, else if, else if 등 여러 조건식이 있을때 조건문을 가독성있게 표현한 구문
//        원하시는 서비스 번호를 입력해 주세요.
//        1:대출업무입니다. 2:예금업무입니다. 3:적금업무입니다. 0:상담사연결됩니다. 그외:잘못된 입력입니다.
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i==1) {
            System.out.println("대출업무입니다.");
        }
        else if(i==2) {
            System.out.println("예금업무입니다.");
        }
        else if(i==3) {
            System.out.println("적금업무입니다.");
        }
        else if(i==0) {
            System.out.println("상담사연결됩니다.");
        }
        else {
            System.out.println("잘못된 입력입니다.");
        }

        switch(i) {
            case 1:
                System.out.println("대출업무입니다.");
                break;
            case 2:
                System.out.println("예금업무입니다.");
                break;
            case 3:
                System.out.println("적금업무입니다.");
                break;
            case 0:
                System.out.println("상담사연결됩니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
