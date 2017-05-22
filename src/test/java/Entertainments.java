public class Entertainments {

    private String name;
    private String type;
    private String place;
    private String company;
    private String day;
    private int time;
    private boolean enjoyable;

    public Entertainments(String name, String place, int time) {
        this.name = name;
        this.place = place;
        this.time = time;
    }

    //get methods:
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getPlace() {
        return this.place;
    }

    public String getCompany() {
        return this.company;
    }

    public String getDay() {
        return this.day;
    }

    public int getTime() {
        return this.time;
    }

    //set methods:

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(int time) {
        this.time = time;
    }

    //boolean methods:
    public boolean isEnjoyable() {
        return this.enjoyable = enjoyable;
    }

    public static void main(String args[])

    {
        Entertainments object1 = new Entertainments("walked", "street", 30);
        Entertainments object2 = new Entertainments("play football", "field", 45);
        object1.setCompany("my friends");
        object1.setDay("yesterday");
        System.out.println("I " + object1.getName() + " with " + object1.getCompany() + " in the " + object1.getPlace()
                + " " + object1.getDay());
        object2.setDay("tomorrow");
        System.out.println("I'll " + object2.getName() + " on the " + object2.getPlace() + " " + object2.getTime() +
                " minutes " + object2.getDay());
    }

}
