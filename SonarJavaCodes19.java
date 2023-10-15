@Controller
public class ExampleController
{
    static private String targetDirectory = "/path/to/target/directory/";

    @GetMapping(value = "/delete")
    public void delete(@RequestParam("filename") String filename) throws IOException {

        File file = new File(targetDirectory + filename);
        file.delete();
    }
}