package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.security.SecureRandom;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\r\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\r\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001cJ\u001d\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010 R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0011\u0010\r\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\u0006\n\u0004\b\r\u0010#R\u0011\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010$"}, d2 = {"Lo/getMutedFromManager;", "", "Landroid/content/Context;", "p0", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p1", "Lkotlin/Function0;", "", "p2", "Lo/onDroppedVideoFrames;", "p3", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lo/getCreatedOnDateMs;Lo/onDroppedVideoFrames;)V", "write", "()I", "", "(I)V", "IconCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "", "AudioAttributesImplApi21Parcelizer", "()Z", "AudioAttributesImplBaseParcelizer", "RemoteActionCompatParcelizer", "(Z)V", "", "(Ljava/lang/String;)V", "read", "()Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "(II)I", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Lo/getCreatedOnDateMs;", "Lo/onDroppedVideoFrames;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMutedFromManager {
    private final onDroppedVideoFrames AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final CleverTapInstanceConfig write;
    private final Context RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCreatedOnDateMs<Integer> read;

    private getMutedFromManager(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, getCreatedOnDateMs<Integer> getcreatedondatems, onDroppedVideoFrames ondroppedvideoframes) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(ondroppedvideoframes, "");
        this.RemoteActionCompatParcelizer = context;
        this.write = cleverTapInstanceConfig;
        this.read = getcreatedondatems;
        this.AudioAttributesCompatParcelizer = ondroppedvideoframes;
    }

    public /* synthetic */ getMutedFromManager(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, getCreatedOnDateMs getcreatedondatems, onDroppedVideoFrames ondroppedvideoframes, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, cleverTapInstanceConfig, (i & 4) != 0 ? new getCreatedOnDateMs() { // from class: o.getMaxVolume
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Integer.valueOf(getMutedFromManager.MediaBrowserCompatItemReceiver());
            }
        } : getcreatedondatems, (i & 8) != 0 ? onDroppedVideoFrames.IconCompatParcelizer : ondroppedvideoframes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MediaBrowserCompatItemReceiver() {
        return (new SecureRandom().nextInt(10) + 1) * 1000;
    }

    public final int write() {
        return RendererCapabilitiesFormatSupport.write(this.RemoteActionCompatParcelizer, this.write, "comms_first_ts");
    }

    public final void write(int p0) {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "comms_first_ts"), p0);
    }

    public final void IconCompatParcelizer() {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "comms_first_ts"), 0);
    }

    public final void AudioAttributesCompatParcelizer(int p0) {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "comms_last_ts"), p0);
    }

    public final void AudioAttributesCompatParcelizer() {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "comms_last_ts"), 0);
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return RendererCapabilitiesFormatSupport.write(this.RemoteActionCompatParcelizer, this.write, "comms_last_ts");
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer() - AudioAttributesImplBaseParcelizer() < 86400;
    }

    private int AudioAttributesImplBaseParcelizer() {
        return RendererCapabilitiesFormatSupport.write(this.RemoteActionCompatParcelizer, this.write, "comms_mtd");
    }

    public final void RemoteActionCompatParcelizer(boolean p0) {
        if (p0) {
            RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "comms_mtd"), this.AudioAttributesCompatParcelizer.IconCompatParcelizer());
        } else {
            RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "comms_mtd"), 0);
        }
    }

    public final void write(String p0) {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "comms_dmn"), p0);
    }

    public final String read() {
        return RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, "comms_dmn", null);
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, "comms_dmn_spiky", null);
    }

    public final void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "comms_dmn_spiky"), p0);
    }

    public final int RemoteActionCompatParcelizer(int p0, int p1) {
        this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Network retry #".concat(String.valueOf(p1)));
        if (p1 < 10) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.write.MediaBrowserCompatItemReceiver();
            String strWrite = this.write.write();
            StringBuilder sb = new StringBuilder("Failure count is ");
            sb.append(p1);
            sb.append(". Setting delay frequency to 1s");
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
            return 1000;
        }
        if (this.write.AudioAttributesCompatParcelizer() == null) {
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Setting delay frequency to 1s");
            return 1000;
        }
        int iIntValue = this.read.invoke().intValue() + p0;
        if (iIntValue >= 600000) {
            return 1000;
        }
        this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Setting delay frequency to ".concat(String.valueOf(p0)));
        return iIntValue;
    }
}
