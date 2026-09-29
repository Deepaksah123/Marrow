package kotlin;

import android.app.Application;
import android.content.pm.PackageManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n"}, d2 = {"Lo/withNewAdGroup;", "Lo/withOriginalAdCount;", "Landroid/app/Application;", "p0", "<init>", "(Landroid/app/Application;)V", "", "AudioAttributesCompatParcelizer", "()J", "IconCompatParcelizer", "Landroid/app/Application;", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class withNewAdGroup implements withOriginalAdCount {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Application read;

    @setSdkPayload
    public withNewAdGroup(Application application) {
        toMagicModuleMetaRepoModel.write(application, "");
        this.read = application;
    }

    @Override // kotlin.withOriginalAdCount
    public final long AudioAttributesCompatParcelizer() {
        try {
            return Companion.IconCompatParcelizer(this.read);
        } catch (PackageManager.NameNotFoundException unused) {
            return 1451606400000L;
        }
    }

    @Override // kotlin.withOriginalAdCount
    public final long IconCompatParcelizer() {
        try {
            return this.read.getPackageManager().getPackageInfo(this.read.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return 1451606400000L;
        }
    }

    /* JADX INFO: renamed from: o.withNewAdGroup$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/withNewAdGroup$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/app/Application;", "p0", "", "IconCompatParcelizer", "(Landroid/app/Application;)J"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static long IconCompatParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).firstInstallTime;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
