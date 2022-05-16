package java_training_OOPS_BASICS;

public class ArrayDemo {
    public static void main(String[] args) {

//        int a = 4;
//        a=4;
        //A container which stores multiple values of same data type
        int a [] = new int[5]; //declares an array and allocates memory for the values
        a[0] = 2;
        a[1] = 6;
        a[2] = 1;
        a[3] = 9;
        a[4] = 12;

        int b [] = {1,3,4,5,7,8};


        for(int i =0; i< b.length; i++) {
             System.out.println(b[i]);
             //retrives values present in this array
         }


    }
}
