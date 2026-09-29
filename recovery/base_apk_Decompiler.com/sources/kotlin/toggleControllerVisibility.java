package kotlin;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.List;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin.parseDigitsRecursive;
import kotlin.toggleControllerVisibility;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aú\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001323\b\u0002\u0010\u001d\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0001¢\u0006\u0002\u0010%\u001a0\u0010&\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001fH\u0003¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020-2\u0006\u0010'\u001a\u00020(H\u0002\u001a \u0010.\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0013H\u0000\u001a0\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u0002042\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00105\u001a\u000206H\u0002\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-H\u0002\u001a2\u00108\u001a\u00020\u0001*\u0002092\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\r2\u0006\u00105\u001a\u000206H\u0080@¢\u0006\u0002\u0010=\u001a\u001d\u0010>\u001a\u00020\u00012\u0006\u0010'\u001a\u00020(2\u0006\u0010?\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010@\u001a\u0015\u0010A\u001a\u00020\u00012\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\u0010B\u001a \u0010C\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00105\u001a\u000206H\u0002\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00072\u0006\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020GH\u0002¨\u0006H²\u0006\n\u0010I\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"CoreTextField", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "textScrollerPosition", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "previewKeyEventToDeselectOnBack", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/foundation/text/LegacyTextFieldState;", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "startInputSession", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "endInputSession", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "notifyFocusedRect", "addContextMenuComponents", "textFieldSelectionManager", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "foundation", "writeable"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class toggleControllerVisibility {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements _wrapError {
        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements _wrapError {
        final /* synthetic */ Typed3EpoxyController IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(Typed3EpoxyController typed3EpoxyController) {
            this.IconCompatParcelizer = typed3EpoxyController;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            this.IconCompatParcelizer.onSeekTo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(deserializeFromNumber deserializefromnumber) {
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0659 A[PHI: r0 r36 r46
      0x0659: PHI (r0v40 o.KeyDeserializers) = (r0v13 o.KeyDeserializers), (r0v41 o.KeyDeserializers) binds: [B:337:0x0657, B:334:0x0648] A[DONT_GENERATE, DONT_INLINE]
      0x0659: PHI (r36v8 int) = (r36v2 int), (r36v10 int) binds: [B:337:0x0657, B:334:0x0648] A[DONT_GENERATE, DONT_INLINE]
      0x0659: PHI (r46v2 int) = (r46v0 int), (r46v3 int) binds: [B:337:0x0657, B:334:0x0648] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:488:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public static final void IconCompatParcelizer(final kotlin.hasValueTypeDeserializer r57, final kotlin.getAnswerMap<? super kotlin.hasValueTypeDeserializer, kotlin.getShowPopup> r58, kotlin._handleOddName r59, kotlin.deserializeWithObjectId r60, kotlin.addUnresolvedId r61, kotlin.getAnswerMap<? super kotlin.deserializeFromNumber, kotlin.getShowPopup> r62, kotlin.hashCode r63, kotlin.Instantiatable r64, boolean r65, int r66, int r67, kotlin.KeyDeserializers r68, kotlin.setErrorMessageProvider r69, boolean r70, boolean r71, kotlin.getModuleData<? super kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup>, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r72, kotlin.suppressLayout r73, kotlin._handleUnrecognizedCharacterEscape r74, final int r75, final int r76, final int r77) {
        /*
            Method dump skipped, instruction units count: 2853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toggleControllerVisibility.IconCompatParcelizer(o.hasValueTypeDeserializer, o.getAnswerMap, o._handleOddName, o.deserializeWithObjectId, o.addUnresolvedId, o.getAnswerMap, o.hashCode, o.Instantiatable, boolean, int, int, o.KeyDeserializers, o.setErrorMessageProvider, boolean, boolean, o.getModuleData, o.suppressLayout, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final suppressLayout read(superDispatchKeyEvent superdispatchkeyevent) {
        return new suppressLayout(superdispatchkeyevent, BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractDeserializer write(Typed3EpoxyController typed3EpoxyController) {
        return Typed3EpoxyController.IconCompatParcelizer$default(typed3EpoxyController, false, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractDeserializer AudioAttributesCompatParcelizer(Typed3EpoxyController typed3EpoxyController) {
        return typed3EpoxyController.AudioAttributesImplBaseParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(Typed3EpoxyController typed3EpoxyController, AbstractDeserializer abstractDeserializer) {
        typed3EpoxyController.AudioAttributesCompatParcelizer(abstractDeserializer);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setImageDisplayMode setimagedisplaymode, boolean z, boolean z2, setViews setviews, hasValueTypeDeserializer hasvaluetypedeserializer, KeyDeserializers keyDeserializers, SettableBeanProperty settableBeanProperty, Typed3EpoxyController typed3EpoxyController, TopUserCompanion topUserCompanion, SlowMotionData slowMotionData, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
        if (setimagedisplaymode.AudioAttributesCompatParcelizer() == charsToNameCanonicalizer.write()) {
            return getShowPopup.INSTANCE;
        }
        setimagedisplaymode.RemoteActionCompatParcelizer(charsToNameCanonicalizer.write());
        if (setimagedisplaymode.AudioAttributesCompatParcelizer() && z && !z2) {
            read(setviews, setimagedisplaymode, hasvaluetypedeserializer, keyDeserializers, settableBeanProperty);
        } else {
            read(setimagedisplaymode);
        }
        if (charsToNameCanonicalizer.write() && (hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer()) != null) {
            C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new IconCompatParcelizer(slowMotionData, hasvaluetypedeserializer, setimagedisplaymode, hasstableidsAudioAttributesImplApi26Parcelizer, settableBeanProperty, null), 3);
        }
        if (!charsToNameCanonicalizer.write()) {
            Typed3EpoxyController.IconCompatParcelizer$default(typed3EpoxyController, (getReferencedType) null, 1, (Object) null);
        }
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setImageDisplayMode AudioAttributesCompatParcelizer;
        int AudioAttributesImplBaseParcelizer;
        final /* synthetic */ SettableBeanProperty IconCompatParcelizer;
        final /* synthetic */ hasValueTypeDeserializer RemoteActionCompatParcelizer;
        final /* synthetic */ hasStableIds read;
        final /* synthetic */ SlowMotionData write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesImplBaseParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesImplBaseParcelizer = 1;
                if (toggleControllerVisibility.RemoteActionCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer.getIconCompatParcelizer(), this.read.getAudioAttributesCompatParcelizer(), this.IconCompatParcelizer, this) == objIconCompatParcelizer) {
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
        IconCompatParcelizer(SlowMotionData slowMotionData, hasValueTypeDeserializer hasvaluetypedeserializer, setImageDisplayMode setimagedisplaymode, hasStableIds hasstableids, SettableBeanProperty settableBeanProperty, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = slowMotionData;
            this.RemoteActionCompatParcelizer = hasvaluetypedeserializer;
            this.AudioAttributesCompatParcelizer = setimagedisplaymode;
            this.read = hasstableids;
            this.IconCompatParcelizer = settableBeanProperty;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.IconCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ Typed3EpoxyController AudioAttributesCompatParcelizer;
        final /* synthetic */ setImageDisplayMode IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ parseDouble<Boolean> RemoteActionCompatParcelizer;
        final /* synthetic */ KeyDeserializers read;
        final /* synthetic */ setViews write;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, o.getShowPopup] */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    final parseDouble<Boolean> parsedouble = this.RemoteActionCompatParcelizer;
                    NewNumberOtpResendRequest newNumberOtpResendRequestIconCompatParcelizer = _qbuf.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getVideoSurfaceView
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return Boolean.valueOf(toggleControllerVisibility.write.read(parsedouble));
                        }
                    });
                    final setImageDisplayMode setimagedisplaymode = this.IconCompatParcelizer;
                    final setViews setviews = this.write;
                    final Typed3EpoxyController typed3EpoxyController = this.AudioAttributesCompatParcelizer;
                    final KeyDeserializers keyDeserializers = this.read;
                    this.MediaBrowserCompatCustomActionResultReceiver = 1;
                    if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.toggleControllerVisibility.write.2
                        @Override // kotlin.getValidationToken
                        public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                            return read(((Boolean) obj2).booleanValue(), sampleVideos);
                        }

                        public final Object read(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
                            if (!z || !setimagedisplaymode.AudioAttributesCompatParcelizer()) {
                                toggleControllerVisibility.read(setimagedisplaymode);
                            } else {
                                toggleControllerVisibility.read(setviews, setimagedisplaymode, typed3EpoxyController.onRemoveQueueItem(), keyDeserializers, typed3EpoxyController.getIconCompatParcelizer());
                            }
                            return getShowPopup.INSTANCE;
                        }
                    }, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                toggleControllerVisibility.read(this.IconCompatParcelizer);
                this = getShowPopup.INSTANCE;
                return this;
            } catch (Throwable th) {
                toggleControllerVisibility.read(this.IconCompatParcelizer);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean read(parseDouble parsedouble) {
            return toggleControllerVisibility.IconCompatParcelizer((parseDouble<Boolean>) parsedouble);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(setImageDisplayMode setimagedisplaymode, parseDouble<Boolean> parsedouble, setViews setviews, Typed3EpoxyController typed3EpoxyController, KeyDeserializers keyDeserializers, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = setimagedisplaymode;
            this.RemoteActionCompatParcelizer = parsedouble;
            this.write = setviews;
            this.AudioAttributesCompatParcelizer = typed3EpoxyController;
            this.read = keyDeserializers;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setImageDisplayMode setimagedisplaymode, boolean z) {
        setimagedisplaymode.write(z);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setImageDisplayMode setimagedisplaymode, secondaryCount secondarycount, boolean z, boolean z2, Typed3EpoxyController typed3EpoxyController, SettableBeanProperty settableBeanProperty, getReferencedType getreferencedtype) {
        RemoteActionCompatParcelizer(setimagedisplaymode, secondarycount, !z);
        if (setimagedisplaymode.AudioAttributesCompatParcelizer() && z2) {
            if (setimagedisplaymode.IconCompatParcelizer() != lambdaonImageAvailable1androidxmedia3uiPlayerView.RemoteActionCompatParcelizer) {
                hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
                if (hasstableidsAudioAttributesImplApi26Parcelizer != null) {
                    MediaRouteVolumeSlider.INSTANCE.AudioAttributesCompatParcelizer(getreferencedtype.getWrite(), hasstableidsAudioAttributesImplApi26Parcelizer, setimagedisplaymode.getWrite(), settableBeanProperty, setimagedisplaymode.MediaBrowserCompatSearchResultReceiver());
                    if (setimagedisplaymode.getIconCompatParcelizer().getIconCompatParcelizer().length() > 0) {
                        setimagedisplaymode.write(lambdaonImageAvailable1androidxmedia3uiPlayerView.write);
                    }
                }
            } else {
                typed3EpoxyController.IconCompatParcelizer(getreferencedtype);
            }
        }
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver implements PointerInputEventHandler {
        final /* synthetic */ Typed3EpoxyController IconCompatParcelizer;

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = onAttachedToRecyclerViewInternal.IconCompatParcelizer(handlebadmerge, this.IconCompatParcelizer.getOnPrepareFromUri(), this.IconCompatParcelizer.getOnPrepareFromSearch(), sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(Typed3EpoxyController typed3EpoxyController) {
            this.IconCompatParcelizer = typed3EpoxyController;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(setImageDisplayMode setimagedisplaymode, hasValueTypeDeserializer hasvaluetypedeserializer, SettableBeanProperty settableBeanProperty, findSetterInfo findsetterinfo) {
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
        if (hasstableidsAudioAttributesImplApi26Parcelizer != null) {
            MediaRouteVolumeSlider.INSTANCE.RemoteActionCompatParcelizer(findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer(), hasvaluetypedeserializer, setimagedisplaymode.handleMediaPlayPauseIfPendingOnHandler(), setimagedisplaymode.write(), settableBeanProperty, hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer(), setimagedisplaymode.getOnPrepareFromSearch(), setimagedisplaymode.getOnPlayFromUri());
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setImageDisplayMode setimagedisplaymode, boolean z, ConfigFeature configFeature, Typed3EpoxyController typed3EpoxyController, hasValueTypeDeserializer hasvaluetypedeserializer, SettableBeanProperty settableBeanProperty, isAbstract isabstract) {
        fillInStackTrace remoteActionCompatParcelizer;
        setimagedisplaymode.write(isabstract);
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
        if (hasstableidsAudioAttributesImplApi26Parcelizer != null) {
            hasstableidsAudioAttributesImplApi26Parcelizer.read(isabstract);
        }
        if (z) {
            if (setimagedisplaymode.IconCompatParcelizer() == lambdaonImageAvailable1androidxmedia3uiPlayerView.RemoteActionCompatParcelizer) {
                if (setimagedisplaymode.onAddQueueItem() && configFeature.AudioAttributesCompatParcelizer()) {
                    typed3EpoxyController.onSetRating();
                } else {
                    typed3EpoxyController.onSeekTo();
                }
                setimagedisplaymode.AudioAttributesImplApi21Parcelizer(setApplyingOpacityToLayersEnabled.IconCompatParcelizer(typed3EpoxyController, true));
                setimagedisplaymode.MediaBrowserCompatItemReceiver(setApplyingOpacityToLayersEnabled.IconCompatParcelizer(typed3EpoxyController, false));
                setimagedisplaymode.AudioAttributesCompatParcelizer(findProperty.write(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer()));
            } else if (setimagedisplaymode.IconCompatParcelizer() == lambdaonImageAvailable1androidxmedia3uiPlayerView.write) {
                setimagedisplaymode.AudioAttributesCompatParcelizer(setApplyingOpacityToLayersEnabled.IconCompatParcelizer(typed3EpoxyController, true));
            }
            AudioAttributesCompatParcelizer(setimagedisplaymode, hasvaluetypedeserializer, settableBeanProperty);
            hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer2 = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
            if (hasstableidsAudioAttributesImplApi26Parcelizer2 != null && (remoteActionCompatParcelizer = setimagedisplaymode.getRemoteActionCompatParcelizer()) != null && setimagedisplaymode.AudioAttributesCompatParcelizer()) {
                MediaRouteVolumeSlider.INSTANCE.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, hasvaluetypedeserializer, settableBeanProperty, hasstableidsAudioAttributesImplApi26Parcelizer2);
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError AudioAttributesCompatParcelizer(setImageDisplayMode setimagedisplaymode, setViews setviews, hasValueTypeDeserializer hasvaluetypedeserializer, KeyDeserializers keyDeserializers, StreamConstraintsException streamConstraintsException) {
        if (setimagedisplaymode.AudioAttributesCompatParcelizer()) {
            setimagedisplaymode.read(MediaRouteVolumeSlider.INSTANCE.IconCompatParcelizer(setviews, hasvaluetypedeserializer, setimagedisplaymode.getWrite(), keyDeserializers, setimagedisplaymode.MediaBrowserCompatSearchResultReceiver(), setimagedisplaymode.RatingCompat()));
        }
        return new RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(boolean z, ViewPager2SavedState viewPager2SavedState) {
        if (z) {
            viewPager2SavedState.write();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setImageDisplayMode setimagedisplaymode, Instantiatable instantiatable, findSerializer findserializer) {
        findserializer.write();
        if (setimagedisplaymode.read() || setimagedisplaymode.MediaBrowserCompatItemReceiver()) {
            findSetterInfo.write$default(findserializer, instantiatable, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 126, null);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(setImageDisplayMode setimagedisplaymode, isAbstract isabstract) {
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
        if (hasstableidsAudioAttributesImplApi26Parcelizer != null) {
            hasstableidsAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(isabstract);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getModuleData getmoduledata, final setImageDisplayMode setimagedisplaymode, final deserializeWithObjectId deserializewithobjectid, final int i, final int i2, final suppressLayout suppresslayout, final hasValueTypeDeserializer hasvaluetypedeserializer, final addUnresolvedId addunresolvedid, final _handleOddName _handleoddname, final _handleOddName _handleoddname2, final _handleOddName _handleoddname3, final _handleOddName _handleoddname4, final SlowMotionData slowMotionData, final Typed3EpoxyController typed3EpoxyController, final boolean z, final boolean z2, final getAnswerMap getanswermap, final SettableBeanProperty settableBeanProperty, final bufferMapProperty buffermapproperty, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i3 & 3) != 2, i3 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-814563849, i3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:588)");
            }
            getmoduledata.AudioAttributesCompatParcelizer(multiplyFft.AudioAttributesCompatParcelizer(-44346382, true, new MagicModuleSubmissionRequestBody() { // from class: o.updateControllerVisibility
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return toggleControllerVisibility.IconCompatParcelizer(setimagedisplaymode, deserializewithobjectid, i, i2, suppresslayout, hasvaluetypedeserializer, addunresolvedid, _handleoddname, _handleoddname2, _handleoddname3, _handleoddname4, slowMotionData, typed3EpoxyController, z, z2, getanswermap, settableBeanProperty, buffermapproperty, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 6);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final setImageDisplayMode setimagedisplaymode, deserializeWithObjectId deserializewithobjectid, int i, final int i2, suppressLayout suppresslayout, final hasValueTypeDeserializer hasvaluetypedeserializer, addUnresolvedId addunresolvedid, _handleOddName _handleoddname, _handleOddName _handleoddname2, _handleOddName _handleoddname3, _handleOddName _handleoddname4, SlowMotionData slowMotionData, final Typed3EpoxyController typed3EpoxyController, final boolean z, final boolean z2, final getAnswerMap getanswermap, final SettableBeanProperty settableBeanProperty, final bufferMapProperty buffermapproperty, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i3 & 3) != 2, i3 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-44346382, i3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:591)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = onTrackballEvent.RemoteActionCompatParcelizer(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, setimagedisplaymode.MediaMetadataCompat(), BitmapDescriptorFactory.HUE_RED, 2, (Object) null), deserializewithobjectid, i, i2);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(setimagedisplaymode);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.updateAspectRatio
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return toggleControllerVisibility.IconCompatParcelizer(setimagedisplaymode);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            EpoxyRecyclerViewModelBuilderCallbackController.IconCompatParcelizer(UrlLinkFrame.write(createViewHolder.AudioAttributesCompatParcelizer(setViewCacheExtension.RemoteActionCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer, suppresslayout, hasvaluetypedeserializer, addunresolvedid, (getCreatedOnDateMs) objOnPause).AudioAttributesCompatParcelizer(_handleoddname).AudioAttributesCompatParcelizer(_handleoddname2), deserializewithobjectid).AudioAttributesCompatParcelizer(_handleoddname3).AudioAttributesCompatParcelizer(_handleoddname4), slowMotionData), multiplyFft.AudioAttributesCompatParcelizer(1412697320, true, new MagicModuleSubmissionRequestBody() { // from class: o.updateForCurrentTrackSelections
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return toggleControllerVisibility.read(typed3EpoxyController, setimagedisplaymode, z, z2, getanswermap, hasvaluetypedeserializer, settableBeanProperty, buffermapproperty, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 48, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasStableIds IconCompatParcelizer(setImageDisplayMode setimagedisplaymode) {
        return setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/toggleControllerVisibility$read;", "Lo/withTypeHandler;", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "RemoteActionCompatParcelizer", "(Lo/getValueHandler;Ljava/util/List;I)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements withTypeHandler {
        final /* synthetic */ int AudioAttributesCompatParcelizer;
        final /* synthetic */ setImageDisplayMode IconCompatParcelizer;
        final /* synthetic */ hasValueTypeDeserializer MediaBrowserCompatItemReceiver;
        final /* synthetic */ getAnswerMap<deserializeFromNumber, getShowPopup> RemoteActionCompatParcelizer;
        final /* synthetic */ SettableBeanProperty read;
        final /* synthetic */ bufferMapProperty write;

        /* JADX WARN: Multi-variable type inference failed */
        read(setImageDisplayMode setimagedisplaymode, getAnswerMap<? super deserializeFromNumber, getShowPopup> getanswermap, hasValueTypeDeserializer hasvaluetypedeserializer, SettableBeanProperty settableBeanProperty, bufferMapProperty buffermapproperty, int i) {
            this.IconCompatParcelizer = setimagedisplaymode;
            this.RemoteActionCompatParcelizer = getanswermap;
            this.MediaBrowserCompatItemReceiver = hasvaluetypedeserializer;
            this.read = settableBeanProperty;
            this.write = buffermapproperty;
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // kotlin.withTypeHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            setImageDisplayMode setimagedisplaymode = this.IconCompatParcelizer;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            try {
                hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
                deserializeFromNumber audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer != null ? hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer() : null;
                Triple<Integer, Integer, deserializeFromNumber> tripleAudioAttributesCompatParcelizer = MediaRouteVolumeSlider.INSTANCE.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.getIconCompatParcelizer(), j, withcontentvaluehandler.getAudioAttributesCompatParcelizer(), audioAttributesCompatParcelizer);
                int iIntValue = tripleAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().intValue();
                int iIntValue2 = tripleAudioAttributesCompatParcelizer.read().intValue();
                deserializeFromNumber deserializefromnumberRemoteActionCompatParcelizer = tripleAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, deserializefromnumberRemoteActionCompatParcelizer)) {
                    this.IconCompatParcelizer.IconCompatParcelizer(new hasStableIds(deserializefromnumberRemoteActionCompatParcelizer, null, hasstableidsAudioAttributesImplApi26Parcelizer != null ? hasstableidsAudioAttributesImplApi26Parcelizer.getWrite() : null, 2, null));
                    this.RemoteActionCompatParcelizer.invoke(deserializefromnumberRemoteActionCompatParcelizer);
                    toggleControllerVisibility.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.read);
                }
                this.IconCompatParcelizer.write(this.write.b_(this.AudioAttributesCompatParcelizer == 1 ? MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(deserializefromnumberRemoteActionCompatParcelizer.read(0)) : 0));
                return withcontentvaluehandler.AudioAttributesCompatParcelizer(iIntValue, iIntValue2, VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(wrongTokenException.RemoteActionCompatParcelizer(), Integer.valueOf(Math.round(deserializefromnumberRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()))), setAction.write(wrongTokenException.IconCompatParcelizer(), Integer.valueOf(Math.round(deserializefromnumberRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer())))), new getAnswerMap() { // from class: o.hideController
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return toggleControllerVisibility.read.read((_parser.IconCompatParcelizer) obj);
                    }
                });
            } finally {
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(_parser.IconCompatParcelizer iconCompatParcelizer) {
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.withTypeHandler
        public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            this.IconCompatParcelizer.getIconCompatParcelizer().read(getvaluehandler.getAudioAttributesCompatParcelizer());
            return this.IconCompatParcelizer.getIconCompatParcelizer().IconCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getShowPopup read(kotlin.Typed3EpoxyController r15, kotlin.setImageDisplayMode r16, boolean r17, boolean r18, kotlin.getAnswerMap r19, kotlin.hasValueTypeDeserializer r20, kotlin.SettableBeanProperty r21, kotlin.bufferMapProperty r22, int r23, kotlin._handleUnrecognizedCharacterEscape r24, int r25) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toggleControllerVisibility.read(o.Typed3EpoxyController, o.setImageDisplayMode, boolean, boolean, o.getAnswerMap, o.hasValueTypeDeserializer, o.SettableBeanProperty, o.bufferMapProperty, int, o._handleUnrecognizedCharacterEscape, int):o.getShowPopup");
    }

    private static final void write(final _handleOddName _handleoddname, final Typed3EpoxyController typed3EpoxyController, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(2036174316);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(typed3EpoxyController) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 147) != 146, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2036174316, i2, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:701)");
            }
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), true);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            setDrawableArtwork.write(typed3EpoxyController, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, (i2 >> 3) & 126);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.switchTargetView
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return toggleControllerVisibility.RemoteActionCompatParcelizer(_handleoddname, typed3EpoxyController, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer implements getAnswerMap<constructType, Boolean> {
        final /* synthetic */ Typed3EpoxyController AudioAttributesCompatParcelizer;
        final /* synthetic */ setImageDisplayMode IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(constructType constructtype) {
            return read(constructtype.getRead());
        }

        public final Boolean read(KeyEvent keyEvent) {
            boolean z;
            if (this.IconCompatParcelizer.IconCompatParcelizer() == lambdaonImageAvailable1androidxmedia3uiPlayerView.RemoteActionCompatParcelizer && setControllerShowTimeoutMs.RemoteActionCompatParcelizer(keyEvent)) {
                z = true;
                Typed3EpoxyController.IconCompatParcelizer$default(this.AudioAttributesCompatParcelizer, (getReferencedType) null, 1, (Object) null);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        AudioAttributesImplApi21Parcelizer(setImageDisplayMode setimagedisplaymode, Typed3EpoxyController typed3EpoxyController) {
            this.IconCompatParcelizer = setimagedisplaymode;
            this.AudioAttributesCompatParcelizer = typed3EpoxyController;
        }
    }

    private static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, setImageDisplayMode setimagedisplaymode, Typed3EpoxyController typed3EpoxyController) {
        return converterInstance.RemoteActionCompatParcelizer(_handleoddname, new AudioAttributesImplApi21Parcelizer(setimagedisplaymode, typed3EpoxyController));
    }

    public static final void RemoteActionCompatParcelizer(setImageDisplayMode setimagedisplaymode, secondaryCount secondarycount, boolean z) {
        BaseSettings read2;
        if (!setimagedisplaymode.AudioAttributesCompatParcelizer()) {
            secondaryCount.RemoteActionCompatParcelizer$default(secondarycount, 0, 1, null);
        } else {
            if (!z || (read2 = setimagedisplaymode.getRead()) == null) {
                return;
            }
            read2.write();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(setViews setviews, setImageDisplayMode setimagedisplaymode, hasValueTypeDeserializer hasvaluetypedeserializer, KeyDeserializers keyDeserializers, SettableBeanProperty settableBeanProperty) {
        setimagedisplaymode.read(MediaRouteVolumeSlider.INSTANCE.write(setviews, hasvaluetypedeserializer, setimagedisplaymode.getWrite(), keyDeserializers, setimagedisplaymode.MediaBrowserCompatSearchResultReceiver(), setimagedisplaymode.RatingCompat()));
        AudioAttributesCompatParcelizer(setimagedisplaymode, hasvaluetypedeserializer, settableBeanProperty);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(setImageDisplayMode setimagedisplaymode) {
        fillInStackTrace remoteActionCompatParcelizer = setimagedisplaymode.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer != null) {
            MediaRouteVolumeSlider.INSTANCE.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, setimagedisplaymode.getWrite(), setimagedisplaymode.MediaBrowserCompatSearchResultReceiver());
        }
        setimagedisplaymode.read((fillInStackTrace) null);
    }

    public static final Object RemoteActionCompatParcelizer(SlowMotionData slowMotionData, hasValueTypeDeserializer hasvaluetypedeserializer, WebViewSubtitleOutput webViewSubtitleOutput, deserializeFromNumber deserializefromnumber, SettableBeanProperty settableBeanProperty, SampleVideos<? super getShowPopup> sampleVideos) {
        WritableTypeIdInclusion writableTypeIdInclusion;
        int iRemoteActionCompatParcelizer = settableBeanProperty.RemoteActionCompatParcelizer(findProperty.AudioAttributesImplApi26Parcelizer(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer()));
        if (iRemoteActionCompatParcelizer < deserializefromnumber.getIconCompatParcelizer().getWrite().length()) {
            writableTypeIdInclusion = deserializefromnumber.write(iRemoteActionCompatParcelizer);
        } else if (iRemoteActionCompatParcelizer != 0) {
            writableTypeIdInclusion = deserializefromnumber.write(iRemoteActionCompatParcelizer - 1);
        } else {
            writableTypeIdInclusion = new WritableTypeIdInclusion(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, (int) setHideThumb.read$default(webViewSubtitleOutput.getRead(), webViewSubtitleOutput.getAudioAttributesImplApi26Parcelizer(), webViewSubtitleOutput.getMediaBrowserCompatItemReceiver(), null, 0, 24, null));
        }
        Object objAudioAttributesCompatParcelizer = slowMotionData.AudioAttributesCompatParcelizer(writableTypeIdInclusion, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    private static final void read(final Typed3EpoxyController typed3EpoxyController, final boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
        deserializeFromNumber audioAttributesCompatParcelizer;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(626339208);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(typed3EpoxyController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(626339208, i2, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1054)");
            }
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1530097388);
                setImageDisplayMode write2 = typed3EpoxyController.getWrite();
                deserializeFromNumber deserializefromnumber = null;
                if (write2 != null && (hasstableidsAudioAttributesImplApi26Parcelizer = write2.AudioAttributesImplApi26Parcelizer()) != null && (audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()) != null) {
                    setImageDisplayMode write3 = typed3EpoxyController.getWrite();
                    if (!(write3 != null ? write3.getOnCommand() : true)) {
                        deserializefromnumber = audioAttributesCompatParcelizer;
                    }
                }
                if (deserializefromnumber == null) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1530097387);
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1530097388);
                    if (findProperty.write(typed3EpoxyController.onRemoveQueueItem().getAudioAttributesCompatParcelizer())) {
                        _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2062097806);
                    } else {
                        _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2109807302);
                        int iRemoteActionCompatParcelizer = typed3EpoxyController.getIconCompatParcelizer().RemoteActionCompatParcelizer(findProperty.AudioAttributesImplBaseParcelizer(typed3EpoxyController.onRemoveQueueItem().getAudioAttributesCompatParcelizer()));
                        int iRemoteActionCompatParcelizer2 = typed3EpoxyController.getIconCompatParcelizer().RemoteActionCompatParcelizer(findProperty.read(typed3EpoxyController.onRemoveQueueItem().getAudioAttributesCompatParcelizer()));
                        _properties _propertiesVarRemoteActionCompatParcelizer = deserializefromnumber.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
                        _properties _propertiesVarRemoteActionCompatParcelizer2 = deserializefromnumber.RemoteActionCompatParcelizer(Math.max(iRemoteActionCompatParcelizer2 - 1, 0));
                        setImageDisplayMode write4 = typed3EpoxyController.getWrite();
                        if (write4 == null || !write4.onFastForward()) {
                            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2062097806);
                        } else {
                            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2110225306);
                            getCurrentData.write(true, _propertiesVarRemoteActionCompatParcelizer, typed3EpoxyController, _handleunrecognizedcharacterescapeWrite, ((i2 << 6) & 896) | 6);
                        }
                        _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                        setImageDisplayMode write5 = typed3EpoxyController.getWrite();
                        if (write5 == null || !write5.onCustomAction()) {
                            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2062097806);
                        } else {
                            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2110574459);
                            getCurrentData.write(false, _propertiesVarRemoteActionCompatParcelizer2, typed3EpoxyController, _handleunrecognizedcharacterescapeWrite, ((i2 << 6) & 896) | 6);
                        }
                        _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    }
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    setImageDisplayMode write6 = typed3EpoxyController.getWrite();
                    if (write6 != null) {
                        if (typed3EpoxyController.onPrepareFromUri()) {
                            write6.AudioAttributesImplBaseParcelizer(false);
                        }
                        if (write6.AudioAttributesCompatParcelizer()) {
                            if (write6.onAddQueueItem()) {
                                typed3EpoxyController.onSetRating();
                            } else {
                                typed3EpoxyController.onSeekTo();
                            }
                        }
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    }
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1989076778);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                typed3EpoxyController.onSeekTo();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.updateContentDescription
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return toggleControllerVisibility.AudioAttributesCompatParcelizer(typed3EpoxyController, z, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void read(final Typed3EpoxyController typed3EpoxyController, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        AbstractDeserializer abstractDeserializerOnPrepareFromMediaId;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1436003720);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(typed3EpoxyController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1436003720, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1101)");
            }
            setImageDisplayMode write2 = typed3EpoxyController.getWrite();
            if (write2 == null || !write2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() || (abstractDeserializerOnPrepareFromMediaId = typed3EpoxyController.onPrepareFromMediaId()) == null || abstractDeserializerOnPrepareFromMediaId.length() <= 0) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2132946858);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-2112351432);
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(typed3EpoxyController);
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = typed3EpoxyController.AudioAttributesImplApi21Parcelizer();
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                MediaRouteButton mediaRouteButton = (MediaRouteButton) objOnPause;
                final long jIconCompatParcelizer = typed3EpoxyController.IconCompatParcelizer((bufferMapProperty) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.IconCompatParcelizer()));
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(jIconCompatParcelizer);
                AudioAttributesImplApi26Parcelizer audioAttributesImplApi26ParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (zIconCompatParcelizer || audioAttributesImplApi26ParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    audioAttributesImplApi26ParcelizerOnPause = new AudioAttributesImplApi26Parcelizer(jIconCompatParcelizer);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesImplApi26ParcelizerOnPause);
                }
                addInterceptor addinterceptor = (addInterceptor) audioAttributesImplApi26ParcelizerOnPause;
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(mediaRouteButton);
                boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(typed3EpoxyController);
                MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((zIconCompatParcelizer2 | zIconCompatParcelizer3) || mediaBrowserCompatItemReceiverOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    mediaBrowserCompatItemReceiverOnPause = new MediaBrowserCompatItemReceiver(mediaRouteButton, typed3EpoxyController);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiverOnPause);
                }
                _handleOddName _handleoddnameIconCompatParcelizer = hasSomeOfFeatures.IconCompatParcelizer(companion, mediaRouteButton, (PointerInputEventHandler) mediaBrowserCompatItemReceiverOnPause);
                boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(jIconCompatParcelizer);
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (zIconCompatParcelizer4 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getAnswerMap() { // from class: o.updateImageViewAspectRatio
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return toggleControllerVisibility.read(jIconCompatParcelizer, (getConfigOverride) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                }
                setProgressUpdateListener.RemoteActionCompatParcelizer(addinterceptor, withValueInstantiators.read$default(_handleoddnameIconCompatParcelizer, false, (getAnswerMap) objOnPause2, 1, null), 0L, _handleunrecognizedcharacterescapeWrite, 0, 4);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.updateErrorMessage
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return toggleControllerVisibility.AudioAttributesCompatParcelizer(typed3EpoxyController, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi26Parcelizer implements addInterceptor {
        final /* synthetic */ long write;

        @Override // kotlin.addInterceptor
        public final long read() {
            return this.write;
        }

        AudioAttributesImplApi26Parcelizer(long j) {
            this.write = j;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver implements PointerInputEventHandler {
        final /* synthetic */ MediaRouteButton RemoteActionCompatParcelizer;
        final /* synthetic */ Typed3EpoxyController write;

        /* JADX INFO: renamed from: o.toggleControllerVisibility$MediaBrowserCompatItemReceiver$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            int AudioAttributesCompatParcelizer;
            final /* synthetic */ Typed3EpoxyController IconCompatParcelizer;
            final /* synthetic */ MediaRouteButton RemoteActionCompatParcelizer;
            private /* synthetic */ Object read;
            final /* synthetic */ handleBadMerge write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                if (this.AudioAttributesCompatParcelizer == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    TopUserCompanion topUserCompanion = (TopUserCompanion) this.read;
                    C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, getCollegeName.AudioAttributesCompatParcelizer, new AnonymousClass3(this.write, this.RemoteActionCompatParcelizer, null), 1);
                    C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, getCollegeName.AudioAttributesCompatParcelizer, new AnonymousClass5(this.write, this.IconCompatParcelizer, null), 1);
                    return getShowPopup.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: renamed from: o.toggleControllerVisibility$MediaBrowserCompatItemReceiver$4$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ handleBadMerge AudioAttributesCompatParcelizer;
                final /* synthetic */ MediaRouteButton IconCompatParcelizer;
                int RemoteActionCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.RemoteActionCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.RemoteActionCompatParcelizer = 1;
                        if (setFixedTextSize.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this) == objIconCompatParcelizer) {
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
                AnonymousClass3(handleBadMerge handlebadmerge, MediaRouteButton mediaRouteButton, SampleVideos<? super AnonymousClass3> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesCompatParcelizer = handlebadmerge;
                    this.IconCompatParcelizer = mediaRouteButton;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass3(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.toggleControllerVisibility$MediaBrowserCompatItemReceiver$4$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass5 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                int IconCompatParcelizer;
                final /* synthetic */ handleBadMerge read;
                final /* synthetic */ Typed3EpoxyController write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.IconCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        handleBadMerge handlebadmerge = this.read;
                        final Typed3EpoxyController typed3EpoxyController = this.write;
                        this.IconCompatParcelizer = 1;
                        if (isSpanStillValid.AudioAttributesCompatParcelizer$default(handlebadmerge, null, null, null, new getAnswerMap() { // from class: o.getUseController
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj2) {
                                return toggleControllerVisibility.MediaBrowserCompatItemReceiver.AnonymousClass4.AnonymousClass5.write(typed3EpoxyController, (getReferencedType) obj2);
                            }
                        }, this, 7, null) == objIconCompatParcelizer) {
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

                /* JADX INFO: Access modifiers changed from: private */
                public static final getShowPopup write(Typed3EpoxyController typed3EpoxyController, getReferencedType getreferencedtype) {
                    typed3EpoxyController.onSetRating();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(handleBadMerge handlebadmerge, Typed3EpoxyController typed3EpoxyController, SampleVideos<? super AnonymousClass5> sampleVideos) {
                    super(2, sampleVideos);
                    this.read = handlebadmerge;
                    this.write = typed3EpoxyController;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass5(this.read, this.write, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass5) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(handleBadMerge handlebadmerge, MediaRouteButton mediaRouteButton, Typed3EpoxyController typed3EpoxyController, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.write = handlebadmerge;
                this.RemoteActionCompatParcelizer = mediaRouteButton;
                this.IconCompatParcelizer = typed3EpoxyController;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
                anonymousClass4.read = obj;
                return anonymousClass4;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = College.IconCompatParcelizer(new AnonymousClass4(handlebadmerge, this.RemoteActionCompatParcelizer, this.write, null), sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }

        MediaBrowserCompatItemReceiver(MediaRouteButton mediaRouteButton, Typed3EpoxyController typed3EpoxyController) {
            this.RemoteActionCompatParcelizer = mediaRouteButton;
            this.write = typed3EpoxyController;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(long j, getConfigOverride getconfigoverride) {
        getconfigoverride.write(setDebugLoggingEnabled.IconCompatParcelizer(), new requestDelayedModelBuild(onContentAspectRatioChanged.write, j, removeInterceptor.RemoteActionCompatParcelizer, true, null));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(setImageDisplayMode setimagedisplaymode, hasValueTypeDeserializer hasvaluetypedeserializer, SettableBeanProperty settableBeanProperty) {
        parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
        parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
        getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
        parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
        try {
            hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
            if (hasstableidsAudioAttributesImplApi26Parcelizer == null) {
                return;
            }
            fillInStackTrace remoteActionCompatParcelizer = setimagedisplaymode.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer == null) {
                return;
            }
            isAbstract isabstractMediaBrowserCompatCustomActionResultReceiver = setimagedisplaymode.MediaBrowserCompatCustomActionResultReceiver();
            if (isabstractMediaBrowserCompatCustomActionResultReceiver == null) {
                return;
            }
            MediaRouteVolumeSlider.INSTANCE.write(hasvaluetypedeserializer, setimagedisplaymode.getIconCompatParcelizer(), hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer(), isabstractMediaBrowserCompatCustomActionResultReceiver, remoteActionCompatParcelizer, setimagedisplaymode.AudioAttributesCompatParcelizer(), settableBeanProperty);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } finally {
            companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
        }
    }

    private static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, Typed3EpoxyController typed3EpoxyController, TopUserCompanion topUserCompanion) {
        return getDesignInfoListui_tooling.RemoteActionCompatParcelizer ? setApplyingOpacityToLayersEnabled.read(_handleoddname, typed3EpoxyController, topUserCompanion) : _handleoddname;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError read(Typed3EpoxyController typed3EpoxyController, StreamConstraintsException streamConstraintsException) {
        return new AudioAttributesCompatParcelizer(typed3EpoxyController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(hasValueTypeDeserializer hasvaluetypedeserializer, getAnswerMap getanswermap, _handleOddName _handleoddname, deserializeWithObjectId deserializewithobjectid, addUnresolvedId addunresolvedid, getAnswerMap getanswermap2, hashCode hashcode, Instantiatable instantiatable, boolean z, int i, int i2, KeyDeserializers keyDeserializers, setErrorMessageProvider seterrormessageprovider, boolean z2, boolean z3, getModuleData getmoduledata, suppressLayout suppresslayout, int i3, int i4, int i5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i6) {
        IconCompatParcelizer(hasvaluetypedeserializer, (getAnswerMap<? super hasValueTypeDeserializer, getShowPopup>) getanswermap, _handleoddname, deserializewithobjectid, addunresolvedid, (getAnswerMap<? super deserializeFromNumber, getShowPopup>) getanswermap2, hashcode, instantiatable, z, i, i2, keyDeserializers, seterrormessageprovider, z2, z3, (getModuleData<? super MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) getmoduledata, suppresslayout, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), _appendEscaped.RemoteActionCompatParcelizer(i4), i5);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, Typed3EpoxyController typed3EpoxyController, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        write(_handleoddname, typed3EpoxyController, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Typed3EpoxyController typed3EpoxyController, boolean z, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        read(typed3EpoxyController, z, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Typed3EpoxyController typed3EpoxyController, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        read(typed3EpoxyController, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
