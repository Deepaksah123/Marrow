package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setLastHorizontalStyle;", "IconCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)Lo/setLastHorizontalStyle;", "Lo/CharacterEscapes;", "Lo/setLastVerticalBias;", "write", "Lo/CharacterEscapes;", "read", "()Lo/CharacterEscapes;", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setHorizontalStyle {
    private static final CharacterEscapes<setLastVerticalBias> write = resetAsNaN.RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o.setHorizontalGap
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return setHorizontalStyle.AudioAttributesCompatParcelizer((reportInvalidBase64Char) obj);
        }
    });

    public static final setLastHorizontalStyle IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(282942128);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(282942128, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:343)");
        }
        setLastVerticalBias setlastverticalbias = (setLastVerticalBias) _handleunrecognizedcharacterescape.write(write);
        if (setlastverticalbias == null) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return null;
        }
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setlastverticalbias);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = setlastverticalbias.write();
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        setLastHorizontalStyle setlasthorizontalstyle = (setLastHorizontalStyle) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return setlasthorizontalstyle;
    }

    public static final CharacterEscapes<setLastVerticalBias> read() {
        return write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setLastVerticalBias AudioAttributesCompatParcelizer(reportInvalidBase64Char reportinvalidbase64char) {
        return setViewCompositionStrategy.read(reportinvalidbase64char);
    }
}
