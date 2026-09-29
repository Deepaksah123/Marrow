package kotlin;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'write' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class FeaturedCard {
    private static final HashMap<String, FeaturedCard> setSessionImpl;
    public static final FeaturedCard write;
    private final boolean MediaSessionCompatQueueItem;
    private final String PlaybackStateCompat;
    public static final FeaturedCard read = new FeaturedCard("ANNOTATION_CLASS", 1, "annotation class");
    public static final FeaturedCard MediaDescriptionCompat = new FeaturedCard("TYPE_PARAMETER", 2, "type parameter", false);
    private static FeaturedCard onSeekTo = new FeaturedCard("PROPERTY", 3, "property");
    public static final FeaturedCard AudioAttributesCompatParcelizer = new FeaturedCard("FIELD", 4, "field");
    public static final FeaturedCard AudioAttributesImplBaseParcelizer = new FeaturedCard("LOCAL_VARIABLE", 5, "local variable");
    public static final FeaturedCard MediaBrowserCompatMediaItem = new FeaturedCard("VALUE_PARAMETER", 6, "value parameter");
    public static final FeaturedCard RemoteActionCompatParcelizer = new FeaturedCard("CONSTRUCTOR", 7, "constructor");
    public static final FeaturedCard MediaBrowserCompatItemReceiver = new FeaturedCard("FUNCTION", 8, "function");
    public static final FeaturedCard AudioAttributesImplApi21Parcelizer = new FeaturedCard("PROPERTY_GETTER", 9, "getter");
    public static final FeaturedCard AudioAttributesImplApi26Parcelizer = new FeaturedCard("PROPERTY_SETTER", 10, "setter");
    public static final FeaturedCard MediaBrowserCompatCustomActionResultReceiver = new FeaturedCard("TYPE", 11, "type usage", false);
    private static FeaturedCard onPlayFromMediaId = new FeaturedCard("EXPRESSION", 12, "expression", false);
    public static final FeaturedCard IconCompatParcelizer = new FeaturedCard("FILE", 13, "file", false);
    private static FeaturedCard onStop = new FeaturedCard("TYPEALIAS", 14, "typealias", false);
    private static FeaturedCard onSkipToQueueItem = new FeaturedCard("TYPE_PROJECTION", 15, "type projection", false);
    private static FeaturedCard onSetCaptioningEnabled = new FeaturedCard("STAR_PROJECTION", 16, "star projection", false);
    private static FeaturedCard onRemoveQueueItemAt = new FeaturedCard("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    private static FeaturedCard handleMediaPlayPauseIfPendingOnHandler = new FeaturedCard("CLASS_ONLY", 18, "class", false);
    private static FeaturedCard onRewind = new FeaturedCard("OBJECT", 19, "object", false);
    private static FeaturedCard onSetRepeatMode = new FeaturedCard("STANDALONE_OBJECT", 20, "standalone object", false);
    private static FeaturedCard onAddQueueItem = new FeaturedCard("COMPANION_OBJECT", 21, "companion object", false);
    private static FeaturedCard onPlay = new FeaturedCard("INTERFACE", 22, "interface", false);
    private static FeaturedCard onCommand = new FeaturedCard("ENUM_CLASS", 23, "enum class", false);
    private static FeaturedCard onCustomAction = new FeaturedCard("ENUM_ENTRY", 24, "enum entry", false);
    private static FeaturedCard onMediaButtonEvent = new FeaturedCard("LOCAL_CLASS", 25, "local class", false);
    private static FeaturedCard onPlayFromUri = new FeaturedCard("LOCAL_FUNCTION", 26, "local function", false);
    private static FeaturedCard onPrepareFromMediaId = new FeaturedCard("MEMBER_FUNCTION", 27, "member function", false);
    private static FeaturedCard onSetShuffleMode = new FeaturedCard("TOP_LEVEL_FUNCTION", 28, "top level function", false);
    private static FeaturedCard onPrepareFromSearch = new FeaturedCard("MEMBER_PROPERTY", 29, "member property", false);
    private static FeaturedCard onPlayFromSearch = new FeaturedCard("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);
    private static FeaturedCard onPrepareFromUri = new FeaturedCard("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);
    private static FeaturedCard onPrepare = new FeaturedCard("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);
    private static FeaturedCard onSetPlaybackSpeed = new FeaturedCard("TOP_LEVEL_PROPERTY", 33, "top level property", false);
    private static FeaturedCard onSkipToNext = new FeaturedCard("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);
    private static FeaturedCard onSkipToPrevious = new FeaturedCard("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);
    private static FeaturedCard onSetRating = new FeaturedCard("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);
    private static FeaturedCard MediaMetadataCompat = new FeaturedCard("BACKING_FIELD", 37, "backing field");
    private static FeaturedCard onPause = new FeaturedCard("INITIALIZER", 38, "initializer", false);
    private static FeaturedCard MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new FeaturedCard("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);
    private static FeaturedCard onFastForward = new FeaturedCard("LAMBDA_EXPRESSION", 40, "lambda expression", false);
    private static FeaturedCard RatingCompat = new FeaturedCard("ANONYMOUS_FUNCTION", 41, "anonymous function", false);
    private static FeaturedCard onRemoveQueueItem = new FeaturedCard("OBJECT_LITERAL", 42, "object literal", false);
    private static final /* synthetic */ FeaturedCard[] MediaBrowserCompatSearchResultReceiver = AudioAttributesCompatParcelizer();

    private /* synthetic */ FeaturedCard(String str, int i, String str2) {
        this(str, i, str2, true);
    }

    private FeaturedCard(String str, int i, String str2, boolean z) {
        this.PlaybackStateCompat = str2;
        this.MediaSessionCompatQueueItem = z;
    }

    static {
        byte b = 0;
        write = new FeaturedCard("CLASS", b, "class");
        new write(b);
        setSessionImpl = new HashMap<>();
        for (FeaturedCard featuredCard : values()) {
            setSessionImpl.put(featuredCard.name(), featuredCard);
        }
        FeaturedCard[] featuredCardArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (FeaturedCard featuredCard2 : featuredCardArrValues) {
            if (featuredCard2.MediaSessionCompatQueueItem) {
                arrayList.add(featuredCard2);
            }
        }
        IntermediateLoginResponseBody.onPlayFromUri(arrayList);
        getOrderDetails.handleMediaPlayPauseIfPendingOnHandler(values());
        FeaturedCard featuredCard3 = read;
        FeaturedCard featuredCard4 = write;
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new FeaturedCard[]{featuredCard3, featuredCard4});
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new FeaturedCard[]{onMediaButtonEvent, featuredCard4});
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new FeaturedCard[]{handleMediaPlayPauseIfPendingOnHandler, featuredCard4});
        FeaturedCard featuredCard5 = onAddQueueItem;
        FeaturedCard featuredCard6 = onRewind;
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new FeaturedCard[]{featuredCard5, featuredCard6, featuredCard4});
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new FeaturedCard[]{onSetRepeatMode, featuredCard6, featuredCard4});
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new FeaturedCard[]{onPlay, featuredCard4});
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new FeaturedCard[]{onCommand, featuredCard4});
        FeaturedCard featuredCard7 = onCustomAction;
        FeaturedCard featuredCard8 = onSeekTo;
        FeaturedCard featuredCard9 = AudioAttributesCompatParcelizer;
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new FeaturedCard[]{featuredCard7, featuredCard8, featuredCard9});
        FeaturedCard featuredCard10 = AudioAttributesImplApi26Parcelizer;
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer(featuredCard10);
        FeaturedCard featuredCard11 = AudioAttributesImplApi21Parcelizer;
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer(featuredCard11);
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver);
        FeaturedCard featuredCard12 = IconCompatParcelizer;
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer(featuredCard12);
        EnumC0173getDisplayname enumC0173getDisplayname = EnumC0173getDisplayname.CONSTRUCTOR_PARAMETER;
        FeaturedCard featuredCard13 = MediaBrowserCompatMediaItem;
        VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(enumC0173getDisplayname, featuredCard13), setAction.write(EnumC0173getDisplayname.FIELD, featuredCard9), setAction.write(EnumC0173getDisplayname.PROPERTY, featuredCard8), setAction.write(EnumC0173getDisplayname.FILE, featuredCard12), setAction.write(EnumC0173getDisplayname.PROPERTY_GETTER, featuredCard11), setAction.write(EnumC0173getDisplayname.PROPERTY_SETTER, featuredCard10), setAction.write(EnumC0173getDisplayname.RECEIVER, featuredCard13), setAction.write(EnumC0173getDisplayname.SETTER_PARAMETER, featuredCard13), setAction.write(EnumC0173getDisplayname.PROPERTY_DELEGATE_FIELD, featuredCard9));
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    private static final /* synthetic */ FeaturedCard[] AudioAttributesCompatParcelizer() {
        return new FeaturedCard[]{write, read, MediaDescriptionCompat, onSeekTo, AudioAttributesCompatParcelizer, AudioAttributesImplBaseParcelizer, MediaBrowserCompatMediaItem, RemoteActionCompatParcelizer, MediaBrowserCompatItemReceiver, AudioAttributesImplApi21Parcelizer, AudioAttributesImplApi26Parcelizer, MediaBrowserCompatCustomActionResultReceiver, onPlayFromMediaId, IconCompatParcelizer, onStop, onSkipToQueueItem, onSetCaptioningEnabled, onRemoveQueueItemAt, handleMediaPlayPauseIfPendingOnHandler, onRewind, onSetRepeatMode, onAddQueueItem, onPlay, onCommand, onCustomAction, onMediaButtonEvent, onPlayFromUri, onPrepareFromMediaId, onSetShuffleMode, onPrepareFromSearch, onPlayFromSearch, onPrepareFromUri, onPrepare, onSetPlaybackSpeed, onSkipToNext, onSkipToPrevious, onSetRating, MediaMetadataCompat, onPause, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, onFastForward, RatingCompat, onRemoveQueueItem};
    }

    public static FeaturedCard valueOf(String str) {
        return (FeaturedCard) Enum.valueOf(FeaturedCard.class, str);
    }

    public static FeaturedCard[] values() {
        return (FeaturedCard[]) MediaBrowserCompatSearchResultReceiver.clone();
    }
}
