
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>

<div class="container mt-5">
    <h1 class="text-center mb-4">Product List</h1>
    <hr>

    <table class="table table-striped table-bordered table-hover mx-auto" style="width: 70%;">
        <thead class="table-success text-center">
            <tr>
                <th>Product ID</th>
                <th>Model Name</th>
                <th>Brand</th>
                <th>Price</th>
                <th>Stock Quantity</th>
                <th>Features</th>
                <th>Warranty Period (months)</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="product">
                <tr class="text-center">
                    <td>${product.prodid}</td>
                    <td>${product.model_name}</td>
                    <td>${product.brand}</td>
                    <td>${product.price}</td>
                    <td>${product.stock_quantity}</td>
                    <td>${product.features}</td>
                    <td>${product.warranty_period}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<div class="d-grid gap-3 col-6 mx-auto mt-4">
        <a href="/success" class="btn btn-primary btn-lg">Go Back</a></div>
<!-- Bootstrap JS Bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
