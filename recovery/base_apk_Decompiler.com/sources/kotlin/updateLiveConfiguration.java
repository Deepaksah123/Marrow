package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/ApicFrame;", "p0", "", "p1", "Lo/onAbandon;", "IconCompatParcelizer", "(Lo/ApicFrame;ILo/_handleUnrecognizedCharacterEscape;I)Lo/onAbandon;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class updateLiveConfiguration {
    public static final onAbandon IconCompatParcelizer(ApicFrame apicFrame, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(373558254, i2, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z = true;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(apicFrame)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i)) && (i2 & 48) != 32) {
            z = false;
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z2 | z) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new getTargetLiveOffsetUs(apicFrame, i);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        getTargetLiveOffsetUs gettargetliveoffsetus = (getTargetLiveOffsetUs) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return gettargetliveoffsetus;
    }
}
