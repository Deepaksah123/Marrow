package kotlin;

import android.view.KeyEvent;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r\u001aU\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u008f\u0001\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\u0018\u001a\u0013\u0010\u0015\u001a\u00020\u0001*\u00020\u0019H\u0000¢\u0006\u0004\b\u0015\u0010\u001a\u001a\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\f\u001a\u00020\u0001*\u00020\u001dH\u0002¢\u0006\u0004\b\f\u0010\u001e\u001a\u0013\u0010\u0010\u001a\u00020\u0001*\u00020\u001dH\u0002¢\u0006\u0004\b\u0010\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u0001*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010\u001e\"\u0018\u0010\f\u001a\u00020\u0001*\u00020 8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010!\"\u0018\u0010\u0015\u001a\u00020\u0001*\u00020 8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010!\"\u0018\u0010\"\u001a\u00020\u0001*\u00020 8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010!"}, d2 = {"Lo/_handleOddName;", "", "p0", "", "p1", "Lo/keyDeserializers;", "p2", "Lo/hashCode;", "p3", "Lkotlin/Function0;", "", "p4", "RemoteActionCompatParcelizer", "(Lo/_handleOddName;ZLjava/lang/String;Lo/keyDeserializers;Lo/hashCode;Lo/getCreatedOnDateMs;)Lo/_handleOddName;", "Lo/PopupLayout;", "p5", "IconCompatParcelizer", "(Lo/_handleOddName;Lo/hashCode;Lo/PopupLayout;ZLjava/lang/String;Lo/keyDeserializers;Lo/getCreatedOnDateMs;)Lo/_handleOddName;", "p6", "p7", "p8", "read", "(Lo/_handleOddName;ZLjava/lang/String;Lo/keyDeserializers;Ljava/lang/String;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;ZLo/hashCode;Lo/getCreatedOnDateMs;)Lo/_handleOddName;", "p9", "(Lo/_handleOddName;Lo/hashCode;Lo/PopupLayout;ZLjava/lang/String;Lo/keyDeserializers;Ljava/lang/String;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;ZLo/getCreatedOnDateMs;)Lo/_handleOddName;", "Lo/createForPropertyOverride;", "(Lo/createForPropertyOverride;)Z", "write", "(Lo/PopupLayout;)Ljava/lang/String;", "Lo/_colonConcat;", "(Lo/_colonConcat;)Z", "MediaBrowserCompatCustomActionResultReceiver", "Lo/constructType;", "(Landroid/view/KeyEvent;)Z", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getLocalSavedStateRegistryOwner {
    public static /* synthetic */ _handleOddName RemoteActionCompatParcelizer$default(_handleOddName _handleoddname, boolean z, String str, C0184keyDeserializers c0184keyDeserializers, hashCode hashcode, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return RemoteActionCompatParcelizer(_handleoddname, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : c0184keyDeserializers, (i & 8) != 0 ? null : hashcode, getcreatedondatems);
    }

    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, boolean z, String str, C0184keyDeserializers c0184keyDeserializers, hashCode hashcode, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        return _handleoddname.AudioAttributesCompatParcelizer(new AndroidViewsHandler(hashcode, null, true, z, str, c0184keyDeserializers, getcreatedondatems, null));
    }

    public static /* synthetic */ _handleOddName IconCompatParcelizer$default(_handleOddName _handleoddname, hashCode hashcode, PopupLayout popupLayout, boolean z, String str, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return IconCompatParcelizer(_handleoddname, hashcode, popupLayout, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : c0184keyDeserializers, getcreatedondatems);
    }

    public static final _handleOddName read(_handleOddName _handleoddname, boolean z, String str, C0184keyDeserializers c0184keyDeserializers, String str2, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, boolean z2, hashCode hashcode, getCreatedOnDateMs<getShowPopup> getcreatedondatems3) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getFrameRate(hashcode, null, true, z, str, c0184keyDeserializers, getcreatedondatems3, str2, getcreatedondatems, getcreatedondatems2, z2, null));
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements getModuleData<_handleOddName, _handleUnrecognizedCharacterEscape, Integer, _handleOddName> {
        final /* synthetic */ String AudioAttributesCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs IconCompatParcelizer;
        final /* synthetic */ C0184keyDeserializers RemoteActionCompatParcelizer;
        final /* synthetic */ boolean read;
        final /* synthetic */ PopupLayout write;

        @Override // kotlin.getModuleData
        public final /* synthetic */ _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            return IconCompatParcelizer(_handleoddname, _handleunrecognizedcharacterescape, num.intValue());
        }

        public final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1525724089);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:634)");
            }
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = isConsumed.RemoteActionCompatParcelizer();
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            hashCode hashcode = (hashCode) objOnPause;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = setResetBlock.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, hashcode, this.write).AudioAttributesCompatParcelizer(new AndroidViewsHandler(hashcode, null, false, this.read, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, null));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return _handleoddnameAudioAttributesCompatParcelizer;
        }

        public IconCompatParcelizer(PopupLayout popupLayout, boolean z, String str, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs getcreatedondatems) {
            this.write = popupLayout;
            this.read = z;
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = c0184keyDeserializers;
            this.IconCompatParcelizer = getcreatedondatems;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class read implements getModuleData<_handleOddName, _handleUnrecognizedCharacterEscape, Integer, _handleOddName> {
        final /* synthetic */ PopupLayout AudioAttributesCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ C0184keyDeserializers AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ String AudioAttributesImplBaseParcelizer;
        final /* synthetic */ getCreatedOnDateMs IconCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ String RemoteActionCompatParcelizer;
        final /* synthetic */ boolean read;
        final /* synthetic */ boolean write;

        @Override // kotlin.getModuleData
        public final /* bridge */ /* synthetic */ _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            return AudioAttributesCompatParcelizer(_handleoddname, _handleunrecognizedcharacterescape, num.intValue());
        }

        public final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1525724089);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:634)");
            }
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = isConsumed.RemoteActionCompatParcelizer();
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            hashCode hashcode = (hashCode) objOnPause;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = setResetBlock.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, hashcode, this.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(new getFrameRate(hashcode, null, false, this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.read, null));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return _handleoddnameAudioAttributesCompatParcelizer;
        }

        public read(PopupLayout popupLayout, boolean z, String str, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs getcreatedondatems, String str2, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, boolean z2) {
            this.AudioAttributesCompatParcelizer = popupLayout;
            this.write = z;
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesImplApi26Parcelizer = c0184keyDeserializers;
            this.IconCompatParcelizer = getcreatedondatems;
            this.AudioAttributesImplBaseParcelizer = str2;
            this.AudioAttributesImplApi21Parcelizer = getcreatedondatems2;
            this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems3;
            this.read = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(KeyEvent keyEvent) {
        return _throwNotASubtype.read(_throwSubtypeClassNotAllowed.RemoteActionCompatParcelizer(keyEvent), _throwNotASubtype.INSTANCE.read()) && read(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(KeyEvent keyEvent) {
        return _throwNotASubtype.read(_throwSubtypeClassNotAllowed.RemoteActionCompatParcelizer(keyEvent), _throwNotASubtype.INSTANCE.AudioAttributesCompatParcelizer()) && read(keyEvent);
    }

    private static final boolean read(KeyEvent keyEvent) {
        long jIconCompatParcelizer = _throwSubtypeClassNotAllowed.IconCompatParcelizer(keyEvent);
        return _quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaBrowserCompatItemReceiver()) || _quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaDescriptionCompat()) || _quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onFastForward()) || _quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onPlayFromUri());
    }

    public static final boolean read(createForPropertyOverride createforpropertyoverride) {
        final MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
        PropertyName.write(createforpropertyoverride, getDataDir.INSTANCE, new getAnswerMap() { // from class: o.setContent
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getLocalSavedStateRegistryOwner.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, (createForPropertyOverride) obj));
            }
        });
        return audioAttributesCompatParcelizer.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean AudioAttributesCompatParcelizer(o.MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer r2, kotlin.createForPropertyOverride r3) {
        /*
            boolean r0 = r2.IconCompatParcelizer
            r1 = 1
            if (r0 != 0) goto L14
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.read(r3, r0)
            o.getDataDir r3 = (kotlin.getDataDir) r3
            boolean r3 = r3.getIconCompatParcelizer()
            if (r3 != 0) goto L14
            r3 = 0
            goto L15
        L14:
            r3 = r1
        L15:
            r2.IconCompatParcelizer = r3
            boolean r2 = r2.IconCompatParcelizer
            r2 = r2 ^ r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLocalSavedStateRegistryOwner.AudioAttributesCompatParcelizer(o.MagicModuleUseCaseImplWhenMappings$AudioAttributesCompatParcelizer, o.createForPropertyOverride):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String write(PopupLayout popupLayout) {
        return "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: ".concat(String.valueOf(popupLayout));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(_colonConcat _colonconcat) {
        return (_colonconcat.getMediaBrowserCompatCustomActionResultReceiver() || !_colonconcat.getAudioAttributesImplApi26Parcelizer() || _colonconcat.getRemoteActionCompatParcelizer()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(_colonConcat _colonconcat) {
        return !_colonconcat.getAudioAttributesImplApi26Parcelizer() && _colonconcat.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatCustomActionResultReceiver(_colonConcat _colonconcat) {
        return _colonconcat.getAudioAttributesImplApi26Parcelizer() && _colonconcat.getRemoteActionCompatParcelizer();
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, hashCode hashcode, PopupLayout popupLayout, boolean z, String str, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        AndroidViewsHandler androidViewsHandlerAudioAttributesCompatParcelizer$default;
        AndroidViewsHandler androidViewsHandler;
        if (popupLayout instanceof setParentLayoutDirection) {
            androidViewsHandler = new AndroidViewsHandler(hashcode, (setParentLayoutDirection) popupLayout, false, z, str, c0184keyDeserializers, getcreatedondatems, null);
        } else {
            if (popupLayout != null) {
                if (hashcode != null) {
                    androidViewsHandlerAudioAttributesCompatParcelizer$default = setResetBlock.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, hashcode, popupLayout).AudioAttributesCompatParcelizer(new AndroidViewsHandler(hashcode, null, false, z, str, c0184keyDeserializers, getcreatedondatems, null));
                } else {
                    androidViewsHandlerAudioAttributesCompatParcelizer$default = _verifyNLZ2.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, null, new IconCompatParcelizer(popupLayout, z, str, c0184keyDeserializers, getcreatedondatems), 1, null);
                }
                return _handleoddname.AudioAttributesCompatParcelizer(androidViewsHandlerAudioAttributesCompatParcelizer$default);
            }
            androidViewsHandler = new AndroidViewsHandler(hashcode, null, false, z, str, c0184keyDeserializers, getcreatedondatems, null);
        }
        androidViewsHandlerAudioAttributesCompatParcelizer$default = androidViewsHandler;
        return _handleoddname.AudioAttributesCompatParcelizer(androidViewsHandlerAudioAttributesCompatParcelizer$default);
    }

    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, hashCode hashcode, PopupLayout popupLayout, boolean z, String str, C0184keyDeserializers c0184keyDeserializers, String str2, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, boolean z2, getCreatedOnDateMs<getShowPopup> getcreatedondatems3) {
        getFrameRate getframerateAudioAttributesCompatParcelizer$default;
        getFrameRate getframerate;
        if (popupLayout instanceof setParentLayoutDirection) {
            getframerate = new getFrameRate(hashcode, (setParentLayoutDirection) popupLayout, false, z, str, c0184keyDeserializers, getcreatedondatems3, str2, getcreatedondatems, getcreatedondatems2, z2, null);
        } else {
            if (popupLayout != null) {
                if (hashcode != null) {
                    getframerateAudioAttributesCompatParcelizer$default = setResetBlock.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, hashcode, popupLayout).AudioAttributesCompatParcelizer(new getFrameRate(hashcode, null, false, z, str, c0184keyDeserializers, getcreatedondatems3, str2, getcreatedondatems, getcreatedondatems2, z2, null));
                } else {
                    getframerateAudioAttributesCompatParcelizer$default = _verifyNLZ2.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, null, new read(popupLayout, z, str, c0184keyDeserializers, getcreatedondatems3, str2, getcreatedondatems, getcreatedondatems2, z2), 1, null);
                }
                return _handleoddname.AudioAttributesCompatParcelizer(getframerateAudioAttributesCompatParcelizer$default);
            }
            getframerate = new getFrameRate(hashcode, null, false, z, str, c0184keyDeserializers, getcreatedondatems3, str2, getcreatedondatems, getcreatedondatems2, z2, null);
        }
        getframerateAudioAttributesCompatParcelizer$default = getframerate;
        return _handleoddname.AudioAttributesCompatParcelizer(getframerateAudioAttributesCompatParcelizer$default);
    }
}
