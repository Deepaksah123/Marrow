package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class setPlayWhenReadyChangeReason {
    private static final Format1.AudioAttributesCompatParcelizer read = Format1.AudioAttributesCompatParcelizer.write("x", "y");

    static int read(Format1 format1) throws IOException {
        format1.read();
        int iAudioAttributesImplApi21Parcelizer = (int) (format1.AudioAttributesImplApi21Parcelizer() * 255.0d);
        int iAudioAttributesImplApi21Parcelizer2 = (int) (format1.AudioAttributesImplApi21Parcelizer() * 255.0d);
        int iAudioAttributesImplApi21Parcelizer3 = (int) (format1.AudioAttributesImplApi21Parcelizer() * 255.0d);
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            format1.RatingCompat();
        }
        format1.write();
        return Color.argb(255, iAudioAttributesImplApi21Parcelizer, iAudioAttributesImplApi21Parcelizer2, iAudioAttributesImplApi21Parcelizer3);
    }

    static List<PointF> IconCompatParcelizer(Format1 format1, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        format1.read();
        while (format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.BEGIN_ARRAY) {
            format1.read();
            arrayList.add(read(format1, f));
            format1.write();
        }
        format1.write();
        return arrayList;
    }

    /* JADX INFO: renamed from: o.setPlayWhenReadyChangeReason$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[Format1.IconCompatParcelizer.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[Format1.IconCompatParcelizer.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[Format1.IconCompatParcelizer.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[Format1.IconCompatParcelizer.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static PointF read(Format1 format1, float f) throws IOException {
        int i = AnonymousClass1.AudioAttributesCompatParcelizer[format1.MediaBrowserCompatMediaItem().ordinal()];
        if (i == 1) {
            return AudioAttributesCompatParcelizer(format1, f);
        }
        if (i == 2) {
            return RemoteActionCompatParcelizer(format1, f);
        }
        if (i == 3) {
            return write(format1, f);
        }
        StringBuilder sb = new StringBuilder("Unknown point starts with ");
        sb.append(format1.MediaBrowserCompatMediaItem());
        throw new IllegalArgumentException(sb.toString());
    }

    private static PointF AudioAttributesCompatParcelizer(Format1 format1, float f) throws IOException {
        float fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
        float fAudioAttributesImplApi21Parcelizer2 = (float) format1.AudioAttributesImplApi21Parcelizer();
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            format1.RatingCompat();
        }
        return new PointF(fAudioAttributesImplApi21Parcelizer * f, fAudioAttributesImplApi21Parcelizer2 * f);
    }

    private static PointF RemoteActionCompatParcelizer(Format1 format1, float f) throws IOException {
        format1.read();
        float fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
        float fAudioAttributesImplApi21Parcelizer2 = (float) format1.AudioAttributesImplApi21Parcelizer();
        while (format1.MediaBrowserCompatMediaItem() != Format1.IconCompatParcelizer.END_ARRAY) {
            format1.RatingCompat();
        }
        format1.write();
        return new PointF(fAudioAttributesImplApi21Parcelizer * f, fAudioAttributesImplApi21Parcelizer2 * f);
    }

    private static PointF write(Format1 format1, float f) throws IOException {
        format1.AudioAttributesCompatParcelizer();
        float fRemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        float fRemoteActionCompatParcelizer2 = 0.0f;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(read);
            if (iAudioAttributesCompatParcelizer == 0) {
                fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(format1);
            } else if (iAudioAttributesCompatParcelizer == 1) {
                fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(format1);
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        format1.IconCompatParcelizer();
        return new PointF(fRemoteActionCompatParcelizer * f, fRemoteActionCompatParcelizer2 * f);
    }

    static float RemoteActionCompatParcelizer(Format1 format1) throws IOException {
        Format1.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatMediaItem = format1.MediaBrowserCompatMediaItem();
        int i = AnonymousClass1.AudioAttributesCompatParcelizer[iconCompatParcelizerMediaBrowserCompatMediaItem.ordinal()];
        if (i == 1) {
            return (float) format1.AudioAttributesImplApi21Parcelizer();
        }
        if (i == 2) {
            format1.read();
            float fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
            while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                format1.RatingCompat();
            }
            format1.write();
            return fAudioAttributesImplApi21Parcelizer;
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(iconCompatParcelizerMediaBrowserCompatMediaItem)));
    }
}
