For DocumentBuilder, SAXParser and Schema and Transformer JAPX factories:

DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, false); // Noncompliant

SAXParserFactory factory = SAXParserFactory.newInstance();
factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, false); // Noncompliant

SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, false); // Noncompliant

TransformerFactory factory = javax.xml.transform.TransformerFactory.newInstance();
factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, false); // Noncompliant
--------------------------------------
For Dom4j library:

SAXReader xmlReader = new SAXReader();
xmlReader.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, false); // Noncompliant
--------------------------------------
For Jdom2 library:

SAXBuilder builder = new SAXBuilder();
builder.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, false);  // Noncompliant

