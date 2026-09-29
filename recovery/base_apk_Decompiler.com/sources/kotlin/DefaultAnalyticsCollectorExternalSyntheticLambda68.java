package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\"\u00020\u0001¢\u0006\u0002\u0010\u0017J\u0012\u0010\u0011\u001a\u00020\u00122\n\u0010\u0018\u001a\u00060\bj\u0002`\tJ\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0001J\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/facebook/internal/Logger;", "", "behavior", "Lcom/facebook/LoggingBehavior;", "tag", "", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V", "contents", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "priority", "getPriority", "()I", "setPriority", "(I)V", "append", "", "string", "format", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "stringBuilder", "appendKeyValue", "key", "getContents", "log", "logString", "shouldLog", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda68 {
    private final lambdaonPositionDiscontinuity43 AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private StringBuilder IconCompatParcelizer;
    private int write;
    public static final read read = new read(null);
    private static final HashMap<String, String> RemoteActionCompatParcelizer = new HashMap<>();

    public DefaultAnalyticsCollectorExternalSyntheticLambda68(lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43, String str) {
        toMagicModuleMetaRepoModel.write(lambdaonpositiondiscontinuity43, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = 3;
        DefaultAnalyticsCollectorExternalSyntheticLambda8.write(str, "tag");
        this.AudioAttributesCompatParcelizer = lambdaonpositiondiscontinuity43;
        this.AudioAttributesImplApi26Parcelizer = "FacebookSDK.".concat(String.valueOf(str));
        this.IconCompatParcelizer = new StringBuilder();
    }

    public final void IconCompatParcelizer() {
        String string = this.IconCompatParcelizer.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        RemoteActionCompatParcelizer(string);
        this.IconCompatParcelizer = new StringBuilder();
    }

    private void RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        read.read(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, str);
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (read()) {
            this.IconCompatParcelizer.append(str);
        }
    }

    private void read(String str, Object... objArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(objArr, "");
        if (read()) {
            StringBuilder sb = this.IconCompatParcelizer;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            sb.append(str2);
        }
    }

    public final void write(String str, Object obj) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        read("  %s:\t%s\n", str, obj);
    }

    private final boolean read() {
        return lambdaonMediaMetadataChanged48.write(this.AudioAttributesCompatParcelizer);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007JA\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/internal/Logger$Companion;", "", "()V", "LOG_TAG_BASE", "", "stringsToReplace", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "log", "", "behavior", "Lcom/facebook/LoggingBehavior;", "priority", "", "tag", "string", "format", "args", "", "(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "registerAccessToken", "accessToken", "registerStringToReplace", "original", "replace", "replaceStrings", "facebook-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        private void read(String str, String str2) {
            synchronized (this) {
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(str2, "");
                DefaultAnalyticsCollectorExternalSyntheticLambda68.RemoteActionCompatParcelizer.put(str, str2);
            }
        }

        @getMagicModuleMeta
        public final void IconCompatParcelizer(String str) {
            synchronized (this) {
                toMagicModuleMetaRepoModel.write(str, "");
                if (!lambdaonMediaMetadataChanged48.write(lambdaonPositionDiscontinuity43.INCLUDE_ACCESS_TOKENS)) {
                    read readVar = this;
                    read(str, "ACCESS_TOKEN_REMOVED");
                }
            }
        }

        @getMagicModuleMeta
        public final void IconCompatParcelizer(lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43, String str, String str2) {
            toMagicModuleMetaRepoModel.write(lambdaonpositiondiscontinuity43, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            read(lambdaonpositiondiscontinuity43, str, str2);
        }

        @getMagicModuleMeta
        public final void RemoteActionCompatParcelizer(lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43, String str, String str2, Object... objArr) {
            toMagicModuleMetaRepoModel.write(lambdaonpositiondiscontinuity43, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(objArr, "");
            if (lambdaonMediaMetadataChanged48.write(lambdaonpositiondiscontinuity43)) {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str3 = String.format(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                read(lambdaonpositiondiscontinuity43, str, str3);
            }
        }

        @getMagicModuleMeta
        public final void IconCompatParcelizer(lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43, String str, String str2, Object... objArr) {
            toMagicModuleMetaRepoModel.write(lambdaonpositiondiscontinuity43, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(objArr, "");
            if (lambdaonMediaMetadataChanged48.write(lambdaonpositiondiscontinuity43)) {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str3 = String.format(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                read(lambdaonpositiondiscontinuity43, str, str3);
            }
        }

        @getMagicModuleMeta
        public final void read(lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43, String str, String str2) {
            toMagicModuleMetaRepoModel.write(lambdaonpositiondiscontinuity43, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            if (lambdaonMediaMetadataChanged48.write(lambdaonpositiondiscontinuity43)) {
                AudioAttributesCompatParcelizer(str2);
                TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "FacebookSDK.");
                if (lambdaonpositiondiscontinuity43 == lambdaonPositionDiscontinuity43.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        private final String AudioAttributesCompatParcelizer(String str) {
            synchronized (this) {
                for (Map.Entry entry : DefaultAnalyticsCollectorExternalSyntheticLambda68.RemoteActionCompatParcelizer.entrySet()) {
                    str = TestGroupLSModel.read(str, (String) entry.getKey(), (String) entry.getValue(), false);
                }
            }
            return str;
        }
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43, String str, String str2) {
        read.IconCompatParcelizer(lambdaonpositiondiscontinuity43, str, str2);
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43, String str, String str2, Object... objArr) {
        read.RemoteActionCompatParcelizer(lambdaonpositiondiscontinuity43, str, str2, objArr);
    }
}
