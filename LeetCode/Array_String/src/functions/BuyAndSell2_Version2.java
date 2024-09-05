package functions;

public class BuyAndSell2_Version2 {
	
	public static int maxProfit(int[] prices) {
		if (prices.length == 1) {
			return 0;
		}
		int max = maxProfit(prices, prices.length-1, prices.length-2);
		return max;
	}
	
	public static int maxProfit(int[] prices, int sell, int buy) {
		System.out.println("Sell: " + sell + ", Buy: " + buy);
		int current_profit = -prices[buy] + prices[sell];
		if (current_profit < 0) {
			current_profit = 0;
		}
		if (buy <= 0) {
			return current_profit;
		}
		else {
			int consecutive = 0;
			if ((buy-2) >= 0) {
				int temp = current_profit + maxProfit(prices, buy-1, buy-2);
				if (temp > consecutive) {
					consecutive = temp;
				}
			}
			int sell_next = maxProfit(prices, sell-1, buy-1);
			int buy_next = maxProfit(prices, sell, buy-1); 
			if (consecutive >= buy_next && consecutive >= sell_next && consecutive > current_profit) {
				return consecutive;
			}
			else if (sell_next >= buy_next && sell_next >= consecutive && sell_next > current_profit) {
				return sell_next;
			}
			else if (buy_next >= sell_next && buy_next >= consecutive && buy_next > current_profit) {
				return buy_next;
			}
			else {
				return current_profit;
			}
		}
    }
	
	
	public static void main(String[] args) {
		int[] price1 = {7,1,5,3,6,4};
		System.out.println(maxProfit(price1));
		int[] price2 = {1,2,3,4,5};
		System.out.println(maxProfit(price2));
		int[] price3 = {7,6,4,3,1};
		System.out.println(maxProfit(price3));
		int[] price4 = {6,1,3,2,4,7};
		System.out.println(maxProfit(price4));
		int[] price5 = {3,2,6,5,0,3};
		System.out.println(maxProfit(price5));
		int[] price6 = {2,1,2,1,0,0,1};
		System.out.println(maxProfit(price6));


	}
}
