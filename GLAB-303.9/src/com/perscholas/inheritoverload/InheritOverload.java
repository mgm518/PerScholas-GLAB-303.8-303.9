package com.perscholas.inheritoverload;

public class InheritOverload {

  public static void main(String[] args) {
    new InheritOverload().pa_303_9_1();
  }

  void pa_303_9_1() {
    System.out.println("""
        **************************************************
        PA 303.9.1 - Inheritance & Overloading
        **************************************************""");
    inheritance1();
    System.out.println();
    inheritance2();
    System.out.println();
    overriding1();
    System.out.println();
    overriding2();
    System.out.println();
  }

  /**
   * <h>Java Inheritance I</h>
   * <p>
   * You must add a {@link Bird#sing()} method to the {@link Bird} class, then modify the main
   * method accordingly so that the code prints the following lines:
   * <p>
   * <code>I am walking</code>
   * <p>
   * <code>I am flying</code>
   * <p>
   * <code>I am singing</code>
   */
  void inheritance1() {
    System.out.println("Java Inheritance I");
    // Code imported from the challenge so that the same functionality is demonstrated
    // See the Bird.class for the code submission.
    Bird bird = new Bird();
    bird.walk();
    bird.fly();
    bird.sing();
  }

  /**
   * <h>Java Inheritance II</h>
   * <p/>
   * Write the following code in your editor below:
   * <ol>
   *     <li>A class named {@link Arithmetic} with a method named {@link Arithmetic#add(int, int)} add} that takes  integers as parameters and returns an integer denoting their sum.</li>
   *     <li>A class named Adder that inherits from a superclass named Arithmetic.</li>
   * </ol>
   * Your classes should not be be <code>public</code>.
   */
  void inheritance2() {
    System.out.println("Java Inheritance II");
    // Code imported from the challenge so that the same functionality is demonstrated
    // See the Arithmetic.class for the code submission.

    // Create a new Adder object
    Adder a = new Adder();

    // Print the name of the superclass on a new line
    System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

    // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
    System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
  }

  /**
   * <h>Java Overloading I</h>
   * <p/>
   * Complete the code in your editor by writing an overridden
   * {@link Soccer#getNumberOfTeamMembers()} method that prints the same statement as the
   * superclass' {@link Sports#getNumberOfTeamMembers()} method, except that it replaces  with  (the
   * number of players on a Soccer team).
   */
  void overriding1() {
    System.out.println("Java Overloading I");
    // Code imported from the challenge so that the same functionality is demonstrated
    // See the Sports.class for the code submission.
    Sports c1 = new Sports();
    Soccer c2 = new Soccer();
    System.out.println(c1.getName());
    c1.getNumberOfTeamMembers();
    System.out.println(c2.getName());
    c2.getNumberOfTeamMembers();
  }

  /**
   * <h>Java Overloading I</h>
   * <p/>
   * When a method in a subclass overrides a method in superclass, it is still possible to call the
   * overridden method using super keyword. If you write super.func() to call the function func(),
   * it will call the method that was defined in the superclass.
   * <p>
   * You are given a partially completed code in the editor. Modify the code so that the code prints
   * the following text:
   * <pre>{@code Hello I am a motorcycle, I am a cycle with an engine.
   * My ancestor is a cycle who is a vehicle with pedals.}</pre>
   */
  void overriding2() {
    System.out.println("Java Overloading II");
    // Code imported from the challenge so that the same functionality is demonstrated
    // See the MotorCycle.class for the code submission.
    MotorCycle M=new MotorCycle();
  }
}
