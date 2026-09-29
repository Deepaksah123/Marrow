package kotlin;

import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003Ji\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000fHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/marrow2/ui/schema/schemaReview/ui/SchemaReviewUIStates;", "", "title", "", "mcqIds", "", "showAnswer", "", "showVertical", "showFilterOverlay", "parentId", "schemaId", "parentType", "Lcom/marrow2/ui/review_components/model/ReviewParentType;", "lastOpenedMcqIndex", "", "<init>", "(Ljava/lang/String;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lcom/marrow2/ui/review_components/model/ReviewParentType;I)V", "getTitle", "()Ljava/lang/String;", "getMcqIds", "()Ljava/util/List;", "getShowAnswer", "()Z", "getShowVertical", "getShowFilterOverlay", "getParentId", "getSchemaId", "getParentType", "()Lcom/marrow2/ui/review_components/model/ReviewParentType;", "getLastOpenedMcqIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getInitialTrigger {
    private final int AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final List<String> RemoteActionCompatParcelizer;
    private final String read;
    private final zzhs write;

    private getInitialTrigger(String str, List<String> list, boolean z, boolean z2, boolean z3, String str2, String str3, zzhs zzhsVar, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        this.AudioAttributesImplBaseParcelizer = str;
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesImplApi21Parcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = z2;
        this.MediaBrowserCompatItemReceiver = z3;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.write = zzhsVar;
        this.AudioAttributesCompatParcelizer = i;
    }

    public /* synthetic */ getInitialTrigger(String str, List list, boolean z, boolean z2, boolean z3, String str2, String str3, zzhs zzhsVar, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? zzhs.IconCompatParcelizer : zzhsVar, (i2 & 256) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<String> write() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final zzhs getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public getInitialTrigger() {
        this(null, null, false, false, false, null, null, null, 0, UnixStat.DEFAULT_LINK_PERM, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getInitialTrigger write(String str, List<String> list, boolean z, boolean z2, boolean z3, String str2, String str3, zzhs zzhsVar, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        return new getInitialTrigger(str, list, z, z2, z3, str2, str3, zzhsVar, i);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getInitialTrigger)) {
            return false;
        }
        getInitialTrigger getinitialtrigger = (getInitialTrigger) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) getinitialtrigger.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getinitialtrigger.RemoteActionCompatParcelizer) && this.AudioAttributesImplApi21Parcelizer == getinitialtrigger.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == getinitialtrigger.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatItemReceiver == getinitialtrigger.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getinitialtrigger.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getinitialtrigger.read) && this.write == getinitialtrigger.write && this.AudioAttributesCompatParcelizer == getinitialtrigger.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((this.AudioAttributesImplBaseParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.AudioAttributesImplBaseParcelizer;
        List<String> list = this.RemoteActionCompatParcelizer;
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        boolean z2 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z3 = this.MediaBrowserCompatItemReceiver;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.read;
        zzhs zzhsVar = this.write;
        int i = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaReviewUIStates(title=");
        sb.append(str);
        sb.append(", mcqIds=");
        sb.append(list);
        sb.append(", showAnswer=");
        sb.append(z);
        sb.append(", showVertical=");
        sb.append(z2);
        sb.append(", showFilterOverlay=");
        sb.append(z3);
        sb.append(", parentId=");
        sb.append(str2);
        sb.append(", schemaId=");
        sb.append(str3);
        sb.append(", parentType=");
        sb.append(zzhsVar);
        sb.append(", lastOpenedMcqIndex=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
