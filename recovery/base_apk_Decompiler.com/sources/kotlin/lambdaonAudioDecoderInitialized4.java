package kotlin;

import com.marrow.data.models.subject.Subject;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonAudioDecoderInitialized4 {
    private ArrayList<String> IconCompatParcelizer;
    private static final String[] write = {".", ":", "$", "'", "\"", "\\"};
    private static final String[] AudioAttributesCompatParcelizer = {".", ":", "$", "'", "\"", "\\"};
    private static final String[] read = {"'", "\"", "\\"};
    public static final String[] RemoteActionCompatParcelizer = {"Stayed", "Notification Clicked", "Notification Viewed", "UTM Visited", "Notification Sent", "App Launched", "wzrk_d", "App Uninstalled", "Notification Bounced", "Geocluster Entered", "Geocluster Exited", "SCOutgoing", "SCIncoming", "SCEnd", "SCCampaignOptOut"};

    public enum AudioAttributesCompatParcelizer {
        Profile,
        Event
    }

    /* JADX INFO: loaded from: classes4.dex */
    enum write {
        Name,
        Email,
        Education,
        Married,
        DOB,
        Gender,
        Phone,
        Age,
        FBID,
        GPID,
        Birthday
    }

    public static generateMediaPeriodEventTime write(String str) {
        generateMediaPeriodEventTime generatemediaperiodeventtime = new generateMediaPeriodEventTime();
        String strTrim = str.trim();
        for (String str2 : write) {
            strTrim = strTrim.replace(str2, "");
        }
        if (strTrim.length() > 512) {
            strTrim = strTrim.substring(0, UnixStat.DEFAULT_LINK_PERM);
            generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(510, 11, strTrim.trim(), "512");
            generatemediaperiodeventtime.write(generatemediaperiodeventtime2.RemoteActionCompatParcelizer());
            generatemediaperiodeventtime.write(generatemediaperiodeventtime2.write());
        }
        generatemediaperiodeventtime.AudioAttributesCompatParcelizer(strTrim.trim());
        return generatemediaperiodeventtime;
    }

    public static generateMediaPeriodEventTime AudioAttributesCompatParcelizer(String str) {
        generateMediaPeriodEventTime generatemediaperiodeventtimeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        String str2 = (String) generatemediaperiodeventtimeRemoteActionCompatParcelizer.read();
        try {
            if (write.valueOf(str2) != null) {
                generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderReleased8.read(523, 24, str2);
                generatemediaperiodeventtimeRemoteActionCompatParcelizer.write(generatemediaperiodeventtime.RemoteActionCompatParcelizer());
                generatemediaperiodeventtimeRemoteActionCompatParcelizer.write(generatemediaperiodeventtime.write());
                generatemediaperiodeventtimeRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(null);
            }
        } catch (Throwable unused) {
        }
        return generatemediaperiodeventtimeRemoteActionCompatParcelizer;
    }

    public static generateMediaPeriodEventTime read(String str) {
        generateMediaPeriodEventTime generatemediaperiodeventtime = new generateMediaPeriodEventTime();
        String lowerCase = str.trim().toLowerCase();
        for (String str2 : read) {
            lowerCase = lowerCase.replace(str2, "");
        }
        try {
            if (lowerCase.length() > 512) {
                lowerCase = lowerCase.substring(0, UnixStat.DEFAULT_LINK_PERM);
                generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(521, 11, lowerCase, "512");
                generatemediaperiodeventtime.write(generatemediaperiodeventtime2.RemoteActionCompatParcelizer());
                generatemediaperiodeventtime.write(generatemediaperiodeventtime2.write());
            }
        } catch (Exception unused) {
        }
        generatemediaperiodeventtime.AudioAttributesCompatParcelizer(lowerCase);
        return generatemediaperiodeventtime;
    }

    public static generateMediaPeriodEventTime RemoteActionCompatParcelizer(String str) {
        generateMediaPeriodEventTime generatemediaperiodeventtime = new generateMediaPeriodEventTime();
        String strTrim = str.trim();
        for (String str2 : AudioAttributesCompatParcelizer) {
            strTrim = strTrim.replace(str2, "");
        }
        if (strTrim.length() > 120) {
            strTrim = strTrim.substring(0, 119);
            generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(520, 11, strTrim.trim(), "120");
            generatemediaperiodeventtime.write(generatemediaperiodeventtime2.RemoteActionCompatParcelizer());
            generatemediaperiodeventtime.write(generatemediaperiodeventtime2.write());
        }
        generatemediaperiodeventtime.AudioAttributesCompatParcelizer(strTrim.trim());
        return generatemediaperiodeventtime;
    }

    public static generateMediaPeriodEventTime write(Object obj, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IllegalArgumentException {
        String strValueOf;
        generateMediaPeriodEventTime generatemediaperiodeventtime = new generateMediaPeriodEventTime();
        if ((obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Long)) {
            generatemediaperiodeventtime.AudioAttributesCompatParcelizer(obj);
            return generatemediaperiodeventtime;
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            if (obj instanceof Character) {
                strValueOf = String.valueOf(obj);
            } else {
                strValueOf = (String) obj;
            }
            String strTrim = strValueOf.trim();
            for (String str : read) {
                strTrim = strTrim.replace(str, "");
            }
            try {
                if (strTrim.length() > 512) {
                    strTrim = strTrim.substring(0, UnixStat.DEFAULT_LINK_PERM);
                    generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(521, 11, strTrim.trim(), "512");
                    generatemediaperiodeventtime.write(generatemediaperiodeventtime2.RemoteActionCompatParcelizer());
                    generatemediaperiodeventtime.write(generatemediaperiodeventtime2.write());
                }
            } catch (Exception unused) {
            }
            generatemediaperiodeventtime.AudioAttributesCompatParcelizer(strTrim.trim());
            return generatemediaperiodeventtime;
        }
        if (obj instanceof Date) {
            StringBuilder sb = new StringBuilder("$D_");
            sb.append(((Date) obj).getTime() / 1000);
            generatemediaperiodeventtime.AudioAttributesCompatParcelizer(sb.toString());
            return generatemediaperiodeventtime;
        }
        boolean z = obj instanceof String[];
        if ((z || (obj instanceof ArrayList)) && audioAttributesCompatParcelizer.equals(AudioAttributesCompatParcelizer.Profile)) {
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            String[] strArr = z ? (String[]) obj : null;
            ArrayList arrayList2 = new ArrayList();
            if (strArr != null) {
                for (String str2 : strArr) {
                    try {
                        arrayList2.add(str2);
                    } catch (Exception unused2) {
                    }
                }
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add((String) it.next());
                    } catch (Exception unused3) {
                    }
                }
            }
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            if (strArr2.length > 0 && strArr2.length <= 100) {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                for (String str3 : strArr2) {
                    jSONArray.put(str3);
                }
                try {
                    jSONObject.put("$set", jSONArray);
                } catch (JSONException unused4) {
                }
                generatemediaperiodeventtime.AudioAttributesCompatParcelizer(jSONObject);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr2.length);
                generateMediaPeriodEventTime generatemediaperiodeventtime3 = lambdaonAudioDecoderReleased8.read(521, 13, sb2.toString(), Subject.ROOT_PARENT_ID);
                generatemediaperiodeventtime.write(generatemediaperiodeventtime3.RemoteActionCompatParcelizer());
                generatemediaperiodeventtime.write(generatemediaperiodeventtime3.write());
            }
            return generatemediaperiodeventtime;
        }
        throw new IllegalArgumentException("Not a String, Boolean, Long, Integer, Float, Double, or Date");
    }

    public final generateMediaPeriodEventTime IconCompatParcelizer(String str) {
        generateMediaPeriodEventTime generatemediaperiodeventtime = new generateMediaPeriodEventTime();
        if (str == null) {
            generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(510, 14, new String[0]);
            generatemediaperiodeventtime.write(generatemediaperiodeventtime2.write());
            generatemediaperiodeventtime.write(generatemediaperiodeventtime2.RemoteActionCompatParcelizer());
            return generatemediaperiodeventtime;
        }
        if (AudioAttributesCompatParcelizer() != null) {
            Iterator<String> it = AudioAttributesCompatParcelizer().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (RendererCapabilitiesListener.RemoteActionCompatParcelizer(str, it.next())) {
                    generateMediaPeriodEventTime generatemediaperiodeventtime3 = lambdaonAudioDecoderReleased8.read(513, 17, str);
                    generatemediaperiodeventtime.write(generatemediaperiodeventtime3.write());
                    generatemediaperiodeventtime.write(generatemediaperiodeventtime3.RemoteActionCompatParcelizer());
                    RendererWakeupListener.MediaBrowserCompatItemReceiver();
                    break;
                }
            }
        }
        return generatemediaperiodeventtime;
    }

    public static generateMediaPeriodEventTime AudioAttributesImplApi26Parcelizer(String str) {
        generateMediaPeriodEventTime generatemediaperiodeventtime = new generateMediaPeriodEventTime();
        if (str == null) {
            generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(510, 14, new String[0]);
            generatemediaperiodeventtime.write(generatemediaperiodeventtime2.write());
            generatemediaperiodeventtime.write(generatemediaperiodeventtime2.RemoteActionCompatParcelizer());
            return generatemediaperiodeventtime;
        }
        for (String str2 : RemoteActionCompatParcelizer) {
            if (RendererCapabilitiesListener.RemoteActionCompatParcelizer(str, str2)) {
                generateMediaPeriodEventTime generatemediaperiodeventtime3 = lambdaonAudioDecoderReleased8.read(513, 16, str);
                generatemediaperiodeventtime.write(generatemediaperiodeventtime3.write());
                generatemediaperiodeventtime.write(generatemediaperiodeventtime3.RemoteActionCompatParcelizer());
                generatemediaperiodeventtime3.RemoteActionCompatParcelizer();
                RendererWakeupListener.MediaMetadataCompat();
                return generatemediaperiodeventtime;
            }
        }
        return generatemediaperiodeventtime;
    }

    public final generateMediaPeriodEventTime AudioAttributesCompatParcelizer(JSONArray jSONArray, JSONArray jSONArray2, String str, String str2) {
        return AudioAttributesCompatParcelizer(str2, jSONArray, jSONArray2, "multiValuePropertyRemoveValues".equals(str), new generateMediaPeriodEventTime());
    }

    private static generateMediaPeriodEventTime AudioAttributesCompatParcelizer(String str, JSONArray jSONArray, JSONArray jSONArray2, boolean z, generateMediaPeriodEventTime generatemediaperiodeventtime) {
        if (jSONArray == null) {
            generatemediaperiodeventtime.AudioAttributesCompatParcelizer(null);
            return generatemediaperiodeventtime;
        }
        if (jSONArray2 == null) {
            generatemediaperiodeventtime.AudioAttributesCompatParcelizer(jSONArray);
            return generatemediaperiodeventtime;
        }
        JSONArray jSONArray3 = new JSONArray();
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        int length2 = jSONArray2.length();
        BitSet bitSet = z ? null : new BitSet(length + length2);
        int i = read(jSONArray2, hashSet, bitSet, length);
        int i2 = 0;
        if (!z && hashSet.size() < 100) {
            i2 = read(jSONArray, hashSet, bitSet, 0);
        }
        for (int i3 = i2; i3 < length; i3++) {
            if (z) {
                try {
                    String str2 = (String) jSONArray.get(i3);
                    if (!hashSet.contains(str2)) {
                        jSONArray3.put(str2);
                    }
                } catch (Throwable unused) {
                }
            } else if (!bitSet.get(i3)) {
                jSONArray3.put(jSONArray.get(i3));
            }
        }
        if (!z && jSONArray3.length() < 100) {
            for (int i4 = i; i4 < length2; i4++) {
                try {
                    if (!bitSet.get(i4 + length)) {
                        jSONArray3.put(jSONArray2.get(i4));
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        if (i > 0 || i2 > 0) {
            generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(521, 12, str, Subject.ROOT_PARENT_ID);
            generatemediaperiodeventtime.write(generatemediaperiodeventtime2.write());
            generatemediaperiodeventtime.write(generatemediaperiodeventtime2.RemoteActionCompatParcelizer());
        }
        generatemediaperiodeventtime.AudioAttributesCompatParcelizer(jSONArray3);
        return generatemediaperiodeventtime;
    }

    private ArrayList<String> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(ArrayList<String> arrayList) {
        this.IconCompatParcelizer = arrayList;
    }

    private static int read(JSONArray jSONArray, Set<String> set, BitSet bitSet, int i) {
        if (jSONArray == null) {
            return 0;
        }
        for (int length = jSONArray.length() - 1; length >= 0; length--) {
            try {
                Object obj = jSONArray.get(length);
                String string = obj != null ? obj.toString() : null;
                if (bitSet == null) {
                    if (string != null) {
                        set.add(string);
                    }
                } else if (string == null || set.contains(string)) {
                    bitSet.set(length + i, true);
                } else {
                    set.add(string);
                    if (set.size() == 100) {
                        return length;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }
}
