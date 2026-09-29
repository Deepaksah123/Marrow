package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.paginationV2.PageValue;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\f\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/loadNtpTimeOffset;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/paginationV2/PageValue;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "write", "(Landroid/database/Cursor;)Lcom/marrow/data/models/paginationV2/PageValue;", "Landroid/content/ContentValues;", "AudioAttributesCompatParcelizer", "(Lcom/marrow/data/models/paginationV2/PageValue;)Landroid/content/ContentValues;", "", "", "()[Lcom/marrow/data/models/paginationV2/PageValue;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lcom/marrow/data/models/paginationV2/PageValue;)[Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;)Lcom/marrow/data/models/paginationV2/PageValue;", "", "p1", "", "read", "(Ljava/lang/String;Z)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class loadNtpTimeOffset extends getIntervalUntilNextManifestRefreshMs<PageValue> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public loadNtpTimeOffset(Context context) {
        super(context, "pagination_table");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(PageValue pageValue) {
        return RemoteActionCompatParcelizer(pageValue);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ PageValue RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ PageValue[] RemoteActionCompatParcelizer(int i) {
        return write();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(PageValue pageValue) {
        return AudioAttributesCompatParcelizer(pageValue);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    protected final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("id", "TEXT"), setAction.write("next_url", "TEXT"));
    }

    private static PageValue write(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new PageValue(copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "next_url"));
    }

    private static ContentValues AudioAttributesCompatParcelizer(PageValue p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("id", p0.getId()), setAction.write("next_url", p0.getNextUrl()));
    }

    private static PageValue[] write() {
        return new PageValue[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(PageValue p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.getId()};
    }

    public final PageValue AudioAttributesImplBaseParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesImplApi26Parcelizer("id =? ", new String[]{p0});
    }

    public final void read(String p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1) {
            StringBuilder sb = new StringBuilder("DELETE FROM pagination_table WHERE id = '");
            sb.append(p0);
            sb.append("'");
            RemoteActionCompatParcelizer(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("DELETE FROM pagination_table WHERE id LIKE '%");
        sb2.append(p0);
        sb2.append("%'");
        RemoteActionCompatParcelizer(sb2.toString());
    }
}
