package kotlin;

import java.util.Map;
import kotlin.DownloadRequest;
import kotlin.MediaCodecUtilMediaCodecListCompatV16;
import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
public final class SynchronousMediaCodecAdapter extends updateWaitingForRequirements<SynchronousMediaCodecAdapter, IconCompatParcelizer> implements SynchronousMediaCodecAdapter1 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final SynchronousMediaCodecAdapter DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile onTaskStopped<SynchronousMediaCodecAdapter> PARSER;
    private MediaCodecUtilMediaCodecListCompatV16 androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private setMaxParallelDownloads<String, String> customAttributes_ = setMaxParallelDownloads.AudioAttributesCompatParcelizer();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static final class AudioAttributesCompatParcelizer {
        static final setMinRetryCount<String, String> RemoteActionCompatParcelizer = setMinRetryCount.RemoteActionCompatParcelizer(DownloadRequest.read.STRING, "", DownloadRequest.read.STRING, "");
    }

    private SynchronousMediaCodecAdapter() {
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(String str) {
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(String str) {
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    public final boolean write() {
        return (this.bitField0_ & 4) != 0;
    }

    public final MediaCodecUtilMediaCodecListCompatV16 IconCompatParcelizer() {
        MediaCodecUtilMediaCodecListCompatV16 mediaCodecUtilMediaCodecListCompatV16 = this.androidAppInfo_;
        return mediaCodecUtilMediaCodecListCompatV16 == null ? MediaCodecUtilMediaCodecListCompatV16.read() : mediaCodecUtilMediaCodecListCompatV16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(MediaCodecUtilMediaCodecListCompatV16 mediaCodecUtilMediaCodecListCompatV16) {
        this.androidAppInfo_ = mediaCodecUtilMediaCodecListCompatV16;
        this.bitField0_ |= 4;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        this.applicationProcessState_ = lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter.AudioAttributesCompatParcelizer();
        this.bitField0_ |= 8;
    }

    private setMaxParallelDownloads<String, String> MediaBrowserCompatItemReceiver() {
        if (!this.customAttributes_.IconCompatParcelizer()) {
            this.customAttributes_ = this.customAttributes_.read();
        }
        return this.customAttributes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> AudioAttributesImplApi21Parcelizer() {
        return MediaBrowserCompatItemReceiver();
    }

    public static IconCompatParcelizer RemoteActionCompatParcelizer() {
        return DEFAULT_INSTANCE.onPlayFromSearch();
    }

    public static final class IconCompatParcelizer extends updateWaitingForRequirements.RemoteActionCompatParcelizer<SynchronousMediaCodecAdapter, IconCompatParcelizer> implements SynchronousMediaCodecAdapter1 {
        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
            super(SynchronousMediaCodecAdapter.DEFAULT_INSTANCE);
        }

        public final IconCompatParcelizer write(String str) {
            onCustomAction();
            ((SynchronousMediaCodecAdapter) this.write).read(str);
            return this;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return ((SynchronousMediaCodecAdapter) this.write).AudioAttributesImplBaseParcelizer();
        }

        public final IconCompatParcelizer read(String str) {
            onCustomAction();
            ((SynchronousMediaCodecAdapter) this.write).IconCompatParcelizer(str);
            return this;
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer(MediaCodecUtilMediaCodecListCompatV16.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            onCustomAction();
            ((SynchronousMediaCodecAdapter) this.write).read(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem());
            return this;
        }

        public final IconCompatParcelizer write(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
            onCustomAction();
            ((SynchronousMediaCodecAdapter) this.write).write(lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
            return this;
        }

        public final IconCompatParcelizer write(Map<String, String> map) {
            onCustomAction();
            ((SynchronousMediaCodecAdapter) this.write).AudioAttributesImplApi21Parcelizer().putAll(map);
            return this;
        }
    }

    /* JADX INFO: renamed from: o.SynchronousMediaCodecAdapter$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[updateWaitingForRequirements.AudioAttributesCompatParcelizer.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[updateWaitingForRequirements.AudioAttributesCompatParcelizer.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AudioAttributesCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AudioAttributesCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AudioAttributesCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // kotlin.updateWaitingForRequirements
    public final Object IconCompatParcelizer(updateWaitingForRequirements.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        onTaskStopped writeVar;
        switch (AnonymousClass4.AudioAttributesCompatParcelizer[audioAttributesCompatParcelizer.ordinal()]) {
            case 1:
                return new SynchronousMediaCodecAdapter();
            case 2:
                return new IconCompatParcelizer((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.write(), "customAttributes_", AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<SynchronousMediaCodecAdapter> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (SynchronousMediaCodecAdapter.class) {
                    writeVar = PARSER;
                    if (writeVar == null) {
                        writeVar = new updateWaitingForRequirements.write(DEFAULT_INSTANCE);
                        PARSER = writeVar;
                    }
                    break;
                }
                return writeVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SynchronousMediaCodecAdapter synchronousMediaCodecAdapter = new SynchronousMediaCodecAdapter();
        DEFAULT_INSTANCE = synchronousMediaCodecAdapter;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(SynchronousMediaCodecAdapter.class, synchronousMediaCodecAdapter);
    }

    public static SynchronousMediaCodecAdapter read() {
        return DEFAULT_INSTANCE;
    }
}
