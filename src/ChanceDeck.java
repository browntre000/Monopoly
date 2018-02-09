public class ChanceDeck {

  Card[] chanceDeck = new Card[10];

  public ChanceDeck(){
    chanceDeck[0] = new Card(0, "Advance to St.Charles.", 11);
    chanceDeck[1] = new Card(150, "Your Building Loan Matures. Collect $150.", 41);
    chanceDeck[2] = new Card(50, "Bank Pays You Dividends of $50", 41);
    chanceDeck[3] = new Card(0, "Take A Trip To Reading Railroad. If You Pass Go, Collect $200", 5);
    chanceDeck[4] = new Card(-15, "Speeding Fine $15", 41);
    chanceDeck[5] = new Card(0, "Go To Jail. Go Directly To Jail, Do Not Pass Go, Do Not Collect $200", 10);
    chanceDeck[6] = new Card(0, "Advance To Boardwalk", 39);
    chanceDeck[7] = new Card(200, "Advance to Go (Collect $200)", 0);
    chanceDeck[8] = new Card(0, "Advance To Illinois Avenue. If You Pass Go, Collect $200", 24);
    chanceDeck[9] = new Card(100, "You have won a crossword competition. Collect $100", 41);
  }

  public Card getCard(int i){
    return chanceDeck[i];
  }

  public void shuffle(){
    for(int i = 9; i >= 0; i--) {
      int rand = (int) (Math.random() * (i+1));
      Card temp = chanceDeck[i];
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
