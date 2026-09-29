package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class FromStringDeserializerStringBufferDeserializer {
    private float AudioAttributesCompatParcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private float IconCompatParcelizer;
    private float RemoteActionCompatParcelizer;
    private float read;
    private float write;

    public final void write() {
        this.write = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.read = BitmapDescriptorFactory.HUE_RED;
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public final void IconCompatParcelizer(_deserializeFromOther _deserializefromother, float f) {
        if (_deserializefromother != null) {
            this.write = _deserializefromother.IconCompatParcelizer(f);
            this.AudioAttributesImplBaseParcelizer = _deserializefromother.AudioAttributesCompatParcelizer(f);
        }
    }

    public final void IconCompatParcelizer(_deserializeFromOther _deserializefromother, _deserializeFromOther _deserializefromother2, float f) {
        if (_deserializefromother != null) {
            this.RemoteActionCompatParcelizer = _deserializefromother.IconCompatParcelizer(f);
        }
        if (_deserializefromother2 != null) {
            this.AudioAttributesCompatParcelizer = _deserializefromother2.IconCompatParcelizer(f);
        }
    }

    public final void write(_deserializeFromOther _deserializefromother, _deserializeFromOther _deserializefromother2, float f) {
        if (_deserializefromother != null) {
            this.IconCompatParcelizer = _deserializefromother.IconCompatParcelizer(f);
        }
        if (_deserializefromother2 != null) {
            this.read = _deserializefromother2.IconCompatParcelizer(f);
        }
    }

    public final void write(types typesVar, float f) {
        if (typesVar != null) {
            this.write = typesVar.read(f);
        }
    }

    public final void read(types typesVar, types typesVar2, float f) {
        if (typesVar != null) {
            this.RemoteActionCompatParcelizer = typesVar.read(f);
        }
        if (typesVar2 != null) {
            this.AudioAttributesCompatParcelizer = typesVar2.read(f);
        }
    }

    public final void write(types typesVar, types typesVar2, float f) {
        if (typesVar != null) {
            this.IconCompatParcelizer = typesVar.read(f);
        }
        if (typesVar2 != null) {
            this.read = typesVar2.read(f);
        }
    }

    public final void IconCompatParcelizer(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = this.RemoteActionCompatParcelizer;
        float f8 = this.AudioAttributesCompatParcelizer;
        float f9 = this.IconCompatParcelizer;
        float f10 = this.read;
        float radians = (float) Math.toRadians(this.AudioAttributesImplBaseParcelizer);
        float radians2 = (float) Math.toRadians(this.write);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = (float) ((((double) ((-i) * f5)) * Math.sin(d)) - (Math.cos(d) * d2));
        float fCos = (float) ((((double) (i * f5)) * Math.cos(d)) - (d2 * Math.sin(d)));
        fArr[0] = f3 + f7 + (f9 * f5) + (fSin * radians2);
        fArr[1] = f4 + f8 + (f10 * f6) + (radians2 * fCos);
    }
}
