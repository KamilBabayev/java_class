package less08;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CardService {

    public void doTransfer(BigDecimal tranferAmomunt, String fromPan, String toPan) {
        if (checkBalance(tranferAmomunt, fromPan)) {
            Card fromCard = getCardByPan(fromPan);
            Card toCard = getCardByPan(toPan);
            fromCard.setBalance(fromCard.getBalance().subtract(tranferAmomunt));
            toCard.setBalance(toCard.getBalance().add(tranferAmomunt));
            System.out.println(fromCard.getBalance());
            System.out.println(toCard.getBalance());
        }
    }

    public Card getCardByPan(String pan) {
        for(Card card: CardHolder.cards) {
            if (pan.equals(card.getPan())) {
                return card;
            }
        }
        return new Card();
    }

    public boolean checkBalance(BigDecimal tranferAmomunt, String fromPan) {
        Card fromCard = getCardByPan(fromPan);
        return tranferAmomunt.compareTo(fromCard.getBalance()) <= 0;
    }
}
