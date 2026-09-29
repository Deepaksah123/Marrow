package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001e"}, d2 = {"Lo/getDefaultPropertyIgnorals;", "", "", "p0", "p1", "Lo/hasReferringProperties;", "p2", "p3", "p4", "Lo/resetWithShared;", "p5", "Lo/Module;", "p6", "<init>", "(JJJJJ[FLo/Module;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "J", "read", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "RemoteActionCompatParcelizer", "[F", "Lo/Module;", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDefaultPropertyIgnorals {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float[] AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Module AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long read;

    private getDefaultPropertyIgnorals(long j, long j2, long j3, long j4, long j5, float[] fArr, Module module) {
        this.read = j;
        this.write = j2;
        this.IconCompatParcelizer = j3;
        this.AudioAttributesCompatParcelizer = j4;
        this.RemoteActionCompatParcelizer = j5;
        this.AudioAttributesImplBaseParcelizer = fArr;
        this.AudioAttributesImplApi21Parcelizer = module;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        getDefaultPropertyIgnorals getdefaultpropertyignorals = (getDefaultPropertyIgnorals) p0;
        if (this.read != getdefaultpropertyignorals.read || this.write != getdefaultpropertyignorals.write || this.RemoteActionCompatParcelizer != getdefaultpropertyignorals.RemoteActionCompatParcelizer || !hasReferringProperties.write(this.IconCompatParcelizer, getdefaultpropertyignorals.IconCompatParcelizer) || !hasReferringProperties.write(this.AudioAttributesCompatParcelizer, getdefaultpropertyignorals.AudioAttributesCompatParcelizer)) {
            return false;
        }
        float[] fArr = this.AudioAttributesImplBaseParcelizer;
        float[] fArr2 = getdefaultpropertyignorals.AudioAttributesImplBaseParcelizer;
        if (fArr != null ? fArr2 != null && resetWithShared.IconCompatParcelizer(fArr, fArr2) : fArr2 == null) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, getdefaultpropertyignorals.AudioAttributesImplApi21Parcelizer);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.read);
        int iHashCode2 = Long.hashCode(this.write);
        int iHashCode3 = Long.hashCode(this.RemoteActionCompatParcelizer);
        int iRemoteActionCompatParcelizer = hasReferringProperties.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        int iRemoteActionCompatParcelizer2 = hasReferringProperties.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        float[] fArr = this.AudioAttributesImplBaseParcelizer;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iRemoteActionCompatParcelizer) * 31) + iRemoteActionCompatParcelizer2) * 31) + (fArr != null ? resetWithShared.AudioAttributesCompatParcelizer(fArr) : 0)) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode();
    }

    public /* synthetic */ getDefaultPropertyIgnorals(long j, long j2, long j3, long j4, long j5, float[] fArr, Module module, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, j4, j5, fArr, module);
    }
}
