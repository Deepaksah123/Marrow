package kotlin;

import android.content.Context;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class copyWithPlaybackState {
    private final onDroppedVideoFrames AudioAttributesCompatParcelizer;
    private final isTypeSupported AudioAttributesImplApi21Parcelizer;
    private final lambdaupdateStateAndInformListeners45 AudioAttributesImplApi26Parcelizer;
    private final getContentResumeOffsetUs AudioAttributesImplBaseParcelizer;
    private final CleverTapInstanceConfig IconCompatParcelizer;
    private final Context MediaBrowserCompatCustomActionResultReceiver;
    private final copyWithPlaceholderTimeline MediaBrowserCompatItemReceiver;
    private final RendererCapabilitiesTunnelingSupport MediaMetadataCompat;
    private final lambdasetVideoSurface17 RemoteActionCompatParcelizer;
    private final addAllCommands read;
    private final PlaybackParameters write;

    copyWithPlaybackState(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, PlaybackParameters playbackParameters, copyWithPlaceholderTimeline copywithplaceholdertimeline, RendererCapabilitiesTunnelingSupport rendererCapabilitiesTunnelingSupport, getContentResumeOffsetUs getcontentresumeoffsetus, addAllCommands addallcommands, lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45, lambdasetVideoSurface17 lambdasetvideosurface17, isTypeSupported istypesupported, onDroppedVideoFrames ondroppedvideoframes) {
        this.MediaBrowserCompatCustomActionResultReceiver = context;
        this.IconCompatParcelizer = cleverTapInstanceConfig;
        this.write = playbackParameters;
        this.MediaBrowserCompatItemReceiver = copywithplaceholdertimeline;
        this.MediaMetadataCompat = rendererCapabilitiesTunnelingSupport;
        this.AudioAttributesImplBaseParcelizer = getcontentresumeoffsetus;
        this.read = addallcommands;
        this.AudioAttributesImplApi26Parcelizer = lambdaupdatestateandinformlisteners45;
        this.RemoteActionCompatParcelizer = lambdasetvideosurface17;
        this.AudioAttributesImplApi21Parcelizer = istypesupported;
        this.AudioAttributesCompatParcelizer = ondroppedvideoframes;
    }

    public final void IconCompatParcelizer() {
        copyWithPlaceholderTimeline.AudioAttributesCompatParcelizer(false);
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(System.currentTimeMillis());
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), "App in background");
        this.AudioAttributesImplApi21Parcelizer.read().read("activityPaused", new Callable<Void>() { // from class: o.copyWithPlaybackState.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (!copyWithPlaybackState.this.MediaBrowserCompatItemReceiver.onPlayFromMediaId()) {
                    return null;
                }
                try {
                    RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(copyWithPlaybackState.this.MediaBrowserCompatCustomActionResultReceiver, RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(copyWithPlaybackState.this.IconCompatParcelizer, "sexe"), iCurrentTimeMillis);
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = copyWithPlaybackState.this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
                    String strWrite = copyWithPlaybackState.this.IconCompatParcelizer.write();
                    StringBuilder sb = new StringBuilder("Updated session time: ");
                    sb.append(iCurrentTimeMillis);
                    rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
                    return null;
                } catch (Throwable th) {
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = copyWithPlaybackState.this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
                    String strWrite2 = copyWithPlaybackState.this.IconCompatParcelizer.write();
                    StringBuilder sb2 = new StringBuilder("Failed to update session time time: ");
                    sb2.append(th.getMessage());
                    rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strWrite2, sb2.toString());
                    return null;
                }
            }
        });
    }

    public final void read() {
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), "App in foreground");
        this.MediaMetadataCompat.IconCompatParcelizer();
        if (!this.MediaBrowserCompatItemReceiver.onPrepareFromSearch()) {
            this.write.write();
            this.write.RemoteActionCompatParcelizer();
            this.AudioAttributesImplBaseParcelizer.write();
            this.AudioAttributesImplApi21Parcelizer.read().read("HandlingInstallReferrer", new Callable<Void>() { // from class: o.copyWithPlaybackState.5
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Void call() {
                    if (copyWithPlaybackState.this.MediaBrowserCompatItemReceiver.onPrepareFromUri() || !copyWithPlaybackState.this.MediaBrowserCompatItemReceiver.onPrepare()) {
                        return null;
                    }
                    copyWithPlaybackState.this.RemoteActionCompatParcelizer();
                    return null;
                }
            });
            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read("CleanUpOldGIFs", new Callable() { // from class: o.copyWithPlaybackParameters
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.IconCompatParcelizer.write();
                }
            });
            try {
                if (this.read.MediaBrowserCompatItemReceiver() != null) {
                    this.read.MediaBrowserCompatItemReceiver();
                }
            } catch (IllegalStateException e) {
                this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), e.getLocalizedMessage());
            } catch (Exception unused) {
                this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), "Failed to trigger location");
            }
        }
        this.RemoteActionCompatParcelizer.write();
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
    }

    final /* synthetic */ Void write() throws Exception {
        RendererCapabilitiesListener.write(this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:3:0x0002, B:8:0x0018, B:10:0x001e, B:12:0x0026, B:5:0x000a), top: B:22:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(android.os.Bundle r2, android.net.Uri r3, java.lang.String r4) {
        /*
            r1 = this;
            if (r4 != 0) goto La
            com.clevertap.android.sdk.CleverTapInstanceConfig r0 = r1.IconCompatParcelizer     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.MediaBrowserCompatSearchResultReceiver()     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L16
        La:
            com.clevertap.android.sdk.CleverTapInstanceConfig r0 = r1.IconCompatParcelizer     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.write()     // Catch: java.lang.Throwable -> L34
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L3b
        L16:
            if (r2 == 0) goto L2b
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L2b
            java.lang.String r4 = "wzrk_pn"
            boolean r4 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L2b
            o.PlaybackParameters r4 = r1.write     // Catch: java.lang.Throwable -> L34
            r4.IconCompatParcelizer(r2)     // Catch: java.lang.Throwable -> L34
        L2b:
            if (r3 == 0) goto L3b
            o.PlaybackParameters r1 = r1.write     // Catch: java.lang.Throwable -> L33
            r2 = 0
            r1.RemoteActionCompatParcelizer(r3, r2)     // Catch: java.lang.Throwable -> L33
        L33:
            return
        L34:
            r1 = move-exception
            r1.getLocalizedMessage()
            kotlin.RendererWakeupListener.MediaMetadataCompat()
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.copyWithPlaybackState.read(android.os.Bundle, android.net.Uri, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), "Starting to handle install referrer");
        try {
            InstallReferrerClient installReferrerClientAudioAttributesCompatParcelizer = InstallReferrerClient.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver).AudioAttributesCompatParcelizer();
            installReferrerClientAudioAttributesCompatParcelizer.IconCompatParcelizer(new AnonymousClass3(installReferrerClientAudioAttributesCompatParcelizer));
        } catch (Throwable th) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
            String strWrite = this.IconCompatParcelizer.write();
            StringBuilder sb = new StringBuilder("Google Play Install Referrer's InstallReferrerClient Class not found - ");
            sb.append(th.getLocalizedMessage());
            sb.append(" \n Please add implementation 'com.android.installreferrer:installreferrer:2.1' to your build.gradle");
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
        }
    }

    /* JADX INFO: renamed from: o.copyWithPlaybackState$3, reason: invalid class name */
    final class AnonymousClass3 implements InstallReferrerStateListener {
        private /* synthetic */ InstallReferrerClient IconCompatParcelizer;

        AnonymousClass3(InstallReferrerClient installReferrerClient) {
            this.IconCompatParcelizer = installReferrerClient;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void RemoteActionCompatParcelizer() {
            if (copyWithPlaybackState.this.MediaBrowserCompatItemReceiver.onPrepareFromUri()) {
                return;
            }
            copyWithPlaybackState.this.RemoteActionCompatParcelizer();
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(InstallReferrerClient installReferrerClient, ReferrerDetails referrerDetails) {
            try {
                String str = referrerDetails.read();
                copyWithPlaybackState.this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(referrerDetails.RemoteActionCompatParcelizer());
                copyWithPlaybackState.this.MediaBrowserCompatItemReceiver.write(referrerDetails.IconCompatParcelizer());
                copyWithPlaybackState.this.write.RemoteActionCompatParcelizer(str);
                copyWithPlaybackState.this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(true);
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = copyWithPlaybackState.this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
                String strWrite = copyWithPlaybackState.this.IconCompatParcelizer.write();
                StringBuilder sb = new StringBuilder("Install Referrer data set [Referrer URL-");
                sb.append(str);
                sb.append("]");
                rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
            } catch (NullPointerException e) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = copyWithPlaybackState.this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
                String strWrite2 = copyWithPlaybackState.this.IconCompatParcelizer.write();
                StringBuilder sb2 = new StringBuilder("Install referrer client null pointer exception caused by Google Play Install Referrer library - ");
                sb2.append(e.getMessage());
                rendererWakeupListenerMediaBrowserCompatItemReceiver2.IconCompatParcelizer(strWrite2, sb2.toString());
                installReferrerClient.IconCompatParcelizer();
                copyWithPlaybackState.this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(false);
            }
        }

        final /* synthetic */ ReferrerDetails RemoteActionCompatParcelizer(InstallReferrerClient installReferrerClient) throws Exception {
            try {
                return installReferrerClient.RemoteActionCompatParcelizer();
            } catch (RemoteException e) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = copyWithPlaybackState.this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
                String strWrite = copyWithPlaybackState.this.IconCompatParcelizer.write();
                StringBuilder sb = new StringBuilder("Remote exception caused by Google Play Install Referrer library - ");
                sb.append(e.getMessage());
                rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
                installReferrerClient.IconCompatParcelizer();
                copyWithPlaybackState.this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(false);
                return null;
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void RemoteActionCompatParcelizer(int i) {
            if (i == 0) {
                isTrackSupported istracksupported = copyWithPlaybackState.this.AudioAttributesImplApi21Parcelizer.read();
                final InstallReferrerClient installReferrerClient = this.IconCompatParcelizer;
                istracksupported.RemoteActionCompatParcelizer(new TracksGroupExternalSyntheticLambda0() { // from class: o.withSpeed
                    @Override // kotlin.TracksGroupExternalSyntheticLambda0
                    public final void read(Object obj) {
                        this.read.AudioAttributesCompatParcelizer(installReferrerClient, (ReferrerDetails) obj);
                    }
                });
                final InstallReferrerClient installReferrerClient2 = this.IconCompatParcelizer;
                istracksupported.read("ActivityLifeCycleManager#getInstallReferrer", new Callable() { // from class: o.getMediaTimeUsForPlayoutTimeMs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(installReferrerClient2);
                    }
                });
                return;
            }
            if (i == 1) {
                copyWithPlaybackState.this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(copyWithPlaybackState.this.IconCompatParcelizer.write(), "Install Referrer data not set, connection to Play Store unavailable");
            } else {
                if (i != 2) {
                    return;
                }
                copyWithPlaybackState.this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(copyWithPlaybackState.this.IconCompatParcelizer.write(), "Install Referrer data not set, API not supported by Play Store on device");
            }
        }
    }
}
