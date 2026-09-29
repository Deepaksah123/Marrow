package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.setContentInsetEndWithActions;
import kotlin.setLayoutInflater;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\b\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B1\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0010\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fB#\b\u0011\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\u000eJ\b\u0010T\u001a\u00020'H\u0002J\u001d\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020'2\u0006\u0010X\u001a\u00020YH\u0000¢\u0006\u0002\bZJ\u001d\u0010U\u001a\u00020V2\u0006\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020%H\u0000¢\u0006\u0002\bZJ\u0015\u0010]\u001a\u00020V2\u0006\u0010W\u001a\u00020'H\u0000¢\u0006\u0002\b^J\r\u0010_\u001a\u00020VH\u0000¢\u0006\u0002\b`J\r\u0010a\u001a\u00020VH\u0000¢\u0006\u0002\bbJ'\u0010c\u001a\u00020V2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u00100\u001a\u00020'H\u0007¢\u0006\u0004\bd\u0010eJ\u0019\u0010f\u001a\u00020%2\n\u0010g\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0002\bhJ\u0019\u0010i\u001a\u00020%2\n\u0010g\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0002\bjJ'\u0010k\u001a\u00020%2\u0018\u0010l\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030>R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0002\bmJ'\u0010n\u001a\u00020V2\u0018\u0010l\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030>R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0002\boJ\u0017\u0010p\u001a\u00020V2\u0006\u0010\u0017\u001a\u00028\u0000H\u0000¢\u0006\u0004\bq\u0010\u001aJ\u0017\u0010r\u001a\u00020V2\u0006\u0010\u0017\u001a\u00028\u0000H\u0001¢\u0006\u0004\bs\u0010tJ\u0015\u0010u\u001a\u00020V2\u0006\u00100\u001a\u00020'H\u0000¢\u0006\u0002\bvJ\u0015\u0010w\u001a\u00020V2\u0006\u0010x\u001a\u00020yH\u0000¢\u0006\u0002\bzJ\u0015\u0010{\u001a\u00020V2\u0006\u0010|\u001a\u00020YH\u0000¢\u0006\u0002\b}J\r\u0010~\u001a\u00020VH\u0000¢\u0006\u0002\b\u007fJ\u000f\u0010\u0080\u0001\u001a\u00020VH\u0000¢\u0006\u0003\b\u0081\u0001J\t\u0010\u0082\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u0083\u0001\u001a\u00020VH\u0002J)\u0010n\u001a\u00020V2\u001a\u0010\u0084\u0001\u001a\u0015\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0085\u0001R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0002\boR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u001aR7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b$\u0010&R+\u0010(\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00100\u001a\u00020'2\u0006\u0010/\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R+\u00103\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020'8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R+\u00107\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u001c\u001a\u0004\b8\u0010&\"\u0004\b9\u0010:R&\u0010<\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030>R\b\u0012\u0004\u0012\u00028\u00000\u00000=X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000=X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR)\u0010D\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030>R\b\u0012\u0004\u0012\u00028\u00000\u00000A8F¢\u0006\u0006\u001a\u0004\bE\u0010CR+\u0010F\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u001c\u001a\u0004\bF\u0010&\"\u0004\bG\u0010:R\u001a\u0010I\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010,R\u001a\u0010L\u001a\u00020%8FX\u0087\u0004¢\u0006\f\u0012\u0004\bM\u0010N\u001a\u0004\bO\u0010&R\u001b\u0010P\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bQ\u0010*¨\u0006\u008a\u0001²\u0006\u000b\u0010\u008b\u0001\u001a\u00020%X\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "transitionState", "Landroidx/compose/animation/core/TransitionState;", "parentTransition", "label", "", "<init>", "(Landroidx/compose/animation/core/TransitionState;Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "getParentTransition", "()Landroidx/compose/animation/core/Transition;", "getLabel", "()Ljava/lang/String;", "currentState", "getCurrentState", "()Ljava/lang/Object;", "<set-?>", "targetState", "getTargetState", "setTargetState$animation_core", "(Ljava/lang/Object;)V", "targetState$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/animation/core/Transition$Segment;", "segment", "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "setSegment", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment$delegate", "isRunning", "", "()Z", "", "_playTimeNanos", "get_playTimeNanos", "()J", "set_playTimeNanos", "(J)V", "_playTimeNanos$delegate", "Landroidx/compose/runtime/MutableLongState;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "playTimeNanos", "getPlayTimeNanos", "setPlayTimeNanos", "startTimeNanos", "getStartTimeNanos$animation_core", "setStartTimeNanos$animation_core", "startTimeNanos$delegate", "updateChildrenNeeded", "getUpdateChildrenNeeded", "setUpdateChildrenNeeded", "(Z)V", "updateChildrenNeeded$delegate", "_animations", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "_transitions", "transitions", "", "getTransitions", "()Ljava/util/List;", "animations", "getAnimations", "isSeeking", "setSeeking$animation_core", "isSeeking$delegate", "lastSeekedTimeNanos", "getLastSeekedTimeNanos$animation_core", "setLastSeekedTimeNanos$animation_core", "hasInitialValueAnimations", "getHasInitialValueAnimations$annotations", "()V", "getHasInitialValueAnimations", "totalDurationNanos", "getTotalDurationNanos", "totalDurationNanos$delegate", "Landroidx/compose/runtime/State;", "calculateTotalDurationNanos", "onFrame", "", "frameTimeNanos", "durationScale", "", "onFrame$animation_core", "scaledPlayTimeNanos", "scaleToEnd", "onTransitionStart", "onTransitionStart$animation_core", "onDisposed", "onDisposed$animation_core", "onTransitionEnd", "onTransitionEnd$animation_core", "setPlaytimeAfterInitialAndTargetStateEstablished", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "addTransition", "transition", "addTransition$animation_core", "removeTransition", "removeTransition$animation_core", "addAnimation", "animation", "addAnimation$animation_core", "removeAnimation", "removeAnimation$animation_core", "updateTarget", "updateTarget$animation_core", "animateTo", "animateTo$animation_core", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "seekAnimations", "seekAnimations$animation_core", "setInitialAnimations", "animationState", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "setInitialAnimations$animation_core", "resetAnimationFraction", "fraction", "resetAnimationFraction$animation_core", "clearInitialAnimations", "clearInitialAnimations$animation_core", "updateInitialValues", "updateInitialValues$animation_core", "toString", "onChildAnimationUpdated", "deferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "TransitionAnimationState", "SegmentImpl", "Segment", "DeferredAnimation", "animation-core", "runFrameLoop"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setLayoutInflater<S> {
    private final SnapshotStateList<setLayoutInflater<S>.read<?, ?>> AudioAttributesCompatParcelizer;
    private final InputAccessorStd AudioAttributesImplApi21Parcelizer;
    private final InputAccessor AudioAttributesImplApi26Parcelizer;
    private final setLayoutInflater<?> AudioAttributesImplBaseParcelizer;
    private final InputAccessorStd IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private final InputAccessor MediaBrowserCompatItemReceiver;
    private final parseDouble MediaBrowserCompatMediaItem;
    private final createCount<S> MediaBrowserCompatSearchResultReceiver;
    private final InputAccessor MediaMetadataCompat;
    private final SnapshotStateList<setLayoutInflater<?>> RemoteActionCompatParcelizer;
    private final InputAccessor read;
    private final String write;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver implements _wrapError {
        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
        }
    }

    public setLayoutInflater(createCount<S> createcount, setLayoutInflater<?> setlayoutinflater, String str) {
        this.MediaBrowserCompatSearchResultReceiver = createcount;
        this.AudioAttributesImplBaseParcelizer = setlayoutinflater;
        this.write = str;
        this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(RemoteActionCompatParcelizer(), null, 2, null);
        this.AudioAttributesImplApi26Parcelizer = available.RemoteActionCompatParcelizer$default(new AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(), RemoteActionCompatParcelizer()), null, 2, null);
        this.IconCompatParcelizer = _appendNamed.AudioAttributesCompatParcelizer(0L);
        this.AudioAttributesImplApi21Parcelizer = _appendNamed.AudioAttributesCompatParcelizer(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.MediaMetadataCompat = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.AudioAttributesCompatParcelizer = _qbuf.write();
        this.RemoteActionCompatParcelizer = _qbuf.write();
        this.read = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.MediaBrowserCompatMediaItem = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.setContentPadding
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Long.valueOf(setLayoutInflater.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer));
            }
        });
        createcount.IconCompatParcelizer((setLayoutInflater) this);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    public setLayoutInflater(createCount<S> createcount, String str) {
        this(createcount, null, str);
    }

    public setLayoutInflater(S s, String str) {
        this(new setCollapseIcon(s), null, str);
    }

    public final S RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver.read();
    }

    public final S AudioAttributesImplApi26Parcelizer() {
        return (S) this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer();
    }

    public final void read(S s) {
        this.MediaBrowserCompatItemReceiver.write(s);
    }

    private final void read(write<S> writeVar) {
        this.AudioAttributesImplApi26Parcelizer.write(writeVar);
    }

    public final write<S> AudioAttributesImplBaseParcelizer() {
        return (write) this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer();
    }

    public final boolean MediaDescriptionCompat() {
        return AudioAttributesImplApi21Parcelizer() != Long.MIN_VALUE;
    }

    private final void AudioAttributesCompatParcelizer(long j) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(j);
    }

    private final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        setLayoutInflater<?> setlayoutinflater = this.AudioAttributesImplBaseParcelizer;
        return setlayoutinflater != null ? setlayoutinflater.MediaBrowserCompatCustomActionResultReceiver() : MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    public final void RemoteActionCompatParcelizer(long j) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            AudioAttributesCompatParcelizer(j);
        }
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
    }

    public final void write(long j) {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean onCustomAction() {
        return ((Boolean) this.MediaMetadataCompat.getRemoteActionCompatParcelizer()).booleanValue();
    }

    private final void read(boolean z) {
        this.MediaMetadataCompat.write(Boolean.valueOf(z));
    }

    public final List<setLayoutInflater<?>> MediaBrowserCompatMediaItem() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<setLayoutInflater<S>.read<?, ?>> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.read.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean MediaMetadataCompat() {
        return ((Boolean) this.read.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final long getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        SnapshotStateList<setLayoutInflater<S>.read<?, ?>> snapshotStateList = this.AudioAttributesCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (snapshotStateList.get(i).getAudioAttributesImplApi26Parcelizer() != null) {
                return true;
            }
        }
        SnapshotStateList<setLayoutInflater<?>> snapshotStateList2 = this.RemoteActionCompatParcelizer;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (snapshotStateList2.get(i2).AudioAttributesCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MediaBrowserCompatItemReceiver(setLayoutInflater setlayoutinflater) {
        return setlayoutinflater.handleMediaPlayPauseIfPendingOnHandler();
    }

    public final long MediaBrowserCompatSearchResultReceiver() {
        return ((Number) this.MediaBrowserCompatMediaItem.getRemoteActionCompatParcelizer()).longValue();
    }

    private final long handleMediaPlayPauseIfPendingOnHandler() {
        SnapshotStateList<setLayoutInflater<S>.read<?, ?>> snapshotStateList = this.AudioAttributesCompatParcelizer;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, snapshotStateList.get(i).IconCompatParcelizer());
        }
        SnapshotStateList<setLayoutInflater<?>> snapshotStateList2 = this.RemoteActionCompatParcelizer;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i2).handleMediaPlayPauseIfPendingOnHandler());
        }
        return jMax;
    }

    public final void IconCompatParcelizer(long j, float f) {
        if (AudioAttributesImplApi21Parcelizer() == Long.MIN_VALUE) {
            read(j);
        }
        long jAudioAttributesImplApi21Parcelizer = j - AudioAttributesImplApi21Parcelizer();
        if (f != BitmapDescriptorFactory.HUE_RED) {
            jAudioAttributesImplApi21Parcelizer = getOnline.write(jAudioAttributesImplApi21Parcelizer / ((double) f));
        }
        RemoteActionCompatParcelizer(jAudioAttributesImplApi21Parcelizer);
        IconCompatParcelizer(jAudioAttributesImplApi21Parcelizer, f == BitmapDescriptorFactory.HUE_RED);
    }

    public final void IconCompatParcelizer(long j, boolean z) {
        boolean z2 = true;
        if (AudioAttributesImplApi21Parcelizer() == Long.MIN_VALUE) {
            read(j);
        } else if (!this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer()) {
            this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(true);
        }
        read(false);
        SnapshotStateList<setLayoutInflater<S>.read<?, ?>> snapshotStateList = this.AudioAttributesCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            setLayoutInflater<S>.read<?, ?> readVar = snapshotStateList.get(i);
            if (!readVar.MediaBrowserCompatItemReceiver()) {
                readVar.read(j, z);
            }
            if (!readVar.MediaBrowserCompatItemReceiver()) {
                z2 = false;
            }
        }
        SnapshotStateList<setLayoutInflater<?>> snapshotStateList2 = this.RemoteActionCompatParcelizer;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            setLayoutInflater<?> setlayoutinflater = snapshotStateList2.get(i2);
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setlayoutinflater.AudioAttributesImplApi26Parcelizer(), setlayoutinflater.RemoteActionCompatParcelizer())) {
                setlayoutinflater.IconCompatParcelizer(j, z);
            }
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setlayoutinflater.AudioAttributesImplApi26Parcelizer(), setlayoutinflater.RemoteActionCompatParcelizer())) {
                z2 = false;
            }
        }
        if (z2) {
            onCommand();
        }
    }

    public final void read(long j) {
        write(j);
        this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(true);
    }

    public final void RatingCompat() {
        onCommand();
        this.MediaBrowserCompatSearchResultReceiver.write();
    }

    public final void onCommand() {
        write(Long.MIN_VALUE);
        createCount<S> createcount = this.MediaBrowserCompatSearchResultReceiver;
        if (createcount instanceof setCollapseIcon) {
            ((setCollapseIcon) createcount).IconCompatParcelizer(AudioAttributesImplApi26Parcelizer());
        }
        RemoteActionCompatParcelizer(0L);
        this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(false);
        SnapshotStateList<setLayoutInflater<?>> snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).onCommand();
        }
    }

    public final void read(S s, S s2, long j) {
        write(Long.MIN_VALUE);
        this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(false);
        if (!MediaMetadataCompat() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), s) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), s2)) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), s)) {
                createCount<S> createcount = this.MediaBrowserCompatSearchResultReceiver;
                if (createcount instanceof setCollapseIcon) {
                    ((setCollapseIcon) createcount).IconCompatParcelizer(s);
                }
            }
            read(s2);
            IconCompatParcelizer(true);
            read((write) new AudioAttributesCompatParcelizer(s, s2));
        }
        SnapshotStateList<setLayoutInflater<?>> snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            setLayoutInflater<?> setlayoutinflater = snapshotStateList.get(i);
            toMagicModuleMetaRepoModel.read(setlayoutinflater, "");
            if (setlayoutinflater.MediaMetadataCompat()) {
                setlayoutinflater.read(setlayoutinflater.RemoteActionCompatParcelizer(), setlayoutinflater.AudioAttributesImplApi26Parcelizer(), j);
            }
        }
        SnapshotStateList<setLayoutInflater<S>.read<?, ?>> snapshotStateList2 = this.AudioAttributesCompatParcelizer;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).read(j);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = j;
    }

    public final boolean read(setLayoutInflater<?> setlayoutinflater) {
        return this.RemoteActionCompatParcelizer.add(setlayoutinflater);
    }

    public final boolean write(setLayoutInflater<?> setlayoutinflater) {
        return this.RemoteActionCompatParcelizer.remove(setlayoutinflater);
    }

    public final boolean write(setLayoutInflater<S>.read<?, ?> readVar) {
        return this.AudioAttributesCompatParcelizer.add(readVar);
    }

    public final void IconCompatParcelizer(setLayoutInflater<S>.read<?, ?> readVar) {
        this.AudioAttributesCompatParcelizer.remove(readVar);
    }

    public final void IconCompatParcelizer(S s) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), s)) {
            return;
        }
        read((write) new AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer(), s));
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), AudioAttributesImplApi26Parcelizer())) {
            this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(AudioAttributesImplApi26Parcelizer());
        }
        read(s);
        if (!MediaDescriptionCompat()) {
            read(true);
        }
        SnapshotStateList<setLayoutInflater<S>.read<?, ?>> snapshotStateList = this.AudioAttributesCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void AudioAttributesCompatParcelizer(final S s, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(s) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1180)");
            }
            if (MediaMetadataCompat()) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(416369985);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(466062241);
                IconCompatParcelizer(s);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.setOnInflateListener
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return Boolean.valueOf(setLayoutInflater.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer));
                        }
                    });
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                if (!read((parseDouble<Boolean>) objOnPause)) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(416369985);
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(466470356);
                    Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                    if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause2 = StreamReadException.RemoteActionCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescapeWrite);
                        _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                    }
                    final TopUserCompanion topUserCompanion = (TopUserCompanion) objOnPause2;
                    boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(topUserCompanion);
                    boolean z2 = i3 == 32;
                    Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
                    if ((zIconCompatParcelizer | z2) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause3 = new getAnswerMap() { // from class: o.ViewStubCompat
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return setLayoutInflater.read(topUserCompanion, this, (StreamConstraintsException) obj);
                            }
                        };
                        _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
                    }
                    StreamReadException.RemoteActionCompatParcelizer(topUserCompanion, this, (getAnswerMap) objOnPause3, _handleunrecognizedcharacterescapeWrite, i3);
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setCardBackgroundColor
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setLayoutInflater.read(this.write, s, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplBaseParcelizer(setLayoutInflater setlayoutinflater) {
        return !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setlayoutinflater.AudioAttributesImplApi26Parcelizer(), setlayoutinflater.RemoteActionCompatParcelizer()) || setlayoutinflater.MediaDescriptionCompat() || setlayoutinflater.onCustomAction();
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        float AudioAttributesCompatParcelizer;
        private /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ setLayoutInflater<S> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            TopUserCompanion topUserCompanion;
            final float fIconCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                topUserCompanion = (TopUserCompanion) this.IconCompatParcelizer;
                fIconCompatParcelizer = setTitleMarginStart.IconCompatParcelizer(topUserCompanion.getIconCompatParcelizer());
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fIconCompatParcelizer = this.AudioAttributesCompatParcelizer;
                topUserCompanion = (TopUserCompanion) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            while (College.IconCompatParcelizer(topUserCompanion)) {
                final setLayoutInflater<S> setlayoutinflater = this.write;
                this.IconCompatParcelizer = topUserCompanion;
                this.AudioAttributesCompatParcelizer = fIconCompatParcelizer;
                this.RemoteActionCompatParcelizer = 1;
                if (TokenFilterInclusion.AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.CardView
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj2) {
                        return setLayoutInflater.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(setlayoutinflater, fIconCompatParcelizer, ((Long) obj2).longValue());
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(setLayoutInflater setlayoutinflater, float f, long j) {
            if (!setlayoutinflater.MediaMetadataCompat()) {
                setlayoutinflater.IconCompatParcelizer(j, f);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(setLayoutInflater<S> setlayoutinflater, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = setlayoutinflater;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.write, sampleVideos);
            remoteActionCompatParcelizer.IconCompatParcelizer = obj;
            return remoteActionCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError read(TopUserCompanion topUserCompanion, setLayoutInflater setlayoutinflater, StreamConstraintsException streamConstraintsException) {
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, getCollegeName.AudioAttributesCompatParcelizer, new RemoteActionCompatParcelizer(setlayoutinflater, null), 1);
        return new MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void IconCompatParcelizer(long j) {
        if (AudioAttributesImplApi21Parcelizer() == Long.MIN_VALUE) {
            write(j);
        }
        RemoteActionCompatParcelizer(j);
        read(false);
        SnapshotStateList<setLayoutInflater<S>.read<?, ?>> snapshotStateList = this.AudioAttributesCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).read(j);
        }
        SnapshotStateList<setLayoutInflater<?>> snapshotStateList2 = this.RemoteActionCompatParcelizer;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            setLayoutInflater<?> setlayoutinflater = snapshotStateList2.get(i2);
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setlayoutinflater.AudioAttributesImplApi26Parcelizer(), setlayoutinflater.RemoteActionCompatParcelizer())) {
                setlayoutinflater.IconCompatParcelizer(j);
            }
        }
    }

    public final void write() {
        SnapshotStateList<setLayoutInflater<S>.read<?, ?>> snapshotStateList = this.AudioAttributesCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).RemoteActionCompatParcelizer();
        }
        SnapshotStateList<setLayoutInflater<?>> snapshotStateList2 = this.RemoteActionCompatParcelizer;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).write();
        }
    }

    public final String toString() {
        List<setLayoutInflater<S>.read<?, ?>> listIconCompatParcelizer = IconCompatParcelizer();
        int size = listIconCompatParcelizer.size();
        String string = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            setLayoutInflater<S>.read<?, ?> readVar = listIconCompatParcelizer.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(readVar);
            sb.append(", ");
            string = sb.toString();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddQueueItem() {
        read(true);
        if (MediaMetadataCompat()) {
            SnapshotStateList<setLayoutInflater<S>.read<?, ?>> snapshotStateList = this.AudioAttributesCompatParcelizer;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                setLayoutInflater<S>.read<?, ?> readVar = snapshotStateList.get(i);
                readVar.IconCompatParcelizer();
                readVar.read(this.MediaBrowserCompatCustomActionResultReceiver);
            }
            read(false);
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\r\b\u0086\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0012J#\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u001aH\u0000¢\u0006\u0004\b\u0010\u0010\u001bJ-\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b \u0010!R+\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00018C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b\u001c\u0010'R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)R7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b\u0013\u0010*\"\u0004\b\u0013\u0010+RC\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020,2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020,8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010$\u001a\u0004\b\"\u0010-\"\u0004\b\u001c\u0010.R\u001e\u00103\u001a\u0004\u0018\u00010/8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R+\u00104\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010$\u001a\u0004\b4\u00106\"\u0004\b\u001c\u00107R+\u00100\u001a\u0002082\u0006\u0010\u0005\u001a\u0002088A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b3\u0010;\"\u0004\b\"\u0010<R\u0016\u0010 \u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R+\u0010#\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00018W@QX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010$\u001a\u0004\b\u0010\u0010&\"\u0004\b\u0013\u0010'R\u0016\u0010\u001e\u001a\u00028\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR+\u00109\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010B\u001a\u0004\b\u001c\u0010C\"\u0004\b\"\u0010\u0012R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010>R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010D"}, d2 = {"Lo/setLayoutInflater$read;", "T", "Lo/ScrollingTabContainerView;", "V", "Lo/parseDouble;", "p0", "p1", "Lo/evictionCount;", "p2", "", "p3", "<init>", "(Lo/setLayoutInflater;Ljava/lang/Object;Lo/ScrollingTabContainerView;Lo/evictionCount;Ljava/lang/String;)V", "", "", "", "read", "(JZ)V", "(J)V", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;Z)V", "AudioAttributesImplApi21Parcelizer", "()V", "RemoteActionCompatParcelizer", "toString", "()Ljava/lang/String;", "Lo/SwitchCompat;", "(Ljava/lang/Object;Lo/SwitchCompat;)V", "IconCompatParcelizer", "(Ljava/lang/Object;Ljava/lang/Object;Lo/SwitchCompat;)V", "MediaDescriptionCompat", "Lo/evictionCount;", "MediaBrowserCompatMediaItem", "Ljava/lang/String;", "write", "MediaMetadataCompat", "Lo/InputAccessor;", "AudioAttributesImplBaseParcelizer", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "Lo/setNavigationOnClickListener;", "Lo/setNavigationOnClickListener;", "()Lo/SwitchCompat;", "(Lo/SwitchCompat;)V", "Lo/setLayoutResource;", "()Lo/setLayoutResource;", "(Lo/setLayoutResource;)V", "Lo/setContentInsetEndWithActions$RemoteActionCompatParcelizer;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setContentInsetEndWithActions$RemoteActionCompatParcelizer;", "()Lo/setContentInsetEndWithActions$RemoteActionCompatParcelizer;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "Lo/setLayoutResource;", "()Z", "(Z)V", "", "RatingCompat", "Lo/nextTokenToRead;", "()F", "(F)V", "MediaBrowserCompatSearchResultReceiver", "Z", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCommand", "Lo/ScrollingTabContainerView;", "Lo/InputAccessorStd;", "()J", "Lo/SwitchCompat;", "onCustomAction"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class read<T, V extends ScrollingTabContainerView> implements parseDouble<T> {
        private final InputAccessor AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private final SwitchCompat<T> onCustomAction;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private boolean MediaBrowserCompatSearchResultReceiver;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private final InputAccessor MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final InputAccessorStd RatingCompat;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private setContentInsetEndWithActions.RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private setLayoutResource<T, V> AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
        private final String write;

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
        private boolean MediaBrowserCompatMediaItem;

        /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
        private final InputAccessor MediaMetadataCompat;

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
        private final evictionCount<T, V> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
        private final InputAccessor IconCompatParcelizer;

        /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
        private final nextTokenToRead MediaBrowserCompatCustomActionResultReceiver;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final setNavigationOnClickListener<T> read;

        /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
        private V MediaDescriptionCompat;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final InputAccessor AudioAttributesImplBaseParcelizer;

        public read(T t, V v, evictionCount<T, V> evictioncount, String str) {
            T tInvoke;
            this.RemoteActionCompatParcelizer = evictioncount;
            this.write = str;
            this.IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(t, null, 2, null);
            setNavigationOnClickListener<T> setnavigationonclicklistenerWrite$default = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
            this.read = setnavigationonclicklistenerWrite$default;
            this.AudioAttributesCompatParcelizer = available.RemoteActionCompatParcelizer$default(setnavigationonclicklistenerWrite$default, null, 2, null);
            this.AudioAttributesImplBaseParcelizer = available.RemoteActionCompatParcelizer$default(new setLayoutResource(AudioAttributesCompatParcelizer(), evictioncount, t, AudioAttributesImplBaseParcelizer(), v), null, 2, null);
            this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(Boolean.TRUE, null, 2, null);
            this.MediaBrowserCompatCustomActionResultReceiver = getInputCodeUtf8.AudioAttributesCompatParcelizer(-1.0f);
            this.MediaMetadataCompat = available.RemoteActionCompatParcelizer$default(t, null, 2, null);
            this.MediaDescriptionCompat = v;
            this.RatingCompat = _appendNamed.AudioAttributesCompatParcelizer(write().getAudioAttributesImplBaseParcelizer());
            Float f = setInvalidated.AudioAttributesCompatParcelizer().get(evictioncount);
            if (f != null) {
                float fFloatValue = f.floatValue();
                V vInvoke = evictioncount.RemoteActionCompatParcelizer().invoke(t);
                int iconCompatParcelizer = vInvoke.getIconCompatParcelizer();
                for (int i = 0; i < iconCompatParcelizer; i++) {
                    vInvoke.IconCompatParcelizer(i, fFloatValue);
                }
                tInvoke = this.RemoteActionCompatParcelizer.read().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.onCustomAction = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, tInvoke, 3, null);
        }

        private final T AudioAttributesImplBaseParcelizer() {
            return this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
        }

        private final void IconCompatParcelizer(T t) {
            this.IconCompatParcelizer.write(t);
        }

        private final void AudioAttributesCompatParcelizer(SwitchCompat<T> switchCompat) {
            this.AudioAttributesCompatParcelizer.write(switchCompat);
        }

        public final SwitchCompat<T> AudioAttributesCompatParcelizer() {
            return (SwitchCompat) this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        }

        private final void IconCompatParcelizer(setLayoutResource<T, V> setlayoutresource) {
            this.AudioAttributesImplBaseParcelizer.write(setlayoutresource);
        }

        public final setLayoutResource<T, V> write() {
            return (setLayoutResource) this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer();
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
        public final setContentInsetEndWithActions.RemoteActionCompatParcelizer getAudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final void IconCompatParcelizer(boolean z) {
            this.MediaBrowserCompatItemReceiver.write(Boolean.valueOf(z));
        }

        public final boolean MediaBrowserCompatItemReceiver() {
            return ((Boolean) this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer()).booleanValue();
        }

        public final float AudioAttributesImplApi26Parcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
        }

        public final void write(float f) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(f);
        }

        public final void AudioAttributesCompatParcelizer(T t) {
            this.MediaMetadataCompat.write(t);
        }

        @Override // kotlin.parseDouble
        /* JADX INFO: renamed from: read */
        public final T getRemoteActionCompatParcelizer() {
            return this.MediaMetadataCompat.getRemoteActionCompatParcelizer();
        }

        public final long IconCompatParcelizer() {
            return this.RatingCompat.AudioAttributesCompatParcelizer();
        }

        public final void write(long j) {
            this.RatingCompat.AudioAttributesCompatParcelizer(j);
        }

        public final void read(long p0, boolean p1) {
            if (p1) {
                p0 = write().getAudioAttributesImplBaseParcelizer();
            }
            AudioAttributesCompatParcelizer(write().read(p0));
            this.MediaDescriptionCompat = (V) write().IconCompatParcelizer(p0);
            if (write().write(p0)) {
                IconCompatParcelizer(true);
            }
        }

        public final void read(long p0) {
            if (AudioAttributesImplApi26Parcelizer() == -1.0f) {
                this.MediaBrowserCompatSearchResultReceiver = true;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write().RemoteActionCompatParcelizer(), write().AudioAttributesCompatParcelizer())) {
                    AudioAttributesCompatParcelizer(write().RemoteActionCompatParcelizer());
                } else {
                    AudioAttributesCompatParcelizer(write().read(p0));
                    this.MediaDescriptionCompat = (V) write().IconCompatParcelizer(p0);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void AudioAttributesCompatParcelizer$default(read readVar, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = readVar.getRemoteActionCompatParcelizer();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            readVar.AudioAttributesCompatParcelizer(obj, z);
        }

        private final void AudioAttributesCompatParcelizer(T p0, boolean p1) {
            SwitchCompat<T> switchCompatIconCompatParcelizer;
            setLayoutResource<T, V> setlayoutresource = this.AudioAttributesImplApi21Parcelizer;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setlayoutresource != null ? setlayoutresource.RemoteActionCompatParcelizer() : null, AudioAttributesImplBaseParcelizer())) {
                IconCompatParcelizer((setLayoutResource) new setLayoutResource<>(this.onCustomAction, this.RemoteActionCompatParcelizer, p0, p0, SearchView.IconCompatParcelizer(this.MediaDescriptionCompat)));
                this.MediaBrowserCompatMediaItem = true;
                write(write().getAudioAttributesImplBaseParcelizer());
                return;
            }
            SwitchCompat<T> switchCompatAudioAttributesCompatParcelizer = (!p1 || this.MediaBrowserCompatSearchResultReceiver || (AudioAttributesCompatParcelizer() instanceof setNavigationOnClickListener)) ? AudioAttributesCompatParcelizer() : this.onCustomAction;
            if (setLayoutInflater.this.MediaBrowserCompatCustomActionResultReceiver() <= 0) {
                switchCompatIconCompatParcelizer = switchCompatAudioAttributesCompatParcelizer;
            } else {
                switchCompatIconCompatParcelizer = setVerticalGravity.IconCompatParcelizer(switchCompatAudioAttributesCompatParcelizer, setLayoutInflater.this.MediaBrowserCompatCustomActionResultReceiver());
            }
            IconCompatParcelizer((setLayoutResource) new setLayoutResource<>(switchCompatIconCompatParcelizer, this.RemoteActionCompatParcelizer, p0, AudioAttributesImplBaseParcelizer(), this.MediaDescriptionCompat));
            write(write().getAudioAttributesImplBaseParcelizer());
            this.MediaBrowserCompatMediaItem = false;
            setLayoutInflater.this.onAddQueueItem();
        }

        public final void AudioAttributesImplApi21Parcelizer() {
            write(-2.0f);
        }

        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesImplApi21Parcelizer = null;
            this.AudioAttributesImplApi26Parcelizer = null;
            this.MediaBrowserCompatMediaItem = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("current value: ");
            sb.append(getRemoteActionCompatParcelizer());
            sb.append(", target: ");
            sb.append(AudioAttributesImplBaseParcelizer());
            sb.append(", spec: ");
            sb.append(AudioAttributesCompatParcelizer());
            return sb.toString();
        }

        public final void read(T p0, SwitchCompat<T> p1) {
            if (this.MediaBrowserCompatMediaItem) {
                setLayoutResource<T, V> setlayoutresource = this.AudioAttributesImplApi21Parcelizer;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setlayoutresource != null ? setlayoutresource.RemoteActionCompatParcelizer() : null)) {
                    return;
                }
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(), p0) && AudioAttributesImplApi26Parcelizer() == -1.0f) {
                return;
            }
            IconCompatParcelizer(p0);
            AudioAttributesCompatParcelizer((SwitchCompat) p1);
            AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer() == -3.0f ? p0 : getRemoteActionCompatParcelizer(), !MediaBrowserCompatItemReceiver());
            IconCompatParcelizer(AudioAttributesImplApi26Parcelizer() == -3.0f);
            if (AudioAttributesImplApi26Parcelizer() >= BitmapDescriptorFactory.HUE_RED) {
                AudioAttributesCompatParcelizer(write().read((long) (write().getAudioAttributesImplBaseParcelizer() * AudioAttributesImplApi26Parcelizer())));
            } else if (AudioAttributesImplApi26Parcelizer() == -3.0f) {
                AudioAttributesCompatParcelizer(p0);
            }
            this.MediaBrowserCompatMediaItem = false;
            write(-1.0f);
        }

        public final void IconCompatParcelizer(T p0, T p1, SwitchCompat<T> p2) {
            IconCompatParcelizer(p1);
            AudioAttributesCompatParcelizer((SwitchCompat) p2);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write().AudioAttributesCompatParcelizer(), p0) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write().RemoteActionCompatParcelizer(), p1)) {
                return;
            }
            AudioAttributesCompatParcelizer$default(this, p0, false, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00028\u00018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00028\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Lo/setLayoutInflater$AudioAttributesCompatParcelizer;", "S", "Lo/setLayoutInflater$write;", "p0", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "Ljava/lang/Object;", "write", "()Ljava/lang/Object;", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer<S> implements write<S> {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final S read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final S AudioAttributesCompatParcelizer;

        public AudioAttributesCompatParcelizer(S s, S s2) {
            this.read = s;
            this.AudioAttributesCompatParcelizer = s2;
        }

        @Override // o.setLayoutInflater.write
        public final S RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o.setLayoutInflater.write
        public final S write() {
            return this.read;
        }

        public final boolean equals(Object p0) {
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write(), writeVar.write()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), writeVar.RemoteActionCompatParcelizer());
        }

        public final int hashCode() {
            S sWrite = write();
            int iHashCode = sWrite != null ? sWrite.hashCode() : 0;
            S sRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            return (iHashCode * 31) + (sRemoteActionCompatParcelizer != null ? sRemoteActionCompatParcelizer.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H¦\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00028\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00028\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/setLayoutInflater$write;", "S", "", "p0", "", "IconCompatParcelizer", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "write", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface write<S> {
        S RemoteActionCompatParcelizer();

        S write();

        default boolean IconCompatParcelizer(S s, S s2) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(s, write()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(s2, RemoteActionCompatParcelizer());
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0016B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u001e\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u000f\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u000f\u0010\u0012R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R{\u0010\u0019\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0017R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u00182.\u0010\u0006\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0017R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u00188A@AX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b\"\u0004\b\u0016\u0010\u001c"}, d2 = {"Lo/setLayoutInflater$IconCompatParcelizer;", "T", "Lo/ScrollingTabContainerView;", "V", "", "Lo/evictionCount;", "p0", "", "p1", "<init>", "(Lo/setLayoutInflater;Lo/evictionCount;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lo/setLayoutInflater$write;", "Lo/SwitchCompat;", "Lo/parseDouble;", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;Lo/getAnswerMap;)Lo/parseDouble;", "", "()V", "Lo/evictionCount;", "read", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/setLayoutInflater$IconCompatParcelizer$RemoteActionCompatParcelizer;", "Lo/setLayoutInflater;", "write", "Lo/InputAccessor;", "()Lo/setLayoutInflater$IconCompatParcelizer$RemoteActionCompatParcelizer;", "(Lo/setLayoutInflater$IconCompatParcelizer$RemoteActionCompatParcelizer;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class IconCompatParcelizer<T, V extends ScrollingTabContainerView> {
        private final evictionCount<T, V> AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final String RemoteActionCompatParcelizer;
        private final InputAccessor write = available.RemoteActionCompatParcelizer$default(null, null, 2, null);

        public IconCompatParcelizer(evictionCount<T, V> evictioncount, String str) {
            this.AudioAttributesCompatParcelizer = evictioncount;
            this.RemoteActionCompatParcelizer = str;
        }

        public final void RemoteActionCompatParcelizer(setLayoutInflater<S>.RemoteActionCompatParcelizer<T, V>.RemoteActionCompatParcelizer<T, V> remoteActionCompatParcelizer) {
            this.write.write(remoteActionCompatParcelizer);
        }

        public final setLayoutInflater<S>.RemoteActionCompatParcelizer<T, V>.RemoteActionCompatParcelizer<T, V> read() {
            return (RemoteActionCompatParcelizer) this.write.getRemoteActionCompatParcelizer();
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004BY\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0010\u0010\u0011R-\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R:\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0012\u0010\u0019R.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0010\u0010\u0018\"\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001b\u001a\u00028\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a"}, d2 = {"Lo/setLayoutInflater$IconCompatParcelizer$RemoteActionCompatParcelizer;", "T", "Lo/ScrollingTabContainerView;", "V", "Lo/parseDouble;", "Lo/setLayoutInflater$read;", "Lo/setLayoutInflater;", "p0", "Lkotlin/Function1;", "Lo/setLayoutInflater$write;", "Lo/SwitchCompat;", "p1", "p2", "<init>", "(Lo/setLayoutInflater$IconCompatParcelizer;Lo/setLayoutInflater$read;Lo/getAnswerMap;Lo/getAnswerMap;)V", "", "AudioAttributesCompatParcelizer", "(Lo/setLayoutInflater$write;)V", "IconCompatParcelizer", "Lo/setLayoutInflater$read;", "()Lo/setLayoutInflater$read;", "read", "Lo/getAnswerMap;", "RemoteActionCompatParcelizer", "()Lo/getAnswerMap;", "(Lo/getAnswerMap;)V", "()Ljava/lang/Object;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class RemoteActionCompatParcelizer<T, V extends ScrollingTabContainerView> implements parseDouble<T> {

            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
            private getAnswerMap<? super S, ? extends T> IconCompatParcelizer;

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
            private final setLayoutInflater<S>.read<T, V> AudioAttributesCompatParcelizer;

            /* JADX INFO: renamed from: read, reason: from kotlin metadata */
            private getAnswerMap<? super write<S>, ? extends SwitchCompat<T>> RemoteActionCompatParcelizer;

            public RemoteActionCompatParcelizer(setLayoutInflater<S>.read<T, V> readVar, getAnswerMap<? super write<S>, ? extends SwitchCompat<T>> getanswermap, getAnswerMap<? super S, ? extends T> getanswermap2) {
                this.AudioAttributesCompatParcelizer = readVar;
                this.RemoteActionCompatParcelizer = getanswermap;
                this.IconCompatParcelizer = getanswermap2;
            }

            public final setLayoutInflater<S>.read<T, V> IconCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            public final void IconCompatParcelizer(getAnswerMap<? super write<S>, ? extends SwitchCompat<T>> getanswermap) {
                this.RemoteActionCompatParcelizer = getanswermap;
            }

            public final getAnswerMap<write<S>, SwitchCompat<T>> RemoteActionCompatParcelizer() {
                return this.RemoteActionCompatParcelizer;
            }

            public final getAnswerMap<S, T> AudioAttributesCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public final void read(getAnswerMap<? super S, ? extends T> getanswermap) {
                this.IconCompatParcelizer = getanswermap;
            }

            public final void AudioAttributesCompatParcelizer(write<S> p0) {
                T tInvoke = this.IconCompatParcelizer.invoke(p0.RemoteActionCompatParcelizer());
                if (setLayoutInflater.this.MediaMetadataCompat()) {
                    this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer.invoke(p0.write()), tInvoke, this.RemoteActionCompatParcelizer.invoke(p0));
                } else {
                    this.AudioAttributesCompatParcelizer.read(tInvoke, this.RemoteActionCompatParcelizer.invoke(p0));
                }
            }

            @Override // kotlin.parseDouble
            /* JADX INFO: renamed from: read */
            public final T getRemoteActionCompatParcelizer() {
                AudioAttributesCompatParcelizer(setLayoutInflater.this.AudioAttributesImplBaseParcelizer());
                return this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
            }
        }

        public final parseDouble<T> AudioAttributesCompatParcelizer(getAnswerMap<? super write<S>, ? extends SwitchCompat<T>> p0, getAnswerMap<? super S, ? extends T> p1) {
            setLayoutInflater<S>.RemoteActionCompatParcelizer<T, V>.RemoteActionCompatParcelizer<T, V> remoteActionCompatParcelizer = read();
            if (remoteActionCompatParcelizer == null) {
                setLayoutInflater<S> setlayoutinflater = setLayoutInflater.this;
                setLayoutInflater<S>.RemoteActionCompatParcelizer<T, V>.RemoteActionCompatParcelizer<T, V> remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer<>(setlayoutinflater.new read(p1.invoke(setlayoutinflater.RemoteActionCompatParcelizer()), setAllowCollapse.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, p1.invoke(setLayoutInflater.this.RemoteActionCompatParcelizer())), this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer), p0, p1);
                setLayoutInflater<S> setlayoutinflater2 = setLayoutInflater.this;
                RemoteActionCompatParcelizer(remoteActionCompatParcelizer2);
                setlayoutinflater2.write(remoteActionCompatParcelizer2.IconCompatParcelizer());
                remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
            }
            setLayoutInflater<S> setlayoutinflater3 = setLayoutInflater.this;
            remoteActionCompatParcelizer.read(p1);
            remoteActionCompatParcelizer.IconCompatParcelizer(p0);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(setlayoutinflater3.AudioAttributesImplBaseParcelizer());
            return remoteActionCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer() {
            setLayoutInflater<S>.RemoteActionCompatParcelizer<T, V>.RemoteActionCompatParcelizer<T, V> remoteActionCompatParcelizer = read();
            if (remoteActionCompatParcelizer != null) {
                setLayoutInflater<S> setlayoutinflater = setLayoutInflater.this;
                remoteActionCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer().invoke(setlayoutinflater.AudioAttributesImplBaseParcelizer().write()), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer().invoke(setlayoutinflater.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer()), remoteActionCompatParcelizer.RemoteActionCompatParcelizer().invoke(setlayoutinflater.AudioAttributesImplBaseParcelizer()));
            }
        }
    }

    public final void IconCompatParcelizer(setLayoutInflater<S>.IconCompatParcelizer<?, ?> iconCompatParcelizer) {
        setLayoutInflater<S>.read<?, ?> readVarIconCompatParcelizer;
        setLayoutInflater<S>.RemoteActionCompatParcelizer<?, ?>.RemoteActionCompatParcelizer<?, V> remoteActionCompatParcelizer = iconCompatParcelizer.read();
        if (remoteActionCompatParcelizer == 0 || (readVarIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer()) == null) {
            return;
        }
        IconCompatParcelizer((read) readVarIconCompatParcelizer);
    }

    private static final boolean read(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setLayoutInflater setlayoutinflater, Object obj, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        setlayoutinflater.AudioAttributesCompatParcelizer(obj, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
