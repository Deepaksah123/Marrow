package com.marrow.data.models.mcq;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.pearl.Pearl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getRenewGrpId;
import kotlin.parseText;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0017\u0018\u0000 §\u00012\u00020\u0001:\u0002§\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\"\u0010(\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\"\u0010+\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\"\u0010.\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\"\u00101\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001a\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR\"\u00104\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\"\u00107\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001a\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR\"\u0010:\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010\u001a\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR\"\u0010=\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001a\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010\u001eR$\u0010@\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010 \u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$R$\u0010C\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010 \u001a\u0004\bD\u0010\"\"\u0004\bE\u0010$R$\u0010F\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010 \u001a\u0004\bG\u0010\"\"\u0004\bH\u0010$R\"\u0010I\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010\u001a\u001a\u0004\bJ\u0010\u001c\"\u0004\bK\u0010\u001eR\"\u0010L\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010\u001a\u001a\u0004\bM\u0010\u001c\"\u0004\bN\u0010\u001eR\"\u0010P\u001a\u00020O8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010]\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010\u001a\u001a\u0004\b^\u0010\u001c\"\u0004\b_\u0010\u001eR\"\u0010`\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010\u001a\u001a\u0004\ba\u0010\u001c\"\u0004\bb\u0010\u001eR\u001c\u0010c\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\bc\u0010\u001a\u0012\u0004\bd\u0010\u0003R\"\u0010e\u001a\u00020O8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010Q\u001a\u0004\bf\u0010S\"\u0004\bg\u0010UR\"\u0010h\u001a\u00020O8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010Q\u001a\u0004\bi\u0010S\"\u0004\bj\u0010UR\"\u0010k\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bk\u0010 \u001a\u0004\bl\u0010\"\"\u0004\bm\u0010$R\"\u0010n\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010 \u001a\u0004\bo\u0010\"\"\u0004\bp\u0010$R\"\u0010q\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010 \u001a\u0004\br\u0010\"\"\u0004\bs\u0010$R \u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\"\u0010v\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bv\u0010\u001a\u001a\u0004\bw\u0010\u001c\"\u0004\bx\u0010\u001eR\"\u0010y\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\by\u0010\u0012\"\u0004\b{\u0010|R,\u0010}\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0014\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0005\b\u0081\u0001\u0010\fR(\u0010\u0082\u0001\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010 \u001a\u0005\b\u0083\u0001\u0010\"\"\u0005\b\u0084\u0001\u0010$R&\u0010\u0085\u0001\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010 \u001a\u0005\b\u0086\u0001\u0010\"\"\u0005\b\u0087\u0001\u0010$R(\u0010\u0088\u0001\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010 \u001a\u0005\b\u0089\u0001\u0010\"\"\u0005\b\u008a\u0001\u0010$R&\u0010\u008b\u0001\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010z\u001a\u0005\b\u008b\u0001\u0010\u0012\"\u0005\b\u008c\u0001\u0010|R&\u0010\u008d\u0001\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010z\u001a\u0005\b\u008d\u0001\u0010\u0012\"\u0005\b\u008e\u0001\u0010|R&\u0010\u008f\u0001\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010\u001a\u001a\u0005\b\u0090\u0001\u0010\u001c\"\u0005\b\u0091\u0001\u0010\u001eR'\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R8\u0010\u0096\u0001\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007@BX\u0087\u000e¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010~\u001a\u0006\b\u0097\u0001\u0010\u0080\u0001R\u0013\u0010\u0098\u0001\u001a\u00020\u00108G¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\u0012R'\u0010\u0099\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010\u0012\"\u0005\b\u009a\u0001\u0010|R\u0013\u0010\u009c\u0001\u001a\u00020\u00138G¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\u001cR\u001a\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\t8G¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u0080\u0001R\u0013\u0010 \u0001\u001a\u00020\n8G¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010\"R\u0013\u0010¢\u0001\u001a\u00020\u00138G¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010\u001cR\u0015\u0010¦\u0001\u001a\u00030£\u00018G¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001"}, d2 = {"Lcom/marrow/data/models/mcq/McqIndex;", "Lcom/marrow/data/models/mcq/McqIndexMini;", "<init>", "()V", "Lcom/fasterxml/jackson/databind/JsonNode;", "p0", "", "setPearlIds", "(Lcom/fasterxml/jackson/databind/JsonNode;)V", "", "", "setHytIds", "([Ljava/lang/String;)V", "", "getPearlIds", "()Ljava/util/List;", "", "hasPearls", "()Z", "", "getAnswerCount", "(I)I", "hasReferences", "Lcom/marrow/data/models/mcq/McqPearlInfo;", "([Lcom/marrow/data/models/mcq/McqPearlInfo;)V", "mcqType", "I", "getMcqType", "()I", "setMcqType", "(I)V", "imageUrl", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "imageUrlV2", "getImageUrlV2", "setImageUrlV2", "option1AnsweredCount", "getOption1AnsweredCount", "setOption1AnsweredCount", "option2AnsweredCount", "getOption2AnsweredCount", "setOption2AnsweredCount", "option3AnsweredCount", "getOption3AnsweredCount", "setOption3AnsweredCount", "option4AnsweredCount", "getOption4AnsweredCount", "setOption4AnsweredCount", "option5AnsweredCount", "getOption5AnsweredCount", "setOption5AnsweredCount", "option6AnsweredCount", "getOption6AnsweredCount", "setOption6AnsweredCount", "option7AnsweredCount", "getOption7AnsweredCount", "setOption7AnsweredCount", "option8AnsweredCount", "getOption8AnsweredCount", "setOption8AnsweredCount", "bookmarkId", "getBookmarkId", "setBookmarkId", "magicLine", "getMagicLine", "setMagicLine", "answerPointer", "getAnswerPointer", "setAnswerPointer", "thumbnailWidth", "getThumbnailWidth", "setThumbnailWidth", "thumbnailHeight", "getThumbnailHeight", "setThumbnailHeight", "", "bookmarkLastUpdated", "J", "getBookmarkLastUpdated", "()J", "setBookmarkLastUpdated", "(J)V", "Lcom/marrow/data/models/mcq/BookReference;", "references", "[Lcom/marrow/data/models/mcq/BookReference;", "getReferences", "()[Lcom/marrow/data/models/mcq/BookReference;", "setReferences", "([Lcom/marrow/data/models/mcq/BookReference;)V", "courseId", "getCourseId", "setCourseId", "feedbackStatus", "getFeedbackStatus", "setFeedbackStatus", "mcqUpdateStatus", "getMcqUpdateStatus$annotations", "statusUpdateStartTimeMs", "getStatusUpdateStartTimeMs", "setStatusUpdateStartTimeMs", "statusUpdateEndTimeMs", "getStatusUpdateEndTimeMs", "setStatusUpdateEndTimeMs", "imageCitationLink", "getImageCitationLink", "setImageCitationLink", "imageCitationAuthor", "getImageCitationAuthor", "setImageCitationAuthor", "imageCitationLicense", "getImageCitationLicense", "setImageCitationLicense", "pearlIds", "[Lcom/marrow/data/models/mcq/McqPearlInfo;", "booleanFlags", "getBooleanFlags", "setBooleanFlags", "isDontConsider", "Z", "setDontConsider", "(Z)V", "tags", "[Ljava/lang/String;", "getTags", "()[Ljava/lang/String;", "setTags", "subjectId", "getSubjectId", "setSubjectId", "displayId", "getDisplayId", "setDisplayId", "activeLessonId", "getActiveLessonId", "setActiveLessonId", "isActiveLessonPaid", "setActiveLessonPaid", "isLocked", "setLocked", "bookmarkType", "getBookmarkType", "setBookmarkType", "childQuestions", "[Lcom/marrow/data/models/mcq/McqIndex;", "getChildQuestions", "()[Lcom/marrow/data/models/mcq/McqIndex;", "highYieldIds", "getHighYieldIds", "isBookmarked", "isStarred", "setStarred", "getTotalAnswerCount", "totalAnswerCount", "getOptions", "options", "getQuestionDescription", "questionDescription", "getRightAnswerIndex", "rightAnswerIndex", "", "getAspectRatio", "()F", "aspectRatio", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class McqIndex extends McqIndexMini {
    public static final int BOOLEAN_FLAG_IS_STARRED = 2;
    public static final int FEEDBACK_EXPLAINED = 1;
    public static final int FEEDBACK_NO_STATUS = 0;
    private static final String KEY_ACTIVE_LESSON_ID = "active_lesson_id";
    private static final String KEY_ACTIVE_LESSON_IS_PAID = "active_lesson_is_paid";
    private static final String KEY_ANSWER = "answer";
    private static final String KEY_ANSWERED_OPTION_1 = "answered_option_1";
    private static final String KEY_ANSWERED_OPTION_2 = "answered_option_2";
    private static final String KEY_ANSWERED_OPTION_3 = "answered_option_3";
    private static final String KEY_ANSWERED_OPTION_4 = "answered_option_4";
    private static final String KEY_ANSWERED_OPTION_5 = "answered_option_5";
    private static final String KEY_ANSWERED_OPTION_6 = "answered_option_6";
    private static final String KEY_ANSWERED_OPTION_7 = "answered_option_7";
    private static final String KEY_ANSWERED_OPTION_8 = "answered_option_8";
    private static final String KEY_BOOKMARKED = "bookmarked";
    private static final String KEY_BOOKMARK_ID = "bookmark_id";
    private static final String KEY_BOOKMARK_LAST_UPDATED = "bookmark_last_updated";
    private static final String KEY_BOOKS_REFERENCE = "book_reference";
    private static final String KEY_CHILD_QUESTIONS = "c_questions";
    private static final String KEY_COURSE_ID = "course_id";
    private static final String KEY_DISPLAY_ID = "display_id";
    private static final String KEY_FEEDBACK_LOCK = "feedback_lock";
    private static final String KEY_HYT_IDS = "hyt_ids";
    private static final String KEY_IS_LOCKED = "is_locked";
    private static final String KEY_MAGIC_LINE = "mline";
    private static final String KEY_MCQ_TYPE = "mcq_type";
    private static final String KEY_PEARL_IDS = "pearl_ids";
    private static final String KEY_SUBJECT_ID = "subject_id";
    private static final String KEY_TAGS = "tags";
    private static final String KEY_THUMBNAIL = "thumbnail";
    private static final String KEY_THUMBNAIL_V2 = "thumbnail_v2";
    private static final String KEY_T_HEIGHT = "theight";
    private static final String KEY_T_WIDTH = "twidth";

    @JsonProperty(KEY_ACTIVE_LESSON_ID)
    private String activeLessonId;

    @JsonProperty(KEY_ANSWER)
    private String answerPointer;

    @JsonProperty(KEY_BOOKMARK_ID)
    private String bookmarkId;

    @JsonProperty(KEY_BOOKMARK_LAST_UPDATED)
    private long bookmarkLastUpdated;

    @JsonProperty("bookmarked")
    private int bookmarkType;

    @JsonIgnore
    private int booleanFlags;

    @JsonProperty(KEY_CHILD_QUESTIONS)
    private final McqIndex[] childQuestions;

    @JsonProperty("course_id")
    private int courseId;

    @JsonProperty(KEY_FEEDBACK_LOCK)
    private int feedbackStatus;

    @JsonProperty("thumbnail_v2")
    private String imageUrlV2;

    @JsonProperty(KEY_ACTIVE_LESSON_IS_PAID)
    private boolean isActiveLessonPaid;

    @JsonIgnore
    private boolean isDontConsider;

    @JsonProperty(KEY_IS_LOCKED)
    private boolean isLocked;

    @JsonProperty(KEY_MAGIC_LINE)
    private String magicLine;

    @JsonProperty(KEY_MCQ_TYPE)
    private int mcqType;

    @JsonProperty(LessonMcqUpdateInfo.KEY_STATUS)
    public int mcqUpdateStatus;

    @JsonProperty(KEY_ANSWERED_OPTION_1)
    private int option1AnsweredCount;

    @JsonProperty(KEY_ANSWERED_OPTION_2)
    private int option2AnsweredCount;

    @JsonProperty(KEY_ANSWERED_OPTION_3)
    private int option3AnsweredCount;

    @JsonProperty(KEY_ANSWERED_OPTION_4)
    private int option4AnsweredCount;

    @JsonProperty(KEY_ANSWERED_OPTION_5)
    private int option5AnsweredCount;

    @JsonProperty(KEY_ANSWERED_OPTION_6)
    private int option6AnsweredCount;

    @JsonProperty(KEY_ANSWERED_OPTION_7)
    private int option7AnsweredCount;

    @JsonProperty(KEY_ANSWERED_OPTION_8)
    private int option8AnsweredCount;

    @JsonIgnore
    public McqPearlInfo[] pearlIds;

    @JsonProperty(LessonMcqUpdateInfo.KEY_STATUS_END_TIME)
    private long statusUpdateEndTimeMs;

    @JsonProperty(LessonMcqUpdateInfo.KEY_STATUS_START_TIME)
    private long statusUpdateStartTimeMs;

    @JsonProperty("subject_id")
    private String subjectId;

    @JsonProperty("tags")
    private String[] tags;

    @JsonProperty(KEY_T_HEIGHT)
    private int thumbnailHeight;

    @JsonProperty(KEY_T_WIDTH)
    private int thumbnailWidth;

    @JsonProperty("thumbnail")
    private String imageUrl = "";

    @JsonProperty(KEY_BOOKS_REFERENCE)
    private BookReference[] references = new BookReference[0];

    @JsonProperty("tsource")
    private String imageCitationLink = "";

    @JsonProperty("tauthor")
    private String imageCitationAuthor = "";

    @JsonProperty("tlicense")
    private String imageCitationLicense = "";

    @JsonProperty("display_id")
    private String displayId = "";

    @JsonProperty(KEY_HYT_IDS)
    private String[] highYieldIds = new String[0];

    @LessonMcqUpdateInfo.STATUS
    public static /* synthetic */ void getMcqUpdateStatus$annotations() {
    }

    public final int getMcqType() {
        return this.mcqType;
    }

    public final void setMcqType(int i) {
        this.mcqType = i;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final String getImageUrlV2() {
        return this.imageUrlV2;
    }

    public final void setImageUrlV2(String str) {
        this.imageUrlV2 = str;
    }

    public final int getOption1AnsweredCount() {
        return this.option1AnsweredCount;
    }

    public final void setOption1AnsweredCount(int i) {
        this.option1AnsweredCount = i;
    }

    public final int getOption2AnsweredCount() {
        return this.option2AnsweredCount;
    }

    public final void setOption2AnsweredCount(int i) {
        this.option2AnsweredCount = i;
    }

    public final int getOption3AnsweredCount() {
        return this.option3AnsweredCount;
    }

    public final void setOption3AnsweredCount(int i) {
        this.option3AnsweredCount = i;
    }

    public final int getOption4AnsweredCount() {
        return this.option4AnsweredCount;
    }

    public final void setOption4AnsweredCount(int i) {
        this.option4AnsweredCount = i;
    }

    public final int getOption5AnsweredCount() {
        return this.option5AnsweredCount;
    }

    public final void setOption5AnsweredCount(int i) {
        this.option5AnsweredCount = i;
    }

    public final int getOption6AnsweredCount() {
        return this.option6AnsweredCount;
    }

    public final void setOption6AnsweredCount(int i) {
        this.option6AnsweredCount = i;
    }

    public final int getOption7AnsweredCount() {
        return this.option7AnsweredCount;
    }

    public final void setOption7AnsweredCount(int i) {
        this.option7AnsweredCount = i;
    }

    public final int getOption8AnsweredCount() {
        return this.option8AnsweredCount;
    }

    public final void setOption8AnsweredCount(int i) {
        this.option8AnsweredCount = i;
    }

    public final String getBookmarkId() {
        return this.bookmarkId;
    }

    public final void setBookmarkId(String str) {
        this.bookmarkId = str;
    }

    public final String getMagicLine() {
        return this.magicLine;
    }

    public final void setMagicLine(String str) {
        this.magicLine = str;
    }

    public final String getAnswerPointer() {
        return this.answerPointer;
    }

    public final void setAnswerPointer(String str) {
        this.answerPointer = str;
    }

    public final int getThumbnailWidth() {
        return this.thumbnailWidth;
    }

    public final void setThumbnailWidth(int i) {
        this.thumbnailWidth = i;
    }

    public final int getThumbnailHeight() {
        return this.thumbnailHeight;
    }

    public final void setThumbnailHeight(int i) {
        this.thumbnailHeight = i;
    }

    public final long getBookmarkLastUpdated() {
        return this.bookmarkLastUpdated;
    }

    public final void setBookmarkLastUpdated(long j) {
        this.bookmarkLastUpdated = j;
    }

    public final BookReference[] getReferences() {
        return this.references;
    }

    public final void setReferences(BookReference[] bookReferenceArr) {
        toMagicModuleMetaRepoModel.write(bookReferenceArr, "");
        this.references = bookReferenceArr;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final void setCourseId(int i) {
        this.courseId = i;
    }

    public final int getFeedbackStatus() {
        return this.feedbackStatus;
    }

    public final void setFeedbackStatus(int i) {
        this.feedbackStatus = i;
    }

    public final long getStatusUpdateStartTimeMs() {
        return this.statusUpdateStartTimeMs;
    }

    public final void setStatusUpdateStartTimeMs(long j) {
        this.statusUpdateStartTimeMs = j;
    }

    public final long getStatusUpdateEndTimeMs() {
        return this.statusUpdateEndTimeMs;
    }

    public final void setStatusUpdateEndTimeMs(long j) {
        this.statusUpdateEndTimeMs = j;
    }

    public final String getImageCitationLink() {
        return this.imageCitationLink;
    }

    public final void setImageCitationLink(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.imageCitationLink = str;
    }

    public final String getImageCitationAuthor() {
        return this.imageCitationAuthor;
    }

    public final void setImageCitationAuthor(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.imageCitationAuthor = str;
    }

    public final String getImageCitationLicense() {
        return this.imageCitationLicense;
    }

    public final void setImageCitationLicense(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.imageCitationLicense = str;
    }

    public final int getBooleanFlags() {
        return this.booleanFlags;
    }

    public final void setBooleanFlags(int i) {
        this.booleanFlags = i;
    }

    /* JADX INFO: renamed from: isDontConsider, reason: from getter */
    public final boolean getIsDontConsider() {
        return this.isDontConsider;
    }

    public final void setDontConsider(boolean z) {
        this.isDontConsider = z;
    }

    public final String[] getTags() {
        return this.tags;
    }

    public final void setTags(String[] strArr) {
        this.tags = strArr;
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final void setSubjectId(String str) {
        this.subjectId = str;
    }

    public final String getDisplayId() {
        return this.displayId;
    }

    public final void setDisplayId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.displayId = str;
    }

    public final String getActiveLessonId() {
        return this.activeLessonId;
    }

    public final void setActiveLessonId(String str) {
        this.activeLessonId = str;
    }

    /* JADX INFO: renamed from: isActiveLessonPaid, reason: from getter */
    public final boolean getIsActiveLessonPaid() {
        return this.isActiveLessonPaid;
    }

    public final void setActiveLessonPaid(boolean z) {
        this.isActiveLessonPaid = z;
    }

    /* JADX INFO: renamed from: isLocked, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    public final void setLocked(boolean z) {
        this.isLocked = z;
    }

    public final int getBookmarkType() {
        return this.bookmarkType;
    }

    public final void setBookmarkType(int i) {
        this.bookmarkType = i;
    }

    public final McqIndex[] getChildQuestions() {
        return this.childQuestions;
    }

    public final String[] getHighYieldIds() {
        return this.highYieldIds;
    }

    @JsonSetter(KEY_PEARL_IDS)
    public void setPearlIds(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isArray()) {
            this.pearlIds = parseText.write(getMcqId(), Pearl.fromJsonArray((ArrayNode) p0, true));
        }
    }

    public void setHytIds(String[] p0) {
        this.highYieldIds = p0;
    }

    public final List<String> getPearlIds() {
        ArrayList arrayList = new ArrayList();
        McqPearlInfo[] mcqPearlInfoArr = this.pearlIds;
        if (mcqPearlInfoArr != null) {
            for (McqPearlInfo mcqPearlInfo : mcqPearlInfoArr) {
                if (mcqPearlInfo != null && mcqPearlInfo.getPearlId() != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) mcqPearlInfo.getPearlId(), (Object) "null")) {
                    String pearlId = mcqPearlInfo.getPearlId();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pearlId, "");
                    arrayList.add(pearlId);
                }
            }
        }
        return arrayList;
    }

    public final boolean hasPearls() {
        McqPearlInfo[] mcqPearlInfoArr = this.pearlIds;
        return !(mcqPearlInfoArr == null || mcqPearlInfoArr.length == 0);
    }

    public final boolean isBookmarked() {
        return this.bookmarkType > 0;
    }

    public final boolean isStarred() {
        return (this.booleanFlags & 2) == 2;
    }

    public final void setStarred(boolean z) {
        int i;
        if (z) {
            i = this.booleanFlags | 2;
        } else {
            i = this.booleanFlags & (-3);
        }
        this.booleanFlags = i;
    }

    public final int getTotalAnswerCount() {
        return this.option1AnsweredCount + this.option2AnsweredCount + this.option3AnsweredCount + this.option4AnsweredCount + this.option5AnsweredCount + this.option6AnsweredCount + this.option7AnsweredCount + this.option8AnsweredCount;
    }

    public final String[] getOptions() {
        return getMcqContentBody().getOptions();
    }

    public final String getQuestionDescription() {
        return getMcqContentBody().getQuestionDescription();
    }

    public final int getAnswerCount(int p0) {
        switch (p0) {
            case 0:
                return this.option1AnsweredCount;
            case 1:
                return this.option2AnsweredCount;
            case 2:
                return this.option3AnsweredCount;
            case 3:
                return this.option4AnsweredCount;
            case 4:
                return this.option5AnsweredCount;
            case 5:
                return this.option6AnsweredCount;
            case 6:
                return this.option7AnsweredCount;
            case 7:
                return this.option8AnsweredCount;
            default:
                return 0;
        }
    }

    @getRenewGrpId
    public final int getRightAnswerIndex() {
        return parseText.read(this.answerPointer);
    }

    public final float getAspectRatio() {
        int i = this.thumbnailWidth;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.thumbnailHeight / i;
    }

    public final boolean hasReferences() {
        BookReference[] bookReferenceArr = this.references;
        return !(bookReferenceArr == null || bookReferenceArr.length == 0);
    }

    public final void setPearlIds(McqPearlInfo[] p0) {
        this.pearlIds = p0;
    }
}
