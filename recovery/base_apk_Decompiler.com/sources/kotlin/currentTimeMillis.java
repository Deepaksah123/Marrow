package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0015R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u0019\u0010\u0013"}, d2 = {"Lo/currentTimeMillis;", "", "", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "read", "MediaBrowserCompatCustomActionResultReceiver", "I", "Ljava/util/List;", "write", "()Ljava/util/List;", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class currentTimeMillis {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<String> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String MediaBrowserCompatCustomActionResultReceiver;

    public currentTimeMillis(String str, int i, List<String> list, String str2, String str3, String str4, String str5, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.read = str;
        this.IconCompatParcelizer = i;
        this.write = list;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.AudioAttributesImplApi21Parcelizer = str4;
        this.MediaBrowserCompatCustomActionResultReceiver = str5;
        this.MediaBrowserCompatItemReceiver = i2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final List<String> write() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof currentTimeMillis)) {
            return false;
        }
        currentTimeMillis currenttimemillis = (currentTimeMillis) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) currenttimemillis.read) && this.IconCompatParcelizer == currenttimemillis.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, currenttimemillis.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) currenttimemillis.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) currenttimemillis.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) currenttimemillis.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) currenttimemillis.MediaBrowserCompatCustomActionResultReceiver) && this.MediaBrowserCompatItemReceiver == currenttimemillis.MediaBrowserCompatItemReceiver;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = Integer.hashCode(this.IconCompatParcelizer);
        List<String> list = this.write;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.AudioAttributesCompatParcelizer.hashCode();
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.MediaBrowserCompatCustomActionResultReceiver;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver);
    }

    public final String toString() {
        String str = this.read;
        int i = this.IconCompatParcelizer;
        List<String> list = this.write;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.AudioAttributesCompatParcelizer;
        String str4 = this.AudioAttributesImplApi21Parcelizer;
        String str5 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i2 = this.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("currentTimeMillis(read=");
        sb.append(str);
        sb.append(", IconCompatParcelizer=");
        sb.append(i);
        sb.append(", write=");
        sb.append(list);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str3);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(str4);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str5);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
