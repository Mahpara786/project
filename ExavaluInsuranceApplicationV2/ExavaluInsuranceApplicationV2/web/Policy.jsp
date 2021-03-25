<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
    
<%@page import="exavalu.com.utilities.ConnectionProviderToDB"%>
<link href="css/policyTable_css.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<div class="table-responsive" id="sailorTableArea">
    <link rel="stylesheet" href="css/Policy_css.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha2/css/bootstrap.min.css" integrity="sha384-DhY6onE6f3zzKbjUPRc2hOzGAdEf4/Dz+WJwBvEYL/lkkIsI3ihufq9hk9K4lVoK" crossorigin="anonymous">        
    <table id="sailorTable" class="table table-striped table-bordered" width="100%">
 
        <nav class="navbar navbar-expand text-white bg-secondary">
            <div class="container-fluid">
                <div class ="table-responsive">
                    <h3>Policies </h4>
                </div>
            </div>
        </nav>
        
        <thead class="table table-success table-striped">
            <tr>
                <th>Serial No.</th>
                <th>Name</th>
                <th>Launch Date</th>
                <th>Expiry Date</th>
                <th>Coverage Amount</th>
                <th>Minimum Age</th>
                <th>Maximum Age</th>
            </tr>
        </thead>
        
        <%
            try {
                Connection connection = ConnectionProviderToDB.getConnectionObject().getConnection("C:\\Users\\HP\\Documents\\NetBeansProjects\\ExavaluInsuranceApplicationV2\\ExavaluInsuranceApplicationV2\\src\\java\\exavalu\\cofig\\db_params.properties");
                Statement statement = connection.createStatement();
                String sql = "select * from policy";
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
        %>
        <tr>
<!--            <td><button onclick="myfunction()">i</button>-->
<!--             <button onclick="myfunction()" id="myBtn">i</button>
             <span id =" dots">...</span>
             <span id="more">best Policy.</span>-->
             
<td><button class ="editbtn">&#128712</button><%=resultSet.getString("policy_id")%></td>
<td><%=resultSet.getString("policy_name")%></td>
<td><%=resultSet.getString("Launchdate")%></td>
            <td><%=resultSet.getString("Expdate")%></td>
            
            <td><%=resultSet.getString("coverage")%></td>
            <td><%=resultSet.getString("minAgeOffering")%></td>
            <td><%=resultSet.getString("maxAgeOffering")%></td>
           
        <tr class="more-info">
            <td colspan="4"><%=resultSet.getString("details")%></td>
        </tr>
            
        </tr>
        <%
                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>

    </table>
    </div>
