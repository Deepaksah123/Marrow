package kotlin;

import com.marrow.data.api.models.response.test.TestStartResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setInt {
    public static final TestStartResponseBody RemoteActionCompatParcelizer(GlTextureInfo glTextureInfo) {
        toMagicModuleMetaRepoModel.write(glTextureInfo, "");
        TestStartResponseBody testStartResponseBody = new TestStartResponseBody();
        testStartResponseBody.id = glTextureInfo.getRead();
        testStartResponseBody.status = glTextureInfo.getRemoteActionCompatParcelizer();
        testStartResponseBody.startedOn = glTextureInfo.getWrite();
        return testStartResponseBody;
    }
}
