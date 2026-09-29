package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\f\u001a\u0004\u0018\u00010\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016\"\u0004\b\f\u0010\u0017"}, d2 = {"Lo/filterStartObject;", "", "Lo/rawReference;", "p0", "", "p1", "p2", "<init>", "(Lo/rawReference;ILjava/lang/Object;)V", "", "IconCompatParcelizer", "()Z", "RemoteActionCompatParcelizer", "Lo/rawReference;", "()Lo/rawReference;", "read", "I", "()I", "AudioAttributesCompatParcelizer", "(I)V", "write", "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class filterStartObject {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final rawReference IconCompatParcelizer;
    private int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Object RemoteActionCompatParcelizer;

    public filterStartObject(rawReference rawreference, int i, Object obj) {
        this.IconCompatParcelizer = rawreference;
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final rawReference getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.read = i;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Object getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.write(this.RemoteActionCompatParcelizer);
    }
}
