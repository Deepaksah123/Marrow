package kotlin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImplInternalPositionUpdateForPlaylistChange {
    private static Format1.AudioAttributesCompatParcelizer IconCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("k");

    static <T> List<setEncoderDelay<T>> AudioAttributesCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, float f, copyWithCryptoType<T> copywithcryptotype, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.STRING) {
            exoPlayerImplExternalSyntheticLambda19.write("Lottie doesn't support expressions.");
            return arrayList;
        }
        format1.AudioAttributesCompatParcelizer();
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            if (format1.AudioAttributesCompatParcelizer(IconCompatParcelizer) == 0) {
                if (format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.BEGIN_ARRAY) {
                    format1.read();
                    if (format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.NUMBER) {
                        arrayList.add(incrementPendingOperationAcks.read(format1, exoPlayerImplExternalSyntheticLambda19, f, copywithcryptotype, false, z));
                    } else {
                        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                            arrayList.add(incrementPendingOperationAcks.read(format1, exoPlayerImplExternalSyntheticLambda19, f, copywithcryptotype, true, z));
                        }
                    }
                    format1.write();
                } else {
                    arrayList.add(incrementPendingOperationAcks.read(format1, exoPlayerImplExternalSyntheticLambda19, f, copywithcryptotype, false, z));
                }
            } else {
                format1.RatingCompat();
            }
        }
        format1.IconCompatParcelizer();
        IconCompatParcelizer(arrayList);
        return arrayList;
    }

    public static <T> void IconCompatParcelizer(List<? extends setEncoderDelay<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            setEncoderDelay<T> setencoderdelay = list.get(i2);
            i2++;
            setEncoderDelay<T> setencoderdelay2 = list.get(i2);
            setencoderdelay.write = Float.valueOf(setencoderdelay2.AudioAttributesImplApi26Parcelizer);
            if (setencoderdelay.IconCompatParcelizer == null && setencoderdelay2.MediaBrowserCompatCustomActionResultReceiver != null) {
                setencoderdelay.IconCompatParcelizer = setencoderdelay2.MediaBrowserCompatCustomActionResultReceiver;
                if (setencoderdelay instanceof ExoPlayerImplInternal) {
                    ((ExoPlayerImplInternal) setencoderdelay).write();
                }
            }
        }
        setEncoderDelay<T> setencoderdelay3 = list.get(i);
        if ((setencoderdelay3.MediaBrowserCompatCustomActionResultReceiver == null || setencoderdelay3.IconCompatParcelizer == null) && list.size() > 1) {
            list.remove(setencoderdelay3);
        }
    }
}
