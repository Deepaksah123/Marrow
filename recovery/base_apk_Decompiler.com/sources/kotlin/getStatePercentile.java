package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class getStatePercentile extends getSkipped {

    public static final class RemoteActionCompatParcelizer implements getTopRankers<String> {
        private /* synthetic */ CharSequence AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(CharSequence charSequence) {
            this.AudioAttributesCompatParcelizer = charSequence;
        }

        @Override // kotlin.getTopRankers
        public final Iterator<String> write() {
            return new newGtaInstance(this.AudioAttributesCompatParcelizer);
        }
    }

    public static final CharSequence read(CharSequence charSequence, int i, char c) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Desired length ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i);
        int length = i - charSequence.length();
        if (length > 0) {
            int i2 = 1;
            while (true) {
                sb2.append('0');
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static final String AudioAttributesCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        return TestGroupLSModel.read((CharSequence) str, i, '0').toString();
    }

    public static final CharSequence write(CharSequence charSequence, int i, char c) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Desired length ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i);
        sb2.append(charSequence);
        int length = i - charSequence.length();
        if (length > 0) {
            int i2 = 1;
            while (true) {
                sb2.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return sb2;
    }

    public static final String IconCompatParcelizer(String str, int i, char c) {
        toMagicModuleMetaRepoModel.write(str, "");
        return TestGroupLSModel.write((CharSequence) str, i, ' ').toString();
    }

    public static final newEncryptedObject read(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return new newEncryptedObject(0, charSequence.length() - 1);
    }

    public static final int write(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return charSequence.length() - 1;
    }

    public static final String write(String str, newEncryptedObject newencryptedobject) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(newencryptedobject, "");
        String strSubstring = str.substring(newencryptedobject.write().intValue(), newencryptedobject.IconCompatParcelizer().intValue() + 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final String write(CharSequence charSequence, newEncryptedObject newencryptedobject) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(newencryptedobject, "");
        return charSequence.subSequence(newencryptedobject.write().intValue(), newencryptedobject.IconCompatParcelizer().intValue() + 1).toString();
    }

    public static final String IconCompatParcelizer(String str, char c, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) str, c, 0, false, 6);
        if (iIconCompatParcelizer == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iIconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final String write(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        int i = TestGroupLSModel.read((CharSequence) str, str2, 0, false, 6);
        if (i == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final String RemoteActionCompatParcelizer(String str, char c, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) str, '$', 0, false, 6);
        if (iIconCompatParcelizer == -1) {
            return str2;
        }
        String strSubstring = str.substring(iIconCompatParcelizer + 1, str.length());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final String read(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        int i = TestGroupLSModel.read((CharSequence) str, str2, 0, false, 6);
        if (i == -1) {
            return str3;
        }
        String strSubstring = str.substring(i + str2.length(), str.length());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final String read(String str, char c, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        int iAudioAttributesCompatParcelizer = TestGroupLSModel.AudioAttributesCompatParcelizer(str, c, 0, 6);
        if (iAudioAttributesCompatParcelizer == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iAudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final String MediaBrowserCompatItemReceiver(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        int iWrite = TestGroupLSModel.write(str, str2, 0, 6);
        if (iWrite == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iWrite);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final String AudioAttributesCompatParcelizer(String str, char c, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        int iAudioAttributesCompatParcelizer = TestGroupLSModel.AudioAttributesCompatParcelizer(str, c, 0, 6);
        if (iAudioAttributesCompatParcelizer == -1) {
            return str2;
        }
        String strSubstring = str.substring(iAudioAttributesCompatParcelizer + 1, str.length());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final CharSequence read(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        if (i2 < i) {
            StringBuilder sb = new StringBuilder("End index (");
            sb.append(i2);
            sb.append(") is less than start index (");
            sb.append(i);
            sb.append(").");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb2, "");
        sb2.append(charSequence2);
        sb2.append(charSequence, i2, charSequence.length());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb2, "");
        return sb2;
    }

    public static final String IconCompatParcelizer(String str, CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        if (!TestGroupLSModel.write(str, charSequence)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final String AudioAttributesCompatParcelizer(String str, CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        if (!TestGroupLSModel.read(str, charSequence)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final boolean RemoteActionCompatParcelizer(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!setStatusTimestamp.IconCompatParcelizer(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean AudioAttributesCompatParcelizer(CharSequence charSequence, char c, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return charSequence.length() > 0 && setStatusTimestamp.IconCompatParcelizer(charSequence.charAt(0), '0', false);
    }

    public static final boolean write(CharSequence charSequence, char c, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return charSequence.length() > 0 && setStatusTimestamp.IconCompatParcelizer(charSequence.charAt(TestGroupLSModel.write(charSequence)), c, false);
    }

    public static /* synthetic */ boolean write(CharSequence charSequence, CharSequence charSequence2) {
        return TestGroupLSModel.AudioAttributesCompatParcelizer(charSequence, charSequence2, false);
    }

    public static final boolean AudioAttributesCompatParcelizer(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver((String) charSequence, (String) charSequence2);
        }
        return TestGroupLSModel.RemoteActionCompatParcelizer(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static /* synthetic */ boolean read(CharSequence charSequence, CharSequence charSequence2) {
        return TestGroupLSModel.RemoteActionCompatParcelizer(charSequence, charSequence2, false);
    }

    public static final boolean RemoteActionCompatParcelizer(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return TestGroupLSModel.AudioAttributesImplApi21Parcelizer((String) charSequence, (String) charSequence2);
        }
        return TestGroupLSModel.RemoteActionCompatParcelizer(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static final int RemoteActionCompatParcelizer(CharSequence charSequence, char[] cArr, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(cArr, "");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(getOrderDetails.read(cArr), i);
        }
        int iWrite = getQues.write(i, 0);
        int iWrite2 = TestGroupLSModel.write(charSequence);
        if (iWrite > iWrite2) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iWrite);
            for (char c : cArr) {
                if (setStatusTimestamp.IconCompatParcelizer(c, cCharAt, z)) {
                    return iWrite;
                }
            }
            if (iWrite == iWrite2) {
                return -1;
            }
            iWrite++;
        }
    }

    public static final int read(CharSequence charSequence, char[] cArr, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(cArr, "");
        if (!z) {
            int length = cArr.length;
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(getOrderDetails.read(cArr), i);
            }
        }
        for (int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(i, TestGroupLSModel.write(charSequence)); iRemoteActionCompatParcelizer >= 0; iRemoteActionCompatParcelizer--) {
            char cCharAt = charSequence.charAt(iRemoteActionCompatParcelizer);
            int length2 = cArr.length;
            for (int i2 = 0; i2 <= 0; i2++) {
                if (setStatusTimestamp.IconCompatParcelizer(cArr[i2], cCharAt, z)) {
                    return iRemoteActionCompatParcelizer;
                }
            }
        }
        return -1;
    }

    private static /* synthetic */ int write(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        return IconCompatParcelizer(charSequence, charSequence2, i, i2, z, false);
    }

    private static final int IconCompatParcelizer(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        newEncryptedObject newencryptedobject;
        if (!z2) {
            newencryptedobject = new newEncryptedObject(getQues.write(i, 0), getQues.RemoteActionCompatParcelizer(i2, charSequence.length()));
        } else {
            newencryptedobject = getQues.read(getQues.RemoteActionCompatParcelizer(i, TestGroupLSModel.write(charSequence)), getQues.write(i2, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i3 = newencryptedobject.getRead();
            int iRemoteActionCompatParcelizer = newencryptedobject.getAudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer = newencryptedobject.getIconCompatParcelizer();
            if ((iAudioAttributesCompatParcelizer <= 0 || i3 > iRemoteActionCompatParcelizer) && (iAudioAttributesCompatParcelizer >= 0 || iRemoteActionCompatParcelizer > i3)) {
                return -1;
            }
            while (true) {
                String str = (String) charSequence2;
                if (TestGroupLSModel.IconCompatParcelizer(str, 0, (String) charSequence, i3, str.length(), z)) {
                    return i3;
                }
                if (i3 == iRemoteActionCompatParcelizer) {
                    return -1;
                }
                i3 += iAudioAttributesCompatParcelizer;
            }
        } else {
            int i4 = newencryptedobject.getRead();
            int iRemoteActionCompatParcelizer2 = newencryptedobject.getAudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = newencryptedobject.getIconCompatParcelizer();
            if ((iAudioAttributesCompatParcelizer2 <= 0 || i4 > iRemoteActionCompatParcelizer2) && (iAudioAttributesCompatParcelizer2 >= 0 || iRemoteActionCompatParcelizer2 > i4)) {
                return -1;
            }
            while (!TestGroupLSModel.RemoteActionCompatParcelizer(charSequence2, 0, charSequence, i4, charSequence2.length(), z)) {
                if (i4 == iRemoteActionCompatParcelizer2) {
                    return -1;
                }
                i4 += iAudioAttributesCompatParcelizer2;
            }
            return i4;
        }
    }

    private static final Pair<Integer, String> read(CharSequence charSequence, Collection<String> collection, int i, boolean z) {
        Object next;
        Object next2;
        if (!z && collection.size() == 1) {
            String str = (String) IntermediateLoginResponseBody.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(collection);
            int i2 = TestGroupLSModel.read(charSequence, str, i, false, 4);
            if (i2 < 0) {
                return null;
            }
            return setAction.write(Integer.valueOf(i2), str);
        }
        newEncryptedObject newencryptedobject = new newEncryptedObject(getQues.write(i, 0), charSequence.length());
        if (charSequence instanceof String) {
            int i3 = newencryptedobject.getRead();
            int iRemoteActionCompatParcelizer = newencryptedobject.getAudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer = newencryptedobject.getIconCompatParcelizer();
            if ((iAudioAttributesCompatParcelizer > 0 && i3 <= iRemoteActionCompatParcelizer) || (iAudioAttributesCompatParcelizer < 0 && iRemoteActionCompatParcelizer <= i3)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (TestGroupLSModel.IconCompatParcelizer(str2, 0, (String) charSequence, i3, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i3 == iRemoteActionCompatParcelizer) {
                            break;
                        }
                        i3 += iAudioAttributesCompatParcelizer;
                    } else {
                        return setAction.write(Integer.valueOf(i3), str3);
                    }
                }
            }
        } else {
            int i4 = newencryptedobject.getRead();
            int iRemoteActionCompatParcelizer2 = newencryptedobject.getAudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = newencryptedobject.getIconCompatParcelizer();
            if ((iAudioAttributesCompatParcelizer2 > 0 && i4 <= iRemoteActionCompatParcelizer2) || (iAudioAttributesCompatParcelizer2 < 0 && iRemoteActionCompatParcelizer2 <= i4)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (TestGroupLSModel.RemoteActionCompatParcelizer(str4, 0, charSequence, i4, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i4 == iRemoteActionCompatParcelizer2) {
                            break;
                        }
                        i4 += iAudioAttributesCompatParcelizer2;
                    } else {
                        return setAction.write(Integer.valueOf(i4), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ int IconCompatParcelizer(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return TestGroupLSModel.read(charSequence, c, i, z);
    }

    public static final int read(CharSequence charSequence, char c, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return (z || !(charSequence instanceof String)) ? TestGroupLSModel.RemoteActionCompatParcelizer(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int read(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return TestGroupLSModel.write(charSequence, str, i, z);
    }

    public static final int write(CharSequence charSequence, String str, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (z || !(charSequence instanceof String)) {
            return write(charSequence, str, i, charSequence.length(), z);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ int AudioAttributesCompatParcelizer(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = TestGroupLSModel.write(charSequence);
        }
        return TestGroupLSModel.write(charSequence, c, i, false);
    }

    public static final int write(CharSequence charSequence, char c, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return charSequence instanceof String ? ((String) charSequence).lastIndexOf(c, i) : TestGroupLSModel.read(charSequence, new char[]{c}, i, false);
    }

    public static /* synthetic */ int write(CharSequence charSequence, String str, int i, int i2) {
        return TestGroupLSModel.AudioAttributesCompatParcelizer(charSequence, str, TestGroupLSModel.write(charSequence), false);
    }

    public static final int AudioAttributesCompatParcelizer(CharSequence charSequence, String str, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (!(charSequence instanceof String)) {
            return IconCompatParcelizer(charSequence, (CharSequence) str, i, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    public static final boolean write(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        return charSequence2 instanceof String ? TestGroupLSModel.read(charSequence, (String) charSequence2, 0, z, 2) >= 0 : write(charSequence, charSequence2, 0, charSequence.length(), z) >= 0;
    }

    public static final boolean RemoteActionCompatParcelizer(CharSequence charSequence, char c, boolean z) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return TestGroupLSModel.IconCompatParcelizer(charSequence, c, 0, false, 2) >= 0;
    }

    private static /* synthetic */ getTopRankers AudioAttributesCompatParcelizer(CharSequence charSequence, char[] cArr, boolean z, int i) {
        return read(charSequence, cArr, 0, z, i);
    }

    private static final getTopRankers<newEncryptedObject> read(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        TestGroupLSModel.write(i2);
        return new TestContainer(charSequence, 0, i2, new MagicModuleSubmissionRequestBody() { // from class: o.getStateSolvedCount
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return getStatePercentile.write(cArr, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair write(char[] cArr, boolean z, CharSequence charSequence, int i) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        int iRemoteActionCompatParcelizer = TestGroupLSModel.RemoteActionCompatParcelizer(charSequence, cArr, i, z);
        if (iRemoteActionCompatParcelizer < 0) {
            return null;
        }
        return setAction.write(Integer.valueOf(iRemoteActionCompatParcelizer), 1);
    }

    private static /* synthetic */ getTopRankers AudioAttributesCompatParcelizer(CharSequence charSequence, String[] strArr, boolean z, int i) {
        return read(charSequence, strArr, 0, z, i);
    }

    private static final getTopRankers<newEncryptedObject> read(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        TestGroupLSModel.write(i2);
        final List list = getOrderDetails.read(strArr);
        return new TestContainer(charSequence, 0, i2, new MagicModuleSubmissionRequestBody() { // from class: o.getSolvedCount
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return getStatePercentile.read(list, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair read(List list, boolean z, CharSequence charSequence, int i) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        Pair<Integer, String> pair = read(charSequence, list, i, z);
        if (pair != null) {
            return setAction.write(pair.write(), Integer.valueOf(pair.IconCompatParcelizer().length()));
        }
        return null;
    }

    public static final void write(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Limit must be non-negative, but was ".concat(String.valueOf(i)).toString());
        }
    }

    public static /* synthetic */ List write(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return TestGroupLSModel.read(charSequence, strArr, false, i);
    }

    public static final List<String> read(CharSequence charSequence, String[] strArr, boolean z, int i) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return IconCompatParcelizer(charSequence, str, false, i);
            }
        }
        Iterable iterable = StateResult.read(AudioAttributesCompatParcelizer(charSequence, strArr, false, i));
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(TestGroupLSModel.write(charSequence, (newEncryptedObject) it.next()));
        }
        return arrayList;
    }

    public static final List<String> IconCompatParcelizer(CharSequence charSequence, char[] cArr, boolean z, int i) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(cArr, "");
        if (cArr.length == 1) {
            return IconCompatParcelizer(charSequence, String.valueOf(cArr[0]), false, 0);
        }
        Iterable iterable = StateResult.read(AudioAttributesCompatParcelizer(charSequence, cArr, false, 0));
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(TestGroupLSModel.write(charSequence, (newEncryptedObject) it.next()));
        }
        return arrayList;
    }

    private static final List<String> IconCompatParcelizer(CharSequence charSequence, String str, boolean z, int i) {
        TestGroupLSModel.write(i);
        int length = 0;
        int iWrite = TestGroupLSModel.write(charSequence, str, 0, z);
        if (iWrite == -1 || i == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? getQues.RemoteActionCompatParcelizer(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iWrite).toString());
            length = str.length() + iWrite;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iWrite = TestGroupLSModel.write(charSequence, str, length, z);
        } while (iWrite != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static final getTopRankers<String> RemoteActionCompatParcelizer(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return new RemoteActionCompatParcelizer(charSequence);
    }

    public static final List<String> AudioAttributesCompatParcelizer(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return StateResult.MediaBrowserCompatItemReceiver(TestGroupLSModel.RemoteActionCompatParcelizer(charSequence));
    }

    public static final String read(String str, char... cArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(cArr, "");
        String str2 = str;
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zWrite = getOrderDetails.write(cArr, str2.charAt(!z ? i : length));
            if (z) {
                if (!zWrite) {
                    break;
                }
                length--;
            } else if (zWrite) {
                i++;
            } else {
                z = true;
            }
        }
        return str2.subSequence(i, length + 1).toString();
    }

    public static final String write(String str, char... cArr) {
        String strSubSequence;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(cArr, "");
        String str2 = str;
        int length = str2.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!getOrderDetails.write(cArr, str2.charAt(length))) {
                    strSubSequence = str2.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return strSubSequence.toString();
    }

    public static final CharSequence AudioAttributesImplApi26Parcelizer(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zRemoteActionCompatParcelizer = setStatusTimestamp.RemoteActionCompatParcelizer(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zRemoteActionCompatParcelizer) {
                    break;
                }
                length--;
            } else if (zRemoteActionCompatParcelizer) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final CharSequence AudioAttributesImplApi21Parcelizer(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!setStatusTimestamp.RemoteActionCompatParcelizer(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final CharSequence MediaBrowserCompatItemReceiver(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!setStatusTimestamp.RemoteActionCompatParcelizer(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static final boolean IconCompatParcelizer(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!setStatusTimestamp.RemoteActionCompatParcelizer(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
