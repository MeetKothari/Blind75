# 'Concepts!'

✍️ The hardest part about DSA for me is when to use what. So, hopefully, this process will help me get stronger in that aspect.

---

# Data Structures

⭐ The Java 'HashSet':
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

# Algorithms

⭐ The Boyer-Moore voting algorithm is a linear time algorithm that is used to find the majority element in an array. The majority element is defined as the element that appears more than n/2 times in an array of size n.

The algorithm works by maintaining a count of the current candidate for the majority element. It initially sets the candidate to the first element and the count to 0. Then, it iterates through the array, incrementing the count if the current element is equal to the candidate or decrementing the count otherwise. If the count reaches 0, the algorithm sets the current element as the new candidate.

The intuition behind the algorithm is that if an element is the majority element, then it will have a net count of positive occurrences in the array. Therefore, if we maintain a count of the current candidate and cancel out all occurrences of other elements with it, the remaining count will be positive if the candidate is the majority element.

In the code, nums is the input array of integers. The algorithm initializes the candidate and count variables to the first element and 0, respectively. It then iterates through the array, incrementing the count if the current element is equal to the candidate or decrementing the count otherwise. If the count reaches 0, the algorithm sets the current element as the new candidate. Finally, it returns the candidate as the majority element.

The Boyer-Moore voting algorithm has a time complexity of O(n) and a space complexity of O(1), which makes it a very efficient algorithm for finding the majority element in an array.

Here's the pseudocode for the Boyer-Moore voting algorithm:

```
candidate = nums[0]
count = 0

for num in nums:
    if count == 0:
        candidate = num
    count += (num == candidate) ? 1 : -1

return candidate

```

---

⭐ DFS Search:

Imagine you're trying to find your way through a maze. You start at one point and you want to get to the end of the maze. How do you do it? One way is to use DFS. Here's how it works:

- You start at the beginning of the maze.

- You look at all the paths you can take from that point. You pick one of the paths and follow it as far as you can go.

- When you get to a dead end (a path with no more branches), you backtrack to the last point where you had a choice of paths.

- You pick a different path that you haven't explored yet, and you follow that path as far as you can go.

- You keep doing this until you reach the end of the maze.

- DFS works by exploring one path as far as it can go before backtracking and trying a different path. This can be very useful in algorithms because it can help us find solutions to problems where we need to explore many different paths.

- For example, if we're trying to find the shortest path between two points in a graph, we can use DFS to explore all the possible paths between the two points and find the shortest one.

- DFS can be a bit slow in some cases, but it's a very powerful tool for solving many different types of problems.

- (LC Problems that should sound the alarm bells): Flood Fill

--- 

⭐ Kind of similar LC problems:

👉 Valid Anagram and Ransome Note

- Both the solution for the Ransom Note problem and the Valid Anagram problem use a counting approach to compare the characters in two strings.

- In both solutions, we use an array to count the number of times each character appears in the strings. In the Valid Anagram problem, we subtract the ASCII value of 'a' from each character to get an index in the array, while in the Ransom Note problem, we use the character itself as an index in the array.

- After we have counted the characters in each string, we compare the counts in the two arrays to see if they are the same (Valid Anagram problem) or if we have enough of each character in the first string to construct the second string (Ransom Note problem).

- Both problems are solved with a time complexity of O(n), where n is the length of the longer of the two input strings. Additionally, both solutions do not use any sorting or other complex operations, making them simple and efficient.
