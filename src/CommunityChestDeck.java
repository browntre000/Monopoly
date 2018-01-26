public class CommunityChestDeck {

  Chance[] communityChestDeck = new Chance[10];

  public CommunityChestDeck(){
    communityChestDeck[0] = new Chance(200, "Bank Error in Your Favor. Collect $200", 40);
    communityChestDeck[1] = new Chance(100, "Holiday Fund Matures. Receive $100", 40);
    communityChestDeck[2] = new Chance(-50, "School Fees. Pay $50", 40);
    communityChestDeck[3] = new Chance(-50, "Doctor's Fees. Pay $50", 40);
    communityChestDeck[4] = new Chance(-100, "Hospital Fees. Pay $100", 40);
    communityChestDeck[5] = new Chance(0, "Go To Jail. Go Directly To Jail, Do Not Pass Go, Do Not Collect $200", 10);
    communityChestDeck[6] = new Chance(50, "From Sale of Stock. You Get $50", 40);
    communityChestDeck[7] = new Chance(200, "Advance to Go (Collect $200)", 0);
    communityChestDeck[8] = new Chance(10, "You Have Won Second Prize in a Beauty Contest. Collect $10", 40);
    communityChestDeck[9] = new Chance(100, "You inherit $100", 40);
  }

  public void shuffle(){
    for(int i = 10; i > 0; i--) {
      int rand = (int) (Math.random() * (i+1));
      Chance temp = communityChestDeck[i];
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
