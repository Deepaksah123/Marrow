package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getPermissionInfo<T> extends getPackageInstaller<T> {
    private final getPreferredPackages AudioAttributesCompatParcelizer;
    private final getPackagesHoldingPermissions AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final T MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final getPermissionGroupInfo write;

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[getPackagesHoldingPermissions.values().length];
            try {
                iArr[getPackagesHoldingPermissions.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getPackagesHoldingPermissions.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getPackagesHoldingPermissions.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    public getPermissionInfo(T t, String str, String str2, getPermissionGroupInfo getpermissiongroupinfo, getPackagesHoldingPermissions getpackagesholdingpermissions) {
        toMagicModuleMetaRepoModel.write(t, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(getpermissiongroupinfo, "");
        toMagicModuleMetaRepoModel.write(getpackagesholdingpermissions, "");
        this.MediaBrowserCompatItemReceiver = t;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.write = getpermissiongroupinfo;
        this.AudioAttributesImplBaseParcelizer = getpackagesholdingpermissions;
        getPreferredPackages getpreferredpackages = new getPreferredPackages(IconCompatParcelizer(t, str2));
        StackTraceElement[] stackTrace = getpreferredpackages.getStackTrace();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stackTrace, "");
        getpreferredpackages.setStackTrace((StackTraceElement[]) getOrderDetails.AudioAttributesImplApi26Parcelizer(stackTrace).toArray(new StackTraceElement[0]));
        this.AudioAttributesCompatParcelizer = getpreferredpackages;
    }

    @Override // kotlin.getPackageInstaller
    public final getPackageInstaller<T> RemoteActionCompatParcelizer(String str, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return this;
    }

    @Override // kotlin.getPackageInstaller
    public final T AudioAttributesCompatParcelizer() throws getPreferredPackages {
        int i = IconCompatParcelizer.read[this.AudioAttributesImplBaseParcelizer.ordinal()];
        if (i == 1) {
            throw this.AudioAttributesCompatParcelizer;
        }
        if (i == 2) {
            this.write.write(this.RemoteActionCompatParcelizer, IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer));
            return null;
        }
        if (i == 3) {
            return null;
        }
        throw new RenewEligibleCreator();
    }
}
