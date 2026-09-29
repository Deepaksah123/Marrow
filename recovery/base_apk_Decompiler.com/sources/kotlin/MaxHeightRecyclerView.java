package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class MaxHeightRecyclerView extends IOException {
    private Throwable AudioAttributesCompatParcelizer;

    public MaxHeightRecyclerView(String str) {
        super(str);
    }

    public MaxHeightRecyclerView(String str, Throwable th) {
        super(str);
        this.AudioAttributesCompatParcelizer = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.AudioAttributesCompatParcelizer;
    }
}
