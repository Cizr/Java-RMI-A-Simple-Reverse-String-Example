## What It Does:

The Java RMI (Remote Method Invocation) code demonstrates a simple example of reversing a string remotely. It consists of four components:

- **Remote Interface (`ReverseInterface`)**: Declares a remote method `reverseString` to reverse a string.
- **Implementation Class (`Reverse`)**: Provides the implementation of the `reverseString` method.
- **Server Class (`ReverseServer`)**: Starts the RMI server and binds the `Reverse` object to the RMI registry.
- **Client Class (`ReverseClient`)**: Connects to the RMI registry, invokes the `reverseString` method remotely, and displays the reversed string.

## How to Run It:

1. **Compile the Code**: Compile the Java source files (`ReverseInterface.java`, `Reverse.java`, `ReverseServer.java`, `ReverseClient.java`) using the `javac` command.

2. **Start the RMI Registry**: Open a terminal or command prompt, navigate to the directory containing the compiled `.class` files, and start the RMI registry using the `start rmiregistry 1099` command.

3. **Run the Server**: In the same terminal or command prompt, run the server using the `java ReverseServer` command.

4. **Run the Client**: Open a new terminal or command prompt, navigate to the directory containing the compiled `.class` files, and run the client using the `java ReverseClient "HelloWorld"` command (replace "HelloWorld" with the string you want to reverse).

By following these steps, you can execute the Java RMI code to reverse a string remotely.
