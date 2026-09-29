package kotlin;

import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007HÆ\u0003J}\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017¨\u0006-"}, d2 = {"Lcom/marrow2/ui/learn_more/model/LearnModelUIModel;", "", "title", "", "description", "oneLiner", "editors", "", "Lcom/marrow2/ui/learn_more/model/EditorModel;", "features", "Lcom/marrow2/ui/learn_more/model/LearnMoreFeaturesModel;", "primaryButtonText", "secondaryButtonText", "specialQuesHeader", "specials", "Lcom/marrow2/ui/learn_more/model/LearnMoreSpecialsModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getOneLiner", "getEditors", "()Ljava/util/List;", "getFeatures", "getPrimaryButtonText", "getSecondaryButtonText", "getSpecialQuesHeader", "getSpecials", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IStatusCallback {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final List<LifecycleFragment> MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final List<addCallback> read;
    private final List<asInterface> write;

    private IStatusCallback(String str, String str2, String str3, List<asInterface> list, List<addCallback> list2, String str4, String str5, String str6, List<LifecycleFragment> list3) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.AudioAttributesImplBaseParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.write = list;
        this.read = list2;
        this.IconCompatParcelizer = str4;
        this.AudioAttributesImplApi26Parcelizer = str5;
        this.MediaBrowserCompatCustomActionResultReceiver = str6;
        this.MediaBrowserCompatItemReceiver = list3;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public /* synthetic */ IStatusCallback(String str, String str2, String str3, List list, List list2, String str4, String str5, String str6, List list3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 16) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3);
    }

    public final List<addCallback> RemoteActionCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final List<LifecycleFragment> AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public IStatusCallback() {
        this(null, null, null, null, null, null, null, null, null, UnixStat.DEFAULT_LINK_PERM, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IStatusCallback RemoteActionCompatParcelizer(String str, String str2, String str3, List<asInterface> list, List<addCallback> list2, String str4, String str5, String str6, List<LifecycleFragment> list3) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        return new IStatusCallback(str, str2, str3, list, list2, str4, str5, str6, list3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IStatusCallback)) {
            return false;
        }
        IStatusCallback iStatusCallback = (IStatusCallback) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) iStatusCallback.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) iStatusCallback.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iStatusCallback.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, iStatusCallback.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, iStatusCallback.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) iStatusCallback.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) iStatusCallback.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) iStatusCallback.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, iStatusCallback.MediaBrowserCompatItemReceiver);
    }

    public final int hashCode() {
        String str = this.AudioAttributesImplBaseParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.RemoteActionCompatParcelizer;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.AudioAttributesCompatParcelizer;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.write.hashCode();
        int iHashCode5 = this.read.hashCode();
        int iHashCode6 = this.IconCompatParcelizer.hashCode();
        int iHashCode7 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        String str4 = this.MediaBrowserCompatCustomActionResultReceiver;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.MediaBrowserCompatItemReceiver.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesImplBaseParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.AudioAttributesCompatParcelizer;
        List<asInterface> list = this.write;
        List<addCallback> list2 = this.read;
        String str4 = this.IconCompatParcelizer;
        String str5 = this.AudioAttributesImplApi26Parcelizer;
        String str6 = this.MediaBrowserCompatCustomActionResultReceiver;
        List<LifecycleFragment> list3 = this.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("LearnModelUIModel(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", oneLiner=");
        sb.append(str3);
        sb.append(", editors=");
        sb.append(list);
        sb.append(", features=");
        sb.append(list2);
        sb.append(", primaryButtonText=");
        sb.append(str4);
        sb.append(", secondaryButtonText=");
        sb.append(str5);
        sb.append(", specialQuesHeader=");
        sb.append(str6);
        sb.append(", specials=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
