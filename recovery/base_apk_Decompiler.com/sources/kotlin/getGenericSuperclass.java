package kotlin;

import androidx.media3.extractor.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import kotlin.C0170format;

/* JADX INFO: loaded from: classes2.dex */
public final class getGenericSuperclass {
    public final int AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi21Parcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final int AudioAttributesImplBaseParcelizer;
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatCustomActionResultReceiver;
    public final IconCompatParcelizer MediaBrowserCompatItemReceiver;
    private final androidx.media3.common.Metadata MediaDescriptionCompat;
    public final long RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int write;

    private static int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    private static int write(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static class IconCompatParcelizer {
        public final long[] AudioAttributesCompatParcelizer;
        public final long[] write;

        public IconCompatParcelizer(long[] jArr, long[] jArr2) {
            this.write = jArr;
            this.AudioAttributesCompatParcelizer = jArr2;
        }
    }

    public getGenericSuperclass(byte[] bArr, int i) {
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer(bArr);
        asExternalTypeSerializer.read(i << 3);
        this.AudioAttributesImplBaseParcelizer = asExternalTypeSerializer.IconCompatParcelizer(16);
        this.write = asExternalTypeSerializer.IconCompatParcelizer(16);
        this.AudioAttributesImplApi21Parcelizer = asExternalTypeSerializer.IconCompatParcelizer(24);
        this.RemoteActionCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(24);
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(20);
        this.MediaBrowserCompatCustomActionResultReceiver = iIconCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer(iIconCompatParcelizer);
        this.AudioAttributesCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(3) + 1;
        int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(5) + 1;
        this.IconCompatParcelizer = iIconCompatParcelizer2;
        this.read = write(iIconCompatParcelizer2);
        this.RatingCompat = asExternalTypeSerializer.AudioAttributesCompatParcelizer(36);
        this.MediaBrowserCompatItemReceiver = null;
        this.MediaDescriptionCompat = null;
    }

    private getGenericSuperclass(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, IconCompatParcelizer iconCompatParcelizer, androidx.media3.common.Metadata metadata) {
        this.AudioAttributesImplBaseParcelizer = i;
        this.write = i2;
        this.AudioAttributesImplApi21Parcelizer = i3;
        this.RemoteActionCompatParcelizer = i4;
        this.MediaBrowserCompatCustomActionResultReceiver = i5;
        this.AudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer(i5);
        this.AudioAttributesCompatParcelizer = i6;
        this.IconCompatParcelizer = i7;
        this.read = write(i7);
        this.RatingCompat = j;
        this.MediaBrowserCompatItemReceiver = iconCompatParcelizer;
        this.MediaDescriptionCompat = metadata;
    }

    public final long write() {
        long j = this.RatingCompat;
        return j == 0 ? C.TIME_UNSET : (j * 1000000) / ((long) this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final long AudioAttributesCompatParcelizer(long j) {
        return LaissezFaireSubTypeValidator.read((j * ((long) this.MediaBrowserCompatCustomActionResultReceiver)) / 1000000, 0L, this.RatingCompat - 1);
    }

    public final long IconCompatParcelizer() {
        long j;
        long j2;
        int i = this.RemoteActionCompatParcelizer;
        if (i > 0) {
            j = (((long) i) + ((long) this.AudioAttributesImplApi21Parcelizer)) / 2;
            j2 = 1;
        } else {
            int i2 = this.AudioAttributesImplBaseParcelizer;
            j = ((((i2 != this.write || i2 <= 0) ? 4096L : i2) * ((long) this.AudioAttributesCompatParcelizer)) * ((long) this.IconCompatParcelizer)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public final C0170format read(byte[] bArr, androidx.media3.common.Metadata metadata) {
        bArr[4] = -128;
        int i = this.RemoteActionCompatParcelizer;
        if (i <= 0) {
            i = -1;
        }
        return new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_FLAC).AudioAttributesImplApi26Parcelizer(i).read(this.AudioAttributesCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver).RatingCompat(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)).RemoteActionCompatParcelizer(Collections.singletonList(bArr)).read(read(metadata)).IconCompatParcelizer();
    }

    private androidx.media3.common.Metadata read(androidx.media3.common.Metadata metadata) {
        androidx.media3.common.Metadata metadata2 = this.MediaDescriptionCompat;
        return metadata2 == null ? metadata : metadata2.RemoteActionCompatParcelizer(metadata);
    }

    public final getGenericSuperclass RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        return new getGenericSuperclass(this.AudioAttributesImplBaseParcelizer, this.write, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RatingCompat, iconCompatParcelizer, this.MediaDescriptionCompat);
    }

    public final getGenericSuperclass AudioAttributesCompatParcelizer(List<String> list) {
        return new getGenericSuperclass(this.AudioAttributesImplBaseParcelizer, this.write, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RatingCompat, this.MediaBrowserCompatItemReceiver, read(primitiveType.read(list)));
    }

    public final getGenericSuperclass RemoteActionCompatParcelizer(List<PictureFrame> list) {
        return new getGenericSuperclass(this.AudioAttributesImplBaseParcelizer, this.write, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RatingCompat, this.MediaBrowserCompatItemReceiver, read(new androidx.media3.common.Metadata(list)));
    }
}
