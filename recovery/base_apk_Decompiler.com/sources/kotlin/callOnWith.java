package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class callOnWith implements collectAnnotations<AnnotatedMethod> {
    private final collectAnnotations<AnnotatedMethod> write;

    public callOnWith(collectAnnotations<AnnotatedMethod> collectannotations) {
        toMagicModuleMetaRepoModel.write(collectannotations, "");
        this.write = collectannotations;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<AnnotatedMethod, SampleVideos<? super AnnotatedMethod>, Object> {
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private int read;
        final /* synthetic */ MagicModuleSubmissionRequestBody<AnnotatedMethod, SampleVideos<? super AnnotatedMethod>, Object> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                AnnotatedMethod annotatedMethod = (AnnotatedMethod) this.RemoteActionCompatParcelizer;
                MagicModuleSubmissionRequestBody<AnnotatedMethod, SampleVideos<? super AnnotatedMethod>, Object> magicModuleSubmissionRequestBody = this.write;
                this.read = 1;
                obj = magicModuleSubmissionRequestBody.invoke(annotatedMethod, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            AnnotatedMethod annotatedMethod2 = (AnnotatedMethod) obj;
            ((getAllAnnotations) annotatedMethod2).write();
            return annotatedMethod2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(MagicModuleSubmissionRequestBody<? super AnnotatedMethod, ? super SampleVideos<? super AnnotatedMethod>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.write, sampleVideos);
            writeVar.RemoteActionCompatParcelizer = obj;
            return writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(AnnotatedMethod annotatedMethod, SampleVideos<? super AnnotatedMethod> sampleVideos) {
            return ((write) create(annotatedMethod, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.collectAnnotations
    public final Object read(MagicModuleSubmissionRequestBody<? super AnnotatedMethod, ? super SampleVideos<? super AnnotatedMethod>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super AnnotatedMethod> sampleVideos) {
        return this.write.read(new write(magicModuleSubmissionRequestBody, null), sampleVideos);
    }

    @Override // kotlin.collectAnnotations
    public final NewNumberOtpResendRequest<AnnotatedMethod> write() {
        return this.write.write();
    }
}
