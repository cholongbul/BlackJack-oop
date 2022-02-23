package domain;


public class Card {
    private Pattern pattern;
    private Denomination denomination;

    public Card(Pattern pattern, Denomination denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public Pattern getPattern() {return pattern;}

    public void setPattern(Pattern pattern){
        this.pattern = pattern;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public void setDenomination(Denomination denomination) {
        this.denomination = denomination;
    }

    public enum Pattern{
        SPADE("spade"),
        HEART("heart"),
        DIAMOND("diamond"),
        CLUB("club");

        private String value;

        Pattern() {}

        Pattern(String value) {
            this.value = value;
        }


    }

    public enum Denomination{
        ACE("A", 1),TWO("2",2),THREE("3",3),FOUR("4",4),FIVE("5",5),SIX("6",6),SEVEN("7",7),EIGHT("8",8),NINE("9",9),TEN("10",10)
        ,JACK("J",11),QUEEN("Q",12),KING("K",13);

        private String name;
        private int value;
        Denomination(String name, int value){
            this.name = name;
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

}
