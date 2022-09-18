package hw0;

public class MaxArrayElem {
    public static int max(int[] m) {
        int res = m[0];
        for (int i = 1; i < m.length; i++) {
            if (res < m[i]) {
                res = m[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
