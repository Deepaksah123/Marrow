package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/_handleOddName;", "", "p0", "Lo/hashCode;", "p1", "Lo/PopupLayout;", "p2", "p3", "Lo/keyDeserializers;", "p4", "Lkotlin/Function0;", "", "p5", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;ZLo/hashCode;Lo/PopupLayout;ZLo/keyDeserializers;Lo/getCreatedOnDateMs;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setResizeMode {
    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, boolean z, hashCode hashcode, PopupLayout popupLayout, boolean z2, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        TimeSignalCommand timeSignalCommandAudioAttributesCompatParcelizer$default;
        TimeSignalCommand timeSignalCommand;
        if (popupLayout instanceof setParentLayoutDirection) {
            timeSignalCommand = new TimeSignalCommand(z, hashcode, (setParentLayoutDirection) popupLayout, false, z2, c0184keyDeserializers, getcreatedondatems, null);
        } else {
            if (popupLayout != null) {
                if (hashcode != null) {
                    timeSignalCommandAudioAttributesCompatParcelizer$default = setResetBlock.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, hashcode, popupLayout).AudioAttributesCompatParcelizer(new TimeSignalCommand(z, hashcode, null, false, z2, c0184keyDeserializers, getcreatedondatems, null));
                } else {
                    timeSignalCommandAudioAttributesCompatParcelizer$default = _verifyNLZ2.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, null, new RemoteActionCompatParcelizer(popupLayout, z, z2, c0184keyDeserializers, getcreatedondatems), 1, null);
                }
                return _handleoddname.AudioAttributesCompatParcelizer(timeSignalCommandAudioAttributesCompatParcelizer$default);
            }
            timeSignalCommand = new TimeSignalCommand(z, hashcode, null, false, z2, c0184keyDeserializers, getcreatedondatems, null);
        }
        timeSignalCommandAudioAttributesCompatParcelizer$default = timeSignalCommand;
        return _handleoddname.AudioAttributesCompatParcelizer(timeSignalCommandAudioAttributesCompatParcelizer$default);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements getModuleData<_handleOddName, _handleUnrecognizedCharacterEscape, Integer, _handleOddName> {
        final /* synthetic */ PopupLayout AudioAttributesCompatParcelizer;
        final /* synthetic */ boolean IconCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs RemoteActionCompatParcelizer;
        final /* synthetic */ boolean read;
        final /* synthetic */ C0184keyDeserializers write;

        @Override // kotlin.getModuleData
        public final /* synthetic */ _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            return RemoteActionCompatParcelizer(_handleoddname, _handleunrecognizedcharacterescape, num.intValue());
        }

        public final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
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
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = setResetBlock.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, hashcode, this.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(new TimeSignalCommand(this.IconCompatParcelizer, hashcode, null, false, this.read, this.write, this.RemoteActionCompatParcelizer, null));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return _handleoddnameAudioAttributesCompatParcelizer;
        }

        public RemoteActionCompatParcelizer(PopupLayout popupLayout, boolean z, boolean z2, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs getcreatedondatems) {
            this.AudioAttributesCompatParcelizer = popupLayout;
            this.IconCompatParcelizer = z;
            this.read = z2;
            this.write = c0184keyDeserializers;
            this.RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }
}
