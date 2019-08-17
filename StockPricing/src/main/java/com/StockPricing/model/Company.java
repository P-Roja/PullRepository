package com.StockPricing.model;


import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="company")
public class Company {
	
	@Id
	@Column(name="company_code")
	private int companyCode;
	@Pattern(regexp = "^[ A-Za-z]+$", message = "Company Name should not contain numbers")
	@Size(max = 50, message = "Company Name should not exceed 50 characters")
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="turnover")
	private BigDecimal turnover;

	@Pattern(regexp = "^[ A-Za-z]+$", message = "CEO Name should not contain numbers")
	@Size(max = 50, message = "CEO Name should  not exceed 50 characters")
	
	@Column(name="ceo")
	private String ceo;
	
	@Column(name="board_of_director")
	@Pattern(regexp = "^[ A-Za-z]+$", message = "Board Of Directors Name should not contain numbers")
	@Size(max = 50, message = "Board Of Directors Name should  not exceed 50 characters")
	private String boardOfDirectors;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="sector_id")
	private Sector sector;
	
	
	
	@Column(name="brief_writeup")
	@Size(max = 200, message = "WriteUp  should  not exceed 200 characters")
	private String writeUp;
	
	/*@Column(name="stock_code")
	private int stockCode;*/

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	

	public BigDecimal getTurnover() {
		return turnover;
	}

	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}




	public String getWriteUp() {
		return writeUp;
	}

	public void setWriteUp(String writeUp) {
		this.writeUp = writeUp;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", turnover=" + turnover
				+ ", ceo=" + ceo + ", boardOfDirectors=" + boardOfDirectors + ", sector=" + sector + ", writeUp="
				+ writeUp + "]";
	}

	/*public int getStockCode() {
		return stockCode;
	}

	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
*/
	

}
