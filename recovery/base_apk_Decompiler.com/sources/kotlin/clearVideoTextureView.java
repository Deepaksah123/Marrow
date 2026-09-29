package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class clearVideoTextureView {
    private final setSurfaceTextureInternal IconCompatParcelizer;
    private final setPlaybackLooper read;
    private final setAnalyticsCollector write;

    public clearVideoTextureView(setAnalyticsCollector setanalyticscollector, setPlaybackLooper setplaybacklooper, setSurfaceTextureInternal setsurfacetextureinternal) {
        toMagicModuleMetaRepoModel.write(setanalyticscollector, "");
        toMagicModuleMetaRepoModel.write(setplaybacklooper, "");
        this.write = setanalyticscollector;
        this.read = setplaybacklooper;
        this.IconCompatParcelizer = setsurfacetextureinternal;
    }

    public final addMediaSourceHolders RemoteActionCompatParcelizer(lambdaupdatePlaybackInfo17 lambdaupdateplaybackinfo17, int i, setBandwidthMeter setbandwidthmeter) {
        toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
        if (i == 0) {
            if (lambdaupdateplaybackinfo17 == null) {
                return setVideoSurfaceView.INSTANCE;
            }
            return lambdaupdateplaybackinfo17 instanceof lambdaupdatePlaybackInfo14 ? new access302((lambdaupdatePlaybackInfo14) lambdaupdateplaybackinfo17, this.read, setbandwidthmeter, this.IconCompatParcelizer) : new access1302(lambdaupdateplaybackinfo17, this.read, setbandwidthmeter, this.IconCompatParcelizer);
        }
        if (i != 1) {
            throw new IllegalStateException("Invalid type.".toString());
        }
        if (lambdaupdateplaybackinfo17 == null) {
            return new access1102(this.read);
        }
        return new access1302(lambdaupdateplaybackinfo17, this.read, setbandwidthmeter, this.IconCompatParcelizer);
    }

    public final access902 RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, addMediaSourceHolders addmediasourceholders, setPassingYear setpassingyear) {
        toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        toMagicModuleMetaRepoModel.write(addmediasourceholders, "");
        toMagicModuleMetaRepoModel.write(setpassingyear, "");
        anyIgnorals handleMediaPlayPauseIfPendingOnHandler = lambdamaybenotifysurfacesizechanged27.getHandleMediaPlayPauseIfPendingOnHandler();
        lambdaupdatePlaybackInfo17 onRemoveQueueItemAt = lambdamaybenotifysurfacesizechanged27.getOnRemoveQueueItemAt();
        if (onRemoveQueueItemAt instanceof lambdaupdatePlaybackInfo21) {
            createDeviceInfo createdeviceinfo = new createDeviceInfo(this.write, lambdamaybenotifysurfacesizechanged27, addmediasourceholders, setpassingyear);
            handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(createdeviceinfo);
            if (onRemoveQueueItemAt instanceof findExplicitNames) {
                findExplicitNames findexplicitnames = (findExplicitNames) onRemoveQueueItemAt;
                handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(findexplicitnames);
                handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(findexplicitnames);
            }
            lambdaupdatePlaybackInfo21 lambdaupdateplaybackinfo21 = (lambdaupdatePlaybackInfo21) onRemoveQueueItemAt;
            sendRendererMessage.RemoteActionCompatParcelizer(lambdaupdateplaybackinfo21.IconCompatParcelizer()).read(createdeviceinfo);
            if (!InvalidTypeIdException.onPlayFromSearch(lambdaupdateplaybackinfo21.IconCompatParcelizer())) {
                sendRendererMessage.RemoteActionCompatParcelizer(lambdaupdateplaybackinfo21.IconCompatParcelizer()).onViewDetachedFromWindow(lambdaupdateplaybackinfo21.IconCompatParcelizer());
            }
            return createdeviceinfo;
        }
        clearVideoSurfaceView clearvideosurfaceview = new clearVideoSurfaceView(handleMediaPlayPauseIfPendingOnHandler, setpassingyear);
        handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(clearvideosurfaceview);
        return clearvideosurfaceview;
    }
}
