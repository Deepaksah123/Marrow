package com.google.android.exoplayer2.analytics;

import android.os.Process;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda19 implements ListenerSet.IterationFinishedEvent {
    public static int AudioAttributesCompatParcelizer;
    public static int IconCompatParcelizer;
    public final /* synthetic */ DefaultAnalyticsCollector f$0;
    public final /* synthetic */ Player f$1;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda19(DefaultAnalyticsCollector defaultAnalyticsCollector, Player player) {
        this.f$0 = defaultAnalyticsCollector;
        this.f$1 = player;
    }

    public static int AudioAttributesCompatParcelizer() {
        int i = IconCompatParcelizer;
        int i2 = i % 9991218;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int iMyUid = Process.myUid();
        AudioAttributesCompatParcelizer = iMyUid;
        return iMyUid;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public final void invoke(Object obj, FlagSet flagSet) {
        this.f$0.m61lambda$setPlayer$1$comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector(this.f$1, (AnalyticsListener) obj, flagSet);
    }
}
