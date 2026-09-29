package kotlin;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.DownloadRequest;
import kotlin.getDownloadIndex;
import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
public final class MetadataInputBuffer extends updateWaitingForRequirements<MetadataInputBuffer, RemoteActionCompatParcelizer> implements MetadataDecoder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final MetadataInputBuffer DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile onTaskStopped<MetadataInputBuffer> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private setMaxParallelDownloads<String, Long> counters_ = setMaxParallelDownloads.AudioAttributesCompatParcelizer();
    private setMaxParallelDownloads<String, String> customAttributes_ = setMaxParallelDownloads.AudioAttributesCompatParcelizer();
    private String name_ = "";
    private getDownloadIndex.MediaBrowserCompatItemReceiver<MetadataInputBuffer> subtraces_ = onPrepare();
    private getDownloadIndex.MediaBrowserCompatItemReceiver<MetadataDecoderFactory> perfSessions_ = onPrepare();

    static final class AudioAttributesCompatParcelizer {
        static final setMinRetryCount<String, String> read = setMinRetryCount.RemoteActionCompatParcelizer(DownloadRequest.read.STRING, "", DownloadRequest.read.STRING, "");
    }

    static final class read {
        static final setMinRetryCount<String, Long> write = setMinRetryCount.RemoteActionCompatParcelizer(DownloadRequest.read.STRING, "", DownloadRequest.read.INT64, 0L);
    }

    private MetadataInputBuffer() {
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(String str) {
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    public final boolean MediaMetadataCompat() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    public final long AudioAttributesImplApi26Parcelizer() {
        return this.durationUs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    private setMaxParallelDownloads<String, Long> onAddQueueItem() {
        return this.counters_;
    }

    private setMaxParallelDownloads<String, Long> onCommand() {
        if (!this.counters_.IconCompatParcelizer()) {
            this.counters_ = this.counters_.read();
        }
        return this.counters_;
    }

    public final int AudioAttributesCompatParcelizer() {
        return onAddQueueItem().size();
    }

    public final Map<String, Long> IconCompatParcelizer() {
        return Collections.unmodifiableMap(onAddQueueItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> MediaDescriptionCompat() {
        return onCommand();
    }

    public final List<MetadataInputBuffer> MediaBrowserCompatCustomActionResultReceiver() {
        return this.subtraces_;
    }

    private void RatingCompat() {
        getDownloadIndex.MediaBrowserCompatItemReceiver<MetadataInputBuffer> mediaBrowserCompatItemReceiver = this.subtraces_;
        if (mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()) {
            return;
        }
        this.subtraces_ = updateWaitingForRequirements.read(mediaBrowserCompatItemReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(MetadataInputBuffer metadataInputBuffer) {
        RatingCompat();
        this.subtraces_.add(metadataInputBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(Iterable<? extends MetadataInputBuffer> iterable) {
        RatingCompat();
        r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I.write(iterable, this.subtraces_);
    }

    private setMaxParallelDownloads<String, String> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.customAttributes_;
    }

    private setMaxParallelDownloads<String, String> handleMediaPlayPauseIfPendingOnHandler() {
        if (!this.customAttributes_.IconCompatParcelizer()) {
            this.customAttributes_ = this.customAttributes_.read();
        }
        return this.customAttributes_;
    }

    public final boolean RemoteActionCompatParcelizer(String str) {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().containsKey(str);
    }

    public final Map<String, String> AudioAttributesImplApi21Parcelizer() {
        return Collections.unmodifiableMap(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> MediaBrowserCompatSearchResultReceiver() {
        return handleMediaPlayPauseIfPendingOnHandler();
    }

    public final List<MetadataDecoderFactory> AudioAttributesImplBaseParcelizer() {
        return this.perfSessions_;
    }

    private void MediaBrowserCompatMediaItem() {
        getDownloadIndex.MediaBrowserCompatItemReceiver<MetadataDecoderFactory> mediaBrowserCompatItemReceiver = this.perfSessions_;
        if (mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()) {
            return;
        }
        this.perfSessions_ = updateWaitingForRequirements.read(mediaBrowserCompatItemReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(MetadataDecoderFactory metadataDecoderFactory) {
        MediaBrowserCompatMediaItem();
        this.perfSessions_.add(metadataDecoderFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(Iterable<? extends MetadataDecoderFactory> iterable) {
        MediaBrowserCompatMediaItem();
        r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I.write(iterable, this.perfSessions_);
    }

    public static RemoteActionCompatParcelizer read() {
        return DEFAULT_INSTANCE.onPlayFromSearch();
    }

    public static final class RemoteActionCompatParcelizer extends updateWaitingForRequirements.RemoteActionCompatParcelizer<MetadataInputBuffer, RemoteActionCompatParcelizer> implements MetadataDecoder {
        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        private RemoteActionCompatParcelizer() {
            super(MetadataInputBuffer.DEFAULT_INSTANCE);
        }

        public final RemoteActionCompatParcelizer read(String str) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).read(str);
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(long j) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).read(j);
            return this;
        }

        public final RemoteActionCompatParcelizer read(long j) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).RemoteActionCompatParcelizer(j);
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str, long j) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).MediaDescriptionCompat().put(str, Long.valueOf(j));
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(Map<String, Long> map) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).MediaDescriptionCompat().putAll(map);
            return this;
        }

        public final RemoteActionCompatParcelizer write(MetadataInputBuffer metadataInputBuffer) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).read(metadataInputBuffer);
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(Iterable<? extends MetadataInputBuffer> iterable) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).RemoteActionCompatParcelizer(iterable);
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str, String str2) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).MediaBrowserCompatSearchResultReceiver().put(str, str2);
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(Map<String, String> map) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).MediaBrowserCompatSearchResultReceiver().putAll(map);
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(MetadataDecoderFactory metadataDecoderFactory) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).read(metadataDecoderFactory);
            return this;
        }

        public final RemoteActionCompatParcelizer write(Iterable<? extends MetadataDecoderFactory> iterable) {
            onCustomAction();
            ((MetadataInputBuffer) this.write).AudioAttributesCompatParcelizer(iterable);
            return this;
        }
    }

    /* JADX INFO: renamed from: o.MetadataInputBuffer$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
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
        switch (AnonymousClass4.write[audioAttributesCompatParcelizer.ordinal()]) {
            case 1:
                return new MetadataInputBuffer();
            case 2:
                return new RemoteActionCompatParcelizer((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", read.write, "subtraces_", MetadataInputBuffer.class, "customAttributes_", AudioAttributesCompatParcelizer.read, "perfSessions_", MetadataDecoderFactory.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<MetadataInputBuffer> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (MetadataInputBuffer.class) {
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
        MetadataInputBuffer metadataInputBuffer = new MetadataInputBuffer();
        DEFAULT_INSTANCE = metadataInputBuffer;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(MetadataInputBuffer.class, metadataInputBuffer);
    }

    public static MetadataInputBuffer write() {
        return DEFAULT_INSTANCE;
    }
}
