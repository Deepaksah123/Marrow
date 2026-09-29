package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import in.juspay.hyper.constants.LogCategory;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getPreferredActivities;
import kotlin.getResourcesForApplication;
import kotlin.getUserBadgedLabel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\u00020\u0001:\u0004$%&'B\u001b\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0010J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020#H\u0017R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;", "sidecar", "Landroidx/window/sidecar/SidecarInterface;", "sidecarAdapter", "Landroidx/window/layout/adapter/sidecar/SidecarAdapter;", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/adapter/sidecar/SidecarAdapter;)V", LogCategory.CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "windowListenerRegisteredContexts", "", "Landroid/os/IBinder;", "Landroid/app/Activity;", "componentCallbackMap", "Landroidx/core/util/Consumer;", "Landroid/content/res/Configuration;", "extensionCallback", "Landroidx/window/layout/adapter/sidecar/SidecarCompat$DistinctElementCallback;", "setExtensionCallback", "", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "getWindowLayoutInfo", "Landroidx/window/layout/WindowLayoutInfo;", "activity", "onWindowLayoutChangeListenerAdded", "register", "windowToken", "registerConfigurationChangeListener", "onWindowLayoutChangeListenerRemoved", "unregisterComponentCallback", "validateExtensionInterface", "", "FirstAttachAdapter", "TranslatingCallback", "DistinctElementCallback", "Companion", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SidecarCompat implements getResourcesForApplication {
    public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer(null);
    private final SidecarInterface IconCompatParcelizer;
    private final getUserBadgedLabel RemoteActionCompatParcelizer;
    private RemoteActionCompatParcelizer read;
    private final Map<IBinder, Activity> write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final SidecarInterface getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)V", "onDeviceStateChanged", "", "newDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "onWindowLayoutChanged", "windowToken", "Landroid/os/IBinder;", "newLayout", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TranslatingCallback {
        final /* synthetic */ SidecarCompat AudioAttributesCompatParcelizer;

        public final void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface iconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(newDeviceState, "");
            Collection<Activity> collectionValues = this.AudioAttributesCompatParcelizer.write.values();
            SidecarCompat sidecarCompat = this.AudioAttributesCompatParcelizer;
            for (Activity activity : collectionValues) {
                IBinder iBinderIconCompatParcelizer = SidecarCompat.AudioAttributesCompatParcelizer.IconCompatParcelizer(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderIconCompatParcelizer != null && (iconCompatParcelizer = sidecarCompat.getIconCompatParcelizer()) != null) {
                    windowLayoutInfo = iconCompatParcelizer.getWindowLayoutInfo(iBinderIconCompatParcelizer);
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = sidecarCompat.read;
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer(activity, sidecarCompat.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public final void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState sidecarDeviceState;
            toMagicModuleMetaRepoModel.write(windowToken, "");
            toMagicModuleMetaRepoModel.write(newLayout, "");
            Activity activity = (Activity) this.AudioAttributesCompatParcelizer.write.get(windowToken);
            if (activity == null) {
                return;
            }
            getUserBadgedLabel getuserbadgedlabel = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            SidecarInterface iconCompatParcelizer = this.AudioAttributesCompatParcelizer.getIconCompatParcelizer();
            if (iconCompatParcelizer == null || (sidecarDeviceState = iconCompatParcelizer.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            getPreferredActivities getpreferredactivitiesRemoteActionCompatParcelizer = getuserbadgedlabel.RemoteActionCompatParcelizer(newLayout, sidecarDeviceState);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.read;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer(activity, getpreferredactivitiesRemoteActionCompatParcelizer);
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;", "Lo/getResourcesForApplication$AudioAttributesCompatParcelizer;", "Landroid/app/Activity;", "p0", "Lo/getPreferredActivities;", "p1", "", "RemoteActionCompatParcelizer", "(Landroid/app/Activity;Lo/getPreferredActivities;)V", "read", "Lo/getResourcesForApplication$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer", "Ljava/util/concurrent/locks/ReentrantLock;", "IconCompatParcelizer", "Ljava/util/concurrent/locks/ReentrantLock;", "write", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements getResourcesForApplication.AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final ReentrantLock write;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final WeakHashMap<Activity, getPreferredActivities> IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final getResourcesForApplication.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

        @Override // o.getResourcesForApplication.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(Activity p0, getPreferredActivities p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            ReentrantLock reentrantLock = this.write;
            reentrantLock.lock();
            try {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, this.IconCompatParcelizer.get(p0))) {
                    return;
                }
                this.IconCompatParcelizer.put(p0, p1);
                reentrantLock.unlock();
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$Companion;", "", "<init>", "()V", "TAG", "", "sidecarVersion", "Landroidx/window/core/Version;", "getSidecarVersion", "()Landroidx/window/core/Version;", "getSidecarCompat", "Landroidx/window/sidecar/SidecarInterface;", LogCategory.CONTEXT, "Landroid/content/Context;", "getSidecarCompat$window_release", "getActivityWindowToken", "Landroid/os/IBinder;", "activity", "Landroid/app/Activity;", "getActivityWindowToken$window_release", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public final IBinder IconCompatParcelizer(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
