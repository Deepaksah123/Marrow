package kotlin;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.window.PopupLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aR\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u0010\u001a \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0002\u001a(\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u001b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0002\u0010\"\u001a+\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0013\b\b\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u000bH\u0083\b¢\u0006\u0002\u0010&\u001a\f\u0010'\u001a\u00020\u0015*\u00020(H\u0000\u001a\u0014\u0010)\u001a\u00020\u0012*\u00020\t2\u0006\u0010*\u001a\u00020\u0015H\u0002\u001a\f\u0010+\u001a\u00020,*\u00020-H\u0002\u001a\u001c\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020(2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001bH\u0007\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d¨\u00061²\u0006\u0015\u00102\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u000bX\u008a\u0084\u0002"}, d2 = {"Popup", "", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Landroidx/compose/runtime/Composable;", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PopupPropertiesBaseFlags", "", "createFlags", "focusable", "", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "clippingEnabled", "LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalIsInPopupLayout", "getLocalIsInPopupLayout", "PopupTestTag", "tag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isFlagSecureEnabled", "Landroid/view/View;", "flagsWithSecureFlagInherited", "isParentFlagSecureEnabled", "toIntBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroid/graphics/Rect;", "isPopupLayout", "view", "testTag", "ui", "currentContent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class popOrNull {
    private static final CharacterEscapes<String> AudioAttributesCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer$default(null, AnonymousClass2.AudioAttributesCompatParcelizer, 1, null);
    private static final CharacterEscapes<Boolean> write = resetAsNaN.RemoteActionCompatParcelizer$default(null, AnonymousClass5.read, 1, null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ int AudioAttributesCompatParcelizer;
        final /* synthetic */ withDateFormat AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        final /* synthetic */ DateDeserializersCalendarDeserializer RemoteActionCompatParcelizer;
        final /* synthetic */ int read;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(DateDeserializersCalendarDeserializer dateDeserializersCalendarDeserializer, getCreatedOnDateMs<getShowPopup> getcreatedondatems, withDateFormat withdateformat, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, int i, int i2) {
            super(2);
            this.RemoteActionCompatParcelizer = dateDeserializersCalendarDeserializer;
            this.IconCompatParcelizer = getcreatedondatems;
            this.AudioAttributesImplApi26Parcelizer = withdateformat;
            this.write = magicModuleSubmissionRequestBody;
            this.AudioAttributesCompatParcelizer = i;
            this.read = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            popOrNull.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.write, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer | 1), this.read);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer;
        final /* synthetic */ withDateFormat AudioAttributesImplBaseParcelizer;
        final /* synthetic */ long IconCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> MediaBrowserCompatItemReceiver;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        final /* synthetic */ int read;
        final /* synthetic */ _skipWSOrEnd write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(_skipWSOrEnd _skipwsorend, long j, getCreatedOnDateMs<getShowPopup> getcreatedondatems, withDateFormat withdateformat, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, int i, int i2) {
            super(2);
            this.write = _skipwsorend;
            this.IconCompatParcelizer = j;
            this.MediaBrowserCompatItemReceiver = getcreatedondatems;
            this.AudioAttributesImplBaseParcelizer = withdateformat;
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
            this.RemoteActionCompatParcelizer = i;
            this.read = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            popOrNull.AudioAttributesCompatParcelizer(this.write, this.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer | 1), this.read);
        }
    }

    /* JADX INFO: renamed from: o.popOrNull$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StreamConstraintsException;", "Lo/_wrapError;", "RemoteActionCompatParcelizer", "(Lo/StreamConstraintsException;)Lo/_wrapError;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<StreamConstraintsException, _wrapError> {
        final /* synthetic */ String $AudioAttributesCompatParcelizer;
        final /* synthetic */ withDateFormat $IconCompatParcelizer;
        final /* synthetic */ tryToResolveUnresolved $RemoteActionCompatParcelizer;
        final /* synthetic */ PopupLayout $read;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> $write;

        /* JADX INFO: renamed from: o.popOrNull$3$write */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write implements _wrapError {
            final /* synthetic */ PopupLayout IconCompatParcelizer;

            public write(PopupLayout popupLayout) {
                this.IconCompatParcelizer = popupLayout;
            }

            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer();
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _wrapError invoke(StreamConstraintsException streamConstraintsException) {
            this.$read.AudioAttributesImplApi26Parcelizer();
            this.$read.write(this.$write, this.$IconCompatParcelizer, this.$AudioAttributesCompatParcelizer, this.$RemoteActionCompatParcelizer);
            return new write(this.$read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PopupLayout popupLayout, getCreatedOnDateMs<getShowPopup> getcreatedondatems, withDateFormat withdateformat, String str, tryToResolveUnresolved trytoresolveunresolved) {
            super(1);
            this.$read = popupLayout;
            this.$write = getcreatedondatems;
            this.$IconCompatParcelizer = withdateformat;
            this.$AudioAttributesCompatParcelizer = str;
            this.$RemoteActionCompatParcelizer = trytoresolveunresolved;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(kotlin._skipWSOrEnd r27, long r28, kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r30, kotlin.withDateFormat r31, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r32, kotlin._handleUnrecognizedCharacterEscape r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.popOrNull.AudioAttributesCompatParcelizer(o._skipWSOrEnd, long, o.getCreatedOnDateMs, o.withDateFormat, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(kotlin.DateDeserializersCalendarDeserializer r35, kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r36, kotlin.withDateFormat r37, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r38, kotlin._handleUnrecognizedCharacterEscape r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.popOrNull.RemoteActionCompatParcelizer(o.DateDeserializersCalendarDeserializer, o.getCreatedOnDateMs, o.withDateFormat, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: renamed from: o.popOrNull$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/UUID;", "read", "()Ljava/util/UUID;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<UUID> {
        public static final AnonymousClass8 AudioAttributesCompatParcelizer = new AnonymousClass8();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }

        AnonymousClass8() {
            super(0);
        }
    }

    /* JADX INFO: renamed from: o.popOrNull$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass10 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ parseDouble<MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>> $RemoteActionCompatParcelizer;
        final /* synthetic */ PopupLayout $write;

        /* JADX INFO: renamed from: o.popOrNull$10$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "(Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
            final /* synthetic */ PopupLayout $IconCompatParcelizer;
            final /* synthetic */ parseDouble<MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>> $write;

            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
                write(_handleunrecognizedcharacterescape, num.intValue());
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: renamed from: o.popOrNull$10$3$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getConfigOverride;", "", "write", "(Lo/getConfigOverride;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<getConfigOverride, getShowPopup> {
                public static final AnonymousClass1 RemoteActionCompatParcelizer = new AnonymousClass1();

                @Override // kotlin.getAnswerMap
                public final /* synthetic */ getShowPopup invoke(getConfigOverride getconfigoverride) {
                    write(getconfigoverride);
                    return getShowPopup.INSTANCE;
                }

                public final void write(getConfigOverride getconfigoverride) {
                    MapperBuilder.RemoteActionCompatParcelizer(getconfigoverride);
                }

                AnonymousClass1() {
                    super(1);
                }
            }

            public final void write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
                if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                    _handleunrecognizedcharacterescape.onPrepareFromSearch();
                    return;
                }
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(1022273628, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:322)");
                }
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                AnonymousClass1 anonymousClass1OnPause = _handleunrecognizedcharacterescape.onPause();
                if (anonymousClass1OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    anonymousClass1OnPause = AnonymousClass1.RemoteActionCompatParcelizer;
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(anonymousClass1OnPause);
                }
                _handleOddName _handleoddname = withValueInstantiators.read$default(companion, false, (getAnswerMap) anonymousClass1OnPause, 1, null);
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(this.$IconCompatParcelizer);
                PopupLayout popupLayout = this.$IconCompatParcelizer;
                AnonymousClass5 anonymousClass5OnPause = _handleunrecognizedcharacterescape.onPause();
                if (zIconCompatParcelizer || anonymousClass5OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    anonymousClass5OnPause = new AnonymousClass5(popupLayout);
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(anonymousClass5OnPause);
                }
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer = addName.AudioAttributesCompatParcelizer(isCachable.AudioAttributesCompatParcelizer(_handleoddname, (getAnswerMap) anonymousClass5OnPause), this.$IconCompatParcelizer.read() ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBodyWrite = popOrNull.write(this.$write);
                AnonymousClass7 anonymousClass7OnPause = _handleunrecognizedcharacterescape.onPause();
                if (anonymousClass7OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    anonymousClass7OnPause = new withTypeHandler() { // from class: o.popOrNull.7

                        /* JADX INFO: renamed from: o.popOrNull$7$2, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "read", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
                            public static final AnonymousClass2 RemoteActionCompatParcelizer = new AnonymousClass2();

                            public final void read(_parser.IconCompatParcelizer iconCompatParcelizer) {
                            }

                            @Override // kotlin.getAnswerMap
                            public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
                                read(iconCompatParcelizer);
                                return getShowPopup.INSTANCE;
                            }

                            public AnonymousClass2() {
                                super(1);
                            }
                        }

                        @Override // kotlin.withTypeHandler
                        public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
                            int size = list.size();
                            if (size == 0) {
                                return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, 0, 0, null, AnonymousClass2.RemoteActionCompatParcelizer, 4, null);
                            }
                            if (size == 1) {
                                _parser _parserVarWrite = list.get(0).write(j);
                                return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new AnonymousClass3(_parserVarWrite), 4, null);
                            }
                            ArrayList arrayList = new ArrayList(list.size());
                            int size2 = list.size();
                            int iMax = 0;
                            int iMax2 = 0;
                            for (int i2 = 0; i2 < size2; i2++) {
                                _parser _parserVarWrite2 = list.get(i2).write(j);
                                iMax = Math.max(iMax, _parserVarWrite2.getRead());
                                iMax2 = Math.max(iMax2, _parserVarWrite2.getRemoteActionCompatParcelizer());
                                arrayList.add(_parserVarWrite2);
                            }
                            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iMax, iMax2, null, new AnonymousClass5(arrayList), 4, null);
                        }

                        /* JADX INFO: renamed from: o.popOrNull$7$3, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "read", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
                            final /* synthetic */ _parser $AudioAttributesCompatParcelizer;

                            @Override // kotlin.getAnswerMap
                            public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
                                read(iconCompatParcelizer);
                                return getShowPopup.INSTANCE;
                            }

                            public final void read(_parser.IconCompatParcelizer iconCompatParcelizer) {
                                _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, this.$AudioAttributesCompatParcelizer, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass3(_parser _parserVar) {
                                super(1);
                                this.$AudioAttributesCompatParcelizer = _parserVar;
                            }
                        }

                        /* JADX INFO: renamed from: o.popOrNull$7$5, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "IconCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
                            final /* synthetic */ List<_parser> $read;

                            @Override // kotlin.getAnswerMap
                            public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
                                IconCompatParcelizer(iconCompatParcelizer);
                                return getShowPopup.INSTANCE;
                            }

                            public final void IconCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
                                int iWrite = IntermediateLoginResponseBody.write((List) this.$read);
                                if (iWrite < 0) {
                                    return;
                                }
                                int i = 0;
                                while (true) {
                                    _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, this.$read.get(i), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
                                    if (i == iWrite) {
                                        return;
                                    } else {
                                        i++;
                                    }
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass5(List<? extends _parser> list) {
                                super(1);
                                this.$read = list;
                            }
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(anonymousClass7OnPause);
                }
                withTypeHandler withtypehandler = (withTypeHandler) anonymousClass7OnPause;
                int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameAudioAttributesCompatParcelizer);
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
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                magicModuleSubmissionRequestBodyWrite.invoke(_handleunrecognizedcharacterescape, 0);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }

            /* JADX INFO: renamed from: o.popOrNull$10$3$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getKey;", "p0", "", "write", "(J)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<getKey, getShowPopup> {
                final /* synthetic */ PopupLayout $RemoteActionCompatParcelizer;

                @Override // kotlin.getAnswerMap
                public final /* synthetic */ getShowPopup invoke(getKey getkey) {
                    write(getkey.getRemoteActionCompatParcelizer());
                    return getShowPopup.INSTANCE;
                }

                public final void write(long j) {
                    this.$RemoteActionCompatParcelizer.m6setPopupContentSizefhxjrPA(getKey.AudioAttributesCompatParcelizer(j));
                    this.$RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(PopupLayout popupLayout) {
                    super(1);
                    this.$RemoteActionCompatParcelizer = popupLayout;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(PopupLayout popupLayout, parseDouble<? extends MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>> parsedouble) {
                super(2);
                this.$IconCompatParcelizer = popupLayout;
                this.$write = parsedouble;
            }
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-297523940, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)");
            }
            resetAsNaN.write(popOrNull.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(Boolean.TRUE), multiplyFft.AudioAttributesCompatParcelizer(1022273628, true, new AnonymousClass3(this.$write, this.$RemoteActionCompatParcelizer), _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass10(PopupLayout popupLayout, parseDouble<? extends MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>> parsedouble) {
            super(2);
            this.$write = popupLayout;
            this.$RemoteActionCompatParcelizer = parsedouble;
        }
    }

    /* JADX INFO: renamed from: o.popOrNull$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ tryToResolveUnresolved $AudioAttributesCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> $IconCompatParcelizer;
        final /* synthetic */ PopupLayout $RemoteActionCompatParcelizer;
        final /* synthetic */ String $read;
        final /* synthetic */ withDateFormat $write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer() {
            this.$RemoteActionCompatParcelizer.write(this.$IconCompatParcelizer, this.$write, this.$read, this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PopupLayout popupLayout, getCreatedOnDateMs<getShowPopup> getcreatedondatems, withDateFormat withdateformat, String str, tryToResolveUnresolved trytoresolveunresolved) {
            super(0);
            this.$RemoteActionCompatParcelizer = popupLayout;
            this.$IconCompatParcelizer = getcreatedondatems;
            this.$write = withdateformat;
            this.$read = str;
            this.$AudioAttributesCompatParcelizer = trytoresolveunresolved;
        }
    }

    /* JADX INFO: renamed from: o.popOrNull$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StreamConstraintsException;", "Lo/_wrapError;", "AudioAttributesCompatParcelizer", "(Lo/StreamConstraintsException;)Lo/_wrapError;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<StreamConstraintsException, _wrapError> {
        final /* synthetic */ DateDeserializersCalendarDeserializer $RemoteActionCompatParcelizer;
        final /* synthetic */ PopupLayout $write;

        /* JADX INFO: renamed from: o.popOrNull$1$read */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class read implements _wrapError {
            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
            }
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _wrapError invoke(StreamConstraintsException streamConstraintsException) {
            this.$write.setPositionProvider(this.$RemoteActionCompatParcelizer);
            this.$write.MediaBrowserCompatCustomActionResultReceiver();
            return new read();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PopupLayout popupLayout, DateDeserializersCalendarDeserializer dateDeserializersCalendarDeserializer) {
            super(1);
            this.$write = popupLayout;
            this.$RemoteActionCompatParcelizer = dateDeserializersCalendarDeserializer;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ PopupLayout IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        int write;

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:14:0x003b). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.write
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.RemoteActionCompatParcelizer
                o.TopUserCompanion r1 = (kotlin.TopUserCompanion) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L3b
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                java.lang.Object r5 = r4.RemoteActionCompatParcelizer
                o.TopUserCompanion r5 = (kotlin.TopUserCompanion) r5
                r1 = r5
            L23:
                boolean r5 = kotlin.College.IconCompatParcelizer(r1)
                if (r5 == 0) goto L41
                o.popOrNull$read$2 r5 = o.popOrNull.read.AnonymousClass2.AudioAttributesCompatParcelizer
                o.getAnswerMap r5 = (kotlin.getAnswerMap) r5
                r3 = r4
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4.RemoteActionCompatParcelizer = r1
                r4.write = r2
                java.lang.Object r5 = kotlin.props.write(r5, r3)
                if (r5 != r0) goto L3b
                return r0
            L3b:
                androidx.compose.ui.window.PopupLayout r5 = r4.IconCompatParcelizer
                r5.AudioAttributesImplBaseParcelizer()
                goto L23
            L41:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.popOrNull.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.popOrNull$read$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "RemoteActionCompatParcelizer", "(J)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Long, getShowPopup> {
            public static final AnonymousClass2 AudioAttributesCompatParcelizer = new AnonymousClass2();

            public final void RemoteActionCompatParcelizer(long j) {
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(Long l) {
                RemoteActionCompatParcelizer(l.longValue());
                return getShowPopup.INSTANCE;
            }

            AnonymousClass2() {
                super(1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(PopupLayout popupLayout, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = popupLayout;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = new read(this.IconCompatParcelizer, sampleVideos);
            readVar.RemoteActionCompatParcelizer = obj;
            return readVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.popOrNull$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/isAbstract;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/isAbstract;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass9 extends MagicModuleUseCase implements getAnswerMap<isAbstract, getShowPopup> {
        final /* synthetic */ PopupLayout $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isAbstract isabstract) {
            AudioAttributesCompatParcelizer(isabstract);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(isAbstract isabstract) {
            isAbstract isabstractRemoteActionCompatParcelizer = isabstract.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write(isabstractRemoteActionCompatParcelizer);
            this.$read.AudioAttributesCompatParcelizer(isabstractRemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(PopupLayout popupLayout) {
            super(1);
            this.$read = popupLayout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(boolean z, _deserializeAltString _deserializealtstring, boolean z2) {
        int i = !z ? 262152 : 262144;
        if (_deserializealtstring == _deserializeAltString.AudioAttributesCompatParcelizer) {
            i |= 8192;
        }
        return !z2 ? i | 512 : i;
    }

    /* JADX INFO: renamed from: o.popOrNull$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<String> {
        public static final AnonymousClass2 AudioAttributesCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }

        AnonymousClass2() {
            super(0);
        }
    }

    /* JADX INFO: renamed from: o.popOrNull$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
        public static final AnonymousClass5 read = new AnonymousClass5();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }

        AnonymousClass5() {
            super(0);
        }
    }

    public static final CharacterEscapes<Boolean> AudioAttributesCompatParcelizer() {
        return write;
    }

    public static final boolean IconCompatParcelizer(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(withDateFormat withdateformat, boolean z) {
        if (withdateformat.getIconCompatParcelizer() && z) {
            return withdateformat.getWrite() | 8192;
        }
        if (withdateformat.getIconCompatParcelizer() && !z) {
            return withdateformat.getWrite() & (-8193);
        }
        return withdateformat.getWrite();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final appendReferring IconCompatParcelizer(Rect rect) {
        return new appendReferring(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write(parseDouble<? extends MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>> parsedouble) {
        return (MagicModuleSubmissionRequestBody) parsedouble.getRemoteActionCompatParcelizer();
    }
}
