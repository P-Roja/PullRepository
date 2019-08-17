<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"   import="java.util.*,com.StockPricing.model.Company,com.StockPricing.model.StockExchange,com.StockPricing.model.Stock" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="Style/StockStyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Stock Price Insertion</title>
</head>
<body>

	<div class="topnav" id="myTopnav">
		<a href="ImportData.html">Import Data</a> <a href="#">Manage
			Company</a> <a href="#">Manage Exchange</a> <a href="#">Update IPO
			Details</a>
		<div id="navbar" style="float: right">
			<a id="anch" href="javascript:void(0)" class="btn btn-primary"
				target="_blank" href="#">Logout</a>


		</div>
		<a href="javascript:void(0);" class="icon" onclick="myFunction()">
			<i class="fa fa-bars"></i>
		</a>
	</div>

	<div id="content">

		<br>
		<br>
		<h4 align="center">Stock Price Insertion</h4>
		<br> <br>
		<table align="center" cellpadding="10">
		
		  

			<form:form action="insertStockPrice" method="post"
				modelAttribute="stockPrice" class="well form-horizontal">
					<tr>
				<%
										ArrayList companyDetails = (ArrayList) request.getAttribute("companyList");
											Iterator itr = companyDetails.iterator();
									%>
				
					<td>Company Id</td>
					<td><form:select path="company" class="form-control"
							maxlength="10" required="required">
							<option value="" disabled selected>Choose Company Id</option>
							<%
											
													while (itr.hasNext()) {
														Company company= (Company) itr.next();
														int companyCode= company.getCompanyCode();
														
										%>
										<option value="<%=companyCode %> ">
											<%=companyCode%></option>

										<%
											}
										%>

						</form:select></td>
				</tr> 
				<tr>
					<td>Current Price</td>
					<td><form:input name="" class="form-control" placeholder="Current Price"
							type="number" path="currentPrice" required="required" /> <small><form:errors
								path="currentPrice" cssClass="errormsg" /></small></td>
				</tr>
				<tr>
					<td>Date</td>
					<td><form:input name="" class="form-control"
							placeholder="Date" type="date"
							path="date" required="required" /> <small><form:errors
								path="date" cssClass="errormsg" /></small></td>
				</tr>
				<tr>
					<td>Time</td>
					<td><form:input name="" class="form-control"
							placeholder="Time" type="time" path="time"
							required="required" /> <small><form:errors
								path="time" cssClass="errormsg" /></small></td>
				</tr>

<tr>
				<%
										ArrayList stockExchangeDetails = (ArrayList) request.getAttribute("stockExchangeList");
											Iterator itr1 = stockExchangeDetails.iterator();
									%>
				
					<td>Company Id</td>
					<td><form:select path="stockExchange" class="form-control"
							maxlength="10" required="required">
							<option value="" disabled selected>Choose Stock Exchange Id</option>
							<%
											
													while (itr1.hasNext()) {
														StockExchange stockExchange= (StockExchange) itr1.next();
														int stockExchangeCode= stockExchange.getStockExchangeId();
														
										%>
										<option value="<%=stockExchangeCode %> ">
											<%=stockExchangeCode%></option>

										<%
											}
										%>

						</form:select></td>
				</tr> 

				<tr>
					<td></td>
					<td>
						<button type="submit" id="insertStockPrice" class="btn btn-project"
							name="insertStockPrice">Insert Stock Price</button>
					
					</td>
				</tr>
			</form:form>
		</table>

	</div>
	
</body>
</html>
