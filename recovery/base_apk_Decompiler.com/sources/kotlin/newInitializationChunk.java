package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.marrow.data.models.video.cache.VideoOfflineDbModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\u000fJ\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0016\"\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\f\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/newInitializationChunk;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/video/cache/VideoOfflineDbModel;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "AudioAttributesCompatParcelizer", "(Landroid/database/Cursor;)Lcom/marrow/data/models/video/cache/VideoOfflineDbModel;", "Landroid/content/ContentValues;", "(Lcom/marrow/data/models/video/cache/VideoOfflineDbModel;)Landroid/content/ContentValues;", "", "p1", "write", "(Ljava/lang/String;I)Lcom/marrow/data/models/video/cache/VideoOfflineDbModel;", "MediaBrowserCompatItemReceiver", "(Ljava/lang/String;)Lcom/marrow/data/models/video/cache/VideoOfflineDbModel;", "", "read", "([Ljava/lang/String;)Lcom/marrow/data/models/video/cache/VideoOfflineDbModel;", "()[Lcom/marrow/data/models/video/cache/VideoOfflineDbModel;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lcom/marrow/data/models/video/cache/VideoOfflineDbModel;)[Ljava/lang/String;", "", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class newInitializationChunk extends getIntervalUntilNextManifestRefreshMs<VideoOfflineDbModel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public newInitializationChunk(Context context) {
        super(context, "video_lic_info");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(VideoOfflineDbModel videoOfflineDbModel) {
        return AudioAttributesCompatParcelizer(videoOfflineDbModel);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoOfflineDbModel RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoOfflineDbModel[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(VideoOfflineDbModel videoOfflineDbModel) {
        return RemoteActionCompatParcelizer(videoOfflineDbModel);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("_lenc", "TEXT"), setAction.write("_level", "INTEGER"), setAction.write("_playback_urls", "TEXT"), setAction.write("_qh", "TEXT"), setAction.write("_lvst", "TEXT"), setAction.write("_lest", "TEXT"), setAction.write("_lvbt", "TEXT"), setAction.write("_lebt", "TEXT"));
    }

    private static VideoOfflineDbModel AudioAttributesCompatParcelizer(Cursor p0) throws Throwable {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strAudioAttributesImplBaseParcelizer = copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "_id");
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "_lenc");
        int iAudioAttributesCompatParcelizer = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "_level");
        String strMediaBrowserCompatItemReceiver2 = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "_playback_urls");
        String strMediaBrowserCompatItemReceiver3 = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "_qh");
        try {
            Object[] objArr = {copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "_lvst"), copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "_lest"), copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "_lvbt"), copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "_lebt")};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-686285292);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), 11815 - (ViewConfiguration.getScrollBarSize() >> 8), 27 - Gravity.getAbsoluteGravity(0, 0), -1454253439, false, null, new Class[]{String.class, String.class, String.class, String.class});
            }
            return new VideoOfflineDbModel(strAudioAttributesImplBaseParcelizer, strMediaBrowserCompatItemReceiver, iAudioAttributesCompatParcelizer, strMediaBrowserCompatItemReceiver2, strMediaBrowserCompatItemReceiver3, ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static ContentValues RemoteActionCompatParcelizer(VideoOfflineDbModel p0) throws Throwable {
        toMagicModuleMetaRepoModel.write(p0, "");
        ContentValues contentValuesIconCompatParcelizer = copyAdaptationSets.IconCompatParcelizer(setAction.write("_id", p0.getMediaId()), setAction.write("_level", Integer.valueOf(p0.getLevel())));
        String licenseByteEncrypt = p0.getLicenseByteEncrypt();
        if (licenseByteEncrypt != null && licenseByteEncrypt.length() != 0) {
            contentValuesIconCompatParcelizer.put("_lenc", p0.getLicenseByteEncrypt());
        }
        String playbackUrlsEncrypt = p0.getPlaybackUrlsEncrypt();
        if (playbackUrlsEncrypt != null && playbackUrlsEncrypt.length() != 0) {
            contentValuesIconCompatParcelizer.put("_playback_urls", p0.getPlaybackUrlsEncrypt());
        }
        String qualityHashCipher = p0.getQualityHashCipher();
        if (qualityHashCipher != null && qualityHashCipher.length() != 0) {
            contentValuesIconCompatParcelizer.put("_qh", p0.getQualityHashCipher());
        }
        Object encryptedLicenseTimeInfo$66b8eacd = p0.getEncryptedLicenseTimeInfo$66b8eacd();
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(149133800);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Color.green(0) + 11815, 27 - ((Process.getThreadPriority(0) + 20) >> 6), 1990876541, false, "IconCompatParcelizer", new Class[0]);
            }
            contentValuesIconCompatParcelizer.put("_lvst", (String) ((Method) objRemoteActionCompatParcelizer).invoke(encryptedLicenseTimeInfo$66b8eacd, null));
            Object encryptedLicenseTimeInfo$66b8eacd2 = p0.getEncryptedLicenseTimeInfo$66b8eacd();
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1854474755);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 11815, (ViewConfiguration.getFadingEdgeLength() >> 16) + 27, -281071256, false, "write", new Class[0]);
            }
            contentValuesIconCompatParcelizer.put("_lest", (String) ((Method) objRemoteActionCompatParcelizer2).invoke(encryptedLicenseTimeInfo$66b8eacd2, null));
            Object encryptedLicenseTimeInfo$66b8eacd3 = p0.getEncryptedLicenseTimeInfo$66b8eacd();
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1170246012);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), 11815 - TextUtils.indexOf("", "", 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27, 998854121, false, "read", new Class[0]);
            }
            contentValuesIconCompatParcelizer.put("_lvbt", (String) ((Method) objRemoteActionCompatParcelizer3).invoke(encryptedLicenseTimeInfo$66b8eacd3, null));
            Object encryptedLicenseTimeInfo$66b8eacd4 = p0.getEncryptedLicenseTimeInfo$66b8eacd();
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(92787572);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) View.MeasureSpec.getMode(0), 11815 - TextUtils.indexOf("", "", 0, 0), 26 - TextUtils.lastIndexOf("", '0', 0), 2077104097, false, "AudioAttributesCompatParcelizer", new Class[0]);
            }
            contentValuesIconCompatParcelizer.put("_lebt", (String) ((Method) objRemoteActionCompatParcelizer4).invoke(encryptedLicenseTimeInfo$66b8eacd4, null));
            return contentValuesIconCompatParcelizer;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final VideoOfflineDbModel write(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesImplApi26Parcelizer("_id =?  AND _level =? ", new String[]{p0, String.valueOf(p1)});
    }

    public final VideoOfflineDbModel MediaBrowserCompatItemReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesImplApi26Parcelizer("_id =? ", new String[]{p0});
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public VideoOfflineDbModel a_(String... p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (VideoOfflineDbModel) super.a_((String[]) Arrays.copyOf(p0, p0.length));
    }

    private static VideoOfflineDbModel[] AudioAttributesCompatParcelizer() {
        return new VideoOfflineDbModel[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(VideoOfflineDbModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.getMediaId()};
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        RemoteActionCompatParcelizer(copyAdaptationSets.IconCompatParcelizer(setAction.write("_lenc", null)), "_id", p0);
    }
}
