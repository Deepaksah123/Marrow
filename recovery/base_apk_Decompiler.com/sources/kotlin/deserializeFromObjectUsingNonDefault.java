package kotlin;

import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DefaultCacheSize", "", "rememberTextMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "cacheSize", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextMeasurer;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class deserializeFromObjectUsingNonDefault {
    private static final int IconCompatParcelizer = 8;

    public static final deserializeFromString write(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = IconCompatParcelizer;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1538166871, i2, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        _reportMissingSetter.write writeVar = (_reportMissingSetter.write) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.AudioAttributesImplBaseParcelizer());
        bufferMapProperty buffermapproperty = (bufferMapProperty) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.IconCompatParcelizer());
        tryToResolveUnresolved trytoresolveunresolved = (tryToResolveUnresolved) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.RatingCompat());
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(writeVar);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(buffermapproperty);
        boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(trytoresolveunresolved.ordinal());
        if ((((i2 & 14) ^ 6) <= 4 || !_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z | zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zRemoteActionCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new deserializeFromString(writeVar, buffermapproperty, trytoresolveunresolved, i);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        deserializeFromString deserializefromstring = (deserializeFromString) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return deserializefromstring;
    }
}
