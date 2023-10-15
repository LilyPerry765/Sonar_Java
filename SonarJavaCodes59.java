@Controller
public class ExampleController
{
    @GetMapping(value = "/find")
    public void find(@RequestParam("filename") String filename) throws IOException {

        CommandLine cmd = new CommandLine("/usr/bin/find . -iname " + filename);
    }
}