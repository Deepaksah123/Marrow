package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aW\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u000e\u001aO\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0005\u001a\u00020\u00152\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aO\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u0005\u001a\u00020\u001a2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001b\u0010\u0017\u001aM\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u0005\u001a\u00020\u001e2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u001f\u001aM\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010\u0005\u001a\u00020\"2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010#\u001aO\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00042\u0006\u0010\u0005\u001a\u00020&2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020&0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b'\u0010\u0017\u001aO\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0005\u001a\u00020*2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020*0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b+\u0010\u0017\u001a}\u0010-\u001a\b\u0012\u0004\u0012\u0002H.0\u0004\"\u0004\b\u0000\u0010.\"\b\b\u0001\u0010/*\u0002002\u0006\u0010\u0005\u001a\u0002H.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u0002H/022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H.0\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u0001H.2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u00103\u001aM\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u00104\u001aE\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b5\u00106\u001aE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0005\u001a\u00020\u00152\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b7\u00108\u001aE\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u0005\u001a\u00020\u001a2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b9\u00108\u001aC\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u0005\u001a\u00020\u001e2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010:\u001aC\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010\u0005\u001a\u00020\"2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010;\u001aE\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00042\u0006\u0010\u0005\u001a\u00020&2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020&0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b<\u00108\u001aE\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0005\u001a\u00020*2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020*0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b=\u00108\u001as\u0010-\u001a\b\u0012\u0004\u0012\u0002H.0\u0004\"\u0004\b\u0000\u0010.\"\b\b\u0001\u0010/*\u0002002\u0006\u0010\u0005\u001a\u0002H.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u0002H/022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H.0\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u0001H.2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010>\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?²\u0006\u001e\u0010@\u001a\u0010\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020\r\u0018\u00010\f\"\u0004\b\u0000\u0010.X\u008a\u0084\u0002²\u0006\u0016\u0010A\u001a\b\u0012\u0004\u0012\u0002H.0\u0007\"\u0004\b\u0000\u0010.X\u008a\u0084\u0002"}, d2 = {"defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "", "animateFloatAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "visibilityThreshold", "label", "", "finishedListener", "Lkotlin/Function1;", "", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState", "Landroidx/compose/ui/unit/Dp;", "animateDpAsState-AjpBEmI", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "dpDefaultSpring", "animateSizeAsState", "Landroidx/compose/ui/geometry/Size;", "animateSizeAsState-YLp_XPw", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "sizeDefaultSpring", "animateOffsetAsState", "Landroidx/compose/ui/geometry/Offset;", "animateOffsetAsState-7362WCg", "offsetDefaultSpring", "animateRectAsState", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "rectDefaultSpring", "animateIntAsState", "", "(ILandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "intDefaultSpring", "animateIntOffsetAsState", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffsetAsState-HyPO7BM", "intOffsetDefaultSpring", "animateIntSizeAsState", "Landroidx/compose/ui/unit/IntSize;", "animateIntSizeAsState-4goxYXU", "intSizeDefaultSpring", "animateValueAsState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState-LjSzlW0", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateOffsetAsState-N6fFfp4", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState-8f6pmRE", "animateIntSizeAsState-zTRF_AQ", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "animSpec"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setHorizontalGravity {
    private static final setNavigationOnClickListener<Float> write = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
    private static final setNavigationOnClickListener<assignParameter> AudioAttributesCompatParcelizer = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.read(setInvalidated.write(assignParameter.INSTANCE)), 3, null);
    private static final setNavigationOnClickListener<calloc> MediaBrowserCompatCustomActionResultReceiver = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, calloc.read(setInvalidated.IconCompatParcelizer(calloc.INSTANCE)), 3, null);
    private static final setNavigationOnClickListener<getReferencedType> MediaBrowserCompatItemReceiver = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getReferencedType.read(setInvalidated.AudioAttributesCompatParcelizer(getReferencedType.INSTANCE)), 3, null);
    private static final setNavigationOnClickListener<WritableTypeIdInclusion> AudioAttributesImplApi21Parcelizer = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, setInvalidated.AudioAttributesCompatParcelizer(WritableTypeIdInclusion.INSTANCE), 3, null);
    private static final setNavigationOnClickListener<Integer> read = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Integer.valueOf(setInvalidated.AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda2.INSTANCE)), 3, null);
    private static final setNavigationOnClickListener<hasReferringProperties> IconCompatParcelizer = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, hasReferringProperties.write(setInvalidated.RemoteActionCompatParcelizer(hasReferringProperties.INSTANCE)), 3, null);
    private static final setNavigationOnClickListener<getKey> RemoteActionCompatParcelizer = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getKey.AudioAttributesCompatParcelizer(setInvalidated.RemoteActionCompatParcelizer(getKey.INSTANCE)), 3, null);

    public static final parseDouble<Float> read(float f, setOrientation<Float> setorientation, float f2, String str, getAnswerMap<? super Float, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        setNavigationOnClickListener setnavigationonclicklistener;
        setNavigationOnClickListener<Float> setnavigationonclicklistener2 = (i2 & 2) != 0 ? write : setorientation;
        float f3 = (i2 & 4) != 0 ? 0.01f : f2;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        getAnswerMap<? super Float, getShowPopup> getanswermap2 = (i2 & 16) != 0 ? null : getanswermap;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:67)");
        }
        if (setnavigationonclicklistener2 == write) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1144089983);
            boolean z = (((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f3)) || (i & RendererCapabilities.MODE_SUPPORT_MASK) == 256;
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Float.valueOf(f3), 3, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            setnavigationonclicklistener = (setNavigationOnClickListener) objOnPause;
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1144199909);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            setnavigationonclicklistener = setnavigationonclicklistener2;
        }
        int i3 = i << 3;
        parseDouble<Float> parsedoubleAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(Float.valueOf(f), hitCount.RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda1.INSTANCE), setnavigationonclicklistener, Float.valueOf(f3), str2, getanswermap2, _handleunrecognizedcharacterescape, (i & 14) | (i3 & 7168) | (57344 & i3) | (458752 & i3), 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedoubleAudioAttributesCompatParcelizer;
    }

    public static final parseDouble<assignParameter> IconCompatParcelizer(float f, setOrientation<assignParameter> setorientation, String str, getAnswerMap<? super assignParameter, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 2) != 0) {
            setorientation = AudioAttributesCompatParcelizer;
        }
        setOrientation<assignParameter> setorientation2 = setorientation;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            getanswermap = null;
        }
        getAnswerMap<? super assignParameter, getShowPopup> getanswermap2 = getanswermap;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:111)");
        }
        int i3 = i << 6;
        parseDouble<assignParameter> parsedoubleAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(assignParameter.read(f), hitCount.write(assignParameter.INSTANCE), setorientation2, null, str2, getanswermap2, _handleunrecognizedcharacterescape, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedoubleAudioAttributesCompatParcelizer;
    }

    public static final parseDouble<Integer> read(int i, setOrientation<Integer> setorientation, String str, getAnswerMap<? super Integer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2, int i3) {
        if ((i3 & 2) != 0) {
            setorientation = read;
        }
        setOrientation<Integer> setorientation2 = setorientation;
        if ((i3 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            getanswermap = null;
        }
        getAnswerMap<? super Integer, getShowPopup> getanswermap2 = getanswermap;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(428074472, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:270)");
        }
        int i4 = i2 << 6;
        parseDouble<Integer> parsedoubleAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(Integer.valueOf(i), hitCount.read(MagicModuleRepositoryImplExternalSyntheticLambda2.INSTANCE), setorientation2, null, str2, getanswermap2, _handleunrecognizedcharacterescape, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedoubleAudioAttributesCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        Object AudioAttributesCompatParcelizer;
        private /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        final /* synthetic */ parseDouble<setOrientation<T>> IconCompatParcelizer;
        final /* synthetic */ LinearLayoutCompat<T, V> RemoteActionCompatParcelizer;
        final /* synthetic */ fromCursor<T> read;
        final /* synthetic */ parseDouble<getAnswerMap<T, getShowPopup>> write;

        /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:12:0x003d). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r11.AudioAttributesImplBaseParcelizer
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r11.AudioAttributesCompatParcelizer
                o.getFirstName r1 = (kotlin.getFirstName) r1
                java.lang.Object r3 = r11.AudioAttributesImplApi21Parcelizer
                o.TopUserCompanion r3 = (kotlin.TopUserCompanion) r3
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                goto L3d
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1f:
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                java.lang.Object r12 = r11.AudioAttributesImplApi21Parcelizer
                o.TopUserCompanion r12 = (kotlin.TopUserCompanion) r12
                o.fromCursor<T> r1 = r11.read
                o.getFirstName r1 = r1.AudioAttributesImplApi21Parcelizer()
                r3 = r12
            L2d:
                r12 = r11
                o.SampleVideos r12 = (kotlin.SampleVideos) r12
                r11.AudioAttributesImplApi21Parcelizer = r3
                r11.AudioAttributesCompatParcelizer = r1
                r11.AudioAttributesImplBaseParcelizer = r2
                java.lang.Object r12 = r1.AudioAttributesCompatParcelizer(r12)
                if (r12 != r0) goto L3d
                return r0
            L3d:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L6d
                java.lang.Object r12 = r1.AudioAttributesCompatParcelizer()
                o.fromCursor<T> r4 = r11.read
                java.lang.Object r4 = r4.AudioAttributesImplBaseParcelizer()
                java.lang.Object r4 = kotlin.getNameArray.AudioAttributesCompatParcelizer(r4)
                if (r4 == 0) goto L57
                r6 = r4
                goto L58
            L57:
                r6 = r12
            L58:
                o.setHorizontalGravity$write$1 r12 = new o.setHorizontalGravity$write$1
                o.LinearLayoutCompat<T, V> r7 = r11.RemoteActionCompatParcelizer
                o.parseDouble<o.setOrientation<T>> r8 = r11.IconCompatParcelizer
                o.parseDouble<o.getAnswerMap<T, o.getShowPopup>> r9 = r11.write
                r10 = 0
                r5 = r12
                r5.<init>(r6, r7, r8, r9, r10)
                o.MagicModuleSubmissionRequestBody r12 = (kotlin.MagicModuleSubmissionRequestBody) r12
                r4 = 3
                r5 = 0
                kotlin.setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(r3, r5, r5, r12, r4)
                goto L2d
            L6d:
                o.getShowPopup r11 = kotlin.getShowPopup.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setHorizontalGravity.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.setHorizontalGravity$write$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ parseDouble<setOrientation<T>> AudioAttributesCompatParcelizer;
            final /* synthetic */ parseDouble<getAnswerMap<T, getShowPopup>> IconCompatParcelizer;
            final /* synthetic */ LinearLayoutCompat<T, V> RemoteActionCompatParcelizer;
            int read;
            final /* synthetic */ T write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, this.RemoteActionCompatParcelizer.write())) {
                        this.read = 1;
                        if (LinearLayoutCompat.AudioAttributesCompatParcelizer$default(this.RemoteActionCompatParcelizer, this.write, setHorizontalGravity.write(this.AudioAttributesCompatParcelizer), null, null, this, 12, null) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    }
                    return getShowPopup.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                getAnswerMap getanswermapAudioAttributesCompatParcelizer = setHorizontalGravity.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
                if (getanswermapAudioAttributesCompatParcelizer != null) {
                    getanswermapAudioAttributesCompatParcelizer.invoke(this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(T t, LinearLayoutCompat<T, V> linearLayoutCompat, parseDouble<? extends setOrientation<T>> parsedouble, parseDouble<? extends getAnswerMap<? super T, getShowPopup>> parsedouble2, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.write = t;
                this.RemoteActionCompatParcelizer = linearLayoutCompat;
                this.AudioAttributesCompatParcelizer = parsedouble;
                this.IconCompatParcelizer = parsedouble2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(fromCursor<T> fromcursor, LinearLayoutCompat<T, V> linearLayoutCompat, parseDouble<? extends setOrientation<T>> parsedouble, parseDouble<? extends getAnswerMap<? super T, getShowPopup>> parsedouble2, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = fromcursor;
            this.RemoteActionCompatParcelizer = linearLayoutCompat;
            this.IconCompatParcelizer = parsedouble;
            this.write = parsedouble2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, sampleVideos);
            writeVar.AudioAttributesImplApi21Parcelizer = obj;
            return writeVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(fromCursor fromcursor, Object obj) {
        fromcursor.read(obj);
        return getShowPopup.INSTANCE;
    }

    public static final <T, V extends ScrollingTabContainerView> parseDouble<T> AudioAttributesCompatParcelizer(final T t, evictionCount<T, V> evictioncount, setOrientation<T> setorientation, T t2, String str, getAnswerMap<? super T, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        setNavigationOnClickListener setnavigationonclicklistenerWrite;
        if ((i2 & 4) != 0) {
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            setnavigationonclicklistenerWrite = (setNavigationOnClickListener) objOnPause;
        } else {
            setnavigationonclicklistenerWrite = setorientation;
        }
        T t3 = (i2 & 8) != 0 ? null : t2;
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        getAnswerMap<? super T, getShowPopup> getanswermap2 = (i2 & 32) != 0 ? null : getanswermap;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:395)");
        }
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        InputAccessor inputAccessor = (InputAccessor) objOnPause2;
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = new LinearLayoutCompat(t, evictioncount, t3, str2);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objOnPause3;
        parseDouble parsedouble = _qbuf.read(getanswermap2, _handleunrecognizedcharacterescape, (i >> 15) & 14);
        if (t3 != null && (setnavigationonclicklistenerWrite instanceof setNavigationOnClickListener)) {
            setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) setnavigationonclicklistenerWrite;
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setnavigationonclicklistener.IconCompatParcelizer(), t3)) {
                setnavigationonclicklistenerWrite = setVerticalGravity.write(setnavigationonclicklistener.getWrite(), setnavigationonclicklistener.getRemoteActionCompatParcelizer(), t3);
            }
        }
        parseDouble parsedouble2 = _qbuf.read(setnavigationonclicklistenerWrite, _handleunrecognizedcharacterescape, 0);
        Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause4 = getLastName.read(-1, null, 6);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
        }
        final fromCursor fromcursor = (fromCursor) objOnPause4;
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(fromcursor);
        boolean z = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.IconCompatParcelizer(t)) || (i & 6) == 4;
        Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
        if ((z | zIconCompatParcelizer) || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause5 = new getCreatedOnDateMs() { // from class: o.setDividerDrawable
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setHorizontalGravity.read(fromcursor, t);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
        }
        StreamReadException.write((getCreatedOnDateMs) objOnPause5, _handleunrecognizedcharacterescape, 0);
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(fromcursor);
        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(linearLayoutCompat);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(parsedouble2);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(parsedouble);
        Object objOnPause6 = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer2 | zIconCompatParcelizer3 | zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause6 = (MagicModuleSubmissionRequestBody) new write(fromcursor, linearLayoutCompat, parsedouble2, parsedouble, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause6);
        }
        StreamReadException.IconCompatParcelizer(fromcursor, (MagicModuleSubmissionRequestBody) objOnPause6, _handleunrecognizedcharacterescape, 0);
        parseDouble<T> parsedouble3 = (parseDouble) inputAccessor.getRemoteActionCompatParcelizer();
        if (parsedouble3 == null) {
            parsedouble3 = linearLayoutCompat.read();
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedouble3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> getAnswerMap<T, getShowPopup> AudioAttributesCompatParcelizer(parseDouble<? extends getAnswerMap<? super T, getShowPopup>> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> setOrientation<T> write(parseDouble<? extends setOrientation<T>> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }
}
