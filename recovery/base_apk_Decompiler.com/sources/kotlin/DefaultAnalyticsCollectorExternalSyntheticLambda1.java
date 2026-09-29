package kotlin;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAnalyticsCollectorExternalSyntheticLambda1 {
    private static final String AudioAttributesCompatParcelizer = "com.facebook.appevents.codeless.ViewIndexer";
    private WeakReference<Activity> IconCompatParcelizer;
    private Timer RemoteActionCompatParcelizer;
    private String write = null;
    private final Handler read = new Handler(Looper.getMainLooper());

    static /* synthetic */ Handler AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1 defaultAnalyticsCollectorExternalSyntheticLambda1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda1.read;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda1.class);
            return null;
        }
    }

    static /* synthetic */ String IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.class)) {
            return null;
        }
        try {
            return AudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda1.class);
            return null;
        }
    }

    static /* synthetic */ String IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1 defaultAnalyticsCollectorExternalSyntheticLambda1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.class)) {
            return null;
        }
        try {
            defaultAnalyticsCollectorExternalSyntheticLambda1.write = null;
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda1.class);
            return null;
        }
    }

    static /* synthetic */ Timer RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1 defaultAnalyticsCollectorExternalSyntheticLambda1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda1.RemoteActionCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda1.class);
            return null;
        }
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1 defaultAnalyticsCollectorExternalSyntheticLambda1, String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.class)) {
            return;
        }
        try {
            defaultAnalyticsCollectorExternalSyntheticLambda1.write(str);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda1.class);
        }
    }

    static /* synthetic */ String read(DefaultAnalyticsCollectorExternalSyntheticLambda1 defaultAnalyticsCollectorExternalSyntheticLambda1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda1.write;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda1.class);
            return null;
        }
    }

    static /* synthetic */ Timer read(DefaultAnalyticsCollectorExternalSyntheticLambda1 defaultAnalyticsCollectorExternalSyntheticLambda1, Timer timer) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.class)) {
            return null;
        }
        try {
            defaultAnalyticsCollectorExternalSyntheticLambda1.RemoteActionCompatParcelizer = timer;
            return timer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda1.class);
            return null;
        }
    }

    static /* synthetic */ WeakReference write(DefaultAnalyticsCollectorExternalSyntheticLambda1 defaultAnalyticsCollectorExternalSyntheticLambda1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda1.IconCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda1.class);
            return null;
        }
    }

    public DefaultAnalyticsCollectorExternalSyntheticLambda1(Activity activity) {
        this.IconCompatParcelizer = new WeakReference<>(activity);
    }

    public final void write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            final TimerTask timerTask = new TimerTask() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda1.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        Activity activity = (Activity) DefaultAnalyticsCollectorExternalSyntheticLambda1.write(DefaultAnalyticsCollectorExternalSyntheticLambda1.this).get();
                        View view = DefaultAnalyticsCollectorExternalSyntheticLambda29.read(activity);
                        if (activity == null || view == null) {
                            return;
                        }
                        String simpleName = activity.getClass().getSimpleName();
                        if (DefaultAnalyticsCollectorExternalSyntheticLambda13.AudioAttributesImplBaseParcelizer()) {
                            DefaultAnalyticsCollectorExternalSyntheticLambda66.RemoteActionCompatParcelizer();
                            FutureTask futureTask = new FutureTask(new RemoteActionCompatParcelizer(view));
                            DefaultAnalyticsCollectorExternalSyntheticLambda1.AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.this).post(futureTask);
                            try {
                                str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                            } catch (Exception unused) {
                                DefaultAnalyticsCollectorExternalSyntheticLambda1.IconCompatParcelizer();
                                str = "";
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("screenname", simpleName);
                                jSONObject.put("screenshot", str);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(DefaultAnalyticsCollectorExternalSyntheticLambda17.AudioAttributesCompatParcelizer(view));
                                jSONObject.put("view", jSONArray);
                            } catch (JSONException unused2) {
                                DefaultAnalyticsCollectorExternalSyntheticLambda1.IconCompatParcelizer();
                            }
                            DefaultAnalyticsCollectorExternalSyntheticLambda1.RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.this, jSONObject.toString());
                        }
                    } catch (Exception unused3) {
                        DefaultAnalyticsCollectorExternalSyntheticLambda1.IconCompatParcelizer();
                    }
                }
            };
            try {
                lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                return;
                            }
                            try {
                                if (DefaultAnalyticsCollectorExternalSyntheticLambda1.RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.this) != null) {
                                    DefaultAnalyticsCollectorExternalSyntheticLambda1.RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.this).cancel();
                                }
                                DefaultAnalyticsCollectorExternalSyntheticLambda1.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.this);
                                DefaultAnalyticsCollectorExternalSyntheticLambda1.read(DefaultAnalyticsCollectorExternalSyntheticLambda1.this, new Timer());
                                DefaultAnalyticsCollectorExternalSyntheticLambda1.RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.this).scheduleAtFixedRate(timerTask, 0L, 1000L);
                            } catch (Exception unused) {
                                DefaultAnalyticsCollectorExternalSyntheticLambda1.IconCompatParcelizer();
                            }
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    public final void read() {
        Timer timer;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (this.IconCompatParcelizer.get() == null || (timer = this.RemoteActionCompatParcelizer) == null) {
                return;
            }
            try {
                timer.cancel();
                this.RemoteActionCompatParcelizer = null;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private void write(final String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda1.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        String strWrite = DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(str);
                        AccessToken accessTokenAudioAttributesCompatParcelizer = AccessToken.AudioAttributesCompatParcelizer();
                        if (strWrite == null || !strWrite.equals(DefaultAnalyticsCollectorExternalSyntheticLambda1.read(DefaultAnalyticsCollectorExternalSyntheticLambda1.this))) {
                            DefaultAnalyticsCollectorExternalSyntheticLambda1.this.write(DefaultAnalyticsCollectorExternalSyntheticLambda1.AudioAttributesCompatParcelizer(str, accessTokenAudioAttributesCompatParcelizer, lambdaonMediaMetadataChanged48.write(), "app_indexing"), strWrite);
                        }
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    final void write(GraphRequest graphRequest, String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this) || graphRequest == null) {
            return;
        }
        try {
            lambdaonPlayerError41 lambdaonplayererror41MediaBrowserCompatCustomActionResultReceiver = graphRequest.MediaBrowserCompatCustomActionResultReceiver();
            try {
                JSONObject read = lambdaonplayererror41MediaBrowserCompatCustomActionResultReceiver.getRead();
                if (read != null) {
                    if ("true".equals(read.optString("success"))) {
                        DefaultAnalyticsCollectorExternalSyntheticLambda68.IconCompatParcelizer(lambdaonPositionDiscontinuity43.APP_EVENTS, AudioAttributesCompatParcelizer, "Successfully send UI component tree to server");
                        this.write = str;
                    }
                    if (read.has("is_app_indexing_enabled")) {
                        DefaultAnalyticsCollectorExternalSyntheticLambda13.IconCompatParcelizer(Boolean.valueOf(read.getBoolean("is_app_indexing_enabled")));
                        return;
                    }
                    return;
                }
                Objects.toString(lambdaonplayererror41MediaBrowserCompatCustomActionResultReceiver.getWrite());
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    public static GraphRequest AudioAttributesCompatParcelizer(String str, AccessToken accessToken, String str2, String str3) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda1.class) || str == null) {
            return null;
        }
        try {
            GraphRequest graphRequestIconCompatParcelizer = GraphRequest.IconCompatParcelizer(accessToken, String.format(Locale.US, "%s/app_indexing", str2), null, null);
            Bundle mediaBrowserCompatMediaItem = graphRequestIconCompatParcelizer.getMediaBrowserCompatMediaItem();
            if (mediaBrowserCompatMediaItem == null) {
                mediaBrowserCompatMediaItem = new Bundle();
            }
            mediaBrowserCompatMediaItem.putString("tree", str);
            mediaBrowserCompatMediaItem.putString("app_version", DefaultAnalyticsCollectorExternalSyntheticLambda29.write());
            mediaBrowserCompatMediaItem.putString("platform", LogSubCategory.LifeCycle.ANDROID);
            mediaBrowserCompatMediaItem.putString("request_type", str3);
            if (str3.equals("app_indexing")) {
                mediaBrowserCompatMediaItem.putString("device_session_id", DefaultAnalyticsCollectorExternalSyntheticLambda13.AudioAttributesImplApi21Parcelizer());
            }
            graphRequestIconCompatParcelizer.read(mediaBrowserCompatMediaItem);
            graphRequestIconCompatParcelizer.RemoteActionCompatParcelizer(new GraphRequest.write() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda1.4
                @Override // com.facebook.GraphRequest.write
                public final void IconCompatParcelizer(lambdaonPlayerError41 lambdaonplayererror41) {
                    DefaultAnalyticsCollectorExternalSyntheticLambda68.IconCompatParcelizer(lambdaonPositionDiscontinuity43.APP_EVENTS, DefaultAnalyticsCollectorExternalSyntheticLambda1.IconCompatParcelizer(), "App index sent to FB!");
                }
            });
            return graphRequestIconCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda1.class);
            return null;
        }
    }

    static class RemoteActionCompatParcelizer implements Callable<String> {
        private WeakReference<View> read;

        RemoteActionCompatParcelizer(View view) {
            this.read = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = this.read.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }
}
