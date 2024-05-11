package less08;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Card {
    private BigDecimal balance;
    private String pan;

    public Card(BigDecimal balance, String pan) {
        this.balance = balance;
        this.pan = pan;
    }

    public  Card() {

    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getPan() {
        return pan;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
