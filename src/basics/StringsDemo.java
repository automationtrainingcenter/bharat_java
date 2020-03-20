package basics;
/*
    String is collection of characters
    Strings will store in a separate memory location known as String constant pool
    Strings are immutable i.e. we can't change the value of String in that memory location

 */
public class StringsDemo {

    public static void main(String[] args) {
        String s1 = "selenium"; // @9876
        System.out.println(s1);

        String s2 = "python"; // @8764
        System.out.println(s2);

        s1 = "python"; // @8764
        System.out.println(s1);

        int i = 10; // @1204
        int j = 20; // @1304
        i = 20; // @1204


    }
}
