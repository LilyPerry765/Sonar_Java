@Controller
public class ExampleController
{
    @GetMapping(value = "/exec")
    public void exec(@RequestParam("command") String command) throws IOException {

        CommandLine cmd = new CommandLine(command);
        DefaultExecutor executor = new DefaultExecutor();
        executor.execute(cmd);
    }
}