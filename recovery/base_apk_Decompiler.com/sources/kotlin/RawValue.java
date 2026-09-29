package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class RawValue implements findConstructor {
    private findRawSuperTypes AudioAttributesCompatParcelizer;
    private _findConverterType IconCompatParcelizer;
    private boolean read;

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.getData
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return RawValue.read();
            }
        };
    }

    static /* synthetic */ findConstructor[] read() {
        return new findConstructor[]{new RawValue()};
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        try {
            return IconCompatParcelizer(closeonfailandthrowasioe);
        } catch (SchemaAware unused) {
            return false;
        }
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.AudioAttributesCompatParcelizer = findrawsupertypes;
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        _findConverterType _findconvertertype = this.IconCompatParcelizer;
        if (_findconvertertype != null) {
            _findconvertertype.IconCompatParcelizer(j, j2);
        }
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        if (this.IconCompatParcelizer == null) {
            if (!IconCompatParcelizer(closeonfailandthrowasioe)) {
                throw SchemaAware.RemoteActionCompatParcelizer("Failed to determine bitstream type", null);
            }
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        }
        if (!this.read) {
            nonNullString nonnullstringIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(0, 1);
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            this.IconCompatParcelizer.read(this.AudioAttributesCompatParcelizer, nonnullstringIconCompatParcelizer);
            this.read = true;
        }
        return this.IconCompatParcelizer.read(closeonfailandthrowasioe, isjacksonstdimpl);
    }

    private boolean IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        RootNameLookup rootNameLookup = new RootNameLookup();
        if (rootNameLookup.read(closeonfailandthrowasioe, true) && (rootNameLookup.AudioAttributesImplApi26Parcelizer & 2) == 2) {
            int iMin = Math.min(rootNameLookup.IconCompatParcelizer, 8);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(iMin);
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, iMin);
            if (PrimitiveArrayBuilderNode.RemoteActionCompatParcelizer(write(asPropertyTypeDeserializer))) {
                this.IconCompatParcelizer = new PrimitiveArrayBuilderNode();
            } else if (_cloneFormat.IconCompatParcelizer(write(asPropertyTypeDeserializer))) {
                this.IconCompatParcelizer = new _cloneFormat();
            } else if (SimpleBeanPropertyDefinition.AudioAttributesCompatParcelizer(write(asPropertyTypeDeserializer))) {
                this.IconCompatParcelizer = new SimpleBeanPropertyDefinition();
            }
            return true;
        }
        return false;
    }

    private static AsPropertyTypeDeserializer write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
        return asPropertyTypeDeserializer;
    }
}
