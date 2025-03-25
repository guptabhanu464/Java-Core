package designpatterns.structural.decorator;

public class TestDecorator {

    public static void main(String[] args) {

        // Here Base pizza is the Base Class
        // We are not changing any structure of it
        // We are adding more functionality to it
        // This means we are more kind of toppings or layers to it
        // Without changing the base pizza structure
        BasePizza pizza = new FarmhousePizza();
        int cost1 = pizza.cost();
        System.out.println(cost1);

        BasePizza pizza1 = new PaneerDecorator(new FarmhousePizza());
        System.out.println(pizza1.cost());

        BasePizza pizza2 = new PaneerDecorator(new CheeseDecorator(new MargheritaPizza()));
        System.out.println(pizza2.cost());
    }
}
