public class Main {
    public static void main(String[] args) {
        ICardReader cardreader = new CardReader();
        Computer computer = new CardReaderAdapter(cardreader);

        System.out.println("Connecting card-reader to the computer...");
        computer.connect();
    }
}




