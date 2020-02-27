package Day1_13;

public class AllInterviewJavaQuestions
{
	
//			Q1 What is OOPs?
//
//			OOPs stands for Object-Oriented Programming System. It is a programming paradigm formulated around Objects. The state and behavior of an Object are represented as data members (variables) and methods (functions).
//
//			The two core concepts of OOPs are Object and Class.
//
//			Q2 What is Class? 
//
//			Class: Class is a template that explains the kind of state and behavior that objects of its type support.
//
//			Q3 What is an Object?
//
//			Object: At runtime, when JVM (Java Virtual Machine) finds the new keyword, it will use the appropriate class to create an object which is an instance of that class.
//
//			Q4 What do you understand by the terms state and behavior of an Object?
//
//			State(instance variables): Values assigned to the instance variables of an object make up the object's state.
//
//			Behavior(functions/methods): Methods/functions are where the class logic is stored. This is where the data gets manipulated or algorithms get executed. Functions are also called procedures or methods. 
//
//			Variables are also called members, fields or attributes.
//			Q5 Difference between a Class and an Object in java?
//
//			a. An object is an instance of a class. Class is a blueprint from which the instance/object is created.
//			b. An object is a physical entity whereas Class is a logical entity.
//
//			Q6 Advantages of OOPs concepts in java?
//
//			a. Gives a clear modular structure for programs
//			b. Objects can also be reused within and across applications, Reuse also enables faster development.
//			c. Better Productivity as OOPs techniques enforce rules on a programmer.
//			d. It helps to model real-life problems.
//
//			Q7 What are the 4 OOPs principles in java?
//
//			a. Abstraction
//			b. Encapsulation
//			c. Polymorphism
//			d. Inheritance
//
//			Q8 Why do we use OOPs in java?
//
//			Reduces complexity and also improves the maintainability of the system. When combined with the concepts of the Abstraction, Encapsulation, Inheritance, and Polymorphism give more power to the Object-Oriented Programming languages.
//
//			Q9 What is Method Overloading in java?
//
//			A class with multiple methods by the same name but different parameters called Method Overloading.
//			You can find it in detail here.
//
//			Q10 What is Method Overriding in java?
//
//			In Method Overriding a subclass/child class has the same method name, same method signature and same return types (covariant return types) as a method in its parent class, then the child class method has overridden the parent class method.
//			You can find the complete detail about Method Overriding here.
//
//			Q11 What is the difference between Method Overloading and Method Overriding?
//
//			I have explained in detail about the difference between Method Overloading and Method Overriding in java.
//
//			Q12 What is early and late binding in java?
//
//			When an object is assigned to an object variable the compiler performs a process called binding.
//			Compile-time binding is called early binding (static binding) whereas runtime binding is called late binding (dynamic binding).
//			Method Overloading is an example of early binding in java. Method Overriding is an example of late binding in java.
//
//			Q13 Can we override the overloaded method in java?
//
//			Yes, we can override the overloaded method.
//
//			Q14 Can we overload a static method in java?
//
//			Yes, overloading a static method in java is possible. You can have as many overloaded static methods having the same name as you like provided they have different method signatures. Static methods should be accessed by class names rather than an object. A static method can be overloaded, but can not be overridden in java.
//
//			Q15 Can we override a static method in java?
//
//			No, you can not override a static method in java. Static methods belong to class so they are resolved at compile time using the type of reference variable.
//
//			Q16 What do you mean by covariant method overriding in java?
//
//			In the case of covariant method overriding, the return type must be the same as, or a subtype of,  the return type declared in the original overridden method in the superclass. The concept of covariant return type was introduced in java 1.5 version.
//
//			Q17 Can we override a method declared as private in java?
//
//			No, you can not override a private method in java.
//
//			Q18 Can you override the method which is declared as final?
//
//			No, you can not override a method declared as final.
//
//			Q19 What is inheritance in java?
//
//			Inheritance in java is the process in which the child class(subclass) object acquires all the properties and behaviors of a parent object (superclass).
//
//			Inheritance is achieved by using the extends keyword. Only public and protected fields (attributes) can be accessed in child class.
//
//			Q20 What are the different types of inheritance in java?
//
//			Single inheritance
//			Multiple inheritance
//			Multilevel inheritance
//			Hierarchical inheritance
//			Hybrid inheritance
//
//			Q21 Is a method declared as final inherited in java?
//
//			Yes, it is inherited still you cannot override it.
//
//			Q22 What is multiple inheritance?
//
//			If a subclass(child class) acquires state and behavior from multiple parent classes(superclass) then it is known as multiple inheritance.
//
//			Q23 Why multiple inheritance is not supported in java?
//
//			In order to reduce the complexity of java language, multiple inheritance is not supported in java.
//			Suppose there are 4 classes named A, B, C, and D. The relationship between A, B, C, and D is :
//
//			a. class A has two child classes (subclass) B and C
//			b. class D has two parent classes (superclass) B and C
//
//			Suppose you have a method named commonMethod() in class A which is overridden by both B and C classes.
//
//			If you want to call commonMethod() on the instance of D class, which method should get called (from class B or class C).
//
//			Due to this ambiguity, multiple inheritance is not supported in java.
//
//			The above problem is known as the diamond problem.
//
//			Q24 What are the problems might be created when you are trying to implement multiple inheritance concept in java?
//
//			The operations like casting, constructor chaining might cause problems when trying to implement
//			multiple inheritance. Even the compiler gets complications as to call which class method and which class gets priority.
//
//			Q25 Why java is not a pure Object-Oriented Language?
//
//			Java is not a pure Object Oriented Language because it uses primitive variables e.g int, float, double which are not objects.
//
//			Q26 In a class which is the default access modifier in java?
//
//			The default access modifier is "default" which is also known as "package-private" (though you can't use this explicitly). It means the field will be visible to the same package to which the class belongs. Java uses a "default" access modifier when no access modifier is present.
//
//			Q27 Can Operators be overloaded in java?
//
//			Java doesn't allow user-defined overloaded operators, but internally java overloads operators like ‘+’. '+' is overloaded for concatenation of strings and addition of numbers.
//
//			Q28 What is the difference between Inheritance and Encapsulation in java?
//
//			Inheritance has a parent-child relationship and it is one of the ways to reuse the code written for the parent class but it forms the basis of Polymorphism.
//			Encapsulation is used to bind the code and data into a single unit.
//			e.g. HashMap encapsulates on how to store elements and how to calculate hash values.
//
//			Q29 Does abstract class have constructor in java?
//
//			Abstract classes can have constructors. A class can not be instantiated once it is declared as an abstract class but that does not mean that an abstract class cannot have a constructor.
//
//			Q30 Can a constructor be declared as private in java?
//
//			Yes, you can declare the constructor as private in java. If the constructor is declared as private, then the class cannot be instantiated, it can be instantiated from another method in the class.
//
//			Q31 From a method can we call a constructor directly in java?
//
//			No, Constructors can't be called directly, they can be called implicitly when the new keyword creates an object. Methods can be called explicitly on an object that has already been created with the help of a new keyword.
//
//			Q32 Can Interfaces have a constructor in java?
//
//			No, the interface cannot have constructors (Constructor is being called during the creation of object).
//
//			Q33 Difference between constructors and methods in java?
//
//			a. A constructor is used to initializing an object whereas method is used to exhibit functionality of an object.
//			b. Constructors are invoked implicitly but methods are invoked explicitly.
//
//			Q34 Why Encapsulation in java is called as Data hiding in java?
//
//			When a field is declared private in a class then it cannot be accessed by anyone outside the class and
//			hides the fields within the class. Therefore, Encapsulation is also called data hiding.
//
//			Q35 What is tightly encapsulated class in java?
//
//			If each variable in a class is declared as private then it is called a tightly encapsulated class in java. It is not required to check whether class contains getter and setter methods or not and if these methods are declared as public or not.
//
//			Q36 What is a ternary operator in java?
//
//			The ternary operator is a conditional operator that takes three operands, and it evaluates the condition as true or false.
//
//			For example:
//
//			public class JavaHungry {
//			    public static void main(String args[])                
//			    {
//			        int x = 10;
//			        int y = 25;
//			        System.out.println((x &gt; y) ? "x is greater than y" : " x is less than y");
//			    }
//			}
//
//
//			Output:
//			x is less than y
//
//			Q37 What is the use of the final keyword in java?
//
//			By declaring the variable as final, the value of the final variable cannot be changed.
//			By declaring the method as final, method cannot be overridden.
//			By declaring the class as final, class cannot be extended.
//
//			Q38 Can we stop method overriding without using the final keyword?
//
//			Yes, we can stop the method overriding by declaring the method as private or static.
//
//			Q39 Mention the difference between final and super keyword in java?
//
//			The super keyword is used to access superclass (Parent class) variables and methods by subclass objects
//			The final keyword can be used in three places in java with different jobs as explained in Q37.
//
//			Q40 Can we use "super super" in java?
//
//			No, error occurs in line “super.super.print();”. A class cannot directly access the grandparent's members in java.
//
//			Q41 Can we override the constructor in java?
//
//			No, A constructor cannot be overridden in java but a method can be overridden.
//
//			Q42 What are the access modifiers available in java?
//
//			Public, private, protected, default
//
//			Q43 What is a blank or uninitialized final variable?
//
//			A variable that is declared as final and is not initialized at the time of declaration is known as a blank final variable.
//
//			Q44 What is a static blank final variable in java?
//
//			A final static variable that is not initialized at the time of declaration is known as a static blank final variable.
//			It can be initialized only in static block.
//
//			Q45 What is a wrapper class in java?
//
//			The wrapper class in java provides the mechanism to convert primitive type into object and object into primitive type.
//			The automatic conversion of primitive type into an object is known as autoboxing and object to primitive type is unboxing.
//
//			Q46 What is instanceof keyword in java?
//
//			instanceof operator is used to check whether the object is an instance of the specific class or interface.
//
//			Q47 What is object cloning in java?
//
//			The creation of an exact copy of an object using the clone() method of Object class is called object cloning.
//
//			Q48 What is the use of this keyword in java?
//
//			this keyword is used to refer to the object within the current scope.
//
//			Q49 Difference between Composition and Inheritance in OOPs in java?
//
//			• Inheritance builds the IS-A relationship while Composition builds a HAS-A relationship.
//			• The parent-child relationship is best represented using Inheritance but if only the services of
//			another class have to be used then Composition.
//			• Though both Inheritance and Composition allows reusing code, one of the disadvantages of
//			Inheritance is that it breaks encapsulation.
//
//			Q50 Can a class extend two interfaces wherein they both have a method with the same name and signature in java?
//
//			No, a conflict will arise because the compiler will not be able to link a method call due to ambiguity. It will throw a compile-time error in java. 

//			--------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
//			1) Is String a keyword in java?
//
//			No. String is not a keyword in java. String is a final class in java.lang package which is used to represent the set of characters in java.
//
//			2) Is String a primitive type or derived type?
//
//			String is a derived type.
//
//			3) In how many ways you can create string objects in java?
//
//			There are two ways to create string objects in java. One is using new operator and another one is using string literals. The objects created using new operator are stored in the heap memory and objects created using string literals are stored in string constant pool.
//
//			String s1 = new String("abc");          //Creating string object using new operator
//
//			String s2 = "abc";        //Creating string object using string literal
//
//			4) What is string constant pool?
//
//			String objects are most used data objects in Java. Hence, java has a special arrangement to store the string objects. String Constant Pool is one such arrangement. String Constant Pool is the memory space in heap memory specially allocated to store the string objects created using string literals. In String Constant Pool, there will be no two string objects having the same content.
//
//			Whenever you create a string object using string literal, JVM first checks the content of the object to be created. If there exist an object in the string constant pool with the same content, then it returns the reference of that object. It doesn’t create a new object. If the content is different from the existing objects then only it creates new object.
//
//			5) What is special about string objects as compared to objects of other derived types?
//
//			One special thing about string objects is that you can create string objects without using new operator i.e using string literals. This is not possible with other derived types (except wrapper classes). One more special thing about strings is that you can concatenate two string objects using ‘+’. This is the relaxation java gives to string objects as they will be used most of the time while coding. And also java provides string constant pool to store the string objects.
//
//			6) What do you mean by mutable and immutable objects?
//
//			Immutable objects are like constants. You can’t modify them once they are created. They are final in nature. Where as mutable objects are concerned, you can perform modifications to them.
//
//			[quads id=5]
//
//			7) Which is the final class in these three classes – String, StringBuffer and StringBuilder?
//
//			All three are final. (Interviewer will ask this type of questions to confuse you)
//
//			8) What is the difference between String, StringBuffer and StringBuilder?
//
//			[Answer]
//
//			9) Why StringBuffer and StringBuilder classes are introduced in java when there already exist String class to represent the set of characters?
//
//			The objects of String class are immutable in nature. i.e you can’t modify them once they are created. If you try to modify them, a new object will be created with modified content. This may cause memory and performance issues if you are performing lots of string modifications in your code. To overcome these issues, StingBuffer and StringBuilder classes are introduced in java.
//
//			10) How many objects will be created in the following code and where they will be stored in the memory?
//
//			String s1 = "abc";
//
//			String s2 = "abc";
//
//			Only one object will be created and this object will be stored in the string constant pool.
//
//			11) How do you create mutable string objects?
//
//			Using StringBuffer and StringBuilder classes. These classes provide mutable string objects.
//
//			12) Which one will you prefer among “==” and equals() method to compare two string objects?
//
//			I prefer equals() method because it compares two string objects based on their content. That provides more logical comparison of two string objects. If you use “==” operator, it checks only references of two objects are equal or not. It may not be suitable in all situations. So, rather stick to equals() method to compare two string objects. [more]
//
//			13) Which class will you recommend among String, StringBuffer and StringBuilder classes if I want mutable and thread safe objects?
//
//			StringBuffer
//
//			14) How do you convert given string to char array?
//
//			Using toCharArray() method.
//
//			15) How many objects will be created in the following code and where they will be stored?
//
//			String s1 = new String("abc");
//
//			String s2 = "abc";
//
//			Here, two string objects will be created. Object created using new operator(s1) will be stored in the heap memory. The object created using string literal(s2) is stored in the string constant pool.
//
//			16) Where exactly string constant pool is located in the memory?
//
//			Inside the heap memory. JVM reserves some part of the heap memory to store string objects created using string literals. [more]
//
//			17) I am performing lots of string concatenation and string modification in my code. which class among string, StringBuffer and StringBuilder improves the performance of my code. Remember I also want thread safe code?
//
//			StringBuffer class gives better performance in this scenario. As String class is immutable, if you use this class, a new object will be created after every string concatenation or string modification. This will lower the performance of the code. You can use StringBuilder also, but it is not thread safe. So, StringBuffer will be optimal choice here.
//
//			18) What is string intern?
//
//			String object in the string constant pool is called as String Intern. You can create an exact copy of heap memory string object in string constant pool. This process of creating an exact copy of heap memory string object in the string constant pool is called interning. intern() method is used for interning. [more]
//
//			19) What is the main difference between Java strings and C, C++ strings?
//
//			In C and C++, strings are terminated with null character. But in java, strings are not terminated with null character. Strings are treated as objects in java.
//
//			20) How many objects will be created in the following code and where they will be stored?
//
//			String s1 = new String("abc");
//
//			String s2 = new String("abc");
//
//			Two objects will be created and they will be stored in the heap memory.
//
//			21) Can we call String class methods using string literals?
//
//			Yes, we can call String class methods using string literals. Here are some examples,
//
//			"abc".charAt(0)
//
//			"abc".compareTo("abc")
//
//			"abc".indexOf('c')
//
//			22) do you have any idea why strings have been made immutable in java?
//
//			a) Immutable strings increase security. As they can’t be modified once they are created, so we can use them to store sensitive data like username, password etc.
//
//			b) Immutable strings are thread safe. So, we can use them in a multi threaded code without synchronization.
//
//			c) String objects are used in class loading. If strings are mutable, it is possible that wrong class is being loaded as mutable objects are modifiable.
//
//			[More]
//
//			23) What do you think about string constant pool? Why they have provided this pool as we can store string objects in the heap memory itself?
//
//			String constant pool increases the reusability of existing string objects. When you are creating a string object using string literal, JVM first checks string constant pool. If that object is available, it returns reference of that object rather creating a new object. This will also speed up your application as only reference is returned and also saves the memory as no two objects with same content are created.
//
//			24) What is the similarity and difference between String and StringBuffer class?
//
//			The main similarity between String and StringBuffer class is that both are thread safe. The main difference between them is that String objects are immutable where as StringBuffer objects are mutable.
//
//			25) What is the similarity and difference between StringBuffer and StringBuilder class?
//
//			The main similarity between StringBuffer and StringBuilder class is that both produces mutable string objects. The main difference between them is that StringBuffer class is thread safe where as StringBuilder class is not thread safe.


}
