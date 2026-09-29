package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010\u0015R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u001c\u0010(\u001a\u00020\f8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b(\u0010\u001d"}, d2 = {"Lo/SeekParameters;", "", "", "p0", "", "p1", "Landroid/content/Context;", "p2", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p3", "", "p4", "", "p5", "<init>", "(Ljava/lang/String;ZLandroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;JI)V", "IconCompatParcelizer", "()Ljava/lang/String;", "write", "()Z", "AudioAttributesCompatParcelizer", "()Landroid/content/Context;", "RemoteActionCompatParcelizer", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "read", "()J", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "Z", "Landroid/content/Context;", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "J", "I", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeekParameters {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public long write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public boolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Context IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver;

    public SeekParameters(String str, boolean z, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j, int i) {
        this.RemoteActionCompatParcelizer = str;
        this.read = z;
        this.IconCompatParcelizer = context;
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.write = j;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    public /* synthetic */ SeekParameters(String str, boolean z, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : context, (i2 & 8) == 0 ? cleverTapInstanceConfig : null, (i2 & 16) != 0 ? -1L : j, (i2 & 32) != 0 ? -1 : i);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Context AudioAttributesImplBaseParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public SeekParameters(String str, boolean z, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j) {
        this(str, z, context, cleverTapInstanceConfig, j, 0, 32, null);
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Context getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final CleverTapInstanceConfig getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SeekParameters)) {
            return false;
        }
        SeekParameters seekParameters = (SeekParameters) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) seekParameters.RemoteActionCompatParcelizer) && this.read == seekParameters.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, seekParameters.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, seekParameters.AudioAttributesCompatParcelizer) && this.write == seekParameters.write && this.MediaBrowserCompatCustomActionResultReceiver == seekParameters.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Boolean.hashCode(this.read);
        Context context = this.IconCompatParcelizer;
        int iHashCode3 = context == null ? 0 : context.hashCode();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.AudioAttributesCompatParcelizer;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (cleverTapInstanceConfig != null ? cleverTapInstanceConfig.hashCode() : 0)) * 31) + Long.hashCode(this.write)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeekParameters(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(')');
        return sb.toString();
    }
}
