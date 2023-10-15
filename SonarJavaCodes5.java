import org.codehaus.janino.ScriptEvaluator;

@Controller
public class ExampleController
{
    @GetMapping(value = "/")
    public void exec(@RequestParam("message") String message) throws IOException, InvocationTargetException {
        ScriptEvaluator se = new ScriptEvaluator();
        se.cook("System.out.println(\" + message \");");
        se.evaluate(null);
    }
}