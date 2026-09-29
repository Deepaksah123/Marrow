package kotlin;

import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\b¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0000¢\u0006\u0002\u0010\u001f\"\u001c\u0010\u000e\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Column", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DefaultColumnMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy$annotations", "()V", "getDefaultColumnMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "createColumnConstraints", "Landroidx/compose/ui/unit/Constraints;", "isPrioritizing", "", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "(ZIIII)J", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setValue {
    private static final withTypeHandler AudioAttributesCompatParcelizer = new EmojiCompatInitializer(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat());

    public static final withTypeHandler read(WindowInsetsCompatImpl30.RatingCompat ratingCompat, _skipWSOrEnd.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        EmojiCompatInitializer emojiCompatInitializer;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1089876336, i, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:108)");
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ratingCompat, WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar, _skipWSOrEnd.INSTANCE.RatingCompat())) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1446604504);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            emojiCompatInitializer = AudioAttributesCompatParcelizer;
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1446550657);
            boolean z = true;
            boolean z2 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(ratingCompat)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(writeVar)) && (i & 48) != 32) {
                z = false;
            }
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((z2 | z) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new EmojiCompatInitializer(ratingCompat, writeVar);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            emojiCompatInitializer = (EmojiCompatInitializer) objOnPause;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return emojiCompatInitializer;
    }

    public static final long IconCompatParcelizer(boolean z, int i, int i2, int i3, int i4) {
        if (!z) {
            return PropertyValueBuffer.read(i2, i4, i, i3);
        }
        return PropertyValueAny.INSTANCE.RemoteActionCompatParcelizer(i2, i4, i, i3);
    }
}
