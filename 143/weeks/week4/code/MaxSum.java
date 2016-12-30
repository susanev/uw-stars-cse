// This program allows you to execute one of three different algorithms for
// finding the maximum sum of a subsequence of values.  It runs the algorithm
// for a base size n and also for 2n and 3n, reporting the individual times
// and the ratios.
//
// The program was recently modified to add a "trial run" of the three
// executions prior to the timed executions.  Java performs some optimizations
// that distort the times without these trial runs.

import java.util.*;

public class MaxSum {
    public static void main(String[] args) {
        // find out how big of a list to process and which algorithm to use
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers do you want to use? ");
        int n = console.nextInt();
        System.out.print("Which algorithm do you want to use? ");
        int algorithm = console.nextInt();

        // run three trial runs that aren't timed
        findMax(new int[n], algorithm);
        findMax(new int[2 * n], algorithm);
        findMax(new int[3 * n], algorithm);

        // run the three timed tests
        double time1 = test(n, algorithm);
        double time2 = test(2 * n, algorithm);
        double time3 = test(3 * n, algorithm);

        System.out.println("Double/single ratio = " + time2 / time1);
        System.out.println("Triple/single ratio = " + time3 / time1);
    }

    // This method performs a single test for a given input size of n and a
    // given algorithm, returning the elapsed time in seconds.
    public static double test(int n, int algorithm) {
        // construct the list
        int[] numbers = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++)
            numbers[i] = r.nextInt() % 10000;

        // run the algorithm and time it
        long start = System.currentTimeMillis();
        findMax(numbers, algorithm);
        double elapsed = (System.currentTimeMillis() - start) / 1000.0;

        // report and return results
        System.out.println("for n = " + n + ", time = " + elapsed);
        System.out.println();
        return elapsed;
    }

    // Finds the max subsequence sum of the given array using the given
    // algorithm.  Throws a RuntimeException if the algorithm number is not
    // between 1 and 3 inclusive.
    public static void findMax(int[] list, int algorithm) {
        if (algorithm == 1)
            findMax1(list);
        else if (algorithm == 2)
            findMax2(list);
        else if (algorithm == 3)
            findMax3(list);
        else
            throw new RuntimeException("Illegal algorithm number");
    }

    // This method uses the brute force method of finding every possible
    // starting and stopping index and adding up the values in that range.
    // It has O(n^3) complexity.  Assumes list.size > 0.
    public static void findMax1(int[] list) {
        // initalize max sequence to just the first element of the list
        int max = list[0];
        int maxStart = 0;
        int maxStop = 0;

        for (int start = 0; start < list.length; start++)
            for (int stop = start; stop < list.length; stop++) {
                int sum = 0;
                for (int i = start; i <= stop; i++) {
                    sum += list[i];
                }
                if (sum > max) {
                    max = sum;
                    maxStart = start;
                    maxStop = stop;
                }
            }
    }

    // This method improves on the brute force method by keeping partial sums
    // instead of recomputing from scratch each time.  It has O(n^2)
    // complexity.  Assumes list.size > 0.
    public static void findMax2(int[] list) {
        // initalize max sequence to just the first element of the list
        int max = list[0];
        int maxStart = 0;
        int maxStop = 0;

        for (int start = 0; start < list.length; start++) {
            int sum = 0;
            for (int stop = start; stop < list.length; stop++) {
                sum += list[stop];
                if (sum > max) {
                    max = sum;
                    maxStart = start;
                    maxStop = stop;
                }
            }
        }
    }

    // This method keeps a running sum, resetting the starting point and
    // resetting the sum to 0 if the sum ever goes negative.  It has O(n)
    // complexity.  Assumes list.size > 0.
    public static void findMax3(int[] list) {
        // initalize max sequence to just the first element of the list
        int max = list[0];
        int maxStart = 0;
        int maxStop = 0;

        int start = 0;
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (sum < 0) {
                start = i;
                sum = 0;
            }
            sum += list[i];
            if (sum > max) {
                max = sum;
                maxStart = start;
                maxStop = i;
            }
        }
    }
}