package e2;

public class ParentAnimal03 {
    private String size;
    public String getType() {
        return "Animal";
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public static void main(String[] args) {
        ParentAnimal03 fish = new ChildFish04();
        System.out.println("This is a " + fish.getType());
    }
}