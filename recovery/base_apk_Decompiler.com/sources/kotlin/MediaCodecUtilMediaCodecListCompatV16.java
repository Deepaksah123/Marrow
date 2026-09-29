package kotlin;

import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaCodecUtilMediaCodecListCompatV16 extends updateWaitingForRequirements<MediaCodecUtilMediaCodecListCompatV16, RemoteActionCompatParcelizer> implements MediaCodecUtilMediaCodecListCompatV21 {
    private static final MediaCodecUtilMediaCodecListCompatV16 DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile onTaskStopped<MediaCodecUtilMediaCodecListCompatV16> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    private MediaCodecUtilMediaCodecListCompatV16() {
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(String str) {
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(String str) {
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(String str) {
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    public static RemoteActionCompatParcelizer IconCompatParcelizer() {
        return DEFAULT_INSTANCE.onPlayFromSearch();
    }

    public static final class RemoteActionCompatParcelizer extends updateWaitingForRequirements.RemoteActionCompatParcelizer<MediaCodecUtilMediaCodecListCompatV16, RemoteActionCompatParcelizer> implements MediaCodecUtilMediaCodecListCompatV21 {
        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        private RemoteActionCompatParcelizer() {
            super(MediaCodecUtilMediaCodecListCompatV16.DEFAULT_INSTANCE);
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str) {
            onCustomAction();
            ((MediaCodecUtilMediaCodecListCompatV16) this.write).RemoteActionCompatParcelizer(str);
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            onCustomAction();
            ((MediaCodecUtilMediaCodecListCompatV16) this.write).read(str);
            return this;
        }

        public final RemoteActionCompatParcelizer write(String str) {
            onCustomAction();
            ((MediaCodecUtilMediaCodecListCompatV16) this.write).IconCompatParcelizer(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: o.MediaCodecUtilMediaCodecListCompatV16$5, reason: invalid class name */
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
                return new MediaCodecUtilMediaCodecListCompatV16();
            case 2:
                return new RemoteActionCompatParcelizer((byte) 0);
            case 3:
                return AudioAttributesCompatParcelizer(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                onTaskStopped<MediaCodecUtilMediaCodecListCompatV16> ontaskstopped = PARSER;
                if (ontaskstopped != null) {
                    return ontaskstopped;
                }
                synchronized (MediaCodecUtilMediaCodecListCompatV16.class) {
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
        MediaCodecUtilMediaCodecListCompatV16 mediaCodecUtilMediaCodecListCompatV16 = new MediaCodecUtilMediaCodecListCompatV16();
        DEFAULT_INSTANCE = mediaCodecUtilMediaCodecListCompatV16;
        updateWaitingForRequirements.RemoteActionCompatParcelizer(MediaCodecUtilMediaCodecListCompatV16.class, mediaCodecUtilMediaCodecListCompatV16);
    }

    public static MediaCodecUtilMediaCodecListCompatV16 read() {
        return DEFAULT_INSTANCE;
    }
}
