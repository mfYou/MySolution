public class BestTimeToBuy {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int len = prices.length;
        int i = 0;
        int sig = 1;
        int low = 0;
        int high = 0;
        while (i<len){
            if (sig==1&&i+1<len&&prices[i+1]>prices[i]){
                low = prices[i];
                sig = 0;
                i++;
            }if (sig==0&&i+1<len&&prices[i+1]<prices[i]){
                high = prices[i];
                sig=1;
                i++;
                int temp = high-low;
                profit+=temp;
            }else if (sig==0&&i+1==len){
                high = prices[i];
                sig=1;
                i++;
                int temp = high-low;
                profit+=temp;
            }else{
                i++;
            }
        }
        return profit;
    }
}
