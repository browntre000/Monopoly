public class Space{

  int[] space = new int[12];
  BoardName boardName = new BoardName();

    //Row 0: What type of space is it
    //Row 1: Color of property
    //Row 2: Who owns it
    //Row 3: How many house are on it
    //Row 4: Space Name
    //Row 5: Space Price
    //Row 6: Rent
    //Row 7: House 1
    //Row 8: House 2
    //Row 9: House 3
    //Row 10: House 4
    //Row 11: Hotel

  public Space(int i){
    setSpaceAttributes(i);
    setColor(i);
    setName(i);
    setPrice(i);
    setRH(i);
  }

  public void setRH(int i){
    if(getSpaceAttribute() == 1) {
      switch (getColor()) {
        case 1:
          if (i % 5 == 4) {
            space[6] = 4;
            space[7] = 20;
            space[8] = 60;
            space[9] = 180;
            space[10] = 320;
            space[11] = 450;
          } else {
            space[6] = 2;
            space[7] = 10;
            space[8] = 30;
            space[9] = 90;
            space[10] = 160;
            space[11] = 250;
          }
          break;
        case 2:
          if (i % 5 == 4) {
            space[6] = 8;
            space[7] = 40;
            space[8] = 100;
            space[9] = 300;
            space[10] = 450;
            space[11] = 600;
          } else {
            space[6] = 6;
            space[7] = 30;
            space[8] = 90;
            space[9] = 270;
            space[10] = 400;
            space[11] = 550;
          }
          break;
        case 3:
          if (i % 5 == 4) {
            space[6] = 12;
            space[7] = 60;
            space[8] = 180;
            space[9] = 500;
            space[10] = 700;
            space[11] = 900;
          } else {
            space[6] = 10;
            space[7] = 50;
            space[8] = 150;
            space[9] = 450;
            space[10] = 625;
            space[11] = 750;
          }
          break;
        case 4:
          if (i % 5 == 4) {
            space[6] = 16;
            space[7] = 80;
            space[8] = 220;
            space[9] = 600;
            space[10] = 800;
            space[11] = 1000;
          } else {
            space[6] = 14;
            space[7] = 70;
            space[8] = 200;
            space[9] = 550;
            space[10] = 750;
            space[11] = 950;
          }
          break;
        case 5:
          if (i % 5 == 4) {
            space[6] = 20;
            space[7] = 100;
            space[8] = 300;
            space[9] = 750;
            space[10] = 925;
            space[11] = 1100;
          } else {
            space[6] = 18;
            space[7] = 90;
            space[8] = 250;
            space[9] = 700;
            space[10] = 875;
            space[11] = 1050;
          }
          break;
        case 6:
          if (i % 5 == 4) {
            space[6] = 22;
            space[7] = 120;
            space[8] = 360;
            space[9] = 850;
            space[10] = 1025;
            space[11] = 1200;
          } else {
            space[6] = 22;
            space[7] = 110;
            space[8] = 330;
            space[9] = 800;
            space[10] = 875;
            space[11] = 1150;
          }
          break;
        case 7:
          if (i % 5 == 4) {
            space[6] = 28;
            space[7] = 150;
            space[8] = 450;
            space[9] = 1000;
            space[10] = 1200;
            space[11] = 1400;
          } else {
            space[6] = 26;
            space[7] = 130;
            space[8] = 390;
            space[9] = 900;
            space[10] = 1100;
            space[11] = 1275;
          }
          break;
        case 8:
          if (i % 5 == 4) {
            space[6] = 50;
            space[7] = 200;
            space[8] = 600;
            space[9] = 1400;
            space[10] = 1700;
            space[11] = 2000;
          } else {
            space[6] = 35;
            space[7] = 175;
            space[8] = 500;
            space[9] = 1100;
            space[10] = 1300;
            space[11] = 1500;
          }
          break;
        default:
          int nothing = 0;
      }
    } else if(getSpaceAttribute() == 3){
      space[5] = 50;
    }
    else{
      space[5] = 0;
    }
  }

  public void setPrice(int i) {
    if(getSpaceAttribute() == 1) {
      switch (getColor()) {
        case 1:
          if (i % 5 == 4) {
            space[5] = 60;
          } else {
            space[5] = 60;
          }
          break;
        case 2:
          if (i % 5 == 4) {
            space[5] = 120;
          } else {
            space[5] = 100;
          }
          break;
        case 3:
          if (i % 5 == 4) {
            space[5] = 160;
          } else {
            space[5] = 140;
          }
          break;
        case 4:
          if (i % 5 == 4) {
            space[5] = 200;
          } else {
            space[5] = 180;
          }
          break;
        case 5:
          if (i % 5 == 4) {
            space[5] = 240;
          } else {
            space[5] = 220;
          }
          break;
        case 6:
          if (i % 5 == 4) {
            space[5] = 280;
          } else {
            space[5] = 260;
          }
          break;
        case 7:
          if (i % 5 == 4) {
            space[5] = 320;
          } else {
            space[5] = 300;
          }
          break;
        case 8:
          if (i % 5 == 4) {
            space[5] = 400;
          } else {
            space[5] = 350;
          }
          break;
        default:
          int nothing = 0;
      }
    }
    else if(getSpaceAttribute() == 2){
      space[5] = 150;
    }
    else if(getSpaceAttribute() == 3){
      space[5] = 200;
    }
    else if(getSpaceAttribute() == 6){
      space[5] = 200;
    }
    else{
      space[5] = 0;
    }
  }

  public void setSpaceAttributes(int i){
    //Railroad
    if((i % 5 == 0) && (i != 0))
      space[0] = 3;
    //Community Chest
    else if((i == 2) || (i == 17) || (i == 33))
      space[0] =  5;
    //Chance
    else if((i == 7) || (i == 22) || (i == 36))
      space[0] =  4;
    //Utilities
    else if((i == 12) || (i == 28))
      space[0] =  2;
    //Tax
    else if((i == 4) || (i == 38))
      space[0] =  6;
    //Jail
    else if(i == 10)
      space[0] = 9;
    //Free Parking
    else if(i == 20)
      space[0] = 7;
    //Go To Jail
    else if(i == 30)
      space[0] = 8;
    //Go
    else if(i == 0)
      space[0] = 10;
    //Property
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

  public int buyHouses(){
    space[3]++;

    return (getName() / 10) * 50;
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

  public int getRent(){
    return space[6];
  }

  public int getPrice(){
    return space[5];
  }

  public int getHouse1(){
    return space[7];
  }

  public int getHouse2(){
    return space[8];
  }

  public int getHouse3(){
    return space[9];
  }

  public int getHouse4(){
    return space[10];
  }

  public int getHotel(){
    return space[11];
  }

  public String toString(){
    return space[0] + "\t" + space[1] + "\t" + space[2] + "\t" + space[3] + "\t" + space[4] + "\t" + space[5];
  }

  public String getSpaceName(int i){
    return boardName.toString(i);
  }

}