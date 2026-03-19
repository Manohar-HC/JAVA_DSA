class Car {

    void drive(String place) {
        System.out.println("Driving to " + place);
    }

}

public class main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.drive("Office");

    }
}