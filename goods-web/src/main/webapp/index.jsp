<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>添加商品</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/goods/add" method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <td>
                商品名：
            </td>
            <td>
                <input type="text" name="name"/>
            </td>
        </tr>
        <tr>
            <td>
                商品名：
            </td>
            <td>
                <input type="file" name="file">
            </td>
        </tr>
        <tr>
            <td>
                商品描述：
            </td>
            <td>
                <input type="text" name="description"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
