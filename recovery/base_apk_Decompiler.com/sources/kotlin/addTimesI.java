package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001aa\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\b\u0001\u0012\u00020\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a=\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0007¢\u0006\u0002\u0010\f\u001aS\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\b\u0001\u0012\u00020\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0007¢\u0006\u0002\u0010\r\u001a[\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000e\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\b\u0001\u0012\u00020\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e0\nH\u0007¢\u0006\u0002\u0010\u0010\u001ag\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000e\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\b\u0001\u0012\u00020\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e0\nH\u0007¢\u0006\u0002\u0010\u0011\u001a>\u0010\u0012\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\u0006\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006H\u0000\u001a\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0000\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"rememberSaveable", "T", "", "inputs", "", "saver", "Landroidx/compose/runtime/saveable/Saver;", "key", "", "init", "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Landroidx/compose/runtime/MutableState;", "stateSaver", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/MutableState;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "mutableStateSaver", "inner", "requireCanBeSaved", "", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "generateCannotBeSavedErrorMessage", "MaxSupportedRadix", "", "runtime-saveable"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class addTimesI {
    private static final int IconCompatParcelizer = 36;

    @getRenewGrpId
    public static final <T> T RemoteActionCompatParcelizer(final Object[] objArr, parseManyDecDigits<T, ? extends Object> parsemanydecdigits, String str, getCreatedOnDateMs<? extends T> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        Object objAudioAttributesCompatParcelizer;
        if ((i2 & 2) != 0) {
            parsemanydecdigits = JavaDoubleBitsFromByteArray.AudioAttributesCompatParcelizer();
        }
        T tInvoke = null;
        if ((i2 & 4) != 0) {
            str = null;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(441892779, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long jRemoteActionCompatParcelizer = _getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0);
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            str = Long.toString(jRemoteActionCompatParcelizer, setStatusTimestamp.RemoteActionCompatParcelizer(IconCompatParcelizer));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        }
        toMagicModuleMetaRepoModel.read(parsemanydecdigits, "");
        final JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence = (JavaBigIntegerFromCharSequence) _handleunrecognizedcharacterescape.write(parseBigIntegerLiteral.AudioAttributesCompatParcelizer());
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            if (javaBigIntegerFromCharSequence != null && (objAudioAttributesCompatParcelizer = javaBigIntegerFromCharSequence.AudioAttributesCompatParcelizer(str)) != null) {
                tInvoke = parsemanydecdigits.IconCompatParcelizer(objAudioAttributesCompatParcelizer);
            }
            if (tInvoke == null) {
                tInvoke = getcreatedondatems.invoke();
            }
            Object squareinto = new squareInto(parsemanydecdigits, javaBigIntegerFromCharSequence, str, tInvoke, objArr);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(squareinto);
            objOnPause = squareinto;
        }
        final squareInto squareinto2 = (squareInto) objOnPause;
        T tInvoke2 = (T) squareinto2.read(objArr);
        if (tInvoke2 == null) {
            tInvoke2 = getcreatedondatems.invoke();
        }
        final T t = tInvoke2;
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(squareinto2);
        boolean z = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.IconCompatParcelizer(parsemanydecdigits)) || (i & 48) == 32;
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(javaBigIntegerFromCharSequence);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(t);
        boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(objArr);
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if ((z | zIconCompatParcelizer | zIconCompatParcelizer2 | zAudioAttributesCompatParcelizer | zIconCompatParcelizer3 | zIconCompatParcelizer4) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            final parseManyDecDigits<T, ? extends Object> parsemanydecdigits2 = parsemanydecdigits;
            final String str3 = str;
            objOnPause2 = new getCreatedOnDateMs() { // from class: o.FftMultiplierMutableComplex
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return addTimesI.RemoteActionCompatParcelizer(squareinto2, parsemanydecdigits2, javaBigIntegerFromCharSequence, str3, t, objArr);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        StreamReadException.write((getCreatedOnDateMs) objOnPause2, _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(squareInto squareinto, parseManyDecDigits parsemanydecdigits, JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence, String str, Object obj, Object[] objArr) {
        squareinto.AudioAttributesCompatParcelizer(parsemanydecdigits, javaBigIntegerFromCharSequence, str, obj, objArr);
        return getShowPopup.INSTANCE;
    }

    public static final <T> T read(Object[] objArr, getCreatedOnDateMs<? extends T> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1564532345, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        T t = (T) RemoteActionCompatParcelizer(Arrays.copyOf(objArr, objArr.length), JavaDoubleBitsFromByteArray.AudioAttributesCompatParcelizer(), null, getcreatedondatems, _handleunrecognizedcharacterescape, ((i << 6) & 7168) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return t;
    }

    public static final <T> T read(Object[] objArr, parseManyDecDigits<T, ? extends Object> parsemanydecdigits, getCreatedOnDateMs<? extends T> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(674689872, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:180)");
        }
        T t = (T) RemoteActionCompatParcelizer(Arrays.copyOf(objArr, objArr.length), parsemanydecdigits, null, getcreatedondatems, _handleunrecognizedcharacterescape, (i & 112) | RendererCapabilities.MODE_SUPPORT_MASK | ((i << 3) & 7168), 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence, Object obj) {
        String string;
        if (obj == null || javaBigIntegerFromCharSequence.AudioAttributesCompatParcelizer(obj)) {
            return;
        }
        if (obj instanceof toDecimalString) {
            toDecimalString todecimalstring = (toDecimalString) obj;
            if (todecimalstring.n_() != _qbuf.AudioAttributesCompatParcelizer() && todecimalstring.n_() != _qbuf.RemoteActionCompatParcelizer() && todecimalstring.n_() != _qbuf.read()) {
                string = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            } else {
                StringBuilder sb = new StringBuilder("MutableState containing ");
                sb.append(todecimalstring.getRemoteActionCompatParcelizer());
                sb.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().");
                string = sb.toString();
            }
        } else {
            string = read(obj);
        }
        throw new IllegalArgumentException(string);
    }

    public static final String read(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
        return sb.toString();
    }
}
