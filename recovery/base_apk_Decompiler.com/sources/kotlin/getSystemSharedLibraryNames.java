package kotlin;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class getSystemSharedLibraryNames {
    private final float RemoteActionCompatParcelizer;
    private final getPackageGids read;

    public getSystemSharedLibraryNames(getPackageGids getpackagegids, float f) {
        toMagicModuleMetaRepoModel.write(getpackagegids, "");
        this.read = getpackagegids;
        this.RemoteActionCompatParcelizer = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getSystemSharedLibraryNames(Rect rect, float f) {
        this(new getPackageGids(rect), f);
        toMagicModuleMetaRepoModel.write(rect, "");
    }

    public final Rect AudioAttributesCompatParcelizer() {
        return this.read.read();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(obj, "");
        getSystemSharedLibraryNames getsystemsharedlibrarynames = (getSystemSharedLibraryNames) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, getsystemsharedlibrarynames.read) && this.RemoteActionCompatParcelizer == getsystemsharedlibrarynames.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + Float.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.read);
        sb.append(", density=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
