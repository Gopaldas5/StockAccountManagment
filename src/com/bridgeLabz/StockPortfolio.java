package com.bridgeLabz;

import org.w3c.dom.ls.LSOutput;

public class StockPortfolio {

    private int numOfStockNames = 0;
    private Stock[] stockArray;

    public StockPortfolio(){
        stockArray = new Stock[5];

    }
    public void addStockData(String stockName, int shareNumber, double sharePrice){
        stockArray[numOfStockNames] = new Stock(stockName, shareNumber,sharePrice);
        numOfStockNames++;
    }
    private void computeSharePriceData(){
        for (int i = 0; i < numOfStockNames; i++){
            stockArray[i].calculateSharePrice((int) this.computeSharePrice(stockArray[i]));
            System.out.println(stockArray[i]);
        }
    }
    public double computeSharePrice(Stock stock){
        double sharePriceResult = stock.shareNumber * stock.sharePrice;
        return sharePriceResult;
    }

    public static void main(String[] args) {
        StockPortfolio stockObj = new StockPortfolio();
        Stock stock = new Stock();

        stock.setStockName("TCS");
        stockObj.addStockData(stock.getStockName(), 20,100);

        stock.setStockName("BridgeLabz");
        stockObj.addStockData(stock.getStockName(), 10,100);

        stock.setStockName("Amazon");
        stockObj.addStockData(stock.getStockName(), 20,200);

         stockObj.computeSharePriceData();
    }

}
