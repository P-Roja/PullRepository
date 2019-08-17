package com.StockPricing.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StockPricing.model.Stock;
import com.StockPricing.model.StockExchange;

public interface StockPriceDao extends JpaRepository<Stock, Integer> {

}
