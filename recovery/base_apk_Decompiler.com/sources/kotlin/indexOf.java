package kotlin;

import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/indexOf;", "", "<init>", "()V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class indexOf {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.indexOf$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J$\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00112\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/marrow/analytics/FirebaseErrorEvents$Companion;", "", "<init>", "()V", "ERROR_TYPE", "", "ERROR_EVENT", "EX_CLASS", "EX_MSG", "EX_VERSION", "EX_VERSION_ID", "", "error", "", "type", "bundle", "Landroid/os/Bundle;", "", "callAnalytics", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
            toMagicModuleMetaRepoModel.write(bundle, "");
            if (str == null) {
                str = "NA";
            }
            bundle.putString("er_type", str);
            if (bundle.getString("ex_class") == null) {
                bundle.putString("ex_class", "NA");
            }
            if (bundle.getString("ex_msg") == null) {
                bundle.putString("ex_msg", "NA");
            }
            AudioAttributesCompatParcelizer(bundle);
        }

        @getMagicModuleMeta
        public static void AudioAttributesCompatParcelizer(String str, Throwable th, Bundle bundle) {
            toMagicModuleMetaRepoModel.write(th, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
            if (str == null) {
                str = "NA";
            }
            bundle.putString("er_type", str);
            bundle.putString("ex_class", th.getClass().getCanonicalName());
            bundle.putString("ex_msg", th.getMessage());
            AudioAttributesCompatParcelizer(bundle);
        }

        @getMagicModuleMeta
        private static void AudioAttributesCompatParcelizer(Bundle bundle) {
            bundle.putInt("ex_ver", 1);
            getTrackGroup.AudioAttributesCompatParcelizer("er_event", bundle);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(String str, Bundle bundle) {
        Companion.AudioAttributesCompatParcelizer(str, bundle);
    }
}
