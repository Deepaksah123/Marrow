package kotlin;

import kotlin.Metadata;

/* JADX INFO: renamed from: o.obtainAndCheckReceiverPermission, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "", "p0", "Lo/getNoBackupFilesDir;", "IconCompatParcelizer", "(Lo/getAnswerMap;)Lo/getNoBackupFilesDir;", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getNoBackupFilesDir;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0193obtainAndCheckReceiverPermission {
    public static final getNoBackupFilesDir IconCompatParcelizer(getAnswerMap<? super Float, Float> getanswermap) {
        return new setType(getanswermap);
    }

    public static final getNoBackupFilesDir AudioAttributesCompatParcelizer(getAnswerMap<? super Float, Float> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-180460798, i, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:169)");
        }
        final parseDouble parsedouble = _qbuf.read(getanswermap, _handleunrecognizedcharacterescape, i & 14);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = IconCompatParcelizer(new getAnswerMap() { // from class: o.isDeviceProtectedStorage
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Float.valueOf(C0193obtainAndCheckReceiverPermission.RemoteActionCompatParcelizer(parsedouble, ((Float) obj).floatValue()));
                }
            });
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        getNoBackupFilesDir getnobackupfilesdir = (getNoBackupFilesDir) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getnobackupfilesdir;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RemoteActionCompatParcelizer(parseDouble parsedouble, float f) {
        return ((Number) ((getAnswerMap) parsedouble.getRemoteActionCompatParcelizer()).invoke(Float.valueOf(f))).floatValue();
    }
}
