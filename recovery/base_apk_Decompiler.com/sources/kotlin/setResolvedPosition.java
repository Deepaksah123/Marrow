package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Format1;
import kotlin.setSeekParametersInternal;

/* JADX INFO: loaded from: classes2.dex */
final class setResolvedPosition {
    private static final Format1.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("nm", "g", "o", "t", CmcdHeadersFactory.STREAMING_FORMAT_SS, "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final Format1.AudioAttributesCompatParcelizer IconCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write(TtmlNode.TAG_P, "k");
    private static final Format1.AudioAttributesCompatParcelizer write = Format1.AudioAttributesCompatParcelizer.write("n", "v");

    static seekToCurrentPosition read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        String str;
        notifyTrackSelectionDiscontinuity notifytrackselectiondiscontinuity;
        ArrayList arrayList = new ArrayList();
        float fAudioAttributesImplApi21Parcelizer = 0.0f;
        String strMediaBrowserCompatSearchResultReceiver = null;
        seekToPeriodPosition seektoperiodposition = null;
        notifyTrackSelectionDiscontinuity notifytrackselectiondiscontinuity2 = null;
        releaseInternal releaseinternal = null;
        releaseInternal releaseinternal2 = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer = null;
        setSeekParametersInternal.IconCompatParcelizer iconCompatParcelizer = null;
        setSeekParametersInternal.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal = null;
        boolean zMediaBrowserCompatItemReceiver = false;
        notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychanged = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            switch (format1.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer)) {
                case 0:
                    strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
                    continue;
                case 1:
                    str = strMediaBrowserCompatSearchResultReceiver;
                    format1.AudioAttributesCompatParcelizer();
                    int iAudioAttributesImplBaseParcelizer = -1;
                    while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                        int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(IconCompatParcelizer);
                        if (iAudioAttributesCompatParcelizer != 0) {
                            notifytrackselectiondiscontinuity = notifytrackselectiondiscontinuity2;
                            if (iAudioAttributesCompatParcelizer == 1) {
                                notifytrackselectiondiscontinuity = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, iAudioAttributesImplBaseParcelizer);
                            } else {
                                format1.MediaDescriptionCompat();
                                format1.RatingCompat();
                            }
                        } else {
                            notifytrackselectiondiscontinuity = notifytrackselectiondiscontinuity2;
                            iAudioAttributesImplBaseParcelizer = format1.AudioAttributesImplBaseParcelizer();
                        }
                        notifytrackselectiondiscontinuity2 = notifytrackselectiondiscontinuity;
                    }
                    format1.IconCompatParcelizer();
                    break;
                case 2:
                    notifytrackselectionplaywhenreadychanged = onContinueLoadingRequested.IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                    continue;
                case 3:
                    str = strMediaBrowserCompatSearchResultReceiver;
                    seektoperiodposition = format1.AudioAttributesImplBaseParcelizer() == 1 ? seekToPeriodPosition.LINEAR : seekToPeriodPosition.RADIAL;
                    break;
                case 4:
                    releaseinternal = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19);
                    continue;
                case 5:
                    releaseinternal2 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19);
                    continue;
                case 6:
                    mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer = onContinueLoadingRequested.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                    continue;
                case 7:
                    str = strMediaBrowserCompatSearchResultReceiver;
                    iconCompatParcelizer = setSeekParametersInternal.IconCompatParcelizer.values()[format1.AudioAttributesImplBaseParcelizer() - 1];
                    break;
                case 8:
                    str = strMediaBrowserCompatSearchResultReceiver;
                    remoteActionCompatParcelizer = setSeekParametersInternal.RemoteActionCompatParcelizer.values()[format1.AudioAttributesImplBaseParcelizer() - 1];
                    break;
                case 9:
                    str = strMediaBrowserCompatSearchResultReceiver;
                    fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 10:
                    zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
                    continue;
                case 11:
                    format1.read();
                    while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                        format1.AudioAttributesCompatParcelizer();
                        String strMediaBrowserCompatSearchResultReceiver2 = null;
                        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2 = null;
                        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                            int iAudioAttributesCompatParcelizer2 = format1.AudioAttributesCompatParcelizer(write);
                            if (iAudioAttributesCompatParcelizer2 != 0) {
                                mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2 = mediasourcelistupdaterequestedinternal;
                                if (iAudioAttributesCompatParcelizer2 == 1) {
                                    mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2 = onContinueLoadingRequested.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                                } else {
                                    format1.MediaDescriptionCompat();
                                    format1.RatingCompat();
                                }
                                mediasourcelistupdaterequestedinternal = mediasourcelistupdaterequestedinternal2;
                            } else {
                                strMediaBrowserCompatSearchResultReceiver2 = format1.MediaBrowserCompatSearchResultReceiver();
                            }
                        }
                        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal3 = mediasourcelistupdaterequestedinternal;
                        format1.IconCompatParcelizer();
                        if (strMediaBrowserCompatSearchResultReceiver2.equals("o")) {
                            mediasourcelistupdaterequestedinternal = mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2;
                        } else {
                            if (strMediaBrowserCompatSearchResultReceiver2.equals("d") || strMediaBrowserCompatSearchResultReceiver2.equals("g")) {
                                exoPlayerImplExternalSyntheticLambda19.MediaBrowserCompatSearchResultReceiver();
                                arrayList.add(mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2);
                            }
                            mediasourcelistupdaterequestedinternal = mediasourcelistupdaterequestedinternal3;
                        }
                    }
                    mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal4 = mediasourcelistupdaterequestedinternal;
                    format1.write();
                    if (arrayList.size() == 1) {
                        arrayList.add((mediaSourceListUpdateRequestedInternal) arrayList.get(0));
                    }
                    mediasourcelistupdaterequestedinternal = mediasourcelistupdaterequestedinternal4;
                    continue;
                default:
                    str = strMediaBrowserCompatSearchResultReceiver;
                    format1.MediaDescriptionCompat();
                    format1.RatingCompat();
                    break;
            }
            strMediaBrowserCompatSearchResultReceiver = str;
        }
        String str2 = strMediaBrowserCompatSearchResultReceiver;
        if (notifytrackselectionplaywhenreadychanged == null) {
            notifytrackselectionplaywhenreadychanged = new notifyTrackSelectionPlayWhenReadyChanged(Collections.singletonList(new setEncoderDelay(100)));
        }
        return new seekToCurrentPosition(str2, seektoperiodposition, notifytrackselectiondiscontinuity2, notifytrackselectionplaywhenreadychanged, releaseinternal, releaseinternal2, mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer, iconCompatParcelizer, remoteActionCompatParcelizer, fAudioAttributesImplApi21Parcelizer, arrayList, mediasourcelistupdaterequestedinternal, zMediaBrowserCompatItemReceiver);
    }
}
