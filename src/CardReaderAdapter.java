public class CardReaderAdapter implements Computer {
    private ICardReader ICardReader;

    public CardReaderAdapter(ICardReader ICardReader) {
        this.ICardReader = ICardReader;
    }

    @Override
    public void connect() {
        ICardReader.insertCard();
        ICardReader.extractData();
        System.out.println("Data transferred to the computer...");
    }
}
