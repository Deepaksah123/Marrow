package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._parser;
import kotlin._skipWSOrEnd;
import kotlin.isCancelable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aq\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001ag\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0015\u001aq\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u001a2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001ag\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010!\u001a=\u0010\"\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&\u001a%\u0010'\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010(\u001a=\u0010)\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010*\u001aT\u0010+\u001a\u00020\u000b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2#\u0010/\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00¢\u0006\u0002\b\u00132\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0082\b\u001a\u0091\u0001\u00103\u001a\u00020\u000b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2#\u0010/\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00¢\u0006\u0002\b\u00132#\u00104\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00¢\u0006\u0002\b\u00132\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020%H\u0083\b\u001a[\u00106\u001a\u0002072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020%H\u0002¢\u0006\u0002\u0010<\u001a\u0096\u0001\u00106\u001a\u0002072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2#\u0010/\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00¢\u0006\u0002\b\u00132#\u00104\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00¢\u0006\u0002\b\u00132\u0006\u0010;\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020%H\u0082\b¢\u0006\u0002\u0010=\u001aY\u0010>\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020J2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020%H\u0000¢\u0006\u0004\bK\u0010L\u001a\u001e\u0010M\u001a\u0004\u0018\u00010E*\b\u0012\u0004\u0012\u00020E0D2\b\u0010N\u001a\u0004\u0018\u00010OH\u0002\u001a\u001c\u0010P\u001a\u00020\u000b*\u00020.2\u0006\u0010Q\u001a\u00020R2\u0006\u00104\u001a\u00020\u000bH\u0000\u001a\u001c\u0010S\u001a\u00020\u000b*\u00020.2\u0006\u0010Q\u001a\u00020R2\u0006\u0010/\u001a\u00020\u000bH\u0000\u001a9\u0010Z\u001a\u000207*\u00020E2\u0006\u0010A\u001a\u00020B2\u0006\u0010I\u001a\u00020[2\u0014\u0010\\\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0004\u0012\u00020\u00010\u0010H\u0000¢\u0006\u0004\b^\u0010_\u001aQ\u0010`\u001a\u00020?*\u00020@2\u0006\u0010I\u001a\u00020J2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020\u000b2\u0006\u0010:\u001a\u0002092\f\u0010c\u001a\b\u0012\u0004\u0012\u00020?0d2\u0006\u0010e\u001a\u00020B2\u0006\u0010f\u001a\u000209H\u0000¢\u0006\u0004\bg\u0010h\"\u0014\u0010T\u001a\u00020UX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010W\"\u0014\u0010X\u001a\u00020UX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010W¨\u0006i"}, d2 = {"FlowRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "itemVerticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "maxItemsInEachRow", "", "maxLines", "overflow", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowColumn", "itemHorizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rowMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementMultiContentHelper", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "columnMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "maxIntrinsicMainAxisSize", "children", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "crossAxisAvailable", "mainAxisSpacing", "minIntrinsicMainAxisSize", "crossAxisSize", "crossAxisSpacing", "intrinsicCrossAxisSize", "Landroidx/collection/IntIntPair;", "mainAxisSizes", "", "crossAxisSizes", "mainAxisAvailable", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "breakDownItems", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurePolicy", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurablesIterator", "", "Landroidx/compose/ui/layout/Measurable;", "mainAxisSpacingDp", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacingDp", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "safeNext", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "mainAxisMin", "isHorizontal", "", "crossAxisMin", "CROSS_AXIS_ALIGNMENT_TOP", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_TOP", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_START", "getCROSS_AXIS_ALIGNMENT_START", "measureAndCache", "Landroidx/compose/ui/unit/Constraints;", "storePlaceable", "Landroidx/compose/ui/layout/Placeable;", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "placeHelper", "mainAxisTotalSize", "crossAxisTotalSize", "items", "Landroidx/compose/runtime/collection/MutableVector;", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class dismissNow {
    private static final BackStackState IconCompatParcelizer = BackStackState.INSTANCE.AudioAttributesCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem());
    private static final BackStackState AudioAttributesCompatParcelizer = BackStackState.INSTANCE.AudioAttributesCompatParcelizer(_skipWSOrEnd.INSTANCE.RatingCompat());

    /* JADX WARN: Removed duplicated region for block: B:140:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    @kotlin.getRenewGrpId
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(kotlin._handleOddName r21, o.WindowInsetsCompatImpl30.write r22, o.WindowInsetsCompatImpl30.RatingCompat r23, o._skipWSOrEnd.read r24, int r25, int r26, kotlin.setupDialog r27, final kotlin.getModuleData<? super kotlin.setCancelable, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r28, kotlin._handleUnrecognizedCharacterEscape r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.dismissNow.RemoteActionCompatParcelizer(o._handleOddName, o.WindowInsetsCompatImpl30$write, o.WindowInsetsCompatImpl30$RatingCompat, o._skipWSOrEnd$read, int, int, o.setupDialog, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getModuleData getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1192950673, i, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:113)");
            }
            getmoduledata.AudioAttributesCompatParcelizer(show.INSTANCE, _handleunrecognizedcharacterescape, 6);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(kotlin._handleOddName r20, o.WindowInsetsCompatImpl30.write r21, o.WindowInsetsCompatImpl30.RatingCompat r22, o._skipWSOrEnd.read r23, int r24, int r25, final kotlin.getModuleData<? super kotlin.setCancelable, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r26, kotlin._handleUnrecognizedCharacterEscape r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.dismissNow.AudioAttributesCompatParcelizer(o._handleOddName, o.WindowInsetsCompatImpl30$write, o.WindowInsetsCompatImpl30$RatingCompat, o._skipWSOrEnd$read, int, int, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.findBackReference RemoteActionCompatParcelizer(o.WindowInsetsCompatImpl30.write r18, o.WindowInsetsCompatImpl30.RatingCompat r19, o._skipWSOrEnd.read r20, int r21, int r22, kotlin.onGetLayoutInflater r23, kotlin._handleUnrecognizedCharacterEscape r24, int r25) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.dismissNow.RemoteActionCompatParcelizer(o.WindowInsetsCompatImpl30$write, o.WindowInsetsCompatImpl30$RatingCompat, o._skipWSOrEnd$read, int, int, o.onGetLayoutInflater, o._handleUnrecognizedCharacterEscape, int):o.findBackReference");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup read(MagicModuleUseCaseImplWhenMappings.write writeVar, _parser _parserVar) {
        writeVar.write = _parserVar;
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup RemoteActionCompatParcelizer(MagicModuleUseCaseImplWhenMappings.write writeVar, _parser _parserVar) {
        writeVar.write = _parserVar;
        return getShowPopup.INSTANCE;
    }

    private static final isTypeOrSuperTypeOf IconCompatParcelizer(Iterator<? extends isTypeOrSuperTypeOf> it, onFindViewById onfindviewbyid) {
        try {
            if (it instanceof access200) {
                toMagicModuleMetaRepoModel.write(onfindviewbyid);
                return ((access200) it).write(onfindviewbyid);
            }
            return it.next();
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static final int write(hasHandlers hashandlers, boolean z, int i) {
        if (z) {
            return hashandlers.AudioAttributesCompatParcelizer(i);
        }
        return hashandlers.read(i);
    }

    public static final int AudioAttributesCompatParcelizer(hasHandlers hashandlers, boolean z, int i) {
        if (z) {
            return hashandlers.read(i);
        }
        return hashandlers.AudioAttributesCompatParcelizer(i);
    }

    public static final long write(isTypeOrSuperTypeOf istypeorsupertypeof, onStart onstart, long j, getAnswerMap<? super _parser, getShowPopup> getanswermap) {
        getShowsDialog remoteActionCompatParcelizer;
        isTypeOrSuperTypeOf istypeorsupertypeof2 = istypeorsupertypeof;
        if (getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(istypeorsupertypeof2)) == BitmapDescriptorFactory.HUE_RED) {
            getText gettextRemoteActionCompatParcelizer = getTargetRequestCode.RemoteActionCompatParcelizer(istypeorsupertypeof2);
            if (((gettextRemoteActionCompatParcelizer == null || (remoteActionCompatParcelizer = gettextRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()) == null) ? null : Float.valueOf(remoteActionCompatParcelizer.getIconCompatParcelizer())) == null) {
                _parser _parserVarWrite = istypeorsupertypeof.write(j);
                getanswermap.invoke(_parserVarWrite);
                return setShowingForActionMode.write(onstart.IconCompatParcelizer(_parserVarWrite), onstart.write(_parserVarWrite));
            }
        }
        int iWrite = write(istypeorsupertypeof2, onstart.getAudioAttributesCompatParcelizer(), Integer.MAX_VALUE);
        return setShowingForActionMode.write(iWrite, AudioAttributesCompatParcelizer(istypeorsupertypeof2, onstart.getAudioAttributesCompatParcelizer(), iWrite));
    }

    public static final withHandlersFrom write(withContentValueHandler withcontentvaluehandler, long j, int i, int i2, int[] iArr, final UTF32Reader<withHandlersFrom> uTF32Reader, onStart onstart, int[] iArr2) {
        int iAudioAttributesImplApi21Parcelizer;
        boolean zIconCompatParcelizer = onstart.getAudioAttributesCompatParcelizer();
        WindowInsetsCompatImpl30.RatingCompat ratingCompatAudioAttributesCompatParcelizer = onstart.getWrite();
        WindowInsetsCompatImpl30.write writeVarWrite = onstart.getRemoteActionCompatParcelizer();
        if (zIconCompatParcelizer) {
            int iIconCompatParcelizer = (withcontentvaluehandler.IconCompatParcelizer(ratingCompatAudioAttributesCompatParcelizer.getRead()) * (uTF32Reader.getAudioAttributesCompatParcelizer() - 1)) + i2;
            int iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
            iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
            if (iIconCompatParcelizer < iMediaBrowserCompatCustomActionResultReceiver) {
                iIconCompatParcelizer = iMediaBrowserCompatCustomActionResultReceiver;
            }
            if (iIconCompatParcelizer <= iAudioAttributesImplApi21Parcelizer) {
                iAudioAttributesImplApi21Parcelizer = iIconCompatParcelizer;
            }
            ratingCompatAudioAttributesCompatParcelizer.write(withcontentvaluehandler, iAudioAttributesImplApi21Parcelizer, iArr, iArr2);
        } else {
            int iIconCompatParcelizer2 = (withcontentvaluehandler.IconCompatParcelizer(writeVarWrite.getRead()) * (uTF32Reader.getAudioAttributesCompatParcelizer() - 1)) + i2;
            int iMediaBrowserCompatCustomActionResultReceiver2 = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
            int iAudioAttributesImplApi21Parcelizer2 = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
            if (iIconCompatParcelizer2 < iMediaBrowserCompatCustomActionResultReceiver2) {
                iIconCompatParcelizer2 = iMediaBrowserCompatCustomActionResultReceiver2;
            }
            if (iIconCompatParcelizer2 > iAudioAttributesImplApi21Parcelizer2) {
                iIconCompatParcelizer2 = iAudioAttributesImplApi21Parcelizer2;
            }
            iAudioAttributesImplApi21Parcelizer = iIconCompatParcelizer2;
            writeVarWrite.AudioAttributesCompatParcelizer(withcontentvaluehandler, iAudioAttributesImplApi21Parcelizer, iArr, withcontentvaluehandler.getAudioAttributesCompatParcelizer(), iArr2);
        }
        int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
        int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        if (i >= iMediaBrowserCompatItemReceiver) {
            iMediaBrowserCompatItemReceiver = i;
        }
        if (iMediaBrowserCompatItemReceiver <= iAudioAttributesImplBaseParcelizer) {
            iAudioAttributesImplBaseParcelizer = iMediaBrowserCompatItemReceiver;
        }
        if (!zIconCompatParcelizer) {
            int i3 = iAudioAttributesImplApi21Parcelizer;
            iAudioAttributesImplApi21Parcelizer = iAudioAttributesImplBaseParcelizer;
            iAudioAttributesImplBaseParcelizer = i3;
        }
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iAudioAttributesImplBaseParcelizer, iAudioAttributesImplApi21Parcelizer, null, new getAnswerMap() { // from class: o.getDialog
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return dismissNow.read(uTF32Reader, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long read(List<? extends hasHandlers> list, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, onGetLayoutInflater ongetlayoutinflater) {
        int i6;
        if (list.isEmpty()) {
            return setShowingForActionMode.write(0, 0);
        }
        isCancelable iscancelable = new isCancelable(i4, ongetlayoutinflater, getNextTransition.write(0, i, 0, Integer.MAX_VALUE), i5, i2, i3, null);
        hasHandlers hashandlers = (hasHandlers) IntermediateLoginResponseBody.read((List) list, 0);
        int i7 = hashandlers != null ? iArr2[0] : 0;
        int i8 = hashandlers != null ? iArr[0] : 0;
        if (iscancelable.IconCompatParcelizer(list.size() > 1, 0, setShowingForActionMode.write(i, Integer.MAX_VALUE), hashandlers == null ? null : setShowingForActionMode.RemoteActionCompatParcelizer(setShowingForActionMode.write(i8, i7)), 0, 0, 0, false, false).getIconCompatParcelizer()) {
            setShowingForActionMode setshowingforactionmodeRemoteActionCompatParcelizer = ongetlayoutinflater.RemoteActionCompatParcelizer(hashandlers != null, 0, 0);
            return setShowingForActionMode.write(setshowingforactionmodeRemoteActionCompatParcelizer != null ? setShowingForActionMode.write(setshowingforactionmodeRemoteActionCompatParcelizer.read()) : 0, 0);
        }
        int size = list.size();
        int i9 = i;
        int iWrite = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            int i15 = i9 - i8;
            int i16 = i10 + 1;
            int iMax = Math.max(i11, i7);
            hasHandlers hashandlers2 = (hasHandlers) IntermediateLoginResponseBody.read((List) list, i16);
            int i17 = hashandlers2 != null ? iArr2[i16] : 0;
            int i18 = hashandlers2 != null ? iArr[i16] + i2 : 0;
            boolean z = i10 + 2 < list.size();
            int i19 = i16 - i13;
            long jWrite = setShowingForActionMode.write(i15, Integer.MAX_VALUE);
            setShowingForActionMode setshowingforactionmodeRemoteActionCompatParcelizer2 = hashandlers2 == null ? null : setShowingForActionMode.RemoteActionCompatParcelizer(setShowingForActionMode.write(i18, i17));
            int i20 = i18;
            boolean z2 = z;
            int i21 = i17;
            isCancelable.write writeVarIconCompatParcelizer = iscancelable.IconCompatParcelizer(z2, i19, jWrite, setshowingforactionmodeRemoteActionCompatParcelizer2, i14, iWrite, iMax, false, false);
            if (writeVarIconCompatParcelizer.getRead()) {
                iWrite += iMax + i3;
                isCancelable.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = iscancelable.write(writeVarIconCompatParcelizer, hashandlers2 != null, i14, iWrite, i15, i19);
                i14++;
                if (writeVarIconCompatParcelizer.getIconCompatParcelizer()) {
                    if (remoteActionCompatParcelizerWrite != null) {
                        long write = remoteActionCompatParcelizerWrite.getWrite();
                        if (!remoteActionCompatParcelizerWrite.getRead()) {
                            iWrite += setShowingForActionMode.write(write) + i3;
                        }
                    }
                    i12 = i16;
                } else {
                    i6 = i;
                    i13 = i16;
                    i11 = 0;
                    i8 = i20 - i2;
                }
            } else {
                i11 = iMax;
                i6 = i15;
                i8 = i20;
            }
            i12 = i16;
            i9 = i6;
            i7 = i21;
            i10 = i12;
        }
        return setShowingForActionMode.write(iWrite - i3, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, onStart onstart, Iterator<? extends isTypeOrSuperTypeOf> it, float f, float f2, long j, int i, int i2, onGetLayoutInflater ongetlayoutinflater) {
        isTypeOrSuperTypeOf istypeorsupertypeof;
        Integer numValueOf;
        isTypeOrSuperTypeOf istypeorsupertypeof2;
        onFindViewById onfindviewbyid;
        MagicModuleUseCaseImplWhenMappings.write writeVar;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        long j2;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable;
        int i6;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable2;
        isCancelable.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite;
        setProvider setprovider;
        ArrayList arrayList2;
        int i7;
        int i8;
        int i9;
        int read;
        int audioAttributesCompatParcelizer;
        onFindViewById onfindviewbyid2;
        boolean z;
        int i10;
        boolean z2;
        setProvider setprovider2;
        int i11;
        int i12;
        long j3;
        setShowingForActionMode setshowingforactionmodeRemoteActionCompatParcelizer;
        isTypeOrSuperTypeOf istypeorsupertypeof3;
        setShowingForActionMode setshowingforactionmodeRemoteActionCompatParcelizer2;
        int i13;
        isCancelable.write writeVar2;
        int i14;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable3;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable4;
        int i15;
        int i16;
        int i17;
        int i18;
        isCancelable.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite2;
        int i19;
        int i20;
        int i21;
        getShowsDialog remoteActionCompatParcelizer;
        Iterator<? extends isTypeOrSuperTypeOf> it2 = it;
        UTF32Reader uTF32Reader = new UTF32Reader(new withHandlersFrom[16], 0);
        int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
        int iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
        setProvider setproviderWrite = ActionMenuView.write();
        ArrayList arrayList3 = new ArrayList();
        int iCeil = (int) Math.ceil(withcontentvaluehandler.AudioAttributesCompatParcelizer(f));
        int iCeil2 = (int) Math.ceil(withcontentvaluehandler.AudioAttributesCompatParcelizer(f2));
        long jWrite = getNextTransition.write(0, iAudioAttributesImplBaseParcelizer, 0, iAudioAttributesImplApi21Parcelizer);
        long j4 = getNextTransition.read(getNextTransition.write$default(jWrite, 0, 0, 0, 0, 14, null), onstart.getAudioAttributesCompatParcelizer() ? getAnimatingAway.read : getAnimatingAway.RemoteActionCompatParcelizer);
        final MagicModuleUseCaseImplWhenMappings.write writeVar3 = new MagicModuleUseCaseImplWhenMappings.write();
        onFindViewById onfindviewbyid3 = it2 instanceof access200 ? new onFindViewById(0, 0, withcontentvaluehandler.b_(iAudioAttributesImplBaseParcelizer), withcontentvaluehandler.b_(iAudioAttributesImplApi21Parcelizer), null) : null;
        isTypeOrSuperTypeOf istypeorsupertypeofIconCompatParcelizer = !it.hasNext() ? null : IconCompatParcelizer(it2, onfindviewbyid3);
        setShowingForActionMode setshowingforactionmodeRemoteActionCompatParcelizer3 = istypeorsupertypeofIconCompatParcelizer != null ? setShowingForActionMode.RemoteActionCompatParcelizer(write(istypeorsupertypeofIconCompatParcelizer, onstart, j4, new getAnswerMap() { // from class: o.onActivityCreated
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return dismissNow.read(writeVar3, (_parser) obj);
            }
        })) : null;
        Integer numValueOf2 = setshowingforactionmodeRemoteActionCompatParcelizer3 != null ? Integer.valueOf(setShowingForActionMode.IconCompatParcelizer(setshowingforactionmodeRemoteActionCompatParcelizer3.read())) : null;
        if (setshowingforactionmodeRemoteActionCompatParcelizer3 != null) {
            istypeorsupertypeof = istypeorsupertypeofIconCompatParcelizer;
            numValueOf = Integer.valueOf(setShowingForActionMode.write(setshowingforactionmodeRemoteActionCompatParcelizer3.read()));
        } else {
            istypeorsupertypeof = istypeorsupertypeofIconCompatParcelizer;
            numValueOf = null;
        }
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable5 = new setExpandActivityOverflowButtonDrawable(0, 1, null);
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable6 = new setExpandActivityOverflowButtonDrawable(0, 1, null);
        setBackgroundDrawable setbackgrounddrawableAudioAttributesCompatParcelizer = setPopupTheme.AudioAttributesCompatParcelizer();
        isCancelable iscancelable = new isCancelable(i, ongetlayoutinflater, j, i2, iCeil, iCeil2, null);
        isCancelable.write writeVarIconCompatParcelizer = iscancelable.IconCompatParcelizer(it.hasNext(), 0, setShowingForActionMode.write(iAudioAttributesImplBaseParcelizer, iAudioAttributesImplApi21Parcelizer), setshowingforactionmodeRemoteActionCompatParcelizer3, 0, 0, 0, false, false);
        if (writeVarIconCompatParcelizer.getIconCompatParcelizer()) {
            onfindviewbyid = onfindviewbyid3;
            writeVar = writeVar3;
            j2 = j4;
            boolean z3 = setshowingforactionmodeRemoteActionCompatParcelizer3 != null;
            i3 = iCeil2;
            i4 = iCeil;
            istypeorsupertypeof2 = istypeorsupertypeof;
            i5 = iMediaBrowserCompatItemReceiver;
            i6 = iAudioAttributesImplApi21Parcelizer;
            arrayList = arrayList3;
            setexpandactivityoverflowbuttondrawable = setexpandactivityoverflowbuttondrawable5;
            setexpandactivityoverflowbuttondrawable2 = setexpandactivityoverflowbuttondrawable6;
            remoteActionCompatParcelizerWrite = iscancelable.write(writeVarIconCompatParcelizer, z3, -1, 0, iAudioAttributesImplBaseParcelizer, 0);
        } else {
            istypeorsupertypeof2 = istypeorsupertypeof;
            onfindviewbyid = onfindviewbyid3;
            writeVar = writeVar3;
            i3 = iCeil2;
            i4 = iCeil;
            i5 = iMediaBrowserCompatItemReceiver;
            arrayList = arrayList3;
            j2 = j4;
            setexpandactivityoverflowbuttondrawable = setexpandactivityoverflowbuttondrawable5;
            i6 = iAudioAttributesImplApi21Parcelizer;
            setexpandactivityoverflowbuttondrawable2 = setexpandactivityoverflowbuttondrawable6;
            remoteActionCompatParcelizerWrite = null;
        }
        int i22 = iAudioAttributesImplBaseParcelizer;
        isCancelable.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizerWrite;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable7 = setexpandactivityoverflowbuttondrawable;
        isTypeOrSuperTypeOf istypeorsupertypeof4 = istypeorsupertypeof2;
        int i23 = i5;
        int i24 = i6;
        boolean z4 = false;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (!writeVarIconCompatParcelizer.getIconCompatParcelizer() && istypeorsupertypeof4 != null) {
            toMagicModuleMetaRepoModel.write(numValueOf2);
            int iIntValue = numValueOf2.intValue();
            toMagicModuleMetaRepoModel.write(numValueOf);
            setBackgroundDrawable setbackgrounddrawable = setbackgrounddrawableAudioAttributesCompatParcelizer;
            i26 += iIntValue;
            int iMax = Math.max(i28, numValueOf.intValue());
            int i31 = i22 - iIntValue;
            int i32 = i27 + 1;
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable8 = setexpandactivityoverflowbuttondrawable2;
            ongetlayoutinflater.IconCompatParcelizer(i32);
            arrayList.add(istypeorsupertypeof4);
            final MagicModuleUseCaseImplWhenMappings.write writeVar4 = writeVar;
            ArrayList arrayList4 = arrayList;
            setproviderWrite.write(i27, writeVar4.write);
            Object objQ_ = istypeorsupertypeof4.getOnPrepareFromUri();
            getText gettext = objQ_ instanceof getText ? (getText) objQ_ : null;
            boolean z5 = ((gettext == null || (remoteActionCompatParcelizer = gettext.getRemoteActionCompatParcelizer()) == null) ? null : Float.valueOf(remoteActionCompatParcelizer.getIconCompatParcelizer())) != null ? true : z4;
            int i33 = i32 - i29;
            if (i33 < i) {
                onfindviewbyid2 = onfindviewbyid;
                z = true;
            } else {
                onfindviewbyid2 = onfindviewbyid;
                z = false;
            }
            if (onfindviewbyid2 != null) {
                if (z) {
                    setprovider2 = setproviderWrite;
                    i19 = i25;
                } else {
                    setprovider2 = setproviderWrite;
                    i19 = i25 + 1;
                }
                i11 = i32;
                int i34 = z ? i33 : 0;
                if (z) {
                    int i35 = i31 - i4;
                    z2 = z5;
                    i20 = i35 < 0 ? 0 : i35;
                } else {
                    z2 = z5;
                    i20 = iAudioAttributesImplBaseParcelizer;
                }
                float fB_ = withcontentvaluehandler.b_(i20);
                if (z) {
                    i10 = iAudioAttributesImplBaseParcelizer;
                    i21 = i24;
                } else {
                    int i36 = (i24 - iMax) - i3;
                    i10 = iAudioAttributesImplBaseParcelizer;
                    i21 = i36 < 0 ? 0 : i36;
                }
                onfindviewbyid2.read(i19, i34, fB_, withcontentvaluehandler.b_(i21));
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            } else {
                i10 = iAudioAttributesImplBaseParcelizer;
                z2 = z5;
                setprovider2 = setproviderWrite;
                i11 = i32;
            }
            isTypeOrSuperTypeOf istypeorsupertypeofIconCompatParcelizer2 = !it.hasNext() ? null : IconCompatParcelizer(it2, onfindviewbyid2);
            writeVar4.write = null;
            if (istypeorsupertypeofIconCompatParcelizer2 != null) {
                i12 = iMax;
                j3 = j2;
                setshowingforactionmodeRemoteActionCompatParcelizer = setShowingForActionMode.RemoteActionCompatParcelizer(write(istypeorsupertypeofIconCompatParcelizer2, onstart, j3, new getAnswerMap() { // from class: o.onDestroyView
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return dismissNow.RemoteActionCompatParcelizer(writeVar4, (_parser) obj);
                    }
                }));
            } else {
                i12 = iMax;
                j3 = j2;
                setshowingforactionmodeRemoteActionCompatParcelizer = null;
            }
            Integer numValueOf3 = setshowingforactionmodeRemoteActionCompatParcelizer != null ? Integer.valueOf(setShowingForActionMode.IconCompatParcelizer(setshowingforactionmodeRemoteActionCompatParcelizer.read()) + i4) : null;
            Integer numValueOf4 = setshowingforactionmodeRemoteActionCompatParcelizer != null ? Integer.valueOf(setShowingForActionMode.write(setshowingforactionmodeRemoteActionCompatParcelizer.read())) : null;
            boolean zHasNext = it.hasNext();
            long jWrite2 = setShowingForActionMode.write(i31, i24);
            if (setshowingforactionmodeRemoteActionCompatParcelizer == null) {
                istypeorsupertypeof3 = istypeorsupertypeofIconCompatParcelizer2;
                setshowingforactionmodeRemoteActionCompatParcelizer2 = null;
            } else {
                toMagicModuleMetaRepoModel.write(numValueOf3);
                int iIntValue2 = numValueOf3.intValue();
                toMagicModuleMetaRepoModel.write(numValueOf4);
                istypeorsupertypeof3 = istypeorsupertypeofIconCompatParcelizer2;
                setshowingforactionmodeRemoteActionCompatParcelizer2 = setShowingForActionMode.RemoteActionCompatParcelizer(setShowingForActionMode.write(iIntValue2, numValueOf4.intValue()));
            }
            isCancelable.write writeVarIconCompatParcelizer2 = iscancelable.IconCompatParcelizer(zHasNext, i33, jWrite2, setshowingforactionmodeRemoteActionCompatParcelizer2, i25, i30, i12, false, false);
            if (writeVarIconCompatParcelizer2.getRead()) {
                int iMax2 = Math.max(i23, i26);
                int i37 = i10;
                int iMin = Math.min(iMax2, i37);
                int i38 = i30 + i12;
                remoteActionCompatParcelizerWrite2 = iscancelable.write(writeVarIconCompatParcelizer2, setshowingforactionmodeRemoteActionCompatParcelizer != null, i25, i38, i31, i33);
                setexpandactivityoverflowbuttondrawable3 = setexpandactivityoverflowbuttondrawable8;
                setexpandactivityoverflowbuttondrawable3.RemoteActionCompatParcelizer(i12);
                setbackgrounddrawableAudioAttributesCompatParcelizer = setbackgrounddrawable;
                if (z2) {
                    setbackgrounddrawableAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i25);
                }
                int i39 = i11;
                setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable9 = setexpandactivityoverflowbuttondrawable7;
                setexpandactivityoverflowbuttondrawable9.RemoteActionCompatParcelizer(i39);
                i25++;
                writeVar2 = writeVarIconCompatParcelizer2;
                i17 = (i6 - i38) - i3;
                setexpandactivityoverflowbuttondrawable4 = setexpandactivityoverflowbuttondrawable9;
                numValueOf2 = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i4) : null;
                i15 = i38 + i3;
                i26 = 0;
                i14 = 0;
                z2 = false;
                i13 = i39;
                i16 = i13;
                i18 = i37;
                i23 = iMin;
                iAudioAttributesImplBaseParcelizer = i18;
            } else {
                i13 = i11;
                writeVar2 = writeVarIconCompatParcelizer2;
                i14 = i12;
                setbackgrounddrawableAudioAttributesCompatParcelizer = setbackgrounddrawable;
                setexpandactivityoverflowbuttondrawable3 = setexpandactivityoverflowbuttondrawable8;
                setexpandactivityoverflowbuttondrawable4 = setexpandactivityoverflowbuttondrawable7;
                iAudioAttributesImplBaseParcelizer = i10;
                i15 = i30;
                numValueOf2 = numValueOf3;
                i16 = i29;
                i17 = i24;
                i18 = i31;
                remoteActionCompatParcelizerWrite2 = remoteActionCompatParcelizer2;
            }
            setexpandactivityoverflowbuttondrawable7 = setexpandactivityoverflowbuttondrawable4;
            remoteActionCompatParcelizer2 = remoteActionCompatParcelizerWrite2;
            i22 = i18;
            i24 = i17;
            i29 = i16;
            i30 = i15;
            numValueOf = numValueOf4;
            it2 = it;
            j2 = j3;
            i28 = i14;
            i27 = i13;
            istypeorsupertypeof4 = istypeorsupertypeof3;
            writeVarIconCompatParcelizer = writeVar2;
            z4 = z2;
            writeVar = writeVar4;
            setexpandactivityoverflowbuttondrawable2 = setexpandactivityoverflowbuttondrawable3;
            setproviderWrite = setprovider2;
            onfindviewbyid = onfindviewbyid2;
            arrayList = arrayList4;
        }
        setProvider setprovider3 = setproviderWrite;
        ArrayList arrayList5 = arrayList;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable10 = setexpandactivityoverflowbuttondrawable7;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable11 = setexpandactivityoverflowbuttondrawable2;
        if (remoteActionCompatParcelizer2 != null) {
            arrayList2 = arrayList5;
            arrayList2.add(remoteActionCompatParcelizer2.getAudioAttributesCompatParcelizer());
            setprovider = setprovider3;
            setprovider.write(arrayList2.size() - 1, remoteActionCompatParcelizer2.getRemoteActionCompatParcelizer());
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable12 = setexpandactivityoverflowbuttondrawable10;
            int i40 = setexpandactivityoverflowbuttondrawable12.AudioAttributesCompatParcelizer - 1;
            if (!remoteActionCompatParcelizer2.getRead()) {
                setexpandactivityoverflowbuttondrawable11.RemoteActionCompatParcelizer(setShowingForActionMode.write(remoteActionCompatParcelizer2.getWrite()));
                setexpandactivityoverflowbuttondrawable10.RemoteActionCompatParcelizer(setexpandactivityoverflowbuttondrawable10.write() + 1);
            } else {
                int i41 = setexpandactivityoverflowbuttondrawable12.AudioAttributesCompatParcelizer;
                setexpandactivityoverflowbuttondrawable11.IconCompatParcelizer(i40, Math.max(setexpandactivityoverflowbuttondrawable11.read(i40), setShowingForActionMode.write(remoteActionCompatParcelizer2.getWrite())));
                setexpandactivityoverflowbuttondrawable10.IconCompatParcelizer(i41 - 1, setexpandactivityoverflowbuttondrawable10.write() + 1);
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            }
        } else {
            setprovider = setprovider3;
            arrayList2 = arrayList5;
        }
        int size = arrayList2.size();
        Object[] objArr = new _parser[size];
        for (int i42 = 0; i42 < size; i42++) {
            objArr[i42] = setprovider.AudioAttributesCompatParcelizer(i42);
        }
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable13 = setexpandactivityoverflowbuttondrawable10;
        int[] iArr = new int[setexpandactivityoverflowbuttondrawable13.AudioAttributesCompatParcelizer];
        int[] iArr2 = new int[setexpandactivityoverflowbuttondrawable13.AudioAttributesCompatParcelizer];
        int[] iArr3 = setexpandactivityoverflowbuttondrawable13.RemoteActionCompatParcelizer;
        int i43 = setexpandactivityoverflowbuttondrawable13.AudioAttributesCompatParcelizer;
        int iMax3 = i23;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        while (i44 < i43) {
            int i47 = iArr3[i44];
            int iAudioAttributesImplApi21Parcelizer2 = setexpandactivityoverflowbuttondrawable11.read(i44);
            if (setbackgrounddrawableAudioAttributesCompatParcelizer.IconCompatParcelizer(i44)) {
                i9 = iAudioAttributesImplApi21Parcelizer2;
            } else if (PropertyValueAny.AudioAttributesImplApi21Parcelizer(jWrite) == Integer.MAX_VALUE) {
                i9 = Integer.MAX_VALUE;
            } else {
                iAudioAttributesImplApi21Parcelizer2 = PropertyValueAny.AudioAttributesImplApi21Parcelizer(jWrite) - i46;
                i9 = iAudioAttributesImplApi21Parcelizer2;
            }
            int i48 = i44;
            int i49 = iMax3;
            int[] iArr4 = iArr3;
            int[] iArr5 = iArr2;
            int i50 = i43;
            int[] iArr6 = iArr;
            int i51 = i45;
            Object[] objArr2 = objArr;
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable14 = setexpandactivityoverflowbuttondrawable11;
            ArrayList arrayList6 = arrayList2;
            withHandlersFrom withhandlersfromIconCompatParcelizer = getUserVisibleHint.IconCompatParcelizer(onstart, iMax3, PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(jWrite), PropertyValueAny.AudioAttributesImplBaseParcelizer(jWrite), i9, i4, withcontentvaluehandler, arrayList2, objArr, i51, i47, iArr6, i48);
            if (onstart.getAudioAttributesCompatParcelizer()) {
                read = withhandlersfromIconCompatParcelizer.getAudioAttributesCompatParcelizer();
                audioAttributesCompatParcelizer = withhandlersfromIconCompatParcelizer.getRead();
            } else {
                read = withhandlersfromIconCompatParcelizer.getRead();
                audioAttributesCompatParcelizer = withhandlersfromIconCompatParcelizer.getAudioAttributesCompatParcelizer();
            }
            iArr5[i48] = audioAttributesCompatParcelizer;
            i46 += audioAttributesCompatParcelizer;
            iMax3 = Math.max(i49, read);
            uTF32Reader.read(withhandlersfromIconCompatParcelizer);
            i44 = i48 + 1;
            setexpandactivityoverflowbuttondrawable11 = setexpandactivityoverflowbuttondrawable14;
            i45 = i47;
            iArr3 = iArr4;
            iArr2 = iArr5;
            i43 = i50;
            iArr = iArr6;
            objArr = objArr2;
            arrayList2 = arrayList6;
        }
        int i52 = iMax3;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        if (uTF32Reader.getAudioAttributesCompatParcelizer() == 0) {
            i7 = 0;
            i8 = 0;
        } else {
            i7 = i52;
            i8 = i46;
        }
        return write(withcontentvaluehandler, j, i7, i8, iArr7, uTF32Reader, onstart, iArr8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(UTF32Reader uTF32Reader, _parser.IconCompatParcelizer iconCompatParcelizer) {
        Object[] objArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            ((withHandlersFrom) objArr[i]).onMediaButtonEvent();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, WindowInsetsCompatImpl30.write writeVar, WindowInsetsCompatImpl30.RatingCompat ratingCompat, _skipWSOrEnd.read readVar, int i, int i2, setupDialog setupdialog, getModuleData getmoduledata, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i5) {
        RemoteActionCompatParcelizer(_handleoddname, writeVar, ratingCompat, readVar, i, i2, setupdialog, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), i4);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, WindowInsetsCompatImpl30.write writeVar, WindowInsetsCompatImpl30.RatingCompat ratingCompat, _skipWSOrEnd.read readVar, int i, int i2, getModuleData getmoduledata, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i5) {
        AudioAttributesCompatParcelizer(_handleoddname, writeVar, ratingCompat, readVar, i, i2, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), i4);
        return getShowPopup.INSTANCE;
    }
}
