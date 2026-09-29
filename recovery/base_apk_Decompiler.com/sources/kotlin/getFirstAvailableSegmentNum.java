package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.pearl.PearlTopicInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/getFirstAvailableSegmentNum;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/pearl/PearlTopicInfo;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "IconCompatParcelizer", "(Landroid/database/Cursor;)Lcom/marrow/data/models/pearl/PearlTopicInfo;", "Landroid/content/ContentValues;", "(Lcom/marrow/data/models/pearl/PearlTopicInfo;)Landroid/content/ContentValues;", "", "", "write", "()[Lcom/marrow/data/models/pearl/PearlTopicInfo;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "read", "(Lcom/marrow/data/models/pearl/PearlTopicInfo;)[Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;)[Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getFirstAvailableSegmentNum extends getIntervalUntilNextManifestRefreshMs<PearlTopicInfo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFirstAvailableSegmentNum(Context context) {
        super(context, "pearl_topic_info");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(PearlTopicInfo pearlTopicInfo) {
        return read(pearlTopicInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ PearlTopicInfo RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ PearlTopicInfo[] RemoteActionCompatParcelizer(int i) {
        return write();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(PearlTopicInfo pearlTopicInfo) {
        return RemoteActionCompatParcelizer(pearlTopicInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("pearl_id", "TEXT"), setAction.write("topic_id", "TEXT"), setAction.write("root_subject_id", "TEXT"));
    }

    private static PearlTopicInfo IconCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new PearlTopicInfo(copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "pearl_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "topic_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "root_subject_id"));
    }

    private static ContentValues RemoteActionCompatParcelizer(PearlTopicInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("pearl_id", p0.getPearlId()), setAction.write("topic_id", p0.getTopicId()), setAction.write("root_subject_id", p0.getRootSubjectId()));
    }

    private static PearlTopicInfo[] write() {
        return new PearlTopicInfo[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "pearl_id =?  AND topic_id =?  AND root_subject_id =? ";
    }

    private static String[] read(PearlTopicInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.getPearlId(), p0.getTopicId(), p0.getRootSubjectId()};
    }

    public final String[] AudioAttributesImplBaseParcelizer(String p0) {
        new ArrayList();
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "%s", Arrays.copyOf(new Object[]{"topic_id"}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format(Locale.getDefault(), "%s, %s", Arrays.copyOf(new Object[]{"pearl_topic_info", "_subject"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format(Locale.getDefault(), "%s.%s = %s.%s AND %s='%s'", Arrays.copyOf(new Object[]{"pearl_topic_info", "topic_id", "_subject", "_id", "pearl_id", p0}, 6));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format(Locale.getDefault(), "Select DISTINCT(%s) from %s where %s", Arrays.copyOf(new Object[]{str, str2, str3}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        return (String[]) copyAdaptationSets.IconCompatParcelizer(super.RemoteActionCompatParcelizer(str4)).toArray(new String[0]);
    }
}
