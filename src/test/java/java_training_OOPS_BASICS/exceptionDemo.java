package java_training_OOPS_BASICS;
//one try can be followed by multiple catch blocks
//catch should be an immediate block after try
//finally block will not execute only if the user hits the stop button, this is the only way that the block will not be executed
public class exceptionDemo {
    public static void main(String[] args) {
        //3 lines-
        //try catch mechanism
        int b = 7;
        int c = 0;
        try {
            //purchase failed

//            int arr[] = new int[5];                     //index out of bounds exception
//            System.out.println(arr[7]);

            int k = b / c;                            // ArithmeticException
            System.out.println(k);
        }
        catch (ArithmeticException et) {
            System.out.println("I catch ArithmeticException");
        }
        catch (IndexOutOfBoundsException ets) {
            System.out.println("I catch IndexOutOfBoundsException");
        }

        catch (Exception e) {
            //retry again
            System.out.println("I caught the error/exception");
        }
        finally {
                    //this block is executed irrespective of exception thrown or not
                    //finally should only be written when using try block
            System.out.println("delete cookies");
        }
    }
}