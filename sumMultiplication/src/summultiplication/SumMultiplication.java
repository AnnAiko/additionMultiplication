
package summultiplication;

import java.util.Scanner;

public class SumMultiplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа: ");
        String sUserPassword = in.nextLine();
        String[] sNumbers=sUserPassword.split(" ");
        int s = 0, p = 1;
        for (int i = 0; i < sNumbers.length; i++) {
            int iNumber = Integer.parseInt(sNumbers[i]);
            s = s + iNumber;
            p = p * iNumber;
        }
        System.out.println("Сумма = " + s);
        System.out.println("Произведение = " + p);
    }

}
