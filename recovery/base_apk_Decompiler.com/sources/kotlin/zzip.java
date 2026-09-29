package kotlin;

import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;

/* JADX INFO: loaded from: classes4.dex */
public final class zzip {
    public static final zzip read = new zzip();
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer = multiplyFft.IconCompatParcelizer(563591585, false, new MagicModuleSubmissionRequestBody() { // from class: o.zzit
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return zzip.RemoteActionCompatParcelizer((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer = multiplyFft.IconCompatParcelizer(38181002, false, new MagicModuleSubmissionRequestBody() { // from class: o.zzir
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return zzip.read((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write = multiplyFft.IconCompatParcelizer(-37657559, false, new MagicModuleSubmissionRequestBody() { // from class: o.zziw
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return zzip.MediaBrowserCompatItemReceiver((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(563591585, i, -1, "com.marrow2.ui.review_components.ui.misc.ComposableSingletons$BookmarkTooltipKt.lambda$563591585.<anonymous> (BookmarkTooltip.kt:50)");
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.bookmark_rv, _handleunrecognizedcharacterescape, 6);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            value.read(isannotationbundleRemoteActionCompatParcelizer, null, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(38181002, i, -1, "com.marrow2.ui.review_components.ui.misc.ComposableSingletons$BookmarkTooltipKt.lambda$38181002.<anonymous> (BookmarkTooltip.kt:58)");
            }
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            value.read(getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.star_rv, _handleunrecognizedcharacterescape, 6), null, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-37657559, i, -1, "com.marrow2.ui.review_components.ui.misc.ComposableSingletons$BookmarkTooltipKt.lambda$-37657559.<anonymous> (BookmarkTooltip.kt:66)");
            }
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            value.read(getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.help_rv, _handleunrecognizedcharacterescape, 6), null, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSeekTo(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write() {
        return write;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }
}
