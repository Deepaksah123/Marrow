package kotlin;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.KotlinModuleCompanion;
import kotlin.KotlinModuleKt;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000fJ!\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0014JG\u0010\u0017\u001a\u0004\u0018\u00010\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\b\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J[\u0010 \u001a\u00020\f2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00192\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\b\u0017\u0010#R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010\u0017\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010,R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010-\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001f\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103028\u0007¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b%\u00106R\u0014\u00107\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010:R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/KotlinNamesAnnotationIntrospectorKt;", "", "T", "Lo/KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1;", "p0", "Lo/CurrentQuery;", "p1", "Lo/accessisKotlinConstructorWithParameters;", "p2", "<init>", "(Lo/KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1;Lo/CurrentQuery;Lo/accessisKotlinConstructorWithParameters;)V", "Lkotlin/Function0;", "", "RemoteActionCompatParcelizer", "(Lo/getCreatedOnDateMs;)V", "(Lo/accessisKotlinConstructorWithParameters;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/KotlinKeySerializers;", "AudioAttributesCompatParcelizer", "(Lo/KotlinKeySerializers;Lo/KotlinKeySerializers;)V", "", "(I)Ljava/lang/Object;", "Lo/KotlinModuleWhenMappings;", "p3", "read", "(Lo/getCreatedOnDateMs;)Ljava/lang/Object;", "", "Lo/KotlinSerializersKt;", "", "p4", "p5", "Lo/KotlinFeatureCompanion;", "p6", "IconCompatParcelizer", "(Ljava/util/List;IIZLo/KotlinKeySerializers;Lo/KotlinKeySerializers;Lo/KotlinFeatureCompanion;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getDefaultsjackson_module_kotlin;", "()Lo/getDefaultsjackson_module_kotlin;", "Lo/ThemeState;", "write", "Lo/ThemeState;", "Lo/getStaticJsonValueGetter;", "Lo/getStaticJsonValueGetter;", "Lo/getReflectionCacheSize;", "Lo/getReflectionCacheSize;", "Lo/KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1;", "Lo/KotlinFeatureCompanion;", "AudioAttributesImplApi21Parcelizer", "I", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Z", "Lo/setUpdatedStatus;", "Lo/KotlinAnnotationIntrospectorCompanionUNIT_TYPE2;", "AudioAttributesImplApi26Parcelizer", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "MediaBrowserCompatItemReceiver", "Lo/CurrentQuery;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lo/KotlinModuleKt;", "MediaMetadataCompat", "Lo/KotlinModuleKt;", "Lo/KotlinNamesAnnotationIntrospectorKt$AudioAttributesCompatParcelizer;", "MediaBrowserCompatMediaItem", "Lo/KotlinNamesAnnotationIntrospectorKt$AudioAttributesCompatParcelizer;", "MediaDescriptionCompat", "Lo/hasInjectableValueId;", "RatingCompat", "Lo/hasInjectableValueId;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class KotlinNamesAnnotationIntrospectorKt<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getStaticJsonValueGetter write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private volatile int AudioAttributesImplBaseParcelizer;
    private final setUpdatedStatus<KotlinAnnotationIntrospectorCompanionUNIT_TYPE2> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final CopyOnWriteArrayList<getCreatedOnDateMs<getShowPopup>> MediaBrowserCompatCustomActionResultReceiver;
    private KotlinFeatureCompanion IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private volatile boolean AudioAttributesImplApi21Parcelizer;
    private final CurrentQuery MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final AudioAttributesCompatParcelizer<T> MediaDescriptionCompat;
    private KotlinModuleKt<T> MediaMetadataCompat;
    private hasInjectableValueId RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1 AudioAttributesCompatParcelizer;
    private final getReflectionCacheSize read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ThemeState<getShowPopup> RemoteActionCompatParcelizer;

    static final class write extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        boolean AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        final /* synthetic */ KotlinNamesAnnotationIntrospectorKt<T> MediaBrowserCompatCustomActionResultReceiver;
        int MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(KotlinNamesAnnotationIntrospectorKt<T> kotlinNamesAnnotationIntrospectorKt, SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
            this.MediaBrowserCompatCustomActionResultReceiver = kotlinNamesAnnotationIntrospectorKt;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(null, 0, 0, false, null, null, null, this);
        }
    }

    public abstract Object read(getCreatedOnDateMs<getShowPopup> getcreatedondatems);

    public KotlinNamesAnnotationIntrospectorKt(KotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1 kotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1, CurrentQuery currentQuery, accessisKotlinConstructorWithParameters<T> accessiskotlinconstructorwithparameters) {
        KotlinModuleCompanion.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizerAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(kotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1, "");
        toMagicModuleMetaRepoModel.write(currentQuery, "");
        this.AudioAttributesCompatParcelizer = kotlinAnnotationIntrospectorhasRequiredMarkerhasRequired1;
        this.MediaBrowserCompatItemReceiver = currentQuery;
        KotlinModuleKt.Companion audioAttributesCompatParcelizer = KotlinModuleKt.INSTANCE;
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        this.MediaMetadataCompat = KotlinModuleKt.Companion.read(accessiskotlinconstructorwithparameters != null ? accessiskotlinconstructorwithparameters.AudioAttributesCompatParcelizer() : null);
        getReflectionCacheSize getreflectioncachesize = new getReflectionCacheSize();
        if (accessiskotlinconstructorwithparameters != null && (remoteActionCompatParcelizerAudioAttributesCompatParcelizer = accessiskotlinconstructorwithparameters.AudioAttributesCompatParcelizer()) != null) {
            getreflectioncachesize.RemoteActionCompatParcelizer(remoteActionCompatParcelizerAudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver(), remoteActionCompatParcelizerAudioAttributesCompatParcelizer.getIconCompatParcelizer());
        }
        this.read = getreflectioncachesize;
        this.MediaBrowserCompatCustomActionResultReceiver = new CopyOnWriteArrayList<>();
        this.write = new getStaticJsonValueGetter(false, 1, magicModuleRepositoryImplExternalSyntheticLambda0);
        this.MediaDescriptionCompat = new AudioAttributesCompatParcelizer(this);
        this.AudioAttributesImplApi26Parcelizer = getreflectioncachesize.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = getThemeState.AudioAttributesCompatParcelizer(0, 64, setAddressLine2.AudioAttributesCompatParcelizer);
        RemoteActionCompatParcelizer(new AnonymousClass1(this));
    }

    public static final class AudioAttributesCompatParcelizer implements KotlinModuleKt.RemoteActionCompatParcelizer {
        final /* synthetic */ KotlinNamesAnnotationIntrospectorKt<T> IconCompatParcelizer;

        AudioAttributesCompatParcelizer(KotlinNamesAnnotationIntrospectorKt<T> kotlinNamesAnnotationIntrospectorKt) {
            this.IconCompatParcelizer = kotlinNamesAnnotationIntrospectorKt;
        }

        @Override // o.KotlinModuleKt.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(int i) {
            ((KotlinNamesAnnotationIntrospectorKt) this.IconCompatParcelizer).AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
        }

        @Override // o.KotlinModuleKt.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            ((KotlinNamesAnnotationIntrospectorKt) this.IconCompatParcelizer).AudioAttributesCompatParcelizer.read(i);
        }

        @Override // o.KotlinModuleKt.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(int i) {
            ((KotlinNamesAnnotationIntrospectorKt) this.IconCompatParcelizer).AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
        }

        @Override // o.KotlinModuleKt.RemoteActionCompatParcelizer
        public final void read(KotlinKeySerializers kotlinKeySerializers, KotlinKeySerializers kotlinKeySerializers2) {
            toMagicModuleMetaRepoModel.write(kotlinKeySerializers, "");
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(kotlinKeySerializers, kotlinKeySerializers2);
        }

        @Override // o.KotlinModuleKt.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, KotlinKeySerializersKt kotlinKeySerializersKt) {
            toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
            toMagicModuleMetaRepoModel.write(kotlinKeySerializersKt, "");
            ((KotlinNamesAnnotationIntrospectorKt) this.IconCompatParcelizer).read.write(accessgetstaticjsonkeygetter, false, kotlinKeySerializersKt);
        }
    }

    public final void AudioAttributesCompatParcelizer(KotlinKeySerializers p0, KotlinKeySerializers p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read.RemoteActionCompatParcelizer(p0, p1);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ accessisKotlinConstructorWithParameters<T> AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        final /* synthetic */ KotlinNamesAnnotationIntrospectorKt<T> read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                ((KotlinNamesAnnotationIntrospectorKt) this.read).RatingCompat = this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
                NewNumberOtpResendRequest<KotlinModuleCompanion<T>> newNumberOtpResendRequestWrite = this.AudioAttributesCompatParcelizer.write();
                final KotlinNamesAnnotationIntrospectorKt<T> kotlinNamesAnnotationIntrospectorKt = this.read;
                final accessisKotlinConstructorWithParameters<T> accessiskotlinconstructorwithparameters = this.AudioAttributesCompatParcelizer;
                this.RemoteActionCompatParcelizer = 1;
                if (newNumberOtpResendRequestWrite.write(new getValidationToken() { // from class: o.KotlinNamesAnnotationIntrospectorKt.RemoteActionCompatParcelizer.5

                    /* JADX INFO: renamed from: o.KotlinNamesAnnotationIntrospectorKt$RemoteActionCompatParcelizer$5$3, reason: invalid class name */
                    static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                        final /* synthetic */ KotlinModuleCompanion<T> AudioAttributesCompatParcelizer;
                        final /* synthetic */ KotlinNamesAnnotationIntrospectorKt<T> IconCompatParcelizer;
                        private int RemoteActionCompatParcelizer;
                        final /* synthetic */ accessisKotlinConstructorWithParameters<T> read;

                        /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
                        
                            if (r14.IconCompatParcelizer.IconCompatParcelizer(((o.KotlinModuleCompanion.RemoteActionCompatParcelizer) r14.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(), ((o.KotlinModuleCompanion.RemoteActionCompatParcelizer) r14.AudioAttributesCompatParcelizer).getAudioAttributesImplApi26Parcelizer(), ((o.KotlinModuleCompanion.RemoteActionCompatParcelizer) r14.AudioAttributesCompatParcelizer).getAudioAttributesImplBaseParcelizer(), true, ((o.KotlinModuleCompanion.RemoteActionCompatParcelizer) r14.AudioAttributesCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver(), ((o.KotlinModuleCompanion.RemoteActionCompatParcelizer) r14.AudioAttributesCompatParcelizer).getIconCompatParcelizer(), r14.read.getRead(), r14) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
                        
                            if (r5.IconCompatParcelizer(r6, 0, 0, r9, ((o.KotlinModuleCompanion.read) r14.AudioAttributesCompatParcelizer).getAudioAttributesCompatParcelizer(), ((o.KotlinModuleCompanion.read) r14.AudioAttributesCompatParcelizer).getRead(), r14.read.getRead(), r14) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
                        
                            return r0;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x0169  */
                        /* JADX WARN: Removed duplicated region for block: B:62:0x016f  */
                        @Override // kotlin.getMonthName
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                            /*
                                Method dump skipped, instruction units count: 519
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.KotlinNamesAnnotationIntrospectorKt.RemoteActionCompatParcelizer.AnonymousClass5.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(KotlinModuleCompanion<T> kotlinModuleCompanion, KotlinNamesAnnotationIntrospectorKt<T> kotlinNamesAnnotationIntrospectorKt, accessisKotlinConstructorWithParameters<T> accessiskotlinconstructorwithparameters, SampleVideos<? super AnonymousClass3> sampleVideos) {
                            super(2, sampleVideos);
                            this.AudioAttributesCompatParcelizer = kotlinModuleCompanion;
                            this.IconCompatParcelizer = kotlinNamesAnnotationIntrospectorKt;
                            this.read = accessiskotlinconstructorwithparameters;
                        }

                        @Override // kotlin.getMonthName
                        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                            return new AnonymousClass3(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.read, sampleVideos);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                            return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                        }
                    }

                    @Override // kotlin.getValidationToken
                    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                    public final Object IconCompatParcelizer(KotlinModuleCompanion<T> kotlinModuleCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                        KotlinModule kotlinModuleWrite = getStaticJsonKeyGetter.write();
                        if (kotlinModuleWrite != null && kotlinModuleWrite.write(2)) {
                            kotlinModuleWrite.write(2, "Collected ".concat(String.valueOf(kotlinModuleCompanion)));
                        }
                        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(((KotlinNamesAnnotationIntrospectorKt) kotlinNamesAnnotationIntrospectorKt).MediaBrowserCompatItemReceiver, new AnonymousClass3(kotlinModuleCompanion, kotlinNamesAnnotationIntrospectorKt, accessiskotlinconstructorwithparameters, null), sampleVideos);
                        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
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
        RemoteActionCompatParcelizer(KotlinNamesAnnotationIntrospectorKt<T> kotlinNamesAnnotationIntrospectorKt, accessisKotlinConstructorWithParameters<T> accessiskotlinconstructorwithparameters, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = kotlinNamesAnnotationIntrospectorKt;
            this.AudioAttributesCompatParcelizer = accessiskotlinconstructorwithparameters;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final Object RemoteActionCompatParcelizer(accessisKotlinConstructorWithParameters<T> accessiskotlinconstructorwithparameters, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(0, new RemoteActionCompatParcelizer(this, accessiskotlinconstructorwithparameters, null), sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    public final T AudioAttributesCompatParcelizer(int p0) {
        this.AudioAttributesImplApi21Parcelizer = true;
        this.AudioAttributesImplBaseParcelizer = p0;
        KotlinModule kotlinModuleWrite = getStaticJsonKeyGetter.write();
        if (kotlinModuleWrite != null && kotlinModuleWrite.write(2)) {
            StringBuilder sb = new StringBuilder("Accessing item index[");
            sb.append(p0);
            sb.append(']');
            kotlinModuleWrite.write(2, sb.toString());
        }
        KotlinFeatureCompanion kotlinFeatureCompanion = this.IconCompatParcelizer;
        if (kotlinFeatureCompanion != null) {
            kotlinFeatureCompanion.write(this.MediaMetadataCompat.AudioAttributesCompatParcelizer(p0));
        }
        return this.MediaMetadataCompat.read(p0);
    }

    public final getDefaultsjackson_module_kotlin<T> read() {
        return this.MediaMetadataCompat.read();
    }

    public final setUpdatedStatus<KotlinAnnotationIntrospectorCompanionUNIT_TYPE2> write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: o.KotlinNamesAnnotationIntrospectorKt$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "IconCompatParcelizer", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ KotlinNamesAnnotationIntrospectorKt<T> write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer() {
            ((KotlinNamesAnnotationIntrospectorKt) this.write).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getShowPopup.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(KotlinNamesAnnotationIntrospectorKt<T> kotlinNamesAnnotationIntrospectorKt) {
            super(0);
            this.write = kotlinNamesAnnotationIntrospectorKt;
        }
    }

    private void RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.MediaBrowserCompatCustomActionResultReceiver.add(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.util.List<kotlin.KotlinSerializersKt<T>> r19, int r20, int r21, boolean r22, kotlin.KotlinKeySerializers r23, kotlin.KotlinKeySerializers r24, kotlin.KotlinFeatureCompanion r25, kotlin.SampleVideos<? super kotlin.getShowPopup> r26) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.KotlinNamesAnnotationIntrospectorKt.IconCompatParcelizer(java.util.List, int, int, boolean, o.KotlinKeySerializers, o.KotlinKeySerializers, o.KotlinFeatureCompanion, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: renamed from: o.KotlinNamesAnnotationIntrospectorKt$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "write", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ List<KotlinSerializersKt<T>> $AudioAttributesCompatParcelizer;
        final /* synthetic */ KotlinKeySerializers $AudioAttributesImplBaseParcelizer;
        final /* synthetic */ KotlinFeatureCompanion $IconCompatParcelizer;
        final /* synthetic */ int $MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ int $MediaBrowserCompatItemReceiver;
        final /* synthetic */ KotlinModuleKt<T> $RemoteActionCompatParcelizer;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer $read;
        final /* synthetic */ KotlinKeySerializers $write;
        final /* synthetic */ KotlinNamesAnnotationIntrospectorKt<T> AudioAttributesImplApi26Parcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        public final void write() {
            List<T> listAudioAttributesCompatParcelizer;
            List<T> listAudioAttributesCompatParcelizer2;
            ((KotlinNamesAnnotationIntrospectorKt) this.AudioAttributesImplApi26Parcelizer).MediaMetadataCompat = this.$RemoteActionCompatParcelizer;
            this.$read.IconCompatParcelizer = true;
            ((KotlinNamesAnnotationIntrospectorKt) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer = this.$IconCompatParcelizer;
            KotlinKeySerializers kotlinKeySerializers = this.$write;
            List<KotlinSerializersKt<T>> list = this.$AudioAttributesCompatParcelizer;
            int i = this.$MediaBrowserCompatCustomActionResultReceiver;
            int i2 = this.$MediaBrowserCompatItemReceiver;
            KotlinFeatureCompanion kotlinFeatureCompanion = this.$IconCompatParcelizer;
            KotlinKeySerializers kotlinKeySerializers2 = this.$AudioAttributesImplBaseParcelizer;
            KotlinModule kotlinModuleWrite = getStaticJsonKeyGetter.write();
            if (kotlinModuleWrite == null || !kotlinModuleWrite.write(3)) {
                return;
            }
            StringBuilder sb = new StringBuilder("Presenting data:\n                            |   first item: ");
            KotlinSerializersKt kotlinSerializersKt = (KotlinSerializersKt) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) list);
            Object objMediaMetadataCompat = null;
            sb.append((kotlinSerializersKt == null || (listAudioAttributesCompatParcelizer2 = kotlinSerializersKt.AudioAttributesCompatParcelizer()) == null) ? null : IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) listAudioAttributesCompatParcelizer2));
            sb.append("\n                            |   last item: ");
            KotlinSerializersKt kotlinSerializersKt2 = (KotlinSerializersKt) IntermediateLoginResponseBody.MediaMetadataCompat((List) list);
            if (kotlinSerializersKt2 != null && (listAudioAttributesCompatParcelizer = kotlinSerializersKt2.AudioAttributesCompatParcelizer()) != null) {
                objMediaMetadataCompat = IntermediateLoginResponseBody.MediaMetadataCompat((List<? extends Object>) listAudioAttributesCompatParcelizer);
            }
            sb.append(objMediaMetadataCompat);
            sb.append("\n                            |   placeholdersBefore: ");
            sb.append(i);
            sb.append("\n                            |   placeholdersAfter: ");
            sb.append(i2);
            sb.append("\n                            |   hintReceiver: ");
            sb.append(kotlinFeatureCompanion);
            sb.append("\n                            |   sourceLoadStates: ");
            sb.append(kotlinKeySerializers2);
            sb.append("\n                        ");
            String string = sb.toString();
            if (kotlinKeySerializers != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("|   mediatorLoadStates: ");
                sb2.append(kotlinKeySerializers);
                sb2.append('\n');
                string = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append("|)");
            kotlinModuleWrite.write(3, TestGroupLSModel.RemoteActionCompatParcelizer(sb3.toString(), "|"));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(KotlinNamesAnnotationIntrospectorKt<T> kotlinNamesAnnotationIntrospectorKt, KotlinModuleKt<T> kotlinModuleKt, MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, KotlinFeatureCompanion kotlinFeatureCompanion, KotlinKeySerializers kotlinKeySerializers, List<KotlinSerializersKt<T>> list, int i, int i2, KotlinKeySerializers kotlinKeySerializers2) {
            super(0);
            this.AudioAttributesImplApi26Parcelizer = kotlinNamesAnnotationIntrospectorKt;
            this.$RemoteActionCompatParcelizer = kotlinModuleKt;
            this.$read = audioAttributesCompatParcelizer;
            this.$IconCompatParcelizer = kotlinFeatureCompanion;
            this.$write = kotlinKeySerializers;
            this.$AudioAttributesCompatParcelizer = list;
            this.$MediaBrowserCompatCustomActionResultReceiver = i;
            this.$MediaBrowserCompatItemReceiver = i2;
            this.$AudioAttributesImplBaseParcelizer = kotlinKeySerializers2;
        }
    }
}
