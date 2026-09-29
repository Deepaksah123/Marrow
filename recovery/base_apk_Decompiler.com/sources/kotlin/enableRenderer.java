package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public interface enableRenderer extends getFormats {
    Object IconCompatParcelizer(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, float f, int i, boolean z, SampleVideos<? super getShowPopup> sampleVideos);

    Object IconCompatParcelizer(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, int i, int i2, boolean z, float f, handleMediaSourceListInfoRefreshed handlemediasourcelistinforefreshed, float f2, boolean z2, handleLoadingMediaPeriodChanged handleloadingmediaperiodchanged, boolean z3, SampleVideos<? super getShowPopup> sampleVideos);

    public static final class IconCompatParcelizer {
        public static /* synthetic */ Object AudioAttributesCompatParcelizer(enableRenderer enablerenderer, float f, SampleVideos sampleVideos) {
            return enablerenderer.IconCompatParcelizer(enablerenderer.write(), f, 1, !(f == enablerenderer.MediaBrowserCompatCustomActionResultReceiver()), sampleVideos);
        }

        public static /* synthetic */ Object write(enableRenderer enablerenderer, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, int i, int i2, boolean z, float f, handleMediaSourceListInfoRefreshed handlemediasourcelistinforefreshed, float f2, handleLoadingMediaPeriodChanged handleloadingmediaperiodchanged, boolean z2, SampleVideos sampleVideos, int i3) {
            int iIconCompatParcelizer = (i3 & 2) != 0 ? enablerenderer.IconCompatParcelizer() : i;
            int iAudioAttributesCompatParcelizer = (i3 & 4) != 0 ? enablerenderer.AudioAttributesCompatParcelizer() : i2;
            boolean zAudioAttributesImplBaseParcelizer = (i3 & 8) != 0 ? enablerenderer.AudioAttributesImplBaseParcelizer() : z;
            float fAudioAttributesImplApi26Parcelizer = (i3 & 16) != 0 ? enablerenderer.AudioAttributesImplApi26Parcelizer() : f;
            handleMediaSourceListInfoRefreshed handlemediasourcelistinforefreshedRemoteActionCompatParcelizer = (i3 & 32) != 0 ? enablerenderer.RemoteActionCompatParcelizer() : handlemediasourcelistinforefreshed;
            return enablerenderer.IconCompatParcelizer(exoPlayerImplExternalSyntheticLambda19, iIconCompatParcelizer, iAudioAttributesCompatParcelizer, zAudioAttributesImplBaseParcelizer, fAudioAttributesImplApi26Parcelizer, handlemediasourcelistinforefreshedRemoteActionCompatParcelizer, (i3 & 64) != 0 ? extractMetadataFromTrackSelectionArray.RemoteActionCompatParcelizer(exoPlayerImplExternalSyntheticLambda19, handlemediasourcelistinforefreshedRemoteActionCompatParcelizer, fAudioAttributesImplApi26Parcelizer) : f2, false, (i3 & 256) != 0 ? handleLoadingMediaPeriodChanged.IconCompatParcelizer : handleloadingmediaperiodchanged, (i3 & 1024) != 0 ? false : z2, sampleVideos);
        }
    }
}
