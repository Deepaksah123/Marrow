package kotlin;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lo/zaA;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zaA {
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public zaA(@JsonProperty("new_status") String str, @JsonProperty("transaction_id") String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public /* synthetic */ zaA(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zaA() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof zaA)) {
            return false;
        }
        zaA zaa = (zaA) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) zaa.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) zaa.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.IconCompatParcelizer;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("zaA(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
