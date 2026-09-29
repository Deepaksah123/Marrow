package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class MdtaMetadataEntry1 implements AsynchronousMediaCodecAdapterExternalSyntheticLambda0 {
    public static final AsynchronousMediaCodecAdapterExternalSyntheticLambda0 RemoteActionCompatParcelizer = new MdtaMetadataEntry1();

    private MdtaMetadataEntry1() {
    }

    @Override // kotlin.AsynchronousMediaCodecAdapterExternalSyntheticLambda0
    public final void read(setOnFrameRenderedListener<?> setonframerenderedlistener) {
        setonframerenderedlistener.RemoteActionCompatParcelizer(parseFromSection.class, read.RemoteActionCompatParcelizer);
        setonframerenderedlistener.RemoteActionCompatParcelizer(SpliceScheduleCommandComponentSplice.class, AudioAttributesCompatParcelizer.write);
        setonframerenderedlistener.RemoteActionCompatParcelizer(UrlLinkFrame1.class, RemoteActionCompatParcelizer.write);
        setonframerenderedlistener.RemoteActionCompatParcelizer(TextInformationFrame1.class, write.IconCompatParcelizer);
        setonframerenderedlistener.RemoteActionCompatParcelizer(Id3DecoderExternalSyntheticLambda0.class, IconCompatParcelizer.write);
    }

    static final class read implements dequeueOutputBufferIndex<parseFromSection> {
        static final read RemoteActionCompatParcelizer = new read();
        private static final needsReconfiguration read = needsReconfiguration.AudioAttributesCompatParcelizer("eventType");
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("sessionData");
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("applicationInfo");

        private read() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            IconCompatParcelizer((parseFromSection) obj, getoutputbuffer);
        }

        private static void IconCompatParcelizer(parseFromSection parsefromsection, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(read, parsefromsection.AudioAttributesCompatParcelizer());
            getoutputbuffer.read(IconCompatParcelizer, parsefromsection.write());
            getoutputbuffer.read(AudioAttributesCompatParcelizer, parsefromsection.RemoteActionCompatParcelizer());
        }
    }

    static final class AudioAttributesCompatParcelizer implements dequeueOutputBufferIndex<SpliceScheduleCommandComponentSplice> {
        static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer();
        private static final needsReconfiguration MediaBrowserCompatItemReceiver = needsReconfiguration.AudioAttributesCompatParcelizer("sessionId");
        private static final needsReconfiguration read = needsReconfiguration.AudioAttributesCompatParcelizer("firstSessionId");
        private static final needsReconfiguration AudioAttributesImplApi26Parcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("sessionIndex");
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("eventTimestampUs");
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("dataCollectionStatus");
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("firebaseInstallationId");

        private AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            read((SpliceScheduleCommandComponentSplice) obj, getoutputbuffer);
        }

        private static void read(SpliceScheduleCommandComponentSplice spliceScheduleCommandComponentSplice, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(MediaBrowserCompatItemReceiver, spliceScheduleCommandComponentSplice.getIconCompatParcelizer());
            getoutputbuffer.read(read, spliceScheduleCommandComponentSplice.getWrite());
            getoutputbuffer.AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer, spliceScheduleCommandComponentSplice.getMediaBrowserCompatItemReceiver());
            getoutputbuffer.RemoteActionCompatParcelizer(IconCompatParcelizer, spliceScheduleCommandComponentSplice.getAudioAttributesCompatParcelizer());
            getoutputbuffer.read(RemoteActionCompatParcelizer, spliceScheduleCommandComponentSplice.getRemoteActionCompatParcelizer());
            getoutputbuffer.read(AudioAttributesCompatParcelizer, spliceScheduleCommandComponentSplice.getRead());
        }
    }

    static final class RemoteActionCompatParcelizer implements dequeueOutputBufferIndex<UrlLinkFrame1> {
        static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer();
        private static final needsReconfiguration read = needsReconfiguration.AudioAttributesCompatParcelizer("performance");
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("crashlytics");
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("sessionSamplingRate");

        private RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            write((UrlLinkFrame1) obj, getoutputbuffer);
        }

        private static void write(UrlLinkFrame1 urlLinkFrame1, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(read, urlLinkFrame1.getWrite());
            getoutputbuffer.read(RemoteActionCompatParcelizer, urlLinkFrame1.getAudioAttributesCompatParcelizer());
            getoutputbuffer.AudioAttributesCompatParcelizer(IconCompatParcelizer, urlLinkFrame1.getIconCompatParcelizer());
        }
    }

    static final class write implements dequeueOutputBufferIndex<TextInformationFrame1> {
        static final write IconCompatParcelizer = new write();
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("appId");
        private static final needsReconfiguration write = needsReconfiguration.AudioAttributesCompatParcelizer("deviceModel");
        private static final needsReconfiguration MediaBrowserCompatItemReceiver = needsReconfiguration.AudioAttributesCompatParcelizer("sessionSdkVersion");
        private static final needsReconfiguration AudioAttributesImplApi26Parcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("osVersion");
        private static final needsReconfiguration read = needsReconfiguration.AudioAttributesCompatParcelizer("logEnvironment");
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("androidAppInfo");

        private write() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            write((TextInformationFrame1) obj, getoutputbuffer);
        }

        private static void write(TextInformationFrame1 textInformationFrame1, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(AudioAttributesCompatParcelizer, textInformationFrame1.read());
            getoutputbuffer.read(write, textInformationFrame1.AudioAttributesCompatParcelizer());
            getoutputbuffer.read(MediaBrowserCompatItemReceiver, textInformationFrame1.AudioAttributesImplApi26Parcelizer());
            getoutputbuffer.read(AudioAttributesImplApi26Parcelizer, textInformationFrame1.RemoteActionCompatParcelizer());
            getoutputbuffer.read(read, textInformationFrame1.write());
            getoutputbuffer.read(RemoteActionCompatParcelizer, textInformationFrame1.IconCompatParcelizer());
        }
    }

    static final class IconCompatParcelizer implements dequeueOutputBufferIndex<Id3DecoderExternalSyntheticLambda0> {
        static final IconCompatParcelizer write = new IconCompatParcelizer();
        private static final needsReconfiguration IconCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("packageName");
        private static final needsReconfiguration read = needsReconfiguration.AudioAttributesCompatParcelizer("versionName");
        private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("appBuildVersion");
        private static final needsReconfiguration AudioAttributesCompatParcelizer = needsReconfiguration.AudioAttributesCompatParcelizer("deviceManufacturer");

        private IconCompatParcelizer() {
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            RemoteActionCompatParcelizer((Id3DecoderExternalSyntheticLambda0) obj, getoutputbuffer);
        }

        private static void RemoteActionCompatParcelizer(Id3DecoderExternalSyntheticLambda0 id3DecoderExternalSyntheticLambda0, getOutputBuffer getoutputbuffer) throws IOException {
            getoutputbuffer.read(IconCompatParcelizer, id3DecoderExternalSyntheticLambda0.IconCompatParcelizer());
            getoutputbuffer.read(read, id3DecoderExternalSyntheticLambda0.RemoteActionCompatParcelizer());
            getoutputbuffer.read(RemoteActionCompatParcelizer, id3DecoderExternalSyntheticLambda0.AudioAttributesCompatParcelizer());
            getoutputbuffer.read(AudioAttributesCompatParcelizer, id3DecoderExternalSyntheticLambda0.write());
        }
    }
}
