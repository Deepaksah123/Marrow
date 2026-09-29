package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.mcq.McqIndexMini;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\f\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00016B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00162\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0019J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00162\u0006\u0010\u0012\u001a\u00020\u0013J$\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J9\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010#\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010$J#\u0010%\u001a\u0004\u0018\u00010\u00022\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0016¢\u0006\u0002\u0010'J\u0010\u0010\u001d\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0002H\u0014J\u0010\u0010*\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0002H\u0016J\u001b\u0010,\u001a\u00020+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0002\u0010.J\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u00100\u001a\u00020\u0013H\u0014¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\fH\u0016J\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0002\u00105R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/marrow/data/db/tables/mcq/McqIndexMiniTable;", "Lcom/marrow/data/db/tables/BaseCourseTable;", "Lcom/marrow/data/models/mcq/McqIndexMini;", "Lcom/marrow/data/db/tables/mcq/IMCQTableInfo;", LogCategory.CONTEXT, "Landroid/content/Context;", "preferenceDataProvider", "Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;", "<init>", "(Landroid/content/Context;Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;)V", "mProjection", "", "", "[Ljava/lang/String;", "mLoadEncryptedContent", "", "getBookmarkedMCQIdsBlocking", "rootSubjectId", "bookmarkType", "", "(Ljava/lang/String;I)[Ljava/lang/String;", "getBookmarkedMCQIds", "Lio/reactivex/Flowable;", "getStepBookmarkedMCQIds", "stepId", "(I)[Ljava/lang/String;", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "querySync", "where", "conditionValues", "sortOrder", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)[Lcom/marrow/data/models/mcq/McqIndexMini;", "queryUniqueSync", "primaryKeys", "([Ljava/lang/String;)Lcom/marrow/data/models/mcq/McqIndexMini;", "Landroid/content/ContentValues;", "mcq", "insert", "", "insertBulk", "mcqs", "([Lcom/marrow/data/models/mcq/McqIndexMini;)Ljava/lang/Void;", "newArray", "size", "(I)[Lcom/marrow/data/models/mcq/McqIndexMini;", "getWhereClause", "getPrimaryKeys", "model", "(Lcom/marrow/data/models/mcq/McqIndexMini;)[Ljava/lang/String;", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isMovingLiveWindow extends r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc<McqIndexMini> {
    private final String[] AudioAttributesCompatParcelizer;
    private final boolean write;
    public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer(null);
    private static final String[] IconCompatParcelizer = {LessonMcqUpdateInfo.KEY_MCQ_ID, "subject_id", "root_subject_id", "encrypted_content"};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isMovingLiveWindow(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, "mcq_questions", getstreampositionusforcontent);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.AudioAttributesCompatParcelizer = IconCompatParcelizer;
        this.write = true;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ void AudioAttributesCompatParcelizer(Object obj) {
        AudioAttributesCompatParcelizer((McqIndexMini) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ void IconCompatParcelizer(Object[] objArr) {
        AudioAttributesCompatParcelizer((McqIndexMini[]) objArr);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return RemoteActionCompatParcelizer((McqIndexMini) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(Object obj) {
        return read((McqIndexMini) obj);
    }

    public final String[] IconCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        String str2 = AudioAttributesCompatParcelizer.read(i);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" AND root_subject_id =? ");
        return super.read(LessonMcqUpdateInfo.KEY_MCQ_ID, sb.toString(), new String[]{str}, "bookmark_last_updated DESC");
    }

    public final String[] write(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        StringBuilder sb = new StringBuilder("mcq_parent_info.parent_id = '");
        sb.append(str);
        sb.append("'");
        String string = sb.toString();
        String str2 = AudioAttributesCompatParcelizer.read(i);
        StringBuilder sb2 = new StringBuilder("select mcq_questions.mcq_id from mcq_questions, mcq_parent_info where mcq_questions.mcq_id = mcq_parent_info.mcq_id AND ");
        sb2.append(string);
        sb2.append(" AND ");
        sb2.append(str2);
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb2.toString());
        if (cursorRemoteActionCompatParcelizer == null) {
            return new String[0];
        }
        final ArrayList arrayList = new ArrayList();
        Cursor cursor = cursorRemoteActionCompatParcelizer;
        try {
            final Cursor cursor2 = cursor;
            copyAdaptationSets.RemoteActionCompatParcelizer(cursor2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.DashMediaSourceDefaultPlayerEmsgCallback
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return isMovingLiveWindow.IconCompatParcelizer(arrayList, cursor2);
                }
            });
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return (String[]) arrayList.toArray(new String[0]);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(List list, Cursor cursor) {
        list.add(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "mcq_questions.mcq_id"));
        return getShowPopup.INSTANCE;
    }

    public final String[] read(int i) {
        return read(LessonMcqUpdateInfo.KEY_MCQ_ID, AudioAttributesCompatParcelizer.read(i), null, "bookmark_last_updated DESC");
    }

    @Override // kotlin.r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        throw new UnsupportedOperationException("MCQIndexMiniV2Table is shortcut table. Creation should be done through MCQTable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public McqIndexMini RemoteActionCompatParcelizer(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        McqIndexMini mcqIndexMini = new McqIndexMini();
        mcqIndexMini.setMcqId(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, LessonMcqUpdateInfo.KEY_MCQ_ID));
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "root_subject_id");
        mcqIndexMini.setRootSubjectId(strMediaBrowserCompatItemReceiver != null ? strMediaBrowserCompatItemReceiver : "");
        if (this.write) {
            mcqIndexMini.initEncryptedContent(mcqIndexMini.getMcqId(), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "encrypted_content"));
        }
        return mcqIndexMini;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc, kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public McqIndexMini[] read(String str, String[] strArr, String str2) {
        Cursor cursorQuery = this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), this.AudioAttributesCompatParcelizer, str, strArr, str2);
        if (cursorQuery == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            final Cursor cursor2 = cursor;
            final ArrayList arrayList = new ArrayList();
            copyAdaptationSets.RemoteActionCompatParcelizer(cursor2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setFallbackTargetLiveOffsetMs
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return isMovingLiveWindow.read(this.AudioAttributesCompatParcelizer, cursor2, arrayList);
                }
            });
            McqIndexMini[] mcqIndexMiniArr = (McqIndexMini[]) arrayList.toArray(new McqIndexMini[0]);
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return mcqIndexMiniArr;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(isMovingLiveWindow ismovinglivewindow, Cursor cursor, List list) {
        list.add(ismovinglivewindow.RemoteActionCompatParcelizer(cursor));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public McqIndexMini a_(String... strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        return (McqIndexMini) super.a_((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private static ContentValues read(McqIndexMini mcqIndexMini) {
        toMagicModuleMetaRepoModel.write(mcqIndexMini, "");
        throw new UnsupportedOperationException("MCQIndexMiniV2Table is shortcut table. Insertion should be done through MCQTable");
    }

    private static Void AudioAttributesCompatParcelizer(McqIndexMini mcqIndexMini) {
        toMagicModuleMetaRepoModel.write(mcqIndexMini, "");
        throw new UnsupportedOperationException("MCQIndexMiniV2Table is shortcut table. Insertion should be done through MCQTable");
    }

    private static Void AudioAttributesCompatParcelizer(McqIndexMini[] mcqIndexMiniArr) {
        toMagicModuleMetaRepoModel.write(mcqIndexMiniArr, "");
        throw new UnsupportedOperationException("MCQIndexMiniV2Table is shortcut table. Insertion should be done through MCQTable");
    }

    private static McqIndexMini[] AudioAttributesCompatParcelizer() {
        return new McqIndexMini[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "mcq_id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(McqIndexMini mcqIndexMini) {
        toMagicModuleMetaRepoModel.write(mcqIndexMini, "");
        return new String[]{mcqIndexMini.getMcqId()};
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/isMovingLiveWindow$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "read", "(I)Ljava/lang/String;", "", "IconCompatParcelizer", "[Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public static String read(int p0) {
            if (-1 == p0) {
                return "bookmarked_type>0";
            }
            return "bookmarked_type=".concat(String.valueOf(p0));
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
