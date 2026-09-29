package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011"}, d2 = {"Lo/getClosedCaptionTrackFormats;", "", "Lo/getChunkEndTimeUs;", "p0", "", "p1", "p2", "", "p3", "<init>", "(Lo/getChunkEndTimeUs;ZZLjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/getChunkEndTimeUs;", "()Lo/getChunkEndTimeUs;", "write", "AudioAttributesCompatParcelizer", "Z", "()Z", "read", "Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getClosedCaptionTrackFormats {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getChunkEndTimeUs write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    public getClosedCaptionTrackFormats(getChunkEndTimeUs getchunkendtimeus, boolean z, boolean z2, String str) {
        toMagicModuleMetaRepoModel.write(getchunkendtimeus, "");
        this.write = getchunkendtimeus;
        this.read = z;
        this.IconCompatParcelizer = z2;
        this.AudioAttributesCompatParcelizer = str;
    }

    public /* synthetic */ getClosedCaptionTrackFormats(getChunkEndTimeUs getchunkendtimeus, boolean z, boolean z2, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getchunkendtimeus, z, z2, (i & 8) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final getChunkEndTimeUs getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getClosedCaptionTrackFormats)) {
            return false;
        }
        getClosedCaptionTrackFormats getclosedcaptiontrackformats = (getClosedCaptionTrackFormats) p0;
        return this.write == getclosedcaptiontrackformats.write && this.read == getclosedcaptiontrackformats.read && this.IconCompatParcelizer == getclosedcaptiontrackformats.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getclosedcaptiontrackformats.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = Boolean.hashCode(this.read);
        int iHashCode3 = Boolean.hashCode(this.IconCompatParcelizer);
        String str = this.AudioAttributesCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        getChunkEndTimeUs getchunkendtimeus = this.write;
        boolean z = this.read;
        boolean z2 = this.IconCompatParcelizer;
        String str = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("getClosedCaptionTrackFormats(write=");
        sb.append(getchunkendtimeus);
        sb.append(", read=");
        sb.append(z);
        sb.append(", IconCompatParcelizer=");
        sb.append(z2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
