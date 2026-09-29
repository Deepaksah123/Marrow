package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\"\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010%\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e"}, d2 = {"Lo/CacheFileMetadataIndex;", "", "", "p0", "p1", "", "p2", "", "p3", "p4", "p5", "p6", "", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZZZLjava/lang/String;Ljava/util/List;ZI)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "I", "AudioAttributesCompatParcelizer", "Z", "MediaBrowserCompatItemReceiver", "read", "AudioAttributesImplApi21Parcelizer", "Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CacheFileMetadataIndex {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<String> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean read;
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public CacheFileMetadataIndex(String str, String str2, int i, boolean z, boolean z2, boolean z3, String str3, List<String> list, boolean z4, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = z;
        this.read = z2;
        this.MediaBrowserCompatItemReceiver = z3;
        this.AudioAttributesImplBaseParcelizer = str3;
        this.AudioAttributesImplApi21Parcelizer = list;
        this.AudioAttributesImplApi26Parcelizer = z4;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
    }

    public /* synthetic */ CacheFileMetadataIndex(String str, String str2, int i, boolean z, boolean z2, boolean z3, String str3, List list, boolean z4, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? "" : str3, (i3 & 128) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 256) != 0 ? false : z4, (i3 & 512) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public CacheFileMetadataIndex() {
        this(null, null, 0, false, false, false, null, null, false, 0, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CacheFileMetadataIndex)) {
            return false;
        }
        CacheFileMetadataIndex cacheFileMetadataIndex = (CacheFileMetadataIndex) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) cacheFileMetadataIndex.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) cacheFileMetadataIndex.write) && this.AudioAttributesCompatParcelizer == cacheFileMetadataIndex.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == cacheFileMetadataIndex.RemoteActionCompatParcelizer && this.read == cacheFileMetadataIndex.read && this.MediaBrowserCompatItemReceiver == cacheFileMetadataIndex.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) cacheFileMetadataIndex.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, cacheFileMetadataIndex.AudioAttributesImplApi21Parcelizer) && this.AudioAttributesImplApi26Parcelizer == cacheFileMetadataIndex.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == cacheFileMetadataIndex.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int hashCode() {
        return (((((((((((((((((this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.write;
        int i = this.AudioAttributesCompatParcelizer;
        boolean z = this.RemoteActionCompatParcelizer;
        boolean z2 = this.read;
        boolean z3 = this.MediaBrowserCompatItemReceiver;
        String str3 = this.AudioAttributesImplBaseParcelizer;
        List<String> list = this.AudioAttributesImplApi21Parcelizer;
        boolean z4 = this.AudioAttributesImplApi26Parcelizer;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        StringBuilder sb = new StringBuilder("CacheFileMetadataIndex(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(str2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(z);
        sb.append(", read=");
        sb.append(z2);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(z3);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(str3);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(list);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(z4);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
