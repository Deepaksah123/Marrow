package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberDeserializersIntegerDeserializer extends PrimitiveArrayDeserializersBooleanDeser {
    private FromStringDeserializerStd AudioAttributesCompatParcelizer;
    private _shouldTrim IconCompatParcelizer;
    private FromStringDeserializerStringBuilderDeserializer read;

    public NumberDeserializersIntegerDeserializer() {
        FromStringDeserializerStringBuilderDeserializer fromStringDeserializerStringBuilderDeserializer = new FromStringDeserializerStringBuilderDeserializer();
        this.read = fromStringDeserializerStringBuilderDeserializer;
        this.IconCompatParcelizer = fromStringDeserializerStringBuilderDeserializer;
    }

    public final void RemoteActionCompatParcelizer(float f, float f2, float f3, float f4, float f5, float f6) {
        FromStringDeserializerStringBuilderDeserializer fromStringDeserializerStringBuilderDeserializer = this.read;
        this.IconCompatParcelizer = fromStringDeserializerStringBuilderDeserializer;
        fromStringDeserializerStringBuilderDeserializer.RemoteActionCompatParcelizer(f, f2, f3, f4, f5, f6);
    }

    public final void IconCompatParcelizer(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new FromStringDeserializerStd();
        }
        FromStringDeserializerStd fromStringDeserializerStd = this.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer = fromStringDeserializerStd;
        fromStringDeserializerStd.read(f, f2, f3, f4, f5, f6, f7, i);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.IconCompatParcelizer.write(f);
    }

    @Override // kotlin.PrimitiveArrayDeserializersBooleanDeser
    public final float AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final boolean read() {
        return this.IconCompatParcelizer.write();
    }
}
