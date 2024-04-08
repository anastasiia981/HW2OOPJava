import java.util.Date;

public class Human extends Actor {
    private Date createdOrder;

    public Human(String name) {
        super(name);
    }

    public void setMakeOrder(boolean makeOrder) {
        if (makeOrder) {
            this.isMakeOrder = makeOrder;
            this.createdOrder = new Date();
        } else {
            this.isMakeOrder = makeOrder;
        }

    }

    public void setTakeOrder(boolean takeOrder) {
        if (this.isMakeOrder && takeOrder) {
            this.isTakeOrder = takeOrder;
            this.isMakeOrder = false;
        } else {
            this.isTakeOrder = takeOrder;
        }

    }

    public String toString() {
        return String.format(this.name + "\nЗаказ принят " + this.isMakeOrder + "\nЗаказ выдан " + this.isTakeOrder);
    }

    public void setCreatedOrder(Date createdOrder) {
        this.createdOrder = createdOrder;
    }

    public Date getCreatedOrder() {
        return this.createdOrder;
    }
}
