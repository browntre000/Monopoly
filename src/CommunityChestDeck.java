public class CommunityChestDeck {

  Card[] communityChestDeck = new Card[10];

  public CommunityChestDeck(){
    communityChestDeck[0] = new Card(200, "Bank Error in Your Favor. Collect $200", 41);
    communityChestDeck[1] = new Card(100, "Holiday Fund Matures. Receive $100", 41);
    communityChestDeck[2] = new Card(-50, "School Fees. Pay $50", 41);
    communityChestDeck[3] = new Card(-50, "Doctor's Fees. Pay $50", 41);
    communityChestDeck[4] = new Card(-100, "Hospital Fees. Pay $100", 41);
    communityChestDeck[5] = new Card(0, "Go To Jail. Go Directly To Jail, Do Not Pass Go, Do Not Collect $200", 10);
    communityChestDeck[6] = new Card(50, "From Sale of Stock. You Get $50", 41);
    communityChestDeck[7] = new Card(200, "Advance to Go (Collect $200)", 0);
    communityChestDeck[8] = new Card(10, "You Have Won Second Prize in a Beauty Contest. Collect $10", 41);
    communityChestDeck[9] = new Card(100, "You inherit $100", 41);
  }

  public Card getCard(int i){
    return communityChestDeck[i];
  }

  public void shuffle(){
    for(int i = 9; i >= 0; i--) {
      int rand = (int) (Math.random() * (i+1));
      Card temp = communityChestDeck[i];
      communityChestDeck[i] = communityChestDeck[rand];
      communityChestDeck[rand] = temp;
    }
  }


  public String toString(){
    String output = "";
    for(int i = 0; i < 10; i++){
      output += communityChestDeck[i].toString() + "\n";
    }

    return output;
  }

}
