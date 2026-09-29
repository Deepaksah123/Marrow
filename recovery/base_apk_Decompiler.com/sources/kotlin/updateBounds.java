package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001fJ+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0017¢\u0006\u0002\u0010\"J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001fJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0017¢\u0006\u0002\u0010\"J+\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0017¢\u0006\u0002\u0010\"J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010$J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010$J+\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0017¢\u0006\u0002\u0010\"J\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010$J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010$J\u0013\u0010'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0013\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0014\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0015\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0016\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0017\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006,²\u0006\n\u0010-\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020\u001dX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/DefaultTextFieldColors;", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "<init>", "(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "isError", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "indicatorColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor", "error", "equals", "other", "", "hashCode", "", "material", "focused"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class updateBounds implements FormatSchema {
    private final long AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final long IconCompatParcelizer;
    private final long MediaBrowserCompatCustomActionResultReceiver;
    private final long MediaBrowserCompatItemReceiver;
    private final long MediaBrowserCompatMediaItem;
    private final long MediaBrowserCompatSearchResultReceiver;
    private final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final long MediaDescriptionCompat;
    private final long MediaMetadataCompat;
    private final long RatingCompat;
    private final long RemoteActionCompatParcelizer;
    private final long handleMediaPlayPauseIfPendingOnHandler;
    private final long onAddQueueItem;
    private final long onCommand;
    private final long onCustomAction;
    private final long onPause;
    private final long read;
    private final long write;

    private updateBounds(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.handleMediaPlayPauseIfPendingOnHandler = j;
        this.MediaBrowserCompatItemReceiver = j2;
        this.IconCompatParcelizer = j3;
        this.AudioAttributesImplApi26Parcelizer = j4;
        this.RatingCompat = j5;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = j6;
        this.MediaBrowserCompatCustomActionResultReceiver = j7;
        this.AudioAttributesCompatParcelizer = j8;
        this.onCommand = j9;
        this.RemoteActionCompatParcelizer = j10;
        this.MediaDescriptionCompat = j11;
        this.onAddQueueItem = j12;
        this.AudioAttributesImplBaseParcelizer = j13;
        this.MediaBrowserCompatMediaItem = j14;
        this.read = j15;
        this.MediaMetadataCompat = j16;
        this.onPause = j17;
        this.write = j18;
        this.MediaBrowserCompatSearchResultReceiver = j19;
        this.onCustomAction = j20;
        this.AudioAttributesImplApi21Parcelizer = j21;
    }

    @Override // kotlin.FormatSchema
    public final parseDouble<switchToNext> RemoteActionCompatParcelizer(boolean z, boolean z2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long j;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(1016171324);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1016171324, i, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:778)");
        }
        if (!z) {
            j = this.RemoteActionCompatParcelizer;
        } else if (z2) {
            j = this.MediaDescriptionCompat;
        } else {
            j = this.onCommand;
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(j), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    @Override // kotlin.FormatSchema
    public final parseDouble<switchToNext> read(boolean z, boolean z2, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long j;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1519634405);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1519634405, i, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:793)");
        }
        if (!z) {
            j = this.RemoteActionCompatParcelizer;
        } else if (z2) {
            j = this.MediaDescriptionCompat;
        } else {
            j = this.onCommand;
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(j), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    @Override // kotlin.FormatSchema
    public final parseDouble<switchToNext> read(boolean z, boolean z2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long j;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(225259054);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(225259054, i, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:805)");
        }
        if (!z) {
            j = this.AudioAttributesImplBaseParcelizer;
        } else if (z2) {
            j = this.MediaBrowserCompatMediaItem;
        } else {
            j = this.onAddQueueItem;
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(j), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    @Override // kotlin.FormatSchema
    public final parseDouble<switchToNext> IconCompatParcelizer(boolean z, boolean z2, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long j;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(1383318157);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1383318157, i, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:820)");
        }
        if (!z) {
            j = this.AudioAttributesImplBaseParcelizer;
        } else if (z2) {
            j = this.MediaBrowserCompatMediaItem;
        } else {
            j = this.onAddQueueItem;
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(j), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    @Override // kotlin.FormatSchema
    public final parseDouble<switchToNext> write(boolean z, boolean z2, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long j;
        parseDouble<switchToNext> parsedouble;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(998675979);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(998675979, i, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:835)");
        }
        parseDouble<Boolean> parsedoubleAudioAttributesCompatParcelizer = getSystemWindowInsets.AudioAttributesCompatParcelizer(insetVar, _handleunrecognizedcharacterescape, (i >> 6) & 14);
        if (!z) {
            j = this.AudioAttributesCompatParcelizer;
        } else if (z2) {
            j = this.MediaBrowserCompatCustomActionResultReceiver;
        } else {
            j = IconCompatParcelizer(parsedoubleAudioAttributesCompatParcelizer) ? this.RatingCompat : this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
        long j2 = j;
        if (z) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(318120148);
            parsedouble = setTextMetricsParamsCompat.read(j2, setVerticalGravity.RemoteActionCompatParcelizer$default(150, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null), null, null, _handleunrecognizedcharacterescape, 48, 12);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(318223006);
            parsedouble = _qbuf.read(switchToNext.write(j2), _handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    @Override // kotlin.FormatSchema
    public final parseDouble<switchToNext> IconCompatParcelizer(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1423938813);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1423938813, i, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:853)");
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(this.read), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    @Override // kotlin.FormatSchema
    public final parseDouble<switchToNext> RemoteActionCompatParcelizer(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(264799724);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(264799724, i, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:858)");
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(z ? this.onCustomAction : this.AudioAttributesImplApi21Parcelizer), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    @Override // kotlin.FormatSchema
    public final parseDouble<switchToNext> RemoteActionCompatParcelizer(boolean z, boolean z2, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long j;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(727091888);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(727091888, i, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:867)");
        }
        parseDouble<Boolean> parsedoubleAudioAttributesCompatParcelizer = getSystemWindowInsets.AudioAttributesCompatParcelizer(insetVar, _handleunrecognizedcharacterescape, (i >> 6) & 14);
        if (!z) {
            j = this.write;
        } else if (z2) {
            j = this.MediaBrowserCompatSearchResultReceiver;
        } else {
            j = write(parsedoubleAudioAttributesCompatParcelizer) ? this.MediaMetadataCompat : this.onPause;
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(j), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    @Override // kotlin.FormatSchema
    public final parseDouble<switchToNext> AudioAttributesCompatParcelizer(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(9804418);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(9804418, i, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:881)");
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(z ? this.handleMediaPlayPauseIfPendingOnHandler : this.MediaBrowserCompatItemReceiver), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    @Override // kotlin.FormatSchema
    public final parseDouble<switchToNext> read(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1446422485);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1446422485, i, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:886)");
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(z ? this.AudioAttributesImplApi26Parcelizer : this.IconCompatParcelizer), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        updateBounds updatebounds = (updateBounds) other;
        return switchToNext.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, updatebounds.handleMediaPlayPauseIfPendingOnHandler) && switchToNext.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, updatebounds.MediaBrowserCompatItemReceiver) && switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, updatebounds.IconCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, updatebounds.AudioAttributesImplApi26Parcelizer) && switchToNext.RemoteActionCompatParcelizer(this.RatingCompat, updatebounds.RatingCompat) && switchToNext.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, updatebounds.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && switchToNext.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, updatebounds.MediaBrowserCompatCustomActionResultReceiver) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, updatebounds.AudioAttributesCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.onCommand, updatebounds.onCommand) && switchToNext.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, updatebounds.RemoteActionCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, updatebounds.MediaDescriptionCompat) && switchToNext.RemoteActionCompatParcelizer(this.onAddQueueItem, updatebounds.onAddQueueItem) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, updatebounds.AudioAttributesImplBaseParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, updatebounds.MediaBrowserCompatMediaItem) && switchToNext.RemoteActionCompatParcelizer(this.read, updatebounds.read) && switchToNext.RemoteActionCompatParcelizer(this.MediaMetadataCompat, updatebounds.MediaMetadataCompat) && switchToNext.RemoteActionCompatParcelizer(this.onPause, updatebounds.onPause) && switchToNext.RemoteActionCompatParcelizer(this.write, updatebounds.write) && switchToNext.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, updatebounds.MediaBrowserCompatSearchResultReceiver) && switchToNext.RemoteActionCompatParcelizer(this.onCustomAction, updatebounds.onCustomAction) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, updatebounds.AudioAttributesImplApi21Parcelizer);
    }

    public final int hashCode() {
        int iMediaBrowserCompatItemReceiver = switchToNext.MediaBrowserCompatItemReceiver(this.handleMediaPlayPauseIfPendingOnHandler);
        int iMediaBrowserCompatItemReceiver2 = switchToNext.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatItemReceiver);
        int iMediaBrowserCompatItemReceiver3 = switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
        int iMediaBrowserCompatItemReceiver4 = switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesImplApi26Parcelizer);
        int iMediaBrowserCompatItemReceiver5 = switchToNext.MediaBrowserCompatItemReceiver(this.RatingCompat);
        int iMediaBrowserCompatItemReceiver6 = switchToNext.MediaBrowserCompatItemReceiver(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        int iMediaBrowserCompatItemReceiver7 = switchToNext.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatCustomActionResultReceiver);
        int iMediaBrowserCompatItemReceiver8 = switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
        int iMediaBrowserCompatItemReceiver9 = switchToNext.MediaBrowserCompatItemReceiver(this.onCommand);
        int iMediaBrowserCompatItemReceiver10 = switchToNext.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
        int iMediaBrowserCompatItemReceiver11 = switchToNext.MediaBrowserCompatItemReceiver(this.MediaDescriptionCompat);
        int iMediaBrowserCompatItemReceiver12 = switchToNext.MediaBrowserCompatItemReceiver(this.onAddQueueItem);
        int iMediaBrowserCompatItemReceiver13 = switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesImplBaseParcelizer);
        int iMediaBrowserCompatItemReceiver14 = switchToNext.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatMediaItem);
        int iMediaBrowserCompatItemReceiver15 = switchToNext.MediaBrowserCompatItemReceiver(this.read);
        int iMediaBrowserCompatItemReceiver16 = switchToNext.MediaBrowserCompatItemReceiver(this.MediaMetadataCompat);
        int iMediaBrowserCompatItemReceiver17 = switchToNext.MediaBrowserCompatItemReceiver(this.onPause);
        int iMediaBrowserCompatItemReceiver18 = switchToNext.MediaBrowserCompatItemReceiver(this.write);
        return (((((((((((((((((((((((((((((((((((((((iMediaBrowserCompatItemReceiver * 31) + iMediaBrowserCompatItemReceiver2) * 31) + iMediaBrowserCompatItemReceiver3) * 31) + iMediaBrowserCompatItemReceiver4) * 31) + iMediaBrowserCompatItemReceiver5) * 31) + iMediaBrowserCompatItemReceiver6) * 31) + iMediaBrowserCompatItemReceiver7) * 31) + iMediaBrowserCompatItemReceiver8) * 31) + iMediaBrowserCompatItemReceiver9) * 31) + iMediaBrowserCompatItemReceiver10) * 31) + iMediaBrowserCompatItemReceiver11) * 31) + iMediaBrowserCompatItemReceiver12) * 31) + iMediaBrowserCompatItemReceiver13) * 31) + iMediaBrowserCompatItemReceiver14) * 31) + iMediaBrowserCompatItemReceiver15) * 31) + iMediaBrowserCompatItemReceiver16) * 31) + iMediaBrowserCompatItemReceiver17) * 31) + iMediaBrowserCompatItemReceiver18) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatSearchResultReceiver)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.onCustomAction)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesImplApi21Parcelizer);
    }

    private static final boolean IconCompatParcelizer(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }

    private static final boolean write(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }

    public /* synthetic */ updateBounds(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }
}
