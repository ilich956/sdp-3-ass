public class CardReader implements ICardReader {
    @Override
    public void insertCard() {
        System.out.println("Card inserted into the card reader...");
    }

    @Override
    public void extractData() {
        System.out.println("Data extracted from the card reader...");
    }
}
