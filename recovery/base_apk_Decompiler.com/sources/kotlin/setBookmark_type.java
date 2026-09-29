package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class setBookmark_type implements CourseConfigV2RepoModelKt {
    private final String RemoteActionCompatParcelizer;

    public setBookmark_type(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
    }

    private String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return IconCompatParcelizer();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setBookmark_type) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) ((setBookmark_type) obj).RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }
}
