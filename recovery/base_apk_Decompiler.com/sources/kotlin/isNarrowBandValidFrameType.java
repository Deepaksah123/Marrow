package kotlin;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class isNarrowBandValidFrameType {
    private final peekNextSampleSize[] IconCompatParcelizer = new peekNextSampleSize[4];
    private final Matrix[] write = new Matrix[4];
    private final Matrix[] AudioAttributesImplApi26Parcelizer = new Matrix[4];
    private final PointF MediaBrowserCompatItemReceiver = new PointF();
    private final Path AudioAttributesImplBaseParcelizer = new Path();
    private final Path RemoteActionCompatParcelizer = new Path();
    private final peekNextSampleSize MediaBrowserCompatMediaItem = new peekNextSampleSize();
    private final float[] MediaBrowserCompatCustomActionResultReceiver = new float[2];
    private final float[] MediaMetadataCompat = new float[2];
    private final Path AudioAttributesImplApi21Parcelizer = new Path();
    private final Path AudioAttributesCompatParcelizer = new Path();
    private boolean read = true;

    static class AudioAttributesCompatParcelizer {
        static final isNarrowBandValidFrameType AudioAttributesCompatParcelizer = new isNarrowBandValidFrameType();
    }

    public interface write {
        void AudioAttributesCompatParcelizer(peekNextSampleSize peeknextsamplesize, Matrix matrix, int i);

        void write(peekNextSampleSize peeknextsamplesize, Matrix matrix, int i);
    }

    public isNarrowBandValidFrameType() {
        for (int i = 0; i < 4; i++) {
            this.IconCompatParcelizer[i] = new peekNextSampleSize();
            this.write[i] = new Matrix();
            this.AudioAttributesImplApi26Parcelizer[i] = new Matrix();
        }
    }

    public static isNarrowBandValidFrameType RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(isValidFrameType isvalidframetype, float f, RectF rectF, Path path) {
        write(isvalidframetype, f, rectF, null, path);
    }

    public final void write(isValidFrameType isvalidframetype, float f, RectF rectF, write writeVar, Path path) {
        path.rewind();
        this.AudioAttributesImplBaseParcelizer.rewind();
        this.RemoteActionCompatParcelizer.rewind();
        this.RemoteActionCompatParcelizer.addRect(rectF, Path.Direction.CW);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(isvalidframetype, f, rectF, writeVar, path);
        for (int i = 0; i < 4; i++) {
            RemoteActionCompatParcelizer(iconCompatParcelizer, i);
            IconCompatParcelizer(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            read(iconCompatParcelizer, i2);
            IconCompatParcelizer(iconCompatParcelizer, i2);
        }
        path.close();
        this.AudioAttributesImplBaseParcelizer.close();
        if (this.AudioAttributesImplBaseParcelizer.isEmpty()) {
            return;
        }
        path.op(this.AudioAttributesImplBaseParcelizer, Path.Op.UNION);
    }

    private void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, int i) {
        AudioAttributesCompatParcelizer(i, iconCompatParcelizer.write).read(this.IconCompatParcelizer[i], iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.IconCompatParcelizer, IconCompatParcelizer(i, iconCompatParcelizer.write));
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        this.write[i].reset();
        write(i, iconCompatParcelizer.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver);
        this.write[i].setTranslate(this.MediaBrowserCompatItemReceiver.x, this.MediaBrowserCompatItemReceiver.y);
        this.write[i].preRotate(fRemoteActionCompatParcelizer);
    }

    private void IconCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver[0] = this.IconCompatParcelizer[i].read();
        this.MediaBrowserCompatCustomActionResultReceiver[1] = this.IconCompatParcelizer[i].RemoteActionCompatParcelizer();
        this.write[i].mapPoints(this.MediaBrowserCompatCustomActionResultReceiver);
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        this.AudioAttributesImplApi26Parcelizer[i].reset();
        Matrix matrix = this.AudioAttributesImplApi26Parcelizer[i];
        float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.AudioAttributesImplApi26Parcelizer[i].preRotate(fRemoteActionCompatParcelizer);
    }

    private void read(IconCompatParcelizer iconCompatParcelizer, int i) {
        this.MediaBrowserCompatCustomActionResultReceiver[0] = this.IconCompatParcelizer[i].write();
        this.MediaBrowserCompatCustomActionResultReceiver[1] = this.IconCompatParcelizer[i].AudioAttributesCompatParcelizer();
        this.write[i].mapPoints(this.MediaBrowserCompatCustomActionResultReceiver);
        if (i == 0) {
            Path path = iconCompatParcelizer.read;
            float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = iconCompatParcelizer.read;
            float[] fArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.IconCompatParcelizer[i].RemoteActionCompatParcelizer(this.write[i], iconCompatParcelizer.read);
        if (iconCompatParcelizer.AudioAttributesCompatParcelizer != null) {
            iconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer[i], this.write[i], i);
        }
    }

    private void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, int i) {
        int i2 = (i + 1) % 4;
        this.MediaBrowserCompatCustomActionResultReceiver[0] = this.IconCompatParcelizer[i].read();
        this.MediaBrowserCompatCustomActionResultReceiver[1] = this.IconCompatParcelizer[i].RemoteActionCompatParcelizer();
        this.write[i].mapPoints(this.MediaBrowserCompatCustomActionResultReceiver);
        this.MediaMetadataCompat[0] = this.IconCompatParcelizer[i2].write();
        this.MediaMetadataCompat[1] = this.IconCompatParcelizer[i2].AudioAttributesCompatParcelizer();
        this.write[i2].mapPoints(this.MediaMetadataCompat);
        float f = this.MediaBrowserCompatCustomActionResultReceiver[0];
        float[] fArr = this.MediaMetadataCompat;
        float fMax = Math.max(((float) Math.hypot(f - fArr[0], r1[1] - fArr[1])) - 0.001f, BitmapDescriptorFactory.HUE_RED);
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iconCompatParcelizer.IconCompatParcelizer, i);
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        getBitrateFromFrameSize getbitratefromframesize = read(i, iconCompatParcelizer.write);
        getbitratefromframesize.read(fMax, fAudioAttributesCompatParcelizer, iconCompatParcelizer.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem);
        this.AudioAttributesImplApi21Parcelizer.reset();
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer[i], this.AudioAttributesImplApi21Parcelizer);
        if (this.read && (getbitratefromframesize.AudioAttributesImplApi21Parcelizer() || AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, i) || AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, i2))) {
            Path path = this.AudioAttributesImplApi21Parcelizer;
            path.op(path, this.RemoteActionCompatParcelizer, Path.Op.DIFFERENCE);
            this.MediaBrowserCompatCustomActionResultReceiver[0] = this.MediaBrowserCompatMediaItem.write();
            this.MediaBrowserCompatCustomActionResultReceiver[1] = this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer[i].mapPoints(this.MediaBrowserCompatCustomActionResultReceiver);
            Path path2 = this.AudioAttributesImplBaseParcelizer;
            float[] fArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer[i], this.AudioAttributesImplBaseParcelizer);
        } else {
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer[i], iconCompatParcelizer.read);
        }
        if (iconCompatParcelizer.AudioAttributesCompatParcelizer != null) {
            iconCompatParcelizer.AudioAttributesCompatParcelizer.write(this.MediaBrowserCompatMediaItem, this.AudioAttributesImplApi26Parcelizer[i], i);
        }
    }

    private boolean AudioAttributesCompatParcelizer(Path path, int i) {
        this.AudioAttributesCompatParcelizer.reset();
        this.IconCompatParcelizer[i].RemoteActionCompatParcelizer(this.write[i], this.AudioAttributesCompatParcelizer);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.AudioAttributesCompatParcelizer.computeBounds(rectF, true);
        path.op(this.AudioAttributesCompatParcelizer, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private float AudioAttributesCompatParcelizer(RectF rectF, int i) {
        this.MediaBrowserCompatCustomActionResultReceiver[0] = this.IconCompatParcelizer[i].read;
        this.MediaBrowserCompatCustomActionResultReceiver[1] = this.IconCompatParcelizer[i].AudioAttributesCompatParcelizer;
        this.write[i].mapPoints(this.MediaBrowserCompatCustomActionResultReceiver);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.MediaBrowserCompatCustomActionResultReceiver[0]);
        }
        return Math.abs(rectF.centerY() - this.MediaBrowserCompatCustomActionResultReceiver[1]);
    }

    private static amrSignatureWb AudioAttributesCompatParcelizer(int i, isValidFrameType isvalidframetype) {
        if (i == 1) {
            return isvalidframetype.AudioAttributesCompatParcelizer();
        }
        if (i == 2) {
            return isvalidframetype.write();
        }
        if (i == 3) {
            return isvalidframetype.AudioAttributesImplApi26Parcelizer();
        }
        return isvalidframetype.RatingCompat();
    }

    private static VorbisUtilVorbisIdHeader IconCompatParcelizer(int i, isValidFrameType isvalidframetype) {
        if (i == 1) {
            return isvalidframetype.MediaBrowserCompatItemReceiver();
        }
        if (i == 2) {
            return isvalidframetype.read();
        }
        if (i == 3) {
            return isvalidframetype.MediaBrowserCompatSearchResultReceiver();
        }
        return isvalidframetype.MediaMetadataCompat();
    }

    private static getBitrateFromFrameSize read(int i, isValidFrameType isvalidframetype) {
        if (i == 1) {
            return isvalidframetype.IconCompatParcelizer();
        }
        if (i == 2) {
            return isvalidframetype.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (i == 3) {
            return isvalidframetype.AudioAttributesImplApi21Parcelizer();
        }
        return isvalidframetype.AudioAttributesImplBaseParcelizer();
    }

    private static void write(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i == 3) {
            pointF.set(rectF.left, rectF.top);
        } else {
            pointF.set(rectF.right, rectF.top);
        }
    }

    private static float RemoteActionCompatParcelizer(int i) {
        return ((i + 1) % 4) * 90;
    }

    static final class IconCompatParcelizer {
        public final write AudioAttributesCompatParcelizer;
        public final RectF IconCompatParcelizer;
        public final float RemoteActionCompatParcelizer;
        public final Path read;
        public final isValidFrameType write;

        IconCompatParcelizer(isValidFrameType isvalidframetype, float f, RectF rectF, write writeVar, Path path) {
            this.AudioAttributesCompatParcelizer = writeVar;
            this.write = isvalidframetype;
            this.RemoteActionCompatParcelizer = f;
            this.IconCompatParcelizer = rectF;
            this.read = path;
        }
    }
}
