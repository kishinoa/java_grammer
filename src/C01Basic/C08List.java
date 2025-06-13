package C01Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
//        List선언방법1
//        ArrayList<String> myList = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//        List선언방법2 : 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();

//        초기값 세팅방법1 - 개별data add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");

//        System.out.println(myList3);

//        초기값 세팅방법2 - 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//        System.out.println(myList4);
//
//        int[] intArr = {10,20,30};
//        List<Integer> myIntList = new ArrayList<>();
//        for(int i : intArr) {
//            myIntList.add(i);
//        }
//        System.out.println(myIntList);

//        add메서드 : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0,30); // list는 중간 데이터 삽입은 성능 비효율적
//        System.out.println(myList);

//        get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(0));

//        size() : 리스트의 개수(길이)를 반환
//        System.out.println(myList.size());

//        for문을 활용해서 myList값 하나씩 모두 출력
//        for(int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//        for(int a : myList) {
//            System.out.println(a);
//        }

//        remove : 요소 삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        1) index를 통한 삭제 2) value를 통한 삭제(일반적이지 않음)
//        myList.remove(0);
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(30));
//        System.out.println(myList);
//        clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList);
//        indexOf : 특정값을 찾아 index를 return (가장 먼저 나오는 값을 return)
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(30);
//        System.out.println(myList2.indexOf(30));

//        contains : 값이 있는지 없는지 여부를 리턴
//        System.out.println(myList2.contains(30));

//        정렬 : 방법2가지(Collections클래스 사용, 객체사용)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);

//        Collections.sort()
//        Collections.sort(myList); // 오름차순
//        Collections.sort(myList, Comparator.reverseOrder()); // 내림차순
//        객체(ArrayList클래스).sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

//        이중리스트 : 리스트안의 리스트
//        [[1,2], [3,4], [5,6]]
//        List<List<Integer>> myList = new ArrayList<>();
//        List<Integer> myList1 = new ArrayList<>();
//        myList.add(myList1);
//        myList.add(new ArrayList<>());
//        myList.get(0).add(1);
//        myList.get(0).add(2); // [[1, 2], []]
//        myList.get(1).add(3);
//        myList.get(1).add(4); // [[1, 2], [3, 4]]
//        myList.add(new ArrayList<>());
//        myList.get(2).add(5); // [[1, 2], [3, 4], [5]]

//        for문을 이용해서 [[1,2,3], [4,5,6], [7,8,9], [10,11,12]] 이중리스트 생성
//        List<List<Integer>> myList = new ArrayList<>();
//        for(int i = 0; i < 4; i++) {
//            myList.add(new ArrayList<>());
//            for(int j = 0; j < 3; j++) {
//                myList.get(i).add(3*i+j+1);
//            }
//        }
//        System.out.println(myList);

//        리스트안에 배열
//        [{1,2}, {1,2,3}, {1,2,3,4}]
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[2]);
        myList.get(0)[0] = 1;
        myList.get(0)[1] = 2;
        myList.add(new int[3]);
        myList.get(1)[0] = 1;
        myList.get(1)[1] = 2;
        myList.get(1)[2] = 3;
        myList.add(new int[]{1,2,3,4});
        for(int[] i : myList) {
            System.out.println(Arrays.toString(i));
        }

    }
}
