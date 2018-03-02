<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add product</title>
</head>
<body>
<h1>Fillup form</h1>
<form name="product" action="/products/addProduct" method="post">
    <input type="hidden" name="id">
    <p>Name</p>
    <input title="Name" type="text" name="name">
    <p>Description</p>
    <textarea title="Description" name="desc"></textarea>
    <input type="hidden" name="dateAdd">
    <input type="hidden" name="dateUpdate">
    <input type="hidden" name="ownerName">
    <input type="submit" value="OK">
</form>
<br>
</body>
</html>