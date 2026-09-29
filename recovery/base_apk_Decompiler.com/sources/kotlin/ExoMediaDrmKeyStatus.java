package kotlin;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.FrameworkCryptoConfig;

/* JADX INFO: loaded from: classes5.dex */
final class ExoMediaDrmKeyStatus extends FrameworkCryptoConfig {
    private setDescriptionList<renewLicense> AudioAttributesCompatParcelizer;
    private setDescriptionList<addLaUrlAttributeIfMissing> AudioAttributesImplApi21Parcelizer;
    private setDescriptionList<String> AudioAttributesImplApi26Parcelizer;
    private setDescriptionList AudioAttributesImplBaseParcelizer;
    private setDescriptionList<Executor> IconCompatParcelizer;
    private setDescriptionList<Context> MediaBrowserCompatCustomActionResultReceiver;
    private setDescriptionList<setMapStateIdleToSessionStateStopped> MediaBrowserCompatItemReceiver;
    private setDescriptionList<getMediaSessionPlaybackState> MediaBrowserCompatSearchResultReceiver;
    private setDescriptionList<OfflineLicenseHelperExternalSyntheticLambda1> MediaMetadataCompat;
    private setDescriptionList<canDispatchQueueEdit> RatingCompat;
    private setDescriptionList RemoteActionCompatParcelizer;
    private setDescriptionList read;
    private setDescriptionList<MediaDrmCallbackException> write;

    /* synthetic */ ExoMediaDrmKeyStatus(Context context, byte b) {
        this(context);
    }

    private ExoMediaDrmKeyStatus(Context context) {
        read(context);
    }

    public static FrameworkCryptoConfig.read RemoteActionCompatParcelizer() {
        return new read((byte) 0);
    }

    private void read(Context context) {
        this.IconCompatParcelizer = FrameworkMediaDrmExternalSyntheticLambda0.RemoteActionCompatParcelizer(onExpirationUpdate.AudioAttributesCompatParcelizer());
        FrameworkMediaDrmExternalSyntheticLambda3 frameworkMediaDrmExternalSyntheticLambda3RemoteActionCompatParcelizer = getRedirectUrl.RemoteActionCompatParcelizer(context);
        this.MediaBrowserCompatCustomActionResultReceiver = frameworkMediaDrmExternalSyntheticLambda3RemoteActionCompatParcelizer;
        lambdasetOnExpirationUpdateListener3comgoogleandroidexoplayer2drmFrameworkMediaDrm lambdasetonexpirationupdatelistener3comgoogleandroidexoplayer2drmframeworkmediadrmWrite = lambdasetOnExpirationUpdateListener3comgoogleandroidexoplayer2drmFrameworkMediaDrm.write(frameworkMediaDrmExternalSyntheticLambda3RemoteActionCompatParcelizer, createSeekParamsForTargetTimeUs.write(), getMediaDescription.read());
        this.read = lambdasetonexpirationupdatelistener3comgoogleandroidexoplayer2drmframeworkmediadrmWrite;
        this.RemoteActionCompatParcelizer = FrameworkMediaDrmExternalSyntheticLambda0.RemoteActionCompatParcelizer(FrameworkMediaDrmExternalSyntheticLambda2.read(this.MediaBrowserCompatCustomActionResultReceiver, lambdasetonexpirationupdatelistener3comgoogleandroidexoplayer2drmframeworkmediadrmWrite));
        this.AudioAttributesImplBaseParcelizer = move.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, setCaptionCallback.RemoteActionCompatParcelizer(), setEnabledPlaybackActions.AudioAttributesCompatParcelizer());
        this.AudioAttributesImplApi26Parcelizer = FrameworkMediaDrmExternalSyntheticLambda0.RemoteActionCompatParcelizer(setClearMediaItemsOnStop.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver));
        this.MediaBrowserCompatItemReceiver = FrameworkMediaDrmExternalSyntheticLambda0.RemoteActionCompatParcelizer(onCurrentMediaItemIndexChanged.read(createSeekParamsForTargetTimeUs.write(), getMediaDescription.read(), setDispatchUnsupportedActionsEnabled.RemoteActionCompatParcelizer(), this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer));
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread acquiresessionandgetofflinelicensekeysetidonhandlerthreadAudioAttributesCompatParcelizer = acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread.AudioAttributesCompatParcelizer(createSeekParamsForTargetTimeUs.write());
        this.AudioAttributesCompatParcelizer = acquiresessionandgetofflinelicensekeysetidonhandlerthreadAudioAttributesCompatParcelizer;
        releaseLicense releaselicenseWrite = releaseLicense.write(this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, acquiresessionandgetofflinelicensekeysetidonhandlerthreadAudioAttributesCompatParcelizer, getMediaDescription.read());
        this.MediaBrowserCompatSearchResultReceiver = releaselicenseWrite;
        setDescriptionList<Executor> setdescriptionlist = this.IconCompatParcelizer;
        setDescriptionList setdescriptionlist2 = this.RemoteActionCompatParcelizer;
        setDescriptionList<setMapStateIdleToSessionStateStopped> setdescriptionlist3 = this.MediaBrowserCompatItemReceiver;
        this.write = downloadLicense.AudioAttributesCompatParcelizer(setdescriptionlist, (setDescriptionList<isCryptoSchemeSupported>) setdescriptionlist2, releaselicenseWrite, setdescriptionlist3, setdescriptionlist3);
        setDescriptionList<Context> setdescriptionlist4 = this.MediaBrowserCompatCustomActionResultReceiver;
        setDescriptionList setdescriptionlist5 = this.RemoteActionCompatParcelizer;
        setDescriptionList<setMapStateIdleToSessionStateStopped> setdescriptionlist6 = this.MediaBrowserCompatItemReceiver;
        this.MediaMetadataCompat = canDispatchSetRating.read(setdescriptionlist4, setdescriptionlist5, setdescriptionlist6, this.MediaBrowserCompatSearchResultReceiver, this.IconCompatParcelizer, setdescriptionlist6, createSeekParamsForTargetTimeUs.write(), getMediaDescription.read(), this.MediaBrowserCompatItemReceiver);
        setDescriptionList<Executor> setdescriptionlist7 = this.IconCompatParcelizer;
        setDescriptionList<setMapStateIdleToSessionStateStopped> setdescriptionlist8 = this.MediaBrowserCompatItemReceiver;
        this.RatingCompat = unregisterCommandReceiver.IconCompatParcelizer(setdescriptionlist7, setdescriptionlist8, this.MediaBrowserCompatSearchResultReceiver, setdescriptionlist8);
        this.AudioAttributesImplApi21Parcelizer = FrameworkMediaDrmExternalSyntheticLambda0.RemoteActionCompatParcelizer(adjustRequestInitData.IconCompatParcelizer(createSeekParamsForTargetTimeUs.write(), getMediaDescription.read(), this.write, this.MediaMetadataCompat, this.RatingCompat));
    }

    @Override // kotlin.FrameworkCryptoConfig
    final addLaUrlAttributeIfMissing AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.get();
    }

    @Override // kotlin.FrameworkCryptoConfig
    final invalidateMediaSessionQueue IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver.get();
    }

    static final class read implements FrameworkCryptoConfig.read {
        private Context read;

        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.FrameworkCryptoConfig.read
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public read write(Context context) {
            this.read = (Context) executePost.AudioAttributesCompatParcelizer(context);
            return this;
        }

        @Override // o.FrameworkCryptoConfig.read
        public final FrameworkCryptoConfig write() {
            executePost.read(this.read, Context.class);
            return new ExoMediaDrmKeyStatus(this.read, (byte) 0);
        }
    }
}
