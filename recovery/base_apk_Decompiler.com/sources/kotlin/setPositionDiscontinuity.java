package kotlin;

import android.graphics.Rect;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.mcq.McqParentInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Format1;
import kotlin.stopRenderers;

/* JADX INFO: loaded from: classes2.dex */
public final class setPositionDiscontinuity {
    private static final Format1.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("w", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    private static Format1.AudioAttributesCompatParcelizer read = Format1.AudioAttributesCompatParcelizer.write("id", "layers", "w", CmcdHeadersFactory.STREAMING_FORMAT_HLS, TtmlNode.TAG_P, "u");
    private static final Format1.AudioAttributesCompatParcelizer write = Format1.AudioAttributesCompatParcelizer.write("list");
    private static final Format1.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write(McqParentInfo.PARENT_TYPE_CUSTOM_MODULE, "tm", "dr");

    public static ExoPlayerImplExternalSyntheticLambda19 IconCompatParcelizer(Format1 format1) throws IOException {
        HashMap map;
        ArrayList arrayList;
        Format1 format12 = format1;
        float fIconCompatParcelizer = setEncoderPadding.IconCompatParcelizer();
        setPresenter<stopRenderers> setpresenter = new setPresenter<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        setSupportButtonTintList<maybeNotifyPlaybackInfoChanged> setsupportbuttontintlist = new setSupportButtonTintList<>();
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = new ExoPlayerImplExternalSyntheticLambda19();
        format1.AudioAttributesCompatParcelizer();
        float fAudioAttributesImplApi21Parcelizer = 0.0f;
        float fAudioAttributesImplApi21Parcelizer2 = 0.0f;
        float fAudioAttributesImplApi21Parcelizer3 = 0.0f;
        int iAudioAttributesImplApi21Parcelizer = 0;
        int iAudioAttributesImplApi21Parcelizer2 = 0;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            switch (format12.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer)) {
                case 0:
                    map = map4;
                    arrayList = arrayList3;
                    iAudioAttributesImplApi21Parcelizer2 = (int) format1.AudioAttributesImplApi21Parcelizer();
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 1:
                    iAudioAttributesImplApi21Parcelizer = (int) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 2:
                    fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 3:
                    map = map4;
                    arrayList = arrayList3;
                    fAudioAttributesImplApi21Parcelizer2 = ((float) format1.AudioAttributesImplApi21Parcelizer()) - 0.01f;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 4:
                    map = map4;
                    arrayList = arrayList3;
                    fAudioAttributesImplApi21Parcelizer3 = (float) format1.AudioAttributesImplApi21Parcelizer();
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 5:
                    String[] strArrSplit = format1.MediaBrowserCompatSearchResultReceiver().split("\\.");
                    arrayList = arrayList3;
                    if (!setEncoderPadding.write(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]))) {
                        exoPlayerImplExternalSyntheticLambda19.write("Lottie only supports bodymovin >= 4.4.0");
                    }
                    map = map4;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    RemoteActionCompatParcelizer(format12, exoPlayerImplExternalSyntheticLambda19, arrayList2, setpresenter);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    read(format12, exoPlayerImplExternalSyntheticLambda19, map2, map3);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    IconCompatParcelizer(format12, map4);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    write(format12, exoPlayerImplExternalSyntheticLambda19, setsupportbuttontintlist);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    RemoteActionCompatParcelizer(format12, arrayList3);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                default:
                    map = map4;
                    arrayList = arrayList3;
                    format1.MediaDescriptionCompat();
                    format1.RatingCompat();
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
            }
            format12 = format1;
        }
        exoPlayerImplExternalSyntheticLambda19.write(new Rect(0, 0, (int) (iAudioAttributesImplApi21Parcelizer2 * fIconCompatParcelizer), (int) (iAudioAttributesImplApi21Parcelizer * fIconCompatParcelizer)), fAudioAttributesImplApi21Parcelizer, fAudioAttributesImplApi21Parcelizer2, fAudioAttributesImplApi21Parcelizer3, arrayList2, setpresenter, map2, map3, setEncoderPadding.IconCompatParcelizer(), setsupportbuttontintlist, map4, arrayList3, iAudioAttributesImplApi21Parcelizer2, iAudioAttributesImplApi21Parcelizer);
        return exoPlayerImplExternalSyntheticLambda19;
    }

    private static void RemoteActionCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, List<stopRenderers> list, setPresenter<stopRenderers> setpresenter) throws IOException {
        format1.read();
        int i = 0;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            stopRenderers stoprenderers = ExoPlayerImplInternalSeekPosition.read(format1, exoPlayerImplExternalSyntheticLambda19);
            if (stoprenderers.AudioAttributesImplBaseParcelizer() == stopRenderers.AudioAttributesCompatParcelizer.IMAGE) {
                i++;
            }
            list.add(stoprenderers);
            setpresenter.write(stoprenderers.AudioAttributesCompatParcelizer(), stoprenderers);
            if (i > 4) {
                StringBuilder sb = new StringBuilder("You have ");
                sb.append(i);
                sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                access3000.AudioAttributesCompatParcelizer(sb.toString());
            }
        }
        format1.write();
    }

    private static void read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, Map<String, List<stopRenderers>> map, Map<String, onAudioDisabled> map2) throws IOException {
        format1.read();
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            ArrayList arrayList = new ArrayList();
            setPresenter setpresenter = new setPresenter();
            format1.AudioAttributesCompatParcelizer();
            int iAudioAttributesImplBaseParcelizer = 0;
            int iAudioAttributesImplBaseParcelizer2 = 0;
            String strMediaBrowserCompatSearchResultReceiver = null;
            String strMediaBrowserCompatSearchResultReceiver2 = null;
            String strMediaBrowserCompatSearchResultReceiver3 = null;
            while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(read);
                if (iAudioAttributesCompatParcelizer == 0) {
                    strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
                } else if (iAudioAttributesCompatParcelizer == 1) {
                    format1.read();
                    while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                        stopRenderers stoprenderers = ExoPlayerImplInternalSeekPosition.read(format1, exoPlayerImplExternalSyntheticLambda19);
                        setpresenter.write(stoprenderers.AudioAttributesCompatParcelizer(), stoprenderers);
                        arrayList.add(stoprenderers);
                    }
                    format1.write();
                } else if (iAudioAttributesCompatParcelizer == 2) {
                    iAudioAttributesImplBaseParcelizer = format1.AudioAttributesImplBaseParcelizer();
                } else if (iAudioAttributesCompatParcelizer == 3) {
                    iAudioAttributesImplBaseParcelizer2 = format1.AudioAttributesImplBaseParcelizer();
                } else if (iAudioAttributesCompatParcelizer == 4) {
                    strMediaBrowserCompatSearchResultReceiver2 = format1.MediaBrowserCompatSearchResultReceiver();
                } else if (iAudioAttributesCompatParcelizer == 5) {
                    strMediaBrowserCompatSearchResultReceiver3 = format1.MediaBrowserCompatSearchResultReceiver();
                } else {
                    format1.MediaDescriptionCompat();
                    format1.RatingCompat();
                }
            }
            format1.IconCompatParcelizer();
            if (strMediaBrowserCompatSearchResultReceiver2 != null) {
                onAudioDisabled onaudiodisabled = new onAudioDisabled(iAudioAttributesImplBaseParcelizer, iAudioAttributesImplBaseParcelizer2, strMediaBrowserCompatSearchResultReceiver, strMediaBrowserCompatSearchResultReceiver2, strMediaBrowserCompatSearchResultReceiver3);
                map2.put(onaudiodisabled.IconCompatParcelizer(), onaudiodisabled);
            } else {
                map.put(strMediaBrowserCompatSearchResultReceiver, arrayList);
            }
        }
        format1.write();
    }

    private static void IconCompatParcelizer(Format1 format1, Map<String, isUsingPlaceholderPeriod> map) throws IOException {
        format1.AudioAttributesCompatParcelizer();
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            if (format1.AudioAttributesCompatParcelizer(write) == 0) {
                format1.read();
                while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                    isUsingPlaceholderPeriod isusingplaceholderperiodIconCompatParcelizer = ExoPlayerImplInternalPendingMessageInfo.IconCompatParcelizer(format1);
                    map.put(isusingplaceholderperiodIconCompatParcelizer.AudioAttributesCompatParcelizer(), isusingplaceholderperiodIconCompatParcelizer);
                }
                format1.write();
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        format1.IconCompatParcelizer();
    }

    private static void write(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setSupportButtonTintList<maybeNotifyPlaybackInfoChanged> setsupportbuttontintlist) throws IOException {
        format1.read();
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            maybeNotifyPlaybackInfoChanged maybenotifyplaybackinfochangedWrite = ExoPlayerImplInternalMediaSourceListUpdateMessage.write(format1, exoPlayerImplExternalSyntheticLambda19);
            setsupportbuttontintlist.AudioAttributesCompatParcelizer(maybenotifyplaybackinfochangedWrite.hashCode(), maybenotifyplaybackinfochangedWrite);
        }
        format1.write();
    }

    private static void RemoteActionCompatParcelizer(Format1 format1, List<maybeUpdateLoadingPeriod> list) throws IOException {
        format1.read();
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            format1.AudioAttributesCompatParcelizer();
            float fAudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.HUE_RED;
            String strMediaBrowserCompatSearchResultReceiver = null;
            float fAudioAttributesImplApi21Parcelizer2 = 0.0f;
            while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer);
                if (iAudioAttributesCompatParcelizer == 0) {
                    strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
                } else if (iAudioAttributesCompatParcelizer == 1) {
                    fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
                } else if (iAudioAttributesCompatParcelizer == 2) {
                    fAudioAttributesImplApi21Parcelizer2 = (float) format1.AudioAttributesImplApi21Parcelizer();
                } else {
                    format1.MediaDescriptionCompat();
                    format1.RatingCompat();
                }
            }
            format1.IconCompatParcelizer();
            list.add(new maybeUpdateLoadingPeriod(strMediaBrowserCompatSearchResultReceiver, fAudioAttributesImplApi21Parcelizer, fAudioAttributesImplApi21Parcelizer2));
        }
        format1.write();
    }
}
