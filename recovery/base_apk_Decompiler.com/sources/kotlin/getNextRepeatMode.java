package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010 \u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010#\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010!\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b \u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001d\u0010\u0016"}, d2 = {"Lo/getNextRepeatMode;", "", "", "p0", "p1", "", "p2", "p3", "p4", "", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIFIILjava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "write", "read", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer", "I", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "F", "AudioAttributesImplBaseParcelizer", "()F"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getNextRepeatMode {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final float AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    public getNextRepeatMode(String str, String str2, int i, int i2, int i3, float f, int i4, int i5, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.read = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.write = i3;
        this.AudioAttributesImplBaseParcelizer = f;
        this.MediaBrowserCompatItemReceiver = i4;
        this.MediaBrowserCompatCustomActionResultReceiver = i5;
        this.AudioAttributesImplApi26Parcelizer = str3;
    }

    public /* synthetic */ getNextRepeatMode(String str, String str2, int i, int i2, int i3, float f, int i4, int i5, String str3, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) != 0 ? "" : str3);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final float getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public getNextRepeatMode() {
        this(null, null, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, null, UnixStat.DEFAULT_LINK_PERM, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getNextRepeatMode)) {
            return false;
        }
        getNextRepeatMode getnextrepeatmode = (getNextRepeatMode) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getnextrepeatmode.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getnextrepeatmode.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == getnextrepeatmode.IconCompatParcelizer && this.RemoteActionCompatParcelizer == getnextrepeatmode.RemoteActionCompatParcelizer && this.write == getnextrepeatmode.write && Float.compare(this.AudioAttributesImplBaseParcelizer, getnextrepeatmode.AudioAttributesImplBaseParcelizer) == 0 && this.MediaBrowserCompatItemReceiver == getnextrepeatmode.MediaBrowserCompatItemReceiver && this.MediaBrowserCompatCustomActionResultReceiver == getnextrepeatmode.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) getnextrepeatmode.AudioAttributesImplApi26Parcelizer);
    }

    public final int hashCode() {
        return (((((((((((((((this.read.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.write)) * 31) + Float.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.AudioAttributesCompatParcelizer;
        int i = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.write;
        float f = this.AudioAttributesImplBaseParcelizer;
        int i4 = this.MediaBrowserCompatItemReceiver;
        int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str3 = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("getNextRepeatMode(read=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(i);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i2);
        sb.append(", write=");
        sb.append(i3);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(f);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i4);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(i5);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
