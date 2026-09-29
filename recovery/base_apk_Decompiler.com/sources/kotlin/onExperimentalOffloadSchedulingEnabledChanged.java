package kotlin;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class onExperimentalOffloadSchedulingEnabledChanged extends experimentalSetOffloadSchedulingEnabled<lambdasetMediaSourceFactory17> {
    private final ExoPlayerAudioOffloadListener AudioAttributesCompatParcelizer;
    private final experimentalIsSleepingForOffload IconCompatParcelizer;
    private final getAudioAttributes read;

    public onExperimentalOffloadSchedulingEnabledChanged(copyWithMediaPeriodId copywithmediaperiodid, InputStream inputStream) {
        super(copywithmediaperiodid, inputStream);
        this.read = new getAudioAttributes(copywithmediaperiodid, inputStream);
        this.AudioAttributesCompatParcelizer = new ExoPlayerAudioOffloadListener(copywithmediaperiodid, inputStream);
        this.IconCompatParcelizer = new experimentalIsSleepingForOffload(copywithmediaperiodid, inputStream);
    }

    /* JADX INFO: renamed from: o.onExperimentalOffloadSchedulingEnabledChanged$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] read;
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[lambdasetLoadControl19.values().length];
            read = iArr;
            try {
                iArr[lambdasetLoadControl19.BREAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[lambdasetLoadControl19.SIMPLE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[lambdasetLoadControl19.IEEE_754_HALF_PRECISION_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[lambdasetLoadControl19.IEEE_754_SINGLE_PRECISION_FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                read[lambdasetLoadControl19.IEEE_754_DOUBLE_PRECISION_FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                read[lambdasetLoadControl19.SIMPLE_VALUE_NEXT_BYTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                read[lambdasetLoadControl19.UNALLOCATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[lambdanew7.values().length];
            write = iArr2;
            try {
                iArr2[lambdanew7.FALSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                write[lambdanew7.TRUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                write[lambdanew7.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                write[lambdanew7.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                write[lambdanew7.UNALLOCATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                write[lambdanew7.RESERVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public final lambdasetMediaSourceFactory17 IconCompatParcelizer(int i) throws ExoPlaybackExceptionType {
        switch (AnonymousClass3.read[lambdasetLoadControl19.RemoteActionCompatParcelizer(i).ordinal()]) {
            case 1:
                return lambdasetMediaSourceFactory17.RemoteActionCompatParcelizer;
            case 2:
                int i2 = AnonymousClass3.write[lambdanew7.RemoteActionCompatParcelizer(i).ordinal()];
                if (i2 == 1) {
                    return lambdasetAnalyticsCollector21.write;
                }
                if (i2 == 2) {
                    return lambdasetAnalyticsCollector21.AudioAttributesCompatParcelizer;
                }
                if (i2 == 3) {
                    return lambdasetAnalyticsCollector21.read;
                }
                if (i2 == 4) {
                    return lambdasetAnalyticsCollector21.IconCompatParcelizer;
                }
                if (i2 == 5) {
                    return new lambdasetAnalyticsCollector21(i & 31);
                }
                throw new ExoPlaybackExceptionType("Not implemented");
            case 3:
                return this.read.read();
            case 4:
                return this.AudioAttributesCompatParcelizer.write();
            case 5:
                return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            case 6:
                return new lambdasetAnalyticsCollector21(IconCompatParcelizer());
            default:
                throw new ExoPlaybackExceptionType("Not implemented");
        }
    }
}
