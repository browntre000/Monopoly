public class Chance {

  String message = "";
  int payment;
  int moveTo;
  int dontMove = 0;

  public Chance(int payment, String message, int moveTo){
    setMessage(message);
    setPayment(payment);
    setMoveTo(moveTo);
  }

  public void setMessage(String message){
    this.message = message;
  }

  public String getMessage(){
    return this.message;
  }

  public void setPayment(int payment){
      this.payment = payment;
  }

  public int getPayment(){
    return this.payment;
  }

  public void setMoveTo(int moveTo){
    if((moveTo > 40) || (moveTo < 0))
      System.out.println("Invalid Space");
    else if(moveTo == 40)
      this.moveTo = -1;
    else
      this.moveTo = moveTo;
  }

  public String toString(){
    return payment + "\t" + message + "\t" + moveTo;
  }

}
