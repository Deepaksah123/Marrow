package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class onSurfaceSizeChanged extends IOException {
    private final int AudioAttributesCompatParcelizer;

    public onSurfaceSizeChanged(int i) {
        this("Http request failed", i);
    }

    public onSurfaceSizeChanged(String str, int i) {
        this(str, i, null);
    }

    public onSurfaceSizeChanged(String str, int i, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", status code: ");
        sb.append(i);
        super(sb.toString(), th);
        this.AudioAttributesCompatParcelizer = i;
    }
}
