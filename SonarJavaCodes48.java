import com.fasterxml.jackson.databind.ObjectMapper;

//[...]
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    String tainted = request.getParameter("value");
    String json = "{\"key\":\""+ tainted +"\"}";
    ObjectMapper obj = new ObjectMapper();
    try {
        obj.readValue(json, Object.class); // Noncompliant
    } catch (JsonProcessingException e) {
        response.sendError(400);
    }
}