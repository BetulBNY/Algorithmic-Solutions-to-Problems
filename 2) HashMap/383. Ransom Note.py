def canConstruct(ransomNote, magazine):
    charCount = {}
    for ch in magazine:
        if ch in charCount:
            charCount[ch] += 1
        else:
            charCount[ch] = 1
    for ch in ransomNote:
        if ch in charCount:
            if charCount[ch]>0:
                charCount[ch] -=1
            else:
                return False
        else:
            return False
    return True


ransomNote1 = "a"
magazine1 = "b"
print(canConstruct(ransomNote1, magazine1))
