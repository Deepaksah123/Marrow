package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0003R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/handleTypePropertyValue;", "", "<init>", "()V", "", "p0", "", "read", "(Ljava/lang/Throwable;)V", "Ljava/lang/Throwable;", "AudioAttributesCompatParcelizer", "write", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class handleTypePropertyValue {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Throwable AudioAttributesCompatParcelizer;
    private final Object write = new Object();

    public final void read(Throwable p0) {
        synchronized (this.write) {
            this.AudioAttributesCompatParcelizer = p0;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void read() {
        synchronized (this.write) {
            Throwable th = this.AudioAttributesCompatParcelizer;
            if (th != null) {
                this.AudioAttributesCompatParcelizer = null;
                throw th;
            }
        }
    }
}
