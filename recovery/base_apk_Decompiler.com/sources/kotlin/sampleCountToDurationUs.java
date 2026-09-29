package kotlin;

import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0010\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0012j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/marrow2/ui/NotificationAnalytics;", "", "<init>", "()V", "PARAM_SOURCE", "", "EVENT_NOTIFICATION_PERMISSION_STATUS", "PARAM_NOTIFICATION_PERMISSION_USER_CHOICE", "PARAM_NOTIFICATION_PERMISSION_USER_CHOICE_UNDEFINED", "PARAM_NOTIFICATION_PERMISSION_USER_CHOICE_ALLOWED", "PARAM_NOTIFICATION_PERMISSION_USER_CHOICE_DENIED", "PARAM_NOTIFICATION_PERMISSION_SCREEN", "SCREEN_LOGIN", "SCREEN_HOME", "SOURCE_NOTIFICATION_PERMISSION_OS_DIALOG", "SOURCE_NOTIFICATION_PERMISSION_SNACKBAR", "notificationPermissionGranted", "Lkotlin/Pair;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "isGranted", "", "source", PaymentConstants.Event.SCREEN, "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class sampleCountToDurationUs {
    public static final sampleCountToDurationUs write = new sampleCountToDurationUs();

    private sampleCountToDurationUs() {
    }

    public static Pair<String, HashMap<String, Object>> IconCompatParcelizer(boolean z, String str, String str2) {
        String str3;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("source", str);
        map2.put("screen_name", str2);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "snackbar")) {
            str3 = "enable";
        } else {
            str3 = z ? "allow" : "don't_allow";
        }
        map2.put("user_choice", str3);
        return new Pair<>("app_notification_permissions", map);
    }
}
