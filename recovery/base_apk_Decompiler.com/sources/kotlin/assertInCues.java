package kotlin;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class assertInCues {
    public static assertInCues IconCompatParcelizer(Intent intent, JpegExtractor jpegExtractor) {
        jpegExtractor.read("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        jpegExtractor.read("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        jpegExtractor.read("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        return new ensureArrayCapacity(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
    }

    public abstract int AudioAttributesCompatParcelizer();

    public abstract long IconCompatParcelizer();

    public abstract long RemoteActionCompatParcelizer();

    public abstract int read();

    public abstract String write();
}
