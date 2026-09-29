package kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setUseLazyPreparation<K, V> {
    private final write<K, V> AudioAttributesCompatParcelizer = new write<>(null);
    private final HashMap<K, write<K, V>> RemoteActionCompatParcelizer = new HashMap<>();

    public final void read(K k, V v) {
        HashMap<K, write<K, V>> map = this.RemoteActionCompatParcelizer;
        write<K, V> writeVar = map.get(k);
        if (writeVar == null) {
            writeVar = new write<>(k);
            IconCompatParcelizer((write) writeVar);
            map.put(k, writeVar);
        }
        writeVar.read(v);
    }

    public final V IconCompatParcelizer(K k) {
        HashMap<K, write<K, V>> map = this.RemoteActionCompatParcelizer;
        write<K, V> writeVar = map.get(k);
        if (writeVar == null) {
            writeVar = new write<>(k);
            map.put(k, writeVar);
        }
        write<K, V> writeVar2 = writeVar;
        AudioAttributesCompatParcelizer(writeVar2);
        return writeVar2.RemoteActionCompatParcelizer();
    }

    public final V AudioAttributesCompatParcelizer() {
        for (write<K, V> writeVarWrite = this.AudioAttributesCompatParcelizer.write(); !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVarWrite, this.AudioAttributesCompatParcelizer); writeVarWrite = writeVarWrite.write()) {
            V vRemoteActionCompatParcelizer = writeVarWrite.RemoteActionCompatParcelizer();
            if (vRemoteActionCompatParcelizer != null) {
                return vRemoteActionCompatParcelizer;
            }
            RemoteActionCompatParcelizer(writeVarWrite);
            HashMap<K, write<K, V>> map = this.RemoteActionCompatParcelizer;
            K kIconCompatParcelizer = writeVarWrite.IconCompatParcelizer();
            if (map == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            toMagicModuleStatsLSModel.write(map).remove(kIconCompatParcelizer);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedMultimap( ");
        write<K, V> writeVarAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVarAudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer)) {
            sb.append('{');
            sb.append(writeVarAudioAttributesCompatParcelizer.IconCompatParcelizer());
            sb.append(':');
            sb.append(writeVarAudioAttributesCompatParcelizer.read());
            sb.append('}');
            writeVarAudioAttributesCompatParcelizer = writeVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVarAudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer)) {
                sb.append(", ");
            }
        }
        sb.append(" )");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private final void AudioAttributesCompatParcelizer(write<K, V> writeVar) {
        RemoteActionCompatParcelizer(writeVar);
        writeVar.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        writeVar.write(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
        read(writeVar);
    }

    private final void IconCompatParcelizer(write<K, V> writeVar) {
        RemoteActionCompatParcelizer(writeVar);
        writeVar.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.write());
        writeVar.write(this.AudioAttributesCompatParcelizer);
        read(writeVar);
    }

    private static <K, V> void read(write<K, V> writeVar) {
        writeVar.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(writeVar);
        writeVar.write().write(writeVar);
    }

    private static <K, V> void RemoteActionCompatParcelizer(write<K, V> writeVar) {
        writeVar.write().write(writeVar.AudioAttributesCompatParcelizer());
        writeVar.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(writeVar.write());
    }

    static final class write<K, V> {
        private final K AudioAttributesCompatParcelizer;
        private List<V> RemoteActionCompatParcelizer;
        private write<K, V> read = this;
        private write<K, V> write = this;

        public write(K k) {
            this.AudioAttributesCompatParcelizer = k;
        }

        public final K IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(write<K, V> writeVar) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            this.read = writeVar;
        }

        public final write<K, V> write() {
            return this.read;
        }

        public final write<K, V> AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final void write(write<K, V> writeVar) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            this.write = writeVar;
        }

        public final int read() {
            List<V> list = this.RemoteActionCompatParcelizer;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public final V RemoteActionCompatParcelizer() {
            List<V> list = this.RemoteActionCompatParcelizer;
            if (list == null) {
                return null;
            }
            return (V) IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer((List) list);
        }

        public final void read(V v) {
            ArrayList arrayList = this.RemoteActionCompatParcelizer;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.RemoteActionCompatParcelizer = arrayList;
            }
            arrayList.add(v);
        }
    }
}
