import org.json.JSONObject;

public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    try {
        String tainted = request.getParameter("value");
        String json = "{\"key\":\""+ tainted +"\"}";
        JSONObject obj = new JSONObject(json); // Noncompliant
    } catch (JsonException e) {
        resp.sendError(400)
    }
}