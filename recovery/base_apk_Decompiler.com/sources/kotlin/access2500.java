package kotlin;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.access2400;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u0019B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0011J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\r\u0010\u0014J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001cR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lo/access2500;", "Lo/addMediaSourcesInternal;", "Lo/evaluateMediaItemTransitionReason;", "p0", "Lo/setPlaybackLooper;", "p1", "", "p2", "Lo/setSurfaceTextureInternal;", "p3", "<init>", "(Lo/evaluateMediaItemTransitionReason;Lo/setPlaybackLooper;ILo/setSurfaceTextureInternal;)V", "", "IconCompatParcelizer", "()V", "Lcoil/memory/MemoryCache$Key;", "Lo/access2400$RemoteActionCompatParcelizer;", "(Lcoil/memory/MemoryCache$Key;)Lo/access2400$RemoteActionCompatParcelizer;", "Landroid/graphics/Bitmap;", "", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Z)V", "(I)V", "Lo/access2500$IconCompatParcelizer;", "Lo/access2500$IconCompatParcelizer;", "write", "RemoteActionCompatParcelizer", "Lo/setSurfaceTextureInternal;", "read", "()I", "AudioAttributesCompatParcelizer", "Lo/setPlaybackLooper;", "AudioAttributesImplBaseParcelizer", "Lo/evaluateMediaItemTransitionReason;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class access2500 implements addMediaSourcesInternal {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setPlaybackLooper IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final evaluateMediaItemTransitionReason MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final IconCompatParcelizer write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setSurfaceTextureInternal read;

    public access2500(evaluateMediaItemTransitionReason evaluatemediaitemtransitionreason, setPlaybackLooper setplaybacklooper, int i, setSurfaceTextureInternal setsurfacetextureinternal) {
        toMagicModuleMetaRepoModel.write(evaluatemediaitemtransitionreason, "");
        toMagicModuleMetaRepoModel.write(setplaybacklooper, "");
        this.MediaBrowserCompatCustomActionResultReceiver = evaluatemediaitemtransitionreason;
        this.IconCompatParcelizer = setplaybacklooper;
        this.read = setsurfacetextureinternal;
        this.write = new IconCompatParcelizer(i);
    }

    public static final class IconCompatParcelizer extends ActionMenuViewLayoutParams<MemoryCache.Key, RemoteActionCompatParcelizer> {
        private /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(int i) {
            super(i);
            this.write = i;
        }

        @Override // kotlin.ActionMenuViewLayoutParams
        public final /* synthetic */ void entryRemoved(boolean z, MemoryCache.Key key, RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
            read(key, remoteActionCompatParcelizer);
        }

        @Override // kotlin.ActionMenuViewLayoutParams
        public final /* synthetic */ int sizeOf(MemoryCache.Key key, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return AudioAttributesCompatParcelizer(key, remoteActionCompatParcelizer);
        }

        private void read(MemoryCache.Key key, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(key, "");
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            if (access2500.this.IconCompatParcelizer.write(remoteActionCompatParcelizer.write())) {
                return;
            }
            access2500.this.MediaBrowserCompatCustomActionResultReceiver.write(key, remoteActionCompatParcelizer.write(), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), remoteActionCompatParcelizer.IconCompatParcelizer());
        }

        private static int AudioAttributesCompatParcelizer(MemoryCache.Key key, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(key, "");
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            return remoteActionCompatParcelizer.IconCompatParcelizer();
        }
    }

    private int AudioAttributesCompatParcelizer() {
        return this.write.size();
    }

    private int write() {
        return this.write.maxSize();
    }

    @Override // kotlin.addMediaSourcesInternal
    public final access2400.RemoteActionCompatParcelizer IconCompatParcelizer(MemoryCache.Key p0) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            remoteActionCompatParcelizer = this.write.get(p0);
        }
        return remoteActionCompatParcelizer;
    }

    @Override // kotlin.addMediaSourcesInternal
    public final void IconCompatParcelizer(MemoryCache.Key p0, Bitmap p1, boolean p2) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            int iWrite = maybeNotifySurfaceSizeChanged.write(p1);
            if (iWrite > write()) {
                if (this.write.remove(p0) == null) {
                    this.MediaBrowserCompatCustomActionResultReceiver.write(p0, p1, p2, iWrite);
                }
            } else {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p1);
                this.write.put(p0, new RemoteActionCompatParcelizer(p1, p2, iWrite));
            }
        }
    }

    private void IconCompatParcelizer() {
        synchronized (this) {
            this.write.trimToSize(-1);
        }
    }

    @Override // kotlin.addMediaSourcesInternal
    public final void IconCompatParcelizer(int p0) {
        synchronized (this) {
            setSurfaceTextureInternal setsurfacetextureinternal = this.read;
            if (setsurfacetextureinternal != null && setsurfacetextureinternal.RemoteActionCompatParcelizer() <= 2) {
                toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("trimMemory, level=", (Object) Integer.valueOf(p0));
            }
            if (p0 >= 40) {
                IconCompatParcelizer();
            } else if (10 <= p0 && p0 < 20) {
                this.write.trimToSize(AudioAttributesCompatParcelizer() / 2);
            }
        }
    }

    static final class RemoteActionCompatParcelizer implements access2400.RemoteActionCompatParcelizer {
        private final boolean AudioAttributesCompatParcelizer;
        private final Bitmap RemoteActionCompatParcelizer;
        private final int write;

        public RemoteActionCompatParcelizer(Bitmap bitmap, boolean z, int i) {
            toMagicModuleMetaRepoModel.write(bitmap, "");
            this.RemoteActionCompatParcelizer = bitmap;
            this.AudioAttributesCompatParcelizer = z;
            this.write = i;
        }

        @Override // o.access2400.RemoteActionCompatParcelizer
        public final Bitmap write() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // o.access2400.RemoteActionCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.write;
        }
    }
}
