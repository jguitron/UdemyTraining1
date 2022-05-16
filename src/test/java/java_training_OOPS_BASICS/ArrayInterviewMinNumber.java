package java_training_OOPS_BASICS;

public class ArrayInterviewMinNumber {
    public static void main(String[] args) {


        int abc[][]={{2,4,5}, {3,4,7},{5,2,9}};
        int min=abc[0] [0];
        int minColumn = 0;


        for (int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if (abc[i][j] < min)
                {
                    min=abc[i][j];
                    minColumn = j;
                }
            }
        }
        int max=abc[0][minColumn];
        int k = 0;
        while(k<3)
        {
            if(abc[k] [minColumn] > max )
            {
                max=abc[k][minColumn];

            }
            k++;
        }
        System.out.println(max);
    }
}
