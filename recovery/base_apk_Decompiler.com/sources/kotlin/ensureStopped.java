package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
final class ensureStopped implements enableRenderer {
    private final parseDouble AudioAttributesCompatParcelizer;
    private final InputAccessor AudioAttributesImplApi21Parcelizer;
    private final InputAccessor AudioAttributesImplApi26Parcelizer;
    private final setFirstHorizontalStyle AudioAttributesImplBaseParcelizer;
    private final parseDouble IconCompatParcelizer;
    private final InputAccessor MediaBrowserCompatCustomActionResultReceiver;
    private final InputAccessor MediaBrowserCompatItemReceiver;
    private final InputAccessor MediaBrowserCompatMediaItem;
    private final InputAccessor MediaBrowserCompatSearchResultReceiver;
    private final InputAccessor MediaDescriptionCompat;
    private final InputAccessor MediaMetadataCompat;
    private final InputAccessor RatingCompat;
    private final InputAccessor RemoteActionCompatParcelizer;
    private final InputAccessor read;
    private final parseDouble write;

    public ensureStopped() {
        Boolean bool = Boolean.FALSE;
        this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.MediaBrowserCompatCustomActionResultReceiver = available.RemoteActionCompatParcelizer$default(1, null, 2, null);
        this.AudioAttributesImplApi21Parcelizer = available.RemoteActionCompatParcelizer$default(1, null, 2, null);
        this.MediaBrowserCompatMediaItem = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.read = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.MediaDescriptionCompat = available.RemoteActionCompatParcelizer$default(Float.valueOf(1.0f), null, 2, null);
        this.MediaBrowserCompatSearchResultReceiver = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.IconCompatParcelizer = _qbuf.RemoteActionCompatParcelizer(new AnonymousClass4());
        this.RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this.MediaMetadataCompat = available.RemoteActionCompatParcelizer$default(fValueOf, null, 2, null);
        this.RatingCompat = available.RemoteActionCompatParcelizer$default(fValueOf, null, 2, null);
        this.AudioAttributesImplApi26Parcelizer = available.RemoteActionCompatParcelizer$default(Long.MIN_VALUE, null, 2, null);
        this.AudioAttributesCompatParcelizer = _qbuf.RemoteActionCompatParcelizer(new AnonymousClass5());
        this.write = _qbuf.RemoteActionCompatParcelizer(new AnonymousClass1());
        this.AudioAttributesImplBaseParcelizer = new setFirstHorizontalStyle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.parseDouble
    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
    public Float getRemoteActionCompatParcelizer() {
        return Float.valueOf(MediaBrowserCompatCustomActionResultReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver.write(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getFormats
    public final int IconCompatParcelizer() {
        return ((Number) this.MediaBrowserCompatCustomActionResultReceiver.getRemoteActionCompatParcelizer()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(int i) {
        this.AudioAttributesImplApi21Parcelizer.write(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getFormats
    public final int AudioAttributesCompatParcelizer() {
        return ((Number) this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(boolean z) {
        this.MediaBrowserCompatMediaItem.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getFormats
    public final boolean AudioAttributesImplBaseParcelizer() {
        return ((Boolean) this.MediaBrowserCompatMediaItem.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(handleMediaSourceListInfoRefreshed handlemediasourcelistinforefreshed) {
        this.read.write(handlemediasourcelistinforefreshed);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getFormats
    public final handleMediaSourceListInfoRefreshed RemoteActionCompatParcelizer() {
        return (handleMediaSourceListInfoRefreshed) this.read.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(float f) {
        this.MediaDescriptionCompat.write(Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getFormats
    public final float AudioAttributesImplApi26Parcelizer() {
        return ((Number) this.MediaDescriptionCompat.getRemoteActionCompatParcelizer()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean MediaMetadataCompat() {
        return ((Boolean) this.MediaBrowserCompatSearchResultReceiver.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver.write(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o.ensureStopped$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Float> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf((ensureStopped.this.AudioAttributesImplBaseParcelizer() && ensureStopped.this.IconCompatParcelizer() % 2 == 0) ? -ensureStopped.this.AudioAttributesImplApi26Parcelizer() : ensureStopped.this.AudioAttributesImplApi26Parcelizer());
        }

        AnonymousClass4() {
            super(0);
        }
    }

    private final float AudioAttributesImplApi21Parcelizer() {
        return ((Number) this.IconCompatParcelizer.getRemoteActionCompatParcelizer()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        this.RemoteActionCompatParcelizer.write(exoPlayerImplExternalSyntheticLambda19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getFormats
    public final ExoPlayerImplExternalSyntheticLambda19 write() {
        return (ExoPlayerImplExternalSyntheticLambda19) this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    private final void IconCompatParcelizer(float f) {
        this.MediaMetadataCompat.write(Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float MediaDescriptionCompat() {
        return ((Number) this.MediaMetadataCompat.getRemoteActionCompatParcelizer()).floatValue();
    }

    private void write(float f) {
        this.RatingCompat.write(Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getFormats
    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return ((Number) this.RatingCompat.getRemoteActionCompatParcelizer()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long MediaBrowserCompatMediaItem() {
        return ((Number) this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(long j) {
        this.AudioAttributesImplApi26Parcelizer.write(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: o.ensureStopped$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Float> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19Write = ensureStopped.this.write();
            float fIconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            if (exoPlayerImplExternalSyntheticLambda19Write != null) {
                if (ensureStopped.this.AudioAttributesImplApi26Parcelizer() < BitmapDescriptorFactory.HUE_RED) {
                    handleMediaSourceListInfoRefreshed handlemediasourcelistinforefreshedRemoteActionCompatParcelizer = ensureStopped.this.RemoteActionCompatParcelizer();
                    if (handlemediasourcelistinforefreshedRemoteActionCompatParcelizer != null) {
                        fIconCompatParcelizer = handlemediasourcelistinforefreshedRemoteActionCompatParcelizer.IconCompatParcelizer();
                    }
                } else {
                    handleMediaSourceListInfoRefreshed handlemediasourcelistinforefreshedRemoteActionCompatParcelizer2 = ensureStopped.this.RemoteActionCompatParcelizer();
                    fIconCompatParcelizer = handlemediasourcelistinforefreshedRemoteActionCompatParcelizer2 != null ? handlemediasourcelistinforefreshedRemoteActionCompatParcelizer2.read() : 1.0f;
                }
            }
            return Float.valueOf(fIconCompatParcelizer);
        }

        AnonymousClass5() {
            super(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float MediaBrowserCompatItemReceiver() {
        return ((Number) this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()).floatValue();
    }

    /* JADX INFO: renamed from: o.ensureStopped$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(ensureStopped.this.IconCompatParcelizer() == ensureStopped.this.AudioAttributesCompatParcelizer() && ensureStopped.this.MediaBrowserCompatCustomActionResultReceiver() == ensureStopped.this.MediaBrowserCompatItemReceiver());
        }

        AnonymousClass1() {
            super(0);
        }
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ float IconCompatParcelizer;
        private /* synthetic */ boolean RemoteActionCompatParcelizer;
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda19 read;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            ensureStopped.this.read(this.read);
            ensureStopped.this.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            ensureStopped.this.AudioAttributesCompatParcelizer(this.write);
            ensureStopped.this.IconCompatParcelizer(false);
            if (this.RemoteActionCompatParcelizer) {
                ensureStopped.this.RemoteActionCompatParcelizer(Long.MIN_VALUE);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, float f, int i, boolean z, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.read = exoPlayerImplExternalSyntheticLambda19;
            this.IconCompatParcelizer = f;
            this.write = i;
            this.RemoteActionCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ensureStopped.this.new read(this.read, this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.enableRenderer
    public final Object IconCompatParcelizer(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, float f, int i, boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer$default = setFirstHorizontalStyle.IconCompatParcelizer$default(this.AudioAttributesImplBaseParcelizer, null, new read(exoPlayerImplExternalSyntheticLambda19, f, 1, z, null), sampleVideos, 1, null);
        return objIconCompatParcelizer$default == getYear.IconCompatParcelizer() ? objIconCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ handleMediaSourceListInfoRefreshed AudioAttributesCompatParcelizer;
        private /* synthetic */ int AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ int AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ boolean AudioAttributesImplBaseParcelizer;
        private /* synthetic */ boolean IconCompatParcelizer;
        private /* synthetic */ float MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ boolean MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda19 RemoteActionCompatParcelizer;
        private /* synthetic */ float read;
        private /* synthetic */ handleLoadingMediaPeriodChanged write;

        /* JADX INFO: renamed from: o.ensureStopped$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        public final /* synthetic */ class C0068IconCompatParcelizer {
            public static final /* synthetic */ int[] IconCompatParcelizer;

            static {
                int[] iArr = new int[handleLoadingMediaPeriodChanged.values().length];
                try {
                    iArr[handleLoadingMediaPeriodChanged.write.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[handleLoadingMediaPeriodChanged.IconCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                IconCompatParcelizer = iArr;
            }
        }

        /* JADX WARN: Finally extract failed */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            setRefreshToken setrefreshtoken;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatMediaItem;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    ensureStopped.this.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
                    ensureStopped.this.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
                    ensureStopped.this.read(this.MediaBrowserCompatItemReceiver);
                    ensureStopped.this.read(this.MediaBrowserCompatCustomActionResultReceiver);
                    ensureStopped.this.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
                    ensureStopped.this.read(this.RemoteActionCompatParcelizer);
                    ensureStopped.this.AudioAttributesCompatParcelizer(this.read);
                    ensureStopped.this.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
                    if (!this.IconCompatParcelizer) {
                        ensureStopped.this.RemoteActionCompatParcelizer(Long.MIN_VALUE);
                    }
                    if (this.RemoteActionCompatParcelizer == null) {
                        ensureStopped.this.IconCompatParcelizer(false);
                        return getShowPopup.INSTANCE;
                    }
                    if (!Float.isInfinite(this.MediaBrowserCompatCustomActionResultReceiver)) {
                        ensureStopped.this.IconCompatParcelizer(true);
                        int i2 = C0068IconCompatParcelizer.IconCompatParcelizer[this.write.ordinal()];
                        if (i2 == 1) {
                            setrefreshtoken = setRefreshToken.write;
                        } else {
                            if (i2 != 2) {
                                throw new RenewEligibleCreator();
                            }
                            setrefreshtoken = VideoSessionResponseBody.RemoteActionCompatParcelizer;
                        }
                        setPassingYear setpassingyearRemoteActionCompatParcelizer = getUserConfig.RemoteActionCompatParcelizer(getWrite());
                        this.MediaBrowserCompatMediaItem = 1;
                        if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setrefreshtoken, new AnonymousClass3(this.write, setpassingyearRemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, ensureStopped.this, null), this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        ensureStopped ensurestopped = ensureStopped.this;
                        ensurestopped.AudioAttributesCompatParcelizer(ensurestopped.MediaBrowserCompatItemReceiver());
                        ensureStopped.this.IconCompatParcelizer(false);
                        ensureStopped.this.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
                        return getShowPopup.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                getUserConfig.read(getWrite());
                ensureStopped.this.IconCompatParcelizer(false);
                return getShowPopup.INSTANCE;
            } catch (Throwable th) {
                ensureStopped.this.IconCompatParcelizer(false);
                throw th;
            }
        }

        /* JADX INFO: renamed from: o.ensureStopped$IconCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ setPassingYear AudioAttributesCompatParcelizer;
            private /* synthetic */ handleLoadingMediaPeriodChanged IconCompatParcelizer;
            private /* synthetic */ ensureStopped MediaBrowserCompatItemReceiver;
            private /* synthetic */ int RemoteActionCompatParcelizer;
            private int read;
            private /* synthetic */ int write;

            /* JADX INFO: renamed from: o.ensureStopped$IconCompatParcelizer$3$RemoteActionCompatParcelizer */
            public final /* synthetic */ class RemoteActionCompatParcelizer {
                public static final /* synthetic */ int[] read;

                static {
                    int[] iArr = new int[handleLoadingMediaPeriodChanged.values().length];
                    try {
                        iArr[handleLoadingMediaPeriodChanged.write.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    read = iArr;
                }
            }

            /* JADX WARN: Path cross not found for [B:11:0x0026, B:14:0x0031], limit reached: 22 */
            /* JADX WARN: Path cross not found for [B:14:0x0031, B:11:0x0026], limit reached: 22 */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r4.read
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                    goto L41
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L17:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                L1a:
                    o.handleLoadingMediaPeriodChanged r5 = r4.IconCompatParcelizer
                    int[] r1 = o.ensureStopped.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer.read
                    int r5 = r5.ordinal()
                    r5 = r1[r5]
                    if (r5 != r2) goto L31
                    o.setPassingYear r5 = r4.AudioAttributesCompatParcelizer
                    boolean r5 = r5.read()
                    if (r5 != 0) goto L31
                    int r5 = r4.write
                    goto L33
                L31:
                    int r5 = r4.RemoteActionCompatParcelizer
                L33:
                    o.ensureStopped r1 = r4.MediaBrowserCompatItemReceiver
                    r3 = r4
                    o.SampleVideos r3 = (kotlin.SampleVideos) r3
                    r4.read = r2
                    java.lang.Object r5 = kotlin.ensureStopped.AudioAttributesCompatParcelizer(r1, r5, r3)
                    if (r5 != r0) goto L41
                    return r0
                L41:
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    if (r5 != 0) goto L1a
                    o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ensureStopped.IconCompatParcelizer.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(handleLoadingMediaPeriodChanged handleloadingmediaperiodchanged, setPassingYear setpassingyear, int i, int i2, ensureStopped ensurestopped, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = handleloadingmediaperiodchanged;
                this.AudioAttributesCompatParcelizer = setpassingyear;
                this.RemoteActionCompatParcelizer = i;
                this.write = i2;
                this.MediaBrowserCompatItemReceiver = ensurestopped;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompatItemReceiver, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(int i, int i2, boolean z, float f, handleMediaSourceListInfoRefreshed handlemediasourcelistinforefreshed, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, float f2, boolean z2, boolean z3, handleLoadingMediaPeriodChanged handleloadingmediaperiodchanged, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesImplApi21Parcelizer = i;
            this.AudioAttributesImplApi26Parcelizer = i2;
            this.MediaBrowserCompatItemReceiver = z;
            this.MediaBrowserCompatCustomActionResultReceiver = f;
            this.AudioAttributesCompatParcelizer = handlemediasourcelistinforefreshed;
            this.RemoteActionCompatParcelizer = exoPlayerImplExternalSyntheticLambda19;
            this.read = f2;
            this.AudioAttributesImplBaseParcelizer = z2;
            this.IconCompatParcelizer = z3;
            this.write = handleloadingmediaperiodchanged;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ensureStopped.this.new IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.enableRenderer
    public final Object IconCompatParcelizer(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, int i, int i2, boolean z, float f, handleMediaSourceListInfoRefreshed handlemediasourcelistinforefreshed, float f2, boolean z2, handleLoadingMediaPeriodChanged handleloadingmediaperiodchanged, boolean z3, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer$default = setFirstHorizontalStyle.IconCompatParcelizer$default(this.AudioAttributesImplBaseParcelizer, null, new IconCompatParcelizer(i, i2, z, f, handlemediasourcelistinforefreshed, exoPlayerImplExternalSyntheticLambda19, f2, z3, false, handleloadingmediaperiodchanged, null), sampleVideos, 1, null);
        return objIconCompatParcelizer$default == getYear.IconCompatParcelizer() ? objIconCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ensureStopped$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "RemoteActionCompatParcelizer", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Long, Boolean> {
        private /* synthetic */ int $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(Long l) {
            return RemoteActionCompatParcelizer(l.longValue());
        }

        public final Boolean RemoteActionCompatParcelizer(long j) {
            return Boolean.valueOf(ensureStopped.this.IconCompatParcelizer(this.$read, j));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i) {
            super(1);
            this.$read = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object AudioAttributesCompatParcelizer(int i, SampleVideos<? super Boolean> sampleVideos) {
        if (i == Integer.MAX_VALUE) {
            return setSwitchTypeface.write(new AnonymousClass2(i), sampleVideos);
        }
        return TokenFilterInclusion.AudioAttributesCompatParcelizer(new AnonymousClass3(i), sampleVideos);
    }

    /* JADX INFO: renamed from: o.ensureStopped$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "RemoteActionCompatParcelizer", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<Long, Boolean> {
        private /* synthetic */ int $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(Long l) {
            return RemoteActionCompatParcelizer(l.longValue());
        }

        public final Boolean RemoteActionCompatParcelizer(long j) {
            return Boolean.valueOf(ensureStopped.this.IconCompatParcelizer(this.$write, j));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i) {
            super(1);
            this.$write = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean IconCompatParcelizer(int i, long j) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19Write = write();
        if (exoPlayerImplExternalSyntheticLambda19Write == null) {
            return true;
        }
        long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem() == Long.MIN_VALUE ? 0L : j - MediaBrowserCompatMediaItem();
        RemoteActionCompatParcelizer(j);
        handleMediaSourceListInfoRefreshed handlemediasourcelistinforefreshedRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        float fIconCompatParcelizer = handlemediasourcelistinforefreshedRemoteActionCompatParcelizer != null ? handlemediasourcelistinforefreshedRemoteActionCompatParcelizer.IconCompatParcelizer() : 0.0f;
        handleMediaSourceListInfoRefreshed handlemediasourcelistinforefreshedRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        float f = handlemediasourcelistinforefreshedRemoteActionCompatParcelizer2 != null ? handlemediasourcelistinforefreshedRemoteActionCompatParcelizer2.read() : 1.0f;
        float fAudioAttributesCompatParcelizer = ((jMediaBrowserCompatMediaItem / 1000000) / exoPlayerImplExternalSyntheticLambda19Write.AudioAttributesCompatParcelizer()) * AudioAttributesImplApi21Parcelizer();
        float fMediaDescriptionCompat = AudioAttributesImplApi21Parcelizer() < BitmapDescriptorFactory.HUE_RED ? fIconCompatParcelizer - (MediaDescriptionCompat() + fAudioAttributesCompatParcelizer) : (MediaDescriptionCompat() + fAudioAttributesCompatParcelizer) - f;
        if (fIconCompatParcelizer == f) {
            AudioAttributesCompatParcelizer(fIconCompatParcelizer);
            return false;
        }
        if (fMediaDescriptionCompat < BitmapDescriptorFactory.HUE_RED) {
            AudioAttributesCompatParcelizer(getQues.read(MediaDescriptionCompat(), fIconCompatParcelizer, f) + fAudioAttributesCompatParcelizer);
        } else {
            float f2 = f - fIconCompatParcelizer;
            int i2 = (int) (fMediaDescriptionCompat / f2);
            int i3 = i2 + 1;
            if (IconCompatParcelizer() + i3 > i) {
                AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver());
                AudioAttributesCompatParcelizer(i);
                return false;
            }
            AudioAttributesCompatParcelizer(IconCompatParcelizer() + i3);
            float f3 = fMediaDescriptionCompat - (i2 * f2);
            AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer() < BitmapDescriptorFactory.HUE_RED ? f - f3 : fIconCompatParcelizer + f3);
        }
        return true;
    }

    private static float write(float f, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        return exoPlayerImplExternalSyntheticLambda19 == null ? f : f - (f % (1.0f / exoPlayerImplExternalSyntheticLambda19.MediaBrowserCompatCustomActionResultReceiver()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(float f) {
        IconCompatParcelizer(f);
        if (MediaMetadataCompat()) {
            f = write(f, write());
        }
        write(f);
    }
}
