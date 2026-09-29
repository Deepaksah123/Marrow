package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class getNextPeriodIndex {
    @Deprecated
    public static getPeriodPosition read(Context context, getChildTimelines getchildtimelines, CleverTapInstanceConfig cleverTapInstanceConfig, PlayerCommandsExternalSyntheticLambda0 playerCommandsExternalSyntheticLambda0, copyWithPlaceholderTimeline copywithplaceholdertimeline, addAllCommands addallcommands) {
        String strMediaBrowserCompatCustomActionResultReceiver = getchildtimelines.MediaBrowserCompatCustomActionResultReceiver();
        AnalyticsListenerEventTime analyticsListenerEventTime = new AnalyticsListenerEventTime(context, cleverTapInstanceConfig);
        return new getPeriodPosition(context, cleverTapInstanceConfig, playerCommandsExternalSyntheticLambda0, copywithplaceholdertimeline, addallcommands, new generateUnshuffledIndices(strMediaBrowserCompatCustomActionResultReceiver, cleverTapInstanceConfig, analyticsListenerEventTime), analyticsListenerEventTime);
    }
}
