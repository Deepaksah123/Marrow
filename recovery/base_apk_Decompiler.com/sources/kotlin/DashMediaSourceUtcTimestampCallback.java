package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.mcq.McqTimeSpent;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.onAdPlaybackStateUpdateRequested;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lo/DashMediaSourceUtcTimestampCallback;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/mcq/McqTimeSpent;", "Lo/onAdPlaybackStateUpdateRequested$IconCompatParcelizer;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "AudioAttributesCompatParcelizer", "(Landroid/database/Cursor;)Lcom/marrow/data/models/mcq/McqTimeSpent;", "Landroid/content/ContentValues;", "IconCompatParcelizer", "(Lcom/marrow/data/models/mcq/McqTimeSpent;)Landroid/content/ContentValues;", "", "", "write", "()[Lcom/marrow/data/models/mcq/McqTimeSpent;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lcom/marrow/data/models/mcq/McqTimeSpent;)[Ljava/lang/String;", "", "read", "(Lcom/marrow/data/models/mcq/McqTimeSpent;)V", "", "MediaBrowserCompatItemReceiver", "(Ljava/lang/String;)[J", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DashMediaSourceUtcTimestampCallback extends getIntervalUntilNextManifestRefreshMs<McqTimeSpent> implements onAdPlaybackStateUpdateRequested.IconCompatParcelizer {
    public static String write = LessonMcqUpdateInfo.KEY_MCQ_ID;
    public static String AudioAttributesCompatParcelizer = "_id";
    public static String IconCompatParcelizer = "parent_id";
    public static String AudioAttributesImplApi21Parcelizer = "_type";
    public static String RemoteActionCompatParcelizer = "time_spent";
    public static String MediaBrowserCompatItemReceiver = "mcq_time_spent";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashMediaSourceUtcTimestampCallback(Context context) {
        super(context, MediaBrowserCompatItemReceiver);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(McqTimeSpent mcqTimeSpent) {
        return write2(mcqTimeSpent);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ McqTimeSpent RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ McqTimeSpent[] RemoteActionCompatParcelizer(int i) {
        return write();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(McqTimeSpent mcqTimeSpent) {
        return IconCompatParcelizer2(mcqTimeSpent);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write(AudioAttributesCompatParcelizer, "TEXT PRIMARY KEY NOT NULL"), setAction.write(IconCompatParcelizer, "TEXT NOT NULL"), setAction.write(write, "TEXT NOT NULL"), setAction.write(AudioAttributesImplApi21Parcelizer, "INTEGER"), setAction.write(RemoteActionCompatParcelizer, "INTEGER"));
    }

    private static McqTimeSpent AudioAttributesCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        McqTimeSpent mcqTimeSpent = new McqTimeSpent();
        mcqTimeSpent.id = copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, AudioAttributesCompatParcelizer);
        mcqTimeSpent.parentId = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, IconCompatParcelizer);
        mcqTimeSpent.mcqId = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, write);
        mcqTimeSpent.type = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, AudioAttributesImplApi21Parcelizer);
        mcqTimeSpent.timeSpentMs = copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, RemoteActionCompatParcelizer);
        return mcqTimeSpent;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static ContentValues IconCompatParcelizer2(McqTimeSpent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write(AudioAttributesCompatParcelizer, Long.valueOf(p0.id)), setAction.write(IconCompatParcelizer, p0.parentId), setAction.write(write, p0.mcqId), setAction.write(AudioAttributesImplApi21Parcelizer, Integer.valueOf(p0.type)), setAction.write(RemoteActionCompatParcelizer, Long.valueOf(p0.timeSpentMs)));
    }

    private static McqTimeSpent[] write() {
        return new McqTimeSpent[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        String str = AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" =? ");
        return sb.toString();
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static String[] write2(McqTimeSpent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{String.valueOf(p0.id)};
    }

    public final void read(McqTimeSpent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(p0);
    }

    public final long[] MediaBrowserCompatItemReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        Locale locale = Locale.getDefault();
        String str = AudioAttributesImplApi21Parcelizer;
        String str2 = RemoteActionCompatParcelizer;
        String str3 = String.format(locale, "%s, SUM(%s) as %s", Arrays.copyOf(new Object[]{str, str2, str2}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        String str4 = IconCompatParcelizer;
        String strAudioAttributesCompatParcelizer = getIntervalUntilNextManifestRefreshMs.AudioAttributesCompatParcelizer(p0);
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(" = ");
        sb.append(strAudioAttributesCompatParcelizer);
        String string = sb.toString();
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        Locale locale2 = Locale.getDefault();
        String str5 = MediaBrowserCompatItemReceiver;
        String str6 = AudioAttributesImplApi21Parcelizer;
        String str7 = String.format(locale2, "SELECT %s FROM %s WHERE %s GROUP BY %s ORDER BY %s", Arrays.copyOf(new Object[]{str3, str5, string, str6, str6}, 5));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str7);
        if (cursorRemoteActionCompatParcelizer == null) {
            return new long[]{0, 0};
        }
        final MagicModuleUseCaseImplWhenMappings.read readVar = new MagicModuleUseCaseImplWhenMappings.read();
        final MagicModuleUseCaseImplWhenMappings.read readVar2 = new MagicModuleUseCaseImplWhenMappings.read();
        Cursor cursor = cursorRemoteActionCompatParcelizer;
        try {
            final Cursor cursor2 = cursor;
            copyAdaptationSets.RemoteActionCompatParcelizer(cursor2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.DashMediaSourceManifestLoadErrorThrower
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return DashMediaSourceUtcTimestampCallback.write(cursor2, readVar, readVar2);
                }
            });
            long[] jArr = {readVar.IconCompatParcelizer, readVar2.IconCompatParcelizer};
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return jArr;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(Cursor cursor, MagicModuleUseCaseImplWhenMappings.read readVar, MagicModuleUseCaseImplWhenMappings.read readVar2) {
        int iAudioAttributesCompatParcelizer = copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, AudioAttributesImplApi21Parcelizer);
        long jAudioAttributesImplApi21Parcelizer = copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, RemoteActionCompatParcelizer);
        if (iAudioAttributesCompatParcelizer == 0) {
            readVar.IconCompatParcelizer = jAudioAttributesImplApi21Parcelizer;
        } else {
            readVar2.IconCompatParcelizer = jAudioAttributesImplApi21Parcelizer;
        }
        return getShowPopup.INSTANCE;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read(IconCompatParcelizer, p0);
    }
}
