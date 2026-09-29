package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class access1302 extends addMediaSourceHolders {
    private final setBandwidthMeter AudioAttributesCompatParcelizer;
    private final lambdaupdatePlaybackInfo17 RemoteActionCompatParcelizer;
    private final setSurfaceTextureInternal read;
    private final setPlaybackLooper write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return access1302.this.write(null, this);
        }
    }

    static final class write extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return access1302.this.read(null, this);
        }
    }

    @Override // kotlin.addMediaSourceHolders
    public final lambdaupdatePlaybackInfo17 RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public access1302(lambdaupdatePlaybackInfo17 lambdaupdateplaybackinfo17, setPlaybackLooper setplaybacklooper, setBandwidthMeter setbandwidthmeter, setSurfaceTextureInternal setsurfacetextureinternal) {
        super(null);
        toMagicModuleMetaRepoModel.write(lambdaupdateplaybackinfo17, "");
        toMagicModuleMetaRepoModel.write(setplaybacklooper, "");
        toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
        this.RemoteActionCompatParcelizer = lambdaupdateplaybackinfo17;
        this.write = setplaybacklooper;
        this.AudioAttributesCompatParcelizer = setbandwidthmeter;
        this.read = setsurfacetextureinternal;
    }

    @Override // kotlin.addMediaSourceHolders
    public final void IconCompatParcelizer(Drawable drawable, Bitmap bitmap) {
        setPlaybackLooper setplaybacklooper = this.write;
        if (bitmap != null) {
            setplaybacklooper.read(bitmap, false);
        }
        RemoteActionCompatParcelizer().write(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.addMediaSourceHolders
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.lambdasetAudioSessionId9 r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o.access1302.write
            if (r0 == 0) goto L14
            r0 = r9
            o.access1302$write r0 = (o.access1302.write) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.RemoteActionCompatParcelizer
            int r9 = r9 + r2
            r0.RemoteActionCompatParcelizer = r9
            goto L19
        L14:
            o.access1302$write r0 = new o.access1302$write
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            o.setBandwidthMeter r7 = (kotlin.setBandwidthMeter) r7
            java.lang.Object r8 = r0.IconCompatParcelizer
            o.lambdasetAudioSessionId9 r8 = (kotlin.lambdasetAudioSessionId9) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto Lb9
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.setPlaybackLooper r9 = r7.write
            r2 = r8
            o.lambdasetRepeatMode3 r2 = (kotlin.lambdasetRepeatMode3) r2
            android.graphics.drawable.Drawable r4 = r2.IconCompatParcelizer()
            boolean r5 = r4 instanceof android.graphics.drawable.BitmapDrawable
            r6 = 0
            if (r5 == 0) goto L4f
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            goto L50
        L4f:
            r4 = r6
        L50:
            if (r4 != 0) goto L53
            goto L57
        L53:
            android.graphics.Bitmap r6 = r4.getBitmap()
        L57:
            if (r6 == 0) goto L5d
            r4 = 0
            r9.read(r6, r4)
        L5d:
            o.lambdaupdatePlaybackInfo17 r9 = r7.RemoteActionCompatParcelizer()
            o.setBandwidthMeter r4 = r7.AudioAttributesCompatParcelizer
            o.setSurfaceTextureInternal r7 = r7.read
            o.lambdamaybeNotifySurfaceSizeChanged27 r5 = r8.write()
            o.maskWindowPositionMsOrGetPeriodPositionUs r5 = r5.getOnSeekTo()
            o.maskWindowPositionMsOrGetPeriodPositionUs r6 = kotlin.maskWindowPositionMsOrGetPeriodPositionUs.write
            if (r5 != r6) goto L79
            android.graphics.drawable.Drawable r7 = r8.IconCompatParcelizer()
            r9.RemoteActionCompatParcelizer(r7)
            goto Lc0
        L79:
            boolean r6 = r9 instanceof kotlin.lambdaupdatePlaybackInfo24
            if (r6 != 0) goto La2
            o.lambdamaybeNotifySurfaceSizeChanged27 r0 = r8.write()
            o.getPeriodPositionUsAfterTimelineChanged r0 = r0.getAudioAttributesImplApi21Parcelizer()
            o.maskWindowPositionMsOrGetPeriodPositionUs r0 = r0.MediaMetadataCompat()
            if (r0 == 0) goto L9a
            if (r7 == 0) goto L9a
            int r7 = r7.RemoteActionCompatParcelizer()
            r0 = 3
            if (r7 > r0) goto L9a
            java.util.Objects.toString(r5)
            java.util.Objects.toString(r9)
        L9a:
            android.graphics.drawable.Drawable r7 = r8.IconCompatParcelizer()
            r9.RemoteActionCompatParcelizer(r7)
            goto Lc0
        La2:
            o.lambdamaybeNotifySurfaceSizeChanged27 r7 = r8.write()
            r4.IconCompatParcelizer(r7)
            o.lambdaupdatePlaybackInfo24 r9 = (kotlin.lambdaupdatePlaybackInfo24) r9
            r0.IconCompatParcelizer = r8
            r0.AudioAttributesCompatParcelizer = r4
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r7 = r5.read(r9, r2, r0)
            if (r7 != r1) goto Lb8
            return r1
        Lb8:
            r7 = r4
        Lb9:
            o.lambdamaybeNotifySurfaceSizeChanged27 r8 = r8.write()
            r7.read(r8)
        Lc0:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access1302.read(o.lambdasetAudioSessionId9, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.addMediaSourceHolders
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.handlePlaybackInfo r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o.access1302.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.access1302$AudioAttributesCompatParcelizer r0 = (o.access1302.AudioAttributesCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.RemoteActionCompatParcelizer
            int r8 = r8 + r2
            r0.RemoteActionCompatParcelizer = r8
            goto L19
        L14:
            o.access1302$AudioAttributesCompatParcelizer r0 = new o.access1302$AudioAttributesCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.IconCompatParcelizer
            o.setBandwidthMeter r6 = (kotlin.setBandwidthMeter) r6
            java.lang.Object r7 = r0.write
            o.handlePlaybackInfo r7 = (kotlin.handlePlaybackInfo) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L94
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.lambdaupdatePlaybackInfo17 r8 = r6.RemoteActionCompatParcelizer()
            o.setBandwidthMeter r2 = r6.AudioAttributesCompatParcelizer
            o.setSurfaceTextureInternal r6 = r6.read
            o.lambdamaybeNotifySurfaceSizeChanged27 r4 = r7.write()
            o.maskWindowPositionMsOrGetPeriodPositionUs r4 = r4.getOnSeekTo()
            o.maskWindowPositionMsOrGetPeriodPositionUs r5 = kotlin.maskWindowPositionMsOrGetPeriodPositionUs.write
            if (r4 != r5) goto L55
            r7.IconCompatParcelizer()
            goto L9b
        L55:
            boolean r5 = r8 instanceof kotlin.lambdaupdatePlaybackInfo24
            if (r5 != 0) goto L7a
            o.lambdamaybeNotifySurfaceSizeChanged27 r0 = r7.write()
            o.getPeriodPositionUsAfterTimelineChanged r0 = r0.getAudioAttributesImplApi21Parcelizer()
            o.maskWindowPositionMsOrGetPeriodPositionUs r0 = r0.MediaMetadataCompat()
            if (r0 == 0) goto L76
            if (r6 == 0) goto L76
            int r6 = r6.RemoteActionCompatParcelizer()
            r0 = 3
            if (r6 > r0) goto L76
            java.util.Objects.toString(r4)
            java.util.Objects.toString(r8)
        L76:
            r7.IconCompatParcelizer()
            goto L9b
        L7a:
            o.lambdamaybeNotifySurfaceSizeChanged27 r6 = r7.write()
            r2.IconCompatParcelizer(r6)
            o.lambdaupdatePlaybackInfo24 r8 = (kotlin.lambdaupdatePlaybackInfo24) r8
            r6 = r7
            o.lambdasetRepeatMode3 r6 = (kotlin.lambdasetRepeatMode3) r6
            r0.write = r7
            r0.IconCompatParcelizer = r2
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r6 = r4.read(r8, r6, r0)
            if (r6 != r1) goto L93
            return r1
        L93:
            r6 = r2
        L94:
            o.lambdamaybeNotifySurfaceSizeChanged27 r7 = r7.write()
            r6.read(r7)
        L9b:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access1302.write(o.handlePlaybackInfo, o.SampleVideos):java.lang.Object");
    }
}
