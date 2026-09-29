package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin.setLayoutInflater;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003VWXB'\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u001a\u001a\u00020\u001b*\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0004JH\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u00103\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108JH\u00109\u001a\u00020:2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u001bH\u0001¢\u0006\u0004\bT\u0010UR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010-\u001a\u00020.*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0018\u00101\u001a\u00020.*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R+\u0010?\u001a\u0002052\u0006\u0010>\u001a\u0002058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR&\u0010F\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002050H0GX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\"\u0010K\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010HX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u00106\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010A¨\u0006Y²\u0006\n\u0010Z\u001a\u00020.X\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "transition", "Landroidx/compose/animation/core/Transition;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "getTransition$animation", "()Landroidx/compose/animation/core/Transition;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "setContentAlignment", "(Landroidx/compose/ui/Alignment;)V", "getLayoutDirection$animation", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "initialState", "getInitialState", "()Ljava/lang/Object;", "targetState", "getTargetState", "using", "Landroidx/compose/animation/ContentTransform;", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "isLeft", "", "isLeft-gWo6LJ4", "(I)Z", "isRight", "isRight-gWo6LJ4", "calculateOffset", "fullSize", "Landroidx/compose/ui/unit/IntSize;", "currentSize", "calculateOffset-emnUabE", "(JJ)J", "slideOutOfContainer", "Landroidx/compose/animation/ExitTransition;", "targetOffset", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "<set-?>", "measuredSize", "getMeasuredSize-YbymL2g$animation", "()J", "setMeasuredSize-ozmzZPI$animation", "(J)V", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "targetSizeMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/State;", "getTargetSizeMap$animation", "()Landroidx/collection/MutableScatterMap;", "animatedSize", "getAnimatedSize$animation", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation", "(Landroidx/compose/runtime/State;)V", "getCurrentSize-YbymL2g", "createSizeAnimationModifier", "Landroidx/compose/ui/Modifier;", "contentTransform", "createSizeAnimationModifier$animation", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "ChildData", "SizeModifierElement", "SizeModifierNode", "animation", "shouldAnimateSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setSupportImageTintList<S> implements setImageLevel<S> {
    private _skipWSOrEnd AudioAttributesCompatParcelizer;
    private final setLayoutInflater<S> AudioAttributesImplApi26Parcelizer;
    private parseDouble<getKey> RemoteActionCompatParcelizer;
    private tryToResolveUnresolved write;
    private final InputAccessor IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(getKey.AudioAttributesCompatParcelizer(getKey.INSTANCE.RemoteActionCompatParcelizer()), null, 2, null);
    private final setKeyListener<S, parseDouble<getKey>> read = setAutoSizeTextTypeUniformWithPresetSizes.read();

    public setSupportImageTintList(setLayoutInflater<S> setlayoutinflater, _skipWSOrEnd _skipwsorend, tryToResolveUnresolved trytoresolveunresolved) {
        this.AudioAttributesImplApi26Parcelizer = setlayoutinflater;
        this.AudioAttributesCompatParcelizer = _skipwsorend;
        this.write = trytoresolveunresolved;
    }

    public final void AudioAttributesCompatParcelizer(_skipWSOrEnd _skipwsorend) {
        this.AudioAttributesCompatParcelizer = _skipwsorend;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final _skipWSOrEnd getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(tryToResolveUnresolved trytoresolveunresolved) {
        this.write = trytoresolveunresolved;
    }

    @Override // o.setLayoutInflater.write
    public final S write() {
        return this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer().write();
    }

    @Override // o.setLayoutInflater.write
    public final S RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setImageLevel
    public final AppCompatSeekBar RemoteActionCompatParcelizer(AppCompatSeekBar appCompatSeekBar, setPrecomputedText setprecomputedtext) {
        appCompatSeekBar.AudioAttributesCompatParcelizer(setprecomputedtext);
        return appCompatSeekBar;
    }

    public final void read(long j) {
        this.IconCompatParcelizer.write(getKey.AudioAttributesCompatParcelizer(j));
    }

    public final setKeyListener<S, parseDouble<getKey>> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final void read(parseDouble<getKey> parsedouble) {
        this.RemoteActionCompatParcelizer = parsedouble;
    }

    public final _handleOddName AudioAttributesCompatParcelizer(AppCompatSeekBar appCompatSeekBar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleOddName.Companion companion;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:557)");
        }
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(this);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        setLayoutInflater.IconCompatParcelizer iconCompatParcelizerWrite = null;
        if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        InputAccessor inputAccessor = (InputAccessor) objOnPause;
        parseDouble parsedouble = _qbuf.read(appCompatSeekBar.getIconCompatParcelizer(), _handleunrecognizedcharacterescape, 0);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer())) {
            RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, false);
        } else if (parsedouble.getRemoteActionCompatParcelizer() != null) {
            RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, true);
        }
        if (write(inputAccessor)) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1353077497);
            iconCompatParcelizerWrite = setCardElevation.write(this.AudioAttributesImplApi26Parcelizer, hitCount.IconCompatParcelizer(getKey.INSTANCE), null, _handleunrecognizedcharacterescape, 0, 2);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(iconCompatParcelizerWrite);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                setPrecomputedText setprecomputedtext = (setPrecomputedText) parsedouble.getRemoteActionCompatParcelizer();
                objOnPause2 = (setprecomputedtext == null || setprecomputedtext.getRead()) ? _handleUnexpectedValue.RemoteActionCompatParcelizer(_handleOddName.INSTANCE) : (_handleOddName) _handleOddName.INSTANCE;
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            companion = (_handleOddName) objOnPause2;
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1353343539);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            this.RemoteActionCompatParcelizer = null;
            companion = _handleOddName.INSTANCE;
        }
        _handleOddName _handleoddnameAudioAttributesCompatParcelizer = companion.AudioAttributesCompatParcelizer(new AudioAttributesCompatParcelizer(iconCompatParcelizerWrite, parsedouble, this));
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return _handleoddnameAudioAttributesCompatParcelizer;
    }

    private static final boolean write(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\n\u0010\u0005"}, d2 = {"Lo/setSupportImageTintList$write;", "Lo/unwrappingDeserializer;", "", "p0", "<init>", "(Z)V", "Lo/bufferMapProperty;", "", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;Ljava/lang/Object;)Ljava/lang/Object;", "write", "Lo/InputAccessor;", "AudioAttributesCompatParcelizer", "()Z", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements unwrappingDeserializer {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final InputAccessor IconCompatParcelizer;

        @Override // kotlin.unwrappingDeserializer
        public final Object RemoteActionCompatParcelizer(bufferMapProperty buffermapproperty, Object obj) {
            return this;
        }

        public write(boolean z) {
            this.IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(Boolean.valueOf(z), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean AudioAttributesCompatParcelizer() {
            return ((Boolean) this.IconCompatParcelizer.getRemoteActionCompatParcelizer()).booleanValue();
        }

        public final void write(boolean z) {
            this.IconCompatParcelizer.write(Boolean.valueOf(z));
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002BE\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\b\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR)\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lo/setSupportImageTintList$AudioAttributesCompatParcelizer;", "S", "Lo/writerFor;", "Lo/setSupportImageTintList$RemoteActionCompatParcelizer;", "Lo/setLayoutInflater$IconCompatParcelizer;", "Lo/getKey;", "Lo/MenuPopupWindowMenuDropDownListView;", "Lo/setLayoutInflater;", "p0", "Lo/parseDouble;", "Lo/setPrecomputedText;", "p1", "Lo/setSupportImageTintList;", "p2", "<init>", "(Lo/setLayoutInflater$IconCompatParcelizer;Lo/parseDouble;Lo/setSupportImageTintList;)V", "AudioAttributesCompatParcelizer", "()Lo/setSupportImageTintList$RemoteActionCompatParcelizer;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "write", "(Lo/setSupportImageTintList$RemoteActionCompatParcelizer;)V", "RemoteActionCompatParcelizer", "Lo/setLayoutInflater$IconCompatParcelizer;", "IconCompatParcelizer", "Lo/parseDouble;", "read", "Lo/setSupportImageTintList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer<S> extends writerFor<RemoteActionCompatParcelizer<S>> {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final parseDouble<setPrecomputedText> write;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final setLayoutInflater<S>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> IconCompatParcelizer;
        private final setSupportImageTintList<S> read;

        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesCompatParcelizer(setLayoutInflater<S>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer, parseDouble<? extends setPrecomputedText> parsedouble, setSupportImageTintList<S> setsupportimagetintlist) {
            this.IconCompatParcelizer = iconCompatParcelizer;
            this.write = parsedouble;
            this.read = setsupportimagetintlist;
        }

        @Override // kotlin.writerFor
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final RemoteActionCompatParcelizer<S> IconCompatParcelizer() {
            return new RemoteActionCompatParcelizer<>(this.IconCompatParcelizer, this.write, this.read);
        }

        public final int hashCode() {
            int iHashCode = this.read.hashCode();
            setLayoutInflater<S>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer = this.IconCompatParcelizer;
            return (((iHashCode * 31) + (iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0)) * 31) + this.write.hashCode();
        }

        public final boolean equals(Object p0) {
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer, this.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.write, this.write);
        }

        @Override // kotlin.writerFor
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final void IconCompatParcelizer(RemoteActionCompatParcelizer<S> p0) {
            p0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            p0.RemoteActionCompatParcelizer(this.write);
            p0.IconCompatParcelizer(this.read);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BE\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u000f\u001a\u00020\u0017*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u000f\u0010\u0018R4\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\"\u0004\b\u0019\u0010\u001bR*\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b\"\u0010$R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010%"}, d2 = {"Lo/setSupportImageTintList$RemoteActionCompatParcelizer;", "S", "Lo/setLastBaselineToBottomHeight;", "Lo/setLayoutInflater$IconCompatParcelizer;", "Lo/getKey;", "Lo/MenuPopupWindowMenuDropDownListView;", "Lo/setLayoutInflater;", "p0", "Lo/parseDouble;", "Lo/setPrecomputedText;", "p1", "Lo/setSupportImageTintList;", "p2", "<init>", "(Lo/setLayoutInflater$IconCompatParcelizer;Lo/parseDouble;Lo/setSupportImageTintList;)V", "read", "(J)J", "", "p_", "()V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "Lo/setLayoutInflater$IconCompatParcelizer;", "(Lo/setLayoutInflater$IconCompatParcelizer;)V", "write", "Lo/parseDouble;", "()Lo/parseDouble;", "RemoteActionCompatParcelizer", "(Lo/parseDouble;)V", "Lo/setSupportImageTintList;", "IconCompatParcelizer", "()Lo/setSupportImageTintList;", "(Lo/setSupportImageTintList;)V", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer<S> extends setLastBaselineToBottomHeight {
        private setLayoutInflater<S>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private long write = setImageBitmap.IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private setSupportImageTintList<S> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private parseDouble<? extends setPrecomputedText> read;

        public RemoteActionCompatParcelizer(setLayoutInflater<S>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer, parseDouble<? extends setPrecomputedText> parsedouble, setSupportImageTintList<S> setsupportimagetintlist) {
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
            this.read = parsedouble;
            this.RemoteActionCompatParcelizer = setsupportimagetintlist;
        }

        public final void AudioAttributesCompatParcelizer(setLayoutInflater<S>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        }

        public final parseDouble<setPrecomputedText> AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final void RemoteActionCompatParcelizer(parseDouble<? extends setPrecomputedText> parsedouble) {
            this.read = parsedouble;
        }

        public final setSupportImageTintList<S> IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void IconCompatParcelizer(setSupportImageTintList<S> setsupportimagetintlist) {
            this.RemoteActionCompatParcelizer = setsupportimagetintlist;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long read(long p0) {
            return getKey.AudioAttributesCompatParcelizer(this.write, setImageBitmap.IconCompatParcelizer) ? p0 : this.write;
        }

        @Override // o._handleOddName.IconCompatParcelizer
        public final void p_() {
            super.p_();
            this.write = setImageBitmap.IconCompatParcelizer;
        }

        @Override // kotlin._initForReading
        public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
            long j2;
            _parser _parserVarWrite = istypeorsupertypeof.write(j);
            if (withcontentvaluehandler.r_()) {
                long j3 = -1;
                j2 = getKey.read((((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) _parserVarWrite.getRemoteActionCompatParcelizer())) | (((long) _parserVarWrite.getRead()) << 32));
            } else if (this.AudioAttributesCompatParcelizer == null) {
                long j4 = -1;
                long j5 = getKey.read((((long) _parserVarWrite.getRead()) << 32) | (((long) _parserVarWrite.getRemoteActionCompatParcelizer()) & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)))));
                long j6 = -1;
                this.write = getKey.read((((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32))) & ((long) _parserVarWrite.getRemoteActionCompatParcelizer())) | (((long) _parserVarWrite.getRead()) << 32));
                j2 = j5;
            } else {
                long j7 = -1;
                long j8 = getKey.read((((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32))) & ((long) _parserVarWrite.getRemoteActionCompatParcelizer())) | (((long) _parserVarWrite.getRead()) << 32));
                setLayoutInflater<S>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(iconCompatParcelizer);
                parseDouble<getKey> parsedoubleAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer(new AnonymousClass2(this, j8), new AnonymousClass1(this, j8));
                this.RemoteActionCompatParcelizer.read(parsedoubleAudioAttributesCompatParcelizer);
                long remoteActionCompatParcelizer = parsedoubleAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
                this.write = parsedoubleAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
                j2 = remoteActionCompatParcelizer;
            }
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, (int) (j2 >> 32), (int) j2, null, new AnonymousClass3(this, _parserVarWrite, j2), 4, null);
        }

        /* JADX INFO: renamed from: o.setSupportImageTintList$RemoteActionCompatParcelizer$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "p0", "Lo/getKey;", "RemoteActionCompatParcelizer", "(Ljava/lang/Object;)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<S, getKey> {
            final /* synthetic */ long $AudioAttributesCompatParcelizer;
            final /* synthetic */ RemoteActionCompatParcelizer<S> IconCompatParcelizer;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getKey invoke(Object obj) {
                return getKey.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(obj));
            }

            public final long RemoteActionCompatParcelizer(S s) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(s, this.IconCompatParcelizer.IconCompatParcelizer().write())) {
                    return this.IconCompatParcelizer.read(this.$AudioAttributesCompatParcelizer);
                }
                parseDouble<getKey> parsedoubleAudioAttributesImplApi26Parcelizer = this.IconCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer(s);
                return parsedoubleAudioAttributesImplApi26Parcelizer != null ? parsedoubleAudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer().getRemoteActionCompatParcelizer() : getKey.INSTANCE.RemoteActionCompatParcelizer();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RemoteActionCompatParcelizer<S> remoteActionCompatParcelizer, long j) {
                super(1);
                this.IconCompatParcelizer = remoteActionCompatParcelizer;
                this.$AudioAttributesCompatParcelizer = j;
            }
        }

        /* JADX INFO: renamed from: o.setSupportImageTintList$RemoteActionCompatParcelizer$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "Lo/setLayoutInflater$write;", "Lo/SwitchCompat;", "Lo/getKey;", "AudioAttributesCompatParcelizer", "(Lo/setLayoutInflater$write;)Lo/SwitchCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<setLayoutInflater.write<S>, SwitchCompat<getKey>> {
            final /* synthetic */ long $read;
            final /* synthetic */ RemoteActionCompatParcelizer<S> RemoteActionCompatParcelizer;

            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final SwitchCompat<getKey> invoke(setLayoutInflater.write<S> writeVar) {
                long remoteActionCompatParcelizer;
                SwitchCompat<getKey> switchCompatRemoteActionCompatParcelizer;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar.write(), this.RemoteActionCompatParcelizer.IconCompatParcelizer().write())) {
                    remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.read(this.$read);
                } else {
                    parseDouble<getKey> parsedoubleAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer(writeVar.write());
                    remoteActionCompatParcelizer = parsedoubleAudioAttributesImplApi26Parcelizer != null ? parsedoubleAudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer().getRemoteActionCompatParcelizer() : getKey.INSTANCE.RemoteActionCompatParcelizer();
                }
                parseDouble<getKey> parsedoubleAudioAttributesImplApi26Parcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer(writeVar.RemoteActionCompatParcelizer());
                long remoteActionCompatParcelizer2 = parsedoubleAudioAttributesImplApi26Parcelizer2 != null ? parsedoubleAudioAttributesImplApi26Parcelizer2.getRemoteActionCompatParcelizer().getRemoteActionCompatParcelizer() : getKey.INSTANCE.RemoteActionCompatParcelizer();
                setPrecomputedText remoteActionCompatParcelizer3 = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer();
                return (remoteActionCompatParcelizer3 == null || (switchCompatRemoteActionCompatParcelizer = remoteActionCompatParcelizer3.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, remoteActionCompatParcelizer2)) == null) ? setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null) : switchCompatRemoteActionCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RemoteActionCompatParcelizer<S> remoteActionCompatParcelizer, long j) {
                super(1);
                this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
                this.$read = j;
            }
        }

        /* JADX INFO: renamed from: o.setSupportImageTintList$RemoteActionCompatParcelizer$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "read", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
            final /* synthetic */ _parser $AudioAttributesCompatParcelizer;
            final /* synthetic */ long $IconCompatParcelizer;
            final /* synthetic */ RemoteActionCompatParcelizer<S> write;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
                read(iconCompatParcelizer);
                return getShowPopup.INSTANCE;
            }

            public final void read(_parser.IconCompatParcelizer iconCompatParcelizer) {
                long j = -1;
                _parser.IconCompatParcelizer.write$default(iconCompatParcelizer, this.$AudioAttributesCompatParcelizer, this.write.IconCompatParcelizer().getAudioAttributesCompatParcelizer().IconCompatParcelizer(getKey.read((((long) this.$AudioAttributesCompatParcelizer.getRead()) << 32) | (((long) this.$AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), this.$IconCompatParcelizer, tryToResolveUnresolved.write), BitmapDescriptorFactory.HUE_RED, 2, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(RemoteActionCompatParcelizer<S> remoteActionCompatParcelizer, _parser _parserVar, long j) {
                super(1);
                this.write = remoteActionCompatParcelizer;
                this.$AudioAttributesCompatParcelizer = _parserVar;
                this.$IconCompatParcelizer = j;
            }
        }
    }

    private static final void RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }
}
