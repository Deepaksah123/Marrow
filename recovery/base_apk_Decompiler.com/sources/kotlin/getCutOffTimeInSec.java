package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class getCutOffTimeInSec extends newMonthTestItemdefault {
    public static final String RemoteActionCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return TestGroupLSModel.AudioAttributesCompatParcelizer(str, "", str2);
    }

    public static final String AudioAttributesCompatParcelizer(String str, String str2, String str3) {
        String strInvoke;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        if (TestGroupLSModel.IconCompatParcelizer((CharSequence) str3)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listAudioAttributesCompatParcelizer = TestGroupLSModel.AudioAttributesCompatParcelizer((CharSequence) str);
        int length = str.length();
        int length2 = str2.length();
        int size = listAudioAttributesCompatParcelizer.size();
        getAnswerMap<String, String> getanswermapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str2);
        int iWrite = IntermediateLoginResponseBody.write((List) listAudioAttributesCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listAudioAttributesCompatParcelizer) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i == 0 || i == iWrite) && TestGroupLSModel.IconCompatParcelizer((CharSequence) str4)) {
                str4 = null;
            } else {
                String str5 = str4;
                int length3 = str5.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        i2 = -1;
                        break;
                    }
                    if (!setStatusTimestamp.RemoteActionCompatParcelizer(str5.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1 && TestGroupLSModel.AudioAttributesCompatParcelizer(str4, str3, i2, false)) {
                    int length4 = str3.length();
                    toMagicModuleMetaRepoModel.read(str4, "");
                    strSubstring = str4.substring(i2 + length4);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                }
                if (strSubstring != null && (strInvoke = getanswermapRemoteActionCompatParcelizer.invoke(strSubstring)) != null) {
                    str4 = strInvoke;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i++;
        }
        return ((StringBuilder) IntermediateLoginResponseBody.write(arrayList, new StringBuilder(length + (length2 * size)), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return TestGroupLSModel.read(str, "");
    }

    public static final String read(String str, String str2) {
        String strInvoke;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        List<String> listAudioAttributesCompatParcelizer = TestGroupLSModel.AudioAttributesCompatParcelizer((CharSequence) str);
        List<String> list = listAudioAttributesCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!TestGroupLSModel.IconCompatParcelizer((CharSequence) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(AudioAttributesImplApi21Parcelizer((String) it.next())));
        }
        Integer num = (Integer) IntermediateLoginResponseBody.onAddQueueItem(arrayList3);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length();
        int length2 = str2.length();
        int size = listAudioAttributesCompatParcelizer.size();
        getAnswerMap<String, String> getanswermapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str2);
        int iWrite = IntermediateLoginResponseBody.write((List) listAudioAttributesCompatParcelizer);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == iWrite) && TestGroupLSModel.IconCompatParcelizer((CharSequence) str3)) {
                str3 = null;
            } else {
                String strIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer(str3, iIntValue);
                if (strIconCompatParcelizer != null && (strInvoke = getanswermapRemoteActionCompatParcelizer.invoke(strIconCompatParcelizer)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList4.add(str3);
            }
            i++;
        }
        return ((StringBuilder) IntermediateLoginResponseBody.write(arrayList4, new StringBuilder(length + (length2 * size)), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String AudioAttributesCompatParcelizer(String str, final String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return StateResult.AudioAttributesCompatParcelizer(StateResult.write(TestGroupLSModel.RemoteActionCompatParcelizer((CharSequence) str), new getAnswerMap() { // from class: o.TestIndex
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getCutOffTimeInSec.AudioAttributesImplApi21Parcelizer(str2, (String) obj);
            }
        }), "\n", "", "", -1, "...", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AudioAttributesImplApi21Parcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        if (TestGroupLSModel.IconCompatParcelizer((CharSequence) str2)) {
            return str2.length() < str.length() ? str : str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    private static final int AudioAttributesImplApi21Parcelizer(String str) {
        String str2 = str;
        int length = str2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!setStatusTimestamp.RemoteActionCompatParcelizer(str2.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    private static final getAnswerMap<String, String> RemoteActionCompatParcelizer(final String str) {
        return str.length() == 0 ? new getAnswerMap() { // from class: o.TestHomeItem2
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getCutOffTimeInSec.AudioAttributesImplBaseParcelizer((String) obj);
            }
        } : new getAnswerMap() { // from class: o.getCorrect
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getCutOffTimeInSec.MediaBrowserCompatCustomActionResultReceiver(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MediaBrowserCompatCustomActionResultReceiver(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return str;
    }
}
