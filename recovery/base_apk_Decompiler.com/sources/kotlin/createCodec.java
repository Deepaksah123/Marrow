package kotlin;

import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
public final class createCodec extends updateWaitingForRequirements<createCodec, read> implements SynchronousMediaCodecAdapterFactory {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final createCodec DEFAULT_INSTANCE;
    private static volatile onTaskStopped<createCodec> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    private createCodec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    public static read write() {
        return DEFAULT_INSTANCE.onPlayFromSearch();
    }

    public static final class read extends updateWaitingForRequirements.RemoteActionCompatParcelizer<createCodec, read> implements SynchronousMediaCodecAdapterFactory {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(createCodec.DEFAULT_INSTANCE);
        }

        public final read RemoteActionCompatParcelizer(long j) {
            onCustomAction();
            ((createCodec) this.write).read(j);
            return this;
        }

        public final read write(long j) {
            onCustomAction();
            ((createCodec) this.write).RemoteActionCompatParcelizer(j);
            return this;
        }

        public final read AudioAttributesCompatParcelizer(long j) {
            onCustomAction();
            ((createCodec) this.write).write(j);
            return this;
        }
    }

    /* JADX INFO: renamed from: o.createCodec$4, reason: invalid class name */
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
                return new createCodec();
            case 2:
                return new read((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<createCodec> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (createCodec.class) {
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
        createCodec createcodec = new createCodec();
        DEFAULT_INSTANCE = createcodec;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(createCodec.class, createcodec);
    }
}
