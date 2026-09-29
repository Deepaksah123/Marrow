package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class newSingleThreadExecutor {
    private final RepeatModeUtil AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public newSingleThreadExecutor(RepeatModeUtil repeatModeUtil, String str) {
        toMagicModuleMetaRepoModel.write(repeatModeUtil, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = repeatModeUtil;
        this.RemoteActionCompatParcelizer = str;
    }

    public final RepeatModeUtil write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof newSingleThreadExecutor)) {
            return false;
        }
        newSingleThreadExecutor newsinglethreadexecutor = (newSingleThreadExecutor) obj;
        return this.AudioAttributesCompatParcelizer == newsinglethreadexecutor.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) newsinglethreadexecutor.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        RepeatModeUtil repeatModeUtil = this.AudioAttributesCompatParcelizer;
        String str = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("SubjectUcModel(groupType=");
        sb.append(repeatModeUtil);
        sb.append(", title=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
