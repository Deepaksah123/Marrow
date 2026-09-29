package kotlin;

import com.marrow2.data.user.remote.model.onboarding.UserBasicDetails;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/setToIdentity;", "", "", "p0", "", "Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "p1", "Lo/obtainMessage;", "p2", "<init>", "(Ljava/lang/String;Ljava/util/List;Lo/obtainMessage;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "intermediateToken", "Ljava/lang/String;", "write", "userMini", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;", "saveUserResponseRepoModel", "Lo/obtainMessage;", "AudioAttributesCompatParcelizer", "()Lo/obtainMessage;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setToIdentity {
    public static final int $stable = 8;
    private final String intermediateToken;
    private final obtainMessage saveUserResponseRepoModel;
    private final List<UserBasicDetails> userMini;

    public setToIdentity(String str, List<UserBasicDetails> list, obtainMessage obtainmessage) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(obtainmessage, "");
        this.intermediateToken = str;
        this.userMini = list;
        this.saveUserResponseRepoModel = obtainmessage;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getIntermediateToken() {
        return this.intermediateToken;
    }

    public final List<UserBasicDetails> IconCompatParcelizer() {
        return this.userMini;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final obtainMessage getSaveUserResponseRepoModel() {
        return this.saveUserResponseRepoModel;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setToIdentity)) {
            return false;
        }
        setToIdentity settoidentity = (setToIdentity) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.intermediateToken, (Object) settoidentity.intermediateToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.userMini, settoidentity.userMini) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.saveUserResponseRepoModel, settoidentity.saveUserResponseRepoModel);
    }

    public final int hashCode() {
        return (((this.intermediateToken.hashCode() * 31) + this.userMini.hashCode()) * 31) + this.saveUserResponseRepoModel.hashCode();
    }

    public final String toString() {
        String str = this.intermediateToken;
        List<UserBasicDetails> list = this.userMini;
        obtainMessage obtainmessage = this.saveUserResponseRepoModel;
        StringBuilder sb = new StringBuilder("setToIdentity(intermediateToken=");
        sb.append(str);
        sb.append(", userMini=");
        sb.append(list);
        sb.append(", saveUserResponseRepoModel=");
        sb.append(obtainmessage);
        sb.append(")");
        return sb.toString();
    }
}
