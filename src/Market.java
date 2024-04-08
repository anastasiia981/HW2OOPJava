import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private ArrayList<Human> visitors = new ArrayList();
    private List<Actor> orders;
    private Queue<Human> queueOrders = new ArrayDeque();

    public Market() {
    }

    public void takeInQueue(Human actor) {
        if (this.visitors.contains(actor)) {
            this.queueOrders.add(actor);
            actor.setMakeOrder(true);
            System.out.println("У посетителя " + actor.getName() + " принят заказ");
        }

    }

    public Human releaseFromQueue() {
        if (this.queueOrders.peek() != null) {
            Human human = (Human)this.queueOrders.poll();
            human.setTakeOrder(true);
            long timeOrder = (new Date()).getTime() - human.getCreatedOrder().getTime();
            PrintStream var10000 = System.out;
            String var10001 = human.getName();
            var10000.println("Заказ выдан " + var10001 + " через " + timeOrder / 1000L + " секунд");
            return human;
        } else {
            return null;
        }
    }

    public void acceptToMarket(Human actor) {
        this.visitors.add(actor);
        System.out.println("Посетитель " + actor.getName() + " зашел в магазин");
    }

    public void releaseFromMarket(Human actor) {
        this.visitors.remove(actor);
        System.out.println("Посетитель " + actor.getName() + " ушел из магазина");
    }

    public void update() {
        if (this.visitors != null && this.visitors.size() > 0) {
            System.out.println("-".repeat(20));
            System.out.println("В магазине " + this.visitors.size() + " посетителей");
            System.out.println("В работе " + this.queueOrders.size() + " заказ(ов)");
        } else {
            System.out.println("Магазин пуст");
        }

    }
}
