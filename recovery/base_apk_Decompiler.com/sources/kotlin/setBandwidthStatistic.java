package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0011\u001a\u00020\u00048\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/setBandwidthStatistic;", "", "<init>", "()V", "Lo/readTimestamp;", "p0", "", "p1", "p2", "", "IconCompatParcelizer", "(Lo/readTimestamp;IILo/SampleVideos;)Ljava/lang/Object;", "write", "(IILo/SampleVideos;)Ljava/lang/Object;", "Lo/readTimestamp;", "read", "()Lo/readTimestamp;", "AudioAttributesCompatParcelizer", "(Lo/readTimestamp;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setBandwidthStatistic {
    public static final setBandwidthStatistic INSTANCE = new setBandwidthStatistic();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static readTimestamp AudioAttributesCompatParcelizer;

    private setBandwidthStatistic() {
    }

    public static final /* synthetic */ Object write(setBandwidthStatistic setbandwidthstatistic, int i, int i2, SampleVideos sampleVideos) {
        return write(i, i2, sampleVideos);
    }

    private static void AudioAttributesCompatParcelizer(readTimestamp readtimestamp) {
        toMagicModuleMetaRepoModel.write(readtimestamp, "");
        AudioAttributesCompatParcelizer = readtimestamp;
    }

    private static readTimestamp read() {
        readTimestamp readtimestamp = AudioAttributesCompatParcelizer;
        if (readtimestamp != null) {
            return readtimestamp;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setBandwidthStatistic.write(setBandwidthStatistic.INSTANCE, this.AudioAttributesCompatParcelizer, this.write, this) == objIconCompatParcelizer) {
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
        write(int i, int i2, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
            this.write = i2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new write(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static Object IconCompatParcelizer(readTimestamp readtimestamp, int i, int i2, SampleVideos<? super getShowPopup> sampleVideos) {
        AudioAttributesCompatParcelizer(readtimestamp);
        Object objWrite = readtimestamp.write(new write(i, i2, null), sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    private static Object write(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = read().write(i, i2, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }
}
