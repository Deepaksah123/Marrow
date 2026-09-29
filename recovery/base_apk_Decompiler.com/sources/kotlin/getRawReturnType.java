package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getRawReturnType {

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<AnnotatedMethod, SampleVideos<? super AnnotatedMethod>, Object> {
        private /* synthetic */ Object IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<getAllAnnotations, SampleVideos<? super getShowPopup>, Object> RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getAllAnnotations getallannotations = (getAllAnnotations) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                return getallannotations;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            getAllAnnotations getallannotationsIconCompatParcelizer = ((AnnotatedMethod) this.IconCompatParcelizer).IconCompatParcelizer();
            MagicModuleSubmissionRequestBody<getAllAnnotations, SampleVideos<? super getShowPopup>, Object> magicModuleSubmissionRequestBody = this.RemoteActionCompatParcelizer;
            this.IconCompatParcelizer = getallannotationsIconCompatParcelizer;
            this.write = 1;
            return magicModuleSubmissionRequestBody.invoke(getallannotationsIconCompatParcelizer, this) == objIconCompatParcelizer ? objIconCompatParcelizer : getallannotationsIconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super getAllAnnotations, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
            remoteActionCompatParcelizer.IconCompatParcelizer = obj;
            return remoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(AnnotatedMethod annotatedMethod, SampleVideos<? super AnnotatedMethod> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(annotatedMethod, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final Object AudioAttributesCompatParcelizer(collectAnnotations<AnnotatedMethod> collectannotations, MagicModuleSubmissionRequestBody<? super getAllAnnotations, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super AnnotatedMethod> sampleVideos) {
        return collectannotations.read(new RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, null), sampleVideos);
    }
}
