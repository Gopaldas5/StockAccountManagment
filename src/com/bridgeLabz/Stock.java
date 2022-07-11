package com.bridgeLabz;

public class Stock {
    public String stockName;
    public int stockNumber;
    public double stockPrice;
    int totalSharePrice = 0;

    public Stock() {
    }

    public Stock(String stockName, int stockNumber, double stockPrice) {
        this.stockName = stockName;
        this.stockNumber = stockNumber;
        this.stockPrice = stockPrice;
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

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", stockNumber=" + stockNumber +
                ", stockPrice=" + stockPrice +
                '}';
    }
}
