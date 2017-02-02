public class Sequence{
   public static void main(String[] args){
      double x = 4.0; //initialize 
      double threshold = Math.pow(10, -100); //set small tolerance to guarantee convergence
      boolean notConverging = true;
      while(notConverging){
         x = 5 / (6 - x);
         if(Math.abs(x - 1) < threshold){
            notConverging = false;
         }
      }
      System.out.print(x);
   }
}