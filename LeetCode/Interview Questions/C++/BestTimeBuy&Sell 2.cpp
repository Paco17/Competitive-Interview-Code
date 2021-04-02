int maxProfit(vector<int>& prices) {
    unsigned int profit = 0;
    for (unsigned int i = 1; i < prices.size(); i++) {
        if (prices[i - 1] < prices[i]) {
            profit += prices[i] - prices[i - 1];
        }
    }
    return profit;
}