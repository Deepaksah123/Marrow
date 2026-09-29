package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\fHÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/marrow2/ui/video/lesson_list/model/VideoListData;", "", "videoData", "", "Lcom/marrow2/domain/video/lesson_list/SealedVideoDetailsModel;", "subjectTitle", "", "loading", "", "isContentEmpty", "isNewVideoUiShown", "tabPosition", "", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZZI)V", "getVideoData", "()Ljava/util/List;", "getSubjectTitle", "()Ljava/lang/String;", "getLoading", "()Z", "getTabPosition", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {
    private final String AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final List<isTrafficRestricted> MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    /* JADX WARN: Multi-variable type inference failed */
    private t(List<? extends isTrafficRestricted> list, String str, boolean z, boolean z2, boolean z3, int i) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.MediaBrowserCompatCustomActionResultReceiver = list;
        this.AudioAttributesCompatParcelizer = str;
        this.read = z;
        this.write = z2;
        this.IconCompatParcelizer = z3;
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ t(List list, String str, boolean z, boolean z2, boolean z3, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? 0 : i);
    }

    public final List<isTrafficRestricted> RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public t() {
        this(null, null, false, false, false, 0, 63, null);
    }

    public static /* synthetic */ t read(t tVar, List list, String str, boolean z, boolean z2, boolean z3, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = tVar.MediaBrowserCompatCustomActionResultReceiver;
        }
        if ((i2 & 2) != 0) {
            str = tVar.AudioAttributesCompatParcelizer;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            z = tVar.read;
        }
        boolean z4 = z;
        if ((i2 & 8) != 0) {
            z2 = tVar.write;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            z3 = tVar.IconCompatParcelizer;
        }
        boolean z6 = z3;
        if ((i2 & 32) != 0) {
            i = tVar.RemoteActionCompatParcelizer;
        }
        return AudioAttributesCompatParcelizer(list, str2, z4, z5, z6, i);
    }

    private static t AudioAttributesCompatParcelizer(List<? extends isTrafficRestricted> list, String str, boolean z, boolean z2, boolean z3, int i) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new t(list, str, z, z2, z3, i);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, tVar.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) tVar.AudioAttributesCompatParcelizer) && this.read == tVar.read && this.write == tVar.write && this.IconCompatParcelizer == tVar.IconCompatParcelizer && this.RemoteActionCompatParcelizer == tVar.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((this.MediaBrowserCompatCustomActionResultReceiver.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        List<isTrafficRestricted> list = this.MediaBrowserCompatCustomActionResultReceiver;
        String str = this.AudioAttributesCompatParcelizer;
        boolean z = this.read;
        boolean z2 = this.write;
        boolean z3 = this.IconCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoListData(videoData=");
        sb.append(list);
        sb.append(", subjectTitle=");
        sb.append(str);
        sb.append(", loading=");
        sb.append(z);
        sb.append(", isContentEmpty=");
        sb.append(z2);
        sb.append(", isNewVideoUiShown=");
        sb.append(z3);
        sb.append(", tabPosition=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
