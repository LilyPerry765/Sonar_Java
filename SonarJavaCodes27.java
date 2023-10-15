// Signing:
io.jsonwebtoken.Jwts.builder() // Noncompliant, token is not signed.
  .setSubject(USER_LOGIN)
  .compact();
// Verifying:
io.jsonwebtoken.Jwts.parser().setSigningKey(SECRET_KEY).parse(token).getBody(); // Noncompliant
---------------------------------------------------
//Using auth0/Java JWT library:

// Signing:
com.auth0.jwt.JWT.create()
  .withSubject(SUBJECT)
  .sign(Algorithm.none()); // Noncompliant, use only strong cipher algorithms when signing this JWT.
// Verifying:
JWTVerifier nonCompliantVerifier = com.auth0.jwt.JWT.require(Algorithm.none()) // Noncompliant
  .withSubject(LOGIN)
  .build();
