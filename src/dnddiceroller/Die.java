package dnddiceroller;

/**
 * A Die is a many sided object that when rolled provides a random value from
 * 1 through the number of sides on the object. Some dice are 6 sided and have
 * the numbers 1-6 on them. Some dice are 20 sided with the numbers 1-20 on them.
 * Others are called fudge dice and have the values of -1 0 or +1
 * @author Paul Scarrone
 */
public class Die {
       private int dieNumber;
       private int value[];
    Die(int dieNumber) {
        this.dieNumber = roll();
    }
    public int setDieNumber(){
        return roll();
    }
    public int getDieNumber(){
        return setDieNumber();
    }
    
    public int roll() {
        int[] value = {1,2,3,4,5};
        value[0] = 1;
        value[1] = 2;
        value[2] = 3;
        value[3] = 4;
        value[4] = 5;
        
        return value();
    }

    public int value() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
