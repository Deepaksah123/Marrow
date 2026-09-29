package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes2.dex */
final class getAdaptiveSupport extends PlayerDiscontinuityReason {
    private final Context AudioAttributesCompatParcelizer;
    private final RendererWakeupListener AudioAttributesImplApi21Parcelizer;
    private final copyWithPlaceholderTimeline AudioAttributesImplApi26Parcelizer;
    private final CleverTapInstanceConfig RemoteActionCompatParcelizer;
    private final lambdasetVideoSurface17 write;
    private int read = 0;
    private int IconCompatParcelizer = 0;

    getAdaptiveSupport(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, copyWithPlaceholderTimeline copywithplaceholdertimeline, lambdasetVideoSurface17 lambdasetvideosurface17) {
        this.AudioAttributesCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = cleverTapInstanceConfig;
        this.AudioAttributesImplApi21Parcelizer = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.AudioAttributesImplApi26Parcelizer = copywithplaceholdertimeline;
        this.write = lambdasetvideosurface17;
    }
}
