package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratorBase extends JsonGenerator {
    protected static final int DERIVED_FEATURES_MASK = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
    public boolean _cfgNumbersAsStrings;
    protected boolean _closed;
    public int _features;
    protected ObjectCodec _objectCodec;
    public JsonWriteContext _writeContext;

    protected abstract void _verifyValueWrite(String str) throws IOException;

    public GeneratorBase(int i, ObjectCodec objectCodec) {
        this._features = i;
        this._objectCodec = objectCodec;
        this._writeContext = JsonWriteContext.createRootContext(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? DupDetector.rootDetector(this) : null);
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void setCurrentValue(Object obj) {
        JsonWriteContext jsonWriteContext = this._writeContext;
        if (jsonWriteContext != null) {
            jsonWriteContext.setCurrentValue(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (this._features & feature.getMask()) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getFeatureMask() {
        return this._features;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features &= ~mask;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = false;
                return this;
            }
            if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
                return this;
            }
            if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this._writeContext = this._writeContext.withDupDetector(null);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator setFeatureMask(int i) {
        int i2 = this._features ^ i;
        this._features = i;
        if (i2 != 0) {
            _checkStdFeatureChanges(i, i2);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i, int i2) {
        int i3 = this._features;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this._features = i4;
            _checkStdFeatureChanges(i4, i5);
        }
        return this;
    }

    public void _checkStdFeatureChanges(int i, int i2) {
        if ((DERIVED_FEATURES_MASK & i2) != 0) {
            this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
            if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i2)) {
                if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i)) {
                    setHighestNonEscapedChar(127);
                } else {
                    setHighestNonEscapedChar(0);
                }
            }
            if (JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2)) {
                if (JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i)) {
                    if (this._writeContext.getDupDetector() == null) {
                        this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector(this));
                        return;
                    }
                    return;
                }
                this._writeContext = this._writeContext.withDupDetector(null);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonStreamContext getOutputContext() {
        return this._writeContext;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        writeStartObject();
        if (obj != null) {
            setCurrentValue(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        writeFieldName(serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        writeString(serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        _reportUnsupportedOperation();
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec != null) {
            objectCodec.writeValue(this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this._closed = true;
    }

    protected String _asString(BigDecimal bigDecimal) throws IOException {
        if (JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._features)) {
            int iScale = bigDecimal.scale();
            if (iScale < -9999 || iScale > 9999) {
                _reportError(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
            }
            return bigDecimal.toPlainString();
        }
        return bigDecimal.toString();
    }

    protected final int _decodeSurrogate(int i, int i2) throws IOException {
        if (i2 < 56320 || i2 > 57343) {
            _reportError(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return ((i - 55296) << 10) + C.DEFAULT_BUFFER_SEGMENT_SIZE + (i2 - 56320);
    }

    protected void _checkRangeBoundsForByteArray(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            _reportError("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            _reportError(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    protected void _checkRangeBoundsForCharArray(char[] cArr, int i, int i2) throws IOException {
        if (cArr == null) {
            _reportError("Invalid `char[]` argument: `null`");
        }
        int length = cArr.length;
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            _reportError(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    protected void _checkRangeBoundsForString(String str, int i, int i2) throws IOException {
        if (str == null) {
            _reportError("Invalid `String` argument: `null`");
        }
        int length = str.length();
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            _reportError(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }
}
