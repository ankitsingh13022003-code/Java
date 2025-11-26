public class StringConceptsDemo {

    public static void main(String[] args) {

        // 1. String Creation (Literal vs new keyword)
        String s1 = "Java";                // stored in String Pool
        String s2 = "Java";                // refers to same object
        String s3 = new String("Java");    // stored in Heap (new object)

        System.out.println("s1 == s2 : " + (s1 == s2));   // true (same pool object)
        System.out.println("s1 == s3 : " + (s1 == s3));   // false (different objects)
        System.out.println("-------------------------------------");


        // 2. String is Immutable
        String str = "Hello";
        str.concat(" World");    // does NOT change original string
        System.out.println("Immutable Example: " + str); // still "Hello"

        // To change, we must assign to a new String
        str = str.concat(" World");
        System.out.println("After Proper Concatenation: " + str);
        System.out.println("-------------------------------------");

        // 3. Important String Methods
        String text = "  Java Programming  ";

        System.out.println("Length: " + text.length());          // counts characters
        System.out.println("Trim: '" + text.trim() + "'");        // removes spaces
        System.out.println("Uppercase: " + text.toUpperCase());  // uppercase
        System.out.println("Lowercase: " + text.toLowerCase());  // lowercase

        System.out.println("CharAt(2): " + text.charAt(2));       // char at index

        System.out.println("Substring(2, 6): " + text.substring(2, 6)); // Java

        System.out.println("Replace: " + text.replace("Java", "Python"));

        System.out.println("StartsWith 'Java': " + text.trim().startsWith("Java"));
        System.out.println("EndsWith 'ing': " + text.trim().endsWith("ing"));

        System.out.println("IndexOf 'a': " + text.indexOf('a'));         // first index
        System.out.println("LastIndexOf 'a': " + text.lastIndexOf('a')); // last index

        System.out.println("Contains 'Program': " + text.contains("Program"));
        System.out.println("-------------------------------------");


        // 4. String Comparison Methods
        String a = "hello";
        String b = "Hello";

        System.out.println("Equals: " + a.equals(b));                      // false
        System.out.println("EqualsIgnoreCase: " + a.equalsIgnoreCase(b));  // true
        System.out.println("CompareTo: " + a.compareTo(b));                // ASCII diff
        System.out.println("-------------------------------------");

        // 5. Splitting String
        String csv = "apple,banana,grapes,orange";

        String[] fruits = csv.split(",");   // split by comma

        System.out.println("Splitting String:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("-------------------------------------");

        // 6. String Joining
        String joined = String.join(" - ", "Java", "Python", "C++");
        System.out.println("Joined String: " + joined);
        System.out.println("-------------------------------------");

        // 7. Converting Other Types to String
        int num = 100;
        String numStr = String.valueOf(num);

        System.out.println("ValueOf Example: " + numStr + 50); // concatenation
        System.out.println("-------------------------------------");


        // 8. Mutable Alternatives: StringBuilder & StringBuffer
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");       // modifies same object
        System.out.println("StringBuilder: " + sb);

        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        System.out.println("StringBuffer: " + sbf);
    }
}
