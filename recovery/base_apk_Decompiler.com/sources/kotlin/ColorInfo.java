package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010#\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0013"}, d2 = {"Lo/ColorInfo;", "Lo/isStartTagIgnorePrefix;", "", "p0", "Lo/XmlPullParserUtil;", "p1", "p2", "p3", "", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Lo/XmlPullParserUtil;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "read", "write", "Lo/XmlPullParserUtil;", "()Lo/XmlPullParserUtil;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "I", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ColorInfo extends isStartTagIgnorePrefix {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final XmlPullParserUtil AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String AudioAttributesImplApi21Parcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorInfo(String str, XmlPullParserUtil xmlPullParserUtil, String str2, String str3, int i, String str4, int i2) {
        super(str, xmlPullParserUtil, str2, str3);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(xmlPullParserUtil, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = xmlPullParserUtil;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesImplApi21Parcelizer = str4;
        this.MediaBrowserCompatItemReceiver = i2;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final XmlPullParserUtil getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ColorInfo)) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) colorInfo.write) && this.AudioAttributesCompatParcelizer == colorInfo.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) colorInfo.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) colorInfo.read) && this.RemoteActionCompatParcelizer == colorInfo.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) colorInfo.AudioAttributesImplApi21Parcelizer) && this.MediaBrowserCompatItemReceiver == colorInfo.MediaBrowserCompatItemReceiver;
    }

    public final int hashCode() {
        return (((((((((((this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver);
    }

    public final String toString() {
        String str = this.write;
        XmlPullParserUtil xmlPullParserUtil = this.AudioAttributesCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.read;
        int i = this.RemoteActionCompatParcelizer;
        String str4 = this.AudioAttributesImplApi21Parcelizer;
        int i2 = this.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("ColorInfo(write=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(xmlPullParserUtil);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(str3);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(str4);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
