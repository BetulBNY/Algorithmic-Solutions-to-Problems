# Find All Numbers Disappeared in an Array
# Given an array nums of n integers where nums[i] is in the range [1, n],
# return an array of all the integers in the range [1, n] that do not appear in nums.

# Example 1:
# Input: nums = [4,3,2,7,8,2,3,1]
# Output: [5,6]

# Example 2:
# Input: nums = [1,1]
# Output: [2]

nums1 = [4,3,2,7,8,2,3,1]
nums2 = [1,1]

# SOLUTION 1:
# Time- Space Complexity O(n)
def findDisappearedNumbers(nums:list) -> list:
    n = len(nums)
    dis_list = []
    numi = set(nums)
    for i in range(1,n+1):
        if i not in numi:
            dis_list.append(i)
    return dis_list

print("Solution 1: ",findDisappearedNumbers(nums1))

# SOLUTION 2: (In place)
def findDisappearedNumbers2(nums:list) -> list:
    for num in nums:
        idx = abs(num) - 1
        if nums[idx] > 0:
            nums[idx] = -nums[idx]

    result = []
    for i in range(len(nums)):
        if nums[i] > 0:
            result.append(i+1)
    return result

print("Solution 2: ",findDisappearedNumbers2(nums1))
