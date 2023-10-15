//In a Spring-security web application the username leaks when:

//    The string used as argument of loadUserByUsername method is used in an exception message:

public String authenticate(String username, String password) {
  // ....
  MyUserDetailsService s1 = new MyUserDetailsService();
  MyUserPrincipal u1 = s1.loadUserByUsername(username);

  if(u1 == null) {
    throw new BadCredentialsException(username+" doesn't exist in our database"); // Sensitive
  }
  // ....
}
