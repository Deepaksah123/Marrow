package kotlin;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
abstract class AuthorRSModel extends InputStream {
    protected final InputStream IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;

    AuthorRSModel(InputStream inputStream, int i) {
        this.IconCompatParcelizer = inputStream;
        this.RemoteActionCompatParcelizer = i;
    }

    final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    protected final void RemoteActionCompatParcelizer() {
        InputStream inputStream = this.IconCompatParcelizer;
        if (inputStream instanceof ResetBookmarkResponseBodyKt) {
            ((ResetBookmarkResponseBodyKt) inputStream).read(true);
        }
    }
}
