package kotlin;

import android.util.Log;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001bB\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\"\u0004\b\u0012\u0010\u0018R%\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00198F@CX\u0087\u008e\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/MethodValueCreatorCompanion;", "", "T", "Lo/NewNumberOtpResendRequest;", "Lo/accessisKotlinConstructorWithParameters;", "p0", "<init>", "(Lo/NewNumberOtpResendRequest;)V", "", "AudioAttributesCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer", "", "write", "(I)Ljava/lang/Object;", "()V", "Lo/KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1;", "Lo/KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1;", "RemoteActionCompatParcelizer", "Lo/NewNumberOtpResendRequest;", "()I", "Lo/getDefaultsjackson_module_kotlin;", "Lo/InputAccessor;", "()Lo/getDefaultsjackson_module_kotlin;", "(Lo/getDefaultsjackson_module_kotlin;)V", "Lo/KotlinAnnotationIntrospectorCompanionUNIT_TYPE2;", "MediaBrowserCompatItemReceiver", "read", "(Lo/KotlinAnnotationIntrospectorCompanionUNIT_TYPE2;)V", "Lo/CurrentQuery;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/CurrentQuery;", "Lo/MethodValueCreatorCompanion$MediaBrowserCompatCustomActionResultReceiver;", "AudioAttributesImplBaseParcelizer", "Lo/MethodValueCreatorCompanion$MediaBrowserCompatCustomActionResultReceiver;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MethodValueCreatorCompanion<T> {
    private final KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1 AudioAttributesCompatParcelizer;
    private final MediaBrowserCompatCustomActionResultReceiver<T> AudioAttributesImplBaseParcelizer;
    private final CurrentQuery MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final InputAccessor read;
    private final NewNumberOtpResendRequest<accessisKotlinConstructorWithParameters<T>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final InputAccessor IconCompatParcelizer;
    private static final read read = new read(null);
    public static final int IconCompatParcelizer = 8;

    public MethodValueCreatorCompanion(NewNumberOtpResendRequest<accessisKotlinConstructorWithParameters<T>> newNumberOtpResendRequest) {
        toMagicModuleMetaRepoModel.write(newNumberOtpResendRequest, "");
        this.RemoteActionCompatParcelizer = newNumberOtpResendRequest;
        CurrentQuery currentQueryIconCompatParcelizer = getDefaultPrettyPrinter.INSTANCE.IconCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = currentQueryIconCompatParcelizer;
        write writeVar = new write(this);
        this.AudioAttributesCompatParcelizer = writeVar;
        MediaBrowserCompatCustomActionResultReceiver<T> mediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver(this, writeVar, currentQueryIconCompatParcelizer, newNumberOtpResendRequest instanceof isDark ? (accessisKotlinConstructorWithParameters) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) ((isDark) newNumberOtpResendRequest).bm_()) : null);
        this.AudioAttributesImplBaseParcelizer = mediaBrowserCompatCustomActionResultReceiver;
        this.IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(mediaBrowserCompatCustomActionResultReceiver.read(), null, 2, null);
        KotlinAnnotationIntrospectorCompanionUNIT_TYPE2 kotlinAnnotationIntrospectorCompanionUNIT_TYPE2IconCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver.write().IconCompatParcelizer();
        this.read = available.RemoteActionCompatParcelizer$default(kotlinAnnotationIntrospectorCompanionUNIT_TYPE2IconCompatParcelizer == null ? new KotlinAnnotationIntrospectorCompanionUNIT_TYPE2(MissingKotlinParameterException.write.getRead(), MissingKotlinParameterException.write.getRemoteActionCompatParcelizer(), MissingKotlinParameterException.write.getIconCompatParcelizer(), MissingKotlinParameterException.write, null, 16, null) : kotlinAnnotationIntrospectorCompanionUNIT_TYPE2IconCompatParcelizer, null, 2, null);
    }

    public static final class write implements KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1 {
        final /* synthetic */ MethodValueCreatorCompanion<T> write;

        write(MethodValueCreatorCompanion<T> methodValueCreatorCompanion) {
            this.write = methodValueCreatorCompanion;
        }

        @Override // kotlin.KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1
        public final void AudioAttributesCompatParcelizer(int i) {
            if (i > 0) {
                this.write.IconCompatParcelizer();
            }
        }

        @Override // kotlin.KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1
        public final void read(int i) {
            if (i > 0) {
                this.write.IconCompatParcelizer();
            }
        }

        @Override // kotlin.KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1
        public final void IconCompatParcelizer(int i) {
            if (i > 0) {
                this.write.IconCompatParcelizer();
            }
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends KotlinNamesAnnotationIntrospectorKt<T> {
        final /* synthetic */ MethodValueCreatorCompanion<T> AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(MethodValueCreatorCompanion<T> methodValueCreatorCompanion, KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1 kotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1, CurrentQuery currentQuery, accessisKotlinConstructorWithParameters<T> accessiskotlinconstructorwithparameters) {
            super(kotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1, currentQuery, accessiskotlinconstructorwithparameters);
            this.AudioAttributesCompatParcelizer = methodValueCreatorCompanion;
        }

        @Override // kotlin.KotlinNamesAnnotationIntrospectorKt
        public final Object read(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            getcreatedondatems.invoke();
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            return null;
        }
    }

    private final void RemoteActionCompatParcelizer(getDefaultsjackson_module_kotlin<T> getdefaultsjackson_module_kotlin) {
        this.IconCompatParcelizer.write(getdefaultsjackson_module_kotlin);
    }

    public final getDefaultsjackson_module_kotlin<T> RemoteActionCompatParcelizer() {
        return (getDefaultsjackson_module_kotlin) this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    public final int write() {
        return RemoteActionCompatParcelizer().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer() {
        RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.read());
    }

    public final T write(int p0) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(p0);
        return RemoteActionCompatParcelizer().get(p0);
    }

    public final T IconCompatParcelizer(int p0) {
        return RemoteActionCompatParcelizer().get(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(KotlinAnnotationIntrospectorCompanionUNIT_TYPE2 kotlinAnnotationIntrospectorCompanionUNIT_TYPE2) {
        this.read.write(kotlinAnnotationIntrospectorCompanionUNIT_TYPE2);
    }

    static final class RemoteActionCompatParcelizer implements getValidationToken<KotlinAnnotationIntrospectorCompanionUNIT_TYPE2> {
        final /* synthetic */ MethodValueCreatorCompanion<T> read;

        @Override // kotlin.getValidationToken
        public final /* synthetic */ Object IconCompatParcelizer(KotlinAnnotationIntrospectorCompanionUNIT_TYPE2 kotlinAnnotationIntrospectorCompanionUNIT_TYPE2, SampleVideos sampleVideos) {
            return write(kotlinAnnotationIntrospectorCompanionUNIT_TYPE2);
        }

        private Object write(KotlinAnnotationIntrospectorCompanionUNIT_TYPE2 kotlinAnnotationIntrospectorCompanionUNIT_TYPE2) {
            this.read.read(kotlinAnnotationIntrospectorCompanionUNIT_TYPE2);
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(MethodValueCreatorCompanion<T> methodValueCreatorCompanion) {
            this.read = methodValueCreatorCompanion;
        }
    }

    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = VerifyNewNumberRequest.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.write()).write(new RemoteActionCompatParcelizer(this), sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<accessisKotlinConstructorWithParameters<T>, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object IconCompatParcelizer;
        final /* synthetic */ MethodValueCreatorCompanion<T> RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                accessisKotlinConstructorWithParameters<T> accessiskotlinconstructorwithparameters = (accessisKotlinConstructorWithParameters) this.IconCompatParcelizer;
                this.write = 1;
                if (((MethodValueCreatorCompanion) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(accessiskotlinconstructorwithparameters, this) == objIconCompatParcelizer) {
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
        IconCompatParcelizer(MethodValueCreatorCompanion<T> methodValueCreatorCompanion, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = methodValueCreatorCompanion;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
            iconCompatParcelizer.IconCompatParcelizer = obj;
            return iconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(accessisKotlinConstructorWithParameters<T> accessiskotlinconstructorwithparameters, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(accessiskotlinconstructorwithparameters, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final Object IconCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, new IconCompatParcelizer(this, null), sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/MethodValueCreatorCompanion$read;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final class AudioAttributesCompatParcelizer implements KotlinModule {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.KotlinModule
        public final boolean write(int i) {
            return Log.isLoggable("Paging", i);
        }

        @Override // kotlin.KotlinModule
        public final void write(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            if (i == 3 || i == 2) {
                return;
            }
            StringBuilder sb = new StringBuilder("debug level ");
            sb.append(i);
            sb.append(" is requested but Paging only supports default logging for level 2 (DEBUG) or level 3 (VERBOSE)");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = getStaticJsonKeyGetter.write();
        if (audioAttributesCompatParcelizerWrite == null) {
            audioAttributesCompatParcelizerWrite = new AudioAttributesCompatParcelizer();
        }
        getStaticJsonKeyGetter.write(audioAttributesCompatParcelizerWrite);
    }
}
