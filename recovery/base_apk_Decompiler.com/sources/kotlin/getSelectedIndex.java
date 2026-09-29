package kotlin;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import kotlin.getBitrateEstimate;
import kotlin.onPrepareError;

/* JADX INFO: loaded from: classes3.dex */
public class getSelectedIndex {
    private static final Map<Character, Character> AudioAttributesCompatParcelizer;
    private static final Logger RemoteActionCompatParcelizer = Logger.getLogger(getSelectedIndex.class.getName());
    private static getSelectedIndex read;
    private final getSelectionData AudioAttributesImplBaseParcelizer;
    private final Map<Integer, List<String>> IconCompatParcelizer;
    private final DownloadHelperFakeBandwidthMeter AudioAttributesImplApi26Parcelizer = DownloadHelperDownloadTrackSelectionFactory.IconCompatParcelizer();
    private final Set<String> MediaBrowserCompatCustomActionResultReceiver = new HashSet(35);
    private final createTrackSelections MediaBrowserCompatItemReceiver = new createTrackSelections();
    private final Set<String> AudioAttributesImplApi21Parcelizer = new HashSet(320);
    private final Set<Integer> write = new HashSet();

    public enum RemoteActionCompatParcelizer {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    static {
        HashMap map = new HashMap();
        map.put(52, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        map.put(54, "9");
        Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map<Character, Character> mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        AudioAttributesCompatParcelizer = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        Iterator<Character> it = mapUnmodifiableMap.keySet().iterator();
        while (it.hasNext()) {
            char cCharValue = it.next().charValue();
            map6.put(Character.valueOf(Character.toLowerCase(cCharValue)), Character.valueOf(cCharValue));
            map6.put(Character.valueOf(cCharValue), Character.valueOf(cCharValue));
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map7 = AudioAttributesCompatParcelizer;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        Pattern.compile("(\\p{Nd})");
        Pattern.compile("[+＋\\p{Nd}]");
        Pattern.compile("[\\\\/] *x");
        Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        StringBuilder sb2 = new StringBuilder("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*");
        sb2.append(string);
        sb2.append("\\p{Nd}]*");
        String string2 = sb2.toString();
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(",;xｘ#＃~～");
        AudioAttributesCompatParcelizer("xｘ#＃~～");
        StringBuilder sb3 = new StringBuilder("(?:");
        sb3.append(strAudioAttributesCompatParcelizer);
        sb3.append(")$");
        Pattern.compile(sb3.toString(), 66);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string2);
        sb4.append("(?:");
        sb4.append(strAudioAttributesCompatParcelizer);
        sb4.append(")?");
        Pattern.compile(sb4.toString(), 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        read = null;
    }

    private static String AudioAttributesCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[");
        sb.append(str);
        sb.append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#");
        return sb.toString();
    }

    private getSelectedIndex(getSelectionData getselectiondata, Map<Integer, List<String>> map) {
        this.AudioAttributesImplBaseParcelizer = getselectiondata;
        this.IconCompatParcelizer = map;
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            if (value.size() == 1 && "001".equals(value.get(0))) {
                this.write.add(entry.getKey());
            } else {
                this.AudioAttributesImplApi21Parcelizer.addAll(value);
            }
        }
        if (this.AudioAttributesImplApi21Parcelizer.remove("001")) {
            RemoteActionCompatParcelizer.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.MediaBrowserCompatCustomActionResultReceiver.addAll(map.get(1));
    }

    private static void RemoteActionCompatParcelizer(getSelectedIndex getselectedindex) {
        synchronized (getSelectedIndex.class) {
            read = getselectedindex;
        }
    }

    public static getSelectedIndex IconCompatParcelizer() {
        getSelectedIndex getselectedindex;
        synchronized (getSelectedIndex.class) {
            if (read == null) {
                RemoteActionCompatParcelizer(write(getSelectionReason.IconCompatParcelizer));
            }
            getselectedindex = read;
        }
        return getselectedindex;
    }

    private static getSelectedIndex write(DownloadHelperCallback downloadHelperCallback) {
        if (downloadHelperCallback == null) {
            throw new IllegalArgumentException("metadataLoader could not be null.");
        }
        return IconCompatParcelizer(new DownloadHelperDownloadTrackSelection(downloadHelperCallback));
    }

    private static getSelectedIndex IconCompatParcelizer(getSelectionData getselectiondata) {
        return new getSelectedIndex(getselectiondata, DownloadHelper1.RemoteActionCompatParcelizer());
    }

    private boolean RemoteActionCompatParcelizer(String str) {
        return str != null && this.AudioAttributesImplApi21Parcelizer.contains(str);
    }

    private onPrepareError.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, String str) {
        if ("001".equals(str)) {
            return RemoteActionCompatParcelizer(i);
        }
        return read(str);
    }

    private static String read(getBitrateEstimate.read readVar) {
        StringBuilder sb = new StringBuilder();
        if (readVar.RemoteActionCompatParcelizer() && readVar.read() > 0) {
            char[] cArr = new char[readVar.read()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(readVar.write());
        return sb.toString();
    }

    private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str, onPrepareError.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (!AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.read())) {
            return RemoteActionCompatParcelizer.UNKNOWN;
        }
        if (AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer())) {
            return RemoteActionCompatParcelizer.PREMIUM_RATE;
        }
        if (AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.RatingCompat())) {
            return RemoteActionCompatParcelizer.TOLL_FREE;
        }
        if (AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver())) {
            return RemoteActionCompatParcelizer.SHARED_COST;
        }
        if (AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem())) {
            return RemoteActionCompatParcelizer.VOIP;
        }
        if (AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer())) {
            return RemoteActionCompatParcelizer.PERSONAL_NUMBER;
        }
        if (AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer())) {
            return RemoteActionCompatParcelizer.PAGER;
        }
        if (AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.MediaDescriptionCompat())) {
            return RemoteActionCompatParcelizer.UAN;
        }
        if (AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver())) {
            return RemoteActionCompatParcelizer.VOICEMAIL;
        }
        if (AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer())) {
            if (audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                return RemoteActionCompatParcelizer.FIXED_LINE_OR_MOBILE;
            }
            if (AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.write())) {
                return RemoteActionCompatParcelizer.FIXED_LINE_OR_MOBILE;
            }
            return RemoteActionCompatParcelizer.FIXED_LINE;
        }
        if (!audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver() && AudioAttributesCompatParcelizer(str, audioAttributesCompatParcelizer.write())) {
            return RemoteActionCompatParcelizer.MOBILE;
        }
        return RemoteActionCompatParcelizer.UNKNOWN;
    }

    private onPrepareError.AudioAttributesCompatParcelizer read(String str) {
        if (RemoteActionCompatParcelizer(str)) {
            return this.AudioAttributesImplBaseParcelizer.write(str);
        }
        return null;
    }

    private onPrepareError.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
        if (this.IconCompatParcelizer.containsKey(Integer.valueOf(i))) {
            return this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(i);
        }
        return null;
    }

    private boolean AudioAttributesCompatParcelizer(String str, onPrepareError.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        int length = str.length();
        List<Integer> listIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
        if (listIconCompatParcelizer.size() <= 0 || listIconCompatParcelizer.contains(Integer.valueOf(length))) {
            return this.AudioAttributesImplApi26Parcelizer.read(str, remoteActionCompatParcelizer);
        }
        return false;
    }

    public final boolean AudioAttributesCompatParcelizer(getBitrateEstimate.read readVar) {
        return RemoteActionCompatParcelizer(readVar, IconCompatParcelizer(readVar));
    }

    private boolean RemoteActionCompatParcelizer(getBitrateEstimate.read readVar, String str) {
        int iAudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer();
        onPrepareError.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, str);
        if (audioAttributesCompatParcelizerRemoteActionCompatParcelizer != null) {
            return ("001".equals(str) || iAudioAttributesCompatParcelizer == write(str)) && RemoteActionCompatParcelizer(read(readVar), audioAttributesCompatParcelizerRemoteActionCompatParcelizer) != RemoteActionCompatParcelizer.UNKNOWN;
        }
        return false;
    }

    private String IconCompatParcelizer(getBitrateEstimate.read readVar) {
        int iAudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer();
        List<String> list = this.IconCompatParcelizer.get(Integer.valueOf(iAudioAttributesCompatParcelizer));
        if (list == null) {
            Logger logger = RemoteActionCompatParcelizer;
            Level level = Level.INFO;
            StringBuilder sb = new StringBuilder("Missing/invalid country_code (");
            sb.append(iAudioAttributesCompatParcelizer);
            sb.append(")");
            logger.log(level, sb.toString());
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return write(readVar, list);
    }

    private String write(getBitrateEstimate.read readVar, List<String> list) {
        String str = read(readVar);
        for (String str2 : list) {
            onPrepareError.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = read(str2);
            if (audioAttributesCompatParcelizer.MediaMetadataCompat()) {
                if (this.MediaBrowserCompatItemReceiver.read(audioAttributesCompatParcelizer.IconCompatParcelizer()).matcher(str).lookingAt()) {
                    return str2;
                }
            } else if (RemoteActionCompatParcelizer(str, audioAttributesCompatParcelizer) != RemoteActionCompatParcelizer.UNKNOWN) {
                return str2;
            }
        }
        return null;
    }

    private int write(String str) {
        onPrepareError.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = read(str);
        if (audioAttributesCompatParcelizer == null) {
            throw new IllegalArgumentException("Invalid region code: ".concat(String.valueOf(str)));
        }
        return audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
