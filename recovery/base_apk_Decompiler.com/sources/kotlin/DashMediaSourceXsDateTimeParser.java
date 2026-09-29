package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.pearl.PearlSubjectInfo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/DashMediaSourceXsDateTimeParser;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/pearl/PearlSubjectInfo;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "IconCompatParcelizer", "(Landroid/database/Cursor;)Lcom/marrow/data/models/pearl/PearlSubjectInfo;", "Landroid/content/ContentValues;", "read", "(Lcom/marrow/data/models/pearl/PearlSubjectInfo;)Landroid/content/ContentValues;", "", "", "write", "()[Lcom/marrow/data/models/pearl/PearlSubjectInfo;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lcom/marrow/data/models/pearl/PearlSubjectInfo;)[Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)[Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DashMediaSourceXsDateTimeParser extends getIntervalUntilNextManifestRefreshMs<PearlSubjectInfo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashMediaSourceXsDateTimeParser(Context context) {
        super(context, "pearl_subject_info");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(PearlSubjectInfo pearlSubjectInfo) {
        return RemoteActionCompatParcelizer(pearlSubjectInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ PearlSubjectInfo RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ PearlSubjectInfo[] RemoteActionCompatParcelizer(int i) {
        return write();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(PearlSubjectInfo pearlSubjectInfo) {
        return read(pearlSubjectInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("pearl_id", "TEXT"), setAction.write("subject_id", "TEXT"));
    }

    private static PearlSubjectInfo IconCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new PearlSubjectInfo(copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "pearl_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "subject_id"));
    }

    private static ContentValues read(PearlSubjectInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("pearl_id", p0.getPearlId()), setAction.write("subject_id", p0.getSubjectId()));
    }

    private static PearlSubjectInfo[] write() {
        return new PearlSubjectInfo[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "pearl_id =?  AND subject_id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(PearlSubjectInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.getPearlId(), p0.getSubjectId()};
    }

    public final String[] MediaBrowserCompatCustomActionResultReceiver(String p0) {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "%s", Arrays.copyOf(new Object[]{"subject_id"}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format(Locale.getDefault(), "%s, %s", Arrays.copyOf(new Object[]{"pearl_subject_info", "_subject"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format(Locale.getDefault(), "%s.%s = %s.%s AND %s='%s'", Arrays.copyOf(new Object[]{"pearl_subject_info", "subject_id", "_subject", "_id", "pearl_id", p0}, 6));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format(Locale.getDefault(), "Select DISTINCT(%s) from %s where %s", Arrays.copyOf(new Object[]{str, str2, str3}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        return (String[]) copyAdaptationSets.IconCompatParcelizer(super.RemoteActionCompatParcelizer(str4)).toArray(new String[0]);
    }
}
