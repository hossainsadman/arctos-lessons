public class Test {
    public static void main(String[] args) {
        // java.lang.String s = "";
        // Scanner in = new Scanner(System.in);
        // Animal a = new Animal();
        // a.eat();
        // Person b = new Person();
        // b.writeCode();

        // Animal.j = 5;
        // Person.j = 3;
        // System.out.println(Animal.j);
        // System.out.println(Person.j);

        /*
        Animal a = new Animal(0);
        Person p = new Person(5);

        a.eat();
        p.eat();
        */

        /*
            Every single object created inherits from theh Object class 
            even if it's not explicitly written
        */

        Person p = new Person();
        p.equals(new Object());

        /*
            Does not work b/c variables cannot inherit from Object superclass
                int i = 0;
                i.toString();
        */

        Integer j = 0;
        j.toString();

        System.out.println(new Animal(0));

        /*
            Uppercase variable types create objects; e.g. Integer is a wrapper
            of int b/c you can then call superclass methods such as toString
            on an object and not primitive.
            Autoboxing: only occurs with Objects which represent primitive data;
            automatically calls Object constructer for these objects w/o needing to
            explicitly creating a new object.
        */

        Integer i = 0;
        Double d = 0.0;
        Character c = 0;

        /*
            Unboxing: when the primitve data from an Object representing primitive data
            is assigned to a primitive variable type
        */
        int i1 = i;
    }
}