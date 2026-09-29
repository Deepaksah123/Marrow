package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010!\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lo/setType;", "Lo/getNoBackupFilesDir;", "Lkotlin/Function1;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "Lo/Flow;", "Lkotlin/Function2;", "Lo/checkSelfPermission;", "Lo/SampleVideos;", "", "", "p1", "AudioAttributesCompatParcelizer", "(Lo/Flow;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "(F)F", "write", "Lo/getAnswerMap;", "()Lo/getAnswerMap;", "AudioAttributesImplBaseParcelizer", "Lo/checkSelfPermission;", "read", "Lo/setFirstHorizontalStyle;", "Lo/setFirstHorizontalStyle;", "IconCompatParcelizer", "Lo/InputAccessor;", "", "Lo/InputAccessor;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "()Z", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setType implements getNoBackupFilesDir {
    private final InputAccessor<Boolean> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor<Boolean> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor<Boolean> MediaBrowserCompatCustomActionResultReceiver;
    private final getAnswerMap<Float, Float> write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final checkSelfPermission read = new AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setFirstHorizontalStyle IconCompatParcelizer = new setFirstHorizontalStyle();

    /* JADX WARN: Multi-variable type inference failed */
    public setType(getAnswerMap<? super Float, Float> getanswermap) {
        this.write = getanswermap;
        Boolean bool = Boolean.FALSE;
        this.AudioAttributesCompatParcelizer = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.MediaBrowserCompatCustomActionResultReceiver = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
    }

    public final getAnswerMap<Float, Float> RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setType$AudioAttributesCompatParcelizer;", "Lo/checkSelfPermission;", "", "p0", "IconCompatParcelizer", "(F)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements checkSelfPermission {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.checkSelfPermission
        public final float IconCompatParcelizer(float p0) {
            if (Float.isNaN(p0)) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float fFloatValue = setType.this.RemoteActionCompatParcelizer().invoke(Float.valueOf(p0)).floatValue();
            setType.this.RemoteActionCompatParcelizer.write(Boolean.valueOf(fFloatValue > BitmapDescriptorFactory.HUE_RED));
            setType.this.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.valueOf(fFloatValue < BitmapDescriptorFactory.HUE_RED));
            return fFloatValue;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<checkSelfPermission, SampleVideos<? super getShowPopup>, Object> RemoteActionCompatParcelizer;
        int read;
        final /* synthetic */ Flow write;

        /* JADX INFO: renamed from: o.setType$IconCompatParcelizer$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<checkSelfPermission, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ setType IconCompatParcelizer;
            private /* synthetic */ Object RemoteActionCompatParcelizer;
            final /* synthetic */ MagicModuleSubmissionRequestBody<checkSelfPermission, SampleVideos<? super getShowPopup>, Object> read;
            int write;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, o.getShowPopup] */
            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.write;
                try {
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        checkSelfPermission checkselfpermission = (checkSelfPermission) this.RemoteActionCompatParcelizer;
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                        MagicModuleSubmissionRequestBody<checkSelfPermission, SampleVideos<? super getShowPopup>, Object> magicModuleSubmissionRequestBody = this.read;
                        this.write = 1;
                        if (magicModuleSubmissionRequestBody.invoke(checkselfpermission, this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
                    this = getShowPopup.INSTANCE;
                    return this;
                } catch (Throwable th) {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
                    throw th;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(setType settype, MagicModuleSubmissionRequestBody<? super checkSelfPermission, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = settype;
                this.read = magicModuleSubmissionRequestBody;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.IconCompatParcelizer, this.read, sampleVideos);
                anonymousClass1.RemoteActionCompatParcelizer = obj;
                return anonymousClass1;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Object invoke(checkSelfPermission checkselfpermission, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(checkselfpermission, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (setType.this.IconCompatParcelizer.read(setType.this.read, this.write, new AnonymousClass1(setType.this, this.RemoteActionCompatParcelizer, null), this) == objIconCompatParcelizer) {
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
        IconCompatParcelizer(Flow flow, MagicModuleSubmissionRequestBody<? super checkSelfPermission, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = flow;
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setType.this.new IconCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getNoBackupFilesDir
    public final Object AudioAttributesCompatParcelizer(Flow flow, MagicModuleSubmissionRequestBody<? super checkSelfPermission, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = College.IconCompatParcelizer(new IconCompatParcelizer(flow, magicModuleSubmissionRequestBody, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.getNoBackupFilesDir
    public final float RemoteActionCompatParcelizer(float p0) {
        return this.write.invoke(Float.valueOf(p0)).floatValue();
    }

    @Override // kotlin.getNoBackupFilesDir
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().booleanValue();
    }
}
