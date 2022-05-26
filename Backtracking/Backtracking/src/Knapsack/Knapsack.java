package Knapsack;

public class Knapsack {

    public int max(int a1, int a2)
    {
        return (a1 > a2) ? a1 : a2;
    }

    public int maxknapSackVal(int C, int wt[], int v[], int l)
    {
        // handling Base Case
        if (l == 0 || C == 0)
        {
            // if no item is present or
            // the capacity of the knapsack is 0,
            // then there is no need to go further.
            return 0;
        }

        if (wt[l - 1] > C)
            return maxknapSackVal(C, wt, v, l - 1);
        else
        {
            // recursively solving the answer
            // Case 1: include the lth item
            int val1 = maxknapSackVal(C - wt[l - 1], wt, v, l - 1);

            // Case 2: exclude the lth item
            int val2 = maxknapSackVal(C, wt, v, l - 1);

            // return the maximum of both
            return max(v[l - 1] + val1, val2);
        }
    }
    // main method
    public static void main(String argvs[])
    {
        // input arrays
        int values[] = new int[] { 100, 60, 120 };
        int weight[] = new int[] { 20, 10, 30 };

        // capacity of the knapsack
        int C = 50;

        // calculating the length
        int length = values.length;

        // instantiating the class KnapsackExample
        Knapsack knapObj = new Knapsack();
        int maxVal = knapObj.maxknapSackVal(C, weight, values, length);
        System.out.println("The maximum value is: " + maxVal);
    }
}
