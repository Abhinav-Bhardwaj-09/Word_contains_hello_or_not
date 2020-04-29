package Contain_hello_or_not;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 29-04-2020
 * Time: 17:10
 */

public class Main {
    public static void main(String[] args) {


        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        StringBuffer h = new StringBuffer("");
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'h' || s.charAt(i) == 'H') {
                h.append('h');
                k = i;
                break;
            }
        }
        for (int i = k + 1; i < s.length(); i++) {
            if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                h.append('e');
                k = i;
                break;
            }
        }
        for (int i = k + 1; i < s.length(); i++) {
            if (s.charAt(i) == 'l' || s.charAt(i) == 'L') {
                h.append('l');
                k = i;
                break;
            }
        }
        for (int i = k + 1; i < s.length(); i++) {
            if (s.charAt(i) == 'l' || s.charAt(i) == 'L') {
                h.append('l');
                k = i;
                break;
            }
        }
        for (int i = k + 1; i < s.length(); i++) {
            if (s.charAt(i) == 'o' || s.charAt(i) == 'o') {
                h.append('o');
                k = i;
                break;
            }
        }


    }
}