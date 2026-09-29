package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes2.dex */
final class access4600<Model, Data> implements MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data> {
    private final rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> read;
    private final List<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data>> write;

    access4600(List<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data>> list, rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> iconCompatParcelizer) {
        this.write = list;
        this.read = iconCompatParcelizer;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Data> write(Model model, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Data> remoteActionCompatParcelizerWrite;
        int size = this.write.size();
        ArrayList arrayList = new ArrayList(size);
        onVolumeChanged onvolumechanged = null;
        for (int i3 = 0; i3 < size; i3++) {
            MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data> mediaItemLocalConfigurationExternalSyntheticLambda0 = this.write.get(i3);
            if (mediaItemLocalConfigurationExternalSyntheticLambda0.read(model) && (remoteActionCompatParcelizerWrite = mediaItemLocalConfigurationExternalSyntheticLambda0.write(model, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk)) != null) {
                onvolumechanged = remoteActionCompatParcelizerWrite.read;
                arrayList.add(remoteActionCompatParcelizerWrite.RemoteActionCompatParcelizer);
            }
        }
        if (arrayList.isEmpty() || onvolumechanged == null) {
            return null;
        }
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(onvolumechanged, new RemoteActionCompatParcelizer(arrayList, this.read));
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final boolean read(Model model) {
        Iterator<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data>> it = this.write.iterator();
        while (it.hasNext()) {
            if (it.next().read(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiModelLoader{modelLoaders=");
        sb.append(Arrays.toString(this.write.toArray()));
        sb.append('}');
        return sb.toString();
    }

    static class RemoteActionCompatParcelizer<Data> implements fromUri<Data>, fromUri.AudioAttributesCompatParcelizer<Data> {
        private boolean AudioAttributesCompatParcelizer;
        private setSampleRate AudioAttributesImplApi21Parcelizer;
        private int IconCompatParcelizer;
        private final rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> MediaBrowserCompatItemReceiver;
        private List<Throwable> RemoteActionCompatParcelizer;
        private fromUri.AudioAttributesCompatParcelizer<? super Data> read;
        private final List<fromUri<Data>> write;

        RemoteActionCompatParcelizer(List<fromUri<Data>> list, rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> iconCompatParcelizer) {
            this.MediaBrowserCompatItemReceiver = iconCompatParcelizer;
            moveMediaSource.AudioAttributesCompatParcelizer(list);
            this.write = list;
            this.IconCompatParcelizer = 0;
        }

        @Override // kotlin.fromUri
        public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super Data> audioAttributesCompatParcelizer) {
            this.AudioAttributesImplApi21Parcelizer = setsamplerate;
            this.read = audioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            this.write.get(this.IconCompatParcelizer).write(setsamplerate, this);
            if (this.AudioAttributesCompatParcelizer) {
                AudioAttributesCompatParcelizer();
            }
        }

        @Override // kotlin.fromUri
        public final void read() {
            List<Throwable> list = this.RemoteActionCompatParcelizer;
            if (list != null) {
                this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(list);
            }
            this.RemoteActionCompatParcelizer = null;
            Iterator<fromUri<Data>> it = this.write.iterator();
            while (it.hasNext()) {
                it.next().read();
            }
        }

        @Override // kotlin.fromUri
        public final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = true;
            Iterator<fromUri<Data>> it = this.write.iterator();
            while (it.hasNext()) {
                it.next().AudioAttributesCompatParcelizer();
            }
        }

        @Override // kotlin.fromUri
        public final Class<Data> write() {
            return this.write.get(0).write();
        }

        @Override // kotlin.fromUri
        public final onTracksChanged IconCompatParcelizer() {
            return this.write.get(0).IconCompatParcelizer();
        }

        @Override // o.fromUri.AudioAttributesCompatParcelizer
        public final void write(Data data) {
            if (data != null) {
                this.read.write(data);
            } else {
                RemoteActionCompatParcelizer();
            }
        }

        @Override // o.fromUri.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(Exception exc) {
            ((List) moveMediaSource.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer)).add(exc);
            RemoteActionCompatParcelizer();
        }

        private void RemoteActionCompatParcelizer() {
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            if (this.IconCompatParcelizer < this.write.size() - 1) {
                this.IconCompatParcelizer++;
                write(this.AudioAttributesImplApi21Parcelizer, this.read);
            } else {
                moveMediaSource.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
                this.read.IconCompatParcelizer(new setLiveMaxPlaybackSpeed("Fetch failed", new ArrayList(this.RemoteActionCompatParcelizer)));
            }
        }
    }
}
