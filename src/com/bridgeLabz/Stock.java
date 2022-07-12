package com.bridgeLabz;

public class Stock {
    public String stockName;
    public int shareNumber;
    public double sharePrice;
    int totalSharePrice = 0;

    public Stock() {
    }

    public Stock(String stockName, int shareNumber, double sharePrice) {
        this.stockName = stockName;
        this.shareNumber = shareNumber;
        this.sharePrice = sharePrice;
    }
    public void calculateSharePrice(int totalSharePrice){
        this.totalSharePrice = totalSharePrice;

    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getShareNumber() {
        return shareNumber;
    }

    public void setShareNumber(int shareNumber) {
        this.shareNumber = shareNumber;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "Stock :-{ " +
                "stockName = '" + stockName + '\'' +
                ", shareNumber = " + shareNumber +
                " , sharePrice = " + sharePrice +
                '}'+ " \n Total share price :- "+totalSharePrice;
    }
}
