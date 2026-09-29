package kotlin;

import kotlin.IcyInfo1;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentFrame1 extends IcyInfo1 {
    private final int read;

    public CommentFrame1(int i, String str) {
        super(str);
        this.read = i;
    }

    public CommentFrame1(int i, String str, Throwable th) {
        super(str, th);
        this.read = i;
    }

    public CommentFrame1(String str, IcyInfo1.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(str, remoteActionCompatParcelizer);
        this.read = -1;
    }

    public CommentFrame1(int i, String str, IcyInfo1.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(str, remoteActionCompatParcelizer);
        this.read = i;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.read;
    }
}
