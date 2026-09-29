package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class onDownloadRemoved extends RuntimeException {
    private final List<String> read;

    public onDownloadRemoved() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.read = null;
    }
}
