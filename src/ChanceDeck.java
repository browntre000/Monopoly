public class ChanceDeck {

  Chance[] chanceDeck = new Chance[10];

  public ChanceDeck(){
    chanceDeck[0] = new Chance(0, "Advance to St.Charles.", 11);
    chanceDeck[1] = new Chance(150, "Your Building Loan Matures. Collect $150.", 40);
    chanceDeck[2] = new Chance(50, "Bank Pays You Dividends of $50", 40);
    chanceDeck[3] = new Chance(0, "Take A Trip To Reading Railroad. If You Pass Go, Collect $200", 5);
    chanceDeck[4] = new Chance(-15, "Speeding Fine $15", 40);
    chanceDeck[5] = new Chance(0, "Go To Jail. Go Directly To Jail, Do Not Pass Go, Do Not Collect $200", 10);
    chanceDeck[6] = new Chance(0, "Advance To Boardwalk", 39);
    chanceDeck[7] = new Chance(200, "Advance to Go (Collect $200)", 0);
    chanceDeck[8] = new Chance(0, "Advance To Illinois Avenue. If You Pass Go, Collect $200", 24);
    chanceDeck[9] = new Chance(100, "You have won a crossword competition. Collect $100", 40);
  }

  public void shuffle(){
    for(int i = 10; i > 0; i--) {
      int rand = (int) (Math.random() * (i+1));
      Chance temp = chanceDeck[i];
      chanceDeck[i] = chanceDeck[rand];
      chanceDeck[rand] = temp;
    }
  }

  public String toString(){
    String output = "";
    for(int i = 0; i < 10; i++){
      output += chanceDeck[i].toString() + "\n";
    }

    return output;
  }

}
