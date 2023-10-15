@RestController
public class ApiController
{
    @GetMapping(value = "/endpoint")
    public String endpoint(@RequestParam("input") input)
    {
        return input;
    }
}