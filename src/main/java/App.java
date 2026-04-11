import java.util.*;

class Transaction {
    String date;
    String type; // CREDIT / DEBIT
    double amount;
    double balance;

    public Transaction(String date, String type, double amount, double balance) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }
}

public class App {

    public static List<String> generateStatement(List<Transaction> transactions) {
        List<String> result = new ArrayList<>();

        result.add("DATE | TYPE | AMOUNT | BALANCE");

        for (Transaction t : transactions) {
            result.add(t.date + " | " + t.type + " | " + t.amount + " | " + t.balance);
        }

        return result;
    }

    // optional main for manual run
    public static void main(String[] args) {
        List<Transaction> txns = new ArrayList<>();
        txns.add(new Transaction("2026-04-01", "CREDIT", 1000, 1000));
        txns.add(new Transaction("2026-04-02", "DEBIT", 200, 800));

        List<String> statement = generateStatement(txns);

        for (String line : statement) {
            System.out.println(line);
        }
    }
}