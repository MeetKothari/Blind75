# 'Concepts!'

The hardest part about DSA for me is when to use what. So, hopefully, this process will help me get stronger in that aspect.

---

(1) The Java 'HashSet':
 - implemented using `import java.util.HashSet;`
 - instantiated using `HashSet<Object> hash = new HashSet<>();`
 - In Java, a HashSet is a collection that is used to store a set of unique elements. It is implemented using a hash table, which provides constant-time performance for the basic operations, such as adding, removing, and searching for elements.
 - The HashSet class in Java extends the AbstractSet class and implements the Set interface. Some of the key features and functionality of a HashSet include:
 - Unique elements: A HashSet can only contain unique elements. If you try to add a duplicate element to the set, it will not be added.
 - No order: A HashSet does not maintain any order of its elements. If you need to maintain the order of the elements, you should use a LinkedHashSet.
 - Fast operations: The basic operations of adding, removing, and searching for elements in a HashSet are very fast, and are typically O(1) on average.
 - Iteration: You can iterate over the elements of a HashSet using an iterator, or using a for-each loop.
 - Null elements: A HashSet can contain null elements.
 - Thread safety: HashSet is not synchronized, so it is not thread-safe. If you need thread-safe access to a set, you can use the Collections.synchronizedSet() method to create a synchronized set.

Overall, a HashSet provides a convenient way to store a set of unique elements with fast performance for basic operations. It is commonly used in many applications, such as for caching, as a lookup table, or for storing unique values in a data structure.

---

(2)- DFS Search:
