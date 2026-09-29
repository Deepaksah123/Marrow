package kotlin;

import java.util.Random;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda58;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B)\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB\u0011\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "message", "", "(Ljava/lang/String;)V", "format", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "toString", "Companion", "facebook-core_release"}, k = 1, mv = {1, 4, 0})
public class lambdaonMetadata50 extends RuntimeException {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(null);

    public lambdaonMetadata50() {
    }

    public lambdaonMetadata50(final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !lambdaonMediaMetadataChanged48.onAddQueueItem() || random.nextInt(100) <= 50) {
            return;
        }
        DefaultAnalyticsCollectorExternalSyntheticLambda58.write(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.ErrorReport, new DefaultAnalyticsCollectorExternalSyntheticLambda58.write() { // from class: o.lambdaonMetadata50.2
            @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda58.write
            public final void RemoteActionCompatParcelizer(boolean z) {
                if (z) {
                    try {
                        generateDefaultSessionId.read(str);
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    public lambdaonMetadata50(String str, Throwable th) {
        super(str, th);
    }

    public lambdaonMetadata50(Throwable th) {
        super(th);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message != null ? message : "";
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lambdaonMetadata50$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {1, 4, 0})
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
