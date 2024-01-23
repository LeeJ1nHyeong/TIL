package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // 배열을 이용하여 학생 정보 출력하기
        // 변수를 이용할 때보다는 코드가 간결해졌지만 학생 각각의 데이터 변경 시 주의를 해야함
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }
    }
}
