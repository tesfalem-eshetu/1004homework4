import java.lang.Math;   
import java.util.Random;

public class Drunkard{
    private int avenue;
    private int street; 
    private int initial_ave; 
    private int initial_ste; 
    private Random rand; 

    private int[] directions = {1, -1, 1, -1}; // +x, -x, +y, -y;

    public Drunkard(int avenue,int street){
        this.avenue = avenue;
        this.initial_ave = avenue;
        this.street = street;
        this.initial_ste = street;
        rand = new Random();
    }

    public void step(){
        
        int r = rand.nextInt(4);
        
        if ( r > 1){
            // this is vertical ( in the direction of y)
            street += directions[r];
        }
        else{
            avenue += directions[r];
        }
   
    }

    public void fastForward(int steps){
        while( steps > 0){
            this.step();
            steps--;
        }
    }

    public String getLocation(){
        return "Avenue: " + avenue + " " + "Street: " + street;
    }

    public int howFar(){
        
        return (Math.abs(avenue - initial_ave) + Math.abs(street - initial_ste));
    }

}