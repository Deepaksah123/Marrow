package kotlin;

import java.util.List;
import kotlin.DownloadRequest;
import kotlin.getDownloadIndex;
import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
public final class getWrappedMetadataFormat extends updateWaitingForRequirements<getWrappedMetadataFormat, RemoteActionCompatParcelizer> implements length {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final getWrappedMetadataFormat DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile onTaskStopped<getWrappedMetadataFormat> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private setMaxParallelDownloads<String, String> customAttributes_ = setMaxParallelDownloads.AudioAttributesCompatParcelizer();
    private String url_ = "";
    private String responseContentType_ = "";
    private getDownloadIndex.MediaBrowserCompatItemReceiver<MetadataDecoderFactory> perfSessions_ = onPrepare();

    static final class IconCompatParcelizer {
        static final setMinRetryCount<String, String> read = setMinRetryCount.RemoteActionCompatParcelizer(DownloadRequest.read.STRING, "", DownloadRequest.read.STRING, "");
    }

    private getWrappedMetadataFormat() {
    }

    public enum write implements getDownloadIndex.write {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        private final int MediaBrowserCompatMediaItem;

        static {
            new Object() { // from class: o.getWrappedMetadataFormat.write.3
            };
        }

        @Override // o.getDownloadIndex.write
        public final int AudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatMediaItem;
        }

        public static write read(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static getDownloadIndex.AudioAttributesCompatParcelizer IconCompatParcelizer() {
            return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        static final class RemoteActionCompatParcelizer implements getDownloadIndex.AudioAttributesCompatParcelizer {
            static final getDownloadIndex.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();

            private RemoteActionCompatParcelizer() {
            }
        }

        write(int i) {
            this.MediaBrowserCompatMediaItem = i;
        }
    }

    public enum read implements getDownloadIndex.write {
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        private final int IconCompatParcelizer;

        static {
            new Object() { // from class: o.getWrappedMetadataFormat.read.5
            };
        }

        @Override // o.getDownloadIndex.write
        public final int AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public static getDownloadIndex.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
            return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        }

        static final class AudioAttributesCompatParcelizer implements getDownloadIndex.AudioAttributesCompatParcelizer {
            static final getDownloadIndex.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();

            private AudioAttributesCompatParcelizer() {
            }
        }

        read(int i) {
            this.IconCompatParcelizer = i;
        }
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.url_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(String str) {
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    public final boolean MediaMetadataCompat() {
        return (this.bitField0_ & 2) != 0;
    }

    public final write write() {
        write writeVar = write.read(this.httpMethod_);
        return writeVar == null ? write.HTTP_METHOD_UNKNOWN : writeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(write writeVar) {
        this.httpMethod_ = writeVar.AudioAttributesCompatParcelizer();
        this.bitField0_ |= 2;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return (this.bitField0_ & 4) != 0;
    }

    public final long AudioAttributesImplBaseParcelizer() {
        return this.requestPayloadBytes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    public final boolean onCommand() {
        return (this.bitField0_ & 8) != 0;
    }

    public final long AudioAttributesImplApi26Parcelizer() {
        return this.responsePayloadBytes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(read readVar) {
        this.networkClientErrorReason_ = readVar.AudioAttributesCompatParcelizer();
        this.bitField0_ |= 16;
    }

    public final boolean onAddQueueItem() {
        return (this.bitField0_ & 32) != 0;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.httpResponseCode_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    private String onSkipToQueueItem() {
        return this.responseContentType_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(String str) {
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStop() {
        this.bitField0_ &= -65;
        this.responseContentType_ = AudioAttributesCompatParcelizer().onSkipToQueueItem();
    }

    public final boolean RatingCompat() {
        return (this.bitField0_ & 128) != 0;
    }

    public final long IconCompatParcelizer() {
        return this.clientStartTimeUs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return (this.bitField0_ & 256) != 0;
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.timeToRequestCompletedUs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    public final boolean onMediaButtonEvent() {
        return (this.bitField0_ & 512) != 0;
    }

    public final long MediaDescriptionCompat() {
        return this.timeToResponseInitiatedUs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplBaseParcelizer(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    public final boolean onCustomAction() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final long MediaBrowserCompatMediaItem() {
        return this.timeToResponseCompletedUs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    public final List<MetadataDecoderFactory> MediaBrowserCompatItemReceiver() {
        return this.perfSessions_;
    }

    private void setSessionImpl() {
        getDownloadIndex.MediaBrowserCompatItemReceiver<MetadataDecoderFactory> mediaBrowserCompatItemReceiver = this.perfSessions_;
        if (mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()) {
            return;
        }
        this.perfSessions_ = updateWaitingForRequirements.read(mediaBrowserCompatItemReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(Iterable<? extends MetadataDecoderFactory> iterable) {
        setSessionImpl();
        r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I.write(iterable, this.perfSessions_);
    }

    public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
        return DEFAULT_INSTANCE.onPlayFromSearch();
    }

    public static final class RemoteActionCompatParcelizer extends updateWaitingForRequirements.RemoteActionCompatParcelizer<getWrappedMetadataFormat, RemoteActionCompatParcelizer> implements length {
        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        private RemoteActionCompatParcelizer() {
            super(getWrappedMetadataFormat.DEFAULT_INSTANCE);
        }

        public final RemoteActionCompatParcelizer write(String str) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).read(str);
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(write writeVar) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).read(writeVar);
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(long j) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).read(j);
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(long j) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).IconCompatParcelizer(j);
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(read readVar) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).write(readVar);
            return this;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return ((getWrappedMetadataFormat) this.write).onAddQueueItem();
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).IconCompatParcelizer(i);
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).RemoteActionCompatParcelizer(str);
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer() {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).onStop();
            return this;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return ((getWrappedMetadataFormat) this.write).RatingCompat();
        }

        public final RemoteActionCompatParcelizer write(long j) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).AudioAttributesCompatParcelizer(j);
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(long j) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).write(j);
            return this;
        }

        public final long read() {
            return ((getWrappedMetadataFormat) this.write).MediaDescriptionCompat();
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer(long j) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).AudioAttributesImplBaseParcelizer(j);
            return this;
        }

        public final boolean write() {
            return ((getWrappedMetadataFormat) this.write).onCustomAction();
        }

        public final RemoteActionCompatParcelizer read(long j) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).RemoteActionCompatParcelizer(j);
            return this;
        }

        public final RemoteActionCompatParcelizer write(Iterable<? extends MetadataDecoderFactory> iterable) {
            onCustomAction();
            ((getWrappedMetadataFormat) this.write).read(iterable);
            return this;
        }
    }

    /* JADX INFO: renamed from: o.getWrappedMetadataFormat$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[updateWaitingForRequirements.AudioAttributesCompatParcelizer.values().length];
            write = iArr;
            try {
                iArr[updateWaitingForRequirements.AudioAttributesCompatParcelizer.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[updateWaitingForRequirements.AudioAttributesCompatParcelizer.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[updateWaitingForRequirements.AudioAttributesCompatParcelizer.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                write[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                write[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                write[updateWaitingForRequirements.AudioAttributesCompatParcelizer.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // kotlin.updateWaitingForRequirements
    public final Object IconCompatParcelizer(updateWaitingForRequirements.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        onTaskStopped writeVar;
        switch (AnonymousClass2.write[audioAttributesCompatParcelizer.ordinal()]) {
            case 1:
                return new getWrappedMetadataFormat();
            case 2:
                return new RemoteActionCompatParcelizer((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", write.IconCompatParcelizer(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", read.RemoteActionCompatParcelizer(), "customAttributes_", IconCompatParcelizer.read, "perfSessions_", MetadataDecoderFactory.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<getWrappedMetadataFormat> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (getWrappedMetadataFormat.class) {
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
        getWrappedMetadataFormat getwrappedmetadataformat = new getWrappedMetadataFormat();
        DEFAULT_INSTANCE = getwrappedmetadataformat;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(getWrappedMetadataFormat.class, getwrappedmetadataformat);
    }

    public static getWrappedMetadataFormat AudioAttributesCompatParcelizer() {
        return DEFAULT_INSTANCE;
    }
}
