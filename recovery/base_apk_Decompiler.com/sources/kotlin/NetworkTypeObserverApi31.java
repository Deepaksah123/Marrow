package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/marrow2/domain/main/model/CourseContent;", "", "hasNewCourse", "", "courseName", "", "<init>", "(ZLjava/lang/String;)V", "getHasNewCourse", "()Z", "getCourseName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NetworkTypeObserverApi31 {
    private final String read;
    private final boolean write;

    private NetworkTypeObserverApi31(boolean z, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = z;
        this.read = str;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public /* synthetic */ NetworkTypeObserverApi31(boolean z, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkTypeObserverApi31() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NetworkTypeObserverApi31 RemoteActionCompatParcelizer(NetworkTypeObserverApi31 networkTypeObserverApi31, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            z = networkTypeObserverApi31.write;
        }
        if ((i & 2) != 0) {
            str = networkTypeObserverApi31.read;
        }
        return write(z, str);
    }

    private static NetworkTypeObserverApi31 write(boolean z, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return new NetworkTypeObserverApi31(z, str);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkTypeObserverApi31)) {
            return false;
        }
        NetworkTypeObserverApi31 networkTypeObserverApi31 = (NetworkTypeObserverApi31) other;
        return this.write == networkTypeObserverApi31.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) networkTypeObserverApi31.read);
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.write) * 31) + this.read.hashCode();
    }

    public final String toString() {
        boolean z = this.write;
        String str = this.read;
        StringBuilder sb = new StringBuilder("CourseContent(hasNewCourse=");
        sb.append(z);
        sb.append(", courseName=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
