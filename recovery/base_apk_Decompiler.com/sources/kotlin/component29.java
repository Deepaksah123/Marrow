package kotlin;

import java.util.List;
import kotlin.ApplicationData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u00020\u0016*\u00060\u0017j\u0002`\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u0016*\u00060\u0017j\u0002`\u00182\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", "parameter", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "appendReceiverType", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class component29 {
    public static final component29 read = new component29();
    private static final setGuessed RemoteActionCompatParcelizer = setGuessed.read;

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[ApplicationData.IconCompatParcelizer.values().length];
            try {
                iArr[ApplicationData.IconCompatParcelizer.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApplicationData.IconCompatParcelizer.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApplicationData.IconCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    private component29() {
    }

    private static void AudioAttributesCompatParcelizer(StringBuilder sb, CourseConfigV2TestTabItem courseConfigV2TestTabItem) {
        if (courseConfigV2TestTabItem != null) {
            getLink getlinkOnPrepareFromMediaId = courseConfigV2TestTabItem.onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            sb.append(read(getlinkOnPrepareFromMediaId));
            sb.append(".");
        }
    }

    private final void IconCompatParcelizer(StringBuilder sb, getVideoPageNotesTitle getvideopagenotestitle) {
        CourseConfigV2TestTabItem courseConfigV2TestTabItemRemoteActionCompatParcelizer = getCourseStrings.RemoteActionCompatParcelizer(getvideopagenotestitle);
        CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = getvideopagenotestitle.MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesCompatParcelizer(sb, courseConfigV2TestTabItemRemoteActionCompatParcelizer);
        boolean z = (courseConfigV2TestTabItemRemoteActionCompatParcelizer == null || courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        AudioAttributesCompatParcelizer(sb, courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver);
        if (z) {
            sb.append(")");
        }
    }

    private static String write(getVideoPageNotesTitle getvideopagenotestitle) {
        if (getvideopagenotestitle instanceof CourseConfigV2SettingsItems) {
            return write((CourseConfigV2SettingsItems) getvideopagenotestitle);
        }
        if (getvideopagenotestitle instanceof CourseConfigV2NavDrawerItemRateUs) {
            return write((CourseConfigV2NavDrawerItemRateUs) getvideopagenotestitle);
        }
        throw new IllegalStateException("Illegal callable: ".concat(String.valueOf(getvideopagenotestitle)).toString());
    }

    public static String write(CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
        toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
        StringBuilder sb = new StringBuilder();
        sb.append(courseConfigV2SettingsItems.onRewind() ? "var " : "val ");
        read.IconCompatParcelizer(sb, courseConfigV2SettingsItems);
        setGuessed setguessed = RemoteActionCompatParcelizer;
        getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2SettingsItems.aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
        sb.append(setguessed.read(getrelatedlessonidAQ_, true));
        sb.append(": ");
        getLink getlinkOnPrepareFromMediaId = courseConfigV2SettingsItems.onPrepareFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
        sb.append(read(getlinkOnPrepareFromMediaId));
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public static String write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        read.IconCompatParcelizer(sb, courseConfigV2NavDrawerItemRateUs);
        setGuessed setguessed = RemoteActionCompatParcelizer;
        getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2NavDrawerItemRateUs.aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
        sb.append(setguessed.read(getrelatedlessonidAQ_, true));
        List<getMeta> listAX_ = courseConfigV2NavDrawerItemRateUs.aX_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
        IntermediateLoginResponseBody.write(listAX_, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) != 0 ? "" : ")", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : AnonymousClass2.AudioAttributesCompatParcelizer);
        sb.append(": ");
        getLink getlinkAudioAttributesImplBaseParcelizer = courseConfigV2NavDrawerItemRateUs.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.write(getlinkAudioAttributesImplBaseParcelizer);
        sb.append(read(getlinkAudioAttributesImplBaseParcelizer));
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: renamed from: o.component29$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getMeta;", "p0", "", "IconCompatParcelizer", "(Lo/getMeta;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<getMeta, CharSequence> {
        public static final AnonymousClass2 AudioAttributesCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(getMeta getmeta) {
            component29 component29Var = component29.read;
            getLink getlinkOnPrepareFromMediaId = getmeta.onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            return component29.read(getlinkOnPrepareFromMediaId);
        }

        AnonymousClass2() {
            super(1);
        }
    }

    public static String read(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        StringBuilder sb = new StringBuilder();
        read.IconCompatParcelizer(sb, courseConfigV2NavDrawerItemRateUs);
        List<getMeta> listAX_ = courseConfigV2NavDrawerItemRateUs.aX_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
        IntermediateLoginResponseBody.write(listAX_, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) != 0 ? "" : ")", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : AnonymousClass5.write);
        sb.append(" -> ");
        getLink getlinkAudioAttributesImplBaseParcelizer = courseConfigV2NavDrawerItemRateUs.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.write(getlinkAudioAttributesImplBaseParcelizer);
        sb.append(read(getlinkAudioAttributesImplBaseParcelizer));
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: renamed from: o.component29$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getMeta;", "p0", "", "IconCompatParcelizer", "(Lo/getMeta;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<getMeta, CharSequence> {
        public static final AnonymousClass5 write = new AnonymousClass5();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(getMeta getmeta) {
            component29 component29Var = component29.read;
            getLink getlinkOnPrepareFromMediaId = getmeta.onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            return component29.read(getlinkOnPrepareFromMediaId);
        }

        AnonymousClass5() {
            super(1);
        }
    }

    public static String RemoteActionCompatParcelizer(component23 component23Var) {
        toMagicModuleMetaRepoModel.write(component23Var, "");
        StringBuilder sb = new StringBuilder();
        int i = IconCompatParcelizer.write[component23Var.IconCompatParcelizer().ordinal()];
        if (i == 1) {
            sb.append("extension receiver parameter");
        } else if (i == 2) {
            sb.append("instance parameter");
        } else if (i == 3) {
            StringBuilder sb2 = new StringBuilder("parameter #");
            sb2.append(component23Var.write());
            sb2.append(' ');
            sb2.append(component23Var.RemoteActionCompatParcelizer());
            sb.append(sb2.toString());
        }
        sb.append(" of ");
        sb.append(write(component23Var.AudioAttributesImplBaseParcelizer().RatingCompat()));
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public static String read(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return RemoteActionCompatParcelizer.read(getlink);
    }
}
