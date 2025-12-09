# How Many Numbers Are Smaller Than the Current Number
# Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
# That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

# Return the answer in an array.

# Example 1:
# Input: nums = [8,1,2,2,3]
# Output: [4,0,1,1,3]
# Explanation:
# For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
# For nums[1]=1 does not exist any smaller number than it.
# For nums[2]=2 there exist one smaller number than it (1).
# For nums[3]=2 there exist one smaller number than it (1).
# For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

# Example 2:
# Input: nums = [6,5,4,8]
# Output: [2,1,0,3]

# Example 3:
# Input: nums = [7,7,7,7]
# Output: [0,0,0,0]

nums1 = [8,1,2,2,3]
nums2 = [6,5,4,8]
nums3 = [7,7,7,7]

# Solution 1: Brute Force O(n²)
def smallerNumbersThanCurrent(nums:list) -> list :
    result = []
    count = 0
    for i in nums:
        for j in nums:
            if i > j:
                count += 1
        result.append(count)
        count = 0
    return result

# [1, 2, 2, 2, 3, 8]
print("1st solution:", smallerNumbersThanCurrent(nums1))


# Solution 2: (O(n log n))  Space O(n)

def smallerNumbersThanCurrent2(nums:list) -> list :
    new_dict = {}
    result_arr = []
    sorted_nums = nums[:]
    sorted_nums.sort()         # Or     sorted_nums = sorted(nums)

    for i, val in enumerate(sorted_nums):
        if val not in new_dict:
            new_dict[val] = i

    for num in nums:
        result_arr.append(new_dict[num])

    return result_arr

print("2nd Solution:",smallerNumbersThanCurrent2(nums1))