package loop;

public class While2_2 {
    public static void main(String[] args) {
        // While2_1에서 더하는 숫자를 변수 i로 표현해서 다시 풀기
        int sum = 0;
        int i = 1;

        sum += i;
        System.out.println("i=" + i + " sum=" + sum);  // i=1 sum=1
        i++;

        sum += i;
        System.out.println("i=" + i + " sum=" + sum);  // i=2 sum=3
        i++;

        sum += i;
        System.out.println("i=" + i + " sum=" + sum);  // i=3 sum=6
    }
}
