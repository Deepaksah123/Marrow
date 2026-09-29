package kotlin;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/_handleOddName;", "Lo/handleWeirdNativeValue;", "p0", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "p1", "IconCompatParcelizer", "(Lo/_handleOddName;Lo/handleWeirdNativeValue;Lo/getAnswerMap;)Lo/_handleOddName;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "read", "(Lo/_handleOddName;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class handleUnexpectedToken {
    public static /* synthetic */ _handleOddName IconCompatParcelizer$default(_handleOddName _handleoddname, handleWeirdNativeValue handleweirdnativevalue, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            handleweirdnativevalue = null;
        }
        return IconCompatParcelizer(_handleoddname, handleweirdnativevalue, getanswermap);
    }

    /* JADX INFO: renamed from: o.handleUnexpectedToken$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/_handleOddName;", "write", "(Lo/_handleOddName;Lo/_handleUnrecognizedCharacterEscape;I)Lo/_handleOddName;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getModuleData<_handleOddName, _handleUnrecognizedCharacterEscape, Integer, _handleOddName> {
        final /* synthetic */ handleWeirdNativeValue $IconCompatParcelizer;
        final /* synthetic */ getAnswerMap<MotionEvent, Boolean> $RemoteActionCompatParcelizer;

        @Override // kotlin.getModuleData
        public final /* synthetic */ _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            return write(_handleoddname, _handleunrecognizedcharacterescape, num.intValue());
        }

        public final _handleOddName write(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(374375707);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(374375707, i, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
            }
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new handleMissingInstantiator();
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            handleMissingInstantiator handlemissinginstantiator = (handleMissingInstantiator) objOnPause;
            handlemissinginstantiator.read(this.$RemoteActionCompatParcelizer);
            handlemissinginstantiator.RemoteActionCompatParcelizer(this.$IconCompatParcelizer);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return handlemissinginstantiator;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(getAnswerMap<? super MotionEvent, Boolean> getanswermap, handleWeirdNativeValue handleweirdnativevalue) {
            super(3);
            this.$RemoteActionCompatParcelizer = getanswermap;
            this.$IconCompatParcelizer = handleweirdnativevalue;
        }
    }

    public static final _handleOddName read(_handleOddName _handleoddname, AndroidViewHolder androidViewHolder) {
        handleMissingInstantiator handlemissinginstantiator = new handleMissingInstantiator();
        handlemissinginstantiator.read(new AnonymousClass3(androidViewHolder));
        handleWeirdNativeValue handleweirdnativevalue = new handleWeirdNativeValue();
        handlemissinginstantiator.RemoteActionCompatParcelizer(handleweirdnativevalue);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui(handleweirdnativevalue);
        return _handleoddname.AudioAttributesCompatParcelizer(handlemissinginstantiator);
    }

    /* JADX INFO: renamed from: o.handleUnexpectedToken$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "p0", "", "IconCompatParcelizer", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<MotionEvent, Boolean> {
        final /* synthetic */ AndroidViewHolder $write;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.$write.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.$write.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AndroidViewHolder androidViewHolder) {
            super(1);
            this.$write = androidViewHolder;
        }
    }

    /* JADX INFO: renamed from: o.handleUnexpectedToken$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "IconCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ handleWeirdNativeValue $AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            IconCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(as asVar) {
            asVar.write("pointerInteropFilter");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("requestDisallowInterceptTouchEvent", this.$AudioAttributesCompatParcelizer);
            asVar.getIconCompatParcelizer().IconCompatParcelizer("onTouchEvent", this.$IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(handleWeirdNativeValue handleweirdnativevalue, getAnswerMap getanswermap) {
            super(1);
            this.$AudioAttributesCompatParcelizer = handleweirdnativevalue;
            this.$IconCompatParcelizer = getanswermap;
        }
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, handleWeirdNativeValue handleweirdnativevalue, getAnswerMap<? super MotionEvent, Boolean> getanswermap) {
        return _verifyNLZ2.AudioAttributesCompatParcelizer(_handleoddname, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass4(handleweirdnativevalue, getanswermap) : C0214type.read(), new AnonymousClass1(getanswermap, handleweirdnativevalue));
    }
}
