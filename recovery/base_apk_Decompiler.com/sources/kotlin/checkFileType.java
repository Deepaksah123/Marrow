package kotlin;

import com.google.firebase.FirebaseApp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class checkFileType {
    private final FirebaseApp IconCompatParcelizer;
    private final WavHeaderReaderChunkHeader RemoteActionCompatParcelizer;
    private final WavHeaderReaderChunkHeader read;
    private final Map<Object, Object> write = new HashMap();

    public checkFileType(FirebaseApp firebaseApp, onFlushCompleted<setFirstFrameOffset> onflushcompleted, onFlushCompleted<verifyBitstreamType> onflushcompleted2) {
        this.IconCompatParcelizer = firebaseApp;
        this.read = new WavSeekMap(onflushcompleted);
        this.RemoteActionCompatParcelizer = new skipToChunk(onflushcompleted2);
    }
}
