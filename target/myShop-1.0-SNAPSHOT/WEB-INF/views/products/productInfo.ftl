<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product info</title>
</head>
<body>
<h1>Product information</h1>
<table border="1">
    <tr>
        <td>Id</td>
        <td>${product.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${product.name}</td>
    </tr>
    <tr>
        <td>Added by</td>
        <td>${product.ownerName}</td>
    </tr>
    <tr>
        <td>Adding date</td>
        <td>${product.dateAdd?string("dd/MM/yyyy HH:mm:ss")}</td>
    </tr>
    <tr>
        <td>Update date</td>
        <td>${product.dateUpdate?string("dd/MM/yyyy HH:mm:ss")}</td>
    </tr>
</table>
<form>
    <button formaction="/products/delete/${product.id}">Delete</button>
    <button formaction="/products/updateProduct/${product.id}">Update</button>
    <button formaction="/products/">Back to products</button>
</form>
</body>
</html>