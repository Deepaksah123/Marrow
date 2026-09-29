package kotlin;

import androidx.compose.animation.tooling.ComposeAnimation;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.getTypeProperty;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010-\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010(2\u0006\u0010.\u001a\u00020/H\u0002J\u0012\u00100\u001a\u00020\u00042\n\u0010.\u001a\u0006\u0012\u0002\b\u000301J\"\u00102\u001a\u00020\u00042\n\u0010.\u001a\u0006\u0012\u0002\b\u0003012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0016\u00104\u001a\u00020\u00042\u000e\u0010.\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000305J\u000e\u00106\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0001J\u0016\u00107\u001a\u00020\u00042\u000e\u0010.\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000308J\u0016\u00109\u001a\u00020\u00042\u000e\u0010.\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030:J\u0012\u0010;\u001a\u00020\u00042\n\u0010.\u001a\u0006\u0012\u0002\b\u000301J\u000e\u0010<\u001a\u00020\u00042\u0006\u0010.\u001a\u00020=J\u0018\u0010E\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\bH\u0002J\u0012\u0010G\u001a\u00020\u00042\b\u0010F\u001a\u0004\u0018\u00010\bH\u0002J$\u0010J\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00012\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040LH\u0002J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/H\u0015J\u0010\u0010N\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/H\u0015J\u001e\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020/2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010R\u001a\u00020\u0001J\u0016\u0010S\u001a\u00020\u00042\u0006\u0010P\u001a\u00020/2\u0006\u0010T\u001a\u00020\u0001J\u0015\u0010U\u001a\u00020V2\u0006\u0010P\u001a\u00020/¢\u0006\u0004\bW\u0010XJ\u0006\u0010Y\u001a\u00020ZJ\u0006\u0010[\u001a\u00020ZJ\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0'2\u0006\u0010.\u001a\u00020/J\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020_0'2\u0006\u0010.\u001a\u00020/2\u0006\u0010`\u001a\u00020ZJ\u000e\u0010a\u001a\u00020\u00042\u0006\u0010b\u001a\u00020ZJ\u001a\u0010c\u001a\u00020\u00042\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020Z0dJ\u0006\u0010e\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R0\u0010\u000b\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R8\u0010\u0018\u001a\u001e\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a0\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R(\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012R0\u0010\"\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030#\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010\u0012R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030(0'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\"\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030(0'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R,\u0010>\u001a\u0012\u0012\u0004\u0012\u00020@0?j\b\u0012\u0004\u0012\u00020@`A8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010\u0010\u001a\u0004\bC\u0010DR\u001e\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u00010?j\b\u0012\u0004\u0012\u00020\u0001`AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "", "setAnimationsTimeCallback", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "TAG", "", "DEBUG", "", "transitionClocks", "", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", "getTransitionClocks$ui_tooling$annotations", "()V", "getTransitionClocks$ui_tooling", "()Ljava/util/Map;", "animatedVisibilityClocks", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "getAnimatedVisibilityClocks$ui_tooling$annotations", "getAnimatedVisibilityClocks$ui_tooling", "animateXAsStateClocks", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", "getAnimateXAsStateClocks$ui_tooling$annotations", "getAnimateXAsStateClocks$ui_tooling", "infiniteTransitionClocks", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", "getInfiniteTransitionClocks$ui_tooling$annotations", "getInfiniteTransitionClocks$ui_tooling", "animatedContentClocks", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "getAnimatedContentClocks$ui_tooling$annotations", "getAnimatedContentClocks$ui_tooling", "allClocksExceptInfinite", "", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "getAllClocksExceptInfinite", "()Ljava/util/List;", "allClocks", "getAllClocks", "findClock", "animation", "Landroidx/compose/animation/tooling/ComposeAnimation;", "trackTransition", "Landroidx/compose/animation/core/Transition;", "trackAnimatedVisibility", "onSeek", "trackAnimateXAsState", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "trackAnimateContentSize", "trackTargetBasedAnimations", "Landroidx/compose/animation/core/TargetBasedAnimation;", "trackDecayAnimations", "Landroidx/compose/animation/core/DecayAnimation;", "trackAnimatedContent", "trackInfiniteTransition", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "trackedUnsupportedAnimations", "Ljava/util/LinkedHashSet;", "Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "Lkotlin/collections/LinkedHashSet;", "getTrackedUnsupportedAnimations$annotations", "getTrackedUnsupportedAnimations", "()Ljava/util/LinkedHashSet;", "trackUnsupported", "label", "createUnsupported", "trackedAnimations", "lock", "trackAnimation", "createClockAndSubscribe", "Lkotlin/Function1;", "notifySubscribe", "notifyUnsubscribe", "updateFromAndToStates", "composeAnimation", "fromState", "toState", "updateAnimatedVisibilityState", NotesDispatchAddressRequestKt.KEY_STATE, "getAnimatedVisibilityState", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "getAnimatedVisibilityState-cc2g1to", "(Landroidx/compose/animation/tooling/ComposeAnimation;)Ljava/lang/String;", "getMaxDuration", "", "getMaxDurationPerIteration", "getAnimatedProperties", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getTransitions", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "setClockTime", "animationTimeMillis", "setClockTimes", "", "dispose", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class JavaUtilCollectionsDeserializers {
    private final Map<hasDefaultType<?>, nuller<?>> AudioAttributesCompatParcelizer;
    private final getCreatedOnDateMs<getShowPopup> AudioAttributesImplApi21Parcelizer;
    private final Map<_findSingletonTypeName, isSkipper> AudioAttributesImplApi26Parcelizer;
    private final LinkedHashSet<Object> AudioAttributesImplBaseParcelizer;
    private final Map<getDefaultTypeId<?, ?>, NullsConstantProvider<?, ?>> IconCompatParcelizer;
    private final Object MediaBrowserCompatCustomActionResultReceiver;
    private final LinkedHashSet<MergingSettableBeanProperty> MediaBrowserCompatItemReceiver;
    private final Map<NullsAsEmptyProvider<?>, nuller<?>> RatingCompat;
    private final Map<getTypePropertyName, forValue> RemoteActionCompatParcelizer;
    private final String read;
    private final boolean write;

    protected void read(ComposeAnimation composeAnimation) {
    }

    public JavaUtilCollectionsDeserializers(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.AudioAttributesImplApi21Parcelizer = getcreatedondatems;
        this.read = "PreviewAnimationClock";
        this.RatingCompat = new LinkedHashMap();
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
        this.IconCompatParcelizer = new LinkedHashMap();
        this.AudioAttributesImplApi26Parcelizer = new LinkedHashMap();
        this.AudioAttributesCompatParcelizer = new LinkedHashMap();
        this.MediaBrowserCompatItemReceiver = new LinkedHashSet<>();
        this.AudioAttributesImplBaseParcelizer = new LinkedHashSet<>();
        this.MediaBrowserCompatCustomActionResultReceiver = new Object();
    }

    public /* synthetic */ JavaUtilCollectionsDeserializers(getCreatedOnDateMs getcreatedondatems, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new getCreatedOnDateMs() { // from class: o._checkSingleton
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return JavaUtilCollectionsDeserializers.write();
            }
        } : getcreatedondatems);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write() {
        return getShowPopup.INSTANCE;
    }

    private final List<NullsFailProvider<?, ?>> IconCompatParcelizer() {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) this.RatingCompat.values(), (Iterable) this.RemoteActionCompatParcelizer.values()), (Iterable) this.IconCompatParcelizer.values()), (Iterable) this.AudioAttributesCompatParcelizer.values());
    }

    public final void IconCompatParcelizer(final setLayoutInflater<?> setlayoutinflater) {
        write(setlayoutinflater, new getAnswerMap() { // from class: o.findForCollection
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return JavaUtilCollectionsDeserializers.AudioAttributesCompatParcelizer(setlayoutinflater, this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setLayoutInflater setlayoutinflater, JavaUtilCollectionsDeserializers javaUtilCollectionsDeserializers, Object obj) {
        NullsAsEmptyProvider<?> nullsAsEmptyProviderWrite = MethodProperty.write(setlayoutinflater);
        if (nullsAsEmptyProviderWrite != null) {
            javaUtilCollectionsDeserializers.RatingCompat.put(nullsAsEmptyProviderWrite, new nuller<>(nullsAsEmptyProviderWrite));
            javaUtilCollectionsDeserializers.read((ComposeAnimation) nullsAsEmptyProviderWrite);
            return getShowPopup.INSTANCE;
        }
        javaUtilCollectionsDeserializers.write(setlayoutinflater.getWrite());
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(final setLayoutInflater<?> setlayoutinflater, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        if (setlayoutinflater.RemoteActionCompatParcelizer() instanceof Boolean) {
            write(setlayoutinflater, new getAnswerMap() { // from class: o._findUtilCollectionsTypeName
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return JavaUtilCollectionsDeserializers.IconCompatParcelizer(setlayoutinflater, getcreatedondatems, this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setLayoutInflater setlayoutinflater, getCreatedOnDateMs getcreatedondatems, JavaUtilCollectionsDeserializers javaUtilCollectionsDeserializers, Object obj) {
        toMagicModuleMetaRepoModel.read(setlayoutinflater, "");
        getTypePropertyName gettypepropertynameAudioAttributesCompatParcelizer = hasTypePropertyName.AudioAttributesCompatParcelizer(setlayoutinflater);
        getcreatedondatems.invoke();
        Map<getTypePropertyName, forValue> map = javaUtilCollectionsDeserializers.RemoteActionCompatParcelizer;
        forValue forvalue = new forValue(gettypepropertynameAudioAttributesCompatParcelizer);
        forvalue.AudioAttributesCompatParcelizer(0L);
        map.put(gettypepropertynameAudioAttributesCompatParcelizer, forvalue);
        javaUtilCollectionsDeserializers.read((ComposeAnimation) gettypepropertynameAudioAttributesCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    public final void read(final getTypeProperty.RemoteActionCompatParcelizer<?, ?> remoteActionCompatParcelizer) {
        write(remoteActionCompatParcelizer.read(), new getAnswerMap() { // from class: o.getOutputType
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return JavaUtilCollectionsDeserializers.write(remoteActionCompatParcelizer, this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getTypeProperty.RemoteActionCompatParcelizer remoteActionCompatParcelizer, JavaUtilCollectionsDeserializers javaUtilCollectionsDeserializers, Object obj) {
        getDefaultTypeId<?, ?> getdefaulttypeidAudioAttributesCompatParcelizer = getDefaultTypeId.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        if (getdefaulttypeidAudioAttributesCompatParcelizer != null) {
            javaUtilCollectionsDeserializers.IconCompatParcelizer.put(getdefaulttypeidAudioAttributesCompatParcelizer, new NullsConstantProvider<>(getdefaulttypeidAudioAttributesCompatParcelizer));
            javaUtilCollectionsDeserializers.read((ComposeAnimation) getdefaulttypeidAudioAttributesCompatParcelizer);
            return getShowPopup.INSTANCE;
        }
        javaUtilCollectionsDeserializers.write(remoteActionCompatParcelizer.read().getRemoteActionCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    public final void read(Object obj) {
        AudioAttributesCompatParcelizer(obj, "animateContentSize");
    }

    public final void write(setLayoutResource<?, ?> setlayoutresource) {
        AudioAttributesCompatParcelizer(setlayoutresource, "TargetBasedAnimation");
    }

    public final void RemoteActionCompatParcelizer(setImeOptions<?, ?> setimeoptions) {
        AudioAttributesCompatParcelizer(setimeoptions, "DecayAnimation");
    }

    public final void RemoteActionCompatParcelizer(final setLayoutInflater<?> setlayoutinflater) {
        write(setlayoutinflater, new getAnswerMap() { // from class: o._findUtilCollectionsImmutableTypeName
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return JavaUtilCollectionsDeserializers.read(setlayoutinflater, this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setLayoutInflater setlayoutinflater, JavaUtilCollectionsDeserializers javaUtilCollectionsDeserializers, Object obj) {
        hasDefaultType<?> hasdefaulttypeAudioAttributesCompatParcelizer = hasDefaultType.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(setlayoutinflater);
        if (hasdefaulttypeAudioAttributesCompatParcelizer != null) {
            javaUtilCollectionsDeserializers.AudioAttributesCompatParcelizer.put(hasdefaulttypeAudioAttributesCompatParcelizer, new nuller<>(hasdefaulttypeAudioAttributesCompatParcelizer));
            javaUtilCollectionsDeserializers.read((ComposeAnimation) hasdefaulttypeAudioAttributesCompatParcelizer);
            return getShowPopup.INSTANCE;
        }
        javaUtilCollectionsDeserializers.write(setlayoutinflater.getWrite());
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(final getTypeProperty.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        write(mediaBrowserCompatCustomActionResultReceiver.getWrite(), new getAnswerMap() { // from class: o.findForMap
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return JavaUtilCollectionsDeserializers.AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver, this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getTypeProperty.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, final JavaUtilCollectionsDeserializers javaUtilCollectionsDeserializers, Object obj) {
        _findSingletonTypeName _findsingletontypename = _findSingletonTypeName.RemoteActionCompatParcelizer.read(mediaBrowserCompatCustomActionResultReceiver);
        if (_findsingletontypename != null) {
            javaUtilCollectionsDeserializers.AudioAttributesImplApi26Parcelizer.put(_findsingletontypename, new isSkipper(_findsingletontypename, new getCreatedOnDateMs() { // from class: o.JavaUtilCollectionsDeserializersJavaUtilCollectionsConverter
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return Long.valueOf(JavaUtilCollectionsDeserializers.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
                }
            }));
            javaUtilCollectionsDeserializers.read((ComposeAnimation) _findsingletontypename);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long RemoteActionCompatParcelizer(JavaUtilCollectionsDeserializers javaUtilCollectionsDeserializers) {
        Long lValueOf;
        Iterator<T> it = javaUtilCollectionsDeserializers.IconCompatParcelizer().iterator();
        Long lValueOf2 = null;
        if (it.hasNext()) {
            lValueOf = Long.valueOf(((NullsFailProvider) it.next()).IconCompatParcelizer());
            while (it.hasNext()) {
                Long lValueOf3 = Long.valueOf(((NullsFailProvider) it.next()).IconCompatParcelizer());
                if (lValueOf.compareTo(lValueOf3) < 0) {
                    lValueOf = lValueOf3;
                }
            }
        } else {
            lValueOf = null;
        }
        Long l = lValueOf;
        long jLongValue = l != null ? l.longValue() : 0L;
        Iterator<T> it2 = javaUtilCollectionsDeserializers.AudioAttributesImplApi26Parcelizer.values().iterator();
        if (it2.hasNext()) {
            lValueOf2 = Long.valueOf(((isSkipper) it2.next()).write());
            while (it2.hasNext()) {
                Long lValueOf4 = Long.valueOf(((isSkipper) it2.next()).write());
                if (lValueOf2.compareTo(lValueOf4) < 0) {
                    lValueOf2 = lValueOf4;
                }
            }
        }
        Long l2 = lValueOf2;
        return Math.max(jLongValue, l2 != null ? l2.longValue() : 0L);
    }

    private final void AudioAttributesCompatParcelizer(Object obj, final String str) {
        write(obj, new getAnswerMap() { // from class: o.getInputType
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj2) {
                return JavaUtilCollectionsDeserializers.write(this.read, str, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(JavaUtilCollectionsDeserializers javaUtilCollectionsDeserializers, String str, Object obj) {
        javaUtilCollectionsDeserializers.write(str);
        return getShowPopup.INSTANCE;
    }

    private final void write(String str) {
        MergingSettableBeanProperty mergingSettableBeanPropertyAudioAttributesCompatParcelizer = MergingSettableBeanProperty.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str);
        if (mergingSettableBeanPropertyAudioAttributesCompatParcelizer != null) {
            this.MediaBrowserCompatItemReceiver.add(mergingSettableBeanPropertyAudioAttributesCompatParcelizer);
            read((ComposeAnimation) mergingSettableBeanPropertyAudioAttributesCompatParcelizer);
        }
    }

    private final boolean write(Object obj, getAnswerMap<Object, getShowPopup> getanswermap) {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            if (this.AudioAttributesImplBaseParcelizer.contains(obj)) {
                if (this.write) {
                    Objects.toString(obj);
                }
                return false;
            }
            this.AudioAttributesImplBaseParcelizer.add(obj);
            getanswermap.invoke(obj);
            if (!this.write) {
                return true;
            }
            Objects.toString(obj);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaUtilCollectionsDeserializers() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
