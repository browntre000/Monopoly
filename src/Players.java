import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Players {

  List<Player> players = new ArrayList<Player>();
  Player player;

  public Players(){
    Scanner read = new Scanner(System.in);
    System.out.println("Welcome to Monopoly");
    int amountOfPlayers = 10;

    while(amountOfPlayers <= 1 || amountOfPlayers > 8) {
      System.out.println("How many players are playing?");
      amountOfPlayers = read.nextInt();
      if (amountOfPlayers > 8) {
        System.out.println("Too many players");
        System.out.println();
      }
      if(amountOfPlayers < 2){
        System.out.println("Too little players");
        System.out.println();
      }

    }

    for(int i = 0; i < amountOfPlayers; i++) {
      player = new Player(i + 1);
      players.add(player);
    }
  }

  public void deletePlayer(int i){
    players.remove(i);
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
