package kotlin;

import com.marrow.designsystem.theme.MarrowTheme;

/* JADX INFO: loaded from: classes4.dex */
public final class setShippingAddressRequirements {
    public static final long IconCompatParcelizer(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        long onPrepareFromMediaId;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1449324145, 0, -1, "com.marrow2.ui.test.gtanalytics.utils.gtaBarColor (GtaBarColor.kt:8)");
        }
        if (i >= 70) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1231102080);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            onPrepareFromMediaId = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPlayFromSearch();
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else if (i >= 50) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1231103808);
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            onPrepareFromMediaId = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSeekTo();
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else if (i >= 30) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1231105536);
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            onPrepareFromMediaId = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnRemoveQueueItem();
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1231107037);
            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
            onPrepareFromMediaId = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId();
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return onPrepareFromMediaId;
    }
}
