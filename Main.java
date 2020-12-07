// IMPORTANT: The next line is VERY important
// the class name must be "Main"
class Main {

  public static void main(String[] args) {

    // This is an example of how to create a
    // new Java object.  It creates a variable
    // named helloSam that is a reference to a 
    // HelloSam object. Look at the HelloSam.java
    // file to see what happens in the HelloSam
    // constructor.
    HelloSam helloSam = new HelloSam();

    // This is an example of how to call a method
    // in a java object.  Look at the HelloSam.java
    // file to see what happens in message()
    helloSam.message();

    // The FarenheitToCelsius java object will
    // do the conversion program.
    new FarenheitToCelsius();

    // I will want you to add a method to
    // FarenheitToCelsius.java and call it here.
    // farToCel.goCoversion() ;
  }
}
