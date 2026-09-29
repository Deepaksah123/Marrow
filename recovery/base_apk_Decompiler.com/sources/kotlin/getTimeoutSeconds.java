package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getTimeoutSeconds {
    public static final getTimeoutSeconds IconCompatParcelizer = new getTimeoutSeconds();
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer = multiplyFft.IconCompatParcelizer(1207952605, false, new MagicModuleSubmissionRequestBody() { // from class: o.getRequestId
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return getTimeoutSeconds.write((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1207952605, i, -1, "com.marrow2.ui.profile.fragment.ComposableSingletons$ProfileEditFragmentKt.lambda$1207952605.<anonymous> (ProfileEditFragment.kt:134)");
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read() {
        return RemoteActionCompatParcelizer;
    }
}
