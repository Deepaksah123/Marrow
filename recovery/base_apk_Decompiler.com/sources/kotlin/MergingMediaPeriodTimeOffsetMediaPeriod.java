package kotlin;

import android.os.Bundle;
import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/MergingMediaPeriodTimeOffsetMediaPeriod;", "", "<init>", "()V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MergingMediaPeriodTimeOffsetMediaPeriod {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.MergingMediaPeriodTimeOffsetMediaPeriod$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/MergingMediaPeriodTimeOffsetMediaPeriod$read;", "", "<init>", "()V", "", "p0", "p1", "", "p2", "", "p3", "p4", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void AudioAttributesCompatParcelizer(String p0, String p1, boolean p2, int p3, String p4) {
            Bundle bundle = new Bundle();
            bundle.putString("phone_number", p0);
            bundle.putString("country_code", p1);
            bundle.putString("success", String.valueOf(p2));
            if (p3 != -1) {
                bundle.putInt("error_code", p3);
            }
            if (p4 != null) {
                bundle.putString(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, p4);
            }
            getTrackGroup.AudioAttributesCompatParcelizer("phone_associate_complete", bundle);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
