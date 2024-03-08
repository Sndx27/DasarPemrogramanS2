package pertemuanPertama;

/**
 * ES234211 - Basic Programming
 * Computing Lab. Work
 * Coursework No.   : 01
 * Student ID       : 5026231181
 * Student Name     : Sandythia Lova Ramadhani Krisnaprana
 * Class            : A
 * Cohort           : A, B, C, D, E, F
 */

 import java.util.*;

 public class tugasPrint {
     
     public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            boolean status = true;
            while(status){
                System.out.println("Dedicated program by Sandy181 for Lab Session #1");
                System.out.print("Input 1 for cohortA\nInput 2 for cohortB\nInput 3 for cohortC\nInput 4 for cohortD\nInput 5 for cohortE\nInput 6 for cohortF\nYour input? ");
                int userInput = scanner.nextInt();
    
                switch (userInput) {
                    case 1:
                        System.out.println(cohortA(1));
                        break;
                
                    case 2:
                        System.out.println(cohortB(2));
                        break;
        
                    case 3:
                        System.out.println(cohortC(3));
                        break;
        
                    case 4:
                        System.out.println(cohortD(4));
                        break;
        
                    case 5:
                        System.out.println(cohortE(5));
                        break;
        
                    case 6:
                        System.out.println(cohortF(6));
                        break;
                    
                    default:
                        System.out.println("Please only enter number in range 1 to 6");
                }
                status = repeatAgain("");
            }

        } catch(Exception e){
            System.out.println("Something went wrong");
        }
    }

    public static boolean repeatAgain(String repeatAgainClass){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(true){

            System.out.print("Continue? Y/N : ");
            input = scanner.next().toUpperCase();

            if(input.equals("Y")){
                System.out.println();
                return true;
            }

            else if(input.equals("N")){
                return false;
            }

            else{
                System.out.println("Please input Y(yes) or N(no)");
                continue;
            }
        }
    }
 
     public static String cohortA(int userInput){
         return " ___\n|[_]|\n|+ ;|\n`---'";
     }

     public static String cohortB(int userInput){
         return  " ,___ ,___\n )   `\\  `\\\n(   _  '-._'-._\n )_( \\_____)____)";
     }

     public static String cohortC(int userInput){
         return "     /\\_____/\\\n    /  o   o  \\\n   ( ==  ^  == )\n    )         (\n   (           )\n  ( (  )   (  ) )\n (__(__)___(__)__)";
     }

     public static String cohortD(int userInput){
         return "      .--.\n    .'_\\/_'.\n    '. /\\ .'\n      \"||\"\n       || /\\\n    /\\ ||//\\)\n   (/\\\\||/\n______\\||/______";
     }

     public static String cohortE(int userInput){
         return "     __//\n    / ._.\\\n    \\    /\n   _/    \\\n   \\-     )\n    \\____/\n_____|__|_____\n     \"  \"";
     }

     public static String cohortF(int userInput){
         return "  /\\\\_//\\\n / 0   0 \\\n/_       _\\\n  \\_____/\n  /  0  \\\n /       \\_\n \\_(_|_)__ \\\n        (__/";
     } 
 }
    