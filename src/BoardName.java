public class BoardName {

  String[] boardName = new String[40];

  public BoardName(){
    boardName[20] = "Free Parking";
    boardName[0] = "Go";
    boardName[2] = "Commuity Chest 1";
    boardName[17] = "Community Chest 2";
    boardName[33] = "Community Chest 3";
    boardName[7] = "Chance 1";
    boardName[22] = "Chance 2";
    boardName[36] = "Chance 3";
    boardName[10] = "Jail";
    boardName[30] = "Go to Jail";
    boardName[4] = "Income Tax";
    boardName[38] = "Luxury Tax";
    boardName[5] = "Reading Railroad";
    boardName[15] = "Pennsylvania Railroad";
    boardName[25] = "B. & O. Railroad";
    boardName[35] = "Short Line";
    boardName[12] = "Electric Company";
    boardName[28] = "Water Works";
    boardName[1] = "Mediterranean Avenue";
    boardName[3] = "Baltic Avenue";
    boardName[6] = "Oriental Avenue";
    boardName[8] = "Vermont Avenue";
    boardName[9] = "Connecticut Avenue";
    boardName[11] = "St. Charles Avenue";
    boardName[13] = "States Avenue";
    boardName[14] = "Virginia Avenue";
    boardName[16] = "St. James Avenue";
    boardName[18] = "Tennessee Avenue";
    boardName[19] = "New York Avenue";
    boardName[21] = "Kentucky Avenue";
    boardName[23] = "Indiana Avenue";
    boardName[24] = "Illinois Avenue";
    boardName[26] = "Atlantic Avenue";
    boardName[27] = "Ventnor Avenue";
    boardName[29] = "Marvin Gardens";
    boardName[31] = "Pacific Avenue";
    boardName[32] = "North Carolina Avenue";
    boardName[34] = "Pennsylvania Avenue";
    boardName[37] = "Park Place";
    boardName[39] = "Boardwalk";
  }

  public String toString(){
    String output = "";
    for(int i = 0; i < boardName.length; i++){
      output += boardName[i] + "\t";
    }

    return output;
  }

  public String toString(int i){
    return boardName[i];
  }
}
