import java.util.Scanner;

public class Game{

  static Board board = new Board();
  static ChanceDeck chanceDeck = new ChanceDeck();
  static CommunityChestDeck communityChestDeck = new CommunityChestDeck();
  static Players players = new Players();

  public static void main(String[] args){



    /*System.out.println(board);
    System.out.println(chanceDeck);
    System.out.println(communityChestDeck);
    System.out.println(players);*/
  }

  public void playGame() {
    int turnCount = 0;
    boolean stillPlaying = true;

    while (stillPlaying) {
      System.out.println("Turn " + turnCount);
      for (int i = 0; i < players.getPlayerNumber(); i++) {
        System.out.println("Player " + (i + 1) + "'s up!");
        int threeTimes = 0;
        if(threeTimes <= 3) {
          //Ask for houses
          boolean haveProperty = false;
          for(int j = 0; j < board.getBoardLength(); j++) {
            if (board.getSpace(i).getOwnership() != (i + 1)) {
              haveProperty = false;
            }
            else {
              haveProperty = true;
            }
          }
          if(!(haveProperty)) {
            int nothing = 0;
          }
          else{
            buyHouses(i + 1);
          }

          //Roll Die
          boolean isDouble = rollDie(i);

          //Play Board
        }
      }
    }
  }

    public boolean rollDie(int player){

      Scanner read = new Scanner(System.in);

      System.out.println("Press Enter to Roll");
      read.nextLine();
      int random1 = (int)(Math.random() * 6) + 1;
      int random2 = (int)(Math.random() * 6) + 1;
      players.getPlayer(player).setPlayerPosition(random1, random2);

      return (random1 == random2);
    }

    public void buyHouses(int player) {
      Scanner read = new Scanner(System.in);
      System.out.println("Would you like to buy any houses? (1 for yes, 0 for no");
      int playerInput = read.nextInt();
      if(playerInput == 1){
        System.out.println("Which property would you like to put a house on?");
        int space = read.nextInt();
        if(board.getSpace(space).getOwnership() != player)
          System.out.println("Invalid Property. Plaese try again");
        else{
          board.getSpace(space).getHouseNumber();
          System.out.println("You now have " + board.getSpace(space).getHouseNumber() + "houses on this property");
        }
      }
      else{
        System.out.println("Try again");
      }


    }


}