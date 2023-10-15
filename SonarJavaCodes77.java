ObjectMapper mapper = new ObjectMapper();
mapper.enableDefaultTyping(); // Sensitive
//------------------------------------------------
@JsonTypeInfo(use = Id.CLASS) // Sensitive
abstract class PhoneNumber {
}
