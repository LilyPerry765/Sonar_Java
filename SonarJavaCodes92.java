//With JMustache by samskivert:

Mustache.compiler().escapeHTML(false).compile(template).execute(context); // Sensitive
Mustache.compiler().withEscaper(Escapers.NONE).compile(template).execute(context); // Sensitive

//With Freemarker:

freemarker.template.Configuration configuration = new freemarker.template.Configuration();
configuration.setAutoEscapingPolicy(DISABLE_AUTO_ESCAPING_POLICY); // Sensitive

