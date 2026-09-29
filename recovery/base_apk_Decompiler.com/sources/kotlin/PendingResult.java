package kotlin;

import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes3.dex */
public final class PendingResult implements fromUri<ByteBuffer> {
    private setPassingYear IconCompatParcelizer;
    private final PendingResults RemoteActionCompatParcelizer;
    private final TopUserCompanion read;
    private final getNalUnitType write;

    @Override // kotlin.fromUri
    public final void read() {
    }

    public PendingResult(PendingResults pendingResults, getNalUnitType getnalunittype, TopUserCompanion topUserCompanion) {
        toMagicModuleMetaRepoModel.write(pendingResults, "");
        toMagicModuleMetaRepoModel.write(getnalunittype, "");
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        this.RemoteActionCompatParcelizer = pendingResults;
        this.write = getnalunittype;
        this.read = topUserCompanion;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        private /* synthetic */ fromUri.AudioAttributesCompatParcelizer<? super ByteBuffer> RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            TopUserCompanion topUserCompanion = (TopUserCompanion) this.AudioAttributesCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.AudioAttributesCompatParcelizer = topUserCompanion;
                    this.read = 1;
                    obj = PendingResult.this.write.IconCompatParcelizer(PendingResult.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), PendingResult.this.RemoteActionCompatParcelizer.write(), PendingResult.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), PendingResult.this.RemoteActionCompatParcelizer.read(), this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                byte[] bArr = (byte[]) obj;
                if (College.IconCompatParcelizer(topUserCompanion)) {
                    this.RemoteActionCompatParcelizer.write(ByteBuffer.wrap(bArr));
                }
            } catch (Exception e) {
                if (!(e instanceof CancellationException) && College.IconCompatParcelizer(topUserCompanion)) {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer(e);
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(fromUri.AudioAttributesCompatParcelizer<? super ByteBuffer> audioAttributesCompatParcelizer, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = PendingResult.this.new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = obj;
            return remoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.fromUri
    public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super ByteBuffer> audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(setsamplerate, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = C0201setMcqCount.IconCompatParcelizer(this.read, null, null, new RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, null), 3);
    }

    @Override // kotlin.fromUri
    public final void AudioAttributesCompatParcelizer() {
        setPassingYear setpassingyear = this.IconCompatParcelizer;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
    }

    @Override // kotlin.fromUri
    public final Class<ByteBuffer> write() {
        return ByteBuffer.class;
    }

    @Override // kotlin.fromUri
    public final onTracksChanged IconCompatParcelizer() {
        return onTracksChanged.REMOTE;
    }
}
