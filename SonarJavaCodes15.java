@RestController
public class ApiController
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping(value = "/authenticate")
    @ResponseBody
    public ResponseEntity<String> authenticate(
        @RequestParam("user") String user,
        @RequestParam("pass") String pass)
    {
        String query = "SELECT * FROM users WHERE user = '" + user + "' AND pass = '" + pass + "'";

        try {
            BeanPropertyRowMapper<User> userType = new BeanPropertyRowMapper(User.class);
            User queryResult = jdbcTemplate.queryForObject(query, userType);

        } catch (Exception e) {
            return new ResponseEntity<>("Unauthorized", HttpStatus.UNAUTHORIZED);
        }

        return new ResponseEntity<>("Authentication Success", HttpStatus.OK);
    }
}