public class Main {
    public Main() {
    }

    public static void main(String[] args) throws InterruptedException {
        Human visitor1 = new Human("Влад");
        Human visitor2 = new Human("Александр");
        Human visitor3 = new Human("Оксана");
        Market market = new Market();
        market.update();
        market.acceptToMarket(visitor1);
        market.acceptToMarket(visitor2);
        market.acceptToMarket(visitor3);
        market.takeInQueue(visitor2);
        market.update();
        market.takeInQueue(visitor3);
        market.releaseFromMarket(visitor1);
        Thread.sleep(1000L);
        market.releaseFromMarket(market.releaseFromQueue());
        market.update();
    }
}