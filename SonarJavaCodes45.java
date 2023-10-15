import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    String xml = "<node id=\""+req.getParameter("id")+"\"></node>";

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    try {
        DocumentBuilder builder = factory.newDocumentBuilder();
        builder.parse(new InputSource(new StringReader(xml)); // Noncompliant
    } catch (ParserConfigurationException | SAXException e) {
        resp.sendError(400);
    }
}