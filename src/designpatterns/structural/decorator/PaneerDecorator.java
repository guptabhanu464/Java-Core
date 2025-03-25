package designpatterns.structural.decorator;

public class PaneerDecorator extends ToppingDecorator{

    BasePizza pizza;

    PaneerDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }


    @Override
    int cost() {
        return pizza.cost() + 100;
    }
}
