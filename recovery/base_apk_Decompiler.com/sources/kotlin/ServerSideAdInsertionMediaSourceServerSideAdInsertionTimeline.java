package kotlin;

import com.marrow.data.models.paginationV2.PageValue;

/* JADX INFO: loaded from: classes3.dex */
public final class ServerSideAdInsertionMediaSourceServerSideAdInsertionTimeline implements ServerSideAdInsertionMediaSourceSampleStreamImpl {
    private final loadNtpTimeOffset RemoteActionCompatParcelizer;

    @setSdkPayload
    public ServerSideAdInsertionMediaSourceServerSideAdInsertionTimeline(loadNtpTimeOffset loadntptimeoffset) {
        toMagicModuleMetaRepoModel.write(loadntptimeoffset, "");
        this.RemoteActionCompatParcelizer = loadntptimeoffset;
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceSampleStreamImpl
    public final String IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        PageValue pageValueAudioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(str);
        if (pageValueAudioAttributesImplBaseParcelizer != null) {
            return pageValueAudioAttributesImplBaseParcelizer.getNextUrl();
        }
        return null;
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceSampleStreamImpl
    public final void AudioAttributesCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new PageValue(str, str2));
    }
}
