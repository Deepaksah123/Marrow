package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\b"}, d2 = {"Lo/ServicePresenterModule;", "", "<init>", "()V", "", "p0", "", "write", "(Ljava/lang/String;)Z", "AudioAttributesCompatParcelizer", "read", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ServicePresenterModule {
    public static final ServicePresenterModule INSTANCE = new ServicePresenterModule();

    private ServicePresenterModule() {
    }

    public static boolean write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "POST") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "PATCH") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "PUT") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "DELETE") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "MOVE");
    }

    @getMagicModuleMeta
    public static final boolean RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "POST") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "PUT") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "PATCH") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "PROPPATCH") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "REPORT");
    }

    @getMagicModuleMeta
    public static final boolean AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "GET") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "HEAD")) ? false : true;
    }

    public static boolean IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "PROPFIND");
    }

    public static boolean read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "PROPFIND");
    }
}
