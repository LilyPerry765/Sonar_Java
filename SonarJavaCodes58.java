@Controller
public class ExampleController
{
    @GetMapping(value = "/find")
    public void find(@RequestParam("filename") String filename) throws IOException {

        Runtime.getRuntime().exec("/usr/bin/find . -iname " + filename);
    }
}