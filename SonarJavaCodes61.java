private static final Logger logger = Logger.getLogger("Logger");

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

  String data = request.getParameter("data");
  if(data != null){
    logger.log(Level.INFO, "Data: {0} ", data);
  }
}