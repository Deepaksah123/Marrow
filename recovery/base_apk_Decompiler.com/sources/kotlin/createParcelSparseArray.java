package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001ZB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u00100\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`3012\u0006\u00104\u001a\u000205J.\u00106\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`301J.\u00107\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`301J.\u00108\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`301J\u001e\u00109\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050:01J\u001e\u0010;\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050:01J\u001e\u0010<\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010:01J&\u0010=\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010:012\u0006\u0010>\u001a\u00020?JL\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010:2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u00052\b\u0010D\u001a\u0004\u0018\u00010\u00052\u0006\u0010E\u001a\u00020\u00052\b\b\u0002\u0010F\u001a\u0002052\b\u0010G\u001a\u0004\u0018\u00010\u0005H\u0007JX\u0010H\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`3012\b\u0010I\u001a\u0004\u0018\u00010\u00052\b\u0010J\u001a\u0004\u0018\u00010\u00052\b\u0010D\u001a\u0004\u0018\u00010\u00052\b\u0010K\u001a\u0004\u0018\u00010\u0005H\u0007J8\u0010L\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`3012\u0006\u0010M\u001a\u00020\u0005H\u0007J@\u0010N\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`3012\u0006\u0010D\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u0005H\u0007J\u001c\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010:2\u0006\u0010P\u001a\u00020BH\u0007JT\u0010Q\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000102j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`32\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u00052\b\u0010E\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010F\u001a\u0002052\b\u0010G\u001a\u0004\u0018\u00010\u0005H\u0007J&\u0010R\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050:012\u0006\u0010S\u001a\u00020\u0005J&\u0010T\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010:012\u0006\u0010U\u001a\u00020VJ&\u0010W\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010:012\u0006\u0010X\u001a\u00020YR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Lcom/marrow2/ui/onboarding/landing/analytics/OnboardLandingAnalytics;", "", "<init>", "()V", "EVENT_SIGNUP_CLICKED", "", "EVENT_LOGIN_CLICKED", "EVENT_NAME_LOGIN_ATTEMPTED", "EVENT_NAME_LOGIN_SUCCESSFUL", "EVENT_KEY_LOGIN_SOURCE", "PARAM_SIGNUP_MEDIUM", "EMAIL_MEDIUM", "DIRECT_LOGIN_MEDIUM", "PARAM_SOURCE", "EVENT_LOGIN_COMPLETE", "EVENT_OTP_RETRY", "EVENT_FORGOT_PASSWORD_CLICKED", "EVENT_NO_PHONE_ASSOCIATED_ACCOUNT", "EVENT_MULTIPLE_ACCOUNT_CLICKED", "EVENT_SIGNUP_COMPLETE", "PARAM_SUCCESS", "PARAM_ERROR_CODE", "PARAM_ERROR_MESSAGE", "PARAM_ACCOUNT_ID", "PARAM_COUNTRY_CODE", "PARAM_OTP_RETRY_MODE", "PARAM_PHONE_NUMBER", "PARAM_IS_PRO", "EVENT_SIGNUP_GOOGLE", "EVENT_SIGN_IN_GOOGLE", "EVENT_CANCEL_CLICK", "EVENT_GOOGLE_FAILURE", "PARAM_PLATFORM", "PARAM_CLICK_COUNT", "EVENT_NAME_CHROME_DETECTION", "EVENT_KEY_HAS_SYSTEM_FEATURE", "EVENT_KEY_IS_CHROME_OS_BY_BUILD_PROPERTIES", "EVENT_KEY_HAS_VIRTUALIZATION_CPU_FLAGS", "EVENT_KEY_HAS_ARC_SPECIFIC_FILES", "EVENT_KEY_HAS_ARC_PROCESSES_OR_SERVICES", "EVENT_KEY_IS_CHROME_OS_BY_HEURISTICS", "EVENT_NAME_SOURCE_INSTALLER_INFO", "EVENT_KEY_SHOW_PLAYSTORE_DIALOG", "EVENT_KEY_INSTALLING_PACKAGE", "EVENT_KEY_INITIATING_PACKAGE", "EVENT_KEY_ORIGINATING_PACKAGE", "EVENT_KEY_LEGACY_INSTALLER", "EVENT_KEY_ERROR", "googleLoginCancelled", "Lkotlin/Pair;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "count", "", "googleInitFailure", "signUpWithGoogle", "signInWithGoogle", "onSingUpClickedEvent", "", "onLoginClickedEvent", "loginAttempted", "loginSuccessful", "loginSource", "Lcom/marrow2/ui/onboarding/landing/analytics/OnboardLandingAnalytics$LoginSource;", "loginCompleteEvent", "success", "", "accountId", "countryCode", "medium", "errorCode", "errorMessage", "otpRetryEvent", FilterParams.KEY_MODE, "source", "phoneNumber", "forgotPasswordClickedEvent", "email", "noAccountAssociatedEvent", "multipleAccountsClickedEvent", "isPro", "signupCompleteEvent", "signupCompleteFbEvent", "time", "logChromeOsDetection", "result", "Lcom/marrow/utils/ChromeOsDetectionResult;", "logSourceInstallerInfo", "info", "Lcom/marrow/utils/SourceInstallerInfoData;", "LoginSource", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createParcelSparseArray {
    public static final createParcelSparseArray write = new createParcelSparseArray();

    private createParcelSparseArray() {
    }

    public static Pair<String, HashMap<String, String>> write(int i) {
        HashMap map = new HashMap();
        map.put("click_count", String.valueOf(i));
        return new Pair<>("cancel_click", map);
    }

    public static Pair<String, HashMap<String, String>> RemoteActionCompatParcelizer() {
        HashMap map = new HashMap();
        map.put("click_count", "Fail");
        return new Pair<>("google_failure", map);
    }

    public static Pair<String, HashMap<String, String>> AudioAttributesCompatParcelizer() {
        HashMap map = new HashMap();
        map.put("platform", "Platform-Android");
        return new Pair<>("signup_google", map);
    }

    public static Pair<String, HashMap<String, String>> write() {
        HashMap map = new HashMap();
        map.put("platform", "Platform-Android");
        return new Pair<>("signin_google", map);
    }

    public static Pair<String, Map<String, String>> read() {
        HashMap map = new HashMap();
        map.put("medium", "email");
        return new Pair<>("signup", map);
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer() {
        return new Pair<>("login_attempted", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        String lowerCase = iconCompatParcelizer.name().toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return new Pair<>("login_successful", VideoTimelineResponseBody.read(setAction.write("source", lowerCase)));
    }

    @getMagicModuleMeta
    public static final Map<String, Object> read(String str, String str2, String str3, int i, String str4) {
        toMagicModuleMetaRepoModel.write(str3, "");
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        map.put("account", str);
        map.put("success", Boolean.TRUE);
        map.put("medium", str3);
        if (str2 != null) {
            map.put("country_code", str2);
        }
        if (i != -1) {
            map.put("error_code", Integer.valueOf(i));
        }
        if (str4 != null) {
            map.put(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, str4);
        }
        return map;
    }

    @getMagicModuleMeta
    public static final Pair<String, HashMap<String, String>> AudioAttributesCompatParcelizer(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put(FilterParams.KEY_MODE, str);
        map.put("source", str2);
        if (str3 == null) {
            str3 = "";
        }
        map.put("country_code", str3);
        if (str4 == null) {
            str4 = "";
        }
        map.put("phone_number", str4);
        return new Pair<>("otp_retry", map);
    }

    @getMagicModuleMeta
    public static final Pair<String, HashMap<String, String>> RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        HashMap map = new HashMap();
        map.put("account", str);
        return new Pair<>("forgot_password", map);
    }

    @getMagicModuleMeta
    public static final Pair<String, HashMap<String, String>> read(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        HashMap map = new HashMap();
        map.put("country_code", str);
        map.put("phone_number", str2);
        return new Pair<>("no_acc_phone", map);
    }

    @getMagicModuleMeta
    public static final Map<String, Object> RemoteActionCompatParcelizer(boolean z) {
        HashMap map = new HashMap();
        map.put("is_pro", String.valueOf(z));
        return map;
    }

    @getMagicModuleMeta
    public static final HashMap<String, Object> read(boolean z, String str, String str2, int i, String str3) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("success", Boolean.valueOf(z));
        if (str == null) {
            str = "";
        }
        map.put("account", str);
        if (str2 == null) {
            str2 = "";
        }
        map.put("medium", str2);
        if (i != -1) {
            map.put("error_code", Integer.valueOf(i));
        }
        if (str3 != null) {
            map.put(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, str3);
        }
        return map;
    }

    public static Pair<String, Map<String, String>> read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        HashMap map = new HashMap();
        map.put(RtspHeaders.DATE, str);
        return new Pair<>("signup_complete", map);
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(buildLanguageString buildlanguagestring) {
        toMagicModuleMetaRepoModel.write(buildlanguagestring, "");
        return new Pair<>("chrome_detection", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("has_system_feature", Boolean.valueOf(buildlanguagestring.RemoteActionCompatParcelizer())), setAction.write("is_chrome_os_by_build_properties", Boolean.valueOf(buildlanguagestring.read())), setAction.write("has_virtualization_cpu_flags", Boolean.valueOf(buildlanguagestring.AudioAttributesCompatParcelizer())), setAction.write("has_arc_specific_files", Boolean.valueOf(buildlanguagestring.IconCompatParcelizer())), setAction.write("has_arc_processes_or_services", Boolean.valueOf(buildlanguagestring.write())), setAction.write("is_chrome_os_by_heuristics", Boolean.valueOf(buildlanguagestring.MediaBrowserCompatCustomActionResultReceiver()))));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(seekToTimeBarPosition seektotimebarposition) {
        toMagicModuleMetaRepoModel.write(seektotimebarposition, "");
        return new Pair<>("source_installer_info", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("show_playstore_dialog", Boolean.TRUE), setAction.write("installing_package", seektotimebarposition.getRemoteActionCompatParcelizer()), setAction.write("initiating_package", seektotimebarposition.getAudioAttributesCompatParcelizer()), setAction.write("originating_package", seektotimebarposition.getRead()), setAction.write("legacy_installer_package", seektotimebarposition.getIconCompatParcelizer()), setAction.write("error", seektotimebarposition.getWrite())));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/createParcelSparseArray$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private static final /* synthetic */ IconCompatParcelizer[] read;
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer("PHONE_NUMBER", 0);
        public static final IconCompatParcelizer write = new IconCompatParcelizer("EMAIL", 1);
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer("GOOGLE", 2);

        private IconCompatParcelizer(String str, int i) {
        }

        static {
            IconCompatParcelizer[] iconCompatParcelizerArrIconCompatParcelizer = IconCompatParcelizer();
            read = iconCompatParcelizerArrIconCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(iconCompatParcelizerArrIconCompatParcelizer);
        }

        private static final /* synthetic */ IconCompatParcelizer[] IconCompatParcelizer() {
            return new IconCompatParcelizer[]{AudioAttributesCompatParcelizer, write, RemoteActionCompatParcelizer};
        }

        public static IconCompatParcelizer valueOf(String str) {
            return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
        }

        public static IconCompatParcelizer[] values() {
            return (IconCompatParcelizer[]) read.clone();
        }
    }
}
