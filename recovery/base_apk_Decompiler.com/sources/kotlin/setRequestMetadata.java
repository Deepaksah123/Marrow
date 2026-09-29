package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.rewrapCtorProblem;
import kotlin.setDrmMultiSession;

/* JADX INFO: loaded from: classes2.dex */
public final class setRequestMetadata<Data, ResourceType, Transcode> {
    private final List<? extends setDrmMultiSession<Data, ResourceType, Transcode>> AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> RemoteActionCompatParcelizer;
    private final Class<Data> write;

    public setRequestMetadata(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<setDrmMultiSession<Data, ResourceType, Transcode>> list, rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> iconCompatParcelizer) {
        this.write = cls;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = (List) moveMediaSource.AudioAttributesCompatParcelizer(list);
        StringBuilder sb = new StringBuilder("Failed LoadPath{");
        sb.append(cls.getSimpleName());
        sb.append("->");
        sb.append(cls2.getSimpleName());
        sb.append("->");
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.IconCompatParcelizer = sb.toString();
    }

    public final setMimeType<Transcode> IconCompatParcelizer(r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<Data> r8lambdas__qvsutfc117zapgt_kkjakcry, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, int i, int i2, setDrmMultiSession.RemoteActionCompatParcelizer<ResourceType> remoteActionCompatParcelizer) throws setLiveMaxPlaybackSpeed {
        List<Throwable> list = (List) moveMediaSource.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        try {
            return write(r8lambdas__qvsutfc117zapgt_kkjakcry, r8lambda_r106e6zya8q8i_ekunqwrolpk, i, i2, remoteActionCompatParcelizer, list);
        } finally {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(list);
        }
    }

    private setMimeType<Transcode> write(r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<Data> r8lambdas__qvsutfc117zapgt_kkjakcry, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, int i, int i2, setDrmMultiSession.RemoteActionCompatParcelizer<ResourceType> remoteActionCompatParcelizer, List<Throwable> list) throws setLiveMaxPlaybackSpeed {
        int size = this.AudioAttributesCompatParcelizer.size();
        setMimeType<Transcode> setmimetypeWrite = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                setmimetypeWrite = this.AudioAttributesCompatParcelizer.get(i3).write(r8lambdas__qvsutfc117zapgt_kkjakcry, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk, remoteActionCompatParcelizer);
            } catch (setLiveMaxPlaybackSpeed e) {
                list.add(e);
            }
            if (setmimetypeWrite != null) {
                break;
            }
        }
        if (setmimetypeWrite != null) {
            return setmimetypeWrite;
        }
        throw new setLiveMaxPlaybackSpeed(this.IconCompatParcelizer, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.AudioAttributesCompatParcelizer.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
