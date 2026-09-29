package kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class convertTimeToGranule {

    static class read {
        private final boolean RemoteActionCompatParcelizer;
        private final packetFinished<?> read;

        /* synthetic */ read(packetFinished packetfinished, boolean z, byte b) {
            this(packetfinished, z);
        }

        private read(packetFinished<?> packetfinished, boolean z) {
            this.read = packetfinished;
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return readVar.read.equals(this.read) && readVar.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.RemoteActionCompatParcelizer).hashCode() ^ ((this.read.hashCode() ^ 1000003) * 1000003);
        }
    }

    convertTimeToGranule() {
    }

    static class IconCompatParcelizer {
        private final FlacReaderFlacOggSeeker<?> write;
        private final Set<IconCompatParcelizer> read = new HashSet();
        private final Set<IconCompatParcelizer> AudioAttributesCompatParcelizer = new HashSet();

        IconCompatParcelizer(FlacReaderFlacOggSeeker<?> flacReaderFlacOggSeeker) {
            this.write = flacReaderFlacOggSeeker;
        }

        final void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.read.add(iconCompatParcelizer);
        }

        final void write(IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.add(iconCompatParcelizer);
        }

        final Set<IconCompatParcelizer> read() {
            return this.read;
        }

        final void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.remove(iconCompatParcelizer);
        }

        final FlacReaderFlacOggSeeker<?> RemoteActionCompatParcelizer() {
            return this.write;
        }

        final boolean AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.isEmpty();
        }

        final boolean write() {
            return this.read.isEmpty();
        }
    }

    static void AudioAttributesCompatParcelizer(List<FlacReaderFlacOggSeeker<?>> list) {
        Set<IconCompatParcelizer> setWrite = write(list);
        Set<IconCompatParcelizer> set = read(setWrite);
        int i = 0;
        while (!set.isEmpty()) {
            IconCompatParcelizer next = set.iterator().next();
            set.remove(next);
            i++;
            for (IconCompatParcelizer iconCompatParcelizer : next.read()) {
                iconCompatParcelizer.AudioAttributesCompatParcelizer(next);
                if (iconCompatParcelizer.AudioAttributesCompatParcelizer()) {
                    set.add(iconCompatParcelizer);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IconCompatParcelizer iconCompatParcelizer2 : setWrite) {
            if (!iconCompatParcelizer2.AudioAttributesCompatParcelizer() && !iconCompatParcelizer2.write()) {
                arrayList.add(iconCompatParcelizer2.RemoteActionCompatParcelizer());
            }
        }
        throw new readHeadersAndUpdateState(arrayList);
    }

    private static Set<IconCompatParcelizer> write(List<FlacReaderFlacOggSeeker<?>> list) {
        Set<IconCompatParcelizer> set;
        HashMap map = new HashMap(list.size());
        Iterator<FlacReaderFlacOggSeeker<?>> it = list.iterator();
        while (true) {
            byte b = 0;
            if (it.hasNext()) {
                FlacReaderFlacOggSeeker<?> next = it.next();
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(next);
                for (packetFinished<? super Object> packetfinished : next.IconCompatParcelizer()) {
                    read readVar = new read(packetfinished, !next.AudioAttributesImplApi21Parcelizer(), b);
                    if (!map.containsKey(readVar)) {
                        map.put(readVar, new HashSet());
                    }
                    Set set2 = (Set) map.get(readVar);
                    if (!set2.isEmpty() && !readVar.RemoteActionCompatParcelizer) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", packetfinished));
                    }
                    set2.add(iconCompatParcelizer);
                }
            } else {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (IconCompatParcelizer iconCompatParcelizer2 : (Set) it2.next()) {
                        for (convertGranuleToTime convertgranuletotime : iconCompatParcelizer2.RemoteActionCompatParcelizer().write()) {
                            if (convertgranuletotime.write() && (set = (Set) map.get(new read(convertgranuletotime.AudioAttributesCompatParcelizer(), convertgranuletotime.read(), b))) != null) {
                                for (IconCompatParcelizer iconCompatParcelizer3 : set) {
                                    iconCompatParcelizer2.IconCompatParcelizer(iconCompatParcelizer3);
                                    iconCompatParcelizer3.write(iconCompatParcelizer2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
        }
    }

    private static Set<IconCompatParcelizer> read(Set<IconCompatParcelizer> set) {
        HashSet hashSet = new HashSet();
        for (IconCompatParcelizer iconCompatParcelizer : set) {
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer()) {
                hashSet.add(iconCompatParcelizer);
            }
        }
        return hashSet;
    }
}
