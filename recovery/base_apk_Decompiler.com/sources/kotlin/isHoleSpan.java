package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\bG\n\u0002\u0010\u0007\n\u0002\b2\b\u0087\b\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0092\u0001\u0093\u0001Bß\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0018\u0012\u0006\u0010&\u001a\u00020\u0018\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u001a\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u001a\u0012\u0006\u0010-\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\u0006¢\u0006\u0004\b/\u00100J\u0006\u0010]\u001a\u00020\u0003J\u0006\u0010^\u001a\u00020\u0006J\u000e\u0010_\u001a\u00020\u001a2\u0006\u0010`\u001a\u00020\u0006J\b\u0010e\u001a\u00020\u0006H\u0002J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0006HÆ\u0003J\t\u0010i\u001a\u00020\u0006HÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\t\u0010k\u001a\u00020\u0006HÆ\u0003J\t\u0010l\u001a\u00020\u0006HÆ\u0003J\t\u0010m\u001a\u00020\u0006HÆ\u0003J\t\u0010n\u001a\u00020\u0006HÆ\u0003J\t\u0010o\u001a\u00020\u0006HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0006HÆ\u0003J\u000f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0018HÆ\u0003J\t\u0010x\u001a\u00020\u001aHÆ\u0003J\t\u0010y\u001a\u00020\u0006HÆ\u0003J\t\u0010z\u001a\u00020\u0006HÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\u000f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u001aHÆ\u0003J\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u001aHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u001aHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0006HÆ\u0003J¨\u0003\u0010\u008d\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00062\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00032\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u00062\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010-\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\u0006HÆ\u0001J\u0015\u0010\u008e\u0001\u001a\u00020\u001a2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0006HÖ\u0001J\n\u0010\u0091\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00102R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00102R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010GR\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bH\u00105R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bI\u00105R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00102R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\bK\u0010CR\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0011\u0010 \u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010GR\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0011\u0010$\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u00105R\u0011\u0010%\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010FR\u0011\u0010&\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bR\u0010FR\u0011\u0010'\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bS\u00105R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\bT\u0010CR\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00102R\u0011\u0010*\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b*\u0010GR\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00102R\u0011\u0010,\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b,\u0010GR\u0011\u0010-\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bW\u00105R\u0011\u0010.\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bX\u00105R\u0011\u0010Y\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bZ\u0010GR\u0011\u0010[\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\\\u00102R\u0011\u0010a\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006\u0094\u0001"}, d2 = {"Lcom/marrow2/data/mcq/local/model/McqIndexRepoModel;", "", "mcqId", "", "bookmarkId", "option1AnsweredCount", "", "option2AnsweredCount", "option3AnsweredCount", "option4AnsweredCount", "option5AnsweredCount", "option6AnsweredCount", "option7AnsweredCount", "option8AnsweredCount", "answerPointer", "subjectId", "imageUrl", "imageUrlV2", "mcqType", "bookReferences", "", "Lcom/marrow2/data/mcq/local/model/McqIndexRepoModel$BookReference;", "magicLine", "bookmarkLastUpdated", "", "isStarredFlag", "", "thumbnailWidth", "thumbnailHeight", "mcqContentEncrypted", "pearlIds", "rootSubjectId", "isDonNotConsider", "imageCitationLink", "imageCitationAuthor", "imageCitationLicense", "mcqUpdateStatus", "statusUpdateStartTimeMs", "statusUpdateEndTimeMs", "feedbackStatus", FilterParams.KEY_TAGS, "displayId", "isActiveLessonPaid", "activeLessonId", "isLocked", "bookmarkType", "courseId", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;JZIILjava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJILjava/util/List;Ljava/lang/String;ZLjava/lang/String;ZII)V", "getMcqId", "()Ljava/lang/String;", "getBookmarkId", "getOption1AnsweredCount", "()I", "getOption2AnsweredCount", "getOption3AnsweredCount", "getOption4AnsweredCount", "getOption5AnsweredCount", "getOption6AnsweredCount", "getOption7AnsweredCount", "getOption8AnsweredCount", "getAnswerPointer", "getSubjectId", "getImageUrl", "getImageUrlV2", "getMcqType", "getBookReferences", "()Ljava/util/List;", "getMagicLine", "getBookmarkLastUpdated", "()J", "()Z", "getThumbnailWidth", "getThumbnailHeight", "getMcqContentEncrypted", "getPearlIds", "getRootSubjectId", "getImageCitationLink", "getImageCitationAuthor", "getImageCitationLicense", "getMcqUpdateStatus", "getStatusUpdateStartTimeMs", "getStatusUpdateEndTimeMs", "getFeedbackStatus", "getTags", "getDisplayId", "getActiveLessonId", "getBookmarkType", "getCourseId", "hasImageCitation", "getHasImageCitation", "imageCitation", "getImageCitation", "getFinalImageUrl", "getAnswerOptionPosition", "isSillyMistake", "answerPosition", "aspectRatio", "", "getAspectRatio", "()F", "totalAnswerCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "copy", "equals", "other", "hashCode", "toString", "Companion", "BookReference", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class isHoleSpan {
    public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final long MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    private final List<IconCompatParcelizer> RemoteActionCompatParcelizer;
    private final boolean handleMediaPlayPauseIfPendingOnHandler;
    private final boolean onAddQueueItem;
    private final boolean onCommand;
    private final String onCustomAction;
    private final int onFastForward;
    private final int onMediaButtonEvent;
    private final String onPause;
    private final int onPlay;
    private final String onPlayFromMediaId;
    private final int onPlayFromSearch;
    private final int onPlayFromUri;
    private final int onPrepare;
    private final int onPrepareFromMediaId;
    private final int onPrepareFromSearch;
    private final List<String> onPrepareFromUri;
    private final String onRemoveQueueItem;
    private final int onRemoveQueueItemAt;
    private final int onRewind;
    private final long onSeekTo;
    private final String onSetCaptioningEnabled;
    private final int onSetPlaybackSpeed;
    private final long onSetRating;
    private final List<String> onSetRepeatMode;
    private final int onSetShuffleMode;
    private final String read;
    private final String write;

    public isHoleSpan(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str3, String str4, String str5, String str6, int i9, List<IconCompatParcelizer> list, String str7, long j, boolean z, int i10, int i11, String str8, List<String> list2, String str9, boolean z2, String str10, String str11, String str12, int i12, long j2, long j3, int i13, List<String> list3, String str13, boolean z3, String str14, boolean z4, int i14, int i15) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        toMagicModuleMetaRepoModel.write(str11, "");
        toMagicModuleMetaRepoModel.write(str12, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(str13, "");
        toMagicModuleMetaRepoModel.write(str14, "");
        this.onPause = str;
        this.read = str2;
        this.onMediaButtonEvent = i;
        this.onPrepareFromSearch = i2;
        this.onPrepareFromMediaId = i3;
        this.onPlayFromUri = i4;
        this.onPlayFromSearch = i5;
        this.onPrepare = i6;
        this.onRewind = i7;
        this.onRemoveQueueItemAt = i8;
        this.write = str3;
        this.onSetCaptioningEnabled = str4;
        this.MediaBrowserCompatMediaItem = str5;
        this.MediaDescriptionCompat = str6;
        this.onFastForward = i9;
        this.RemoteActionCompatParcelizer = list;
        this.onCustomAction = str7;
        this.MediaBrowserCompatItemReceiver = j;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
        this.onSetShuffleMode = i10;
        this.onSetPlaybackSpeed = i11;
        this.onPlayFromMediaId = str8;
        this.onPrepareFromUri = list2;
        this.onRemoveQueueItem = str9;
        this.onCommand = z2;
        this.MediaMetadataCompat = str10;
        this.MediaBrowserCompatSearchResultReceiver = str11;
        this.RatingCompat = str12;
        this.onPlay = i12;
        this.onSetRating = j2;
        this.onSeekTo = j3;
        this.AudioAttributesImplApi26Parcelizer = i13;
        this.onSetRepeatMode = list3;
        this.AudioAttributesImplApi21Parcelizer = str13;
        this.onAddQueueItem = z3;
        this.AudioAttributesCompatParcelizer = str14;
        this.handleMediaPlayPauseIfPendingOnHandler = z4;
        this.MediaBrowserCompatCustomActionResultReceiver = i14;
        this.AudioAttributesImplBaseParcelizer = i15;
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final String getOnPause() {
        return this.onPause;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final int getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    /* JADX INFO: renamed from: onPrepare, reason: from getter */
    public final int getOnPrepareFromSearch() {
        return this.onPrepareFromSearch;
    }

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from getter */
    public final int getOnPrepareFromMediaId() {
        return this.onPrepareFromMediaId;
    }

    /* JADX INFO: renamed from: onPlayFromUri, reason: from getter */
    public final int getOnPlayFromUri() {
        return this.onPlayFromUri;
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final int getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from getter */
    public final int getOnPrepare() {
        return this.onPrepare;
    }

    /* JADX INFO: renamed from: onSeekTo, reason: from getter */
    public final int getOnRewind() {
        return this.onRewind;
    }

    /* JADX INFO: renamed from: onRewind, reason: from getter */
    public final int getOnRemoveQueueItemAt() {
        return this.onRemoveQueueItemAt;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from getter */
    public final String getOnSetCaptioningEnabled() {
        return this.onSetCaptioningEnabled;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final String getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final String getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final int getOnFastForward() {
        return this.onFastForward;
    }

    public final List<IconCompatParcelizer> read() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final String getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final long getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: onStop, reason: from getter */
    public final boolean getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from getter */
    public final int getOnSetShuffleMode() {
        return this.onSetShuffleMode;
    }

    /* JADX INFO: renamed from: onSetRating, reason: from getter */
    public final int getOnSetPlaybackSpeed() {
        return this.onSetPlaybackSpeed;
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final String getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    public final List<String> onRemoveQueueItem() {
        return this.onPrepareFromUri;
    }

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from getter */
    public final String getOnRemoveQueueItem() {
        return this.onRemoveQueueItem;
    }

    /* JADX INFO: renamed from: setSessionImpl, reason: from getter */
    public final boolean getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final String getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final String getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final String getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final int getOnPlay() {
        return this.onPlay;
    }

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from getter */
    public final long getOnSetRating() {
        return this.onSetRating;
    }

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from getter */
    public final long getOnSeekTo() {
        return this.onSeekTo;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final List<String> onSetPlaybackSpeed() {
        return this.onSetRepeatMode;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: onSkipToNext, reason: from getter */
    public final boolean getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from getter */
    public final boolean getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatSearchResultReceiver.length() > 0 || this.MediaMetadataCompat.length() > 0 || this.RatingCompat.length() > 0;
    }

    public final String RatingCompat() {
        StringBuilder sb = new StringBuilder("");
        if (this.MediaMetadataCompat.length() > 0) {
            sb.append("Source: ");
            sb.append(this.MediaMetadataCompat);
            sb.append("\n\n");
        }
        if (this.MediaBrowserCompatSearchResultReceiver.length() > 0) {
            sb.append("Author: ");
            sb.append(this.MediaBrowserCompatSearchResultReceiver);
            sb.append("\n\n");
        }
        if (this.RatingCompat.length() > 0) {
            sb.append("License: ");
            sb.append(this.RatingCompat);
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final String MediaDescriptionCompat() {
        if (this.MediaDescriptionCompat.length() > 0) {
            setMaximumRequestedThroughputKbps setmaximumrequestedthroughputkbps = setMaximumRequestedThroughputKbps.INSTANCE;
            return setMaximumRequestedThroughputKbps.read(this.MediaDescriptionCompat);
        }
        return this.MediaBrowserCompatMediaItem;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/isHoleSpan$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final class IconCompatParcelizer {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String read;

        public IconCompatParcelizer(String str, String str2, String str3, String str4) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            this.IconCompatParcelizer = str;
            this.read = str2;
            this.RemoteActionCompatParcelizer = str3;
            this.AudioAttributesCompatParcelizer = str4;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String read() {
            return this.read;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) iconCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) iconCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iconCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (((((this.IconCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            String str2 = this.read;
            String str3 = this.RemoteActionCompatParcelizer;
            String str4 = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("BookReference(id=");
            sb.append(str);
            sb.append(", text=");
            sb.append(str2);
            sb.append(", title=");
            sb.append(str3);
            sb.append(", imageUrl=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }
    }

    public final int write() {
        List listWrite;
        String str;
        try {
            String str2 = this.write;
            if (str2 != null && (listWrite = TestGroupLSModel.write(str2, new String[]{"_"}, 0, 6)) != null && (str = (String) listWrite.get(1)) != null) {
                return Integer.parseInt(str);
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public final boolean write(int i) {
        int i2;
        if (i == write() || i == 0 || onSkipToQueueItem() == 0) {
            return false;
        }
        int iOnSkipToQueueItem = onSkipToQueueItem();
        switch (write()) {
            case 1:
                i2 = this.onMediaButtonEvent;
                break;
            case 2:
                i2 = this.onPrepareFromSearch;
                break;
            case 3:
                i2 = this.onPrepareFromMediaId;
                break;
            case 4:
                i2 = this.onPlayFromUri;
                break;
            case 5:
                i2 = this.onPlayFromSearch;
                break;
            case 6:
                i2 = this.onPrepare;
                break;
            case 7:
                i2 = this.onRewind;
                break;
            case 8:
                i2 = this.onRemoveQueueItemAt;
                break;
            default:
                i2 = 0;
                break;
        }
        return ((double) ((float) getOnline.RemoteActionCompatParcelizer((((float) i2) / ((float) iOnSkipToQueueItem)) * 100.0f))) >= 85.0d;
    }

    public final float IconCompatParcelizer() {
        int i = this.onSetShuffleMode;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.onSetPlaybackSpeed / i;
    }

    private final int onSkipToQueueItem() {
        return this.onMediaButtonEvent + this.onPrepareFromSearch + this.onPrepareFromMediaId + this.onPlayFromUri + this.onPlayFromSearch + this.onPrepare + this.onRewind + this.onRemoveQueueItemAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static isHoleSpan read(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str3, String str4, String str5, String str6, int i9, List<IconCompatParcelizer> list, String str7, long j, boolean z, int i10, int i11, String str8, List<String> list2, String str9, boolean z2, String str10, String str11, String str12, int i12, long j2, long j3, int i13, List<String> list3, String str13, boolean z3, String str14, boolean z4, int i14, int i15) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        toMagicModuleMetaRepoModel.write(str11, "");
        toMagicModuleMetaRepoModel.write(str12, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(str13, "");
        toMagicModuleMetaRepoModel.write(str14, "");
        return new isHoleSpan(str, str2, i, i2, i3, i4, i5, i6, i7, i8, str3, str4, str5, str6, i9, list, str7, j, z, i10, i11, str8, list2, str9, true, str10, str11, str12, i12, j2, j3, i13, list3, str13, z3, str14, z4, i14, i15);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof isHoleSpan)) {
            return false;
        }
        isHoleSpan isholespan = (isHoleSpan) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPause, (Object) isholespan.onPause) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) isholespan.read) && this.onMediaButtonEvent == isholespan.onMediaButtonEvent && this.onPrepareFromSearch == isholespan.onPrepareFromSearch && this.onPrepareFromMediaId == isholespan.onPrepareFromMediaId && this.onPlayFromUri == isholespan.onPlayFromUri && this.onPlayFromSearch == isholespan.onPlayFromSearch && this.onPrepare == isholespan.onPrepare && this.onRewind == isholespan.onRewind && this.onRemoveQueueItemAt == isholespan.onRemoveQueueItemAt && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) isholespan.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onSetCaptioningEnabled, (Object) isholespan.onSetCaptioningEnabled) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) isholespan.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) isholespan.MediaDescriptionCompat) && this.onFastForward == isholespan.onFastForward && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, isholespan.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCustomAction, (Object) isholespan.onCustomAction) && this.MediaBrowserCompatItemReceiver == isholespan.MediaBrowserCompatItemReceiver && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == isholespan.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.onSetShuffleMode == isholespan.onSetShuffleMode && this.onSetPlaybackSpeed == isholespan.onSetPlaybackSpeed && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromMediaId, (Object) isholespan.onPlayFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPrepareFromUri, isholespan.onPrepareFromUri) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onRemoveQueueItem, (Object) isholespan.onRemoveQueueItem) && this.onCommand == isholespan.onCommand && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) isholespan.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) isholespan.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) isholespan.RatingCompat) && this.onPlay == isholespan.onPlay && this.onSetRating == isholespan.onSetRating && this.onSeekTo == isholespan.onSeekTo && this.AudioAttributesImplApi26Parcelizer == isholespan.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSetRepeatMode, isholespan.onSetRepeatMode) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) isholespan.AudioAttributesImplApi21Parcelizer) && this.onAddQueueItem == isholespan.onAddQueueItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) isholespan.AudioAttributesCompatParcelizer) && this.handleMediaPlayPauseIfPendingOnHandler == isholespan.handleMediaPlayPauseIfPendingOnHandler && this.MediaBrowserCompatCustomActionResultReceiver == isholespan.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplBaseParcelizer == isholespan.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.onPause.hashCode();
        String str = this.read;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Integer.hashCode(this.onMediaButtonEvent);
        int iHashCode4 = Integer.hashCode(this.onPrepareFromSearch);
        int iHashCode5 = Integer.hashCode(this.onPrepareFromMediaId);
        int iHashCode6 = Integer.hashCode(this.onPlayFromUri);
        int iHashCode7 = Integer.hashCode(this.onPlayFromSearch);
        int iHashCode8 = Integer.hashCode(this.onPrepare);
        int iHashCode9 = Integer.hashCode(this.onRewind);
        int iHashCode10 = Integer.hashCode(this.onRemoveQueueItemAt);
        String str2 = this.write;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.onSetCaptioningEnabled;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + Integer.hashCode(this.onFastForward)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.onCustomAction.hashCode()) * 31) + Long.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) * 31) + Integer.hashCode(this.onSetShuffleMode)) * 31) + Integer.hashCode(this.onSetPlaybackSpeed)) * 31) + this.onPlayFromMediaId.hashCode()) * 31) + this.onPrepareFromUri.hashCode()) * 31) + this.onRemoveQueueItem.hashCode()) * 31) + Boolean.hashCode(this.onCommand)) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.RatingCompat.hashCode()) * 31) + Integer.hashCode(this.onPlay)) * 31) + Long.hashCode(this.onSetRating)) * 31) + Long.hashCode(this.onSeekTo)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + this.onSetRepeatMode.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + Boolean.hashCode(this.onAddQueueItem)) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.handleMediaPlayPauseIfPendingOnHandler)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        String str = this.onPause;
        String str2 = this.read;
        int i = this.onMediaButtonEvent;
        int i2 = this.onPrepareFromSearch;
        int i3 = this.onPrepareFromMediaId;
        int i4 = this.onPlayFromUri;
        int i5 = this.onPlayFromSearch;
        int i6 = this.onPrepare;
        int i7 = this.onRewind;
        int i8 = this.onRemoveQueueItemAt;
        String str3 = this.write;
        String str4 = this.onSetCaptioningEnabled;
        String str5 = this.MediaBrowserCompatMediaItem;
        String str6 = this.MediaDescriptionCompat;
        int i9 = this.onFastForward;
        List<IconCompatParcelizer> list = this.RemoteActionCompatParcelizer;
        String str7 = this.onCustomAction;
        long j = this.MediaBrowserCompatItemReceiver;
        boolean z = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i10 = this.onSetShuffleMode;
        int i11 = this.onSetPlaybackSpeed;
        String str8 = this.onPlayFromMediaId;
        List<String> list2 = this.onPrepareFromUri;
        String str9 = this.onRemoveQueueItem;
        boolean z2 = this.onCommand;
        String str10 = this.MediaMetadataCompat;
        String str11 = this.MediaBrowserCompatSearchResultReceiver;
        String str12 = this.RatingCompat;
        int i12 = this.onPlay;
        long j2 = this.onSetRating;
        long j3 = this.onSeekTo;
        int i13 = this.AudioAttributesImplApi26Parcelizer;
        List<String> list3 = this.onSetRepeatMode;
        String str13 = this.AudioAttributesImplApi21Parcelizer;
        boolean z3 = this.onAddQueueItem;
        String str14 = this.AudioAttributesCompatParcelizer;
        boolean z4 = this.handleMediaPlayPauseIfPendingOnHandler;
        int i14 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i15 = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("McqIndexRepoModel(mcqId=");
        sb.append(str);
        sb.append(", bookmarkId=");
        sb.append(str2);
        sb.append(", option1AnsweredCount=");
        sb.append(i);
        sb.append(", option2AnsweredCount=");
        sb.append(i2);
        sb.append(", option3AnsweredCount=");
        sb.append(i3);
        sb.append(", option4AnsweredCount=");
        sb.append(i4);
        sb.append(", option5AnsweredCount=");
        sb.append(i5);
        sb.append(", option6AnsweredCount=");
        sb.append(i6);
        sb.append(", option7AnsweredCount=");
        sb.append(i7);
        sb.append(", option8AnsweredCount=");
        sb.append(i8);
        sb.append(", answerPointer=");
        sb.append(str3);
        sb.append(", subjectId=");
        sb.append(str4);
        sb.append(", imageUrl=");
        sb.append(str5);
        sb.append(", imageUrlV2=");
        sb.append(str6);
        sb.append(", mcqType=");
        sb.append(i9);
        sb.append(", bookReferences=");
        sb.append(list);
        sb.append(", magicLine=");
        sb.append(str7);
        sb.append(", bookmarkLastUpdated=");
        sb.append(j);
        sb.append(", isStarredFlag=");
        sb.append(z);
        sb.append(", thumbnailWidth=");
        sb.append(i10);
        sb.append(", thumbnailHeight=");
        sb.append(i11);
        sb.append(", mcqContentEncrypted=");
        sb.append(str8);
        sb.append(", pearlIds=");
        sb.append(list2);
        sb.append(", rootSubjectId=");
        sb.append(str9);
        sb.append(", isDonNotConsider=");
        sb.append(z2);
        sb.append(", imageCitationLink=");
        sb.append(str10);
        sb.append(", imageCitationAuthor=");
        sb.append(str11);
        sb.append(", imageCitationLicense=");
        sb.append(str12);
        sb.append(", mcqUpdateStatus=");
        sb.append(i12);
        sb.append(", statusUpdateStartTimeMs=");
        sb.append(j2);
        sb.append(", statusUpdateEndTimeMs=");
        sb.append(j3);
        sb.append(", feedbackStatus=");
        sb.append(i13);
        sb.append(", tags=");
        sb.append(list3);
        sb.append(", displayId=");
        sb.append(str13);
        sb.append(", isActiveLessonPaid=");
        sb.append(z3);
        sb.append(", activeLessonId=");
        sb.append(str14);
        sb.append(", isLocked=");
        sb.append(z4);
        sb.append(", bookmarkType=");
        sb.append(i14);
        sb.append(", courseId=");
        sb.append(i15);
        sb.append(")");
        return sb.toString();
    }
}
