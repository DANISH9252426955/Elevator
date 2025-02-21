import java.util.Scanner;

class lift{
    public static void UB(){
        System.out.println("Under Basements");
        System.out.println("It is a parking floor For Visiter");
    }

    public static void LB(){
        System.out.println("Lower Basement");
        System.out.println("It is a Staff parking");
    }

    public static void G(){
        System.out.println("Ground Floor");
        System.out.println("Welcome to Bajaj Finance");
    }

    public static void Fisrt(){
        System.out.println("First Floor");
        System.out.println("Welcome to Trends");
    }

    public static void Second(){
        System.out.println("Second Floor");
        System.out.println("Welcome to Canteen");
    }

    public static void Third(){
        System.out.println("Third Floor");
        System.out.println("Welcome to PVR");
    }

    public static void Fourth(){
        System.out.println("Fourth Floor");
        System.out.println("Welcome to Electronic Items");
    }

    public static void Five(){
        System.out.println("Five Floor");
        System.out.println("Welcome to Gaming Zone");
    }

    public static void Six(){
        System.out.println("Six Floor");
        System.out.println("Welcome to Furniture Shope");
    }

    public static void Seven(){
        System.out.println("Seven Floor");
        System.out.println("Welcome to Softraw It Solution pvt.ltd");
    }
   
    public static void Eight(){
        System.out.println("Eight Floor");
        System.out.println("Welcome to Rosado Cafe");
    }


}



public class MiniProject { 
    public static void main(String[] args) {
        Scanner sx=new Scanner(System.in);
        
           
    
        System.out.println("Welcome to Mall of Jaipur:---");
        System.out.println("----------------------------------------------------");
        System.out.printf("| %-15s | %-30s |\n", "Code", "Floor Name");
        System.out.println("----------------------------------------------------");
        System.out.printf("| %-15s | %-30s |\n", "lb", "Lower Basement");
        System.out.printf("| %-15s | %-30s |\n", "ub", "Upper Basement");
        System.out.printf("| %-15s | %-30s |\n", "g", "Ground Floor");
        System.out.printf("| %-15s | %-30s |\n", "1", "First Floor (Trends)");
        System.out.printf("| %-15s | %-30s |\n", "2", "Second Floor (Canteen)");
        System.out.printf("| %-15s | %-30s |\n", "3", "Third Floor (PVR)");
        System.out.printf("| %-15s | %-30s |\n", "4", "Fourth Floor (Electronic Items)");
        System.out.printf("| %-15s | %-30s |\n", "5", "Fifth Floor (Gaming Zone)");
        System.out.printf("| %-15s | %-30s |\n", "6", "Sixth Floor (Furniture Shop)");
        System.out.printf("| %-15s | %-30s |\n", "7", "Seventh Floor (Softraw IT Solutions)");
        System.out.printf("| %-15s | %-30s |\n", "8", "Eighth Floor (Rosado Cafe)");
        System.out.println("----------------------------------------");
         System.out.println("\nEnter your choice from the above table:--");
            String Choice=sx.nextLine();

            switch (Choice) {
                case "lb":
                lift.LB(); 
                    break;
                case "ub":
                lift.UB(); 
                    break;
                case "g":
                lift.G(); 
                    break;
                case "1":
                lift.Fisrt();
                break;
                case "2":
                lift.Second();
                break;
                case "3":
                lift.Third();
                break;
                case "4":
                lift.Fourth();
                break;
                case "5":
                lift.Five();
                break;
                case "6":
                lift.Six();
                break;
                case "7":
                lift.Seven();
                break;
                case "8":
                lift.Eight();
                break;
            
                default:
                System.out.println("This Floor is not Availabal");
                    break;
            }


          
            
    
        
    }
}
