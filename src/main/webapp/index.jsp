<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Radix Converter</title>
    </head>
    <body>
        <div align="center">
            <h1>Base Conversion</h1>
            <form action="convert" method="post">
                Enter a number: <input type="number" name="dec" required />                                       
                <br><br>
                <label for="base"> Choose a base to convert to:</label>
                <select id="base" name="base">
                    <option value="h" name="1">Hexadecimal</option>
                    <option value="b" name="2">Binary</option>
                    <option value="o" name="3">Octal</option>
                </select>
                <br><br>
                <input type="submit" name="Submit"/>
            </form>
        </div></h1>
        </div>
    </body>
</html>
