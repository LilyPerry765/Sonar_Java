Cipher.getInstance("AES"); // Noncompliant: by default ECB mode is chosen
Cipher.getInstance("AES/ECB/NoPadding"); // Noncompliant: ECB doesn't provide serious message confidentiality

Cipher.getInstance("AES/CBC/PKCS5Padding"); // Noncompliant: Vulnerable to Padding Oracle attacks

Cipher.getInstance("RSA/None/NoPadding"); // Noncompliant: RSA without OAEP padding scheme is not recommended

