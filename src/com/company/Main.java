package com.company;

public class Main {

    static int kadanes(int[] a){

        int best_sum = a[0];
        int current_sum = a[0];
        int start = 0;
        int end = 0;
        System.out.println("current_sum "+current_sum);
        System.out.println("best_sum "+best_sum);
        System.out.println();

        for (int i = 1; i < a.length; i++)
        {

            System.out.print("a[i]="+a[i]+" ");
            if ((current_sum+a[i])>a[i]){
                current_sum= current_sum+a[i];
            } else {
                current_sum = a[i];
                start = i;
            }
            System.out.print("current_sum "+current_sum+ " ");
            if (current_sum > best_sum) {
                best_sum = Math.max(best_sum, current_sum);
                end = i;

            }
            System.out.print("best_sum "+best_sum + " start "+start+ " end "+ end);
            System.out.println();
        }
        return best_sum;
    }



    public static void main(String[] args) {
	    int a[] = {1,-2,3,-1,4, -2};

        System.out.println(kadanes(a));

    }

}
