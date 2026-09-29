package kotlin;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.createMediaSources;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u0006*\u00020\u00030\u00030\u001e8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lo/sendVolumeToRenderers;", "Landroid/content/ComponentCallbacks2;", "Lo/createMediaSources$write;", "Lo/setLoadControl;", "p0", "Landroid/content/Context;", "p1", "", "p2", "<init>", "(Lo/setLoadControl;Landroid/content/Context;Z)V", "Landroid/content/res/Configuration;", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "AudioAttributesCompatParcelizer", "(Z)V", "onLowMemory", "()V", "", "onTrimMemory", "(I)V", "write", "read", "Z", "RemoteActionCompatParcelizer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroid/content/Context;", "IconCompatParcelizer", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "()Z", "Lo/createMediaSources;", "AudioAttributesImplApi26Parcelizer", "Lo/createMediaSources;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class sendVolumeToRenderers implements ComponentCallbacks2, createMediaSources.write {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Context IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final createMediaSources MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final WeakReference<setLoadControl> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private volatile boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AtomicBoolean read;

    public sendVolumeToRenderers(setLoadControl setloadcontrol, Context context, boolean z) {
        toMagicModuleMetaRepoModel.write(setloadcontrol, "");
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = context;
        this.write = new WeakReference<>(setloadcontrol);
        createMediaSources.Companion companion = createMediaSources.INSTANCE;
        createMediaSources createmediasources = createMediaSources.Companion.read(context, z, this, setloadcontrol.getMediaMetadataCompat());
        this.MediaBrowserCompatCustomActionResultReceiver = createmediasources;
        this.RemoteActionCompatParcelizer = createmediasources.AudioAttributesCompatParcelizer();
        this.read = new AtomicBoolean(false);
        context.registerComponentCallbacks(this);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.write.get() == null) {
            write();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int p0) {
        getShowPopup getshowpopup;
        setLoadControl setloadcontrol = this.write.get();
        if (setloadcontrol == null) {
            getshowpopup = null;
        } else {
            setloadcontrol.write(p0);
            getshowpopup = getShowPopup.INSTANCE;
        }
        if (getshowpopup == null) {
            write();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // o.createMediaSources.write
    public final void AudioAttributesCompatParcelizer(boolean p0) {
        setLoadControl setloadcontrol = this.write.get();
        if (setloadcontrol == null) {
            write();
        } else {
            this.RemoteActionCompatParcelizer = p0;
            setloadcontrol.getMediaMetadataCompat();
        }
    }

    private void write() {
        if (this.read.getAndSet(true)) {
            return;
        }
        this.IconCompatParcelizer.unregisterComponentCallbacks(this);
        this.MediaBrowserCompatCustomActionResultReceiver.write();
    }
}
