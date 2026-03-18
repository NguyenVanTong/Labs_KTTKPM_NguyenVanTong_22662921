package iuh.fit;

import iuh.fit.singleton.LoggerSingleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            LoggerSingleton s1 = LoggerSingleton.getInstance();
            LoggerSingleton s2 = LoggerSingleton.getInstance();

            s1.log("message 1");
            s2.log("message 2");
            System.out.println(s1 == s2); // true
        }
    }
