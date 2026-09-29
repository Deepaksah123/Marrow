package kotlin;

import com.marrow.designsystem.theme.AppTheme;
import in.juspay.hypersdk.analytics.LogConstants;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000b0\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/setTopInsetScrimEnabled;", "", "<init>", "()V", "Lcom/marrow/designsystem/theme/AppTheme;", "", "AudioAttributesCompatParcelizer", "(Lcom/marrow/designsystem/theme/AppTheme;)Ljava/lang/String;", "p0", "p1", "Lo/getSubscriptionExpiresOn;", "", "write", "(Lcom/marrow/designsystem/theme/AppTheme;Lcom/marrow/designsystem/theme/AppTheme;)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setTopInsetScrimEnabled {
    public static final setTopInsetScrimEnabled INSTANCE = new setTopInsetScrimEnabled();

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[AppTheme.values().length];
            try {
                iArr[AppTheme.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppTheme.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppTheme.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    private setTopInsetScrimEnabled() {
    }

    private static String AudioAttributesCompatParcelizer(AppTheme appTheme) {
        int i = write.RemoteActionCompatParcelizer[appTheme.ordinal()];
        if (i == 1) {
            return LogConstants.DEFAULT_CHANNEL;
        }
        if (i != 2) {
            return i != 3 ? LogConstants.DEFAULT_CHANNEL : "sepia";
        }
        return "dark";
    }

    public static Pair<String, Map<String, Object>> write(AppTheme p0, AppTheme p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new Pair<>("settings_theme_changed", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("previous_theme", AudioAttributesCompatParcelizer(p0)), setAction.write("next_theme", AudioAttributesCompatParcelizer(p1))));
    }
}
