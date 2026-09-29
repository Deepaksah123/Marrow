package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015"}, d2 = {"Lo/setTransitionState;", "", "Lo/switchToNext;", "p0", "p1", "p2", "p3", "p4", "<init>", "(JJJJJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "J", "()J", "write", "read", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTransitionState {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long write;
    private final long IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long read;

    private setTransitionState(long j, long j2, long j3, long j4, long j5) {
        this.write = j;
        this.AudioAttributesCompatParcelizer = j2;
        this.read = j3;
        this.RemoteActionCompatParcelizer = j4;
        this.IconCompatParcelizer = j5;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof setTransitionState)) {
            return false;
        }
        setTransitionState settransitionstate = (setTransitionState) p0;
        return switchToNext.RemoteActionCompatParcelizer(this.write, settransitionstate.write) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, settransitionstate.AudioAttributesCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.read, settransitionstate.read) && switchToNext.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, settransitionstate.RemoteActionCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, settransitionstate.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iMediaBrowserCompatItemReceiver = switchToNext.MediaBrowserCompatItemReceiver(this.write);
        int iMediaBrowserCompatItemReceiver2 = switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
        return (((((((iMediaBrowserCompatItemReceiver * 31) + iMediaBrowserCompatItemReceiver2) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.read)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.write));
        sb.append(", textColor=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer));
        sb.append(", iconColor=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.read));
        sb.append(", disabledTextColor=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer));
        sb.append(", disabledIconColor=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ setTransitionState(long j, long j2, long j3, long j4, long j5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, j4, j5);
    }
}
