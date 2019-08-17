package com.StockPricing.service;

import java.sql.SQLException;
import java.util.List;

import com.StockPricing.model.Stock;


public interface StockPriceService {
	 public void insertStockPrice(Stock stockPrice) throws SQLException;
	    public Stock updateStockPrice(Stock stockPrice);
		public List<Stock> getStockPriceList() throws SQLException;
}
