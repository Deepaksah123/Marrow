package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b \u0010\u0016R\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b!\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010\"\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001a\u0010$R\u001a\u0010\u0017\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\u0019\u0010$R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001f\u0010\u0014"}, d2 = {"Lo/StreetViewPanoramaFragment;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZI)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "write", "AudioAttributesImplApi21Parcelizer", "I", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "AudioAttributesImplBaseParcelizer", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StreetViewPanoramaFragment {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String read;

    public StreetViewPanoramaFragment(String str, int i, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.write = str;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.AudioAttributesCompatParcelizer = str4;
        this.MediaBrowserCompatCustomActionResultReceiver = str5;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.AudioAttributesImplBaseParcelizer = z2;
        this.MediaBrowserCompatItemReceiver = z3;
        this.AudioAttributesImplApi21Parcelizer = i2;
    }

    public /* synthetic */ StreetViewPanoramaFragment(String str, int i, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? false : z3, (i3 & 512) != 0 ? 1 : i2);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public StreetViewPanoramaFragment() {
        this(null, 0, null, null, null, null, false, false, false, 0, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof StreetViewPanoramaFragment)) {
            return false;
        }
        StreetViewPanoramaFragment streetViewPanoramaFragment = (StreetViewPanoramaFragment) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) streetViewPanoramaFragment.write) && this.RemoteActionCompatParcelizer == streetViewPanoramaFragment.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) streetViewPanoramaFragment.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) streetViewPanoramaFragment.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) streetViewPanoramaFragment.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) streetViewPanoramaFragment.MediaBrowserCompatCustomActionResultReceiver) && this.AudioAttributesImplApi26Parcelizer == streetViewPanoramaFragment.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplBaseParcelizer == streetViewPanoramaFragment.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatItemReceiver == streetViewPanoramaFragment.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi21Parcelizer == streetViewPanoramaFragment.AudioAttributesImplApi21Parcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((((this.write.hashCode() * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer);
    }

    public final String toString() {
        String str = this.write;
        int i = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.read;
        String str4 = this.AudioAttributesCompatParcelizer;
        String str5 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = this.AudioAttributesImplApi26Parcelizer;
        boolean z2 = this.AudioAttributesImplBaseParcelizer;
        boolean z3 = this.MediaBrowserCompatItemReceiver;
        int i2 = this.AudioAttributesImplApi21Parcelizer;
        StringBuilder sb = new StringBuilder("StreetViewPanoramaFragment(write=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(str3);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str4);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str5);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(z);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(z2);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(z3);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
