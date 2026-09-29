package kotlin;

import kotlin.getDownloadIndex;
import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
public final class copyWithAppendedEntriesFrom extends updateWaitingForRequirements<copyWithAppendedEntriesFrom, IconCompatParcelizer> implements Metadata1 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final copyWithAppendedEntriesFrom DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile onTaskStopped<copyWithAppendedEntriesFrom> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private copyWithPresentationTimeUs gaugeMetadata_;
    private String sessionId_ = "";
    private getDownloadIndex.MediaBrowserCompatItemReceiver<createCodec> cpuMetricReadings_ = onPrepare();
    private getDownloadIndex.MediaBrowserCompatItemReceiver<SynchronousMediaCodecAdapterExternalSyntheticLambda0> androidMemoryReadings_ = onPrepare();

    private copyWithAppendedEntriesFrom() {
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(String str) {
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return (this.bitField0_ & 2) != 0;
    }

    public final copyWithPresentationTimeUs AudioAttributesImplBaseParcelizer() {
        copyWithPresentationTimeUs copywithpresentationtimeus = this.gaugeMetadata_;
        return copywithpresentationtimeus == null ? copyWithPresentationTimeUs.read() : copywithpresentationtimeus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(copyWithPresentationTimeUs copywithpresentationtimeus) {
        this.gaugeMetadata_ = copywithpresentationtimeus;
        this.bitField0_ |= 2;
    }

    public final int read() {
        return this.cpuMetricReadings_.size();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        getDownloadIndex.MediaBrowserCompatItemReceiver<createCodec> mediaBrowserCompatItemReceiver = this.cpuMetricReadings_;
        if (mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()) {
            return;
        }
        this.cpuMetricReadings_ = updateWaitingForRequirements.read(mediaBrowserCompatItemReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(createCodec createcodec) {
        MediaBrowserCompatCustomActionResultReceiver();
        this.cpuMetricReadings_.add(createcodec);
    }

    public final int IconCompatParcelizer() {
        return this.androidMemoryReadings_.size();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        getDownloadIndex.MediaBrowserCompatItemReceiver<SynchronousMediaCodecAdapterExternalSyntheticLambda0> mediaBrowserCompatItemReceiver = this.androidMemoryReadings_;
        if (mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()) {
            return;
        }
        this.androidMemoryReadings_ = updateWaitingForRequirements.read(mediaBrowserCompatItemReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(SynchronousMediaCodecAdapterExternalSyntheticLambda0 synchronousMediaCodecAdapterExternalSyntheticLambda0) {
        AudioAttributesImplApi26Parcelizer();
        this.androidMemoryReadings_.add(synchronousMediaCodecAdapterExternalSyntheticLambda0);
    }

    public static IconCompatParcelizer RemoteActionCompatParcelizer() {
        return DEFAULT_INSTANCE.onPlayFromSearch();
    }

    public static final class IconCompatParcelizer extends updateWaitingForRequirements.RemoteActionCompatParcelizer<copyWithAppendedEntriesFrom, IconCompatParcelizer> implements Metadata1 {
        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
            super(copyWithAppendedEntriesFrom.DEFAULT_INSTANCE);
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            onCustomAction();
            ((copyWithAppendedEntriesFrom) this.write).IconCompatParcelizer(str);
            return this;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(copyWithPresentationTimeUs copywithpresentationtimeus) {
            onCustomAction();
            ((copyWithAppendedEntriesFrom) this.write).read(copywithpresentationtimeus);
            return this;
        }

        public final IconCompatParcelizer write(createCodec createcodec) {
            onCustomAction();
            ((copyWithAppendedEntriesFrom) this.write).IconCompatParcelizer(createcodec);
            return this;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(SynchronousMediaCodecAdapterExternalSyntheticLambda0 synchronousMediaCodecAdapterExternalSyntheticLambda0) {
            onCustomAction();
            ((copyWithAppendedEntriesFrom) this.write).AudioAttributesCompatParcelizer(synchronousMediaCodecAdapterExternalSyntheticLambda0);
            return this;
        }
    }

    /* JADX INFO: renamed from: o.copyWithAppendedEntriesFrom$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[updateWaitingForRequirements.AudioAttributesCompatParcelizer.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[updateWaitingForRequirements.AudioAttributesCompatParcelizer.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RemoteActionCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RemoteActionCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RemoteActionCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                RemoteActionCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                RemoteActionCompatParcelizer[updateWaitingForRequirements.AudioAttributesCompatParcelizer.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // kotlin.updateWaitingForRequirements
    public final Object IconCompatParcelizer(updateWaitingForRequirements.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        onTaskStopped writeVar;
        switch (AnonymousClass4.RemoteActionCompatParcelizer[audioAttributesCompatParcelizer.ordinal()]) {
            case 1:
                return new copyWithAppendedEntriesFrom();
            case 2:
                return new IconCompatParcelizer((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", createCodec.class, "gaugeMetadata_", "androidMemoryReadings_", SynchronousMediaCodecAdapterExternalSyntheticLambda0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<copyWithAppendedEntriesFrom> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (copyWithAppendedEntriesFrom.class) {
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
        copyWithAppendedEntriesFrom copywithappendedentriesfrom = new copyWithAppendedEntriesFrom();
        DEFAULT_INSTANCE = copywithappendedentriesfrom;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(copyWithAppendedEntriesFrom.class, copywithappendedentriesfrom);
    }

    public static copyWithAppendedEntriesFrom write() {
        return DEFAULT_INSTANCE;
    }
}
