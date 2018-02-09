public class Card {

  String message = "";
  int payment;
  int moveTo;
  int dontMove = 0;

  public Card(int payment, String message, int moveTo){
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
    if((moveTo > 41) || (moveTo < 0))
      System.out.println("Stay where you are.");
    else
      this.moveTo = moveTo;
  }

  public int getMoveTo(){
    return this.moveTo;
  }

  public String toString(){
    return payment + "\t" + message + "\t" + moveTo;
  }

}
