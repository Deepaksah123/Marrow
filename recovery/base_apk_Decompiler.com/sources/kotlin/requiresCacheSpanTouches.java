package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u000b"}, d2 = {"Lo/requiresCacheSpanTouches;", "", "", "p0", "p1", "<init>", "(II)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class requiresCacheSpanTouches {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public requiresCacheSpanTouches(int i, int i2) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
    }

    public /* synthetic */ requiresCacheSpanTouches(int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public requiresCacheSpanTouches() {
        int i = 0;
        this(i, i, 3, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof requiresCacheSpanTouches)) {
            return false;
        }
        requiresCacheSpanTouches requirescachespantouches = (requiresCacheSpanTouches) p0;
        return this.RemoteActionCompatParcelizer == requirescachespantouches.RemoteActionCompatParcelizer && this.IconCompatParcelizer == requirescachespantouches.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("requiresCacheSpanTouches(RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", IconCompatParcelizer=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
