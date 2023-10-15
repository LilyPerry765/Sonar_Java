//For DocumentBuilder, SAXParser and Schema JAPX factories:

DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
factory.setValidating(true); // Noncompliant
factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", true); // Noncompliant

SAXParserFactory factory = SAXParserFactory.newInstance();
factory.setValidating(true); // Noncompliant
factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", true); // Noncompliant

SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
schemaFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", true); // Noncompliant
//----------------------------------
//For Dom4j library:

SAXReader xmlReader = new SAXReader(); // Noncompliant
xmlReader.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", true);  // Noncompliant
//----------------------------------
//For Jdom2 library:

SAXBuilder builder = new SAXBuilder();
builder.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", true); // Noncompliant