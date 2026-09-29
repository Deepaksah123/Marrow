package kotlin;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import kotlin.getSeekMap;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaDrmCallbackException implements newWidevineInstance {
    private static final Logger AudioAttributesCompatParcelizer = Logger.getLogger(addLaUrlAttributeIfMissing.class.getName());
    private final isCryptoSchemeSupported IconCompatParcelizer;
    private final getMediaSessionPlaybackState MediaBrowserCompatCustomActionResultReceiver;
    private final getSeekMap RemoteActionCompatParcelizer;
    private final Executor read;
    private final invalidateMediaSessionQueue write;

    @setSdkPayload
    public MediaDrmCallbackException(Executor executor, isCryptoSchemeSupported iscryptoschemesupported, getMediaSessionPlaybackState getmediasessionplaybackstate, invalidateMediaSessionQueue invalidatemediasessionqueue, getSeekMap getseekmap) {
        this.read = executor;
        this.IconCompatParcelizer = iscryptoschemesupported;
        this.MediaBrowserCompatCustomActionResultReceiver = getmediasessionplaybackstate;
        this.write = invalidatemediasessionqueue;
        this.RemoteActionCompatParcelizer = getseekmap;
    }

    @Override // kotlin.newWidevineInstance
    public final void read(final ExoMediaDrmProvider exoMediaDrmProvider, final ExoMediaDrmOnEventListener exoMediaDrmOnEventListener, final DummyExoMediaDrm dummyExoMediaDrm) {
        this.read.execute(new Runnable() { // from class: o.MediaDrmCallback
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(exoMediaDrmProvider, dummyExoMediaDrm, exoMediaDrmOnEventListener);
            }
        });
    }

    final /* synthetic */ void IconCompatParcelizer(final ExoMediaDrmProvider exoMediaDrmProvider, DummyExoMediaDrm dummyExoMediaDrm, ExoMediaDrmOnEventListener exoMediaDrmOnEventListener) {
        try {
            FrameworkMediaDrmApi31 frameworkMediaDrmApi31IconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(exoMediaDrmProvider.RemoteActionCompatParcelizer());
            if (frameworkMediaDrmApi31IconCompatParcelizer == null) {
                String str = String.format("Transport backend '%s' is not registered", exoMediaDrmProvider.RemoteActionCompatParcelizer());
                AudioAttributesCompatParcelizer.warning(str);
                dummyExoMediaDrm.RemoteActionCompatParcelizer(new IllegalArgumentException(str));
            } else {
                final ExoMediaDrmOnEventListener exoMediaDrmOnEventListenerIconCompatParcelizer = frameworkMediaDrmApi31IconCompatParcelizer.IconCompatParcelizer(exoMediaDrmOnEventListener);
                this.RemoteActionCompatParcelizer.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.lambdaacquireFirstSessionOnHandlerThread2comgoogleandroidexoplayer2drmOfflineLicenseHelper
                    @Override // o.getSeekMap.RemoteActionCompatParcelizer
                    public final Object RemoteActionCompatParcelizer() {
                        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(exoMediaDrmProvider, exoMediaDrmOnEventListenerIconCompatParcelizer);
                    }
                });
                dummyExoMediaDrm.RemoteActionCompatParcelizer(null);
            }
        } catch (Exception e) {
            Logger logger = AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("Error scheduling event ");
            sb.append(e.getMessage());
            logger.warning(sb.toString());
            dummyExoMediaDrm.RemoteActionCompatParcelizer(e);
        }
    }

    final /* synthetic */ Object RemoteActionCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider, ExoMediaDrmOnEventListener exoMediaDrmOnEventListener) {
        this.write.RemoteActionCompatParcelizer(exoMediaDrmProvider, exoMediaDrmOnEventListener);
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(exoMediaDrmProvider, 1);
        return null;
    }
}
