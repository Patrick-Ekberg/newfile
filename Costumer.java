
public class Costumer{

    private String id;
    private String firstName;
    private String lastName;
    private CreditCard cc;
    private WashCard wc;
            
    public Costumer(String id, String firstName, String lastName, CreditCard cc, WashCard wc) {
        this.id = id; 
        this.firstName = firstName;
        this.lastName = lastName;
        this.cc = cc;
        this.wc = wc;
    }
    
    public void print() {
        System.out.println("Here is your receipt: ");
        System.out.println("identifikation: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        // System.out.println(cc);
        System.out.println(wc);
        
    }

    // public void addCostumer(){

    //     costumer[0] = new Costumer("1", "palle", "jensen", cc1, wc1);
    //     costumer[1] = new Costumer("2", "jens", "andersen", cc2, wc2);
    //     costumer[2] = new Costumer("3", "simon", "nielsen", cc3, wc3);
    //     costumer[3] = new Costumer("4", "torben", "simonsen", cc4, wc4);
    //     costumer[4] = new Costumer("5", "anne", "christensen", cc5, wc5);
    //     costumer[5] = new Costumer("6", "tommy", "andersen", cc6, wc6);
    //     costumer[6] = new Costumer("7", "phillip", "jensen", cc7, wc7);
    //     costumer[7] = new Costumer("8", "kurt", "nielsen", cc8, wc8);
    //     costumer[8] = new Costumer("9", "bo", "simonsen", cc9, wc9);
    //     costumer[9] = new Costumer("10", "jesper", "andersen", cc10, wc10);
        

    // }
}