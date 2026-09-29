package kotlin;

import com.marrow2.data.user.remote.model.onboarding.UserBasicDetails;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/getNowUnixTimeMs;", "", "", "p0", "", "Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "p1", "Lo/readDouble;", "p2", "<init>", "(Ljava/lang/String;Ljava/util/List;Lo/readDouble;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "intermediateToken", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "userMiniList", "Ljava/util/List;", "read", "()Ljava/util/List;", "saveUserModel", "Lo/readDouble;", "write", "()Lo/readDouble;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getNowUnixTimeMs {
    public static final int $stable = 8;
    private final String intermediateToken;
    private final readDouble saveUserModel;
    private final List<UserBasicDetails> userMiniList;

    public getNowUnixTimeMs(String str, List<UserBasicDetails> list, readDouble readdouble) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(readdouble, "");
        this.intermediateToken = str;
        this.userMiniList = list;
        this.saveUserModel = readdouble;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getIntermediateToken() {
        return this.intermediateToken;
    }

    public final List<UserBasicDetails> read() {
        return this.userMiniList;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final readDouble getSaveUserModel() {
        return this.saveUserModel;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getNowUnixTimeMs)) {
            return false;
        }
        getNowUnixTimeMs getnowunixtimems = (getNowUnixTimeMs) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.intermediateToken, (Object) getnowunixtimems.intermediateToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.userMiniList, getnowunixtimems.userMiniList) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.saveUserModel, getnowunixtimems.saveUserModel);
    }

    public final int hashCode() {
        return (((this.intermediateToken.hashCode() * 31) + this.userMiniList.hashCode()) * 31) + this.saveUserModel.hashCode();
    }

    public final String toString() {
        String str = this.intermediateToken;
        List<UserBasicDetails> list = this.userMiniList;
        readDouble readdouble = this.saveUserModel;
        StringBuilder sb = new StringBuilder("getNowUnixTimeMs(intermediateToken=");
        sb.append(str);
        sb.append(", userMiniList=");
        sb.append(list);
        sb.append(", saveUserModel=");
        sb.append(readdouble);
        sb.append(")");
        return sb.toString();
    }
}
