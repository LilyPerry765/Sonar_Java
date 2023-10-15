public class RequestProcessor {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    ServletInputStream servletIS = request.getInputStream();
    ObjectInputStream  objectIS  = new ObjectInputStream(servletIS);
    Object input                 = objectIS.readObject();
  }
}