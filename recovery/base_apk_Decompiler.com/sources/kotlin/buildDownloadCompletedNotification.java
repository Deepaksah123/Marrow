package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.buildDownloadCompletedNotification;

/* JADX INFO: loaded from: classes.dex */
public final class buildDownloadCompletedNotification {

    /* JADX INFO: loaded from: classes3.dex */
    public interface IconCompatParcelizer {
        void read(boolean z, ImageView imageView);
    }

    public static void write(ImageView imageView, String str) {
        read(imageView, str);
    }

    private static void read(ImageView imageView, String str) {
        Context context = imageView.getContext();
        Activity activityAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context);
        if (activityAudioAttributesCompatParcelizer == null || activityAudioAttributesCompatParcelizer.isFinishing() || activityAudioAttributesCompatParcelizer.isDestroyed()) {
            return;
        }
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str) && str.toLowerCase().endsWith(".gif")) {
            read(imageView, str, null);
        } else {
            setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(context).RemoteActionCompatParcelizer(str).IconCompatParcelizer(setDrmSessionForClearTypes.IconCompatParcelizer).AudioAttributesCompatParcelizer(_isNaN.getDrawable(context, R.drawable.ic_marrow_logo_blue)).IconCompatParcelizer(_isNaN.getDrawable(context, R.drawable.ic_marrow_logo_blue)).AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(imageView);
        }
    }

    public static void IconCompatParcelizer(final ImageView imageView, String str, int i, final IconCompatParcelizer iconCompatParcelizer) {
        Context context;
        Activity activityAudioAttributesCompatParcelizer;
        if (imageView == null || (context = imageView.getContext()) == null || (activityAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context)) == null || activityAudioAttributesCompatParcelizer.isFinishing() || activityAudioAttributesCompatParcelizer.isDestroyed()) {
            return;
        }
        CharSequence contentDescription = imageView.getContentDescription();
        if (str.toLowerCase().endsWith(".gif")) {
            read(imageView, str, iconCompatParcelizer);
            return;
        }
        createWithPlaceholderTimeline<Drawable> createwithplaceholdertimelineIconCompatParcelizer = setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(context).RemoteActionCompatParcelizer(str).IconCompatParcelizer(setDrmSessionForClearTypes.IconCompatParcelizer).AudioAttributesCompatParcelizer(_isNaN.getDrawable(context, i)).IconCompatParcelizer(_isNaN.getDrawable(context, i));
        if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(imageView.getResources().getString(R.string.text_content_bg_black), String.valueOf(contentDescription))) {
            createwithplaceholdertimelineIconCompatParcelizer = createwithplaceholdertimelineIconCompatParcelizer.RemoteActionCompatParcelizer(android.R.color.black);
        }
        if (iconCompatParcelizer != null) {
            createwithplaceholdertimelineIconCompatParcelizer = createwithplaceholdertimelineIconCompatParcelizer.write(new getUpdatedMediaPeriodInfo<Drawable>() { // from class: o.buildDownloadCompletedNotification.2
                @Override // kotlin.getUpdatedMediaPeriodInfo
                public final /* synthetic */ boolean RemoteActionCompatParcelizer(Drawable drawable, Object obj, onTracksChanged ontrackschanged) {
                    return IconCompatParcelizer();
                }

                @Override // kotlin.getUpdatedMediaPeriodInfo
                public final boolean RemoteActionCompatParcelizer(setLiveMaxPlaybackSpeed setlivemaxplaybackspeed, MediaSourceInfoHolder<Drawable> mediaSourceInfoHolder) {
                    iconCompatParcelizer.read(false, imageView);
                    return false;
                }

                private boolean IconCompatParcelizer() {
                    iconCompatParcelizer.read(true, imageView);
                    return false;
                }
            });
        }
        createwithplaceholdertimelineIconCompatParcelizer.RemoteActionCompatParcelizer(imageView);
    }

    public static void RemoteActionCompatParcelizer(ImageView imageView, String str, IconCompatParcelizer iconCompatParcelizer) {
        AudioAttributesCompatParcelizer(imageView, str, R.drawable.ic_marrow_logo_blue, iconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesCompatParcelizer(final ImageView imageView, String str, int i, final IconCompatParcelizer iconCompatParcelizer) {
        Context context;
        Activity activityAudioAttributesCompatParcelizer;
        if (imageView == null || (context = imageView.getContext()) == null || (activityAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context)) == null || activityAudioAttributesCompatParcelizer.isFinishing() || activityAudioAttributesCompatParcelizer.isDestroyed()) {
            return;
        }
        CharSequence contentDescription = imageView.getContentDescription();
        createWithPlaceholderTimeline<Drawable> createwithplaceholdertimelineIconCompatParcelizer = setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(context).RemoteActionCompatParcelizer(str).AudioAttributesCompatParcelizer(_isNaN.getDrawable(context, i)).IconCompatParcelizer(_isNaN.getDrawable(context, i));
        if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(imageView.getResources().getString(R.string.text_content_bg_black), String.valueOf(contentDescription))) {
            createwithplaceholdertimelineIconCompatParcelizer = createwithplaceholdertimelineIconCompatParcelizer.RemoteActionCompatParcelizer(android.R.color.black);
        }
        createWithPlaceholderTimeline<Drawable> createwithplaceholdertimelineIconCompatParcelizer2 = createwithplaceholdertimelineIconCompatParcelizer.IconCompatParcelizer(setDrmSessionForClearTypes.IconCompatParcelizer);
        if (iconCompatParcelizer != null) {
            createwithplaceholdertimelineIconCompatParcelizer2 = createwithplaceholdertimelineIconCompatParcelizer2.write(new getUpdatedMediaPeriodInfo<Drawable>() { // from class: o.buildDownloadCompletedNotification.3
                @Override // kotlin.getUpdatedMediaPeriodInfo
                public final /* synthetic */ boolean RemoteActionCompatParcelizer(Drawable drawable, Object obj, onTracksChanged ontrackschanged) {
                    return write();
                }

                @Override // kotlin.getUpdatedMediaPeriodInfo
                public final boolean RemoteActionCompatParcelizer(setLiveMaxPlaybackSpeed setlivemaxplaybackspeed, MediaSourceInfoHolder<Drawable> mediaSourceInfoHolder) {
                    iconCompatParcelizer.read(false, imageView);
                    return false;
                }

                private boolean write() {
                    iconCompatParcelizer.read(true, imageView);
                    return false;
                }
            });
        }
        createwithplaceholdertimelineIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(imageView);
    }

    private static Activity AudioAttributesCompatParcelizer(Context context) {
        if (context instanceof maybeGetTypeVariable) {
            return (maybeGetTypeVariable) context;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return AudioAttributesCompatParcelizer(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void read(ImageView imageView, String str, IconCompatParcelizer iconCompatParcelizer) {
        RemoteActionCompatParcelizer(imageView, str, R.drawable.ic_marrow_logo_blue, iconCompatParcelizer);
    }

    public static void RemoteActionCompatParcelizer(final ImageView imageView, final String str, final int i, final IconCompatParcelizer iconCompatParcelizer) {
        Context context;
        Activity activityAudioAttributesCompatParcelizer;
        if (imageView == null || (context = imageView.getContext()) == null || (activityAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context)) == null || activityAudioAttributesCompatParcelizer.isFinishing() || activityAudioAttributesCompatParcelizer.isDestroyed()) {
            return;
        }
        CharSequence contentDescription = imageView.getContentDescription();
        createWithPlaceholderTimeline<setYear> createwithplaceholdertimelineIconCompatParcelizer = setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(context).AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(str).IconCompatParcelizer(setDrmSessionForClearTypes.IconCompatParcelizer).AudioAttributesCompatParcelizer(_isNaN.getDrawable(context, i)).IconCompatParcelizer(_isNaN.getDrawable(context, i));
        if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(imageView.getResources().getString(R.string.text_content_bg_black), String.valueOf(contentDescription))) {
            createwithplaceholdertimelineIconCompatParcelizer = createwithplaceholdertimelineIconCompatParcelizer.RemoteActionCompatParcelizer(android.R.color.black);
        }
        if (iconCompatParcelizer != null) {
            createwithplaceholdertimelineIconCompatParcelizer = createwithplaceholdertimelineIconCompatParcelizer.write(new getUpdatedMediaPeriodInfo<setYear>() { // from class: o.buildDownloadCompletedNotification.5
                @Override // kotlin.getUpdatedMediaPeriodInfo
                public final /* bridge */ /* synthetic */ boolean RemoteActionCompatParcelizer(setYear setyear, Object obj, onTracksChanged ontrackschanged) {
                    return RemoteActionCompatParcelizer();
                }

                @Override // kotlin.getUpdatedMediaPeriodInfo
                public final boolean RemoteActionCompatParcelizer(setLiveMaxPlaybackSpeed setlivemaxplaybackspeed, MediaSourceInfoHolder<setYear> mediaSourceInfoHolder) {
                    new Handler().post(new Runnable() { // from class: o.buildDownloadCompletedNotification.5.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            buildDownloadCompletedNotification.AudioAttributesCompatParcelizer(imageView, str, i, iconCompatParcelizer);
                        }
                    });
                    iconCompatParcelizer.read(false, imageView);
                    return false;
                }

                private boolean RemoteActionCompatParcelizer() {
                    iconCompatParcelizer.read(true, imageView);
                    return false;
                }
            });
        }
        createwithplaceholdertimelineIconCompatParcelizer.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(imageView);
    }

    public static void AudioAttributesCompatParcelizer(ImageView imageView, String str, IconCompatParcelizer iconCompatParcelizer) {
        write(imageView, BitmapDescriptorFactory.HUE_RED, str, iconCompatParcelizer);
    }

    private static void write(final ImageView imageView, float f, final String str, final IconCompatParcelizer iconCompatParcelizer) {
        final float f2 = BitmapDescriptorFactory.HUE_RED;
        final boolean z = false;
        final int i = R.drawable.ic_marrow_logo_blue;
        imageView.post(new Runnable(f2, imageView, str, iconCompatParcelizer, z, i) { // from class: o.buildProgressNotification
            private /* synthetic */ float AudioAttributesCompatParcelizer;
            private /* synthetic */ String IconCompatParcelizer;
            private /* synthetic */ ImageView RemoteActionCompatParcelizer;
            private /* synthetic */ buildDownloadCompletedNotification.IconCompatParcelizer write;
            private /* synthetic */ boolean read = false;
            private /* synthetic */ int AudioAttributesImplApi26Parcelizer = R.drawable.ic_marrow_logo_blue;

            @Override // java.lang.Runnable
            public final void run() {
                buildDownloadCompletedNotification.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.read, this.AudioAttributesImplApi26Parcelizer);
            }
        });
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer(float f, final ImageView imageView, String str, final IconCompatParcelizer iconCompatParcelizer, boolean z, int i) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = 0.75f;
        }
        int width = (int) (imageView.getWidth() * f);
        View view = (View) imageView.getParent();
        if (width > 0) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = width;
            imageView.setLayoutParams(layoutParams);
        }
        final ProgressBar progressBar = null;
        if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(imageView.getResources().getString(R.string.image_loading_container), view != null ? String.valueOf(view.getContentDescription()) : null)) {
            progressBar = (ProgressBar) view.findViewById(R.id.image_loading_indicator);
            if (width > 0) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = width;
                view.setLayoutParams(layoutParams2);
            }
        }
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        if (str.toLowerCase().endsWith(".gif")) {
            read(imageView, str, new IconCompatParcelizer() { // from class: o.DownloadNotificationHelperApi31
                @Override // o.buildDownloadCompletedNotification.IconCompatParcelizer
                public final void read(boolean z2, ImageView imageView2) {
                    buildDownloadCompletedNotification.RemoteActionCompatParcelizer(progressBar, iconCompatParcelizer, imageView, z2);
                }
            });
        } else if (z) {
            IconCompatParcelizer(imageView, str, i, new IconCompatParcelizer() { // from class: o.cssAllClassDescendantsSelector
                @Override // o.buildDownloadCompletedNotification.IconCompatParcelizer
                public final void read(boolean z2, ImageView imageView2) {
                    buildDownloadCompletedNotification.write(progressBar, iconCompatParcelizer, imageView, z2);
                }
            });
        } else {
            AudioAttributesCompatParcelizer(imageView, str, i, new IconCompatParcelizer() { // from class: o.HtmlUtils
                @Override // o.buildDownloadCompletedNotification.IconCompatParcelizer
                public final void read(boolean z2, ImageView imageView2) {
                    buildDownloadCompletedNotification.AudioAttributesCompatParcelizer(progressBar, iconCompatParcelizer, imageView, z2);
                }
            });
        }
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(ProgressBar progressBar, IconCompatParcelizer iconCompatParcelizer, ImageView imageView, boolean z) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read(z, imageView);
        }
    }

    static /* synthetic */ void write(ProgressBar progressBar, IconCompatParcelizer iconCompatParcelizer, ImageView imageView, boolean z) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read(z, imageView);
        }
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer(ProgressBar progressBar, IconCompatParcelizer iconCompatParcelizer, ImageView imageView, boolean z) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read(z, imageView);
        }
    }

    private static Uri write(Context context, File file) {
        try {
            return _isNegInf.AudioAttributesCompatParcelizer(context, "com.marrow.fileprovider", file);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Uri AudioAttributesCompatParcelizer(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        Context context = view.getContext();
        try {
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            StringBuilder sb = new StringBuilder("share_image_");
            sb.append(System.currentTimeMillis());
            sb.append(".png");
            File file = new File(externalFilesDir, sb.toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.close();
            return write(context, file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void read(ImageView imageView, float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = 0.75f;
        }
        int width = (int) (imageView.getWidth() * f);
        if (width > 0) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = width;
            imageView.setLayoutParams(layoutParams);
        }
    }
}
