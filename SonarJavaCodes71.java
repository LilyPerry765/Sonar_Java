import android.content.Context;

public class AccessExternalFiles {

    public void accessFiles(Context context) {
        context.getExternalFilesDir(null); // Sensitive
    }
}