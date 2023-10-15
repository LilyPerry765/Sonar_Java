@Controller
public class ExampleController
{
    @GetMapping(value = "/exec")
    public void exec(@RequestParam("command") String command) throws IOException {
        Runtime.getRuntime().exec(command);
    }
}