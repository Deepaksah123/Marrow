package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdasetAnalyticsCollector21 extends lambdasetMediaSourceFactory17 {
    private final int AudioAttributesImplBaseParcelizer;
    private final lambdanew7 MediaBrowserCompatItemReceiver;
    public static final lambdasetAnalyticsCollector21 write = new lambdasetAnalyticsCollector21(lambdanew7.FALSE);
    public static final lambdasetAnalyticsCollector21 AudioAttributesCompatParcelizer = new lambdasetAnalyticsCollector21(lambdanew7.TRUE);
    public static final lambdasetAnalyticsCollector21 read = new lambdasetAnalyticsCollector21(lambdanew7.NULL);
    public static final lambdasetAnalyticsCollector21 IconCompatParcelizer = new lambdasetAnalyticsCollector21(lambdanew7.UNDEFINED);

    private lambdasetAnalyticsCollector21(lambdanew7 lambdanew7Var) {
        super(lambdasetLoadControl19.SIMPLE_VALUE);
        this.AudioAttributesImplBaseParcelizer = lambdanew7Var.IconCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = lambdanew7Var;
    }

    public lambdasetAnalyticsCollector21(int i) {
        super(i <= 23 ? lambdasetLoadControl19.SIMPLE_VALUE : lambdasetLoadControl19.SIMPLE_VALUE_NEXT_BYTE);
        this.AudioAttributesImplBaseParcelizer = i;
        this.MediaBrowserCompatItemReceiver = lambdanew7.RemoteActionCompatParcelizer(i);
    }

    public final lambdanew7 RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.lambdasetMediaSourceFactory17, kotlin.lambdanew10
    public final boolean equals(Object obj) {
        if (obj instanceof lambdasetAnalyticsCollector21) {
            return super.equals(obj) && this.AudioAttributesImplBaseParcelizer == ((lambdasetAnalyticsCollector21) obj).AudioAttributesImplBaseParcelizer;
        }
        return false;
    }

    @Override // kotlin.lambdasetMediaSourceFactory17, kotlin.lambdanew10
    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.AudioAttributesImplBaseParcelizer)) ^ super.hashCode();
    }

    @Override // kotlin.lambdasetMediaSourceFactory17
    public final String toString() {
        return this.MediaBrowserCompatItemReceiver.toString();
    }
}
