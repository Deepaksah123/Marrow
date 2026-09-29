package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\f\u001a\u00020\u001c2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u001b¢\u0006\u0004\b\f\u0010\u001d"}, d2 = {"Lo/getSegmentNum;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lo/getSegmentCount;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "IconCompatParcelizer", "(Landroid/database/Cursor;)Lo/getSegmentCount;", "Landroid/content/ContentValues;", "write", "(Lo/getSegmentCount;)Landroid/content/ContentValues;", "", "", "()[Lo/getSegmentCount;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "read", "(Lo/getSegmentCount;)[Ljava/lang/String;", "p1", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "", "(Ljava/util/List;)V", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getSegmentNum extends getIntervalUntilNextManifestRefreshMs<getSegmentCount> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSegmentNum(Context context) {
        super(context, "_subject_image_attribution");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(getSegmentCount getsegmentcount) {
        return read(getsegmentcount);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ getSegmentCount RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ getSegmentCount[] RemoteActionCompatParcelizer(int i) {
        return write();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ ContentValues write(getSegmentCount getsegmentcount) {
        return write2(getsegmentcount);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("subject_id", "TEXT"), setAction.write("edition", "TEXT"), setAction.write("image_attribution_link", "TEXT NOT NULL"));
    }

    private static getSegmentCount IconCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new getSegmentCount(String.valueOf(copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "subject_id")), String.valueOf(copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "edition")), String.valueOf(copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "image_attribution_link")));
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static ContentValues write2(getSegmentCount p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("subject_id", p0.write()), setAction.write("edition", p0.AudioAttributesCompatParcelizer()), setAction.write("image_attribution_link", p0.RemoteActionCompatParcelizer()));
    }

    private static getSegmentCount[] write() {
        return new getSegmentCount[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "subject_id =?  AND edition =? ";
    }

    private static String[] read(getSegmentCount p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.write(), p0.AudioAttributesCompatParcelizer()};
    }

    public final String MediaBrowserCompatCustomActionResultReceiver(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        getSegmentCount getsegmentcountAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer("subject_id =?  AND edition =? ", new String[]{p0, p1});
        String strRemoteActionCompatParcelizer = getsegmentcountAudioAttributesImplApi26Parcelizer != null ? getsegmentcountAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() : null;
        return strRemoteActionCompatParcelizer == null ? "" : strRemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(List<String> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String str = getIntervalUntilNextManifestRefreshMs.read("subject_id", (String[]) p0.toArray(new String[0]));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        RemoteActionCompatParcelizer("DELETE FROM _subject_image_attribution WHERE ".concat(String.valueOf(str)));
    }
}
