package hw0;

/**
 * 增强for循环
 */
public class EnhancedForBreakDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (String s : a
             ) {
            for (int i = 0; i < 3; i++) {
                System.out.println(s);
                if (s.contains("horse")) {
                    break;
                }
            }
        }

    }
}
