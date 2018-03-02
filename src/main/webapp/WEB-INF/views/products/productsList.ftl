<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>MyShop products</title>
</head>
<body>
<h1>Products avaliable:</h1>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Description</th>
        <th>Added by</th>
        <th>Adding date</th>
        <th>Last update date</th>
    </tr>
    <#list products as product>
        <tr>
            <td><a href="/products/product/${product.id}">${product.id}</a></td>
            <td>${product.name}</td>
            <td>${product.desc}</td>
            <td>${product.ownerName}</td>
            <td>${product.dateAdd?string("dd-MM-yyyy HH:mm:ss")}</td>
            <td>${product.dateUpdate?string("dd-MM-yyyy HH:mm:ss")}</td>
            <td><a href="/products/delete/${product.id}">Delete</a> </td>
            <td><a href="/products/updateProduct/${product.id}">Update</a> </td>
        </tr>
    </#list>
</table>

<br>
<a href="addProduct">Add product</a>

</body>
</html>