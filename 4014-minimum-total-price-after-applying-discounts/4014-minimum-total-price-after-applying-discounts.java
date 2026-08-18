class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int l1 = prices.length-1;
        int l2 = discounts.length-1;

        double sum = 0;
        while(l1>=0 && l2>=0){
            sum += prices[l1] *(100.0 - discounts[l2]) / 100.0;
            l1--;
            l2--;
        }

        while(l1>=0){
            sum += prices[l1--];
        }
        return sum;
    }
}