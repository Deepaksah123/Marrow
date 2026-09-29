package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006&"}, d2 = {"Lcom/marrow2/ui/review_components/model/ReviewUIState;", "", "lastMcqPosition", "", "mcqIds", "", "", "parentId", "showDoubleTapOverlay", "", "showShakeTooltip", "showDoubleTapDoneDialog", "showAnswerParent", "<init>", "(ILjava/util/List;Ljava/lang/String;ZZZZ)V", "getLastMcqPosition", "()I", "getMcqIds", "()Ljava/util/List;", "getParentId", "()Ljava/lang/String;", "getShowDoubleTapOverlay", "()Z", "getShowShakeTooltip", "getShowDoubleTapDoneDialog", "getShowAnswerParent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zzhu {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final List<String> IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    private zzhu(int i, List<String> list, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = i;
        this.IconCompatParcelizer = list;
        this.write = str;
        this.AudioAttributesImplApi21Parcelizer = z;
        this.AudioAttributesImplBaseParcelizer = z2;
        this.AudioAttributesCompatParcelizer = z3;
        this.RemoteActionCompatParcelizer = z4;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public /* synthetic */ zzhu(int i, List list, String str, boolean z, boolean z2, boolean z3, boolean z4, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? true : z4);
    }

    public final List<String> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public zzhu() {
        this(0, null, null, false, false, false, false, 127, null);
    }

    public static /* synthetic */ zzhu IconCompatParcelizer(zzhu zzhuVar, int i, List list, String str, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            i = zzhuVar.read;
        }
        if ((i2 & 2) != 0) {
            list = zzhuVar.IconCompatParcelizer;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            str = zzhuVar.write;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            z = zzhuVar.AudioAttributesImplApi21Parcelizer;
        }
        boolean z5 = z;
        if ((i2 & 16) != 0) {
            z2 = zzhuVar.AudioAttributesImplBaseParcelizer;
        }
        boolean z6 = z2;
        if ((i2 & 32) != 0) {
            z3 = zzhuVar.AudioAttributesCompatParcelizer;
        }
        boolean z7 = z3;
        if ((i2 & 64) != 0) {
            z4 = zzhuVar.RemoteActionCompatParcelizer;
        }
        return read(i, list2, str2, z5, z6, z7, z4);
    }

    private static zzhu read(int i, List<String> list, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new zzhu(i, list, str, z, z2, z3, z4);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zzhu)) {
            return false;
        }
        zzhu zzhuVar = (zzhu) other;
        return this.read == zzhuVar.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, zzhuVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) zzhuVar.write) && this.AudioAttributesImplApi21Parcelizer == zzhuVar.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplBaseParcelizer == zzhuVar.AudioAttributesImplBaseParcelizer && this.AudioAttributesCompatParcelizer == zzhuVar.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == zzhuVar.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((((Integer.hashCode(this.read) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = this.read;
        List<String> list = this.IconCompatParcelizer;
        String str = this.write;
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        boolean z2 = this.AudioAttributesImplBaseParcelizer;
        boolean z3 = this.AudioAttributesCompatParcelizer;
        boolean z4 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ReviewUIState(lastMcqPosition=");
        sb.append(i);
        sb.append(", mcqIds=");
        sb.append(list);
        sb.append(", parentId=");
        sb.append(str);
        sb.append(", showDoubleTapOverlay=");
        sb.append(z);
        sb.append(", showShakeTooltip=");
        sb.append(z2);
        sb.append(", showDoubleTapDoneDialog=");
        sb.append(z3);
        sb.append(", showAnswerParent=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }
}
