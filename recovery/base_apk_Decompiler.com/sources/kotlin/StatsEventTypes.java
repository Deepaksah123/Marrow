package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0018\u0010\u001c"}, d2 = {"Lo/StatsEventTypes;", "", "", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ZZZZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "write", "read", "Z", "AudioAttributesCompatParcelizer", "()Z", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatsEventTypes {
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Integer write;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    private StatsEventTypes(String str, Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        this.IconCompatParcelizer = str;
        this.write = num;
        this.read = z;
        this.RemoteActionCompatParcelizer = z2;
        this.AudioAttributesCompatParcelizer = z3;
        this.MediaBrowserCompatItemReceiver = z4;
    }

    public /* synthetic */ StatsEventTypes(String str, Integer num, boolean z, boolean z2, boolean z3, boolean z4, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Integer getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public StatsEventTypes() {
        this(null, null, false, false, false, false, 63, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof StatsEventTypes)) {
            return false;
        }
        StatsEventTypes statsEventTypes = (StatsEventTypes) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) statsEventTypes.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, statsEventTypes.write) && this.read == statsEventTypes.read && this.RemoteActionCompatParcelizer == statsEventTypes.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == statsEventTypes.AudioAttributesCompatParcelizer && this.MediaBrowserCompatItemReceiver == statsEventTypes.MediaBrowserCompatItemReceiver;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.write;
        return (((((((((iHashCode * 31) + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        Integer num = this.write;
        boolean z = this.read;
        boolean z2 = this.RemoteActionCompatParcelizer;
        boolean z3 = this.AudioAttributesCompatParcelizer;
        boolean z4 = this.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("StatsEventTypes(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(num);
        sb.append(", read=");
        sb.append(z);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(z2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z3);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }
}
