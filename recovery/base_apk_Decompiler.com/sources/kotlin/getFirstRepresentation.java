package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/getFirstRepresentation;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lo/DashUtil;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "IconCompatParcelizer", "(Landroid/database/Cursor;)Lo/DashUtil;", "Landroid/content/ContentValues;", "read", "(Lo/DashUtil;)Landroid/content/ContentValues;", "", "", "AudioAttributesCompatParcelizer", "()[Lo/DashUtil;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lo/DashUtil;)[Ljava/lang/String;", "", "", "write", "(Ljava/util/List;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getFirstRepresentation extends getIntervalUntilNextManifestRefreshMs<DashUtil> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFirstRepresentation(Context context) {
        super(context, "_subject_updated_status");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(DashUtil dashUtil) {
        return RemoteActionCompatParcelizer(dashUtil);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ DashUtil RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ DashUtil[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(DashUtil dashUtil) {
        return read(dashUtil);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("subject_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("is_active", "INTEGER NOT NULL"), setAction.write("expires_on", "INTEGER NOT NULL"), setAction.write("active_edition", "INTEGER NOT NULL"));
    }

    private static DashUtil IconCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "subject_id");
        return new DashUtil(strMediaBrowserCompatItemReceiver == null ? "" : strMediaBrowserCompatItemReceiver, copyAdaptationSets.RemoteActionCompatParcelizer(p0, "is_active"), copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, "expires_on"), copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "active_edition"));
    }

    private static ContentValues read(DashUtil p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("subject_id", p0.write()), setAction.write("is_active", Integer.valueOf(getPeriodDurationMs.RemoteActionCompatParcelizer(p0.AudioAttributesCompatParcelizer()))), setAction.write("expires_on", Long.valueOf(p0.IconCompatParcelizer())), setAction.write("active_edition", Integer.valueOf(p0.RemoteActionCompatParcelizer())));
    }

    private static DashUtil[] AudioAttributesCompatParcelizer() {
        return new DashUtil[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "subject_id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(DashUtil p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.write()};
    }

    public final void write(List<String> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatItemReceiver("subject_id", (String[]) p0.toArray(new String[0]));
    }
}
