package dnddiceroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Dice Tower.
 * A Dice Tower is a tool used by serious gamers use to roll many dice at once.
 * It looks like this https://www.miniaturescenery.com/Images/PortableDiceTowerLarge.jpg
 * An instance of a dice tower is defined by the number panels it contains to help
 * provide a more regular distribution of die values. The die bounce from panel to
 * panel until they exit the dice tower at the bottom tray.
 * A dice tower will accept a collection of dice and reports their results when
 * they reach the tray at the bottom
 * @author Paul Scarrone
 */
public class DiceTower {
  final int PANEL_COUNT = 3;
  List<Die> dice;
  private int dieNumbers;
  
  public DiceTower() {
	this.dice = new ArrayList();
  }
  
  public DiceTower(List dice) {
	this.dice = dice;
  }

    void dropDice() {
        for (int i = 0; i < 6; i++) {
            Random rand = new Random();
            int dieNumbers = rand.nextInt(7);
        }
            
            
    }

    int trayValue() {
        this.dieNumbers = trayValue();
        return trayValue();
    }
}

