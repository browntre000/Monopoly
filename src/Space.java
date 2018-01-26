public class Space{

  int[] space = new int[6];

    //Row 1: What type of space is it
    //Row 2: Color of property
    //Row 3: Who owns it
    //Row 4: How many house are on it
    //Row 5: Space Name
    //Row 6: Space Price

  public Space(int i){
    setSpaceAttributes(i);
    setColor(i);
    setName(i);
    setPrice(i);

  }

  public void setPrice(int i) {
    switch (getColor()) {
      case 1:
        if (i % 5 == 4) {
          space[5] =  60;
        }
        else {
          space[5] = 60;
        }
        break;
      case 2:
        if (i % 5 == 4) {
          space[5] = 120;
        }
        else {
          space[5] = 100;
        }
        break;
      case 3:
        if (i % 5 == 4) {
          space[5] =  160;
        }
        else {
          space[5] = 140;
        }
        break;
      case 4:
        if (i % 5 == 4) {
          space[5] = 200;
        }
        else {
          space[5] = 180;
        }
        break;
      case 5:
        if (i % 5 == 4) {
          space[5] = 240;
        }
        else {
          space[5] = 220;
        }
        break;
      case 6:
        if (i % 5 == 4) {
          space[5] = 280;
        }
        else {
          space[5] = 260;
        }
        break;
      case 7:
        if (i % 5 == 4) {
          space[5] = 320;
        }
        else {
          space[5] = 300;
        }
        break;
      case 8:
        if (i % 5 == 4) {
          space[5] = 400;
        }
        else {
          space[5] = 350;
        }
        break;
      default:
        int nothing = 0;
    }
  }

  public void setSpaceAttributes(int i){
    if((i % 5 == 0) && (i != 0))
      space[0] = 3;
    else if((i == 2) || (i == 17) || (i == 33))
      space[0] =  5;
    else if((i == 7) || (i == 22) || (i == 36))
      space[0] =  4;
    else if((i == 12) || (i == 28))
      space[0] =  2;
    else if((i == 2) || (i == 38))
      space[0] =  6;
    else if(i == 10)
      space[0] = 9;
    else if(i == 20)
      space[0] = 7;
    else if(i == 30)
      space[0] = 8;
    else if(i == 0)
      space[0] = 10;
    else
      space[0] = 1;
  }

  public void setColor(int i){
    if(space[0] == 1)
      switch (i / 5){
        case 1:
          space[1] = 1;
          break;
        case 2:
          space[1] = 2;
          break;
        case 3:
          space[1] = 3;
          break;
        case 4:
          space[1] = 4;
          break;
        case 5:
          space[1] = 5;
          break;
        case 6:
          space[1] = 6;
          break;
        case 7:
          space[1] = 7;
          break;
        case 0:
          space[1] = 0;
          break;
        default:
          System.out.println("You messed up");
      }
    else
      space[1] = 0;
  }

  public void setOwned(int player){
    space[2] = player;
  }

  public void buyHouses(){
    space[3]++;
  }

  public void setName(int i){
    space[4] = i;

  }

  public int getSpaceAttribute(){
    return space[0];
  }

  public int getColor(){
    return space[1];
  }

  public int getOwnership(){
    return space[2];
  }

  public int getHouseNumber(){
    return space[3];
  }

  public int getName(){
    return space[4];
  }

  public String toString(){
    return space[0] + "\t" + space[1] + "\t" + space[2] + "\t" + space[3] + "\t" + space[4] + "\t" + space[5];
  }

}