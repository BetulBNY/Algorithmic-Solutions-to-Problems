def wordPattern(pattern, s):
    """
    :type pattern: str
    :type s: str
    :rtype: bool
    """
    hashTable = {}
    sum = 0
    newS = s.split(" ")
    if len(pattern) != len(newS):
        return False
    for i, ch in enumerate(pattern):
        if ch not in hashTable:
            if newS[i] not in hashTable.values():
                hashTable[ch] = newS[i]
                sum += 1
                if sum == len(pattern):
                    return True
        else:
            if newS[i] == hashTable[ch]:
                # newch = dog
                newCh = hashTable[ch]
                newWord = newS[i]
                if newWord == newCh:
                    sum += 1
                    if sum == len(newS):
                        return True
    return False

pattern = "abba"
s = "dog dog dog dog"
print(wordPattern(pattern,s))

