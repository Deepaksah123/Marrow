package kotlin;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/setComponentEnabledSetting;", "", "Landroid/content/Context;", "p0", "Lo/queryIntentServices;", "p1", "Lo/getSystemSharedLibraryNames;", "read", "(Landroid/content/Context;Lo/queryIntentServices;)Lo/getSystemSharedLibraryNames;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setComponentEnabledSetting {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    getSystemSharedLibraryNames read(Context p0, queryIntentServices p1);

    /* JADX INFO: renamed from: o.setComponentEnabledSetting$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setComponentEnabledSetting$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/setComponentEnabledSetting;", "AudioAttributesCompatParcelizer", "()Lo/setComponentEnabledSetting;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();

        private Companion() {
        }

        public final setComponentEnabledSetting AudioAttributesCompatParcelizer() {
            if (Build.VERSION.SDK_INT >= 34) {
                return setApplicationEnabledSetting.INSTANCE;
            }
            return Build.VERSION.SDK_INT >= 30 ? resolveContentProvider.INSTANCE : C0161c.INSTANCE;
        }
    }
}
