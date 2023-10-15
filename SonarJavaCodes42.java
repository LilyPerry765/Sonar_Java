public boolean validate(HttpServletRequest request) {
  String regex = request.getParameter("regex");
  String input = request.getParameter("input");

  return input.matches(regex);
}