package designpatterns.structural.decorator;

public class CheeseDecorator extends ToppingDecorator{

    BasePizza pizza;

    CheeseDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    int cost() {
        return pizza.cost() + 200;
    }
}
