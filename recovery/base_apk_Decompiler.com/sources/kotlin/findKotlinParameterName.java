package kotlin;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinKeySerializersKt;
import kotlin.KotlinModuleCompanion;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u001d\u0013!B^\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u000f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0012JI\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u0017*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u00178\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0016\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R9\u0010\u001d\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0083\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010%\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/findKotlinParameterName;", "", "Key", "Value", "Lkotlin/Function1;", "Lo/SampleVideos;", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;", "p0", "p1", "Lo/accessfilterOutSingleStringCallables;", "p2", "Lo/isKotlinConstructorWithParameters;", "p3", "<init>", "(Lo/getAnswerMap;Ljava/lang/Object;Lo/accessfilterOutSingleStringCallables;Lo/isKotlinConstructorWithParameters;)V", "IconCompatParcelizer", "(Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;Lo/SampleVideos;)Ljava/lang/Object;", "", "()V", "RemoteActionCompatParcelizer", "Lo/accesshasCreatorAnnotation;", "Lo/setPassingYear;", "Lo/isPossibleSingleString;", "Lo/NewNumberOtpResendRequest;", "Lo/KotlinModuleCompanion;", "(Lo/accesshasCreatorAnnotation;Lo/setPassingYear;Lo/isPossibleSingleString;)Lo/NewNumberOtpResendRequest;", "write", "Lo/accessfilterOutSingleStringCallables;", "Lo/accessisKotlinConstructorWithParameters;", "read", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Lo/getAnswerMap;", "Lo/KotlinBeanDeserializerModifierKt;", "", "Lo/KotlinBeanDeserializerModifierKt;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class findKotlinParameterName<Key, Value> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<SampleVideos<? super KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>>, Object> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Key RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final KotlinBeanDeserializerModifierKt<getShowPopup> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final KotlinBeanDeserializerModifierKt<Boolean> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<accessisKotlinConstructorWithParameters<Value>> IconCompatParcelizer;
    private final accessfilterOutSingleStringCallables write;

    static final class IconCompatParcelizer extends getTotalMcq {
        final /* synthetic */ findKotlinParameterName<Key, Value> AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(findKotlinParameterName<Key, Value> findkotlinparametername, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
            this.AudioAttributesCompatParcelizer = findkotlinparametername;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public findKotlinParameterName(getAnswerMap<? super SampleVideos<? super KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>>, ? extends Object> getanswermap, Key key, accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables, isKotlinConstructorWithParameters<Key, Value> iskotlinconstructorwithparameters) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(accessfilteroutsinglestringcallables, "");
        this.read = getanswermap;
        this.RemoteActionCompatParcelizer = key;
        this.write = accessfilteroutsinglestringcallables;
        this.AudioAttributesCompatParcelizer = new KotlinBeanDeserializerModifierKt<>(null, 1, null);
        this.AudioAttributesImplApi26Parcelizer = new KotlinBeanDeserializerModifierKt<>(null, 1, null);
        this.IconCompatParcelizer = isPrimaryConstructor.write(new write(null, this, null));
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<KotlinObjectSingletonDeserializerKt<accessisKotlinConstructorWithParameters<Value>>, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object IconCompatParcelizer;
        final /* synthetic */ isKotlinConstructorWithParameters<Key, Value> RemoteActionCompatParcelizer;
        private int read;
        final /* synthetic */ findKotlinParameterName<Key, Value> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                KotlinObjectSingletonDeserializerKt kotlinObjectSingletonDeserializerKt = (KotlinObjectSingletonDeserializerKt) this.IconCompatParcelizer;
                isKotlinConstructorWithParameters<Key, Value> iskotlinconstructorwithparameters = this.RemoteActionCompatParcelizer;
                isPossibleSingleString ispossiblesinglestringIconCompatParcelizer = iskotlinconstructorwithparameters != null ? KotlinSerializers.IconCompatParcelizer(kotlinObjectSingletonDeserializerKt, iskotlinconstructorwithparameters) : null;
                this.read = 1;
                if (accessobjectSingletonInstance.read(VerifyNewNumberRequest.RemoteActionCompatParcelizer(accessobjectSingletonInstance.IconCompatParcelizer(VerifyNewNumberRequest.read(((findKotlinParameterName) this.write).AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), new AnonymousClass4(ispossiblesinglestringIconCompatParcelizer, null)), new AnonymousClass3(ispossiblesinglestringIconCompatParcelizer, this.write, null))), new read(null, this.write, ispossiblesinglestringIconCompatParcelizer)).write(new AnonymousClass5(kotlinObjectSingletonDeserializerKt), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: o.findKotlinParameterName$write$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getValidationToken<? super Boolean>, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ isPossibleSingleString<Key, Value> RemoteActionCompatParcelizer;
            private /* synthetic */ Object read;
            private int write;

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
            
                if (r7 != r0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
            
                if (r1.IconCompatParcelizer(kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4), r6) != r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
            
                return r0;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r6.write
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                    goto L57
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1b:
                    java.lang.Object r1 = r6.read
                    o.getValidationToken r1 = (kotlin.getValidationToken) r1
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                    goto L3c
                L23:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                    java.lang.Object r7 = r6.read
                    r1 = r7
                    o.getValidationToken r1 = (kotlin.getValidationToken) r1
                    o.isPossibleSingleString<Key, Value> r7 = r6.RemoteActionCompatParcelizer
                    if (r7 == 0) goto L3f
                    r5 = r6
                    o.SampleVideos r5 = (kotlin.SampleVideos) r5
                    r6.read = r1
                    r6.write = r4
                    java.lang.Object r7 = r7.AudioAttributesCompatParcelizer(r5)
                    if (r7 == r0) goto L56
                L3c:
                    o.isKotlinConstructorWithParameters$IconCompatParcelizer r7 = (o.isKotlinConstructorWithParameters.IconCompatParcelizer) r7
                    goto L40
                L3f:
                    r7 = r3
                L40:
                    o.isKotlinConstructorWithParameters$IconCompatParcelizer r5 = o.isKotlinConstructorWithParameters.IconCompatParcelizer.LAUNCH_INITIAL_REFRESH
                    if (r7 == r5) goto L45
                    r4 = 0
                L45:
                    java.lang.Boolean r7 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
                    r4 = r6
                    o.SampleVideos r4 = (kotlin.SampleVideos) r4
                    r6.read = r3
                    r6.write = r2
                    java.lang.Object r6 = r1.IconCompatParcelizer(r7, r4)
                    if (r6 != r0) goto L57
                L56:
                    return r0
                L57:
                    o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.findKotlinParameterName.write.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(isPossibleSingleString<Key, Value> ispossiblesinglestring, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = ispossiblesinglestring;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.RemoteActionCompatParcelizer, sampleVideos);
                anonymousClass4.read = obj;
                return anonymousClass4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(getValidationToken<? super Boolean> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(getvalidationtoken, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: o.findKotlinParameterName$write$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements getModuleData<read<Key, Value>, Boolean, SampleVideos<? super read<Key, Value>>, Object> {
            final /* synthetic */ findKotlinParameterName<Key, Value> AudioAttributesCompatParcelizer;
            private int AudioAttributesImplApi21Parcelizer;
            private /* synthetic */ boolean IconCompatParcelizer;
            final /* synthetic */ isPossibleSingleString<Key, Value> RemoteActionCompatParcelizer;
            private Object read;
            private /* synthetic */ Object write;

            /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0092 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 328
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.findKotlinParameterName.write.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: o.findKotlinParameterName$write$3$4, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            final /* synthetic */ class AnonymousClass4 extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
                public final void AudioAttributesCompatParcelizer() {
                    ((findKotlinParameterName) this.AudioAttributesImplApi26Parcelizer).RemoteActionCompatParcelizer();
                }

                @Override // kotlin.getCreatedOnDateMs
                public final /* synthetic */ getShowPopup invoke() {
                    AudioAttributesCompatParcelizer();
                    return getShowPopup.INSTANCE;
                }

                AnonymousClass4(Object obj) {
                    super(0, obj, findKotlinParameterName.class, "RemoteActionCompatParcelizer", "RemoteActionCompatParcelizer()V", 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(isPossibleSingleString<Key, Value> ispossiblesinglestring, findKotlinParameterName<Key, Value> findkotlinparametername, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(3, sampleVideos);
                this.RemoteActionCompatParcelizer = ispossiblesinglestring;
                this.AudioAttributesCompatParcelizer = findkotlinparametername;
            }

            private Object AudioAttributesCompatParcelizer(read<Key, Value> readVar, boolean z, SampleVideos<? super read<Key, Value>> sampleVideos) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
                anonymousClass3.write = readVar;
                anonymousClass3.IconCompatParcelizer = z;
                return anonymousClass3.invokeSuspend(getShowPopup.INSTANCE);
            }

            @Override // kotlin.getModuleData
            public final /* bridge */ /* synthetic */ Object AudioAttributesCompatParcelizer(Object obj, Boolean bool, Object obj2) {
                return AudioAttributesCompatParcelizer((read) obj, bool.booleanValue(), (SampleVideos) obj2);
            }
        }

        public static final class read extends getMagicModuleStats implements getModuleData<getValidationToken<? super accessisKotlinConstructorWithParameters<Value>>, read<Key, Value>, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ Object AudioAttributesCompatParcelizer;
            final /* synthetic */ isPossibleSingleString IconCompatParcelizer;
            private /* synthetic */ Object RemoteActionCompatParcelizer;
            private int read;
            final /* synthetic */ findKotlinParameterName write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    getValidationToken getvalidationtoken = (getValidationToken) this.AudioAttributesCompatParcelizer;
                    read readVar = (read) this.RemoteActionCompatParcelizer;
                    NewNumberOtpResendRequest newNumberOtpResendRequestIconCompatParcelizer = VerifyNewNumberRequest.IconCompatParcelizer(findKotlinParameterName.IconCompatParcelizer(readVar.RemoteActionCompatParcelizer(), readVar.IconCompatParcelizer(), this.IconCompatParcelizer), (MagicModuleSubmissionRequestBody) new C0089write(null));
                    findKotlinParameterName findkotlinparametername = this.write;
                    accessisKotlinConstructorWithParameters accessiskotlinconstructorwithparameters = new accessisKotlinConstructorWithParameters(newNumberOtpResendRequestIconCompatParcelizer, new AudioAttributesCompatParcelizer(findkotlinparametername, findkotlinparametername.AudioAttributesImplApi26Parcelizer), new RemoteActionCompatParcelizer(this.write, readVar.RemoteActionCompatParcelizer()), null, 8, null);
                    this.read = 1;
                    if (getvalidationtoken.IconCompatParcelizer(accessiskotlinconstructorwithparameters, this) == objIconCompatParcelizer) {
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
            public read(SampleVideos sampleVideos, findKotlinParameterName findkotlinparametername, isPossibleSingleString ispossiblesinglestring) {
                super(3, sampleVideos);
                this.write = findkotlinparametername;
                this.IconCompatParcelizer = ispossiblesinglestring;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getModuleData
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object AudioAttributesCompatParcelizer(getValidationToken<? super accessisKotlinConstructorWithParameters<Value>> getvalidationtoken, read<Key, Value> readVar, SampleVideos<? super getShowPopup> sampleVideos) {
                read readVar2 = new read(sampleVideos, this.write, this.IconCompatParcelizer);
                readVar2.AudioAttributesCompatParcelizer = getvalidationtoken;
                readVar2.RemoteActionCompatParcelizer = readVar;
                return readVar2.invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: o.findKotlinParameterName$write$write, reason: collision with other inner class name */
        static final class C0089write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<KotlinModuleCompanion<Value>, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ Object RemoteActionCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                KotlinModuleCompanion kotlinModuleCompanion = (KotlinModuleCompanion) this.RemoteActionCompatParcelizer;
                KotlinModule kotlinModuleWrite = getStaticJsonKeyGetter.write();
                if (kotlinModuleWrite != null && kotlinModuleWrite.write(2)) {
                    kotlinModuleWrite.write(2, "Sent ".concat(String.valueOf(kotlinModuleCompanion)));
                }
                return getShowPopup.INSTANCE;
            }

            C0089write(SampleVideos<? super C0089write> sampleVideos) {
                super(2, sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                C0089write c0089write = new C0089write(sampleVideos);
                c0089write.RemoteActionCompatParcelizer = obj;
                return c0089write;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(KotlinModuleCompanion<Value> kotlinModuleCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((C0089write) create(kotlinModuleCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: o.findKotlinParameterName$write$5, reason: invalid class name */
        final /* synthetic */ class AnonymousClass5 implements getValidationToken, MagicModuleRepositoryImplExternalSyntheticLambda3 {
            final /* synthetic */ KotlinObjectSingletonDeserializerKt<accessisKotlinConstructorWithParameters<Value>> read;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getValidationToken
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object IconCompatParcelizer(accessisKotlinConstructorWithParameters<Value> accessiskotlinconstructorwithparameters, SampleVideos<? super getShowPopup> sampleVideos) {
                Object objRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(accessiskotlinconstructorwithparameters, sampleVideos);
                return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
            }

            AnonymousClass5(KotlinObjectSingletonDeserializerKt<accessisKotlinConstructorWithParameters<Value>> kotlinObjectSingletonDeserializerKt) {
                this.read = kotlinObjectSingletonDeserializerKt;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof getValidationToken) && (obj instanceof MagicModuleRepositoryImplExternalSyntheticLambda3)) {
                    return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(read(), ((MagicModuleRepositoryImplExternalSyntheticLambda3) obj).read());
                }
                return false;
            }

            @Override // kotlin.MagicModuleRepositoryImplExternalSyntheticLambda3
            public final setRenewGrpId<?> read() {
                return new MagicModuleRepositoryImpl_Factory(2, this.read, KotlinObjectSingletonDeserializerKt.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return read().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(isKotlinConstructorWithParameters<Key, Value> iskotlinconstructorwithparameters, findKotlinParameterName<Key, Value> findkotlinparametername, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = iskotlinconstructorwithparameters;
            this.write = findkotlinparametername;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
            writeVar.IconCompatParcelizer = obj;
            return writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(KotlinObjectSingletonDeserializerKt<accessisKotlinConstructorWithParameters<Value>> kotlinObjectSingletonDeserializerKt, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(kotlinObjectSingletonDeserializerKt, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final NewNumberOtpResendRequest<accessisKotlinConstructorWithParameters<Value>> write() {
        return this.IconCompatParcelizer;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>>, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ isPossibleSingleString<Key, Value> AudioAttributesCompatParcelizer;
        final /* synthetic */ accesshasCreatorAnnotation<Key, Value> IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        final /* synthetic */ setupModuleaddMixIn read;
        private int write;

        public static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>>, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ NewNumberOtpResendRequest AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            final /* synthetic */ NewNumberOtpResendRequest RemoteActionCompatParcelizer;
            private /* synthetic */ Object read;
            final /* synthetic */ setupModuleaddMixIn write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                int i2 = 1;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    KotlinObjectSingletonDeserializerKt kotlinObjectSingletonDeserializerKt = (KotlinObjectSingletonDeserializerKt) this.read;
                    AtomicInteger atomicInteger = new AtomicInteger(2);
                    KotlinValueInstantiator kotlinValueInstantiator = new KotlinValueInstantiator(new AnonymousClass2(kotlinObjectSingletonDeserializerKt, null, this.write));
                    isMockTest ismocktestRemoteActionCompatParcelizer = getUserConfig.RemoteActionCompatParcelizer((setPassingYear) null);
                    NewNumberOtpResendRequest[] newNumberOtpResendRequestArr = {this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer};
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < 2) {
                        C0201setMcqCount.IconCompatParcelizer(kotlinObjectSingletonDeserializerKt, ismocktestRemoteActionCompatParcelizer, null, new AnonymousClass3(newNumberOtpResendRequestArr[i3], atomicInteger, kotlinObjectSingletonDeserializerKt, kotlinValueInstantiator, i4, null), 2);
                        i3++;
                        i2 = 1;
                        i4++;
                        newNumberOtpResendRequestArr = newNumberOtpResendRequestArr;
                    }
                    this.IconCompatParcelizer = i2;
                    if (kotlinObjectSingletonDeserializerKt.read(new AnonymousClass4(ismocktestRemoteActionCompatParcelizer), this) == objIconCompatParcelizer) {
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

            /* JADX INFO: renamed from: o.findKotlinParameterName$AudioAttributesImplBaseParcelizer$write$2, reason: invalid class name */
            public static final class AnonymousClass2 extends getMagicModuleStats implements getMagicModuleStat<KotlinKeySerializers, KotlinModuleCompanion<Value>, requiredAnnotationOrNullability, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ Object AudioAttributesCompatParcelizer;
                private int AudioAttributesImplBaseParcelizer;
                final /* synthetic */ KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>> IconCompatParcelizer;
                private /* synthetic */ Object RemoteActionCompatParcelizer;
                final /* synthetic */ setupModuleaddMixIn read;
                private /* synthetic */ Object write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.AudioAttributesImplBaseParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        Object obj2 = this.AudioAttributesCompatParcelizer;
                        Object obj3 = this.RemoteActionCompatParcelizer;
                        requiredAnnotationOrNullability requiredannotationornullability = (requiredAnnotationOrNullability) this.write;
                        KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>> kotlinObjectSingletonDeserializerKt = this.IconCompatParcelizer;
                        AnonymousClass2 anonymousClass2 = this;
                        KotlinModuleCompanion.write writeVar = (KotlinModuleCompanion) obj3;
                        KotlinKeySerializers kotlinKeySerializers = (KotlinKeySerializers) obj2;
                        if (requiredannotationornullability == requiredAnnotationOrNullability.RECEIVER) {
                            writeVar = new KotlinModuleCompanion.write(this.read.write(), kotlinKeySerializers);
                        } else if (writeVar instanceof KotlinModuleCompanion.RemoteActionCompatParcelizer) {
                            KotlinModuleCompanion.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (KotlinModuleCompanion.RemoteActionCompatParcelizer) writeVar;
                            this.read.read(remoteActionCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver());
                            writeVar = KotlinModuleCompanion.RemoteActionCompatParcelizer.read(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.read, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer, remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer, remoteActionCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver(), kotlinKeySerializers);
                        } else if (writeVar instanceof KotlinModuleCompanion.AudioAttributesCompatParcelizer) {
                            setupModuleaddMixIn setupmoduleaddmixin = this.read;
                            accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetterAudioAttributesCompatParcelizer = ((KotlinModuleCompanion.AudioAttributesCompatParcelizer) writeVar).AudioAttributesCompatParcelizer();
                            KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
                            setupmoduleaddmixin.AudioAttributesCompatParcelizer(accessgetstaticjsonkeygetterAudioAttributesCompatParcelizer, KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write());
                        } else {
                            if (!(writeVar instanceof KotlinModuleCompanion.write)) {
                                if (writeVar instanceof KotlinModuleCompanion.read) {
                                    throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                                }
                                throw new RenewEligibleCreator();
                            }
                            KotlinModuleCompanion.write writeVar2 = (KotlinModuleCompanion.write) writeVar;
                            this.read.read(writeVar2.getAudioAttributesCompatParcelizer());
                            writeVar = new KotlinModuleCompanion.write(writeVar2.getAudioAttributesCompatParcelizer(), kotlinKeySerializers);
                        }
                        this.AudioAttributesImplBaseParcelizer = 1;
                        if (kotlinObjectSingletonDeserializerKt.RemoteActionCompatParcelizer(writeVar, anonymousClass2) == objIconCompatParcelizer) {
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
                public AnonymousClass2(KotlinObjectSingletonDeserializerKt kotlinObjectSingletonDeserializerKt, SampleVideos sampleVideos, setupModuleaddMixIn setupmoduleaddmixin) {
                    super(4, sampleVideos);
                    this.read = setupmoduleaddmixin;
                    this.IconCompatParcelizer = kotlinObjectSingletonDeserializerKt;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.getMagicModuleStat
                public Object write(KotlinKeySerializers kotlinKeySerializers, KotlinModuleCompanion<Value> kotlinModuleCompanion, requiredAnnotationOrNullability requiredannotationornullability, SampleVideos<? super getShowPopup> sampleVideos) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.IconCompatParcelizer, sampleVideos, this.read);
                    anonymousClass2.AudioAttributesCompatParcelizer = kotlinKeySerializers;
                    anonymousClass2.RemoteActionCompatParcelizer = kotlinModuleCompanion;
                    anonymousClass2.write = requiredannotationornullability;
                    return anonymousClass2.invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.findKotlinParameterName$AudioAttributesImplBaseParcelizer$write$3, reason: invalid class name */
            public static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ int AudioAttributesCompatParcelizer;
                private int AudioAttributesImplApi21Parcelizer;
                final /* synthetic */ KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>> IconCompatParcelizer;
                final /* synthetic */ NewNumberOtpResendRequest RemoteActionCompatParcelizer;
                final /* synthetic */ KotlinValueInstantiator read;
                final /* synthetic */ AtomicInteger write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    AtomicInteger atomicInteger;
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.AudioAttributesImplApi21Parcelizer;
                    try {
                        if (i == 0) {
                            SdkPayloadData.IconCompatParcelizer(obj);
                            this.AudioAttributesImplApi21Parcelizer = 1;
                            if (this.RemoteActionCompatParcelizer.write(new AnonymousClass5(this.read, this.AudioAttributesCompatParcelizer), this) == objIconCompatParcelizer) {
                                return objIconCompatParcelizer;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            SdkPayloadData.IconCompatParcelizer(obj);
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            this.IconCompatParcelizer.write((Throwable) null);
                        }
                        return getShowPopup.INSTANCE;
                    } finally {
                        if (this.write.decrementAndGet() == 0) {
                            this.IconCompatParcelizer.write((Throwable) null);
                        }
                    }
                }

                /* JADX INFO: renamed from: o.findKotlinParameterName$AudioAttributesImplBaseParcelizer$write$3$5, reason: invalid class name */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", "p0", "", "IconCompatParcelizer", "(Ljava/lang/Object;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class AnonymousClass5<T> implements getValidationToken {
                    final /* synthetic */ int $RemoteActionCompatParcelizer;
                    final /* synthetic */ KotlinValueInstantiator $read;

                    /* JADX INFO: renamed from: o.findKotlinParameterName$AudioAttributesImplBaseParcelizer$write$3$5$3, reason: invalid class name and collision with other inner class name */
                    static final class C00883 extends getTotalMcq {
                        /* synthetic */ Object AudioAttributesCompatParcelizer;
                        int IconCompatParcelizer;

                        C00883(SampleVideos sampleVideos) {
                            super(sampleVideos);
                        }

                        @Override // kotlin.getMonthName
                        public final Object invokeSuspend(Object obj) {
                            this.AudioAttributesCompatParcelizer = obj;
                            this.IconCompatParcelizer |= Integer.MIN_VALUE;
                            return AnonymousClass5.this.IconCompatParcelizer(null, this);
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
                    
                        if (kotlin.PhoneNumberJsonParser.IconCompatParcelizer(r0) == r1) goto L23;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                    @Override // kotlin.getValidationToken
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object IconCompatParcelizer(java.lang.Object r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof o.findKotlinParameterName.AudioAttributesImplBaseParcelizer.write.AnonymousClass3.AnonymousClass5.C00883
                            if (r0 == 0) goto L14
                            r0 = r7
                            o.findKotlinParameterName$AudioAttributesImplBaseParcelizer$write$3$5$3 r0 = (o.findKotlinParameterName.AudioAttributesImplBaseParcelizer.write.AnonymousClass3.AnonymousClass5.C00883) r0
                            int r1 = r0.IconCompatParcelizer
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r1 = r1 & r2
                            if (r1 == 0) goto L14
                            int r7 = r0.IconCompatParcelizer
                            int r7 = r7 + r2
                            r0.IconCompatParcelizer = r7
                            goto L19
                        L14:
                            o.findKotlinParameterName$AudioAttributesImplBaseParcelizer$write$3$5$3 r0 = new o.findKotlinParameterName$AudioAttributesImplBaseParcelizer$write$3$5$3
                            r0.<init>(r7)
                        L19:
                            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
                            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                            int r2 = r0.IconCompatParcelizer
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L39
                            if (r2 == r4) goto L35
                            if (r2 != r3) goto L2d
                            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                            goto L51
                        L2d:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L35:
                            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                            goto L48
                        L39:
                            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                            o.KotlinValueInstantiator r7 = r5.$read
                            int r5 = r5.$RemoteActionCompatParcelizer
                            r0.IconCompatParcelizer = r4
                            java.lang.Object r5 = r7.write(r5, r6, r0)
                            if (r5 == r1) goto L54
                        L48:
                            r0.IconCompatParcelizer = r3
                            java.lang.Object r5 = kotlin.PhoneNumberJsonParser.IconCompatParcelizer(r0)
                            if (r5 != r1) goto L51
                            goto L54
                        L51:
                            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                            return r5
                        L54:
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.findKotlinParameterName.AudioAttributesImplBaseParcelizer.write.AnonymousClass3.AnonymousClass5.IconCompatParcelizer(java.lang.Object, o.SampleVideos):java.lang.Object");
                    }

                    public AnonymousClass5(KotlinValueInstantiator kotlinValueInstantiator, int i) {
                        this.$read = kotlinValueInstantiator;
                        this.$RemoteActionCompatParcelizer = i;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(NewNumberOtpResendRequest newNumberOtpResendRequest, AtomicInteger atomicInteger, KotlinObjectSingletonDeserializerKt kotlinObjectSingletonDeserializerKt, KotlinValueInstantiator kotlinValueInstantiator, int i, SampleVideos sampleVideos) {
                    super(2, sampleVideos);
                    this.RemoteActionCompatParcelizer = newNumberOtpResendRequest;
                    this.write = atomicInteger;
                    this.read = kotlinValueInstantiator;
                    this.AudioAttributesCompatParcelizer = i;
                    this.IconCompatParcelizer = kotlinObjectSingletonDeserializerKt;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass3(this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.findKotlinParameterName$AudioAttributesImplBaseParcelizer$write$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T1", "T2", "R", "", "IconCompatParcelizer", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
                final /* synthetic */ isMockTest $read;

                public final void IconCompatParcelizer() {
                    this.$read.RemoteActionCompatParcelizer((CancellationException) null);
                }

                @Override // kotlin.getCreatedOnDateMs
                public final /* synthetic */ getShowPopup invoke() {
                    IconCompatParcelizer();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(isMockTest ismocktest) {
                    super(0);
                    this.$read = ismocktest;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public write(NewNumberOtpResendRequest newNumberOtpResendRequest, NewNumberOtpResendRequest newNumberOtpResendRequest2, SampleVideos sampleVideos, setupModuleaddMixIn setupmoduleaddmixin) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = newNumberOtpResendRequest;
                this.RemoteActionCompatParcelizer = newNumberOtpResendRequest2;
                this.write = setupmoduleaddmixin;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                write writeVar = new write(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos, this.write);
                writeVar.read = obj;
                return writeVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>> kotlinObjectSingletonDeserializerKt, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((write) create(kotlinObjectSingletonDeserializerKt, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final KotlinObjectSingletonDeserializerKt kotlinObjectSingletonDeserializerKt = (KotlinObjectSingletonDeserializerKt) this.RemoteActionCompatParcelizer;
                this.write = 1;
                if (isPrimaryConstructor.write(new write(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), this.IconCompatParcelizer.AudioAttributesCompatParcelizer(), null, this.read)).write(new getValidationToken() { // from class: o.findKotlinParameterName.AudioAttributesImplBaseParcelizer.4
                    @Override // kotlin.getValidationToken
                    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public final Object IconCompatParcelizer(KotlinModuleCompanion<Value> kotlinModuleCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                        Object objRemoteActionCompatParcelizer = kotlinObjectSingletonDeserializerKt.RemoteActionCompatParcelizer(kotlinModuleCompanion, sampleVideos);
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
        AudioAttributesImplBaseParcelizer(isPossibleSingleString<Key, Value> ispossiblesinglestring, accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, setupModuleaddMixIn setupmoduleaddmixin, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = ispossiblesinglestring;
            this.IconCompatParcelizer = accesshascreatorannotation;
            this.read = setupmoduleaddmixin;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.read, sampleVideos);
            audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer = obj;
            return audioAttributesImplBaseParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>> kotlinObjectSingletonDeserializerKt, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(kotlinObjectSingletonDeserializerKt, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.write(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.write(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NewNumberOtpResendRequest<KotlinModuleCompanion<Value>> IconCompatParcelizer(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, setPassingYear setpassingyear, isPossibleSingleString<Key, Value> ispossiblesinglestring) {
        if (ispossiblesinglestring == null) {
            return accesshascreatorannotation.AudioAttributesCompatParcelizer();
        }
        return isRequiredByNullability.AudioAttributesCompatParcelizer(setpassingyear, new AudioAttributesImplBaseParcelizer(ispossiblesinglestring, accesshascreatorannotation, new setupModuleaddMixIn(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value> r5, kotlin.SampleVideos<? super kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.findKotlinParameterName.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.findKotlinParameterName$IconCompatParcelizer r0 = (o.findKotlinParameterName.IconCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.IconCompatParcelizer
            int r6 = r6 + r2
            r0.IconCompatParcelizer = r6
            goto L19
        L14:
            o.findKotlinParameterName$IconCompatParcelizer r0 = new o.findKotlinParameterName$IconCompatParcelizer
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            r5 = r4
            o.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2 r5 = (kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2) r5
            java.lang.Object r4 = r0.read
            o.findKotlinParameterName r4 = (kotlin.findKotlinParameterName) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L4d
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getAnswerMap<o.SampleVideos<? super o.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>>, java.lang.Object> r6 = r4.read
            r0.read = r4
            r0.RemoteActionCompatParcelizer = r5
            r0.IconCompatParcelizer = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            o.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2 r6 = (kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2) r6
            boolean r0 = r6 instanceof kotlin.KotlinKeyDeserializers
            if (r0 == 0) goto L5d
            r0 = r6
            o.KotlinKeyDeserializers r0 = (kotlin.KotlinKeyDeserializers) r0
            o.accessfilterOutSingleStringCallables r1 = r4.write
            int r1 = r1.write
            r0.IconCompatParcelizer(r1)
        L5d:
            if (r6 == r5) goto L95
            o.findKotlinParameterName$MediaBrowserCompatItemReceiver r0 = new o.findKotlinParameterName$MediaBrowserCompatItemReceiver
            r0.<init>(r4)
            o.getCreatedOnDateMs r0 = (kotlin.getCreatedOnDateMs) r0
            r6.IconCompatParcelizer(r0)
            if (r5 == 0) goto L75
            o.findKotlinParameterName$AudioAttributesImplApi21Parcelizer r0 = new o.findKotlinParameterName$AudioAttributesImplApi21Parcelizer
            r0.<init>(r4)
            o.getCreatedOnDateMs r0 = (kotlin.getCreatedOnDateMs) r0
            r5.read(r0)
        L75:
            if (r5 == 0) goto L7a
            r5.IconCompatParcelizer()
        L7a:
            o.KotlinModule r4 = kotlin.getStaticJsonKeyGetter.write()
            if (r4 == 0) goto L94
            r5 = 3
            boolean r0 = r4.write(r5)
            if (r0 != r3) goto L94
            java.lang.String r0 = "Generated new PagingSource "
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r0.concat(r1)
            r4.write(r5, r0)
        L94:
            return r6
        L95:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.findKotlinParameterName.IconCompatParcelizer(o.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2, o.SampleVideos):java.lang.Object");
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class MediaBrowserCompatItemReceiver extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            ((findKotlinParameterName) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer();
        }

        MediaBrowserCompatItemReceiver(Object obj) {
            super(0, obj, findKotlinParameterName.class, "IconCompatParcelizer", "IconCompatParcelizer()V", 0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class AudioAttributesImplApi21Parcelizer extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            ((findKotlinParameterName) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer();
        }

        AudioAttributesImplApi21Parcelizer(Object obj) {
            super(0, obj, findKotlinParameterName.class, "IconCompatParcelizer", "IconCompatParcelizer()V", 0);
        }
    }

    public final class AudioAttributesCompatParcelizer implements hasInjectableValueId {
        final /* synthetic */ findKotlinParameterName<Key, Value> read;
        private final KotlinBeanDeserializerModifierKt<getShowPopup> write;

        public AudioAttributesCompatParcelizer(findKotlinParameterName findkotlinparametername, KotlinBeanDeserializerModifierKt<getShowPopup> kotlinBeanDeserializerModifierKt) {
            toMagicModuleMetaRepoModel.write(kotlinBeanDeserializerModifierKt, "");
            this.read = findkotlinparametername;
            this.write = kotlinBeanDeserializerModifierKt;
        }
    }

    public final class RemoteActionCompatParcelizer<Key, Value> implements KotlinFeatureCompanion {
        private final accesshasCreatorAnnotation<Key, Value> AudioAttributesCompatParcelizer;
        final /* synthetic */ findKotlinParameterName<Key, Value> IconCompatParcelizer;

        public RemoteActionCompatParcelizer(findKotlinParameterName findkotlinparametername, accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation) {
            toMagicModuleMetaRepoModel.write(accesshascreatorannotation, "");
            this.IconCompatParcelizer = findkotlinparametername;
            this.AudioAttributesCompatParcelizer = accesshascreatorannotation;
        }

        @Override // kotlin.KotlinFeatureCompanion
        public final void write(getInstanceParameter getinstanceparameter) {
            toMagicModuleMetaRepoModel.write(getinstanceparameter, "");
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getinstanceparameter);
        }
    }

    static final class read<Key, Value> {
        private final accesshasCreatorAnnotation<Key, Value> IconCompatParcelizer;
        private final setPassingYear RemoteActionCompatParcelizer;
        private final accessisPrimaryConstructor<Key, Value> read;

        public read(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, accessisPrimaryConstructor<Key, Value> accessisprimaryconstructor, setPassingYear setpassingyear) {
            toMagicModuleMetaRepoModel.write(accesshascreatorannotation, "");
            toMagicModuleMetaRepoModel.write(setpassingyear, "");
            this.IconCompatParcelizer = accesshascreatorannotation;
            this.read = accessisprimaryconstructor;
            this.RemoteActionCompatParcelizer = setpassingyear;
        }

        public final accesshasCreatorAnnotation<Key, Value> RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final accessisPrimaryConstructor<Key, Value> AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final setPassingYear IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
