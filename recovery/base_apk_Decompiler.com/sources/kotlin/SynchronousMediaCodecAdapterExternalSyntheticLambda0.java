package kotlin;

import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
public final class SynchronousMediaCodecAdapterExternalSyntheticLambda0 extends updateWaitingForRequirements<SynchronousMediaCodecAdapterExternalSyntheticLambda0, read> implements MediaCodecUtilScoreProvider {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final SynchronousMediaCodecAdapterExternalSyntheticLambda0 DEFAULT_INSTANCE;
    private static volatile onTaskStopped<SynchronousMediaCodecAdapterExternalSyntheticLambda0> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    private SynchronousMediaCodecAdapterExternalSyntheticLambda0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(int i) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i;
    }

    public static read IconCompatParcelizer() {
        return DEFAULT_INSTANCE.onPlayFromSearch();
    }

    public static final class read extends updateWaitingForRequirements.RemoteActionCompatParcelizer<SynchronousMediaCodecAdapterExternalSyntheticLambda0, read> implements MediaCodecUtilScoreProvider {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(SynchronousMediaCodecAdapterExternalSyntheticLambda0.DEFAULT_INSTANCE);
        }

        public final read RemoteActionCompatParcelizer(long j) {
            onCustomAction();
            ((SynchronousMediaCodecAdapterExternalSyntheticLambda0) this.write).read(j);
            return this;
        }

        public final read write(int i) {
            onCustomAction();
            ((SynchronousMediaCodecAdapterExternalSyntheticLambda0) this.write).RemoteActionCompatParcelizer(i);
            return this;
        }
    }

    /* JADX INFO: renamed from: o.SynchronousMediaCodecAdapterExternalSyntheticLambda0$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
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
        switch (AnonymousClass5.RemoteActionCompatParcelizer[audioAttributesCompatParcelizer.ordinal()]) {
            case 1:
                return new SynchronousMediaCodecAdapterExternalSyntheticLambda0();
            case 2:
                return new read((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<SynchronousMediaCodecAdapterExternalSyntheticLambda0> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (SynchronousMediaCodecAdapterExternalSyntheticLambda0.class) {
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
        SynchronousMediaCodecAdapterExternalSyntheticLambda0 synchronousMediaCodecAdapterExternalSyntheticLambda0 = new SynchronousMediaCodecAdapterExternalSyntheticLambda0();
        DEFAULT_INSTANCE = synchronousMediaCodecAdapterExternalSyntheticLambda0;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(SynchronousMediaCodecAdapterExternalSyntheticLambda0.class, synchronousMediaCodecAdapterExternalSyntheticLambda0);
    }
}
