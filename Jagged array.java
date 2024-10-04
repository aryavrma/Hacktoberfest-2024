public class Tester {
   public static void main(String[] args){
      int[][] twoDimenArray = new int[2][];

      //first row has 3 columns
      twoDimenArray[0] = new int[3];

      //second row has 4 columns
      twoDimenArray[1] = new int[4];

      int counter = 0;
      //initializing array
      for(int row=0; row < twoDimenArray.length; row++){

         for(int col=0; col < twoDimenArray[row].length; col++){
            twoDimenArray[row][col] = counter++;
         }
      }

      //printing array
      for(int row=0; row < twoDimenArray.length; row++){
         System.out.println();
         for(int col=0; col < twoDimenArray[row].length; col++){
            System.out.print(twoDimenArray[row][col] + " ");
         }
      }
   }
}
