public class Board{
  Space[] board = new Space[40];
  Space space;
  BoardName boardName = new BoardName();

  public Board(){
      for(int i = 0; i < board.length; i++){
        board[i] = new Space(i);
      }
  }

  public Space getSpace(int i){
    return board[i];
  }

  public int getBoardLength(){
    return board.length;
  }



  public String toString(){

    String output = "";

    for(int i = 0; i < board.length; i++){
      output += (board[i].toString() + "\t" + boardName.toString(i) + "\n");
    }

    return output;
  }
}