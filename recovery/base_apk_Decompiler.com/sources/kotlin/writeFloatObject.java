package kotlin;

import com.marrow2.data.user.remote.model.onboarding.UserBasicDetails;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/marrow2/ui/onboarding/phone/model/PhoneAccountUiData;", "", "userAccounts", "", "Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "phoneNumber", "", "countryCode", "interimToken", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserAccounts", "()Ljava/util/List;", "getPhoneNumber", "()Ljava/lang/String;", "getCountryCode", "getInterimToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class writeFloatObject {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String read;
    private final List<UserBasicDetails> write;

    public writeFloatObject(List<UserBasicDetails> list, String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.write = list;
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
    }

    public /* synthetic */ writeFloatObject(List list, String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }

    public final List<UserBasicDetails> write() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public writeFloatObject() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static writeFloatObject RemoteActionCompatParcelizer(List<UserBasicDetails> list, String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        return new writeFloatObject(list, str, str2, str3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof writeFloatObject)) {
            return false;
        }
        writeFloatObject writefloatobject = (writeFloatObject) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, writefloatobject.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) writefloatobject.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writefloatobject.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) writefloatobject.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((((this.write.hashCode() * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        List<UserBasicDetails> list = this.write;
        String str = this.read;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("PhoneAccountUiData(userAccounts=");
        sb.append(list);
        sb.append(", phoneNumber=");
        sb.append(str);
        sb.append(", countryCode=");
        sb.append(str2);
        sb.append(", interimToken=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
