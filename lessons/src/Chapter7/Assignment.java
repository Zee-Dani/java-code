package Chapter7;


import java.util.Arrays;

public class Assignment {
    public static void main (String[]  args){
     //   int []  a  ={1,2,3,4,5,6,7,8,9,10,11};
     //   int [] b = new int[34];
      //  for (int i =0; i < a.length; i++){
     //       b[i] = a[i];
      //  }
      //  System.out.println(Arrays.toString(b));


        float [] w = {23,24,34,35,36,37,38,39,40,45,46, 19, 7,48,49,50,52,53,54,56,57,58,59,60,90};
        float smallest = w[0];
        float largest = w[0];

        for (int i=0;i < w.length;i++){
            if(w[i] < smallest)
                smallest = w[i];
        }
        System.out.println(smallest);

//        for (int i=0;i > w[i];i++){
//            largest = w[i];
//        }
//
//        System.out.println((largest));

    }
}
