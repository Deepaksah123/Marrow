package kotlin;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000  2\u00020\u0001:\u0002 \u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000b\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\r\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\r\u0010\u0014J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\r\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00118\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/setReleaseTimeoutMs;", "Lo/setPlaybackLooper;", "Lo/evaluateMediaItemTransitionReason;", "p0", "Lo/setDeviceVolumeControlEnabled;", "p1", "Lo/setSurfaceTextureInternal;", "p2", "<init>", "(Lo/evaluateMediaItemTransitionReason;Lo/setDeviceVolumeControlEnabled;Lo/setSurfaceTextureInternal;)V", "", "write", "()V", "AudioAttributesCompatParcelizer", "Landroid/graphics/Bitmap;", "", "(Landroid/graphics/Bitmap;)Z", "", "Lo/setReleaseTimeoutMs$read;", "RemoteActionCompatParcelizer", "(ILandroid/graphics/Bitmap;)Lo/setReleaseTimeoutMs$read;", "(Landroid/graphics/Bitmap;)V", "read", "(Landroid/graphics/Bitmap;Z)V", "Lo/setDeviceVolumeControlEnabled;", "Lo/setSurfaceTextureInternal;", "I", "Lo/setSupportButtonTintList;", "MediaBrowserCompatItemReceiver", "Lo/setSupportButtonTintList;", "AudioAttributesImplApi21Parcelizer", "Lo/evaluateMediaItemTransitionReason;", "IconCompatParcelizer"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setReleaseTimeoutMs implements setPlaybackLooper {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final evaluateMediaItemTransitionReason IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setSupportButtonTintList<read> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setSurfaceTextureInternal write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setDeviceVolumeControlEnabled AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public int RemoteActionCompatParcelizer;
    private static final Handler AudioAttributesCompatParcelizer = new Handler(Looper.getMainLooper());

    public setReleaseTimeoutMs(evaluateMediaItemTransitionReason evaluatemediaitemtransitionreason, setDeviceVolumeControlEnabled setdevicevolumecontrolenabled, setSurfaceTextureInternal setsurfacetextureinternal) {
        toMagicModuleMetaRepoModel.write(evaluatemediaitemtransitionreason, "");
        toMagicModuleMetaRepoModel.write(setdevicevolumecontrolenabled, "");
        this.IconCompatParcelizer = evaluatemediaitemtransitionreason;
        this.AudioAttributesCompatParcelizer = setdevicevolumecontrolenabled;
        this.write = setsurfacetextureinternal;
        this.read = new setSupportButtonTintList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(setReleaseTimeoutMs setreleasetimeoutms, Bitmap bitmap) {
        toMagicModuleMetaRepoModel.write(setreleasetimeoutms, "");
        toMagicModuleMetaRepoModel.write(bitmap, "");
        setreleasetimeoutms.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(bitmap);
    }

    private final void AudioAttributesCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        if (i >= 50) {
            write();
        }
    }

    private void write() {
        ArrayList arrayList = new ArrayList();
        int i = this.read.read();
        int i2 = 0;
        if (i > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (this.read.MediaBrowserCompatCustomActionResultReceiver(i3).IconCompatParcelizer().get() == null) {
                    arrayList.add(Integer.valueOf(i3));
                }
                if (i4 >= i) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        setSupportButtonTintList<read> setsupportbuttontintlist = this.read;
        int size = arrayList2.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i5 = i2 + 1;
            setsupportbuttontintlist.AudioAttributesImplApi21Parcelizer(((Number) arrayList2.get(i2)).intValue());
            if (i5 > size) {
                return;
            } else {
                i2 = i5;
            }
        }
    }

    private final read RemoteActionCompatParcelizer(int p0, Bitmap p1) {
        read readVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, p1);
        if (readVarAudioAttributesCompatParcelizer != null) {
            return readVarAudioAttributesCompatParcelizer;
        }
        read readVar = new read(new WeakReference(p1), false);
        this.read.AudioAttributesCompatParcelizer(p0, readVar);
        return readVar;
    }

    private final read AudioAttributesCompatParcelizer(int p0, Bitmap p1) {
        read readVarIconCompatParcelizer = this.read.IconCompatParcelizer(p0);
        if (readVarIconCompatParcelizer != null && readVarIconCompatParcelizer.IconCompatParcelizer().get() == p1) {
            return readVarIconCompatParcelizer;
        }
        return null;
    }

    public static final class read {
        private int AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private final WeakReference<Bitmap> RemoteActionCompatParcelizer;

        public read(WeakReference<Bitmap> weakReference, boolean z) {
            toMagicModuleMetaRepoModel.write(weakReference, "");
            this.RemoteActionCompatParcelizer = weakReference;
            this.AudioAttributesCompatParcelizer = 0;
            this.IconCompatParcelizer = z;
        }

        public final WeakReference<Bitmap> IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer = false;
        }

        public final boolean read() {
            return this.IconCompatParcelizer;
        }
    }

    @Override // kotlin.setPlaybackLooper
    public final void AudioAttributesCompatParcelizer(Bitmap p0) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            read readVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(System.identityHashCode(p0), p0);
            readVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer() + 1);
            setSurfaceTextureInternal setsurfacetextureinternal = this.write;
            if (setsurfacetextureinternal != null && setsurfacetextureinternal.RemoteActionCompatParcelizer() <= 2) {
                readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                readVarRemoteActionCompatParcelizer.read();
            }
            AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.setPlaybackLooper
    public final boolean write(final Bitmap p0) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iIdentityHashCode = System.identityHashCode(p0);
            read readVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iIdentityHashCode, p0);
            boolean z = false;
            if (readVarAudioAttributesCompatParcelizer == null) {
                setReleaseTimeoutMs setreleasetimeoutms = this;
                setSurfaceTextureInternal setsurfacetextureinternal = this.write;
                if (setsurfacetextureinternal != null) {
                    setsurfacetextureinternal.RemoteActionCompatParcelizer();
                }
                return false;
            }
            readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() - 1);
            setSurfaceTextureInternal setsurfacetextureinternal2 = this.write;
            if (setsurfacetextureinternal2 != null && setsurfacetextureinternal2.RemoteActionCompatParcelizer() <= 2) {
                readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                readVarAudioAttributesCompatParcelizer.read();
            }
            if (readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() <= 0 && readVarAudioAttributesCompatParcelizer.read()) {
                z = true;
            }
            if (z) {
                this.read.write(iIdentityHashCode);
                this.IconCompatParcelizer.write(p0);
                AudioAttributesCompatParcelizer.post(new Runnable() { // from class: o.setTrackSelector
                    @Override // java.lang.Runnable
                    public final void run() {
                        setReleaseTimeoutMs.AudioAttributesCompatParcelizer(this.read, p0);
                    }
                });
            }
            AudioAttributesCompatParcelizer();
            return z;
        }
    }

    @Override // kotlin.setPlaybackLooper
    public final void read(Bitmap p0, boolean p1) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iIdentityHashCode = System.identityHashCode(p0);
            if (p1) {
                if (AudioAttributesCompatParcelizer(iIdentityHashCode, p0) == null) {
                    this.read.AudioAttributesCompatParcelizer(iIdentityHashCode, new read(new WeakReference(p0), true));
                }
            } else {
                RemoteActionCompatParcelizer(iIdentityHashCode, p0).AudioAttributesCompatParcelizer();
            }
            AudioAttributesCompatParcelizer();
        }
    }
}
