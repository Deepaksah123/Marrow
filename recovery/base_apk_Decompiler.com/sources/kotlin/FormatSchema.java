package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0007J-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\rJ%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u000eJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\rJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u000eJ-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\b\u0010\rJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/FormatSchema;", "", "", "p0", "Lo/parseDouble;", "Lo/switchToNext;", "AudioAttributesCompatParcelizer", "(ZLo/_handleUnrecognizedCharacterEscape;I)Lo/parseDouble;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "p1", "Lo/inset;", "p2", "(ZZLo/inset;Lo/_handleUnrecognizedCharacterEscape;I)Lo/parseDouble;", "(ZZLo/_handleUnrecognizedCharacterEscape;I)Lo/parseDouble;", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FormatSchema {
    parseDouble<switchToNext> AudioAttributesCompatParcelizer(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i);

    parseDouble<switchToNext> IconCompatParcelizer(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i);

    parseDouble<switchToNext> RemoteActionCompatParcelizer(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i);

    @getRenewGrpId
    parseDouble<switchToNext> RemoteActionCompatParcelizer(boolean z, boolean z2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i);

    parseDouble<switchToNext> RemoteActionCompatParcelizer(boolean z, boolean z2, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i);

    parseDouble<switchToNext> read(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i);

    @getRenewGrpId
    parseDouble<switchToNext> read(boolean z, boolean z2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i);

    parseDouble<switchToNext> write(boolean z, boolean z2, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i);

    default parseDouble<switchToNext> read(boolean z, boolean z2, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1036335134);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1036335134, i, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:123)");
        }
        parseDouble<switchToNext> parsedoubleRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(z, z2, _handleunrecognizedcharacterescape, (i & 126) | ((i >> 3) & 896));
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedoubleRemoteActionCompatParcelizer;
    }

    default parseDouble<switchToNext> IconCompatParcelizer(boolean z, boolean z2, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(454310320);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(454310320, i, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:155)");
        }
        parseDouble<switchToNext> parsedouble = read(z, z2, _handleunrecognizedcharacterescape, (i & 126) | ((i >> 3) & 896));
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }
}
