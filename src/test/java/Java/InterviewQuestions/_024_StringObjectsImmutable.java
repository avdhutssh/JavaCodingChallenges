package Java.InterviewQuestions;

public class _024_StringObjectsImmutable {

	public static void main(String[] args) {
//		In Java, String objects are immutable, meaning their values cannot be changed
//		after they are created. This immutability is a fundamental characteristic of
//		the String class.
//	
//		Why String Objects are Immutable
//		
//		Thread Safety:
//		String immutability ensures that strings are inherently thread-safe since they cannot be changed once created. 
//		Multiple threads can safely use the same String instance without synchronization.
//		
//		String Pooling:
//		Java uses a special memory area called the string pool. When a String literal is created, 
//		the JVM checks if it already exists in the pool. If it does, it reuses the reference, saving memory. 
//		Immutability guarantees that these shared strings remain unchanged.
//		
//		Security:
//		Many Java classes use strings for parameters, such as network connections, file paths, etc. 
//		Immutability ensures that these parameters cannot be altered once created, adding a layer of security.
//		
//		Performance Optimization:
//		Immutable strings allow the JVM to optimize memory usage and performance through techniques 
//		like hash code caching.
		
		
		String original = "Hello";
		String modified = original.concat(" World");

		System.out.println("Original String: " + original); // Should print "Hello"
		System.out.println("Modified String: " + modified); // Should print "Hello World"

		// Checking the reference
		if (original == modified) {
			System.out.println("The strings are the same object.");
		} else {
			System.out.println("The strings are different objects.");
		}
	}

}
