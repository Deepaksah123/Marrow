package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015"}, d2 = {"Lo/component6;", "", "Lo/switchToNext;", "p0", "p1", "p2", "p3", "<init>", "(JJJJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "()J", "read", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class component6 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    private component6(long j, long j2, long j3, long j4) {
        this.read = j;
        this.RemoteActionCompatParcelizer = j2;
        this.AudioAttributesCompatParcelizer = j3;
        this.IconCompatParcelizer = j4;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ component6(long j, long j2, long j3, long j4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, j4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof component6)) {
            return false;
        }
        component6 component6Var = (component6) p0;
        return switchToNext.RemoteActionCompatParcelizer(this.read, component6Var.read) && switchToNext.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, component6Var.RemoteActionCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, component6Var.AudioAttributesCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, component6Var.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((switchToNext.MediaBrowserCompatItemReceiver(this.read) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
    }

    public final String toString() {
        String strAudioAttributesImplApi26Parcelizer = switchToNext.AudioAttributesImplApi26Parcelizer(this.read);
        String strAudioAttributesImplApi26Parcelizer2 = switchToNext.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer);
        String strAudioAttributesImplApi26Parcelizer3 = switchToNext.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer);
        String strAudioAttributesImplApi26Parcelizer4 = switchToNext.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
        StringBuilder sb = new StringBuilder("component6(read=");
        sb.append(strAudioAttributesImplApi26Parcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(strAudioAttributesImplApi26Parcelizer2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(strAudioAttributesImplApi26Parcelizer3);
        sb.append(", IconCompatParcelizer=");
        sb.append(strAudioAttributesImplApi26Parcelizer4);
        sb.append(")");
        return sb.toString();
    }
}
