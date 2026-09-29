package kotlin;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getLength;

/* JADX INFO: loaded from: classes5.dex */
final class getPeekPosition {
    private static float RemoteActionCompatParcelizer(float f, float f2, int i) {
        return i > 0 ? f + (f2 / 2.0f) : f;
    }

    private static float write(float f, float f2, float f3, int i) {
        return i > 0 ? f2 + (f3 / 2.0f) : f;
    }

    private static float AudioAttributesCompatParcelizer(Context context) {
        return context.getResources().getDimension(calculateNextSearchBytePosition.write.m3_carousel_gone_size);
    }

    static float IconCompatParcelizer(Context context) {
        return context.getResources().getDimension(calculateNextSearchBytePosition.write.m3_carousel_small_item_size_min);
    }

    static float write(Context context) {
        return context.getResources().getDimension(calculateNextSearchBytePosition.write.m3_carousel_small_item_size_max);
    }

    static getLength IconCompatParcelizer(Context context, float f, float f2, ensureSpaceForPeek ensurespaceforpeek, int i) {
        if (i == 1) {
            return IconCompatParcelizer(context, f, f2, ensurespaceforpeek);
        }
        return AudioAttributesCompatParcelizer(context, f, f2, ensurespaceforpeek);
    }

    private static getLength AudioAttributesCompatParcelizer(Context context, float f, float f2, ensureSpaceForPeek ensurespaceforpeek) {
        float fMin = Math.min(AudioAttributesCompatParcelizer(context) + f, ensurespaceforpeek.AudioAttributesCompatParcelizer);
        float f3 = fMin / 2.0f;
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, ensurespaceforpeek.AudioAttributesCompatParcelizer, ensurespaceforpeek.IconCompatParcelizer);
        float fWrite = write(BitmapDescriptorFactory.HUE_RED, IconCompatParcelizer(fRemoteActionCompatParcelizer, ensurespaceforpeek.AudioAttributesCompatParcelizer, ensurespaceforpeek.IconCompatParcelizer), ensurespaceforpeek.AudioAttributesCompatParcelizer, ensurespaceforpeek.IconCompatParcelizer);
        float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(fWrite, ensurespaceforpeek.read, ensurespaceforpeek.write);
        float fRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(write(fWrite, fRemoteActionCompatParcelizer2, ensurespaceforpeek.read, ensurespaceforpeek.write), ensurespaceforpeek.MediaBrowserCompatCustomActionResultReceiver, ensurespaceforpeek.RemoteActionCompatParcelizer);
        float fAudioAttributesCompatParcelizer = peekFully.AudioAttributesCompatParcelizer(fMin, ensurespaceforpeek.AudioAttributesCompatParcelizer, f);
        float fAudioAttributesCompatParcelizer2 = peekFully.AudioAttributesCompatParcelizer(ensurespaceforpeek.MediaBrowserCompatCustomActionResultReceiver, ensurespaceforpeek.AudioAttributesCompatParcelizer, f);
        float fAudioAttributesCompatParcelizer3 = peekFully.AudioAttributesCompatParcelizer(ensurespaceforpeek.read, ensurespaceforpeek.AudioAttributesCompatParcelizer, f);
        getLength.write writeVarRemoteActionCompatParcelizer = new getLength.write(ensurespaceforpeek.AudioAttributesCompatParcelizer, f2).AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED - f3, fAudioAttributesCompatParcelizer, fMin).RemoteActionCompatParcelizer(fRemoteActionCompatParcelizer, BitmapDescriptorFactory.HUE_RED, ensurespaceforpeek.AudioAttributesCompatParcelizer, ensurespaceforpeek.IconCompatParcelizer, true);
        if (ensurespaceforpeek.write > 0) {
            writeVarRemoteActionCompatParcelizer.write(fRemoteActionCompatParcelizer2, fAudioAttributesCompatParcelizer3, ensurespaceforpeek.read);
        }
        if (ensurespaceforpeek.RemoteActionCompatParcelizer > 0) {
            writeVarRemoteActionCompatParcelizer.write(fRemoteActionCompatParcelizer3, fAudioAttributesCompatParcelizer2, ensurespaceforpeek.MediaBrowserCompatCustomActionResultReceiver, ensurespaceforpeek.RemoteActionCompatParcelizer);
        }
        writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(f3 + f2, fAudioAttributesCompatParcelizer, fMin);
        return writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private static getLength IconCompatParcelizer(Context context, float f, float f2, ensureSpaceForPeek ensurespaceforpeek) {
        float f3;
        float fMin = Math.min(AudioAttributesCompatParcelizer(context) + f, ensurespaceforpeek.AudioAttributesCompatParcelizer);
        float f4 = fMin / 2.0f;
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, ensurespaceforpeek.MediaBrowserCompatCustomActionResultReceiver, ensurespaceforpeek.RemoteActionCompatParcelizer);
        float fWrite = write(BitmapDescriptorFactory.HUE_RED, IconCompatParcelizer(fRemoteActionCompatParcelizer, ensurespaceforpeek.MediaBrowserCompatCustomActionResultReceiver, (int) Math.floor(ensurespaceforpeek.RemoteActionCompatParcelizer / 2.0f)), ensurespaceforpeek.MediaBrowserCompatCustomActionResultReceiver, ensurespaceforpeek.RemoteActionCompatParcelizer);
        float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(fWrite, ensurespaceforpeek.read, ensurespaceforpeek.write);
        float fWrite2 = write(fWrite, IconCompatParcelizer(fRemoteActionCompatParcelizer2, ensurespaceforpeek.read, (int) Math.floor(ensurespaceforpeek.write / 2.0f)), ensurespaceforpeek.read, ensurespaceforpeek.write);
        float fRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(fWrite2, ensurespaceforpeek.AudioAttributesCompatParcelizer, ensurespaceforpeek.IconCompatParcelizer);
        float fWrite3 = write(fWrite2, IconCompatParcelizer(fRemoteActionCompatParcelizer3, ensurespaceforpeek.AudioAttributesCompatParcelizer, ensurespaceforpeek.IconCompatParcelizer), ensurespaceforpeek.AudioAttributesCompatParcelizer, ensurespaceforpeek.IconCompatParcelizer);
        float fRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(fWrite3, ensurespaceforpeek.read, ensurespaceforpeek.write);
        float fRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(write(fWrite3, IconCompatParcelizer(fRemoteActionCompatParcelizer4, ensurespaceforpeek.read, (int) Math.ceil(ensurespaceforpeek.write / 2.0f)), ensurespaceforpeek.read, ensurespaceforpeek.write), ensurespaceforpeek.MediaBrowserCompatCustomActionResultReceiver, ensurespaceforpeek.RemoteActionCompatParcelizer);
        float fAudioAttributesCompatParcelizer = peekFully.AudioAttributesCompatParcelizer(fMin, ensurespaceforpeek.AudioAttributesCompatParcelizer, f);
        float fAudioAttributesCompatParcelizer2 = peekFully.AudioAttributesCompatParcelizer(ensurespaceforpeek.MediaBrowserCompatCustomActionResultReceiver, ensurespaceforpeek.AudioAttributesCompatParcelizer, f);
        float fAudioAttributesCompatParcelizer3 = peekFully.AudioAttributesCompatParcelizer(ensurespaceforpeek.read, ensurespaceforpeek.AudioAttributesCompatParcelizer, f);
        getLength.write writeVarAudioAttributesCompatParcelizer = new getLength.write(ensurespaceforpeek.AudioAttributesCompatParcelizer, f2).AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED - f4, fAudioAttributesCompatParcelizer, fMin);
        if (ensurespaceforpeek.RemoteActionCompatParcelizer > 0) {
            f3 = f4;
            writeVarAudioAttributesCompatParcelizer.write(fRemoteActionCompatParcelizer, fAudioAttributesCompatParcelizer2, ensurespaceforpeek.MediaBrowserCompatCustomActionResultReceiver, (int) Math.floor(ensurespaceforpeek.RemoteActionCompatParcelizer / 2.0f));
        } else {
            f3 = f4;
        }
        if (ensurespaceforpeek.write > 0) {
            writeVarAudioAttributesCompatParcelizer.write(fRemoteActionCompatParcelizer2, fAudioAttributesCompatParcelizer3, ensurespaceforpeek.read, (int) Math.floor(ensurespaceforpeek.write / 2.0f));
        }
        writeVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(fRemoteActionCompatParcelizer3, BitmapDescriptorFactory.HUE_RED, ensurespaceforpeek.AudioAttributesCompatParcelizer, ensurespaceforpeek.IconCompatParcelizer, true);
        if (ensurespaceforpeek.write > 0) {
            writeVarAudioAttributesCompatParcelizer.write(fRemoteActionCompatParcelizer4, fAudioAttributesCompatParcelizer3, ensurespaceforpeek.read, (int) Math.ceil(ensurespaceforpeek.write / 2.0f));
        }
        if (ensurespaceforpeek.RemoteActionCompatParcelizer > 0) {
            writeVarAudioAttributesCompatParcelizer.write(fRemoteActionCompatParcelizer5, fAudioAttributesCompatParcelizer2, ensurespaceforpeek.MediaBrowserCompatCustomActionResultReceiver, (int) Math.ceil(ensurespaceforpeek.RemoteActionCompatParcelizer / 2.0f));
        }
        writeVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(f3 + f2, fAudioAttributesCompatParcelizer, fMin);
        return writeVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    static int AudioAttributesCompatParcelizer(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    private static float IconCompatParcelizer(float f, float f2, int i) {
        return f + (Math.max(0, i - 1) * f2);
    }
}
