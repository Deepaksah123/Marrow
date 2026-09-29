package kotlin;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "Lo/switchToNext;", "IconCompatParcelizer", "(ILo/_handleUnrecognizedCharacterEscape;I)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class requireCtorAnnotation {
    public static final long IconCompatParcelizer(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1777644873, i2, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:34)");
        }
        long jAudioAttributesCompatParcelizer = RequestPayload.AudioAttributesCompatParcelizer(_parseDoublePrimitive.RemoteActionCompatParcelizer((Resources) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.AudioAttributesCompatParcelizer()), i, ((Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer())).getTheme()));
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return jAudioAttributesCompatParcelizer;
    }
}
