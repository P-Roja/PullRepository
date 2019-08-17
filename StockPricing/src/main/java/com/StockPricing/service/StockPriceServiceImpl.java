package com.StockPricing.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockPricing.Dao.StockExchangeDao;
import com.StockPricing.Dao.StockPriceDao;
import com.StockPricing.model.Stock;
@Service
public class StockPriceServiceImpl implements StockPriceService{
	@Autowired
	private StockPriceDao stockPriceDao;
	@Override
	public void insertStockPrice(Stock stockPrice) throws SQLException {
		stockPriceDao.save(stockPrice);
		
	}

	@Override
	public Stock updateStockPrice(Stock stockPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stock> getStockPriceList() throws SQLException {
		// TODO Auto-generated method stub
		return stockPriceDao.findAll();
	}

}
