package kotlin;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin._parseName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\t\u001a\u00020\u000e8C@BX\u0082\u008c\u0002¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/findPrimaryPropertySerializer;", "", "Lo/_configureGenerator;", "p0", "Lkotlin/Function2;", "Lo/typing;", "Lo/SampleVideos;", "", "p1", "read", "(Lo/_configureGenerator;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Lo/findPrimaryPropertySerializer;", "IconCompatParcelizer", "Lo/JsonPOJOBuilderValue;", "Lo/InputAccessor;", "RemoteActionCompatParcelizer", "()Lo/JsonPOJOBuilderValue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class findPrimaryPropertySerializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final findPrimaryPropertySerializer IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor read;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int read;
        /* synthetic */ Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return findPrimaryPropertySerializer.this.read(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPOJOBuilderValue RemoteActionCompatParcelizer() {
        return (JsonPOJOBuilderValue) this.read.getRemoteActionCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin._configureGenerator r6, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.typing, ? super kotlin.SampleVideos<?>, ? extends java.lang.Object> r7, kotlin.SampleVideos<?> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof o.findPrimaryPropertySerializer.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.findPrimaryPropertySerializer$RemoteActionCompatParcelizer r0 = (o.findPrimaryPropertySerializer.RemoteActionCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.read
            int r8 = r8 + r2
            r0.read = r8
            goto L19
        L14:
            o.findPrimaryPropertySerializer$RemoteActionCompatParcelizer r0 = new o.findPrimaryPropertySerializer$RemoteActionCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L48
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.findPrimaryPropertySerializer r8 = r5.IconCompatParcelizer
            o.findPrimaryPropertySerializer$IconCompatParcelizer r2 = new o.findPrimaryPropertySerializer$IconCompatParcelizer
            r4 = 0
            r2.<init>(r7, r5, r4)
            o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2
            r0.read = r3
            java.lang.Object r5 = kotlin.JsonSerializeTyping.AudioAttributesCompatParcelizer(r6, r8, r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            o.PlanDetailsCreator r5 = new o.PlanDetailsCreator
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.findPrimaryPropertySerializer.read(o._configureGenerator, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<typing, SampleVideos<?>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<typing, SampleVideos<?>, Object> IconCompatParcelizer;
        final /* synthetic */ findPrimaryPropertySerializer read;
        private /* synthetic */ Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                C0090IconCompatParcelizer c0090IconCompatParcelizer = new C0090IconCompatParcelizer((typing) this.write, _parseName.write(), this.read);
                MagicModuleSubmissionRequestBody<typing, SampleVideos<?>, Object> magicModuleSubmissionRequestBody = this.IconCompatParcelizer;
                this.AudioAttributesCompatParcelizer = 1;
                if (magicModuleSubmissionRequestBody.invoke(c0090IconCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        /* JADX INFO: renamed from: o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Lo/findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer;", "Lo/typing;", "Lo/nullsUsing;", "p0", "", "read", "(Lo/nullsUsing;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/CurrentQuery;", "bj_", "()Lo/CurrentQuery;", "write", "Landroid/view/View;", "IconCompatParcelizer", "()Landroid/view/View;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0090IconCompatParcelizer implements typing {
            final /* synthetic */ AtomicReference<_parseName.RemoteActionCompatParcelizer<getShowPopup>> AudioAttributesCompatParcelizer;
            final /* synthetic */ findPrimaryPropertySerializer IconCompatParcelizer;
            private final /* synthetic */ typing read;
            final /* synthetic */ typing write;

            /* JADX INFO: renamed from: o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$write */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class write extends getTotalMcq {
                /* synthetic */ Object IconCompatParcelizer;
                int RemoteActionCompatParcelizer;

                write(SampleVideos<? super write> sampleVideos) {
                    super(sampleVideos);
                }

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    this.IconCompatParcelizer = obj;
                    this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
                    return C0090IconCompatParcelizer.this.read(null, this);
                }
            }

            C0090IconCompatParcelizer(typing typingVar, AtomicReference<_parseName.RemoteActionCompatParcelizer<getShowPopup>> atomicReference, findPrimaryPropertySerializer findprimarypropertyserializer) {
                this.write = typingVar;
                this.AudioAttributesCompatParcelizer = atomicReference;
                this.IconCompatParcelizer = findprimarypropertyserializer;
                this.read = typingVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            @Override // kotlin.JsonTypeIdResolver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object read(kotlin.nullsUsing r8, kotlin.SampleVideos<?> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof o.findPrimaryPropertySerializer.IconCompatParcelizer.C0090IconCompatParcelizer.write
                    if (r0 == 0) goto L14
                    r0 = r9
                    o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$write r0 = (o.findPrimaryPropertySerializer.IconCompatParcelizer.C0090IconCompatParcelizer.write) r0
                    int r1 = r0.RemoteActionCompatParcelizer
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r9 = r0.RemoteActionCompatParcelizer
                    int r9 = r9 + r2
                    r0.RemoteActionCompatParcelizer = r9
                    goto L19
                L14:
                    o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$write r0 = new o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$write
                    r0.<init>(r9)
                L19:
                    java.lang.Object r9 = r0.IconCompatParcelizer
                    java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                    int r2 = r0.RemoteActionCompatParcelizer
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 == r3) goto L2e
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2e:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                    goto L50
                L32:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                    java.util.concurrent.atomic.AtomicReference<o._parseName$RemoteActionCompatParcelizer<o.getShowPopup>> r9 = r7.AudioAttributesCompatParcelizer
                    o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$3 r2 = o.findPrimaryPropertySerializer.IconCompatParcelizer.C0090IconCompatParcelizer.AnonymousClass3.IconCompatParcelizer
                    o.getAnswerMap r2 = (kotlin.getAnswerMap) r2
                    o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$AudioAttributesCompatParcelizer r4 = new o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$AudioAttributesCompatParcelizer
                    o.findPrimaryPropertySerializer r5 = r7.IconCompatParcelizer
                    o.typing r7 = r7.write
                    r6 = 0
                    r4.<init>(r5, r8, r7, r6)
                    o.MagicModuleSubmissionRequestBody r4 = (kotlin.MagicModuleSubmissionRequestBody) r4
                    r0.RemoteActionCompatParcelizer = r3
                    java.lang.Object r7 = kotlin._parseName.AudioAttributesCompatParcelizer(r9, r2, r4, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    o.PlanDetailsCreator r7 = new o.PlanDetailsCreator
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o.findPrimaryPropertySerializer.IconCompatParcelizer.C0090IconCompatParcelizer.read(o.nullsUsing, o.SampleVideos):java.lang.Object");
            }

            /* JADX INFO: renamed from: o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/TopUserCompanion;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/TopUserCompanion;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<TopUserCompanion, getShowPopup> {
                public static final AnonymousClass3 IconCompatParcelizer = new AnonymousClass3();

                public final void RemoteActionCompatParcelizer(TopUserCompanion topUserCompanion) {
                }

                @Override // kotlin.getAnswerMap
                public final /* synthetic */ getShowPopup invoke(TopUserCompanion topUserCompanion) {
                    RemoteActionCompatParcelizer(topUserCompanion);
                    return getShowPopup.INSTANCE;
                }

                AnonymousClass3() {
                    super(1);
                }
            }

            /* JADX INFO: renamed from: o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$AudioAttributesCompatParcelizer */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getShowPopup, SampleVideos<?>, Object> {
                int AudioAttributesCompatParcelizer;
                final /* synthetic */ typing IconCompatParcelizer;
                final /* synthetic */ nullsUsing RemoteActionCompatParcelizer;
                final /* synthetic */ findPrimaryPropertySerializer read;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.AudioAttributesCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.AudioAttributesCompatParcelizer = 1;
                        if (VerifyNewNumberRequest.AudioAttributesCompatParcelizer(_qbuf.IconCompatParcelizer(new AnonymousClass5(this.read)), new AnonymousClass3(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, null), this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    throw new IllegalStateException("Interceptors flow should never terminate.".toString());
                }

                /* JADX INFO: renamed from: o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$AudioAttributesCompatParcelizer$5, reason: invalid class name */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/JsonPOJOBuilderValue;", "write", "()Lo/JsonPOJOBuilderValue;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<JsonPOJOBuilderValue> {
                    final /* synthetic */ findPrimaryPropertySerializer read;

                    @Override // kotlin.getCreatedOnDateMs
                    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                    public final JsonPOJOBuilderValue invoke() {
                        return this.read.RemoteActionCompatParcelizer();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass5(findPrimaryPropertySerializer findprimarypropertyserializer) {
                        super(0);
                        this.read = findprimarypropertyserializer;
                    }
                }

                /* JADX INFO: renamed from: o.findPrimaryPropertySerializer$IconCompatParcelizer$IconCompatParcelizer$AudioAttributesCompatParcelizer$3, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "interceptor", "Landroidx/compose/ui/platform/PlatformTextInputInterceptor;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<JsonPOJOBuilderValue, SampleVideos<? super getShowPopup>, Object> {
                    int AudioAttributesCompatParcelizer;
                    /* synthetic */ Object IconCompatParcelizer;
                    final /* synthetic */ typing RemoteActionCompatParcelizer;
                    final /* synthetic */ nullsUsing write;

                    @Override // kotlin.getMonthName
                    public final Object invokeSuspend(Object obj) {
                        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                        int i = this.AudioAttributesCompatParcelizer;
                        if (i == 0) {
                            SdkPayloadData.IconCompatParcelizer(obj);
                            this.AudioAttributesCompatParcelizer = 1;
                            if (((JsonPOJOBuilderValue) this.IconCompatParcelizer).write(this.write, this.RemoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
                                return objIconCompatParcelizer;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            SdkPayloadData.IconCompatParcelizer(obj);
                        }
                        throw new PlanDetailsCreator();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(nullsUsing nullsusing, typing typingVar, SampleVideos<? super AnonymousClass3> sampleVideos) {
                        super(2, sampleVideos);
                        this.write = nullsusing;
                        this.RemoteActionCompatParcelizer = typingVar;
                    }

                    @Override // kotlin.getMonthName
                    public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.write, this.RemoteActionCompatParcelizer, sampleVideos);
                        anonymousClass3.IconCompatParcelizer = obj;
                        return anonymousClass3;
                    }

                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(JsonPOJOBuilderValue jsonPOJOBuilderValue, SampleVideos<? super getShowPopup> sampleVideos) {
                        return ((AnonymousClass3) create(jsonPOJOBuilderValue, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AudioAttributesCompatParcelizer(findPrimaryPropertySerializer findprimarypropertyserializer, nullsUsing nullsusing, typing typingVar, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.read = findprimarypropertyserializer;
                    this.RemoteActionCompatParcelizer = nullsusing;
                    this.IconCompatParcelizer = typingVar;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AudioAttributesCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(getShowPopup getshowpopup, SampleVideos<?> sampleVideos) {
                    return ((AudioAttributesCompatParcelizer) create(getshowpopup, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            @Override // kotlin.TopUserCompanion
            /* JADX INFO: renamed from: bj_ */
            public final CurrentQuery getIconCompatParcelizer() {
                return this.read.getIconCompatParcelizer();
            }

            @Override // kotlin.JsonTypeIdResolver
            /* JADX INFO: renamed from: IconCompatParcelizer */
            public final View getIconCompatParcelizer() {
                return this.read.getIconCompatParcelizer();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super typing, ? super SampleVideos<?>, ? extends Object> magicModuleSubmissionRequestBody, findPrimaryPropertySerializer findprimarypropertyserializer, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = findprimarypropertyserializer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.IconCompatParcelizer, this.read, sampleVideos);
            iconCompatParcelizer.write = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(typing typingVar, SampleVideos<?> sampleVideos) {
            return ((IconCompatParcelizer) create(typingVar, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }
}
