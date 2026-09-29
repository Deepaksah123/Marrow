package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0013\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b"}, d2 = {"Lo/DatatypeFeatures;", "", "Lo/valueInstantiatorInstance;", "p0", "", "p1", "Lo/appendReferring;", "p2", "Lo/isAbstract;", "p3", "<init>", "(Lo/valueInstantiatorInstance;ILo/appendReferring;Lo/isAbstract;)V", "", "toString", "()Ljava/lang/String;", "read", "Lo/valueInstantiatorInstance;", "IconCompatParcelizer", "()Lo/valueInstantiatorInstance;", "RemoteActionCompatParcelizer", "I", "()I", "AudioAttributesCompatParcelizer", "Lo/appendReferring;", "()Lo/appendReferring;", "write", "Lo/isAbstract;", "()Lo/isAbstract;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DatatypeFeatures {
    private final appendReferring IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    private final valueInstantiatorInstance read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final isAbstract RemoteActionCompatParcelizer;

    public DatatypeFeatures(valueInstantiatorInstance valueinstantiatorinstance, int i, appendReferring appendreferring, isAbstract isabstract) {
        this.read = valueinstantiatorinstance;
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = appendreferring;
        this.RemoteActionCompatParcelizer = isabstract;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final valueInstantiatorInstance getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final appendReferring getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final isAbstract getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollCaptureCandidate(node=");
        sb.append(this.read);
        sb.append(", depth=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", viewportBoundsInWindow=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", coordinates=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
