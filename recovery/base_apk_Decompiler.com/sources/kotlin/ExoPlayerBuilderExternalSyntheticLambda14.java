package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import coil.size.PixelSize;
import coil.size.Size;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.concurrent.CancellationException;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u001a#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000f\u0010\u0018J!\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u000f\u0010\u001cJ+\u0010\u000f\u001a\u00020\t*\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u001eR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\u0015\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/ExoPlayerBuilderExternalSyntheticLambda14;", "Lo/ExoPlayerBuilderExternalSyntheticLambda21;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Lo/setDeviceVolumeControlEnabled;", "Landroid/graphics/Bitmap;", "p1", "Landroid/graphics/Bitmap$Config;", "p2", "", "p3", "", "p4", "AudioAttributesCompatParcelizer", "(Lo/setDeviceVolumeControlEnabled;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;ZI)Landroid/graphics/Bitmap;", "Lo/LessonCompletedDialog;", "Lcoil/size/Size;", "Lo/ExoPlayerBuilderExternalSyntheticLambda4;", "Lo/ExoPlayerBuilderExternalSyntheticLambda17;", "IconCompatParcelizer", "(Lo/setDeviceVolumeControlEnabled;Lo/LessonCompletedDialog;Lcoil/size/Size;Lo/ExoPlayerBuilderExternalSyntheticLambda4;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/setLockedFromSeek;", "(Lo/setDeviceVolumeControlEnabled;Lo/setLockedFromSeek;Lcoil/size/Size;Lo/ExoPlayerBuilderExternalSyntheticLambda4;)Lo/ExoPlayerBuilderExternalSyntheticLambda17;", "", "read", "(Lo/LessonCompletedDialog;)Z", "(Ljava/lang/String;)Z", "Landroid/graphics/BitmapFactory$Options;", "(Landroid/graphics/BitmapFactory$Options;Lo/ExoPlayerBuilderExternalSyntheticLambda4;ZI)Landroid/graphics/Bitmap$Config;", "Landroid/content/Context;", "RemoteActionCompatParcelizer", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "write"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ExoPlayerBuilderExternalSyntheticLambda14 implements ExoPlayerBuilderExternalSyntheticLambda21 {
    private static final String[] RemoteActionCompatParcelizer = {MimeTypes.IMAGE_JPEG, MimeTypes.IMAGE_WEBP, MimeTypes.IMAGE_HEIC, MimeTypes.IMAGE_HEIF};

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Context RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Paint IconCompatParcelizer;

    public ExoPlayerBuilderExternalSyntheticLambda14(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.RemoteActionCompatParcelizer = context;
        this.IconCompatParcelizer = new Paint(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.Rect, java.lang.Throwable] */
    public final ExoPlayerBuilderExternalSyntheticLambda17 AudioAttributesCompatParcelizer(setDeviceVolumeControlEnabled p0, setLockedFromSeek p1, Size p2, ExoPlayerBuilderExternalSyntheticLambda4 p3) throws Exception {
        boolean zAudioAttributesCompatParcelizer;
        int iRemoteActionCompatParcelizer;
        boolean z;
        int i;
        read readVar;
        boolean z2;
        ?? r1;
        Bitmap bitmapDecodeStream;
        Bitmap bitmapIconCompatParcelizer;
        BitmapFactory.Options options = new BitmapFactory.Options();
        read readVar2 = new read(p1);
        LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = CustomAppBarLayout.AudioAttributesCompatParcelizer(readVar2);
        boolean z3 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(lessonCompletedDialogAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesImplBaseParcelizer(), null, options);
        Exception excWrite = readVar2.write();
        if (excWrite != null) {
            throw excWrite;
        }
        options.inJustDecodeBounds = false;
        if (AudioAttributesCompatParcelizer(options.outMimeType)) {
            createEnumNamingStrategyInstance createenumnamingstrategyinstance = new createEnumNamingStrategyInstance(new write(lessonCompletedDialogAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesImplBaseParcelizer()));
            Exception excWrite2 = readVar2.write();
            if (excWrite2 != null) {
                throw excWrite2;
            }
            zAudioAttributesCompatParcelizer = createenumnamingstrategyinstance.AudioAttributesCompatParcelizer();
            iRemoteActionCompatParcelizer = createenumnamingstrategyinstance.RemoteActionCompatParcelizer();
        } else {
            zAudioAttributesCompatParcelizer = false;
            iRemoteActionCompatParcelizer = 0;
        }
        boolean z4 = iRemoteActionCompatParcelizer == 90 || iRemoteActionCompatParcelizer == 270;
        int i2 = z4 ? options.outHeight : options.outWidth;
        int i3 = z4 ? options.outWidth : options.outHeight;
        options.inPreferredConfig = AudioAttributesCompatParcelizer(options, p3, zAudioAttributesCompatParcelizer, iRemoteActionCompatParcelizer);
        if (p3.getAudioAttributesCompatParcelizer() != null) {
            options.inPreferredColorSpace = p3.getAudioAttributesCompatParcelizer();
        }
        options.inPremultiplied = p3.getMediaBrowserCompatMediaItem();
        options.inMutable = false;
        options.inScaled = false;
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            z = zAudioAttributesCompatParcelizer;
            i = iRemoteActionCompatParcelizer;
            readVar = readVar2;
            options.inSampleSize = 1;
            z2 = false;
            options.inScaled = false;
            r1 = 0;
            options.inBitmap = null;
        } else if (!(p2 instanceof PixelSize)) {
            options.inSampleSize = 1;
            options.inScaled = false;
            if (options.inMutable) {
                int i4 = options.outWidth;
                int i5 = options.outHeight;
                Bitmap.Config config = options.inPreferredConfig;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(config, "");
                options.inBitmap = p0.IconCompatParcelizer(i4, i5, config);
            }
            z = zAudioAttributesCompatParcelizer;
            z2 = false;
            i = iRemoteActionCompatParcelizer;
            readVar = readVar2;
            r1 = 0;
        } else {
            PixelSize pixelSize = (PixelSize) p2;
            int iRemoteActionCompatParcelizer2 = pixelSize.RemoteActionCompatParcelizer();
            int iWrite = pixelSize.write();
            ExoPlayerBuilderExternalSyntheticLambda22 exoPlayerBuilderExternalSyntheticLambda22 = ExoPlayerBuilderExternalSyntheticLambda22.INSTANCE;
            options.inSampleSize = ExoPlayerBuilderExternalSyntheticLambda22.IconCompatParcelizer(i2, i3, iRemoteActionCompatParcelizer2, iWrite, p3.getRatingCompat());
            ExoPlayerBuilderExternalSyntheticLambda22 exoPlayerBuilderExternalSyntheticLambda222 = ExoPlayerBuilderExternalSyntheticLambda22.INSTANCE;
            z = zAudioAttributesCompatParcelizer;
            i = iRemoteActionCompatParcelizer;
            double dWrite = ExoPlayerBuilderExternalSyntheticLambda22.write(((double) i2) / ((double) options.inSampleSize), ((double) i3) / ((double) options.inSampleSize), iRemoteActionCompatParcelizer2, iWrite, p3.getRatingCompat());
            if (p3.getRemoteActionCompatParcelizer()) {
                dWrite = getQues.read(dWrite);
            }
            options.inScaled = !(dWrite == 1.0d);
            if (options.inScaled) {
                if (dWrite > 1.0d) {
                    options.inDensity = getOnline.read(2.147483647E9d / dWrite);
                    options.inTargetDensity = Integer.MAX_VALUE;
                } else {
                    options.inDensity = Integer.MAX_VALUE;
                    options.inTargetDensity = getOnline.read(2.147483647E9d * dWrite);
                }
            }
            if (options.inMutable) {
                if (options.inSampleSize == 1 && !options.inScaled) {
                    int i6 = options.outWidth;
                    int i7 = options.outHeight;
                    Bitmap.Config config2 = options.inPreferredConfig;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(config2, "");
                    bitmapIconCompatParcelizer = p0.IconCompatParcelizer(i6, i7, config2);
                    readVar = readVar2;
                } else {
                    double d = ((double) options.outWidth) / ((double) options.inSampleSize);
                    readVar = readVar2;
                    double d2 = ((double) options.outHeight) / ((double) options.inSampleSize);
                    int iCeil = (int) Math.ceil((d * dWrite) + 0.5d);
                    int iCeil2 = (int) Math.ceil((d2 * dWrite) + 0.5d);
                    Bitmap.Config config3 = options.inPreferredConfig;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(config3, "");
                    bitmapIconCompatParcelizer = p0.IconCompatParcelizer(iCeil, iCeil2, config3);
                }
                options.inBitmap = bitmapIconCompatParcelizer;
            } else {
                readVar = readVar2;
            }
            z2 = false;
            r1 = 0;
        }
        Bitmap bitmap = options.inBitmap;
        try {
            LessonCompletedDialog lessonCompletedDialog = lessonCompletedDialogAudioAttributesCompatParcelizer;
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(lessonCompletedDialog.AudioAttributesImplBaseParcelizer(), r1, options);
                MagicModuleMetaLSModel.IconCompatParcelizer(lessonCompletedDialog, r1);
                try {
                    Exception excWrite3 = readVar.write();
                    if (excWrite3 != null) {
                        throw excWrite3;
                    }
                    if (bitmapDecodeStream == 0) {
                        throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                    }
                    bitmapDecodeStream.setDensity(p3.getIconCompatParcelizer().getResources().getDisplayMetrics().densityDpi);
                    Bitmap.Config config4 = options.inPreferredConfig;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(config4, "");
                    Bitmap bitmapAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, bitmapDecodeStream, config4, z, i);
                    Resources resources = this.RemoteActionCompatParcelizer.getResources();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resources, "");
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapAudioAttributesCompatParcelizer);
                    if (options.inSampleSize <= 1 && !options.inScaled) {
                        z3 = z2;
                    }
                    return new ExoPlayerBuilderExternalSyntheticLambda17(bitmapDrawable, z3);
                } catch (Throwable th) {
                    th = th;
                    if (bitmap != null) {
                        p0.RemoteActionCompatParcelizer(bitmap);
                    }
                    if (bitmapDecodeStream != bitmap && bitmapDecodeStream != 0) {
                        p0.RemoteActionCompatParcelizer(bitmapDecodeStream);
                    }
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            bitmapDecodeStream = r1;
        }
    }

    private static boolean AudioAttributesCompatParcelizer(String p0) {
        return p0 != null && getOrderDetails.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer, p0);
    }

    private static Bitmap.Config AudioAttributesCompatParcelizer(BitmapFactory.Options options, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, boolean z, int i) {
        Bitmap.Config write2 = exoPlayerBuilderExternalSyntheticLambda4.getWrite();
        if (z || i > 0) {
            write2 = maybeNotifySurfaceSizeChanged.IconCompatParcelizer(write2);
        }
        if (exoPlayerBuilderExternalSyntheticLambda4.getRead() && write2 == Bitmap.Config.ARGB_8888 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) options.outMimeType, (Object) MimeTypes.IMAGE_JPEG)) {
            write2 = Bitmap.Config.RGB_565;
        }
        return (options.outConfig != Bitmap.Config.RGBA_F16 || write2 == Bitmap.Config.HARDWARE) ? write2 : Bitmap.Config.RGBA_F16;
    }

    private final Bitmap AudioAttributesCompatParcelizer(setDeviceVolumeControlEnabled p0, Bitmap p1, Bitmap.Config p2, boolean p3, int p4) {
        Bitmap bitmap;
        boolean z = p4 > 0;
        if (!p3 && !z) {
            return p1;
        }
        Matrix matrix = new Matrix();
        float width = p1.getWidth() / 2.0f;
        float height = p1.getHeight() / 2.0f;
        if (p3) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (z) {
            matrix.postRotate(p4, width, height);
        }
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, p1.getWidth(), p1.getHeight());
        matrix.mapRect(rectF);
        if (rectF.left != BitmapDescriptorFactory.HUE_RED || rectF.top != BitmapDescriptorFactory.HUE_RED) {
            matrix.postTranslate(-rectF.left, -rectF.top);
        }
        if (p4 == 90 || p4 == 270) {
            bitmap = p0.read(p1.getHeight(), p1.getWidth(), p2);
        } else {
            bitmap = p0.read(p1.getWidth(), p1.getHeight(), p2);
        }
        new Canvas(bitmap).drawBitmap(p1, matrix, this.IconCompatParcelizer);
        p0.RemoteActionCompatParcelizer(p1);
        return bitmap;
    }

    static final class read extends setRelatedModuleAdapter {
        private Exception IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(setLockedFromSeek setlockedfromseek) {
            super(setlockedfromseek);
            toMagicModuleMetaRepoModel.write(setlockedfromseek, "");
        }

        public final Exception write() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.setRelatedModuleAdapter, kotlin.setLockedFromSeek
        public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws Exception {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            try {
                return super.AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
            } catch (Exception e) {
                this.IconCompatParcelizer = e;
                throw e;
            }
        }
    }

    static final class write extends InputStream {
        private volatile int IconCompatParcelizer;
        private final InputStream read;

        public write(InputStream inputStream) {
            toMagicModuleMetaRepoModel.write(inputStream, "");
            this.read = inputStream;
            this.IconCompatParcelizer = 1073741824;
        }

        @Override // java.io.InputStream
        public final int read() {
            return AudioAttributesCompatParcelizer(this.read.read());
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return AudioAttributesCompatParcelizer(this.read.read(bArr));
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return AudioAttributesCompatParcelizer(this.read.read(bArr, i, i2));
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            return this.read.skip(j);
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.IconCompatParcelizer;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.read.close();
        }

        private final int AudioAttributesCompatParcelizer(int i) {
            if (i == -1) {
                this.IconCompatParcelizer = 0;
            }
            return i;
        }
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda21
    public final Object IconCompatParcelizer(setDeviceVolumeControlEnabled setdevicevolumecontrolenabled, LessonCompletedDialog lessonCompletedDialog, Size size, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, SampleVideos<? super ExoPlayerBuilderExternalSyntheticLambda17> sampleVideos) throws Exception {
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        try {
            ExoPlayerBuilderExternalSyntheticLambda20 exoPlayerBuilderExternalSyntheticLambda20 = new ExoPlayerBuilderExternalSyntheticLambda20(setstatesolvedcount2, lessonCompletedDialog);
            try {
                ExoPlayerBuilderExternalSyntheticLambda17 exoPlayerBuilderExternalSyntheticLambda17AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setdevicevolumecontrolenabled, exoPlayerBuilderExternalSyntheticLambda20, size, exoPlayerBuilderExternalSyntheticLambda4);
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                setstatesolvedcount2.resumeWith(C0177getRfBanners.read(exoPlayerBuilderExternalSyntheticLambda17AudioAttributesCompatParcelizer));
                Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
                if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                    getAnsweredMcqCount.write(sampleVideos);
                }
                return objAudioAttributesCompatParcelizer;
            } finally {
                exoPlayerBuilderExternalSyntheticLambda20.AudioAttributesCompatParcelizer();
            }
        } catch (Exception e) {
            if ((e instanceof InterruptedException) || (e instanceof InterruptedIOException)) {
                Throwable thInitCause = new CancellationException("Blocking call was interrupted due to parent cancellation.").initCause(e);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(thInitCause, "");
                throw thInitCause;
            }
            throw e;
        }
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda21
    public final boolean read(LessonCompletedDialog lessonCompletedDialog) {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        return true;
    }
}
