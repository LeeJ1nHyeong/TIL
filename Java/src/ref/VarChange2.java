package ref;

public class VarChange2 {
    public static void main(String[] args) {
        // 객체 변수 대입
        // 참조값이 복사되는 것이기 때문에 둘 중 아무거나 데이터를 변경하면 같은 참조값을 갖는 객체는 모두 같은 값으로 변경된다.
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value = " + dataA.value);  // dataA.value = 10
        System.out.println("dataB.value = " + dataB.value);  // dataB.value = 10

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);  // dataA.value = 20
        System.out.println("dataB.value = " + dataB.value);  // dataB.value = 20

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);  // dataA.value = 30
        System.out.println("dataB.value = " + dataB.value);  // dataB.value = 30
    }
}
