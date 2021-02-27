import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   
   System.out.println("Welcome to Kore's Kandy Emporium!"); 
   
   Scanner number = new Scanner(System.in); 
   
   System.out.println("What is your order number?");
   int order = number.nextInt();
    
   System.out.println(order);
   }
   
   static void pickup(int order){
    
   if(order == 5567)
   {
   System.out.println("Yay! Enjoy your food! Are you picking up another order?");
   }else{
     System.out.println("Hmmm... I'm sorry I don't see that order in my database"); 
   }
   }

    
  
}