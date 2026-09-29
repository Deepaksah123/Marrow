package kotlin;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class typedValueSerializer {
    private final Map<List<Pair<String, Integer>>, constructViewBased> AudioAttributesCompatParcelizer;
    private final Map<String, Long> IconCompatParcelizer;
    private final Map<Integer, Long> RemoteActionCompatParcelizer;
    private final Random read;

    public typedValueSerializer() {
        this(new Random());
    }

    private typedValueSerializer(Random random) {
        this.AudioAttributesCompatParcelizer = new HashMap();
        this.read = random;
        this.IconCompatParcelizer = new HashMap();
        this.RemoteActionCompatParcelizer = new HashMap();
    }

    public final void IconCompatParcelizer(constructViewBased constructviewbased, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        read(constructviewbased.RemoteActionCompatParcelizer, jElapsedRealtime, this.IconCompatParcelizer);
        if (constructviewbased.AudioAttributesCompatParcelizer != Integer.MIN_VALUE) {
            read(Integer.valueOf(constructviewbased.AudioAttributesCompatParcelizer), jElapsedRealtime, this.RemoteActionCompatParcelizer);
        }
    }

    public final constructViewBased write(List<constructViewBased> list) {
        List<constructViewBased> listIconCompatParcelizer = IconCompatParcelizer(list);
        if (listIconCompatParcelizer.size() < 2) {
            return (constructViewBased) onMoofContainerAtomRead.write(listIconCompatParcelizer, null);
        }
        Collections.sort(listIconCompatParcelizer, new Comparator() { // from class: o.untypedValueSerializer
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return typedValueSerializer.RemoteActionCompatParcelizer((constructViewBased) obj, (constructViewBased) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = listIconCompatParcelizer.get(0).AudioAttributesCompatParcelizer;
        int i2 = 0;
        while (true) {
            if (i2 >= listIconCompatParcelizer.size()) {
                break;
            }
            constructViewBased constructviewbased = listIconCompatParcelizer.get(i2);
            if (i != constructviewbased.AudioAttributesCompatParcelizer) {
                if (arrayList.size() == 1) {
                    return listIconCompatParcelizer.get(0);
                }
            } else {
                arrayList.add(new Pair(constructviewbased.RemoteActionCompatParcelizer, Integer.valueOf(constructviewbased.read)));
                i2++;
            }
        }
        constructViewBased constructviewbased2 = this.AudioAttributesCompatParcelizer.get(arrayList);
        if (constructviewbased2 != null) {
            return constructviewbased2;
        }
        constructViewBased constructviewbasedAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(listIconCompatParcelizer.subList(0, arrayList.size()));
        this.AudioAttributesCompatParcelizer.put(arrayList, constructviewbasedAudioAttributesCompatParcelizer);
        return constructviewbasedAudioAttributesCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer(List<constructViewBased> list) {
        HashSet hashSet = new HashSet();
        List<constructViewBased> listIconCompatParcelizer = IconCompatParcelizer(list);
        for (int i = 0; i < listIconCompatParcelizer.size(); i++) {
            hashSet.add(Integer.valueOf(listIconCompatParcelizer.get(i).AudioAttributesCompatParcelizer));
        }
        return hashSet.size();
    }

    public static int read(List<constructViewBased> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(list.get(i).AudioAttributesCompatParcelizer));
        }
        return hashSet.size();
    }

    public final void AudioAttributesCompatParcelizer() {
        this.IconCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer.clear();
        this.AudioAttributesCompatParcelizer.clear();
    }

    private List<constructViewBased> IconCompatParcelizer(List<constructViewBased> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AudioAttributesCompatParcelizer(jElapsedRealtime, this.IconCompatParcelizer);
        AudioAttributesCompatParcelizer(jElapsedRealtime, this.RemoteActionCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            constructViewBased constructviewbased = list.get(i);
            if (!this.IconCompatParcelizer.containsKey(constructviewbased.RemoteActionCompatParcelizer) && !this.RemoteActionCompatParcelizer.containsKey(Integer.valueOf(constructviewbased.AudioAttributesCompatParcelizer))) {
                arrayList.add(constructviewbased);
            }
        }
        return arrayList;
    }

    private constructViewBased AudioAttributesCompatParcelizer(List<constructViewBased> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += list.get(i2).read;
        }
        int iNextInt = this.read.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            constructViewBased constructviewbased = list.get(i4);
            i3 += constructviewbased.read;
            if (iNextInt < i3) {
                return constructviewbased;
            }
        }
        return (constructViewBased) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(list);
    }

    private static <T> void read(T t, long j, Map<T, Long> map) {
        if (map.containsKey(t)) {
            j = Math.max(j, ((Long) LaissezFaireSubTypeValidator.IconCompatParcelizer(map.get(t))).longValue());
        }
        map.put(t, Long.valueOf(j));
    }

    private static <T> void AudioAttributesCompatParcelizer(long j, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int RemoteActionCompatParcelizer(constructViewBased constructviewbased, constructViewBased constructviewbased2) {
        int iCompare = Integer.compare(constructviewbased.AudioAttributesCompatParcelizer, constructviewbased2.AudioAttributesCompatParcelizer);
        return iCompare != 0 ? iCompare : constructviewbased.RemoteActionCompatParcelizer.compareTo(constructviewbased2.RemoteActionCompatParcelizer);
    }
}
