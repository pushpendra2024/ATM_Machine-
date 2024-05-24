import java.util.*;
class Atm{

    int Balance;
    int pin;

    public void checkPin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your pin = ");
        int enteredPin = sc.nextInt();

        if(enteredPin == pin){
            menu();
        }
        else{
            System.out.println("pin is invalid");
            checkPin();
        }
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the choice = ");
 
        System.out.println("1. check Account balance");
        System.out.println("2. Withdrawl money ");
        System.out.println("3. Deposit money ");
        System.out.println("4. Exit");

        int opt = sc.nextInt();
        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withDrawl();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
            System.out.println("Enter a valid choice");
        }

        else{
            System.out.println("Invalid choice");
            return;
        }
    }

    public void checkBalance(){
        System.out.println("Balance "+Balance);
        menu();
    }

    public void withDrawl(){
        System.out.print("Enter the how much money withDrawl = ");
        Scanner sc = new Scanner(System.in);
        int amount= sc.nextInt();

        if(amount>Balance){
            System.out.println("Insufficient balance");
        }
        else{
            Balance =  Balance - amount;
            System.out.println("Money withdraw sucessfully");
        }
            menu();

        }

        public void depositMoney(){
            System.out.print("Enter amount how much want to deposit money = ");
            Scanner sc = new Scanner(System.in);
            int money = sc.nextInt();

            Balance = Balance + money;
            System.out.println("Money deposit sucessful");
            menu();

        }
}


public class ATM_machine {
    public static void main(String[] args) {
        
        Atm ob = new Atm();
        ob.pin=1234;
        ob.Balance = 50000;

        ob.checkPin();

    }
    
}
