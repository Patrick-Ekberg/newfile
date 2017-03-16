
public class WashCard{

    private String washCardNr;
    private double balance;

    public WashCard(String washCardNr, int balance){
        this.washCardNr = washCardNr;
        this.balance = balance;
    }

    public void displayBalance(){
        System.out.println();
        System.out.print("The balance on your washcard is: ");
        System.out.println(balance + "kr");
    }

    public void setbalance(int amount){
        balance = balance + amount;
    }
    
    public void carWash(int price){
        
        if (balance - price >= 0) {
            balance = balance - price;
        }
        else {
            System.out.println("You don't have enough money on your Washcard! Please refill it");
        }
    }

    public String toString(){
        return "washCardNr: " + washCardNr + ", balance: " + balance;
    }
}