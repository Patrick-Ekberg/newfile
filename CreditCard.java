
public class CreditCard{

    private String cardNr;
    private int wealth;

    public CreditCard(String cardNr, int wealth){
        this.cardNr = cardNr;
        this.wealth = wealth;
    }

    public void setwealth(int amount){
        wealth = wealth - amount;
    }

    public String toString(){
        return "cardNr: " + cardNr + ", Cardbalance: " + wealth;
    }
}