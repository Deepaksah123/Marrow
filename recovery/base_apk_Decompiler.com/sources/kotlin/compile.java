package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/compile;", "", "Lo/Flow;", "p0", "", "write", "(Lo/Flow;Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "Lo/setCollapseIcon;", "", "read", "()Lo/setCollapseIcon;", "IconCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface compile {
    void AudioAttributesCompatParcelizer();

    void RemoteActionCompatParcelizer();

    setCollapseIcon<Boolean> read();

    Object write(Flow flow, SampleVideos<? super getShowPopup> sampleVideos);

    boolean write();

    static /* synthetic */ Object write$default(compile compileVar, Flow flow, SampleVideos sampleVideos, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i & 1) != 0) {
            flow = Flow.read;
        }
        return compileVar.write(flow, sampleVideos);
    }
}
