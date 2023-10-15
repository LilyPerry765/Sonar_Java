//If you create a security-sensitive cookie in your JAVA code:

Cookie c = new Cookie(COOKIENAME, sensitivedata);
c.setSecure(false);  // Sensitive: a security-ensitive cookie is created with the secure flag set to false
