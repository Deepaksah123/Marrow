package kotlin;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import com.marrow.TrainingApplication;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\n\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042&\u0010\u000f\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\r0\f\"\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\rH\u0007¢\u0006\u0004\b\n\u0010\u0011"}, d2 = {"Lo/DefaultTrackNameProvider;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/getStreamPositionUsForContent;", "IconCompatParcelizer", "(Landroid/content/Context;)Lo/getStreamPositionUsForContent;", "Lo/ChunkHolder;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Lo/ChunkHolder;", "", "Ljava/lang/Class;", "Landroid/app/Service;", "p1", "", "(Landroid/content/Context;[Ljava/lang/Class;)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultTrackNameProvider {
    public static final DefaultTrackNameProvider INSTANCE = new DefaultTrackNameProvider();

    private DefaultTrackNameProvider() {
    }

    @getMagicModuleMeta
    public static final getStreamPositionUsForContent IconCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getStreamPositionUsForContent getstreampositionusforcontentMediaDescriptionCompat = TrainingApplication.IconCompatParcelizer(p0).MediaDescriptionCompat();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getstreampositionusforcontentMediaDescriptionCompat, "");
        return getstreampositionusforcontentMediaDescriptionCompat;
    }

    @getMagicModuleMeta
    public static final ChunkHolder AudioAttributesCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ChunkHolder chunkHolderMediaMetadataCompat = TrainingApplication.IconCompatParcelizer(p0).MediaMetadataCompat();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(chunkHolderMediaMetadataCompat, "");
        return chunkHolderMediaMetadataCompat;
    }

    @SafeVarargs
    @getMagicModuleMeta
    public static final boolean AudioAttributesCompatParcelizer(Context p0, Class<? extends Service>... p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        ActivityManager activityManager = (ActivityManager) p0.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
            int length = p1.length;
            for (int i = 0; i <= 0; i++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p1[0].getName(), (Object) runningServiceInfo.service.getClassName()) && runningServiceInfo.started) {
                    return true;
                }
            }
        }
        return false;
    }
}
