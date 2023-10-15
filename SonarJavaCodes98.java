//Throwable.printStackTrace(...) prints a Throwable and its stack trace to System.Err (by default) which is not easily parseable and can expose sensitive information:

try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace(); // Sensitive
}

