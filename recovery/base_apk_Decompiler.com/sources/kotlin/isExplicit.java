package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.subject.SubjectIntroSkip;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/isExplicit;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/subject/SubjectIntroSkip;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "IconCompatParcelizer", "(Landroid/database/Cursor;)Lcom/marrow/data/models/subject/SubjectIntroSkip;", "Landroid/content/ContentValues;", "(Lcom/marrow/data/models/subject/SubjectIntroSkip;)Landroid/content/ContentValues;", "", "", "AudioAttributesCompatParcelizer", "()[Lcom/marrow/data/models/subject/SubjectIntroSkip;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lcom/marrow/data/models/subject/SubjectIntroSkip;)[Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)I", "p1", "", "read", "(Ljava/lang/String;I)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isExplicit extends getIntervalUntilNextManifestRefreshMs<SubjectIntroSkip> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isExplicit(Context context) {
        super(context, "_subject_intro_skip");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(SubjectIntroSkip subjectIntroSkip) {
        return AudioAttributesCompatParcelizer(subjectIntroSkip);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ SubjectIntroSkip RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ SubjectIntroSkip[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(SubjectIntroSkip subjectIntroSkip) {
        return RemoteActionCompatParcelizer(subjectIntroSkip);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("subject_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("skipped_intro_count", "INTEGER"));
    }

    private static SubjectIntroSkip IconCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "subject_id");
        return new SubjectIntroSkip(strMediaBrowserCompatItemReceiver != null ? strMediaBrowserCompatItemReceiver : "", copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "skipped_intro_count"));
    }

    private static ContentValues RemoteActionCompatParcelizer(SubjectIntroSkip p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("subject_id", p0.getSubjectId()), setAction.write("skipped_intro_count", Integer.valueOf(p0.getSkippedCount())));
    }

    private static SubjectIntroSkip[] AudioAttributesCompatParcelizer() {
        return new SubjectIntroSkip[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "subject_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(SubjectIntroSkip p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.getSubjectId()};
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        SubjectIntroSkip subjectIntroSkipAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer("subject_id =? ", new String[]{p0});
        if (subjectIntroSkipAudioAttributesImplApi26Parcelizer != null) {
            return subjectIntroSkipAudioAttributesImplApi26Parcelizer.getSkippedCount();
        }
        return 0;
    }

    public final void read(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(new SubjectIntroSkip(p0, p1));
    }
}
