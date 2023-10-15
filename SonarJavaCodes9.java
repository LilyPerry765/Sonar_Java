<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="e" uri="https://www.owasp.org/index.php/OWASP_Java_Encoder_Project" %>
<!doctype html>
<html>
 <body>
  <h1>${param.title}</h1>    <!-- Noncompliant -->
 </body>
</html>