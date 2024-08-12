public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! .....welcome to car showroom");
        f1 newcar = new f1("mercedes",true);

        newcar.move(40, 0);
        newcar.accelerate(20);
        newcar.accelerate(-60);

    }
}