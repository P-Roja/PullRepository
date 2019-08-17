package com.StockPricing.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.StockPricing.model.Stock;
import com.StockPricing.model.StockExchange;
import com.StockPricing.service.CompanyService;
import com.StockPricing.service.StockExchangeService;
import com.StockPricing.service.StockPriceService;
@Controller
public class StockPriceController {
	@Autowired
	private StockPriceService stockPriceService;
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private StockExchangeService stockExchangeService;
	
	@RequestMapping("/insertStockPrice")
	public ModelAndView insertStockPrice(ModelMap map) throws SQLException {
		ModelAndView mav = null;
		map.addAttribute("stockPrice", new Stock());

		 ArrayList stockDetails =(ArrayList) stockExchangeService.getStockExchangeList();
		 map.addAttribute("stockExchangeList",stockDetails);
		 
		 
		 ArrayList companyDetails =(ArrayList) companyService.getCompanyList();
		 map.addAttribute("companyList",companyDetails);
		 
		 
		 
		mav = new ModelAndView("InsertStock");
		return mav;

	} 
	
	
	@RequestMapping(value = "/insertStockPrice", method = RequestMethod.POST)
	public ModelAndView insertStockPriceDetails( @ModelAttribute("stockPrice") @Valid Stock stockPrice, BindingResult result,
			HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
		ModelAndView mav = null;
		if (result.hasErrors()) {
			mav = new ModelAndView("InsertStock");
			return mav;
		}
		stockPriceService.insertStockPrice(stockPrice);
		 ArrayList stockPriceDetails =(ArrayList) stockPriceService.getStockPriceList();
		 map.addAttribute("stockPriceList",stockPriceDetails);
		mav = new ModelAndView("StockPriceList");
		return mav;

	}
	
	
	@RequestMapping(path="/stockPriceList")
	public ModelAndView getStockPriceList(ModelMap map) throws Exception {
		ModelAndView mav=new ModelAndView();
		ArrayList stockPriceDetails =(ArrayList) stockPriceService.getStockPriceList();
		 map.addAttribute("stockPriceList",stockPriceDetails);
		mav = new ModelAndView("StockPriceList");
		return mav;
	}
}
