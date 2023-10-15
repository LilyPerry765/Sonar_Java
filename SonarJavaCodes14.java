@RestController
public class ApiController
{
    @Autowired
    Connection connection;

    @GetMapping(value = "/authenticate")
    @ResponseBody
    public ResponseEntity<String> authenticate(
        @RequestParam("user") String user,
        @RequestParam("pass") String pass) throws SQLException
    {
        String query = "SELECT * FROM users WHERE user = '" + user + "' AND pass = '" + pass + "'";

        try (Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(query);

            if (!resultSet.next()) {
                return new ResponseEntity<>("Unauthorized", HttpStatus.UNAUTHORIZED);
            }
        }

        return new ResponseEntity<>("Authentication Success", HttpStatus.OK);
    }
}