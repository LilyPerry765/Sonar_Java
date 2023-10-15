public boolean authenticate(HttpServletRequest req, XPath xpath, Document doc) throws XPathExpressionException {
  String user = request.getParameter("user");
  String pass = request.getParameter("pass");

  String expression = "/users/user[@name='" + user + "' and @pass='" + pass + "']";

  return (boolean)xpath.evaluate(expression, doc, XPathConstants.BOOLEAN);
}