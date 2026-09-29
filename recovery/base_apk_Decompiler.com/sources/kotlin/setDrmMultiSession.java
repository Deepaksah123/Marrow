package kotlin;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes2.dex */
public final class setDrmMultiSession<DataType, ResourceType, Transcode> {
    private final List<? extends IllegalSeekPositionException<DataType, ResourceType>> AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> RemoteActionCompatParcelizer;
    private final releaseMediaPeriod<ResourceType, Transcode> read;
    private final Class<DataType> write;

    interface RemoteActionCompatParcelizer<ResourceType> {
        setMimeType<ResourceType> IconCompatParcelizer(setMimeType<ResourceType> setmimetype);
    }

    public setDrmMultiSession(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends IllegalSeekPositionException<DataType, ResourceType>> list, releaseMediaPeriod<ResourceType, Transcode> releasemediaperiod, rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> iconCompatParcelizer) {
        this.write = cls;
        this.AudioAttributesCompatParcelizer = list;
        this.read = releasemediaperiod;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        StringBuilder sb = new StringBuilder("Failed DecodePath{");
        sb.append(cls.getSimpleName());
        sb.append("->");
        sb.append(cls2.getSimpleName());
        sb.append("->");
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.IconCompatParcelizer = sb.toString();
    }

    public final setMimeType<Transcode> write(r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<DataType> r8lambdas__qvsutfc117zapgt_kkjakcry, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, RemoteActionCompatParcelizer<ResourceType> remoteActionCompatParcelizer) throws setLiveMaxPlaybackSpeed {
        return this.read.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer(read(r8lambdas__qvsutfc117zapgt_kkjakcry, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk)), r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    private setMimeType<ResourceType> read(r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<DataType> r8lambdas__qvsutfc117zapgt_kkjakcry, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws setLiveMaxPlaybackSpeed {
        List<Throwable> list = (List) moveMediaSource.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        try {
            return RemoteActionCompatParcelizer(r8lambdas__qvsutfc117zapgt_kkjakcry, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk, list);
        } finally {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(list);
        }
    }

    private setMimeType<ResourceType> RemoteActionCompatParcelizer(r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<DataType> r8lambdas__qvsutfc117zapgt_kkjakcry, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, List<Throwable> list) throws setLiveMaxPlaybackSpeed {
        int size = this.AudioAttributesCompatParcelizer.size();
        setMimeType<ResourceType> setmimetypeAudioAttributesCompatParcelizer = null;
        for (int i3 = 0; i3 < size; i3++) {
            IllegalSeekPositionException<DataType, ResourceType> illegalSeekPositionException = this.AudioAttributesCompatParcelizer.get(i3);
            try {
                if (illegalSeekPositionException.RemoteActionCompatParcelizer(r8lambdas__qvsutfc117zapgt_kkjakcry.IconCompatParcelizer(), r8lambda_r106e6zya8q8i_ekunqwrolpk)) {
                    setmimetypeAudioAttributesCompatParcelizer = illegalSeekPositionException.AudioAttributesCompatParcelizer(r8lambdas__qvsutfc117zapgt_kkjakcry.IconCompatParcelizer(), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(illegalSeekPositionException);
                }
                list.add(e);
            }
            if (setmimetypeAudioAttributesCompatParcelizer != null) {
                break;
            }
        }
        if (setmimetypeAudioAttributesCompatParcelizer != null) {
            return setmimetypeAudioAttributesCompatParcelizer;
        }
        throw new setLiveMaxPlaybackSpeed(this.IconCompatParcelizer, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodePath{ dataClass=");
        sb.append(this.write);
        sb.append(", decoders=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", transcoder=");
        sb.append(this.read);
        sb.append('}');
        return sb.toString();
    }
}
