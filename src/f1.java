public class f1 extends car{

    public f1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        //Which constructor should ?

        super(name,4,2,7,isManual,"Sports",2);

    }

      public void accelerate(int rate){
        int newSpeed = rate+getCurrentspeed();

          if(newSpeed == 0) {
              stop();
              changegear(1);
              //Stop the car, set gear as 1
          }else if(newSpeed<=50){
              changegear(1);
          }else if(newSpeed<=100)
              changegear(2);
          else if(newSpeed<=150)
              changegear(3);
          else if(newSpeed<=200)
              changegear(4);
          else if(newSpeed<=250)
              changegear(5);
          else
              changegear(6);
          //for all other cases, change the gear accordingly

          if(newSpeed > 0) {
              changespeed(newSpeed, getCurrentdirection());
          }
      }
}
