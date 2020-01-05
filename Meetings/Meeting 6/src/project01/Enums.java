package project01;

public class Enums {

    /*
        Manually creating enumerated types is unadvisable
        b/c there is a greater liklihood of error & is unelegant    
    */

    // public static final int AUTO_NONE = 0;
    // public static final int AUTO_HATCH = 1;
    // public static final int AUTO_CARGO = 2;

    /*
        inherits from java.lang.enum, which itself inherits from
        java.lang.Object
    */
    
    enum Foo {
        BAR(3),
        BAZ(40);

        private int i;
        Foo(int i) {
            this.i = i;
        }

        public int toInteger() {
            return this.i;
        }
    }

    public enum Auto {
        NONE,
        HATCH,
        CARGO;
    }

    /*
        Code above and below are equivalent; enums work
        just like any other class, even in other .java files;
        as such, they can also have methods and constructors (but they 
        require declaration of enumerated types first)
    */

    public static class Auto2 {
        private Auto2() {
        }
        public static final Auto2 NONE = new Auto2();
        public static final Auto2 HATCH = new Auto2();
    }

    public static void main(String[] args) {
    //     int selectedAuto = 0;
    //     if (selectedAuto == AUTO_NONE) {
    //         System.out.println(selectedAuto);
    //     }
    // }
    Auto a = Auto.CARGO;

    /*
        Enums cannot be converted into different data types;
        code below will give an error
    */

    // a = 1;

    if(a == Auto.CARGO) {
        //
    }

    if(Foo.BAR instanceof Enum) {
        System.out.println("Instance");
    }
    }
}