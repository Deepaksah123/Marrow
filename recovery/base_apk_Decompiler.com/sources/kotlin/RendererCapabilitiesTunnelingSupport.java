package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class RendererCapabilitiesTunnelingSupport extends removeIf {
    private final r8lambda3EoLwxJB4A25pAog2xOLUUC2nk AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private final copyWithPlaceholderTimeline IconCompatParcelizer;
    private final lambdaonAudioDecoderInitialized4 MediaBrowserCompatItemReceiver;
    private long RemoteActionCompatParcelizer = 0;
    private final CleverTapInstanceConfig read;
    private int write;

    public RendererCapabilitiesTunnelingSupport(CleverTapInstanceConfig cleverTapInstanceConfig, copyWithPlaceholderTimeline copywithplaceholdertimeline, lambdaonAudioDecoderInitialized4 lambdaonaudiodecoderinitialized4, r8lambda3EoLwxJB4A25pAog2xOLUUC2nk r8lambda3eolwxjb4a25paog2xoluuc2nk) {
        this.read = cleverTapInstanceConfig;
        this.IconCompatParcelizer = copywithplaceholdertimeline;
        this.MediaBrowserCompatItemReceiver = lambdaonaudiodecoderinitialized4;
        this.AudioAttributesCompatParcelizer = r8lambda3eolwxjb4a25paog2xoluuc2nk;
    }

    public final void IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer <= 0 || System.currentTimeMillis() - this.RemoteActionCompatParcelizer <= 1200000) {
            return;
        }
        this.read.MediaBrowserCompatItemReceiver().write(this.read.write(), "Session Timed Out");
        read();
    }

    public final void read() {
        this.IconCompatParcelizer.write(0);
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(false);
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(false);
        if (this.IconCompatParcelizer.onPrepare()) {
            this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(false);
        }
        this.read.MediaBrowserCompatItemReceiver().write(this.read.write(), "Session destroyed; Session ID is now 0");
        this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
        this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        this.IconCompatParcelizer.MediaDescriptionCompat();
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    public final void RemoteActionCompatParcelizer(Context context) {
        if (this.IconCompatParcelizer.onPlayFromMediaId()) {
            return;
        }
        this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(true);
        lambdaonAudioDecoderInitialized4 lambdaonaudiodecoderinitialized4 = this.MediaBrowserCompatItemReceiver;
        if (lambdaonaudiodecoderinitialized4 != null) {
            lambdaonaudiodecoderinitialized4.IconCompatParcelizer((ArrayList<String>) null);
        }
        AudioAttributesCompatParcelizer(context);
    }

    final void AudioAttributesCompatParcelizer() {
        lambdasetShuffleModeEnabled9 lambdasetshufflemodeenabled9IconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer("App Launched");
        if (lambdasetshufflemodeenabled9IconCompatParcelizer == null) {
            this.write = -1;
        } else {
            this.write = lambdasetshufflemodeenabled9IconCompatParcelizer.read();
        }
    }

    final void write() {
        notifySeekStarted notifyseekstartedMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver("App Launched");
        this.AudioAttributesImplApi21Parcelizer = notifyseekstartedMediaBrowserCompatItemReceiver != null ? notifyseekstartedMediaBrowserCompatItemReceiver.IconCompatParcelizer() : -1L;
    }

    private void AudioAttributesCompatParcelizer(Context context) {
        this.IconCompatParcelizer.write(RemoteActionCompatParcelizer());
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
        String strWrite = this.read.write();
        StringBuilder sb = new StringBuilder("Session created with ID: ");
        sb.append(this.IconCompatParcelizer.RatingCompat());
        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
        SharedPreferences sharedPreferences = RendererCapabilitiesFormatSupport.read(context);
        int iWrite = RendererCapabilitiesFormatSupport.write(context, this.read, "lastSessionId");
        int iWrite2 = RendererCapabilitiesFormatSupport.write(context, this.read, "sexe");
        if (iWrite2 > 0) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite2 - iWrite);
        }
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.read.MediaBrowserCompatItemReceiver();
        String strWrite2 = this.read.write();
        StringBuilder sb2 = new StringBuilder("Last session length: ");
        sb2.append(this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        sb2.append(" seconds");
        rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strWrite2, sb2.toString());
        if (iWrite == 0) {
            this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(true);
        }
        RendererCapabilitiesFormatSupport.write(sharedPreferences.edit().putInt(RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.read, "lastSessionId"), this.IconCompatParcelizer.RatingCompat()));
    }

    private static int RemoteActionCompatParcelizer() {
        return (int) (System.currentTimeMillis() / 1000);
    }
}
