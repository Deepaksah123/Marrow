package kotlin;

import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
public final class copyWithPresentationTimeUs extends updateWaitingForRequirements<copyWithPresentationTimeUs, AudioAttributesCompatParcelizer> implements copyWithAppendedEntries {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final copyWithPresentationTimeUs DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile onTaskStopped<copyWithPresentationTimeUs> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    private copyWithPresentationTimeUs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(int i) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i;
    }

    public final boolean write() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(int i) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(int i) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    public static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
        return DEFAULT_INSTANCE.onPlayFromSearch();
    }

    public static final class AudioAttributesCompatParcelizer extends updateWaitingForRequirements.RemoteActionCompatParcelizer<copyWithPresentationTimeUs, AudioAttributesCompatParcelizer> implements copyWithAppendedEntries {
        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        private AudioAttributesCompatParcelizer() {
            super(copyWithPresentationTimeUs.DEFAULT_INSTANCE);
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
            onCustomAction();
            ((copyWithPresentationTimeUs) this.write).read(i);
            return this;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i) {
            onCustomAction();
            ((copyWithPresentationTimeUs) this.write).IconCompatParcelizer(i);
            return this;
        }

        public final AudioAttributesCompatParcelizer read(int i) {
            onCustomAction();
            ((copyWithPresentationTimeUs) this.write).RemoteActionCompatParcelizer(i);
            return this;
        }
    }

    /* JADX INFO: renamed from: o.copyWithPresentationTimeUs$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[updateWaitingForRequirements.AudioAttributesCompatParcelizer.values().length];
            read = iArr;
            try {
                iArr[updateWaitingForRequirements.AudioAttributesCompatParcelizer.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[updateWaitingForRequirements.AudioAttributesCompatParcelizer.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[updateWaitingForRequirements.AudioAttributesCompatParcelizer.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                read[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                read[updateWaitingForRequirements.AudioAttributesCompatParcelizer.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                read[updateWaitingForRequirements.AudioAttributesCompatParcelizer.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // kotlin.updateWaitingForRequirements
    public final Object IconCompatParcelizer(updateWaitingForRequirements.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        onTaskStopped writeVar;
        switch (AnonymousClass4.read[audioAttributesCompatParcelizer.ordinal()]) {
            case 1:
                return new copyWithPresentationTimeUs();
            case 2:
                return new AudioAttributesCompatParcelizer((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<copyWithPresentationTimeUs> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (copyWithPresentationTimeUs.class) {
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
        copyWithPresentationTimeUs copywithpresentationtimeus = new copyWithPresentationTimeUs();
        DEFAULT_INSTANCE = copywithpresentationtimeus;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(copyWithPresentationTimeUs.class, copywithpresentationtimeus);
    }

    public static copyWithPresentationTimeUs read() {
        return DEFAULT_INSTANCE;
    }
}
