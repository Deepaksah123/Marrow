package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class isAnswerAvailable<T> {
    private final T AudioAttributesCompatParcelizer;
    private final T IconCompatParcelizer;
    private final T MediaBrowserCompatCustomActionResultReceiver;
    private final RevisionSubjectStatusModel RemoteActionCompatParcelizer;
    private final T read;
    private final String write;

    public isAnswerAvailable(T t, T t2, T t3, T t4, String str, RevisionSubjectStatusModel revisionSubjectStatusModel) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        this.AudioAttributesCompatParcelizer = t;
        this.read = t2;
        this.MediaBrowserCompatCustomActionResultReceiver = t3;
        this.IconCompatParcelizer = t4;
        this.write = str;
        this.RemoteActionCompatParcelizer = revisionSubjectStatusModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isAnswerAvailable)) {
            return false;
        }
        isAnswerAvailable isansweravailable = (isAnswerAvailable) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, isansweravailable.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, isansweravailable.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, isansweravailable.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, isansweravailable.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) isansweravailable.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, isansweravailable.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        T t = this.AudioAttributesCompatParcelizer;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.read;
        int iHashCode2 = t2 == null ? 0 : t2.hashCode();
        T t3 = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode3 = t3 == null ? 0 : t3.hashCode();
        T t4 = this.IconCompatParcelizer;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (t4 != null ? t4.hashCode() : 0)) * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", compilerVersion=");
        sb.append(this.read);
        sb.append(", languageVersion=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", expectedVersion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", filePath=");
        sb.append(this.write);
        sb.append(", classId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
