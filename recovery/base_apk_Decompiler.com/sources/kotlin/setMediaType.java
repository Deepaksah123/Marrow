package kotlin;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.isRated;

/* JADX INFO: loaded from: classes2.dex */
public final class setMediaType<T> implements IllegalSeekPositionException<T, Bitmap> {
    private final access3900 AudioAttributesCompatParcelizer;
    private final AudioAttributesCompatParcelizer<T> AudioAttributesImplBaseParcelizer;
    private final IconCompatParcelizer MediaBrowserCompatItemReceiver;
    public static final isRated<Long> read = isRated.RemoteActionCompatParcelizer("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new isRated.RemoteActionCompatParcelizer<Long>() { // from class: o.setMediaType.2
        private final ByteBuffer RemoteActionCompatParcelizer = ByteBuffer.allocate(8);

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.isRated.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer.position(0);
                messageDigest.update(this.RemoteActionCompatParcelizer.putLong(l.longValue()).array());
            }
        }
    });
    private static isRated<Integer> RemoteActionCompatParcelizer = isRated.RemoteActionCompatParcelizer("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new isRated.RemoteActionCompatParcelizer<Integer>() { // from class: o.setMediaType.1
        private final ByteBuffer AudioAttributesCompatParcelizer = ByteBuffer.allocate(4);

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.isRated.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.AudioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer.position(0);
                messageDigest.update(this.AudioAttributesCompatParcelizer.putInt(num.intValue()).array());
            }
        }
    });
    private static final IconCompatParcelizer write = new IconCompatParcelizer();
    private static final List<String> IconCompatParcelizer = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    interface AudioAttributesCompatParcelizer<T> {
        void RemoteActionCompatParcelizer(MediaExtractor mediaExtractor, T t) throws IOException;

        void read(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    @Override // kotlin.IllegalSeekPositionException
    public final boolean RemoteActionCompatParcelizer(T t, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return true;
    }

    public static IllegalSeekPositionException<AssetFileDescriptor, Bitmap> IconCompatParcelizer(access3900 access3900Var) {
        return new setMediaType(access3900Var, new write((byte) 0));
    }

    public static IllegalSeekPositionException<ParcelFileDescriptor, Bitmap> RemoteActionCompatParcelizer(access3900 access3900Var) {
        return new setMediaType(access3900Var, new RemoteActionCompatParcelizer());
    }

    public static IllegalSeekPositionException<ByteBuffer, Bitmap> AudioAttributesCompatParcelizer(access3900 access3900Var) {
        return new setMediaType(access3900Var, new read());
    }

    private setMediaType(access3900 access3900Var, AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer) {
        this(access3900Var, audioAttributesCompatParcelizer, write);
    }

    private setMediaType(access3900 access3900Var, AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer, IconCompatParcelizer iconCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = access3900Var;
        this.AudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = iconCompatParcelizer;
    }

    @Override // kotlin.IllegalSeekPositionException
    public final setMimeType<Bitmap> AudioAttributesCompatParcelizer(T t, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        long jLongValue = ((Long) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(read)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: ".concat(String.valueOf(jLongValue)));
        }
        Integer num = (Integer) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(RemoteActionCompatParcelizer);
        if (num == null) {
            num = 2;
        }
        populateFromMetadata populatefrommetadata = (populateFromMetadata) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(populateFromMetadata.MediaBrowserCompatItemReceiver);
        if (populatefrommetadata == null) {
            populatefrommetadata = populateFromMetadata.read;
        }
        populateFromMetadata populatefrommetadata2 = populatefrommetadata;
        MediaMetadataRetriever mediaMetadataRetriever = IconCompatParcelizer.read();
        try {
            this.AudioAttributesImplBaseParcelizer.read(mediaMetadataRetriever, t);
            Bitmap bitmapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(t, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, populatefrommetadata2);
            mediaMetadataRetriever.close();
            return MediaMetadataBuilder.IconCompatParcelizer(bitmapRemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
        } catch (Throwable th) {
            mediaMetadataRetriever.close();
            throw th;
        }
    }

    private Bitmap RemoteActionCompatParcelizer(T t, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, populateFromMetadata populatefrommetadata) {
        if (write(t, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapAudioAttributesCompatParcelizer = (i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || populatefrommetadata == populateFromMetadata.MediaBrowserCompatCustomActionResultReceiver) ? null : AudioAttributesCompatParcelizer(mediaMetadataRetriever, j, i, i2, i3, populatefrommetadata);
        if (bitmapAudioAttributesCompatParcelizer == null) {
            bitmapAudioAttributesCompatParcelizer = IconCompatParcelizer(mediaMetadataRetriever, j, i);
        }
        Bitmap bitmap = read(mediaMetadataRetriever, bitmapAudioAttributesCompatParcelizer);
        if (bitmap != null) {
            return bitmap;
        }
        throw new MediaBrowserCompatCustomActionResultReceiver();
    }

    private static Bitmap read(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (read()) {
            try {
                if (RemoteActionCompatParcelizer(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        return bitmap;
    }

    private static boolean RemoteActionCompatParcelizer(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i = Integer.parseInt(strExtractMetadata);
        return (i == 7 || i == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    private static boolean read() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return write();
        }
        return Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33;
    }

    private static boolean write() {
        Iterator<String> it = IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static Bitmap AudioAttributesCompatParcelizer(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, populateFromMetadata populatefrommetadata) {
        try {
            int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i6 == 90 || i6 == 270) {
                i5 = i4;
                i4 = i5;
            }
            float fWrite = populatefrommetadata.write(i4, i5, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i4 * fWrite), Math.round(fWrite * i5));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Bitmap IconCompatParcelizer(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    private boolean write(T t, MediaMetadataRetriever mediaMetadataRetriever) {
        MediaExtractor mediaExtractor;
        if (Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable unused) {
                mediaExtractor = null;
            }
            if (!MimeTypes.VIDEO_WEBM.equals(mediaMetadataRetriever.extractMetadata(12))) {
                return false;
            }
            mediaExtractor = new MediaExtractor();
            try {
                this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(mediaExtractor, t);
                int trackCount = mediaExtractor.getTrackCount();
                for (int i = 0; i < trackCount; i++) {
                    if (MimeTypes.VIDEO_VP8.equals(mediaExtractor.getTrackFormat(i).getString("mime"))) {
                        mediaExtractor.release();
                        return true;
                    }
                }
            } catch (Throwable unused2) {
                if (mediaExtractor != null) {
                }
                return false;
            }
            mediaExtractor.release();
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
        }
        return false;
    }

    static class IconCompatParcelizer {
        IconCompatParcelizer() {
        }

        public static MediaMetadataRetriever read() {
            return new MediaMetadataRetriever();
        }
    }

    static final class write implements AudioAttributesCompatParcelizer<AssetFileDescriptor> {
        @Override // o.setMediaType.AudioAttributesCompatParcelizer
        public final /* synthetic */ void RemoteActionCompatParcelizer(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            IconCompatParcelizer(mediaExtractor, assetFileDescriptor);
        }

        @Override // o.setMediaType.AudioAttributesCompatParcelizer
        public final /* synthetic */ void read(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            RemoteActionCompatParcelizer(mediaMetadataRetriever, assetFileDescriptor);
        }

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        private static void RemoteActionCompatParcelizer(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        private static void IconCompatParcelizer(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    static final class RemoteActionCompatParcelizer implements AudioAttributesCompatParcelizer<ParcelFileDescriptor> {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.setMediaType.AudioAttributesCompatParcelizer
        public final /* synthetic */ void RemoteActionCompatParcelizer(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            IconCompatParcelizer(mediaExtractor, parcelFileDescriptor);
        }

        @Override // o.setMediaType.AudioAttributesCompatParcelizer
        public final /* bridge */ /* synthetic */ void read(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            read2(mediaMetadataRetriever, parcelFileDescriptor);
        }

        /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
        private static void read2(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        private static void IconCompatParcelizer(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    static final class read implements AudioAttributesCompatParcelizer<ByteBuffer> {
        read() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.setMediaType.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void read(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(IconCompatParcelizer(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.setMediaType.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(IconCompatParcelizer(byteBuffer));
        }

        private MediaDataSource IconCompatParcelizer(final ByteBuffer byteBuffer) {
            return new MediaDataSource() { // from class: o.setMediaType.read.3
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }

                @Override // android.media.MediaDataSource
                public final int readAt(long j, byte[] bArr, int i, int i2) {
                    if (j >= byteBuffer.limit()) {
                        return -1;
                    }
                    byteBuffer.position((int) j);
                    int iMin = Math.min(i2, byteBuffer.remaining());
                    byteBuffer.get(bArr, i, iMin);
                    return iMin;
                }

                @Override // android.media.MediaDataSource
                public final long getSize() {
                    return byteBuffer.limit();
                }
            };
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends RuntimeException {
        public MediaBrowserCompatCustomActionResultReceiver() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }
}
