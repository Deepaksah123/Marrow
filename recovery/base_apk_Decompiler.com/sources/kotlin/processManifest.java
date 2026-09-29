package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.custommodule.CustomModule;
import com.marrow.data.models.custommodule.FilterParams;
import in.juspay.hyper.constants.LogCategory;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH\u0014J\u0015\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0014J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0014¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\tH\u0016J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010!\u001a\u00020\u0019J \u0010\"\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020\tJ\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tJ\u0016\u0010+\u001a\u00020,2\u0006\u0010 \u001a\u00020\t2\u0006\u0010-\u001a\u00020$¨\u0006/"}, d2 = {"Lcom/marrow/data/db/tables/custommodule/CustomModuleTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/models/custommodule/CustomModule;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "queryAllSync", "", "()[Lcom/marrow/data/models/custommodule/CustomModule;", "convert", "cursor", "Landroid/database/Cursor;", "getResponseParams", "Lcom/marrow/data/models/custommodule/FilterParams;", "resParamsStr", "params", "Landroid/content/ContentValues;", "module", "newArray", "size", "", "(I)[Lcom/marrow/data/models/custommodule/CustomModule;", "getWhereClause", "getPrimaryKeys", "model", "(Lcom/marrow/data/models/custommodule/CustomModule;)[Ljava/lang/String;", "updateStatus", "id", "status", "updateSubmittedOnAndStatus", "submittedOn", "", "getCustomModuleDetails", "customModuleId", "hasActiveCustomModule", "", "getInviteCode", "cmId", "saveUserInitiatedExamStartTime", "", "startTimestampMs", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class processManifest extends getIntervalUntilNextManifestRefreshMs<CustomModule> {
    public static final IconCompatParcelizer write = new IconCompatParcelizer(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public processManifest(Context context) {
        super(context, CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(CustomModule customModule) {
        return RemoteActionCompatParcelizer(customModule);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ CustomModule RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ CustomModule[] RemoteActionCompatParcelizer(int i) {
        return MediaMetadataCompat();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ ContentValues write(CustomModule customModule) {
        return write2(customModule);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("_params", "TEXT"), setAction.write("_res_params", "TEXT"), setAction.write("warning_msg", "TEXT"), setAction.write("mcq_count", "INTEGER"), setAction.write("status", "INTEGER"), setAction.write("task_status", "INTEGER"), setAction.write(LoggedUserResponse.KEY_CREATED_ON, "INTEGER"), setAction.write("submitted_on", "INTEGER"), setAction.write("invite_code", "TEXT"), setAction.write("is_expired", "INTEGER"), setAction.write("owner_category", "TEXT"), setAction.write("test_name", "TEXT"), setAction.write("module_msg", "TEXT"), setAction.write("expired_on", "INTEGER"), setAction.write("start_datetime", "INTEGER"), setAction.write("exam_duration_seconds", "INTEGER"), setAction.write("exam_started_on", "INTEGER"));
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final CustomModule[] RatingCompat() {
        return (CustomModule[]) super.RatingCompat();
    }

    private static CustomModule IconCompatParcelizer(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        CustomModule customModule = new CustomModule();
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_params");
        String strMediaBrowserCompatItemReceiver2 = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_res_params");
        customModule.id = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_id");
        customModule.params = new FilterParams.JsonParser().fromJson(strMediaBrowserCompatItemReceiver);
        customModule.setResponseParams(write(strMediaBrowserCompatItemReceiver2, customModule.params));
        customModule.setWarningMsg(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "warning_msg"));
        customModule.mcqCount = copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "mcq_count");
        customModule.status = copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "status");
        customModule.taskStatus = copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "task_status");
        customModule.createdOn = copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, LoggedUserResponse.KEY_CREATED_ON);
        customModule.setSubmittedOn(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "submitted_on"));
        customModule.setInviteCode(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "invite_code"));
        customModule.setExpired(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "is_expired"));
        customModule.setModuleOwner(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "owner_category"));
        customModule.setTestName(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "test_name"));
        String strMediaBrowserCompatItemReceiver3 = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "module_msg");
        customModule.setModuleMessage(strMediaBrowserCompatItemReceiver3 != null ? strMediaBrowserCompatItemReceiver3 : "");
        customModule.setExpiredOn(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "expired_on"));
        customModule.setStartDateTime(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "start_datetime"));
        customModule.setExamDurationSeconds(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "exam_duration_seconds"));
        customModule.setUserInitiatedExamStartedOn(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "exam_started_on"));
        return customModule;
    }

    private static FilterParams write(String str, FilterParams filterParams) {
        FilterParams filterParamsFromJson = new FilterParams.JsonParser().fromJson(str);
        if (filterParamsFromJson == null) {
            filterParamsFromJson = filterParams;
        }
        filterParams.rootSubjects = filterParamsFromJson.rootSubjects;
        filterParams.subjects = filterParamsFromJson.subjects;
        filterParams.tags = filterParamsFromJson.tags;
        return filterParams;
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static ContentValues write2(CustomModule customModule) {
        toMagicModuleMetaRepoModel.write(customModule, "");
        Pair[] pairArr = new Pair[18];
        pairArr[0] = setAction.write("_id", customModule.id);
        pairArr[1] = setAction.write("_params", new FilterParams.JsonParser().toJson(customModule.params));
        FilterParams.JsonParser jsonParser = new FilterParams.JsonParser();
        FilterParams responseParams = customModule.getResponseParams();
        if (responseParams == null) {
            responseParams = customModule.params;
        }
        pairArr[2] = setAction.write("_res_params", jsonParser.toJson(responseParams));
        pairArr[3] = setAction.write("warning_msg", customModule.getWarningMsg());
        pairArr[4] = setAction.write("mcq_count", Integer.valueOf(customModule.mcqCount));
        pairArr[5] = setAction.write("status", Integer.valueOf(customModule.status));
        pairArr[6] = setAction.write("task_status", Integer.valueOf(customModule.taskStatus));
        pairArr[7] = setAction.write(LoggedUserResponse.KEY_CREATED_ON, Long.valueOf(customModule.createdOn));
        pairArr[8] = setAction.write("submitted_on", Long.valueOf(customModule.getSubmittedOn()));
        pairArr[9] = setAction.write("invite_code", customModule.getInviteCode());
        pairArr[10] = setAction.write("is_expired", Boolean.valueOf(customModule.getIsExpired()));
        pairArr[11] = setAction.write("owner_category", customModule.getModuleOwner());
        pairArr[12] = setAction.write("test_name", customModule.getTestName());
        pairArr[13] = setAction.write("module_msg", customModule.getModuleMessage());
        pairArr[14] = setAction.write("expired_on", Long.valueOf(customModule.getExpiredOn()));
        pairArr[15] = setAction.write("start_datetime", Long.valueOf(customModule.getStartDateTime()));
        pairArr[16] = setAction.write("exam_duration_seconds", Integer.valueOf(customModule.getExamDurationSeconds()));
        pairArr[17] = setAction.write("exam_started_on", Long.valueOf(customModule.getUserInitiatedExamStartedOn()));
        return copyAdaptationSets.IconCompatParcelizer(pairArr);
    }

    private static CustomModule[] MediaMetadataCompat() {
        return new CustomModule[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(CustomModule customModule) {
        toMagicModuleMetaRepoModel.write(customModule, "");
        return new String[]{customModule.id};
    }

    public final int IconCompatParcelizer(String str, int i) {
        return RemoteActionCompatParcelizer(copyAdaptationSets.IconCompatParcelizer(setAction.write("status", Integer.valueOf(i))), "_id", str);
    }

    public final int read(String str, int i, long j) {
        return RemoteActionCompatParcelizer(copyAdaptationSets.IconCompatParcelizer(setAction.write("status", Integer.valueOf(i)), setAction.write("submitted_on", Long.valueOf(j))), "_id", str);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return write((String) null, (String[]) null) > 0;
    }

    public final String AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        String[] strArr = read("invite_code", "_id =? ", new String[]{str}, null);
        String str2 = strArr != null ? strArr[0] : null;
        return str2 == null ? "" : str2;
    }

    public final void IconCompatParcelizer(String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        RemoteActionCompatParcelizer(copyAdaptationSets.IconCompatParcelizer(setAction.write("exam_started_on", Long.valueOf(j))), "_id", str);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/processManifest$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
