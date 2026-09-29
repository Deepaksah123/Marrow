package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.ExoPlayerTextComponent;
import kotlin.Metadata;
import kotlin.access2400;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00172\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00170\u00182\u0006\u0010\t\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010#J1\u0010&\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0019H\u0000¢\u0006\u0004\b&\u0010'J1\u0010\"\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010'J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020(H\u0002¢\u0006\u0004\b\"\u0010)J1\u0010\"\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0007\u001a\u00020(2\u0006\u0010\t\u001a\u00020%H\u0002¢\u0006\u0004\b\"\u0010*R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010-R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0014\u0010+\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010/R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00102\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00109\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/getCurrentCues;", "Lo/ExoPlayerTextComponent;", "Lo/setClock;", "p0", "Lo/setDeviceVolumeControlEnabled;", "p1", "Lo/setPlaybackLooper;", "p2", "Lo/addMediaSourcesInternal;", "p3", "Lo/access2300;", "p4", "Lo/buildUpdatedMediaMetadata;", "p5", "Lo/sendVolumeToRenderers;", "p6", "Lo/ExoPlayerBuilderExternalSyntheticLambda19;", "p7", "Lo/setSurfaceTextureInternal;", "p8", "<init>", "(Lo/setClock;Lo/setDeviceVolumeControlEnabled;Lo/setPlaybackLooper;Lo/addMediaSourcesInternal;Lo/access2300;Lo/buildUpdatedMediaMetadata;Lo/sendVolumeToRenderers;Lo/ExoPlayerBuilderExternalSyntheticLambda19;Lo/setSurfaceTextureInternal;)V", "Lo/lambdamaybeNotifySurfaceSizeChanged27;", "", "Lo/ExoPlayerBuilderExternalSyntheticLambda9;", "Lcoil/size/Size;", "Lcoil/memory/MemoryCache$Key;", "read", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Ljava/lang/Object;Lo/ExoPlayerBuilderExternalSyntheticLambda9;Lcoil/size/Size;)Lcoil/memory/MemoryCache$Key;", "Lo/ExoPlayerTextComponent$RemoteActionCompatParcelizer;", "Lo/lambdasetRepeatMode3;", "write", "(Lo/ExoPlayerTextComponent$RemoteActionCompatParcelizer;Lo/SampleVideos;)Ljava/lang/Object;", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)V", "Lo/access2400$RemoteActionCompatParcelizer;", "", "RemoteActionCompatParcelizer", "(Lcoil/memory/MemoryCache$Key;Lo/access2400$RemoteActionCompatParcelizer;Lo/lambdamaybeNotifySurfaceSizeChanged27;Lcoil/size/Size;)Z", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Lcoil/memory/MemoryCache$Key;Landroid/graphics/drawable/Drawable;Z)Z", "IconCompatParcelizer", "Lo/setDeviceVolumeControlEnabled;", "Lo/ExoPlayerBuilderExternalSyntheticLambda19;", "Lo/setSurfaceTextureInternal;", "Lo/access2300;", "AudioAttributesImplApi21Parcelizer", "Lo/setPlaybackLooper;", "AudioAttributesImplBaseParcelizer", "Lo/setClock;", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "Lo/buildUpdatedMediaMetadata;", "AudioAttributesImplApi26Parcelizer", "Lo/addMediaSourcesInternal;", "Lo/sendVolumeToRenderers;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getCurrentCues implements ExoPlayerTextComponent {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final access2300 IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setPlaybackLooper read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final addMediaSourcesInternal AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final ComponentRegistry MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setDeviceVolumeControlEnabled RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final sendVolumeToRenderers AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final buildUpdatedMediaMetadata AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ExoPlayerBuilderExternalSyntheticLambda19 AudioAttributesCompatParcelizer;
    private final setSurfaceTextureInternal write;

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return getCurrentCues.this.write((ExoPlayerTextComponent.RemoteActionCompatParcelizer) null, this);
        }
    }

    public getCurrentCues(ComponentRegistry componentRegistry, setDeviceVolumeControlEnabled setdevicevolumecontrolenabled, setPlaybackLooper setplaybacklooper, addMediaSourcesInternal addmediasourcesinternal, access2300 access2300Var, buildUpdatedMediaMetadata buildupdatedmediametadata, sendVolumeToRenderers sendvolumetorenderers, ExoPlayerBuilderExternalSyntheticLambda19 exoPlayerBuilderExternalSyntheticLambda19, setSurfaceTextureInternal setsurfacetextureinternal) {
        toMagicModuleMetaRepoModel.write(componentRegistry, "");
        toMagicModuleMetaRepoModel.write(setdevicevolumecontrolenabled, "");
        toMagicModuleMetaRepoModel.write(setplaybacklooper, "");
        toMagicModuleMetaRepoModel.write(addmediasourcesinternal, "");
        toMagicModuleMetaRepoModel.write(access2300Var, "");
        toMagicModuleMetaRepoModel.write(buildupdatedmediametadata, "");
        toMagicModuleMetaRepoModel.write(sendvolumetorenderers, "");
        toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda19, "");
        this.MediaBrowserCompatCustomActionResultReceiver = componentRegistry;
        this.RemoteActionCompatParcelizer = setdevicevolumecontrolenabled;
        this.read = setplaybacklooper;
        this.AudioAttributesImplApi21Parcelizer = addmediasourcesinternal;
        this.IconCompatParcelizer = access2300Var;
        this.AudioAttributesImplApi26Parcelizer = buildupdatedmediametadata;
        this.AudioAttributesImplBaseParcelizer = sendvolumetorenderers;
        this.AudioAttributesCompatParcelizer = exoPlayerBuilderExternalSyntheticLambda19;
        this.write = setsurfacetextureinternal;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // kotlin.ExoPlayerTextComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(o.ExoPlayerTextComponent.RemoteActionCompatParcelizer r20, kotlin.SampleVideos<? super kotlin.lambdasetRepeatMode3> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCurrentCues.write(o.ExoPlayerTextComponent$RemoteActionCompatParcelizer, o.SampleVideos):java.lang.Object");
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super lambdasetAudioSessionId9>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ Size AudioAttributesImplBaseParcelizer;
        private /* synthetic */ setBandwidthMeter IconCompatParcelizer;
        private /* synthetic */ lambdamaybeNotifySurfaceSizeChanged27 MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ access2400.RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver;
        private Object MediaBrowserCompatMediaItem;
        private Object MediaBrowserCompatSearchResultReceiver;
        private Object MediaDescriptionCompat;
        private Object MediaMetadataCompat;
        private Object RatingCompat;
        private /* synthetic */ ExoPlayerTextComponent.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        private int handleMediaPlayPauseIfPendingOnHandler;
        private Object onCommand;
        private Object onCustomAction;
        private /* synthetic */ MemoryCache.Key read;
        private /* synthetic */ ExoPlayerBuilderExternalSyntheticLambda9<Object> write;

        /* JADX WARN: Removed duplicated region for block: B:108:0x02b1 A[EDGE_INSN: B:108:0x02b1->B:75:0x02b1 BREAK  A[LOOP:0: B:73:0x02a6->B:72:0x027e], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x027e A[LOOP:0: B:73:0x02a6->B:72:0x027e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x02f7  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02fa  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02fd  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0331  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x033d  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 848
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getCurrentCues.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, access2400.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Object obj, ExoPlayerBuilderExternalSyntheticLambda9<Object> exoPlayerBuilderExternalSyntheticLambda9, ExoPlayerTextComponent.RemoteActionCompatParcelizer remoteActionCompatParcelizer2, Size size, setBandwidthMeter setbandwidthmeter, MemoryCache.Key key, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.MediaBrowserCompatCustomActionResultReceiver = lambdamaybenotifysurfacesizechanged27;
            this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer;
            this.AudioAttributesCompatParcelizer = obj;
            this.write = exoPlayerBuilderExternalSyntheticLambda9;
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
            this.AudioAttributesImplBaseParcelizer = size;
            this.IconCompatParcelizer = setbandwidthmeter;
            this.read = key;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getCurrentCues.this.new write(this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super lambdasetAudioSessionId9> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static MemoryCache.Key read(lambdamaybeNotifySurfaceSizeChanged27 p0, Object p1, ExoPlayerBuilderExternalSyntheticLambda9<Object> p2, Size p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        String strRemoteActionCompatParcelizer = p2.RemoteActionCompatParcelizer(p1);
        if (strRemoteActionCompatParcelizer == null) {
            return null;
        }
        if (p0.onPrepareFromSearch().isEmpty()) {
            MemoryCache.Key.Companion companion = MemoryCache.Key.INSTANCE;
            return new MemoryCache.Key.Complex(strRemoteActionCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), null, p0.getOnFastForward().read());
        }
        MemoryCache.Key.Companion companion2 = MemoryCache.Key.INSTANCE;
        List<lambdaupdatePlaybackInfo23> listOnPrepareFromSearch = p0.onPrepareFromSearch();
        lambdasetShuffleModeEnabled4 onFastForward = p0.getOnFastForward();
        ArrayList arrayList = new ArrayList(listOnPrepareFromSearch.size());
        int size = listOnPrepareFromSearch.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(listOnPrepareFromSearch.get(i).IconCompatParcelizer());
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return new MemoryCache.Key.Complex(strRemoteActionCompatParcelizer, arrayList, p3, onFastForward.read());
    }

    private boolean RemoteActionCompatParcelizer(MemoryCache.Key p0, access2400.RemoteActionCompatParcelizer p1, lambdamaybeNotifySurfaceSizeChanged27 p2, Size p3) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        if (!AudioAttributesCompatParcelizer(p0, p1, p2, p3)) {
            return false;
        }
        if (buildUpdatedMediaMetadata.read(p2, maybeNotifySurfaceSizeChanged.AudioAttributesCompatParcelizer(p1.write()))) {
            return true;
        }
        setSurfaceTextureInternal setsurfacetextureinternal = this.write;
        if (setsurfacetextureinternal != null && setsurfacetextureinternal.RemoteActionCompatParcelizer() <= 3) {
            Objects.toString(p2.getAudioAttributesImplApi26Parcelizer());
        }
        return false;
    }

    private final boolean AudioAttributesCompatParcelizer(MemoryCache.Key p0, access2400.RemoteActionCompatParcelizer p1, lambdamaybeNotifySurfaceSizeChanged27 p2, Size p3) {
        int height;
        int read;
        if (p3 instanceof OriginalSize) {
            if (p1.AudioAttributesCompatParcelizer()) {
                setSurfaceTextureInternal setsurfacetextureinternal = this.write;
                if (setsurfacetextureinternal != null && setsurfacetextureinternal.RemoteActionCompatParcelizer() <= 3) {
                    Objects.toString(p2.getAudioAttributesImplApi26Parcelizer());
                }
                return false;
            }
        } else if (p3 instanceof PixelSize) {
            MemoryCache.Key.Complex complex = p0 instanceof MemoryCache.Key.Complex ? (MemoryCache.Key.Complex) p0 : null;
            Size write2 = complex != null ? complex.getWrite() : null;
            if (write2 instanceof PixelSize) {
                PixelSize pixelSize = (PixelSize) write2;
                read = pixelSize.getRead();
                height = pixelSize.getWrite();
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write2, OriginalSize.INSTANCE) || write2 == null) {
                Bitmap bitmapWrite = p1.write();
                int width = bitmapWrite.getWidth();
                height = bitmapWrite.getHeight();
                read = width;
            } else {
                throw new RenewEligibleCreator();
            }
            PixelSize pixelSize2 = (PixelSize) p3;
            if (Math.abs(read - pixelSize2.getRead()) <= 1 && Math.abs(height - pixelSize2.getWrite()) <= 1) {
                return true;
            }
            ExoPlayerBuilderExternalSyntheticLambda22 exoPlayerBuilderExternalSyntheticLambda22 = ExoPlayerBuilderExternalSyntheticLambda22.INSTANCE;
            double d = ExoPlayerBuilderExternalSyntheticLambda22.read(read, height, pixelSize2.getRead(), pixelSize2.getWrite(), p2.getOnPrepare());
            if (d != 1.0d && !periodPositionUsToWindowPositionUs.RemoteActionCompatParcelizer(p2)) {
                setSurfaceTextureInternal setsurfacetextureinternal2 = this.write;
                if (setsurfacetextureinternal2 != null && setsurfacetextureinternal2.RemoteActionCompatParcelizer() <= 3) {
                    Objects.toString(p2.getAudioAttributesImplApi26Parcelizer());
                    pixelSize2.getRead();
                    pixelSize2.getWrite();
                    Objects.toString(p2.getOnPrepare());
                }
                return false;
            }
            if (d > 1.0d && p1.AudioAttributesCompatParcelizer()) {
                setSurfaceTextureInternal setsurfacetextureinternal3 = this.write;
                if (setsurfacetextureinternal3 != null && setsurfacetextureinternal3.RemoteActionCompatParcelizer() <= 3) {
                    Objects.toString(p2.getAudioAttributesImplApi26Parcelizer());
                    pixelSize2.getRead();
                    pixelSize2.getWrite();
                    Objects.toString(p2.getOnPrepare());
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(Object p0) {
        if (!(p0 instanceof BitmapDrawable)) {
            if (p0 instanceof Bitmap) {
                this.read.read((Bitmap) p0, false);
            }
        } else {
            setPlaybackLooper setplaybacklooper = this.read;
            Bitmap bitmap = ((BitmapDrawable) p0).getBitmap();
            if (bitmap != null) {
                setplaybacklooper.read(bitmap, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(Drawable p0) {
        BitmapDrawable bitmapDrawable = p0 instanceof BitmapDrawable ? (BitmapDrawable) p0 : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap != null) {
            this.read.read(bitmap, true);
            this.read.AudioAttributesCompatParcelizer(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AudioAttributesCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0, MemoryCache.Key p1, Drawable p2, boolean p3) {
        if (p0.getOnPause().getRemoteActionCompatParcelizer() && p1 != null) {
            BitmapDrawable bitmapDrawable = p2 instanceof BitmapDrawable ? (BitmapDrawable) p2 : null;
            Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
            if (bitmap != null) {
                this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(p1, bitmap, p3);
                return true;
            }
        }
        return false;
    }
}
