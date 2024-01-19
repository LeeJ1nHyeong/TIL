package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 배열 크기 만큼 값을 1씩 추가하는 배열 작성
        int[][] arr = new int[4][5];
        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
