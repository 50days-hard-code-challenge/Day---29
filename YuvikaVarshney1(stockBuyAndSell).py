def bestTimeToBuyAndSellStock(prices: [int]) -> int:
    # Write your code here.
	# Your code here
    n=len(prices)
    pro=0
    mini=prices[0]
    for i in range(1,n):
        cpro=prices[i]-mini
        pro=max(pro,cpro)
        mini=min(mini,prices[i])
    return pro
    """
    n = len(prices)

    # maxLength is used to store the maximum
    # length of a subarray whose sum = 'k'
    maxProfit = 0

    # start and end are the starting
    # and the ending indices of our current
    # subarray
    start = 0
    end = -1
    currentProfit = 0

    # Iterating over 'a'
    while start < n:

        # Increasing the right end
        # till our sum <= ‘k’ or we
        # are not out of bounds
        buy=prices[start]
        while (end + 1 < n):
            if prices[end+1]>buy:
                currentProfit = prices[end + 1]-buy
                if currentProfit > maxProfit:
                    maxProfit=currentProfit

            
            end += 1

        start += 1
        end=start+1
    return maxProfit
    """


    """
    n=len(prices)
    current_profit=0
    max_profit=0
    for i in range(n-1):
        buy=prices[i]
        for j in range(i+1,n):
            if(prices[j]>buy):
                current_profit=prices[j]-buy
                max_profit=current_profit if current_profit>max_profit else max_profit
    return max_profit"""

    pass
