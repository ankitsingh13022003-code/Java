public class OperatorsDemo {

    public static void main(String[] args) {

        int a = 10, b = 5;
        // 1. Arithmetic Operators (+, -, *, /, %)
        int sum = a + b;          // addition
        int diff = a - b;         // subtraction
        int prod = a * b;         // multiplication
        int div = a / b;          // division
        int mod = a % b;          // modulus (remainder)

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + diff);
        System.out.println("a * b = " + prod);
        System.out.println("a / b = " + div);
        System.out.println("a % b = " + mod);
        System.out.println("-------------------------------------");

        // 2. Assignment Operators (=, +=, -=, *=, /=, %=)
        int x = 10;
        x += 5;   // x = x + 5
        x -= 3;   // x = x - 3
        x *= 2;   // x = x * 2
        x /= 4;   // x = x / 4
        x %= 3;   // x = x % 3

        System.out.println("Assignment Operators:");
        System.out.println("Final value of x = " + x);
        System.out.println("-------------------------------------");


        // 3. Relational / Comparison Operators
        // (==, !=, >, <, >=, <=)
        System.out.println("Relational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("-------------------------------------");

        // 4. Logical Operators (&&, ||, !)
        boolean p = true, q = false;

        System.out.println("Logical Operators:");
        System.out.println("p && q = " + (p && q));  // AND
        System.out.println("p || q = " + (p || q));  // OR
        System.out.println("!p     = " + (!p));       // NOT
        System.out.println("-------------------------------------");

        // 5. Unary Operators (+, -, ++, --, !)
        int n = 5;

        System.out.println("Unary Operators:");
        System.out.println("n   = " + n);
        System.out.println("++n = " + (++n)); // pre-increment
        System.out.println("n++ = " + (n++)); // post-increment
        System.out.println("n   = " + n);
        System.out.println("--n = " + (--n)); // pre-decrement
        System.out.println("n-- = " + (n--)); // post-decrement
        System.out.println("n   = " + n);
        System.out.println("!p  = " + (!p));  // logical NOT
        System.out.println("-------------------------------------");

        // 6. Bitwise Operators (&, |, ^, ~, <<, >>, >>>)
        int m = 6;   // 110 in binary
        int k = 3;   // 011 in binary

        System.out.println("Bitwise Operators:");
        System.out.println("m & k  = " + (m & k));  // AND
        System.out.println("m | k  = " + (m | k));  // OR
        System.out.println("m ^ k  = " + (m ^ k));  // XOR
        System.out.println("~m     = " + (~m));     // NOT
        System.out.println("m << 1 = " + (m << 1)); // Left shift
        System.out.println("m >> 1 = " + (m >> 1)); // Right shift
        System.out.println("m >>> 1 = " + (m >>> 1)); // Unsigned right shift
        System.out.println("-------------------------------------");

        // 🔹 7. Ternary Operator ( ?: )
        int result = (a > b) ? a : b; // returns larger value

        System.out.println("Ternary Operator:");
        System.out.println("Greater value = " + result);
        System.out.println("-------------------------------------");

        String str = "Java";

        System.out.println("instanceof Operator:");
        System.out.println("str instanceof String: " + (str instanceof String));
        System.out.println("-------------------------------------");
    }
}
