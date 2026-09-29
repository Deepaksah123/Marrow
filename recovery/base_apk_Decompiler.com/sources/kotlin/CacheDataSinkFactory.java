package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheDataSinkFactory {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public CacheDataSinkFactory(String str, String str2, String str3, String str4, String str5, String str6) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.read = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.AudioAttributesImplBaseParcelizer = str4;
        this.AudioAttributesCompatParcelizer = str5;
        this.IconCompatParcelizer = str6;
    }

    public final String read() {
        return this.read;
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheDataSinkFactory)) {
            return false;
        }
        CacheDataSinkFactory cacheDataSinkFactory = (CacheDataSinkFactory) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) cacheDataSinkFactory.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) cacheDataSinkFactory.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) cacheDataSinkFactory.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) cacheDataSinkFactory.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) cacheDataSinkFactory.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) cacheDataSinkFactory.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((((this.read.hashCode() * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.write;
        String str3 = this.RemoteActionCompatParcelizer;
        String str4 = this.AudioAttributesImplBaseParcelizer;
        String str5 = this.AudioAttributesCompatParcelizer;
        String str6 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("LessonSubjectRepoModel(lessonTitle=");
        sb.append(str);
        sb.append(", lessonId=");
        sb.append(str2);
        sb.append(", rootSubjectId=");
        sb.append(str3);
        sb.append(", rootSubjectTitle=");
        sb.append(str4);
        sb.append(", childSubjectId=");
        sb.append(str5);
        sb.append(", childSubjectTitle=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
