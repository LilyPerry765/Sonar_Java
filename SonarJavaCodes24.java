public void encrypt(byte[] key, byte[] ptxt) {
    byte[] bytesIV = "7cVgr5cbdCZV".getBytes("UTF-8"); // The initialization vector is a static value

    GCMParameterSpec gcmSpec    = new GCMParameterSpec(128, nonce); // The initialization vector is configured here
    SecretKeySpec keySpec       = new SecretKeySpec(key, "AES");

    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
    cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv);  // Noncompliant
}