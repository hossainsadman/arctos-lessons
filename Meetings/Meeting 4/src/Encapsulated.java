public class Encapsulated {

    private int i;

    public void setI(int i) {
        if (i >= 0) {
            this.i = i;
        }
        else {
            System.out.println("Inputted value must be greater than 0.");
        }
    }
    public int getI() {
        return i;
    }
}