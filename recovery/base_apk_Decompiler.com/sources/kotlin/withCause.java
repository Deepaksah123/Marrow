package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u00020\u000b8\u0017@\u0016X\u0096\f¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\f\u001a\u00020\u00108\u0017@\u0016X\u0097\f¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u00020\u000b8\u0017@\u0016X\u0097\f¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\b\u0010\u000fR\u001c\u0010\u0013\u001a\u00020\u00108\u0017@\u0016X\u0097\f¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0014"}, d2 = {"Lo/withCause;", "Lo/wrapWithPath;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/iterator;", "AudioAttributesCompatParcelizer", "Lo/iterator;", "write", "()Lo/iterator;", "Lo/getKeyType;", "AudioAttributesImplBaseParcelizer", "Lo/getKeyType;", "read", "()Lo/getKeyType;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class withCause implements wrapWithPath {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private iterator write = new iterator();

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private getKeyType AudioAttributesCompatParcelizer = new getKeyType();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private iterator IconCompatParcelizer = new iterator();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getKeyType read = new getKeyType();

    public withCause(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // kotlin.wrapWithPath
    /* JADX INFO: renamed from: write, reason: from getter */
    public final iterator getWrite() {
        return this.write;
    }

    @Override // kotlin.wrapWithPath
    /* JADX INFO: renamed from: read, reason: from getter */
    public final getKeyType getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.wrapWithPath
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final iterator getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.wrapWithPath
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final getKeyType getRead() {
        return this.read;
    }

    public final String toString() {
        if (this.RemoteActionCompatParcelizer == null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("RectRulers(");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
