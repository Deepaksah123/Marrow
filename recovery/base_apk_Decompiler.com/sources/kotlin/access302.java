package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class access302 extends addMediaSourceHolders {
    private final setSurfaceTextureInternal AudioAttributesCompatParcelizer;
    private final lambdaupdatePlaybackInfo14<?> IconCompatParcelizer;
    private final setPlaybackLooper RemoteActionCompatParcelizer;
    private final setBandwidthMeter read;

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return access302.this.write((handlePlaybackInfo) null, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.write |= Integer.MIN_VALUE;
            return access302.this.read(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.addMediaSourceHolders
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public lambdaupdatePlaybackInfo14<?> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public access302(lambdaupdatePlaybackInfo14<?> lambdaupdateplaybackinfo14, setPlaybackLooper setplaybacklooper, setBandwidthMeter setbandwidthmeter, setSurfaceTextureInternal setsurfacetextureinternal) {
        super(null);
        toMagicModuleMetaRepoModel.write(lambdaupdateplaybackinfo14, "");
        toMagicModuleMetaRepoModel.write(setplaybacklooper, "");
        toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
        this.IconCompatParcelizer = lambdaupdateplaybackinfo14;
        this.RemoteActionCompatParcelizer = setplaybacklooper;
        this.read = setbandwidthmeter;
        this.AudioAttributesCompatParcelizer = setsurfacetextureinternal;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.addMediaSourceHolders
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.lambdasetAudioSessionId9 r11, kotlin.SampleVideos<? super kotlin.getShowPopup> r12) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access302.read(o.lambdasetAudioSessionId9, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.addMediaSourceHolders
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.handlePlaybackInfo r10, kotlin.SampleVideos<? super kotlin.getShowPopup> r11) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access302.write(o.handlePlaybackInfo, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public final void RemoteActionCompatParcelizer(Bitmap bitmap) {
        Bitmap bitmapRemoteActionCompatParcelizer = sendRendererMessage.RemoteActionCompatParcelizer((View) RemoteActionCompatParcelizer().IconCompatParcelizer()).RemoteActionCompatParcelizer(this, bitmap);
        if (bitmapRemoteActionCompatParcelizer == null) {
            return;
        }
        this.RemoteActionCompatParcelizer.write(bitmapRemoteActionCompatParcelizer);
    }

    @Override // kotlin.addMediaSourceHolders
    public final void IconCompatParcelizer(Drawable drawable, Bitmap bitmap) {
        if (!(this.RemoteActionCompatParcelizer instanceof setRenderersFactory)) {
            read(bitmap);
            RemoteActionCompatParcelizer().write(drawable);
            RemoteActionCompatParcelizer(bitmap);
            return;
        }
        RemoteActionCompatParcelizer().write(drawable);
    }

    @Override // kotlin.addMediaSourceHolders
    public final void IconCompatParcelizer() {
        if (!(this.RemoteActionCompatParcelizer instanceof setRenderersFactory)) {
            read(null);
            RemoteActionCompatParcelizer();
            RemoteActionCompatParcelizer(null);
            return;
        }
        RemoteActionCompatParcelizer();
    }
}
