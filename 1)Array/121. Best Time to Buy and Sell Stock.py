def maxProfit(prices):
    """
    :type prices: List[int]
    :rtype: int
    """
    indexMin = 0
    indexMax = 0
    diffList = []
    minTemp = prices[0]
    maxTemp = 0
    if len(prices) < 2:
        return 0
    for i in range(len(prices)):
        if prices[i] < minTemp:
            minTemp = prices[i]
            indexMin = i
            if indexMax < indexMin:
                indexMax = indexMin
                maxTemp = 0
        elif maxTemp < prices[i] and minTemp < prices[i] and indexMin <= indexMax:
            maxTemp = prices[i]
            indexMax = i
            diffList.append(maxTemp - minTemp)
        else:
            continue
    if len(diffList) > 0:
        return max(diffList)
    else:
        return 0

prices = [2,1,2,1,0,1,2]
print(maxProfit(prices))
