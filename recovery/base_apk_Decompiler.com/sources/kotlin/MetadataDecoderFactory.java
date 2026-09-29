package kotlin;

import kotlin.getDownloadIndex;
import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
public final class MetadataDecoderFactory extends updateWaitingForRequirements<MetadataDecoderFactory, read> implements MetadataOutput {
    private static final MetadataDecoderFactory DEFAULT_INSTANCE;
    private static volatile onTaskStopped<MetadataDecoderFactory> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final getDownloadIndex.read.IconCompatParcelizer<Integer, MetadataDecoderFactory1> sessionVerbosity_converter_ = new getDownloadIndex.read.IconCompatParcelizer<Integer, MetadataDecoderFactory1>() { // from class: o.MetadataDecoderFactory.5
    };
    private int bitField0_;
    private String sessionId_ = "";
    private getDownloadIndex.IconCompatParcelizer sessionVerbosity_ = onPlayFromMediaId();

    private MetadataDecoderFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(String str) {
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    static {
        MetadataDecoderFactory metadataDecoderFactory = new MetadataDecoderFactory();
        DEFAULT_INSTANCE = metadataDecoderFactory;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(MetadataDecoderFactory.class, metadataDecoderFactory);
    }

    public final int RemoteActionCompatParcelizer() {
        return this.sessionVerbosity_.size();
    }

    public final MetadataDecoderFactory1 read() {
        MetadataDecoderFactory1 metadataDecoderFactory1 = MetadataDecoderFactory1.read(this.sessionVerbosity_.write(0));
        return metadataDecoderFactory1 == null ? MetadataDecoderFactory1.SESSION_VERBOSITY_NONE : metadataDecoderFactory1;
    }

    private void AudioAttributesCompatParcelizer() {
        getDownloadIndex.IconCompatParcelizer iconCompatParcelizer = this.sessionVerbosity_;
        if (iconCompatParcelizer.AudioAttributesCompatParcelizer()) {
            return;
        }
        this.sessionVerbosity_ = updateWaitingForRequirements.RemoteActionCompatParcelizer(iconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(MetadataDecoderFactory1 metadataDecoderFactory1) {
        AudioAttributesCompatParcelizer();
        this.sessionVerbosity_.RemoteActionCompatParcelizer(metadataDecoderFactory1.AudioAttributesCompatParcelizer());
    }

    public static read IconCompatParcelizer() {
        return DEFAULT_INSTANCE.onPlayFromSearch();
    }

    public static final class read extends updateWaitingForRequirements.RemoteActionCompatParcelizer<MetadataDecoderFactory, read> implements MetadataOutput {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(MetadataDecoderFactory.DEFAULT_INSTANCE);
        }

        public final read AudioAttributesCompatParcelizer(String str) {
            onCustomAction();
            ((MetadataDecoderFactory) this.write).write(str);
            return this;
        }

        public final read IconCompatParcelizer(MetadataDecoderFactory1 metadataDecoderFactory1) {
            onCustomAction();
            ((MetadataDecoderFactory) this.write).IconCompatParcelizer(metadataDecoderFactory1);
            return this;
        }
    }

    /* JADX INFO: renamed from: o.MetadataDecoderFactory$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
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
        switch (AnonymousClass3.write[audioAttributesCompatParcelizer.ordinal()]) {
            case 1:
                return new MetadataDecoderFactory();
            case 2:
                return new read((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", MetadataDecoderFactory1.write()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<MetadataDecoderFactory> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (MetadataDecoderFactory.class) {
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
}
