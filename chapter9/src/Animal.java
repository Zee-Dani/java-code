public class Animal {
    private String name;
    private double weight;
    private Color color;

    public void move(){
        System.out.println("This animal is on the move...");
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
}
