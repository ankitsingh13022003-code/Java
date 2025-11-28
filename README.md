# ☕ Java Concepts & Fundamentals – Practice Repository

This repository contains my **Java fundamentals practice**, including all core concepts such as data types, operators, loops, conditional statements, OOP (Encapsulation, Inheritance, Polymorphism, Abstraction), arrays, strings, and more.

Each file demonstrates a specific Java topic with clean examples and proper explanations.

<br>

---

📚 Topics Covered <br>
 **1. Basics & Fundamentals**
- `Hello.java` – First Java program  
- `DataTypesDemo.java` – All Java primitive & non-primitive data types  
- `OperatorsDemo.java` – Arithmetic, relational, logical, bitwise, assignment, ternary, instanceof  

<br>

 **2. Control Statements**
- `ConditionalStatementsDemo.java` – if, if-else, else-if, switch  
- `ForLoopDemo.java` – for loop, reverse loop, enhanced for loop, nested loops  

<br>

**3. Arrays**
- `ArrayDemo.java` – 1D & 2D arrays, accessing elements, loops, initialization  

<br>

**4. Strings**
- `StringConceptsDemo.java` – String creation, immutability, methods, comparisons, split, join, valueOf  
 
<br>

**5. Object-Oriented Programming (OOP)**
- `EncapsulationDemo.java` – Encapsulation using getters & setters  
- `AbstractionDemo.java` – Abstract classes & methods  
- `InheritanceDemo.java` – Single, multilevel, hierarchical inheritance (all in one file)  
- `PolymorphismDemo.java` – Method overloading & overriding (compile-time & runtime polymorphism)

<br>

**6. ArrayList**

ArrayListDemo.java – Understanding ArrayList & its Inbuilt Methods

This program covers all important operations and methods of `ArrayList`:

- Creating an ArrayList  
- Adding elements using `add()` and `addAll()`  
- Accessing elements using `get()`  
- Updating values using `set()`  
- Removing elements using `remove()` and `clear()`  
- Checking presence using `contains()`  
- Checking list size using `size()`  
- Verifying if list is empty using `isEmpty()`  
- Searching elements using `indexOf()` and `lastIndexOf()`  
- Looping through elements (for loop, enhanced for loop, iterator)  
- Converting ArrayList to array using `toArray()`  
- Sorting using `Collections.sort()`  
- Reversing list using `Collections.reverse()`

<br>
7. LinkedList <br>

LinkedListDemo.java – Demonstrates all LinkedList operations including:

- add(), addFirst(), addLast(), offer()
- get(), getFirst(), getLast()
- set() for updating values
- remove(index), remove(Object), removeFirst(), removeLast()
- poll(), peek()
- contains(), size()

<br>
8. Stack <br>
Stack in Java

- Stack is a linear data structure that follows LIFO (Last In, First Out).
- Java provides Stack class in java.util package.
- Commonly used for:
  • Expression evaluation
  • Backtracking
  • Undo/Redo operations
  • Parenthesis matching
  • DFS algorithm

Important Methods:
- push(E item) → add element at top
- pop() → remove and return top element
- peek() → return top element (no remove)
- empty() / isEmpty() → check stack is empty
- search(Object o) → returns 1-based position from top
- size() → total elements


<br>

9. Set (HashSet, LinkedHashSet, TreeSet)

-This section covers the Java Set Interface and its commonly used implementations:

✔ HashSet

-Uses hashing

-No order

-Fast performance

-No duplicates

✔ LinkedHashSet

-Maintains insertion order

-No duplicates

-Slightly slower than HashSet

✔ TreeSet

-Stores elements in sorted (ascending) order

-Uses Red-Black Tree

-No duplicates

📌 Key Features of Set

-Does NOT allow duplicate elements

-Stores unique values

-Ideal for lookups, membership checks, and uniqueness constraints

📘 Code Included

-Basic Set creation

-Adding elements

-Removing elements

-Iterating through Set

-Checking contains(), isEmpty(), size()

<br>
10. Queue, PriorityQueue, Deque, ArrayDeque 
<br>
1️⃣ Queue (FIFO – First In First Out)

Interface in java.util

Elements are added at the back and removed from the front

Best implementation → LinkedList

Common Methods:

offer(element) → add

peek() → check head

poll() → remove head

2️⃣ PriorityQueue (Min-Heap by default)

Orders elements based on priority

Smallest element comes first (default behavior)

Not FIFO

Common Methods:

offer()

peek() → returns smallest

poll() → removes smallest

3️⃣ Deque (Double-Ended Queue)

Add/remove from both ends

Interface

Used for sliding window, LRU cache, stack + queue combo

Important Methods:

offerFirst() / offerLast()

peekFirst() / peekLast()

pollFirst() / pollLast()

4️⃣ ArrayDeque (Fastest Deque)

Better than LinkedList

No memory overhead

No null elements allowed

Methods Same as Deque:

offerFirst(), offerLast()

pollFirst(), pollLast()

peekFirst(), peekLast()


<br>
11. Map in Java

The Map interface stores data as key–value pairs, where keys are unique and values may repeat. It is one of the most powerful data structures in Java for fast lookups and real-world applications.

✔ Key Features

-Stores data as key → value

-Keys are unique

-Supports null values (except TreeMap & Hashtable)

-Fast lookups and insertions

-Used in caching, counting, searching, DB-like structures

✔ Important Methods

-put(key, value)

-get(key)

-remove(key)

-containsKey(key)

-containsValue(value)

-size()

-keySet()

-values()

-entrySet()

✔ Code Included

-HashMap example

-LinkedHashMap example

-TreeMap example

-Hashtable example

-Traversing using entrySet()

-Getting keys & values

