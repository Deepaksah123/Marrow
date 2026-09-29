package kotlin;

import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bc\u0012.\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018R<\u0010\u0015\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/getGeolocation;", "T", "R", "Lo/getEncryptedPlaybackVersion;", "Lkotlin/Function3;", "Lo/getValidationToken;", "Lo/SampleVideos;", "", "", "p0", "Lo/NewNumberOtpResendRequest;", "p1", "Lo/CurrentQuery;", "p2", "", "p3", "Lo/setAddressLine2;", "p4", "<init>", "(Lo/getModuleData;Lo/NewNumberOtpResendRequest;Lo/CurrentQuery;ILo/setAddressLine2;)V", "Lo/getDidReBuffer;", "AudioAttributesCompatParcelizer", "(Lo/CurrentQuery;ILo/setAddressLine2;)Lo/getDidReBuffer;", "IconCompatParcelizer", "(Lo/getValidationToken;Lo/SampleVideos;)Ljava/lang/Object;", "write", "Lo/getModuleData;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getGeolocation<T, R> extends getEncryptedPlaybackVersion<T, R> {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getModuleData<getValidationToken<? super R>, T, SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer;

    public /* synthetic */ getGeolocation(getModuleData getmoduledata, NewNumberOtpResendRequest newNumberOtpResendRequest, VideoSessionResponseBody videoSessionResponseBody, int i, setAddressLine2 setaddressline2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getmoduledata, newNumberOtpResendRequest, (i2 & 4) != 0 ? VideoSessionResponseBody.RemoteActionCompatParcelizer : videoSessionResponseBody, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? setAddressLine2.read : setaddressline2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private getGeolocation(getModuleData<? super getValidationToken<? super R>, ? super T, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        super(newNumberOtpResendRequest, currentQuery, i, setaddressline2);
        this.AudioAttributesCompatParcelizer = getmoduledata;
    }

    @Override // kotlin.getDidReBuffer
    protected final getDidReBuffer<R> AudioAttributesCompatParcelizer(CurrentQuery p0, int p1, setAddressLine2 p2) {
        return new getGeolocation(this.AudioAttributesCompatParcelizer, this.read, p0, p1, p2);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        private /* synthetic */ getValidationToken<R> IconCompatParcelizer;
        private /* synthetic */ getGeolocation<T, R> RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.AudioAttributesCompatParcelizer;
                MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
                NewNumberOtpResendRequest<S> newNumberOtpResendRequest = this.RemoteActionCompatParcelizer.read;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(writeVar, topUserCompanion, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
                this.write = 1;
                if (newNumberOtpResendRequest.write(anonymousClass1, this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: o.getGeolocation$IconCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ TopUserCompanion AudioAttributesCompatParcelizer;
            private /* synthetic */ getValidationToken<R> IconCompatParcelizer;
            private /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<setPassingYear> read;
            private /* synthetic */ getGeolocation<T, R> write;

            /* JADX INFO: renamed from: o.getGeolocation$IconCompatParcelizer$1$write */
            static final class write extends getTotalMcq {
                Object AudioAttributesCompatParcelizer;
                private /* synthetic */ AnonymousClass1<T> AudioAttributesImplApi21Parcelizer;
                /* synthetic */ Object IconCompatParcelizer;
                Object RemoteActionCompatParcelizer;
                Object read;
                int write;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                write(AnonymousClass1<? super T> anonymousClass1, SampleVideos<? super write> sampleVideos) {
                    super(sampleVideos);
                    this.AudioAttributesImplApi21Parcelizer = anonymousClass1;
                }

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    this.IconCompatParcelizer = obj;
                    this.write |= Integer.MIN_VALUE;
                    return this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(null, this);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            @Override // kotlin.getValidationToken
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object IconCompatParcelizer(T r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o.getGeolocation.IconCompatParcelizer.AnonymousClass1.write
                    if (r0 == 0) goto L14
                    r0 = r8
                    o.getGeolocation$IconCompatParcelizer$1$write r0 = (o.getGeolocation.IconCompatParcelizer.AnonymousClass1.write) r0
                    int r1 = r0.write
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r8 = r0.write
                    int r8 = r8 + r2
                    r0.write = r8
                    goto L19
                L14:
                    o.getGeolocation$IconCompatParcelizer$1$write r0 = new o.getGeolocation$IconCompatParcelizer$1$write
                    r0.<init>(r6, r8)
                L19:
                    java.lang.Object r8 = r0.IconCompatParcelizer
                    java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                    int r2 = r0.write
                    r3 = 1
                    if (r2 == 0) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r6 = r0.RemoteActionCompatParcelizer
                    o.setPassingYear r6 = (kotlin.setPassingYear) r6
                    java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
                    java.lang.Object r6 = r0.read
                    o.getGeolocation$IconCompatParcelizer$1 r6 = (o.getGeolocation.IconCompatParcelizer.AnonymousClass1) r6
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    goto L60
                L34:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L3c:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    o.MagicModuleUseCaseImplWhenMappings$write<o.setPassingYear> r8 = r6.read
                    T r8 = r8.write
                    o.setPassingYear r8 = (kotlin.setPassingYear) r8
                    if (r8 == 0) goto L60
                    o.getPauseTouchCount r2 = new o.getPauseTouchCount
                    r2.<init>()
                    java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
                    r8.RemoteActionCompatParcelizer(r2)
                    r0.read = r6
                    r0.AudioAttributesCompatParcelizer = r7
                    r0.RemoteActionCompatParcelizer = r8
                    r0.write = r3
                    java.lang.Object r8 = r8.a_(r0)
                    if (r8 != r1) goto L60
                    return r1
                L60:
                    o.MagicModuleUseCaseImplWhenMappings$write<o.setPassingYear> r8 = r6.read
                    o.TopUserCompanion r0 = r6.AudioAttributesCompatParcelizer
                    o.getCollegeName r1 = kotlin.getCollegeName.AudioAttributesCompatParcelizer
                    o.getGeolocation$IconCompatParcelizer$1$1 r2 = new o.getGeolocation$IconCompatParcelizer$1$1
                    o.getGeolocation<T, R> r4 = r6.write
                    o.getValidationToken<R> r6 = r6.IconCompatParcelizer
                    r5 = 0
                    r2.<init>(r4, r6, r7, r5)
                    o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2
                    o.setPassingYear r6 = kotlin.setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(r0, r5, r1, r2, r3)
                    r8.write = r6
                    o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getGeolocation.IconCompatParcelizer.AnonymousClass1.IconCompatParcelizer(java.lang.Object, o.SampleVideos):java.lang.Object");
            }

            /* JADX INFO: renamed from: o.getGeolocation$IconCompatParcelizer$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00951 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ getGeolocation<T, R> IconCompatParcelizer;
                private /* synthetic */ getValidationToken<R> RemoteActionCompatParcelizer;
                private /* synthetic */ T read;
                private int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.write;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        getModuleData getmoduledata = ((getGeolocation) this.IconCompatParcelizer).AudioAttributesCompatParcelizer;
                        getValidationToken<R> getvalidationtoken = this.RemoteActionCompatParcelizer;
                        T t = this.read;
                        this.write = 1;
                        if (getmoduledata.AudioAttributesCompatParcelizer(getvalidationtoken, t, this) == objIconCompatParcelizer) {
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
                C00951(getGeolocation<T, R> getgeolocation, getValidationToken<? super R> getvalidationtoken, T t, SampleVideos<? super C00951> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = getgeolocation;
                    this.RemoteActionCompatParcelizer = getvalidationtoken;
                    this.read = t;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new C00951(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((C00951) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(MagicModuleUseCaseImplWhenMappings.write<setPassingYear> writeVar, TopUserCompanion topUserCompanion, getGeolocation<T, R> getgeolocation, getValidationToken<? super R> getvalidationtoken) {
                this.read = writeVar;
                this.AudioAttributesCompatParcelizer = topUserCompanion;
                this.write = getgeolocation;
                this.IconCompatParcelizer = getvalidationtoken;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getGeolocation<T, R> getgeolocation, getValidationToken<? super R> getvalidationtoken, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = getgeolocation;
            this.IconCompatParcelizer = getvalidationtoken;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
            iconCompatParcelizer.AudioAttributesCompatParcelizer = obj;
            return iconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getEncryptedPlaybackVersion
    protected final Object IconCompatParcelizer(getValidationToken<? super R> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
        getCollegeId.write();
        Object objIconCompatParcelizer = College.IconCompatParcelizer(new IconCompatParcelizer(this, getvalidationtoken, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }
}
