package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/ApicFrame;", "p0", "", "p1", "Lo/getPauseAtEndOfMediaItems;", "RemoteActionCompatParcelizer", "(Lo/ApicFrame;ZLo/_handleUnrecognizedCharacterEscape;I)Lo/getPauseAtEndOfMediaItems;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setUseSensorRotation {
    public static final getPauseAtEndOfMediaItems RemoteActionCompatParcelizer(ApicFrame apicFrame, boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-786344289, i, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
        }
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(apicFrame)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z)) && (i & 48) != 32) {
            z2 = false;
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z3 | z2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = findClosestPrecedingIndependentPart.IconCompatParcelizer(apicFrame, z);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        getPauseAtEndOfMediaItems getpauseatendofmediaitems = (getPauseAtEndOfMediaItems) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getpauseatendofmediaitems;
    }
}
