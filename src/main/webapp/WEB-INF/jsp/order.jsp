<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<?xml version="1.0" encoding="utf-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Cart Application</title>
</head>
<body>
    <h1>shopping cart</h1>
    <c:choose>
        <c:when test="${not empty addedProduct}">
            <table border="5">
                <tr>
                    <th>name</th>
                    <th>price</th>
                    <th>number</th>
                </tr>
                <c:forEach var="addedProduct" items="${addedProduct}">
                    <tr>
                        <td>${addedProduct.key.name}</td>
                        <td>${addedProduct.key.price}</td>
                        <td>${addedProduct.value}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            did not add any products
        </c:otherwise>
    </c:choose>
    <p>
        <a href="${flowExecutionUrl}&_eventId=backToProducts">view Products</a>
    </p>
</body>
</html>