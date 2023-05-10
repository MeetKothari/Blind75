# Here are the steps we need to follow:

## Initialize the left and right pointers as the first and last indices of the array, respectively.
## While the left pointer is less than or equal to the right pointer:
  ### a. Calculate the middle index.
  ### b. If the value at the middle index is equal to the target, return the middle index.
  ### c. If the value at the middle index is greater than the target, move the right pointer to the left of the middle index.
  ### d. If the value at the middle index is less than the target, move the left pointer to the right of the middle index.
  ### If the target is not found, return -1.
