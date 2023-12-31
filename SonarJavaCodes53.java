protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    Optional<Cookie> cookieOpt = Arrays.stream(request.getCookies())
                                    .filter(c -> c.getName().equals("jsessionid"))
                                    .findFirst();

    if (!cookieOpt.isPresent()) {
        String cookie = request.getParameter("cookie");
        Cookie cookieObj = new Cookie("jsessionid", cookie);
        response.addCookie(cookieObj);
    }

    response.sendRedirect("/welcome.jsp");
}