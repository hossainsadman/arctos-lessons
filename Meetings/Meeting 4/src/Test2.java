public class Test2 {
    public static void main(String[] args) {
        
        /*
            POLYMORPHISM:
            Because objects of subclasses inherit from parent classes,
            they can be referred to as classes of the parent class.
            Below, Animal a will point to the same thing as Person p;
            b/c a is being refered to as an Animal.
            Reverse Polymorphism does not work.
        */

        Person p = new Person();
        Animal a = p;

        Animal b = new Person();
        Person p1 = (Person) p;
        p1.writeCode();
        
        // nxt meeting: abstract classes, interfaces, & lambdas
    }
}