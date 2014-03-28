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
     //Rukka's Connection
//    String consult="consult('C:/Users/Rukshan/Documents/NetBeansProjects/Rukkas_Horoscope/src/zodiacSourceFile/Z1.pl')";
    
    //Chathuranga's's Connection
    String consult="consult('C:/Users/Chathuranga/Documents/NetBeansProjects/Rukkas_Horoscope/src/zodiacSourceFile/Z1.pl')";
    
    //Mora's Connection
    //String consult="consult('C:/Users/User/Documents/NetBeansProjects/ExampleProjects/Rukkas_Horoscope/src/zodiacSourceFile/Z1.pl')"; 
   
    //Maliya's connection
    //String consult="consult('C:/Users/malinda/Documents/NetBeansProjects/DSA/Rukkas_Horoscope/src/zodiacSourceFile/Z1.pl')";
    
    Query q1;
    q1 = new Query(consult);
    return q1.hasSolution();
 }
 
 public Player getZodiacResult(Player player)
 {
     if (prologConnection()) 
     {
            Player returnPlayer=new Player();

        
//        int year=player.getYear();
        int month=player.getMonth();
        int date=player.getDay();

         String commandText="getDate(X,"+month+","+date+")";
         Query q2=new Query(commandText);

         returnPlayer.setZodiacSign(q2.oneSolution().get("X").toString());
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
