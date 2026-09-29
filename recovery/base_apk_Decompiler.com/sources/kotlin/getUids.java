package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class getUids {
    private final addAllCommands AudioAttributesCompatParcelizer;
    private final PlayerListener AudioAttributesImplApi21Parcelizer;

    @Deprecated
    private lambdasetVideoTextureView20 AudioAttributesImplApi26Parcelizer;
    private SimpleBasePlayerPositionSupplier AudioAttributesImplBaseParcelizer;
    private final Context IconCompatParcelizer;
    private lambdaonAudioAttributesChanged55 MediaBrowserCompatCustomActionResultReceiver;

    @Deprecated
    private getPeriodPosition MediaBrowserCompatItemReceiver;
    private final getChildTimelines MediaBrowserCompatMediaItem;
    private Rfont MediaDescriptionCompat;
    private lambdaupdateStateAndInformListeners45 MediaMetadataCompat;
    private getContentResumeOffsetUs RatingCompat;
    private lambdasetPlayWhenReady1 RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig read;
    private final lambdaprepare7 write;

    public getUids(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, PlayerListener playerListener, addAllCommands addallcommands, getChildTimelines getchildtimelines, lambdaprepare7 lambdaprepare7Var) {
        this.read = cleverTapInstanceConfig;
        this.AudioAttributesImplApi21Parcelizer = playerListener;
        this.AudioAttributesCompatParcelizer = addallcommands;
        this.MediaBrowserCompatMediaItem = getchildtimelines;
        this.IconCompatParcelizer = context;
        this.write = lambdaprepare7Var;
    }

    public final lambdasetPlayWhenReady1 RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(lambdasetPlayWhenReady1 lambdasetplaywhenready1) {
        this.RemoteActionCompatParcelizer = lambdasetplaywhenready1;
    }

    @Deprecated
    public final lambdasetVideoTextureView20 AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Deprecated
    public final void RemoteActionCompatParcelizer(lambdasetVideoTextureView20 lambdasetvideotextureview20) {
        this.AudioAttributesImplApi26Parcelizer = lambdasetvideotextureview20;
    }

    public final SimpleBasePlayerPositionSupplier read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(SimpleBasePlayerPositionSupplier simpleBasePlayerPositionSupplier) {
        this.AudioAttributesImplBaseParcelizer = simpleBasePlayerPositionSupplier;
    }

    @Deprecated
    public final getPeriodPosition IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Deprecated
    public final void write(getPeriodPosition getperiodposition) {
        this.MediaBrowserCompatItemReceiver = getperiodposition;
    }

    public final lambdaonAudioAttributesChanged55 write() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(lambdaonAudioAttributesChanged55 lambdaonaudioattributeschanged55) {
        this.MediaBrowserCompatCustomActionResultReceiver = lambdaonaudioattributeschanged55;
    }

    public final lambdaupdateStateAndInformListeners45 AudioAttributesImplApi26Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public final void write(lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45) {
        this.MediaMetadataCompat = lambdaupdatestateandinformlisteners45;
    }

    public final Rfont MediaBrowserCompatItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final void write(Rfont rfont) {
        this.MediaDescriptionCompat = rfont;
    }

    public final getContentResumeOffsetUs AudioAttributesImplBaseParcelizer() {
        return this.RatingCompat;
    }

    public final void AudioAttributesCompatParcelizer(getContentResumeOffsetUs getcontentresumeoffsetus) {
        this.RatingCompat = getcontentresumeoffsetus;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        if (this.read.MediaMetadataCompat()) {
            this.read.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.read.write(), "Instance is analytics only, not initializing Notification Inbox");
        } else {
            TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.read).read().read("initializeInbox", new Callable<Void>() { // from class: o.getUids.5
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Void call() {
                    getUids.this.MediaMetadataCompat();
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaMetadataCompat() {
        synchronized (this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer()) {
            if (read() != null) {
                return;
            }
            if (this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver() != null) {
                AudioAttributesCompatParcelizer(new SimpleBasePlayerPositionSupplier(this.read, this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver(), this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer), this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer, lambdaonDownstreamFormatChanged28.IconCompatParcelizer));
            } else {
                this.read.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer();
            }
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.MediaBrowserCompatCustomActionResultReceiver != null) {
            this.AudioAttributesCompatParcelizer.write();
            this.AudioAttributesCompatParcelizer.MediaDescriptionCompat();
            this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
        }
    }

    public final void read(JSONArray jSONArray, boolean z) {
        setTotalBufferedDurationMs settotalbuffereddurationmsAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        if (settotalbuffereddurationmsAudioAttributesCompatParcelizer != null) {
            settotalbuffereddurationmsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(jSONArray, z);
        }
    }
}
