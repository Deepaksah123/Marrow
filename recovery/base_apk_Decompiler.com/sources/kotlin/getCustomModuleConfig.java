package kotlin;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
final class getCustomModuleConfig {
    private final int RemoteActionCompatParcelizer;
    private final WeakReference<ClassLoader> read;
    private ClassLoader write;

    public getCustomModuleConfig(ClassLoader classLoader) {
        toMagicModuleMetaRepoModel.write(classLoader, "");
        this.read = new WeakReference<>(classLoader);
        this.RemoteActionCompatParcelizer = System.identityHashCode(classLoader);
        this.write = classLoader;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getCustomModuleConfig) && this.read.get() == ((getCustomModuleConfig) obj).read.get();
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = this.read.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
