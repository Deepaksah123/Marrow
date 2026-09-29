package kotlin;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import java.io.Closeable;
import java.util.List;
import kotlin.ShapeKt;
import kotlin.lambdasetRepeatMode3;
import kotlin.setLooper;
import kotlin.toDownloadInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class sendRendererMessage {
    private static final ShapeKt write = new ShapeKt.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[ExoPlayerBuilderExternalSyntheticLambda15.valuesCustom().length];
            iArr[ExoPlayerBuilderExternalSyntheticLambda15.MEMORY_CACHE.ordinal()] = 1;
            iArr[ExoPlayerBuilderExternalSyntheticLambda15.MEMORY.ordinal()] = 2;
            iArr[ExoPlayerBuilderExternalSyntheticLambda15.DISK.ordinal()] = 3;
            iArr[ExoPlayerBuilderExternalSyntheticLambda15.NETWORK.ordinal()] = 4;
            AudioAttributesCompatParcelizer = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            IconCompatParcelizer = iArr2;
        }
    }

    public static final createMessageInternal RemoteActionCompatParcelizer(View view) {
        createMessageInternal createmessageinternal;
        toMagicModuleMetaRepoModel.write(view, "");
        Object tag = view.getTag(setLooper.IconCompatParcelizer.coil_request_manager);
        createMessageInternal createmessageinternal2 = tag instanceof createMessageInternal ? (createMessageInternal) tag : null;
        if (createmessageinternal2 != null) {
            return createmessageinternal2;
        }
        synchronized (view) {
            Object tag2 = view.getTag(setLooper.IconCompatParcelizer.coil_request_manager);
            createmessageinternal = tag2 instanceof createMessageInternal ? (createMessageInternal) tag2 : null;
            if (createmessageinternal == null) {
                createmessageinternal = new createMessageInternal();
                view.addOnAttachStateChangeListener(createmessageinternal);
                view.setTag(setLooper.IconCompatParcelizer.coil_request_manager, createmessageinternal);
            }
        }
        return createmessageinternal;
    }

    public static final String read(ExoPlayerBuilderExternalSyntheticLambda15 exoPlayerBuilderExternalSyntheticLambda15) {
        toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda15, "");
        int i = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[exoPlayerBuilderExternalSyntheticLambda15.ordinal()];
        if (i == 1 || i == 2) {
            return "🧠";
        }
        if (i == 3) {
            return "💾";
        }
        if (i == 4) {
            return "☁️ ";
        }
        throw new RenewEligibleCreator();
    }

    public static final int write(Drawable drawable) {
        Bitmap bitmap;
        toMagicModuleMetaRepoModel.write(drawable, "");
        Integer numValueOf = null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            numValueOf = Integer.valueOf(bitmap.getWidth());
        }
        return numValueOf == null ? drawable.getIntrinsicWidth() : numValueOf.intValue();
    }

    public static final int IconCompatParcelizer(Drawable drawable) {
        Bitmap bitmap;
        toMagicModuleMetaRepoModel.write(drawable, "");
        Integer numValueOf = null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            numValueOf = Integer.valueOf(bitmap.getHeight());
        }
        return numValueOf == null ? drawable.getIntrinsicHeight() : numValueOf.intValue();
    }

    public static final boolean AudioAttributesCompatParcelizer(Drawable drawable) {
        toMagicModuleMetaRepoModel.write(drawable, "");
        return (drawable instanceof getActivityInfo) || (drawable instanceof VectorDrawable);
    }

    public static final void RemoteActionCompatParcelizer(Closeable closeable) {
        toMagicModuleMetaRepoModel.write(closeable, "");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final lambdaupdatePlaybackInfo16 AudioAttributesCompatParcelizer(ImageView imageView) {
        toMagicModuleMetaRepoModel.write(imageView, "");
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : AudioAttributesCompatParcelizer.IconCompatParcelizer[scaleType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return lambdaupdatePlaybackInfo16.FIT;
        }
        return lambdaupdatePlaybackInfo16.FILL;
    }

    public static final toDownloadInfo.AudioAttributesCompatParcelizer read(getCreatedOnDateMs<? extends toDownloadInfo.AudioAttributesCompatParcelizer> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        final RenewEligible renewEligibleRemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(getcreatedondatems);
        return new toDownloadInfo.AudioAttributesCompatParcelizer() { // from class: o.removeMediaItemsInternal
            @Override // o.toDownloadInfo.AudioAttributesCompatParcelizer
            public final toDownloadInfo IconCompatParcelizer(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0) {
                return sendRendererMessage.AudioAttributesCompatParcelizer(renewEligibleRemoteActionCompatParcelizer, themeKtExternalSyntheticLambda0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final toDownloadInfo AudioAttributesCompatParcelizer(RenewEligible renewEligible, ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(renewEligible, "");
        return ((toDownloadInfo.AudioAttributesCompatParcelizer) renewEligible.RemoteActionCompatParcelizer()).IconCompatParcelizer(themeKtExternalSyntheticLambda0);
    }

    public static final String write(MimeTypeMap mimeTypeMap, String str) {
        toMagicModuleMetaRepoModel.write(mimeTypeMap, "");
        String str2 = str;
        if (str2 == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str2)) {
            return null;
        }
        String str3 = TestGroupLSModel.read(str, '#', str);
        String str4 = TestGroupLSModel.read(str3, '?', str3);
        return mimeTypeMap.getMimeTypeFromExtension(TestGroupLSModel.AudioAttributesCompatParcelizer(TestGroupLSModel.AudioAttributesCompatParcelizer(str4, '/', str4), '.', ""));
    }

    public static final String write(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        List<String> pathSegments = uri.getPathSegments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pathSegments, "");
        return (String) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) pathSegments);
    }

    public static final int read(Configuration configuration) {
        toMagicModuleMetaRepoModel.write(configuration, "");
        return configuration.uiMode & 48;
    }

    public static final ShapeKt write(ShapeKt shapeKt) {
        return shapeKt == null ? write : shapeKt;
    }

    public static final lambdasetShuffleModeEnabled4 IconCompatParcelizer(lambdasetShuffleModeEnabled4 lambdasetshufflemodeenabled4) {
        return lambdasetshufflemodeenabled4 == null ? lambdasetShuffleModeEnabled4.AudioAttributesCompatParcelizer : lambdasetshufflemodeenabled4;
    }

    public static final boolean IconCompatParcelizer() {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final void AudioAttributesCompatParcelizer(addMediaSourceHolders addmediasourceholders, lambdasetRepeatMode3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(addmediasourceholders, "");
        lambdaupdatePlaybackInfo17 lambdaupdateplaybackinfo17RemoteActionCompatParcelizer = addmediasourceholders.RemoteActionCompatParcelizer();
        lambdaupdatePlaybackInfo21 lambdaupdateplaybackinfo21 = lambdaupdateplaybackinfo17RemoteActionCompatParcelizer instanceof lambdaupdatePlaybackInfo21 ? (lambdaupdatePlaybackInfo21) lambdaupdateplaybackinfo17RemoteActionCompatParcelizer : null;
        View viewIconCompatParcelizer = lambdaupdateplaybackinfo21 != null ? lambdaupdateplaybackinfo21.IconCompatParcelizer() : null;
        if (viewIconCompatParcelizer == null) {
            return;
        }
        RemoteActionCompatParcelizer(viewIconCompatParcelizer).read(audioAttributesCompatParcelizer);
    }
}
