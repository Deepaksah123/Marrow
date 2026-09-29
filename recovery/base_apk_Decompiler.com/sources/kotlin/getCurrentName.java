package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\r\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\u0005\u001a\u00020\u000e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0011"}, d2 = {"Lo/getCurrentName;", "", "<init>", "()V", "Lo/writeStartArray;", "AudioAttributesCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)Lo/writeStartArray;", "write", "Lo/readExternal;", "(Lo/_handleUnrecognizedCharacterEscape;I)Lo/readExternal;", "RemoteActionCompatParcelizer", "Lo/nextToken;", "(Lo/_handleUnrecognizedCharacterEscape;I)Lo/nextToken;", "read", "Lo/getParsingContext;", "(Lo/_handleUnrecognizedCharacterEscape;I)Lo/getParsingContext;", "Lo/getTokenColumnNr;", "()Lo/getTokenColumnNr;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getCurrentName {
    public static final getCurrentName INSTANCE = new getCurrentName();

    private getCurrentName() {
    }

    public final writeStartArray AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-561618718, i, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
        }
        writeStartArray writestartarray = (writeStartArray) _handleunrecognizedcharacterescape.write(writeOmittedField.read());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return writestartarray;
    }

    public final readExternal write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-942794935, i, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
        }
        readExternal readexternal = (readExternal) _handleunrecognizedcharacterescape.write(mayMatchElement.RemoteActionCompatParcelizer());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return readexternal;
    }

    public final nextToken RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(419509830, i, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:137)");
        }
        nextToken nexttoken = (nextToken) _handleunrecognizedcharacterescape.write(requiresCustomCodec.IconCompatParcelizer());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return nexttoken;
    }

    public final getParsingContext read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-506613891, i, -1, "androidx.compose.material3.MaterialTheme.<get-motionScheme> (MaterialTheme.kt:141)");
        }
        getParsingContext getparsingcontext = (getParsingContext) _handleunrecognizedcharacterescape.write(AudioAttributesCompatParcelizer());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getparsingcontext;
    }

    public final getTokenColumnNr<getParsingContext> AudioAttributesCompatParcelizer() {
        return getCurrentTokenId.IconCompatParcelizer;
    }
}
