### Exercises with methods and objects 

## Task 1: Functions

 - 1.a Create a sketch and name it Task1. Write a void setup()-method in the sketch.

 - 1.b Write a method that prints "Hello from the method" and call it from setup();

 - 1.c Write a method that receives a String as a parameter and prints it. 
    Call this method from setup()

 - 1.d Write a method that receives a String as a parameter called "name" and an integer as a parameter called "age" and call it from setup with your own name and age. Have the method print the text "My name is \<name\>, I am \<age\> years old".


---

## Task 2: Functions' return types

- 2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean. 

- 2.b Write a method that receives two integers as parameters and returns the sum of them.

- 2.c Write a method that receives a String and returns it as uppercase. 
<details>
  <summary>Hint</summary>
  <p>Use the String-method ".toUpperCase()" on your String. Notice that toUpperCase() has a String as returntype </p>
</details>

- 2.d Write a method that receives a String and returns true if the first letter of the String is uppercase. 
<details>
  <summary>Hint</summary>
  <p>Use the String-method ".charAt(0)" and "Character.isUpperCase('a');" </p>
</details>
- 2.e Call your new methods from setup(). In setup(), make sure the methods' return values are assigned to variables of the right data type. Print out the variables - still from setup.


---

## Task 3: Objects
Small Processing-hack: If you have more than one tab and you get the error message "Cannot find a class or type named.." you can fix this by adding a setup() function to the "missing class/tab".


- 3.a Start a new sketch. Call it Task3. Create a new tab and give it the name "Datamatik".

- 3.b Create a new tab called "Teacher" and another one called "Student". You should now see three new files in your sketch folder, called Datamatik.pde, Teacher.pde and Student.pde.

- 3.c In the Student tab, declare the class "Student" and add 4 instance variables: "name", "age", "isFemale", "datamatikerTeam" using appropriate data types for each.

- 3.d In the Student class, add a constructor that takes in 4 parameters with the names "tmpName", "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam" with the same data types used for instance variables in 3.c

- 3.e In the constructor, assign the values of the parameters to the instance variables created in 3.c. 

- 3.f In the Teacher tab, declare the class "Teacher" and add 3 instance variables: "name", "age", "isFemale", using appropriate data types for each.

- 3.g In the Teacher class, add a constructor that takes in 3 parameters with the names "tmpName", "tmpAge", "tmpIsFemale" with the same datatypes used in 3.f

- 3.h Populate the variables created in 3.f with the parameters of the constructor added in 3.g (this means that you assign the value of the parameters to the variables, like you did in 3.e)

- 3.i Returning to the Datamatik tap, add a setup() function and in this method create a new object/instance of the type Teacher and give it the name, age and gender of your teacher. 

- 3.j Also in the setup() function of Datamatik, create two new objects/instances of the type Student. The first one, with your own name, age and gender. The second one with the name, age and gender of a student in your study group. 

- 3.k in the setup() function print the name of the teacher

- 3.l in the setup() function print the names of both students and which teams they are from. 


---

## Task 4: Functions and objects
Create a new sketch, Task4 and copy the files Datamatik.pde and Student.pde from the folder Task3 to the folder Task5.

- 4.a In the Teacher class, make a method called changeName. The method should have the returntype void and take a String newName as parameter. The method should change the instance variable name to the newName given as argument to the method when called. 
 
- 4.b In your setup() function from 3.i you must now change the name of your Teacher-object, by calling the method changeName() with a new name.

- 4.c Print the name of the teacher in the setup() function again to see if it has changed. 


---

## Task 5:  Compare attribute values of to objects
Create a new sketch for Task5 and copy the files Datamatik.pde and Student.pde from the folder Task3 to the folder Task5.

- 5.a In your tab Datamatik, make a new method called isClassmates(). The method should take two Student objects as parameters. The method  should return a boolean. 

- 5.b Make your method return true, if the team-variable of one of the Student has the same value as the team-variable of the other Student given as argument to the method. For example, if both Students are on team "DAT1" or team 1 (depending on which data type you have used for the instance variable team), the method should return true. If they are not on the same team, the method should return false.

- 5.c From your setup() function in Datamatik, call the method isClassmates() with two Student-objects. Make sure that you assign the returnvalue to a variable in the setup()-method. From setup() print "<Student-name> and <Student-name> are classmates" is they are on the same team and "<Student-name> and <Student-name> are not classmates" if they are not. 

---

## Task 6. Parameterized functionality
 Start a new sketch and add a setup-function
 
- 6.a Add a function called <code>divisible</code> that takes in an int as a parameter.

- 6.b In the function add a for-loop in where there is a print statement that prints out <code>i</code> (the counter of the for-loop), but only if <code>i</code> is divisible by the parameter received. Let <code>i</code> be initialized with the value 1 and let the loop end when i > 100. 

<details>
  <summary>Hint</summary>
  <p>you need to use the % operator</p>
</details>

- 6.c Call the method from setup() to see if it works


---

## Task 7. Recursion
This exercise is advanced and involves stuff that we have not covered in class. It is optional to complete. 
A function can call itself. This is called recursion. To prevent a recursive function from generating an infinite loop, one must add a constraint.
We did not cover this in class, so this is an optional exercise. You can read about recursion here: [W3Schools](https://www.w3schools.com/java/java_recursion.asp)

- 7.a Write a function that takes an integer as a parameter and prints the number. 

- 7.b Make the function subtract 1 from the parameter.

- 7.c Check if the new value is less than zero. If not, make a call to itself using the new value as the argument(recursion). 



