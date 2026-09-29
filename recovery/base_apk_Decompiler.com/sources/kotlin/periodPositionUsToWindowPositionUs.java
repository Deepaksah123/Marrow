package kotlin;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class periodPositionUsToWindowPositionUs {

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[lambdaupdatePlaybackInfo13.valuesCustom().length];
            iArr[lambdaupdatePlaybackInfo13.EXACT.ordinal()] = 1;
            iArr[lambdaupdatePlaybackInfo13.INEXACT.ordinal()] = 2;
            iArr[lambdaupdatePlaybackInfo13.AUTOMATIC.ordinal()] = 3;
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static final Drawable IconCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Drawable drawable, Integer num, Drawable drawable2) {
        toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return lambdaupdatePlaybackInfo25.IconCompatParcelizer(lambdamaybenotifysurfacesizechanged27.getMediaBrowserCompatCustomActionResultReceiver(), num.intValue());
    }

    public static final <T> ExoPlayerBuilderExternalSyntheticLambda9<T> read(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, T t) {
        toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        toMagicModuleMetaRepoModel.write(t, "");
        Pair<ExoPlayerBuilderExternalSyntheticLambda9<?>, Class<?>> pairMediaBrowserCompatMediaItem = lambdamaybenotifysurfacesizechanged27.MediaBrowserCompatMediaItem();
        if (pairMediaBrowserCompatMediaItem == null) {
            return null;
        }
        ExoPlayerBuilderExternalSyntheticLambda9<T> exoPlayerBuilderExternalSyntheticLambda9 = (ExoPlayerBuilderExternalSyntheticLambda9) pairMediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
        if (pairMediaBrowserCompatMediaItem.read().isAssignableFrom(t.getClass())) {
            return exoPlayerBuilderExternalSyntheticLambda9;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) exoPlayerBuilderExternalSyntheticLambda9.getClass().getName());
        sb.append(" cannot handle data with type ");
        sb.append((Object) t.getClass().getName());
        sb.append('.');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final boolean RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
        toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        int i = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[lambdamaybenotifysurfacesizechanged27.getOnPrepareFromSearch().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i != 3) {
            throw new RenewEligibleCreator();
        }
        if ((lambdamaybenotifysurfacesizechanged27.getOnRemoveQueueItemAt() instanceof lambdaupdatePlaybackInfo21) && (((lambdaupdatePlaybackInfo21) lambdamaybenotifysurfacesizechanged27.getOnRemoveQueueItemAt()).IconCompatParcelizer() instanceof ImageView) && (lambdamaybenotifysurfacesizechanged27.getOnPrepareFromUri() instanceof lambdaupdatePlaybackInfo18) && ((lambdaupdatePlaybackInfo18) lambdamaybenotifysurfacesizechanged27.getOnPrepareFromUri()).write() == ((lambdaupdatePlaybackInfo21) lambdamaybenotifysurfacesizechanged27.getOnRemoveQueueItemAt()).IconCompatParcelizer()) {
            return true;
        }
        return lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().MediaDescriptionCompat() == null && (lambdamaybenotifysurfacesizechanged27.getOnPrepareFromUri() instanceof lambdaupdatePlaybackInfo12);
    }
}
