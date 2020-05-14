/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 5/8/2020
 *   Time: 3:43 PM
 */
package powerfulGirls;

import java.util.Arrays;
import java.util.Scanner;

public class PowerfulGirl {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numberOfIngredient = scanner.nextInt();
        long[] quantityOfIngredientToCreate = new long[numberOfIngredient];
        for (int i = 0; i < quantityOfIngredientToCreate.length; i++) {
            quantityOfIngredientToCreate[i] = scanner.nextLong();
        }
        long[] quantityOfIngredientNeeded = new long[numberOfIngredient];
        for (int i = 0; i < quantityOfIngredientNeeded.length; i++) {
            quantityOfIngredientNeeded[i] = scanner.nextLong();
        }
        System.out.println(result(quantityOfIngredientNeeded,quantityOfIngredientToCreate,numberOfIngredient));
    }
    private static long result(long[] quantityOfIngredientNeeded, long[] quantityOfIngredientToCreate, int numberOfIngredient) {
        long result = Long.MAX_VALUE;
        for (int i = 0; i < numberOfIngredient; i++) {
            if (quantityOfIngredientNeeded[i] / quantityOfIngredientToCreate[i] < result)
                result = quantityOfIngredientNeeded[i] / quantityOfIngredientToCreate[i];
        }
        return result;
    }



}
