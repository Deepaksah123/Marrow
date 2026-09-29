package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ValueClassSerializerStaticJsonValue;

/* JADX INFO: loaded from: classes2.dex */
public final class setMarker {
    public static final boolean RemoteActionCompatParcelizer(UShortDeserializer uShortDeserializer, int i, int i2) {
        toMagicModuleMetaRepoModel.write(uShortDeserializer, "");
        if (i > i2 && uShortDeserializer.read) {
            return false;
        }
        Set<Integer> setRemoteActionCompatParcelizer = uShortDeserializer.RemoteActionCompatParcelizer();
        return uShortDeserializer.onAddQueueItem && (setRemoteActionCompatParcelizer == null || !setRemoteActionCompatParcelizer.contains(Integer.valueOf(i)));
    }

    public static final boolean read(ValueClassSerializerStaticJsonValue.write writeVar, int i, int i2) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        Map<Integer, Map<Integer, setVisibleYRange>> mapWrite = writeVar.write();
        if (!mapWrite.containsKey(Integer.valueOf(i))) {
            return false;
        }
        Map<Integer, setVisibleYRange> map = mapWrite.get(Integer.valueOf(i));
        if (map == null) {
            map = VideoTimelineResponseBody.read();
        }
        return map.containsKey(Integer.valueOf(i2));
    }

    public static final List<setVisibleYRange> IconCompatParcelizer(ValueClassSerializerStaticJsonValue.write writeVar, int i, int i2) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        if (i == i2) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return AudioAttributesCompatParcelizer(writeVar, new ArrayList(), i2 > i, i, i2);
    }

    private static final List<setVisibleYRange> AudioAttributesCompatParcelizer(ValueClassSerializerStaticJsonValue.write writeVar, List<setVisibleYRange> list, boolean z, int i, int i2) {
        Pair<Map<Integer, setVisibleYRange>, Iterable<Integer>> pairAudioAttributesCompatParcelizer;
        int iIntValue;
        boolean z2;
        while (true) {
            if (z) {
                if (i >= i2) {
                    return list;
                }
            } else if (i <= i2) {
                return list;
            }
            if (z) {
                pairAudioAttributesCompatParcelizer = writeVar.read(i);
            } else {
                pairAudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer(i);
            }
            if (pairAudioAttributesCompatParcelizer == null) {
                return null;
            }
            Map<Integer, setVisibleYRange> mapRemoteActionCompatParcelizer = pairAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            Iterator<Integer> it = pairAudioAttributesCompatParcelizer.read().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (!z) {
                    if (i2 <= iIntValue && iIntValue < i) {
                        setVisibleYRange setvisibleyrange = mapRemoteActionCompatParcelizer.get(Integer.valueOf(iIntValue));
                        toMagicModuleMetaRepoModel.write(setvisibleyrange);
                        list.add(setvisibleyrange);
                        z2 = true;
                        break;
                    }
                } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                    setVisibleYRange setvisibleyrange2 = mapRemoteActionCompatParcelizer.get(Integer.valueOf(iIntValue));
                    toMagicModuleMetaRepoModel.write(setvisibleyrange2);
                    list.add(setvisibleyrange2);
                    z2 = true;
                    break;
                }
            }
            iIntValue = i;
            z2 = false;
            if (!z2) {
                return null;
            }
            i = iIntValue;
        }
    }
}
