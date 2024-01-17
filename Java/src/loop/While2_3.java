package loop;

public class While2_3 {
    public static void main(String[] args) {
        // While2_2에서 i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라
        int sum = 0;
        int i = 1;
        int endNum = 3;  // 이 상황에서는 아래의 코드를 (endNum - i + 1)번 만큼 반복해야함

        /*

        sum += i;
        System.out.println("i=" + i + " sum=" + sum);  // i=1 sum=1
        i++;

        sum += i;
        System.out.println("i=" + i + " sum=" + sum);  // i=2 sum=3
        i++;

        sum += i;
        System.out.println("i=" + i + " sum=" + sum);  // i=3 sum=6

        */

        // while문 사용
        while (i <= endNum) {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }


    }
}
