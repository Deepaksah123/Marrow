package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin.setLayoutInflater;
import kotlin.setSupportImageTintList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a´\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0017\u001aP\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2>\b\u0002\u0010\u001c\u001a8\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u0014\u001a\u0015\u0010!\u001a\u00020\t*\u00020\"2\u0006\u0010#\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020\t*\u00020\"2\u0006\u0010#\u001a\u00020$H\u0087\u0004\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010)\"\u0010\u0010&\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010'¨\u0006*"}, d2 = {"AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "label", "", "contentKey", "Lkotlin/ParameterName;", "name", "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "with", "UnspecifiedSize", "J", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "animation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setImageBitmap {
    private static final long IconCompatParcelizer = getKey.read(-9223372034707292160L);

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: o.setImageBitmap$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "p0", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2<S> extends MagicModuleUseCase implements getAnswerMap<S, S> {
        public static final AnonymousClass2 write = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        public final S invoke(S s) {
            return s;
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: o.setImageBitmap$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "p0", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5<S> extends MagicModuleUseCase implements getAnswerMap<S, S> {
        public static final AnonymousClass5 read = new AnonymousClass5();

        @Override // kotlin.getAnswerMap
        public final S invoke(S s) {
            return s;
        }

        AnonymousClass5() {
            super(1);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ getAnswerMap<S, Object> AudioAttributesCompatParcelizer;
        final /* synthetic */ _handleOddName AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ getAnswerMap<setImageLevel<S>, AppCompatSeekBar> AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ String AudioAttributesImplBaseParcelizer;
        final /* synthetic */ int IconCompatParcelizer;
        final /* synthetic */ S MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        final /* synthetic */ getMagicModuleStat<setImageResource, S, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;
        final /* synthetic */ _skipWSOrEnd write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(S s, _handleOddName _handleoddname, getAnswerMap<? super setImageLevel<S>, AppCompatSeekBar> getanswermap, _skipWSOrEnd _skipwsorend, String str, getAnswerMap<? super S, ? extends Object> getanswermap2, getMagicModuleStat<? super setImageResource, ? super S, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmagicmodulestat, int i, int i2) {
            super(2);
            this.MediaBrowserCompatCustomActionResultReceiver = s;
            this.AudioAttributesImplApi21Parcelizer = _handleoddname;
            this.AudioAttributesImplApi26Parcelizer = getanswermap;
            this.write = _skipwsorend;
            this.AudioAttributesImplBaseParcelizer = str;
            this.AudioAttributesCompatParcelizer = getanswermap2;
            this.read = getmagicmodulestat;
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            setImageBitmap.write(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer, this.write, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, this.read, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer | 1), this.IconCompatParcelizer);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ _skipWSOrEnd AudioAttributesCompatParcelizer;
        final /* synthetic */ setLayoutInflater<S> AudioAttributesImplBaseParcelizer;
        final /* synthetic */ int IconCompatParcelizer;
        final /* synthetic */ _handleOddName MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ getAnswerMap<setImageLevel<S>, AppCompatSeekBar> MediaBrowserCompatItemReceiver;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        final /* synthetic */ getMagicModuleStat<setImageResource, S, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;
        final /* synthetic */ getAnswerMap<S, Object> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(setLayoutInflater<S> setlayoutinflater, _handleOddName _handleoddname, getAnswerMap<? super setImageLevel<S>, AppCompatSeekBar> getanswermap, _skipWSOrEnd _skipwsorend, getAnswerMap<? super S, ? extends Object> getanswermap2, getMagicModuleStat<? super setImageResource, ? super S, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmagicmodulestat, int i, int i2) {
            super(2);
            this.AudioAttributesImplBaseParcelizer = setlayoutinflater;
            this.MediaBrowserCompatCustomActionResultReceiver = _handleoddname;
            this.MediaBrowserCompatItemReceiver = getanswermap;
            this.AudioAttributesCompatParcelizer = _skipwsorend;
            this.write = getanswermap2;
            this.read = getmagicmodulestat;
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            setImageBitmap.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer, this.write, this.read, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.IconCompatParcelizer | 1), this.RemoteActionCompatParcelizer);
        }
    }

    /* JADX INFO: renamed from: o.setImageBitmap$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ SnapshotStateList<S> $AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<setImageLevel<S>, AppCompatSeekBar> $AudioAttributesImplBaseParcelizer;
        final /* synthetic */ setLayoutInflater<S> $IconCompatParcelizer;
        final /* synthetic */ getMagicModuleStat<setImageResource, S, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> $RemoteActionCompatParcelizer;
        final /* synthetic */ setSupportImageTintList<S> $read;
        final /* synthetic */ S $write;

        /* JADX INFO: renamed from: o.setImageBitmap$3$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setSupportImageTintMode;", "", "read", "(Lo/setSupportImageTintMode;Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getModuleData<setSupportImageTintMode, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
            final /* synthetic */ setSupportImageTintList<S> $AudioAttributesCompatParcelizer;
            final /* synthetic */ S $IconCompatParcelizer;
            final /* synthetic */ SnapshotStateList<S> $RemoteActionCompatParcelizer;
            final /* synthetic */ getMagicModuleStat<setImageResource, S, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> $read;

            /* JADX INFO: renamed from: o.setImageBitmap$3$2$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StreamConstraintsException;", "Lo/_wrapError;", "AudioAttributesCompatParcelizer", "(Lo/StreamConstraintsException;)Lo/_wrapError;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<StreamConstraintsException, _wrapError> {
                final /* synthetic */ SnapshotStateList<S> $AudioAttributesCompatParcelizer;
                final /* synthetic */ setSupportImageTintList<S> $RemoteActionCompatParcelizer;
                final /* synthetic */ S $write;

                /* JADX INFO: renamed from: o.setImageBitmap$3$2$4$AudioAttributesCompatParcelizer */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class AudioAttributesCompatParcelizer implements _wrapError {
                    final /* synthetic */ SnapshotStateList AudioAttributesCompatParcelizer;
                    final /* synthetic */ setSupportImageTintList IconCompatParcelizer;
                    final /* synthetic */ Object RemoteActionCompatParcelizer;

                    public AudioAttributesCompatParcelizer(SnapshotStateList snapshotStateList, Object obj, setSupportImageTintList setsupportimagetintlist) {
                        this.AudioAttributesCompatParcelizer = snapshotStateList;
                        this.RemoteActionCompatParcelizer = obj;
                        this.IconCompatParcelizer = setsupportimagetintlist;
                    }

                    @Override // kotlin._wrapError
                    public final void RemoteActionCompatParcelizer() {
                        this.AudioAttributesCompatParcelizer.remove(this.RemoteActionCompatParcelizer);
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer(this.RemoteActionCompatParcelizer);
                    }
                }

                @Override // kotlin.getAnswerMap
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final _wrapError invoke(StreamConstraintsException streamConstraintsException) {
                    return new AudioAttributesCompatParcelizer(this.$AudioAttributesCompatParcelizer, this.$write, this.$RemoteActionCompatParcelizer);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(SnapshotStateList<S> snapshotStateList, S s, setSupportImageTintList<S> setsupportimagetintlist) {
                    super(1);
                    this.$AudioAttributesCompatParcelizer = snapshotStateList;
                    this.$write = s;
                    this.$RemoteActionCompatParcelizer = setsupportimagetintlist;
                }
            }

            @Override // kotlin.getModuleData
            public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(setSupportImageTintMode setsupportimagetintmode, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
                read(setsupportimagetintmode, _handleunrecognizedcharacterescape, num.intValue());
                return getShowPopup.INSTANCE;
            }

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
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v10 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            public final void read(kotlin.setSupportImageTintMode r9, kotlin._handleUnrecognizedCharacterEscape r10, int r11) {
                /*
                    r8 = this;
                    r0 = r11 & 6
                    if (r0 != 0) goto L17
                    r0 = r11 & 8
                    if (r0 != 0) goto Ld
                    boolean r0 = r10.AudioAttributesCompatParcelizer(r9)
                    goto L11
                Ld:
                    boolean r0 = r10.IconCompatParcelizer(r9)
                L11:
                    if (r0 == 0) goto L15
                    r0 = 4
                    goto L16
                L15:
                    r0 = 2
                L16:
                    r11 = r11 | r0
                L17:
                    r0 = r11 & 19
                    r1 = 18
                    r2 = 0
                    if (r0 == r1) goto L20
                    r0 = 1
                    goto L21
                L20:
                    r0 = r2
                L21:
                    r1 = r11 & 1
                    boolean r0 = r10.RemoteActionCompatParcelizer(r0, r1)
                    if (r0 == 0) goto Lb4
                    boolean r0 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
                    if (r0 == 0) goto L38
                    r0 = -1
                    java.lang.String r1 = "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)"
                    r3 = -143346359(0xfffffffff774b549, float:-4.9632708E33)
                    kotlin._validJsonValueList.AudioAttributesCompatParcelizer(r3, r11, r0, r1)
                L38:
                    androidx.compose.runtime.snapshots.SnapshotStateList<S> r0 = r8.$RemoteActionCompatParcelizer
                    boolean r0 = r10.AudioAttributesCompatParcelizer(r0)
                    S r1 = r8.$IconCompatParcelizer
                    boolean r1 = r10.IconCompatParcelizer(r1)
                    o.setSupportImageTintList<S> r3 = r8.$AudioAttributesCompatParcelizer
                    boolean r3 = r10.IconCompatParcelizer(r3)
                    androidx.compose.runtime.snapshots.SnapshotStateList<S> r4 = r8.$RemoteActionCompatParcelizer
                    S r5 = r8.$IconCompatParcelizer
                    o.setSupportImageTintList<S> r6 = r8.$AudioAttributesCompatParcelizer
                    java.lang.Object r7 = r10.onPause()
                    r0 = r0 | r1
                    r0 = r0 | r3
                    if (r0 != 0) goto L60
                    o._handleUnrecognizedCharacterEscape$write r0 = kotlin._handleUnrecognizedCharacterEscape.INSTANCE
                    java.lang.Object r0 = r0.IconCompatParcelizer()
                    if (r7 != r0) goto L6b
                L60:
                    o.setImageBitmap$3$2$4 r0 = new o.setImageBitmap$3$2$4
                    r0.<init>(r4, r5, r6)
                    r7 = r0
                    o.getAnswerMap r7 = (kotlin.getAnswerMap) r7
                    r10.RemoteActionCompatParcelizer(r7)
                L6b:
                    o.getAnswerMap r7 = (kotlin.getAnswerMap) r7
                    r11 = r11 & 14
                    kotlin.StreamReadException.RemoteActionCompatParcelizer(r9, r7, r10, r11)
                    o.setSupportImageTintList<S> r11 = r8.$AudioAttributesCompatParcelizer
                    o.setKeyListener r11 = r11.AudioAttributesCompatParcelizer()
                    S r0 = r8.$IconCompatParcelizer
                    java.lang.String r1 = ""
                    kotlin.toMagicModuleMetaRepoModel.read(r9, r1)
                    r1 = r9
                    o.AppCompatRadioButton r1 = (kotlin.AppCompatRadioButton) r1
                    o.InputAccessor r1 = r1.IconCompatParcelizer()
                    r11.RemoteActionCompatParcelizer(r0, r1)
                    java.lang.Object r11 = r10.onPause()
                    o._handleUnrecognizedCharacterEscape$write r0 = kotlin._handleUnrecognizedCharacterEscape.INSTANCE
                    java.lang.Object r0 = r0.IconCompatParcelizer()
                    if (r11 != r0) goto L9d
                    o.setImageDrawable r11 = new o.setImageDrawable
                    r11.<init>(r9)
                    r10.RemoteActionCompatParcelizer(r11)
                L9d:
                    o.setImageDrawable r11 = (kotlin.setImageDrawable) r11
                    o.getMagicModuleStat<o.setImageResource, S, o._handleUnrecognizedCharacterEscape, java.lang.Integer, o.getShowPopup> r9 = r8.$read
                    S r8 = r8.$IconCompatParcelizer
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                    r9.write(r11, r8, r10, r0)
                    boolean r8 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
                    if (r8 == 0) goto Lb3
                    kotlin._validJsonValueList.AudioAttributesImplApi21Parcelizer()
                Lb3:
                    return
                Lb4:
                    r10.onPrepareFromSearch()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.setImageBitmap.AnonymousClass3.AnonymousClass2.read(o.setSupportImageTintMode, o._handleUnrecognizedCharacterEscape, int):void");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(SnapshotStateList<S> snapshotStateList, S s, setSupportImageTintList<S> setsupportimagetintlist, getMagicModuleStat<? super setImageResource, ? super S, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmagicmodulestat) {
                super(3);
                this.$RemoteActionCompatParcelizer = snapshotStateList;
                this.$IconCompatParcelizer = s;
                this.$AudioAttributesCompatParcelizer = setsupportimagetintlist;
                this.$read = getmagicmodulestat;
            }
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        public final void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            Object audioAttributesCompatParcelizer;
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-23915175, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
            }
            getAnswerMap<setImageLevel<S>, AppCompatSeekBar> getanswermap = this.$AudioAttributesImplBaseParcelizer;
            setLayoutInflater.write writeVar = this.$read;
            AppCompatSeekBar appCompatSeekBarOnPause = _handleunrecognizedcharacterescape.onPause();
            if (appCompatSeekBarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                appCompatSeekBarOnPause = getanswermap.invoke(writeVar);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(appCompatSeekBarOnPause);
            }
            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) appCompatSeekBarOnPause;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.$IconCompatParcelizer.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(), this.$write));
            setLayoutInflater<S> setlayoutinflater = this.$IconCompatParcelizer;
            S s = this.$write;
            getAnswerMap<setImageLevel<S>, AppCompatSeekBar> getanswermap2 = this.$AudioAttributesImplBaseParcelizer;
            setLayoutInflater.write writeVar2 = this.$read;
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setlayoutinflater.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(), s)) {
                    audioAttributesCompatParcelizer = setDropDownWidth.INSTANCE.write();
                } else {
                    audioAttributesCompatParcelizer = getanswermap2.invoke(writeVar2).getAudioAttributesCompatParcelizer();
                }
                objOnPause = audioAttributesCompatParcelizer;
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            setDropDownWidth setdropdownwidth = (setDropDownWidth) objOnPause;
            S s2 = this.$write;
            setLayoutInflater<S> setlayoutinflater2 = this.$IconCompatParcelizer;
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new setSupportImageTintList.write(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(s2, setlayoutinflater2.AudioAttributesImplApi26Parcelizer()));
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            setSupportImageTintList.write writeVar3 = (setSupportImageTintList.write) objOnPause2;
            setDropDownVerticalOffset remoteActionCompatParcelizer = appCompatSeekBar.getRemoteActionCompatParcelizer();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(appCompatSeekBar);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = (getModuleData) new AnonymousClass1(appCompatSeekBar);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            _handleOddName _handleoddnameWrite = isTypeOrSubTypeOf.write(companion, (getModuleData) objOnPause3);
            writeVar3.write(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.$write, this.$IconCompatParcelizer.AudioAttributesImplApi26Parcelizer()));
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = _handleoddnameWrite.AudioAttributesCompatParcelizer(writeVar3);
            setLayoutInflater<S> setlayoutinflater3 = this.$IconCompatParcelizer;
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(this.$write);
            S s3 = this.$write;
            Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer2 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = (getAnswerMap) new C01423(s3);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
            }
            getAnswerMap getanswermap3 = (getAnswerMap) objOnPause4;
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setdropdownwidth);
            Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer2 || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = (MagicModuleSubmissionRequestBody) new AnonymousClass5(setdropdownwidth);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
            }
            AppCompatPopupWindow.write(setlayoutinflater3, getanswermap3, _handleoddnameAudioAttributesCompatParcelizer, remoteActionCompatParcelizer, setdropdownwidth, (MagicModuleSubmissionRequestBody) objOnPause5, null, multiplyFft.AudioAttributesCompatParcelizer(-143346359, true, new AnonymousClass2(this.$AudioAttributesCompatParcelizer, this.$write, this.$read, this.$RemoteActionCompatParcelizer), _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 12582912, 64);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [S] */
        /* JADX INFO: renamed from: o.setImageBitmap$3$3, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C01423<S> extends MagicModuleUseCase implements getAnswerMap<S, Boolean> {
            final /* synthetic */ S $IconCompatParcelizer;

            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(S s) {
                return Boolean.valueOf(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(s, this.$IconCompatParcelizer));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01423(S s) {
                super(1);
                this.$IconCompatParcelizer = s;
            }
        }

        /* JADX INFO: renamed from: o.setImageBitmap$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "IconCompatParcelizer", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends MagicModuleUseCase implements getModuleData<withContentValueHandler, isTypeOrSuperTypeOf, PropertyValueAny, withHandlersFrom> {
            final /* synthetic */ AppCompatSeekBar $AudioAttributesCompatParcelizer;

            @Override // kotlin.getModuleData
            public final /* bridge */ /* synthetic */ withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, PropertyValueAny propertyValueAny) {
                return IconCompatParcelizer(withcontentvaluehandler, istypeorsupertypeof, propertyValueAny.getRead());
            }

            /* JADX INFO: renamed from: o.setImageBitmap$3$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "read", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C01411 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
                final /* synthetic */ AppCompatSeekBar $AudioAttributesCompatParcelizer;
                final /* synthetic */ _parser $RemoteActionCompatParcelizer;

                @Override // kotlin.getAnswerMap
                public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
                    read(iconCompatParcelizer);
                    return getShowPopup.INSTANCE;
                }

                public final void read(_parser.IconCompatParcelizer iconCompatParcelizer) {
                    iconCompatParcelizer.IconCompatParcelizer(this.$RemoteActionCompatParcelizer, 0, 0, this.$AudioAttributesCompatParcelizer.write());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01411(_parser _parserVar, AppCompatSeekBar appCompatSeekBar) {
                    super(1);
                    this.$RemoteActionCompatParcelizer = _parserVar;
                    this.$AudioAttributesCompatParcelizer = appCompatSeekBar;
                }
            }

            public final withHandlersFrom IconCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
                _parser _parserVarWrite = istypeorsupertypeof.write(j);
                return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new C01411(_parserVarWrite, this.$AudioAttributesCompatParcelizer), 4, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AppCompatSeekBar appCompatSeekBar) {
                super(3);
                this.$AudioAttributesCompatParcelizer = appCompatSeekBar;
            }
        }

        /* JADX INFO: renamed from: o.setImageBitmap$3$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setDropDownHorizontalOffset;", "p0", "p1", "", "AudioAttributesCompatParcelizer", "(Lo/setDropDownHorizontalOffset;Lo/setDropDownHorizontalOffset;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<setDropDownHorizontalOffset, setDropDownHorizontalOffset, Boolean> {
            final /* synthetic */ setDropDownWidth $AudioAttributesCompatParcelizer;

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(setDropDownHorizontalOffset setdropdownhorizontaloffset, setDropDownHorizontalOffset setdropdownhorizontaloffset2) {
                return Boolean.valueOf(setdropdownhorizontaloffset == setDropDownHorizontalOffset.write && setdropdownhorizontaloffset2 == setDropDownHorizontalOffset.write && !this.$AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer().getMediaBrowserCompatItemReceiver());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(setDropDownWidth setdropdownwidth) {
                super(2);
                this.$AudioAttributesCompatParcelizer = setdropdownwidth;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(setLayoutInflater<S> setlayoutinflater, S s, getAnswerMap<? super setImageLevel<S>, AppCompatSeekBar> getanswermap, setSupportImageTintList<S> setsupportimagetintlist, SnapshotStateList<S> snapshotStateList, getMagicModuleStat<? super setImageResource, ? super S, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmagicmodulestat) {
            super(2);
            this.$IconCompatParcelizer = setlayoutinflater;
            this.$write = s;
            this.$AudioAttributesImplBaseParcelizer = getanswermap;
            this.$read = setsupportimagetintlist;
            this.$AudioAttributesCompatParcelizer = snapshotStateList;
            this.$RemoteActionCompatParcelizer = getmagicmodulestat;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: o.setImageBitmap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lo/setImageLevel;", "Lo/AppCompatSeekBar;", "write", "(Lo/setImageLevel;)Lo/AppCompatSeekBar;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1<S> extends MagicModuleUseCase implements getAnswerMap<setImageLevel<S>, AppCompatSeekBar> {
        public static final AnonymousClass1 write = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final AppCompatSeekBar invoke(setImageLevel<S> setimagelevel) {
            return setImageBitmap.IconCompatParcelizer(AppCompatRatingBar.IconCompatParcelizer(setVerticalGravity.RemoteActionCompatParcelizer$default(220, 90, (setOnQueryTextFocusChangeListener) null, 4, (Object) null), BitmapDescriptorFactory.HUE_RED, 2, (Object) null).RemoteActionCompatParcelizer(AppCompatRatingBar.write(setVerticalGravity.RemoteActionCompatParcelizer$default(220, 90, (setOnQueryTextFocusChangeListener) null, 4, (Object) null), 0.92f, 0L, 4, null)), AppCompatRatingBar.write(setVerticalGravity.RemoteActionCompatParcelizer$default(90, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null), BitmapDescriptorFactory.HUE_RED, 2, (Object) null));
        }

        AnonymousClass1() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void write(S r19, kotlin._handleOddName r20, kotlin.getAnswerMap<? super kotlin.setImageLevel<S>, kotlin.AppCompatSeekBar> r21, kotlin._skipWSOrEnd r22, java.lang.String r23, kotlin.getAnswerMap<? super S, ? extends java.lang.Object> r24, kotlin.getMagicModuleStat<? super kotlin.setImageResource, ? super S, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r25, kotlin._handleUnrecognizedCharacterEscape r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setImageBitmap.write(java.lang.Object, o._handleOddName, o.getAnswerMap, o._skipWSOrEnd, java.lang.String, o.getAnswerMap, o.getMagicModuleStat, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: renamed from: o.setImageBitmap$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/getKey;", "p0", "p1", "Lo/setNavigationOnClickListener;", "RemoteActionCompatParcelizer", "(JJ)Lo/setNavigationOnClickListener;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass8 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<getKey, getKey, setNavigationOnClickListener<getKey>> {
        public static final AnonymousClass8 read = new AnonymousClass8();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ setNavigationOnClickListener<getKey> invoke(getKey getkey, getKey getkey2) {
            return RemoteActionCompatParcelizer(getkey.getRemoteActionCompatParcelizer(), getkey2.getRemoteActionCompatParcelizer());
        }

        public final setNavigationOnClickListener<getKey> RemoteActionCompatParcelizer(long j, long j2) {
            return setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, getKey.AudioAttributesCompatParcelizer(setInvalidated.RemoteActionCompatParcelizer(getKey.INSTANCE)), 1, null);
        }

        AnonymousClass8() {
            super(2);
        }
    }

    public static /* synthetic */ setPrecomputedText RemoteActionCompatParcelizer(boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            magicModuleSubmissionRequestBody = AnonymousClass8.read;
        }
        return AudioAttributesCompatParcelizer(z, magicModuleSubmissionRequestBody);
    }

    public static final setPrecomputedText AudioAttributesCompatParcelizer(boolean z, MagicModuleSubmissionRequestBody<? super getKey, ? super getKey, ? extends SwitchCompat<getKey>> magicModuleSubmissionRequestBody) {
        return new setAllowStacking(z, magicModuleSubmissionRequestBody);
    }

    public static final AppCompatSeekBar IconCompatParcelizer(setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth) {
        return new AppCompatSeekBar(setdropdownverticaloffset, setdropdownwidth, BitmapDescriptorFactory.HUE_RED, null, 12, null);
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: o.setImageBitmap$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lo/setImageLevel;", "Lo/AppCompatSeekBar;", "IconCompatParcelizer", "(Lo/setImageLevel;)Lo/AppCompatSeekBar;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4<S> extends MagicModuleUseCase implements getAnswerMap<setImageLevel<S>, AppCompatSeekBar> {
        public static final AnonymousClass4 IconCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final AppCompatSeekBar invoke(setImageLevel<S> setimagelevel) {
            return setImageBitmap.IconCompatParcelizer(AppCompatRatingBar.IconCompatParcelizer(setVerticalGravity.RemoteActionCompatParcelizer$default(220, 90, (setOnQueryTextFocusChangeListener) null, 4, (Object) null), BitmapDescriptorFactory.HUE_RED, 2, (Object) null).RemoteActionCompatParcelizer(AppCompatRatingBar.write(setVerticalGravity.RemoteActionCompatParcelizer$default(220, 90, (setOnQueryTextFocusChangeListener) null, 4, (Object) null), 0.92f, 0L, 4, null)), AppCompatRatingBar.write(setVerticalGravity.RemoteActionCompatParcelizer$default(90, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null), BitmapDescriptorFactory.HUE_RED, 2, (Object) null));
        }

        AnonymousClass4() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void RemoteActionCompatParcelizer(kotlin.setLayoutInflater<S> r21, kotlin._handleOddName r22, kotlin.getAnswerMap<? super kotlin.setImageLevel<S>, kotlin.AppCompatSeekBar> r23, kotlin._skipWSOrEnd r24, kotlin.getAnswerMap<? super S, ? extends java.lang.Object> r25, kotlin.getMagicModuleStat<? super kotlin.setImageResource, ? super S, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r26, kotlin._handleUnrecognizedCharacterEscape r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setImageBitmap.RemoteActionCompatParcelizer(o.setLayoutInflater, o._handleOddName, o.getAnswerMap, o._skipWSOrEnd, o.getAnswerMap, o.getMagicModuleStat, o._handleUnrecognizedCharacterEscape, int, int):void");
    }
}
