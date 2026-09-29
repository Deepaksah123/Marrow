package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lo/_handleOddName;", "Lo/inset;", "p0", "Lo/PopupLayout;", "p1", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;Lo/inset;Lo/PopupLayout;)Lo/_handleOddName;", "Lo/CharacterEscapes;", "write", "Lo/CharacterEscapes;", "read", "()Lo/CharacterEscapes;", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setResetBlock {
    private static final CharacterEscapes<PopupLayout> write = resetAsNaN.RemoteActionCompatParcelizer$default(null, new getCreatedOnDateMs() { // from class: o.getPositionProvider
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return setResetBlock.RemoteActionCompatParcelizer();
        }
    }, 1, null);

    /* JADX INFO: renamed from: o.setResetBlock$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "read", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ PopupLayout $AudioAttributesCompatParcelizer;
        final /* synthetic */ inset $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            read(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void read(as asVar) {
            asVar.write("indication");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("interactionSource", this.$read);
            asVar.getIconCompatParcelizer().IconCompatParcelizer("indication", this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(inset insetVar, PopupLayout popupLayout) {
            super(1);
            this.$read = insetVar;
            this.$AudioAttributesCompatParcelizer = popupLayout;
        }
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final inset insetVar, final PopupLayout popupLayout) {
        if (popupLayout == null) {
            return _handleoddname;
        }
        if (popupLayout instanceof setParentLayoutDirection) {
            return _handleoddname.AudioAttributesCompatParcelizer(new getParentLayoutDirection(insetVar, (setParentLayoutDirection) popupLayout));
        }
        return _verifyNLZ2.AudioAttributesCompatParcelizer(_handleoddname, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass3(insetVar, popupLayout) : C0214type.read(), new getModuleData() { // from class: o.setLayoutDirection
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return setResetBlock.read(popupLayout, insetVar, (_handleOddName) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _handleOddName read(PopupLayout popupLayout, inset insetVar, _handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-353972293);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-353972293, i, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
        }
        getUpdateBlock getupdateblockIconCompatParcelizer = popupLayout.IconCompatParcelizer(insetVar, _handleunrecognizedcharacterescape, 0);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getupdateblockIconCompatParcelizer);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new getPopupContentSizebOM6tXw(getupdateblockIconCompatParcelizer);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        getPopupContentSizebOM6tXw getpopupcontentsizebom6txw = (getPopupContentSizebOM6tXw) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return getpopupcontentsizebom6txw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PopupLayout RemoteActionCompatParcelizer() {
        return setViewInfosui_tooling.INSTANCE;
    }

    public static final CharacterEscapes<PopupLayout> read() {
        return write;
    }
}
