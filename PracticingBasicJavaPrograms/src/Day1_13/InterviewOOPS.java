package Day1_13;

class Animal {
	
	static final int x = 0;
	
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}

	public void eat(String s) {
		System.out.println("Horse is eating ....................... " + s);
	}
	
	public static void run() {
		System.out.println("I am running animal");
	}

}

public class InterviewOOPS extends Animal {
	public void eat() {
		System.out.println("Horse eating hay ");
	}

	public void eat(String s) {
		System.out.println("Horse eating " + s);
	}
	
	public static void run() {
		System.out.println("I am running experiment");
	}

	public static void main(String[] args) {
		
		InterviewOOPS ex = new InterviewOOPS();
		ex.eat();
		ex.eat("grass");
		ex.run();
		Animal a = new Animal();
		a.eat();
		a.run();
		Animal a1 = new InterviewOOPS();
		a1.eat();
		a1.eat("grass"); // error
		a1.run();		// makes run the run method of base class
		
//		Q1 What is OOPs?
//
//				OOPs stands for Object-Oriented Programming System. It is a programming paradigm formulated around Objects. The state and behavior of an Object are represented as data members (variables) and methods (functions).
//
//				The two core concepts of OOPs are Object and Class.
//
//				Q2 What is Class? 
//
//				Class: Class is a template that explains the kind of state and behavior that objects of its type support.
//
//				Q3 What is an Object?
//
//				Object: At runtime, when JVM (Java Virtual Machine) finds the new keyword, it will use the appropriate class to create an object which is an instance of that class.
//
//				Q4 What do you understand by the terms state and behavior of an Object?
//
//				State(instance variables): Values assigned to the instance variables of an object make up the object's state.
//
//				Behavior(functions/methods): Methods/functions are where the class logic is stored. This is where the data gets manipulated or algorithms get executed. Functions are also called procedures or methods. 
//
//				Variables are also called members, fields or attributes.
//				Q5 Difference between a Class and an Object in java?
//
//				a. An object is an instance of a class. Class is a blueprint from which the instance/object is created.
//				b. An object is a physical entity whereas Class is a logical entity.
//
//				Q6 Advantages of OOPs concepts in java?
//
//				a. Gives a clear modular structure for programs
//				b. Objects can also be reused within and across applications, Reuse also enables faster development.
//				c. Better Productivity as OOPs techniques enforce rules on a programmer.
//				d. It helps to model real-life problems.
//
//				Q7 What are the 4 OOPs principles in java?
//
//				a. Abstraction
//				b. Encapsulation
//				c. Polymorphism
//				d. Inheritance
//
//				Q8 Why do we use OOPs in java?
//
//				Reduces complexity and also improves the maintainability of the system. When combined with the concepts of the Abstraction, Encapsulation, Inheritance, and Polymorphism give more power to the Object-Oriented Programming languages.
//
//				Q9 What is Method Overloading in java?
//
//				A class with multiple methods by the same name but different parameters called Method Overloading.
//				You can find it in detail here.
//
//				Q10 What is Method Overriding in java?
//
//				In Method Overriding a subclass/child class has the same method name, same method signature and same return types (covariant return types) as a method in its parent class, then the child class method has overridden the parent class method.
//				You can find the complete detail about Method Overriding here.
//
//				Q11 What is the difference between Method Overloading and Method Overriding?
//
//				I have explained in detail about the difference between Method Overloading and Method Overriding in java.
//
//				Q12 What is early and late binding in java?
//
//				When an object is assigned to an object variable the compiler performs a process called binding.
//				Compile-time binding is called early binding (static binding) whereas runtime binding is called late binding (dynamic binding).
//				Method Overloading is an example of early binding in java. Method Overriding is an example of late binding in java.
//
//				Q13 Can we override the overloaded method in java?
//
//				Yes, we can override the overloaded method.
//
//				Q14 Can we overload a static method in java?
//
//				Yes, overloading a static method in java is possible. You can have as many overloaded static methods having the same name as you like provided they have different method signatures. Static methods should be accessed by class names rather than an object. A static method can be overloaded, but can not be overridden in java.
//
//				Q15 Can we override a static method in java?
//
//				No, you can not override a static method in java. Static methods belong to class so they are resolved at compile time using the type of reference variable.
//
//				Q16 What do you mean by covariant method overriding in java?
//
//				In the case of covariant method overriding, the return type must be the same as, or a subtype of,  the return type declared in the original overridden method in the superclass. The concept of covariant return type was introduced in java 1.5 version.
//
//				Q17 Can we override a method declared as private in java?
//
//				No, you can not override a private method in java.
//
//				Q18 Can you override the method which is declared as final?
//
//				No, you can not override a method declared as final.
//
//				Q19 What is inheritance in java?
//
//				Inheritance in java is the process in which the child class(subclass) object acquires all the properties and behaviors of a parent object (superclass).
//
//				Inheritance is achieved by using the extends keyword. Only public and protected fields (attributes) can be accessed in child class.
//
//				Q20 What are the different types of inheritance in java?
//
//				Single inheritance
//				Multiple inheritance
//				Multilevel inheritance
//				Hierarchical inheritance
//				Hybrid inheritance
//
//				Q21 Is a method declared as final inherited in java?
//
//				Yes, it is inherited still you cannot override it.
//
//				Q22 What is multiple inheritance?
//
//				If a subclass(child class) acquires state and behavior from multiple parent classes(superclass) then it is known as multiple inheritance.
//
//				Q23 Why multiple inheritance is not supported in java?
//
//				In order to reduce the complexity of java language, multiple inheritance is not supported in java.
//				Suppose there are 4 classes named A, B, C, and D. The relationship between A, B, C, and D is :
//
//				a. class A has two child classes (subclass) B and C
//				b. class D has two parent classes (superclass) B and C
//
//				Suppose you have a method named commonMethod() in class A which is overridden by both B and C classes.
//
//				If you want to call commonMethod() on the instance of D class, which method should get called (from class B or class C).
//
//				Due to this ambiguity, multiple inheritance is not supported in java.
//
//				The above problem is known as the diamond problem.
//
//				Q24 What are the problems might be created when you are trying to implement multiple inheritance concept in java?
//
//				The operations like casting, constructor chaining might cause problems when trying to implement
//				multiple inheritance. Even the compiler gets complications as to call which class method and which class gets priority.
//
//				Q25 Why java is not a pure Object-Oriented Language?
//
//				Java is not a pure Object Oriented Language because it uses primitive variables e.g int, float, double which are not objects.
//
//				Q26 In a class which is the default access modifier in java?
//
//				The default access modifier is "default" which is also known as "package-private" (though you can't use this explicitly). It means the field will be visible to the same package to which the class belongs. Java uses a "default" access modifier when no access modifier is present.
//
//				Q27 Can Operators be overloaded in java?
//
//				Java doesn't allow user-defined overloaded operators, but internally java overloads operators like ‘+’. '+' is overloaded for concatenation of strings and addition of numbers.
//
//				Q28 What is the difference between Inheritance and Encapsulation in java?
//
//				Inheritance has a parent-child relationship and it is one of the ways to reuse the code written for the parent class but it forms the basis of Polymorphism.
//				Encapsulation is used to bind the code and data into a single unit.
//				e.g. HashMap encapsulates on how to store elements and how to calculate hash values.
//
//				Q29 Does abstract class have constructor in java?
//
//				Abstract classes can have constructors. A class can not be instantiated once it is declared as an abstract class but that does not mean that an abstract class cannot have a constructor.
//
//				Q30 Can a constructor be declared as private in java?
//
//				Yes, you can declare the constructor as private in java. If the constructor is declared as private, then the class cannot be instantiated, it can be instantiated from another method in the class.
//
//				Q31 From a method can we call a constructor directly in java?
//
//				No, Constructors can't be called directly, they can be called implicitly when the new keyword creates an object. Methods can be called explicitly on an object that has already been created with the help of a new keyword.
//
//				Q32 Can Interfaces have a constructor in java?
//
//				No, the interface cannot have constructors (Constructor is being called during the creation of object).
//
//				Q33 Difference between constructors and methods in java?
//
//				a. A constructor is used to initializing an object whereas method is used to exhibit functionality of an object.
//				b. Constructors are invoked implicitly but methods are invoked explicitly.
//
//				Q34 Why Encapsulation in java is called as Data hiding in java?
//
//				When a field is declared private in a class then it cannot be accessed by anyone outside the class and
//				hides the fields within the class. Therefore, Encapsulation is also called data hiding.
//
//				Q35 What is tightly encapsulated class in java?
//
//				If each variable in a class is declared as private then it is called a tightly encapsulated class in java. It is not required to check whether class contains getter and setter methods or not and if these methods are declared as public or not.
//
//				Q36 What is a ternary operator in java?
//
//				The ternary operator is a conditional operator that takes three operands, and it evaluates the condition as true or false.
//
//				For example:
//
//				public class JavaHungry {
//				    public static void main(String args[])                
//				    {
//				        int x = 10;
//				        int y = 25;
//				        System.out.println((x &gt; y) ? "x is greater than y" : " x is less than y");
//				    }
//				}
//
//
//				Output:
//				x is less than y
//
//				Q37 What is the use of the final keyword in java?
//
//				By declaring the variable as final, the value of the final variable cannot be changed.
//				By declaring the method as final, method cannot be overridden.
//				By declaring the class as final, class cannot be extended.
//
//				Q38 Can we stop method overriding without using the final keyword?
//
//				Yes, we can stop the method overriding by declaring the method as private or static.
//
//				Q39 Mention the difference between final and super keyword in java?
//
//				The super keyword is used to access superclass (Parent class) variables and methods by subclass objects
//				The final keyword can be used in three places in java with different jobs as explained in Q37.
//
//				Q40 Can we use "super super" in java?
//
//				No, error occurs in line “super.super.print();”. A class cannot directly access the grandparent's members in java.
//
//				Q41 Can we override the constructor in java?
//
//				No, A constructor cannot be overridden in java but a method can be overridden.
//
//				Q42 What are the access modifiers available in java?
//
//				Public, private, protected, default
//
//				Q43 What is a blank or uninitialized final variable?
//
//				A variable that is declared as final and is not initialized at the time of declaration is known as a blank final variable.
//
//				Q44 What is a static blank final variable in java?
//
//				A final static variable that is not initialized at the time of declaration is known as a static blank final variable.
//				It can be initialized only in static block.
//
//				Q45 What is a wrapper class in java?
//
//				The wrapper class in java provides the mechanism to convert primitive type into object and object into primitive type.
//				The automatic conversion of primitive type into an object is known as autoboxing and object to primitive type is unboxing.
//
//				Q46 What is instanceof keyword in java?
//
//				instanceof operator is used to check whether the object is an instance of the specific class or interface.
//
//				Q47 What is object cloning in java?
//
//				The creation of an exact copy of an object using the clone() method of Object class is called object cloning.
//
//				Q48 What is the use of this keyword in java?
//
//				this keyword is used to refer to the object within the current scope.
//
//				Q49 Difference between Composition and Inheritance in OOPs in java?
//
//				• Inheritance builds the IS-A relationship while Composition builds a HAS-A relationship.
//				• The parent-child relationship is best represented using Inheritance but if only the services of
//				another class have to be used then Composition.
//				• Though both Inheritance and Composition allows reusing code, one of the disadvantages of
//				Inheritance is that it breaks encapsulation.
//
//				Q50 Can a class extend two interfaces wherein they both have a method with the same name and signature in java?
//
//				No, a conflict will arise because the compiler will not be able to link a method call due to ambiguity. It will throw a compile-time error in java. 
	}
}
