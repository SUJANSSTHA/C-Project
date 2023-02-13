public class DeadLock {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

    }
}
