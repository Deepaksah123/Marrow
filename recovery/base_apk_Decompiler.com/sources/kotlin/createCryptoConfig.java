package kotlin;

import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class createCryptoConfig implements AsynchronousMediaCodecAdapterExternalSyntheticLambda0 {
    public static final AsynchronousMediaCodecAdapterExternalSyntheticLambda0 write = new createCryptoConfig();

    private createCryptoConfig() {
    }

    @Override // kotlin.AsynchronousMediaCodecAdapterExternalSyntheticLambda0
    public final void read(setOnFrameRenderedListener<?> setonframerenderedlistener) {
        setonframerenderedlistener.RemoteActionCompatParcelizer(setOnEventListener.class, write.IconCompatParcelizer);
        setonframerenderedlistener.RemoteActionCompatParcelizer(getMetrics.class, write.IconCompatParcelizer);
        setonframerenderedlistener.RemoteActionCompatParcelizer(setPropertyByteArray.class, read.read);
        setonframerenderedlistener.RemoteActionCompatParcelizer(provideKeyResponse.class, read.read);
        setonframerenderedlistener.RemoteActionCompatParcelizer(setOnExpirationUpdateListener.class, AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        setonframerenderedlistener.RemoteActionCompatParcelizer(getPropertyString.class, AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        setonframerenderedlistener.RemoteActionCompatParcelizer(getKeyRequest.class, RemoteActionCompatParcelizer.IconCompatParcelizer);
        setonframerenderedlistener.RemoteActionCompatParcelizer(getPropertyByteArray.class, RemoteActionCompatParcelizer.IconCompatParcelizer);
        setonframerenderedlistener.RemoteActionCompatParcelizer(setPropertyString.class, IconCompatParcelizer.read);
        setonframerenderedlistener.RemoteActionCompatParcelizer(provideProvisionResponse.class, IconCompatParcelizer.read);
        setonframerenderedlistener.RemoteActionCompatParcelizer(ErrorStateDrmSession.class, MediaBrowserCompatItemReceiver.write);
        setonframerenderedlistener.RemoteActionCompatParcelizer(getProvisionRequest.class, MediaBrowserCompatItemReceiver.write);
    }

    static final class write implements dequeueOutputBufferIndex<setOnEventListener> {
        static final write IconCompatParcelizer = new write();
        private static final needsReconfiguration write = needsReconfiguration.AudioAttributesCompatParcelizer("logRequest");

        private write() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            AudioAttributesCompatParcelizer((setOnEventListener) obj, getoutputbuffer);
        }

        private static void AudioAttributesCompatParcelizer(setOnEventListener setoneventlistener, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(write, setoneventlistener.AudioAttributesCompatParcelizer());
        }
    }

    static final class read implements dequeueOutputBufferIndex<setPropertyByteArray> {
        static final read read = new read();
        private static final needsReconfiguration AudioAttributesImplApi26Parcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("requestTimeMs");
        private static final needsReconfiguration AudioAttributesImplBaseParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("requestUptimeMs");
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("clientInfo");
        private static final needsReconfiguration write = needsReconfiguration.AudioAttributesCompatParcelizer("logSource");
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("logSourceName");
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("logEvent");
        private static final needsReconfiguration MediaBrowserCompatItemReceiver = needsReconfiguration.AudioAttributesCompatParcelizer("qosTier");

        private read() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            write((setPropertyByteArray) obj, getoutputbuffer);
        }

        private static void write(setPropertyByteArray setpropertybytearray, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer, setpropertybytearray.MediaBrowserCompatCustomActionResultReceiver());
            getoutputbuffer.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer, setpropertybytearray.AudioAttributesImplApi21Parcelizer());
            getoutputbuffer.read(IconCompatParcelizer, setpropertybytearray.read());
            getoutputbuffer.read(write, setpropertybytearray.write());
            getoutputbuffer.read(RemoteActionCompatParcelizer, setpropertybytearray.RemoteActionCompatParcelizer());
            getoutputbuffer.read(AudioAttributesCompatParcelizer, setpropertybytearray.AudioAttributesCompatParcelizer());
            getoutputbuffer.read(MediaBrowserCompatItemReceiver, setpropertybytearray.IconCompatParcelizer());
        }
    }

    static final class AudioAttributesCompatParcelizer implements dequeueOutputBufferIndex<setOnExpirationUpdateListener> {
        static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("clientType");
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("androidClientInfo");

        private AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            read((setOnExpirationUpdateListener) obj, getoutputbuffer);
        }

        private static void read(setOnExpirationUpdateListener setonexpirationupdatelistener, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(IconCompatParcelizer, setonexpirationupdatelistener.write());
            getoutputbuffer.read(AudioAttributesCompatParcelizer, setonexpirationupdatelistener.RemoteActionCompatParcelizer());
        }
    }

    static final class RemoteActionCompatParcelizer implements dequeueOutputBufferIndex<getKeyRequest> {
        static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();
        private static final needsReconfiguration MediaDescriptionCompat = needsReconfiguration.AudioAttributesCompatParcelizer(PaymentConstants.SDK_VERSION);
        private static final needsReconfiguration MediaBrowserCompatItemReceiver = needsReconfiguration.AudioAttributesCompatParcelizer("model");
        private static final needsReconfiguration AudioAttributesImplApi21Parcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("hardware");
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer(LogSubCategory.Context.DEVICE);
        private static final needsReconfiguration MediaMetadataCompat = needsReconfiguration.AudioAttributesCompatParcelizer("product");
        private static final needsReconfiguration MediaBrowserCompatMediaItem = needsReconfiguration.AudioAttributesCompatParcelizer("osBuild");
        private static final needsReconfiguration AudioAttributesImplApi26Parcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("manufacturer");
        private static final needsReconfiguration read = needsReconfiguration.AudioAttributesCompatParcelizer("fingerprint");
        private static final needsReconfiguration MediaBrowserCompatCustomActionResultReceiver = needsReconfiguration.AudioAttributesCompatParcelizer("locale");
        private static final needsReconfiguration write = needsReconfiguration.AudioAttributesCompatParcelizer("country");
        private static final needsReconfiguration AudioAttributesImplBaseParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("mccMnc");
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("applicationBuild");

        private RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            read((getKeyRequest) obj, getoutputbuffer);
        }

        private static void read(getKeyRequest getkeyrequest, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(MediaDescriptionCompat, getkeyrequest.MediaBrowserCompatSearchResultReceiver());
            getoutputbuffer.read(MediaBrowserCompatItemReceiver, getkeyrequest.MediaBrowserCompatCustomActionResultReceiver());
            getoutputbuffer.read(AudioAttributesImplApi21Parcelizer, getkeyrequest.AudioAttributesImplBaseParcelizer());
            getoutputbuffer.read(RemoteActionCompatParcelizer, getkeyrequest.read());
            getoutputbuffer.read(MediaMetadataCompat, getkeyrequest.MediaMetadataCompat());
            getoutputbuffer.read(MediaBrowserCompatMediaItem, getkeyrequest.MediaBrowserCompatMediaItem());
            getoutputbuffer.read(AudioAttributesImplApi26Parcelizer, getkeyrequest.MediaBrowserCompatItemReceiver());
            getoutputbuffer.read(read, getkeyrequest.RemoteActionCompatParcelizer());
            getoutputbuffer.read(MediaBrowserCompatCustomActionResultReceiver, getkeyrequest.AudioAttributesImplApi26Parcelizer());
            getoutputbuffer.read(write, getkeyrequest.IconCompatParcelizer());
            getoutputbuffer.read(AudioAttributesImplBaseParcelizer, getkeyrequest.AudioAttributesImplApi21Parcelizer());
            getoutputbuffer.read(AudioAttributesCompatParcelizer, getkeyrequest.write());
        }
    }

    static final class IconCompatParcelizer implements dequeueOutputBufferIndex<setPropertyString> {
        static final IconCompatParcelizer read = new IconCompatParcelizer();
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("eventTimeMs");
        private static final needsReconfiguration write = needsReconfiguration.AudioAttributesCompatParcelizer("eventCode");
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("eventUptimeMs");
        private static final needsReconfiguration AudioAttributesImplApi21Parcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("sourceExtension");
        private static final needsReconfiguration AudioAttributesImplApi26Parcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("sourceExtensionJsonProto3");
        private static final needsReconfiguration AudioAttributesImplBaseParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("timezoneOffsetSeconds");
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("networkConnectionInfo");

        private IconCompatParcelizer() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            RemoteActionCompatParcelizer((setPropertyString) obj, getoutputbuffer);
        }

        private static void RemoteActionCompatParcelizer(setPropertyString setpropertystring, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer, setpropertystring.IconCompatParcelizer());
            getoutputbuffer.read(write, setpropertystring.read());
            getoutputbuffer.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer, setpropertystring.RemoteActionCompatParcelizer());
            getoutputbuffer.read(AudioAttributesImplApi21Parcelizer, setpropertystring.write());
            getoutputbuffer.read(AudioAttributesImplApi26Parcelizer, setpropertystring.MediaBrowserCompatItemReceiver());
            getoutputbuffer.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer, setpropertystring.MediaBrowserCompatCustomActionResultReceiver());
            getoutputbuffer.read(IconCompatParcelizer, setpropertystring.AudioAttributesCompatParcelizer());
        }
    }

    static final class MediaBrowserCompatItemReceiver implements dequeueOutputBufferIndex<ErrorStateDrmSession> {
        static final MediaBrowserCompatItemReceiver write = new MediaBrowserCompatItemReceiver();
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("networkType");
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("mobileSubtype");

        private MediaBrowserCompatItemReceiver() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            AudioAttributesCompatParcelizer((ErrorStateDrmSession) obj, getoutputbuffer);
        }

        private static void AudioAttributesCompatParcelizer(ErrorStateDrmSession errorStateDrmSession, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(AudioAttributesCompatParcelizer, errorStateDrmSession.write());
            getoutputbuffer.read(IconCompatParcelizer, errorStateDrmSession.AudioAttributesCompatParcelizer());
        }
    }
}
