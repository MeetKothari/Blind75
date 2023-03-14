I solved this problem using the Boyer-Moore voting algorithm.

The Boyer-Moore voting algorithm is a linear time algorithm that is used to find the majority element in an array. The majority element is defined as the element that appears more than n/2 times in an array of size n.

The algorithm works by maintaining a count of the current candidate for the majority element. It initially sets the candidate to the first element and the count to 0. Then, it iterates through the array, incrementing the count if the current element is equal to the candidate or decrementing the count otherwise. If the count reaches 0, the algorithm sets the current element as the new candidate.

The intuition behind the algorithm is that if an element is the majority element, then it will have a net count of positive occurrences in the array. Therefore, if we maintain a count of the current candidate and cancel out all occurrences of other elements with it, the remaining count will be positive if the candidate is the majority element.

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

And my modified version of it for this problem was: 

```

class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int majority = 0;

        for (int i: nums){
            if (count == 0){
                majority = i;
            }

            count += (i == majority) ? 1 : -1;
        }

        return majority;
        
    }
}
```
