package kotlin;

/* JADX INFO: loaded from: classes2.dex */
abstract class keys {
    protected final nonNullString AudioAttributesCompatParcelizer;

    protected abstract boolean IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j) throws SchemaAware;

    protected abstract boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware;

    public static final class read extends SchemaAware {
        public read(String str) {
            super(str, null, false, 1);
        }
    }

    protected keys(nonNullString nonnullstring) {
        this.AudioAttributesCompatParcelizer = nonnullstring;
    }

    public final boolean AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j) throws SchemaAware {
        return read(asPropertyTypeDeserializer) && IconCompatParcelizer(asPropertyTypeDeserializer, j);
    }
}
