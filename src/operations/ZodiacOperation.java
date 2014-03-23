package operations;

/**
 *
 * @author malinda
 */

/**
 * Imported packages
 **/
import java.util.ArrayList;
import objects.Player;
import PrologConnectionLayer.PrologLayer;

public class ZodiacOperation 
{
    
    
      public ArrayList<Player> getZodiacResult(ArrayList<Player> player)
      {
          
          ArrayList<Player>playerResult=new ArrayList<>();
          
          for (Player singlePlayer : player) 
          {
              /*Here starts the game... :)*/
              
              PrologLayer getPlayer=new PrologLayer();
              playerResult.add(getPlayer.getZodiacResult(singlePlayer));
          }
          return playerResult;
      }
}
