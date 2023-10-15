protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    String location = req.getParameter("url");

    URL url = new URL(location);

    HttpURLConnection  conn = (HttpURLConnection) url.openConnection();
}