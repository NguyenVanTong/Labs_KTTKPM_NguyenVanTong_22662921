package iuh.fit;

import iuh.fit.singleton.BillPughSingleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BillPughSingleton s1 = BillPughSingleton.getInstance();
        BillPughSingleton s2 = BillPughSingleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        }
    }
