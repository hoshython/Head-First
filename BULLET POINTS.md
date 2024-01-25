# Chapter 1

- Statements end in a semicolon ;
- Code blocks are defined by a pair of curly braces { }
- Declare an int variable with a name and a type: **int x;**
- The **assignment** operator is one equals sign =
- The **equals** operator uses two equals signs ==
- A while loop runs everything within its block (defined by curly braces) as long as the conditional test is **true**.
- If the conditional test is **false**, the while loop code block won’t run, and execution will move down to the code immediately after the loop block.
- Put a boolean test inside parentheses: while **(x == 4)** { }

# Chapter 2

- Object-oriented programming lets you extend a program without having to touch previously tested, working code.
- All Java code is defined in a **class**.
- A class describes how to make an object of that class type. **A class is like a blueprint**.
- An object can take care of itself; you don’t have to know or care _how_ the object does it.
 - An object **knows** things and **does** things.
- Things an object knows about itself are called **instance variables**. They represent the _state_ of an object.
- Things an object does are called **methods**. They represent the _behavior_ of an object.
- When you create a class, you may also want to create a separate test class that you’ll use to create objects of your new class type.
- A class can **inherit** instance variables and methods from a more abstract **superclass**.
- At runtime, a Java program is nothing more than objects “talking” to other objects.

# Chapter 3

- Variables come in two flavors: primitive and reference.
- Variables must always be declared with a name and a type.
- A primitive variable value is the bits representing the value (5, ‘a’, true, 3.1416, etc.).
 - A reference variable value is the bits representing a way to get to an object on the heap.
- A reference variable is like a remote control. Using the dot operator (.) on a reference variable is like pressing a button on the remote control to access a method or instance variable.
 - A reference variable has a value of null when it is not referencing any object.
- An array is always an object, even if the array is declared to hold primitives. There is no such thing as a primitive array, only an array that _holds_ primitives.

# Chapter 4

- Classes define what an object knows and what an object does.
- Things an object knows are its **instance variables** (state).
- Things an object does are its **methods** (behavior).
- Methods can use instance variables so that objects of the same type can behave differently.
- A method can have parameters, which means you can pass one or more values in to the method.
- The number and type of values you pass in must match the order and type of the parameters declared by the method.
- Values passed in and out of methods can be implicitly promoted to a larger type or explicitly _cast_ to a smaller type.
- The value you pass as an argument to a method can be a literal value (2, ‘c’, etc.) or a variable of the declared parameter type (for example, x where x is an int variable). (There are other things you can pass as arguments, but we’re not there yet.)
- A method _must_ declare a return type. A void return type means the method doesn’t return anything.
- If a method declares a non-void return type, it _must_ return a value compatible with the declared return type.
- Encapsulation gives you control over who changes the data in your class and how.
- Make an instance variable private so it can’t be changed by accessing the variable directly.
- Create a public mutator method, e.g., a setter, to control how other code interacts with your data. For example, you can add validation code inside a setter to make sure the value isn’t changed to something invalid.
- _Instance_ variables are assigned values by default, even if you don’t set them explicitly.
- _Local_ variables, e.g., variables inside methods, are not assigned a value by default. You always need to initialize them.
- Use == to check if two primitives are the same value.
- Use == to check if two references are the same, i.e., two object variables are actually the same object.
- Use .equals() to see if two objects are equivalent (but not necessarily the same object), e.g., to check if two String values contain the same characters.

# Chapter 5

- Your Java program should start with a high-level design.
- Typically you’ll write three things when you create a new class:
	- **prep code(pseudocode)**
	- **test code**
	- **real (Java) code**
- Prep code should describe _what_ to do, not _how_ to do it. Implementation comes later.
- Use the prep code to help design the test code.
- A class can have one superclass only.
- Write test code _before_ you implement the methods.
- Choose _for_ loops over _while_ loops when you know how many times you want to repeat the loop code.
- The enhanced for loop is an easy way to loop over an array or collection.
- Use the _increment_ operator to add 1 to a variable (x++;).
- Use the _decrement_ operator to subtract 1 from a variable (x--;).
- Use break to leave a loop early (i.e., even if the boolean test condition is still true).

# Chapter 6

- **ArrayList** is a class in the Java API.
- To put something into an ArrayList, use **add()**.
- To remove something from an ArrayList use **remove()**.
- To find out where something is (and if it is) in an ArrayList, use **indexOf()**.
- To find out if an ArrayList is empty, use **isEmpty()**.
- To get the size (number of elements) in an ArrayList, use the **size()** ***method***.
- To get the length (number of elements) in a regular old array, remember, you use the **length** ***variable***.
- An ArrayList **resizes dynamically** to whatever size is needed. It grows when objects are added, and it **shrinks** when objects are removed.
- You declare the type of the array using a **type parameter**, which is a type name in angle brackets. Example: ArrayList\<Button\> means the ArrayList will be able to hold only objects of type Button (or subclasses of Button as you’ll learn in the next couple of chapters).
- Although an ArrayList holds objects and not primitives, the compiler will automatically “wrap” (and “unwrap” when you take it out) a primitive into an Object and place that object in the ArrayList instead of the primitive. (More on this feature later in the book.)
- Classes are grouped into packages.
- A class has a full name, which is a combination of the package name and the class name. Class ArrayList is really java.util.ArrayList.
- To use a class in a package other than java.lang, you must tell Java the full name of the class.
- You can either use an import statement at the top of your source code, or you can type the full name every place you use the class in your code.

# Chapter 7

- A subclass _extends_ a superclass.
- A subclass inherits all _public_ instance variables and methods of the superclass, but does not inherit the _private_ instance variables and methods of the superclass.
- Inherited methods can be overridden; instance variables cannot be overridden (although they can be _redefined_ in the subclass, but that’s not the same thing, and there’s almost never a need to do it.)
- Use the IS-A test to verify that your inheritance hierarchy is valid. If X extends Y, then _X IS-A Y_ must make sense.
- The IS-A relationship works in only one direction. A Hippo is an Animal, but not all Animals are Hippos.
- When a method is overridden in a subclass, and that method is invoked on an instance of the subclass, the overridden version of the method is called. (_The lowest one wins_.)
- If class B extends A, and C extends B, class B IS-A class A, and class C IS-A class B, and class C also IS-A class A.

# Chapter 8

- When you don’t want a class to be instantiated (in other words, you don’t want anyone to make a new object of that class type), mark the class with the **abstract** keyword.
- An abstract class can have both abstract and non-abstract methods.
- If a class has even _one_ abstract method, the class must be marked abstract.
- An abstract method has no body, and the declaration ends with a semicolon (no curly braces).
- All abstract methods must be implemented in the first concrete subclass in the inheritance tree.
- Every class in Java is either a direct or indirect subclass of class **Object** (java.lang.Object).
- Methods can be declared with Object arguments and/or return types.
- You can call methods on an object _only_ if the methods are in the class (or interface) used as the _reference_ variable type, regardless of the actual _object_ type. So, a reference variable of type Object can be used only to call methods defined in class Object, regardless of the type of the object to which the reference refers.
- When a method is invoked, it will use the object type’s implementation of that method.
- A reference variable of type Object can’t be assigned to any other reference type without a _cast_. A cast can be used to assign a reference variable of one type to a reference variable of a subtype, but at runtime the cast will fail if the object on the heap is NOT of a type compatible with the cast.

	Example: **Dog d = (Dog) x.getObject(aDog);**
- All objects come out of an ArrayList\<Object\> as type Object (meaning, they can be referenced only by an Object reference variable, unless you use a _cast_).
- Multiple inheritance is not allowed in Java, because of the problems associated with the Deadly Diamond of Death. That means you can extend only one class (i.e., you can have only one immediate superclass).
- Create an interface using the **interface** keyword instead of the word **class**.
- Implement an interface using the keyword **implements**.

	Example: **Dog implements Pet**
- Your class can implement multiple interfaces.
- A class that implements an interface _must_ implement all the methods of the interface, except default and static methods.
- To invoke the superclass version of a method from a subclass that’s overridden the method, use the **super** keyword. Example: **super**.runReport();

# Chapter 9

- Java has two areas of memory we care about: the Stack and the Heap.
- Instance variables are variables declared inside a class but outside any method.
- Local variables are variables declared inside a method or method parameter.
- All local variables live on the stack, in the frame corresponding to the method where the variables are declared.
- Object reference variables work just like primitive variables.if the reference is declared as a local variable, it goes on the stack
- All objects live in the heap, regardless of whether the reference is a local or instance variable.