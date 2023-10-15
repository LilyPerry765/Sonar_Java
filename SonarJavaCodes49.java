NodeList signatureElement = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");

XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
DOMValidateContext valContext = new DOMValidateContext(new KeyValueKeySelector(), signatureElement.item(0)); // Noncompliant
XMLSignature signature = fac.unmarshalXMLSignature(valContext);

boolean signatureValidity = signature.validate(valContext);