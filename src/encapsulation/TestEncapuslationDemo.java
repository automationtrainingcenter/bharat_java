package encapsulation;

public class TestEncapuslationDemo {

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo(1010, "surya", "lingampalli", 9876543210l, 10000);
        obj.name = "susnhine";
        obj.balance = 90000;

        obj.display();
    }
}
