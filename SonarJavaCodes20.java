static private String targetDirectory = "/Users/John";

@GetMapping(value = "/endpoint")
public void endpoint(@RequestParam("folder") fileName) throws IOException {

    String canonicalizedFileName = fileName.getCanonicalPath();

    if (!canonicalizedFileName .startsWith(targetDirectory)) {
        throw new IOException("Entry is outside of the target directory");
    }
}