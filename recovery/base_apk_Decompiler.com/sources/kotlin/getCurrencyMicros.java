package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006%"}, d2 = {"Lcom/marrow2/ui/test/landing/model/GTNudgeContentVMModel;", "", "title", "", "descriptions", "", "defaultTestId", "totalModule", "", "videoModule", "isVisible", "", "nudgeType", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;IIZI)V", "getTitle", "()Ljava/lang/String;", "getDescriptions", "()Ljava/util/List;", "getDefaultTestId", "getTotalModule", "()I", "getVideoModule", "()Z", "getNudgeType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getCurrencyMicros {
    private final boolean AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private final String read;
    private final List<String> write;

    private getCurrencyMicros(String str, List<String> list, String str2, int i, int i2, boolean z, int i3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.write = list;
        this.IconCompatParcelizer = str2;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.AudioAttributesCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = i3;
    }

    public /* synthetic */ getCurrencyMicros(String str, List list, String str2, int i, int i2, boolean z, int i3, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? 0 : i3);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public getCurrencyMicros() {
        this(null, null, null, 0, 0, false, 0, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getCurrencyMicros AudioAttributesCompatParcelizer(String str, List<String> list, String str2, int i, int i2, boolean z, int i3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return new getCurrencyMicros(str, list, str2, i, i2, z, i3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getCurrencyMicros)) {
            return false;
        }
        getCurrencyMicros getcurrencymicros = (getCurrencyMicros) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getcurrencymicros.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getcurrencymicros.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getcurrencymicros.IconCompatParcelizer) && this.AudioAttributesImplApi26Parcelizer == getcurrencymicros.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == getcurrencymicros.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesCompatParcelizer == getcurrencymicros.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == getcurrencymicros.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((((this.read.hashCode() * 31) + this.write.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        String str = this.read;
        List<String> list = this.write;
        String str2 = this.IconCompatParcelizer;
        int i = this.AudioAttributesImplApi26Parcelizer;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = this.AudioAttributesCompatParcelizer;
        int i3 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("GTNudgeContentVMModel(title=");
        sb.append(str);
        sb.append(", descriptions=");
        sb.append(list);
        sb.append(", defaultTestId=");
        sb.append(str2);
        sb.append(", totalModule=");
        sb.append(i);
        sb.append(", videoModule=");
        sb.append(i2);
        sb.append(", isVisible=");
        sb.append(z);
        sb.append(", nudgeType=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }
}
