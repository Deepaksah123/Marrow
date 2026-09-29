package kotlin;

import android.graphics.PointF;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import kotlin.Format1;
import kotlin.isTimelineReady;

/* JADX INFO: loaded from: classes2.dex */
public final class setPauseAtEndOfWindow implements copyWithCryptoType<isTimelineReady> {
    public static final setPauseAtEndOfWindow read = new setPauseAtEndOfWindow();
    private static final Format1.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("t", "f", CmcdHeadersFactory.STREAMING_FORMAT_SS, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // kotlin.copyWithCryptoType
    public final /* synthetic */ isTimelineReady AudioAttributesCompatParcelizer(Format1 format1, float f) throws IOException {
        return IconCompatParcelizer(format1, f);
    }

    private setPauseAtEndOfWindow() {
    }

    private static isTimelineReady IconCompatParcelizer(Format1 format1, float f) throws IOException {
        isTimelineReady.RemoteActionCompatParcelizer remoteActionCompatParcelizer = isTimelineReady.RemoteActionCompatParcelizer.CENTER;
        format1.AudioAttributesCompatParcelizer();
        isTimelineReady.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
        String strMediaBrowserCompatSearchResultReceiver = null;
        String strMediaBrowserCompatSearchResultReceiver2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fAudioAttributesImplApi21Parcelizer = 0.0f;
        float fAudioAttributesImplApi21Parcelizer2 = 0.0f;
        float fAudioAttributesImplApi21Parcelizer3 = 0.0f;
        float fAudioAttributesImplApi21Parcelizer4 = 0.0f;
        int iAudioAttributesImplBaseParcelizer = 0;
        int i = 0;
        int i2 = 0;
        boolean zMediaBrowserCompatItemReceiver = true;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            switch (format1.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer)) {
                case 0:
                    strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
                    break;
                case 1:
                    strMediaBrowserCompatSearchResultReceiver2 = format1.MediaBrowserCompatSearchResultReceiver();
                    break;
                case 2:
                    fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 3:
                    int iAudioAttributesImplBaseParcelizer2 = format1.AudioAttributesImplBaseParcelizer();
                    if (iAudioAttributesImplBaseParcelizer2 > isTimelineReady.RemoteActionCompatParcelizer.CENTER.ordinal() || iAudioAttributesImplBaseParcelizer2 < 0) {
                        remoteActionCompatParcelizer2 = isTimelineReady.RemoteActionCompatParcelizer.CENTER;
                    } else {
                        remoteActionCompatParcelizer2 = isTimelineReady.RemoteActionCompatParcelizer.values()[iAudioAttributesImplBaseParcelizer2];
                    }
                    break;
                case 4:
                    iAudioAttributesImplBaseParcelizer = format1.AudioAttributesImplBaseParcelizer();
                    break;
                case 5:
                    fAudioAttributesImplApi21Parcelizer2 = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 6:
                    fAudioAttributesImplApi21Parcelizer3 = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 7:
                    i = setPlayWhenReadyChangeReason.read(format1);
                    break;
                case 8:
                    i2 = setPlayWhenReadyChangeReason.read(format1);
                    break;
                case 9:
                    fAudioAttributesImplApi21Parcelizer4 = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 10:
                    zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
                    break;
                case 11:
                    format1.read();
                    PointF pointF3 = new PointF(((float) format1.AudioAttributesImplApi21Parcelizer()) * f, ((float) format1.AudioAttributesImplApi21Parcelizer()) * f);
                    format1.write();
                    pointF = pointF3;
                    break;
                case 12:
                    format1.read();
                    PointF pointF4 = new PointF(((float) format1.AudioAttributesImplApi21Parcelizer()) * f, ((float) format1.AudioAttributesImplApi21Parcelizer()) * f);
                    format1.write();
                    pointF2 = pointF4;
                    break;
                default:
                    format1.MediaDescriptionCompat();
                    format1.RatingCompat();
                    break;
            }
        }
        format1.IconCompatParcelizer();
        return new isTimelineReady(strMediaBrowserCompatSearchResultReceiver, strMediaBrowserCompatSearchResultReceiver2, fAudioAttributesImplApi21Parcelizer, remoteActionCompatParcelizer2, iAudioAttributesImplBaseParcelizer, fAudioAttributesImplApi21Parcelizer2, fAudioAttributesImplApi21Parcelizer3, i, i2, fAudioAttributesImplApi21Parcelizer4, zMediaBrowserCompatItemReceiver, pointF, pointF2);
    }
}
