package kotlin;

import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class EnumResolver extends keys {
    private long IconCompatParcelizer;
    private long[] RemoteActionCompatParcelizer;
    private long[] read;

    @Override // kotlin.keys
    protected final boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        return true;
    }

    public EnumResolver() {
        super(new exceptionMessage());
        this.IconCompatParcelizer = C.TIME_UNSET;
        this.RemoteActionCompatParcelizer = new long[0];
        this.read = new long[0];
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final long[] write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long[] RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.keys
    protected final boolean IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j) {
        if (AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer) != 2 || !"onMetaData".equals(AudioAttributesImplApi26Parcelizer(asPropertyTypeDeserializer)) || asPropertyTypeDeserializer.IconCompatParcelizer() == 0 || AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer) != 8) {
            return false;
        }
        HashMap<String, Object> mapAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
        Object obj = mapAudioAttributesCompatParcelizer.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.IconCompatParcelizer = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapAudioAttributesCompatParcelizer.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.RemoteActionCompatParcelizer = new long[size];
                this.read = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.RemoteActionCompatParcelizer[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.read[i] = ((Double) obj5).longValue();
                    } else {
                        this.RemoteActionCompatParcelizer = new long[0];
                        this.read = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    private static int AudioAttributesImplBaseParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        return asPropertyTypeDeserializer.onPlayFromMediaId();
    }

    private static Boolean IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        return Boolean.valueOf(asPropertyTypeDeserializer.onPlayFromMediaId() == 1);
    }

    private static Double RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        return Double.valueOf(Double.longBitsToDouble(asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler()));
    }

    private static String AudioAttributesImplApi26Parcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        int iWrite = asPropertyTypeDeserializer.write();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iOnPrepare);
        return new String(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iWrite, iOnPrepare);
    }

    private static ArrayList<Object> AudioAttributesImplApi21Parcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iOnPrepareFromSearch = asPropertyTypeDeserializer.onPrepareFromSearch();
        ArrayList<Object> arrayList = new ArrayList<>(iOnPrepareFromSearch);
        for (int i = 0; i < iOnPrepareFromSearch; i++) {
            Object objWrite = write(asPropertyTypeDeserializer, AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer));
            if (objWrite != null) {
                arrayList.add(objWrite);
            }
        }
        return arrayList;
    }

    private static HashMap<String, Object> MediaBrowserCompatCustomActionResultReceiver(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(asPropertyTypeDeserializer);
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer);
            if (iAudioAttributesImplBaseParcelizer == 9) {
                return map;
            }
            Object objWrite = write(asPropertyTypeDeserializer, iAudioAttributesImplBaseParcelizer);
            if (objWrite != null) {
                map.put(strAudioAttributesImplApi26Parcelizer, objWrite);
            }
        }
    }

    private static HashMap<String, Object> AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iOnPrepareFromSearch = asPropertyTypeDeserializer.onPrepareFromSearch();
        HashMap<String, Object> map = new HashMap<>(iOnPrepareFromSearch);
        for (int i = 0; i < iOnPrepareFromSearch; i++) {
            String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(asPropertyTypeDeserializer);
            Object objWrite = write(asPropertyTypeDeserializer, AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer));
            if (objWrite != null) {
                map.put(strAudioAttributesImplApi26Parcelizer, objWrite);
            }
        }
        return map;
    }

    private static Date write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        Date date = new Date((long) RemoteActionCompatParcelizer(asPropertyTypeDeserializer).doubleValue());
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
        return date;
    }

    private static Object write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        if (i == 0) {
            return RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
        }
        if (i == 1) {
            return IconCompatParcelizer(asPropertyTypeDeserializer);
        }
        if (i == 2) {
            return AudioAttributesImplApi26Parcelizer(asPropertyTypeDeserializer);
        }
        if (i == 3) {
            return MediaBrowserCompatCustomActionResultReceiver(asPropertyTypeDeserializer);
        }
        if (i == 8) {
            return AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
        }
        if (i == 10) {
            return AudioAttributesImplApi21Parcelizer(asPropertyTypeDeserializer);
        }
        if (i != 11) {
            return null;
        }
        return write(asPropertyTypeDeserializer);
    }
}
