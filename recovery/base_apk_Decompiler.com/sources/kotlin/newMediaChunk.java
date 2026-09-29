package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.video.cache.CourseDownloadCount;
import com.marrow.data.models.video.cache.VideoCacheInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\u000fJ%\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0010\"\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\f\u001a\u00020\u0013¢\u0006\u0004\b\f\u0010\u001aJ\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0004\u001a\u00020\u001b¢\u0006\u0004\b\t\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J%\u0010\u0019\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010*J-\u0010,\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010+\u001a\u00020\b¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0010H\u0016¢\u0006\u0004\b.\u0010\u0015J\u0017\u0010/\u001a\u00020$2\b\u0010\u0004\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b/\u00100J\u001b\u00101\u001a\u00020$2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b1\u00102J%\u00104\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u000203¢\u0006\u0004\b4\u00105J!\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b/\u00106J\u0019\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001c07¢\u0006\u0004\b8\u00109J\u0015\u00101\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u0013¢\u0006\u0004\b1\u0010:J\u001d\u0010;\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b¢\u0006\u0004\b;\u0010<R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b=\u0010>"}, d2 = {"Lo/newMediaChunk;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/video/cache/VideoCacheInfo;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "write", "(Landroid/database/Cursor;)Lcom/marrow/data/models/video/cache/VideoCacheInfo;", "Landroid/content/ContentValues;", "(Lcom/marrow/data/models/video/cache/VideoCacheInfo;)Landroid/content/ContentValues;", "", "MediaBrowserCompatItemReceiver", "([Ljava/lang/String;)Lcom/marrow/data/models/video/cache/VideoCacheInfo;", "", "onCustomAction", "()[Lcom/marrow/data/models/video/cache/VideoCacheInfo;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lcom/marrow/data/models/video/cache/VideoCacheInfo;)[Ljava/lang/String;", "AudioAttributesCompatParcelizer", "()I", "", "", "Lcom/marrow/data/models/video/cache/CourseDownloadCount;", "(Z)Ljava/util/List;", "MediaDescriptionCompat", "()Ljava/util/List;", "onAddQueueItem", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)Lcom/marrow/data/models/video/cache/VideoCacheInfo;", "", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()V", "", "p1", "p2", "(IJLjava/lang/String;)V", "p3", "IconCompatParcelizer", "(JJLjava/lang/String;)V", "handleMediaPlayPauseIfPendingOnHandler", "AudioAttributesImplApi26Parcelizer", "(Ljava/lang/String;)V", "read", "([Ljava/lang/String;)V", "", "AudioAttributesCompatParcelizer$36360dc2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V", "([Ljava/lang/String;)[Ljava/lang/String;", "Lo/accessgetEmptyStatecp;", "MediaMetadataCompat", "()Lo/accessgetEmptyStatecp;", "(I)V", "AudioAttributesImplApi21Parcelizer", "(Ljava/lang/String;Ljava/lang/String;)V", "onCommand", "()Lcom/marrow/data/models/video/cache/VideoCacheInfo;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class newMediaChunk extends getIntervalUntilNextManifestRefreshMs<VideoCacheInfo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public newMediaChunk(Context context) {
        super(context, "video_ci");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(VideoCacheInfo videoCacheInfo) {
        return write2(videoCacheInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoCacheInfo RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoCacheInfo[] RemoteActionCompatParcelizer(int i) {
        return onCustomAction();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(VideoCacheInfo videoCacheInfo) {
        return RemoteActionCompatParcelizer(videoCacheInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put("_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMap2.put("_dp", "REAL");
        linkedHashMap2.put("downloading_pixel_rate", "INTEGER");
        linkedHashMap2.put("_last_updated", "INTEGER");
        linkedHashMap2.put("download_start", "INTEGER");
        linkedHashMap2.put("reference_id", "TEXT");
        linkedHashMap2.put("d_status", "INTEGER");
        linkedHashMap2.put("_last_queued", "INTEGER");
        linkedHashMap2.put("e_s_t", "TEXT");
        linkedHashMap2.put("vd_type", "INTEGER");
        linkedHashMap2.put("ds_id", "TEXT");
        linkedHashMap2.put("theme_state", "INTEGER");
        linkedHashMap2.put(FilterParams.KEY_COURSE_ID, "INTEGER");
        return linkedHashMap;
    }

    private static VideoCacheInfo write(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        VideoCacheInfo videoCacheInfo = new VideoCacheInfo();
        videoCacheInfo.setId(copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "_id"));
        videoCacheInfo.setDownloadPercent((float) copyAdaptationSets.write(p0, "_dp"));
        videoCacheInfo.setLastUpdatedMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, "_last_updated"));
        videoCacheInfo.setLastQueuedTimeMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, "_last_queued"));
        videoCacheInfo.setDownloadStartedTimeMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, "download_start"));
        videoCacheInfo.setPixelRate(copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "downloading_pixel_rate"));
        videoCacheInfo.setReferenceId(copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "reference_id"));
        videoCacheInfo.setDownloadStatus(copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "d_status"));
        videoCacheInfo.setEncryptSalt(copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "e_s_t"));
        videoCacheInfo.setDownloadVersion(copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "vd_type"));
        videoCacheInfo.setDownloadSessionId(copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "ds_id"));
        videoCacheInfo.setDownloadedThemeState(copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "theme_state"));
        videoCacheInfo.setCourseId(copyAdaptationSets.AudioAttributesCompatParcelizer(p0, FilterParams.KEY_COURSE_ID));
        return videoCacheInfo;
    }

    private static ContentValues RemoteActionCompatParcelizer(VideoCacheInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ContentValues contentValuesIconCompatParcelizer = copyAdaptationSets.IconCompatParcelizer(setAction.write("_id", p0.getId()), setAction.write("_dp", Float.valueOf(p0.getDownloadPercent())), setAction.write("d_status", Integer.valueOf(p0.getDownloadStatus())), setAction.write("_last_updated", Long.valueOf(p0.getLastUpdatedMs())), setAction.write("reference_id", p0.getReferenceId()), setAction.write("_last_queued", Long.valueOf(p0.getLastQueuedTimeMs())), setAction.write("vd_type", Integer.valueOf(p0.getDownloadVersion())), setAction.write("ds_id", p0.getDownloadSessionId()), setAction.write("theme_state", Integer.valueOf(p0.getDownloadedThemeState())), setAction.write(FilterParams.KEY_COURSE_ID, Integer.valueOf(p0.getCourseId())));
        String encryptSalt = p0.getEncryptSalt();
        String str = encryptSalt;
        if (str == null || str.length() == 0) {
            contentValuesIconCompatParcelizer.put("e_s_t", encryptSalt);
        }
        if (p0.getDownloadStartedTimeMs() != 0) {
            contentValuesIconCompatParcelizer.put("download_start", Long.valueOf(p0.getDownloadStartedTimeMs()));
        }
        if (p0.getPixelRate() > 0) {
            contentValuesIconCompatParcelizer.put("downloading_pixel_rate", Integer.valueOf(p0.getPixelRate()));
        }
        return contentValuesIconCompatParcelizer;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public final VideoCacheInfo a_(String... p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (VideoCacheInfo) super.a_((String[]) Arrays.copyOf(p0, p0.length));
    }

    private static VideoCacheInfo[] onCustomAction() {
        return new VideoCacheInfo[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static String[] write2(VideoCacheInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String id = p0.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        return new String[]{id};
    }

    public final int AudioAttributesCompatParcelizer() {
        return write((String) null, (String[]) null);
    }

    public final int write() {
        return write("d_status =? ", new String[]{IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE});
    }

    public final List<CourseDownloadCount> RemoteActionCompatParcelizer(boolean p0) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (p0) {
            str = " WHERE d_status = 1";
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder("SELECT course_id, COUNT(*) FROM video_ci");
        sb.append(str);
        sb.append(" GROUP BY course_id");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb.toString());
        if (cursorRemoteActionCompatParcelizer == null) {
            return arrayList;
        }
        Cursor cursor = cursorRemoteActionCompatParcelizer;
        try {
            Cursor cursor2 = cursor;
            while (cursor2.moveToNext()) {
                arrayList.add(new CourseDownloadCount(cursor2.getInt(0), cursor2.getInt(1)));
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return arrayList;
        } finally {
        }
    }

    public final List<VideoCacheInfo> MediaDescriptionCompat() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("SELECT video_ci.*, lesson.pyt_mcq_count FROM video_ci, lesson WHERE reference_id = lesson._id ORDER BY d_status ASC, _last_queued ASC, _last_updated DESC");
        try {
            Cursor cursor = cursorRemoteActionCompatParcelizer;
            if (cursor != null && cursor.moveToFirst()) {
                do {
                    VideoCacheInfo videoCacheInfo = new VideoCacheInfo();
                    videoCacheInfo.setId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_id"));
                    videoCacheInfo.setDownloadPercent(copyAdaptationSets.read(cursor, "_dp"));
                    videoCacheInfo.setPixelRate(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "downloading_pixel_rate"));
                    videoCacheInfo.setLastUpdatedMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "_last_updated"));
                    videoCacheInfo.setDownloadStartedTimeMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "download_start"));
                    videoCacheInfo.setReferenceId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "reference_id"));
                    videoCacheInfo.setDownloadStatus(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "d_status"));
                    videoCacheInfo.setLastQueuedTimeMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "_last_queued"));
                    videoCacheInfo.setEncryptSalt(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "e_s_t"));
                    videoCacheInfo.setDownloadVersion(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "vd_type"));
                    videoCacheInfo.setPytCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "pyt_mcq_count"));
                    videoCacheInfo.setDownloadedThemeState(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "theme_state"));
                    arrayList.add(videoCacheInfo);
                } while (cursor.moveToNext());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursorRemoteActionCompatParcelizer, null);
            return arrayList;
        } finally {
        }
    }

    public final List<String> onAddQueueItem() {
        String[] strArr = read("reference_id", "d_status <> ? ", new String[]{IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE}, null);
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            toMagicModuleMetaRepoModel.write((Object) str);
            if (!TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final VideoCacheInfo MediaBrowserCompatCustomActionResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer("reference_id =? ", new String[]{p0}, "_last_updated DESC");
    }

    public final VideoCacheInfo onCommand() {
        String[] strArr = {TestIndex.ALL_INDIA_ID};
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "%s %s, %s %s, %s %s", Arrays.copyOf(new Object[]{"d_status", " ASC", "_last_queued", " ASC", "_last_updated", " DESC"}, 6));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return AudioAttributesCompatParcelizer("d_status =? ", strArr, str);
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("d_status", (Integer) (-1));
        write(contentValues, "d_status =? ", new String[]{"-2"});
    }

    public final void AudioAttributesCompatParcelizer(int p0, long p1, String p2) {
        toMagicModuleMetaRepoModel.write(p2, "");
        write(copyAdaptationSets.IconCompatParcelizer(setAction.write("d_status", Integer.valueOf(p0)), setAction.write("_last_updated", Long.valueOf(p1))), "_id =? ", new String[]{p2});
    }

    public final void IconCompatParcelizer(long j, long j2, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        write(copyAdaptationSets.IconCompatParcelizer(setAction.write("d_status", -1), setAction.write("_last_updated", Long.valueOf(j)), setAction.write("_last_queued", Long.valueOf(j2))), "_id =? ", new String[]{str});
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: merged with bridge method [inline-methods] */
    public final VideoCacheInfo[] RatingCompat() {
        return (VideoCacheInfo[]) super.RatingCompat();
    }

    public final void AudioAttributesImplApi26Parcelizer(String p0) {
        read("reference_id", p0);
    }

    public final void read(String[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(getIntervalUntilNextManifestRefreshMs.RemoteActionCompatParcelizer("reference_id", p0), p0);
    }

    public final void AudioAttributesCompatParcelizer$36360dc2(String p0, String p1, Enum p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        Pair[] pairArr = new Pair[2];
        pairArr[0] = setAction.write("e_s_t", p1);
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1617844022);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), 13514 - Process.getGidForName(""), 25 - (ViewConfiguration.getJumpTapTimeout() >> 16), -505910177, false, "RemoteActionCompatParcelizer", new Class[0]);
            }
            pairArr[1] = setAction.write("vd_type", Integer.valueOf(((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(p2, null)).intValue()));
            write(copyAdaptationSets.IconCompatParcelizer(pairArr), "_id =? ", new String[]{p0});
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final String[] AudioAttributesImplApi26Parcelizer(String[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String[] strArr = read("_id", getIntervalUntilNextManifestRefreshMs.RemoteActionCompatParcelizer("reference_id", p0), p0, null);
        if (strArr == null) {
            strArr = new String[0];
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public final accessgetEmptyStatecp<List<String>> MediaMetadataCompat() {
        accessgetEmptyStatecp<List<String>> accessgetemptystatecpWrite = write("ds_id");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpWrite, "");
        return accessgetemptystatecpWrite;
    }

    public final void read(int p0) {
        write(copyAdaptationSets.IconCompatParcelizer(setAction.write(FilterParams.KEY_COURSE_ID, Integer.valueOf(p0))), "course_id =? ", new String[]{SessionDescription.SUPPORTED_SDP_VERSION});
    }

    public final void AudioAttributesImplApi21Parcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        write(copyAdaptationSets.IconCompatParcelizer(setAction.write("ds_id", p1)), "_id =? ", new String[]{p0});
    }
}
