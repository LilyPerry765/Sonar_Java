import com.google.gson.Gson;

//[...]
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    String tainted = request.getParameter("value");
    String json = "{\"key\":\""+ tainted +"\"}";
    Gson obj = new Gson();
    obj.fromJson(json, Object.class); // Noncompliant
}