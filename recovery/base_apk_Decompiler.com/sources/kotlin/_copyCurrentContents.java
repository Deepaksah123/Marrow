package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.setLayoutInflater;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¯\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00020\u000f2e\u0010\u0010\u001aa\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u0015\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "<init>", "()V", "Transition", "", "inputState", "Landroidx/compose/material/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", "content", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _copyCurrentContents {
    public static final _copyCurrentContents read = new _copyCurrentContents();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[getUseInput.values().length];
            try {
                iArr[getUseInput.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getUseInput.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getUseInput.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    private _copyCurrentContents() {
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(final kotlin.getUseInput r23, final long r24, final long r26, final kotlin.getModuleData<? super kotlin.getUseInput, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.switchToNext> r28, final boolean r29, final kotlin.markComplete<? super java.lang.Float, ? super kotlin.switchToNext, ? super kotlin.switchToNext, ? super java.lang.Float, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r30, kotlin._handleUnrecognizedCharacterEscape r31, final int r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._copyCurrentContents.IconCompatParcelizer(o.getUseInput, long, long, o.getModuleData, boolean, o.markComplete, o._handleUnrecognizedCharacterEscape, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchCompat AudioAttributesCompatParcelizer(setLayoutInflater.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-883519390);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-883519390, i, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:292)");
        }
        safeSizeOf safesizeofRemoteActionCompatParcelizer$default = setVerticalGravity.RemoteActionCompatParcelizer$default(150, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return safesizeofRemoteActionCompatParcelizer$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchCompat AudioAttributesImplApi21Parcelizer(setLayoutInflater.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        safeSizeOf safesizeofRemoteActionCompatParcelizer;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(1849239065);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1849239065, i, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:305)");
        }
        if (writeVar.IconCompatParcelizer(getUseInput.write, getUseInput.read)) {
            safesizeofRemoteActionCompatParcelizer = setVerticalGravity.RemoteActionCompatParcelizer$default(67, 0, setShowText.read(), 2, (Object) null);
        } else if (writeVar.IconCompatParcelizer(getUseInput.read, getUseInput.write) || writeVar.IconCompatParcelizer(getUseInput.IconCompatParcelizer, getUseInput.read)) {
            safesizeofRemoteActionCompatParcelizer = setVerticalGravity.RemoteActionCompatParcelizer(83, 67, setShowText.read());
        } else {
            safesizeofRemoteActionCompatParcelizer = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return safesizeofRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchCompat AudioAttributesImplBaseParcelizer(setLayoutInflater.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-2017811095);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-2017811095, i, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:333)");
        }
        safeSizeOf safesizeofRemoteActionCompatParcelizer$default = setVerticalGravity.RemoteActionCompatParcelizer$default(150, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return safesizeofRemoteActionCompatParcelizer$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchCompat AudioAttributesImplApi26Parcelizer(setLayoutInflater.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1176639650);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1176639650, i, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:344)");
        }
        safeSizeOf safesizeofRemoteActionCompatParcelizer$default = setVerticalGravity.RemoteActionCompatParcelizer$default(150, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return safesizeofRemoteActionCompatParcelizer$default;
    }

    private static final float write(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    private static final float IconCompatParcelizer(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    private static final long read(parseDouble<switchToNext> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    private static final long AudioAttributesCompatParcelizer(parseDouble<switchToNext> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_copyCurrentContents _copycurrentcontents, getUseInput getuseinput, long j, long j2, getModuleData getmoduledata, boolean z, markComplete markcomplete, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) throws Throwable {
        _copycurrentcontents.IconCompatParcelizer(getuseinput, j, j2, getmoduledata, z, markcomplete, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
