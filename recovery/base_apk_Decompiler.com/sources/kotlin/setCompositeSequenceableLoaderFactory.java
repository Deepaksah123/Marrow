package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.mcq.BookReference;
import com.marrow.data.models.mcq.McqIndex;
import com.marrow.data.models.mcq.McqPearlInfo;
import com.marrow.data.models.mcq.bookmark.MultiBookmarkCounter;
import com.marrow.data.models.mcq.schema.McqAnswerIndex;
import com.marrow.data.models.subject.Subject;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J#\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u001b\"\u00020\u0014H\u0016¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u0016\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0014J\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0014H\u0016J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0016\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u000fJ\u000e\u0010+\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0014J\u000e\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0014J\u0016\u0010.\u001a\u00020,2\u0006\u0010)\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u000fJ\u000e\u00100\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0014J\u001c\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0014J$\u00106\u001a\b\u0012\u0004\u0012\u000207022\u0006\u00108\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006;"}, d2 = {"Lcom/marrow/data/db/tables/mcq/McqIndexTable;", "Lcom/marrow/data/db/tables/BaseCourseTable;", "Lcom/marrow/data/models/mcq/McqIndex;", "Lcom/marrow/data/db/tables/mcq/IMCQTableInfo;", LogCategory.CONTEXT, "Landroid/content/Context;", "preferenceDataProvider", "Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;", "<init>", "(Landroid/content/Context;Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;)V", "sinceMaxValues", "Lcom/marrow/data/api/models/request/sync/SyncParam;", "getSinceMaxValues", "()Lcom/marrow/data/api/models/request/sync/SyncParam;", "bookmarkedMcqCount", "", "getBookmarkedMcqCount", "()I", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "queryUniqueSync", "primaryKeys", "", "([Ljava/lang/String;)Lcom/marrow/data/models/mcq/McqIndex;", "Landroid/content/ContentValues;", "mcq", "newArray", "size", "(I)[Lcom/marrow/data/models/mcq/McqIndex;", "getWhereClause", "getPrimaryKeys", "model", "(Lcom/marrow/data/models/mcq/McqIndex;)[Ljava/lang/String;", "unbookmarkAllValues", "", "updateBooleanFlag", "mcqId", "booleanFlag", "isStarred", "", "isBookmarked", "hasMcqStatus", "mcqStatus", "getFeedbackStatus", "getAllMcqsForSchema", "", "Lcom/marrow/data/models/mcq/schema/McqAnswerIndex;", "schemaId", "stepId", "getUniqueBookmarkTypes", "Lcom/marrow/data/models/mcq/bookmark/MultiBookmarkCounter;", "subjectId", "type", "subjectGroupType", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setCompositeSequenceableLoaderFactory extends r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc<McqIndex> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCompositeSequenceableLoaderFactory(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, "mcq_questions", getstreampositionusforcontent);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return RemoteActionCompatParcelizer((McqIndex) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object[] RemoteActionCompatParcelizer(int i) {
        return MediaMetadataCompat();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ ContentValues write(Object obj) {
        return write((McqIndex) obj);
    }

    public final int AudioAttributesCompatParcelizer() {
        return write("bookmarked_type>0", (String[]) null);
    }

    @Override // kotlin.r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMapRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer();
        LinkedHashMap<String, String> linkedHashMap = linkedHashMapRemoteActionCompatParcelizer;
        linkedHashMap.put(LessonMcqUpdateInfo.KEY_MCQ_ID, "TEXT PRIMARY KEY NOT NULL");
        linkedHashMap.put("bookmark_id", "TEXT");
        linkedHashMap.put("answered_option_1", "INTEGER");
        linkedHashMap.put("answered_option_2", "INTEGER");
        linkedHashMap.put("answered_option_3", "INTEGER");
        linkedHashMap.put("answered_option_4", "INTEGER");
        linkedHashMap.put("answered_option_5", "INTEGER");
        linkedHashMap.put("answered_option_6", "INTEGER");
        linkedHashMap.put("answered_option_7", "INTEGER");
        linkedHashMap.put("answered_option_8", "INTEGER");
        linkedHashMap.put("answer_pointer", "TEXT");
        linkedHashMap.put("subject_id", "TEXT");
        linkedHashMap.put("image_url", "TEXT");
        linkedHashMap.put("image_url_v2", "TEXT");
        linkedHashMap.put("mcq_type", "INTEGER");
        linkedHashMap.put("_references", "TEXT");
        linkedHashMap.put("magic_line", "TEXT");
        linkedHashMap.put("bookmark_last_updated", "INTEGER");
        linkedHashMap.put("boolean_flags", "INTEGER");
        linkedHashMap.put("t_width", "INTEGER");
        linkedHashMap.put("t_height", "INTEGER");
        linkedHashMap.put("encrypted_content", "TEXT");
        linkedHashMap.put("pearl_ids", "TEXT");
        linkedHashMap.put("root_subject_id", "TEXT");
        linkedHashMap.put("do_not_consider", "INTEGER");
        linkedHashMap.put("image_cit_link", "TEXT");
        linkedHashMap.put("image_cit_author", "TEXT");
        linkedHashMap.put("image_cit_license", "TEXT");
        linkedHashMap.put("update_status", "INTEGER");
        linkedHashMap.put("st_up_start_time_ms", "INTEGER");
        linkedHashMap.put("st_up_end_time_ms", "INTEGER");
        linkedHashMap.put("feedback_status", "INTEGER");
        linkedHashMap.put(FilterParams.KEY_TAGS, "TEXT");
        linkedHashMap.put("display_key", "TEXT");
        linkedHashMap.put("active_lesson_is_paid", "INTEGER");
        linkedHashMap.put("active_lesson_id", "TEXT");
        linkedHashMap.put("is_locked", "INTEGER");
        linkedHashMap.put("bookmarked_type", "INTEGER");
        return linkedHashMapRemoteActionCompatParcelizer;
    }

    private static McqIndex AudioAttributesCompatParcelizer(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        McqIndex mcqIndex = new McqIndex();
        mcqIndex.setMcqId(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, LessonMcqUpdateInfo.KEY_MCQ_ID));
        mcqIndex.setDontConsider(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "do_not_consider"));
        mcqIndex.setOption1AnsweredCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "answered_option_1"));
        mcqIndex.setOption2AnsweredCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "answered_option_2"));
        mcqIndex.setOption3AnsweredCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "answered_option_3"));
        mcqIndex.setOption4AnsweredCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "answered_option_4"));
        mcqIndex.setOption5AnsweredCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "answered_option_5"));
        mcqIndex.setOption6AnsweredCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "answered_option_6"));
        mcqIndex.setOption7AnsweredCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "answered_option_7"));
        mcqIndex.setOption8AnsweredCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "answered_option_8"));
        mcqIndex.setImageUrl(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "image_url"));
        mcqIndex.setImageUrlV2(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "image_url_v2"));
        mcqIndex.setMagicLine(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "magic_line"));
        mcqIndex.setBookmarkId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "bookmark_id"));
        mcqIndex.setSubjectId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "subject_id"));
        mcqIndex.setRootSubjectId(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "root_subject_id"));
        mcqIndex.setMcqType(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "mcq_type"));
        mcqIndex.setThumbnailWidth(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "t_width"));
        mcqIndex.setThumbnailHeight(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "t_height"));
        mcqIndex.setBooleanFlags(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "boolean_flags"));
        mcqIndex.setCourseId(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, FilterParams.KEY_COURSE_ID));
        mcqIndex.setBookmarkLastUpdated(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "bookmark_last_updated"));
        mcqIndex.setPearlIds(McqPearlInfo.newArray(mcqIndex.getMcqId(), copyAdaptationSets.AudioAttributesImplApi26Parcelizer(cursor, "pearl_ids")));
        BookReference[] bookReferenceArrFromJSON = BookReference.fromJSON(getPeriodDurationMs.AudioAttributesCompatParcelizer(cursor, "_references"));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bookReferenceArrFromJSON, "");
        mcqIndex.setReferences(bookReferenceArrFromJSON);
        mcqIndex.setAnswerPointer(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "answer_pointer"));
        mcqIndex.initEncryptedContent(mcqIndex.getMcqId(), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "encrypted_content"));
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "image_cit_link");
        if (strMediaBrowserCompatItemReceiver == null) {
            strMediaBrowserCompatItemReceiver = "";
        }
        mcqIndex.setImageCitationLink(strMediaBrowserCompatItemReceiver);
        String strMediaBrowserCompatItemReceiver2 = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "image_cit_author");
        if (strMediaBrowserCompatItemReceiver2 == null) {
            strMediaBrowserCompatItemReceiver2 = "";
        }
        mcqIndex.setImageCitationAuthor(strMediaBrowserCompatItemReceiver2);
        String strMediaBrowserCompatItemReceiver3 = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "image_cit_license");
        mcqIndex.setImageCitationLicense(strMediaBrowserCompatItemReceiver3 != null ? strMediaBrowserCompatItemReceiver3 : "");
        mcqIndex.mcqUpdateStatus = copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "update_status");
        mcqIndex.setStatusUpdateStartTimeMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "st_up_start_time_ms"));
        mcqIndex.setStatusUpdateEndTimeMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "st_up_end_time_ms"));
        mcqIndex.setFeedbackStatus(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "feedback_status"));
        mcqIndex.setDisplayId(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "display_key"));
        mcqIndex.setActiveLessonPaid(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "active_lesson_is_paid"));
        mcqIndex.setActiveLessonId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "active_lesson_id"));
        mcqIndex.setLocked(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "is_locked"));
        mcqIndex.setBookmarkType(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "bookmarked_type"));
        String strMediaBrowserCompatItemReceiver4 = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, FilterParams.KEY_TAGS);
        if (strMediaBrowserCompatItemReceiver4 != null) {
            mcqIndex.setTags(parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(strMediaBrowserCompatItemReceiver4));
        }
        return mcqIndex;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final McqIndex a_(String... strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        return (McqIndex) super.a_((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private static ContentValues write(McqIndex mcqIndex) {
        toMagicModuleMetaRepoModel.write(mcqIndex, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put(LessonMcqUpdateInfo.KEY_MCQ_ID, mcqIndex.getMcqId());
        contentValues.put("mcq_type", Integer.valueOf(mcqIndex.getMcqType()));
        contentValues.put("image_url", mcqIndex.getImageUrl());
        contentValues.put("image_url_v2", mcqIndex.getImageUrlV2());
        contentValues.put("magic_line", mcqIndex.getMagicLine());
        contentValues.put("subject_id", mcqIndex.getSubjectId());
        contentValues.put("bookmark_id", mcqIndex.getBookmarkId());
        contentValues.put("boolean_flags", Integer.valueOf(mcqIndex.getBooleanFlags()));
        contentValues.put("answer_pointer", mcqIndex.getAnswerPointer());
        contentValues.put("root_subject_id", mcqIndex.getRootSubjectId());
        contentValues.put("t_width", Integer.valueOf(mcqIndex.getThumbnailWidth()));
        contentValues.put("t_height", Integer.valueOf(mcqIndex.getThumbnailHeight()));
        contentValues.put("answered_option_1", Integer.valueOf(mcqIndex.getOption1AnsweredCount()));
        contentValues.put("answered_option_2", Integer.valueOf(mcqIndex.getOption2AnsweredCount()));
        contentValues.put("answered_option_3", Integer.valueOf(mcqIndex.getOption3AnsweredCount()));
        contentValues.put("answered_option_4", Integer.valueOf(mcqIndex.getOption4AnsweredCount()));
        contentValues.put("answered_option_5", Integer.valueOf(mcqIndex.getOption5AnsweredCount()));
        contentValues.put("answered_option_6", Integer.valueOf(mcqIndex.getOption6AnsweredCount()));
        contentValues.put("answered_option_7", Integer.valueOf(mcqIndex.getOption7AnsweredCount()));
        contentValues.put("answered_option_8", Integer.valueOf(mcqIndex.getOption8AnsweredCount()));
        contentValues.put("bookmark_last_updated", Long.valueOf(mcqIndex.getBookmarkLastUpdated()));
        BookReference[] references = mcqIndex.getReferences();
        contentValues.put("_references", BookReference.toJSONArray((BookReference[]) Arrays.copyOf(references, references.length)).toString());
        contentValues.put("encrypted_content", mcqIndex.getEncryptedContent());
        contentValues.put("do_not_consider", Integer.valueOf(mcqIndex.getIsDontConsider() ? 1 : 0));
        contentValues.put("pearl_ids", parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(mcqIndex.getPearlIds()));
        contentValues.put(FilterParams.KEY_COURSE_ID, Integer.valueOf(mcqIndex.getCourseId()));
        contentValues.put("image_cit_license", mcqIndex.getImageCitationLicense());
        contentValues.put("image_cit_author", mcqIndex.getImageCitationAuthor());
        contentValues.put("image_cit_link", mcqIndex.getImageCitationLink());
        contentValues.put("update_status", Integer.valueOf(mcqIndex.mcqUpdateStatus));
        contentValues.put("st_up_start_time_ms", Long.valueOf(mcqIndex.getStatusUpdateStartTimeMs()));
        contentValues.put("st_up_end_time_ms", Long.valueOf(mcqIndex.getStatusUpdateEndTimeMs()));
        contentValues.put("feedback_status", Integer.valueOf(mcqIndex.getFeedbackStatus()));
        contentValues.put(FilterParams.KEY_TAGS, parseLastSegmentNumberSupplementalProperty.read(mcqIndex.getTags()));
        contentValues.put("active_lesson_is_paid", Boolean.valueOf(mcqIndex.getIsActiveLessonPaid()));
        contentValues.put("is_locked", Integer.valueOf(mcqIndex.getIsLocked() ? 1 : 0));
        contentValues.put("bookmarked_type", Integer.valueOf(mcqIndex.getBookmarkType()));
        String activeLessonId = mcqIndex.getActiveLessonId();
        if (activeLessonId != null && activeLessonId.length() != 0) {
            contentValues.put("active_lesson_id", mcqIndex.getActiveLessonId());
        }
        if (mcqIndex.getDisplayId().length() > 0) {
            contentValues.put("display_key", mcqIndex.getDisplayId());
        }
        return contentValues;
    }

    private static McqIndex[] MediaMetadataCompat() {
        return new McqIndex[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "mcq_id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(McqIndex mcqIndex) {
        toMagicModuleMetaRepoModel.write(mcqIndex, "");
        return new String[]{mcqIndex.getMcqId()};
    }

    public final void MediaDescriptionCompat() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("bookmarked_type", (Integer) 0);
        contentValues.put("do_not_consider", (Integer) 1);
        super.write(contentValues, (String) null, (String[]) null);
    }

    public final List<McqAnswerIndex> MediaBrowserCompatItemReceiver(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("DISTINCT(%s.%s), %s.%s, %s.*", Arrays.copyOf(new Object[]{"mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", StepResponseBody.KEY_MY_ANSWER, "mcq_questions"}, 5));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("%s, %s, %s", Arrays.copyOf(new Object[]{"mcq_answer", "mcq_questions", "mcq_hyt"}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("%s.%s = %s.%s AND %s.%s = %s.%s AND %s.%s = '%s' AND %s.%s = '%s'", Arrays.copyOf(new Object[]{"mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_hyt", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_hyt", "hyt_id", str, "mcq_answer", "parent_id", str2}, 14));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        final ArrayList arrayList = new ArrayList();
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str6 = String.format("select %s from %s where %s", Arrays.copyOf(new Object[]{str3, str4, str5}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        final Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str6);
        if (cursorRemoteActionCompatParcelizer == null) {
            return arrayList;
        }
        Cursor cursor = cursorRemoteActionCompatParcelizer;
        try {
            final Cursor cursor2 = cursor;
            copyAdaptationSets.RemoteActionCompatParcelizer(cursor2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setMinLiveStartPositionUs
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    List list = arrayList;
                    Cursor cursor3 = cursorRemoteActionCompatParcelizer;
                    setCompositeSequenceableLoaderFactory setcompositesequenceableloaderfactory = this;
                    return setCompositeSequenceableLoaderFactory.AudioAttributesCompatParcelizer(list, cursor3, cursor2);
                }
            });
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return arrayList;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(List list, Cursor cursor, Cursor cursor2) {
        list.add(new McqAnswerIndex(AudioAttributesCompatParcelizer(cursor2), cursor.getInt(1)));
        return getShowPopup.INSTANCE;
    }

    public final List<MultiBookmarkCounter> read(String str, int i, int i2) {
        String string;
        String str2;
        String str3;
        toMagicModuleMetaRepoModel.write(str, "");
        if (i2 != -1) {
            StringBuilder sb = new StringBuilder("_subject.group_id = ");
            sb.append(i2);
            sb.append(" AND ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (i == 1) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            str3 = String.format(Locale.getDefault(), "SELECT %s, COUNT(*) FROM %s, %s, %s WHERE %s.%s = %s.%s AND %s.%s = '%s' AND %s.%s = %s.%s AND %s%s > 0 GROUP BY %s", Arrays.copyOf(new Object[]{"bookmarked_type", "mcq_questions", "mcq_parent_info", "_subject", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", "parent_mcq_id", "mcq_parent_info", "parent_id", str, "mcq_questions", "subject_id", "_subject", "_id", string, "bookmarked_type", "bookmarked_type"}, 18));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        } else {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) Subject.ROOT_PARENT_ID, (Object) str)) {
                str2 = "";
            } else {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
                String str4 = String.format(" AND %s = '%s'", Arrays.copyOf(new Object[]{"root_subject_id", str}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
                str2 = str4;
            }
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
            str3 = String.format("SELECT %s.%s, COUNT(*) FROM %s, %s WHERE %s.%s = %s.%s AND %s%s > 0 %s GROUP BY %s", Arrays.copyOf(new Object[]{"mcq_questions", "bookmarked_type", "mcq_questions", "_subject", "mcq_questions", "subject_id", "_subject", "_id", string, "bookmarked_type", str2, "bookmarked_type"}, 12));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        }
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str3);
        if (cursorRemoteActionCompatParcelizer == null) {
            throw new RuntimeException("Wrong query -> cursor returned null");
        }
        Cursor cursor = cursorRemoteActionCompatParcelizer;
        try {
            Cursor cursor2 = cursor;
            ArrayList arrayList = new ArrayList();
            if (cursor2.moveToFirst()) {
                do {
                    arrayList.add(new MultiBookmarkCounter(cursorRemoteActionCompatParcelizer.getInt(0), cursorRemoteActionCompatParcelizer.getInt(1)));
                } while (cursor2.moveToNext());
            }
            ArrayList arrayList2 = arrayList;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return arrayList2;
        } finally {
        }
    }
}
