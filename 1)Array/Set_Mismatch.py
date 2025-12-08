# Q1. Set Mismatch

# You have a set of integers s, which originally contains all the numbers from 1 to n.
# Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
# which results in repetition of one number and loss of another number.
# You are given an integer array nums representing the data status of this set after the error.
# Find the number that occurs twice and the number that is missing and return them in the form of an array.


# Example 1:
    # Input: nums = [1,2,2,4]
    # Output: [2,3]

# Example 2:
    # Input: nums = [1,1]
    # Output: [1,2]


nums = [1,2,2,4]
nums2 = [3,2,2]  # output[2,1]
nums3 = [2,2] #output = [2,1]
nums4 = [8,7,3,5,3,6,1,4] # output [3,2]

# HashMap Solution
def findErrorNums(nums):
    num_dict = {}
    duplicated= 0
    for i in nums:
        num_dict[i] = num_dict.get(i,0)+1
        if num_dict[i] > 1:
            duplicated = i

    print(num_dict)

    for i in range(1,len(nums)+1):
        if i not in num_dict:
            return duplicated, i

print(findErrorNums(nums4))



