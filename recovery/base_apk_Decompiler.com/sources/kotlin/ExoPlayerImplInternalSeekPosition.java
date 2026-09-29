package kotlin;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Format1;
import kotlin.stopRenderers;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplInternalSeekPosition {
    private static final Format1.AudioAttributesCompatParcelizer write = Format1.AudioAttributesCompatParcelizer.write("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", "t", "ef", "sr", CmcdConfiguration.KEY_STREAM_TYPE, "w", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "ip", "op", "tm", "cl", "hd", "ao", "bm");
    private static final Format1.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("d", CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY);
    private static final Format1.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("ty", "nm");

    public static stopRenderers IconCompatParcelizer(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        Rect rectIconCompatParcelizer = exoPlayerImplExternalSyntheticLambda19.IconCompatParcelizer();
        return new stopRenderers(Collections.emptyList(), exoPlayerImplExternalSyntheticLambda19, "__container", -1L, stopRenderers.AudioAttributesCompatParcelizer.PRE_COMP, -1L, null, Collections.emptyList(), new resetPendingPauseAtEndOfPeriod(), 0, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rectIconCompatParcelizer.width(), rectIconCompatParcelizer.height(), null, null, Collections.emptyList(), stopRenderers.RemoteActionCompatParcelizer.NONE, null, false, null, null, seekToInternal.NORMAL);
    }

    public static stopRenderers read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        float f;
        stopRenderers.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        stopRenderers.RemoteActionCompatParcelizer remoteActionCompatParcelizer = stopRenderers.RemoteActionCompatParcelizer.NONE;
        seekToInternal seektointernal = seekToInternal.NORMAL;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        format1.AudioAttributesCompatParcelizer();
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Float fValueOf2 = Float.valueOf(1.0f);
        stopRenderers.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
        seekToInternal seektointernal2 = seektointernal;
        float fAudioAttributesImplApi21Parcelizer = 1.0f;
        stopRenderers.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = null;
        String strMediaBrowserCompatSearchResultReceiver = null;
        resetRendererPosition resetrendererpositionWrite = null;
        reselectTracksInternalAndSeek reselecttracksinternalandseekWrite = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal = null;
        resolveSeekPositionUs resolveseekpositionusIconCompatParcelizer = null;
        ExoPlayerImplInternalExternalSyntheticLambda2 exoPlayerImplInternalExternalSyntheticLambda2IconCompatParcelizer = null;
        int iAudioAttributesImplBaseParcelizer = 0;
        int iAudioAttributesImplBaseParcelizer2 = 0;
        int color = 0;
        boolean zMediaBrowserCompatItemReceiver = false;
        float fAudioAttributesImplApi21Parcelizer2 = 0.0f;
        float fAudioAttributesImplApi21Parcelizer3 = 0.0f;
        float fAudioAttributesImplApi21Parcelizer4 = 0.0f;
        float fAudioAttributesImplApi21Parcelizer5 = 0.0f;
        float fRemoteActionCompatParcelizer = 0.0f;
        long jAudioAttributesImplBaseParcelizer = -1;
        resetPendingPauseAtEndOfPeriod resetpendingpauseatendofperiod = null;
        long jAudioAttributesImplBaseParcelizer2 = 0;
        String strMediaBrowserCompatSearchResultReceiver2 = null;
        String strMediaBrowserCompatSearchResultReceiver3 = "UNSET";
        boolean z2 = false;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            switch (format1.AudioAttributesCompatParcelizer(write)) {
                case 0:
                    strMediaBrowserCompatSearchResultReceiver3 = format1.MediaBrowserCompatSearchResultReceiver();
                    break;
                case 1:
                    jAudioAttributesImplBaseParcelizer2 = format1.AudioAttributesImplBaseParcelizer();
                    break;
                case 2:
                    strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
                    break;
                case 3:
                    int iAudioAttributesImplBaseParcelizer3 = format1.AudioAttributesImplBaseParcelizer();
                    if (iAudioAttributesImplBaseParcelizer3 < stopRenderers.AudioAttributesCompatParcelizer.UNKNOWN.ordinal()) {
                        audioAttributesCompatParcelizer = stopRenderers.AudioAttributesCompatParcelizer.values()[iAudioAttributesImplBaseParcelizer3];
                    } else {
                        audioAttributesCompatParcelizer = stopRenderers.AudioAttributesCompatParcelizer.UNKNOWN;
                    }
                    audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
                    break;
                case 4:
                    jAudioAttributesImplBaseParcelizer = format1.AudioAttributesImplBaseParcelizer();
                    break;
                case 5:
                    iAudioAttributesImplBaseParcelizer = (int) (format1.AudioAttributesImplBaseParcelizer() * setEncoderPadding.IconCompatParcelizer());
                    break;
                case 6:
                    iAudioAttributesImplBaseParcelizer2 = (int) (format1.AudioAttributesImplBaseParcelizer() * setEncoderPadding.IconCompatParcelizer());
                    break;
                case 7:
                    color = Color.parseColor(format1.MediaBrowserCompatSearchResultReceiver());
                    break;
                case 8:
                    resetpendingpauseatendofperiod = sendMessage.read(format1, exoPlayerImplExternalSyntheticLambda19);
                    break;
                case 9:
                    int iAudioAttributesImplBaseParcelizer4 = format1.AudioAttributesImplBaseParcelizer();
                    if (iAudioAttributesImplBaseParcelizer4 >= stopRenderers.RemoteActionCompatParcelizer.values().length) {
                        exoPlayerImplExternalSyntheticLambda19.write("Unsupported matte type: ".concat(String.valueOf(iAudioAttributesImplBaseParcelizer4)));
                    } else {
                        remoteActionCompatParcelizer2 = stopRenderers.RemoteActionCompatParcelizer.values()[iAudioAttributesImplBaseParcelizer4];
                        int i = AnonymousClass1.IconCompatParcelizer[remoteActionCompatParcelizer2.ordinal()];
                        if (i == 1) {
                            exoPlayerImplExternalSyntheticLambda19.write("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            exoPlayerImplExternalSyntheticLambda19.write("Unsupported matte type: Luma Inverted");
                        }
                        exoPlayerImplExternalSyntheticLambda19.write(1);
                    }
                    break;
                case 10:
                    format1.read();
                    while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                        arrayList3.add(ExoPlayerLibraryInfo.read(format1, exoPlayerImplExternalSyntheticLambda19));
                    }
                    exoPlayerImplExternalSyntheticLambda19.write(arrayList3.size());
                    format1.write();
                    break;
                case 11:
                    format1.read();
                    while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                        resolvePositionForPlaylistChange resolvepositionforplaylistchangeAudioAttributesCompatParcelizer = ExoPlayerImplInternalExternalSyntheticLambda0.AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                        if (resolvepositionforplaylistchangeAudioAttributesCompatParcelizer != null) {
                            arrayList4.add(resolvepositionforplaylistchangeAudioAttributesCompatParcelizer);
                        }
                    }
                    format1.write();
                    break;
                case 12:
                    format1.AudioAttributesCompatParcelizer();
                    while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                        int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer);
                        if (iAudioAttributesCompatParcelizer == 0) {
                            resetrendererpositionWrite = onContinueLoadingRequested.write(format1, exoPlayerImplExternalSyntheticLambda19);
                        } else if (iAudioAttributesCompatParcelizer == 1) {
                            format1.read();
                            if (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                                reselecttracksinternalandseekWrite = onTrackSelectionsInvalidated.write(format1, exoPlayerImplExternalSyntheticLambda19);
                            }
                            while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                                format1.RatingCompat();
                            }
                            format1.write();
                        } else {
                            format1.MediaDescriptionCompat();
                            format1.RatingCompat();
                        }
                    }
                    format1.IconCompatParcelizer();
                    break;
                case 13:
                    format1.read();
                    ArrayList arrayList5 = new ArrayList();
                    while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                        format1.AudioAttributesCompatParcelizer();
                        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                            int iAudioAttributesCompatParcelizer2 = format1.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer);
                            if (iAudioAttributesCompatParcelizer2 == 0) {
                                int iAudioAttributesImplBaseParcelizer5 = format1.AudioAttributesImplBaseParcelizer();
                                if (iAudioAttributesImplBaseParcelizer5 == 29) {
                                    resolveseekpositionusIconCompatParcelizer = onPlaylistUpdateRequested.IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                                } else if (iAudioAttributesImplBaseParcelizer5 == 25) {
                                    exoPlayerImplInternalExternalSyntheticLambda2IconCompatParcelizer = new onSleep().IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                                }
                            } else if (iAudioAttributesCompatParcelizer2 == 1) {
                                arrayList5.add(format1.MediaBrowserCompatSearchResultReceiver());
                            } else {
                                format1.MediaDescriptionCompat();
                                format1.RatingCompat();
                            }
                        }
                        format1.IconCompatParcelizer();
                    }
                    format1.write();
                    exoPlayerImplExternalSyntheticLambda19.write("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList5)));
                    break;
                case 14:
                    fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 15:
                    fAudioAttributesImplApi21Parcelizer3 = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 16:
                    fAudioAttributesImplApi21Parcelizer4 = (float) (format1.AudioAttributesImplApi21Parcelizer() * ((double) setEncoderPadding.IconCompatParcelizer()));
                    break;
                case 17:
                    fAudioAttributesImplApi21Parcelizer5 = (float) (format1.AudioAttributesImplApi21Parcelizer() * ((double) setEncoderPadding.IconCompatParcelizer()));
                    break;
                case 18:
                    fAudioAttributesImplApi21Parcelizer2 = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 19:
                    fRemoteActionCompatParcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 20:
                    mediasourcelistupdaterequestedinternal = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, false);
                    break;
                case 21:
                    strMediaBrowserCompatSearchResultReceiver2 = format1.MediaBrowserCompatSearchResultReceiver();
                    break;
                case 22:
                    zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
                    break;
                case 23:
                    z2 = format1.AudioAttributesImplBaseParcelizer() == 1;
                    break;
                case 24:
                    int iAudioAttributesImplBaseParcelizer6 = format1.AudioAttributesImplBaseParcelizer();
                    if (iAudioAttributesImplBaseParcelizer6 >= seekToInternal.values().length) {
                        exoPlayerImplExternalSyntheticLambda19.write("Unsupported Blend Mode: ".concat(String.valueOf(iAudioAttributesImplBaseParcelizer6)));
                        seektointernal2 = seekToInternal.NORMAL;
                    } else {
                        seektointernal2 = seekToInternal.values()[iAudioAttributesImplBaseParcelizer6];
                    }
                    break;
                default:
                    format1.MediaDescriptionCompat();
                    format1.RatingCompat();
                    break;
            }
        }
        format1.IconCompatParcelizer();
        ArrayList arrayList6 = new ArrayList();
        if (fAudioAttributesImplApi21Parcelizer2 > BitmapDescriptorFactory.HUE_RED) {
            arrayList = arrayList3;
            z = z2;
            arrayList2 = arrayList6;
            arrayList2.add(new setEncoderDelay(exoPlayerImplExternalSyntheticLambda19, fValueOf, fValueOf, (Interpolator) null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(fAudioAttributesImplApi21Parcelizer2)));
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            arrayList = arrayList3;
            z = z2;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (fRemoteActionCompatParcelizer <= f) {
            fRemoteActionCompatParcelizer = exoPlayerImplExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList7 = arrayList2;
        arrayList7.add(new setEncoderDelay(exoPlayerImplExternalSyntheticLambda19, fValueOf2, fValueOf2, (Interpolator) null, fAudioAttributesImplApi21Parcelizer2, Float.valueOf(fRemoteActionCompatParcelizer)));
        arrayList7.add(new setEncoderDelay(exoPlayerImplExternalSyntheticLambda19, fValueOf, fValueOf, (Interpolator) null, fRemoteActionCompatParcelizer, Float.valueOf(Float.MAX_VALUE)));
        if (strMediaBrowserCompatSearchResultReceiver3.endsWith(".ai") || "ai".equals(strMediaBrowserCompatSearchResultReceiver2)) {
            exoPlayerImplExternalSyntheticLambda19.write("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            if (resetpendingpauseatendofperiod == null) {
                resetpendingpauseatendofperiod = new resetPendingPauseAtEndOfPeriod();
            }
            resetpendingpauseatendofperiod.IconCompatParcelizer(z);
        }
        return new stopRenderers(arrayList4, exoPlayerImplExternalSyntheticLambda19, strMediaBrowserCompatSearchResultReceiver3, jAudioAttributesImplBaseParcelizer2, audioAttributesCompatParcelizer2, jAudioAttributesImplBaseParcelizer, strMediaBrowserCompatSearchResultReceiver, arrayList, resetpendingpauseatendofperiod, iAudioAttributesImplBaseParcelizer, iAudioAttributesImplBaseParcelizer2, color, fAudioAttributesImplApi21Parcelizer, fAudioAttributesImplApi21Parcelizer3, fAudioAttributesImplApi21Parcelizer4, fAudioAttributesImplApi21Parcelizer5, resetrendererpositionWrite, reselecttracksinternalandseekWrite, arrayList7, remoteActionCompatParcelizer2, mediasourcelistupdaterequestedinternal, zMediaBrowserCompatItemReceiver, resolveseekpositionusIconCompatParcelizer, exoPlayerImplInternalExternalSyntheticLambda2IconCompatParcelizer, seektointernal2);
    }

    /* JADX INFO: renamed from: o.ExoPlayerImplInternalSeekPosition$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[stopRenderers.RemoteActionCompatParcelizer.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[stopRenderers.RemoteActionCompatParcelizer.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[stopRenderers.RemoteActionCompatParcelizer.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
