package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.mode;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0090\u0001\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\r0\u001f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b \u0010!\u001a\u0014\u0010\"\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0002\u001a-\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u001f2\u0006\u0010&\u001a\u00020\tH\u0003¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010)\u001a\u00020*2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010-\u001a\u00020.H\u0002\"\u0010\u0010/\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00101\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00102\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u00100¨\u00063²\u0006\n\u00104\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"rememberModalBottomSheetState", "Landroidx/compose/material/ModalBottomSheetState;", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "skipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "ModalBottomSheetLayout", "", "sheetContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "sheetGesturesEnabled", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "Landroidx/compose/ui/unit/Dp;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", "content", "Lkotlin/Function0;", "ModalBottomSheetLayout-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "modalBottomSheetAnchors", "Scrim", TtmlNode.ATTR_TTS_COLOR, "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "ModalBottomSheetPositionalThreshold", "F", "ModalBottomSheetVelocityThreshold", "MaxModalBottomSheetWidth", "material", "alpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class mode {
    private static final float read = assignParameter.IconCompatParcelizer(56.0f);
    private static final float AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(125.0f);
    private static final float write = assignParameter.IconCompatParcelizer(640.0f);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[getPattern.values().length];
            try {
                iArr[getPattern.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getPattern.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getPattern.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(getPattern getpattern) {
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v9 ??, still in use, count: 1, list:
          (r10v9 ?? I:java.lang.Object) from 0x00d3: INVOKE (r20v0 ?? I:o._handleUnrecognizedCharacterEscape), (r10v9 ?? I:java.lang.Object) INTERFACE call: o._handleUnrecognizedCharacterEscape.RemoteActionCompatParcelizer(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:601)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final kotlin._equal AudioAttributesCompatParcelizer(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v9 ??, still in use, count: 1, list:
          (r10v9 ?? I:java.lang.Object) from 0x00d3: INVOKE (r20v0 ?? I:o._handleUnrecognizedCharacterEscape), (r10v9 ?? I:java.lang.Object) INTERFACE call: o._handleUnrecognizedCharacterEscape.RemoteActionCompatParcelizer(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:601)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final _equal RemoteActionCompatParcelizer(getPattern getpattern, bufferMapProperty buffermapproperty, getAnswerMap getanswermap, setOrientation setorientation, boolean z) {
        return new _equal(getpattern, buffermapproperty, getanswermap, setorientation, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe  */
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
    public static final void IconCompatParcelizer(final kotlin.getModuleData<? super kotlin.DrawerLayoutLayoutParams, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r39, kotlin._handleOddName r40, kotlin._equal r41, boolean r42, kotlin.findAndAddVirtualProperties r43, float r44, long r45, long r47, long r49, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r51, kotlin._handleUnrecognizedCharacterEscape r52, final int r53, final int r54) {
        /*
            Method dump skipped, instruction units count: 1263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.mode.IconCompatParcelizer(o.getModuleData, o._handleOddName, o._equal, boolean, o.findAndAddVirtualProperties, float, long, long, long, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ _equal AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(_equal _equalVar, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = _equalVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_equal _equalVar, TopUserCompanion topUserCompanion) {
        if (_equalVar.write().IconCompatParcelizer().invoke(getPattern.AudioAttributesCompatParcelizer).booleanValue()) {
            C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new AudioAttributesCompatParcelizer(_equalVar, null), 3);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final _equal _equalVar, final TopUserCompanion topUserCompanion, getConfigOverride getconfigoverride) {
        if (_equalVar.AudioAttributesImplApi26Parcelizer()) {
            MapperBuilder.read$default(getconfigoverride, (String) null, new getCreatedOnDateMs() { // from class: o.timezone
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return Boolean.valueOf(mode.MediaBrowserCompatCustomActionResultReceiver(_equalVar, topUserCompanion));
                }
            }, 1, (Object) null);
            if (_equalVar.write().AudioAttributesCompatParcelizer() == getPattern.IconCompatParcelizer) {
                MapperBuilder.AudioAttributesImplApi26Parcelizer$default(getconfigoverride, null, new getCreatedOnDateMs() { // from class: o.without
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Boolean.valueOf(mode.AudioAttributesImplApi21Parcelizer(_equalVar, topUserCompanion));
                    }
                }, 1, null);
            } else if (_equalVar.AudioAttributesCompatParcelizer()) {
                MapperBuilder.AudioAttributesCompatParcelizer$default(getconfigoverride, (String) null, new getCreatedOnDateMs() { // from class: o.empty
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Boolean.valueOf(mode.AudioAttributesImplApi26Parcelizer(_equalVar, topUserCompanion));
                    }
                }, 1, (Object) null);
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatCustomActionResultReceiver(_equal _equalVar, TopUserCompanion topUserCompanion) {
        if (!_equalVar.write().IconCompatParcelizer().invoke(getPattern.AudioAttributesCompatParcelizer).booleanValue()) {
            return true;
        }
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new IconCompatParcelizer(_equalVar, null), 3);
        return true;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int RemoteActionCompatParcelizer;
        final /* synthetic */ _equal write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (this.write.IconCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(_equal _equalVar, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = _equalVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi21Parcelizer(_equal _equalVar, TopUserCompanion topUserCompanion) {
        if (!_equalVar.write().IconCompatParcelizer().invoke(getPattern.RemoteActionCompatParcelizer).booleanValue()) {
            return true;
        }
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new read(_equalVar, null), 3);
        return true;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ _equal RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(_equal _equalVar, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = _equalVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi26Parcelizer(_equal _equalVar, TopUserCompanion topUserCompanion) {
        if (!_equalVar.write().IconCompatParcelizer().invoke(getPattern.IconCompatParcelizer).booleanValue()) {
            return true;
        }
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new RemoteActionCompatParcelizer(_equalVar, null), 3);
        return true;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;
        final /* synthetic */ _equal write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (this.write.write(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(_equal _equalVar, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = _equalVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, final _equal _equalVar) {
        return LottieAnimationViewSavedState.read(_handleoddname, _equalVar.write(), superDispatchKeyEvent.write, new MagicModuleSubmissionRequestBody() { // from class: o.shape
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return mode.read(_equalVar, (getKey) obj, (PropertyValueAny) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair read(final _equal _equalVar, final getKey getkey, PropertyValueAny propertyValueAny) {
        final float fAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(propertyValueAny.getRead());
        copyFrom copyfromWrite = LottieAnimationViewSavedState.write(new getAnswerMap() { // from class: o.lenient
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return mode.read(fAudioAttributesImplApi21Parcelizer, _equalVar, getkey, (consumeAttributes) obj);
            }
        });
        boolean z = _equalVar.write().read().RemoteActionCompatParcelizer() > 0;
        getPattern getpatternRemoteActionCompatParcelizer = _equalVar.RemoteActionCompatParcelizer();
        if (z || !copyfromWrite.RemoteActionCompatParcelizer(getpatternRemoteActionCompatParcelizer)) {
            int i = WhenMappings.IconCompatParcelizer[_equalVar.read().ordinal()];
            if (i == 1) {
                getpatternRemoteActionCompatParcelizer = getPattern.AudioAttributesCompatParcelizer;
            } else {
                if (i != 2 && i != 3) {
                    throw new RenewEligibleCreator();
                }
                if (copyfromWrite.RemoteActionCompatParcelizer(getPattern.IconCompatParcelizer)) {
                    getpatternRemoteActionCompatParcelizer = getPattern.IconCompatParcelizer;
                } else if (copyfromWrite.RemoteActionCompatParcelizer(getPattern.RemoteActionCompatParcelizer)) {
                    getpatternRemoteActionCompatParcelizer = getPattern.RemoteActionCompatParcelizer;
                } else {
                    getpatternRemoteActionCompatParcelizer = getPattern.AudioAttributesCompatParcelizer;
                }
            }
        }
        return setAction.write(copyfromWrite, getpatternRemoteActionCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(float f, _equal _equalVar, getKey getkey, consumeAttributes consumeattributes) {
        consumeattributes.AudioAttributesCompatParcelizer(getPattern.AudioAttributesCompatParcelizer, f);
        float f2 = f / 2.0f;
        if (!_equalVar.IconCompatParcelizer() && ((int) getkey.getRemoteActionCompatParcelizer()) > f2) {
            consumeattributes.AudioAttributesCompatParcelizer(getPattern.IconCompatParcelizer, f2);
        }
        if (((int) getkey.getRemoteActionCompatParcelizer()) != 0) {
            consumeattributes.AudioAttributesCompatParcelizer(getPattern.RemoteActionCompatParcelizer, Math.max(BitmapDescriptorFactory.HUE_RED, f - ((int) getkey.getRemoteActionCompatParcelizer())));
        }
        return getShowPopup.INSTANCE;
    }

    private static final void write(final long j, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleOddName.Companion companion;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-526532668);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        int i3 = i2;
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-526532668, i3, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
            }
            if (j != 16) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-714029408);
                final parseDouble<Float> parsedouble = setHorizontalGravity.read(z ? 1.0f : BitmapDescriptorFactory.HUE_RED, new safeSizeOf(0, 0, null, 7, null), BitmapDescriptorFactory.HUE_RED, null, null, _handleunrecognizedcharacterescapeWrite, 48, 28);
                final String strAudioAttributesCompatParcelizer = getDefaultPropertyName.AudioAttributesCompatParcelizer(JsonTypeInfoNone.INSTANCE.write(), _handleunrecognizedcharacterescapeWrite, 6);
                if (z) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-713811509);
                    _handleOddName.Companion companion2 = _handleOddName.INSTANCE;
                    int i4 = i3 & 112;
                    boolean z2 = i4 == 32;
                    MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                    if (z2 || mediaBrowserCompatCustomActionResultReceiverOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        mediaBrowserCompatCustomActionResultReceiverOnPause = new MediaBrowserCompatCustomActionResultReceiver(getcreatedondatems);
                        _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiverOnPause);
                    }
                    _handleOddName _handleoddnameIconCompatParcelizer = hasSomeOfFeatures.IconCompatParcelizer(companion2, getcreatedondatems, (PointerInputEventHandler) mediaBrowserCompatCustomActionResultReceiverOnPause);
                    boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer);
                    boolean z3 = i4 == 32;
                    Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                    if ((z3 | zAudioAttributesCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause = new getAnswerMap() { // from class: o.JsonFormat
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return mode.write(strAudioAttributesCompatParcelizer, getcreatedondatems, (getConfigOverride) obj);
                            }
                        };
                        _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                    }
                    companion = withValueInstantiators.read(_handleoddnameIconCompatParcelizer, true, (getAnswerMap) objOnPause);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-713447786);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    companion = _handleOddName.INSTANCE;
                }
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null).AudioAttributesCompatParcelizer(companion);
                boolean z4 = (i3 & 14) == 4;
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedouble);
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((zAudioAttributesCompatParcelizer2 | z4) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getAnswerMap() { // from class: o.withOverrides
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return mode.read(j, parsedouble, (findSetterInfo) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                }
                setPrimaryDirectionalMotionAxisOverrider2epLt8ui.write(_handleoddnameAudioAttributesCompatParcelizer, (getAnswerMap) objOnPause2, _handleunrecognizedcharacterescapeWrite, 0);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-734934754);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.JsonFormatShape
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return mode.write(j, getcreatedondatems, z, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver implements PointerInputEventHandler {
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems, getReferencedType getreferencedtype) {
            getcreatedondatems.invoke();
            return getShowPopup.INSTANCE;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            final getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.AudioAttributesCompatParcelizer;
            Object objAudioAttributesCompatParcelizer$default = isSpanStillValid.AudioAttributesCompatParcelizer$default(handlebadmerge, null, null, null, new getAnswerMap() { // from class: o.forLeniency
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return mode.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(getcreatedondatems, (getReferencedType) obj);
                }
            }, sampleVideos, 7, null);
            return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, final getCreatedOnDateMs getcreatedondatems, getConfigOverride getconfigoverride) {
        MapperBuilder.AudioAttributesCompatParcelizer(getconfigoverride, str);
        MapperBuilder.MediaBrowserCompatItemReceiver$default(getconfigoverride, null, new getCreatedOnDateMs() { // from class: o.JsonFormatFeature
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(mode.read(getcreatedondatems));
            }
        }, 1, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(long j, parseDouble parsedouble, findSetterInfo findsetterinfo) {
        findSetterInfo.read$default(findsetterinfo, j, 0L, 0L, getQues.read(IconCompatParcelizer((parseDouble<Float>) parsedouble), BitmapDescriptorFactory.HUE_RED, 1.0f), null, null, 0, 118, null);
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ \u0010\t\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\t\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0006\u001a\u00020\u000f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0006\u0010\u0012J\u0013\u0010\f\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0012"}, d2 = {"Lo/mode$write;", "Lo/DatabindException;", "Lo/getReferencedType;", "p0", "Lo/findCoercionAction;", "p1", "read", "(JI)J", "p2", "IconCompatParcelizer", "(JJI)J", "Lo/UnsupportedTypeDeserializer;", "write", "(JLo/SampleVideos;)Ljava/lang/Object;", "(JJLo/SampleVideos;)Ljava/lang/Object;", "", "RemoteActionCompatParcelizer", "(F)J", "(J)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements DatabindException {
        final /* synthetic */ Glide<?> AudioAttributesCompatParcelizer;
        final /* synthetic */ superDispatchKeyEvent read;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class RemoteActionCompatParcelizer extends getTotalMcq {
            /* synthetic */ Object RemoteActionCompatParcelizer;
            long read;
            int write;

            RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                super(sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.RemoteActionCompatParcelizer = obj;
                this.write |= Integer.MIN_VALUE;
                return write.this.IconCompatParcelizer(0L, 0L, this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class read extends getTotalMcq {
            /* synthetic */ Object AudioAttributesCompatParcelizer;
            int IconCompatParcelizer;
            long write;

            read(SampleVideos<? super read> sampleVideos) {
                super(sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.AudioAttributesCompatParcelizer = obj;
                this.IconCompatParcelizer |= Integer.MIN_VALUE;
                return write.this.write(0L, this);
            }
        }

        write(Glide<?> glide, superDispatchKeyEvent superdispatchkeyevent) {
            this.AudioAttributesCompatParcelizer = glide;
            this.read = superdispatchkeyevent;
        }

        @Override // kotlin.DatabindException
        public final long read(long p0, int p1) {
            float fWrite = write(p0);
            if (fWrite < BitmapDescriptorFactory.HUE_RED && findCoercionAction.IconCompatParcelizer(p1, findCoercionAction.INSTANCE.AudioAttributesCompatParcelizer())) {
                return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(fWrite));
            }
            return getReferencedType.INSTANCE.write();
        }

        @Override // kotlin.DatabindException
        public final long IconCompatParcelizer(long p0, long p1, int p2) {
            if (findCoercionAction.IconCompatParcelizer(p2, findCoercionAction.INSTANCE.AudioAttributesCompatParcelizer())) {
                return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(write(p1)));
            }
            return getReferencedType.INSTANCE.write();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlin.DatabindException
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object write(long r6, kotlin.SampleVideos<? super kotlin.UnsupportedTypeDeserializer> r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof o.mode.write.read
                if (r0 == 0) goto L14
                r0 = r8
                o.mode$write$read r0 = (o.mode.write.read) r0
                int r1 = r0.IconCompatParcelizer
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r8 = r0.IconCompatParcelizer
                int r8 = r8 + r2
                r0.IconCompatParcelizer = r8
                goto L19
            L14:
                o.mode$write$read r0 = new o.mode$write$read
                r0.<init>(r8)
            L19:
                java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.IconCompatParcelizer
                r3 = 1
                if (r2 == 0) goto L34
                if (r2 != r3) goto L2c
                long r6 = r0.write
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L67
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                float r8 = r5.read(r6)
                o.Glide<?> r2 = r5.AudioAttributesCompatParcelizer
                float r2 = r2.MediaMetadataCompat()
                r4 = 0
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 >= 0) goto L61
                o.Glide<?> r4 = r5.AudioAttributesCompatParcelizer
                o.copyFrom r4 = r4.read()
                float r4 = r4.write()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L61
                o.Glide<?> r5 = r5.AudioAttributesCompatParcelizer
                r0.write = r6
                r0.IconCompatParcelizer = r3
                java.lang.Object r5 = r5.RemoteActionCompatParcelizer(r8, r0)
                if (r5 != r1) goto L67
                return r1
            L61:
                o.UnsupportedTypeDeserializer$write r5 = kotlin.UnsupportedTypeDeserializer.INSTANCE
                long r6 = r5.write()
            L67:
                o.UnsupportedTypeDeserializer r5 = kotlin.UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.mode.write.write(long, o.SampleVideos):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlin.DatabindException
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object IconCompatParcelizer(long r3, long r5, kotlin.SampleVideos<? super kotlin.UnsupportedTypeDeserializer> r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof o.mode.write.RemoteActionCompatParcelizer
                if (r3 == 0) goto L14
                r3 = r7
                o.mode$write$RemoteActionCompatParcelizer r3 = (o.mode.write.RemoteActionCompatParcelizer) r3
                int r4 = r3.write
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r4 & r0
                if (r4 == 0) goto L14
                int r4 = r3.write
                int r4 = r4 + r0
                r3.write = r4
                goto L19
            L14:
                o.mode$write$RemoteActionCompatParcelizer r3 = new o.mode$write$RemoteActionCompatParcelizer
                r3.<init>(r7)
            L19:
                java.lang.Object r4 = r3.RemoteActionCompatParcelizer
                java.lang.Object r7 = kotlin.getYear.IconCompatParcelizer()
                int r0 = r3.write
                r1 = 1
                if (r0 == 0) goto L34
                if (r0 != r1) goto L2c
                long r5 = r3.read
                kotlin.SdkPayloadData.IconCompatParcelizer(r4)
                goto L48
            L2c:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r3)
                throw r2
            L34:
                kotlin.SdkPayloadData.IconCompatParcelizer(r4)
                o.Glide<?> r4 = r2.AudioAttributesCompatParcelizer
                float r2 = r2.read(r5)
                r3.read = r5
                r3.write = r1
                java.lang.Object r2 = r4.RemoteActionCompatParcelizer(r2, r3)
                if (r2 != r7) goto L48
                return r7
            L48:
                o.UnsupportedTypeDeserializer r2 = kotlin.UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(r5)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.mode.write.IconCompatParcelizer(long, long, o.SampleVideos):java.lang.Object");
        }

        private final long RemoteActionCompatParcelizer(float f) {
            float f2 = this.read == superDispatchKeyEvent.AudioAttributesCompatParcelizer ? f : 0.0f;
            if (this.read != superDispatchKeyEvent.write) {
                f = 0.0f;
            }
            long j = -1;
            return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(f2)) << 32));
        }

        private final float read(long j) {
            return this.read == superDispatchKeyEvent.AudioAttributesCompatParcelizer ? UnsupportedTypeDeserializer.read(j) : UnsupportedTypeDeserializer.AudioAttributesCompatParcelizer(j);
        }

        private final float write(long j) {
            long j2;
            if (this.read == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
                j2 = j >> 32;
            } else {
                long j3 = -1;
                j2 = j & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)));
            }
            return Float.intBitsToFloat((int) j2);
        }
    }

    private static final DatabindException RemoteActionCompatParcelizer(Glide<?> glide, superDispatchKeyEvent superdispatchkeyevent) {
        return new write(glide, superdispatchkeyevent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getModuleData getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1557535116, i, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getmoduledata.AudioAttributesCompatParcelizer(DrawerLayoutSavedState.INSTANCE, _handleunrecognizedcharacterescape, 6);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final float IconCompatParcelizer(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getModuleData getmoduledata, _handleOddName _handleoddname, _equal _equalVar, boolean z, findAndAddVirtualProperties findandaddvirtualproperties, float f, long j, long j2, long j3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        IconCompatParcelizer(getmoduledata, _handleoddname, _equalVar, z, findandaddvirtualproperties, f, j, j2, j3, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(long j, getCreatedOnDateMs getcreatedondatems, boolean z, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        write(j, getcreatedondatems, z, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
