package kotlin;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class onSurfaceTextureUpdated {
    private final List<ExoPlayerImplComponentListenerExternalSyntheticLambda6> write = new ArrayList();

    final void read(ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6) {
        this.write.add(exoPlayerImplComponentListenerExternalSyntheticLambda6);
    }

    public final void read(Path path) {
        for (int size = this.write.size() - 1; size >= 0; size--) {
            setEncoderPadding.IconCompatParcelizer(path, this.write.get(size));
        }
    }
}
