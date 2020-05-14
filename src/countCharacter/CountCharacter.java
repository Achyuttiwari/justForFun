/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 5/5/2020
 *   Time: 11:13 PM
 */
package countCharacter;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char inputCharacterToCount = scanner.next().charAt(0);
        char[] array = inputString.toCharArray();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == inputCharacterToCount){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
