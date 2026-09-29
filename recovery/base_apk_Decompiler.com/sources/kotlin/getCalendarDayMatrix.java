package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class getCalendarDayMatrix {
    public static final <R, T> Object read(MagicModuleSubmissionRequestBody<? super R, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, R r, SampleVideos<? super T> sampleVideos) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(sampleVideos, "");
        return ((MagicModuleSubmissionRequestBody) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, 2)).invoke(r, RemoteActionCompatParcelizer(getAnsweredMcqCount.RemoteActionCompatParcelizer(sampleVideos)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <R, T> SampleVideos<getShowPopup> RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super R, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, R r, SampleVideos<? super T> sampleVideos) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(sampleVideos, "");
        SampleVideos<?> sampleVideosRemoteActionCompatParcelizer = getAnsweredMcqCount.RemoteActionCompatParcelizer(sampleVideos);
        if (magicModuleSubmissionRequestBody instanceof getMonthName) {
            return ((getMonthName) magicModuleSubmissionRequestBody).create(r, sampleVideosRemoteActionCompatParcelizer);
        }
        CurrentQuery context = sampleVideosRemoteActionCompatParcelizer.getWrite();
        if (context == VideoSessionResponseBody.RemoteActionCompatParcelizer) {
            return new IconCompatParcelizer(sampleVideosRemoteActionCompatParcelizer, magicModuleSubmissionRequestBody, r);
        }
        return new AudioAttributesCompatParcelizer(sampleVideosRemoteActionCompatParcelizer, context, magicModuleSubmissionRequestBody, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> SampleVideos<T> IconCompatParcelizer(SampleVideos<? super T> sampleVideos) {
        SampleVideos<T> sampleVideos2;
        toMagicModuleMetaRepoModel.write(sampleVideos, "");
        getTotalMcq gettotalmcq = sampleVideos instanceof getTotalMcq ? (getTotalMcq) sampleVideos : null;
        return (gettotalmcq == null || (sampleVideos2 = (SampleVideos<T>) gettotalmcq.intercepted()) == null) ? sampleVideos : sampleVideos2;
    }

    public static final class IconCompatParcelizer extends MagicModuleLocal {
        private int IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private /* synthetic */ MagicModuleSubmissionRequestBody write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(SampleVideos sampleVideos, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, Object obj) {
            super(sampleVideos);
            this.write = magicModuleSubmissionRequestBody;
            this.RemoteActionCompatParcelizer = obj;
            toMagicModuleMetaRepoModel.read(sampleVideos, "");
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int i = this.IconCompatParcelizer;
            if (i != 0) {
                if (i == 1) {
                    this.IconCompatParcelizer = 2;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.IconCompatParcelizer = 1;
            SdkPayloadData.IconCompatParcelizer(obj);
            IconCompatParcelizer iconCompatParcelizer = this;
            toMagicModuleMetaRepoModel.read(this.write, "");
            return ((MagicModuleSubmissionRequestBody) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(this.write, 2)).invoke(this.RemoteActionCompatParcelizer, iconCompatParcelizer);
        }
    }

    public static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        private int IconCompatParcelizer;
        private /* synthetic */ MagicModuleSubmissionRequestBody RemoteActionCompatParcelizer;
        private /* synthetic */ Object read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(SampleVideos sampleVideos, CurrentQuery currentQuery, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, Object obj) {
            super(sampleVideos, currentQuery);
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = obj;
            toMagicModuleMetaRepoModel.read(sampleVideos, "");
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int i = this.IconCompatParcelizer;
            if (i != 0) {
                if (i == 1) {
                    this.IconCompatParcelizer = 2;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.IconCompatParcelizer = 1;
            SdkPayloadData.IconCompatParcelizer(obj);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this;
            toMagicModuleMetaRepoModel.read(this.RemoteActionCompatParcelizer, "");
            return ((MagicModuleSubmissionRequestBody) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, 2)).invoke(this.read, audioAttributesCompatParcelizer);
        }
    }

    private static final <T> SampleVideos<T> RemoteActionCompatParcelizer(SampleVideos<? super T> sampleVideos) {
        CurrentQuery context = sampleVideos.getWrite();
        if (context == VideoSessionResponseBody.RemoteActionCompatParcelizer) {
            return new read(sampleVideos);
        }
        return new RemoteActionCompatParcelizer(sampleVideos, context);
    }

    public static final class read extends MagicModuleLocal {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(SampleVideos<? super T> sampleVideos) {
            super(sampleVideos);
            toMagicModuleMetaRepoModel.read(sampleVideos, "");
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            SdkPayloadData.IconCompatParcelizer(obj);
            return obj;
        }
    }

    public static final class RemoteActionCompatParcelizer extends getTotalMcq {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(SampleVideos<? super T> sampleVideos, CurrentQuery currentQuery) {
            super(sampleVideos, currentQuery);
            toMagicModuleMetaRepoModel.read(sampleVideos, "");
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            SdkPayloadData.IconCompatParcelizer(obj);
            return obj;
        }
    }
}
