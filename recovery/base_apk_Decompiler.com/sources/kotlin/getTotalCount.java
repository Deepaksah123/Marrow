package kotlin;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.toHomeLessonIndex;

/* JADX INFO: loaded from: classes4.dex */
public class getTotalCount implements setRatingCount {
    private static final List<String> AudioAttributesCompatParcelizer;
    private final String[] IconCompatParcelizer;
    private final Set<Integer> read;
    private final List<toHomeLessonIndex.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer> write;

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[toHomeLessonIndex.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.EnumC0152AudioAttributesCompatParcelizer.values().length];
            try {
                iArr[toHomeLessonIndex.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.EnumC0152AudioAttributesCompatParcelizer.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[toHomeLessonIndex.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.EnumC0152AudioAttributesCompatParcelizer.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[toHomeLessonIndex.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.EnumC0152AudioAttributesCompatParcelizer.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public getTotalCount(String[] strArr, Set<Integer> set, List<toHomeLessonIndex.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer> list) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(set, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = strArr;
        this.read = set;
        this.write = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // kotlin.setRatingCount
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String AudioAttributesCompatParcelizer(int r9) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTotalCount.AudioAttributesCompatParcelizer(int):java.lang.String");
    }

    @Override // kotlin.setRatingCount
    public final String write(int i) {
        return AudioAttributesCompatParcelizer(i);
    }

    @Override // kotlin.setRatingCount
    public final boolean IconCompatParcelizer(int i) {
        return this.read.contains(Integer.valueOf(i));
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    static {
        new IconCompatParcelizer((byte) 0);
        String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62);
        StringBuilder sb = new StringBuilder();
        sb.append(strRemoteActionCompatParcelizer);
        sb.append("/Any");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strRemoteActionCompatParcelizer);
        sb2.append("/Nothing");
        String string2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strRemoteActionCompatParcelizer);
        sb3.append("/Unit");
        String string3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(strRemoteActionCompatParcelizer);
        sb4.append("/Throwable");
        String string4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(strRemoteActionCompatParcelizer);
        sb5.append("/Number");
        String string5 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(strRemoteActionCompatParcelizer);
        sb6.append("/Byte");
        String string6 = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(strRemoteActionCompatParcelizer);
        sb7.append("/Double");
        String string7 = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(strRemoteActionCompatParcelizer);
        sb8.append("/Float");
        String string8 = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(strRemoteActionCompatParcelizer);
        sb9.append("/Int");
        String string9 = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append(strRemoteActionCompatParcelizer);
        sb10.append("/Long");
        String string10 = sb10.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(strRemoteActionCompatParcelizer);
        sb11.append("/Short");
        String string11 = sb11.toString();
        StringBuilder sb12 = new StringBuilder();
        sb12.append(strRemoteActionCompatParcelizer);
        sb12.append("/Boolean");
        String string12 = sb12.toString();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(strRemoteActionCompatParcelizer);
        sb13.append("/Char");
        String string13 = sb13.toString();
        StringBuilder sb14 = new StringBuilder();
        sb14.append(strRemoteActionCompatParcelizer);
        sb14.append("/CharSequence");
        String string14 = sb14.toString();
        StringBuilder sb15 = new StringBuilder();
        sb15.append(strRemoteActionCompatParcelizer);
        sb15.append("/String");
        String string15 = sb15.toString();
        StringBuilder sb16 = new StringBuilder();
        sb16.append(strRemoteActionCompatParcelizer);
        sb16.append("/Comparable");
        String string16 = sb16.toString();
        StringBuilder sb17 = new StringBuilder();
        sb17.append(strRemoteActionCompatParcelizer);
        sb17.append("/Enum");
        String string17 = sb17.toString();
        StringBuilder sb18 = new StringBuilder();
        sb18.append(strRemoteActionCompatParcelizer);
        sb18.append("/Array");
        String string18 = sb18.toString();
        StringBuilder sb19 = new StringBuilder();
        sb19.append(strRemoteActionCompatParcelizer);
        sb19.append("/ByteArray");
        String string19 = sb19.toString();
        StringBuilder sb20 = new StringBuilder();
        sb20.append(strRemoteActionCompatParcelizer);
        sb20.append("/DoubleArray");
        String string20 = sb20.toString();
        StringBuilder sb21 = new StringBuilder();
        sb21.append(strRemoteActionCompatParcelizer);
        sb21.append("/FloatArray");
        String string21 = sb21.toString();
        StringBuilder sb22 = new StringBuilder();
        sb22.append(strRemoteActionCompatParcelizer);
        sb22.append("/IntArray");
        String string22 = sb22.toString();
        StringBuilder sb23 = new StringBuilder();
        sb23.append(strRemoteActionCompatParcelizer);
        sb23.append("/LongArray");
        String string23 = sb23.toString();
        StringBuilder sb24 = new StringBuilder();
        sb24.append(strRemoteActionCompatParcelizer);
        sb24.append("/ShortArray");
        String string24 = sb24.toString();
        StringBuilder sb25 = new StringBuilder();
        sb25.append(strRemoteActionCompatParcelizer);
        sb25.append("/BooleanArray");
        String string25 = sb25.toString();
        StringBuilder sb26 = new StringBuilder();
        sb26.append(strRemoteActionCompatParcelizer);
        sb26.append("/CharArray");
        String string26 = sb26.toString();
        StringBuilder sb27 = new StringBuilder();
        sb27.append(strRemoteActionCompatParcelizer);
        sb27.append("/Cloneable");
        String string27 = sb27.toString();
        StringBuilder sb28 = new StringBuilder();
        sb28.append(strRemoteActionCompatParcelizer);
        sb28.append("/Annotation");
        String string28 = sb28.toString();
        StringBuilder sb29 = new StringBuilder();
        sb29.append(strRemoteActionCompatParcelizer);
        sb29.append("/collections/Iterable");
        String string29 = sb29.toString();
        StringBuilder sb30 = new StringBuilder();
        sb30.append(strRemoteActionCompatParcelizer);
        sb30.append("/collections/MutableIterable");
        String string30 = sb30.toString();
        StringBuilder sb31 = new StringBuilder();
        sb31.append(strRemoteActionCompatParcelizer);
        sb31.append("/collections/Collection");
        String string31 = sb31.toString();
        StringBuilder sb32 = new StringBuilder();
        sb32.append(strRemoteActionCompatParcelizer);
        sb32.append("/collections/MutableCollection");
        String string32 = sb32.toString();
        StringBuilder sb33 = new StringBuilder();
        sb33.append(strRemoteActionCompatParcelizer);
        sb33.append("/collections/List");
        String string33 = sb33.toString();
        StringBuilder sb34 = new StringBuilder();
        sb34.append(strRemoteActionCompatParcelizer);
        sb34.append("/collections/MutableList");
        String string34 = sb34.toString();
        StringBuilder sb35 = new StringBuilder();
        sb35.append(strRemoteActionCompatParcelizer);
        sb35.append("/collections/Set");
        String string35 = sb35.toString();
        StringBuilder sb36 = new StringBuilder();
        sb36.append(strRemoteActionCompatParcelizer);
        sb36.append("/collections/MutableSet");
        String string36 = sb36.toString();
        StringBuilder sb37 = new StringBuilder();
        sb37.append(strRemoteActionCompatParcelizer);
        sb37.append("/collections/Map");
        String string37 = sb37.toString();
        StringBuilder sb38 = new StringBuilder();
        sb38.append(strRemoteActionCompatParcelizer);
        sb38.append("/collections/MutableMap");
        String string38 = sb38.toString();
        StringBuilder sb39 = new StringBuilder();
        sb39.append(strRemoteActionCompatParcelizer);
        sb39.append("/collections/Map.Entry");
        String string39 = sb39.toString();
        StringBuilder sb40 = new StringBuilder();
        sb40.append(strRemoteActionCompatParcelizer);
        sb40.append("/collections/MutableMap.MutableEntry");
        String string40 = sb40.toString();
        StringBuilder sb41 = new StringBuilder();
        sb41.append(strRemoteActionCompatParcelizer);
        sb41.append("/collections/Iterator");
        String string41 = sb41.toString();
        StringBuilder sb42 = new StringBuilder();
        sb42.append(strRemoteActionCompatParcelizer);
        sb42.append("/collections/MutableIterator");
        String string42 = sb42.toString();
        StringBuilder sb43 = new StringBuilder();
        sb43.append(strRemoteActionCompatParcelizer);
        sb43.append("/collections/ListIterator");
        String string43 = sb43.toString();
        StringBuilder sb44 = new StringBuilder();
        sb44.append(strRemoteActionCompatParcelizer);
        sb44.append("/collections/MutableListIterator");
        List<String> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, sb44.toString()});
        AudioAttributesCompatParcelizer = listRemoteActionCompatParcelizer;
        Iterable<SyncResult> iterableOnPlayFromSearch = IntermediateLoginResponseBody.onPlayFromSearch(listRemoteActionCompatParcelizer);
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterableOnPlayFromSearch, 10)), 16));
        for (SyncResult syncResult : iterableOnPlayFromSearch) {
            linkedHashMap.put((String) syncResult.write(), Integer.valueOf(syncResult.AudioAttributesCompatParcelizer()));
        }
    }
}
