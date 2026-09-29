package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u008a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001a\u001a\u008a\u0001\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001d\u001a~\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010#\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0002\u001aÛ\u0001\u0010*\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0%2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\u001620\b\n\u00101\u001a*\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u000102¢\u0006\u0002\b\u00182%\b\n\u00105\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\u001623\b\u0004\u00106\u001a-\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u000102¢\u0006\u0002\b8¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u00109\u001a¯\u0002\u0010:\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0%2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u0001022E\b\n\u00101\u001a?\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u00010<¢\u0006\u0002\b\u00182:\b\u0006\u00105\u001a4\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u000100022H\b\u0004\u00106\u001aB\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b8¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010=\u001aÛ\u0001\u0010*\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0>2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\u001620\b\n\u00101\u001a*\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u000102¢\u0006\u0002\b\u00182%\b\n\u00105\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\u001623\b\u0004\u00106\u001a-\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u000102¢\u0006\u0002\b8¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010?\u001a¯\u0002\u0010:\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0>2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u0001022E\b\n\u00101\u001a?\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u00010<¢\u0006\u0002\b\u00182:\b\u0006\u00105\u001a4\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u000100022H\b\u0004\u00106\u001aB\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b8¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010@¨\u0006A"}, d2 = {"LazyVerticalGrid", "", "columns", "Landroidx/compose/foundation/lazy/grid/GridCells;", "modifier", "Landroidx/compose/ui/Modifier;", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyHorizontalGrid", "rows", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnWidthSums", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "calculateCellsCrossAxisSizeImpl", "", "", "gridSize", "slotCount", "spacing", "items", "T", "key", "Lkotlin/ParameterName;", "name", "item", "", TtmlNode.TAG_SPAN, "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "contentType", "itemContent", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getSupportLoaderManager {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(final kotlin.getSupportFragmentManager r34, kotlin._handleOddName r35, kotlin.onActivityPostCreated r36, kotlin.getReturnTransition r37, boolean r38, o.WindowInsetsCompatImpl30.RatingCompat r39, o.WindowInsetsCompatImpl30.write r40, kotlin.CoordinatorLayout r41, boolean r42, kotlin.setLastHorizontalStyle r43, final kotlin.getAnswerMap<? super kotlin.startWakefulService, kotlin.getShowPopup> r44, kotlin._handleUnrecognizedCharacterEscape r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSupportLoaderManager.write(o.getSupportFragmentManager, o._handleOddName, o.onActivityPostCreated, o.getReturnTransition, boolean, o.WindowInsetsCompatImpl30$RatingCompat, o.WindowInsetsCompatImpl30$write, o.CoordinatorLayout, boolean, o.setLastHorizontalStyle, o.getAnswerMap, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    private static final completeWakefulIntent AudioAttributesCompatParcelizer(final getSupportFragmentManager getsupportfragmentmanager, final WindowInsetsCompatImpl30.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-76500289, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getsupportfragmentmanager)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(writeVar)) && (i & 48) != 32) {
            z = false;
        }
        markState markstateOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z2 | z) || markstateOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            markstateOnPause = new markState(new MagicModuleSubmissionRequestBody() { // from class: o.lambdainit0androidxfragmentappFragmentActivity
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getSupportLoaderManager.RemoteActionCompatParcelizer(getsupportfragmentmanager, writeVar, (bufferMapProperty) obj, (PropertyValueAny) obj2);
                }
            });
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(markstateOnPause);
        }
        completeWakefulIntent completewakefulintent = (completeWakefulIntent) markstateOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return completewakefulintent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessLifecycleInitializer RemoteActionCompatParcelizer(getSupportFragmentManager getsupportfragmentmanager, WindowInsetsCompatImpl30.write writeVar, bufferMapProperty buffermapproperty, PropertyValueAny propertyValueAny) {
        if (PropertyValueAny.AudioAttributesImplBaseParcelizer(propertyValueAny.getRead()) == Integer.MAX_VALUE) {
            getRootStableInsets.RemoteActionCompatParcelizer("LazyVerticalGrid's width should be bound by parent.");
        }
        int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(propertyValueAny.getRead());
        int[] iArrIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer((Collection<Integer>) getsupportfragmentmanager.IconCompatParcelizer(buffermapproperty, iAudioAttributesImplBaseParcelizer, buffermapproperty.IconCompatParcelizer(writeVar.getRead())));
        int[] iArr = new int[iArrIconCompatParcelizer.length];
        writeVar.AudioAttributesCompatParcelizer(buffermapproperty, iAudioAttributesImplBaseParcelizer, iArrIconCompatParcelizer, tryToResolveUnresolved.write, iArr);
        return new ProcessLifecycleInitializer(iArrIconCompatParcelizer, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        ArrayList arrayList = new ArrayList(i2);
        int i6 = 0;
        while (i6 < i2) {
            arrayList.add(Integer.valueOf((i6 < i4 % i2 ? 1 : 0) + i5));
            i6++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getSupportFragmentManager getsupportfragmentmanager, _handleOddName _handleoddname, onActivityPostCreated onactivitypostcreated, getReturnTransition getreturntransition, boolean z, WindowInsetsCompatImpl30.RatingCompat ratingCompat, WindowInsetsCompatImpl30.write writeVar, CoordinatorLayout coordinatorLayout, boolean z2, setLastHorizontalStyle setlasthorizontalstyle, getAnswerMap getanswermap, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        write(getsupportfragmentmanager, _handleoddname, onactivitypostcreated, getreturntransition, z, ratingCompat, writeVar, coordinatorLayout, z2, setlasthorizontalstyle, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2), i3);
        return getShowPopup.INSTANCE;
    }
}
