package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", TtmlNode.TAG_DIV, "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@submitMagicModule
public final class getTestPattern implements Comparable<getTestPattern> {
    private final long write;
    public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer(null);
    private static final long AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(0);
    private static final long RemoteActionCompatParcelizer = getUserSubmissionTimestamp.AudioAttributesImplApi26Parcelizer(4611686018427387903L);
    private static final long IconCompatParcelizer = getUserSubmissionTimestamp.AudioAttributesImplApi26Parcelizer(-4611686018427387903L);

    public static final boolean AudioAttributesImplApi26Parcelizer(long j) {
        return j > 0;
    }

    private static final boolean handleMediaPlayPauseIfPendingOnHandler(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final long onCommand(long j) {
        return j >> 1;
    }

    private static boolean onPause(long j) {
        return j < 0;
    }

    private static final boolean onPlayFromMediaId(long j) {
        return (((int) j) & 1) == 0;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(getTestPattern gettestpattern) {
        return onFastForward(gettestpattern.getWrite());
    }

    private /* synthetic */ getTestPattern(long j) {
        this.write = j;
    }

    private static final isAnonymous onCustomAction(long j) {
        return onPlayFromMediaId(j) ? isAnonymous.read : isAnonymous.RemoteActionCompatParcelizer;
    }

    public static long RemoteActionCompatParcelizer(long j) {
        isRankPredicted.IconCompatParcelizer();
        return j;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lo/getTestPattern$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/getTestPattern;", "AudioAttributesCompatParcelizer", "J", "read", "()J", "RemoteActionCompatParcelizer", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public static long read() {
            return getTestPattern.AudioAttributesCompatParcelizer;
        }

        public static long write() {
            return getTestPattern.RemoteActionCompatParcelizer;
        }

        public static long IconCompatParcelizer() {
            return getTestPattern.IconCompatParcelizer;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final long AudioAttributesImplApi21Parcelizer(long j) {
        return getUserSubmissionTimestamp.AudioAttributesCompatParcelizer(-onCommand(j), ((int) j) & 1);
    }

    public static final long RemoteActionCompatParcelizer(long j, long j2) {
        if (onPlay(j)) {
            if (IconCompatParcelizer(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (onPlay(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long jOnCommand = onCommand(j) + onCommand(j2);
            return onPlayFromMediaId(j) ? getUserSubmissionTimestamp.AudioAttributesImplBaseParcelizer(jOnCommand) : getUserSubmissionTimestamp.AudioAttributesImplApi21Parcelizer(jOnCommand);
        }
        if (handleMediaPlayPauseIfPendingOnHandler(j)) {
            return write(onCommand(j), onCommand(j2));
        }
        return write(onCommand(j2), onCommand(j));
    }

    private static final long write(long j, long j2) {
        long jMediaDescriptionCompat = getUserSubmissionTimestamp.MediaDescriptionCompat(j2);
        long j3 = j + jMediaDescriptionCompat;
        if (-4611686018426L > j3 || j3 >= 4611686018427L) {
            return getUserSubmissionTimestamp.AudioAttributesImplApi26Parcelizer(getQues.AudioAttributesCompatParcelizer(j3, -4611686018427387903L, 4611686018427387903L));
        }
        return getUserSubmissionTimestamp.MediaBrowserCompatCustomActionResultReceiver(getUserSubmissionTimestamp.MediaBrowserCompatMediaItem(j3) + (j2 - getUserSubmissionTimestamp.MediaBrowserCompatMediaItem(jMediaDescriptionCompat)));
    }

    public static final long IconCompatParcelizer(long j, long j2) {
        return RemoteActionCompatParcelizer(j, AudioAttributesImplApi21Parcelizer(j2));
    }

    private static boolean onPlay(long j) {
        return j == RemoteActionCompatParcelizer || j == IconCompatParcelizer;
    }

    public static final boolean IconCompatParcelizer(long j) {
        return !onPlay(j);
    }

    private static long MediaBrowserCompatCustomActionResultReceiver(long j) {
        return onPause(j) ? AudioAttributesImplApi21Parcelizer(j) : j;
    }

    private int onFastForward(long j) {
        return read(this.write, j);
    }

    public static int read(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return toMagicModuleMetaRepoModel.read(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return onPause(j) ? -i : i;
    }

    private static int MediaBrowserCompatItemReceiver(long j) {
        if (onPlay(j)) {
            return 0;
        }
        return (int) (MediaBrowserCompatMediaItem(j) % 24);
    }

    private static int MediaBrowserCompatSearchResultReceiver(long j) {
        if (onPlay(j)) {
            return 0;
        }
        return (int) (RatingCompat(j) % 60);
    }

    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(long j) {
        if (onPlay(j)) {
            return 0;
        }
        return (int) (MediaMetadataCompat(j) % 60);
    }

    private static int MediaDescriptionCompat(long j) {
        long jOnCommand;
        if (onPlay(j)) {
            return 0;
        }
        if (handleMediaPlayPauseIfPendingOnHandler(j)) {
            jOnCommand = getUserSubmissionTimestamp.MediaBrowserCompatMediaItem(onCommand(j) % 1000);
        } else {
            jOnCommand = onCommand(j) % C.NANOS_PER_SECOND;
        }
        return (int) jOnCommand;
    }

    private static long RemoteActionCompatParcelizer(long j, isAnonymous isanonymous) {
        toMagicModuleMetaRepoModel.write(isanonymous, "");
        if (j == RemoteActionCompatParcelizer) {
            return Long.MAX_VALUE;
        }
        if (j == IconCompatParcelizer) {
            return Long.MIN_VALUE;
        }
        return isFromDetailApi.RemoteActionCompatParcelizer(onCommand(j), onCustomAction(j), isanonymous);
    }

    private static long AudioAttributesImplBaseParcelizer(long j) {
        return RemoteActionCompatParcelizer(j, isAnonymous.write);
    }

    private static long MediaBrowserCompatMediaItem(long j) {
        return RemoteActionCompatParcelizer(j, isAnonymous.AudioAttributesCompatParcelizer);
    }

    private static long RatingCompat(long j) {
        return RemoteActionCompatParcelizer(j, isAnonymous.IconCompatParcelizer);
    }

    private static long MediaMetadataCompat(long j) {
        return RemoteActionCompatParcelizer(j, isAnonymous.AudioAttributesImplApi26Parcelizer);
    }

    public static final long read(long j) {
        return (handleMediaPlayPauseIfPendingOnHandler(j) && IconCompatParcelizer(j)) ? onCommand(j) : RemoteActionCompatParcelizer(j, isAnonymous.RemoteActionCompatParcelizer);
    }

    public static final long AudioAttributesCompatParcelizer(long j) {
        long jOnCommand = onCommand(j);
        if (onPlayFromMediaId(j)) {
            return jOnCommand;
        }
        if (jOnCommand > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jOnCommand < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return getUserSubmissionTimestamp.MediaBrowserCompatMediaItem(jOnCommand);
    }

    public final String toString() {
        return onMediaButtonEvent(this.write);
    }

    private static String onMediaButtonEvent(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == RemoteActionCompatParcelizer) {
            return "Infinity";
        }
        if (j == IconCompatParcelizer) {
            return "-Infinity";
        }
        boolean zOnPause = onPause(j);
        StringBuilder sb = new StringBuilder();
        if (zOnPause) {
            sb.append('-');
        }
        long jMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(j);
        long jAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(jMediaBrowserCompatCustomActionResultReceiver);
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(jMediaBrowserCompatCustomActionResultReceiver);
        int iMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(jMediaBrowserCompatCustomActionResultReceiver);
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(jMediaBrowserCompatCustomActionResultReceiver);
        int iMediaDescriptionCompat = MediaDescriptionCompat(jMediaBrowserCompatCustomActionResultReceiver);
        int i = 0;
        boolean z = jAudioAttributesImplBaseParcelizer != 0;
        boolean z2 = iMediaBrowserCompatItemReceiver != 0;
        boolean z3 = iMediaBrowserCompatSearchResultReceiver != 0;
        boolean z4 = (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0 && iMediaDescriptionCompat == 0) ? false : true;
        if (z) {
            sb.append(jAudioAttributesImplBaseParcelizer);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iMediaBrowserCompatItemReceiver);
            sb.append('h');
            i++;
        }
        if (z3 || (z4 && (z2 || z))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iMediaBrowserCompatSearchResultReceiver);
            sb.append('m');
            i++;
        }
        if (z4) {
            if (i > 0) {
                sb.append(' ');
            }
            if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 0 || z || z2 || z3) {
                read(sb, iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iMediaDescriptionCompat, 9, CmcdHeadersFactory.STREAMING_FORMAT_SS);
            } else if (iMediaDescriptionCompat >= 1000000) {
                read(sb, iMediaDescriptionCompat / PlaybackException.CUSTOM_ERROR_CODE_BASE, iMediaDescriptionCompat % PlaybackException.CUSTOM_ERROR_CODE_BASE, 6, "ms");
            } else if (iMediaDescriptionCompat >= 1000) {
                read(sb, iMediaDescriptionCompat / 1000, iMediaDescriptionCompat % 1000, 3, "us");
            } else {
                sb.append(iMediaDescriptionCompat);
                sb.append("ns");
            }
            i++;
        }
        if (zOnPause && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void read(StringBuilder sb, int i, int i2, int i3, String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strAudioAttributesCompatParcelizer = TestGroupLSModel.AudioAttributesCompatParcelizer(String.valueOf(i2), i3);
            int length = strAudioAttributesCompatParcelizer.length() - 1;
            int i4 = -1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strAudioAttributesCompatParcelizer.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) strAudioAttributesCompatParcelizer, 0, i6);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
            } else {
                sb.append((CharSequence) strAudioAttributesCompatParcelizer, 0, ((i4 + 3) / 3) * 3);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ getTestPattern write(long j) {
        return new getTestPattern(j);
    }

    private static boolean read(long j, Object obj) {
        return (obj instanceof getTestPattern) && j == ((getTestPattern) obj).getWrite();
    }

    private static int onAddQueueItem(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object other) {
        return read(this.write, other);
    }

    public final int hashCode() {
        return onAddQueueItem(this.write);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getWrite() {
        return this.write;
    }
}
