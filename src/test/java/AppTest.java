import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class AppTest {

    @Test
    public void testGenerateStatement() {
        List<Transaction> txns = new ArrayList<>();
        txns.add(new Transaction("2026-04-01", "CREDIT", 1000, 1000));
        txns.add(new Transaction("2026-04-02", "DEBIT", 200, 800));

        List<String> result = App.generateStatement(txns);

        // total lines = header + 2 transactions
        assertEquals(3, result.size());

        // check content
        assertTrue(result.get(1).contains("CREDIT"));
        assertTrue(result.get(2).contains("DEBIT"));
    }

    @Test
    public void testEmptyTransactions() {
        List<Transaction> txns = new ArrayList<>();

        List<String> result = App.generateStatement(txns);

        // only header should exist
        assertEquals(1, result.size());
    }
}