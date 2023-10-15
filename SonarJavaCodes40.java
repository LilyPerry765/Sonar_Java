public void encrypt(String key, String plainText) throws GeneralSecurityException {
    byte[] bytesIV = "7cVgr5cbdCZVw5WY".getBytes(StandardCharsets.UTF_8); // secondary

    GCMParameterSpec iv = new GCMParameterSpec(128,bytesIV);  // secondary
    SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES");

    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
    cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv); // Noncompliant
  }