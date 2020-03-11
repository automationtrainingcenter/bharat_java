package basics;

public class StaticKeyword {
    int i = 0;
    static int j = 0;

    public void increment(){
        i = i+1;
        j = j+1;
        System.out.println("i is "+i+" j is "+j);
    }

    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword();
        obj1.increment();

        StaticKeyword obj2 = new StaticKeyword();
        obj2.increment();

        StaticKeyword obj3 = new StaticKeyword();
        obj3.increment();
    }

}
