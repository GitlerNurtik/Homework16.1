public class Car {
    private String name;
    private String speed;
    private String color;
    private int price;

    public Car(String name, String speed, String color, int price) {
        this.name = name;
        this.speed = speed;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return "Name car: "+getName()+"\n"+
                "Speed: "+getSpeed()+"\n"+
                "Color: "+getColor()+"\n"+
                "Price: "+getPrice()+"$\n";
    }
}
