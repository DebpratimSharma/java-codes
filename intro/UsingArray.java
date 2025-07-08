public class UsingArray {
    public static void main(String[] args){
        int [] array = {1,2,3,4,5};

        /*for (int i = 0; i<array.length; i++)
            System.out.println(array[i]+"\t"); */
        for( int element : array){
            System.out.println(element);
        }
    }
}
