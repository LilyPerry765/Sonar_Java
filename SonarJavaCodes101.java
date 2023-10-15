//If you create a security-sensitive cookie in your JAVA code:

Cookie c = new Cookie(COOKIENAME, sensitivedata);
c.setHttpOnly(false);  // Sensitive: this sensitive cookie is created with the httponly flag set to false and so it can be stolen easily in case of XSS vulnerability

//By default the HttpOnly flag is set to false:

Cookie c = new Cookie(COOKIENAME, sensitivedata);  // Sensitive: this sensitive cookie is created with the httponly flag not defined (by default set to false) and so it can be stolen easily in case of XSS vulnerabilit