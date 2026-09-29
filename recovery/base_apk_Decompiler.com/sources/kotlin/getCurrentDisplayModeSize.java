package kotlin;

import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\"\u0010\u0016R\u001a\u0010%\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u0019\u0010$R\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b!\u0010\u0018R\u001a\u0010&\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b\u001f\u0010\u0016R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b&\u0010("}, d2 = {"Lo/getCurrentDisplayModeSize;", "", "", "p0", "", "p1", "p2", "p3", "p4", "", "p5", "p6", "p7", "", "Lo/getCountryCode;", "p8", "<init>", "(Ljava/lang/String;IIIIDLjava/lang/String;ILjava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "I", "write", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "read", "AudioAttributesImplApi21Parcelizer", "D", "()D", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getCurrentDisplayModeSize {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final List<getCountryCode> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final double MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public getCurrentDisplayModeSize(String str, int i, int i2, int i3, int i4, double d, String str2, int i5, List<getCountryCode> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = i;
        this.read = i2;
        this.IconCompatParcelizer = i3;
        this.AudioAttributesCompatParcelizer = i4;
        this.MediaBrowserCompatCustomActionResultReceiver = d;
        this.AudioAttributesImplApi26Parcelizer = str2;
        this.AudioAttributesImplBaseParcelizer = i5;
        this.MediaBrowserCompatItemReceiver = list;
    }

    public /* synthetic */ getCurrentDisplayModeSize(String str, int i, int i2, int i3, int i4, double d, String str2, int i5, List list, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0.0d : d, (i6 & 64) != 0 ? "" : str2, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final double getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<getCountryCode> AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public getCurrentDisplayModeSize() {
        this(null, 0, 0, 0, 0, 0.0d, null, 0, null, UnixStat.DEFAULT_LINK_PERM, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getCurrentDisplayModeSize)) {
            return false;
        }
        getCurrentDisplayModeSize getcurrentdisplaymodesize = (getCurrentDisplayModeSize) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getcurrentdisplaymodesize.RemoteActionCompatParcelizer) && this.write == getcurrentdisplaymodesize.write && this.read == getcurrentdisplaymodesize.read && this.IconCompatParcelizer == getcurrentdisplaymodesize.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == getcurrentdisplaymodesize.AudioAttributesCompatParcelizer && Double.compare(this.MediaBrowserCompatCustomActionResultReceiver, getcurrentdisplaymodesize.MediaBrowserCompatCustomActionResultReceiver) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) getcurrentdisplaymodesize.AudioAttributesImplApi26Parcelizer) && this.AudioAttributesImplBaseParcelizer == getcurrentdisplaymodesize.AudioAttributesImplBaseParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, getcurrentdisplaymodesize.MediaBrowserCompatItemReceiver);
    }

    public final int hashCode() {
        return (((((((((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Double.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + this.MediaBrowserCompatItemReceiver.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        int i = this.write;
        int i2 = this.read;
        int i3 = this.IconCompatParcelizer;
        int i4 = this.AudioAttributesCompatParcelizer;
        double d = this.MediaBrowserCompatCustomActionResultReceiver;
        String str2 = this.AudioAttributesImplApi26Parcelizer;
        int i5 = this.AudioAttributesImplBaseParcelizer;
        List<getCountryCode> list = this.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("getCurrentDisplayModeSize(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(i);
        sb.append(", read=");
        sb.append(i2);
        sb.append(", IconCompatParcelizer=");
        sb.append(i3);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i4);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(d);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(str2);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i5);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
