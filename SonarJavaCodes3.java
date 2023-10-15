//For DocumentBuilder, SAXParser, XMLInput, Transformer and Schema JAPX factories:

factory.setXIncludeAware(true); // Noncompliant
// or
factory.setFeature("http://apache.org/xml/features/xinclude", true); // Noncompliant


