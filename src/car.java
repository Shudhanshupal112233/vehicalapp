import com.sun.nio.sctp.AbstractNotificationHandler;

public class car extends vehcle {
     private int wheels ;
     private String type;
     private int gears;
     private  int currentgear;
     private  int seats;
     private  boolean ismanual;


    public car(String name, int wheels, int doors, int gears, boolean ismanual, String type, int seats) {
        super(name);
        this.type = type;
        this.wheels = wheels;
        this.gears = 1;
        this.currentgear = currentgear;
        this.seats = seats;
        this.ismanual = ismanual;
    }

    public  void changegear(int newgear){
        this.currentgear = newgear;
        System.out.println("change gear method called - the newgear is changed to : "+currentgear);
    }

    public  void changespeed(int newspeed,int newdiresction){
        move(newspeed,newdiresction);
        System.out.println("change speed and directon  method called - the speed is changed to : "+newspeed+ "and the direction is "+newdiresction);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentgear() {
        return currentgear;
    }

    public void setCurrentgear(int currentgear) {
        this.currentgear = currentgear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isIsmanual() {
        return ismanual;
    }

    public void setIsmanual(boolean ismanual) {
        this.ismanual = ismanual;
    }
}
