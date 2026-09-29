package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b!\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J}\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001J\u0013\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0006HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001a¨\u00060"}, d2 = {"Lcom/marrow2/data/mcq/local/model/QBankAnswerRepoModel;", "", "parentId", "", "mcqId", "serverUserAnswer", "", "isRight", "", "isGuessed", "parentMcqId", "isStarred", "firstAnswer", "isSillyMistake", "highYieldIds", "", "isDefault", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;ZIZLjava/util/List;Z)V", "getParentId", "()Ljava/lang/String;", "setParentId", "(Ljava/lang/String;)V", "getMcqId", "getServerUserAnswer", "()I", "()Z", "getParentMcqId", "getFirstAnswer", "getHighYieldIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CachedContentRange {
    public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final List<String> IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatMediaItem;
    private final String MediaDescriptionCompat;
    private final int read;
    private final boolean write;

    private CachedContentRange(String str, String str2, int i, boolean z, boolean z2, String str3, boolean z3, int i2, boolean z4, List<String> list, boolean z5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesImplApi26Parcelizer = str;
        this.AudioAttributesImplBaseParcelizer = str2;
        this.MediaBrowserCompatMediaItem = i;
        this.MediaBrowserCompatItemReceiver = z;
        this.write = z2;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompatCustomActionResultReceiver = z3;
        this.read = i2;
        this.AudioAttributesImplApi21Parcelizer = z4;
        this.IconCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = z5;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public /* synthetic */ CachedContentRange(String str, String str2, int i, boolean z, boolean z2, String str3, boolean z3, int i2, boolean z4, List list, boolean z5, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, str3, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? false : z4, (i3 & 512) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 1024) != 0 ? false : z5);
    }

    public final List<String> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/CachedContentRange$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "Lo/CachedContentRange;", "write", "(Ljava/lang/String;Ljava/lang/String;)Lo/CachedContentRange;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public static CachedContentRange write(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new CachedContentRange(p0, p1, 0, false, false, p1, false, 0, false, null, true, 768, null);
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CachedContentRange read(String str, String str2, int i, boolean z, boolean z2, String str3, boolean z3, int i2, boolean z4, List<String> list, boolean z5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        return new CachedContentRange(str, str2, i, z, z2, str3, z3, i2, z4, list, z5);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedContentRange)) {
            return false;
        }
        CachedContentRange cachedContentRange = (CachedContentRange) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) cachedContentRange.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) cachedContentRange.AudioAttributesImplBaseParcelizer) && this.MediaBrowserCompatMediaItem == cachedContentRange.MediaBrowserCompatMediaItem && this.MediaBrowserCompatItemReceiver == cachedContentRange.MediaBrowserCompatItemReceiver && this.write == cachedContentRange.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) cachedContentRange.MediaDescriptionCompat) && this.MediaBrowserCompatCustomActionResultReceiver == cachedContentRange.MediaBrowserCompatCustomActionResultReceiver && this.read == cachedContentRange.read && this.AudioAttributesImplApi21Parcelizer == cachedContentRange.AudioAttributesImplApi21Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, cachedContentRange.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == cachedContentRange.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.AudioAttributesImplApi26Parcelizer.hashCode() * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.write)) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.read)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi26Parcelizer;
        String str2 = this.AudioAttributesImplBaseParcelizer;
        int i = this.MediaBrowserCompatMediaItem;
        boolean z = this.MediaBrowserCompatItemReceiver;
        boolean z2 = this.write;
        String str3 = this.MediaDescriptionCompat;
        boolean z3 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i2 = this.read;
        boolean z4 = this.AudioAttributesImplApi21Parcelizer;
        List<String> list = this.IconCompatParcelizer;
        boolean z5 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("QBankAnswerRepoModel(parentId=");
        sb.append(str);
        sb.append(", mcqId=");
        sb.append(str2);
        sb.append(", serverUserAnswer=");
        sb.append(i);
        sb.append(", isRight=");
        sb.append(z);
        sb.append(", isGuessed=");
        sb.append(z2);
        sb.append(", parentMcqId=");
        sb.append(str3);
        sb.append(", isStarred=");
        sb.append(z3);
        sb.append(", firstAnswer=");
        sb.append(i2);
        sb.append(", isSillyMistake=");
        sb.append(z4);
        sb.append(", highYieldIds=");
        sb.append(list);
        sb.append(", isDefault=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }
}
