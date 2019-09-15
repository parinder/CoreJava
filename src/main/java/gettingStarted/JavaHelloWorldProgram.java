package gettingStarted;

public class JavaHelloWorldProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");

	}

}

/*
 * Java Hello World Program important points: Any java source file can have
 * multiple classes but they can have only one public class. The java source
 * file name should be same as public class name. That’s why the file name we
 * saved our program was JavaHelloWorldProgram.java When we compile the code, it
 * generates byte code and save it as Class_Name.class extension. If you look at
 * the directory where we compiled the java file, you will notice a new file
 * created JavaHelloWorldProgram.class When we execute the class file, we don’t
 * need to provide full file name. We need to use only the public class name.
 * When we run the program using java command, it loads the class into JVM and
 * looks for the main method in the class and runs it. The main function syntax
 * should be same as specified in the program, else it won’t run and throw
 * exception as Exception in thread "main" java.lang.NoSuchMethodError: main.
 */
