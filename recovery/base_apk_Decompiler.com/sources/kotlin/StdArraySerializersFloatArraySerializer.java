package kotlin;

import kotlin.PolymorphicTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StdArraySerializersFloatArraySerializer extends PolymorphicTypeValidator {
    protected final PolymorphicTypeValidator write;

    public StdArraySerializersFloatArraySerializer(PolymorphicTypeValidator polymorphicTypeValidator) {
        this.write = polymorphicTypeValidator;
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int AudioAttributesCompatParcelizer() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int IconCompatParcelizer(int i, int i2, boolean z) {
        return this.write.IconCompatParcelizer(i, i2, z);
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int AudioAttributesCompatParcelizer(int i, int i2, boolean z) {
        return this.write.AudioAttributesCompatParcelizer(i, i2, z);
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int IconCompatParcelizer(boolean z) {
        return this.write.IconCompatParcelizer(z);
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int RemoteActionCompatParcelizer(boolean z) {
        return this.write.RemoteActionCompatParcelizer(z);
    }

    @Override // kotlin.PolymorphicTypeValidator
    public PolymorphicTypeValidator.IconCompatParcelizer write(int i, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, long j) {
        return this.write.write(i, iconCompatParcelizer, j);
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // kotlin.PolymorphicTypeValidator
    public PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
        return this.write.RemoteActionCompatParcelizer(i, audioAttributesCompatParcelizer, z);
    }

    @Override // kotlin.PolymorphicTypeValidator
    public int read(Object obj) {
        return this.write.read(obj);
    }

    @Override // kotlin.PolymorphicTypeValidator
    public Object write(int i) {
        return this.write.write(i);
    }
}
