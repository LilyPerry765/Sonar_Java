@RestController
public class ApiController
{
    @Autowired
    QueryProducer queryProducer;

    @GetMapping(value = "/authenticate")
    @ResponseBody
    public ResponseEntity<String> authenticate(
        @RequestParam("user") String user,
        @RequestParam("pass") String pass)
    {
        String query = "SELECT * FROM users WHERE user = '" + user + "' AND pass = '" + pass + "'";

        try {
          queryProducer
            .createNativeQuery(query)
            .getSingleResult();

        } catch (Exception e) {
            return new ResponseEntity<>("Unauthorized", HttpStatus.UNAUTHORIZED);
        }

        return new ResponseEntity<>("Authentication Success", HttpStatus.OK);
    }
}