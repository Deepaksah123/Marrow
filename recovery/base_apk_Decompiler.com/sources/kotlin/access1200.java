package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin.WorkDatabase;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0099\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010 \u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b!\u0010\"\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b#\u0010$\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b#\u0010%\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001e\u0010&\u001a\u001e\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002\u001a@\u0010,\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/\u0012\f\u0012\n\u0012\u0004\u0012\u000201\u0018\u0001000.\u0018\u00010-2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030-2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e00H\u0002\u001aÉ\u0001\u00105\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00106\u001a\u0002072\u0014\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09\u0018\u00010-2\u001c\u0010;\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010<0-\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\bA\u0010B\u001a·\u0001\u0010C\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00182\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010D\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00106\u001a\u0002072\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0003¢\u0006\u0004\bE\u0010F¨\u0006G²\u0006\n\u0010H\u001a\u00020\u0018X\u008a\u008e\u0002"}, d2 = {"BasicText", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", TtmlNode.TAG_STYLE, "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", "autoSize", "Landroidx/compose/foundation/text/TextAutoSize;", "BasicText-RWo7tUw", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContent", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-CL7eQgs", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V", "BasicText-VhcvRP8", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "measureWithTextRangeMeasureConstraints", "", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/Placeable;", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "measurables", "Landroidx/compose/ui/layout/Measurable;", "shouldMeasureLinks", "textModifier", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "placeholders", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "onShowTranslation", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "textModifier-CL7eQgs", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/ui/Modifier;", "LayoutWithLinksAndInlineContent", "hasInlineContent", "LayoutWithLinksAndInlineContent-11Od_4g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V", "foundation", "displayedText"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class access1200 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractDeserializer AudioAttributesCompatParcelizer(AbstractDeserializer abstractDeserializer) {
        return abstractDeserializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012b A[PHI: r19
      0x012b: PHI (r19v17 int) = (r19v16 int), (r19v25 int), (r19v26 int) binds: [B:95:0x010e, B:105:0x0129, B:104:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(final java.lang.String r39, kotlin._handleOddName r40, kotlin.deserializeWithObjectId r41, kotlin.getAnswerMap<? super kotlin.deserializeFromNumber, kotlin.getShowPopup> r42, int r43, boolean r44, int r45, int r46, kotlin.MinimalPrettyPrinter r47, kotlin.setTrackNameProvider r48, kotlin._handleUnrecognizedCharacterEscape r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access1200.AudioAttributesCompatParcelizer(java.lang.String, o._handleOddName, o.deserializeWithObjectId, o.getAnswerMap, int, boolean, int, int, o.MinimalPrettyPrinter, o.setTrackNameProvider, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesCompatParcelizer(setLayoutParams setlayoutparams) {
        return setlayoutparams.RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(final kotlin.AbstractDeserializer r47, kotlin._handleOddName r48, kotlin.deserializeWithObjectId r49, kotlin.getAnswerMap<? super kotlin.deserializeFromNumber, kotlin.getShowPopup> r50, int r51, boolean r52, int r53, int r54, java.util.Map<java.lang.String, kotlin.setControllerHideDuringAds> r55, kotlin.MinimalPrettyPrinter r56, kotlin.setTrackNameProvider r57, kotlin._handleUnrecognizedCharacterEscape r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instruction units count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access1200.read(o.AbstractDeserializer, o._handleOddName, o.deserializeWithObjectId, o.getAnswerMap, int, boolean, int, int, java.util.Map, o.MinimalPrettyPrinter, o.setTrackNameProvider, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long read(setLayoutParams setlayoutparams) {
        return setlayoutparams.RemoteActionCompatParcelizer();
    }

    private static final AbstractDeserializer write(InputAccessor<AbstractDeserializer> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(InputAccessor inputAccessor, WorkDatabase.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        AbstractDeserializer audioAttributesCompatParcelizer;
        if (remoteActionCompatParcelizer.getIconCompatParcelizer()) {
            audioAttributesCompatParcelizer = remoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
        } else {
            audioAttributesCompatParcelizer = remoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
        }
        read((InputAccessor<AbstractDeserializer>) inputAccessor, audioAttributesCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    private static final parseManyDecDigits<Long, Long> IconCompatParcelizer(final setLayoutParams setlayoutparams) {
        return JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.access1700
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return access1200.IconCompatParcelizer(setlayoutparams, (JavaDoubleBitsFromCharSequence) obj, ((Long) obj2).longValue());
            }
        }, new getAnswerMap() { // from class: o.access1800
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return access1200.RemoteActionCompatParcelizer(((Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long IconCompatParcelizer(setLayoutParams setlayoutparams, JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, long j) {
        if (setItemSpacingPx.write(setlayoutparams, j)) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long RemoteActionCompatParcelizer(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Pair<_parser, getCreatedOnDateMs<hasReferringProperties>>> read(List<? extends isTypeOrSuperTypeOf> list, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        if (!getcreatedondatems.invoke().booleanValue()) {
            return null;
        }
        RecyclerViewSavedState recyclerViewSavedState = new RecyclerViewSavedState();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            isTypeOrSuperTypeOf istypeorsupertypeof = list.get(i);
            Object objQ_ = istypeorsupertypeof.getOnPrepareFromUri();
            toMagicModuleMetaRepoModel.read(objQ_, "");
            setHasStableIds sethasstableidsWrite = ((RecyclerViewLayoutParams) objQ_).getRemoteActionCompatParcelizer().write(recyclerViewSavedState);
            arrayList.add(new Pair(istypeorsupertypeof.write(PropertyValueAny.INSTANCE.IconCompatParcelizer(sethasstableidsWrite.getAudioAttributesCompatParcelizer(), sethasstableidsWrite.getAudioAttributesCompatParcelizer(), sethasstableidsWrite.getRemoteActionCompatParcelizer(), sethasstableidsWrite.getRemoteActionCompatParcelizer())), sethasstableidsWrite.RemoteActionCompatParcelizer()));
        }
        return arrayList;
    }

    private static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, getAnswerMap<? super deserializeFromNumber, getShowPopup> getanswermap, int i, boolean z, int i2, int i3, _reportMissingSetter.write writeVar, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, getAnswerMap<? super List<WritableTypeIdInclusion>, getShowPopup> getanswermap2, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, getAnswerMap<? super WorkDatabase.RemoteActionCompatParcelizer, getShowPopup> getanswermap3, setTrackNameProvider settracknameprovider) {
        if (jFunction2 == null) {
            return _handleoddname.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE).AudioAttributesCompatParcelizer(new WorkerParameters(abstractDeserializer, deserializewithobjectid, writeVar, getanswermap, i, z, i2, i3, list, getanswermap2, null, minimalPrettyPrinter, settracknameprovider, getanswermap3, null));
        }
        return _handleoddname.AudioAttributesCompatParcelizer(jFunction2.getAudioAttributesImplBaseParcelizer()).AudioAttributesCompatParcelizer(new Consumer2(abstractDeserializer, deserializewithobjectid, writeVar, getanswermap, i, z, i2, i3, list, getanswermap2, jFunction2, minimalPrettyPrinter, settracknameprovider, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void write(final kotlin._handleOddName r30, final kotlin.AbstractDeserializer r31, final kotlin.getAnswerMap<? super kotlin.deserializeFromNumber, kotlin.getShowPopup> r32, final boolean r33, java.util.Map<java.lang.String, kotlin.setControllerHideDuringAds> r34, final kotlin.deserializeWithObjectId r35, final int r36, final boolean r37, final int r38, final int r39, final o._reportMissingSetter.write r40, final kotlin.JFunction2 r41, final kotlin.MinimalPrettyPrinter r42, final kotlin.getAnswerMap<? super o.WorkDatabase.RemoteActionCompatParcelizer, kotlin.getShowPopup> r43, final kotlin.setTrackNameProvider r44, kotlin._handleUnrecognizedCharacterEscape r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access1200.write(o._handleOddName, o.AbstractDeserializer, o.getAnswerMap, boolean, java.util.Map, o.deserializeWithObjectId, int, boolean, int, int, o._reportMissingSetter$write, o.JFunction2, o.MinimalPrettyPrinter, o.getAnswerMap, o.setTrackNameProvider, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractDeserializer RemoteActionCompatParcelizer(notifyItemChanged notifyitemchanged, AbstractDeserializer abstractDeserializer) {
        AbstractDeserializer abstractDeserializer2;
        return (notifyitemchanged == null || (abstractDeserializer2 = notifyitemchanged.read()) == null) ? abstractDeserializer : abstractDeserializer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor, List list) {
        if (inputAccessor != null) {
            inputAccessor.write(list);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(notifyItemChanged notifyitemchanged, getAnswerMap getanswermap, deserializeFromNumber deserializefromnumber) {
        if (notifyitemchanged != null) {
            notifyitemchanged.read(deserializefromnumber);
        }
        if (getanswermap != null) {
            getanswermap.invoke(deserializefromnumber);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(notifyItemChanged notifyitemchanged) {
        if (notifyitemchanged != null) {
            return notifyitemchanged.RemoteActionCompatParcelizer().invoke().booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(notifyItemChanged notifyitemchanged) {
        if (notifyitemchanged != null) {
            return notifyitemchanged.RemoteActionCompatParcelizer().invoke().booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List read(InputAccessor inputAccessor) {
        if (inputAccessor != null) {
            return (List) inputAccessor.getRemoteActionCompatParcelizer();
        }
        return null;
    }

    private static final void read(InputAccessor<AbstractDeserializer> inputAccessor, AbstractDeserializer abstractDeserializer) {
        inputAccessor.write(abstractDeserializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(AbstractDeserializer abstractDeserializer, _handleOddName _handleoddname, deserializeWithObjectId deserializewithobjectid, getAnswerMap getanswermap, int i, boolean z, int i2, int i3, Map map, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider, int i4, int i5, int i6, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i7) {
        read(abstractDeserializer, _handleoddname, deserializewithobjectid, getanswermap, i, z, i2, i3, map, minimalPrettyPrinter, settracknameprovider, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i4 | 1), _appendEscaped.RemoteActionCompatParcelizer(i5), i6);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, _handleOddName _handleoddname, deserializeWithObjectId deserializewithobjectid, getAnswerMap getanswermap, int i, boolean z, int i2, int i3, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider, int i4, int i5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i6) {
        AudioAttributesCompatParcelizer(str, _handleoddname, deserializewithobjectid, getanswermap, i, z, i2, i3, minimalPrettyPrinter, settracknameprovider, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i4 | 1), i5);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, AbstractDeserializer abstractDeserializer, getAnswerMap getanswermap, boolean z, Map map, deserializeWithObjectId deserializewithobjectid, int i, boolean z2, int i2, int i3, _reportMissingSetter.write writeVar, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, getAnswerMap getanswermap2, setTrackNameProvider settracknameprovider, int i4, int i5, int i6, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i7) {
        write(_handleoddname, abstractDeserializer, getanswermap, z, map, deserializewithobjectid, i, z2, i2, i3, writeVar, jFunction2, minimalPrettyPrinter, getanswermap2, settracknameprovider, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i4 | 1), _appendEscaped.RemoteActionCompatParcelizer(i5), i6);
        return getShowPopup.INSTANCE;
    }
}
