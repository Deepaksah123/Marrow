package kotlin;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b(\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010!R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010!R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010!R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b)\u0010!R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b\"\u0010!R\u001a\u00103\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010/\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u0010\u001fR\u001a\u0010-\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b.\u0010\u001fR\u001a\u00108\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u001fR\u001a\u00105\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\b*\u0010\u001fR\u001a\u00107\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b-\u0010\u001fR\u001a\u0010*\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u00104\u001a\u0004\b8\u0010\u001fR\u001a\u0010(\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\b,\u0010\u001fR\u001a\u0010+\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\b%\u0010:R\u001a\u00101\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010;\u001a\u0004\b3\u0010<R\u001a\u00106\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b6\u00102R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010#\u001a\u0004\b&\u0010!R\u001a\u0010&\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b/\u0010\u001f"}, d2 = {"Lo/startLoadingManifest;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "", "p6", "", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "", "p14", "", "p15", "p16", "p17", "p18", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIIIIIIJFZLjava/lang/String;I)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "read", "IconCompatParcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "MediaBrowserCompatSearchResultReceiver", "RemoteActionCompatParcelizer", "RatingCompat", "MediaBrowserCompatMediaItem", "write", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "Z", "onCustomAction", "()Z", "MediaBrowserCompatItemReceiver", "I", "MediaDescriptionCompat", "onCommand", "MediaMetadataCompat", "AudioAttributesImplApi26Parcelizer", "J", "()J", "F", "()F", "onAddQueueItem"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class startLoadingManifest {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean onCommand;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final int MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final float onCustomAction;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final String handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String MediaBrowserCompatCustomActionResultReceiver;

    public startLoadingManifest(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f, boolean z2, String str7, int i8) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.write = str4;
        this.AudioAttributesCompatParcelizer = str5;
        this.MediaBrowserCompatCustomActionResultReceiver = str6;
        this.MediaBrowserCompatItemReceiver = z;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.AudioAttributesImplApi26Parcelizer = i3;
        this.MediaDescriptionCompat = i4;
        this.MediaMetadataCompat = i5;
        this.RatingCompat = i6;
        this.MediaBrowserCompatSearchResultReceiver = i7;
        this.MediaBrowserCompatMediaItem = j;
        this.onCustomAction = f;
        this.onCommand = z2;
        this.handleMediaPlayPauseIfPendingOnHandler = str7;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i8;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final int getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final float getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final boolean getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final String getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: o.startLoadingManifest$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/startLoadingManifest$read;", "", "<init>", "()V", "", "p0", "read", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/database/Cursor;", "", "Lo/startLoadingManifest;", "write", "(Landroid/database/Cursor;)Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static String read(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            StringBuilder sb = new StringBuilder("SELECT \nlesson._id, lesson.title, lesson.subject_id, lesson.root_subject_id, lesson.lesson_read_time, lesson.image_url, lesson.is_paid, lesson._status, lesson.possible_score, lesson.score, lesson.rating_count, lesson.ppl_rated, lesson.mcq_count, lesson.boolean_flags, lesson.completion_time_ms, lesson.percentile, lesson.is_opt, _subject.title AS subject_title,\n       COALESCE((\n         SELECT COUNT(*)\n          FROM  mcq_answer           WHERE  mcq_answer.parent_id             =  _step._id       ), 0) AS mcq_answer_count\n FROM  lesson  LEFT JOIN  _subject ON    lesson.subject_id  =  _subject._id LEFT JOIN  _step ON    lesson._id  =  _step.lesson_id  WHERE  root_subject_id  =  '");
            sb.append(p0);
            sb.append("'  AND  (boolean_flags & 2)  !=  2  ORDER BY  _subject.sort_order, _subject._id,  lesson.lesson_number");
            return sb.toString();
        }

        @getMagicModuleMeta
        public static List<startLoadingManifest> write(Cursor p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            ArrayList arrayList = new ArrayList();
            while (p0.moveToNext()) {
                try {
                    String string = p0.getString(p0.getColumnIndex("_id"));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "getString(...)");
                    String string2 = p0.getString(p0.getColumnIndex("title"));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "getString(...)");
                    String string3 = p0.getString(p0.getColumnIndex("subject_id"));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "getString(...)");
                    String string4 = p0.getString(p0.getColumnIndex("root_subject_id"));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "getString(...)");
                    String string5 = p0.getString(p0.getColumnIndex("lesson_read_time"));
                    String string6 = p0.getString(p0.getColumnIndex("image_url"));
                    boolean z = p0.getInt(p0.getColumnIndex("is_paid")) == 1;
                    int i = p0.getInt(p0.getColumnIndex("_status"));
                    int i2 = p0.getInt(p0.getColumnIndex("possible_score"));
                    int i3 = p0.getInt(p0.getColumnIndex("score"));
                    int i4 = p0.getInt(p0.getColumnIndex("rating_count"));
                    int i5 = p0.getInt(p0.getColumnIndex("ppl_rated"));
                    int i6 = p0.getInt(p0.getColumnIndex("mcq_count"));
                    int i7 = p0.getInt(p0.getColumnIndex("boolean_flags"));
                    long j = p0.getLong(p0.getColumnIndex("completion_time_ms"));
                    float f = p0.getFloat(p0.getColumnIndex("percentile"));
                    boolean z2 = p0.getInt(p0.getColumnIndex("is_opt")) == 1;
                    String string7 = p0.getString(p0.getColumnIndex("subject_title"));
                    arrayList.add(new startLoadingManifest(string, string2, string3, string4, string5, string6, z, i, i2, i3, i4, i5, i6, i7, j, f, z2, string7 == null ? "" : string7, p0.getInt(p0.getColumnIndex("mcq_answer_count"))));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            p0.close();
            return arrayList;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final List<startLoadingManifest> IconCompatParcelizer(Cursor cursor) {
        return Companion.write(cursor);
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(String str) {
        return Companion.read(str);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof startLoadingManifest)) {
            return false;
        }
        startLoadingManifest startloadingmanifest = (startLoadingManifest) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) startloadingmanifest.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) startloadingmanifest.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) startloadingmanifest.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) startloadingmanifest.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) startloadingmanifest.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) startloadingmanifest.MediaBrowserCompatCustomActionResultReceiver) && this.MediaBrowserCompatItemReceiver == startloadingmanifest.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi21Parcelizer == startloadingmanifest.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplBaseParcelizer == startloadingmanifest.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi26Parcelizer == startloadingmanifest.AudioAttributesImplApi26Parcelizer && this.MediaDescriptionCompat == startloadingmanifest.MediaDescriptionCompat && this.MediaMetadataCompat == startloadingmanifest.MediaMetadataCompat && this.RatingCompat == startloadingmanifest.RatingCompat && this.MediaBrowserCompatSearchResultReceiver == startloadingmanifest.MediaBrowserCompatSearchResultReceiver && this.MediaBrowserCompatMediaItem == startloadingmanifest.MediaBrowserCompatMediaItem && Float.compare(this.onCustomAction, startloadingmanifest.onCustomAction) == 0 && this.onCommand == startloadingmanifest.onCommand && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.handleMediaPlayPauseIfPendingOnHandler, (Object) startloadingmanifest.handleMediaPlayPauseIfPendingOnHandler) && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == startloadingmanifest.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode4 = this.write.hashCode();
        String str = this.AudioAttributesCompatParcelizer;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.MediaBrowserCompatCustomActionResultReceiver;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Integer.hashCode(this.MediaDescriptionCompat)) * 31) + Integer.hashCode(this.MediaMetadataCompat)) * 31) + Integer.hashCode(this.RatingCompat)) * 31) + Integer.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + Long.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + Float.hashCode(this.onCustomAction)) * 31) + Boolean.hashCode(this.onCommand)) * 31) + this.handleMediaPlayPauseIfPendingOnHandler.hashCode()) * 31) + Integer.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.read;
        String str3 = this.RemoteActionCompatParcelizer;
        String str4 = this.write;
        String str5 = this.AudioAttributesCompatParcelizer;
        String str6 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = this.MediaBrowserCompatItemReceiver;
        int i = this.AudioAttributesImplApi21Parcelizer;
        int i2 = this.AudioAttributesImplBaseParcelizer;
        int i3 = this.AudioAttributesImplApi26Parcelizer;
        int i4 = this.MediaDescriptionCompat;
        int i5 = this.MediaMetadataCompat;
        int i6 = this.RatingCompat;
        int i7 = this.MediaBrowserCompatSearchResultReceiver;
        long j = this.MediaBrowserCompatMediaItem;
        float f = this.onCustomAction;
        boolean z2 = this.onCommand;
        String str7 = this.handleMediaPlayPauseIfPendingOnHandler;
        int i8 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        StringBuilder sb = new StringBuilder("startLoadingManifest(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str3);
        sb.append(", write=");
        sb.append(str4);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str5);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str6);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(z);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i2);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(i3);
        sb.append(", MediaDescriptionCompat=");
        sb.append(i4);
        sb.append(", MediaMetadataCompat=");
        sb.append(i5);
        sb.append(", RatingCompat=");
        sb.append(i6);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(i7);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(j);
        sb.append(", onCustomAction=");
        sb.append(f);
        sb.append(", onCommand=");
        sb.append(z2);
        sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
        sb.append(str7);
        sb.append(", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver=");
        sb.append(i8);
        sb.append(")");
        return sb.toString();
    }
}
