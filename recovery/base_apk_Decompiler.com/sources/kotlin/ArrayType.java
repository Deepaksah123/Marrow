package kotlin;

import kotlin.PolymorphicTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayType extends StdArraySerializersFloatArraySerializer {
    private final JsonSerializableSchema IconCompatParcelizer;

    public ArrayType(PolymorphicTypeValidator polymorphicTypeValidator, JsonSerializableSchema jsonSerializableSchema) {
        super(polymorphicTypeValidator);
        this.IconCompatParcelizer = jsonSerializableSchema;
    }

    @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.IconCompatParcelizer write(int i, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, long j) {
        super.write(i, iconCompatParcelizer, j);
        iconCompatParcelizer.AudioAttributesImplApi26Parcelizer = this.IconCompatParcelizer;
        iconCompatParcelizer.MediaDescriptionCompat = this.IconCompatParcelizer.AudioAttributesCompatParcelizer != null ? this.IconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer : null;
        return iconCompatParcelizer;
    }
}
