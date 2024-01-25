package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        // 참조형 변수의 메서드 호출
        // 참조값을 복사해서 메서드를 호출하기 때문에 값이 바뀐다.
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);  // 메서드 호출 전: dataA.value = 10
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);  // 메서드 호출 후: dataA.value = 20
    }

    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
