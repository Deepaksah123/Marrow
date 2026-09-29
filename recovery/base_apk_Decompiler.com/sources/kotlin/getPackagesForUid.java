package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getPackagesForUid<T> extends getPackageInstaller<T> {
    private final String AudioAttributesCompatParcelizer;
    private final T IconCompatParcelizer;
    private final getPermissionGroupInfo RemoteActionCompatParcelizer;
    private final getPackagesHoldingPermissions write;

    public getPackagesForUid(T t, String str, getPackagesHoldingPermissions getpackagesholdingpermissions, getPermissionGroupInfo getpermissiongroupinfo) {
        toMagicModuleMetaRepoModel.write(t, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getpackagesholdingpermissions, "");
        toMagicModuleMetaRepoModel.write(getpermissiongroupinfo, "");
        this.IconCompatParcelizer = t;
        this.AudioAttributesCompatParcelizer = str;
        this.write = getpackagesholdingpermissions;
        this.RemoteActionCompatParcelizer = getpermissiongroupinfo;
    }

    @Override // kotlin.getPackageInstaller
    public final getPackageInstaller<T> RemoteActionCompatParcelizer(String str, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        if (getanswermap.invoke(this.IconCompatParcelizer).booleanValue()) {
            return this;
        }
        return new getPermissionInfo(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, str, this.RemoteActionCompatParcelizer, this.write);
    }

    @Override // kotlin.getPackageInstaller
    public final T AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
