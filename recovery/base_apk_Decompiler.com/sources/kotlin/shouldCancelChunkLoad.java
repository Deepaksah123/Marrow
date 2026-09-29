package kotlin;

import android.os.Bundle;
import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/shouldCancelChunkLoad;", "", "<init>", "()V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class shouldCancelChunkLoad {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.shouldCancelChunkLoad$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/shouldCancelChunkLoad$write;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "", "p0", "", "p1", "read", "(ILjava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void RemoteActionCompatParcelizer() {
            Bundle bundle = new Bundle();
            bundle.putString("logout", "Manual");
            bundle.putInt("error_code", -1);
            bundle.putString(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, "");
            getTrackGroup.AudioAttributesCompatParcelizer("Logout", bundle);
        }

        @getMagicModuleMeta
        public static void read(int p0, String p1) {
            Bundle bundle = new Bundle();
            bundle.putString("logout", "Auto");
            bundle.putInt("error_code", p0);
            if (p1 == null) {
                p1 = "";
            }
            bundle.putString(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, p1);
            getTrackGroup.AudioAttributesCompatParcelizer("Logout", bundle);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final void read(int i, String str) {
        Companion.read(i, str);
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer() {
        Companion.RemoteActionCompatParcelizer();
    }
}
