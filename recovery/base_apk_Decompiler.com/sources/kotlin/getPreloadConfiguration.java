package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aA\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/_handleOddName;", "Lkotlin/Function0;", "Lo/AudioAttributesImplApi21;", "p0", "Lo/getPauseAtEndOfMediaItems;", "p1", "Lo/superDispatchKeyEvent;", "p2", "", "p3", "p4", "read", "(Lo/_handleOddName;Lo/getCreatedOnDateMs;Lo/getPauseAtEndOfMediaItems;Lo/superDispatchKeyEvent;ZZLo/_handleUnrecognizedCharacterEscape;I)Lo/_handleOddName;", "", "", "write", "(II)F", "IconCompatParcelizer", "(IIZ)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getPreloadConfiguration {
    public static final float write(int i, int i2) {
        return i2 + (i * 500);
    }

    public static final _handleOddName read(_handleOddName _handleoddname, getCreatedOnDateMs<? extends AudioAttributesImplApi21> getcreatedondatems, getPauseAtEndOfMediaItems getpauseatendofmediaitems, superDispatchKeyEvent superdispatchkeyevent, boolean z, boolean z2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1070136913, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        _handleOddName _handleoddnameAudioAttributesCompatParcelizer = _handleoddname.AudioAttributesCompatParcelizer(new getSeekParameters(getcreatedondatems, getpauseatendofmediaitems, superdispatchkeyevent, z, z2));
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return _handleoddnameAudioAttributesCompatParcelizer;
    }

    public static final float IconCompatParcelizer(int i, int i2, boolean z) {
        if (z) {
            return write(i, i2) + 100.0f;
        }
        return write(i, i2);
    }
}
