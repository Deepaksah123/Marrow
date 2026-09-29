package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a_\u0010\u0000\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001a_\u0010\u0000\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001aa\u0010\u0000\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001ae\u0010\u0000\u001a\u00020\u0001*\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0019\u001ae\u0010\u0000\u001a\u00020\u0001*\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001a\u001am\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0\u001c2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001d\u001ak\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001c2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010 \u001a\u0091\u0001\u0010!\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001c2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010'\u001a9\u0010+\u001a\u00020$\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0\u001c2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010,\u001a\u0002H\u001bH\u0003¢\u0006\u0002\u0010-\"\u001e\u0010(\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020$0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006.²\u0006\u001c\u0010/\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030#X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"AnimatedVisibility", "", "visible", "", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "label", "", "content", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "T", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AnimatedVisibilityImpl", "transition", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "AnimatedEnterExitImpl", "shouldDisposeBlock", "Lkotlin/Function2;", "Landroidx/compose/animation/EnterExitState;", "onLookaheadMeasured", "Landroidx/compose/animation/OnLookaheadMeasured;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exitFinished", "getExitFinished", "(Landroidx/compose/animation/core/Transition;)Z", "targetEnterExit", "targetState", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AppCompatPopupWindow {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ setDropDownWidth AudioAttributesCompatParcelizer;
        final /* synthetic */ boolean AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ _handleOddName AudioAttributesImplBaseParcelizer;
        final /* synthetic */ setDropDownVerticalOffset IconCompatParcelizer;
        final /* synthetic */ DrawerLayoutLayoutParams MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ String MediaBrowserCompatItemReceiver;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        final /* synthetic */ getModuleData<setSupportImageTintMode, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;
        final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(DrawerLayoutLayoutParams drawerLayoutLayoutParams, boolean z, _handleOddName _handleoddname, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, String str, getModuleData<? super setSupportImageTintMode, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, int i, int i2) {
            super(2);
            this.MediaBrowserCompatCustomActionResultReceiver = drawerLayoutLayoutParams;
            this.AudioAttributesImplApi26Parcelizer = z;
            this.AudioAttributesImplBaseParcelizer = _handleoddname;
            this.IconCompatParcelizer = setdropdownverticaloffset;
            this.AudioAttributesCompatParcelizer = setdropdownwidth;
            this.MediaBrowserCompatItemReceiver = str;
            this.read = getmoduledata;
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            AppCompatPopupWindow.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.read, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer | 1), this.write);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplBaseParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ setDropDownWidth AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<T, Boolean> AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ setLayoutInflater<T> AudioAttributesImplBaseParcelizer;
        final /* synthetic */ int IconCompatParcelizer;
        final /* synthetic */ _handleOddName RemoteActionCompatParcelizer;
        final /* synthetic */ getModuleData<setSupportImageTintMode, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;
        final /* synthetic */ setDropDownVerticalOffset write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesImplBaseParcelizer(setLayoutInflater<T> setlayoutinflater, getAnswerMap<? super T, Boolean> getanswermap, _handleOddName _handleoddname, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, getModuleData<? super setSupportImageTintMode, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, int i) {
            super(2);
            this.AudioAttributesImplBaseParcelizer = setlayoutinflater;
            this.AudioAttributesImplApi26Parcelizer = getanswermap;
            this.RemoteActionCompatParcelizer = _handleoddname;
            this.write = setdropdownverticaloffset;
            this.AudioAttributesCompatParcelizer = setdropdownwidth;
            this.read = getmoduledata;
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            AppCompatPopupWindow.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, this.read, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.IconCompatParcelizer | 1));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ setDropDownVerticalOffset AudioAttributesCompatParcelizer;
        final /* synthetic */ setTextFuture AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ setLayoutInflater<T> AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<setDropDownHorizontalOffset, setDropDownHorizontalOffset, Boolean> AudioAttributesImplBaseParcelizer;
        final /* synthetic */ int IconCompatParcelizer;
        final /* synthetic */ _handleOddName MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ getAnswerMap<T, Boolean> MediaBrowserCompatItemReceiver;
        final /* synthetic */ setDropDownWidth RemoteActionCompatParcelizer;
        final /* synthetic */ int read;
        final /* synthetic */ getModuleData<setSupportImageTintMode, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(setLayoutInflater<T> setlayoutinflater, getAnswerMap<? super T, Boolean> getanswermap, _handleOddName _handleoddname, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, MagicModuleSubmissionRequestBody<? super setDropDownHorizontalOffset, ? super setDropDownHorizontalOffset, Boolean> magicModuleSubmissionRequestBody, setTextFuture settextfuture, getModuleData<? super setSupportImageTintMode, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, int i, int i2) {
            super(2);
            this.AudioAttributesImplApi26Parcelizer = setlayoutinflater;
            this.MediaBrowserCompatItemReceiver = getanswermap;
            this.MediaBrowserCompatCustomActionResultReceiver = _handleoddname;
            this.AudioAttributesCompatParcelizer = setdropdownverticaloffset;
            this.RemoteActionCompatParcelizer = setdropdownwidth;
            this.AudioAttributesImplBaseParcelizer = magicModuleSubmissionRequestBody;
            this.AudioAttributesImplApi21Parcelizer = settextfuture;
            this.write = getmoduledata;
            this.IconCompatParcelizer = i;
            this.read = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            AppCompatPopupWindow.write(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer, this.write, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.IconCompatParcelizer | 1), this.read);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ setDropDownWidth AudioAttributesCompatParcelizer;
        final /* synthetic */ _handleOddName AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ int IconCompatParcelizer;
        final /* synthetic */ boolean MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ String MediaBrowserCompatItemReceiver;
        final /* synthetic */ setDropDownVerticalOffset RemoteActionCompatParcelizer;
        final /* synthetic */ int read;
        final /* synthetic */ getModuleData<setSupportImageTintMode, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(boolean z, _handleOddName _handleoddname, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, String str, getModuleData<? super setSupportImageTintMode, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, int i, int i2) {
            super(2);
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            this.AudioAttributesImplApi26Parcelizer = _handleoddname;
            this.RemoteActionCompatParcelizer = setdropdownverticaloffset;
            this.AudioAttributesCompatParcelizer = setdropdownwidth;
            this.MediaBrowserCompatItemReceiver = str;
            this.write = getmoduledata;
            this.read = i;
            this.IconCompatParcelizer = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            AppCompatPopupWindow.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.write, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.read | 1), this.IconCompatParcelizer);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ setDropDownVerticalOffset AudioAttributesCompatParcelizer;
        final /* synthetic */ setCollapseIcon<Boolean> AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ String AudioAttributesImplBaseParcelizer;
        final /* synthetic */ getModuleData<setSupportImageTintMode, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer;
        final /* synthetic */ _handleOddName MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        final /* synthetic */ setDropDownWidth read;
        final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(setCollapseIcon<Boolean> setcollapseicon, _handleOddName _handleoddname, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, String str, getModuleData<? super setSupportImageTintMode, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, int i, int i2) {
            super(2);
            this.AudioAttributesImplApi26Parcelizer = setcollapseicon;
            this.MediaBrowserCompatCustomActionResultReceiver = _handleoddname;
            this.AudioAttributesCompatParcelizer = setdropdownverticaloffset;
            this.read = setdropdownwidth;
            this.AudioAttributesImplBaseParcelizer = str;
            this.IconCompatParcelizer = getmoduledata;
            this.write = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            AppCompatPopupWindow.write(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, this.read, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.write | 1), this.RemoteActionCompatParcelizer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(boolean r22, kotlin._handleOddName r23, kotlin.setDropDownVerticalOffset r24, kotlin.setDropDownWidth r25, java.lang.String r26, kotlin.getModuleData<? super kotlin.setSupportImageTintMode, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r27, kotlin._handleUnrecognizedCharacterEscape r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AppCompatPopupWindow.RemoteActionCompatParcelizer(boolean, o._handleOddName, o.setDropDownVerticalOffset, o.setDropDownWidth, java.lang.String, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: renamed from: o.AppCompatPopupWindow$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "IconCompatParcelizer", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<Boolean, Boolean> {
        public static final AnonymousClass3 RemoteActionCompatParcelizer = new AnonymousClass3();

        public final Boolean IconCompatParcelizer(boolean z) {
            return Boolean.valueOf(z);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            return IconCompatParcelizer(bool.booleanValue());
        }

        AnonymousClass3() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(kotlin.DrawerLayoutLayoutParams r23, boolean r24, kotlin._handleOddName r25, kotlin.setDropDownVerticalOffset r26, kotlin.setDropDownWidth r27, java.lang.String r28, kotlin.getModuleData<? super kotlin.setSupportImageTintMode, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r29, kotlin._handleUnrecognizedCharacterEscape r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AppCompatPopupWindow.AudioAttributesCompatParcelizer(o.DrawerLayoutLayoutParams, boolean, o._handleOddName, o.setDropDownVerticalOffset, o.setDropDownWidth, java.lang.String, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: renamed from: o.AppCompatPopupWindow$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "IconCompatParcelizer", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<Boolean, Boolean> {
        public static final AnonymousClass1 AudioAttributesCompatParcelizer = new AnonymousClass1();

        public final Boolean IconCompatParcelizer(boolean z) {
            return Boolean.valueOf(z);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            return IconCompatParcelizer(bool.booleanValue());
        }

        AnonymousClass1() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(kotlin.setCollapseIcon<java.lang.Boolean> r22, kotlin._handleOddName r23, kotlin.setDropDownVerticalOffset r24, kotlin.setDropDownWidth r25, java.lang.String r26, kotlin.getModuleData<? super kotlin.setSupportImageTintMode, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r27, kotlin._handleUnrecognizedCharacterEscape r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AppCompatPopupWindow.write(o.setCollapseIcon, o._handleOddName, o.setDropDownVerticalOffset, o.setDropDownWidth, java.lang.String, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: renamed from: o.AppCompatPopupWindow$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "IconCompatParcelizer", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<Boolean, Boolean> {
        public static final AnonymousClass5 RemoteActionCompatParcelizer = new AnonymousClass5();

        public final Boolean IconCompatParcelizer(boolean z) {
            return Boolean.valueOf(z);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            return IconCompatParcelizer(bool.booleanValue());
        }

        AnonymousClass5() {
            super(1);
        }
    }

    public static final <T> void IconCompatParcelizer(setLayoutInflater<T> setlayoutinflater, getAnswerMap<? super T, Boolean> getanswermap, _handleOddName _handleoddname, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, getModuleData<? super setSupportImageTintMode, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1706321816);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setlayoutinflater) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setdropdownverticaloffset) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setdropdownwidth) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getmoduledata) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i2) != 74898, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1706321816, i2, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:677)");
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            AnonymousClass4 anonymousClass4OnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z | z2) || anonymousClass4OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                anonymousClass4OnPause = new AnonymousClass4(getanswermap, setlayoutinflater);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(anonymousClass4OnPause);
            }
            _handleOddName _handleoddnameWrite = isTypeOrSubTypeOf.write(_handleoddname, (getModuleData) anonymousClass4OnPause);
            AnonymousClass6 anonymousClass6OnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (anonymousClass6OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                anonymousClass6OnPause = AnonymousClass6.RemoteActionCompatParcelizer;
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(anonymousClass6OnPause);
            }
            write(setlayoutinflater, getanswermap, _handleoddnameWrite, setdropdownverticaloffset, setdropdownwidth, (MagicModuleSubmissionRequestBody) anonymousClass6OnPause, null, getmoduledata, _handleunrecognizedcharacterescapeWrite, i3 | 196608 | i4 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new AudioAttributesImplBaseParcelizer(setlayoutinflater, getanswermap, _handleoddname, setdropdownverticaloffset, setdropdownwidth, getmoduledata, i));
        }
    }

    /* JADX INFO: renamed from: o.AppCompatPopupWindow$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "RemoteActionCompatParcelizer", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getModuleData<withContentValueHandler, isTypeOrSuperTypeOf, PropertyValueAny, withHandlersFrom> {
        final /* synthetic */ setLayoutInflater<T> $read;
        final /* synthetic */ getAnswerMap<T, Boolean> $write;

        @Override // kotlin.getModuleData
        public final /* bridge */ /* synthetic */ withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, PropertyValueAny propertyValueAny) {
            return RemoteActionCompatParcelizer(withcontentvaluehandler, istypeorsupertypeof, propertyValueAny.getRead());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final withHandlersFrom RemoteActionCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
            long jRemoteActionCompatParcelizer;
            _parser _parserVarWrite = istypeorsupertypeof.write(j);
            if (withcontentvaluehandler.r_() && !this.$write.invoke((T) this.$read.AudioAttributesImplApi26Parcelizer()).booleanValue()) {
                jRemoteActionCompatParcelizer = getKey.INSTANCE.RemoteActionCompatParcelizer();
            } else {
                long j2 = -1;
                jRemoteActionCompatParcelizer = getKey.read((((long) _parserVarWrite.getRead()) << 32) | (((long) _parserVarWrite.getRemoteActionCompatParcelizer()) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
            }
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, (int) (jRemoteActionCompatParcelizer >> 32), (int) jRemoteActionCompatParcelizer, null, new AnonymousClass1(_parserVarWrite), 4, null);
        }

        /* JADX INFO: renamed from: o.AppCompatPopupWindow$4$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "AudioAttributesCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
            final /* synthetic */ _parser $AudioAttributesCompatParcelizer;

            public final void AudioAttributesCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
                _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, this.$AudioAttributesCompatParcelizer, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
                AudioAttributesCompatParcelizer(iconCompatParcelizer);
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(_parser _parserVar) {
                super(1);
                this.$AudioAttributesCompatParcelizer = _parserVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(getAnswerMap<? super T, Boolean> getanswermap, setLayoutInflater<T> setlayoutinflater) {
            super(3);
            this.$write = getanswermap;
            this.$read = setlayoutinflater;
        }
    }

    /* JADX INFO: renamed from: o.AppCompatPopupWindow$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setDropDownHorizontalOffset;", "p0", "p1", "", "write", "(Lo/setDropDownHorizontalOffset;Lo/setDropDownHorizontalOffset;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass6 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<setDropDownHorizontalOffset, setDropDownHorizontalOffset, Boolean> {
        public static final AnonymousClass6 RemoteActionCompatParcelizer = new AnonymousClass6();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(setDropDownHorizontalOffset setdropdownhorizontaloffset, setDropDownHorizontalOffset setdropdownhorizontaloffset2) {
            return Boolean.valueOf(setdropdownhorizontaloffset == setdropdownhorizontaloffset2 && setdropdownhorizontaloffset2 == setDropDownHorizontalOffset.write);
        }

        AnonymousClass6() {
            super(2);
        }
    }

    public static final <T> void write(setLayoutInflater<T> setlayoutinflater, getAnswerMap<? super T, Boolean> getanswermap, _handleOddName _handleoddname, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, MagicModuleSubmissionRequestBody<? super setDropDownHorizontalOffset, ? super setDropDownHorizontalOffset, Boolean> magicModuleSubmissionRequestBody, setTextFuture settextfuture, getModuleData<? super setSupportImageTintMode, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        setTextFuture settextfuture2;
        setTextFuture settextfuture3;
        int i4;
        setTextFuture settextfuture4;
        _handleOddName.Companion companionWrite;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1912839215);
        if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setlayoutinflater) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setdropdownverticaloffset) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setdropdownwidth) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i5 = i2 & 64;
        int i6 = 1572864;
        if (i5 != 0) {
            i3 |= i6;
        } else if ((1572864 & i) == 0) {
            i6 = (i & 2097152) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(settextfuture) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(settextfuture) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            i3 |= i6;
        }
        if ((12582912 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getmoduledata) ? 8388608 : 4194304;
        }
        int i7 = i3;
        boolean z = true;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((4793491 & i7) != 4793490, i7 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            settextfuture2 = settextfuture;
        } else {
            setTextFuture settextfuture5 = i5 != 0 ? null : settextfuture;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1912839215, i7, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:715)");
            }
            if (!getanswermap.invoke(setlayoutinflater.AudioAttributesImplApi26Parcelizer()).booleanValue() && !getanswermap.invoke(setlayoutinflater.RemoteActionCompatParcelizer()).booleanValue() && !setlayoutinflater.MediaMetadataCompat() && !setlayoutinflater.AudioAttributesCompatParcelizer()) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-272333293);
                settextfuture4 = settextfuture5;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-232413539);
                int i8 = i7 & 14;
                int i9 = i8 | 48;
                int i10 = i9 & 14;
                boolean z2 = ((i10 ^ 6) > 4 && _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setlayoutinflater)) || (i9 & 6) == 4;
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z2 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = setlayoutinflater.RemoteActionCompatParcelizer();
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                if (setlayoutinflater.MediaMetadataCompat()) {
                    objOnPause = setlayoutinflater.RemoteActionCompatParcelizer();
                }
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1844425648);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    settextfuture3 = settextfuture5;
                    _validJsonValueList.AudioAttributesCompatParcelizer(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:724)");
                } else {
                    settextfuture3 = settextfuture5;
                }
                int i11 = i7 & 126;
                setDropDownHorizontalOffset setdropdownhorizontaloffsetWrite = write(setlayoutinflater, getanswermap, objOnPause, _handleunrecognizedcharacterescapeWrite, i11);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                T tAudioAttributesImplApi26Parcelizer = setlayoutinflater.AudioAttributesImplApi26Parcelizer();
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1844425648);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    i4 = i7;
                    _validJsonValueList.AudioAttributesCompatParcelizer(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:724)");
                } else {
                    i4 = i7;
                }
                setDropDownHorizontalOffset setdropdownhorizontaloffsetWrite2 = write(setlayoutinflater, getanswermap, tAudioAttributesImplApi26Parcelizer, _handleunrecognizedcharacterescapeWrite, i11);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                setTextFuture settextfuture6 = settextfuture3;
                int i12 = i4;
                setLayoutInflater setlayoutinflaterRemoteActionCompatParcelizer = setCardElevation.RemoteActionCompatParcelizer(setlayoutinflater, setdropdownhorizontaloffsetWrite, setdropdownhorizontaloffsetWrite2, "EnterExitTransition", _handleunrecognizedcharacterescapeWrite, i10 | 3072);
                parseDouble parsedouble = _qbuf.read(magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, (i12 >> 15) & 14);
                Boolean boolInvoke = magicModuleSubmissionRequestBody.invoke(setlayoutinflaterRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), setlayoutinflaterRemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer());
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setlayoutinflaterRemoteActionCompatParcelizer);
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedouble);
                IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    iconCompatParcelizerOnPause = new IconCompatParcelizer(setlayoutinflaterRemoteActionCompatParcelizer, parsedouble, null);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
                }
                parseDouble parsedoubleWrite = _qbuf.write(boolInvoke, (MagicModuleSubmissionRequestBody) iconCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 0);
                if (read((setLayoutInflater<setDropDownHorizontalOffset>) setlayoutinflaterRemoteActionCompatParcelizer) && read((parseDouble<Boolean>) parsedoubleWrite)) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-272333293);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                    settextfuture4 = settextfuture6;
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-231383533);
                    boolean z3 = i8 == 4;
                    Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                    if (z3 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause2 = new AppCompatRadioButton(setlayoutinflaterRemoteActionCompatParcelizer);
                        _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                    }
                    AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) objOnPause2;
                    int i13 = i12 >> 6;
                    _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                    _handleOddName _handleoddnameAudioAttributesCompatParcelizer = AppCompatRatingBar.AudioAttributesCompatParcelizer(setlayoutinflaterRemoteActionCompatParcelizer, setdropdownverticaloffset, setdropdownwidth, null, "Built-in", _handleunrecognizedcharacterescape2, (i13 & 112) | CpioConstants.C_ISBLK | (i13 & 896), 4);
                    settextfuture4 = settextfuture6;
                    if (settextfuture4 != null) {
                        _handleunrecognizedcharacterescape2.IconCompatParcelizer(-230964196);
                        _handleOddName.Companion companion = _handleOddName.INSTANCE;
                        if ((i12 & 3670016) != 1048576 && ((i12 & 2097152) == 0 || !_handleunrecognizedcharacterescape2.IconCompatParcelizer(settextfuture4))) {
                            z = false;
                        }
                        AnonymousClass2 anonymousClass2OnPause = _handleunrecognizedcharacterescape2.onPause();
                        if (z || anonymousClass2OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            anonymousClass2OnPause = new AnonymousClass2(settextfuture4);
                            _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(anonymousClass2OnPause);
                        }
                        companionWrite = isTypeOrSubTypeOf.write(companion, (getModuleData) anonymousClass2OnPause);
                        _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                    } else {
                        _handleunrecognizedcharacterescape2.IconCompatParcelizer(-7432681);
                        _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                        companionWrite = _handleOddName.INSTANCE;
                    }
                    _handleOddName _handleoddnameAudioAttributesCompatParcelizer2 = _handleoddname.AudioAttributesCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(companionWrite));
                    Object objOnPause3 = _handleunrecognizedcharacterescape2.onPause();
                    if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause3 = new setImageURI(appCompatRadioButton);
                        _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause3);
                    }
                    setImageURI setimageuri = (setImageURI) objOnPause3;
                    int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, 0));
                    _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape2.handleMediaPlayPauseIfPendingOnHandler();
                    _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, _handleoddnameAudioAttributesCompatParcelizer2);
                    getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
                    if (!(_handleunrecognizedcharacterescape2.MediaMetadataCompat() instanceof _closeInput)) {
                        _getBigDecimal.write();
                    }
                    _handleunrecognizedcharacterescape2.onPrepareFromMediaId();
                    if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo()) {
                        _handleunrecognizedcharacterescape2.read(getcreatedondatemsIconCompatParcelizer);
                    } else {
                        _handleunrecognizedcharacterescape2.onPlayFromUri();
                    }
                    _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescape2);
                    NumberOutput.write(_handleunrecognizedcharacterescape3, setimageuri, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                    NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                    NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                    NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
                    NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                    getmoduledata.AudioAttributesCompatParcelizer(appCompatRadioButton, _handleunrecognizedcharacterescape2, Integer.valueOf((i12 >> 18) & 112));
                    _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
                    _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                }
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            settextfuture2 = settextfuture4;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new RemoteActionCompatParcelizer(setlayoutinflater, getanswermap, _handleoddname, setdropdownverticaloffset, setdropdownwidth, magicModuleSubmissionRequestBody, settextfuture2, getmoduledata, i, i2));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getEscapeCodesForAscii<Boolean>, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ parseDouble<MagicModuleSubmissionRequestBody<setDropDownHorizontalOffset, setDropDownHorizontalOffset, Boolean>> IconCompatParcelizer;
        final /* synthetic */ setLayoutInflater<setDropDownHorizontalOffset> RemoteActionCompatParcelizer;
        private /* synthetic */ Object write;

        /* JADX INFO: renamed from: o.AppCompatPopupWindow$IconCompatParcelizer$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
            final /* synthetic */ setLayoutInflater<setDropDownHorizontalOffset> $read;

            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AppCompatPopupWindow.read(this.$read));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater) {
                super(0);
                this.$read = setlayoutinflater;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final getEscapeCodesForAscii getescapecodesforascii = (getEscapeCodesForAscii) this.write;
                NewNumberOtpResendRequest newNumberOtpResendRequestIconCompatParcelizer = _qbuf.IconCompatParcelizer(new AnonymousClass2(this.RemoteActionCompatParcelizer));
                final setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater = this.RemoteActionCompatParcelizer;
                final parseDouble<MagicModuleSubmissionRequestBody<setDropDownHorizontalOffset, setDropDownHorizontalOffset, Boolean>> parsedouble = this.IconCompatParcelizer;
                this.AudioAttributesCompatParcelizer = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.AppCompatPopupWindow.IconCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer(((Boolean) obj2).booleanValue(), sampleVideos);
                    }

                    public final Object AudioAttributesCompatParcelizer(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
                        getescapecodesforascii.write(QBankStatsResponse.AudioAttributesCompatParcelizer(z ? ((Boolean) AppCompatPopupWindow.write(parsedouble).invoke(setlayoutinflater.RemoteActionCompatParcelizer(), setlayoutinflater.AudioAttributesImplApi26Parcelizer())).booleanValue() : false));
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
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater, parseDouble<? extends MagicModuleSubmissionRequestBody<? super setDropDownHorizontalOffset, ? super setDropDownHorizontalOffset, Boolean>> parsedouble, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = setlayoutinflater;
            this.IconCompatParcelizer = parsedouble;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
            iconCompatParcelizer.write = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getEscapeCodesForAscii<Boolean> getescapecodesforascii, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(getescapecodesforascii, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.AppCompatPopupWindow$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getModuleData<withContentValueHandler, isTypeOrSuperTypeOf, PropertyValueAny, withHandlersFrom> {
        final /* synthetic */ setTextFuture $write;

        @Override // kotlin.getModuleData
        public final /* bridge */ /* synthetic */ withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, PropertyValueAny propertyValueAny) {
            return AudioAttributesCompatParcelizer(withcontentvaluehandler, istypeorsupertypeof, propertyValueAny.getRead());
        }

        public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
            _parser _parserVarWrite = istypeorsupertypeof.write(j);
            setTextFuture settextfuture = this.$write;
            if (withcontentvaluehandler.r_()) {
                long j2 = -1;
                settextfuture.IconCompatParcelizer(getKey.read((((long) _parserVarWrite.getRemoteActionCompatParcelizer()) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) _parserVarWrite.getRead()) << 32)));
            }
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new AnonymousClass5(_parserVarWrite), 4, null);
        }

        /* JADX INFO: renamed from: o.AppCompatPopupWindow$2$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "read", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
            final /* synthetic */ _parser $AudioAttributesCompatParcelizer;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
                read(iconCompatParcelizer);
                return getShowPopup.INSTANCE;
            }

            public final void read(_parser.IconCompatParcelizer iconCompatParcelizer) {
                _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, this.$AudioAttributesCompatParcelizer, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(_parser _parserVar) {
                super(1);
                this.$AudioAttributesCompatParcelizer = _parserVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(setTextFuture settextfuture) {
            super(3);
            this.$write = settextfuture;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater) {
        return setlayoutinflater.RemoteActionCompatParcelizer() == setDropDownHorizontalOffset.write && setlayoutinflater.AudioAttributesImplApi26Parcelizer() == setDropDownHorizontalOffset.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> setDropDownHorizontalOffset write(setLayoutInflater<T> setlayoutinflater, getAnswerMap<? super T, Boolean> getanswermap, T t, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        setDropDownHorizontalOffset setdropdownhorizontaloffset;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:833)");
        }
        _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(-422486745, setlayoutinflater);
        if (setlayoutinflater.MediaMetadataCompat()) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-212166497);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (getanswermap.invoke(t).booleanValue()) {
                setdropdownhorizontaloffset = setDropDownHorizontalOffset.IconCompatParcelizer;
            } else if (getanswermap.invoke(setlayoutinflater.RemoteActionCompatParcelizer()).booleanValue()) {
                setdropdownhorizontaloffset = setDropDownHorizontalOffset.write;
            } else {
                setdropdownhorizontaloffset = setDropDownHorizontalOffset.read;
            }
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-211892364);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            InputAccessor inputAccessor = (InputAccessor) objOnPause;
            if (getanswermap.invoke(setlayoutinflater.RemoteActionCompatParcelizer()).booleanValue()) {
                inputAccessor.write(Boolean.TRUE);
            }
            if (getanswermap.invoke(t).booleanValue()) {
                setdropdownhorizontaloffset = setDropDownHorizontalOffset.IconCompatParcelizer;
            } else if (((Boolean) inputAccessor.getRemoteActionCompatParcelizer()).booleanValue()) {
                setdropdownhorizontaloffset = setDropDownHorizontalOffset.write;
            } else {
                setdropdownhorizontaloffset = setDropDownHorizontalOffset.read;
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatItemReceiver();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return setdropdownhorizontaloffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MagicModuleSubmissionRequestBody<setDropDownHorizontalOffset, setDropDownHorizontalOffset, Boolean> write(parseDouble<? extends MagicModuleSubmissionRequestBody<? super setDropDownHorizontalOffset, ? super setDropDownHorizontalOffset, Boolean>> parsedouble) {
        return (MagicModuleSubmissionRequestBody) parsedouble.getRemoteActionCompatParcelizer();
    }

    private static final boolean read(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }
}
