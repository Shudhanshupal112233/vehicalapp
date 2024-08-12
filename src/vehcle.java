public class vehcle {

    private String name;
    private int currentspeed;
    private  int currentdirection;

    public vehcle(String name) {
        this.name = name;
        this.currentspeed = 0;
        this.currentdirection = 0;
    }

    public void move(int speed,int direction){
         this.currentspeed=speed;
         this.currentdirection=direction;

         System.out.println("move method called - the speed is changed to : "+currentspeed+ "and the direction changed to " + currentdirection);
    }

    public void steer(int direction){
        this.currentdirection += direction;
    }

    public  void stop(){
        currentspeed=0;
            System.out.println(" stop method is called -the vehicle is stopped");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
    }

    public int getCurrentdirection() {
        return currentdirection;
    }

    public void setCurrentdirection(int currentdirection) {
        this.currentdirection = currentdirection;
    }
}
