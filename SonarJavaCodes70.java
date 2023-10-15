//These clients from Apache commons net libraries are based on unencrypted protocols and are not recommended:

TelnetClient telnet = new TelnetClient(); // Sensitive

FTPClient ftpClient = new FTPClient(); // Sensitive

SMTPClient smtpClient = new SMTPClient(); // Sensitive
//--------------------------------------------------
//Unencrypted HTTP connections, when using okhttp library for instance, should be avoided:

ConnectionSpec spec = new ConnectionSpec.Builder(ConnectionSpec.CLEARTEXT) // Sensitive
  .build();
//--------------------------------------------------
/*Android WebView can be configured to allow a secure origin to load content from any other origin, even if that origin is insecure (mixed content):*/

import android.webkit.WebView

WebView webView = findViewById(R.id.webview)
webView.getSettings().setMixedContentMode(MIXED_CONTENT_ALWAYS_ALLOW); // Sensitive

