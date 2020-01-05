package e1;

public class Encapsulation01 {
    public static void main(String[] args) {
        EncapsulatedStudent02 jerry = new EncapsulatedStudent02("J", 25, 3, 2.0);
        System.out.println(jerry.toString());
        jerry.setGpa(85);
        System.out.println(jerry.toString());
    }
}