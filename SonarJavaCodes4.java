public class Example {

    static private String targetDirectory = "/example/directory/";

    public void ExtractEntry(ZipFile zipFile) throws IOException {

        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        ZipEntry entry = entries.nextElement();
        InputStream inputStream = zipFile.getInputStream(entry);

        File file = new File(targetDirectory + entry.getName());

        Files.copy(inputStream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}