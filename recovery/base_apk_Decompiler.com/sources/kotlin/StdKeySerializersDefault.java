package kotlin;

import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface StdKeySerializersDefault extends StdKeySerializers.AudioAttributesCompatParcelizer {
    public static final StdKeySerializersDefault write = new StdKeySerializersDefault() { // from class: o.StdKeySerializersDefault.3
        private StdKeySerializersDefault AudioAttributesCompatParcelizer() {
            return this;
        }

        private StdKeySerializersDefault read() {
            return this;
        }

        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        public final /* bridge */ /* synthetic */ StdKeySerializers.AudioAttributesCompatParcelizer read(_resolveSuperClass _resolvesuperclass) {
            return read();
        }

        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        public final /* synthetic */ StdKeySerializers.AudioAttributesCompatParcelizer write(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
            return AudioAttributesCompatParcelizer();
        }

        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        public final StdKeySerializers write(JsonSerializableSchema jsonSerializableSchema) {
            throw new UnsupportedOperationException();
        }
    };
}
