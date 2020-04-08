package encapsulation;

public class TestEncapuslationDemo {

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo(1010, "surya", "lingampalli", 9876543210l, 10000);
//        obj.name = "susnhine";
//        obj.balance = 90000;
        System.out.println("Before Update :: ");
        System.out.println(obj.getAddress());
        obj.setAddress("miyapur");
        System.out.println(obj.getPhoneNum());
        obj.setPhoneNum(7896612345l);
        System.out.println(obj.getName());
        System.out.println(obj.getAccNum());
        System.out.println(obj.getBalance());
        System.out.println("After Update ::");
        obj.display();
    }
}
