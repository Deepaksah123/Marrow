package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._deserializeFromObjectId;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÏ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#\u001aÃ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%\u001aã\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b*\u0010+\u001aÙ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010,\u001a(\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020!2\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u000104¢\u0006\u0002\b5H\u0007¢\u0006\u0002\u00106\u001a\u0018\u00107\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020&2\u0006\u00108\u001a\u000209H\u0002\u001a\r\u0010:\u001a\u000209H\u0003¢\u0006\u0002\u0010;\"\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020!0.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006<"}, d2 = {"Text", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", TtmlNode.TAG_STYLE, "Landroidx/compose/ui/text/TextStyle;", "Text--4IGK_g", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContent", "", "Landroidx/compose/foundation/text/InlineTextContent;", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", AppMeasurementSdk.ConditionalUserProperty.VALUE, "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "createTextWithLinkStyles", "linkStyles", "Landroidx/compose/ui/text/TextLinkStyles;", "rememberTextLinkStyles", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextLinkStyles;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _copyCurrentStringValue {
    private static final CharacterEscapes<deserializeWithObjectId> RemoteActionCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer(_qbuf.RemoteActionCompatParcelizer(), new getCreatedOnDateMs() { // from class: o._throwInternal
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return _copyCurrentStringValue.IconCompatParcelizer();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconCompatParcelizer(final java.lang.String r67, kotlin._handleOddName r68, long r69, long r71, kotlin.withValueDeserializer r73, kotlin.getDataStream r74, kotlin._reportMissingSetter r75, long r76, kotlin.renameAll r78, kotlin.assignIndexes r79, long r80, int r82, boolean r83, int r84, int r85, kotlin.getAnswerMap<? super kotlin.deserializeFromNumber, kotlin.getShowPopup> r86, kotlin.deserializeWithObjectId r87, kotlin._handleUnrecognizedCharacterEscape r88, final int r89, final int r90, final int r91) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._copyCurrentStringValue.IconCompatParcelizer(java.lang.String, o._handleOddName, long, long, o.withValueDeserializer, o.getDataStream, o._reportMissingSetter, long, o.renameAll, o.assignIndexes, long, int, boolean, int, int, o.getAnswerMap, o.deserializeWithObjectId, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements MinimalPrettyPrinter {
        final /* synthetic */ long RemoteActionCompatParcelizer;

        @Override // kotlin.MinimalPrettyPrinter
        public final long write() {
            return this.RemoteActionCompatParcelizer;
        }

        read(long j) {
            this.RemoteActionCompatParcelizer = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(deserializeFromNumber deserializefromnumber) {
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0120  */
    @kotlin.getRenewGrpId
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void read(final java.lang.String r54, kotlin._handleOddName r55, long r56, long r58, kotlin.withValueDeserializer r60, kotlin.getDataStream r61, kotlin._reportMissingSetter r62, long r63, kotlin.renameAll r65, kotlin.assignIndexes r66, long r67, int r69, boolean r70, int r71, kotlin.getAnswerMap r72, kotlin.deserializeWithObjectId r73, kotlin._handleUnrecognizedCharacterEscape r74, final int r75, final int r76, final int r77) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._copyCurrentStringValue.read(java.lang.String, o._handleOddName, long, long, o.withValueDeserializer, o.getDataStream, o._reportMissingSetter, long, o.renameAll, o.assignIndexes, long, int, boolean, int, o.getAnswerMap, o.deserializeWithObjectId, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(deserializeFromNumber deserializefromnumber) {
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(final kotlin.AbstractDeserializer r71, kotlin._handleOddName r72, long r73, long r75, kotlin.withValueDeserializer r77, kotlin.getDataStream r78, kotlin._reportMissingSetter r79, long r80, kotlin.renameAll r82, kotlin.assignIndexes r83, long r84, int r86, boolean r87, int r88, int r89, java.util.Map<java.lang.String, kotlin.setControllerHideDuringAds> r90, kotlin.getAnswerMap<? super kotlin.deserializeFromNumber, kotlin.getShowPopup> r91, kotlin.deserializeWithObjectId r92, kotlin._handleUnrecognizedCharacterEscape r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instruction units count: 1293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._copyCurrentStringValue.read(o.AbstractDeserializer, o._handleOddName, long, long, o.withValueDeserializer, o.getDataStream, o._reportMissingSetter, long, o.renameAll, o.assignIndexes, long, int, boolean, int, int, java.util.Map, o.getAnswerMap, o.deserializeWithObjectId, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements MinimalPrettyPrinter {
        final /* synthetic */ long AudioAttributesCompatParcelizer;

        @Override // kotlin.MinimalPrettyPrinter
        public final long write() {
            return this.AudioAttributesCompatParcelizer;
        }

        RemoteActionCompatParcelizer(long j) {
            this.AudioAttributesCompatParcelizer = j;
        }
    }

    public static final CharacterEscapes<deserializeWithObjectId> AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeWithObjectId IconCompatParcelizer() {
        return copyCurrentStructure.RemoteActionCompatParcelizer();
    }

    public static final void RemoteActionCompatParcelizer(final deserializeWithObjectId deserializewithobjectid, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-13499697);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(deserializewithobjectid) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-13499697, i2, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:409)");
            }
            CharacterEscapes<deserializeWithObjectId> characterEscapes = RemoteActionCompatParcelizer;
            resetAsNaN.write(characterEscapes.AudioAttributesCompatParcelizer(((deserializeWithObjectId) _handleunrecognizedcharacterescapeWrite.write(characterEscapes)).write(deserializewithobjectid)), magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, (i2 & 112) | ContentReference.write);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.canWriteObjectId
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return _copyCurrentStringValue.IconCompatParcelizer(deserializewithobjectid, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final AbstractDeserializer IconCompatParcelizer(AbstractDeserializer abstractDeserializer, final deserializeFromEmbedded deserializefromembedded) {
        return abstractDeserializer.IconCompatParcelizer(new getAnswerMap() { // from class: o._reportError
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return _copyCurrentStringValue.read(deserializefromembedded, (AbstractDeserializer.AudioAttributesCompatParcelizer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractDeserializer.AudioAttributesCompatParcelizer read(deserializeFromEmbedded deserializefromembedded, AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        AbstractDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (AbstractDeserializer.RemoteActionCompatParcelizer) audioAttributesCompatParcelizer.IconCompatParcelizer();
        if (remoteActionCompatParcelizer instanceof _deserializeFromObjectId.IconCompatParcelizer) {
            _deserializeFromObjectId.IconCompatParcelizer iconCompatParcelizer = (_deserializeFromObjectId.IconCompatParcelizer) remoteActionCompatParcelizer;
            if (iconCompatParcelizer.getRead() == null) {
                toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
                return AbstractDeserializer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer$default(audioAttributesCompatParcelizer, _deserializeFromObjectId.IconCompatParcelizer.read$default(iconCompatParcelizer, null, deserializefromembedded, null, 5, null), 0, 0, null, 14, null);
            }
        }
        if (remoteActionCompatParcelizer instanceof _deserializeFromObjectId.read) {
            _deserializeFromObjectId.read readVar = (_deserializeFromObjectId.read) remoteActionCompatParcelizer;
            if (readVar.getRead() == null) {
                toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
                return AbstractDeserializer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer$default(audioAttributesCompatParcelizer, _deserializeFromObjectId.read.RemoteActionCompatParcelizer$default(readVar, null, deserializefromembedded, null, 5, null), 0, 0, null, 14, null);
            }
        }
        return audioAttributesCompatParcelizer;
    }

    private static final deserializeFromEmbedded write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(853203714, i, -1, "androidx.compose.material.rememberTextLinkStyles (Text.kt:431)");
        }
        long jAudioAttributesImplApi26Parcelizer = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).AudioAttributesImplApi26Parcelizer();
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(jAudioAttributesImplApi26Parcelizer);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new deserializeFromEmbedded(new _findPropertyUnwrapper(jAudioAttributesImplApi26Parcelizer, 0L, null, null, null, null, null, 0L, null, null, null, 0L, renameAll.INSTANCE.AudioAttributesCompatParcelizer(), null, null, null, 61438, null), null, null, null, 14, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        deserializeFromEmbedded deserializefromembedded = (deserializeFromEmbedded) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return deserializefromembedded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(deserializeWithObjectId deserializewithobjectid, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        RemoteActionCompatParcelizer(deserializewithobjectid, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(AbstractDeserializer abstractDeserializer, _handleOddName _handleoddname, long j, long j2, withValueDeserializer withvaluedeserializer, getDataStream getdatastream, _reportMissingSetter _reportmissingsetter, long j3, renameAll renameall, assignIndexes assignindexes, long j4, int i, boolean z, int i2, int i3, Map map, getAnswerMap getanswermap, deserializeWithObjectId deserializewithobjectid, int i4, int i5, int i6, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i7) {
        read(abstractDeserializer, _handleoddname, j, j2, withvaluedeserializer, getdatastream, _reportmissingsetter, j3, renameall, assignindexes, j4, i, z, i2, i3, map, getanswermap, deserializewithobjectid, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i4 | 1), _appendEscaped.RemoteActionCompatParcelizer(i5), i6);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, _handleOddName _handleoddname, long j, long j2, withValueDeserializer withvaluedeserializer, getDataStream getdatastream, _reportMissingSetter _reportmissingsetter, long j3, renameAll renameall, assignIndexes assignindexes, long j4, int i, boolean z, int i2, int i3, getAnswerMap getanswermap, deserializeWithObjectId deserializewithobjectid, int i4, int i5, int i6, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i7) {
        IconCompatParcelizer(str, _handleoddname, j, j2, withvaluedeserializer, getdatastream, _reportmissingsetter, j3, renameall, assignindexes, j4, i, z, i2, i3, getanswermap, deserializewithobjectid, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i4 | 1), _appendEscaped.RemoteActionCompatParcelizer(i5), i6);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, _handleOddName _handleoddname, long j, long j2, withValueDeserializer withvaluedeserializer, getDataStream getdatastream, _reportMissingSetter _reportmissingsetter, long j3, renameAll renameall, assignIndexes assignindexes, long j4, int i, boolean z, int i2, getAnswerMap getanswermap, deserializeWithObjectId deserializewithobjectid, int i3, int i4, int i5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i6) {
        read(str, _handleoddname, j, j2, withvaluedeserializer, getdatastream, _reportmissingsetter, j3, renameall, assignindexes, j4, i, z, i2, getanswermap, deserializewithobjectid, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), _appendEscaped.RemoteActionCompatParcelizer(i4), i5);
        return getShowPopup.INSTANCE;
    }
}
