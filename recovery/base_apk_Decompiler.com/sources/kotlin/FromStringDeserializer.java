package kotlin;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class FromStringDeserializer {
    private HashMap<Object, HashMap<String, float[]>> write = new HashMap<>();

    public final void IconCompatParcelizer(Object obj, String str, float f) {
        if (!this.write.containsKey(obj)) {
            HashMap<String, float[]> map = new HashMap<>();
            map.put(str, new float[]{f});
            this.write.put(obj, map);
            return;
        }
        HashMap<String, float[]> map2 = this.write.get(obj);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (!map2.containsKey(str)) {
            map2.put(str, new float[]{f});
            this.write.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= 0) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
        }
        fArrCopyOf[0] = f;
        map2.put(str, fArrCopyOf);
    }

    public final float AudioAttributesCompatParcelizer(Object obj, String str) {
        HashMap<String, float[]> map;
        float[] fArr;
        if (this.write.containsKey(obj) && (map = this.write.get(obj)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
