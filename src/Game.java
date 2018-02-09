import java.util.Scanner;

public class Game{

  static Board board = new Board();
  static ChanceDeck chanceDeck = new ChanceDeck();
  static CommunityChestDeck communityChestDeck = new CommunityChestDeck();
  static Players players = new Players();
  static int[] jailCount = new int[players.getPlayerNumber()];
  static Scanner read = new Scanner(System.in);

  public static void main(String[] args){
    game();
  }

  public static void game() {
    int turnCount = 0;
    boolean stillPlaying = true;

    while (players.getPlayerNumber() > 1) {
      System.out.println("\nTurn " + turnCount);
      for (int i = 0; i < players.getPlayerNumber(); i++) {
        System.out.println("\nPlayer " + (i + 1) + "'s up!");
        haveProperty(i);
        int threeTimes = 0;
        if(threeTimes <= 3) {
          //Ask for houses

          //Roll Die
            if(threeTimes < 3){
              rollDie(i);
            }
            else{
              System.out.println("Your in jail.");
              players.getPlayer(i).toggleJailStatus();
            }
            threeTimes++;

          //Play Board
          playBoard(i);
        }
      }
      turnCount++;
    }
  }

  public static void playBoard(int i){
    if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getName() == 7){
      System.out.println("Stop trying to break the game. Collect $200");
      players.getPlayer(i).changeBank(200);
    }
    else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getSpaceAttribute() == 1){
      if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership() == 0){
        int[] change = TRANSACTIONS.transactProperty(players.getPlayer(i), board);
        players.getPlayer(i).changeBank(change[0]);
      }
      else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership() != players.getPlayer(i).getPlayerName()){
        int owned = board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership();
        int[] change = TRANSACTIONS.transactProperty(players.getPlayer(owned), players.getPlayer(i), board);
        players.getPlayer(i).changeBank(change[0]);
        players.getPlayer(owned).changeBank(change[0]);
      }
      else{
        System.out.println("You own this space");
      }
    }
    else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getSpaceAttribute() == 2){
      if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership() == 0){
        int[] change = TRANSACTIONS.transactUtility(players.getPlayer(i), board);
        players.getPlayer(i).changeBank(change[0]);
      }
      else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership() != players.getPlayer(i).getPlayerName()){
        int owned = board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership();
        int[] change = TRANSACTIONS.transactUtility(players.getPlayer(owned), players.getPlayer(i), board);
        players.getPlayer(i).changeBank(change[0]);
        players.getPlayer(owned).changeBank(change[0]);
      }
      else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership() == players.getPlayer(i).getPlayerName()){
        System.out.println("You own this space");
      }
    }
    else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getSpaceAttribute() == 3){
      if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership() == 0){
        int[] change = TRANSACTIONS.transactRailroad(players.getPlayer(i), board);
        players.getPlayer(i).changeBank(change[0]);
      }
      else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership() != players.getPlayer(i).getPlayerName()){
        int owned = board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership();
        int[] change = TRANSACTIONS.transactRailroad(players.getPlayer(owned), players.getPlayer(i), board);
        players.getPlayer(i).changeBank(change[0]);
        players.getPlayer(owned).changeBank(change[0]);
      }
      else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getOwnership() == players.getPlayer(i).getPlayerName()){
        System.out.println("You own this space");
      }
    }
    else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getSpaceAttribute() == 4){
      int[] change = TRANSACTIONS.transactChance(players.getPlayer(i), chanceDeck);
      players.getPlayer(i).changeBank(change[0]);
      players.getPlayer(i).setPlayerPosition(change[1]);
    }

    else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getSpaceAttribute() == 5){
        int[] change = TRANSACTIONS.transactCommunityChest(players.getPlayer(i), communityChestDeck);
        players.getPlayer(i).changeBank(change[0]);
        players.getPlayer(i).setPlayerPosition(change[1]);
    }

    else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getSpaceAttribute() == 6){
      int[] change = TRANSACTIONS.transactTax(players.getPlayer(i), board);
      players.getPlayer(i).changeBank(change[0]);
    }

    else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getSpaceAttribute() == 7){
      System.out.println("yay");
    }

    else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getSpaceAttribute() == 8){
      System.out.println("GO TO JAIL");
      players.getPlayer(i).goToJail();
      players.getPlayer(i).toggleJailStatus();
    }

    else if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getSpaceAttribute() == 9){
      if(jailCount[i] == 3){
        System.out.println("GET OUT OF JAIL. You lost fifty dollars");
        players.getPlayer(i).changeBank(-50);
      }
      else{
        System.out.println("Still in Jail");
      }
    }

    if(board.getSpace(players.getPlayer(i).getPlayerPosition()).getSpaceAttribute() == 10){
      System.out.println("You passed go. Collect $200");
      players.getPlayer(i).changeBank(200);
    }

    System.out.println("Balance: " + players.getPlayer(i).getBank());
  }

  public static void haveProperty(int player){
    boolean haveProperty = false;
    for(int j = 0; j < board.getBoardLength(); j++) {
      if (board.getSpace(player).getOwnership() != (player + 1)) {
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
      buyHouses(player + 1);
    }
  }

  public static boolean rollDie(int player){


      System.out.println("Press Enter to Roll");
      read.nextLine();
      int random1 = (int)(Math.random() * 6) + 1;
      int random2 = (int)(Math.random() * 6) + 1;
      players.getPlayer(player).setPlayerPosition(random1, random2);
      System.out.println("You landed on " + board.getSpace(players.getPlayer(player).getPlayerPosition())
          .getSpaceName(board.getSpace(players.getPlayer(player).getPlayerPosition()).getName()));

      return (random1 == random2);
  }

    public static void buyHouses(int player) {
      Scanner read = new Scanner(System.in);
      System.out.println("Would you like to buy any houses? (1 for yes, 0 for no");
      int playerInput = read.nextInt();
      if(playerInput == 1){
        System.out.println("Which property would you like to put a house on?");
        int space = read.nextInt();
        if(board.getSpace(space).getOwnership() != player)
          System.out.println("Invalid Property. Plaese try again");
        else{
          System.out.println("You now have " + board.getSpace(space).getHouseNumber() + "houses on this property");
        }
      }
      else{
        System.out.println("Try again");
      }

    }


}