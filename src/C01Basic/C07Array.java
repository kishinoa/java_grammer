package C01Basic;

import java.lang.reflect.Array;
import java.util.*;

public class C07Array {
    public static void main(String[] args) {
//        배열 표현식1. 배열 선언 후 할당방식
//        배열은 반드시 사전에 길이가 결정되어야 함
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
//        arr1[1] = 20;
//        arr1[3] = 40;
//        arr1[4] = 50;
//        arr1[5] = 60; // index out of bounds 예외발생. 배열의 길이가 동적으로 늘어날 수 없음
//        System.out.println(arr1[2]); // int배열은 0으로 초기화, String 배열은 null로 초기화

//        배열 표현식2. 리터럴방식
//        int[] arr2 = {10,20,30,40,50};

//        배열 표현식3
//        int[] arr3 = new int[]{10,20,30,40,50};

//        배열 표현식3 예시
//        ArrayList<int[]> list = new ArrayList<>();
//        list.add(new int[5]);
//        list.add(new int[]{1,3,5});

//        Arrays.fill : 배열에 모든값을 변경
//        String[] arr = new String[5];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = "";
//        }
//        Arrays.fill(arr, "");

//        85, 65, 90으로 구성된 int배열을 선언하고, 총합과 평균을 구해보시오
//        int[] arr = {85, 65, 90};
//        int sum = 0;
//        double avg = 0;
//        for(int i : arr) {
//            sum += i;
//        }
//        avg = sum / 3;
//        System.out.println("총합 : " + sum + " 평균 : " + avg);

//        배열의 최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0];
//        int min = arr[0];
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i] > max) max = arr[i];
//            if(arr[i] < min) min = arr[i];
//        }
//        System.out.println("최대값 : " + max + " 최소값 : " + min);
//
//        System.out.println(Arrays.stream(arr).max());

//        배열의 자리 바꾸기
//        int[] arr = {20,10,30};
//        int t = arr[0];
//        arr[0] = arr[1];
//        arr[1] = t;
//        System.out.println(Arrays.toString(arr));

//        배열 뒤집기
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//        for(int i = arr.length-1; i >= 0; i--) {
//            newArr[arr.length - 1 - i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));

//        배열의 정렬
//        int[] arr = {17,12,20,10,15};
//        Arrays.sort(arr); // 오름차순 정렬
//        Arrays.sort(arr, Comparator.reverseOrder()); // 원시자료형은 Comparator 사용 불가능
//        System.out.println(Arrays.toString(arr));
//        String[] starr = {"abc","aaa","acb","abb"};
//        Arrays.sort(starr, Comparator.reverseOrder()); // 내림차순
//        System.out.println(Arrays.toString(starr));

//        선택정렬 알고리즘 직접구현
//        int[] arr = {17,12,20,10,15};
//        for(int i = 0; i < arr.length-1; i++) {  // 자리 결정
//            for(int j = i; j < arr.length; j++) { // min값 찾기
//                if(arr[i] > arr[j]) {
//                    int t = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = t;
//                }
//            }
//        }

//        System.out.println(Arrays.toString(arr));

//        조합문제 : 모두 각기 다른 숫자의 배열이 있을때 만들어 질 수 있는 두 숫자의 조합을 문자열 형태로 출력하라
//        ex)(10,20) (10,30)
//        int[] arr = {10,20,30,40,50};
//        for(int i = 0; i < arr.length -1; i++) {
//            for(int j = i+1; j < arr.length; j++) {
//                String a = "(" + arr[i] + ", " + arr[j] + ")";
//                System.out.println(a);
//            }
//        }

//        배열의 중복제거 : set자료구조(중복X, 순서X)를 활용하여
//        int[] arr = {10,10,20,30,30,40};
//        Set<Integer> mySet = new HashSet<>();
//        for(int a : arr) {
//            mySet.add(a);
//        }
//        System.out.println(mySet);
//        int[] answer = new int[mySet.size()];
//        int i = 0;
//        for(int a : mySet) {
//            answer[i] = a;
//            i++;
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));

//        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i]==target) {
//                System.out.println(i);
//                break;
//            }
//        }

//        이분탐색(이진검색) - binary search
//        사전에 데이터가 오름차순 정렬되어 있을경우, 이분탐색 가능
//        int[] arr = {1,3,6,8,9,11,15};
//        System.out.println(Arrays.binarySearch(arr,15));

//        배열값 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2); // false
//        System.out.println(Arrays.equals(arr1, arr2)); // true

//        2차원 배열의 선언과 값 할당
//        int[][] arr = new int[3][2];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][0] = 5;
//        arr[2][1] = 6;
//        리터럴방식
//        int[][] arr2 = {{1,2},{3,4},{5,6}};

//        가변배열 : 배열의 전체길이는 반드시 할당
//        int[][] arr3 = {{1,2},{1,2,3},{1,2,3,4}};
//
//        int[][] arr4 = new int[3][];
//        arr4[0] = new int[2];
//        arr4[1] = new int[3];
//        arr4[2] = new int[4];
//        2차원배열의 출력
//        System.out.println(arr3);  // 2차원 배열의 주소값
//        System.out.println(Arrays.toString(arr3));  // 각 1차원 배열의 주소값 모음
//        System.out.println(Arrays.deepToString(arr3)); // 각 1차원 배열의 값을 출력

//        [3][4] 사이즈 선언하고 1~12까지 숫자값을 각 배열에 순차적으로 할당
//        int[][] arr = new int[3][4];
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j <arr[i].length; j++) {
//                arr[i][j] = 4 * i + j + 1;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

//        가변배열 값 채우기
//        int[][] arr = new int[3][];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = new int[4];
//            for(int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = 4 * i + j + 1;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

//        배열복사
//        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr1 = Arrays.copyOf(arr, 5);
        int[] arr2 = Arrays.copyOfRange(arr, 3, 6);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
