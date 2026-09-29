package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n0\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001b\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n0\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\tHÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u000bHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006%"}, d2 = {"Lcom/marrow2/ui/test/testReview/model/TestFilterUIState;", "", "filterType", "Lcom/marrow2/domain/filter/model/CommonFilterType;", "filteredSubjectId", "", "cacheFilterType", "cacheFilteredSubjectId", "filterTypeCount", "", "Lkotlin/Pair;", "", "filterSubjects", "Lcom/marrow2/data/filter/local/model/SubjectFilterCount;", "<init>", "(Lcom/marrow2/domain/filter/model/CommonFilterType;Ljava/lang/String;Lcom/marrow2/domain/filter/model/CommonFilterType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getFilterType", "()Lcom/marrow2/domain/filter/model/CommonFilterType;", "getFilteredSubjectId", "()Ljava/lang/String;", "getCacheFilterType", "getCacheFilteredSubjectId", "getFilterTypeCount", "()Ljava/util/List;", "getFilterSubjects", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setOnNavigationItemSelectedListener {
    private final String AudioAttributesCompatParcelizer;
    private final List<hasFatalError> IconCompatParcelizer;
    private final String MediaBrowserCompatItemReceiver;
    private final getMediaMimeType RemoteActionCompatParcelizer;
    private final List<Pair<getMediaMimeType, Integer>> read;
    private final getMediaMimeType write;

    /* JADX WARN: Multi-variable type inference failed */
    private setOnNavigationItemSelectedListener(getMediaMimeType getmediamimetype, String str, getMediaMimeType getmediamimetype2, String str2, List<? extends Pair<? extends getMediaMimeType, Integer>> list, List<hasFatalError> list2) {
        toMagicModuleMetaRepoModel.write(getmediamimetype, "");
        toMagicModuleMetaRepoModel.write(getmediamimetype2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.write = getmediamimetype;
        this.MediaBrowserCompatItemReceiver = str;
        this.RemoteActionCompatParcelizer = getmediamimetype2;
        this.AudioAttributesCompatParcelizer = str2;
        this.read = list;
        this.IconCompatParcelizer = list2;
    }

    public /* synthetic */ setOnNavigationItemSelectedListener(getMediaMimeType getmediamimetype, String str, getMediaMimeType getmediamimetype2, String str2, List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? getMediaMimeType.AudioAttributesImplBaseParcelizer : getmediamimetype, (i & 2) != 0 ? null : str, (i & 4) != 0 ? getMediaMimeType.AudioAttributesImplBaseParcelizer : getmediamimetype2, (i & 8) == 0 ? str2 : null, (i & 16) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 32) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final getMediaMimeType getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final getMediaMimeType getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<Pair<getMediaMimeType, Integer>> IconCompatParcelizer() {
        return this.read;
    }

    public final List<hasFatalError> read() {
        return this.IconCompatParcelizer;
    }

    public setOnNavigationItemSelectedListener() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ setOnNavigationItemSelectedListener AudioAttributesCompatParcelizer(setOnNavigationItemSelectedListener setonnavigationitemselectedlistener, getMediaMimeType getmediamimetype, String str, getMediaMimeType getmediamimetype2, String str2, List list, List list2, int i) {
        if ((i & 1) != 0) {
            getmediamimetype = setonnavigationitemselectedlistener.write;
        }
        if ((i & 2) != 0) {
            str = setonnavigationitemselectedlistener.MediaBrowserCompatItemReceiver;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            getmediamimetype2 = setonnavigationitemselectedlistener.RemoteActionCompatParcelizer;
        }
        getMediaMimeType getmediamimetype3 = getmediamimetype2;
        if ((i & 8) != 0) {
            str2 = setonnavigationitemselectedlistener.AudioAttributesCompatParcelizer;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            list = setonnavigationitemselectedlistener.read;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = setonnavigationitemselectedlistener.IconCompatParcelizer;
        }
        return IconCompatParcelizer(getmediamimetype, str3, getmediamimetype3, str4, list3, list2);
    }

    public static setOnNavigationItemSelectedListener IconCompatParcelizer(getMediaMimeType getmediamimetype, String str, getMediaMimeType getmediamimetype2, String str2, List<? extends Pair<? extends getMediaMimeType, Integer>> list, List<hasFatalError> list2) {
        toMagicModuleMetaRepoModel.write(getmediamimetype, "");
        toMagicModuleMetaRepoModel.write(getmediamimetype2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        return new setOnNavigationItemSelectedListener(getmediamimetype, str, getmediamimetype2, str2, list, list2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setOnNavigationItemSelectedListener)) {
            return false;
        }
        setOnNavigationItemSelectedListener setonnavigationitemselectedlistener = (setOnNavigationItemSelectedListener) other;
        return this.write == setonnavigationitemselectedlistener.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) setonnavigationitemselectedlistener.MediaBrowserCompatItemReceiver) && this.RemoteActionCompatParcelizer == setonnavigationitemselectedlistener.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setonnavigationitemselectedlistener.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, setonnavigationitemselectedlistener.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setonnavigationitemselectedlistener.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        String str = this.MediaBrowserCompatItemReceiver;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        String str2 = this.AudioAttributesCompatParcelizer;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        getMediaMimeType getmediamimetype = this.write;
        String str = this.MediaBrowserCompatItemReceiver;
        getMediaMimeType getmediamimetype2 = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        List<Pair<getMediaMimeType, Integer>> list = this.read;
        List<hasFatalError> list2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("TestFilterUIState(filterType=");
        sb.append(getmediamimetype);
        sb.append(", filteredSubjectId=");
        sb.append(str);
        sb.append(", cacheFilterType=");
        sb.append(getmediamimetype2);
        sb.append(", cacheFilteredSubjectId=");
        sb.append(str2);
        sb.append(", filterTypeCount=");
        sb.append(list);
        sb.append(", filterSubjects=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
