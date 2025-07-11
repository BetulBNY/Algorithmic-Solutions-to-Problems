def lengthOfLastWord(s):
    """
    :type s: str
    :rtype: int
    """
    s = s.rstrip()
    sum = 0
    for i in range(len(s)-1, -1, -1):
        if s[i] == " ":
            return sum
        else:
            print(s[i])
            sum += 1
            continue
    return sum


s ="Hello World"
s1 = "   fly me   to   the moon  "
s2 = "a"
print(lengthOfLastWord(s2))

"""
s = "betül"
for i in range(len(s)-1, -1, -1): // start, stop, step size
    print(i, s[i])
"""