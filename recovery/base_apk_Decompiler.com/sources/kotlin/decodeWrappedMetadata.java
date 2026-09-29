package kotlin;

import kotlin.getDownloadIndex;
import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes5.dex */
public final class decodeWrappedMetadata extends updateWaitingForRequirements<decodeWrappedMetadata, AudioAttributesCompatParcelizer> implements invokeRenderer {
    private static final decodeWrappedMetadata DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile onTaskStopped<decodeWrappedMetadata> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    private decodeWrappedMetadata() {
    }

    public enum RemoteActionCompatParcelizer implements getDownloadIndex.write {
        /* JADX INFO: Fake field, exist only in values array */
        SOURCE_UNKNOWN(0),
        /* JADX INFO: Fake field, exist only in values array */
        FL_LEGACY_V1(1);

        private final int IconCompatParcelizer;

        static {
            new Object() { // from class: o.decodeWrappedMetadata.RemoteActionCompatParcelizer.5
            };
        }

        @Override // o.getDownloadIndex.write
        public final int AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public static getDownloadIndex.AudioAttributesCompatParcelizer read() {
            return IconCompatParcelizer.IconCompatParcelizer;
        }

        static final class IconCompatParcelizer implements getDownloadIndex.AudioAttributesCompatParcelizer {
            static final getDownloadIndex.AudioAttributesCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

            private IconCompatParcelizer() {
            }
        }

        RemoteActionCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends updateWaitingForRequirements.RemoteActionCompatParcelizer<decodeWrappedMetadata, AudioAttributesCompatParcelizer> implements invokeRenderer {
        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        private AudioAttributesCompatParcelizer() {
            super(decodeWrappedMetadata.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.decodeWrappedMetadata$2, reason: invalid class name */
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
                return new decodeWrappedMetadata();
            case 2:
                return new AudioAttributesCompatParcelizer((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", RemoteActionCompatParcelizer.read()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<decodeWrappedMetadata> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (decodeWrappedMetadata.class) {
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
        decodeWrappedMetadata decodewrappedmetadata = new decodeWrappedMetadata();
        DEFAULT_INSTANCE = decodewrappedmetadata;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(decodeWrappedMetadata.class, decodewrappedmetadata);
    }
}
