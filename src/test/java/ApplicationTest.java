import domain.Card;
import domain.CardDeck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ApplicationTest {

    private CardDeck cardDeck;
    private List<Card> cards;

    @BeforeEach
    public void setup(){
        cardDeck = new CardDeck();
        cards = cardDeck.getCards();
    }

    @Test
    public void test_카드패턴비교() {
        assertThat(cards.get(0).getPattern(), is(Card.Pattern.SPADE));
        assertThat(cards.get(13).getPattern(), is(Card.Pattern.HEART));
    }

    @Test
    public void test_카드끗수비교() {
        assertThat(cards.get(0).getDenomination(), is(Card.Denomination.ACE));
        assertThat(cards.get(0).getDenomination().getValue(),is(1));

    }

    @Test
    public void test_List를Stack으로변환() {
        assertThat(cardDeck.getCards().size(), is(52));
        cardDeck.draw();
        assertThat(cardDeck.getCards().size(),is(51));
        cardDeck.draw();
        assertThat(cardDeck.getCards().size(),is(50));
        cardDeck.draw();
        assertThat(cardDeck.getCards().size(),is(49));
    }
}
