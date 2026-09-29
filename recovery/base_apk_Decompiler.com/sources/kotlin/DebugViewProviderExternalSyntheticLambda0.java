package kotlin;

import com.marrow.data.models.plan.NotesSubscriptionResponse;
import com.marrow2.core.network.model.NetworkApiResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class DebugViewProviderExternalSyntheticLambda0 implements createEGLContext {
    private final chooseEGLConfig read;

    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int read;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return DebugViewProviderExternalSyntheticLambda0.this.AudioAttributesCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public DebugViewProviderExternalSyntheticLambda0(chooseEGLConfig chooseeglconfig) {
        toMagicModuleMetaRepoModel.write(chooseeglconfig, "");
        this.read = chooseeglconfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.createEGLContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super java.util.List<com.marrow2.data.subscription.remote.model.PlanSubscriptionRSModel>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.DebugViewProviderExternalSyntheticLambda0.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            o.DebugViewProviderExternalSyntheticLambda0$IconCompatParcelizer r0 = (o.DebugViewProviderExternalSyntheticLambda0.IconCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.read
            int r5 = r5 + r2
            r0.read = r5
            goto L19
        L14:
            o.DebugViewProviderExternalSyntheticLambda0$IconCompatParcelizer r0 = new o.DebugViewProviderExternalSyntheticLambda0$IconCompatParcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.chooseEGLConfig r4 = r4.read
            r0.read = r3
            java.lang.Object r5 = r4.read(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            com.marrow2.core.network.model.NetworkApiResponse r5 = (com.marrow2.core.network.model.NetworkApiResponse) r5
            java.lang.Object r4 = kotlin.createDataSink.RemoteActionCompatParcelizer(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DebugViewProviderExternalSyntheticLambda0.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super NotesSubscriptionResponse>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = DebugViewProviderExternalSyntheticLambda0.this.read.AudioAttributesCompatParcelizer(this.read, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return createDataSink.RemoteActionCompatParcelizer((NetworkApiResponse) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(int i, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return DebugViewProviderExternalSyntheticLambda0.this.new RemoteActionCompatParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super NotesSubscriptionResponse> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.createEGLContext
    public final Object write(int i, SampleVideos<? super NotesSubscriptionResponse> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new RemoteActionCompatParcelizer(i, null), sampleVideos);
    }
}
