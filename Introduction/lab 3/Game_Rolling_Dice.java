import java.util.Scanner;

public class Game_Rolling_Dice {
   public Game_Rolling_Dice() {
   }

   public static void main(String[] var0) {
      int var1 = 0;

      Scanner var2;
      for(var2 = new Scanner(System.in); var1 != -1; var1 = var2.nextInt()) {
         int var3 = (int)(Math.random() * (double)7.0F);
         System.out.println("Rolling: " + var3);
         System.out.print("Press -1 to discontinue: ");
      }

      var2.close();
   }
}