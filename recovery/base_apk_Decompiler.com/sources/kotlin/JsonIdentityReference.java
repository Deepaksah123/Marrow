package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._parser;
import kotlin.setThumbTintList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001aA\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0014\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001aK\u0010\u001e\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!\u001aA\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\"\u0010#\u001a5\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001fH\u0007¢\u0006\u0004\b$\u0010%\u001a-\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001fH\u0007¢\u0006\u0004\b&\u0010'\u001a3\u0010(\u001a\u00020\u0003*\u00020\u00152\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.\u001a#\u0010/\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101\u001a3\u00102\u001a\u00020\u0003*\u00020\u00152\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b3\u0010.\u001a;\u00104\u001a\u00020\u0003*\u00020\u00152\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b5\u00106\"\u0010\u00107\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u00108\"\u0010\u00109\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u00108\"\u0010\u0010:\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u00108\"\u000e\u0010;\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S²\u0006\n\u0010T\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010V\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010X\u001a\u00020<X\u008a\u0084\u0002²\u0006\n\u0010Y\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010Z\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"increaseSemanticsBounds", "Landroidx/compose/ui/Modifier;", "LinearProgressIndicator", "", "progress", "", "modifier", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "drawLinearIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startFraction", "endFraction", "strokeWidth", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "CircularProgressIndicator", "Landroidx/compose/ui/unit/Dp;", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "LinearIndicatorHeight", "F", "LinearIndicatorWidth", "CircularIndicatorDiameter", "LinearAnimationDuration", "", "FirstLineHeadDuration", "FirstLineTailDuration", "SecondLineHeadDuration", "SecondLineTailDuration", "FirstLineHeadDelay", "FirstLineTailDelay", "SecondLineHeadDelay", "SecondLineTailDelay", "FirstLineHeadEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "RotationsPerCycle", "RotationDuration", "StartAngleOffset", "BaseRotationAngle", "JumpRotationAngle", "RotationAngleOffset", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "CircularEasing", "material", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "currentRotation", "baseRotation", "endAngle"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonIdentityReference {
    private static final float AudioAttributesCompatParcelizer = property.INSTANCE.write();
    private static final float AudioAttributesImplBaseParcelizer = assignParameter.IconCompatParcelizer(240.0f);
    private static final float write = assignParameter.IconCompatParcelizer(40.0f);
    private static final setMaxWidth read = new setMaxWidth(0.2f, BitmapDescriptorFactory.HUE_RED, 0.8f, 1.0f);
    private static final setMaxWidth IconCompatParcelizer = new setMaxWidth(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
    private static final setMaxWidth MediaBrowserCompatCustomActionResultReceiver = new setMaxWidth(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.65f, 1.0f);
    private static final setMaxWidth MediaBrowserCompatItemReceiver = new setMaxWidth(0.1f, BitmapDescriptorFactory.HUE_RED, 0.45f, 1.0f);
    private static final setMaxWidth RemoteActionCompatParcelizer = new setMaxWidth(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final withHandlersFrom IconCompatParcelizer(float f, withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, PropertyValueAny propertyValueAny) {
        final int iIconCompatParcelizer = withcontentvaluehandler.IconCompatParcelizer(f);
        long read2 = propertyValueAny.getRead();
        int i = iIconCompatParcelizer << 1;
        final _parser _parserVarWrite = istypeorsupertypeof.write(PropertyValueBuffer.IconCompatParcelizer(read2, 0, i));
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer() - i, null, new getAnswerMap() { // from class: o.findIgnoredForDeserialization
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return JsonIdentityReference.read(_parserVarWrite, iIconCompatParcelizer, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_parser _parserVar, int i, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, -i, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getConfigOverride getconfigoverride) {
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(final float r25, kotlin._handleOddName r26, long r27, long r29, int r31, kotlin._handleUnrecognizedCharacterEscape r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonIdentityReference.RemoteActionCompatParcelizer(float, o._handleOddName, long, long, int, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(long j, int i, float f, long j2, findSetterInfo findsetterinfo) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) findsetterinfo.MediaBrowserCompatCustomActionResultReceiver());
        read(findsetterinfo, j, fIntBitsToFloat, i);
        AudioAttributesCompatParcelizer(findsetterinfo, BitmapDescriptorFactory.HUE_RED, f, j2, fIntBitsToFloat, i);
        return getShowPopup.INSTANCE;
    }

    private static final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (findsetterinfo.MediaBrowserCompatCustomActionResultReceiver() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) findsetterinfo.MediaBrowserCompatCustomActionResultReceiver());
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = findsetterinfo.RemoteActionCompatParcelizer() == tryToResolveUnresolved.write;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (!findAutoDetectVisibility.AudioAttributesCompatParcelizer(i, findAutoDetectVisibility.INSTANCE.read()) && fIntBitsToFloat2 <= fIntBitsToFloat) {
            float f7 = f3 / 2.0f;
            initEncryptedContent<Float> initencryptedcontentAudioAttributesCompatParcelizer = getQues.AudioAttributesCompatParcelizer(f7, fIntBitsToFloat - f7);
            float fFloatValue = ((Number) getQues.read(Float.valueOf(f5), initencryptedcontentAudioAttributesCompatParcelizer)).floatValue();
            float fFloatValue2 = ((Number) getQues.read(Float.valueOf(f6), initencryptedcontentAudioAttributesCompatParcelizer)).floatValue();
            if (Math.abs(f2 - f) > BitmapDescriptorFactory.HUE_RED) {
                long j2 = -1;
                long j3 = -1;
                findSetterInfo.IconCompatParcelizer$default(findsetterinfo, j, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(f4)))), getReferencedType.AudioAttributesCompatParcelizer((((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) Float.floatToRawIntBits(f4))) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32)), f3, i, (setCurrentLength) null, BitmapDescriptorFactory.HUE_RED, (switchAndReturnNext) null, 0, 480, (Object) null);
                return;
            }
            return;
        }
        long j4 = -1;
        long j5 = -1;
        findSetterInfo.IconCompatParcelizer$default(findsetterinfo, j, getReferencedType.AudioAttributesCompatParcelizer((((j4 - ((j4 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(f4))) | (((long) Float.floatToRawIntBits(f5)) << 32)), getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32))))), f3, 0, (setCurrentLength) null, BitmapDescriptorFactory.HUE_RED, (switchAndReturnNext) null, 0, 496, (Object) null);
    }

    private static final void read(findSetterInfo findsetterinfo, long j, float f, int i) {
        AudioAttributesCompatParcelizer(findsetterinfo, BitmapDescriptorFactory.HUE_RED, 1.0f, j, f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0297  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(kotlin._handleOddName r33, long r34, float r36, long r37, int r39, kotlin._handleUnrecognizedCharacterEscape r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonIdentityReference.read(o._handleOddName, long, float, long, int, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setThumbTintList.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        remoteActionCompatParcelizer.read(1332);
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.write(Float.valueOf(BitmapDescriptorFactory.HUE_RED), 0), RemoteActionCompatParcelizer);
        remoteActionCompatParcelizer.write(Float.valueOf(290.0f), 666);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setThumbTintList.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        remoteActionCompatParcelizer.read(1332);
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.write(Float.valueOf(BitmapDescriptorFactory.HUE_RED), 666), RemoteActionCompatParcelizer);
        remoteActionCompatParcelizer.write(Float.valueOf(290.0f), remoteActionCompatParcelizer.getRead());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(long j, findValueInstantiator findvalueinstantiator, float f, long j2, parseDouble parsedouble, parseDouble parsedouble2, parseDouble parsedouble3, parseDouble parsedouble4, findSetterInfo findsetterinfo) {
        RemoteActionCompatParcelizer(findsetterinfo, j, findvalueinstantiator);
        AudioAttributesCompatParcelizer(findsetterinfo, AudioAttributesCompatParcelizer((parseDouble<Float>) parsedouble3) + (((write((parseDouble<Integer>) parsedouble) * 216.0f) % 360.0f) - 90.0f) + RemoteActionCompatParcelizer(parsedouble4), f, Math.abs(IconCompatParcelizer((parseDouble<Float>) parsedouble2) - AudioAttributesCompatParcelizer((parseDouble<Float>) parsedouble3)), j2, findvalueinstantiator);
        return getShowPopup.INSTANCE;
    }

    private static final void read(findSetterInfo findsetterinfo, float f, float f2, long j, findValueInstantiator findvalueinstantiator) {
        float iconCompatParcelizer = findvalueinstantiator.getIconCompatParcelizer() / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (findsetterinfo.MediaBrowserCompatCustomActionResultReceiver() >> 32)) - (2.0f * iconCompatParcelizer);
        long j2 = -1;
        long j3 = -1;
        findSetterInfo.write$default(findsetterinfo, j, f, f2, false, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(iconCompatParcelizer)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(iconCompatParcelizer)) << 32)), calloc.write((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) Float.floatToRawIntBits(fIntBitsToFloat)))), BitmapDescriptorFactory.HUE_RED, (findViews) findvalueinstantiator, (switchAndReturnNext) null, 0, 832, (Object) null);
    }

    private static final void RemoteActionCompatParcelizer(findSetterInfo findsetterinfo, long j, findValueInstantiator findvalueinstantiator) {
        read(findsetterinfo, BitmapDescriptorFactory.HUE_RED, 360.0f, j, findvalueinstantiator);
    }

    private static final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo, float f, float f2, float f3, long j, findValueInstantiator findvalueinstantiator) {
        read(findsetterinfo, f + (findAutoDetectVisibility.AudioAttributesCompatParcelizer(findvalueinstantiator.getWrite(), findAutoDetectVisibility.INSTANCE.read()) ? BitmapDescriptorFactory.HUE_RED : ((f2 / assignParameter.IconCompatParcelizer(write / 2.0f)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, findvalueinstantiator);
    }

    public static final _handleOddName write(_handleOddName _handleoddname) {
        final float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(10.0f);
        return getParentFragment.write$default(withValueInstantiators.read(isTypeOrSubTypeOf.write(_handleoddname, new getModuleData() { // from class: o.allowSetters
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return JsonIdentityReference.IconCompatParcelizer(fIconCompatParcelizer, (withContentValueHandler) obj, (isTypeOrSuperTypeOf) obj2, (PropertyValueAny) obj3);
            }
        }), true, new getAnswerMap() { // from class: o.findIgnoredForSerialization
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return JsonIdentityReference.read((getConfigOverride) obj);
            }
        }), BitmapDescriptorFactory.HUE_RED, fIconCompatParcelizer, 1, null);
    }

    private static final int write(parseDouble<Integer> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().intValue();
    }

    private static final float RemoteActionCompatParcelizer(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    private static final float IconCompatParcelizer(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    private static final float AudioAttributesCompatParcelizer(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, long j, float f, long j2, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        read(_handleoddname, j, f, j2, i, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(float f, _handleOddName _handleoddname, long j, long j2, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        RemoteActionCompatParcelizer(f, _handleoddname, j, j2, i, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}
