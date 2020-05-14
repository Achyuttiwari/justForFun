/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 5/8/2020
 *   Time: 5:41 PM
 */
package beyblade;

import java.util.Arrays;
import java.util.Scanner;

public class BeyBlade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int numberOfMember = scanner.nextInt();
        long[] gRevolutionBeybladePower = new long[numberOfMember];
        long[] opponentBeybladePower = new long[numberOfMember];
        for (int i = 0; i < testCase; i++) {
            for (int j = 0; j < gRevolutionBeybladePower.length; j++) {
                gRevolutionBeybladePower[j] = scanner.nextLong();
            }
            for (int j = 0; j < opponentBeybladePower.length; j++) {
                opponentBeybladePower[j] = scanner.nextLong();
            }
            if (numberOfMember == 1) {
                if(gRevolutionBeybladePower[0]>opponentBeybladePower[0]) System.out.println("1");
                else System.out.println("0");
            }
            System.out.println(result(gRevolutionBeybladePower, opponentBeybladePower, numberOfMember));
        }

    }

    private static long result(long[] gRevolutionBeybladePower, long[] opponentBeybladePower, int numberOfMember) {
        int possibilityOfWinning = 0;

        for (int i = 0; i < gRevolutionBeybladePower.length - 1; i++) {
            for (int j = 0; j < gRevolutionBeybladePower.length - 1; j++) {
                if (gRevolutionBeybladePower[j] > gRevolutionBeybladePower[j + 1]) {
                    //sort the first array(gRevolutionBeybladePower) in ascending order.

                    long temp = gRevolutionBeybladePower[j];
                    gRevolutionBeybladePower[j] = gRevolutionBeybladePower[j + 1];
                    gRevolutionBeybladePower[j + 1] = temp;
                }
                if (opponentBeybladePower[j] > opponentBeybladePower[j + 1]) {
                    //sort the second array(opponentBeybladePower) in ascending order.

                    long temp = opponentBeybladePower[j];
                    opponentBeybladePower[j] = opponentBeybladePower[j + 1];
                    opponentBeybladePower[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < gRevolutionBeybladePower.length - 1; i++) {
            if (gRevolutionBeybladePower[i] == opponentBeybladePower[i]) {
                long temp = gRevolutionBeybladePower[i];
                gRevolutionBeybladePower[i] = gRevolutionBeybladePower[i + 1];
                gRevolutionBeybladePower[i + 1] = temp;

            }

        }
        if (gRevolutionBeybladePower[numberOfMember - 1] == opponentBeybladePower[numberOfMember - 1]) {
            long temp = gRevolutionBeybladePower[numberOfMember - 1];
            gRevolutionBeybladePower[numberOfMember - 1] = gRevolutionBeybladePower[numberOfMember - 2];
            gRevolutionBeybladePower[numberOfMember - 2] = temp;
        }

        for (int i = 0; i < gRevolutionBeybladePower.length; i++) {
            if (gRevolutionBeybladePower[i] > opponentBeybladePower[i]) possibilityOfWinning++;

        }

        return possibilityOfWinning;
    }
}
/*
1
10
3 6 7 5 3 5 6 2 9 1
2 7 0 9 3 6 0 6 2 6
output:7

 */