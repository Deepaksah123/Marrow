package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class acceptContentVisitor {
    private final List<Integer> AudioAttributesCompatParcelizer;
    private final List<String> IconCompatParcelizer;
    private final List<String> write;

    public static acceptContentVisitor IconCompatParcelizer(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        read(str, arrayList, arrayList2, arrayList3);
        return new acceptContentVisitor(arrayList, arrayList2, arrayList3);
    }

    private acceptContentVisitor(List<String> list, List<Integer> list2, List<String> list3) {
        this.write = list;
        this.AudioAttributesCompatParcelizer = list2;
        this.IconCompatParcelizer = list3;
    }

    public final String write(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.AudioAttributesCompatParcelizer.size(); i2++) {
            sb.append(this.write.get(i2));
            if (this.AudioAttributesCompatParcelizer.get(i2).intValue() == 1) {
                sb.append(str);
            } else if (this.AudioAttributesCompatParcelizer.get(i2).intValue() == 2) {
                sb.append(String.format(Locale.US, this.IconCompatParcelizer.get(i2), Long.valueOf(j)));
            } else if (this.AudioAttributesCompatParcelizer.get(i2).intValue() == 3) {
                sb.append(String.format(Locale.US, this.IconCompatParcelizer.get(i2), Integer.valueOf(i)));
            } else if (this.AudioAttributesCompatParcelizer.get(i2).intValue() == 4) {
                sb.append(String.format(Locale.US, this.IconCompatParcelizer.get(i2), Long.valueOf(j2)));
            }
        }
        sb.append(this.write.get(this.AudioAttributesCompatParcelizer.size()));
        return sb.toString();
    }

    private static void read(String str, List<String> list, List<Integer> list2, List<String> list3) {
        String strSubstring;
        list.add("");
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            byte b = -1;
            if (iIndexOf == -1) {
                int size = list2.size();
                StringBuilder sb = new StringBuilder();
                sb.append(list.get(list2.size()));
                sb.append(str.substring(length));
                list.set(size, sb.toString());
                length = str.length();
            } else if (iIndexOf != length) {
                int size2 = list2.size();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(list.get(list2.size()));
                sb2.append(str.substring(length, iIndexOf));
                list.set(size2, sb2.toString());
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                int size3 = list2.size();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(list.get(list2.size()));
                sb3.append("$");
                list.set(size3, sb3.toString());
                length += 2;
            } else {
                list3.add("");
                int i = length + 1;
                int iIndexOf2 = str.indexOf("$", i);
                String strSubstring2 = str.substring(i, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 == -1) {
                        strSubstring = "%01d";
                    } else {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(strSubstring);
                            sb4.append("d");
                            strSubstring = sb4.toString();
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    }
                    strSubstring2.hashCode();
                    int iHashCode = strSubstring2.hashCode();
                    if (iHashCode != -1950496919) {
                        if (iHashCode != 2606829) {
                            if (iHashCode == 38199441 && strSubstring2.equals(RtspHeaders.BANDWIDTH)) {
                                b = 2;
                            }
                        } else if (strSubstring2.equals("Time")) {
                            b = 1;
                        }
                    } else if (strSubstring2.equals("Number")) {
                        b = 0;
                    }
                    if (b == 0) {
                        list2.add(2);
                    } else if (b == 1) {
                        list2.add(4);
                    } else if (b == 2) {
                        list2.add(3);
                    } else {
                        throw new IllegalArgumentException("Invalid template: ".concat(String.valueOf(str)));
                    }
                    list3.set(list2.size() - 1, strSubstring);
                }
                list.add("");
                length = iIndexOf2 + 1;
            }
        }
    }
}
