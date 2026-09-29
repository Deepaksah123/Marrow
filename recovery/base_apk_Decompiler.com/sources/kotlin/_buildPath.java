package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;
import kotlin._buildPath;
import kotlin._handleOddName;
import kotlin.setLayoutInflater;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\u001al\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\u0012\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\u0016\u001av\u0010\u0017\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u001b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b#\u0010$\u001ax\u0010\u0017\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u001b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b&\u0010'\u001a\u009a\u0001\u0010(\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00072\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u001b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b.\u0010/\u001a\u009c\u0001\u0010(\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00072\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u001b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\u00020\n2\b\b\u0002\u00103\u001a\u00020\u000e2\b\b\u0002\u00104\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u000206H\u0007¢\u0006\u0002\u00107\u001a&\u00108\u001a\u00020\n2\b\b\u0002\u00103\u001a\u00020\u000e2\b\b\u0002\u00104\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u000206H\u0007\u001a\u001c\u00109\u001a\u00020\f*\u00020\f2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000eH\u0001\u001a\u001a\u0010<\u001a\u00020\f*\u00020\f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0>H\u0000\u001a \u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0000\u001aT\u0010F\u001a\u00020\f*\u00020\f2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020I0H2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0019\u0010N\u001a\u0015\u0012\u0004\u0012\u00020O\u0012\u0006\u0012\u0004\u0018\u00010P0\u0005¢\u0006\u0002\b\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\bQ\u0010R\"\u0016\u0010S\u001a\u00020\u001bX\u0080\u0004¢\u0006\n\n\u0002\u0010V\u001a\u0004\bT\u0010U\"\u0016\u0010W\u001a\u00020\u001bX\u0080\u0004¢\u0006\n\n\u0002\u0010V\u001a\u0004\bX\u0010U\"\u0016\u0010Y\u001a\u00020\u001bX\u0080\u0004¢\u0006\n\n\u0002\u0010V\u001a\u0004\bZ\u0010U\"\u0010\u0010[\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0010\u0010\\\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0014\u0010]\u001a\u00020^X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`\"\u0016\u0010a\u001a\u00020\u001bX\u0080\u0004¢\u0006\n\n\u0002\u0010V\u001a\u0004\bb\u0010U\"\u0016\u0010c\u001a\u00020\u001bX\u0080\u0004¢\u0006\n\n\u0002\u0010V\u001a\u0004\bd\u0010U\"\u0010\u0010e\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0010\u0010f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0016\u0010g\u001a\u00020\u001bX\u0080\u0004¢\u0006\n\n\u0002\u0010V\u001a\u0004\bh\u0010U\"\u0016\u0010i\u001a\u00020\u001bX\u0080\u0004¢\u0006\n\n\u0002\u0010V\u001a\u0004\bj\u0010U¨\u0006k²\u0006\n\u0010l\u001a\u00020@X\u008a\u0084\u0002²\u0006\n\u0010m\u001a\u00020@X\u008a\u0084\u0002"}, d2 = {"TooltipBox", "", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltip", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/material3/TooltipState;", "modifier", "Landroidx/compose/ui/Modifier;", "focusable", "", "enableUserInput", "content", "Lkotlin/Function0;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function3;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onDismissRequest", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function3;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "hasAction", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function3;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PlainTooltip", "caretSize", "Landroidx/compose/ui/unit/DpSize;", "maxWidth", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "containerColor", "tonalElevation", "shadowElevation", "PlainTooltip-m9Er-Xc", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "caretShape", "PlainTooltip-gv3ox5I", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "RichTooltip", "title", "action", "colors", "Landroidx/compose/material3/RichTooltipColors;", "text", "RichTooltip-ZuUcA3Q", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JFLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "RichTooltip-EkvW5A0", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "rememberTooltipState", "initialIsVisible", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TooltipState;", "TooltipState", "textVerticalPadding", "subheadExists", "actionExists", "animateTooltip", "transition", "Landroidx/compose/animation/core/Transition;", "caretX", "", "tooltipWidth", "screenWidthPx", "", "anchorBounds", "Landroidx/compose/ui/geometry/Rect;", "layoutCaret", "transformationMatrix", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/Matrix;", "density", "Landroidx/compose/ui/unit/Density;", "windowContainerSize", "Landroidx/compose/ui/unit/IntSize;", "getAnchorLayoutCoordinates", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCaret-J5j9r9c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/unit/Density;JLkotlin/jvm/functions/Function1;Landroidx/compose/ui/window/PopupPositionProvider;)Landroidx/compose/ui/Modifier;", "SpacingBetweenTooltipAndAnchor", "getSpacingBetweenTooltipAndAnchor", "()F", "F", "TooltipMinHeight", "getTooltipMinHeight", "TooltipMinWidth", "getTooltipMinWidth", "PlainTooltipVerticalPadding", "PlainTooltipHorizontalPadding", "PlainTooltipContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getPlainTooltipContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "RichTooltipHorizontalPadding", "getRichTooltipHorizontalPadding", "HeightToSubheadFirstLine", "getHeightToSubheadFirstLine", "HeightFromSubheadToTextFirstLine", "TextBottomPadding", "ActionLabelMinHeight", "getActionLabelMinHeight", "ActionLabelBottomPadding", "getActionLabelBottomPadding", "material3", "scale", "alpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _buildPath {
    private static final getReturnTransition AudioAttributesCompatParcelizer;
    private static final float AudioAttributesImplApi21Parcelizer;
    private static final float AudioAttributesImplApi26Parcelizer;
    private static final float IconCompatParcelizer;
    private static final float MediaBrowserCompatCustomActionResultReceiver;
    private static final float MediaBrowserCompatItemReceiver;
    private static final float RemoteActionCompatParcelizer;
    private static final float read;
    private static final float write;
    private static final float AudioAttributesImplBaseParcelizer = assignParameter.IconCompatParcelizer(4.0f);
    private static final float MediaBrowserCompatMediaItem = assignParameter.IconCompatParcelizer(24.0f);
    private static final float RatingCompat = assignParameter.IconCompatParcelizer(40.0f);

    /* JADX INFO: renamed from: o._buildPath$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "IconCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ setLayoutInflater $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            IconCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(as asVar) {
            asVar.write("animateTooltip");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("transition", this.$RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(setLayoutInflater setlayoutinflater) {
            super(1);
            this.$RemoteActionCompatParcelizer = setlayoutinflater;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(final kotlin.DateDeserializersCalendarDeserializer r24, final kotlin.getModuleData<? super kotlin.getMatchingIndex, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r25, final kotlin.compile r26, kotlin._handleOddName r27, kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r28, boolean r29, boolean r30, boolean r31, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r32, kotlin._handleUnrecognizedCharacterEscape r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._buildPath.write(o.DateDeserializersCalendarDeserializer, o.getModuleData, o.compile, o._handleOddName, o.getCreatedOnDateMs, boolean, boolean, boolean, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isAbstract IconCompatParcelizer(InputAccessor inputAccessor) {
        return (isAbstract) inputAccessor.getRemoteActionCompatParcelizer();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer;
        final /* synthetic */ InputAccessor<isAbstract> write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            write(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(InputAccessor inputAccessor, isAbstract isabstract) {
            inputAccessor.write(isabstract);
            return getShowPopup.INSTANCE;
        }

        public final void write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-23901870, i, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:316)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            final InputAccessor<isAbstract> inputAccessor = this.write;
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.getMatchingProperty
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return _buildPath.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(inputAccessor, (isAbstract) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameWrite = getNullAccessPattern.write(companion, (getAnswerMap) objOnPause);
            MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.AudioAttributesCompatParcelizer;
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameWrite);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(InputAccessor<isAbstract> inputAccessor, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            this.write = inputAccessor;
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ getModuleData<getMatchingIndex, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer;
        final /* synthetic */ _parseTail RemoteActionCompatParcelizer;
        final /* synthetic */ setLayoutInflater<Boolean> write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-527401546, i, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:321)");
                }
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer = _buildPath.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, this.write);
                getModuleData<getMatchingIndex, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> getmoduledata = this.IconCompatParcelizer;
                _parseTail _parsetail = this.RemoteActionCompatParcelizer;
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameAudioAttributesCompatParcelizer);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
                } else {
                    _handleunrecognizedcharacterescape.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                    _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                    _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                getmoduledata.AudioAttributesCompatParcelizer(_parsetail, _handleunrecognizedcharacterescape, 6);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    return;
                }
                return;
            }
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }

        /* JADX WARN: Multi-variable type inference failed */
        read(setLayoutInflater<Boolean> setlayoutinflater, getModuleData<? super getMatchingIndex, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, _parseTail _parsetail) {
            this.write = setlayoutinflater;
            this.IconCompatParcelizer = getmoduledata;
            this.RemoteActionCompatParcelizer = _parsetail;
        }
    }

    public static final compile read(boolean z, boolean z2, setFirstHorizontalStyle setfirsthorizontalstyle, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            setfirsthorizontalstyle = getCurrentValue.INSTANCE.read();
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1413230530, i, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:962)");
        }
        boolean z3 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z2)) || (i & 48) == 32;
        boolean z4 = (((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setfirsthorizontalstyle)) || (i & RendererCapabilities.MODE_SUPPORT_MASK) == 256;
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z3 | z4) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new JsonPointerSerialization(z, z2, setfirsthorizontalstyle);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        JsonPointerSerialization jsonPointerSerialization = (JsonPointerSerialization) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return jsonPointerSerialization;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements getModuleData<_handleOddName, _handleUnrecognizedCharacterEscape, Integer, _handleOddName> {
        final /* synthetic */ setLayoutInflater<Boolean> AudioAttributesCompatParcelizer;

        @Override // kotlin.getModuleData
        public final /* synthetic */ _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            return read(_handleoddname, _handleunrecognizedcharacterescape, num.intValue());
        }

        public final _handleOddName read(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) throws Throwable {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1498516085);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1498516085, i, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:1268)");
            }
            SwitchCompat switchCompatAudioAttributesCompatParcelizer = getTextCharacters.AudioAttributesCompatParcelizer(TreeNode.write, _handleunrecognizedcharacterescape, 6);
            SwitchCompat switchCompatAudioAttributesCompatParcelizer2 = getTextCharacters.AudioAttributesCompatParcelizer(TreeNode.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescape, 6);
            setLayoutInflater<Boolean> setlayoutinflater = this.AudioAttributesCompatParcelizer;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(switchCompatAudioAttributesCompatParcelizer);
            evictionCount<Float, setHoverListener> evictioncountRemoteActionCompatParcelizer = hitCount.RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda1.INSTANCE);
            boolean zBooleanValue = setlayoutinflater.RemoteActionCompatParcelizer().booleanValue();
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1553362193);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1275)");
            }
            float f = zBooleanValue ? 1.0f : 0.8f;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            boolean zBooleanValue2 = setlayoutinflater.AudioAttributesImplApi26Parcelizer().booleanValue();
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1553362193);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1275)");
            }
            float f2 = zBooleanValue2 ? 1.0f : 0.8f;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            parseDouble parsedoubleAudioAttributesCompatParcelizer = setCardElevation.AudioAttributesCompatParcelizer(setlayoutinflater, Float.valueOf(f), Float.valueOf(f2), audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(setlayoutinflater.AudioAttributesImplBaseParcelizer(), _handleunrecognizedcharacterescape, 0), evictioncountRemoteActionCompatParcelizer, "tooltip transition: scaling", _handleunrecognizedcharacterescape, 196608);
            setLayoutInflater<Boolean> setlayoutinflater2 = this.AudioAttributesCompatParcelizer;
            C0052IconCompatParcelizer c0052IconCompatParcelizer = new C0052IconCompatParcelizer(switchCompatAudioAttributesCompatParcelizer2);
            evictionCount<Float, setHoverListener> evictioncountRemoteActionCompatParcelizer2 = hitCount.RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda1.INSTANCE);
            boolean zBooleanValue3 = setlayoutinflater2.RemoteActionCompatParcelizer().booleanValue();
            _handleunrecognizedcharacterescape.IconCompatParcelizer(2073045083);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1283)");
            }
            float f3 = zBooleanValue3 ? 1.0f : 0.0f;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            boolean zBooleanValue4 = setlayoutinflater2.AudioAttributesImplApi26Parcelizer().booleanValue();
            _handleunrecognizedcharacterescape.IconCompatParcelizer(2073045083);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1283)");
            }
            float f4 = zBooleanValue4 ? 1.0f : 0.0f;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = expand.AudioAttributesCompatParcelizer$default(_handleoddname, write(parsedoubleAudioAttributesCompatParcelizer), write(parsedoubleAudioAttributesCompatParcelizer), RemoteActionCompatParcelizer(setCardElevation.AudioAttributesCompatParcelizer(setlayoutinflater2, Float.valueOf(f3), Float.valueOf(f4), c0052IconCompatParcelizer.AudioAttributesCompatParcelizer(setlayoutinflater2.AudioAttributesImplBaseParcelizer(), _handleunrecognizedcharacterescape, 0), evictioncountRemoteActionCompatParcelizer2, "tooltip transition: alpha", _handleunrecognizedcharacterescape, 196608)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return _handleoddnameAudioAttributesCompatParcelizer$default;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AudioAttributesCompatParcelizer implements getModuleData<setLayoutInflater.write<Boolean>, _handleUnrecognizedCharacterEscape, Integer, SwitchCompat<Float>> {
            final /* synthetic */ SwitchCompat<Float> write;

            @Override // kotlin.getModuleData
            public final /* synthetic */ SwitchCompat<Float> AudioAttributesCompatParcelizer(setLayoutInflater.write<Boolean> writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
                return IconCompatParcelizer(writeVar, _handleunrecognizedcharacterescape, num.intValue());
            }

            public final SwitchCompat<Float> IconCompatParcelizer(setLayoutInflater.write<Boolean> writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(386845748);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(386845748, i, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1272)");
                }
                SwitchCompat<Float> switchCompat = this.write;
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                return switchCompat;
            }

            AudioAttributesCompatParcelizer(SwitchCompat<Float> switchCompat) {
                this.write = switchCompat;
            }
        }

        /* JADX INFO: renamed from: o._buildPath$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0052IconCompatParcelizer implements getModuleData<setLayoutInflater.write<Boolean>, _handleUnrecognizedCharacterEscape, Integer, SwitchCompat<Float>> {
            final /* synthetic */ SwitchCompat<Float> IconCompatParcelizer;

            @Override // kotlin.getModuleData
            public final /* synthetic */ SwitchCompat<Float> AudioAttributesCompatParcelizer(setLayoutInflater.write<Boolean> writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
                return write(writeVar, _handleunrecognizedcharacterescape, num.intValue());
            }

            public final SwitchCompat<Float> write(setLayoutInflater.write<Boolean> writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-281714272);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-281714272, i, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1280)");
                }
                SwitchCompat<Float> switchCompat = this.IconCompatParcelizer;
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                return switchCompat;
            }

            C0052IconCompatParcelizer(SwitchCompat<Float> switchCompat) {
                this.IconCompatParcelizer = switchCompat;
            }
        }

        private static final float write(parseDouble<Float> parsedouble) {
            return parsedouble.getRemoteActionCompatParcelizer().floatValue();
        }

        private static final float RemoteActionCompatParcelizer(parseDouble<Float> parsedouble) {
            return parsedouble.getRemoteActionCompatParcelizer().floatValue();
        }

        IconCompatParcelizer(setLayoutInflater<Boolean> setlayoutinflater) {
            this.AudioAttributesCompatParcelizer = setlayoutinflater;
        }
    }

    public static final float RemoteActionCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer;
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, setLayoutInflater<Boolean> setlayoutinflater) {
        return _verifyNLZ2.AudioAttributesCompatParcelizer(_handleoddname, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass2(setlayoutinflater) : C0214type.read(), new IconCompatParcelizer(setlayoutinflater));
    }

    static {
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(4.0f);
        AudioAttributesImplApi21Parcelizer = fIconCompatParcelizer;
        float fIconCompatParcelizer2 = assignParameter.IconCompatParcelizer(8.0f);
        AudioAttributesImplApi26Parcelizer = fIconCompatParcelizer2;
        AudioAttributesCompatParcelizer = getParentFragment.write(fIconCompatParcelizer2, fIconCompatParcelizer);
        MediaBrowserCompatCustomActionResultReceiver = assignParameter.IconCompatParcelizer(16.0f);
        RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(28.0f);
        write = assignParameter.IconCompatParcelizer(24.0f);
        MediaBrowserCompatItemReceiver = assignParameter.IconCompatParcelizer(16.0f);
        read = assignParameter.IconCompatParcelizer(36.0f);
        IconCompatParcelizer = assignParameter.IconCompatParcelizer(8.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(DateDeserializersCalendarDeserializer dateDeserializersCalendarDeserializer, getModuleData getmoduledata, compile compileVar, _handleOddName _handleoddname, getCreatedOnDateMs getcreatedondatems, boolean z, boolean z2, boolean z3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        write(dateDeserializersCalendarDeserializer, getmoduledata, compileVar, _handleoddname, getcreatedondatems, z, z2, z3, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
