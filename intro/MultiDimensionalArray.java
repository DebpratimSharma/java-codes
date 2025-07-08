public class MultiDimensionalArray {
    public static void main (String[] args){
         int [][] matrix ={{1,2,3},{5,6,7},{9,10,11}};
            // Print the 2D array
            for(int[] rows : matrix){
                for(int element : rows){
                    System.out.print(element+" ");
                }
                System.out.println();
            }
    }
}
