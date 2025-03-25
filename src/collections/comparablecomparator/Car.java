package collections.comparablecomparator;

public class Car {

    private String type;
    private String companyName;

    public Car(String type, String companyName) {
        this.type = type;
        this.companyName = companyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}
