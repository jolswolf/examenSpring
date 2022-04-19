<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Index</title>
    </head>
    <body>
        <div class="container">
            <h1>Index</h1>
            <form:form action="/calcular" method="get" modelAttribute="medio">
                <div class="form-group">
                    <label for="input1">Valor 1</label>
                    <input type="text" class="form-control" id="input1" name="val1" placeholder="val1">
                </div>
                <div class="form-group">
                    <label for="input2">Valor 2</label>
                    <input type="text" class="form-control" id="input2" name="val2" placeholder="val2">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
            <div class"container">
                <span class="container font-weight-bold alert alert-warning fs-1">Resultado: ${message}</span>
            </div>
        </div>
    </body>
</html>