package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheCacheException {
    private final String AudioAttributesCompatParcelizer;
    private final List<CacheListener> AudioAttributesImplApi21Parcelizer;
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final int write;

    public CacheCacheException(String str, String str2, String str3, int i, int i2, int i3, List<CacheListener> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.write = i;
        this.IconCompatParcelizer = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
        this.AudioAttributesImplApi21Parcelizer = list;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.read;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final List<CacheListener> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheCacheException)) {
            return false;
        }
        CacheCacheException cacheCacheException = (CacheCacheException) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) cacheCacheException.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) cacheCacheException.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) cacheCacheException.RemoteActionCompatParcelizer) && this.write == cacheCacheException.write && this.IconCompatParcelizer == cacheCacheException.IconCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == cacheCacheException.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, cacheCacheException.AudioAttributesImplApi21Parcelizer);
    }

    public final int hashCode() {
        return (((((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        String str3 = this.RemoteActionCompatParcelizer;
        int i = this.write;
        int i2 = this.IconCompatParcelizer;
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        List<CacheListener> list = this.AudioAttributesImplApi21Parcelizer;
        StringBuilder sb = new StringBuilder("VideoSubjectGroupUcModel(childSubjectId=");
        sb.append(str);
        sb.append(", childSubjectTitle=");
        sb.append(str2);
        sb.append(", imageUrl=");
        sb.append(str3);
        sb.append(", totalLessons=");
        sb.append(i);
        sb.append(", completedLessons=");
        sb.append(i2);
        sb.append(", upcomingLessons=");
        sb.append(i3);
        sb.append(", videoLesson=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
