// package evaluation2;

import java.util.Scanner;

public class findoccurencesinpallindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] words = str.split(" ");

        int count = 0;

        for (String word : words) {
            word = word.toLowerCase();

            int left = 0;
            int right = word.length() - 1;
            boolean palindrome = true;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    palindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (palindrome) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}

