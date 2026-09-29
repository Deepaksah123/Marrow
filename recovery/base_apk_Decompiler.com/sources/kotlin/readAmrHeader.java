package kotlin;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import kotlin.getTimeUsAtPosition;

/* JADX INFO: loaded from: classes5.dex */
public abstract class readAmrHeader {
    isValidFrameType write;
    boolean read = false;
    boolean IconCompatParcelizer = false;
    RectF AudioAttributesCompatParcelizer = new RectF();
    final Path RemoteActionCompatParcelizer = new Path();

    abstract boolean RemoteActionCompatParcelizer();

    abstract void read(View view);

    public static readAmrHeader IconCompatParcelizer(View view) {
        if (Build.VERSION.SDK_INT >= 33) {
            return new maybeOutputSeekMap(view);
        }
        return new peekAmrSignature(view);
    }

    public final boolean IconCompatParcelizer() {
        return this.read;
    }

    public final void IconCompatParcelizer(View view, boolean z) {
        if (z != this.read) {
            this.read = z;
            read(view);
        }
    }

    public final void RemoteActionCompatParcelizer(View view) {
        this.IconCompatParcelizer = true;
        read(view);
    }

    public final void write(View view, isValidFrameType isvalidframetype) {
        this.write = isvalidframetype;
        read();
        read(view);
    }

    public final void IconCompatParcelizer(View view, RectF rectF) {
        this.AudioAttributesCompatParcelizer = rectF;
        read();
        read(view);
    }

    private void read() {
        if (!write() || this.write == null) {
            return;
        }
        isNarrowBandValidFrameType.RemoteActionCompatParcelizer().IconCompatParcelizer(this.write, 1.0f, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    private boolean write() {
        return this.AudioAttributesCompatParcelizer.left <= this.AudioAttributesCompatParcelizer.right && this.AudioAttributesCompatParcelizer.top <= this.AudioAttributesCompatParcelizer.bottom;
    }

    public final void RemoteActionCompatParcelizer(Canvas canvas, getTimeUsAtPosition.IconCompatParcelizer iconCompatParcelizer) {
        if (RemoteActionCompatParcelizer() && !this.RemoteActionCompatParcelizer.isEmpty()) {
            canvas.save();
            canvas.clipPath(this.RemoteActionCompatParcelizer);
            iconCompatParcelizer.RemoteActionCompatParcelizer(canvas);
            canvas.restore();
            return;
        }
        iconCompatParcelizer.RemoteActionCompatParcelizer(canvas);
    }
}
