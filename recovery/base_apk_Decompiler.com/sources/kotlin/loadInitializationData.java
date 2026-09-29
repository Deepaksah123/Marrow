package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.subject.Subject;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u000e\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0018J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\u0019¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/loadInitializationData;", "Lo/r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc;", "Lo/loadFormatWithDrmInitData;", "Landroid/content/Context;", "p0", "Lo/getStreamPositionUsForContent;", "p1", "<init>", "(Landroid/content/Context;Lo/getStreamPositionUsForContent;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "AudioAttributesCompatParcelizer", "(Landroid/database/Cursor;)Lo/loadFormatWithDrmInitData;", "Landroid/content/ContentValues;", "read", "(Lo/loadFormatWithDrmInitData;)Landroid/content/ContentValues;", "", "", "()[Lo/loadFormatWithDrmInitData;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lo/loadFormatWithDrmInitData;)[Ljava/lang/String;", "", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)Ljava/util/List;", "", "write", "(Ljava/util/List;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class loadInitializationData extends r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc<loadFormatWithDrmInitData> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public loadInitializationData(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, "suggested_subject", getstreampositionusforcontent);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return AudioAttributesCompatParcelizer((loadFormatWithDrmInitData) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMapRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer();
        linkedHashMapRemoteActionCompatParcelizer.put("parent_subject_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("subject_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put(Subject.KEY_SUGGESTED_CRITERION, "TEXT");
        return linkedHashMapRemoteActionCompatParcelizer;
    }

    private static loadFormatWithDrmInitData AudioAttributesCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "parent_subject_id");
        if (strMediaBrowserCompatItemReceiver == null) {
            strMediaBrowserCompatItemReceiver = "";
        }
        String strMediaBrowserCompatItemReceiver2 = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "subject_id");
        if (strMediaBrowserCompatItemReceiver2 == null) {
            strMediaBrowserCompatItemReceiver2 = "";
        }
        String strMediaBrowserCompatItemReceiver3 = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, Subject.KEY_SUGGESTED_CRITERION);
        return new loadFormatWithDrmInitData(strMediaBrowserCompatItemReceiver, strMediaBrowserCompatItemReceiver2, strMediaBrowserCompatItemReceiver3 != null ? strMediaBrowserCompatItemReceiver3 : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public ContentValues write(loadFormatWithDrmInitData p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write(FilterParams.KEY_COURSE_ID, Integer.valueOf(write())), setAction.write("parent_subject_id", p0.RemoteActionCompatParcelizer()), setAction.write("subject_id", p0.write()), setAction.write(Subject.KEY_SUGGESTED_CRITERION, p0.read()));
    }

    private static loadFormatWithDrmInitData[] AudioAttributesCompatParcelizer() {
        return new loadFormatWithDrmInitData[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "parent_subject_id =?  AND subject_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(loadFormatWithDrmInitData p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.RemoteActionCompatParcelizer(), p0.write()};
    }

    public final List<loadFormatWithDrmInitData> MediaBrowserCompatCustomActionResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        loadFormatWithDrmInitData[] loadformatwithdrminitdataArr = read("parent_subject_id =? ", new String[]{p0}, (String) null);
        List<loadFormatWithDrmInitData> listOnCommand = loadformatwithdrminitdataArr != null ? getOrderDetails.onCommand(loadformatwithdrminitdataArr) : null;
        return listOnCommand == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listOnCommand;
    }

    public final void write(List<String> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isEmpty()) {
            return;
        }
        String str = getIntervalUntilNextManifestRefreshMs.read("parent_subject_id", (String[]) p0.toArray(new String[0]));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        RemoteActionCompatParcelizer("DELETE FROM suggested_subject WHERE ".concat(String.valueOf(str)));
    }
}
