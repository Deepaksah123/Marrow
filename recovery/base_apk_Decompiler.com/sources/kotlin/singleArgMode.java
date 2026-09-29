package kotlin;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "Lo/assignParameter;", "write", "(ILo/_handleUnrecognizedCharacterEscape;I)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class singleArgMode {
    public static final float write(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(804324951, i2, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:72)");
        }
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(((Resources) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.AudioAttributesCompatParcelizer())).getDimension(i) / ((bufferMapProperty) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.IconCompatParcelizer())).getRead());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return fIconCompatParcelizer;
    }
}
