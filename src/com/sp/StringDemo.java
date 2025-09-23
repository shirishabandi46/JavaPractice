public class StringDemo {
    public static void main(String[] args) {

        // ---------- String (Immutable) ----------
        System.out.println("----- String Methods -----");
        String str = "Hello World";

        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("CharAt(1): " + str.charAt(1));
        System.out.println("Substring(0,5): " + str.substring(0, 5));
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Equals 'hello world': " + str.equals("hello world"));
        System.out.println("EqualsIgnoreCase 'hello world': " + str.equalsIgnoreCase("hello world"));
        System.out.println("IndexOf 'o': " + str.indexOf("o"));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println("To Uppercase: " + str.toUpperCase());
        System.out.println("To Lowercase: " + str.toLowerCase());
        System.out.println("Trim: " + "  spaced text  ".trim());

        // ---------- StringBuffer (Mutable, Thread-safe) ----------
        System.out.println("\n----- StringBuffer Methods -----");
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original: " + sb);
        sb.append(" World");   // Add text
        System.out.println("Append: " + sb);
        sb.insert(5, " Java"); // Insert at position
        System.out.println("Insert: " + sb);
        sb.replace(6, 10, "Programming"); // Replace part
        System.out.println("Replace: " + sb);
        sb.delete(6, 17); // Delete part
        System.out.println("Delete: " + sb);
        sb.reverse(); // Reverse string
        System.out.println("Reverse: " + sb);
        sb.reverse(); // Back to normal
        System.out.println("Capacity: " + sb.capacity()); // Current buffer size
        System.out.println("Length: " + sb.length());

        // ---------- StringBuilder (Mutable, Not thread-safe) ----------
        System.out.println("\n----- StringBuilder Methods -----");
        StringBuilder sbd = new StringBuilder("Hello");

        System.out.println("Original: " + sbd);
        sbd.append(" World");
        System.out.println("Append: " + sbd);
        sbd.insert(5, " Java");
        System.out.println("Insert: " + sbd);
        sbd.replace(6, 10, "Programming");
        System.out.println("Replace: " + sbd);
        sbd.delete(6, 17);
        System.out.println("Delete: " + sbd);
        sbd.reverse();
        System.out.println("Reverse: " + sbd);
        sbd.reverse();
        System.out.println("Capacity: " + sbd.capacity());
        System.out.println("Length: " + sbd.length());
    }
}
