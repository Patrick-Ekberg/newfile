public class Terminal{

    private String receiptPapir;
    private String buyCarwash; 
    private String refillWashcard; 
    private String checkBalance; 
    private String buyWashcard; 

    public static void main(String[] args){

        Terminal t = new Terminal();

        CarWash golden = new CarWash("GoldenWash", 535);
        CarWash silver = new CarWash("SilverWash", 375);
        CarWash copper = new CarWash("CopperWash", 155);

        WashCard wc1 = new WashCard("1", 835);
        CreditCard cc1 = new CreditCard("5021", 5049);
        Costumer c1 = new Costumer("1", "palle", "jensen", cc1, wc1);      
        
        t.message3();
        String mOption = System.console().readLine();
            if (mOption.equals("1")){
                System.out.println();
                t.displayUserOption();
                String uChoice = System.console().readLine();
                if (uChoice.equals("1")){
                    System.out.println();
                    System.out.println("Please insert your WashCard and chose a CarWash! These are the product we sell:");
                    t.displayCarWashOption();
                    String wtChoice = System.console().readLine();
                        if (wtChoice.equals("1")){
                            t.displayCornfirmOption("GoldenWash");
                            String gWashacceptance = System.console().readLine();
                                if (gWashacceptance.equals("1")){
                                    wc1.carWash(golden.getPrice());
                                    c1.print();
                                }
                                else if (gWashacceptance.equals("2")){
                                    t.message2("Carwash");
                                }
                                else {
                                    t.message1();
                                }
                        }
                        else if (wtChoice.equals("2")){
                            t.displayCornfirmOption("SilverWash");
                            String sWashacceptance = System.console().readLine();
                                if (sWashacceptance.equals("1")){
                                    wc1.carWash(silver.getPrice());
                                    c1.print();
                                }
                                else if (sWashacceptance.equals("2")){
                                    t.message2("Carwash");
                                }
                                else {
                                    t.message1();
                                }   
                        }
                        else if (wtChoice.equals("3")){
                            t.displayCornfirmOption("CopperWash");
                            String cWashacceptance = System.console().readLine();
                                if (cWashacceptance.equals("1")){
                                    wc1.carWash(copper.getPrice());
                                    System.out.println();
                                    c1.print();
                                }
                                else if (cWashacceptance.equals("2")){
                                    t.message2("Carwash");
                                }
                                else {
                                    t.message1();
                                }
                        }
                        else {
                            t.message1(); 
                        }
                }
                else if (uChoice.equals("2")){
                    System.out.println();
                    System.out.println("please insert the amount you want to deposit!");
                    int amount = Integer.parseInt(System.console().readLine());
                        if (amount >= 200 && amount <=1000){
                            System.out.println();
                            System.out.println("you are about to insert " + amount + "kr. into your card do you want to proceed");
                            System.out.println("press 1: for yes");
                            System.out.println("press 2: for no");
                            String refillAcceptance = System.console().readLine();
                            System.out.println();
                                if (refillAcceptance.equals("1")){
                                    System.out.println();
                                        wc1.setbalance(amount);
                                        c1.print();
                                }
                                else if (refillAcceptance.equals("2")){
                                    t.message2("Refill");
                                }
                                else {
                                    t.message1();
                                }
                        }
                        else if (amount < 200 || amount > 1000){
                            System.out.println(); 
                            System.out.println("You didn't inserted a right amount, please try again'");
                        }
                        else {
                            t.message1();
                        }        
                }
                else if (uChoice.equals("3")){
                    wc1.displayBalance();              
                }
                else if (uChoice.equals("4")){
                    System.out.println();
                    System.out.println("step 4");              
                }
                else {
                    t.message1();
                }
    
            }
            else if (mOption.equals("2")){
                System.out.println();
                System.out.println("step 2");
            }
            else {
                t.message1();
            
            }
    }
    

    public void displayUserOption(){
        System.out.println("1: Buy carwash");
        System.out.println("2: Refill washcard");
        System.out.println("3: Check balance on washcard");
        System.out.println("4: Buy washcard");
    }

    public void displayCarWashOption(){
        System.out.println("1: Golden Wash");
        System.out.println("2: Silver wash");
        System.out.println("3: Copper wash");
    }

    public void displayCornfirmOption(String string){
        System.out.println();
        System.out.println("You are about buy a " + string + " do you want to proceed?");
        System.out.println("press 1: for yes");
        System.out.println("press 2: for no");
    }

    public void message1(){
        System.out.println();
        System.out.println("something went wrong");
    }

    public void message2(String string){
        System.out.println();
        System.out.println("you have cancelled your " + string + " order");
    }
    
    public void message3(){
        System.out.println("Welcome! Please chose what you wanna do");
        System.out.println();
        System.out.println("press 1: for UserOptions");
        System.out.println("press 2: for OwnerOptions");
    }

    
}