package kotlin;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\n\u001ay\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\r\u001a1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0011\u001a[\u0010\u0012\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020#\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0010H\u0002\"\"\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"AndroidView", "", "T", "Landroid/view/View;", "factory", "Lkotlin/Function1;", "Landroid/content/Context;", "modifier", "Landroidx/compose/ui/Modifier;", "update", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "createAndroidViewNodeFactory", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "updateViewHolderParams", "Landroidx/compose/runtime/Updater;", "compositeKeyHash", "", "density", "Landroidx/compose/ui/unit/Density;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "compositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "updateViewHolderParams-6NefGtU", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/unit/Density;Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/CompositionLocalMap;)V", "requireViewFactoryHolder", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "NoOpUpdate", "Lkotlin/ExtensionFunctionType;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AtomicLongDeserializer {
    private static final getAnswerMap<View, getShowPopup> AudioAttributesCompatParcelizer = AnonymousClass7.read;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ getAnswerMap<Context, T> AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<T, getShowPopup> AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ getAnswerMap<T, getShowPopup> AudioAttributesImplBaseParcelizer;
        final /* synthetic */ _handleOddName IconCompatParcelizer;
        final /* synthetic */ getAnswerMap<T, getShowPopup> RemoteActionCompatParcelizer;
        final /* synthetic */ int read;
        final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(getAnswerMap<? super Context, ? extends T> getanswermap, _handleOddName _handleoddname, getAnswerMap<? super T, getShowPopup> getanswermap2, getAnswerMap<? super T, getShowPopup> getanswermap3, getAnswerMap<? super T, getShowPopup> getanswermap4, int i, int i2) {
            super(2);
            this.AudioAttributesCompatParcelizer = getanswermap;
            this.IconCompatParcelizer = _handleoddname;
            this.AudioAttributesImplBaseParcelizer = getanswermap2;
            this.RemoteActionCompatParcelizer = getanswermap3;
            this.AudioAttributesImplApi26Parcelizer = getanswermap4;
            this.read = i;
            this.write = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            AtomicLongDeserializer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.read | 1), this.write);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ getAnswerMap<T, getShowPopup> AudioAttributesCompatParcelizer;
        final /* synthetic */ _handleOddName IconCompatParcelizer;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        final /* synthetic */ getAnswerMap<Context, T> read;
        final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(getAnswerMap<? super Context, ? extends T> getanswermap, _handleOddName _handleoddname, getAnswerMap<? super T, getShowPopup> getanswermap2, int i, int i2) {
            super(2);
            this.read = getanswermap;
            this.IconCompatParcelizer = _handleoddname;
            this.AudioAttributesCompatParcelizer = getanswermap2;
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            AtomicLongDeserializer.AudioAttributesCompatParcelizer(this.read, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer | 1), this.write);
        }
    }

    public static final <T extends View> void AudioAttributesCompatParcelizer(getAnswerMap<? super Context, ? extends T> getanswermap, _handleOddName _handleoddname, getAnswerMap<? super T, getShowPopup> getanswermap2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1783766393);
        if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                _handleoddname = _handleOddName.INSTANCE;
            }
            if (i5 != 0) {
                getanswermap2 = AudioAttributesCompatParcelizer;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1783766393, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            RemoteActionCompatParcelizer(getanswermap, _handleoddname, null, AudioAttributesCompatParcelizer, getanswermap2, _handleunrecognizedcharacterescapeWrite, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        _handleOddName _handleoddname2 = _handleoddname;
        getAnswerMap<? super T, getShowPopup> getanswermap3 = getanswermap2;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new read(getanswermap, _handleoddname2, getanswermap3, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends android.view.View> void RemoteActionCompatParcelizer(kotlin.getAnswerMap<? super android.content.Context, ? extends T> r23, kotlin._handleOddName r24, kotlin.getAnswerMap<? super T, kotlin.getShowPopup> r25, kotlin.getAnswerMap<? super T, kotlin.getShowPopup> r26, kotlin.getAnswerMap<? super T, kotlin.getShowPopup> r27, kotlin._handleUnrecognizedCharacterEscape r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AtomicLongDeserializer.RemoteActionCompatParcelizer(o.getAnswerMap, o._handleOddName, o.getAnswerMap, o.getAnswerMap, o.getAnswerMap, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.AtomicLongDeserializer$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Lo/_assertNotNull;", "Lkotlin/Function1;", "", "p0", "read", "(Lo/_assertNotNull;Lo/getAnswerMap;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5<T> extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_assertNotNull, getAnswerMap<? super T, ? extends getShowPopup>, getShowPopup> {
        public static final AnonymousClass5 RemoteActionCompatParcelizer = new AnonymousClass5();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_assertNotNull _assertnotnull, Object obj) {
            read(_assertnotnull, (getAnswerMap) obj);
            return getShowPopup.INSTANCE;
        }

        public final void read(_assertNotNull _assertnotnull, getAnswerMap<? super T, getShowPopup> getanswermap) {
            AtomicLongDeserializer.IconCompatParcelizer(_assertnotnull).setResetBlock(getanswermap);
        }

        AnonymousClass5() {
            super(2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.AtomicLongDeserializer$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Lo/_assertNotNull;", "Lkotlin/Function1;", "", "p0", "IconCompatParcelizer", "(Lo/_assertNotNull;Lo/getAnswerMap;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2<T> extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_assertNotNull, getAnswerMap<? super T, ? extends getShowPopup>, getShowPopup> {
        public static final AnonymousClass2 IconCompatParcelizer = new AnonymousClass2();

        public final void IconCompatParcelizer(_assertNotNull _assertnotnull, getAnswerMap<? super T, getShowPopup> getanswermap) {
            AtomicLongDeserializer.IconCompatParcelizer(_assertnotnull).setUpdateBlock(getanswermap);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_assertNotNull _assertnotnull, Object obj) {
            IconCompatParcelizer(_assertnotnull, (getAnswerMap) obj);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass2() {
            super(2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.AtomicLongDeserializer$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Lo/_assertNotNull;", "Lkotlin/Function1;", "", "p0", "IconCompatParcelizer", "(Lo/_assertNotNull;Lo/getAnswerMap;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3<T> extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_assertNotNull, getAnswerMap<? super T, ? extends getShowPopup>, getShowPopup> {
        public static final AnonymousClass3 IconCompatParcelizer = new AnonymousClass3();

        public final void IconCompatParcelizer(_assertNotNull _assertnotnull, getAnswerMap<? super T, getShowPopup> getanswermap) {
            AtomicLongDeserializer.IconCompatParcelizer(_assertnotnull).setReleaseBlock(getanswermap);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_assertNotNull _assertnotnull, Object obj) {
            IconCompatParcelizer(_assertnotnull, (getAnswerMap) obj);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass3() {
            super(2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.AtomicLongDeserializer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Lo/_assertNotNull;", "Lkotlin/Function1;", "", "p0", "AudioAttributesCompatParcelizer", "(Lo/_assertNotNull;Lo/getAnswerMap;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1<T> extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_assertNotNull, getAnswerMap<? super T, ? extends getShowPopup>, getShowPopup> {
        public static final AnonymousClass1 RemoteActionCompatParcelizer = new AnonymousClass1();

        public final void AudioAttributesCompatParcelizer(_assertNotNull _assertnotnull, getAnswerMap<? super T, getShowPopup> getanswermap) {
            AtomicLongDeserializer.IconCompatParcelizer(_assertnotnull).setUpdateBlock(getanswermap);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_assertNotNull _assertnotnull, Object obj) {
            AudioAttributesCompatParcelizer(_assertnotnull, (getAnswerMap) obj);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass1() {
            super(2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.AtomicLongDeserializer$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Lo/_assertNotNull;", "Lkotlin/Function1;", "", "p0", "read", "(Lo/_assertNotNull;Lo/getAnswerMap;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4<T> extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_assertNotNull, getAnswerMap<? super T, ? extends getShowPopup>, getShowPopup> {
        public static final AnonymousClass4 IconCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_assertNotNull _assertnotnull, Object obj) {
            read(_assertnotnull, (getAnswerMap) obj);
            return getShowPopup.INSTANCE;
        }

        public final void read(_assertNotNull _assertnotnull, getAnswerMap<? super T, getShowPopup> getanswermap) {
            AtomicLongDeserializer.IconCompatParcelizer(_assertnotnull).setReleaseBlock(getanswermap);
        }

        AnonymousClass4() {
            super(2);
        }
    }

    private static final <T extends View> getCreatedOnDateMs<_assertNotNull> RemoteActionCompatParcelizer(getAnswerMap<? super Context, ? extends T> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(2030558801, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
        Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
        convertNumberToLong convertnumbertolongIconCompatParcelizer = _getBigDecimal.IconCompatParcelizer(_handleunrecognizedcharacterescape, 0);
        JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence = (JavaBigIntegerFromCharSequence) _handleunrecognizedcharacterescape.write(parseBigIntegerLiteral.AudioAttributesCompatParcelizer());
        View view = (View) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver());
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
        boolean z = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap)) || (i & 6) == 4;
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(convertnumbertolongIconCompatParcelizer);
        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(javaBigIntegerFromCharSequence);
        boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(iHashCode);
        boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(view);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer2 | z | zIconCompatParcelizer | zIconCompatParcelizer3 | zRemoteActionCompatParcelizer | zIconCompatParcelizer4) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = (getCreatedOnDateMs) new AnonymousClass6(context, getanswermap, convertnumbertolongIconCompatParcelizer, javaBigIntegerFromCharSequence, iHashCode, view);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        getCreatedOnDateMs<_assertNotNull> getcreatedondatems = (getCreatedOnDateMs) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getcreatedondatems;
    }

    /* JADX INFO: renamed from: o.AtomicLongDeserializer$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/_assertNotNull;", "RemoteActionCompatParcelizer", "()Lo/_assertNotNull;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass6 extends MagicModuleUseCase implements getCreatedOnDateMs<_assertNotNull> {
        final /* synthetic */ convertNumberToLong $AudioAttributesCompatParcelizer;
        final /* synthetic */ JavaBigIntegerFromCharSequence $AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ Context $IconCompatParcelizer;
        final /* synthetic */ View $RemoteActionCompatParcelizer;
        final /* synthetic */ getAnswerMap<Context, T> $read;
        final /* synthetic */ int $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _assertNotNull invoke() {
            Context context = this.$IconCompatParcelizer;
            getAnswerMap<Context, T> getanswermap = this.$read;
            convertNumberToLong convertnumbertolong = this.$AudioAttributesCompatParcelizer;
            JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence = this.$AudioAttributesImplApi26Parcelizer;
            int i = this.$write;
            KeyEvent.Callback callback = this.$RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.read(callback, "");
            return new ViewFactoryHolder(context, getanswermap, convertnumbertolong, javaBigIntegerFromCharSequence, i, (_configureGenerator) callback).getOnPause();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(Context context, getAnswerMap<? super Context, ? extends T> getanswermap, convertNumberToLong convertnumbertolong, JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence, int i, View view) {
            super(0);
            this.$IconCompatParcelizer = context;
            this.$read = getanswermap;
            this.$AudioAttributesCompatParcelizer = convertnumbertolong;
            this.$AudioAttributesImplApi26Parcelizer = javaBigIntegerFromCharSequence;
            this.$write = i;
            this.$RemoteActionCompatParcelizer = view;
        }
    }

    /* JADX INFO: renamed from: o.AtomicLongDeserializer$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/_assertNotNull;", "Lo/_handleOddName;", "p0", "", "read", "(Lo/_assertNotNull;Lo/_handleOddName;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass9 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_assertNotNull, _handleOddName, getShowPopup> {
        public static final AnonymousClass9 write = new AnonymousClass9();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_assertNotNull _assertnotnull, _handleOddName _handleoddname) {
            read(_assertnotnull, _handleoddname);
            return getShowPopup.INSTANCE;
        }

        public final void read(_assertNotNull _assertnotnull, _handleOddName _handleoddname) {
            AtomicLongDeserializer.IconCompatParcelizer(_assertnotnull).setModifier(_handleoddname);
        }

        AnonymousClass9() {
            super(2);
        }
    }

    private static final <T extends View> void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, _handleOddName _handleoddname, int i, bufferMapProperty buffermapproperty, hasGetter hasgetter, PieChart pieChart, tryToResolveUnresolved trytoresolveunresolved, _getCharDesc _getchardesc) {
        NumberOutput.write(_handleunrecognizedcharacterescape, _getchardesc, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
        NumberOutput.write(_handleunrecognizedcharacterescape, _handleoddname, AnonymousClass9.write);
        NumberOutput.write(_handleunrecognizedcharacterescape, buffermapproperty, AnonymousClass10.AudioAttributesCompatParcelizer);
        NumberOutput.write(_handleunrecognizedcharacterescape, hasgetter, AnonymousClass8.IconCompatParcelizer);
        NumberOutput.write(_handleunrecognizedcharacterescape, pieChart, AnonymousClass11.write);
        NumberOutput.write(_handleunrecognizedcharacterescape, trytoresolveunresolved, AnonymousClass13.RemoteActionCompatParcelizer);
        NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, Integer.valueOf(i), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
    }

    /* JADX INFO: renamed from: o.AtomicLongDeserializer$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/_assertNotNull;", "Lo/bufferMapProperty;", "p0", "", "IconCompatParcelizer", "(Lo/_assertNotNull;Lo/bufferMapProperty;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass10 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_assertNotNull, bufferMapProperty, getShowPopup> {
        public static final AnonymousClass10 AudioAttributesCompatParcelizer = new AnonymousClass10();

        public final void IconCompatParcelizer(_assertNotNull _assertnotnull, bufferMapProperty buffermapproperty) {
            AtomicLongDeserializer.IconCompatParcelizer(_assertnotnull).setDensity(buffermapproperty);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_assertNotNull _assertnotnull, bufferMapProperty buffermapproperty) {
            IconCompatParcelizer(_assertnotnull, buffermapproperty);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass10() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: o.AtomicLongDeserializer$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/_assertNotNull;", "Lo/hasGetter;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/_assertNotNull;Lo/hasGetter;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass8 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_assertNotNull, hasGetter, getShowPopup> {
        public static final AnonymousClass8 IconCompatParcelizer = new AnonymousClass8();

        public final void RemoteActionCompatParcelizer(_assertNotNull _assertnotnull, hasGetter hasgetter) {
            AtomicLongDeserializer.IconCompatParcelizer(_assertnotnull).setLifecycleOwner(hasgetter);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_assertNotNull _assertnotnull, hasGetter hasgetter) {
            RemoteActionCompatParcelizer(_assertnotnull, hasgetter);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass8() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: o.AtomicLongDeserializer$11, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/_assertNotNull;", "Lo/PieChart;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/_assertNotNull;Lo/PieChart;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass11 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_assertNotNull, PieChart, getShowPopup> {
        public static final AnonymousClass11 write = new AnonymousClass11();

        public final void RemoteActionCompatParcelizer(_assertNotNull _assertnotnull, PieChart pieChart) {
            AtomicLongDeserializer.IconCompatParcelizer(_assertnotnull).setSavedStateRegistryOwner(pieChart);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_assertNotNull _assertnotnull, PieChart pieChart) {
            RemoteActionCompatParcelizer(_assertnotnull, pieChart);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass11() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: o.AtomicLongDeserializer$13, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/_assertNotNull;", "Lo/tryToResolveUnresolved;", "p0", "", "write", "(Lo/_assertNotNull;Lo/tryToResolveUnresolved;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass13 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_assertNotNull, tryToResolveUnresolved, getShowPopup> {
        public static final AnonymousClass13 RemoteActionCompatParcelizer = new AnonymousClass13();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_assertNotNull _assertnotnull, tryToResolveUnresolved trytoresolveunresolved) {
            write(_assertnotnull, trytoresolveunresolved);
            return getShowPopup.INSTANCE;
        }

        public final void write(_assertNotNull _assertnotnull, tryToResolveUnresolved trytoresolveunresolved) {
            ViewFactoryHolder viewFactoryHolderIconCompatParcelizer = AtomicLongDeserializer.IconCompatParcelizer(_assertnotnull);
            int i = AtomicLongDeserializer$13$write$WhenMappings.IconCompatParcelizer[trytoresolveunresolved.ordinal()];
            int i2 = 1;
            if (i == 1) {
                i2 = 0;
            } else if (i != 2) {
                throw new RenewEligibleCreator();
            }
            viewFactoryHolderIconCompatParcelizer.setLayoutDirection(i2);
        }

        AnonymousClass13() {
            super(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> IconCompatParcelizer(_assertNotNull _assertnotnull) {
        AndroidViewHolder onPause = _assertnotnull.getOnPause();
        if (onPause != null) {
            return (ViewFactoryHolder) onPause;
        }
        reportWrongTokenException.write("Required value was null.");
        throw new PlanDetailsCreator();
    }

    /* JADX INFO: renamed from: o.AtomicLongDeserializer$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "", "write", "(Landroid/view/View;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass7 extends MagicModuleUseCase implements getAnswerMap<View, getShowPopup> {
        public static final AnonymousClass7 read = new AnonymousClass7();

        public final void write(View view) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(View view) {
            write(view);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass7() {
            super(1);
        }
    }

    public static final getAnswerMap<View, getShowPopup> RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }
}
