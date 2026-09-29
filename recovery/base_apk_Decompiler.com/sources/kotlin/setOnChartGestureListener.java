package kotlin;

import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.setNoDataTextTypeface;

/* JADX INFO: loaded from: classes4.dex */
public final class setOnChartGestureListener {
    public static final int read(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
        String str2 = upperCase;
        if (TestGroupLSModel.write((CharSequence) str2, (CharSequence) "INT", false)) {
            return 3;
        }
        if (TestGroupLSModel.write((CharSequence) str2, (CharSequence) "CHAR", false) || TestGroupLSModel.write((CharSequence) str2, (CharSequence) "CLOB", false) || TestGroupLSModel.write((CharSequence) str2, (CharSequence) "TEXT", false)) {
            return 2;
        }
        if (TestGroupLSModel.write((CharSequence) str2, (CharSequence) "BLOB", false)) {
            return 5;
        }
        return (TestGroupLSModel.write((CharSequence) str2, (CharSequence) "REAL", false) || TestGroupLSModel.write((CharSequence) str2, (CharSequence) "FLOA", false) || TestGroupLSModel.write((CharSequence) str2, (CharSequence) "DOUB", false)) ? 4 : 1;
    }

    public static final setNoDataTextTypeface AudioAttributesCompatParcelizer(setDrawHoleEnabled setdrawholeenabled, String str) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new setNoDataTextTypeface(str, RemoteActionCompatParcelizer(setdrawholeenabled, str), read(setdrawholeenabled, str), IconCompatParcelizer(setdrawholeenabled, str));
    }

    private static final Set<setNoDataTextTypeface.AudioAttributesCompatParcelizer> read(setDrawHoleEnabled setdrawholeenabled, String str) throws Exception {
        StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(sb.toString());
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            int iAudioAttributesCompatParcelizer = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "id");
            int iAudioAttributesCompatParcelizer2 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "seq");
            int iAudioAttributesCompatParcelizer3 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "table");
            int iAudioAttributesCompatParcelizer4 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "on_delete");
            int iAudioAttributesCompatParcelizer5 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "on_update");
            List<setHardwareAccelerationEnabled> list = read(setdrawentrylabels);
            setdrawentrylabels.AudioAttributesCompatParcelizer();
            Set setWrite = getKycMessage.write();
            while (setdrawentrylabels.write()) {
                if (setdrawentrylabels.IconCompatParcelizer(iAudioAttributesCompatParcelizer2) == 0) {
                    int iIconCompatParcelizer = (int) setdrawentrylabels.IconCompatParcelizer(iAudioAttributesCompatParcelizer);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<setHardwareAccelerationEnabled> arrayList3 = new ArrayList();
                    for (Object obj : list) {
                        if (((setHardwareAccelerationEnabled) obj).IconCompatParcelizer() == iIconCompatParcelizer) {
                            arrayList3.add(obj);
                        }
                    }
                    for (setHardwareAccelerationEnabled sethardwareaccelerationenabled : arrayList3) {
                        arrayList.add(sethardwareaccelerationenabled.read());
                        arrayList2.add(sethardwareaccelerationenabled.write());
                    }
                    setWrite.add(new setNoDataTextTypeface.AudioAttributesCompatParcelizer(setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer3), setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer4), setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer5), arrayList, arrayList2));
                }
            }
            Set<setNoDataTextTypeface.AudioAttributesCompatParcelizer> setRemoteActionCompatParcelizer = getKycMessage.RemoteActionCompatParcelizer(setWrite);
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            return setRemoteActionCompatParcelizer;
        } finally {
        }
    }

    public static final class RemoteActionCompatParcelizer<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
        }
    }

    public static final class read<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
        }
    }

    private static final List<setHardwareAccelerationEnabled> read(setDrawEntryLabels setdrawentrylabels) {
        int iAudioAttributesCompatParcelizer = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "id");
        int iAudioAttributesCompatParcelizer2 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "seq");
        int iAudioAttributesCompatParcelizer3 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "from");
        int iAudioAttributesCompatParcelizer4 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "to");
        List listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
        while (setdrawentrylabels.write()) {
            listIconCompatParcelizer.add(new setHardwareAccelerationEnabled((int) setdrawentrylabels.IconCompatParcelizer(iAudioAttributesCompatParcelizer), (int) setdrawentrylabels.IconCompatParcelizer(iAudioAttributesCompatParcelizer2), setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer3), setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer4)));
        }
        return IntermediateLoginResponseBody.onPause(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listIconCompatParcelizer));
    }

    private static final Map<String, setNoDataTextTypeface.write> RemoteActionCompatParcelizer(setDrawHoleEnabled setdrawholeenabled, String str) throws Exception {
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(sb.toString());
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            String str2 = null;
            if (!setdrawentrylabels.write()) {
                Map<String, setNoDataTextTypeface.write> map = VideoTimelineResponseBody.read();
                submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
                return map;
            }
            int iAudioAttributesCompatParcelizer = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "name");
            int iAudioAttributesCompatParcelizer2 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "type");
            int iAudioAttributesCompatParcelizer3 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "notnull");
            int iAudioAttributesCompatParcelizer4 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "pk");
            int iAudioAttributesCompatParcelizer5 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "dflt_value");
            Map mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer();
            while (true) {
                String strAudioAttributesCompatParcelizer = setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer);
                int i = iAudioAttributesCompatParcelizer;
                mapRemoteActionCompatParcelizer.put(strAudioAttributesCompatParcelizer, new setNoDataTextTypeface.write(strAudioAttributesCompatParcelizer, setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer2), setdrawentrylabels.IconCompatParcelizer(iAudioAttributesCompatParcelizer3) != 0, (int) setdrawentrylabels.IconCompatParcelizer(iAudioAttributesCompatParcelizer4), setdrawentrylabels.AudioAttributesImplBaseParcelizer(iAudioAttributesCompatParcelizer5) ? str2 : setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer5), 2));
                if (!setdrawentrylabels.write()) {
                    Map<String, setNoDataTextTypeface.write> map2 = VideoTimelineResponseBody.read(mapRemoteActionCompatParcelizer);
                    submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
                    return map2;
                }
                iAudioAttributesCompatParcelizer = i;
                str2 = null;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, th);
                throw th2;
            }
        }
    }

    private static final Set<setNoDataTextTypeface.IconCompatParcelizer> IconCompatParcelizer(setDrawHoleEnabled setdrawholeenabled, String str) throws Exception {
        StringBuilder sb = new StringBuilder("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(sb.toString());
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            int iAudioAttributesCompatParcelizer = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "name");
            int iAudioAttributesCompatParcelizer2 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "origin");
            int iAudioAttributesCompatParcelizer3 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "unique");
            if (iAudioAttributesCompatParcelizer == -1 || iAudioAttributesCompatParcelizer2 == -1 || iAudioAttributesCompatParcelizer3 == -1) {
                submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
                return null;
            }
            Set setWrite = getKycMessage.write();
            while (setdrawentrylabels.write()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "c", (Object) setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer2))) {
                    setNoDataTextTypeface.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setdrawholeenabled, setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer), setdrawentrylabels.IconCompatParcelizer(iAudioAttributesCompatParcelizer3) == 1);
                    if (iconCompatParcelizerAudioAttributesCompatParcelizer == null) {
                        submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
                        return null;
                    }
                    setWrite.add(iconCompatParcelizerAudioAttributesCompatParcelizer);
                }
            }
            Set<setNoDataTextTypeface.IconCompatParcelizer> setRemoteActionCompatParcelizer = getKycMessage.RemoteActionCompatParcelizer(setWrite);
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            return setRemoteActionCompatParcelizer;
        } finally {
        }
    }

    private static final setNoDataTextTypeface.IconCompatParcelizer AudioAttributesCompatParcelizer(setDrawHoleEnabled setdrawholeenabled, String str, boolean z) throws Exception {
        StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(sb.toString());
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            int iAudioAttributesCompatParcelizer = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "seqno");
            int iAudioAttributesCompatParcelizer2 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, CmcdConfiguration.KEY_CONTENT_ID);
            int iAudioAttributesCompatParcelizer3 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "name");
            int iAudioAttributesCompatParcelizer4 = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, "desc");
            if (iAudioAttributesCompatParcelizer == -1 || iAudioAttributesCompatParcelizer2 == -1 || iAudioAttributesCompatParcelizer3 == -1 || iAudioAttributesCompatParcelizer4 == -1) {
                submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (setdrawentrylabels.write()) {
                if (((int) setdrawentrylabels.IconCompatParcelizer(iAudioAttributesCompatParcelizer2)) >= 0) {
                    int iIconCompatParcelizer = (int) setdrawentrylabels.IconCompatParcelizer(iAudioAttributesCompatParcelizer);
                    String strAudioAttributesCompatParcelizer = setdrawentrylabels.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer3);
                    String str2 = setdrawentrylabels.IconCompatParcelizer(iAudioAttributesCompatParcelizer4) > 0 ? "DESC" : "ASC";
                    linkedHashMap.put(Integer.valueOf(iIconCompatParcelizer), strAudioAttributesCompatParcelizer);
                    linkedHashMap2.put(Integer.valueOf(iIconCompatParcelizer), str2);
                }
            }
            List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) linkedHashMap.entrySet(), (Comparator) new RemoteActionCompatParcelizer());
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
            Iterator it = listAudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getValue());
            }
            List listOnPlay = IntermediateLoginResponseBody.onPlay(arrayList);
            List listAudioAttributesCompatParcelizer2 = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) linkedHashMap2.entrySet(), (Comparator) new read());
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer2, 10));
            Iterator it2 = listAudioAttributesCompatParcelizer2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
            }
            setNoDataTextTypeface.IconCompatParcelizer iconCompatParcelizer = new setNoDataTextTypeface.IconCompatParcelizer(str, z, listOnPlay, IntermediateLoginResponseBody.onPlay(arrayList2));
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            return iconCompatParcelizer;
        } finally {
        }
    }

    static {
        new String[]{"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    }
}
