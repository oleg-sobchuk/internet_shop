<!DOCTYPE html>
<html lang="en">
<#setting date_format="dd-MM-yyyy HH:mm:ss">
<head>
    <meta charset="UTF-8">
    <title>Update product</title>
</head>
<body>
<h1>Update product</h1>
<form name="product" action="/products/updateProduct" method="post">
    <p>Product id: ${product.id}</p>
    <input title="id" type="hidden" name="id" value="${product.id}">
    <p>Name</p>
    <input title="name" type="text" name="name" value="${product.name}">
    <p>Description</p>
    <input title="desc" type="text" name="desc" value="${product.desc}">

    <!-- Sending wrong data in format "MM/dd/yyyy HH:mm:ss"/-->
    <p>Adding date: ${product.dateAdd?string("dd-MM-yyyy HH:mm:ss")}</p>
    <input type="text" name="dateAdd" value="${product.dateAdd?string("dd/MM/yyyy HH:mm:ss")}">


    <p>Date of last update: ${product.dateUpdate?string("dd-MM-yyyy HH:mm:ss")}</p>
    <input type="text" name="dateUpdate" value="${product.dateUpdate?string("dd/MM/yyyy HH:mm:ss")}">
    <p>Added by: ${product.ownerName}</p>
    <input type="hidden" name="ownerName" value="${product.ownerName}">
    <input type="submit" value="OK">
</form>
<br>
</body>
</html>