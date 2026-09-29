package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;
import kotlin.setLayoutInflater;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\u0004\u001a\"\u0010\u0005\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\bH\u0007\u001a\"\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\bH\u0007\u001a;\u0010\f\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\r0\u000fH\u0007\u001a;\u0010\u0014\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\r0\u000fH\u0007\u001a3\u0010\u0016\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010 \u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020!0\u00072\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&\u001a3\u0010'\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020!0\u00072\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0004\b)\u0010*\u001aQ\u0010+\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u0010/\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00100\u000fH\u0007\u001aQ\u00100\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00100\u000fH\u0007\u001aQ\u00103\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010,\u001a\u0002042\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002060\u000fH\u0007\u001aQ\u00108\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010,\u001a\u0002092\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u0010:\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002060\u000fH\u0007\u001aQ\u0010<\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u00101\u001a\u0002042\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u0010=\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002060\u000fH\u0007\u001aQ\u0010>\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u00101\u001a\u0002092\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u0010?\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002060\u000fH\u0007\u001a=\u0010@\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072#\b\u0002\u0010A\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002060\u000fH\u0007\u001a=\u0010B\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072#\b\u0002\u0010C\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002060\u000fH\u0007\u001a=\u0010D\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072#\b\u0002\u0010E\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002060\u000fH\u0007\u001a=\u0010F\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072#\b\u0002\u0010G\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002060\u000fH\u0007\u001a\f\u0010H\u001a\u00020-*\u000204H\u0002\u001a\f\u0010H\u001a\u00020-*\u000209H\u0002\u001a,\u0010I\u001a\u0004\u0018\u0001HJ\"\b\b\u0000\u0010J*\u00020\u0003*\u00020\u00012\f\u0010K\u001a\b\u0012\u0004\u0012\u0002HJ0LH\u0080\u0002¢\u0006\u0002\u0010M\u001a,\u0010I\u001a\u0004\u0018\u0001HJ\"\b\b\u0000\u0010J*\u00020\u0003*\u00020\u00042\f\u0010K\u001a\b\u0012\u0004\u0012\u0002HJ0LH\u0080\u0002¢\u0006\u0002\u0010N\u001a?\u0010O\u001a\u00020P*\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u00042\u000e\b\u0002\u0010U\u001a\b\u0012\u0004\u0012\u00020$0V2\u0006\u0010W\u001a\u00020XH\u0001¢\u0006\u0002\u0010Y\u001a\u001f\u0010Z\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010[\u001a\u001f\u0010\\\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010T\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010]\u001a/\u0010^\u001a\u00020_*\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u00042\u0006\u0010W\u001a\u00020XH\u0003¢\u0006\u0002\u0010`\"\u001a\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020c0bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010d\u001a\b\u0012\u0004\u0012\u00020\b0eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020!0eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00100eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006i²\u0006\n\u0010j\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010k\u001a\u00020\u0004X\u008a\u008e\u0002"}, d2 = {"withEffect", "Landroidx/compose/animation/EnterTransition;", "effect", "Landroidx/compose/animation/TransitionEffect;", "Landroidx/compose/animation/ExitTransition;", "fadeIn", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "initialAlpha", "fadeOut", "targetAlpha", "slideIn", "Landroidx/compose/ui/unit/IntOffset;", "initialOffset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "fullSize", "slideOut", "targetOffset", "scaleIn", "initialScale", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleOut", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "unveilIn", "Landroidx/compose/ui/graphics/Color;", "initialColor", "matchParentSize", "", "unveilIn-bw27NRU", "(Landroidx/compose/animation/core/FiniteAnimationSpec;JZ)Landroidx/compose/animation/EnterTransition;", "veilOut", "targetColor", "veilOut-bw27NRU", "(Landroidx/compose/animation/core/FiniteAnimationSpec;JZ)Landroidx/compose/animation/ExitTransition;", "expandIn", "expandFrom", "Landroidx/compose/ui/Alignment;", "clip", "initialSize", "shrinkOut", "shrinkTowards", "targetSize", "expandHorizontally", "Landroidx/compose/ui/Alignment$Horizontal;", "initialWidth", "", "fullWidth", "expandVertically", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "fullHeight", "shrinkHorizontally", "targetWidth", "shrinkVertically", "targetHeight", "slideInHorizontally", "initialOffsetX", "slideInVertically", "initialOffsetY", "slideOutHorizontally", "targetOffsetX", "slideOutVertically", "targetOffsetY", "toAlignment", "get", "T", "key", "Landroidx/compose/animation/TransitionEffectKey;", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "(Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "createModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "isEnabled", "Lkotlin/Function0;", "label", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "trackActiveEnter", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "trackActiveExit", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "createGraphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationVector2D;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "DefaultColorAnimationSpec", "DefaultOffsetAnimationSpec", "DefaultSizeAnimationSpec", "animation", "activeEnter", "activeExit"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AppCompatRatingBar {
    private static final evictionCount<findCreatorAnnotation, MenuPopupWindowMenuDropDownListView> RemoteActionCompatParcelizer = hitCount.write(AnonymousClass1.write, AnonymousClass3.write);
    private static final setNavigationOnClickListener<Float> AudioAttributesCompatParcelizer = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
    private static final setNavigationOnClickListener<switchToNext> IconCompatParcelizer = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
    private static final setNavigationOnClickListener<hasReferringProperties> write = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, hasReferringProperties.write(setInvalidated.RemoteActionCompatParcelizer(hasReferringProperties.INSTANCE)), 1, null);
    private static final setNavigationOnClickListener<getKey> read = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, getKey.AudioAttributesCompatParcelizer(setInvalidated.RemoteActionCompatParcelizer(getKey.INSTANCE)), 1, null);

    public static /* synthetic */ setDropDownVerticalOffset IconCompatParcelizer(SwitchCompat switchCompat, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return IconCompatParcelizer((SwitchCompat<Float>) switchCompat, f);
    }

    public static final setDropDownVerticalOffset IconCompatParcelizer(SwitchCompat<Float> switchCompat, float f) {
        return new setPrompt(new setSelector(new AppCompatSpinnerSavedState(f, switchCompat), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ setDropDownWidth write(SwitchCompat switchCompat, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return AudioAttributesCompatParcelizer((SwitchCompat<Float>) switchCompat, f);
    }

    public static final setDropDownWidth AudioAttributesCompatParcelizer(SwitchCompat<Float> switchCompat, float f) {
        return new setFirstBaselineToTopHeight(new setSelector(new AppCompatSpinnerSavedState(f, switchCompat), null, null, null, null, false, null, 126, null));
    }

    public static final setDropDownVerticalOffset IconCompatParcelizer(SwitchCompat<hasReferringProperties> switchCompat, getAnswerMap<? super getKey, hasReferringProperties> getanswermap) {
        return new setPrompt(new setSelector(null, new AppCompatToggleButton(getanswermap, switchCompat), null, null, null, false, null, 125, null));
    }

    public static final setDropDownWidth read(SwitchCompat<hasReferringProperties> switchCompat, getAnswerMap<? super getKey, hasReferringProperties> getanswermap) {
        return new setFirstBaselineToTopHeight(new setSelector(null, new AppCompatToggleButton(getanswermap, switchCompat), null, null, null, false, null, 125, null));
    }

    public static /* synthetic */ setDropDownVerticalOffset write(SwitchCompat switchCompat, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return write(switchCompat, f, j);
    }

    public static final setDropDownVerticalOffset write(SwitchCompat<Float> switchCompat, float f, long j) {
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        return new setPrompt(new setSelector(null, null, null, new setLineHeight(f, j, switchCompat, magicModuleRepositoryImplExternalSyntheticLambda0), null, false, null, 119, magicModuleRepositoryImplExternalSyntheticLambda0));
    }

    public static /* synthetic */ setDropDownWidth IconCompatParcelizer(SwitchCompat switchCompat, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return IconCompatParcelizer(switchCompat, f, j);
    }

    public static final setDropDownWidth IconCompatParcelizer(SwitchCompat<Float> switchCompat, float f, long j) {
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        return new setFirstBaselineToTopHeight(new setSelector(null, null, null, new setLineHeight(f, j, switchCompat, magicModuleRepositoryImplExternalSyntheticLambda0), null, false, null, 119, magicModuleRepositoryImplExternalSyntheticLambda0));
    }

    public static /* synthetic */ setDropDownVerticalOffset RemoteActionCompatParcelizer(SwitchCompat switchCompat, _skipWSOrEnd _skipwsorend, boolean z, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, getKey.AudioAttributesCompatParcelizer(setInvalidated.RemoteActionCompatParcelizer(getKey.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            _skipwsorend = _skipWSOrEnd.INSTANCE.IconCompatParcelizer();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            getanswermap = AnonymousClass15.AudioAttributesCompatParcelizer;
        }
        return IconCompatParcelizer((SwitchCompat<getKey>) switchCompat, _skipwsorend, z, (getAnswerMap<? super getKey, getKey>) getanswermap);
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$15, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getKey;", "p0", "IconCompatParcelizer", "(J)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass15 extends MagicModuleUseCase implements getAnswerMap<getKey, getKey> {
        public static final AnonymousClass15 AudioAttributesCompatParcelizer = new AnonymousClass15();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getKey invoke(getKey getkey) {
            return getKey.AudioAttributesCompatParcelizer(IconCompatParcelizer(getkey.getRemoteActionCompatParcelizer()));
        }

        public final long IconCompatParcelizer(long j) {
            return getKey.read(0L);
        }

        AnonymousClass15() {
            super(1);
        }
    }

    public static final setDropDownVerticalOffset IconCompatParcelizer(SwitchCompat<getKey> switchCompat, _skipWSOrEnd _skipwsorend, boolean z, getAnswerMap<? super getKey, getKey> getanswermap) {
        return new setPrompt(new setSelector(null, null, new AppCompatImageView(_skipwsorend, getanswermap, switchCompat, z), null, null, false, null, 123, null));
    }

    public static /* synthetic */ setDropDownWidth write(SwitchCompat switchCompat, _skipWSOrEnd _skipwsorend, boolean z, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, getKey.AudioAttributesCompatParcelizer(setInvalidated.RemoteActionCompatParcelizer(getKey.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            _skipwsorend = _skipWSOrEnd.INSTANCE.IconCompatParcelizer();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            getanswermap = AnonymousClass17.write;
        }
        return read(switchCompat, _skipwsorend, z, getanswermap);
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$17, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getKey;", "p0", "RemoteActionCompatParcelizer", "(J)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass17 extends MagicModuleUseCase implements getAnswerMap<getKey, getKey> {
        public static final AnonymousClass17 write = new AnonymousClass17();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getKey invoke(getKey getkey) {
            return getKey.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(getkey.getRemoteActionCompatParcelizer()));
        }

        public final long RemoteActionCompatParcelizer(long j) {
            return getKey.read(0L);
        }

        AnonymousClass17() {
            super(1);
        }
    }

    public static final setDropDownWidth read(SwitchCompat<getKey> switchCompat, _skipWSOrEnd _skipwsorend, boolean z, getAnswerMap<? super getKey, getKey> getanswermap) {
        return new setFirstBaselineToTopHeight(new setSelector(null, null, new AppCompatImageView(_skipwsorend, getanswermap, switchCompat, z), null, null, false, null, 123, null));
    }

    public static /* synthetic */ setDropDownVerticalOffset IconCompatParcelizer(SwitchCompat switchCompat, _skipWSOrEnd.write writeVar, boolean z, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, getKey.AudioAttributesCompatParcelizer(setInvalidated.RemoteActionCompatParcelizer(getKey.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            writeVar = _skipWSOrEnd.INSTANCE.AudioAttributesImplBaseParcelizer();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            getanswermap = AnonymousClass11.write;
        }
        return RemoteActionCompatParcelizer(switchCompat, writeVar, z, getanswermap);
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$11, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "write", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass11 extends MagicModuleUseCase implements getAnswerMap<Integer, Integer> {
        public static final AnonymousClass11 write = new AnonymousClass11();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Integer invoke(Integer num) {
            return write(num.intValue());
        }

        public final Integer write(int i) {
            return 0;
        }

        AnonymousClass11() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$13, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getKey;", "p0", "write", "(J)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass13 extends MagicModuleUseCase implements getAnswerMap<getKey, getKey> {
        final /* synthetic */ getAnswerMap<Integer, Integer> $AudioAttributesCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getKey invoke(getKey getkey) {
            return getKey.AudioAttributesCompatParcelizer(write(getkey.getRemoteActionCompatParcelizer()));
        }

        public final long write(long j) {
            long j2 = -1;
            return getKey.read((((long) ((int) j)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) this.$AudioAttributesCompatParcelizer.invoke(Integer.valueOf((int) (j >> 32))).intValue()) << 32));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass13(getAnswerMap<? super Integer, Integer> getanswermap) {
            super(1);
            this.$AudioAttributesCompatParcelizer = getanswermap;
        }
    }

    public static final setDropDownVerticalOffset RemoteActionCompatParcelizer(SwitchCompat<getKey> switchCompat, _skipWSOrEnd.write writeVar, boolean z, getAnswerMap<? super Integer, Integer> getanswermap) {
        return IconCompatParcelizer(switchCompat, write(writeVar), z, new AnonymousClass13(getanswermap));
    }

    public static /* synthetic */ setDropDownVerticalOffset RemoteActionCompatParcelizer(SwitchCompat switchCompat, _skipWSOrEnd.read readVar, boolean z, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, getKey.AudioAttributesCompatParcelizer(setInvalidated.RemoteActionCompatParcelizer(getKey.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            readVar = _skipWSOrEnd.INSTANCE.write();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            getanswermap = AnonymousClass12.AudioAttributesCompatParcelizer;
        }
        return AudioAttributesCompatParcelizer((SwitchCompat<getKey>) switchCompat, readVar, z, (getAnswerMap<? super Integer, Integer>) getanswermap);
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$12, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "IconCompatParcelizer", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass12 extends MagicModuleUseCase implements getAnswerMap<Integer, Integer> {
        public static final AnonymousClass12 AudioAttributesCompatParcelizer = new AnonymousClass12();

        public final Integer IconCompatParcelizer(int i) {
            return 0;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Integer invoke(Integer num) {
            return IconCompatParcelizer(num.intValue());
        }

        AnonymousClass12() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$20, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getKey;", "p0", "write", "(J)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass20 extends MagicModuleUseCase implements getAnswerMap<getKey, getKey> {
        final /* synthetic */ getAnswerMap<Integer, Integer> $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getKey invoke(getKey getkey) {
            return getKey.AudioAttributesCompatParcelizer(write(getkey.getRemoteActionCompatParcelizer()));
        }

        public final long write(long j) {
            long j2 = -1;
            return getKey.read((((long) ((int) (j >> 32))) << 32) | (((long) this.$read.invoke(Integer.valueOf((int) j)).intValue()) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass20(getAnswerMap<? super Integer, Integer> getanswermap) {
            super(1);
            this.$read = getanswermap;
        }
    }

    public static final setDropDownVerticalOffset AudioAttributesCompatParcelizer(SwitchCompat<getKey> switchCompat, _skipWSOrEnd.read readVar, boolean z, getAnswerMap<? super Integer, Integer> getanswermap) {
        return IconCompatParcelizer(switchCompat, read(readVar), z, new AnonymousClass20(getanswermap));
    }

    public static /* synthetic */ setDropDownWidth write(SwitchCompat switchCompat, _skipWSOrEnd.write writeVar, boolean z, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, getKey.AudioAttributesCompatParcelizer(setInvalidated.RemoteActionCompatParcelizer(getKey.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            writeVar = _skipWSOrEnd.INSTANCE.AudioAttributesImplBaseParcelizer();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            getanswermap = AnonymousClass16.AudioAttributesCompatParcelizer;
        }
        return write((SwitchCompat<getKey>) switchCompat, writeVar, z, (getAnswerMap<? super Integer, Integer>) getanswermap);
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$16, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "IconCompatParcelizer", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass16 extends MagicModuleUseCase implements getAnswerMap<Integer, Integer> {
        public static final AnonymousClass16 AudioAttributesCompatParcelizer = new AnonymousClass16();

        public final Integer IconCompatParcelizer(int i) {
            return 0;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Integer invoke(Integer num) {
            return IconCompatParcelizer(num.intValue());
        }

        AnonymousClass16() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$18, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getKey;", "p0", "read", "(J)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass18 extends MagicModuleUseCase implements getAnswerMap<getKey, getKey> {
        final /* synthetic */ getAnswerMap<Integer, Integer> $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getKey invoke(getKey getkey) {
            return getKey.AudioAttributesCompatParcelizer(read(getkey.getRemoteActionCompatParcelizer()));
        }

        public final long read(long j) {
            long j2 = -1;
            return getKey.read((((long) ((int) j)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) this.$RemoteActionCompatParcelizer.invoke(Integer.valueOf((int) (j >> 32))).intValue()) << 32));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass18(getAnswerMap<? super Integer, Integer> getanswermap) {
            super(1);
            this.$RemoteActionCompatParcelizer = getanswermap;
        }
    }

    public static final setDropDownWidth write(SwitchCompat<getKey> switchCompat, _skipWSOrEnd.write writeVar, boolean z, getAnswerMap<? super Integer, Integer> getanswermap) {
        return read(switchCompat, write(writeVar), z, new AnonymousClass18(getanswermap));
    }

    public static /* synthetic */ setDropDownWidth AudioAttributesCompatParcelizer(SwitchCompat switchCompat, _skipWSOrEnd.read readVar, boolean z, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, getKey.AudioAttributesCompatParcelizer(setInvalidated.RemoteActionCompatParcelizer(getKey.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            readVar = _skipWSOrEnd.INSTANCE.write();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            getanswermap = AnonymousClass19.write;
        }
        return write((SwitchCompat<getKey>) switchCompat, readVar, z, (getAnswerMap<? super Integer, Integer>) getanswermap);
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$19, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "IconCompatParcelizer", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass19 extends MagicModuleUseCase implements getAnswerMap<Integer, Integer> {
        public static final AnonymousClass19 write = new AnonymousClass19();

        public final Integer IconCompatParcelizer(int i) {
            return 0;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Integer invoke(Integer num) {
            return IconCompatParcelizer(num.intValue());
        }

        AnonymousClass19() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$22, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getKey;", "p0", "RemoteActionCompatParcelizer", "(J)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass22 extends MagicModuleUseCase implements getAnswerMap<getKey, getKey> {
        final /* synthetic */ getAnswerMap<Integer, Integer> $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getKey invoke(getKey getkey) {
            return getKey.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(getkey.getRemoteActionCompatParcelizer()));
        }

        public final long RemoteActionCompatParcelizer(long j) {
            long j2 = -1;
            return getKey.read((((long) ((int) (j >> 32))) << 32) | (((long) this.$read.invoke(Integer.valueOf((int) j)).intValue()) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass22(getAnswerMap<? super Integer, Integer> getanswermap) {
            super(1);
            this.$read = getanswermap;
        }
    }

    public static final setDropDownWidth write(SwitchCompat<getKey> switchCompat, _skipWSOrEnd.read readVar, boolean z, getAnswerMap<? super Integer, Integer> getanswermap) {
        return read(switchCompat, read(readVar), z, new AnonymousClass22(getanswermap));
    }

    public static /* synthetic */ setDropDownVerticalOffset write(SwitchCompat switchCompat, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, hasReferringProperties.write(setInvalidated.RemoteActionCompatParcelizer(hasReferringProperties.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            getanswermap = AnonymousClass23.read;
        }
        return write(switchCompat, getanswermap);
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$23, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "RemoteActionCompatParcelizer", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass23 extends MagicModuleUseCase implements getAnswerMap<Integer, Integer> {
        public static final AnonymousClass23 read = new AnonymousClass23();

        public final Integer RemoteActionCompatParcelizer(int i) {
            return Integer.valueOf((-i) / 2);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Integer invoke(Integer num) {
            return RemoteActionCompatParcelizer(num.intValue());
        }

        AnonymousClass23() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$21, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getKey;", "p0", "Lo/hasReferringProperties;", "write", "(J)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass21 extends MagicModuleUseCase implements getAnswerMap<getKey, hasReferringProperties> {
        final /* synthetic */ getAnswerMap<Integer, Integer> $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ hasReferringProperties invoke(getKey getkey) {
            return hasReferringProperties.write(write(getkey.getRemoteActionCompatParcelizer()));
        }

        public final long write(long j) {
            long j2 = -1;
            return hasReferringProperties.read(((long) this.$read.invoke(Integer.valueOf((int) j)).intValue()) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass21(getAnswerMap<? super Integer, Integer> getanswermap) {
            super(1);
            this.$read = getanswermap;
        }
    }

    public static final setDropDownVerticalOffset write(SwitchCompat<hasReferringProperties> switchCompat, getAnswerMap<? super Integer, Integer> getanswermap) {
        return IconCompatParcelizer(switchCompat, new AnonymousClass21(getanswermap));
    }

    public static /* synthetic */ setDropDownWidth AudioAttributesCompatParcelizer(SwitchCompat switchCompat, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, hasReferringProperties.write(setInvalidated.RemoteActionCompatParcelizer(hasReferringProperties.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            getanswermap = AnonymousClass25.write;
        }
        return AudioAttributesCompatParcelizer((SwitchCompat<hasReferringProperties>) switchCompat, (getAnswerMap<? super Integer, Integer>) getanswermap);
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$25, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "AudioAttributesCompatParcelizer", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass25 extends MagicModuleUseCase implements getAnswerMap<Integer, Integer> {
        public static final AnonymousClass25 write = new AnonymousClass25();

        public final Integer AudioAttributesCompatParcelizer(int i) {
            return Integer.valueOf((-i) / 2);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Integer invoke(Integer num) {
            return AudioAttributesCompatParcelizer(num.intValue());
        }

        AnonymousClass25() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$24, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getKey;", "p0", "Lo/hasReferringProperties;", "RemoteActionCompatParcelizer", "(J)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass24 extends MagicModuleUseCase implements getAnswerMap<getKey, hasReferringProperties> {
        final /* synthetic */ getAnswerMap<Integer, Integer> $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ hasReferringProperties invoke(getKey getkey) {
            return hasReferringProperties.write(RemoteActionCompatParcelizer(getkey.getRemoteActionCompatParcelizer()));
        }

        public final long RemoteActionCompatParcelizer(long j) {
            long j2 = -1;
            return hasReferringProperties.read(((long) this.$read.invoke(Integer.valueOf((int) j)).intValue()) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass24(getAnswerMap<? super Integer, Integer> getanswermap) {
            super(1);
            this.$read = getanswermap;
        }
    }

    public static final setDropDownWidth AudioAttributesCompatParcelizer(SwitchCompat<hasReferringProperties> switchCompat, getAnswerMap<? super Integer, Integer> getanswermap) {
        return read(switchCompat, new AnonymousClass24(getanswermap));
    }

    private static final _skipWSOrEnd write(_skipWSOrEnd.write writeVar) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar, _skipWSOrEnd.INSTANCE.RatingCompat()) ? _skipWSOrEnd.INSTANCE.MediaBrowserCompatItemReceiver() : toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar, _skipWSOrEnd.INSTANCE.AudioAttributesImplBaseParcelizer()) ? _skipWSOrEnd.INSTANCE.AudioAttributesImplApi26Parcelizer() : _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer();
    }

    private static final _skipWSOrEnd read(_skipWSOrEnd.read readVar) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readVar, _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem()) ? _skipWSOrEnd.INSTANCE.MediaDescriptionCompat() : toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readVar, _skipWSOrEnd.INSTANCE.write()) ? _skipWSOrEnd.INSTANCE.AudioAttributesCompatParcelizer() : _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
        public static final AnonymousClass9 RemoteActionCompatParcelizer = new AnonymousClass9();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }

        AnonymousClass9() {
            super(0);
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$14, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/validateAppend;", "", "RemoteActionCompatParcelizer", "(Lo/validateAppend;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass14 extends MagicModuleUseCase implements getAnswerMap<validateAppend, getShowPopup> {
        final /* synthetic */ getCreatedOnDateMs<Boolean> $RemoteActionCompatParcelizer;
        final /* synthetic */ boolean $write;

        public final void RemoteActionCompatParcelizer(validateAppend validateappend) {
            validateappend.IconCompatParcelizer(!this.$write && this.$RemoteActionCompatParcelizer.invoke().booleanValue());
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(validateAppend validateappend) {
            RemoteActionCompatParcelizer(validateappend);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass14(boolean z, getCreatedOnDateMs<Boolean> getcreatedondatems) {
            super(1);
            this.$write = z;
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    public static final setDropDownVerticalOffset IconCompatParcelizer(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater, setDropDownVerticalOffset setdropdownverticaloffset, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(21614502, i, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:1004)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setlayoutinflater)) || (i & 6) == 4;
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = available.RemoteActionCompatParcelizer$default(setdropdownverticaloffset, null, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        InputAccessor inputAccessor = (InputAccessor) objOnPause;
        if (setlayoutinflater.RemoteActionCompatParcelizer() == setlayoutinflater.AudioAttributesImplApi26Parcelizer() && setlayoutinflater.RemoteActionCompatParcelizer() == setDropDownHorizontalOffset.IconCompatParcelizer) {
            if (setlayoutinflater.MediaMetadataCompat()) {
                AudioAttributesCompatParcelizer((InputAccessor<setDropDownVerticalOffset>) inputAccessor, setdropdownverticaloffset);
            } else {
                AudioAttributesCompatParcelizer((InputAccessor<setDropDownVerticalOffset>) inputAccessor, setDropDownVerticalOffset.INSTANCE.AudioAttributesCompatParcelizer());
            }
        } else if (setlayoutinflater.AudioAttributesImplApi26Parcelizer() == setDropDownHorizontalOffset.IconCompatParcelizer) {
            AudioAttributesCompatParcelizer((InputAccessor<setDropDownVerticalOffset>) inputAccessor, write((InputAccessor<setDropDownVerticalOffset>) inputAccessor).RemoteActionCompatParcelizer(setdropdownverticaloffset));
        }
        setDropDownVerticalOffset setdropdownverticaloffsetWrite = write((InputAccessor<setDropDownVerticalOffset>) inputAccessor);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return setdropdownverticaloffsetWrite;
    }

    private static final setDropDownVerticalOffset write(InputAccessor<setDropDownVerticalOffset> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    public static final setDropDownWidth write(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater, setDropDownWidth setdropdownwidth, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1363864804, i, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:1024)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setlayoutinflater)) || (i & 6) == 4;
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = available.RemoteActionCompatParcelizer$default(setdropdownwidth, null, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        InputAccessor inputAccessor = (InputAccessor) objOnPause;
        if (setlayoutinflater.RemoteActionCompatParcelizer() == setlayoutinflater.AudioAttributesImplApi26Parcelizer() && setlayoutinflater.RemoteActionCompatParcelizer() == setDropDownHorizontalOffset.IconCompatParcelizer) {
            if (setlayoutinflater.MediaMetadataCompat()) {
                RemoteActionCompatParcelizer(inputAccessor, setdropdownwidth);
            } else {
                RemoteActionCompatParcelizer(inputAccessor, setDropDownWidth.INSTANCE.write());
            }
        } else if (setlayoutinflater.AudioAttributesImplApi26Parcelizer() != setDropDownHorizontalOffset.IconCompatParcelizer) {
            RemoteActionCompatParcelizer(inputAccessor, RemoteActionCompatParcelizer(inputAccessor).RemoteActionCompatParcelizer(setdropdownwidth));
        }
        setDropDownWidth setdropdownwidthRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(inputAccessor);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return setdropdownwidthRemoteActionCompatParcelizer;
    }

    private static final setDropDownWidth RemoteActionCompatParcelizer(InputAccessor<setDropDownWidth> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.setCompoundDrawablesRelativeWithIntrinsicBounds write(final kotlin.setLayoutInflater<kotlin.setDropDownHorizontalOffset> r20, final kotlin.setDropDownVerticalOffset r21, final kotlin.setDropDownWidth r22, java.lang.String r23, kotlin._handleUnrecognizedCharacterEscape r24, int r25) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AppCompatRatingBar.write(o.setLayoutInflater, o.setDropDownVerticalOffset, o.setDropDownWidth, java.lang.String, o._handleUnrecognizedCharacterEscape, int):o.setCompoundDrawablesRelativeWithIntrinsicBounds");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getAnswerMap IconCompatParcelizer(o.setLayoutInflater.IconCompatParcelizer r3, o.setLayoutInflater.IconCompatParcelizer r4, kotlin.setLayoutInflater r5, kotlin.setDropDownVerticalOffset r6, kotlin.setDropDownWidth r7, o.setLayoutInflater.IconCompatParcelizer r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L16
            o.AppCompatRatingBar$5 r1 = new o.AppCompatRatingBar$5
            r1.<init>(r6, r7)
            o.getAnswerMap r1 = (kotlin.getAnswerMap) r1
            o.AppCompatRatingBar$4 r2 = new o.AppCompatRatingBar$4
            r2.<init>(r6, r7)
            o.getAnswerMap r2 = (kotlin.getAnswerMap) r2
            o.parseDouble r3 = r3.AudioAttributesCompatParcelizer(r1, r2)
            goto L17
        L16:
            r3 = r0
        L17:
            if (r4 == 0) goto L2c
            o.AppCompatRatingBar$8 r1 = new o.AppCompatRatingBar$8
            r1.<init>(r6, r7)
            o.getAnswerMap r1 = (kotlin.getAnswerMap) r1
            o.AppCompatRatingBar$6 r2 = new o.AppCompatRatingBar$6
            r2.<init>(r6, r7)
            o.getAnswerMap r2 = (kotlin.getAnswerMap) r2
            o.parseDouble r4 = r4.AudioAttributesCompatParcelizer(r1, r2)
            goto L2d
        L2c:
            r4 = r0
        L2d:
            java.lang.Object r5 = r5.RemoteActionCompatParcelizer()
            o.setDropDownHorizontalOffset r1 = kotlin.setDropDownHorizontalOffset.read
            if (r5 != r1) goto L53
            o.setSelector r5 = r6.getWrite()
            o.setLineHeight r5 = r5.getWrite()
            if (r5 == 0) goto L40
            goto L4a
        L40:
            o.setSelector r5 = r7.getAudioAttributesCompatParcelizer()
            o.setLineHeight r5 = r5.getWrite()
            if (r5 == 0) goto L68
        L4a:
            long r1 = r5.getAudioAttributesCompatParcelizer()
            o.findCreatorAnnotation r5 = kotlin.findCreatorAnnotation.RemoteActionCompatParcelizer(r1)
            goto L72
        L53:
            o.setSelector r5 = r7.getAudioAttributesCompatParcelizer()
            o.setLineHeight r5 = r5.getWrite()
            if (r5 == 0) goto L5e
            goto L6a
        L5e:
            o.setSelector r5 = r6.getWrite()
            o.setLineHeight r5 = r5.getWrite()
            if (r5 != 0) goto L6a
        L68:
            r5 = r0
            goto L72
        L6a:
            long r1 = r5.getAudioAttributesCompatParcelizer()
            o.findCreatorAnnotation r5 = kotlin.findCreatorAnnotation.RemoteActionCompatParcelizer(r1)
        L72:
            if (r8 == 0) goto L83
            o.AppCompatRatingBar$10 r0 = kotlin.AppCompatRatingBar.AnonymousClass10.AudioAttributesCompatParcelizer
            o.getAnswerMap r0 = (kotlin.getAnswerMap) r0
            o.AppCompatRatingBar$7 r1 = new o.AppCompatRatingBar$7
            r1.<init>(r5, r6, r7)
            o.getAnswerMap r1 = (kotlin.getAnswerMap) r1
            o.parseDouble r0 = r8.AudioAttributesCompatParcelizer(r0, r1)
        L83:
            o.AppCompatRatingBar$2 r5 = new o.AppCompatRatingBar$2
            r5.<init>(r3, r4, r0)
            o.getAnswerMap r5 = (kotlin.getAnswerMap) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AppCompatRatingBar.IconCompatParcelizer(o.setLayoutInflater$IconCompatParcelizer, o.setLayoutInflater$IconCompatParcelizer, o.setLayoutInflater, o.setDropDownVerticalOffset, o.setDropDownWidth, o.setLayoutInflater$IconCompatParcelizer):o.getAnswerMap");
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setLayoutInflater$write;", "Lo/setDropDownHorizontalOffset;", "Lo/SwitchCompat;", "", "read", "(Lo/setLayoutInflater$write;)Lo/SwitchCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<setLayoutInflater.write<setDropDownHorizontalOffset>, SwitchCompat<Float>> {
        final /* synthetic */ setDropDownWidth $AudioAttributesCompatParcelizer;
        final /* synthetic */ setDropDownVerticalOffset $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final SwitchCompat<Float> invoke(setLayoutInflater.write<setDropDownHorizontalOffset> writeVar) {
            SwitchCompat<Float> switchCompatWrite;
            SwitchCompat<Float> switchCompatWrite2;
            if (writeVar.IconCompatParcelizer(setDropDownHorizontalOffset.read, setDropDownHorizontalOffset.IconCompatParcelizer)) {
                AppCompatSpinnerSavedState appCompatSpinnerSavedStateWrite = this.$IconCompatParcelizer.getWrite().getRemoteActionCompatParcelizer();
                return (appCompatSpinnerSavedStateWrite == null || (switchCompatWrite2 = appCompatSpinnerSavedStateWrite.write()) == null) ? AppCompatRatingBar.AudioAttributesCompatParcelizer : switchCompatWrite2;
            }
            if (!writeVar.IconCompatParcelizer(setDropDownHorizontalOffset.IconCompatParcelizer, setDropDownHorizontalOffset.write)) {
                return AppCompatRatingBar.AudioAttributesCompatParcelizer;
            }
            AppCompatSpinnerSavedState appCompatSpinnerSavedStateWrite2 = this.$AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer();
            return (appCompatSpinnerSavedStateWrite2 == null || (switchCompatWrite = appCompatSpinnerSavedStateWrite2.write()) == null) ? AppCompatRatingBar.AudioAttributesCompatParcelizer : switchCompatWrite;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth) {
            super(1);
            this.$IconCompatParcelizer = setdropdownverticaloffset;
            this.$AudioAttributesCompatParcelizer = setdropdownwidth;
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setDropDownHorizontalOffset;", "p0", "", "read", "(Lo/setDropDownHorizontalOffset;)Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<setDropDownHorizontalOffset, Float> {
        final /* synthetic */ setDropDownVerticalOffset $AudioAttributesCompatParcelizer;
        final /* synthetic */ setDropDownWidth $write;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Float invoke(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            int i = AppCompatRatingBar$4$write$WhenMappings.read[setdropdownhorizontaloffset.ordinal()];
            float f = 1.0f;
            if (i != 1) {
                if (i == 2) {
                    AppCompatSpinnerSavedState appCompatSpinnerSavedStateWrite = this.$AudioAttributesCompatParcelizer.getWrite().getRemoteActionCompatParcelizer();
                    if (appCompatSpinnerSavedStateWrite != null) {
                        f = appCompatSpinnerSavedStateWrite.getIconCompatParcelizer();
                    }
                } else {
                    if (i != 3) {
                        throw new RenewEligibleCreator();
                    }
                    AppCompatSpinnerSavedState appCompatSpinnerSavedStateWrite2 = this.$write.getAudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer();
                    if (appCompatSpinnerSavedStateWrite2 != null) {
                        f = appCompatSpinnerSavedStateWrite2.getIconCompatParcelizer();
                    }
                }
            }
            return Float.valueOf(f);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth) {
            super(1);
            this.$AudioAttributesCompatParcelizer = setdropdownverticaloffset;
            this.$write = setdropdownwidth;
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setLayoutInflater$write;", "Lo/setDropDownHorizontalOffset;", "Lo/SwitchCompat;", "", "IconCompatParcelizer", "(Lo/setLayoutInflater$write;)Lo/SwitchCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass8 extends MagicModuleUseCase implements getAnswerMap<setLayoutInflater.write<setDropDownHorizontalOffset>, SwitchCompat<Float>> {
        final /* synthetic */ setDropDownVerticalOffset $AudioAttributesCompatParcelizer;
        final /* synthetic */ setDropDownWidth $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final SwitchCompat<Float> invoke(setLayoutInflater.write<setDropDownHorizontalOffset> writeVar) {
            SwitchCompat<Float> switchCompatRemoteActionCompatParcelizer;
            SwitchCompat<Float> switchCompatRemoteActionCompatParcelizer2;
            if (writeVar.IconCompatParcelizer(setDropDownHorizontalOffset.read, setDropDownHorizontalOffset.IconCompatParcelizer)) {
                setLineHeight setlineheightIconCompatParcelizer = this.$AudioAttributesCompatParcelizer.getWrite().getWrite();
                return (setlineheightIconCompatParcelizer == null || (switchCompatRemoteActionCompatParcelizer2 = setlineheightIconCompatParcelizer.RemoteActionCompatParcelizer()) == null) ? AppCompatRatingBar.AudioAttributesCompatParcelizer : switchCompatRemoteActionCompatParcelizer2;
            }
            if (!writeVar.IconCompatParcelizer(setDropDownHorizontalOffset.IconCompatParcelizer, setDropDownHorizontalOffset.write)) {
                return AppCompatRatingBar.AudioAttributesCompatParcelizer;
            }
            setLineHeight setlineheightIconCompatParcelizer2 = this.$IconCompatParcelizer.getAudioAttributesCompatParcelizer().getWrite();
            return (setlineheightIconCompatParcelizer2 == null || (switchCompatRemoteActionCompatParcelizer = setlineheightIconCompatParcelizer2.RemoteActionCompatParcelizer()) == null) ? AppCompatRatingBar.AudioAttributesCompatParcelizer : switchCompatRemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth) {
            super(1);
            this.$AudioAttributesCompatParcelizer = setdropdownverticaloffset;
            this.$IconCompatParcelizer = setdropdownwidth;
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setDropDownHorizontalOffset;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/setDropDownHorizontalOffset;)Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass6 extends MagicModuleUseCase implements getAnswerMap<setDropDownHorizontalOffset, Float> {
        final /* synthetic */ setDropDownWidth $AudioAttributesCompatParcelizer;
        final /* synthetic */ setDropDownVerticalOffset $write;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Float invoke(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            int i = AppCompatRatingBar$6$IconCompatParcelizer$WhenMappings.AudioAttributesCompatParcelizer[setdropdownhorizontaloffset.ordinal()];
            float fWrite = 1.0f;
            if (i != 1) {
                if (i == 2) {
                    setLineHeight setlineheightIconCompatParcelizer = this.$write.getWrite().getWrite();
                    if (setlineheightIconCompatParcelizer != null) {
                        fWrite = setlineheightIconCompatParcelizer.getWrite();
                    }
                } else {
                    if (i != 3) {
                        throw new RenewEligibleCreator();
                    }
                    setLineHeight setlineheightIconCompatParcelizer2 = this.$AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer().getWrite();
                    if (setlineheightIconCompatParcelizer2 != null) {
                        fWrite = setlineheightIconCompatParcelizer2.getWrite();
                    }
                }
            }
            return Float.valueOf(fWrite);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth) {
            super(1);
            this.$write = setdropdownverticaloffset;
            this.$AudioAttributesCompatParcelizer = setdropdownwidth;
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setLayoutInflater$write;", "Lo/setDropDownHorizontalOffset;", "Lo/SwitchCompat;", "Lo/findCreatorAnnotation;", "AudioAttributesCompatParcelizer", "(Lo/setLayoutInflater$write;)Lo/SwitchCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass10 extends MagicModuleUseCase implements getAnswerMap<setLayoutInflater.write<setDropDownHorizontalOffset>, SwitchCompat<findCreatorAnnotation>> {
        public static final AnonymousClass10 AudioAttributesCompatParcelizer = new AnonymousClass10();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final SwitchCompat<findCreatorAnnotation> invoke(setLayoutInflater.write<setDropDownHorizontalOffset> writeVar) {
            return setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }

        AnonymousClass10() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setDropDownHorizontalOffset;", "p0", "Lo/findCreatorAnnotation;", "RemoteActionCompatParcelizer", "(Lo/setDropDownHorizontalOffset;)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass7 extends MagicModuleUseCase implements getAnswerMap<setDropDownHorizontalOffset, findCreatorAnnotation> {
        final /* synthetic */ setDropDownWidth $AudioAttributesCompatParcelizer;
        final /* synthetic */ findCreatorAnnotation $read;
        final /* synthetic */ setDropDownVerticalOffset $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ findCreatorAnnotation invoke(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            return findCreatorAnnotation.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(setdropdownhorizontaloffset));
        }

        public final long RemoteActionCompatParcelizer(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            findCreatorAnnotation findcreatorannotationRemoteActionCompatParcelizer;
            long jAudioAttributesCompatParcelizer;
            long jAudioAttributesCompatParcelizer2;
            int i = AppCompatRatingBar$7$RemoteActionCompatParcelizer$WhenMappings.write[setdropdownhorizontaloffset.ordinal()];
            if (i == 1) {
                findcreatorannotationRemoteActionCompatParcelizer = this.$read;
            } else if (i == 2) {
                setLineHeight setlineheightIconCompatParcelizer = this.$write.getWrite().getWrite();
                if (setlineheightIconCompatParcelizer != null) {
                    jAudioAttributesCompatParcelizer = setlineheightIconCompatParcelizer.getAudioAttributesCompatParcelizer();
                } else {
                    setLineHeight setlineheightIconCompatParcelizer2 = this.$AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer().getWrite();
                    if (setlineheightIconCompatParcelizer2 != null) {
                        jAudioAttributesCompatParcelizer = setlineheightIconCompatParcelizer2.getAudioAttributesCompatParcelizer();
                    }
                    findcreatorannotationRemoteActionCompatParcelizer = null;
                }
                findcreatorannotationRemoteActionCompatParcelizer = findCreatorAnnotation.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer);
            } else {
                if (i != 3) {
                    throw new RenewEligibleCreator();
                }
                setLineHeight setlineheightIconCompatParcelizer3 = this.$AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer().getWrite();
                if (setlineheightIconCompatParcelizer3 != null) {
                    jAudioAttributesCompatParcelizer2 = setlineheightIconCompatParcelizer3.getAudioAttributesCompatParcelizer();
                } else {
                    setLineHeight setlineheightIconCompatParcelizer4 = this.$write.getWrite().getWrite();
                    if (setlineheightIconCompatParcelizer4 != null) {
                        jAudioAttributesCompatParcelizer2 = setlineheightIconCompatParcelizer4.getAudioAttributesCompatParcelizer();
                    }
                    findcreatorannotationRemoteActionCompatParcelizer = null;
                }
                findcreatorannotationRemoteActionCompatParcelizer = findCreatorAnnotation.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer2);
            }
            if (findcreatorannotationRemoteActionCompatParcelizer != null) {
                return findcreatorannotationRemoteActionCompatParcelizer.getRead();
            }
            return findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(findCreatorAnnotation findcreatorannotation, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth) {
            super(1);
            this.$read = findcreatorannotation;
            this.$write = setdropdownverticaloffset;
            this.$AudioAttributesCompatParcelizer = setdropdownwidth;
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/validateAppend;", "", "IconCompatParcelizer", "(Lo/validateAppend;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<validateAppend, getShowPopup> {
        final /* synthetic */ parseDouble<findCreatorAnnotation> $IconCompatParcelizer;
        final /* synthetic */ parseDouble<Float> $RemoteActionCompatParcelizer;
        final /* synthetic */ parseDouble<Float> $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(validateAppend validateappend) {
            IconCompatParcelizer(validateappend);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(validateAppend validateappend) {
            parseDouble<Float> parsedouble = this.$RemoteActionCompatParcelizer;
            validateappend.MediaBrowserCompatItemReceiver(parsedouble != null ? parsedouble.getRemoteActionCompatParcelizer().floatValue() : 1.0f);
            parseDouble<Float> parsedouble2 = this.$read;
            validateappend.MediaBrowserCompatSearchResultReceiver(parsedouble2 != null ? parsedouble2.getRemoteActionCompatParcelizer().floatValue() : 1.0f);
            parseDouble<Float> parsedouble3 = this.$read;
            validateappend.MediaDescriptionCompat(parsedouble3 != null ? parsedouble3.getRemoteActionCompatParcelizer().floatValue() : 1.0f);
            parseDouble<findCreatorAnnotation> parsedouble4 = this.$IconCompatParcelizer;
            validateappend.MediaBrowserCompatCustomActionResultReceiver(parsedouble4 != null ? parsedouble4.getRemoteActionCompatParcelizer().getRead() : findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(parseDouble<Float> parsedouble, parseDouble<Float> parsedouble2, parseDouble<findCreatorAnnotation> parsedouble3) {
            super(1);
            this.$RemoteActionCompatParcelizer = parsedouble;
            this.$read = parsedouble2;
            this.$IconCompatParcelizer = parsedouble3;
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/findCreatorAnnotation;", "p0", "Lo/MenuPopupWindowMenuDropDownListView;", "IconCompatParcelizer", "(J)Lo/MenuPopupWindowMenuDropDownListView;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<findCreatorAnnotation, MenuPopupWindowMenuDropDownListView> {
        public static final AnonymousClass1 write = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ MenuPopupWindowMenuDropDownListView invoke(findCreatorAnnotation findcreatorannotation) {
            return IconCompatParcelizer(findcreatorannotation.getRead());
        }

        public final MenuPopupWindowMenuDropDownListView IconCompatParcelizer(long j) {
            return new MenuPopupWindowMenuDropDownListView(findCreatorAnnotation.read(j), findCreatorAnnotation.write(j));
        }

        AnonymousClass1() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.AppCompatRatingBar$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/MenuPopupWindowMenuDropDownListView;", "p0", "Lo/findCreatorAnnotation;", "read", "(Lo/MenuPopupWindowMenuDropDownListView;)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<MenuPopupWindowMenuDropDownListView, findCreatorAnnotation> {
        public static final AnonymousClass3 write = new AnonymousClass3();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ findCreatorAnnotation invoke(MenuPopupWindowMenuDropDownListView menuPopupWindowMenuDropDownListView) {
            return findCreatorAnnotation.RemoteActionCompatParcelizer(read(menuPopupWindowMenuDropDownListView));
        }

        public final long read(MenuPopupWindowMenuDropDownListView menuPopupWindowMenuDropDownListView) {
            return findDeserializationConverter.read(menuPopupWindowMenuDropDownListView.getAudioAttributesCompatParcelizer(), menuPopupWindowMenuDropDownListView.getWrite());
        }

        AnonymousClass3() {
            super(1);
        }
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, getCreatedOnDateMs<Boolean> getcreatedondatems, String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        getCreatedOnDateMs<Boolean> getcreatedondatems2;
        setLayoutInflater.IconCompatParcelizer iconCompatParcelizer;
        setLayoutInflater.IconCompatParcelizer iconCompatParcelizer2;
        setLayoutInflater.IconCompatParcelizer iconCompatParcelizer3;
        AppCompatImageView appCompatImageView;
        findPOJOBuilder findpojobuilderOnPlayFromMediaId;
        boolean z;
        _handleOddName.Companion companion;
        if ((i2 & 4) != 0) {
            AnonymousClass9 anonymousClass9OnPause = _handleunrecognizedcharacterescape.onPause();
            if (anonymousClass9OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                anonymousClass9OnPause = AnonymousClass9.RemoteActionCompatParcelizer;
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((Object) anonymousClass9OnPause);
            }
            getcreatedondatems2 = (getCreatedOnDateMs) anonymousClass9OnPause;
        } else {
            getcreatedondatems2 = getcreatedondatems;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(28261782, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:933)");
        }
        int i3 = i & 14;
        setDropDownVerticalOffset setdropdownverticaloffsetIconCompatParcelizer = IconCompatParcelizer(setlayoutinflater, setdropdownverticaloffset, _handleunrecognizedcharacterescape, i & 126);
        int i4 = i >> 3;
        setDropDownWidth setdropdownwidthWrite = write(setlayoutinflater, setdropdownwidth, _handleunrecognizedcharacterescape, (i4 & 112) | i3);
        boolean z2 = (setdropdownverticaloffsetIconCompatParcelizer.getWrite().getAudioAttributesCompatParcelizer() == null && setdropdownwidthWrite.getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer() == null) ? false : true;
        boolean z3 = (setdropdownverticaloffsetIconCompatParcelizer.getWrite().getRead() == null && setdropdownwidthWrite.getAudioAttributesCompatParcelizer().getRead() == null) ? false : true;
        boolean z4 = (setdropdownverticaloffsetIconCompatParcelizer.getWrite().getIconCompatParcelizer() == null && setdropdownwidthWrite.getAudioAttributesCompatParcelizer().getIconCompatParcelizer() == null) ? false : true;
        if (z3) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(133792645);
            evictionCount<hasReferringProperties, MenuPopupWindowMenuDropDownListView> evictioncount = hitCount.read(hasReferringProperties.INSTANCE);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" slide");
                objOnPause = sb.toString();
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            setLayoutInflater.IconCompatParcelizer iconCompatParcelizerWrite = setCardElevation.write(setlayoutinflater, evictioncount, (String) objOnPause, _handleunrecognizedcharacterescape, i3 | RendererCapabilities.MODE_SUPPORT_MASK, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            iconCompatParcelizer = iconCompatParcelizerWrite;
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(133898448);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            iconCompatParcelizer = null;
        }
        if (z4) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(133990239);
            evictionCount<getKey, MenuPopupWindowMenuDropDownListView> evictioncountIconCompatParcelizer = hitCount.IconCompatParcelizer(getKey.INSTANCE);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" shrink/expand");
                objOnPause2 = sb2.toString();
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            setLayoutInflater.IconCompatParcelizer iconCompatParcelizerWrite2 = setCardElevation.write(setlayoutinflater, evictioncountIconCompatParcelizer, (String) objOnPause2, _handleunrecognizedcharacterescape, i3 | RendererCapabilities.MODE_SUPPORT_MASK, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            iconCompatParcelizer2 = iconCompatParcelizerWrite2;
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(134101063);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            iconCompatParcelizer2 = null;
        }
        if (z4) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(134174689);
            evictionCount<hasReferringProperties, MenuPopupWindowMenuDropDownListView> evictioncount2 = hitCount.read(hasReferringProperties.INSTANCE);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" InterruptionHandlingOffset");
                objOnPause3 = sb3.toString();
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            setLayoutInflater.IconCompatParcelizer iconCompatParcelizerWrite3 = setCardElevation.write(setlayoutinflater, evictioncount2, (String) objOnPause3, _handleunrecognizedcharacterescape, i3 | RendererCapabilities.MODE_SUPPORT_MASK, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            iconCompatParcelizer3 = iconCompatParcelizerWrite3;
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(134345095);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            iconCompatParcelizer3 = null;
        }
        AppCompatImageView appCompatImageView2 = setdropdownverticaloffsetIconCompatParcelizer.getWrite().getIconCompatParcelizer();
        boolean z5 = ((appCompatImageView2 == null || appCompatImageView2.getIconCompatParcelizer()) && ((appCompatImageView = setdropdownwidthWrite.getAudioAttributesCompatParcelizer().getIconCompatParcelizer()) == null || appCompatImageView.getIconCompatParcelizer()) && z4) ? false : true;
        setDecorPadding setdecorpaddingAudioAttributesImplApi21Parcelizer = setdropdownverticaloffsetIconCompatParcelizer.getWrite().getAudioAttributesCompatParcelizer();
        if (setdecorpaddingAudioAttributesImplApi21Parcelizer == null || (findpojobuilderOnPlayFromMediaId = switchToNext.read(setdecorpaddingAudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer())) == null) {
            setDecorPadding setdecorpaddingAudioAttributesImplApi21Parcelizer2 = setdropdownverticaloffsetIconCompatParcelizer.getWrite().getAudioAttributesCompatParcelizer();
            if (setdecorpaddingAudioAttributesImplApi21Parcelizer2 != null) {
                findpojobuilderOnPlayFromMediaId = switchToNext.read(setdecorpaddingAudioAttributesImplApi21Parcelizer2.getWrite());
            } else {
                setDecorPadding setdecorpaddingAudioAttributesImplApi21Parcelizer3 = setdropdownwidthWrite.getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer();
                findpojobuilderOnPlayFromMediaId = setdecorpaddingAudioAttributesImplApi21Parcelizer3 != null ? switchToNext.read(setdecorpaddingAudioAttributesImplApi21Parcelizer3.getRemoteActionCompatParcelizer()) : null;
                if (findpojobuilderOnPlayFromMediaId == null) {
                    setDecorPadding setdecorpaddingAudioAttributesImplApi21Parcelizer4 = setdropdownwidthWrite.getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer();
                    findImplicitPropertyName findimplicitpropertyname = setdecorpaddingAudioAttributesImplApi21Parcelizer4 != null ? switchToNext.read(setdecorpaddingAudioAttributesImplApi21Parcelizer4.getWrite()) : null;
                    findpojobuilderOnPlayFromMediaId = findimplicitpropertyname == null ? findFilterId.INSTANCE.onPlayFromMediaId() : findimplicitpropertyname;
                }
            }
        }
        if (z2) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(134871569);
            evictionCount<switchToNext, setAppSearchData> evictioncountInvoke = Function1.write(switchToNext.INSTANCE).invoke(findpojobuilderOnPlayFromMediaId);
            Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" veil");
                objOnPause4 = sb4.toString();
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
            }
            z = z5;
            DialogTitle dialogTitle = new DialogTitle(setlayoutinflater, setCardElevation.write(setlayoutinflater, evictioncountInvoke, (String) objOnPause4, _handleunrecognizedcharacterescape, i3 | RendererCapabilities.MODE_SUPPORT_MASK, 0), setdropdownverticaloffsetIconCompatParcelizer, setdropdownwidthWrite);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            companion = dialogTitle;
        } else {
            z = z5;
            _handleunrecognizedcharacterescape.IconCompatParcelizer(135150476);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            companion = _handleOddName.INSTANCE;
        }
        _handleOddName.Companion companion2 = companion;
        setDecorPadding setdecorpaddingAudioAttributesImplApi21Parcelizer5 = setdropdownverticaloffsetIconCompatParcelizer.getWrite().getAudioAttributesCompatParcelizer();
        boolean zAudioAttributesCompatParcelizer = (setdecorpaddingAudioAttributesImplApi21Parcelizer5 == null && (setdecorpaddingAudioAttributesImplApi21Parcelizer5 = setdropdownwidthWrite.getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer()) == null) ? false : setdecorpaddingAudioAttributesImplApi21Parcelizer5.getIconCompatParcelizer();
        setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicboundsWrite = write(setlayoutinflater, setdropdownverticaloffsetIconCompatParcelizer, setdropdownwidthWrite, str, _handleunrecognizedcharacterescape, i3 | (i4 & 7168));
        _handleOddName.Companion companion3 = zAudioAttributesCompatParcelizer ? companion2 : _handleOddName.INSTANCE;
        _handleOddName.Companion companion4 = _handleOddName.INSTANCE;
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z);
        boolean z6 = (((i & 7168) ^ 3072) > 2048 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems2)) || (i & 3072) == 2048;
        AnonymousClass14 anonymousClass14OnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer2 | z6) || anonymousClass14OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            anonymousClass14OnPause = new AnonymousClass14(z, getcreatedondatems2);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(anonymousClass14OnPause);
        }
        _handleOddName _handleoddnameAudioAttributesCompatParcelizer = companion3.AudioAttributesCompatParcelizer(expand.IconCompatParcelizer(companion4, (getAnswerMap) anonymousClass14OnPause)).AudioAttributesCompatParcelizer(new setAdapter(setlayoutinflater, iconCompatParcelizer2, iconCompatParcelizer3, iconCompatParcelizer, setdropdownverticaloffsetIconCompatParcelizer, setdropdownwidthWrite, getcreatedondatems2, setcompounddrawablesrelativewithintrinsicboundsWrite));
        if (zAudioAttributesCompatParcelizer) {
            companion2 = _handleOddName.INSTANCE;
        }
        _handleOddName _handleoddnameAudioAttributesCompatParcelizer2 = _handleoddnameAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(companion2);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return _handleoddnameAudioAttributesCompatParcelizer2;
    }

    private static final void AudioAttributesCompatParcelizer(InputAccessor<setDropDownVerticalOffset> inputAccessor, setDropDownVerticalOffset setdropdownverticaloffset) {
        inputAccessor.write(setdropdownverticaloffset);
    }

    private static final void RemoteActionCompatParcelizer(InputAccessor<setDropDownWidth> inputAccessor, setDropDownWidth setdropdownwidth) {
        inputAccessor.write(setdropdownwidth);
    }
}
