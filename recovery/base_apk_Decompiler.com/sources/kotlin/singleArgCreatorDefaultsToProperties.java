package kotlin;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\r\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "p0", "", "read", "(ILo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/String;", "", "", "p1", "RemoteActionCompatParcelizer", "(I[Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/String;", "AudioAttributesCompatParcelizer", "(ILo/_handleUnrecognizedCharacterEscape;I)[Ljava/lang/String;", "p2", "write", "(II[Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class singleArgCreatorDefaultsToProperties {
    public static final String read(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:33)");
        }
        String string = ((Resources) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.AudioAttributesCompatParcelizer())).getString(i);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return string;
    }

    public static final String RemoteActionCompatParcelizer(int i, Object[] objArr, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = ((Resources) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.AudioAttributesCompatParcelizer())).getString(i, Arrays.copyOf(objArr, objArr.length));
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return string;
    }

    public static final String[] AudioAttributesCompatParcelizer(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1562162650, i2, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:58)");
        }
        String[] stringArray = ((Resources) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.AudioAttributesCompatParcelizer())).getStringArray(i);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return stringArray;
    }

    public static final String write(int i, int i2, Object[] objArr, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(523207213, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:85)");
        }
        String quantityString = ((Resources) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.AudioAttributesCompatParcelizer())).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return quantityString;
    }
}
