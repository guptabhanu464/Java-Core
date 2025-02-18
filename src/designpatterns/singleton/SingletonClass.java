package designpatterns.singleton;

final class SingletonClass {

    private static SingletonClass singletonClass;

    SingletonClass() {
        System.out.println("Singleton Class in initiated");
    }

    public static SingletonClass getInstance() {
        if(singletonClass == null) {
            singletonClass = new SingletonClass();
        }

        return singletonClass;
    }

    public String toString() {
        return "Singleton class in initiated";
    }


    public static void main(String[] args) {

        SingletonClass className = SingletonClass.getInstance();
        SingletonClass className1 = SingletonClass.getInstance();

        System.out.println(className.hashCode());
        System.out.println(className1.hashCode());
    }

}
