package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.work.CTFlushPushImpressionsWork;
import kotlin.e;
import kotlin.getChildIndexByWindowIndex;
import kotlin.onServiceDisconnected;

/* JADX INFO: loaded from: classes2.dex */
public final class getRemovedAdGroupCount {
    private final String IconCompatParcelizer;
    private final RendererWakeupListener RemoteActionCompatParcelizer;
    private final Context read;

    public getRemovedAdGroupCount(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        this.read = context;
        String strWrite = cleverTapInstanceConfig.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        this.IconCompatParcelizer = strWrite;
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListenerMediaBrowserCompatItemReceiver, "");
        this.RemoteActionCompatParcelizer = rendererWakeupListenerMediaBrowserCompatItemReceiver;
    }

    private final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.write(this.IconCompatParcelizer, "scheduling one time work request to flush push impressions...");
        try {
            onServiceDisconnected onservicedisconnectedWrite = new onServiceDisconnected.RemoteActionCompatParcelizer(CTFlushPushImpressionsWork.class).IconCompatParcelizer(new e.write().IconCompatParcelizer(ia.write).RemoteActionCompatParcelizer(true).AudioAttributesCompatParcelizer()).write();
            getChildIndexByWindowIndex.Companion companion = getChildIndexByWindowIndex.INSTANCE;
            getChildIndexByWindowIndex.Companion.RemoteActionCompatParcelizer(this.read).AudioAttributesCompatParcelizer("CTFlushPushImpressionsOneTime", g2.read, onservicedisconnectedWrite);
            this.RemoteActionCompatParcelizer.write(this.IconCompatParcelizer, "Finished scheduling one time work request to flush push impressions...");
        } catch (Throwable th) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        if (PlayerPlaybackSuppressionReason.write(this.read)) {
            Context context = this.read;
            if (RendererCapabilitiesListener.AudioAttributesCompatParcelizer(context, context.getPackageName())) {
                RemoteActionCompatParcelizer();
            }
        }
    }
}
