import java.util.Scanner;

public class TRANSACTIONS {

  static Scanner read = new Scanner(System.in);

  public static int[] transactRailroad(Player player, Board board){

    int[] payments = new int[2];

    System.out.println("This property isn't owned. Would you like to buy it? (1 for yes).");
    int input1 = read.nextInt();
    if(input1 != 1) {
      payments[0] = 0;
      payments[1] = 1;
    }
    else{
      System.out.println("This property is worth " + board.getSpace(player.getPlayerPosition()).getPrice());
      System.out.println("Do you still want to buy it. (1 for yes)");
      int input2 = read.nextInt();
      if(input2 != 1) {
        System.out.println("You don't want anything. Next turn");
      }
      else{
        System.out.println("You lost " + board.getSpace(player.getPlayerPosition()).getPrice());
        payments[0] = board.getSpace(player.getPlayerPosition()).getPrice() * -1;
      }
    }

    return payments;
  }

  public static int[] transactRailroad(Player paying, Player owed, Board board){

    int[] payments = new int[2];

    System.out.println("Player " + owed.getPlayerName() + " owns this property.");

    int amountOfRailroads = 0;
    for (int i = 5; i < board.getBoardLength(); i+=10){
      if(board.getSpace(paying.getPlayerPosition()).getOwnership() == owed.getPlayerName())
        amountOfRailroads++;
    }

    switch(amountOfRailroads){
      case 1:
        System.out.println("You owe player " + owed.getPlayerName() + " $25");
        payments[0] = -1 * 25;
        payments[1] = 25;
      case 2:
        System.out.println("You owe player " + owed.getPlayerName() + " $50");
        payments[0] = -1 * 50;
        payments[1] = 50;
      case 3:
        System.out.println("You owe player " + owed.getPlayerName() + " $100");
        payments[0] = -1 * 100;
        payments[1] = 100;
      case 4:
        System.out.println("You owe player " + owed.getPlayerName() + " $200");
        payments[0] = -1 * 200;
        payments[1] = 200;
      default:
        System.out.println("You messed up");
    }

    return payments;
  }

  public static int[] transactProperty(Player player, Board board){

    int[] payments = new int[2];

    System.out.println("This property isn't owned. Would you like to buy it? (1 for yes).");
    int input1 = read.nextInt();
    if(input1 != 1) {
      payments[0] = 0;
      payments[1] = 1;
    }
    else{
      System.out.println("This property is worth " + board.getSpace(player.getPlayerPosition()).getPrice());
      System.out.println("Do you still want to buy it. (1 for yes)");
      int input2 = read.nextInt();
      if(input2 != 1) {
        System.out.println("You don't want anything. Next turn");
      }
      else{
        System.out.println("You lost " + board.getSpace(player.getPlayerPosition()).getPrice());
        payments[0] = board.getSpace(player.getPlayerPosition()).getPrice() * -1;
      }
    }

    return payments;
  }

  public static int[] transactProperty(Player paying, Player owed, Board board){

    int[] payments = new int[2];

    System.out.println("Player " + owed.getPlayerName() + " owns this property.");
    switch(board.getSpace(paying.getPlayerPosition()).getHouseNumber()){
      case 1:
        System.out.println("You owe player " + owed.getPlayerName() + " $" + board.getSpace(paying.getPlayerPosition()).getHouse1());
        payments[0] = -1 * board.getSpace(paying.getPlayerPosition()).getHouse1();
        payments[1] = board.getSpace(paying.getPlayerPosition()).getHouse1();
      case 2:
        System.out.println("You owe player " + owed.getPlayerName() + " $" + board.getSpace(paying.getPlayerPosition()).getHouse2());
        payments[0] = -1 * board.getSpace(paying.getPlayerPosition()).getHouse2();
        payments[1] = board.getSpace(paying.getPlayerPosition()).getHouse2();
      case 3:
        System.out.println("You owe player " + owed.getPlayerName() + " $" + board.getSpace(paying.getPlayerPosition()).getHouse3());
        payments[0] = -1 * board.getSpace(paying.getPlayerPosition()).getHouse3();
        payments[1] = board.getSpace(paying.getPlayerPosition()).getHouse3();
      case 4:
        System.out.println("You owe player " + owed.getPlayerName() + " $" + board.getSpace(paying.getPlayerPosition()).getHouse1());
        payments[0] = -1 * board.getSpace(paying.getPlayerPosition()).getHouse1();
        payments[1] = board.getSpace(paying.getPlayerPosition()).getHouse1();
      case 0:
        System.out.println("You owe player " + owed.getPlayerName() + " $" + board.getSpace(paying.getPlayerPosition()).getRent());
        payments[0] = -1 * board.getSpace(paying.getPlayerPosition()).getRent();
        payments[1] = board.getSpace(paying.getPlayerPosition()).getRent();
      default:
        System.out.println("You messed up");
    }

    return payments;
  }

  public static int[] transactUtility(Player player, Board board){

    int[] payments = new int[2];

    System.out.println("This property isn't owned. Would you like to buy it? (1 for yes).");
    int input1 = read.nextInt();
    if(input1 != 1) {
      payments[0] = 0;
      payments[1] = 1;
    }
    else{
      System.out.println("This property is worth " + board.getSpace(player.getPlayerPosition()).getPrice());
      System.out.println("Do you still want to buy it. (1 for yes)");
      int input2 = read.nextInt();
      if(input2 != 1) {
        System.out.println("You don't want anything. Next turn");
      }
      else{
        System.out.println("You lost " + board.getSpace(player.getPlayerPosition()).getPrice());
        payments[0] = board.getSpace(player.getPlayerPosition()).getPrice() * -1;
      }
    }

    return payments;
  }

  public static int[] transactUtility(Player paying, Player owed, Board board){

    int[] payments = new int[2];

    System.out.println("Player " + owed.getPlayerName() + " owns this property.");
    switch(board.getSpace(paying.getPlayerPosition()).getHouseNumber()){
      case 1:
        int rand1 = (int)(Math.random()* 11 + 1) * 4;
        System.out.println("You owe player " + owed.getPlayerName() + " $" + rand1);
        payments[0] = -1 * rand1;
        payments[1] = rand1;
      case 2:
        int rand2 = (int)(Math.random()* 11 + 1) * 10;
        System.out.println("You owe player " + owed.getPlayerName() + " $" + rand2);
        payments[0] = -1 * rand2;
        payments[1] = rand2;
      default:
        System.out.println("You messed up");
    }

    return payments;
  }

  public static int[] transactTax(Player player, Board board){

    int[] payments = new int[2];

    if(player.getPlayerPosition() == 4){
      payments[0] = -1 * 100;
    }
    else if (player.getPlayerPosition() == 38){
      payments[0] = -1 * 200;
    }
    else{
      payments[0] = 0;
    }

    return payments;
  }

  public static int[] transactJail(Player player, Board board){
    int[] payments = new int[2];
    payments[0] = -1 * 50;

    return payments;
  }

  public static int[] transactCommunityChest(Player player, CommunityChestDeck communityChestDeck){

    int[] payments = new int[2];
    communityChestDeck.shuffle();
    int rand = (int) (Math.random() * 10);
    System.out.println(communityChestDeck.getCard(rand).getMessage());
    payments[0] = communityChestDeck.getCard(rand).getPayment();
    if(communityChestDeck.getCard(rand).getMoveTo() == 41){
      payments[1] = player.getPlayerPosition();
    }
    else{
      payments[1] = communityChestDeck.getCard(rand).getMoveTo();
    }

    return payments;

  }

  public static int[] transactChance(Player player, ChanceDeck chanceDeck){

    int[] payments = new int[2];
    chanceDeck.shuffle();
    int rand = (int) (Math.random() * 10);
    System.out.println(chanceDeck.getCard(rand).getMessage());
    payments[0] = chanceDeck.getCard(rand).getPayment();
    payments[1] = chanceDeck.getCard(rand).getMoveTo();

    return payments;

  }


}
