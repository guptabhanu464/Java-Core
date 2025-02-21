package generics;

public class Plane<T> implements GenericInterface<String>{

    private T name;

    public Plane(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    // Here i have implemented Plane with Generic Interface and String type is defined
    @Override
    public String getItem() {
        return "";
    }

    @Override
    public void showItem() {
        System.out.println("Name of the plane is boeing and integer value :" + name);
    }
}
