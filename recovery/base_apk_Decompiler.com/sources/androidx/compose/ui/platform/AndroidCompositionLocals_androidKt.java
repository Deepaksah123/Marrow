package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.CharacterEscapes;
import kotlin.ContentReference;
import kotlin.ContextAttributes;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.PieChart;
import kotlin.PlanDetailsCreator;
import kotlin.StreamConstraintsException;
import kotlin.StreamReadException;
import kotlin._appendEscaped;
import kotlin._handleResolvable;
import kotlin._handleUnrecognizedCharacterEscape;
import kotlin._validJsonValueList;
import kotlin._wrapError;
import kotlin.attrs;
import kotlin.depositSchemaProperty;
import kotlin.getAnswerMap;
import kotlin.getAttribute;
import kotlin.getCreatedOnDateMs;
import kotlin.getDefaultNullValueSerializer;
import kotlin.getRenewGrpId;
import kotlin.getShowPopup;
import kotlin.getUnknownTypeSerializer;
import kotlin.hasGetter;
import kotlin.isIsGetterVisible;
import kotlin.mappingException;
import kotlin.multiplyFft;
import kotlin.parseBigIntegerLiteral;
import kotlin.releaseNameCopyBuffer;
import kotlin.reportInvalidBase64Char;
import kotlin.resetAsNaN;
import kotlin.setCenterTextSize;
import kotlin.shouldIntrospectorImplicitConstructors;
import kotlin.withPrefix;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0005\u0010\u0011\"\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015\" \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\t\u0010\u0015\" \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00128\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015\" \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\r\u0010\u0015\"\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00128G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\"\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015\" \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "Lkotlin/Function0;", "", "p1", "RemoteActionCompatParcelizer", "(Landroidx/compose/ui/platform/AndroidComposeView;Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V", "Landroid/content/Context;", "Lo/ContextAttributes;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Lo/_handleUnrecognizedCharacterEscape;I)Lo/ContextAttributes;", "Landroid/content/res/Configuration;", "Lo/shouldIntrospectorImplicitConstructors;", "write", "(Landroid/content/Context;Landroid/content/res/Configuration;Lo/_handleUnrecognizedCharacterEscape;I)Lo/shouldIntrospectorImplicitConstructors;", "", "", "(Ljava/lang/String;)Ljava/lang/Void;", "Lo/CharacterEscapes;", "read", "Lo/CharacterEscapes;", "()Lo/CharacterEscapes;", "IconCompatParcelizer", "Landroid/content/res/Resources;", "Lo/hasGetter;", "getLocalLifecycleOwner", "LocalLifecycleOwner", "Lo/PieChart;", "getLocalSavedStateRegistryOwner", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {
    private static final CharacterEscapes<Configuration> read = resetAsNaN.RemoteActionCompatParcelizer$default(null, AnonymousClass5.IconCompatParcelizer, 1, null);
    private static final CharacterEscapes<Context> IconCompatParcelizer = resetAsNaN.read(AnonymousClass1.write);
    private static final CharacterEscapes<Resources> AudioAttributesCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer(AnonymousClass2.IconCompatParcelizer);
    private static final CharacterEscapes<shouldIntrospectorImplicitConstructors> write = resetAsNaN.read(AnonymousClass4.RemoteActionCompatParcelizer);
    private static final CharacterEscapes<ContextAttributes> RemoteActionCompatParcelizer = resetAsNaN.read(AnonymousClass3.write);
    private static final CharacterEscapes<View> AudioAttributesImplApi26Parcelizer = resetAsNaN.read(AnonymousClass10.IconCompatParcelizer);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ AndroidComposeView AudioAttributesCompatParcelizer;
        final /* synthetic */ int IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(AndroidComposeView androidComposeView, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, int i) {
            super(2);
            this.AudioAttributesCompatParcelizer = androidComposeView;
            this.write = magicModuleSubmissionRequestBody;
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            AndroidCompositionLocals_androidKt.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.IconCompatParcelizer | 1));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/res/Configuration;", "AudioAttributesCompatParcelizer", "()Landroid/content/res/Configuration;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Configuration> {
        public static final AnonymousClass5 IconCompatParcelizer = new AnonymousClass5();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.RemoteActionCompatParcelizer("LocalConfiguration");
            throw new PlanDetailsCreator();
        }

        AnonymousClass5() {
            super(0);
        }
    }

    public static final CharacterEscapes<Configuration> read() {
        return read;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Context;", "read", "()Landroid/content/Context;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Context> {
        public static final AnonymousClass1 write = new AnonymousClass1();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.RemoteActionCompatParcelizer("LocalContext");
            throw new PlanDetailsCreator();
        }

        AnonymousClass1() {
            super(0);
        }
    }

    public static final CharacterEscapes<Context> IconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static final CharacterEscapes<Resources> AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StreamConstraintsException;", "Lo/_wrapError;", "write", "(Lo/StreamConstraintsException;)Lo/_wrapError;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass6 extends MagicModuleUseCase implements getAnswerMap<StreamConstraintsException, _wrapError> {
        final /* synthetic */ getUnknownTypeSerializer $AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$6$RemoteActionCompatParcelizer */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RemoteActionCompatParcelizer implements _wrapError {
            final /* synthetic */ getUnknownTypeSerializer AudioAttributesCompatParcelizer;

            public RemoteActionCompatParcelizer(getUnknownTypeSerializer getunknowntypeserializer) {
                this.AudioAttributesCompatParcelizer = getunknowntypeserializer;
            }

            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final _wrapError invoke(StreamConstraintsException streamConstraintsException) {
            return new RemoteActionCompatParcelizer(this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(getUnknownTypeSerializer getunknowntypeserializer) {
            super(1);
            this.$AudioAttributesCompatParcelizer = getunknowntypeserializer;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StreamConstraintsException;", "Lo/_wrapError;", "write", "(Lo/StreamConstraintsException;)Lo/_wrapError;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass7 extends MagicModuleUseCase implements getAnswerMap<StreamConstraintsException, _wrapError> {
        final /* synthetic */ Context $AudioAttributesCompatParcelizer;
        final /* synthetic */ read $write;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$7$RemoteActionCompatParcelizer */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RemoteActionCompatParcelizer implements _wrapError {
            final /* synthetic */ Context AudioAttributesCompatParcelizer;
            final /* synthetic */ read write;

            public RemoteActionCompatParcelizer(Context context, read readVar) {
                this.AudioAttributesCompatParcelizer = context;
                this.write = readVar;
            }

            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
                this.AudioAttributesCompatParcelizer.getApplicationContext().unregisterComponentCallbacks(this.write);
            }
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final _wrapError invoke(StreamConstraintsException streamConstraintsException) {
            this.$AudioAttributesCompatParcelizer.getApplicationContext().registerComponentCallbacks(this.$write);
            return new RemoteActionCompatParcelizer(this.$AudioAttributesCompatParcelizer, this.$write);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(Context context, read readVar) {
            super(1);
            this.$AudioAttributesCompatParcelizer = context;
            this.$write = readVar;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StreamConstraintsException;", "Lo/_wrapError;", "IconCompatParcelizer", "(Lo/StreamConstraintsException;)Lo/_wrapError;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass9 extends MagicModuleUseCase implements getAnswerMap<StreamConstraintsException, _wrapError> {
        final /* synthetic */ IconCompatParcelizer $IconCompatParcelizer;
        final /* synthetic */ Context $RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$9$write */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write implements _wrapError {
            final /* synthetic */ Context read;
            final /* synthetic */ IconCompatParcelizer write;

            public write(Context context, IconCompatParcelizer iconCompatParcelizer) {
                this.read = context;
                this.write = iconCompatParcelizer;
            }

            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
                this.read.getApplicationContext().unregisterComponentCallbacks(this.write);
            }
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _wrapError invoke(StreamConstraintsException streamConstraintsException) {
            this.$RemoteActionCompatParcelizer.getApplicationContext().registerComponentCallbacks(this.$IconCompatParcelizer);
            return new write(this.$RemoteActionCompatParcelizer, this.$IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(Context context, IconCompatParcelizer iconCompatParcelizer) {
            super(1);
            this.$RemoteActionCompatParcelizer = context;
            this.$IconCompatParcelizer = iconCompatParcelizer;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/reportInvalidBase64Char;", "Landroid/content/res/Resources;", "read", "(Lo/reportInvalidBase64Char;)Landroid/content/res/Resources;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<reportInvalidBase64Char, Resources> {
        public static final AnonymousClass2 IconCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Resources invoke(reportInvalidBase64Char reportinvalidbase64char) {
            reportinvalidbase64char.RemoteActionCompatParcelizer(AndroidCompositionLocals_androidKt.read());
            return ((Context) reportinvalidbase64char.RemoteActionCompatParcelizer(AndroidCompositionLocals_androidKt.IconCompatParcelizer())).getResources();
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/shouldIntrospectorImplicitConstructors;", "read", "()Lo/shouldIntrospectorImplicitConstructors;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<shouldIntrospectorImplicitConstructors> {
        public static final AnonymousClass4 RemoteActionCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final shouldIntrospectorImplicitConstructors invoke() {
            AndroidCompositionLocals_androidKt.RemoteActionCompatParcelizer("LocalImageVectorCache");
            throw new PlanDetailsCreator();
        }

        AnonymousClass4() {
            super(0);
        }
    }

    public static final CharacterEscapes<shouldIntrospectorImplicitConstructors> RemoteActionCompatParcelizer() {
        return write;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/ContextAttributes;", "write", "()Lo/ContextAttributes;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<ContextAttributes> {
        public static final AnonymousClass3 write = new AnonymousClass3();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final ContextAttributes invoke() {
            AndroidCompositionLocals_androidKt.RemoteActionCompatParcelizer("LocalResourceIdCache");
            throw new PlanDetailsCreator();
        }

        AnonymousClass3() {
            super(0);
        }
    }

    public static final CharacterEscapes<ContextAttributes> write() {
        return RemoteActionCompatParcelizer;
    }

    public static final CharacterEscapes<hasGetter> getLocalLifecycleOwner() {
        return isIsGetterVisible.IconCompatParcelizer();
    }

    public static final CharacterEscapes<PieChart> getLocalSavedStateRegistryOwner() {
        return setCenterTextSize.read();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "RemoteActionCompatParcelizer", "()Landroid/view/View;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<View> {
        public static final AnonymousClass10 IconCompatParcelizer = new AnonymousClass10();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AndroidCompositionLocals_androidKt.RemoteActionCompatParcelizer("LocalView");
            throw new PlanDetailsCreator();
        }

        AnonymousClass10() {
            super(0);
        }
    }

    public static final CharacterEscapes<View> MediaBrowserCompatItemReceiver() {
        return AudioAttributesImplApi26Parcelizer;
    }

    public static final void RemoteActionCompatParcelizer(AndroidComposeView androidComposeView, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-520299287);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(androidComposeView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-520299287, i2, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:98)");
            }
            Context context = androidComposeView.getContext();
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new _handleResolvable(context);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleResolvable _handleresolvable = (_handleResolvable) objOnPause;
            AndroidComposeView.IconCompatParcelizer iconCompatParcelizerPlaybackStateCompatCustomAction = androidComposeView.PlaybackStateCompatCustomAction();
            if (iconCompatParcelizerPlaybackStateCompatCustomAction == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = mappingException.RemoteActionCompatParcelizer(androidComposeView, iconCompatParcelizerPlaybackStateCompatCustomAction.getIconCompatParcelizer());
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            getUnknownTypeSerializer getunknowntypeserializer = (getUnknownTypeSerializer) objOnPause2;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getunknowntypeserializer);
            AnonymousClass6 anonymousClass6OnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zIconCompatParcelizer || anonymousClass6OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                anonymousClass6OnPause = new AnonymousClass6(getunknowntypeserializer);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(anonymousClass6OnPause);
            }
            StreamReadException.RemoteActionCompatParcelizer(getshowpopup, (getAnswerMap) anonymousClass6OnPause, _handleunrecognizedcharacterescapeWrite, 6);
            withPrefix withprefixOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (withprefixOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                if (attrs.INSTANCE.IconCompatParcelizer(context)) {
                    withprefixOnPause = new getAttribute(androidComposeView.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw());
                } else {
                    withprefixOnPause = new withPrefix();
                }
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(withprefixOnPause);
            }
            resetAsNaN.AudioAttributesCompatParcelizer(new ContentReference[]{read.AudioAttributesCompatParcelizer(androidComposeView.getConfiguration()), IconCompatParcelizer.AudioAttributesCompatParcelizer(context), isIsGetterVisible.IconCompatParcelizer().AudioAttributesCompatParcelizer(iconCompatParcelizerPlaybackStateCompatCustomAction.getRemoteActionCompatParcelizer()), setCenterTextSize.read().AudioAttributesCompatParcelizer(iconCompatParcelizerPlaybackStateCompatCustomAction.getIconCompatParcelizer()), parseBigIntegerLiteral.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(getunknowntypeserializer), AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(androidComposeView.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()), write.AudioAttributesCompatParcelizer(write(context, androidComposeView.getConfiguration(), _handleunrecognizedcharacterescapeWrite, 0)), RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(context, _handleunrecognizedcharacterescapeWrite, 0)), getDefaultNullValueSerializer.MediaMetadataCompat().AudioAttributesCompatParcelizer(Boolean.valueOf(((Boolean) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.MediaBrowserCompatMediaItem())).booleanValue() | androidComposeView.ParcelableVolumeInfo())), getDefaultNullValueSerializer.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer((depositSchemaProperty) withprefixOnPause)}, multiplyFft.AudioAttributesCompatParcelizer(1059770793, true, new AnonymousClass8(androidComposeView, _handleresolvable, magicModuleSubmissionRequestBody), _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, ContentReference.write | 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new write(androidComposeView, magicModuleSubmissionRequestBody, i));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "(Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass8 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> $IconCompatParcelizer;
        final /* synthetic */ AndroidComposeView $RemoteActionCompatParcelizer;
        final /* synthetic */ _handleResolvable $read;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1059770793, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:137)");
            }
            getDefaultNullValueSerializer.RemoteActionCompatParcelizer(this.$RemoteActionCompatParcelizer, this.$read, this.$IconCompatParcelizer, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass8(AndroidComposeView androidComposeView, _handleResolvable _handleresolvable, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            super(2);
            this.$RemoteActionCompatParcelizer = androidComposeView;
            this.$read = _handleresolvable;
            this.$IconCompatParcelizer = magicModuleSubmissionRequestBody;
        }
    }

    private static final ContextAttributes AudioAttributesCompatParcelizer(Context context, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1348507246, i, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:143)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new ContextAttributes();
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        ContextAttributes contextAttributes = (ContextAttributes) objOnPause;
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = new read(contextAttributes);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        read readVar = (read) objOnPause2;
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
        AnonymousClass7 anonymousClass7OnPause = _handleunrecognizedcharacterescape.onPause();
        if (zIconCompatParcelizer || anonymousClass7OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            anonymousClass7OnPause = new AnonymousClass7(context, readVar);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(anonymousClass7OnPause);
        }
        StreamReadException.RemoteActionCompatParcelizer(contextAttributes, (getAnswerMap) anonymousClass7OnPause, _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return contextAttributes;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$read;", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "p0", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "onTrimMemory", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements ComponentCallbacks2 {
        final /* synthetic */ ContextAttributes write;

        read(ContextAttributes contextAttributes) {
            this.write = contextAttributes;
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration p0) {
            this.write.AudioAttributesCompatParcelizer();
        }

        @Override // android.content.ComponentCallbacks
        @getRenewGrpId
        public final void onLowMemory() {
            this.write.AudioAttributesCompatParcelizer();
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int p0) {
            this.write.AudioAttributesCompatParcelizer();
        }
    }

    private static final shouldIntrospectorImplicitConstructors write(Context context, Configuration configuration, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-485908294, i, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:174)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new shouldIntrospectorImplicitConstructors();
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        shouldIntrospectorImplicitConstructors shouldintrospectorimplicitconstructors = (shouldIntrospectorImplicitConstructors) objOnPause;
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        Object obj = objOnPause2;
        if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = new IconCompatParcelizer(configuration3, shouldintrospectorimplicitconstructors);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objOnPause3;
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
        Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
        if (zIconCompatParcelizer || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause4 = (getAnswerMap) new AnonymousClass9(context, iconCompatParcelizer);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
        }
        StreamReadException.RemoteActionCompatParcelizer(shouldintrospectorimplicitconstructors, (getAnswerMap) objOnPause4, _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return shouldintrospectorimplicitconstructors;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$IconCompatParcelizer;", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "p0", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "onTrimMemory", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements ComponentCallbacks2 {
        final /* synthetic */ shouldIntrospectorImplicitConstructors IconCompatParcelizer;
        final /* synthetic */ Configuration read;

        IconCompatParcelizer(Configuration configuration, shouldIntrospectorImplicitConstructors shouldintrospectorimplicitconstructors) {
            this.read = configuration;
            this.IconCompatParcelizer = shouldintrospectorimplicitconstructors;
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration p0) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.read.updateFrom(p0));
            this.read.setTo(p0);
        }

        @Override // android.content.ComponentCallbacks
        @getRenewGrpId
        public final void onLowMemory() {
            this.IconCompatParcelizer.read();
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int p0) {
            this.IconCompatParcelizer.read();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void RemoteActionCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder("CompositionLocal ");
        sb.append(str);
        sb.append(" not present");
        throw new IllegalStateException(sb.toString().toString());
    }
}
