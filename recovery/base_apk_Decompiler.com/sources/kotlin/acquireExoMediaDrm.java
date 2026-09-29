package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class acquireExoMediaDrm implements AsynchronousMediaCodecAdapterExternalSyntheticLambda0 {
    public static final AsynchronousMediaCodecAdapterExternalSyntheticLambda0 read = new acquireExoMediaDrm();

    private acquireExoMediaDrm() {
    }

    @Override // kotlin.AsynchronousMediaCodecAdapterExternalSyntheticLambda0
    public final void read(setOnFrameRenderedListener<?> setonframerenderedlistener) {
        setonframerenderedlistener.RemoteActionCompatParcelizer(getKeyId.class, IconCompatParcelizer.AudioAttributesCompatParcelizer);
        setonframerenderedlistener.RemoteActionCompatParcelizer(setLogSessionIdOnMediaDrmSession.class, write.write);
        setonframerenderedlistener.RemoteActionCompatParcelizer(setKeyRequestProperty.class, AudioAttributesImplBaseParcelizer.write);
        setonframerenderedlistener.RemoteActionCompatParcelizer(executeProvisionRequest.class, read.read);
        setonframerenderedlistener.RemoteActionCompatParcelizer(clearKeyRequestProperty.class, RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
        setonframerenderedlistener.RemoteActionCompatParcelizer(clearAllKeyRequestProperties.class, AudioAttributesCompatParcelizer.read);
        setonframerenderedlistener.RemoteActionCompatParcelizer(KeysExpiredException.class, MediaBrowserCompatItemReceiver.IconCompatParcelizer);
    }

    static final class IconCompatParcelizer implements dequeueOutputBufferIndex<getKeyId> {
        static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer();
        private static final needsReconfiguration write = needsReconfiguration.AudioAttributesCompatParcelizer("clientMetrics");

        private IconCompatParcelizer() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            write((getKeyId) obj, getoutputbuffer);
        }

        private static void write(getKeyId getkeyid, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(write, getkeyid.IconCompatParcelizer());
        }
    }

    static final class write implements dequeueOutputBufferIndex<setLogSessionIdOnMediaDrmSession> {
        static final write write = new write();
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer("window").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(1).AudioAttributesCompatParcelizer()).IconCompatParcelizer();
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer("logSourceMetrics").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(2).AudioAttributesCompatParcelizer()).IconCompatParcelizer();
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer("globalMetrics").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(3).AudioAttributesCompatParcelizer()).IconCompatParcelizer();
        private static final needsReconfiguration read = needsReconfiguration.RemoteActionCompatParcelizer("appNamespace").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(4).AudioAttributesCompatParcelizer()).IconCompatParcelizer();

        private write() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            RemoteActionCompatParcelizer((setLogSessionIdOnMediaDrmSession) obj, getoutputbuffer);
        }

        private static void RemoteActionCompatParcelizer(setLogSessionIdOnMediaDrmSession setlogsessionidonmediadrmsession, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(IconCompatParcelizer, setlogsessionidonmediadrmsession.AudioAttributesCompatParcelizer());
            getoutputbuffer.read(RemoteActionCompatParcelizer, setlogsessionidonmediadrmsession.IconCompatParcelizer());
            getoutputbuffer.read(AudioAttributesCompatParcelizer, setlogsessionidonmediadrmsession.RemoteActionCompatParcelizer());
            getoutputbuffer.read(read, setlogsessionidonmediadrmsession.write());
        }
    }

    static final class AudioAttributesImplBaseParcelizer implements dequeueOutputBufferIndex<setKeyRequestProperty> {
        static final AudioAttributesImplBaseParcelizer write = new AudioAttributesImplBaseParcelizer();
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer("startMs").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(1).AudioAttributesCompatParcelizer()).IconCompatParcelizer();
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer("endMs").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(2).AudioAttributesCompatParcelizer()).IconCompatParcelizer();

        private AudioAttributesImplBaseParcelizer() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            RemoteActionCompatParcelizer((setKeyRequestProperty) obj, getoutputbuffer);
        }

        private static void RemoteActionCompatParcelizer(setKeyRequestProperty setkeyrequestproperty, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.RemoteActionCompatParcelizer(IconCompatParcelizer, setkeyrequestproperty.write());
            getoutputbuffer.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer, setkeyrequestproperty.read());
        }
    }

    static final class read implements dequeueOutputBufferIndex<executeProvisionRequest> {
        static final read read = new read();
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer("logSource").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(1).AudioAttributesCompatParcelizer()).IconCompatParcelizer();
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer("logEventDropped").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(2).AudioAttributesCompatParcelizer()).IconCompatParcelizer();

        private read() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            RemoteActionCompatParcelizer((executeProvisionRequest) obj, getoutputbuffer);
        }

        private static void RemoteActionCompatParcelizer(executeProvisionRequest executeprovisionrequest, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(RemoteActionCompatParcelizer, executeprovisionrequest.IconCompatParcelizer());
            getoutputbuffer.read(AudioAttributesCompatParcelizer, executeprovisionrequest.write());
        }
    }

    static final class RemoteActionCompatParcelizer implements dequeueOutputBufferIndex<clearKeyRequestProperty> {
        static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer("eventsDroppedCount").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(1).AudioAttributesCompatParcelizer()).IconCompatParcelizer();
        private static final needsReconfiguration write = needsReconfiguration.RemoteActionCompatParcelizer("reason").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(3).AudioAttributesCompatParcelizer()).IconCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            read((clearKeyRequestProperty) obj, getoutputbuffer);
        }

        private static void read(clearKeyRequestProperty clearkeyrequestproperty, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.RemoteActionCompatParcelizer(IconCompatParcelizer, clearkeyrequestproperty.read());
            getoutputbuffer.read(write, clearkeyrequestproperty.write());
        }
    }

    static final class AudioAttributesCompatParcelizer implements dequeueOutputBufferIndex<clearAllKeyRequestProperties> {
        static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer();
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer("storageMetrics").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(1).AudioAttributesCompatParcelizer()).IconCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            read((clearAllKeyRequestProperties) obj, getoutputbuffer);
        }

        private static void read(clearAllKeyRequestProperties clearallkeyrequestproperties, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(AudioAttributesCompatParcelizer, clearallkeyrequestproperties.AudioAttributesCompatParcelizer());
        }
    }

    static final class MediaBrowserCompatItemReceiver implements dequeueOutputBufferIndex<KeysExpiredException> {
        static final MediaBrowserCompatItemReceiver IconCompatParcelizer = new MediaBrowserCompatItemReceiver();
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer("currentCacheSizeBytes").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(1).AudioAttributesCompatParcelizer()).IconCompatParcelizer();
        private static final needsReconfiguration write = needsReconfiguration.RemoteActionCompatParcelizer("maxCacheSizeBytes").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(2).AudioAttributesCompatParcelizer()).IconCompatParcelizer();

        private MediaBrowserCompatItemReceiver() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            AudioAttributesCompatParcelizer((KeysExpiredException) obj, getoutputbuffer);
        }

        private static void AudioAttributesCompatParcelizer(KeysExpiredException keysExpiredException, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer, keysExpiredException.write());
            getoutputbuffer.RemoteActionCompatParcelizer(write, keysExpiredException.IconCompatParcelizer());
        }
    }
}
