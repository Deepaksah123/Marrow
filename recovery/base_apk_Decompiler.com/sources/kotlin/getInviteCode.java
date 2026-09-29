package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class getInviteCode {
    private static final List<String> AudioAttributesCompatParcelizer;
    private static final Map<RemoteActionCompatParcelizer.IconCompatParcelizer, IconCompatParcelizer> AudioAttributesImplApi21Parcelizer;
    private static final Map<RemoteActionCompatParcelizer.IconCompatParcelizer, getRelatedLessonId> AudioAttributesImplApi26Parcelizer;
    private static final List<getRelatedLessonId> AudioAttributesImplBaseParcelizer;
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(0);
    private static final Map<getRelatedLessonId, getRelatedLessonId> MediaBrowserCompatCustomActionResultReceiver;
    private static final RemoteActionCompatParcelizer.IconCompatParcelizer MediaBrowserCompatItemReceiver;
    private static final Map<String, IconCompatParcelizer> MediaDescriptionCompat;
    private static final Map<String, getRelatedLessonId> RatingCompat;
    private static final List<RemoteActionCompatParcelizer.IconCompatParcelizer> RemoteActionCompatParcelizer;
    private static final Set<String> read;
    private static final Set<getRelatedLessonId> write;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IconCompatParcelizer {
        private final Object AudioAttributesImplBaseParcelizer;
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer("NULL", 0, null);
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer("INDEX", 1, -1);
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer("FALSE", 2, Boolean.FALSE);
        public static final IconCompatParcelizer write = new read("MAP_GET_OR_DEFAULT");
        private static final /* synthetic */ IconCompatParcelizer[] read = RemoteActionCompatParcelizer();

        private IconCompatParcelizer(String str, int i, Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
        }

        static final class read extends IconCompatParcelizer {
            read(String str) {
                super(str, 3);
            }
        }

        private static final /* synthetic */ IconCompatParcelizer[] RemoteActionCompatParcelizer() {
            return new IconCompatParcelizer[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, IconCompatParcelizer, write};
        }

        public /* synthetic */ IconCompatParcelizer(String str, int i) {
            this(str, 3, null);
        }

        public static IconCompatParcelizer valueOf(String str) {
            return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
        }

        public static IconCompatParcelizer[] values() {
            return (IconCompatParcelizer[]) read.clone();
        }
    }

    public enum AudioAttributesCompatParcelizer {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private final String AudioAttributesImplApi26Parcelizer;
        private final boolean RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(String str, boolean z) {
            this.AudioAttributesImplApi26Parcelizer = str;
            this.RemoteActionCompatParcelizer = z;
        }
    }

    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public static AudioAttributesCompatParcelizer read(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            if (AudioAttributesImplApi26Parcelizer().contains(str)) {
                return AudioAttributesCompatParcelizer.ONE_COLLECTION_PARAMETER;
            }
            if (((IconCompatParcelizer) VideoTimelineResponseBody.AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer(), str)) == IconCompatParcelizer.AudioAttributesCompatParcelizer) {
                return AudioAttributesCompatParcelizer.OBJECT_PARAMETER_GENERIC;
            }
            return AudioAttributesCompatParcelizer.OBJECT_PARAMETER_NON_GENERIC;
        }

        public static final class IconCompatParcelizer {
            private final String IconCompatParcelizer;
            private final getRelatedLessonId read;

            public IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, String str) {
                toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
                toMagicModuleMetaRepoModel.write(str, "");
                this.read = getrelatedlessonid;
                this.IconCompatParcelizer = str;
            }

            public final String IconCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public final getRelatedLessonId read() {
                return this.read;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IconCompatParcelizer)) {
                    return false;
                }
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, iconCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer);
            }

            public final int hashCode() {
                return (this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(name=");
                sb.append(this.read);
                sb.append(", signature=");
                sb.append(this.IconCompatParcelizer);
                sb.append(')');
                return sb.toString();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static IconCompatParcelizer read(String str, String str2, String str3, String str4) {
            getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(str2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
            getPeopleSolved getpeoplesolved = getPeopleSolved.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append('(');
            sb.append(str3);
            sb.append(')');
            sb.append(str4);
            return new IconCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, getPeopleSolved.AudioAttributesCompatParcelizer(str, sb.toString()));
        }

        private static List<String> AudioAttributesImplApi26Parcelizer() {
            return getInviteCode.AudioAttributesCompatParcelizer;
        }

        private static Map<String, IconCompatParcelizer> AudioAttributesImplBaseParcelizer() {
            return getInviteCode.MediaDescriptionCompat;
        }

        public static Set<getRelatedLessonId> read() {
            return getInviteCode.write;
        }

        public static Set<String> AudioAttributesCompatParcelizer() {
            return getInviteCode.read;
        }

        public static IconCompatParcelizer write() {
            return getInviteCode.MediaBrowserCompatItemReceiver;
        }

        public static Map<String, getRelatedLessonId> IconCompatParcelizer() {
            return getInviteCode.RatingCompat;
        }

        public static List<getRelatedLessonId> RemoteActionCompatParcelizer() {
            return getInviteCode.AudioAttributesImplBaseParcelizer;
        }

        private static Map<getRelatedLessonId, getRelatedLessonId> AudioAttributesImplApi21Parcelizer() {
            return getInviteCode.MediaBrowserCompatCustomActionResultReceiver;
        }

        public static getRelatedLessonId RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return AudioAttributesImplApi21Parcelizer().get(getrelatedlessonid);
        }

        public static boolean AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return RemoteActionCompatParcelizer().contains(getrelatedlessonid);
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    static {
        Set<String> setIconCompatParcelizer = getKycMessage.IconCompatParcelizer("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setIconCompatParcelizer, 10));
        for (String str : setIconCompatParcelizer) {
            String strAudioAttributesCompatParcelizer = setOption2AnsweredCount.BOOLEAN.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            arrayList.add(RemoteActionCompatParcelizer.read("java/util/Collection", str, "Ljava/util/Collection;", strAudioAttributesCompatParcelizer));
        }
        ArrayList arrayList2 = arrayList;
        RemoteActionCompatParcelizer = arrayList2;
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((RemoteActionCompatParcelizer.IconCompatParcelizer) it.next()).IconCompatParcelizer());
        }
        AudioAttributesCompatParcelizer = arrayList4;
        List<RemoteActionCompatParcelizer.IconCompatParcelizer> list = RemoteActionCompatParcelizer;
        ArrayList arrayList5 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((RemoteActionCompatParcelizer.IconCompatParcelizer) it2.next()).read().AudioAttributesCompatParcelizer());
        }
        getPeopleSolved getpeoplesolved = getPeopleSolved.AudioAttributesCompatParcelizer;
        String strWrite = getPeopleSolved.write("Collection");
        String strAudioAttributesCompatParcelizer2 = setOption2AnsweredCount.BOOLEAN.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer2, "");
        Pair pairWrite = setAction.write(RemoteActionCompatParcelizer.read(strWrite, "contains", "Ljava/lang/Object;", strAudioAttributesCompatParcelizer2), IconCompatParcelizer.IconCompatParcelizer);
        String strWrite2 = getPeopleSolved.write("Collection");
        String strAudioAttributesCompatParcelizer3 = setOption2AnsweredCount.BOOLEAN.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer3, "");
        Pair pairWrite2 = setAction.write(RemoteActionCompatParcelizer.read(strWrite2, "remove", "Ljava/lang/Object;", strAudioAttributesCompatParcelizer3), IconCompatParcelizer.IconCompatParcelizer);
        String strWrite3 = getPeopleSolved.write("Map");
        String strAudioAttributesCompatParcelizer4 = setOption2AnsweredCount.BOOLEAN.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer4, "");
        Pair pairWrite3 = setAction.write(RemoteActionCompatParcelizer.read(strWrite3, "containsKey", "Ljava/lang/Object;", strAudioAttributesCompatParcelizer4), IconCompatParcelizer.IconCompatParcelizer);
        String strWrite4 = getPeopleSolved.write("Map");
        String strAudioAttributesCompatParcelizer5 = setOption2AnsweredCount.BOOLEAN.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer5, "");
        Pair pairWrite4 = setAction.write(RemoteActionCompatParcelizer.read(strWrite4, "containsValue", "Ljava/lang/Object;", strAudioAttributesCompatParcelizer5), IconCompatParcelizer.IconCompatParcelizer);
        String strWrite5 = getPeopleSolved.write("Map");
        String strAudioAttributesCompatParcelizer6 = setOption2AnsweredCount.BOOLEAN.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer6, "");
        Pair pairWrite5 = setAction.write(RemoteActionCompatParcelizer.read(strWrite5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strAudioAttributesCompatParcelizer6), IconCompatParcelizer.IconCompatParcelizer);
        Pair pairWrite6 = setAction.write(RemoteActionCompatParcelizer.read(getPeopleSolved.write("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), IconCompatParcelizer.write);
        Pair pairWrite7 = setAction.write(RemoteActionCompatParcelizer.read(getPeopleSolved.write("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), IconCompatParcelizer.AudioAttributesCompatParcelizer);
        Pair pairWrite8 = setAction.write(RemoteActionCompatParcelizer.read(getPeopleSolved.write("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), IconCompatParcelizer.AudioAttributesCompatParcelizer);
        String strWrite6 = getPeopleSolved.write("List");
        String strAudioAttributesCompatParcelizer7 = setOption2AnsweredCount.INT.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer7, "");
        Pair pairWrite9 = setAction.write(RemoteActionCompatParcelizer.read(strWrite6, "indexOf", "Ljava/lang/Object;", strAudioAttributesCompatParcelizer7), IconCompatParcelizer.RemoteActionCompatParcelizer);
        String strWrite7 = getPeopleSolved.write("List");
        String strAudioAttributesCompatParcelizer8 = setOption2AnsweredCount.INT.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer8, "");
        Map<RemoteActionCompatParcelizer.IconCompatParcelizer, IconCompatParcelizer> mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, pairWrite3, pairWrite4, pairWrite5, pairWrite6, pairWrite7, pairWrite8, pairWrite9, setAction.write(RemoteActionCompatParcelizer.read(strWrite7, "lastIndexOf", "Ljava/lang/Object;", strAudioAttributesCompatParcelizer8), IconCompatParcelizer.RemoteActionCompatParcelizer));
        AudioAttributesImplApi21Parcelizer = mapRemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap = new LinkedHashMap(VideoTimelineResponseBody.read(mapRemoteActionCompatParcelizer.size()));
        Iterator<T> it3 = mapRemoteActionCompatParcelizer.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((RemoteActionCompatParcelizer.IconCompatParcelizer) entry.getKey()).IconCompatParcelizer(), entry.getValue());
        }
        MediaDescriptionCompat = linkedHashMap;
        Set setRemoteActionCompatParcelizer = getKycMessage.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer.keySet(), RemoteActionCompatParcelizer);
        ArrayList arrayList6 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setRemoteActionCompatParcelizer, 10));
        Iterator it4 = setRemoteActionCompatParcelizer.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((RemoteActionCompatParcelizer.IconCompatParcelizer) it4.next()).read());
        }
        write = IntermediateLoginResponseBody.onPlayFromUri(arrayList6);
        ArrayList arrayList7 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setRemoteActionCompatParcelizer, 10));
        Iterator it5 = setRemoteActionCompatParcelizer.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((RemoteActionCompatParcelizer.IconCompatParcelizer) it5.next()).IconCompatParcelizer());
        }
        read = IntermediateLoginResponseBody.onPlayFromUri(arrayList7);
        String strAudioAttributesCompatParcelizer9 = setOption2AnsweredCount.INT.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer9, "");
        RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer = RemoteActionCompatParcelizer.read("java/util/List", "removeAt", strAudioAttributesCompatParcelizer9, "Ljava/lang/Object;");
        MediaBrowserCompatItemReceiver = iconCompatParcelizer;
        getPeopleSolved getpeoplesolved2 = getPeopleSolved.AudioAttributesCompatParcelizer;
        String strAudioAttributesCompatParcelizer10 = getPeopleSolved.AudioAttributesCompatParcelizer("Number");
        String strAudioAttributesCompatParcelizer11 = setOption2AnsweredCount.BYTE.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer11, "");
        Pair pairWrite10 = setAction.write(RemoteActionCompatParcelizer.read(strAudioAttributesCompatParcelizer10, "toByte", "", strAudioAttributesCompatParcelizer11), getRelatedLessonId.RemoteActionCompatParcelizer("byteValue"));
        String strAudioAttributesCompatParcelizer12 = getPeopleSolved.AudioAttributesCompatParcelizer("Number");
        String strAudioAttributesCompatParcelizer13 = setOption2AnsweredCount.SHORT.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer13, "");
        Pair pairWrite11 = setAction.write(RemoteActionCompatParcelizer.read(strAudioAttributesCompatParcelizer12, "toShort", "", strAudioAttributesCompatParcelizer13), getRelatedLessonId.RemoteActionCompatParcelizer("shortValue"));
        String strAudioAttributesCompatParcelizer14 = getPeopleSolved.AudioAttributesCompatParcelizer("Number");
        String strAudioAttributesCompatParcelizer15 = setOption2AnsweredCount.INT.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer15, "");
        Pair pairWrite12 = setAction.write(RemoteActionCompatParcelizer.read(strAudioAttributesCompatParcelizer14, "toInt", "", strAudioAttributesCompatParcelizer15), getRelatedLessonId.RemoteActionCompatParcelizer("intValue"));
        String strAudioAttributesCompatParcelizer16 = getPeopleSolved.AudioAttributesCompatParcelizer("Number");
        String strAudioAttributesCompatParcelizer17 = setOption2AnsweredCount.LONG.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer17, "");
        Pair pairWrite13 = setAction.write(RemoteActionCompatParcelizer.read(strAudioAttributesCompatParcelizer16, "toLong", "", strAudioAttributesCompatParcelizer17), getRelatedLessonId.RemoteActionCompatParcelizer("longValue"));
        String strAudioAttributesCompatParcelizer18 = getPeopleSolved.AudioAttributesCompatParcelizer("Number");
        String strAudioAttributesCompatParcelizer19 = setOption2AnsweredCount.FLOAT.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer19, "");
        Pair pairWrite14 = setAction.write(RemoteActionCompatParcelizer.read(strAudioAttributesCompatParcelizer18, "toFloat", "", strAudioAttributesCompatParcelizer19), getRelatedLessonId.RemoteActionCompatParcelizer("floatValue"));
        String strAudioAttributesCompatParcelizer20 = getPeopleSolved.AudioAttributesCompatParcelizer("Number");
        String strAudioAttributesCompatParcelizer21 = setOption2AnsweredCount.DOUBLE.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer21, "");
        Pair pairWrite15 = setAction.write(RemoteActionCompatParcelizer.read(strAudioAttributesCompatParcelizer20, "toDouble", "", strAudioAttributesCompatParcelizer21), getRelatedLessonId.RemoteActionCompatParcelizer("doubleValue"));
        Pair pairWrite16 = setAction.write(iconCompatParcelizer, getRelatedLessonId.RemoteActionCompatParcelizer("remove"));
        String strAudioAttributesCompatParcelizer22 = getPeopleSolved.AudioAttributesCompatParcelizer("CharSequence");
        String strAudioAttributesCompatParcelizer23 = setOption2AnsweredCount.INT.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer23, "");
        String strAudioAttributesCompatParcelizer24 = setOption2AnsweredCount.CHAR.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer24, "");
        Map<RemoteActionCompatParcelizer.IconCompatParcelizer, getRelatedLessonId> mapRemoteActionCompatParcelizer2 = VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite10, pairWrite11, pairWrite12, pairWrite13, pairWrite14, pairWrite15, pairWrite16, setAction.write(RemoteActionCompatParcelizer.read(strAudioAttributesCompatParcelizer22, "get", strAudioAttributesCompatParcelizer23, strAudioAttributesCompatParcelizer24), getRelatedLessonId.RemoteActionCompatParcelizer("charAt")));
        AudioAttributesImplApi26Parcelizer = mapRemoteActionCompatParcelizer2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(VideoTimelineResponseBody.read(mapRemoteActionCompatParcelizer2.size()));
        Iterator<T> it6 = mapRemoteActionCompatParcelizer2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((RemoteActionCompatParcelizer.IconCompatParcelizer) entry2.getKey()).IconCompatParcelizer(), entry2.getValue());
        }
        RatingCompat = linkedHashMap2;
        Set<RemoteActionCompatParcelizer.IconCompatParcelizer> setKeySet = AudioAttributesImplApi26Parcelizer.keySet();
        ArrayList arrayList8 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setKeySet, 10));
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            arrayList8.add(((RemoteActionCompatParcelizer.IconCompatParcelizer) it7.next()).read());
        }
        AudioAttributesImplBaseParcelizer = arrayList8;
        Set<Map.Entry<RemoteActionCompatParcelizer.IconCompatParcelizer, getRelatedLessonId>> setEntrySet = AudioAttributesImplApi26Parcelizer.entrySet();
        ArrayList arrayList9 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it8.next();
            arrayList9.add(new Pair(((RemoteActionCompatParcelizer.IconCompatParcelizer) entry3.getKey()).read(), entry3.getValue()));
        }
        ArrayList<Pair> arrayList10 = arrayList9;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList10, 10)), 16));
        for (Pair pair : arrayList10) {
            linkedHashMap3.put((getRelatedLessonId) pair.IconCompatParcelizer(), (getRelatedLessonId) pair.write());
        }
        MediaBrowserCompatCustomActionResultReceiver = linkedHashMap3;
    }
}
