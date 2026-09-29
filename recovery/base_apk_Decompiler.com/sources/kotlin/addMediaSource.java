package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.addAudioOffloadListener;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/addMediaSource;", "Lo/addAudioOffloadListener;", "T", "", "<init>", "()V", "", "p0", "p1", "p2", "Lo/PropertyValueAny;", "p3", "RemoteActionCompatParcelizer", "(IIIJ)Lo/addAudioOffloadListener;", "Lo/Mp4LocationData;", "", "Lo/_parser;", "(Lo/Mp4LocationData;IJ)Ljava/util/List;", "Lo/setProvider;", "write", "Lo/setProvider;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class addMediaSource<T extends addAudioOffloadListener> {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setProvider<List<_parser>> IconCompatParcelizer = ActionMenuView.write();

    public abstract T RemoteActionCompatParcelizer(int p0, int p1, int p2, long p3);

    public final List<_parser> RemoteActionCompatParcelizer(Mp4LocationData mp4LocationData, int i, long j) {
        List<_parser> listAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i);
        if (listAudioAttributesCompatParcelizer != null) {
            return listAudioAttributesCompatParcelizer;
        }
        List<isTypeOrSuperTypeOf> listRemoteActionCompatParcelizer = mp4LocationData.RemoteActionCompatParcelizer(i);
        int size = listRemoteActionCompatParcelizer.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listRemoteActionCompatParcelizer.get(i2).write(j));
        }
        ArrayList arrayList2 = arrayList;
        this.IconCompatParcelizer.write(i, arrayList2);
        return arrayList2;
    }
}
