public boolean authenticate(HttpServletRequest req, DirContext ctx) throws NamingException {
  String user = req.getParameter("user");
  String pass = req.getParameter("pass");

  String filter = "(&(uid=" + user + ")(userPassword=" + pass + "))";

  NamingEnumeration<SearchResult> results = ctx.search("ou=system", filter, new SearchControls());
  return results.hasMore();
}