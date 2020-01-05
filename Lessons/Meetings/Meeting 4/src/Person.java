/*
    public class Person extends Animal, CanSpeak {
    class cannot extend/inherit multiple classes at once
    as a result of Diamond Problem.  Can get around problem
    through using interfaces.
*/ 

public class Person extends Animal {

    public Person() {
        super(0);
    }

    public Person(int age) {
        super(age);
    }

    /* 
        Overriding is overriding a method in the parent class by
        defining another method with the same name.  Only 
        methods can be overwritten;  variables cannot;  variables 
        from parent class can be called by using super.variableName;
        otherwise the variable from the subclass will be called.
    */

    /*
        Using super.methodName is used to use mathods from the parent class
        in the subclass 
    */

    /* 
        @Override annotation is used to ensure that subclass method will always
        override the parent method class, even if the class name is different;
        better idea to use annotation even if subclass method has same name as
        parent method.  If subclass method does not have the same name as in the 
        parent class, @Override will cause an error b/c VSCode will not be 
        overriding a method from the superclass
    */

    @Override
    public void eat() {
        super.eat();
        System.out.println("Person is eating");
    }

    public void writeCode() {
        System.out.println("Write code");
    }
}