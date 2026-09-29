package kotlin;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.setContainerMimeType;

/* JADX INFO: loaded from: classes2.dex */
public final class access3100 {
    private float AudioAttributesCompatParcelizer;
    private float[] IconCompatParcelizer;
    private float RemoteActionCompatParcelizer;
    private int read;
    private float write;

    public access3100() {
        this.write = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.read = 0;
    }

    public access3100(float f, float f2, float f3, int i) {
        this.write = f;
        this.AudioAttributesCompatParcelizer = f2;
        this.RemoteActionCompatParcelizer = f3;
        this.read = i;
        this.IconCompatParcelizer = null;
    }

    public access3100(access3100 access3100Var) {
        this.write = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.read = 0;
        this.write = access3100Var.write;
        this.AudioAttributesCompatParcelizer = access3100Var.AudioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = access3100Var.RemoteActionCompatParcelizer;
        this.read = access3100Var.read;
        this.IconCompatParcelizer = null;
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final float read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final float IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int write() {
        return this.read;
    }

    public final boolean IconCompatParcelizer(access3100 access3100Var) {
        return this.write == access3100Var.write && this.AudioAttributesCompatParcelizer == access3100Var.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == access3100Var.RemoteActionCompatParcelizer && this.read == access3100Var.read;
    }

    public final void AudioAttributesCompatParcelizer(Matrix matrix) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new float[2];
        }
        float[] fArr = this.IconCompatParcelizer;
        fArr[0] = this.AudioAttributesCompatParcelizer;
        fArr[1] = this.RemoteActionCompatParcelizer;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.IconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = fArr2[0];
        this.RemoteActionCompatParcelizer = fArr2[1];
        this.write = matrix.mapRadius(this.write);
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.read = Color.argb(Math.round((Color.alpha(this.read) * setColorInfo.RemoteActionCompatParcelizer(i)) / 255.0f), Color.red(this.read), Color.green(this.read), Color.blue(this.read));
    }

    public final void AudioAttributesCompatParcelizer(Paint paint) {
        if (Color.alpha(this.read) > 0) {
            paint.setShadowLayer(Math.max(this.write, Float.MIN_VALUE), this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.read);
        } else {
            paint.clearShadowLayer();
        }
    }

    public final void write(int i, Paint paint) {
        int iWrite = setEncoderPadding.write(Color.alpha(this.read), setColorInfo.RemoteActionCompatParcelizer(i));
        if (iWrite > 0) {
            paint.setShadowLayer(Math.max(this.write, Float.MIN_VALUE), this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, Color.argb(iWrite, Color.red(this.read), Color.green(this.read), Color.blue(this.read)));
        } else {
            paint.clearShadowLayer();
        }
    }

    public final void RemoteActionCompatParcelizer(int i, setContainerMimeType.write writeVar) {
        writeVar.RemoteActionCompatParcelizer = new access3100(this);
        writeVar.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i);
    }

    public final void read(setContainerMimeType.write writeVar) {
        if (Color.alpha(this.read) > 0) {
            writeVar.RemoteActionCompatParcelizer = this;
        } else {
            writeVar.RemoteActionCompatParcelizer = null;
        }
    }
}
