public class PrintArray {
    public static void main(String[]args){
        String[][] warmUpArray = { {"Apple","Watermelon","Mango"},
                                   {"cup", "bowl", "plate"},
                                   {"yes","no", "maybe"},
                                   {"peanut","mozzerella","cashew"}};

      System.out.println("number of rows: "+warmUpArray.length);
      System.out.println("number of collums: "+warmUpArray[0].length);                            
    
      for(int row = 0; row < warmUpArray.length; row++){
        for(int col = 0; col < warmUpArray[0].length; col++){
            System.out.print(warmUpArray[row][col]+"\t");
        }
        System.out.println();
      }
    }
}
