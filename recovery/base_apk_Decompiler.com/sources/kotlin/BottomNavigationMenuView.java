package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J_\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/marrow2/ui/test/testReview/model/CommonReviewUIStates;", "", "mcqIds", "", "", "showAnswer", "", "showVertical", "showFilterOverlay", "parentId", "sharingAllowed", "screenMode", "Lcom/marrow2/ui/test/testReview/ui/ScreenMode;", "parentType", "Lcom/marrow2/ui/review_components/model/ReviewParentType;", "<init>", "(Ljava/util/List;ZZZLjava/lang/String;ZLcom/marrow2/ui/test/testReview/ui/ScreenMode;Lcom/marrow2/ui/review_components/model/ReviewParentType;)V", "getMcqIds", "()Ljava/util/List;", "getShowAnswer", "()Z", "getShowVertical", "getShowFilterOverlay", "getParentId", "()Ljava/lang/String;", "getSharingAllowed", "getScreenMode", "()Lcom/marrow2/ui/test/testReview/ui/ScreenMode;", "getParentType", "()Lcom/marrow2/ui/review_components/model/ReviewParentType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BottomNavigationMenuView {
    private final zzhs AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final String RemoteActionCompatParcelizer;
    private final List<String> read;
    private final setOnMaskChangedListener write;

    private BottomNavigationMenuView(List<String> list, boolean z, boolean z2, boolean z3, String str, boolean z4, setOnMaskChangedListener setonmaskchangedlistener, zzhs zzhsVar) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(setonmaskchangedlistener, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        this.read = list;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.AudioAttributesImplBaseParcelizer = z2;
        this.AudioAttributesImplApi21Parcelizer = z3;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = z4;
        this.write = setonmaskchangedlistener;
        this.AudioAttributesCompatParcelizer = zzhsVar;
    }

    public /* synthetic */ BottomNavigationMenuView(List list, boolean z, boolean z2, boolean z3, String str, boolean z4, setOnMaskChangedListener setonmaskchangedlistener, zzhs zzhsVar, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? "" : str, (i & 32) == 0 ? z4 : false, (i & 64) != 0 ? setOnMaskChangedListener.write : setonmaskchangedlistener, (i & 128) != 0 ? zzhs.IconCompatParcelizer : zzhsVar);
    }

    public final List<String> RemoteActionCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final setOnMaskChangedListener getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final zzhs getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public BottomNavigationMenuView() {
        this(null, false, false, false, null, false, null, null, 255, null);
    }

    public static /* synthetic */ BottomNavigationMenuView AudioAttributesCompatParcelizer(BottomNavigationMenuView bottomNavigationMenuView, List list, boolean z, boolean z2, boolean z3, String str, boolean z4, setOnMaskChangedListener setonmaskchangedlistener, zzhs zzhsVar, int i) {
        if ((i & 1) != 0) {
            list = bottomNavigationMenuView.read;
        }
        if ((i & 2) != 0) {
            z = bottomNavigationMenuView.MediaBrowserCompatCustomActionResultReceiver;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = bottomNavigationMenuView.AudioAttributesImplBaseParcelizer;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = bottomNavigationMenuView.AudioAttributesImplApi21Parcelizer;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            str = bottomNavigationMenuView.RemoteActionCompatParcelizer;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z4 = bottomNavigationMenuView.IconCompatParcelizer;
        }
        boolean z8 = z4;
        if ((i & 64) != 0) {
            setonmaskchangedlistener = bottomNavigationMenuView.write;
        }
        setOnMaskChangedListener setonmaskchangedlistener2 = setonmaskchangedlistener;
        if ((i & 128) != 0) {
            zzhsVar = bottomNavigationMenuView.AudioAttributesCompatParcelizer;
        }
        return read(list, z5, z6, z7, str2, z8, setonmaskchangedlistener2, zzhsVar);
    }

    private static BottomNavigationMenuView read(List<String> list, boolean z, boolean z2, boolean z3, String str, boolean z4, setOnMaskChangedListener setonmaskchangedlistener, zzhs zzhsVar) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(setonmaskchangedlistener, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        return new BottomNavigationMenuView(list, z, z2, z3, str, z4, setonmaskchangedlistener, zzhsVar);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomNavigationMenuView)) {
            return false;
        }
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, bottomNavigationMenuView.read) && this.MediaBrowserCompatCustomActionResultReceiver == bottomNavigationMenuView.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplBaseParcelizer == bottomNavigationMenuView.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi21Parcelizer == bottomNavigationMenuView.AudioAttributesImplApi21Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) bottomNavigationMenuView.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == bottomNavigationMenuView.IconCompatParcelizer && this.write == bottomNavigationMenuView.write && this.AudioAttributesCompatParcelizer == bottomNavigationMenuView.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((((((this.read.hashCode() * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        List<String> list = this.read;
        boolean z = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z2 = this.AudioAttributesImplBaseParcelizer;
        boolean z3 = this.AudioAttributesImplApi21Parcelizer;
        String str = this.RemoteActionCompatParcelizer;
        boolean z4 = this.IconCompatParcelizer;
        setOnMaskChangedListener setonmaskchangedlistener = this.write;
        zzhs zzhsVar = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("CommonReviewUIStates(mcqIds=");
        sb.append(list);
        sb.append(", showAnswer=");
        sb.append(z);
        sb.append(", showVertical=");
        sb.append(z2);
        sb.append(", showFilterOverlay=");
        sb.append(z3);
        sb.append(", parentId=");
        sb.append(str);
        sb.append(", sharingAllowed=");
        sb.append(z4);
        sb.append(", screenMode=");
        sb.append(setonmaskchangedlistener);
        sb.append(", parentType=");
        sb.append(zzhsVar);
        sb.append(")");
        return sb.toString();
    }
}
