package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        // 배열 : 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것
        int[] students;  // int형 배열 변수 선언
        students = new int[5];  // 5칸짜리 배열 생성

        System.out.println(students);  // 참조값이 출력됨 ([I@b4c966a), 메모리의 주소라고 생각하면 됨

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        // students[5] = 40;  배열의 범위를 넘어가는 인덱스를 사용하면 인덱스 에러가 뜬다.

        // 변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
