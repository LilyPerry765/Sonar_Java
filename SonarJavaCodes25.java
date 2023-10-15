protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long time = Long.parseLong(req.getParameter("time"));
        try {
            Thread.sleep(time); // Noncompliant
        } catch (InterruptedException e) {
            resp.sendError(500);
        }
    }