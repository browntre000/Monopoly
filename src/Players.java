import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Players {

  List<Player> players = new ArrayList<Player>();
  Player player;

  public Players(){
    Scanner read = new Scanner(System.in);
    System.out.println("Welcome to Monopoly");
    System.out.println("How many players are playing?");
    int amountOfPlayers = read.nextInt();

    for(int i = 0; i < amountOfPlayers; i++) {
      player = new Player(i);
      players.add(player);
    }
  }

  public Player getPlayer(int i){
    return players.get(i);
  }

  public int getPlayerNumber(){
    return players.size();
  }

  public String toString(){

    String output = "";

    for(int i = 0; i < players.size(); i++){
      output += players.get(i).toString() + "\n";
    }

    return output;
  }

}
