package kotlin;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class peekNextSampleSize {

    @Deprecated
    public float AudioAttributesCompatParcelizer;

    @Deprecated
    private float AudioAttributesImplApi21Parcelizer;

    @Deprecated
    private float AudioAttributesImplBaseParcelizer;

    @Deprecated
    private float IconCompatParcelizer;
    private final List<read> MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
    private final List<AudioAttributesImplApi26Parcelizer> MediaBrowserCompatItemReceiver = new ArrayList();

    @Deprecated
    private float RemoteActionCompatParcelizer;

    @Deprecated
    public float read;
    private boolean write;

    public static abstract class read {
        protected final Matrix write = new Matrix();

        public abstract void IconCompatParcelizer(Matrix matrix, Path path);
    }

    public peekNextSampleSize() {
        RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public final void RemoteActionCompatParcelizer(float f, float f2) {
        write(f, f2, 270.0f, BitmapDescriptorFactory.HUE_RED);
    }

    public final void write(float f, float f2, float f3, float f4) {
        AudioAttributesImplBaseParcelizer(f);
        MediaBrowserCompatCustomActionResultReceiver(f2);
        write(f);
        RemoteActionCompatParcelizer(f2);
        AudioAttributesCompatParcelizer(f3);
        IconCompatParcelizer((f3 + f4) % 360.0f);
        this.MediaBrowserCompatCustomActionResultReceiver.clear();
        this.MediaBrowserCompatItemReceiver.clear();
        this.write = false;
    }

    public final void write(float f, float f2) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.read = f;
        remoteActionCompatParcelizer.IconCompatParcelizer = f2;
        this.MediaBrowserCompatCustomActionResultReceiver.add(remoteActionCompatParcelizer);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(remoteActionCompatParcelizer, read(), RemoteActionCompatParcelizer());
        IconCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer() + 270.0f, iconCompatParcelizer.AudioAttributesCompatParcelizer() + 270.0f);
        write(f);
        RemoteActionCompatParcelizer(f2);
    }

    public final void IconCompatParcelizer(float f, float f2, float f3, float f4, float f5, float f6) {
        write writeVar = new write(f, f2, f3, f4);
        writeVar.write(f5);
        writeVar.AudioAttributesCompatParcelizer(f6);
        this.MediaBrowserCompatCustomActionResultReceiver.add(writeVar);
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(writeVar);
        float f7 = f5 + f6;
        boolean z = f6 < BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        IconCompatParcelizer(audioAttributesCompatParcelizer, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        write(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        RemoteActionCompatParcelizer(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    public final void RemoteActionCompatParcelizer(Matrix matrix, Path path) {
        int size = this.MediaBrowserCompatCustomActionResultReceiver.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompatCustomActionResultReceiver.get(i).IconCompatParcelizer(matrix, path);
        }
    }

    final AudioAttributesImplApi26Parcelizer write(Matrix matrix) {
        read(AudioAttributesImplApi21Parcelizer());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.MediaBrowserCompatItemReceiver);
        return new AudioAttributesImplApi26Parcelizer() { // from class: o.peekNextSampleSize.4
            @Override // o.peekNextSampleSize.AudioAttributesImplApi26Parcelizer
            public final void AudioAttributesCompatParcelizer(Matrix matrix3, skipBook skipbook, int i, Canvas canvas) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AudioAttributesImplApi26Parcelizer) it.next()).AudioAttributesCompatParcelizer(matrix2, skipbook, i, canvas);
                }
            }
        };
    }

    private void IconCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, float f, float f2) {
        read(f);
        this.MediaBrowserCompatItemReceiver.add(audioAttributesImplApi26Parcelizer);
        AudioAttributesCompatParcelizer(f2);
    }

    final boolean IconCompatParcelizer() {
        return this.write;
    }

    private void read(float f) {
        if (AudioAttributesImplBaseParcelizer() != f) {
            float fAudioAttributesImplBaseParcelizer = ((f - AudioAttributesImplBaseParcelizer()) + 360.0f) % 360.0f;
            if (fAudioAttributesImplBaseParcelizer > 180.0f) {
                return;
            }
            write writeVar = new write(read(), RemoteActionCompatParcelizer(), read(), RemoteActionCompatParcelizer());
            writeVar.write(AudioAttributesImplBaseParcelizer());
            writeVar.AudioAttributesCompatParcelizer(fAudioAttributesImplBaseParcelizer);
            this.MediaBrowserCompatItemReceiver.add(new AudioAttributesCompatParcelizer(writeVar));
            AudioAttributesCompatParcelizer(f);
        }
    }

    final float write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    final float AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    final float read() {
        return this.read;
    }

    final float RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    private float AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private float AudioAttributesImplApi21Parcelizer() {
        return this.IconCompatParcelizer;
    }

    private void AudioAttributesImplBaseParcelizer(float f) {
        this.AudioAttributesImplApi21Parcelizer = f;
    }

    private void MediaBrowserCompatCustomActionResultReceiver(float f) {
        this.AudioAttributesImplBaseParcelizer = f;
    }

    private void write(float f) {
        this.read = f;
    }

    private void RemoteActionCompatParcelizer(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }

    private void AudioAttributesCompatParcelizer(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    private void IconCompatParcelizer(float f) {
        this.IconCompatParcelizer = f;
    }

    static abstract class AudioAttributesImplApi26Parcelizer {
        private static Matrix write = new Matrix();
        final Matrix AudioAttributesCompatParcelizer = new Matrix();

        public abstract void AudioAttributesCompatParcelizer(Matrix matrix, skipBook skipbook, int i, Canvas canvas);

        AudioAttributesImplApi26Parcelizer() {
        }

        public final void RemoteActionCompatParcelizer(skipBook skipbook, int i, Canvas canvas) {
            AudioAttributesCompatParcelizer(write, skipbook, i, canvas);
        }
    }

    static class IconCompatParcelizer extends AudioAttributesImplApi26Parcelizer {
        private final float RemoteActionCompatParcelizer;
        private final RemoteActionCompatParcelizer read;
        private final float write;

        public IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, float f, float f2) {
            this.read = remoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = f;
            this.write = f2;
        }

        @Override // o.peekNextSampleSize.AudioAttributesImplApi26Parcelizer
        public final void AudioAttributesCompatParcelizer(Matrix matrix, skipBook skipbook, int i, Canvas canvas) {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) Math.hypot(this.read.IconCompatParcelizer - this.write, this.read.read - this.RemoteActionCompatParcelizer), BitmapDescriptorFactory.HUE_RED);
            this.AudioAttributesCompatParcelizer.set(matrix);
            this.AudioAttributesCompatParcelizer.preTranslate(this.RemoteActionCompatParcelizer, this.write);
            this.AudioAttributesCompatParcelizer.preRotate(AudioAttributesCompatParcelizer());
            skipbook.RemoteActionCompatParcelizer(canvas, this.AudioAttributesCompatParcelizer, rectF, i);
        }

        final float AudioAttributesCompatParcelizer() {
            return (float) Math.toDegrees(Math.atan((this.read.IconCompatParcelizer - this.write) / (this.read.read - this.RemoteActionCompatParcelizer)));
        }
    }

    static class AudioAttributesCompatParcelizer extends AudioAttributesImplApi26Parcelizer {
        private final write RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(write writeVar) {
            this.RemoteActionCompatParcelizer = writeVar;
        }

        @Override // o.peekNextSampleSize.AudioAttributesImplApi26Parcelizer
        public final void AudioAttributesCompatParcelizer(Matrix matrix, skipBook skipbook, int i, Canvas canvas) {
            skipbook.AudioAttributesCompatParcelizer(canvas, matrix, new RectF(this.RemoteActionCompatParcelizer.read(), this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(), this.RemoteActionCompatParcelizer.write(), this.RemoteActionCompatParcelizer.IconCompatParcelizer()), i, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        }
    }

    public static class RemoteActionCompatParcelizer extends read {
        private float IconCompatParcelizer;
        private float read;

        @Override // o.peekNextSampleSize.read
        public final void IconCompatParcelizer(Matrix matrix, Path path) {
            Matrix matrix2 = this.write;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.read, this.IconCompatParcelizer);
            path.transform(matrix);
        }
    }

    public static class write extends read {
        private static final RectF RemoteActionCompatParcelizer = new RectF();

        @Deprecated
        private float AudioAttributesCompatParcelizer;

        @Deprecated
        private float AudioAttributesImplBaseParcelizer;

        @Deprecated
        private float IconCompatParcelizer;

        @Deprecated
        private float MediaBrowserCompatCustomActionResultReceiver;

        @Deprecated
        private float MediaBrowserCompatItemReceiver;

        @Deprecated
        private float read;

        public write(float f, float f2, float f3, float f4) {
            IconCompatParcelizer(f);
            MediaBrowserCompatItemReceiver(f2);
            read(f3);
            RemoteActionCompatParcelizer(f4);
        }

        @Override // o.peekNextSampleSize.read
        public final void IconCompatParcelizer(Matrix matrix, Path path) {
            Matrix matrix2 = this.write;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = RemoteActionCompatParcelizer;
            rectF.set(read(), AudioAttributesImplBaseParcelizer(), write(), IconCompatParcelizer());
            path.arcTo(rectF, RemoteActionCompatParcelizer(), AudioAttributesCompatParcelizer(), false);
            path.transform(matrix);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float read() {
            return this.read;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float write() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        private void IconCompatParcelizer(float f) {
            this.read = f;
        }

        private void MediaBrowserCompatItemReceiver(float f) {
            this.AudioAttributesImplBaseParcelizer = f;
        }

        private void read(float f) {
            this.IconCompatParcelizer = f;
        }

        private void RemoteActionCompatParcelizer(float f) {
            this.AudioAttributesCompatParcelizer = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float RemoteActionCompatParcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float AudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write(float f) {
            this.MediaBrowserCompatCustomActionResultReceiver = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void AudioAttributesCompatParcelizer(float f) {
            this.MediaBrowserCompatItemReceiver = f;
        }
    }
}
