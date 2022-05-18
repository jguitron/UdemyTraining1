package java_training_OOPS_BASICS;

import java.util.ArrayList;

public class CollectionDemoAmazonInterview {
    public static void main(String[] args) {
        //print unique number from the list- amazon interview question

        int a [] = {4,5,5,5,4,6,6,9,4};

        //empty arraylist - 4
        //4-3, 5-3, 6-2, 9-1

        ArrayList <Integer> al = new ArrayList<Integer>();
        //a[i] checks to see if al is present in a list or not
        // ! is the if not symbol

        for(int i = 0; i <a.length;i++) {
            int k = 0;

            if(!al.contains(a[i])) {
                al.add(a[i]);
                k++;

                for (int j = i+1; j < a.length;j++) {
                    if (a[i] ==a[j]) {
                        k++;
                    }
                }
                System.out.println(a[i]);
                System.out.println(k);
                if (k==1)
                System.out.println(a[i] + " is unique number");
            }

        }

    }
}
