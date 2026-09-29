package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/marrow2/ui/qbank/play/model/QBankUIState;", "", "id", "", "mcqId", "", "startIndex", "", "totalMcq", "resumeExplanation", "", "vibrationEnabled", "navigationButtonStatus", "Lcom/marrow2/ui/test/landing/model/NavigationButtonStatus;", "<init>", "(Ljava/lang/String;Ljava/util/List;IIZZLcom/marrow2/ui/test/landing/model/NavigationButtonStatus;)V", "getId", "()Ljava/lang/String;", "getMcqId", "()Ljava/util/List;", "getStartIndex", "()I", "getTotalMcq", "getResumeExplanation", "()Z", "getVibrationEnabled", "getNavigationButtonStatus", "()Lcom/marrow2/ui/test/landing/model/NavigationButtonStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getLocality {
    private final boolean AudioAttributesCompatParcelizer;
    private final List<String> IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final int RemoteActionCompatParcelizer;
    private final setDouble read;
    private final String write;

    private getLocality(String str, List<String> list, int i, int i2, boolean z, boolean z2, setDouble setdouble) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(setdouble, "");
        this.write = str;
        this.IconCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = i;
        this.MediaBrowserCompatItemReceiver = i2;
        this.AudioAttributesCompatParcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = z2;
        this.read = setdouble;
    }

    public /* synthetic */ getLocality(String str, List list, int i, int i2, boolean z, boolean z2, setDouble setdouble, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z, (i3 & 32) == 0 ? z2 : false, (i3 & 64) != 0 ? setDouble.RemoteActionCompatParcelizer : setdouble);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    public final List<String> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final setDouble getRead() {
        return this.read;
    }

    public getLocality() {
        this(null, null, 0, 0, false, false, null, 127, null);
    }

    public static /* synthetic */ getLocality AudioAttributesCompatParcelizer(getLocality getlocality, String str, List list, int i, int i2, boolean z, boolean z2, setDouble setdouble, int i3) {
        if ((i3 & 1) != 0) {
            str = getlocality.write;
        }
        if ((i3 & 2) != 0) {
            list = getlocality.IconCompatParcelizer;
        }
        List list2 = list;
        if ((i3 & 4) != 0) {
            i = getlocality.RemoteActionCompatParcelizer;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = getlocality.MediaBrowserCompatItemReceiver;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z = getlocality.AudioAttributesCompatParcelizer;
        }
        boolean z3 = z;
        if ((i3 & 32) != 0) {
            z2 = getlocality.MediaBrowserCompatCustomActionResultReceiver;
        }
        boolean z4 = z2;
        if ((i3 & 64) != 0) {
            setdouble = getlocality.read;
        }
        return IconCompatParcelizer(str, list2, i4, i5, z3, z4, setdouble);
    }

    private static getLocality IconCompatParcelizer(String str, List<String> list, int i, int i2, boolean z, boolean z2, setDouble setdouble) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(setdouble, "");
        return new getLocality(str, list, i, i2, z, z2, setdouble);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getLocality)) {
            return false;
        }
        getLocality getlocality = (getLocality) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getlocality.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getlocality.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == getlocality.RemoteActionCompatParcelizer && this.MediaBrowserCompatItemReceiver == getlocality.MediaBrowserCompatItemReceiver && this.AudioAttributesCompatParcelizer == getlocality.AudioAttributesCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == getlocality.MediaBrowserCompatCustomActionResultReceiver && this.read == getlocality.read;
    }

    public final int hashCode() {
        return (((((((((((this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.write;
        List<String> list = this.IconCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.MediaBrowserCompatItemReceiver;
        boolean z = this.AudioAttributesCompatParcelizer;
        boolean z2 = this.MediaBrowserCompatCustomActionResultReceiver;
        setDouble setdouble = this.read;
        StringBuilder sb = new StringBuilder("QBankUIState(id=");
        sb.append(str);
        sb.append(", mcqId=");
        sb.append(list);
        sb.append(", startIndex=");
        sb.append(i);
        sb.append(", totalMcq=");
        sb.append(i2);
        sb.append(", resumeExplanation=");
        sb.append(z);
        sb.append(", vibrationEnabled=");
        sb.append(z2);
        sb.append(", navigationButtonStatus=");
        sb.append(setdouble);
        sb.append(")");
        return sb.toString();
    }
}
