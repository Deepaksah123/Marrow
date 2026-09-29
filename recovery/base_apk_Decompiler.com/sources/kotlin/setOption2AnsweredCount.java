package kotlin;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public enum setOption2AnsweredCount {
    BOOLEAN(getShowNotesWatermark.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(getShowNotesWatermark.CHAR, "char", "C", "java.lang.Character"),
    BYTE(getShowNotesWatermark.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(getShowNotesWatermark.SHORT, "short", "S", "java.lang.Short"),
    INT(getShowNotesWatermark.INT, "int", "I", "java.lang.Integer"),
    FLOAT(getShowNotesWatermark.FLOAT, "float", "F", "java.lang.Float"),
    LONG(getShowNotesWatermark.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(getShowNotesWatermark.DOUBLE, "double", "D", "java.lang.Double");

    private final String MediaMetadataCompat;
    private final String RatingCompat;
    private final getShowNotesWatermark onAddQueueItem;
    private final getNotesCount onCustomAction;
    private static final Set<getNotesCount> MediaBrowserCompatSearchResultReceiver = new HashSet();
    private static final Map<String, setOption2AnsweredCount> MediaDescriptionCompat = new HashMap();
    private static final Map<getShowNotesWatermark, setOption2AnsweredCount> MediaBrowserCompatMediaItem = new EnumMap(getShowNotesWatermark.class);
    private static final Map<String, setOption2AnsweredCount> AudioAttributesImplApi21Parcelizer = new HashMap();

    static {
        for (setOption2AnsweredCount setoption2answeredcount : values()) {
            MediaBrowserCompatSearchResultReceiver.add(setoption2answeredcount.IconCompatParcelizer());
            MediaDescriptionCompat.put(setoption2answeredcount.RemoteActionCompatParcelizer(), setoption2answeredcount);
            MediaBrowserCompatMediaItem.put(setoption2answeredcount.write(), setoption2answeredcount);
            AudioAttributesImplApi21Parcelizer.put(setoption2answeredcount.AudioAttributesCompatParcelizer(), setoption2answeredcount);
        }
    }

    public static setOption2AnsweredCount RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            AudioAttributesCompatParcelizer(1);
        }
        setOption2AnsweredCount setoption2answeredcount = MediaDescriptionCompat.get(str);
        if (setoption2answeredcount == null) {
            throw new AssertionError("Non-primitive type name passed: ".concat(String.valueOf(str)));
        }
        if (setoption2answeredcount == null) {
            AudioAttributesCompatParcelizer(2);
        }
        return setoption2answeredcount;
    }

    public static setOption2AnsweredCount AudioAttributesCompatParcelizer(getShowNotesWatermark getshownoteswatermark) {
        if (getshownoteswatermark == null) {
            AudioAttributesCompatParcelizer(3);
        }
        setOption2AnsweredCount setoption2answeredcount = MediaBrowserCompatMediaItem.get(getshownoteswatermark);
        if (setoption2answeredcount == null) {
            AudioAttributesCompatParcelizer(4);
        }
        return setoption2answeredcount;
    }

    setOption2AnsweredCount(getShowNotesWatermark getshownoteswatermark, String str, String str2, String str3) {
        if (getshownoteswatermark == null) {
            AudioAttributesCompatParcelizer(6);
        }
        this.onAddQueueItem = getshownoteswatermark;
        this.MediaMetadataCompat = str;
        this.RatingCompat = str2;
        this.onCustomAction = new getNotesCount(str3);
    }

    public final getShowNotesWatermark write() {
        getShowNotesWatermark getshownoteswatermark = this.onAddQueueItem;
        if (getshownoteswatermark == null) {
            AudioAttributesCompatParcelizer(10);
        }
        return getshownoteswatermark;
    }

    public final String RemoteActionCompatParcelizer() {
        String str = this.MediaMetadataCompat;
        if (str == null) {
            AudioAttributesCompatParcelizer(11);
        }
        return str;
    }

    public final String AudioAttributesCompatParcelizer() {
        String str = this.RatingCompat;
        if (str == null) {
            AudioAttributesCompatParcelizer(12);
        }
        return str;
    }

    public final getNotesCount IconCompatParcelizer() {
        getNotesCount getnotescount = this.onCustomAction;
        if (getnotescount == null) {
            AudioAttributesCompatParcelizer(13);
        }
        return getnotescount;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void AudioAttributesCompatParcelizer(int r7) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOption2AnsweredCount.AudioAttributesCompatParcelizer(int):void");
    }
}
