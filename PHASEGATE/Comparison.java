import java.util.Arrays;
public class Comparison{
    public static void main(String[] args){
    
    int array [][] = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                          }; 
                          
    int[][] result = reverse(array);
    for(int index = 0; index < array.length; index++){
      for(int count = 0; count < array[index].length; count++){
        System.out.print(result[index][count] + " ");
       } 
       System.out.println();
      }
                      
    }
    
    public static int[][] reverse(int[][] array){
    for(int index = 0; index < array.length; index++){
      for(int indexOne = 0; indexOne < array[index].length-1; indexOne++){
        for(int count = indexOne + 1; count < array[index].length; count++){
          if (array[index][indexOne] < array[index][count]){
            int exchange = array[index][indexOne];
            array[index][indexOne] = array[index][count];
            array[index][count] = exchange;
            
        }
      }
    }
  }
  return array;
      
  }
}
  
      
