package exercisenNonso;

public class Array {
    public static void main(String[]  args){
        int[]  array = new int[20];
//     System.out.printf("%s%8s%n","index","value" );
       for (int counter = 0; counter < array.length; counter++){
           if(counter%2 == 0) {
               array[counter] = 2;
           }
           System.out.print(array[counter]);
       }
//           System.out.printf("%5d%8d%n", counter, counter+1);




    }
}
