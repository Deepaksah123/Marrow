package com.marrow.designsystem.theme;

import kotlin.Metadata;
import kotlin._handleUnrecognizedCharacterEscape;
import kotlin._validJsonValueList;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/designsystem/theme/MarrowTheme;", "", "<init>", "()V", "Lcom/marrow/designsystem/theme/ExtendedColors;", "RemoteActionCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)Lcom/marrow/designsystem/theme/ExtendedColors;", "read", "Lcom/marrow/designsystem/theme/AppTheme;", "IconCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)Lcom/marrow/designsystem/theme/AppTheme;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarrowTheme {
    public static final MarrowTheme INSTANCE = new MarrowTheme();
    public static final int RemoteActionCompatParcelizer = 0;

    private MarrowTheme() {
    }

    public static ExtendedColors RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-910968631, i, -1, "com.marrow.designsystem.theme.MarrowTheme.<get-colors> (Theme.kt:372)");
        }
        ExtendedColors extendedColors = (ExtendedColors) _handleunrecognizedcharacterescape.write(ThemeKt.write());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return extendedColors;
    }

    public static AppTheme IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1203731676, i, -1, "com.marrow.designsystem.theme.MarrowTheme.<get-theme> (Theme.kt:376)");
        }
        AppTheme appTheme = (AppTheme) _handleunrecognizedcharacterescape.write(ThemeKt.IconCompatParcelizer());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return appTheme;
    }
}
