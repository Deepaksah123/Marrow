package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import kotlin.populateFromMetadata;
import kotlin.setFolderType;

/* JADX INFO: loaded from: classes2.dex */
public final class setAlbumTitle {
    private static final Queue<BitmapFactory.Options> AudioAttributesImplApi26Parcelizer;
    private static isRated<Boolean> RemoteActionCompatParcelizer;
    private static final AudioAttributesCompatParcelizer read;
    public static final isRated<Boolean> write;
    private final setCompilation AudioAttributesImplApi21Parcelizer = setCompilation.read();
    private final setSubtitleConfigurations AudioAttributesImplBaseParcelizer;
    private final DisplayMetrics MediaBrowserCompatCustomActionResultReceiver;
    private final access3900 MediaBrowserCompatItemReceiver;
    private final List<ImageHeaderParser> MediaBrowserCompatSearchResultReceiver;
    public static final isRated<onTrackSelectionParametersChanged> IconCompatParcelizer = isRated.AudioAttributesCompatParcelizer("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", onTrackSelectionParametersChanged.AudioAttributesCompatParcelizer);
    public static final isRated<HeartRating> AudioAttributesCompatParcelizer = isRated.write("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    public interface AudioAttributesCompatParcelizer {
        void AudioAttributesCompatParcelizer();

        void write(access3900 access3900Var, Bitmap bitmap) throws IOException;
    }

    public static boolean IconCompatParcelizer() {
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(int i) {
        return i == 90 || i == 270;
    }

    private static int write(double d) {
        return (int) (d + 0.5d);
    }

    public static boolean write() {
        return true;
    }

    static {
        isRated<populateFromMetadata> israted = populateFromMetadata.MediaBrowserCompatItemReceiver;
        Boolean bool = Boolean.FALSE;
        RemoteActionCompatParcelizer = isRated.AudioAttributesCompatParcelizer("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        write = isRated.AudioAttributesCompatParcelizer("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        read = new AudioAttributesCompatParcelizer() { // from class: o.setAlbumTitle.2
            @Override // o.setAlbumTitle.AudioAttributesCompatParcelizer
            public final void AudioAttributesCompatParcelizer() {
            }

            @Override // o.setAlbumTitle.AudioAttributesCompatParcelizer
            public final void write(access3900 access3900Var, Bitmap bitmap) {
            }
        };
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        AudioAttributesImplApi26Parcelizer = moveMediaSourceRange.write(0);
    }

    public setAlbumTitle(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, access3900 access3900Var, setSubtitleConfigurations setsubtitleconfigurations) {
        this.MediaBrowserCompatSearchResultReceiver = list;
        this.MediaBrowserCompatCustomActionResultReceiver = (DisplayMetrics) moveMediaSource.AudioAttributesCompatParcelizer(displayMetrics);
        this.MediaBrowserCompatItemReceiver = (access3900) moveMediaSource.AudioAttributesCompatParcelizer(access3900Var);
        this.AudioAttributesImplBaseParcelizer = (setSubtitleConfigurations) moveMediaSource.AudioAttributesCompatParcelizer(setsubtitleconfigurations);
    }

    public static boolean AudioAttributesCompatParcelizer() {
        return ParcelFileDescriptorRewinder.AudioAttributesCompatParcelizer();
    }

    public final setMimeType<Bitmap> RemoteActionCompatParcelizer(ByteBuffer byteBuffer, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return write(new setFolderType.read(byteBuffer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk, read);
    }

    public final setMimeType<Bitmap> RemoteActionCompatParcelizer(InputStream inputStream, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
        return write(new setFolderType.IconCompatParcelizer(inputStream, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk, audioAttributesCompatParcelizer);
    }

    public final setMimeType<Bitmap> IconCompatParcelizer(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return write(new setFolderType.AudioAttributesCompatParcelizer(parcelFileDescriptor, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk, read);
    }

    private setMimeType<Bitmap> write(setFolderType setfoldertype, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
        byte[] bArr = (byte[]) this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
        BitmapFactory.Options optionsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        optionsRemoteActionCompatParcelizer.inTempStorage = bArr;
        onTrackSelectionParametersChanged ontrackselectionparameterschanged = (onTrackSelectionParametersChanged) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(IconCompatParcelizer);
        HeartRating heartRating = (HeartRating) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(AudioAttributesCompatParcelizer);
        populateFromMetadata populatefrommetadata = (populateFromMetadata) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(populateFromMetadata.MediaBrowserCompatItemReceiver);
        boolean zBooleanValue = ((Boolean) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(RemoteActionCompatParcelizer)).booleanValue();
        isRated<Boolean> israted = write;
        try {
            return MediaMetadataBuilder.IconCompatParcelizer(AudioAttributesCompatParcelizer(setfoldertype, optionsRemoteActionCompatParcelizer, populatefrommetadata, ontrackselectionparameterschanged, heartRating, r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(israted) != null && ((Boolean) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(israted)).booleanValue(), i, i2, zBooleanValue, audioAttributesCompatParcelizer), this.MediaBrowserCompatItemReceiver);
        } finally {
            AudioAttributesCompatParcelizer(optionsRemoteActionCompatParcelizer);
            this.AudioAttributesImplBaseParcelizer.read(bArr);
        }
    }

    private Bitmap AudioAttributesCompatParcelizer(setFolderType setfoldertype, BitmapFactory.Options options, populateFromMetadata populatefrommetadata, onTrackSelectionParametersChanged ontrackselectionparameterschanged, HeartRating heartRating, boolean z, int i, int i2, boolean z2, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
        int i3;
        int iRound;
        int iRound2;
        int i4;
        long jRemoteActionCompatParcelizer = createTimeline.RemoteActionCompatParcelizer();
        int[] iArrIconCompatParcelizer = IconCompatParcelizer(setfoldertype, options, audioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver);
        int i5 = iArrIconCompatParcelizer[0];
        int i6 = iArrIconCompatParcelizer[1];
        String str = options.outMimeType;
        boolean z3 = (i5 == -1 || i6 == -1) ? false : z;
        int i7 = setfoldertype.read();
        int iAudioAttributesCompatParcelizer = setOverallRating.AudioAttributesCompatParcelizer(i7);
        boolean zRemoteActionCompatParcelizer = setOverallRating.RemoteActionCompatParcelizer(i7);
        if (i == Integer.MIN_VALUE) {
            i3 = i2;
            iRound = RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer) ? i6 : i5;
        } else {
            i3 = i2;
            iRound = i;
        }
        if (i3 == Integer.MIN_VALUE) {
            iRound2 = RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer) ? i5 : i6;
        } else {
            iRound2 = i3;
        }
        write(setfoldertype.IconCompatParcelizer(), setfoldertype, audioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, populatefrommetadata, iAudioAttributesCompatParcelizer, i5, i6, iRound, iRound2, options);
        read(setfoldertype, ontrackselectionparameterschanged, z3, zRemoteActionCompatParcelizer, options, iRound, iRound2);
        int i8 = options.inSampleSize;
        if (i5 < 0 || i6 < 0 || !z2) {
            float f = write(options) ? options.inTargetDensity / options.inDensity : 1.0f;
            float f2 = i5;
            float f3 = options.inSampleSize;
            int iCeil = (int) Math.ceil(f2 / f3);
            int iCeil2 = (int) Math.ceil(i6 / f3);
            iRound = Math.round(iCeil * f);
            iRound2 = Math.round(iCeil2 * f);
            if (Log.isLoggable("Downsampler", 2)) {
                int i9 = options.inTargetDensity;
                int i10 = options.inDensity;
            }
        }
        int i11 = iRound;
        int i12 = iRound2;
        if (i11 > 0 && i12 > 0) {
            IconCompatParcelizer(options, this.MediaBrowserCompatItemReceiver, i11, i12);
        }
        if (heartRating != null) {
            options.inPreferredColorSpace = ColorSpace.get((heartRating == HeartRating.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        }
        Bitmap bitmapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setfoldertype, options, audioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver);
        audioAttributesCompatParcelizer.write(this.MediaBrowserCompatItemReceiver, bitmapRemoteActionCompatParcelizer);
        if (Log.isLoggable("Downsampler", 2)) {
            i4 = i7;
            read(i5, i6, str, options, bitmapRemoteActionCompatParcelizer, i, i2, jRemoteActionCompatParcelizer);
        } else {
            i4 = i7;
        }
        if (bitmapRemoteActionCompatParcelizer == null) {
            return null;
        }
        bitmapRemoteActionCompatParcelizer.setDensity(this.MediaBrowserCompatCustomActionResultReceiver.densityDpi);
        Bitmap bitmapIconCompatParcelizer = setOverallRating.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, bitmapRemoteActionCompatParcelizer, i4);
        if (!bitmapRemoteActionCompatParcelizer.equals(bitmapIconCompatParcelizer)) {
            this.MediaBrowserCompatItemReceiver.write(bitmapRemoteActionCompatParcelizer);
        }
        return bitmapIconCompatParcelizer;
    }

    private static void write(ImageHeaderParser.ImageType imageType, setFolderType setfoldertype, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, access3900 access3900Var, populateFromMetadata populatefrommetadata, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int iMin;
        int iFloor;
        int iFloor2;
        if (i2 <= 0 || i3 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (RemoteActionCompatParcelizer(i)) {
            i7 = i2;
            i6 = i3;
        } else {
            i6 = i2;
            i7 = i3;
        }
        float fWrite = populatefrommetadata.write(i6, i7, i4, i5);
        if (fWrite <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
            sb.append(fWrite);
            sb.append(" from: ");
            sb.append(populatefrommetadata);
            sb.append(", source: [");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append("], target: [");
            sb.append(i4);
            sb.append("x");
            sb.append(i5);
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        }
        populateFromMetadata.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = populatefrommetadata.read(i6, i7, i4, i5);
        if (audioAttributesImplBaseParcelizer == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f = i6;
        float f2 = i7;
        int iWrite = i6 / write(fWrite * f);
        int iWrite2 = i7 / write(fWrite * f2);
        if (audioAttributesImplBaseParcelizer == populateFromMetadata.AudioAttributesImplBaseParcelizer.MEMORY) {
            iMin = Math.max(iWrite, iWrite2);
        } else {
            iMin = Math.min(iWrite, iWrite2);
        }
        int iMax = Math.max(1, Integer.highestOneBit(iMin));
        if (audioAttributesImplBaseParcelizer == populateFromMetadata.AudioAttributesImplBaseParcelizer.MEMORY && iMax < 1.0f / fWrite) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f / fMin);
            iFloor2 = (int) Math.ceil(f2 / fMin);
            int i8 = iMax / 8;
            if (i8 > 0) {
                iFloor /= i8;
                iFloor2 /= i8;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f3 = iMax;
            iFloor = (int) Math.floor(f / f3);
            iFloor2 = (int) Math.floor(f2 / f3);
        } else if (imageType.isWebp()) {
            float f4 = iMax;
            iFloor = Math.round(f / f4);
            iFloor2 = Math.round(f2 / f4);
        } else if (i6 % iMax != 0 || i7 % iMax != 0) {
            int[] iArrIconCompatParcelizer = IconCompatParcelizer(setfoldertype, options, audioAttributesCompatParcelizer, access3900Var);
            iFloor = iArrIconCompatParcelizer[0];
            iFloor2 = iArrIconCompatParcelizer[1];
        } else {
            iFloor = i6 / iMax;
            iFloor2 = i7 / iMax;
        }
        double dWrite = populatefrommetadata.write(iFloor, iFloor2, i4, i5);
        options.inTargetDensity = read(dWrite);
        options.inDensity = IconCompatParcelizer(dWrite);
        if (write(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            int i9 = options.inTargetDensity;
            int i10 = options.inDensity;
        }
    }

    private static int read(double d) {
        int iIconCompatParcelizer = IconCompatParcelizer(d);
        int iWrite = write(((double) iIconCompatParcelizer) * d);
        return write((d / ((double) (iWrite / iIconCompatParcelizer))) * ((double) iWrite));
    }

    private static int IconCompatParcelizer(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    private void read(setFolderType setfoldertype, onTrackSelectionParametersChanged ontrackselectionparameterschanged, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(i, i2, options, z, z2)) {
            return;
        }
        if (ontrackselectionparameterschanged == onTrackSelectionParametersChanged.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(ontrackselectionparameterschanged);
            }
        }
        Bitmap.Config config = setfoldertype.IconCompatParcelizer().hasAlpha() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (options.inPreferredConfig == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static int[] IconCompatParcelizer(setFolderType setfoldertype, BitmapFactory.Options options, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, access3900 access3900Var) throws IOException {
        options.inJustDecodeBounds = true;
        RemoteActionCompatParcelizer(setfoldertype, options, audioAttributesCompatParcelizer, access3900Var);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap RemoteActionCompatParcelizer(kotlin.setFolderType r4, android.graphics.BitmapFactory.Options r5, o.setAlbumTitle.AudioAttributesCompatParcelizer r6, kotlin.access3900 r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.AudioAttributesCompatParcelizer()
            r4.RemoteActionCompatParcelizer()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = kotlin.setOverallRating.read()
            r3.lock()
            android.graphics.Bitmap r4 = r4.IconCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L1e
            goto L33
        L1c:
            r4 = move-exception
            goto L3d
        L1e:
            r3 = move-exception
            java.io.IOException r0 = read(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L1c
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L3c
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3b
            r7.write(r1)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3b
            r1 = 0
            r5.inBitmap = r1     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3b
            android.graphics.Bitmap r4 = RemoteActionCompatParcelizer(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3b
        L33:
            java.util.concurrent.locks.Lock r5 = kotlin.setOverallRating.read()
            r5.unlock()
            return r4
        L3b:
            throw r0     // Catch: java.lang.Throwable -> L1c
        L3c:
            throw r0     // Catch: java.lang.Throwable -> L1c
        L3d:
            java.util.concurrent.locks.Lock r5 = kotlin.setOverallRating.read()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAlbumTitle.RemoteActionCompatParcelizer(o.setFolderType, android.graphics.BitmapFactory$Options, o.setAlbumTitle$AudioAttributesCompatParcelizer, o.access3900):android.graphics.Bitmap");
    }

    private static boolean write(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static void read(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        AudioAttributesCompatParcelizer(bitmap);
        IconCompatParcelizer(options);
        int i5 = options.inSampleSize;
        int i6 = options.inDensity;
        int i7 = options.inTargetDensity;
        Thread.currentThread().getName();
        createTimeline.AudioAttributesCompatParcelizer(j);
    }

    private static String IconCompatParcelizer(BitmapFactory.Options options) {
        return AudioAttributesCompatParcelizer(options.inBitmap);
    }

    private static String AudioAttributesCompatParcelizer(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(" (");
        sb.append(bitmap.getAllocationByteCount());
        sb.append(")");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(bitmap.getWidth());
        sb2.append("x");
        sb2.append(bitmap.getHeight());
        sb2.append("] ");
        sb2.append(bitmap.getConfig());
        sb2.append(string);
        return sb2.toString();
    }

    private static IOException read(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        StringBuilder sb = new StringBuilder("Exception decoding bitmap, outWidth: ");
        sb.append(i);
        sb.append(", outHeight: ");
        sb.append(i2);
        sb.append(", outMimeType: ");
        sb.append(str);
        sb.append(", inBitmap: ");
        sb.append(IconCompatParcelizer(options));
        return new IOException(sb.toString(), illegalArgumentException);
    }

    private static void IconCompatParcelizer(BitmapFactory.Options options, access3900 access3900Var, int i, int i2) {
        if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = access3900Var.RemoteActionCompatParcelizer(i, i2, config);
    }

    private static BitmapFactory.Options RemoteActionCompatParcelizer() {
        BitmapFactory.Options optionsPoll;
        synchronized (setAlbumTitle.class) {
            Queue<BitmapFactory.Options> queue = AudioAttributesImplApi26Parcelizer;
            synchronized (queue) {
                optionsPoll = queue.poll();
            }
            if (optionsPoll == null) {
                optionsPoll = new BitmapFactory.Options();
                read(optionsPoll);
            }
        }
        return optionsPoll;
    }

    private static void AudioAttributesCompatParcelizer(BitmapFactory.Options options) {
        read(options);
        Queue<BitmapFactory.Options> queue = AudioAttributesImplApi26Parcelizer;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void read(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }
}
