package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001dR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00078\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b!\u0010'R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u0014\u0010&\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001fR\u0014\u0010+\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010.\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010*\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b!\u00101"}, d2 = {"Lo/ColorParser;", "", "", "p0", "p1", "p2", "p3", "", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "", "Lo/parseColorInternal;", "p13", "", "p14", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Z)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "write", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "I", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "RatingCompat", "MediaMetadataCompat", "AudioAttributesImplApi26Parcelizer", "MediaDescriptionCompat", "MediaBrowserCompatMediaItem", "Ljava/util/List;", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ColorParser {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int MediaMetadataCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final List<parseColorInternal> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final String MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public int MediaBrowserCompatItemReceiver;

    private ColorParser(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3, String str6, String str7, String str8, int i4, int i5, List<parseColorInternal> list, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = str4;
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompatItemReceiver = i2;
        this.AudioAttributesImplBaseParcelizer = str5;
        this.AudioAttributesImplApi21Parcelizer = i3;
        this.MediaBrowserCompatCustomActionResultReceiver = str6;
        this.AudioAttributesImplApi26Parcelizer = str7;
        this.MediaBrowserCompatSearchResultReceiver = str8;
        this.MediaMetadataCompat = i4;
        this.MediaBrowserCompatMediaItem = i5;
        this.MediaDescriptionCompat = list;
        this.RatingCompat = z;
    }

    public /* synthetic */ ColorParser(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3, String str6, String str7, String str8, int i4, int i5, List list, boolean z, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? "" : str4, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? "" : str5, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? "" : str6, (i6 & 512) != 0 ? "" : str7, (i6 & 1024) == 0 ? str8 : "", (i6 & 2048) != 0 ? 0 : i4, (i6 & 4096) != 0 ? 0 : i5, (i6 & 8192) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i6 & 16384) == 0 ? z : false);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRatingCompat() {
        return this.RatingCompat;
    }

    public ColorParser() {
        this(null, null, null, null, 0, 0, null, 0, null, null, null, 0, 0, null, false, 32767, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ColorParser)) {
            return false;
        }
        ColorParser colorParser = (ColorParser) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) colorParser.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) colorParser.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) colorParser.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) colorParser.read) && this.IconCompatParcelizer == colorParser.IconCompatParcelizer && this.MediaBrowserCompatItemReceiver == colorParser.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) colorParser.AudioAttributesImplBaseParcelizer) && this.AudioAttributesImplApi21Parcelizer == colorParser.AudioAttributesImplApi21Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) colorParser.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) colorParser.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) colorParser.MediaBrowserCompatSearchResultReceiver) && this.MediaMetadataCompat == colorParser.MediaMetadataCompat && this.MediaBrowserCompatMediaItem == colorParser.MediaBrowserCompatMediaItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, colorParser.MediaDescriptionCompat) && this.RatingCompat == colorParser.RatingCompat;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + Integer.hashCode(this.MediaMetadataCompat)) * 31) + Integer.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + Boolean.hashCode(this.RatingCompat);
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.RemoteActionCompatParcelizer;
        String str4 = this.read;
        int i = this.IconCompatParcelizer;
        int i2 = this.MediaBrowserCompatItemReceiver;
        String str5 = this.AudioAttributesImplBaseParcelizer;
        int i3 = this.AudioAttributesImplApi21Parcelizer;
        String str6 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str7 = this.AudioAttributesImplApi26Parcelizer;
        String str8 = this.MediaBrowserCompatSearchResultReceiver;
        int i4 = this.MediaMetadataCompat;
        int i5 = this.MediaBrowserCompatMediaItem;
        List<parseColorInternal> list = this.MediaDescriptionCompat;
        boolean z = this.RatingCompat;
        StringBuilder sb = new StringBuilder("ColorParser(write=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str3);
        sb.append(", read=");
        sb.append(str4);
        sb.append(", IconCompatParcelizer=");
        sb.append(i);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i2);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(str5);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i3);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str6);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(str7);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(str8);
        sb.append(", MediaMetadataCompat=");
        sb.append(i4);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(i5);
        sb.append(", MediaDescriptionCompat=");
        sb.append(list);
        sb.append(", RatingCompat=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
