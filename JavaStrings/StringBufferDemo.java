package JavaStrings;

public class StringBufferDemo {
    public static void main(String[] args) {
        // STRING BUFFER (Mutable, Thread-safe)
        // Create a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original: " + sb);

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Delete
        sb.delete(0, 6);
        System.out.println("After delete: " + sb);

        // Replace
        sb.replace(0, 4, "Hi");
        System.out.println("After replace: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Capacity
        System.out.println("Capacity: " + sb.capacity());

        // Length
        System.out.println("Length: " + sb.length());

        // Ensure Capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // Char At
        System.out.println("Char at index 2: " + sb.charAt(2));

        // Set Char At
        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt(0, 'X'): " + sb);

        // Substring
        System.out.println("Substring(0, 3): " + sb.substring(0, 3));
    }
}
