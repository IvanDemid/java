package org.example;

import java.util.HashMap;
import java.util.Map;

public class Z1 {
    public static void main(String[] args) {
        Map<String, Account> accounts = new HashMap<>();

        accounts.put("1001", new SavingsAccount("1001", 1500.0, 0.03));
        accounts.put("1002", new CheckingAccount("1002", 500.0, 200.0));
        accounts.put("1003", new SavingsAccount("1003", 3000.0, 0.04));

        System.out.println("Номера всех счетов:");
        for (String accNumber : accounts.keySet()) {
            System.out.println(accNumber);
        }

        System.out.println("\nИнформация о счетах:");
        for (Account acc : accounts.values()) {
            System.out.println(acc);
        }
    }
}
