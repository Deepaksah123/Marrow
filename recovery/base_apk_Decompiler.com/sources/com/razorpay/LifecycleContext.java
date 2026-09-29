package com.razorpay;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.RenewEligibleCreator;
import kotlin.TestGroupLSModel;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/razorpay/LifecycleContext;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "p1", "format", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "getTemplate", "()Ljava/lang/String;", "contextTemplate", "Ljava/lang/String;", "Companion", "REDIRECTING_TO_APP", "REDIRECTING_USING_SCHEME"}, k = 1, mv = {1, 6, 0}, xi = 48)
public enum LifecycleContext {
    REDIRECTING_TO_APP("Redirecting to {package_name} app."),
    REDIRECTING_USING_SCHEME("Redirecting using {scheme} scheme.");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String contextTemplate;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LifecycleContext.values().length];
            iArr[LifecycleContext.REDIRECTING_TO_APP.ordinal()] = 1;
            iArr[LifecycleContext.REDIRECTING_USING_SCHEME.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    LifecycleContext(String str) {
        this.contextTemplate = str;
    }

    /* JADX INFO: renamed from: getTemplate, reason: from getter */
    public final String getContextTemplate() {
        return this.contextTemplate;
    }

    public final String format(String p0) {
        if (p0 == null) {
            p0 = "null";
        }
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return TestGroupLSModel.read(this.contextTemplate, "{package_name}", p0, false);
        }
        if (i == 2) {
            return TestGroupLSModel.read(this.contextTemplate, "{scheme}", p0, false);
        }
        throw new RenewEligibleCreator();
    }

    public final String format(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 == null) {
            p1 = "null";
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append(p0);
        sb.append('}');
        return TestGroupLSModel.read(this.contextTemplate, sb.toString(), p1, false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Lcom/razorpay/LifecycleContext$Companion;", "", "<init>", "()V", "", "p0", "redirectingToApp", "(Ljava/lang/String;)Ljava/lang/String;", "redirectingUsingScheme"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final String redirectingToApp(String p0) {
            return LifecycleContext.REDIRECTING_TO_APP.format("package_name", p0);
        }

        @getMagicModuleMeta
        public final String redirectingUsingScheme(String p0) {
            return LifecycleContext.REDIRECTING_USING_SCHEME.format("scheme", p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final String redirectingToApp(String str) {
        return INSTANCE.redirectingToApp(str);
    }

    @getMagicModuleMeta
    public static final String redirectingUsingScheme(String str) {
        return INSTANCE.redirectingUsingScheme(str);
    }
}
