package kotlin;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.getDownload;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\t\u001a\u0006*\u00020\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00118WX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0012\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Lo/getStateQuery;", "Lo/getDownload;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "read", "Landroid/os/Bundle;", "AudioAttributesCompatParcelizer", "", "RemoteActionCompatParcelizer", "()Ljava/lang/Double;", "IconCompatParcelizer", "", "()Ljava/lang/Boolean;", "write", "Lo/getTestPattern;", "()Lo/getTestPattern;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class getStateQuery implements getDownload {
    private static final write write = new write(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Bundle AudioAttributesCompatParcelizer;

    public getStateQuery(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        Bundle bundle = Build.VERSION.SDK_INT >= 33 ? ((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L))).metaData : ((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
        this.AudioAttributesCompatParcelizer = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // kotlin.getDownload
    public final Object read(SampleVideos<? super getShowPopup> sampleVideos) {
        return getDownload.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.getDownload
    public final Boolean IconCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.AudioAttributesCompatParcelizer.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // kotlin.getDownload
    public final getTestPattern read() {
        if (this.AudioAttributesCompatParcelizer.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return getTestPattern.write(getUserSubmissionTimestamp.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getInt("firebase_sessions_sessions_restart_timeout"), isAnonymous.AudioAttributesImplApi26Parcelizer));
        }
        return null;
    }

    @Override // kotlin.getDownload
    public final Double RemoteActionCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.AudioAttributesCompatParcelizer.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getStateQuery$write;", "", "<init>", "()V"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
