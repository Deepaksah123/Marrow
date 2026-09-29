package kotlin;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackParametersExternalSyntheticLambda0 {
    private static final Application.ActivityLifecycleCallbacks IconCompatParcelizer = new Application.ActivityLifecycleCallbacks() { // from class: o.PlaybackParametersExternalSyntheticLambda0.3
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

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            PlayerTimelineChangeReason.read(activity, PlaybackParametersExternalSyntheticLambda0.RemoteActionCompatParcelizer());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            PlayerTimelineChangeReason.IconCompatParcelizer();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            PlayerTimelineChangeReason.RemoteActionCompatParcelizer(activity, PlaybackParametersExternalSyntheticLambda0.RemoteActionCompatParcelizer());
        }
    };
    public static boolean RemoteActionCompatParcelizer = false;
    private static String write;

    static /* synthetic */ String RemoteActionCompatParcelizer() {
        return null;
    }

    public static void write(Application application) {
        read(application);
    }

    private static void read(Application application) {
        if (application == null) {
            RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        if (RemoteActionCompatParcelizer) {
            RendererWakeupListener.MediaMetadataCompat();
            return;
        }
        write = null;
        RemoteActionCompatParcelizer = true;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = IconCompatParcelizer;
        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
    }
}
