package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u0000 \b2\u00020\u0001:\u0002\b\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0003\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/createMediaSources;", "", "", "write", "()V", "", "AudioAttributesCompatParcelizer", "()Z", "IconCompatParcelizer"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface createMediaSources {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    public interface write {
        void AudioAttributesCompatParcelizer(boolean z);
    }

    boolean AudioAttributesCompatParcelizer();

    void write();

    /* JADX INFO: renamed from: o.createMediaSources$IconCompatParcelizer, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();

        private Companion() {
        }

        public static createMediaSources read(Context context, boolean z, write writeVar, setSurfaceTextureInternal setsurfacetextureinternal) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(writeVar, "");
            if (!z) {
                return createMaskingTimeline.INSTANCE;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) _isNaN.getSystemService(context, ConnectivityManager.class);
            if (connectivityManager == null || _isNaN.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                return createMaskingTimeline.INSTANCE;
            }
            try {
                return new getPositionInfo(connectivityManager, writeVar);
            } catch (Exception e) {
                if (setsurfacetextureinternal != null) {
                    removeMediaSourceHolders.RemoteActionCompatParcelizer(setsurfacetextureinternal, "NetworkObserver", new RuntimeException("Failed to register network observer.", e));
                }
                return createMaskingTimeline.INSTANCE;
            }
        }
    }
}
