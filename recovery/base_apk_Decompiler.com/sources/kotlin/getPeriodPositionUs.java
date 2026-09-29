package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class getPeriodPositionUs {
    getPeriodPositionUs() {
    }

    @Deprecated
    static String RemoteActionCompatParcelizer(CleverTapInstanceConfig cleverTapInstanceConfig) {
        StringBuilder sb = new StringBuilder();
        sb.append(cleverTapInstanceConfig != null ? cleverTapInstanceConfig.write() : "");
        sb.append("[Product Config]");
        return sb.toString();
    }
}
