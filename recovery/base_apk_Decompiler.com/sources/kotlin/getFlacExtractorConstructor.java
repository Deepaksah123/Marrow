package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.getMidiExtractorConstructor;

/* JADX INFO: loaded from: classes5.dex */
public final class getFlacExtractorConstructor {
    public static final int RemoteActionCompatParcelizer = 2;
    private Drawable AudioAttributesCompatParcelizer;
    private getMidiExtractorConstructor.read AudioAttributesImplApi21Parcelizer;
    private final Paint AudioAttributesImplApi26Parcelizer;
    private final Paint AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private final View MediaBrowserCompatCustomActionResultReceiver;
    private final Path MediaBrowserCompatItemReceiver;
    private boolean read;
    private final write write;

    public interface write {
        boolean AudioAttributesCompatParcelizer();

        void read(Canvas canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getFlacExtractorConstructor(write writeVar) {
        this.write = writeVar;
        View view = (View) writeVar;
        this.MediaBrowserCompatCustomActionResultReceiver = view;
        view.setWillNotDraw(false);
        this.MediaBrowserCompatItemReceiver = new Path();
        this.AudioAttributesImplApi26Parcelizer = new Paint(7);
        Paint paint = new Paint(1);
        this.AudioAttributesImplBaseParcelizer = paint;
        paint.setColor(0);
    }

    public final void AudioAttributesCompatParcelizer() {
        if (RemoteActionCompatParcelizer == 0) {
            this.IconCompatParcelizer = true;
            this.read = false;
            this.MediaBrowserCompatCustomActionResultReceiver.buildDrawingCache();
            Bitmap drawingCache = this.MediaBrowserCompatCustomActionResultReceiver.getDrawingCache();
            if (drawingCache == null && this.MediaBrowserCompatCustomActionResultReceiver.getWidth() != 0 && this.MediaBrowserCompatCustomActionResultReceiver.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.MediaBrowserCompatCustomActionResultReceiver.getWidth(), this.MediaBrowserCompatCustomActionResultReceiver.getHeight(), Bitmap.Config.ARGB_8888);
                this.MediaBrowserCompatCustomActionResultReceiver.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.AudioAttributesImplApi26Parcelizer;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.IconCompatParcelizer = false;
            this.read = true;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (RemoteActionCompatParcelizer == 0) {
            this.read = false;
            this.MediaBrowserCompatCustomActionResultReceiver.destroyDrawingCache();
            this.AudioAttributesImplApi26Parcelizer.setShader(null);
            this.MediaBrowserCompatCustomActionResultReceiver.invalidate();
        }
    }

    public final void RemoteActionCompatParcelizer(getMidiExtractorConstructor.read readVar) {
        if (readVar == null) {
            this.AudioAttributesImplApi21Parcelizer = null;
        } else {
            getMidiExtractorConstructor.read readVar2 = this.AudioAttributesImplApi21Parcelizer;
            if (readVar2 == null) {
                this.AudioAttributesImplApi21Parcelizer = new getMidiExtractorConstructor.read(readVar);
            } else {
                readVar2.read(readVar);
            }
            if (readVorbisCommentMetadataBlock.RemoteActionCompatParcelizer(readVar.RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer(readVar))) {
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer = Float.MAX_VALUE;
            }
        }
        MediaBrowserCompatItemReceiver();
    }

    public final getMidiExtractorConstructor.read read() {
        getMidiExtractorConstructor.read readVar = this.AudioAttributesImplApi21Parcelizer;
        if (readVar == null) {
            return null;
        }
        getMidiExtractorConstructor.read readVar2 = new getMidiExtractorConstructor.read(readVar);
        if (readVar2.AudioAttributesCompatParcelizer()) {
            readVar2.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(readVar2);
        }
        return readVar2;
    }

    public final void read(int i) {
        this.AudioAttributesImplBaseParcelizer.setColor(i);
        this.MediaBrowserCompatCustomActionResultReceiver.invalidate();
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.getColor();
    }

    public final void write(Drawable drawable) {
        this.AudioAttributesCompatParcelizer = drawable;
        this.MediaBrowserCompatCustomActionResultReceiver.invalidate();
    }

    private void MediaBrowserCompatItemReceiver() {
        if (RemoteActionCompatParcelizer == 1) {
            this.MediaBrowserCompatItemReceiver.rewind();
            getMidiExtractorConstructor.read readVar = this.AudioAttributesImplApi21Parcelizer;
            if (readVar != null) {
                this.MediaBrowserCompatItemReceiver.addCircle(readVar.write, this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer, Path.Direction.CW);
            }
        }
        this.MediaBrowserCompatCustomActionResultReceiver.invalidate();
    }

    private float AudioAttributesCompatParcelizer(getMidiExtractorConstructor.read readVar) {
        return readVorbisCommentMetadataBlock.IconCompatParcelizer(readVar.write, readVar.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver.getWidth(), this.MediaBrowserCompatCustomActionResultReceiver.getHeight());
    }

    public final void AudioAttributesCompatParcelizer(Canvas canvas) {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            int i = RemoteActionCompatParcelizer;
            if (i == 0) {
                canvas.drawCircle(this.AudioAttributesImplApi21Parcelizer.write, this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
                if (AudioAttributesImplApi26Parcelizer()) {
                    canvas.drawCircle(this.AudioAttributesImplApi21Parcelizer.write, this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
                }
            } else if (i == 1) {
                int iSave = canvas.save();
                canvas.clipPath(this.MediaBrowserCompatItemReceiver);
                this.write.read(canvas);
                if (AudioAttributesImplApi26Parcelizer()) {
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatCustomActionResultReceiver.getWidth(), this.MediaBrowserCompatCustomActionResultReceiver.getHeight(), this.AudioAttributesImplBaseParcelizer);
                }
                canvas.restoreToCount(iSave);
            } else if (i == 2) {
                this.write.read(canvas);
                if (AudioAttributesImplApi26Parcelizer()) {
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatCustomActionResultReceiver.getWidth(), this.MediaBrowserCompatCustomActionResultReceiver.getHeight(), this.AudioAttributesImplBaseParcelizer);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy ".concat(String.valueOf(i)));
            }
        } else {
            this.write.read(canvas);
            if (AudioAttributesImplApi26Parcelizer()) {
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatCustomActionResultReceiver.getWidth(), this.MediaBrowserCompatCustomActionResultReceiver.getHeight(), this.AudioAttributesImplBaseParcelizer);
            }
        }
        IconCompatParcelizer(canvas);
    }

    private void IconCompatParcelizer(Canvas canvas) {
        if (AudioAttributesImplApi21Parcelizer()) {
            Rect bounds = this.AudioAttributesCompatParcelizer.getBounds();
            float fWidth = this.AudioAttributesImplApi21Parcelizer.write - (bounds.width() / 2.0f);
            float fHeight = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.AudioAttributesCompatParcelizer.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    public final boolean write() {
        return this.write.AudioAttributesCompatParcelizer() && !MediaBrowserCompatCustomActionResultReceiver();
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        getMidiExtractorConstructor.read readVar = this.AudioAttributesImplApi21Parcelizer;
        boolean z = readVar == null || readVar.AudioAttributesCompatParcelizer();
        return RemoteActionCompatParcelizer == 0 ? !z && this.read : !z;
    }

    private boolean AudioAttributesImplApi26Parcelizer() {
        return (this.IconCompatParcelizer || Color.alpha(this.AudioAttributesImplBaseParcelizer.getColor()) == 0) ? false : true;
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        return (this.IconCompatParcelizer || this.AudioAttributesCompatParcelizer == null || this.AudioAttributesImplApi21Parcelizer == null) ? false : true;
    }
}
