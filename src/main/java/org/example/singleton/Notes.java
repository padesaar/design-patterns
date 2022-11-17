package org.example.singleton;

public class Notes {
    /*
    // Singleton
    Singleton is a design pattern for creating an object that can be
    constructed at most once, during the application's lifetime

    Types of singleton:
    - eager singleton - the instance for this singleton is created at application startup
    - lazy singleton - the instance for this singleton is created at the first point an instance is required,
    afterwards, the same instance is used for the remainder of the application's life


    Eager singleton implementation
    - Class based (class Counter)
    - Enum based implementation (class Count Enum)
    N.B: Both implementations of eager singleton are thread-safe,


    Lazy singleton implementation
    - lazy singleton (not thread-safe)
    - lazy double-checked singleton (thread-safe)

    //Builders

    The builder design pattern is a way of creating objects,
    that's most often used when creating objects that have many fields

    Two ways of creating a builder:
    - builder as a static class in the object (typically constructor is private)
    - builder as a class of its own

    When implementing a builder, we need to add something called
    "configuring" methods - these methods look and behave like getters and setters,
    but they return the builder object each time, allowing you to chain
    the operators on an instance of the builder object.

    As well as a build method, that compiles the values entered into the
    builder object and creates an object of the specified type the builder should work with.

    //Adapters
    The adapter patterns is used to adapt a certain object to the target
    interface. It can be thought of as a bridge between two sometimes unrelated or
    it could be that they are related, but they don't fit what we need them to.
    We can create an adapter class that implements the target interface while
    processing the data from the source class (the object we're transforming).


    // Best practices
    // Clean code is a term that refers to code that is:
    // - elegant - simple, straightforward and easy to read.
    // - organized - not too many unnecessary things, separate packages and so on
    // - maintained regularly -
    // - passes all tests that are necessary
    // - no duplicated code
    // no unused code, i.e. unused classes, methods and variables
    // all class and variable names should be meaningful
    // some conventions:
    // - naming
    // - classes - they should use camel casting bust must start with capital letter
    // - subsequent word in the class name will also start with a capital letter
    // - Car, CarEngine (for example)

    // Methods - they should start with a verb, and they should start with a small letter
    // but sill use camel casing
    // e.g. getWitdth(), startEngine() - correct
    //

    // Variables - They are similar to methods, but they don't need to start with a verb
    // since variables describe the state of a value, they are typically nouns
    // they also start with small case, use camel casing
    // e.g. width, height, name, firstName, lastName

    // Methods
    // your methods should only carry out one unit of an action
    // they should not do more than one thing
    // they should only have a small number of parameters
    // ideally it should not be more than 20 lines


    // Principles
    // DRY - don't repeat yourself
    // KISS - keep it simple stupid - do not overcomplicate things
    // YAGNI - you aren't gonna need it


    // Manifesto for software craftsmanship - set of rules
    // Rules to note:
    // - you should build software that is not just working but also well-crafted
    // - you should not just respond to change, but also build value
    // - we are not just individuals but a community of professionals
    // - we don't just engage in customer collaboration but also productive partnership

    // SOLID - is a set of software engineering principles that every good programmer should know
    // S - single responsibility principle
    // O - open closed principle
    // L - Liskov's substitution principle
    // I - interface segregation principle
    // D - dependency inversion principle

    // S - single responsibility principle
     - we don't want that on class is doing more than one thing,
     and we don't want multiple classes to do same thing

     // O - open closed principle
     - this is mostly talking about encapsulation,
     we want to be able to decide what changes classes outside the object
     can make to our object.

    // L - Liskov's substitution principle (inheritance)
    - this says that you should be able to substitute the type of the object
    with it's derived type(s)

    // I - interface segregation principle
    - we should not have too many methods;
    - this says your interface should not contain too many methods,
    instead break the interface into smaller interfaces and group related methods in them

    // D - dependency inversion principle
    - this is referring to the ability to pass in dependencies that your
    class or object needs to function from outside the class.




     */
}
