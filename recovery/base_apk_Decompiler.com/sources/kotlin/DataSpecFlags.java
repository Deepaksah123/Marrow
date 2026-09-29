package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/DataSpecFlags;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/setLength;", "p1", "", "read", "(Landroid/content/Context;Lo/setLength;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DataSpecFlags {
    public static final DataSpecFlags INSTANCE = new DataSpecFlags();

    private DataSpecFlags() {
    }

    public static void read(Context p0, setLength p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Bundle bundleWrite = p1.write();
        resumeLoad resumeload = resumeLoad.IconCompatParcelizer;
        RtspMediaPeriodSampleStreamImpl.write("c_session");
        FirebaseAnalytics.getInstance(p0).logEvent("c_session", bundleWrite);
    }
}
