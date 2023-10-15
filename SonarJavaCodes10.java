public void endpoint(HttpServletRequest request, HttpServletResponse response) throws IOException
{
    String data        = request.getParameter("input");
    PrintWriter writer = response.getWriter();

    writer.print(data);
}