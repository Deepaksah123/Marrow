package kotlin;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class getDate implements Application.ActivityLifecycleCallbacks {
    private static Double read;
    private WeakReference<Activity> AudioAttributesCompatParcelizer;
    private final VideoDownloadLimitResponse MediaBrowserCompatCustomActionResultReceiver;
    private Runnable RemoteActionCompatParcelizer;
    private final PlanResponsePromo write;
    private final Handler IconCompatParcelizer = new Handler(Looper.getMainLooper());
    private boolean MediaBrowserCompatItemReceiver = false;
    private boolean AudioAttributesImplBaseParcelizer = true;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    static /* synthetic */ boolean AudioAttributesCompatParcelizer(getDate getdate) {
        getdate.MediaBrowserCompatItemReceiver = false;
        return false;
    }

    public getDate(VideoDownloadLimitResponse videoDownloadLimitResponse, PlanResponsePromo planResponsePromo) {
        this.MediaBrowserCompatCustomActionResultReceiver = videoDownloadLimitResponse;
        this.write = planResponsePromo;
        if (read == null) {
            read = Double.valueOf(System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.AudioAttributesImplBaseParcelizer = true;
        Runnable runnable = this.RemoteActionCompatParcelizer;
        if (runnable != null) {
            this.IconCompatParcelizer.removeCallbacks(runnable);
        }
        this.AudioAttributesCompatParcelizer = null;
        Handler handler = this.IconCompatParcelizer;
        Runnable runnable2 = new Runnable() { // from class: o.getDate.4
            @Override // java.lang.Runnable
            public final void run() {
                if (getDate.this.MediaBrowserCompatItemReceiver && getDate.this.AudioAttributesImplBaseParcelizer) {
                    getDate.AudioAttributesCompatParcelizer(getDate.this);
                    try {
                        double dCurrentTimeMillis = System.currentTimeMillis() - getDate.read.doubleValue();
                        if (dCurrentTimeMillis >= getDate.this.write.MediaBrowserCompatMediaItem() && dCurrentTimeMillis < getDate.this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() && getDate.this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer().booleanValue()) {
                            double dRound = Math.round((dCurrentTimeMillis / 1000.0d) * 10.0d) / 10.0d;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("$ae_session_length", dRound);
                            getDate.this.MediaBrowserCompatCustomActionResultReceiver.write().AudioAttributesCompatParcelizer("$ae_total_app_sessions", 1.0d);
                            getDate.this.MediaBrowserCompatCustomActionResultReceiver.write().AudioAttributesCompatParcelizer("$ae_total_app_session_length", dRound);
                            getDate.this.MediaBrowserCompatCustomActionResultReceiver.read("$ae_session", jSONObject, true);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    getDate.this.MediaBrowserCompatCustomActionResultReceiver.read();
                }
            }
        };
        this.RemoteActionCompatParcelizer = runnable2;
        handler.postDelayed(runnable2, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.AudioAttributesCompatParcelizer = new WeakReference<>(activity);
        this.AudioAttributesImplBaseParcelizer = false;
        boolean z = this.MediaBrowserCompatItemReceiver;
        this.MediaBrowserCompatItemReceiver = true;
        Runnable runnable = this.RemoteActionCompatParcelizer;
        if (runnable != null) {
            this.IconCompatParcelizer.removeCallbacks(runnable);
        }
        if (z) {
            return;
        }
        read = Double.valueOf(System.currentTimeMillis());
        this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver();
    }
}
