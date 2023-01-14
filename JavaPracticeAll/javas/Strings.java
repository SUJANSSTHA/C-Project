public class Strings {
    public static void main(String[] args) {
        String str = "Sujan Pradhan";
        // int l = str.length();
        String str2 = new String("Sujan Pradhan");
        if(str.equals(str2))
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Both are not equal");
        }
        // System.out.println();
        System.out.println(str.toUpperCase());
    }
}
