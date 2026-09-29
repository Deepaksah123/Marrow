package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006&"}, d2 = {"Lcom/marrow2/ui/schema/listing/model/SchemaFilterState;", "", "showFilterOverlay", "", "selectedSubjectFilterId", "", "selectedExamFilterId", "appliedExamFilterId", "appliedSubjectFilterId", "examFilterItems", "", "Lcom/marrow2/ui/schema/listing/model/SchemaFilterItem;", "subjectFilterItems", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getShowFilterOverlay", "()Z", "getSelectedSubjectFilterId", "()Ljava/lang/String;", "getSelectedExamFilterId", "getAppliedExamFilterId", "getAppliedSubjectFilterId", "getExamFilterItems", "()Ljava/util/List;", "getSubjectFilterItems", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zzpx {
    private final String AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final List<zzpw> MediaBrowserCompatItemReceiver;
    private final List<zzpw> RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    private zzpx(boolean z, String str, String str2, String str3, String str4, List<zzpw> list, List<zzpw> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.AudioAttributesImplApi26Parcelizer = z;
        this.write = str;
        this.read = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.IconCompatParcelizer = str4;
        this.RemoteActionCompatParcelizer = list;
        this.MediaBrowserCompatItemReceiver = list2;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ zzpx(boolean z, String str, String str2, String str3, String str4, List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? str4 : null, (i & 32) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 64) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2);
    }

    public final List<zzpw> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<zzpw> MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public zzpx() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ zzpx AudioAttributesCompatParcelizer(zzpx zzpxVar, boolean z, String str, String str2, String str3, String str4, List list, List list2, int i) {
        if ((i & 1) != 0) {
            z = zzpxVar.AudioAttributesImplApi26Parcelizer;
        }
        if ((i & 2) != 0) {
            str = zzpxVar.write;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = zzpxVar.read;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = zzpxVar.AudioAttributesCompatParcelizer;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = zzpxVar.IconCompatParcelizer;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            list = zzpxVar.RemoteActionCompatParcelizer;
        }
        List list3 = list;
        if ((i & 64) != 0) {
            list2 = zzpxVar.MediaBrowserCompatItemReceiver;
        }
        return RemoteActionCompatParcelizer(z, str5, str6, str7, str8, list3, list2);
    }

    private static zzpx RemoteActionCompatParcelizer(boolean z, String str, String str2, String str3, String str4, List<zzpw> list, List<zzpw> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        return new zzpx(z, str, str2, str3, str4, list, list2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zzpx)) {
            return false;
        }
        zzpx zzpxVar = (zzpx) other;
        return this.AudioAttributesImplApi26Parcelizer == zzpxVar.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) zzpxVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) zzpxVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) zzpxVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) zzpxVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, zzpxVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, zzpxVar.MediaBrowserCompatItemReceiver);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
        String str = this.write;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.AudioAttributesCompatParcelizer;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.IconCompatParcelizer;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode();
    }

    public final String toString() {
        boolean z = this.AudioAttributesImplApi26Parcelizer;
        String str = this.write;
        String str2 = this.read;
        String str3 = this.AudioAttributesCompatParcelizer;
        String str4 = this.IconCompatParcelizer;
        List<zzpw> list = this.RemoteActionCompatParcelizer;
        List<zzpw> list2 = this.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("SchemaFilterState(showFilterOverlay=");
        sb.append(z);
        sb.append(", selectedSubjectFilterId=");
        sb.append(str);
        sb.append(", selectedExamFilterId=");
        sb.append(str2);
        sb.append(", appliedExamFilterId=");
        sb.append(str3);
        sb.append(", appliedSubjectFilterId=");
        sb.append(str4);
        sb.append(", examFilterItems=");
        sb.append(list);
        sb.append(", subjectFilterItems=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
