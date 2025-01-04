import java.util.Scanner;
public class Main
{

    public static void main (String args[])
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("welcome to ABC BANK");
        float balence = 1000;
         System.out.println(" choose  operation");
        
        System.out.println("checkbalence-1");
        System.out.println("deposit-2");
        System.out.println("withdraw-3");
        System.out.println("loanoffer-4");
        System.out.println("exit-5");
        
        
        int operation = scanner.nextInt();
        switch(operation)
        {
            case 1:
                System.out.println("balence:" + balence);
                 System.out.println(" choose  operation");
                System.out.println("checkbalence-1");
                System.out.println("deposit-2");
                System.out.println("withdraw-3");
                System.out.println("loanoffer-4");
                System.out.println("exit-5");
                
        
                int option = scanner.nextInt();
                switch(option)
                {
                    
                  case 1:
                        System.out.println("balence:" + balence);
                        break;
                    case 2:
                        System.out.println("enter the deposit amount:");
                        float deposit = scanner.nextInt();
                        System.out.println("total amount :" + (balence+deposit));
                        break;
                    case 3:
                        System.out.println("enter withdraw amount;");
                        float withdraw = scanner.nextInt();
                        System.out.println("withdraw:" + (balence-withdraw));
                        break;
                    case 4:
                        System.out.println("loan offer ");
                        System.out.println("1-personal loan=5%intrest only" );
                        System.out.println("2-education loan=1%intrest only");
                        System.out.println("1-home loan=2%intrest only" );
                        break;
                    case 5:
                        System.exit(0);
                        break;
        
                }
                
                System.out.println("THANK YOU ");
                break;                
                
  
            case 2:
                System.out.println("balence:" + balence);
                System.out.println("enter the deposit amount:");
                float deposit = scanner.nextInt();
                System.out.println("new current balence:" + (balence+deposit));
                
                System.out.println("checkbalence-1");
                System.out.println("deposit-2");
                System.out.println("withdraw-3");
                System.out.println("loanoffer-4");
                System.out.println("exit-5");
                System.out.println(" choose another operation");
        
                int choice = scanner.nextInt();
                switch(choice)
                {
                    
                  case 1:
                        System.out.println("balence:" + balence);
                        break;
        
     
                    case 3:
                        System.out.println("enter withdraw amount;");
                        float withdraw = scanner.nextInt();
                        System.out.println("withdraw:" + (balence-withdraw));
                        break;
                    case 4:
                        System.out.println("loan offer ");
                        System.out.println("1-personal loan=5%intrest only" );
                        System.out.println("2-education loan=1%intrest only");
                        System.out.println("1-home loan=2%intrest only" );
                        break;
                    case 5:
                        System.exit(0);
                        break;
        
                }
                
                System.out.println("THANK YOU ");
                break;                
                
            case 3:
                 System.out.println("enter withdraw amount;");
                 float withdraw = scanner.nextInt();
                System.out.println("balence:" + (balence-withdraw));
                  System.out.println("THANK YOU ");
                break;
            case 4:
                System.out.println("loan offer ");
                System.out.println("1-personal loan=5%intrest only" );
                System.out.println("2-education loan=1%intrest only");
                System.out.println("1-home loan=2%intrest only" );
                  System.out.println("THANK YOU ");
                break;
            case 5:
                 System.exit(0);
                break;
        }
    }
}