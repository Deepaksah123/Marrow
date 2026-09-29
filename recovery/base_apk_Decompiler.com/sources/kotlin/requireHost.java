package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/requireParentFragment;", "", "IconCompatParcelizer", "(Lo/requireParentFragment;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class requireHost {
    public static final int IconCompatParcelizer(requireParentFragment requireparentfragment) {
        List<performPrimaryNavigationFragmentChanged> listAudioAttributesImplBaseParcelizer = requireparentfragment.AudioAttributesImplBaseParcelizer();
        if (listAudioAttributesImplBaseParcelizer.isEmpty()) {
            return 0;
        }
        int size = listAudioAttributesImplBaseParcelizer.size();
        int iRemoteActionCompatParcelizer = 0;
        for (int i = 0; i < size; i++) {
            iRemoteActionCompatParcelizer += listAudioAttributesImplBaseParcelizer.get(i).RemoteActionCompatParcelizer();
        }
        return (iRemoteActionCompatParcelizer / listAudioAttributesImplBaseParcelizer.size()) + requireparentfragment.IconCompatParcelizer();
    }
}
