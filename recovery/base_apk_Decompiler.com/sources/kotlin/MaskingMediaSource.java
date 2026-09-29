package kotlin;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\f"}, d2 = {"Lo/MaskingMediaSource;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroid/os/Bundle;", "p1", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MaskingMediaSource implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        buildResolutionString.IconCompatParcelizer("ActivityLifecycleCallbacks", "onActivityCreated: ".concat(String.valueOf(p0.getLocalClassName())));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        buildResolutionString.IconCompatParcelizer("ActivityLifecycleCallbacks", "onActivityStarted: ".concat(String.valueOf(p0.getLocalClassName())));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        buildResolutionString.IconCompatParcelizer("ActivityLifecycleCallbacks", "onActivityPaused: ".concat(String.valueOf(p0.getLocalClassName())));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        buildResolutionString.IconCompatParcelizer("ActivityLifecycleCallbacks", "onActivityStopped: ".concat(String.valueOf(p0.getLocalClassName())));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        buildResolutionString.IconCompatParcelizer("ActivityLifecycleCallbacks", "onActivityDestroyed: ".concat(String.valueOf(p0.getLocalClassName())));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }
}
