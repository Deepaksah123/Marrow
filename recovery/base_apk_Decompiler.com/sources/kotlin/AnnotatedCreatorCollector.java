package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/AnnotatedCreatorCollector;", "T", "", "<init>", "()V", "read"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AnnotatedCreatorCollector<T> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.AnnotatedCreatorCollector$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ;\u0010\u000f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/AnnotatedCreatorCollector$read;", "", "<init>", "()V", "T", "", "Lo/withAnnotations;", "p0", "Lkotlin/Function2;", "Lo/_isIncludableFactoryMethod;", "Lo/SampleVideos;", "", "IconCompatParcelizer", "(Ljava/util/List;)Lo/MagicModuleSubmissionRequestBody;", "p1", "write", "(Ljava/util/List;Lo/_isIncludableFactoryMethod;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o.AnnotatedCreatorCollector$read$write */
        static final class write<T> extends getTotalMcq {
            Object AudioAttributesCompatParcelizer;
            /* synthetic */ Object IconCompatParcelizer;
            int read;
            Object write;

            write(SampleVideos<? super write> sampleVideos) {
                super(sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.IconCompatParcelizer = obj;
                this.read |= Integer.MIN_VALUE;
                return Companion.this.write(null, null, this);
            }
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: o.AnnotatedCreatorCollector$read$IconCompatParcelizer */
        static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<_isIncludableFactoryMethod<T>, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ List<withAnnotations<T>> AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            private /* synthetic */ Object RemoteActionCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    _isIncludableFactoryMethod _isincludablefactorymethod = (_isIncludableFactoryMethod) this.RemoteActionCompatParcelizer;
                    this.IconCompatParcelizer = 1;
                    if (AnnotatedCreatorCollector.INSTANCE.write(this.AudioAttributesCompatParcelizer, _isincludablefactorymethod, this) == objIconCompatParcelizer) {
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
            IconCompatParcelizer(List<? extends withAnnotations<T>> list, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = list;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
                iconCompatParcelizer.RemoteActionCompatParcelizer = obj;
                return iconCompatParcelizer;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(_isIncludableFactoryMethod<T> _isincludablefactorymethod, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((IconCompatParcelizer) create(_isincludablefactorymethod, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        public static <T> MagicModuleSubmissionRequestBody<_isIncludableFactoryMethod<T>, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer(List<? extends withAnnotations<T>> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new IconCompatParcelizer(p0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008d -> B:24:0x0070). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0090 -> B:24:0x0070). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object write(java.util.List<? extends kotlin.withAnnotations<T>> r6, kotlin._isIncludableFactoryMethod<T> r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r8 instanceof kotlin.AnnotatedCreatorCollector.Companion.write
                if (r0 == 0) goto L14
                r0 = r8
                o.AnnotatedCreatorCollector$read$write r0 = (kotlin.AnnotatedCreatorCollector.Companion.write) r0
                int r1 = r0.read
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r5 = r0.read
                int r5 = r5 + r2
                r0.read = r5
                goto L19
            L14:
                o.AnnotatedCreatorCollector$read$write r0 = new o.AnnotatedCreatorCollector$read$write
                r0.<init>(r8)
            L19:
                java.lang.Object r5 = r0.IconCompatParcelizer
                java.lang.Object r8 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r0.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L47
                if (r1 == r3) goto L3f
                if (r1 != r2) goto L37
                java.lang.Object r6 = r0.write
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
                o.MagicModuleUseCaseImplWhenMappings$write r7 = (o.MagicModuleUseCaseImplWhenMappings.write) r7
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L35
                goto L70
            L35:
                r5 = move-exception
                goto L89
            L37:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3f:
                java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
                java.util.List r6 = (java.util.List) r6
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L64
            L47:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.List r5 = (java.util.List) r5
                o.AnnotatedCreatorCollector$read$RemoteActionCompatParcelizer r1 = new o.AnnotatedCreatorCollector$read$RemoteActionCompatParcelizer
                r4 = 0
                r1.<init>(r6, r5, r4)
                o.MagicModuleSubmissionRequestBody r1 = (kotlin.MagicModuleSubmissionRequestBody) r1
                r0.AudioAttributesCompatParcelizer = r5
                r0.read = r3
                java.lang.Object r6 = r7.RemoteActionCompatParcelizer(r1, r0)
                if (r6 == r8) goto La7
                r6 = r5
            L64:
                o.MagicModuleUseCaseImplWhenMappings$write r5 = new o.MagicModuleUseCaseImplWhenMappings$write
                r5.<init>()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L70:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L9d
                java.lang.Object r5 = r6.next()
                o.getAnswerMap r5 = (kotlin.getAnswerMap) r5
                r0.AudioAttributesCompatParcelizer = r7     // Catch: java.lang.Throwable -> L35
                r0.write = r6     // Catch: java.lang.Throwable -> L35
                r0.read = r2     // Catch: java.lang.Throwable -> L35
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L35
                if (r5 != r8) goto L70
                goto La7
            L89:
                T r1 = r7.write
                if (r1 != 0) goto L90
                r7.write = r5
                goto L70
            L90:
                T r1 = r7.write
                kotlin.toMagicModuleMetaRepoModel.write(r1)
                T r1 = r7.write
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.getPlanName.IconCompatParcelizer(r1, r5)
                goto L70
            L9d:
                T r5 = r7.write
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto La6
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            La6:
                throw r5
            La7:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.AnnotatedCreatorCollector.Companion.write(java.util.List, o._isIncludableFactoryMethod, o.SampleVideos):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.AnnotatedCreatorCollector$read$RemoteActionCompatParcelizer */
        static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<T, SampleVideos<? super T>, Object> {
            final /* synthetic */ List<withAnnotations<T>> AudioAttributesCompatParcelizer;
            private Object AudioAttributesImplBaseParcelizer;
            private /* synthetic */ Object IconCompatParcelizer;
            private int MediaBrowserCompatCustomActionResultReceiver;
            private Object RemoteActionCompatParcelizer;
            private Object read;
            final /* synthetic */ List<getAnswerMap<SampleVideos<? super getShowPopup>, Object>> write;

            /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[RETURN] */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r8.MediaBrowserCompatCustomActionResultReceiver
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r8.read
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r8.IconCompatParcelizer
                    java.util.List r4 = (java.util.List) r4
                    kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L22:
                    java.lang.Object r1 = r8.AudioAttributesImplBaseParcelizer
                    java.lang.Object r4 = r8.RemoteActionCompatParcelizer
                    o.withAnnotations r4 = (kotlin.withAnnotations) r4
                    java.lang.Object r5 = r8.read
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r8.IconCompatParcelizer
                    java.util.List r6 = (java.util.List) r6
                    kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                    r7 = r6
                    r6 = r4
                    r4 = r7
                    goto L67
                L37:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                    java.lang.Object r9 = r8.IconCompatParcelizer
                    java.util.List<o.withAnnotations<T>> r1 = r8.AudioAttributesCompatParcelizer
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<o.getAnswerMap<o.SampleVideos<? super o.getShowPopup>, java.lang.Object>> r4 = r8.write
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8d
                    java.lang.Object r5 = r1.next()
                    o.withAnnotations r5 = (kotlin.withAnnotations) r5
                    r8.IconCompatParcelizer = r4
                    r8.read = r1
                    r8.RemoteActionCompatParcelizer = r5
                    r8.AudioAttributesImplBaseParcelizer = r9
                    r8.MediaBrowserCompatCustomActionResultReceiver = r3
                    java.lang.Object r6 = r5.read()
                    if (r6 == r0) goto L8c
                    r7 = r1
                    r1 = r9
                    r9 = r6
                    r6 = r5
                    r5 = r7
                L67:
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 == 0) goto L89
                    o.AnnotatedCreatorCollector$read$RemoteActionCompatParcelizer$IconCompatParcelizer r9 = new o.AnnotatedCreatorCollector$read$RemoteActionCompatParcelizer$IconCompatParcelizer
                    r1 = 0
                    r9.<init>(r6, r1)
                    r4.add(r9)
                    r8.IconCompatParcelizer = r4
                    r8.read = r5
                    r8.RemoteActionCompatParcelizer = r1
                    r8.AudioAttributesImplBaseParcelizer = r1
                    r8.MediaBrowserCompatCustomActionResultReceiver = r2
                    java.lang.Object r9 = r6.RemoteActionCompatParcelizer()
                    if (r9 != r0) goto L8a
                    goto L8c
                L89:
                    r9 = r1
                L8a:
                    r1 = r5
                    goto L46
                L8c:
                    return r0
                L8d:
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.AnnotatedCreatorCollector.Companion.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: o.AnnotatedCreatorCollector$read$RemoteActionCompatParcelizer$IconCompatParcelizer */
            static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ withAnnotations<T> IconCompatParcelizer;
                private int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.write;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        withAnnotations<T> withannotations = this.IconCompatParcelizer;
                        this.write = 1;
                        if (withannotations.AudioAttributesCompatParcelizer() == objIconCompatParcelizer) {
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
                IconCompatParcelizer(withAnnotations<T> withannotations, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                    super(1, sampleVideos);
                    this.IconCompatParcelizer = withannotations;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
                    return new IconCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.getAnswerMap
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            RemoteActionCompatParcelizer(List<? extends withAnnotations<T>> list, List<getAnswerMap<SampleVideos<? super getShowPopup>, Object>> list2, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = list;
                this.write = list2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
                remoteActionCompatParcelizer.IconCompatParcelizer = obj;
                return remoteActionCompatParcelizer;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(T t, SampleVideos<? super T> sampleVideos) {
                return ((RemoteActionCompatParcelizer) create(t, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
