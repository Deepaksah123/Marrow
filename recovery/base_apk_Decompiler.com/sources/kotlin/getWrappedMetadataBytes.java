package kotlin;

import kotlin.SynchronousMediaCodecAdapter;
import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
public final class getWrappedMetadataBytes extends updateWaitingForRequirements<getWrappedMetadataBytes, read> implements populateMediaMetadata {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final getWrappedMetadataBytes DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile onTaskStopped<getWrappedMetadataBytes> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private SynchronousMediaCodecAdapter applicationInfo_;
    private int bitField0_;
    private copyWithAppendedEntriesFrom gaugeMetric_;
    private getWrappedMetadataFormat networkRequestMetric_;
    private MetadataInputBuffer traceMetric_;
    private decodeWrappedMetadata transportInfo_;

    private getWrappedMetadataBytes() {
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return (this.bitField0_ & 1) != 0;
    }

    public final SynchronousMediaCodecAdapter RemoteActionCompatParcelizer() {
        SynchronousMediaCodecAdapter synchronousMediaCodecAdapter = this.applicationInfo_;
        return synchronousMediaCodecAdapter == null ? SynchronousMediaCodecAdapter.read() : synchronousMediaCodecAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(SynchronousMediaCodecAdapter synchronousMediaCodecAdapter) {
        this.applicationInfo_ = synchronousMediaCodecAdapter;
        this.bitField0_ |= 1;
    }

    @Override // kotlin.populateMediaMetadata
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // kotlin.populateMediaMetadata
    public final MetadataInputBuffer AudioAttributesImplApi21Parcelizer() {
        MetadataInputBuffer metadataInputBuffer = this.traceMetric_;
        return metadataInputBuffer == null ? MetadataInputBuffer.write() : metadataInputBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(MetadataInputBuffer metadataInputBuffer) {
        this.traceMetric_ = metadataInputBuffer;
        this.bitField0_ |= 2;
    }

    @Override // kotlin.populateMediaMetadata
    public final boolean MediaBrowserCompatItemReceiver() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // kotlin.populateMediaMetadata
    public final getWrappedMetadataFormat IconCompatParcelizer() {
        getWrappedMetadataFormat getwrappedmetadataformat = this.networkRequestMetric_;
        return getwrappedmetadataformat == null ? getWrappedMetadataFormat.AudioAttributesCompatParcelizer() : getwrappedmetadataformat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(getWrappedMetadataFormat getwrappedmetadataformat) {
        this.networkRequestMetric_ = getwrappedmetadataformat;
        this.bitField0_ |= 4;
    }

    @Override // kotlin.populateMediaMetadata
    public final boolean AudioAttributesImplBaseParcelizer() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // kotlin.populateMediaMetadata
    public final copyWithAppendedEntriesFrom read() {
        copyWithAppendedEntriesFrom copywithappendedentriesfrom = this.gaugeMetric_;
        return copywithappendedentriesfrom == null ? copyWithAppendedEntriesFrom.write() : copywithappendedentriesfrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(copyWithAppendedEntriesFrom copywithappendedentriesfrom) {
        this.gaugeMetric_ = copywithappendedentriesfrom;
        this.bitField0_ |= 8;
    }

    public static read write() {
        return DEFAULT_INSTANCE.onPlayFromSearch();
    }

    public static final class read extends updateWaitingForRequirements.RemoteActionCompatParcelizer<getWrappedMetadataBytes, read> implements populateMediaMetadata {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(getWrappedMetadataBytes.DEFAULT_INSTANCE);
        }

        public final read read(SynchronousMediaCodecAdapter.IconCompatParcelizer iconCompatParcelizer) {
            onCustomAction();
            ((getWrappedMetadataBytes) this.write).AudioAttributesCompatParcelizer(iconCompatParcelizer.MediaBrowserCompatMediaItem());
            return this;
        }

        @Override // kotlin.populateMediaMetadata
        public final boolean AudioAttributesImplApi26Parcelizer() {
            return ((getWrappedMetadataBytes) this.write).AudioAttributesImplApi26Parcelizer();
        }

        @Override // kotlin.populateMediaMetadata
        public final MetadataInputBuffer AudioAttributesImplApi21Parcelizer() {
            return ((getWrappedMetadataBytes) this.write).AudioAttributesImplApi21Parcelizer();
        }

        public final read AudioAttributesCompatParcelizer(MetadataInputBuffer metadataInputBuffer) {
            onCustomAction();
            ((getWrappedMetadataBytes) this.write).IconCompatParcelizer(metadataInputBuffer);
            return this;
        }

        @Override // kotlin.populateMediaMetadata
        public final boolean MediaBrowserCompatItemReceiver() {
            return ((getWrappedMetadataBytes) this.write).MediaBrowserCompatItemReceiver();
        }

        @Override // kotlin.populateMediaMetadata
        public final getWrappedMetadataFormat IconCompatParcelizer() {
            return ((getWrappedMetadataBytes) this.write).IconCompatParcelizer();
        }

        public final read read(getWrappedMetadataFormat getwrappedmetadataformat) {
            onCustomAction();
            ((getWrappedMetadataBytes) this.write).IconCompatParcelizer(getwrappedmetadataformat);
            return this;
        }

        @Override // kotlin.populateMediaMetadata
        public final boolean AudioAttributesImplBaseParcelizer() {
            return ((getWrappedMetadataBytes) this.write).AudioAttributesImplBaseParcelizer();
        }

        @Override // kotlin.populateMediaMetadata
        public final copyWithAppendedEntriesFrom read() {
            return ((getWrappedMetadataBytes) this.write).read();
        }

        public final read AudioAttributesCompatParcelizer(copyWithAppendedEntriesFrom copywithappendedentriesfrom) {
            onCustomAction();
            ((getWrappedMetadataBytes) this.write).read(copywithappendedentriesfrom);
            return this;
        }
    }

    /* JADX INFO: renamed from: o.getWrappedMetadataBytes$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
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
        switch (AnonymousClass5.write[audioAttributesCompatParcelizer.ordinal()]) {
            case 1:
                return new getWrappedMetadataBytes();
            case 2:
                return new read((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<getWrappedMetadataBytes> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (getWrappedMetadataBytes.class) {
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
        getWrappedMetadataBytes getwrappedmetadatabytes = new getWrappedMetadataBytes();
        DEFAULT_INSTANCE = getwrappedmetadatabytes;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(getWrappedMetadataBytes.class, getwrappedmetadatabytes);
    }
}
