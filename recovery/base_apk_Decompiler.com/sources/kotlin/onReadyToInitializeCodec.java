package kotlin;

import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

/* JADX INFO: loaded from: classes5.dex */
public final class onReadyToInitializeCodec implements resetCodecStateForRelease {
    private setDescriptionList<maybeInitCodecOrBypass> AudioAttributesCompatParcelizer;
    private setDescriptionList<getDecoderInfosInternal> AudioAttributesImplApi21Parcelizer;
    private setDescriptionList<FirebaseApp> IconCompatParcelizer;
    private setDescriptionList<onProcessedOutputBuffer> MediaBrowserCompatCustomActionResultReceiver;
    private setDescriptionList<onInputBufferAvailable<DrmUtilApi18>> MediaBrowserCompatItemReceiver;
    private setDescriptionList<onInputBufferAvailable<ChapterTocFrame1>> RemoteActionCompatParcelizer;
    private setDescriptionList<updateCodecOperatingRate> read;
    private setDescriptionList<hasSamples> write;

    /* synthetic */ onReadyToInitializeCodec(FirebasePerformanceModule firebasePerformanceModule, byte b) {
        this(firebasePerformanceModule);
    }

    private onReadyToInitializeCodec(FirebasePerformanceModule firebasePerformanceModule) {
        IconCompatParcelizer(firebasePerformanceModule);
    }

    public static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
        return new AudioAttributesCompatParcelizer((byte) 0);
    }

    private void IconCompatParcelizer(FirebasePerformanceModule firebasePerformanceModule) {
        this.IconCompatParcelizer = setPendingOutputEndOfStream.RemoteActionCompatParcelizer(firebasePerformanceModule);
        this.RemoteActionCompatParcelizer = setPendingPlaybackException.write(firebasePerformanceModule);
        this.write = shouldInitCodec.read(firebasePerformanceModule);
        this.MediaBrowserCompatItemReceiver = buildCustomDiagnosticInfo.AudioAttributesCompatParcelizer(firebasePerformanceModule);
        this.MediaBrowserCompatCustomActionResultReceiver = shouldReinitCodec.read(firebasePerformanceModule);
        this.AudioAttributesCompatParcelizer = setRenderTimeLimitMs.write(firebasePerformanceModule);
        updateOutputFormatForTime updateoutputformatfortimeWrite = updateOutputFormatForTime.write(firebasePerformanceModule);
        this.AudioAttributesImplApi21Parcelizer = updateoutputformatfortimeWrite;
        this.read = TestProgress.read(getCodecInfo.IconCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, updateoutputformatfortimeWrite));
    }

    @Override // kotlin.resetCodecStateForRelease
    public final updateCodecOperatingRate AudioAttributesCompatParcelizer() {
        return this.read.get();
    }

    public static final class AudioAttributesCompatParcelizer {
        private FirebasePerformanceModule RemoteActionCompatParcelizer;

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        private AudioAttributesCompatParcelizer() {
        }

        public final AudioAttributesCompatParcelizer read(FirebasePerformanceModule firebasePerformanceModule) {
            this.RemoteActionCompatParcelizer = (FirebasePerformanceModule) setPossibleScore.RemoteActionCompatParcelizer(firebasePerformanceModule);
            return this;
        }

        public final resetCodecStateForRelease AudioAttributesCompatParcelizer() {
            setPossibleScore.IconCompatParcelizer(this.RemoteActionCompatParcelizer, FirebasePerformanceModule.class);
            return new onReadyToInitializeCodec(this.RemoteActionCompatParcelizer, (byte) 0);
        }
    }
}
