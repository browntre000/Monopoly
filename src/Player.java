public class Player {

  //Row 1 - Player Position
  //Row 2 - player bank
  //Row 3 - player Name
  int[] playerData = new int[4];

  public Player(int i){
    playerData[0] = 0;
    playerData[1] = 0;
    playerData[2] = setPlayerName(i);
    playerData[3] = 0;
  }

  public void setPlayerPosition(int random1, int random2){
    playerData[0] += (random1 + random2);

    System.out.println("You rolled a " + random1 + random2);

    if(playerData[0] >= 40){
      playerData[0] -= 40;
    }

    System.out.println("You landed on " + playerData[0]);
  }

  public void setJailStatus(){
    if(playerData[3] == 1){
      playerData[3] = 0;
    }
    else{
        playerData[3] = 1;
    }
  }

  public int setPlayerName(int i){
    return i + 1;
  }

  public void setBank(int money){
    playerData[1] += money;
  }

  public int getPlayerPosition(){
    return playerData[0];
  }

  public int getJailStatus(){
    return playerData[3];
  }

  public int getPlayerName(){
    return playerData[2];
  }

  public int getBank(){
    return playerData[1];
  }

  public String toString(){
    return playerData[0] + "\t" + playerData[1] + "\t" + playerData[2] + "\t" + playerData[3];
  }



}
