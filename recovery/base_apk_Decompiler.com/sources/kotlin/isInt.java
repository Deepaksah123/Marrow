package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\b\u001a\u00020\u000b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\n\u0010\u000f"}, d2 = {"Lo/isInt;", "Lo/isObject;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "read", "Lo/wrapWithPath;", "AudioAttributesCompatParcelizer", "Lo/wrapWithPath;", "IconCompatParcelizer", "()Lo/wrapWithPath;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class isInt implements isObject {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final wrapWithPath RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final wrapWithPath write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    public isInt(String str) {
        this.read = str;
        this.RemoteActionCompatParcelizer = getDescription.IconCompatParcelizer(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" maximum");
        this.write = getDescription.IconCompatParcelizer(sb.toString());
    }

    @Override // kotlin.isObject
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final wrapWithPath getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.isObject
    /* JADX INFO: renamed from: read, reason: from getter */
    public final wrapWithPath getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getRead() {
        return this.read;
    }
}
