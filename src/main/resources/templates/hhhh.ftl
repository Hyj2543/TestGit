<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table bgcolor="#dc143c">
    <th>deptno</th>
    <th>dname</th>
    <th>loc</th>
    <#list dept as d>
        <tr>
            <td>${d.deptno}</td>

            <td>${d.dname}</td>

            <td>${d.loc}</td>

        </tr>

    </#list>
</table>
</body>
</html>