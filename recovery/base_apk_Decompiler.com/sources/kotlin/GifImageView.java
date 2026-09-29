package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;
import kotlin.setLayoutInflater;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001aO\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a;\u0010!\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)\"\u000e\u0010*\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00101\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00102\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00103\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00104\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100¨\u00065²\u0006\n\u00106\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u00107\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/CheckboxColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "TriStateCheckbox", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/ui/state/ToggleableState;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxRippleRadius", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxDefaultPadding", "CheckboxSize", "StrokeWidth", "RadiusSize", "material", "checkDrawFraction", "checkCenterGravitationShiftFraction"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GifImageView {
    private static final float AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(24.0f);
    private static final float read = assignParameter.IconCompatParcelizer(2.0f);
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(20.0f);
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(2.0f);
    private static final float write = assignParameter.IconCompatParcelizer(2.0f);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[MutableCoercionConfig.values().length];
            try {
                iArr[MutableCoercionConfig.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MutableCoercionConfig.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MutableCoercionConfig.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconCompatParcelizer(final boolean r29, final kotlin.getAnswerMap<? super java.lang.Boolean, kotlin.getShowPopup> r30, kotlin._handleOddName r31, boolean r32, kotlin.hashCode r33, kotlin.setOnAnimationStart r34, kotlin._handleUnrecognizedCharacterEscape r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.GifImageView.IconCompatParcelizer(boolean, o.getAnswerMap, o._handleOddName, boolean, o.hashCode, o.setOnAnimationStart, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getAnswerMap getanswermap, boolean z) {
        getanswermap.invoke(Boolean.valueOf(!z));
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(final kotlin.MutableCoercionConfig r24, final kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r25, kotlin._handleOddName r26, boolean r27, kotlin.hashCode r28, kotlin.setOnAnimationStart r29, kotlin._handleUnrecognizedCharacterEscape r30, final int r31, final int r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.GifImageView.RemoteActionCompatParcelizer(o.MutableCoercionConfig, o.getCreatedOnDateMs, o._handleOddName, boolean, o.hashCode, o.setOnAnimationStart, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void AudioAttributesCompatParcelizer(final boolean r34, final kotlin.MutableCoercionConfig r35, final kotlin._handleOddName r36, final kotlin.setOnAnimationStart r37, kotlin._handleUnrecognizedCharacterEscape r38, final int r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.GifImageView.AudioAttributesCompatParcelizer(boolean, o.MutableCoercionConfig, o._handleOddName, o.setOnAnimationStart, o._handleUnrecognizedCharacterEscape, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchCompat IconCompatParcelizer(setLayoutInflater.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        setNavigationOnClickListener setnavigationonclicklistenerIconCompatParcelizer;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1707702900);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1707702900, i, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:261)");
        }
        if (writeVar.write() == MutableCoercionConfig.AudioAttributesCompatParcelizer) {
            setnavigationonclicklistenerIconCompatParcelizer = setVerticalGravity.RemoteActionCompatParcelizer$default(100, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null);
        } else {
            setnavigationonclicklistenerIconCompatParcelizer = writeVar.RemoteActionCompatParcelizer() == MutableCoercionConfig.AudioAttributesCompatParcelizer ? setVerticalGravity.IconCompatParcelizer(100) : setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return setnavigationonclicklistenerIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchCompat RemoteActionCompatParcelizer(setLayoutInflater.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        safeSizeOf safesizeofIconCompatParcelizer;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(1075283605);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1075283605, i, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:278)");
        }
        if (writeVar.write() == MutableCoercionConfig.AudioAttributesCompatParcelizer) {
            safesizeofIconCompatParcelizer = setVerticalGravity.IconCompatParcelizer$default(0, 1, null);
        } else {
            safesizeofIconCompatParcelizer = writeVar.RemoteActionCompatParcelizer() == MutableCoercionConfig.AudioAttributesCompatParcelizer ? setVerticalGravity.IconCompatParcelizer(100) : setVerticalGravity.RemoteActionCompatParcelizer$default(100, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return safesizeofIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setFramesDisplayDuration setframesdisplayduration, parseDouble parsedouble, parseDouble parsedouble2, parseDouble parsedouble3, parseDouble parsedouble4, parseDouble parsedouble5, findSetterInfo findsetterinfo) {
        float fFloor = (float) Math.floor(findsetterinfo.AudioAttributesCompatParcelizer(IconCompatParcelizer));
        AudioAttributesCompatParcelizer(findsetterinfo, RemoteActionCompatParcelizer(parsedouble), IconCompatParcelizer(parsedouble2), findsetterinfo.AudioAttributesCompatParcelizer(write), fFloor);
        IconCompatParcelizer(findsetterinfo, read(parsedouble3), AudioAttributesCompatParcelizer(parsedouble4), write(parsedouble5), fFloor, setframesdisplayduration);
        return getShowPopup.INSTANCE;
    }

    private static final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo, long j, long j2, float f, float f2) {
        float f3 = f2 / 2.0f;
        findValueInstantiator findvalueinstantiator = new findValueInstantiator(f2, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (findsetterinfo.MediaBrowserCompatCustomActionResultReceiver() >> 32));
        if (switchToNext.RemoteActionCompatParcelizer(j, j2)) {
            long j3 = -1;
            long j4 = -1;
            findSetterInfo.RemoteActionCompatParcelizer$default(findsetterinfo, j, 0L, calloc.write((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f)) << 32) | (((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32))) & ((long) Float.floatToRawIntBits(f)))), findTypeResolver.INSTANCE, BitmapDescriptorFactory.HUE_RED, null, 0, 226, null);
            return;
        }
        long j5 = -1;
        long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f2)) << 32) | (((j5 - ((j5 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(f2))));
        float f4 = fIntBitsToFloat - (2.0f * f2);
        long j6 = -1;
        long jWrite = calloc.write((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)))));
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, f - f2);
        long j7 = -1;
        findSetterInfo.RemoteActionCompatParcelizer$default(findsetterinfo, j, jAudioAttributesCompatParcelizer, jWrite, TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32))))), findTypeResolver.INSTANCE, BitmapDescriptorFactory.HUE_RED, null, 0, 224, null);
        long j8 = -1;
        long jAudioAttributesCompatParcelizer2 = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))));
        float f5 = fIntBitsToFloat - f2;
        long j9 = -1;
        long jWrite2 = calloc.write((((long) Float.floatToRawIntBits(f5)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(f5)) << 32));
        float f6 = f - f3;
        long j10 = -1;
        findSetterInfo.RemoteActionCompatParcelizer$default(findsetterinfo, j2, jAudioAttributesCompatParcelizer2, jWrite2, TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f6)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32)))) | (Float.floatToRawIntBits(f6) << 32)), findvalueinstantiator, BitmapDescriptorFactory.HUE_RED, null, 0, 224, null);
    }

    private static final void IconCompatParcelizer(findSetterInfo findsetterinfo, long j, float f, float f2, float f3, setFramesDisplayDuration setframesdisplayduration) {
        findValueInstantiator findvalueinstantiator = new findValueInstantiator(f3, BitmapDescriptorFactory.HUE_RED, findAutoDetectVisibility.INSTANCE.IconCompatParcelizer(), 0, null, 26, null);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (findsetterinfo.MediaBrowserCompatCustomActionResultReceiver() >> 32));
        float fAudioAttributesCompatParcelizer = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(0.4f, 0.5f, f2);
        float fAudioAttributesCompatParcelizer2 = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(0.7f, 0.5f, f2);
        float fAudioAttributesCompatParcelizer3 = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(0.5f, 0.5f, f2);
        float fAudioAttributesCompatParcelizer4 = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(0.3f, 0.5f, f2);
        setframesdisplayduration.getRemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer();
        setframesdisplayduration.getRemoteActionCompatParcelizer().IconCompatParcelizer(0.2f * fIntBitsToFloat, fAudioAttributesCompatParcelizer3 * fIntBitsToFloat);
        setframesdisplayduration.getRemoteActionCompatParcelizer().write(fAudioAttributesCompatParcelizer * fIntBitsToFloat, fAudioAttributesCompatParcelizer2 * fIntBitsToFloat);
        setframesdisplayduration.getRemoteActionCompatParcelizer().write(0.8f * fIntBitsToFloat, fIntBitsToFloat * fAudioAttributesCompatParcelizer4);
        setframesdisplayduration.getWrite().AudioAttributesCompatParcelizer(setframesdisplayduration.getRemoteActionCompatParcelizer(), false);
        setframesdisplayduration.getIconCompatParcelizer().AudioAttributesImplApi26Parcelizer();
        setframesdisplayduration.getWrite().read(BitmapDescriptorFactory.HUE_RED, setframesdisplayduration.getWrite().RemoteActionCompatParcelizer() * f, setframesdisplayduration.getIconCompatParcelizer(), true);
        findSetterInfo.AudioAttributesCompatParcelizer$default(findsetterinfo, setframesdisplayduration.getIconCompatParcelizer(), j, BitmapDescriptorFactory.HUE_RED, findvalueinstantiator, (switchAndReturnNext) null, 0, 52, (Object) null);
    }

    private static final float AudioAttributesCompatParcelizer(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    private static final float write(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    private static final long read(parseDouble<switchToNext> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    private static final long RemoteActionCompatParcelizer(parseDouble<switchToNext> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    private static final long IconCompatParcelizer(parseDouble<switchToNext> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(boolean z, getAnswerMap getanswermap, _handleOddName _handleoddname, boolean z2, hashCode hashcode, setOnAnimationStart setonanimationstart, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        IconCompatParcelizer(z, getanswermap, _handleoddname, z2, hashcode, setonanimationstart, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(boolean z, MutableCoercionConfig mutableCoercionConfig, _handleOddName _handleoddname, setOnAnimationStart setonanimationstart, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) throws Throwable {
        AudioAttributesCompatParcelizer(z, mutableCoercionConfig, _handleoddname, setonanimationstart, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(MutableCoercionConfig mutableCoercionConfig, getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, boolean z, hashCode hashcode, setOnAnimationStart setonanimationstart, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) throws Throwable {
        RemoteActionCompatParcelizer(mutableCoercionConfig, getcreatedondatems, _handleoddname, z, hashcode, setonanimationstart, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
