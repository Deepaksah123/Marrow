package kotlin;

import com.marrow.data.models.custommodule.FilterParams;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J£\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018¨\u0006:"}, d2 = {"Lcom/marrow2/ui/video/revision_video/model/RevisionScreenUiState;", "", "isLoading", "", "availableTabs", "", "Lcom/marrow2/ui/video/revision_video/model/RevisionTab;", "selectedTab", FilterParams.KEY_SUBJECTS, "Lcom/marrow2/ui/video/revision_video/model/RevisionSubject;", "linkedSubjects", "Lcom/marrow2/ui/video/revision_video/model/LinkedSubject;", "isSubjectListLoading", "arePaidLessonsUnlocked", "subjectTitle", "", "indexList", "Lcom/marrow2/ui/video/revision_video/model/IndexItemModel;", "showIndexSelection", "showProDialog", "shouldShowErrorMessage", "canShowInteractiveMcqNudge", "<init>", "(ZLjava/util/List;Lcom/marrow2/ui/video/revision_video/model/RevisionTab;Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;Ljava/util/List;ZZZZ)V", "()Z", "getAvailableTabs", "()Ljava/util/List;", "getSelectedTab", "()Lcom/marrow2/ui/video/revision_video/model/RevisionTab;", "getSubjects", "getLinkedSubjects", "getArePaidLessonsUnlocked", "getSubjectTitle", "()Ljava/lang/String;", "getIndexList", "getShowIndexSelection", "getShowProDialog", "getShouldShowErrorMessage", "getCanShowInteractiveMcqNudge", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getFirstInstallTimeMs {
    private final List<component4> AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final getLastUpdatedTimeMs AudioAttributesImplBaseParcelizer;
    private final List<getLastUpdatedTimeMs> IconCompatParcelizer;
    private final List<getFirstInstallAppVersion> MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final List<getFirstInstallDbVersion> MediaBrowserCompatSearchResultReceiver;
    private final boolean MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    /* JADX WARN: Multi-variable type inference failed */
    private getFirstInstallTimeMs(boolean z, List<? extends getLastUpdatedTimeMs> list, getLastUpdatedTimeMs getlastupdatedtimems, List<getFirstInstallDbVersion> list2, List<getFirstInstallAppVersion> list3, boolean z2, boolean z3, String str, List<component4> list4, boolean z4, boolean z5, boolean z6, boolean z7) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getlastupdatedtimems, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list4, "");
        this.write = z;
        this.IconCompatParcelizer = list;
        this.AudioAttributesImplBaseParcelizer = getlastupdatedtimems;
        this.MediaBrowserCompatSearchResultReceiver = list2;
        this.MediaBrowserCompatCustomActionResultReceiver = list3;
        this.MediaBrowserCompatItemReceiver = z2;
        this.RemoteActionCompatParcelizer = z3;
        this.MediaMetadataCompat = str;
        this.AudioAttributesCompatParcelizer = list4;
        this.AudioAttributesImplApi26Parcelizer = z4;
        this.MediaDescriptionCompat = z5;
        this.AudioAttributesImplApi21Parcelizer = z6;
        this.read = z7;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public /* synthetic */ getFirstInstallTimeMs(boolean z, List list, getLastUpdatedTimeMs getlastupdatedtimems, List list2, List list3, boolean z2, boolean z3, String str, List list4, boolean z4, boolean z5, boolean z6, boolean z7, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 4) != 0 ? getLastUpdatedTimeMs.write : getlastupdatedtimems, (i & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i & 16) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list4, (i & 512) != 0 ? false : z4, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? false : z6, (i & 4096) == 0 ? z7 : false);
    }

    public final List<getLastUpdatedTimeMs> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final getLastUpdatedTimeMs getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<getFirstInstallDbVersion> MediaMetadataCompat() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final List<getFirstInstallAppVersion> read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final List<component4> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public getFirstInstallTimeMs() {
        this(false, null, null, null, null, false, false, null, null, false, false, false, false, 8191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getFirstInstallTimeMs AudioAttributesCompatParcelizer(boolean z, List<? extends getLastUpdatedTimeMs> list, getLastUpdatedTimeMs getlastupdatedtimems, List<getFirstInstallDbVersion> list2, List<getFirstInstallAppVersion> list3, boolean z2, boolean z3, String str, List<component4> list4, boolean z4, boolean z5, boolean z6, boolean z7) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getlastupdatedtimems, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list4, "");
        return new getFirstInstallTimeMs(z, list, getlastupdatedtimems, list2, list3, z2, z3, str, list4, z4, z5, z6, z7);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getFirstInstallTimeMs)) {
            return false;
        }
        getFirstInstallTimeMs getfirstinstalltimems = (getFirstInstallTimeMs) other;
        return this.write == getfirstinstalltimems.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getfirstinstalltimems.IconCompatParcelizer) && this.AudioAttributesImplBaseParcelizer == getfirstinstalltimems.AudioAttributesImplBaseParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, getfirstinstalltimems.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, getfirstinstalltimems.MediaBrowserCompatCustomActionResultReceiver) && this.MediaBrowserCompatItemReceiver == getfirstinstalltimems.MediaBrowserCompatItemReceiver && this.RemoteActionCompatParcelizer == getfirstinstalltimems.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) getfirstinstalltimems.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getfirstinstalltimems.AudioAttributesCompatParcelizer) && this.AudioAttributesImplApi26Parcelizer == getfirstinstalltimems.AudioAttributesImplApi26Parcelizer && this.MediaDescriptionCompat == getfirstinstalltimems.MediaDescriptionCompat && this.AudioAttributesImplApi21Parcelizer == getfirstinstalltimems.AudioAttributesImplApi21Parcelizer && this.read == getfirstinstalltimems.read;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((Boolean.hashCode(this.write) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.MediaDescriptionCompat)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        boolean z = this.write;
        List<getLastUpdatedTimeMs> list = this.IconCompatParcelizer;
        getLastUpdatedTimeMs getlastupdatedtimems = this.AudioAttributesImplBaseParcelizer;
        List<getFirstInstallDbVersion> list2 = this.MediaBrowserCompatSearchResultReceiver;
        List<getFirstInstallAppVersion> list3 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z2 = this.MediaBrowserCompatItemReceiver;
        boolean z3 = this.RemoteActionCompatParcelizer;
        String str = this.MediaMetadataCompat;
        List<component4> list4 = this.AudioAttributesCompatParcelizer;
        boolean z4 = this.AudioAttributesImplApi26Parcelizer;
        boolean z5 = this.MediaDescriptionCompat;
        boolean z6 = this.AudioAttributesImplApi21Parcelizer;
        boolean z7 = this.read;
        StringBuilder sb = new StringBuilder("RevisionScreenUiState(isLoading=");
        sb.append(z);
        sb.append(", availableTabs=");
        sb.append(list);
        sb.append(", selectedTab=");
        sb.append(getlastupdatedtimems);
        sb.append(", subjects=");
        sb.append(list2);
        sb.append(", linkedSubjects=");
        sb.append(list3);
        sb.append(", isSubjectListLoading=");
        sb.append(z2);
        sb.append(", arePaidLessonsUnlocked=");
        sb.append(z3);
        sb.append(", subjectTitle=");
        sb.append(str);
        sb.append(", indexList=");
        sb.append(list4);
        sb.append(", showIndexSelection=");
        sb.append(z4);
        sb.append(", showProDialog=");
        sb.append(z5);
        sb.append(", shouldShowErrorMessage=");
        sb.append(z6);
        sb.append(", canShowInteractiveMcqNudge=");
        sb.append(z7);
        sb.append(")");
        return sb.toString();
    }
}
