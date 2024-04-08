public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
        this.isMakeOrder = false;
        this.isTakeOrder = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMakeOrder() {
        return this.isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    public boolean isTakeOrder() {
        return this.isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }
}
