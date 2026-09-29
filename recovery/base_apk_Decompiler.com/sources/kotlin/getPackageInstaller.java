package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b \u0018\u0000 \u0010*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/getPackageInstaller;", "", "T", "<init>", "()V", "", "p0", "Lkotlin/Function1;", "", "p1", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/getAnswerMap;)Lo/getPackageInstaller;", "AudioAttributesCompatParcelizer", "()Ljava/lang/Object;", "IconCompatParcelizer", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getPackageInstaller<T> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract T AudioAttributesCompatParcelizer();

    public abstract getPackageInstaller<T> RemoteActionCompatParcelizer(String p0, getAnswerMap<? super T, Boolean> p1);

    protected static String IconCompatParcelizer(Object p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        sb.append(" value: ");
        sb.append(p0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.getPackageInstaller$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0001*\u0002H\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/window/core/SpecificationComputer$Companion;", "", "<init>", "()V", "startSpecification", "Landroidx/window/core/SpecificationComputer;", "T", "tag", "", "verificationMode", "Landroidx/window/core/VerificationMode;", "logger", "Landroidx/window/core/Logger;", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/VerificationMode;Landroidx/window/core/Logger;)Landroidx/window/core/SpecificationComputer;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T> getPackageInstaller<T> IconCompatParcelizer(T t, String str, getPackagesHoldingPermissions getpackagesholdingpermissions, getPermissionGroupInfo getpermissiongroupinfo) {
            toMagicModuleMetaRepoModel.write(t, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(getpackagesholdingpermissions, "");
            toMagicModuleMetaRepoModel.write(getpermissiongroupinfo, "");
            return new getPackagesForUid(t, str, getpackagesholdingpermissions, getpermissiongroupinfo);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
