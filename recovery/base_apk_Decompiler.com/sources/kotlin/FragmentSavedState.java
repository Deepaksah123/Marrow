package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/onActivityPostCreated;", "p0", "Lo/onAbandon;", "read", "(Lo/onActivityPostCreated;Lo/_handleUnrecognizedCharacterEscape;I)Lo/onAbandon;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FragmentSavedState {
    public static final onAbandon read(onActivityPostCreated onactivitypostcreated, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(2004349821, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:24)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(onactivitypostcreated)) || (i & 6) == 4;
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new dispatchFragmentsOnCreateView(onactivitypostcreated);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        dispatchFragmentsOnCreateView dispatchfragmentsoncreateview = (dispatchFragmentsOnCreateView) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return dispatchfragmentsoncreateview;
    }
}
