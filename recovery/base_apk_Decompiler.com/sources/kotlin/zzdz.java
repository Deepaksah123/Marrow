package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0011\u0010\"\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010\u001b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u001e\u0010$R\u0014\u0010&\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010!R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b&\u0010)R\u001c\u0010%\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001d\u0010-R\u001a\u0010\u001e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b'\u0010$R\u001a\u0010'\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001a"}, d2 = {"Lo/zzdz;", "", "", "p0", "p1", "", "p2", "", "p3", "p4", "", "Lo/PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException;", "p5", "Lo/PublicKeyCredentialRpEntity;", "p6", "p7", "p8", "p9", "p10", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZILjava/util/List;Lo/PublicKeyCredentialRpEntity;ZZLjava/lang/String;Ljava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "write", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "I", "RemoteActionCompatParcelizer", "Z", "()Z", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Ljava/util/List;", "()Ljava/util/List;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "Lo/PublicKeyCredentialRpEntity;", "()Lo/PublicKeyCredentialRpEntity;", "MediaDescriptionCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zzdz {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final PublicKeyCredentialRpEntity AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String MediaDescriptionCompat;

    public zzdz(String str, String str2, int i, boolean z, int i2, List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> list, PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, boolean z2, boolean z3, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = i;
        this.read = z;
        this.IconCompatParcelizer = i2;
        this.AudioAttributesImplApi26Parcelizer = list;
        this.AudioAttributesImplBaseParcelizer = publicKeyCredentialRpEntity;
        this.MediaBrowserCompatCustomActionResultReceiver = z2;
        this.AudioAttributesImplApi21Parcelizer = z3;
        this.MediaBrowserCompatItemReceiver = str3;
        this.MediaDescriptionCompat = str4;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final PublicKeyCredentialRpEntity getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof zzdz)) {
            return false;
        }
        zzdz zzdzVar = (zzdz) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) zzdzVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) zzdzVar.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer == zzdzVar.RemoteActionCompatParcelizer && this.read == zzdzVar.read && this.IconCompatParcelizer == zzdzVar.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, zzdzVar.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, zzdzVar.AudioAttributesImplBaseParcelizer) && this.MediaBrowserCompatCustomActionResultReceiver == zzdzVar.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi21Parcelizer == zzdzVar.AudioAttributesImplApi21Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) zzdzVar.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) zzdzVar.MediaDescriptionCompat);
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode3 = Integer.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode4 = Boolean.hashCode(this.read);
        int iHashCode5 = Integer.hashCode(this.IconCompatParcelizer);
        int iHashCode6 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.AudioAttributesImplBaseParcelizer;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (publicKeyCredentialRpEntity == null ? 0 : publicKeyCredentialRpEntity.hashCode())) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.AudioAttributesCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        boolean z = this.read;
        int i2 = this.IconCompatParcelizer;
        List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> list = this.AudioAttributesImplApi26Parcelizer;
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.AudioAttributesImplBaseParcelizer;
        boolean z2 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z3 = this.AudioAttributesImplApi21Parcelizer;
        String str3 = this.MediaBrowserCompatItemReceiver;
        String str4 = this.MediaDescriptionCompat;
        StringBuilder sb = new StringBuilder("zzdz(write=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", read=");
        sb.append(z);
        sb.append(", IconCompatParcelizer=");
        sb.append(i2);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(list);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(publicKeyCredentialRpEntity);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(z2);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(z3);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(str3);
        sb.append(", MediaDescriptionCompat=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
