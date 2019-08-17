<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.*,com.StockPricing.model.Stock"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="Style/StockStyle.css">

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" rel="stylesheet"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>

<div class="topnav" id="myTopnav">
   
<div id="navbar" style = "float:right">
  <h4 align="center">Stock Price List</h4>

  
</div>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>

<div  id="content">



<br><br><h4 align="center">Stock Price List</h4><br>



<%
List stockPriceList=(List)request.getAttribute("stockPriceList");

%>

 <table class="table">

  <tbody>
<tr>
<th class="text-center" >Stock Price Id</th>
<th>Company Code</th>
<th>Current Price</th>
<th>Date</th>
<!-- <th>CEO</th> -->
<th>Time</th>
<th>Edit</th>
</tr>

<% for(int i=0;i<stockPriceList.size();i++){
	Stock stock=(Stock) stockPriceList.get(i);
	%>
<tr>
<td align="center"><%= stock.getStockId() %></td>
<td><%= stock.getCompany().getCompanyCode() %></td>
<td><%= stock.getCurrentPrice() %></td>
<td><%= stock.getDate() %> 
<td><%= stock.getTime() %></td>
<td><a
										href="stockPriceUpdate?id=<%= stock.getStockId() %>"
										class="btn btn-info btn-lg">Update</a></td>
										
</tr>
<% }%>
 </tbody>
</table>
 
</div>

</body>
</html>


