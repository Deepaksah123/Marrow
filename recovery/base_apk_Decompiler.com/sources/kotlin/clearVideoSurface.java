package kotlin;

import android.graphics.Bitmap;
import coil.size.Size;
import java.util.List;
import kotlin.ExoPlayerTextComponent;

/* JADX INFO: loaded from: classes2.dex */
public final class clearVideoSurface implements ExoPlayerTextComponent.RemoteActionCompatParcelizer {
    private final lambdamaybeNotifySurfaceSizeChanged27 AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final lambdamaybeNotifySurfaceSizeChanged27 AudioAttributesImplApi26Parcelizer;
    private final Size AudioAttributesImplBaseParcelizer;
    private final Bitmap IconCompatParcelizer;
    private final List<ExoPlayerTextComponent> RemoteActionCompatParcelizer;
    private final int read;
    private final setBandwidthMeter write;

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object read;
        Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return clearVideoSurface.this.AudioAttributesCompatParcelizer((lambdamaybeNotifySurfaceSizeChanged27) null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public clearVideoSurface(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, int i, List<? extends ExoPlayerTextComponent> list, int i2, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged272, Size size, Bitmap bitmap, setBandwidthMeter setbandwidthmeter) {
        toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged272, "");
        toMagicModuleMetaRepoModel.write(size, "");
        toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
        this.AudioAttributesCompatParcelizer = lambdamaybenotifysurfacesizechanged27;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.RemoteActionCompatParcelizer = list;
        this.read = i2;
        this.AudioAttributesImplApi26Parcelizer = lambdamaybenotifysurfacesizechanged272;
        this.AudioAttributesImplBaseParcelizer = size;
        this.IconCompatParcelizer = bitmap;
        this.write = setbandwidthmeter;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private List<ExoPlayerTextComponent> AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private int MediaBrowserCompatItemReceiver() {
        return this.read;
    }

    @Override // o.ExoPlayerTextComponent.RemoteActionCompatParcelizer
    public final lambdamaybeNotifySurfaceSizeChanged27 IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // o.ExoPlayerTextComponent.RemoteActionCompatParcelizer
    public final Size read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final Bitmap write() {
        return this.IconCompatParcelizer;
    }

    public final setBandwidthMeter RemoteActionCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.lambdamaybeNotifySurfaceSizeChanged27 r6, kotlin.SampleVideos<? super kotlin.lambdasetRepeatMode3> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.clearVideoSurface.read
            if (r0 == 0) goto L14
            r0 = r7
            o.clearVideoSurface$read r0 = (o.clearVideoSurface.read) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            o.clearVideoSurface$read r0 = new o.clearVideoSurface$read
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r5 = r0.read
            o.ExoPlayerTextComponent r5 = (kotlin.ExoPlayerTextComponent) r5
            java.lang.Object r6 = r0.write
            o.clearVideoSurface r6 = (kotlin.clearVideoSurface) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L7f
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            int r7 = r5.MediaBrowserCompatItemReceiver()
            if (r7 <= 0) goto L59
            java.util.List r7 = r5.AudioAttributesImplApi26Parcelizer()
            int r2 = r5.MediaBrowserCompatItemReceiver()
            int r2 = r2 - r3
            java.lang.Object r7 = r7.get(r2)
            o.ExoPlayerTextComponent r7 = (kotlin.ExoPlayerTextComponent) r7
            r5.AudioAttributesCompatParcelizer(r6, r7)
        L59:
            java.util.List r7 = r5.AudioAttributesImplApi26Parcelizer()
            int r2 = r5.MediaBrowserCompatItemReceiver()
            java.lang.Object r7 = r7.get(r2)
            o.ExoPlayerTextComponent r7 = (kotlin.ExoPlayerTextComponent) r7
            int r2 = r5.MediaBrowserCompatItemReceiver()
            int r2 = r2 + r3
            o.clearVideoSurface r6 = RemoteActionCompatParcelizer(r5, r2, r6)
            o.ExoPlayerTextComponent$RemoteActionCompatParcelizer r6 = (o.ExoPlayerTextComponent.RemoteActionCompatParcelizer) r6
            r0.write = r5
            r0.read = r7
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r6 = r7.write(r6, r0)
            if (r6 != r1) goto L7f
            return r1
        L7f:
            o.lambdasetRepeatMode3 r6 = (kotlin.lambdasetRepeatMode3) r6
            o.lambdamaybeNotifySurfaceSizeChanged27 r0 = r6.write()
            r5.AudioAttributesCompatParcelizer(r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.clearVideoSurface.AudioAttributesCompatParcelizer(o.lambdamaybeNotifySurfaceSizeChanged27, o.SampleVideos):java.lang.Object");
    }

    private final void AudioAttributesCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, ExoPlayerTextComponent exoPlayerTextComponent) {
        if (lambdamaybenotifysurfacesizechanged27.getMediaBrowserCompatCustomActionResultReceiver() != this.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver()) {
            StringBuilder sb = new StringBuilder("Interceptor '");
            sb.append(exoPlayerTextComponent);
            sb.append("' cannot modify the request's context.");
            throw new IllegalStateException(sb.toString().toString());
        }
        if (lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi26Parcelizer() == lambdarelease5.INSTANCE) {
            StringBuilder sb2 = new StringBuilder("Interceptor '");
            sb2.append(exoPlayerTextComponent);
            sb2.append("' cannot set the request's data to null.");
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (lambdamaybenotifysurfacesizechanged27.getOnRemoveQueueItemAt() != this.AudioAttributesCompatParcelizer.getOnRemoveQueueItemAt()) {
            StringBuilder sb3 = new StringBuilder("Interceptor '");
            sb3.append(exoPlayerTextComponent);
            sb3.append("' cannot modify the request's target.");
            throw new IllegalStateException(sb3.toString().toString());
        }
        if (lambdamaybenotifysurfacesizechanged27.getHandleMediaPlayPauseIfPendingOnHandler() != this.AudioAttributesCompatParcelizer.getHandleMediaPlayPauseIfPendingOnHandler()) {
            StringBuilder sb4 = new StringBuilder("Interceptor '");
            sb4.append(exoPlayerTextComponent);
            sb4.append("' cannot modify the request's lifecycle.");
            throw new IllegalStateException(sb4.toString().toString());
        }
        if (lambdamaybenotifysurfacesizechanged27.getOnPrepareFromUri() == this.AudioAttributesCompatParcelizer.getOnPrepareFromUri()) {
            return;
        }
        StringBuilder sb5 = new StringBuilder("Interceptor '");
        sb5.append(exoPlayerTextComponent);
        sb5.append("' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        throw new IllegalStateException(sb5.toString().toString());
    }

    private static /* synthetic */ clearVideoSurface RemoteActionCompatParcelizer(clearVideoSurface clearvideosurface, int i, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
        return clearvideosurface.write(i, lambdamaybenotifysurfacesizechanged27, clearvideosurface.read());
    }

    private final clearVideoSurface write(int i, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Size size) {
        return new clearVideoSurface(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, i, lambdamaybenotifysurfacesizechanged27, size, this.IconCompatParcelizer, this.write);
    }
}
