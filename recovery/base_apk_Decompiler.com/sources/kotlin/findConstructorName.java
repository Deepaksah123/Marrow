package kotlin;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class findConstructorName {
    public static final void RemoteActionCompatParcelizer(View view, getAnswerMap<? super View, getShowPopup> getanswermap) {
        if (!view.isAttachedToWindow()) {
            getanswermap.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new AudioAttributesCompatParcelizer(view, getanswermap));
        }
    }

    public static final class AudioAttributesCompatParcelizer implements View.OnAttachStateChangeListener {
        final /* synthetic */ View AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<View, getShowPopup> read;

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesCompatParcelizer(View view, getAnswerMap<? super View, getShowPopup> getanswermap) {
            this.AudioAttributesCompatParcelizer = view;
            this.read = getanswermap;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.AudioAttributesCompatParcelizer.removeOnAttachStateChangeListener(this);
            this.read.invoke(view);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<ViewParent, ViewParent> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }

        IconCompatParcelizer() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }
    }

    public static final getTopRankers<ViewParent> read(View view) {
        return StateResult.RemoteActionCompatParcelizer(view.getParent(), IconCompatParcelizer.write);
    }

    static final class write extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<setStateResult<? super View>, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        final /* synthetic */ View read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        
            if (r1.read(kotlin.getSerializerForJavaNioFilePath.IconCompatParcelizer((android.view.ViewGroup) r6), r5) == r0) goto L19;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                java.lang.Object r1 = r5.RemoteActionCompatParcelizer
                o.setStateResult r1 = (kotlin.setStateResult) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L39
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                java.lang.Object r6 = r5.RemoteActionCompatParcelizer
                r1 = r6
                o.setStateResult r1 = (kotlin.setStateResult) r1
                android.view.View r6 = r5.read
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.RemoteActionCompatParcelizer = r1
                r5.write = r3
                java.lang.Object r6 = r1.IconCompatParcelizer(r6, r4)
                if (r6 == r0) goto L57
            L39:
                android.view.View r6 = r5.read
                boolean r3 = r6 instanceof android.view.ViewGroup
                if (r3 == 0) goto L54
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                o.getTopRankers r6 = kotlin.getSerializerForJavaNioFilePath.IconCompatParcelizer(r6)
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4 = 0
                r5.RemoteActionCompatParcelizer = r4
                r5.write = r2
                java.lang.Object r5 = r1.read(r6, r3)
                if (r5 != r0) goto L54
                goto L57
            L54:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L57:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.findConstructorName.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(View view, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = view;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.read, sampleVideos);
            writeVar.RemoteActionCompatParcelizer = obj;
            return writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(setStateResult<? super View> setstateresult, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(setstateresult, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final getTopRankers<View> AudioAttributesCompatParcelizer(View view) {
        return StateResult.IconCompatParcelizer((MagicModuleSubmissionRequestBody) new write(view, null));
    }
}
