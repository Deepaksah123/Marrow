package kotlin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\t\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\t\u0010\u0012\u001aS\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\t\u0010\u0013\u001aI\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0006\u0010\u0014\u001a1\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0002\u001a\u00020\u00162\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020\u000b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\t\u0010\u001d\u001a\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u001e\u001a/\u0010\u0006\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u001f\u001a+\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010!\u001a7\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020 2\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\"\u001a#\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020 *\u00028\u00002\u0006\u0010\u0002\u001a\u00020#¢\u0006\u0004\b\t\u0010$\u001a\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010\u0017\u001a\u0004\u0018\u00010 2\u0006\u0010\u0002\u001a\u00020#H\u0002¢\u0006\u0004\b\u0017\u0010(\u001a\u0017\u0010\t\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020#H\u0002¢\u0006\u0004\b\t\u0010)\u001a\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\u001c\u001a\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020#H\u0002¢\u0006\u0004\b+\u0010,\u001a-\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020 *\u00028\u00002\u0006\u0010\u0002\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0006\u0010-\u001a5\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020 *\u00028\u00002\u0006\u0010\u0002\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0006\u0010.\u001a-\u0010+\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020 *\u00028\u00002\u0006\u0010\u0002\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010-\u001a-\u0010\u0017\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020 *\u00028\u00002\u0006\u0010\u0002\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010-\u001a%\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020 *\u00028\u00002\u0006\u0010\u0002\u001a\u00020#H\u0000¢\u0006\u0004\b\u0006\u0010$\u001a\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020#H\u0000¢\u0006\u0004\b\u0017\u0010/\u001a9\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0018\u0001012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u00102\u001a\u000f\u00103\u001a\u00020%H\u0002¢\u0006\u0004\b3\u0010'\u001a)\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020 2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0006\u00104\u001a!\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020 2\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0006\u00105\u001a+\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0006\u00106\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107\"\u0018\u0010+\u001a\u00060\u0000j\u0002`\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;\"\u001e\u0010\u0006\u001a\u00060\u000fj\u0002`<8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0016\u0010\t\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010B\"\u001a\u0010D\u001a\u00060\u0000j\u0002`\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u00108\"\u0014\u0010=\u001a\u00020E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010F\"\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020#0G8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010H\"4\u0010A\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0K\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0J0I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010L\"(\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e0I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010L\"\u0014\u0010\f\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010N\"\u0014\u0010P\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b?\u0010O\"\u0016\u0010?\u001a\u00020Q8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010R"}, d2 = {"", "Lo/SnapshotId;", "p0", "Lo/toChars;", "p1", "", "IconCompatParcelizer", "(JLo/toChars;)I", "", "read", "(I)V", "Lo/parseDigitsRecursive;", "MediaBrowserCompatSearchResultReceiver", "()Lo/parseDigitsRecursive;", "Lkotlin/Function1;", "", "", "p2", "(Lo/parseDigitsRecursive;Lo/getAnswerMap;Z)Lo/parseDigitsRecursive;", "(Lo/getAnswerMap;Lo/getAnswerMap;Z)Lo/getAnswerMap;", "(Lo/getAnswerMap;Lo/getAnswerMap;)Lo/getAnswerMap;", "T", "Lo/JavaDoubleBitsFromCharArray;", "AudioAttributesCompatParcelizer", "(Lo/JavaDoubleBitsFromCharArray;Lo/getAnswerMap;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "(Lo/getAnswerMap;)Ljava/lang/Object;", "MediaDescriptionCompat", "()V", "(Lo/getAnswerMap;)Lo/parseDigitsRecursive;", "(Lo/parseDigitsRecursive;)V", "(JJLo/toChars;)Z", "Lo/reportWeirdUCS4;", "(Lo/reportWeirdUCS4;JLo/toChars;)Z", "(Lo/reportWeirdUCS4;JLo/toChars;)Lo/reportWeirdUCS4;", "Lo/tryMatch;", "(Lo/reportWeirdUCS4;Lo/tryMatch;)Lo/reportWeirdUCS4;", "", "handleMediaPlayPauseIfPendingOnHandler", "()Ljava/lang/Void;", "(Lo/tryMatch;)Lo/reportWeirdUCS4;", "(Lo/tryMatch;)Z", "onAddQueueItem", "write", "(Lo/tryMatch;)V", "(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;", "(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;", "(Lo/parseDigitsRecursive;Lo/tryMatch;)V", "Lo/ParseDigitsTaskCharSequence;", "", "(JLo/ParseDigitsTaskCharSequence;Lo/toChars;)Ljava/util/Map;", "onCommand", "(Lo/reportWeirdUCS4;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;", "(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;", "(Lo/toChars;JJ)Lo/toChars;", "Lo/getAnswerMap;", "J", "Lo/applyWeights;", "RatingCompat", "Lo/applyWeights;", "Lo/SynchronizedObject;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/Object;", "MediaBrowserCompatMediaItem", "()Ljava/lang/Object;", "AudioAttributesImplBaseParcelizer", "Lo/toChars;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "Lo/removeTrailingZeroes;", "Lo/removeTrailingZeroes;", "Lo/pow10;", "Lo/pow10;", "", "Lkotlin/Function2;", "", "Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/JavaDoubleBitsFromCharArray;", "Lo/parseDigitsRecursive;", "MediaMetadataCompat", "Lo/splitFloor16;", "Lo/splitFloor16;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class toChars3 {
    private static long AudioAttributesImplApi21Parcelizer;
    private static toChars AudioAttributesImplBaseParcelizer;
    private static splitFloor16 MediaBrowserCompatCustomActionResultReceiver;
    private static final parseDigitsRecursive MediaBrowserCompatMediaItem;
    private static final JavaDoubleBitsFromCharArray RemoteActionCompatParcelizer;
    private static final long read = 0;
    private static final getAnswerMap<toChars, getShowPopup> IconCompatParcelizer = new getAnswerMap() { // from class: o.toChars2
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return toChars3.write((toChars) obj);
        }
    };
    private static final applyWeights<parseDigitsRecursive> RatingCompat = new applyWeights<>();
    private static final Object AudioAttributesImplApi26Parcelizer = new Object();
    private static final removeTrailingZeroes MediaBrowserCompatSearchResultReceiver = new removeTrailingZeroes();
    private static final pow10<tryMatch> AudioAttributesCompatParcelizer = new pow10<>();
    private static List<? extends MagicModuleSubmissionRequestBody<? super Set<? extends Object>, ? super parseDigitsRecursive, getShowPopup>> write = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    private static List<? extends getAnswerMap<Object, getShowPopup>> MediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();

    public static final int IconCompatParcelizer(long j, toChars tochars) {
        int iIconCompatParcelizer;
        long jRemoteActionCompatParcelizer = tochars.RemoteActionCompatParcelizer(j);
        synchronized (MediaBrowserCompatMediaItem()) {
            iIconCompatParcelizer = MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(jRemoteActionCompatParcelizer);
        }
        return iIconCompatParcelizer;
    }

    public static final void read(int i) {
        MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(i);
    }

    public static final parseDigitsRecursive MediaBrowserCompatSearchResultReceiver() {
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer = RatingCompat.AudioAttributesCompatParcelizer();
        return parsedigitsrecursiveAudioAttributesCompatParcelizer == null ? RemoteActionCompatParcelizer : parsedigitsrecursiveAudioAttributesCompatParcelizer;
    }

    static {
        AudioAttributesImplBaseParcelizer = toChars.INSTANCE.read();
        AudioAttributesImplApi21Parcelizer = toDecimal.RemoteActionCompatParcelizer(1) + 1;
        long j = AudioAttributesImplApi21Parcelizer;
        AudioAttributesImplApi21Parcelizer = 1 + j;
        JavaDoubleBitsFromCharArray javaDoubleBitsFromCharArray = new JavaDoubleBitsFromCharArray(j, toChars.INSTANCE.read());
        AudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer.write(javaDoubleBitsFromCharArray.getIconCompatParcelizer());
        RemoteActionCompatParcelizer = javaDoubleBitsFromCharArray;
        MediaBrowserCompatMediaItem = javaDoubleBitsFromCharArray;
        MediaBrowserCompatCustomActionResultReceiver = new splitFloor16(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(toChars tochars) {
        return getShowPopup.INSTANCE;
    }

    static /* synthetic */ parseDigitsRecursive read$default(parseDigitsRecursive parsedigitsrecursive, getAnswerMap getanswermap, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            getanswermap = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return read(parsedigitsrecursive, (getAnswerMap<Object, getShowPopup>) getanswermap, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final parseDigitsRecursive read(parseDigitsRecursive parsedigitsrecursive, getAnswerMap<Object, getShowPopup> getanswermap, boolean z) {
        boolean z2 = parsedigitsrecursive instanceof ParseDigitsTaskCharSequence;
        if (z2 || parsedigitsrecursive == null) {
            return new constructReader(z2 ? (ParseDigitsTaskCharSequence) parsedigitsrecursive : null, getanswermap, null, false, z);
        }
        return new detectEncoding(parsedigitsrecursive, getanswermap, false, z);
    }

    public static /* synthetic */ getAnswerMap read$default(getAnswerMap getanswermap, getAnswerMap getanswermap2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return read((getAnswerMap<Object, getShowPopup>) getanswermap, (getAnswerMap<Object, getShowPopup>) getanswermap2, z);
    }

    public static final getAnswerMap<Object, getShowPopup> read(final getAnswerMap<Object, getShowPopup> getanswermap, final getAnswerMap<Object, getShowPopup> getanswermap2, boolean z) {
        if (!z) {
            getanswermap2 = null;
        }
        if (getanswermap == null || getanswermap2 == null || getanswermap == getanswermap2) {
            return getanswermap == null ? getanswermap2 : getanswermap;
        }
        return new getAnswerMap() { // from class: o.toChars1
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return toChars3.read(getanswermap, getanswermap2, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getAnswerMap getanswermap, getAnswerMap getanswermap2, Object obj) {
        getanswermap.invoke(obj);
        getanswermap2.invoke(obj);
        return getShowPopup.INSTANCE;
    }

    public static final getAnswerMap<Object, getShowPopup> IconCompatParcelizer(final getAnswerMap<Object, getShowPopup> getanswermap, final getAnswerMap<Object, getShowPopup> getanswermap2) {
        if (getanswermap == null || getanswermap2 == null || getanswermap == getanswermap2) {
            return getanswermap == null ? getanswermap2 : getanswermap;
        }
        return new getAnswerMap() { // from class: o.MathUtils
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return toChars3.AudioAttributesCompatParcelizer(getanswermap, getanswermap2, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getAnswerMap getanswermap, getAnswerMap getanswermap2, Object obj) {
        getanswermap.invoke(obj);
        getanswermap2.invoke(obj);
        return getShowPopup.INSTANCE;
    }

    public static final Object MediaBrowserCompatMediaItem() {
        return AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharArray javaDoubleBitsFromCharArray, getAnswerMap<? super toChars, ? extends T> getanswermap) {
        long iconCompatParcelizer = javaDoubleBitsFromCharArray.getIconCompatParcelizer();
        T tInvoke = getanswermap.invoke(AudioAttributesImplBaseParcelizer.read(iconCompatParcelizer));
        long j = AudioAttributesImplApi21Parcelizer;
        AudioAttributesImplApi21Parcelizer = 1 + j;
        AudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer.read(iconCompatParcelizer);
        javaDoubleBitsFromCharArray.read(j);
        javaDoubleBitsFromCharArray.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer);
        javaDoubleBitsFromCharArray.read(0);
        javaDoubleBitsFromCharArray.read((setEmojiCompatEnabled<tryMatch>) null);
        javaDoubleBitsFromCharArray.onMediaButtonEvent();
        AudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer.write(j);
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T RemoteActionCompatParcelizer(getAnswerMap<? super toChars, ? extends T> getanswermap) {
        setEmojiCompatEnabled<tryMatch> setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver;
        T t;
        JavaDoubleBitsFromCharArray javaDoubleBitsFromCharArray = RemoteActionCompatParcelizer;
        synchronized (MediaBrowserCompatMediaItem()) {
            setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver = javaDoubleBitsFromCharArray.MediaBrowserCompatCustomActionResultReceiver();
            if (setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver != null) {
                MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(1);
            }
            t = (T) AudioAttributesCompatParcelizer(javaDoubleBitsFromCharArray, getanswermap);
        }
        if (setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver != null) {
            try {
                List<? extends MagicModuleSubmissionRequestBody<? super Set<? extends Object>, ? super parseDigitsRecursive, getShowPopup>> list = write;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invoke(freeBuffers.write(setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver), javaDoubleBitsFromCharArray);
                }
            } finally {
                MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(-1);
            }
        }
        synchronized (MediaBrowserCompatMediaItem()) {
            onAddQueueItem();
            if (setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver != null) {
                setEmojiCompatEnabled<tryMatch> setemojicompatenabled = setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver;
                Object[] objArr = setemojicompatenabled.write;
                long[] jArr = setemojicompatenabled.AudioAttributesCompatParcelizer;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    write((tryMatch) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat() {
        RemoteActionCompatParcelizer(IconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends parseDigitsRecursive> T read(final getAnswerMap<? super toChars, ? extends T> getanswermap) {
        return (T) RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o.y
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return toChars3.write(getanswermap, (toChars) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final parseDigitsRecursive write(getAnswerMap getanswermap, toChars tochars) {
        parseDigitsRecursive parsedigitsrecursive = (parseDigitsRecursive) getanswermap.invoke(tochars);
        synchronized (MediaBrowserCompatMediaItem()) {
            AudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer.write(parsedigitsrecursive.getIconCompatParcelizer());
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        return parsedigitsrecursive;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(parseDigitsRecursive parsedigitsrecursive) {
        long jRemoteActionCompatParcelizer;
        if (AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(parsedigitsrecursive.getIconCompatParcelizer())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(parsedigitsrecursive.getIconCompatParcelizer());
        sb.append(", disposed=");
        sb.append(parsedigitsrecursive.getRead());
        sb.append(", applied=");
        ParseDigitsTaskCharSequence parseDigitsTaskCharSequence = parsedigitsrecursive instanceof ParseDigitsTaskCharSequence ? (ParseDigitsTaskCharSequence) parsedigitsrecursive : null;
        sb.append(parseDigitsTaskCharSequence != null ? Boolean.valueOf(parseDigitsTaskCharSequence.getMediaBrowserCompatCustomActionResultReceiver()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (MediaBrowserCompatMediaItem()) {
            jRemoteActionCompatParcelizer = MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(-1L);
        }
        sb.append(jRemoteActionCompatParcelizer);
        throw new IllegalStateException(sb.toString().toString());
    }

    private static final boolean IconCompatParcelizer(long j, long j2, toChars tochars) {
        return (j2 == read || toMagicModuleMetaRepoModel.read(j2, j) > 0 || tochars.AudioAttributesCompatParcelizer(j2)) ? false : true;
    }

    private static final boolean IconCompatParcelizer(reportWeirdUCS4 reportweirducs4, long j, toChars tochars) {
        return IconCompatParcelizer(j, reportweirducs4.getIconCompatParcelizer(), tochars);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends reportWeirdUCS4> T read(T t, long j, toChars tochars) {
        T t2 = null;
        while (t != null) {
            if (IconCompatParcelizer(t, j, tochars) && (t2 == null || toMagicModuleMetaRepoModel.read(t2.getIconCompatParcelizer(), t.getIconCompatParcelizer()) < 0)) {
                t2 = t;
            }
            t = (T) t.getWrite();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends reportWeirdUCS4> T read(T t, tryMatch trymatch) {
        T t2;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
        getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        if (getanswermapAudioAttributesImplApi26Parcelizer != null) {
            getanswermapAudioAttributesImplApi26Parcelizer.invoke(trymatch);
        }
        T t3 = (T) read(t, parsedigitsrecursiveAudioAttributesCompatParcelizer.getIconCompatParcelizer(), parsedigitsrecursiveAudioAttributesCompatParcelizer.getWrite());
        if (t3 != null) {
            return t3;
        }
        synchronized (MediaBrowserCompatMediaItem()) {
            parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer2 = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
            reportWeirdUCS4 reportweirducs4Write = trymatch.getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(reportweirducs4Write, "");
            t2 = (T) read(reportweirducs4Write, parsedigitsrecursiveAudioAttributesCompatParcelizer2.getIconCompatParcelizer(), parsedigitsrecursiveAudioAttributesCompatParcelizer2.getWrite());
            if (t2 == null) {
                handleMediaPlayPauseIfPendingOnHandler();
                throw new PlanDetailsCreator();
            }
        }
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void handleMediaPlayPauseIfPendingOnHandler() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    private static final reportWeirdUCS4 AudioAttributesCompatParcelizer(tryMatch trymatch) {
        long jRemoteActionCompatParcelizer = MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer);
        toChars tochars = toChars.INSTANCE.read();
        reportWeirdUCS4 reportweirducs4 = null;
        for (reportWeirdUCS4 reportweirducs4Write = trymatch.getRemoteActionCompatParcelizer(); reportweirducs4Write != null; reportweirducs4Write = reportweirducs4Write.getWrite()) {
            if (reportweirducs4Write.getIconCompatParcelizer() != read) {
                if (IconCompatParcelizer(reportweirducs4Write, jRemoteActionCompatParcelizer - 1, tochars)) {
                    if (reportweirducs4 == null) {
                        reportweirducs4 = reportweirducs4Write;
                    } else if (toMagicModuleMetaRepoModel.read(reportweirducs4Write.getIconCompatParcelizer(), reportweirducs4.getIconCompatParcelizer()) >= 0) {
                        return reportweirducs4;
                    }
                }
            }
            return reportweirducs4Write;
        }
        return null;
    }

    private static final boolean read(tryMatch trymatch) {
        reportWeirdUCS4 reportweirducs4;
        long jRemoteActionCompatParcelizer = MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer);
        reportWeirdUCS4 reportweirducs42 = null;
        reportWeirdUCS4 reportweirducs4Write = null;
        int i = 0;
        for (reportWeirdUCS4 reportweirducs4Write2 = trymatch.getRemoteActionCompatParcelizer(); reportweirducs4Write2 != null; reportweirducs4Write2 = reportweirducs4Write2.getWrite()) {
            long jAudioAttributesImplBaseParcelizer = reportweirducs4Write2.getIconCompatParcelizer();
            if (jAudioAttributesImplBaseParcelizer != read) {
                if (toMagicModuleMetaRepoModel.read(jAudioAttributesImplBaseParcelizer, jRemoteActionCompatParcelizer) >= 0) {
                    i++;
                } else if (reportweirducs42 == null) {
                    i++;
                    reportweirducs42 = reportweirducs4Write2;
                } else {
                    if (toMagicModuleMetaRepoModel.read(reportweirducs4Write2.getIconCompatParcelizer(), reportweirducs42.getIconCompatParcelizer()) < 0) {
                        reportweirducs4 = reportweirducs4Write2;
                    } else {
                        reportweirducs4 = reportweirducs42;
                        reportweirducs42 = reportweirducs4Write2;
                    }
                    if (reportweirducs4Write == null) {
                        reportweirducs4Write = trymatch.getRemoteActionCompatParcelizer();
                        reportWeirdUCS4 reportweirducs43 = reportweirducs4Write;
                        while (true) {
                            if (reportweirducs4Write == null) {
                                reportweirducs4Write = reportweirducs43;
                                break;
                            }
                            if (toMagicModuleMetaRepoModel.read(reportweirducs4Write.getIconCompatParcelizer(), jRemoteActionCompatParcelizer) >= 0) {
                                break;
                            }
                            if (toMagicModuleMetaRepoModel.read(reportweirducs43.getIconCompatParcelizer(), reportweirducs4Write.getIconCompatParcelizer()) < 0) {
                                reportweirducs43 = reportweirducs4Write;
                            }
                            reportweirducs4Write = reportweirducs4Write.getWrite();
                        }
                    }
                    reportweirducs4.write(read);
                    reportweirducs4.AudioAttributesCompatParcelizer(reportweirducs4Write);
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAddQueueItem() {
        pow10<tryMatch> pow10Var = AudioAttributesCompatParcelizer;
        int iAudioAttributesCompatParcelizer = pow10Var.getAudioAttributesCompatParcelizer();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iAudioAttributesCompatParcelizer) {
                break;
            }
            copyInto<tryMatch> copyinto = pow10Var.IconCompatParcelizer()[i];
            tryMatch trymatch = copyinto != null ? copyinto.get() : null;
            if (trymatch != null && read(trymatch)) {
                if (i2 != i) {
                    pow10Var.IconCompatParcelizer()[i2] = copyinto;
                    pow10Var.getRead()[i2] = pow10Var.getRead()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < iAudioAttributesCompatParcelizer; i3++) {
            pow10Var.IconCompatParcelizer()[i3] = null;
            pow10Var.getRead()[i3] = 0;
        }
        if (i2 != iAudioAttributesCompatParcelizer) {
            pow10Var.write(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(tryMatch trymatch) {
        if (read(trymatch)) {
            AudioAttributesCompatParcelizer.read(trymatch);
        }
    }

    public static final <T extends reportWeirdUCS4> T IconCompatParcelizer(T t, tryMatch trymatch, parseDigitsRecursive parsedigitsrecursive) {
        T t2;
        if (parsedigitsrecursive.MediaBrowserCompatSearchResultReceiver()) {
            parsedigitsrecursive.read(trymatch);
        }
        long iconCompatParcelizer = parsedigitsrecursive.getIconCompatParcelizer();
        T t3 = (T) read(t, iconCompatParcelizer, parsedigitsrecursive.getWrite());
        if (t3 == null) {
            handleMediaPlayPauseIfPendingOnHandler();
            throw new PlanDetailsCreator();
        }
        if (t3.getIconCompatParcelizer() == parsedigitsrecursive.getIconCompatParcelizer()) {
            return t3;
        }
        synchronized (MediaBrowserCompatMediaItem()) {
            t2 = (T) read(trymatch.getRemoteActionCompatParcelizer(), iconCompatParcelizer, parsedigitsrecursive.getWrite());
            if (t2 == null) {
                handleMediaPlayPauseIfPendingOnHandler();
                throw new PlanDetailsCreator();
            }
            if (t2.getIconCompatParcelizer() != iconCompatParcelizer) {
                t2 = (T) AudioAttributesCompatParcelizer(t2, trymatch, parsedigitsrecursive);
            }
        }
        toMagicModuleMetaRepoModel.read(t2, "");
        if (t3.getIconCompatParcelizer() != toDecimal.RemoteActionCompatParcelizer(1)) {
            parsedigitsrecursive.read(trymatch);
        }
        return t2;
    }

    public static final <T extends reportWeirdUCS4> T IconCompatParcelizer(T t, tryMatch trymatch, parseDigitsRecursive parsedigitsrecursive, T t2) {
        T t3;
        if (parsedigitsrecursive.MediaBrowserCompatSearchResultReceiver()) {
            parsedigitsrecursive.read(trymatch);
        }
        long iconCompatParcelizer = parsedigitsrecursive.getIconCompatParcelizer();
        if (t2.getIconCompatParcelizer() == iconCompatParcelizer) {
            return t2;
        }
        synchronized (MediaBrowserCompatMediaItem()) {
            t3 = (T) IconCompatParcelizer(t, trymatch);
        }
        t3.write(iconCompatParcelizer);
        if (t2.getIconCompatParcelizer() != toDecimal.RemoteActionCompatParcelizer(1)) {
            parsedigitsrecursive.read(trymatch);
        }
        return t3;
    }

    private static final <T extends reportWeirdUCS4> T AudioAttributesCompatParcelizer(T t, tryMatch trymatch, parseDigitsRecursive parsedigitsrecursive) {
        T t2 = (T) IconCompatParcelizer(t, trymatch);
        t2.AudioAttributesCompatParcelizer(t);
        t2.write(parsedigitsrecursive.getIconCompatParcelizer());
        return t2;
    }

    public static final <T extends reportWeirdUCS4> T IconCompatParcelizer(T t, tryMatch trymatch) {
        T t2 = (T) AudioAttributesCompatParcelizer(trymatch);
        if (t2 != null) {
            t2.write(Long.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.RemoteActionCompatParcelizer(Long.MAX_VALUE);
        t3.RemoteActionCompatParcelizer(trymatch.getRemoteActionCompatParcelizer());
        toMagicModuleMetaRepoModel.read(t3, "");
        trymatch.RemoteActionCompatParcelizer(t3);
        toMagicModuleMetaRepoModel.read(t3, "");
        return t3;
    }

    public static final void AudioAttributesCompatParcelizer(parseDigitsRecursive parsedigitsrecursive, tryMatch trymatch) {
        parsedigitsrecursive.read(parsedigitsrecursive.getIconCompatParcelizer() + 1);
        getAnswerMap<Object, getShowPopup> getanswermapMediaMetadataCompat = parsedigitsrecursive.MediaMetadataCompat();
        if (getanswermapMediaMetadataCompat != null) {
            getanswermapMediaMetadataCompat.invoke(trymatch);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<reportWeirdUCS4, reportWeirdUCS4> AudioAttributesCompatParcelizer(long j, ParseDigitsTaskCharSequence parseDigitsTaskCharSequence, toChars tochars) {
        HashMap map;
        long[] jArr;
        HashMap map2;
        toChars tochars2;
        long[] jArr2;
        HashMap map3;
        toChars tochars3;
        int i;
        reportWeirdUCS4 reportweirducs4;
        setEmojiCompatEnabled<tryMatch> setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver = parseDigitsTaskCharSequence.MediaBrowserCompatCustomActionResultReceiver();
        HashMap map4 = null;
        if (setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver == null) {
            return null;
        }
        long iconCompatParcelizer = parseDigitsTaskCharSequence.getIconCompatParcelizer();
        toChars tocharsAudioAttributesImplBaseParcelizer = parseDigitsTaskCharSequence.getWrite().write(iconCompatParcelizer).AudioAttributesImplBaseParcelizer(parseDigitsTaskCharSequence.getAudioAttributesImplApi26Parcelizer());
        setEmojiCompatEnabled<tryMatch> setemojicompatenabled = setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver;
        Object[] objArr = setemojicompatenabled.write;
        long[] jArr3 = setemojicompatenabled.AudioAttributesCompatParcelizer;
        int length = jArr3.length - 2;
        if (length >= 0) {
            map = null;
            int i2 = 0;
            while (true) {
                long j2 = jArr3[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j2) < 128) {
                            tryMatch trymatch = (tryMatch) objArr[(i2 << 3) + i5];
                            reportWeirdUCS4 reportweirducs4Write = trymatch.getRemoteActionCompatParcelizer();
                            jArr2 = jArr3;
                            i = i5;
                            reportWeirdUCS4 reportweirducs42 = read(reportweirducs4Write, j, tochars);
                            if (reportweirducs42 == null || (reportweirducs4 = read(reportweirducs4Write, iconCompatParcelizer, tocharsAudioAttributesImplBaseParcelizer)) == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(reportweirducs42, reportweirducs4)) {
                                tochars3 = tocharsAudioAttributesImplBaseParcelizer;
                            } else {
                                tochars3 = tocharsAudioAttributesImplBaseParcelizer;
                                reportWeirdUCS4 reportweirducs43 = read(reportweirducs4Write, iconCompatParcelizer, parseDigitsTaskCharSequence.getWrite());
                                if (reportweirducs43 == null) {
                                    handleMediaPlayPauseIfPendingOnHandler();
                                    throw new PlanDetailsCreator();
                                }
                                reportWeirdUCS4 reportweirducs4IconCompatParcelizer = trymatch.IconCompatParcelizer(reportweirducs4, reportweirducs42, reportweirducs43);
                                if (reportweirducs4IconCompatParcelizer == null) {
                                    return null;
                                }
                                HashMap map5 = map;
                                if (map5 == null) {
                                    HashMap map6 = new HashMap();
                                    map = map6;
                                    map5 = map6;
                                }
                                map5.put(reportweirducs42, reportweirducs4IconCompatParcelizer);
                            }
                            map3 = null;
                        } else {
                            jArr2 = jArr3;
                            map3 = map4;
                            tochars3 = tocharsAudioAttributesImplBaseParcelizer;
                            i = i5;
                        }
                        j2 >>= 8;
                        i3 = 8;
                        i5 = i + 1;
                        tocharsAudioAttributesImplBaseParcelizer = tochars3;
                        map4 = map3;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    map2 = map4;
                    tochars2 = tocharsAudioAttributesImplBaseParcelizer;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    map2 = map4;
                    tochars2 = tocharsAudioAttributesImplBaseParcelizer;
                }
                if (i2 == length) {
                    map4 = map;
                    break;
                }
                i2++;
                map4 = map2;
                jArr3 = jArr;
                tocharsAudioAttributesImplBaseParcelizer = tochars2;
            }
        }
        map = map4;
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void onCommand() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T extends reportWeirdUCS4> T IconCompatParcelizer(T t, parseDigitsRecursive parsedigitsrecursive) {
        T t2;
        T t3 = (T) read(t, parsedigitsrecursive.getIconCompatParcelizer(), parsedigitsrecursive.getWrite());
        if (t3 != null) {
            return t3;
        }
        synchronized (MediaBrowserCompatMediaItem()) {
            t2 = (T) read(t, parsedigitsrecursive.getIconCompatParcelizer(), parsedigitsrecursive.getWrite());
        }
        if (t2 != null) {
            return t2;
        }
        handleMediaPlayPauseIfPendingOnHandler();
        throw new PlanDetailsCreator();
    }

    public static final <T extends reportWeirdUCS4> T IconCompatParcelizer(T t) {
        T t2;
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
        T t3 = (T) read(t, parsedigitsrecursiveAudioAttributesCompatParcelizer.getIconCompatParcelizer(), parsedigitsrecursiveAudioAttributesCompatParcelizer.getWrite());
        if (t3 != null) {
            return t3;
        }
        synchronized (MediaBrowserCompatMediaItem()) {
            parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer2 = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
            t2 = (T) read(t, parsedigitsrecursiveAudioAttributesCompatParcelizer2.getIconCompatParcelizer(), parsedigitsrecursiveAudioAttributesCompatParcelizer2.getWrite());
        }
        if (t2 != null) {
            return t2;
        }
        handleMediaPlayPauseIfPendingOnHandler();
        throw new PlanDetailsCreator();
    }

    public static final <T extends reportWeirdUCS4> T write(T t, tryMatch trymatch, parseDigitsRecursive parsedigitsrecursive) {
        T t2;
        synchronized (MediaBrowserCompatMediaItem()) {
            t2 = (T) AudioAttributesCompatParcelizer(t, trymatch, parsedigitsrecursive);
        }
        return t2;
    }

    public static final toChars IconCompatParcelizer(toChars tochars, long j, long j2) {
        while (toMagicModuleMetaRepoModel.read(j, j2) < 0) {
            tochars = tochars.write(j);
            j++;
        }
        return tochars;
    }
}
