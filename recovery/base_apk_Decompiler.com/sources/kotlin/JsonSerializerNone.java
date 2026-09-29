package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin._configureGenerator;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020\u0019H\u0016J\b\u0010-\u001a\u00020\u0019H\u0002J\r\u0010.\u001a\u00020\u0019H\u0000¢\u0006\u0002\b/J\u0006\u0010B\u001a\u00020\u0019J\u0014\u0010C\u001a\u00020\u00192\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030DH\u0002J#\u0010G\u001a\u00020H*\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u001c\u0010P\u001a\u00020Q*\u00020R2\u0006\u0010J\u001a\u00020S2\u0006\u0010T\u001a\u00020QH\u0016J\u001c\u0010U\u001a\u00020Q*\u00020R2\u0006\u0010J\u001a\u00020S2\u0006\u0010V\u001a\u00020QH\u0016J\u001c\u0010W\u001a\u00020Q*\u00020R2\u0006\u0010J\u001a\u00020S2\u0006\u0010T\u001a\u00020QH\u0016J\u001c\u0010X\u001a\u00020Q*\u00020R2\u0006\u0010J\u001a\u00020S2\u0006\u0010V\u001a\u00020QH\u0016J\f\u0010Y\u001a\u00020\u0019*\u00020ZH\u0016J\f\u0010[\u001a\u00020\u0019*\u00020\\H\u0016J'\u0010]\u001a\u00020\u00192\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020cH\u0016¢\u0006\u0004\bd\u0010eJ\b\u0010f\u001a\u00020\u0019H\u0016J\b\u0010g\u001a\u00020\u0019H\u0016J\b\u0010h\u001a\u00020\u001eH\u0016J\b\u0010i\u001a\u00020\u001eH\u0016J\u0018\u0010j\u001a\u0004\u0018\u00010k*\u00020 2\b\u0010l\u001a\u0004\u0018\u00010kH\u0016J\u0010\u0010m\u001a\u00020\u00192\u0006\u0010n\u001a\u00020oH\u0016J\u0017\u0010p\u001a\u00020\u00192\u0006\u0010'\u001a\u00020cH\u0016¢\u0006\u0004\bq\u0010rJ\u0010\u0010t\u001a\u00020\u00192\u0006\u0010n\u001a\u00020oH\u0016J\u0010\u0010u\u001a\u00020\u00192\u0006\u0010v\u001a\u00020wH\u0016J\u0010\u0010x\u001a\u00020\u00192\u0006\u0010y\u001a\u00020zH\u0016J\b\u0010{\u001a\u00020|H\u0016R$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R2\u00102\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030403j\f\u0012\b\u0012\u0006\u0012\u0002\b\u000304`5X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010:\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?*\b\u0012\u0004\u0012\u0002H?048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0010\u0010s\u001a\u0004\u0018\u00010oX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006}"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "Landroidx/compose/ui/Modifier$Node;", "element", "Landroidx/compose/ui/Modifier$Element;", "<init>", "(Landroidx/compose/ui/Modifier$Element;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getElement", "()Landroidx/compose/ui/Modifier$Element;", "setElement", "onAttach", "", "onDetach", "unInitializeModifier", "initializeModifier", "duringAttach", "", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "invalidateCache", "onMeasureResultChanged", "updateDrawCache", "onDrawCacheReadsChanged", "onDrawCacheReadsChanged$ui", "_providedValues", "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "readValues", "Ljava/util/HashSet;", "Landroidx/compose/ui/modifier/ModifierLocal;", "Lkotlin/collections/HashSet;", "getReadValues", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "current", "T", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "updateModifierLocalConsumer", "updateModifierLocalProvider", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "isValidOwnerScope", "()Z", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicWidth", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicHeight", "width", "maxIntrinsicWidth", "maxIntrinsicHeight", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onDensityChange", "onCancelPointerInput", "sharePointerInputWithSiblings", "interceptOutOfBoundsChildEvents", "modifyParentData", "", "parentData", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onRemeasured", "onRemeasured-ozmzZPI", "(J)V", "lastOnPlacedCoordinates", "onPlaced", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "applyFocusProperties", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "toString", "", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonSerializerNone extends _handleOddName.IconCompatParcelizer implements _initForReading, addKeySerializers, hasIndex, forRootType, JsonSerializer, ObjectWriterPrefetch, _writeCloseable, insertAnnotationIntrospector, ByteQuadsCanonicalizer, _reportTooManyCollisions, totalCount, createDummyDeserializationContext, parseName {
    private isAbstract AudioAttributesCompatParcelizer;
    private longValue IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private _handleOddName.RemoteActionCompatParcelizer read;
    private HashSet<JsonSerializable<?>> write;

    public JsonSerializerNone(_handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        read(_findTreeDeserializer.IconCompatParcelizer(remoteActionCompatParcelizer));
        this.read = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = true;
        this.write = new HashSet<>();
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final _handleOddName.RemoteActionCompatParcelizer getRead() {
        return this.read;
    }

    public final void AudioAttributesCompatParcelizer(_handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (getRatingCompat()) {
            onSetCaptioningEnabled();
        }
        this.read = remoteActionCompatParcelizer;
        read(_findTreeDeserializer.IconCompatParcelizer(remoteActionCompatParcelizer));
        if (getRatingCompat()) {
            IconCompatParcelizer(false);
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        IconCompatParcelizer(true);
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        onSetCaptioningEnabled();
    }

    private final void onSetCaptioningEnabled() {
        if (!getRatingCompat()) {
            reportWrongTokenException.read("unInitializeModifier called on unattached node");
        }
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        JsonSerializerNone jsonSerializerNone = this;
        if ((_bind.write(32) & jsonSerializerNone.getWrite()) != 0) {
            if (remoteActionCompatParcelizer instanceof isUnwrappingSerializer) {
                collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).getR8lambdaKUbBm7ckfqTc9QCgukC86fguu4().AudioAttributesCompatParcelizer(this, ((isUnwrappingSerializer) remoteActionCompatParcelizer).AudioAttributesCompatParcelizer());
            }
            if (remoteActionCompatParcelizer instanceof serializeWithType) {
                ((serializeWithType) remoteActionCompatParcelizer).read(deserializeKey.AudioAttributesCompatParcelizer);
            }
        }
        if ((jsonSerializerNone.getWrite() & _bind.write(8)) != 0) {
            collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).onPrepareFromUri();
        }
        if (remoteActionCompatParcelizer instanceof primaryCount) {
            ((primaryCount) remoteActionCompatParcelizer).read().IconCompatParcelizer().IconCompatParcelizer(this);
        }
    }

    private final void IconCompatParcelizer(boolean z) {
        if (!getRatingCompat()) {
            reportWrongTokenException.read("initializeModifier called on unattached node");
        }
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        JsonSerializerNone jsonSerializerNone = this;
        if ((_bind.write(32) & jsonSerializerNone.getWrite()) != 0) {
            if (remoteActionCompatParcelizer instanceof serializeWithType) {
                RemoteActionCompatParcelizer(new AnonymousClass1());
            }
            if (remoteActionCompatParcelizer instanceof isUnwrappingSerializer) {
                RemoteActionCompatParcelizer((isUnwrappingSerializer<?>) remoteActionCompatParcelizer);
            }
        }
        if ((_bind.write(4) & jsonSerializerNone.getWrite()) != 0) {
            if (remoteActionCompatParcelizer instanceof parseLongName) {
                this.RemoteActionCompatParcelizer = true;
            }
            if (!z) {
                _newReader.AudioAttributesCompatParcelizer(this);
            }
        }
        if ((_bind.write(2) & jsonSerializerNone.getWrite()) != 0) {
            if (deserializeKey.AudioAttributesCompatParcelizer(this)) {
                _bindAndClose audioAttributesImplApi21Parcelizer = getAudioAttributesImplApi21Parcelizer();
                toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer);
                ((_findRootDeserializer) audioAttributesImplApi21Parcelizer).write(this);
                audioAttributesImplApi21Parcelizer.ResultReceiver();
            }
            if (!z) {
                _newReader.AudioAttributesCompatParcelizer(this);
                collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).getOnBackPressedDispatcherannotations();
            }
        }
        if (remoteActionCompatParcelizer instanceof getLocalizedMessage) {
            ((getLocalizedMessage) remoteActionCompatParcelizer).IconCompatParcelizer(collectLongDefaults.AudioAttributesImplApi26Parcelizer(this));
        }
        if ((_bind.write(128) & jsonSerializerNone.getWrite()) != 0 && (remoteActionCompatParcelizer instanceof InterfaceC0187logicalType) && deserializeKey.AudioAttributesCompatParcelizer(this)) {
            collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).getOnBackPressedDispatcherannotations();
        }
        if ((_bind.write(4194304) & jsonSerializerNone.getWrite()) != 0 && (remoteActionCompatParcelizer instanceof getNullValue)) {
            this.AudioAttributesCompatParcelizer = null;
            if (deserializeKey.AudioAttributesCompatParcelizer(this)) {
                collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).read(new write());
            }
        }
        if ((_bind.write(256) & jsonSerializerNone.getWrite()) != 0 && (remoteActionCompatParcelizer instanceof getKnownPropertyNames) && deserializeKey.AudioAttributesCompatParcelizer(this)) {
            collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).getOnBackPressedDispatcherannotations();
        }
        if (remoteActionCompatParcelizer instanceof primaryCount) {
            ((primaryCount) remoteActionCompatParcelizer).read().IconCompatParcelizer().read(this);
        }
        if ((_bind.write(16) & jsonSerializerNone.getWrite()) != 0 && (remoteActionCompatParcelizer instanceof getDatatypeFeatures)) {
            ((getDatatypeFeatures) remoteActionCompatParcelizer).getIconCompatParcelizer().read(getAudioAttributesImplApi21Parcelizer());
        }
        if ((_bind.write(8) & jsonSerializerNone.getWrite()) != 0) {
            collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).onPrepareFromUri();
        }
    }

    /* JADX INFO: renamed from: o.JsonSerializerNone$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        public final void IconCompatParcelizer() {
            JsonSerializerNone.this.onSetRating();
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        AnonymousClass1() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/JsonSerializerNone$write;", "Lo/_configureGenerator$IconCompatParcelizer;", "", "s_", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements _configureGenerator.IconCompatParcelizer {
        write() {
        }

        @Override // o._configureGenerator.IconCompatParcelizer
        public final void s_() {
            if (JsonSerializerNone.this.AudioAttributesCompatParcelizer == null) {
                JsonSerializerNone jsonSerializerNone = JsonSerializerNone.this;
                jsonSerializerNone.write(collectLongDefaults.write((Module) jsonSerializerNone, _bind.write(4194304)));
            }
        }
    }

    @Override // kotlin.parseName
    public final bufferMapProperty read() {
        return collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).getOnSkipToQueueItem();
    }

    @Override // kotlin.parseName
    public final tryToResolveUnresolved write() {
        return collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).getOnStop();
    }

    @Override // kotlin.parseName
    public final long AudioAttributesImplApi21Parcelizer() {
        return SetterlessProperty.AudioAttributesCompatParcelizer(collectLongDefaults.write((Module) this, _bind.write(128)).write());
    }

    @Override // kotlin.addKeySerializers
    public final void m_() {
        this.RemoteActionCompatParcelizer = true;
        addDeserializers.read(this);
    }

    private final void onSetPlaybackSpeed() {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        if (remoteActionCompatParcelizer instanceof parseLongName) {
            PropertyMetadata addOnNewIntentListener = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).getAddOnNewIntentListener();
            getAnswerMap getanswermap = deserializeKey.IconCompatParcelizer;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(remoteActionCompatParcelizer, this);
            addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(this, (getAnswerMap<? super JsonSerializerNone, getShowPopup>) getanswermap, anonymousClass4);
        }
        this.RemoteActionCompatParcelizer = false;
    }

    /* JADX INFO: renamed from: o.JsonSerializerNone$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ _handleOddName.RemoteActionCompatParcelizer $RemoteActionCompatParcelizer;
        final /* synthetic */ JsonSerializerNone read;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer() {
            ((parseLongName) this.$RemoteActionCompatParcelizer).IconCompatParcelizer(this.read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(_handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer, JsonSerializerNone jsonSerializerNone) {
            super(0);
            this.$RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            this.read = jsonSerializerNone;
        }
    }

    public final void onRewind() {
        this.RemoteActionCompatParcelizer = true;
        addDeserializers.read(this);
    }

    public final HashSet<JsonSerializable<?>> MediaMetadataCompat() {
        return this.write;
    }

    @Override // kotlin.JsonSerializer
    public final JsonSerializableBase RatingCompat() {
        longValue longvalue = this.IconCompatParcelizer;
        return longvalue != null ? longvalue : withFilterId.read();
    }

    public final void onSetRating() {
        if (getRatingCompat()) {
            this.write.clear();
            PropertyMetadata addOnNewIntentListener = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).getAddOnNewIntentListener();
            addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(this, (getAnswerMap<? super JsonSerializerNone, getShowPopup>) deserializeKey.read, new AnonymousClass2());
        }
    }

    /* JADX INFO: renamed from: o.JsonSerializerNone$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            _handleOddName.RemoteActionCompatParcelizer read = JsonSerializerNone.this.getRead();
            toMagicModuleMetaRepoModel.read(read, "");
            ((serializeWithType) read).read(JsonSerializerNone.this);
        }

        AnonymousClass2() {
            super(0);
        }
    }

    private final void RemoteActionCompatParcelizer(isUnwrappingSerializer<?> isunwrappingserializer) {
        longValue longvalue = this.IconCompatParcelizer;
        if (longvalue != null && longvalue.write(isunwrappingserializer.AudioAttributesCompatParcelizer())) {
            longvalue.write(isunwrappingserializer);
            collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).getR8lambdaKUbBm7ckfqTc9QCgukC86fguu4().read(this, isunwrappingserializer.AudioAttributesCompatParcelizer());
        } else {
            this.IconCompatParcelizer = new longValue(isunwrappingserializer);
            if (deserializeKey.AudioAttributesCompatParcelizer(this)) {
                collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).getR8lambdaKUbBm7ckfqTc9QCgukC86fguu4().IconCompatParcelizer(this, isunwrappingserializer.AudioAttributesCompatParcelizer());
            }
        }
    }

    @Override // kotlin.createDummyDeserializationContext
    public final boolean onRemoveQueueItem() {
        return getRatingCompat();
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return ((isJavaLangObject) remoteActionCompatParcelizer).IconCompatParcelizer(withcontentvaluehandler, istypeorsupertypeof, j);
    }

    @Override // kotlin._initForReading
    public final int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return ((isJavaLangObject) remoteActionCompatParcelizer).write(getvaluehandler, hashandlers, i);
    }

    @Override // kotlin._initForReading
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return ((isJavaLangObject) remoteActionCompatParcelizer).AudioAttributesCompatParcelizer(getvaluehandler, hashandlers, i);
    }

    @Override // kotlin._initForReading
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return ((isJavaLangObject) remoteActionCompatParcelizer).read(getvaluehandler, hashandlers, i);
    }

    @Override // kotlin._initForReading
    public final int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return ((isJavaLangObject) remoteActionCompatParcelizer).IconCompatParcelizer(getvaluehandler, hashandlers, i);
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        parseMediumName2 parsemediumname2 = (parseMediumName2) remoteActionCompatParcelizer;
        if (this.RemoteActionCompatParcelizer && (remoteActionCompatParcelizer instanceof parseLongName)) {
            onSetPlaybackSpeed();
        }
        parsemediumname2.RemoteActionCompatParcelizer(findserializer);
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        C0216valueInstantiators c0216valueInstantiatorsWrite = ((HandlerInstantiator) remoteActionCompatParcelizer).write();
        toMagicModuleMetaRepoModel.read(getconfigoverride, "");
        ((C0216valueInstantiators) getconfigoverride).AudioAttributesCompatParcelizer(c0216valueInstantiatorsWrite);
    }

    @Override // kotlin.forRootType
    public final void write(DeserializationContext deserializationContext, _shapeForToken _shapefortoken, long j) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        ((getDatatypeFeatures) remoteActionCompatParcelizer).getIconCompatParcelizer().RemoteActionCompatParcelizer(deserializationContext, _shapefortoken, j);
    }

    @Override // kotlin.Module, kotlin.forRootType
    public final void e_() {
        if (this.read instanceof getDatatypeFeatures) {
            MediaBrowserCompatMediaItem();
        }
    }

    @Override // kotlin.forRootType
    public final void MediaBrowserCompatMediaItem() {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        ((getDatatypeFeatures) remoteActionCompatParcelizer).getIconCompatParcelizer().write();
    }

    @Override // kotlin.forRootType
    public final boolean h_() {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return ((getDatatypeFeatures) remoteActionCompatParcelizer).getIconCompatParcelizer().RemoteActionCompatParcelizer();
    }

    @Override // kotlin.forRootType
    public final boolean k_() {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return ((getDatatypeFeatures) remoteActionCompatParcelizer).getIconCompatParcelizer().read();
    }

    @Override // kotlin.ObjectWriterPrefetch
    public final Object IconCompatParcelizer(bufferMapProperty buffermapproperty, Object obj) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return ((unwrappingDeserializer) remoteActionCompatParcelizer).RemoteActionCompatParcelizer(buffermapproperty, obj);
    }

    @Override // kotlin.insertAnnotationIntrospector
    public final void AudioAttributesCompatParcelizer(isAbstract isabstract) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        ((getKnownPropertyNames) remoteActionCompatParcelizer).IconCompatParcelizer(isabstract);
    }

    @Override // kotlin._writeCloseable
    public final void AudioAttributesCompatParcelizer(long j) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        if (remoteActionCompatParcelizer instanceof InterfaceC0187logicalType) {
            ((InterfaceC0187logicalType) remoteActionCompatParcelizer).read(j);
        }
    }

    @Override // kotlin._writeCloseable
    public final void write(isAbstract isabstract) {
        this.AudioAttributesCompatParcelizer = isabstract;
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        if (remoteActionCompatParcelizer instanceof getNullValue) {
            ((getNullValue) remoteActionCompatParcelizer).IconCompatParcelizer(isabstract);
        }
    }

    @Override // kotlin.ByteQuadsCanonicalizer
    public final void AudioAttributesCompatParcelizer(CharsToNameCanonicalizer charsToNameCanonicalizer) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        if (!(remoteActionCompatParcelizer instanceof _calcTertiaryShift)) {
            reportWrongTokenException.read("onFocusEvent called on wrong node");
        }
        ((_calcTertiaryShift) remoteActionCompatParcelizer).RemoteActionCompatParcelizer(charsToNameCanonicalizer);
    }

    @Override // kotlin._reportTooManyCollisions
    public final void RemoteActionCompatParcelizer(makeChild makechild) {
        _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        if (!(remoteActionCompatParcelizer instanceof _verifySharing)) {
            reportWrongTokenException.read("applyFocusProperties called on wrong node");
        }
        ((_verifySharing) remoteActionCompatParcelizer).write(new mergeChild(makechild));
    }

    public final String toString() {
        return this.read.toString();
    }
}
