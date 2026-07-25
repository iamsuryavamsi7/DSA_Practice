package com.surya.dsa.arrays;

public class StockProblem {

    public static void getStockProblem(int[] targetArr){

        int profit = getStockProblemOptimized(targetArr);

        System.out.println("Max Profit: " + profit);

    }

    public static int getStockProblemBruteForce(int[] targetArr){

        // Variables
        int maxPrice = 0;
        int buy = 0;
        int sell = 0;

        // Business logic
        for(int i = 0; i < targetArr.length; i++){
            for(int j = i + 1; j < targetArr.length; j++){
                int currentProfit = targetArr[j] - targetArr[i];
                if (currentProfit > maxPrice) {
                    maxPrice = currentProfit;
                    buy = targetArr[i];
                    sell = targetArr[j];
                }
            }
        }

        System.out.println("Buy: " + buy + " : " + "Sell: " + sell);

        // Return object
        return maxPrice;

    }

    public static int getStockProblemOptimized(int[] targetArr){

        // Validation
        if(targetArr.length == 0) return 0;

        // Variables
        int maxProfit = 0;
        int minPrice = targetArr[0];
        int minPriceIndex = 0;

        int buyIndex = 0;
        int sellIndex = 0;

        // Business logic
        for(int i = 0; i < targetArr.length; i++){

            if(minPrice > targetArr[i]){
                minPrice = targetArr[i];
                minPriceIndex = i;
            }

            int currentPrice = targetArr[i] - minPrice;

            if(maxProfit < currentPrice){
                maxProfit = currentPrice;
                buyIndex = minPriceIndex;
                sellIndex = i;
            }

        }

        System.out.println("Buy: " + targetArr[buyIndex] + " : " + "Sell: " + targetArr[sellIndex]);

        // Return object
        return maxProfit;

    }

}
