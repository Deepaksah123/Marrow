package in.juspay.hyper.constants;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hyper/constants/LogSubCategory;", "", "<init>", "()V", "Action", "ApiCall", "Context", "LifeCycle"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LogSubCategory {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lin/juspay/hyper/constants/LogSubCategory$Action;", "", "<init>", "()V", "", "DUI", "Ljava/lang/String;", "SYSTEM", "USER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Action {
        public static final String DUI = "dynamic_ui";
        public static final Action INSTANCE = new Action();
        public static final String SYSTEM = "system";
        public static final String USER = "user";

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lin/juspay/hyper/constants/LogSubCategory$LifeCycle;", "", "<init>", "()V", "", "ANDROID", "Ljava/lang/String;", "HYPER_SDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LifeCycle {
        public static final String ANDROID = "android";
        public static final String HYPER_SDK = "hypersdk";
        public static final LifeCycle INSTANCE = new LifeCycle();

        private LifeCycle() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lin/juspay/hyper/constants/LogSubCategory$ApiCall;", "", "<init>", "()V", "", "NETWORK", "Ljava/lang/String;", "SDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ApiCall {
        public static final ApiCall INSTANCE = new ApiCall();
        public static final String NETWORK = "network";
        public static final String SDK = "external_sdk";

        private ApiCall() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lin/juspay/hyper/constants/LogSubCategory$Context;", "", "<init>", "()V", "", "DEVICE", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Context {
        public static final String DEVICE = "device";
        public static final Context INSTANCE = new Context();

        private Context() {
        }
    }
}
