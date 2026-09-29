package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.setLayoutInflater;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001aY\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001ac\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u001b\u001a\u001d\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0002\u0010/\"\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0016\u0010\u001f\u001a\u00020\u001dX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010!\"\u0010\u0010\"\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0016\u0010#\u001a\u00020\u001dX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b$\u0010!\"\u0010\u0010%\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0010\u0010&\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0010\u0010'\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u000e\u0010(\u001a\u00020)X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020)X\u0080T¢\u0006\u0002\n\u0000¨\u00060²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"DropdownMenuContent", "", "expandedStates", "Landroidx/compose/animation/core/MutableTransitionState;", "", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItemContent", "onClick", "Lkotlin/Function0;", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MenuElevation", "Landroidx/compose/ui/unit/Dp;", "F", "MenuVerticalMargin", "getMenuVerticalMargin", "()F", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "DropdownMenuItemDefaultMinHeight", "InTransitionDuration", "", "OutTransitionDuration", "calculateTransformOrigin", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "menuBounds", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "material", "scale", "", "alpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _predefined {
    private static final float AudioAttributesImplBaseParcelizer = assignParameter.IconCompatParcelizer(8.0f);
    private static final float AudioAttributesImplApi26Parcelizer = assignParameter.IconCompatParcelizer(48.0f);
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(16.0f);
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(8.0f);
    private static final float read = assignParameter.IconCompatParcelizer(112.0f);
    private static final float write = assignParameter.IconCompatParcelizer(280.0f);
    private static final float AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(48.0f);

    /* JADX WARN: Removed duplicated region for block: B:107:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(final kotlin.setCollapseIcon<java.lang.Boolean> r22, final kotlin.InputAccessor<kotlin.findCreatorAnnotation> r23, final kotlin.setTranslationY r24, kotlin._handleOddName r25, final kotlin.getModuleData<? super kotlin.DrawerLayoutLayoutParams, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r26, kotlin._handleUnrecognizedCharacterEscape r27, final int r28, final int r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._predefined.RemoteActionCompatParcelizer(o.setCollapseIcon, o.InputAccessor, o.setTranslationY, o._handleOddName, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchCompat write(setLayoutInflater.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        safeSizeOf safesizeofRemoteActionCompatParcelizer$default;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(445475263);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(445475263, i, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:161)");
        }
        if (writeVar.IconCompatParcelizer(Boolean.FALSE, Boolean.TRUE)) {
            safesizeofRemoteActionCompatParcelizer$default = setVerticalGravity.RemoteActionCompatParcelizer$default(120, 0, setShowText.RemoteActionCompatParcelizer(), 2, (Object) null);
        } else {
            safesizeofRemoteActionCompatParcelizer$default = setVerticalGravity.RemoteActionCompatParcelizer$default(1, 74, (setOnQueryTextFocusChangeListener) null, 4, (Object) null);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return safesizeofRemoteActionCompatParcelizer$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchCompat IconCompatParcelizer(setLayoutInflater.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        safeSizeOf safesizeofRemoteActionCompatParcelizer$default;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(701003475);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(701003475, i, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:182)");
        }
        if (writeVar.IconCompatParcelizer(Boolean.FALSE, Boolean.TRUE)) {
            safesizeofRemoteActionCompatParcelizer$default = setVerticalGravity.RemoteActionCompatParcelizer$default(30, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null);
        } else {
            safesizeofRemoteActionCompatParcelizer$default = setVerticalGravity.RemoteActionCompatParcelizer$default(75, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return safesizeofRemoteActionCompatParcelizer$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(InputAccessor inputAccessor, parseDouble parsedouble, parseDouble parsedouble2, validateAppend validateappend) {
        validateappend.MediaBrowserCompatSearchResultReceiver(IconCompatParcelizer(parsedouble));
        validateappend.MediaDescriptionCompat(IconCompatParcelizer(parsedouble));
        validateappend.MediaBrowserCompatItemReceiver(RemoteActionCompatParcelizer(parsedouble2));
        validateappend.MediaBrowserCompatCustomActionResultReceiver(((findCreatorAnnotation) inputAccessor.getRemoteActionCompatParcelizer()).getRead());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, setTranslationY settranslationy, getModuleData getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-707086267, i, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:209)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer = setVerticalAlign.IconCompatParcelizer(getAllowEnterTransitionOverlap.AudioAttributesCompatParcelizer(getParentFragment.write$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, RemoteActionCompatParcelizer, 1, null), dump.read), settranslationy, false, null, false, 14, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getmoduledata.AudioAttributesCompatParcelizer(DrawerLayoutSavedState.INSTANCE, _handleunrecognizedcharacterescape, 6);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(final kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r25, kotlin._handleOddName r26, boolean r27, kotlin.getReturnTransition r28, kotlin.hashCode r29, final kotlin.getModuleData<? super kotlin.getViewLifecycleOwnerLiveData, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r30, kotlin._handleUnrecognizedCharacterEscape r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._predefined.read(o.getCreatedOnDateMs, o._handleOddName, boolean, o.getReturnTransition, o.hashCode, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(boolean z, final getModuleData getmoduledata, final getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        float fAudioAttributesCompatParcelizer;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-77738101, i, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:251)");
            }
            if (z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1691869137);
                fAudioAttributesCompatParcelizer = GraphRequestParcelableResourceWithMimeType.INSTANCE.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 6);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1691868397);
                fAudioAttributesCompatParcelizer = GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            resetAsNaN.write(AccessToken.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(Float.valueOf(fAudioAttributesCompatParcelizer)), multiplyFft.AudioAttributesCompatParcelizer(-308149173, true, new MagicModuleSubmissionRequestBody() { // from class: o.JsonAutoDetectValue
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return _predefined.AudioAttributesCompatParcelizer(getmoduledata, getviewlifecycleownerlivedata, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getModuleData getmoduledata, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-308149173, i, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:252)");
            }
            getmoduledata.AudioAttributesCompatParcelizer(getviewlifecycleownerlivedata, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    public static final float read() {
        return AudioAttributesImplApi26Parcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long write(kotlin.appendReferring r5, kotlin.appendReferring r6) {
        /*
            int r0 = r6.getRead()
            int r1 = r5.getAudioAttributesCompatParcelizer()
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 < r1) goto Le
            goto L48
        Le:
            int r0 = r6.getAudioAttributesCompatParcelizer()
            int r1 = r5.getRead()
            if (r0 > r1) goto L1a
            r0 = r3
            goto L49
        L1a:
            int r0 = r6.MediaBrowserCompatItemReceiver()
            if (r0 == 0) goto L48
            int r0 = r5.getRead()
            int r1 = r6.getRead()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getAudioAttributesCompatParcelizer()
            int r4 = r6.getAudioAttributesCompatParcelizer()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getRead()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.MediaBrowserCompatItemReceiver()
            float r1 = (float) r1
            float r0 = r0 / r1
            goto L49
        L48:
            r0 = r2
        L49:
            int r1 = r6.getWrite()
            int r4 = r5.getIconCompatParcelizer()
            if (r1 < r4) goto L54
            goto L8e
        L54:
            int r1 = r6.getIconCompatParcelizer()
            int r4 = r5.getWrite()
            if (r1 <= r4) goto L8d
            int r1 = r6.IconCompatParcelizer()
            if (r1 == 0) goto L8e
            int r1 = r5.getWrite()
            int r2 = r6.getWrite()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getIconCompatParcelizer()
            int r2 = r6.getIconCompatParcelizer()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getWrite()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.IconCompatParcelizer()
            float r6 = (float) r6
            float r2 = r5 / r6
            goto L8e
        L8d:
            r2 = r3
        L8e:
            long r5 = kotlin.findDeserializationConverter.read(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._predefined.write(o.appendReferring, o.appendReferring):long");
    }

    private static final float IconCompatParcelizer(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    private static final float RemoteActionCompatParcelizer(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setCollapseIcon setcollapseicon, InputAccessor inputAccessor, setTranslationY settranslationy, _handleOddName _handleoddname, getModuleData getmoduledata, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) throws Throwable {
        RemoteActionCompatParcelizer(setcollapseicon, inputAccessor, settranslationy, _handleoddname, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, boolean z, getReturnTransition getreturntransition, hashCode hashcode, getModuleData getmoduledata, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        read(getcreatedondatems, _handleoddname, z, getreturntransition, hashcode, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
