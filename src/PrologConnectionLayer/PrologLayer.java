package PrologConnectionLayer;
import jpl.Query;
import objects.Player;
/**
 *
 * @author malinda
 */
public class PrologLayer 
{
    
 private boolean prologConnection()
 {
    String consult="consult('C:/Users/malinda/Documents/NetBeansProjects/DSA/Rukkas_Horoscope/src/zodiacSourceFile/Z1.pl')"; 
    Query q1;
    q1 = new Query(consult);
    return q1.hasSolution();
 }
 
 public Player getZodiacResult(Player player)
 {
     if (prologConnection()) 
     {
            Player returnPlayer=new Player();

        
        int year=player.getYear();
        int month=player.getMonth();
        int date=player.getDay();

         String commandText="getDate(X,"+month+","+date+")";
         Query q2=new Query(commandText);

         returnPlayer.setDescription(q2.oneSolution().get("X").toString());
         returnPlayer.setName(player.getName());
         returnPlayer.setAge(player.getAge());
         return returnPlayer;
     }
     else
     {
         return null;
     }
 }
}
