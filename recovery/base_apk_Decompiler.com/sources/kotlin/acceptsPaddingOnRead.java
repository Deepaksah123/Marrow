package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u001a\u009c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u000723\b\u0002\u0010\t\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a¦\u0001\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u001923\b\u0002\u0010\t\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\"\u0010\u0010\u001c\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d\"\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"TabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "edgePadding", "Landroidx/compose/ui/unit/Dp;", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowMinimumTabWidth", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class acceptsPaddingOnRead {
    private static final float write = assignParameter.IconCompatParcelizer(90.0f);
    private static final setOrientation<Float> AudioAttributesCompatParcelizer = setVerticalGravity.RemoteActionCompatParcelizer$default(250, 0, setShowText.AudioAttributesCompatParcelizer(), 2, (Object) null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(int i, List list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1896966245, i2, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:141)");
        }
        Base64Variant base64Variant = Base64Variant.write;
        base64Variant.write(base64Variant.read(_handleOddName.INSTANCE, (_reportBase64UnexpectedPadding) list.get(i)), BitmapDescriptorFactory.HUE_RED, 0L, _handleunrecognizedcharacterescape, 3072, 6);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(final int r25, kotlin._handleOddName r26, long r27, long r29, kotlin.getModuleData<? super java.util.List<kotlin._reportBase64UnexpectedPadding>, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r31, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r32, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r33, kotlin._handleUnrecognizedCharacterEscape r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.acceptsPaddingOnRead.read(int, o._handleOddName, long, long, o.getModuleData, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, final getModuleData getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-638448612, i, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:151)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody2);
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getmoduledata);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new MagicModuleSubmissionRequestBody() { // from class: o.usesPadding
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return acceptsPaddingOnRead.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, getmoduledata, (getNodeType) obj, (PropertyValueAny) obj2);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            fieldNames.read(_handleoddnameRemoteActionCompatParcelizer$default, (MagicModuleSubmissionRequestBody) objOnPause, _handleunrecognizedcharacterescape, 6, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final withHandlersFrom RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, final getModuleData getmoduledata, final getNodeType getnodetype, final PropertyValueAny propertyValueAny) {
        Object obj;
        final int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(propertyValueAny.getRead());
        List<isTypeOrSuperTypeOf> listIconCompatParcelizer = getnodetype.IconCompatParcelizer(getSchemaType.AudioAttributesCompatParcelizer, magicModuleSubmissionRequestBody);
        int size = listIconCompatParcelizer.size();
        final int i = iAudioAttributesImplBaseParcelizer / size;
        ArrayList arrayList = new ArrayList(listIconCompatParcelizer.size());
        int size2 = listIconCompatParcelizer.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(listIconCompatParcelizer.get(i2).write(PropertyValueAny.AudioAttributesCompatParcelizer$default(propertyValueAny.getRead(), i, i, 0, 0, 12, null)));
        }
        final ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int remoteActionCompatParcelizer = ((_parser) obj).getRemoteActionCompatParcelizer();
            int iWrite = IntermediateLoginResponseBody.write((List) arrayList2);
            if (iWrite > 0) {
                int i3 = 1;
                while (true) {
                    Object obj2 = arrayList2.get(i3);
                    int remoteActionCompatParcelizer2 = ((_parser) obj2).getRemoteActionCompatParcelizer();
                    if (remoteActionCompatParcelizer < remoteActionCompatParcelizer2) {
                        obj = obj2;
                        remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                    }
                    if (i3 == iWrite) {
                        break;
                    }
                    i3++;
                }
            }
        }
        _parser _parserVar = (_parser) obj;
        int remoteActionCompatParcelizer3 = _parserVar != null ? _parserVar.getRemoteActionCompatParcelizer() : 0;
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(new _reportBase64UnexpectedPadding(assignParameter.IconCompatParcelizer(getnodetype.b_(i) * i4), getnodetype.b_(i), null));
        }
        final ArrayList arrayList4 = arrayList3;
        final int i5 = remoteActionCompatParcelizer3;
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(getnodetype, iAudioAttributesImplBaseParcelizer, remoteActionCompatParcelizer3, null, new getAnswerMap() { // from class: o.usesPaddingChar
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj3) {
                return acceptsPaddingOnRead.IconCompatParcelizer(arrayList2, getnodetype, magicModuleSubmissionRequestBody2, i, propertyValueAny, i5, getmoduledata, arrayList4, iAudioAttributesImplBaseParcelizer, (_parser.IconCompatParcelizer) obj3);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getModuleData getmoduledata, List list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-220665376, i, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:176)");
            }
            getmoduledata.AudioAttributesCompatParcelizer(list, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(int i, List list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-233732148, i2, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:232)");
        }
        Base64Variant base64Variant = Base64Variant.write;
        base64Variant.write(base64Variant.read(_handleOddName.INSTANCE, (_reportBase64UnexpectedPadding) list.get(i)), BitmapDescriptorFactory.HUE_RED, 0L, _handleunrecognizedcharacterescape, 3072, 6);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(final int r26, kotlin._handleOddName r27, long r28, long r30, float r32, kotlin.getModuleData<? super java.util.List<kotlin._reportBase64UnexpectedPadding>, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r33, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r34, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r35, kotlin._handleUnrecognizedCharacterEscape r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.acceptsPaddingOnRead.AudioAttributesCompatParcelizer(int, o._handleOddName, long, long, float, o.getModuleData, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final float f, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, final getModuleData getmoduledata, final int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1575164555, i2, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:238)");
            }
            setTranslationY settranslationyWrite = setVerticalAlign.write(0, _handleunrecognizedcharacterescape, 0, 1);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = StreamReadException.RemoteActionCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescape);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            TopUserCompanion topUserCompanion = (TopUserCompanion) objOnPause;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(settranslationyWrite);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(topUserCompanion);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new JsonProperty(settranslationyWrite, topUserCompanion);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            final JsonProperty jsonProperty = (JsonProperty) objOnPause2;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _handleUnexpectedValue.RemoteActionCompatParcelizer(setAspectRatio.write(setVerticalAlign.read(isAdded.AudioAttributesCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), _skipWSOrEnd.INSTANCE.MediaBrowserCompatItemReceiver(), false, 2, (Object) null), settranslationyWrite, false, null, false, 14, null)));
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(f);
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody);
            boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody2);
            boolean zAudioAttributesCompatParcelizer5 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getmoduledata);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(jsonProperty);
            boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer | zAudioAttributesCompatParcelizer3 | zAudioAttributesCompatParcelizer4 | zAudioAttributesCompatParcelizer5 | zIconCompatParcelizer2 | zRemoteActionCompatParcelizer) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                Object obj = new MagicModuleSubmissionRequestBody() { // from class: o.getDefaultVariant
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj2, Object obj3) {
                        return acceptsPaddingOnRead.IconCompatParcelizer(f, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, jsonProperty, i, getmoduledata, (getNodeType) obj2, (PropertyValueAny) obj3);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(obj);
                objOnPause3 = obj;
            }
            fieldNames.read(_handleoddnameRemoteActionCompatParcelizer, (MagicModuleSubmissionRequestBody) objOnPause3, _handleunrecognizedcharacterescape, 0, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final withHandlersFrom IconCompatParcelizer(float f, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, final JsonProperty jsonProperty, final int i, final getModuleData getmoduledata, final getNodeType getnodetype, final PropertyValueAny propertyValueAny) {
        int iIconCompatParcelizer = getnodetype.IconCompatParcelizer(write);
        final int iIconCompatParcelizer2 = getnodetype.IconCompatParcelizer(f);
        long jAudioAttributesCompatParcelizer$default = PropertyValueAny.AudioAttributesCompatParcelizer$default(propertyValueAny.getRead(), iIconCompatParcelizer, 0, 0, 0, 14, null);
        List<isTypeOrSuperTypeOf> listIconCompatParcelizer = getnodetype.IconCompatParcelizer(getSchemaType.AudioAttributesCompatParcelizer, magicModuleSubmissionRequestBody);
        ArrayList arrayList = new ArrayList(listIconCompatParcelizer.size());
        int size = listIconCompatParcelizer.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listIconCompatParcelizer.get(i2).write(jAudioAttributesCompatParcelizer$default));
        }
        final ArrayList arrayList2 = arrayList;
        final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        iconCompatParcelizer.AudioAttributesCompatParcelizer = iIconCompatParcelizer2 << 1;
        final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2 = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            _parser _parserVar = (_parser) arrayList2.get(i3);
            iconCompatParcelizer.AudioAttributesCompatParcelizer += _parserVar.getRead();
            iconCompatParcelizer2.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer2.AudioAttributesCompatParcelizer, _parserVar.getRemoteActionCompatParcelizer());
        }
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(getnodetype, iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer2.AudioAttributesCompatParcelizer, null, new getAnswerMap() { // from class: o.Base64Variants
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return acceptsPaddingOnRead.IconCompatParcelizer(iIconCompatParcelizer2, arrayList2, getnodetype, magicModuleSubmissionRequestBody2, jsonProperty, i, propertyValueAny, iconCompatParcelizer, iconCompatParcelizer2, getmoduledata, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(int i, List list, getNodeType getnodetype, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, JsonProperty jsonProperty, int i2, PropertyValueAny propertyValueAny, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2, final getModuleData getmoduledata, _parser.IconCompatParcelizer iconCompatParcelizer3) {
        final ArrayList arrayList = new ArrayList();
        int size = list.size();
        int read = i;
        for (int i3 = 0; i3 < size; i3++) {
            _parser _parserVar = (_parser) list.get(i3);
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer3, _parserVar, read, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            arrayList.add(new _reportBase64UnexpectedPadding(getnodetype.b_(read), getnodetype.b_(_parserVar.getRead()), null));
            read += _parserVar.getRead();
        }
        List<isTypeOrSuperTypeOf> listIconCompatParcelizer = getnodetype.IconCompatParcelizer(getSchemaType.read, magicModuleSubmissionRequestBody);
        int size2 = listIconCompatParcelizer.size();
        for (int i4 = 0; i4 < size2; i4++) {
            _parser _parserVarWrite = listIconCompatParcelizer.get(i4).write(PropertyValueAny.AudioAttributesCompatParcelizer$default(propertyValueAny.getRead(), iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer, 0, 0, 8, null));
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer3, _parserVarWrite, 0, iconCompatParcelizer2.AudioAttributesCompatParcelizer - _parserVarWrite.getRemoteActionCompatParcelizer(), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        List<isTypeOrSuperTypeOf> listIconCompatParcelizer2 = getnodetype.IconCompatParcelizer(getSchemaType.IconCompatParcelizer, multiplyFft.IconCompatParcelizer(-43203918, true, new MagicModuleSubmissionRequestBody() { // from class: o.getName
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return acceptsPaddingOnRead.RemoteActionCompatParcelizer(getmoduledata, arrayList, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
        int size3 = listIconCompatParcelizer2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer3, listIconCompatParcelizer2.get(i5).write(PropertyValueAny.INSTANCE.AudioAttributesCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer2.AudioAttributesCompatParcelizer)), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        jsonProperty.IconCompatParcelizer(getnodetype, i, arrayList, i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getModuleData getmoduledata, List list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-43203918, i, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:292)");
            }
            getmoduledata.AudioAttributesCompatParcelizer(list, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(List list, getNodeType getnodetype, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, PropertyValueAny propertyValueAny, int i2, final getModuleData getmoduledata, final List list2, int i3, _parser.IconCompatParcelizer iconCompatParcelizer) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, (_parser) list.get(i4), i4 * i, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        List<isTypeOrSuperTypeOf> listIconCompatParcelizer = getnodetype.IconCompatParcelizer(getSchemaType.read, magicModuleSubmissionRequestBody);
        int size2 = listIconCompatParcelizer.size();
        for (int i5 = 0; i5 < size2; i5++) {
            _parser _parserVarWrite = listIconCompatParcelizer.get(i5).write(PropertyValueAny.AudioAttributesCompatParcelizer$default(propertyValueAny.getRead(), 0, 0, 0, 0, 11, null));
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVarWrite, 0, i2 - _parserVarWrite.getRemoteActionCompatParcelizer(), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        List<isTypeOrSuperTypeOf> listIconCompatParcelizer2 = getnodetype.IconCompatParcelizer(getSchemaType.IconCompatParcelizer, multiplyFft.IconCompatParcelizer(-220665376, true, new MagicModuleSubmissionRequestBody() { // from class: o.unexpectedPaddingMessage
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return acceptsPaddingOnRead.write(getmoduledata, list2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
        int size3 = listIconCompatParcelizer2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, listIconCompatParcelizer2.get(i6).write(PropertyValueAny.INSTANCE.AudioAttributesCompatParcelizer(i3, i2)), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, _handleOddName _handleoddname, long j, long j2, float f, getModuleData getmoduledata, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        AudioAttributesCompatParcelizer(i, _handleoddname, j, j2, f, (getModuleData<? super List<_reportBase64UnexpectedPadding>, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) getmoduledata, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, _handleOddName _handleoddname, long j, long j2, getModuleData getmoduledata, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        read(i, _handleoddname, j, j2, getmoduledata, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}
