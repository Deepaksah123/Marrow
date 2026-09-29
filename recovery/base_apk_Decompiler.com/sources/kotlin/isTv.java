package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.marrow.data.models.lesson.LessonIndex;
import kotlin.CacheListener;
import kotlin.isTrafficRestricted;

/* JADX INFO: loaded from: classes3.dex */
public final class isTv {
    public static final registerEvent RemoteActionCompatParcelizer(isTrafficRestricted.read readVar) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        int iconCompatParcelizer = readVar.getIconCompatParcelizer();
        String str = readVar.getIconCompatParcelizer() > 1 ? CmcdHeadersFactory.STREAMING_FORMAT_SS : "";
        StringBuilder sb = new StringBuilder();
        sb.append(iconCompatParcelizer);
        sb.append(" module");
        sb.append(str);
        return new registerEvent(readVar.getRemoteActionCompatParcelizer(), readVar.getAudioAttributesCompatParcelizer(), sb.toString());
    }

    private static final boolean IconCompatParcelizer(CacheListener cacheListener) {
        return !TestGroupLSModel.IconCompatParcelizer((CharSequence) cacheListener.getOnPlayFromMediaId());
    }

    private static final boolean AudioAttributesCompatParcelizer(CacheListener cacheListener) {
        if (cacheListener.getOnPause()) {
            return cacheListener.getOnPlay() == 0 || cacheListener.getOnPlay() > System.currentTimeMillis();
        }
        return false;
    }

    private static final boolean write(CacheListener cacheListener) {
        return IconCompatParcelizer(cacheListener) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) cacheListener.getOnPlayFromMediaId(), (Object) LessonIndex.TAG_TYPE_TIMELINE_UPDATE) && AudioAttributesCompatParcelizer(cacheListener) && !TestGroupLSModel.IconCompatParcelizer((CharSequence) cacheListener.getOnMediaButtonEvent());
    }

    private static final boolean read(CacheListener cacheListener) {
        if (cacheListener.getMediaBrowserCompatCustomActionResultReceiver() == 2) {
            return false;
        }
        return IconCompatParcelizer(cacheListener) ? toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) cacheListener.getOnPlayFromMediaId(), (Object) LessonIndex.TAG_TYPE_NEW) && AudioAttributesCompatParcelizer(cacheListener) : cacheListener.getOnAddQueueItem() && cacheListener.getOnCustomAction() > System.currentTimeMillis();
    }

    public static final isTrafficRestricted.AudioAttributesImplApi26Parcelizer read(CacheListener cacheListener, String str, boolean z) {
        toMagicModuleMetaRepoModel.write(cacheListener, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String write = cacheListener.getWrite();
        String ratingCompat = cacheListener.getRatingCompat();
        int mediaBrowserCompatCustomActionResultReceiver = cacheListener.getMediaBrowserCompatCustomActionResultReceiver();
        boolean audioAttributesImplApi26Parcelizer = cacheListener.getAudioAttributesImplApi26Parcelizer();
        String iconCompatParcelizer = cacheListener.getIconCompatParcelizer();
        boolean audioAttributesImplApi26Parcelizer2 = cacheListener.getAudioAttributesImplApi26Parcelizer();
        float fIconCompatParcelizer = cacheListener.IconCompatParcelizer();
        boolean z2 = (cacheListener.getMediaDescriptionCompat() & 1) == 1;
        String audioAttributesCompatParcelizer = cacheListener.getAudioAttributesCompatParcelizer();
        String read = cacheListener.getRead();
        boolean z3 = cacheListener.getHandleMediaPlayPauseIfPendingOnHandler() > 0 && z;
        String write2 = cacheListener.getWrite();
        boolean z4 = read(cacheListener);
        boolean zWrite = write(cacheListener);
        String onMediaButtonEvent = cacheListener.getOnMediaButtonEvent();
        CacheListener.read onPrepare = cacheListener.getOnPrepare();
        return new isTrafficRestricted.AudioAttributesImplApi26Parcelizer(write, str, ratingCompat, 2, -1, mediaBrowserCompatCustomActionResultReceiver, true ^ audioAttributesImplApi26Parcelizer, read, audioAttributesImplApi26Parcelizer2, iconCompatParcelizer, fIconCompatParcelizer, z2, audioAttributesCompatParcelizer, z3, false, 0, 0, "", 0, write2, z4, zWrite, onMediaButtonEvent, onPrepare != null ? new isTrafficRestricted.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(onPrepare.RemoteActionCompatParcelizer()) : null);
    }
}
