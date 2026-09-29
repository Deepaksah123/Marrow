package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "Lkotlin/Function1;", "", "p0", "write", "(Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class props {
    public static final <R> Object write(getAnswerMap<? super Long, ? extends R> getanswermap, SampleVideos<? super R> sampleVideos) {
        JsonAppendAttr jsonAppendAttr = (JsonAppendAttr) sampleVideos.getWrite().get(JsonAppendAttr.INSTANCE);
        if (jsonAppendAttr == null) {
            return TokenFilterInclusion.AudioAttributesCompatParcelizer(getanswermap, sampleVideos);
        }
        return jsonAppendAttr.AudioAttributesCompatParcelizer(new AudioAttributesCompatParcelizer(getanswermap, null), sampleVideos);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer<R> extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super R>, Object> {
        int RemoteActionCompatParcelizer;
        final /* synthetic */ getAnswerMap<Long, R> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            Object objAudioAttributesCompatParcelizer = TokenFilterInclusion.AudioAttributesCompatParcelizer(this.write, this);
            return objAudioAttributesCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objAudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(getAnswerMap<? super Long, ? extends R> getanswermap, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.write = getanswermap;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.write, sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super R> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }
}
