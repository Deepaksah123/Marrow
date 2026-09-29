package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonMapper {
    public static final recordComponents read() {
        VideoSessionResponseBody videoSessionResponseBodyRemoteActionCompatParcelizer;
        try {
            videoSessionResponseBodyRemoteActionCompatParcelizer = setMbbsVerificationYear.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
        } catch (IllegalStateException unused) {
            videoSessionResponseBodyRemoteActionCompatParcelizer = VideoSessionResponseBody.RemoteActionCompatParcelizer;
        } catch (NotImplementedError unused2) {
            videoSessionResponseBodyRemoteActionCompatParcelizer = VideoSessionResponseBody.RemoteActionCompatParcelizer;
        }
        return new recordComponents(videoSessionResponseBodyRemoteActionCompatParcelizer.plus(getAltContact.read(null)));
    }
}
