package kotlin;

import android.graphics.Bitmap;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.setLivePlaybackSpeedControl;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J$\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J$\u0010\u001c\u001a\u00020\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000eH\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0003H\u0016J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0003H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcoil/bitmap/RealBitmapPool;", "Lcoil/bitmap/BitmapPool;", "maxSize", "", "allowedConfigs", "", "Landroid/graphics/Bitmap$Config;", "strategy", "Lcoil/bitmap/BitmapPoolStrategy;", "logger", "Lcoil/util/Logger;", "(ILjava/util/Set;Lcoil/bitmap/BitmapPoolStrategy;Lcoil/util/Logger;)V", "bitmaps", "Ljava/util/HashSet;", "Landroid/graphics/Bitmap;", "Lkotlin/collections/HashSet;", "currentSize", "evictions", "hits", "misses", "puts", "clear", "", "clearMemory", "get", "width", "height", PaymentConstants.Category.CONFIG, "getDirty", "getDirtyOrNull", "getOrNull", "logStats", "", "normalize", "bitmap", "put", "trimMemory", "level", "trimToSize", "size", "Companion", "coil-base_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setMediaSourceFactory implements setDeviceVolumeControlEnabled {
    public static final write AudioAttributesCompatParcelizer = new write(null);
    private static final Set<Bitmap.Config> IconCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final setSurfaceTextureInternal AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final setLivePlaybackSpeedControl MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private final HashSet<Bitmap> RemoteActionCompatParcelizer;
    private final Set<Bitmap.Config> write;

    /* JADX WARN: Multi-variable type inference failed */
    private setMediaSourceFactory(int i, Set<? extends Bitmap.Config> set, setLivePlaybackSpeedControl setliveplaybackspeedcontrol, setSurfaceTextureInternal setsurfacetextureinternal) {
        toMagicModuleMetaRepoModel.write(set, "");
        toMagicModuleMetaRepoModel.write(setliveplaybackspeedcontrol, "");
        this.MediaBrowserCompatItemReceiver = i;
        this.write = set;
        this.MediaBrowserCompatSearchResultReceiver = setliveplaybackspeedcontrol;
        this.AudioAttributesImplBaseParcelizer = setsurfacetextureinternal;
        this.RemoteActionCompatParcelizer = new HashSet<>();
        if (i < 0) {
            throw new IllegalArgumentException("maxSize must be >= 0.".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setMediaSourceFactory(int i, Set set, setLivePlaybackSpeedControl setliveplaybackspeedcontrol, setSurfaceTextureInternal setsurfacetextureinternal, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        set = (i2 & 2) != 0 ? IconCompatParcelizer : set;
        if ((i2 & 4) != 0) {
            setLivePlaybackSpeedControl.Companion companion = setLivePlaybackSpeedControl.INSTANCE;
            setliveplaybackspeedcontrol = setLivePlaybackSpeedControl.Companion.read();
        }
        this(i, set, setliveplaybackspeedcontrol, (i2 & 8) != 0 ? null : setsurfacetextureinternal);
    }

    @Override // kotlin.setDeviceVolumeControlEnabled
    public final void RemoteActionCompatParcelizer(Bitmap bitmap) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(bitmap, "");
            if (bitmap.isRecycled()) {
                setSurfaceTextureInternal setsurfacetextureinternal = this.AudioAttributesImplBaseParcelizer;
                if (setsurfacetextureinternal != null && setsurfacetextureinternal.RemoteActionCompatParcelizer() <= 6) {
                    toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Rejecting recycled bitmap from pool; bitmap: ", (Object) bitmap);
                }
                return;
            }
            int iWrite = maybeNotifySurfaceSizeChanged.write(bitmap);
            if (bitmap.isMutable() && iWrite <= this.MediaBrowserCompatItemReceiver && this.write.contains(bitmap.getConfig())) {
                if (this.RemoteActionCompatParcelizer.contains(bitmap)) {
                    setSurfaceTextureInternal setsurfacetextureinternal2 = this.AudioAttributesImplBaseParcelizer;
                    if (setsurfacetextureinternal2 != null && setsurfacetextureinternal2.RemoteActionCompatParcelizer() <= 6) {
                        toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Rejecting duplicate bitmap from pool; bitmap: ", (Object) this.MediaBrowserCompatSearchResultReceiver.read(bitmap));
                    }
                    return;
                }
                this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(bitmap);
                this.RemoteActionCompatParcelizer.add(bitmap);
                this.MediaBrowserCompatCustomActionResultReceiver += iWrite;
                this.MediaDescriptionCompat++;
                setSurfaceTextureInternal setsurfacetextureinternal3 = this.AudioAttributesImplBaseParcelizer;
                if (setsurfacetextureinternal3 != null && setsurfacetextureinternal3.RemoteActionCompatParcelizer() <= 2) {
                    this.MediaBrowserCompatSearchResultReceiver.read(bitmap);
                    write();
                }
                RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
                return;
            }
            setSurfaceTextureInternal setsurfacetextureinternal4 = this.AudioAttributesImplBaseParcelizer;
            if (setsurfacetextureinternal4 != null && setsurfacetextureinternal4.RemoteActionCompatParcelizer() <= 2) {
                this.MediaBrowserCompatSearchResultReceiver.read(bitmap);
                bitmap.isMutable();
                this.write.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        }
    }

    @Override // kotlin.setDeviceVolumeControlEnabled
    public final Bitmap read(int i, int i2, Bitmap.Config config) {
        toMagicModuleMetaRepoModel.write(config, "");
        Bitmap bitmapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, i2, config);
        if (bitmapRemoteActionCompatParcelizer != null) {
            return bitmapRemoteActionCompatParcelizer;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bitmapCreateBitmap, "");
        return bitmapCreateBitmap;
    }

    private Bitmap RemoteActionCompatParcelizer(int i, int i2, Bitmap.Config config) {
        toMagicModuleMetaRepoModel.write(config, "");
        Bitmap bitmapWrite = write(i, i2, config);
        if (bitmapWrite == null) {
            return null;
        }
        bitmapWrite.eraseColor(0);
        return bitmapWrite;
    }

    @Override // kotlin.setDeviceVolumeControlEnabled
    public final Bitmap IconCompatParcelizer(int i, int i2, Bitmap.Config config) {
        toMagicModuleMetaRepoModel.write(config, "");
        Bitmap bitmapWrite = write(i, i2, config);
        if (bitmapWrite != null) {
            return bitmapWrite;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bitmapCreateBitmap, "");
        return bitmapCreateBitmap;
    }

    private Bitmap write(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapIconCompatParcelizer;
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(config, "");
            if (maybeNotifySurfaceSizeChanged.read(config)) {
                throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
            }
            bitmapIconCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(i, i2, config);
            if (bitmapIconCompatParcelizer == null) {
                setSurfaceTextureInternal setsurfacetextureinternal = this.AudioAttributesImplBaseParcelizer;
                if (setsurfacetextureinternal != null && setsurfacetextureinternal.RemoteActionCompatParcelizer() <= 2) {
                    toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Missing bitmap=", (Object) this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(i, i2, config));
                }
                this.MediaMetadataCompat++;
            } else {
                this.RemoteActionCompatParcelizer.remove(bitmapIconCompatParcelizer);
                this.MediaBrowserCompatCustomActionResultReceiver -= maybeNotifySurfaceSizeChanged.write(bitmapIconCompatParcelizer);
                this.AudioAttributesImplApi26Parcelizer++;
                write(bitmapIconCompatParcelizer);
            }
            setSurfaceTextureInternal setsurfacetextureinternal2 = this.AudioAttributesImplBaseParcelizer;
            if (setsurfacetextureinternal2 != null && setsurfacetextureinternal2.RemoteActionCompatParcelizer() <= 2) {
                this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(i, i2, config);
                write();
            }
        }
        return bitmapIconCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer() {
        RemoteActionCompatParcelizer(-1);
    }

    @Override // kotlin.setDeviceVolumeControlEnabled
    public final void AudioAttributesCompatParcelizer(int i) {
        synchronized (this) {
            setSurfaceTextureInternal setsurfacetextureinternal = this.AudioAttributesImplBaseParcelizer;
            if (setsurfacetextureinternal != null && setsurfacetextureinternal.RemoteActionCompatParcelizer() <= 2) {
                toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("trimMemory, level=", (Object) Integer.valueOf(i));
            }
            if (i >= 40) {
                RemoteActionCompatParcelizer();
            } else if (10 <= i && i < 20) {
                RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver / 2);
            }
        }
    }

    private static void write(Bitmap bitmap) {
        bitmap.setDensity(0);
        bitmap.setHasAlpha(true);
        bitmap.setPremultiplied(true);
    }

    private final void RemoteActionCompatParcelizer(int i) {
        synchronized (this) {
            while (this.MediaBrowserCompatCustomActionResultReceiver > i) {
                Bitmap bitmapAudioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer();
                if (bitmapAudioAttributesCompatParcelizer == null) {
                    setSurfaceTextureInternal setsurfacetextureinternal = this.AudioAttributesImplBaseParcelizer;
                    if (setsurfacetextureinternal != null && setsurfacetextureinternal.RemoteActionCompatParcelizer() <= 5) {
                        toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Size mismatch, resetting.\n", (Object) write());
                    }
                    this.MediaBrowserCompatCustomActionResultReceiver = 0;
                    return;
                }
                this.RemoteActionCompatParcelizer.remove(bitmapAudioAttributesCompatParcelizer);
                this.MediaBrowserCompatCustomActionResultReceiver -= maybeNotifySurfaceSizeChanged.write(bitmapAudioAttributesCompatParcelizer);
                this.AudioAttributesImplApi21Parcelizer++;
                setSurfaceTextureInternal setsurfacetextureinternal2 = this.AudioAttributesImplBaseParcelizer;
                if (setsurfacetextureinternal2 != null && setsurfacetextureinternal2.RemoteActionCompatParcelizer() <= 2) {
                    this.MediaBrowserCompatSearchResultReceiver.read(bitmapAudioAttributesCompatParcelizer);
                    write();
                }
                bitmapAudioAttributesCompatParcelizer.recycle();
            }
        }
    }

    private final String write() {
        StringBuilder sb = new StringBuilder("Hits=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", misses=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", puts=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", evictions=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", currentSize=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", maxSize=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", strategy=");
        sb.append(this.MediaBrowserCompatSearchResultReceiver);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/setMediaSourceFactory$write;", "", "<init>", "()V", "", "Landroid/graphics/Bitmap$Config;", "IconCompatParcelizer", "Ljava/util/Set;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        Set setWrite = getKycMessage.write();
        setWrite.add(Bitmap.Config.ALPHA_8);
        setWrite.add(Bitmap.Config.RGB_565);
        setWrite.add(Bitmap.Config.ARGB_4444);
        setWrite.add(Bitmap.Config.ARGB_8888);
        setWrite.add(Bitmap.Config.RGBA_F16);
        IconCompatParcelizer = getKycMessage.RemoteActionCompatParcelizer(setWrite);
    }
}
