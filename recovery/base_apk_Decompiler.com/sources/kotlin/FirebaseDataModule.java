package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.ActivityAdapterModule;
import kotlin.AppThemeKt;
import kotlin.Options;
import kotlin.ShapeKt;
import kotlin.ThemeAlphaConstantsKt;
import kotlin.ThemeKtExternalSyntheticLambda2;
import kotlin.getRelatedModuleAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseDataModule {
    public static final boolean AudioAttributesCompatParcelizer;
    public static final String AudioAttributesImplApi21Parcelizer;
    public static final TimeZone IconCompatParcelizer;
    private static final Options MediaBrowserCompatCustomActionResultReceiver;
    private static final newYearNameItem MediaBrowserCompatItemReceiver;
    public static final ShapeKt RemoteActionCompatParcelizer;
    public static final ActivityAdapterModule read;
    public static final byte[] write;

    public static final long AudioAttributesCompatParcelizer(int i) {
        return ((long) i) & 2147483647L;
    }

    public static final int RemoteActionCompatParcelizer(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int write(byte b) {
        return b & 255;
    }

    public static final int write(short s) {
        return s & 65535;
    }

    static {
        byte[] bArr = new byte[0];
        write = bArr;
        ShapeKt.Companion companion = ShapeKt.INSTANCE;
        RemoteActionCompatParcelizer = ShapeKt.Companion.read(new String[0]);
        ActivityAdapterModule.Companion companion2 = ActivityAdapterModule.INSTANCE;
        read = ActivityAdapterModule.Companion.write(bArr, null);
        ThemeKtExternalSyntheticLambda2.Companion companion3 = ThemeKtExternalSyntheticLambda2.INSTANCE;
        ThemeKtExternalSyntheticLambda2.Companion.write(bArr, null, 0, 0, 7);
        Options.IconCompatParcelizer iconCompatParcelizer = Options.IconCompatParcelizer;
        getRelatedModuleAdapter.Companion companion4 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter getrelatedmoduleadapterWrite = getRelatedModuleAdapter.Companion.write("efbbbf");
        getRelatedModuleAdapter.Companion companion5 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter getrelatedmoduleadapterWrite2 = getRelatedModuleAdapter.Companion.write("feff");
        getRelatedModuleAdapter.Companion companion6 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter getrelatedmoduleadapterWrite3 = getRelatedModuleAdapter.Companion.write("fffe");
        getRelatedModuleAdapter.Companion companion7 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter getrelatedmoduleadapterWrite4 = getRelatedModuleAdapter.Companion.write("0000ffff");
        getRelatedModuleAdapter.Companion companion8 = getRelatedModuleAdapter.INSTANCE;
        MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedmoduleadapterWrite, getrelatedmoduleadapterWrite2, getrelatedmoduleadapterWrite3, getrelatedmoduleadapterWrite4, getRelatedModuleAdapter.Companion.write("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        toMagicModuleMetaRepoModel.write(timeZone);
        IconCompatParcelizer = timeZone;
        MediaBrowserCompatItemReceiver = new newYearNameItem("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        AudioAttributesCompatParcelizer = false;
        String name = ThemeKtExternalSyntheticLambda3.class.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        AudioAttributesImplApi21Parcelizer = TestGroupLSModel.AudioAttributesCompatParcelizer(TestGroupLSModel.IconCompatParcelizer(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final void AudioAttributesCompatParcelizer(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final ThreadFactory RemoteActionCompatParcelizer(final String str, final boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        return new ThreadFactory() { // from class: o.BookmarkModule
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return FirebaseDataModule.AudioAttributesCompatParcelizer(str, z, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread AudioAttributesCompatParcelizer(String str, boolean z, Runnable runnable) {
        toMagicModuleMetaRepoModel.write(str, "");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final String[] write(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(strArr2, "");
        toMagicModuleMetaRepoModel.write(comparator, "");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean AudioAttributesCompatParcelizer(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(comparator, "");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itAudioAttributesCompatParcelizer = r8lambda_QgM1da7JykGH9FQp_oipiZItrY.AudioAttributesCompatParcelizer(strArr2);
                while (itAudioAttributesCompatParcelizer.hasNext()) {
                    if (comparator.compare(str, (String) itAudioAttributesCompatParcelizer.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final String write(ThemeAlphaConstantsKt themeAlphaConstantsKt, boolean z) {
        String host;
        toMagicModuleMetaRepoModel.write(themeAlphaConstantsKt, "");
        if (TestGroupLSModel.write((CharSequence) themeAlphaConstantsKt.getHost(), (CharSequence) ":", false)) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(themeAlphaConstantsKt.getHost());
            sb.append(']');
            host = sb.toString();
        } else {
            host = themeAlphaConstantsKt.getHost();
        }
        if (!z) {
            int port = themeAlphaConstantsKt.getPort();
            ThemeAlphaConstantsKt.Companion companion = ThemeAlphaConstantsKt.INSTANCE;
            if (port == ThemeAlphaConstantsKt.Companion.AudioAttributesCompatParcelizer(themeAlphaConstantsKt.getScheme())) {
                return host;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(host);
        sb2.append(':');
        sb2.append(themeAlphaConstantsKt.getPort());
        return sb2.toString();
    }

    public static final String[] write(String[] strArr, String str) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[getOrderDetails.MediaDescriptionCompat(strArr2)] = str;
        return strArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int AudioAttributesCompatParcelizer(String str, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int write(String str, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String RemoteActionCompatParcelizer(String str, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str, i, i2);
        String strSubstring = str.substring(iAudioAttributesCompatParcelizer, write(str, iAudioAttributesCompatParcelizer, i2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final int RemoteActionCompatParcelizer(String str, String str2, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        while (i < i2) {
            if (TestGroupLSModel.RemoteActionCompatParcelizer(str2, str.charAt(i), false)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int AudioAttributesCompatParcelizer(String str, char c, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = str.length();
        }
        return write(str, c, 0, i);
    }

    public static final int write(String str, char c, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (toMagicModuleMetaRepoModel.read((int) cCharAt, 31) <= 0 || toMagicModuleMetaRepoModel.read((int) cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return MediaBrowserCompatItemReceiver.write(str);
    }

    public static final boolean AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return TestGroupLSModel.read(str, RtspHeaders.AUTHORIZATION, true) || TestGroupLSModel.read(str, "Cookie", true) || TestGroupLSModel.read(str, "Proxy-Authorization", true) || TestGroupLSModel.read(str, "Set-Cookie", true);
    }

    public static final String read(String str, Object... objArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(objArr, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        return str2;
    }

    public static final Charset write(LessonCompletedDialog lessonCompletedDialog, Charset charset) throws IOException {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        toMagicModuleMetaRepoModel.write(charset, "");
        int iRemoteActionCompatParcelizer = lessonCompletedDialog.RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver);
        if (iRemoteActionCompatParcelizer == -1) {
            return charset;
        }
        if (iRemoteActionCompatParcelizer == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset2, "");
            return charset2;
        }
        if (iRemoteActionCompatParcelizer == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset3, "");
            return charset3;
        }
        if (iRemoteActionCompatParcelizer == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset4, "");
            return charset4;
        }
        if (iRemoteActionCompatParcelizer == 3) {
            return getSubmissionTimestamp.INSTANCE.AudioAttributesCompatParcelizer();
        }
        if (iRemoteActionCompatParcelizer == 4) {
            return getSubmissionTimestamp.INSTANCE.write();
        }
        throw new AssertionError();
    }

    public static final int IconCompatParcelizer(String str, long j, TimeUnit timeUnit) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" < 0");
            throw new IllegalStateException(sb.toString().toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" too large.");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" too small.");
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    public static final ShapeKt RemoteActionCompatParcelizer(List<SyncingActivity> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ShapeKt.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ShapeKt.RemoteActionCompatParcelizer();
        for (SyncingActivity syncingActivity : list) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(syncingActivity.getName().MediaDescriptionCompat(), syncingActivity.getValue().MediaDescriptionCompat());
        }
        return remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public static final List<SyncingActivity> IconCompatParcelizer(ShapeKt shapeKt) {
        toMagicModuleMetaRepoModel.write(shapeKt, "");
        newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, shapeKt.IconCompatParcelizer());
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer, 10));
        Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            int iRemoteActionCompatParcelizer = ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
            arrayList.add(new SyncingActivity(shapeKt.IconCompatParcelizer(iRemoteActionCompatParcelizer), shapeKt.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer)));
        }
        return arrayList;
    }

    public static final boolean IconCompatParcelizer(ThemeAlphaConstantsKt themeAlphaConstantsKt, ThemeAlphaConstantsKt themeAlphaConstantsKt2) {
        toMagicModuleMetaRepoModel.write(themeAlphaConstantsKt, "");
        toMagicModuleMetaRepoModel.write(themeAlphaConstantsKt2, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) themeAlphaConstantsKt.getHost(), (Object) themeAlphaConstantsKt2.getHost()) && themeAlphaConstantsKt.getPort() == themeAlphaConstantsKt2.getPort() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) themeAlphaConstantsKt.getScheme(), (Object) themeAlphaConstantsKt2.getScheme());
    }

    public static final AppThemeKt.RemoteActionCompatParcelizer write(final AppThemeKt appThemeKt) {
        toMagicModuleMetaRepoModel.write(appThemeKt, "");
        return new AppThemeKt.RemoteActionCompatParcelizer() { // from class: o.BookmarkedTimelineDataModule
            @Override // o.AppThemeKt.RemoteActionCompatParcelizer
            public final AppThemeKt AudioAttributesCompatParcelizer(toDownloadInfo todownloadinfo) {
                return FirebaseDataModule.AudioAttributesCompatParcelizer(appThemeKt, todownloadinfo);
            }
        };
    }

    public static final void write(LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1, int i) throws IOException {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1, "");
        lessonCompletedDialogonViewCreatedllm1.read((i >>> 16) & 255);
        lessonCompletedDialogonViewCreatedllm1.read((i >>> 8) & 255);
        lessonCompletedDialogonViewCreatedllm1.read(i & 255);
    }

    public static final int AudioAttributesCompatParcelizer(LessonCompletedDialog lessonCompletedDialog) throws IOException {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        return write(lessonCompletedDialog.MediaMetadataCompat()) | (write(lessonCompletedDialog.MediaMetadataCompat()) << 16) | (write(lessonCompletedDialog.MediaMetadataCompat()) << 8);
    }

    public static final boolean read(setLockedFromSeek setlockedfromseek, int i, TimeUnit timeUnit) throws IOException {
        toMagicModuleMetaRepoModel.write(setlockedfromseek, "");
        toMagicModuleMetaRepoModel.write(timeUnit, "");
        long jNanoTime = System.nanoTime();
        long jBo_ = setlockedfromseek.RemoteActionCompatParcelizer().getRemoteActionCompatParcelizer() ? setlockedfromseek.RemoteActionCompatParcelizer().bo_() - jNanoTime : Long.MAX_VALUE;
        setlockedfromseek.RemoteActionCompatParcelizer().IconCompatParcelizer(Math.min(jBo_, timeUnit.toNanos(i)) + jNanoTime);
        try {
            resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
            while (setlockedfromseek.AudioAttributesCompatParcelizer(resetcurrentselectedposition, 8192L) != -1) {
                resetcurrentselectedposition.IconCompatParcelizer();
            }
            if (jBo_ == Long.MAX_VALUE) {
                setlockedfromseek.RemoteActionCompatParcelizer().br_();
                return true;
            }
            setlockedfromseek.RemoteActionCompatParcelizer().IconCompatParcelizer(jNanoTime + jBo_);
            return true;
        } catch (InterruptedIOException unused) {
            if (jBo_ == Long.MAX_VALUE) {
                setlockedfromseek.RemoteActionCompatParcelizer().br_();
                return false;
            }
            setlockedfromseek.RemoteActionCompatParcelizer().IconCompatParcelizer(jNanoTime + jBo_);
            return false;
        } catch (Throwable th) {
            if (jBo_ == Long.MAX_VALUE) {
                setlockedfromseek.RemoteActionCompatParcelizer().br_();
            } else {
                setlockedfromseek.RemoteActionCompatParcelizer().IconCompatParcelizer(jNanoTime + jBo_);
            }
            throw th;
        }
    }

    public static final boolean read(setLockedFromSeek setlockedfromseek, TimeUnit timeUnit) {
        toMagicModuleMetaRepoModel.write(setlockedfromseek, "");
        toMagicModuleMetaRepoModel.write(timeUnit, "");
        try {
            return read(setlockedfromseek, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean AudioAttributesCompatParcelizer(Socket socket, LessonCompletedDialog lessonCompletedDialog) {
        toMagicModuleMetaRepoModel.write(socket, "");
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean zMediaBrowserCompatCustomActionResultReceiver = lessonCompletedDialog.MediaBrowserCompatCustomActionResultReceiver();
                socket.setSoTimeout(soTimeout);
                return !zMediaBrowserCompatCustomActionResultReceiver;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final int AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition) throws EOFException {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        int i = 0;
        while (!resetcurrentselectedposition.MediaBrowserCompatCustomActionResultReceiver() && resetcurrentselectedposition.IconCompatParcelizer(0L) == 61) {
            i++;
            resetcurrentselectedposition.MediaMetadataCompat();
        }
        return i;
    }

    public static final int IconCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final long write(C0156TypeKt c0156TypeKt) {
        toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
        String strIconCompatParcelizer = c0156TypeKt.getHeaders().IconCompatParcelizer(RtspHeaders.CONTENT_LENGTH);
        if (strIconCompatParcelizer != null) {
            return read(strIconCompatParcelizer);
        }
        return -1L;
    }

    public static final long read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final int read(String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final <T> List<T> AudioAttributesCompatParcelizer(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<T> listUnmodifiableList = Collections.unmodifiableList(IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) list));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listUnmodifiableList, "");
        return listUnmodifiableList;
    }

    @SafeVarargs
    public static final <T> List<T> IconCompatParcelizer(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Arrays.copyOf(objArr, objArr.length)));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listUnmodifiableList, "");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> AudioAttributesCompatParcelizer(Map<K, ? extends V> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        if (map.isEmpty()) {
            return VideoTimelineResponseBody.read();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapUnmodifiableMap, "");
        return mapUnmodifiableMap;
    }

    public static final void read(Closeable closeable) {
        toMagicModuleMetaRepoModel.write(closeable, "");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void read(Socket socket) {
        toMagicModuleMetaRepoModel.write(socket, "");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) e2.getMessage(), (Object) "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean RemoteActionCompatParcelizer(OptionItemPlaybackSpeedOptionItem optionItemPlaybackSpeedOptionItem, File file) throws IOException {
        toMagicModuleMetaRepoModel.write(optionItemPlaybackSpeedOptionItem, "");
        toMagicModuleMetaRepoModel.write(file, "");
        setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefaultAudioAttributesCompatParcelizer = optionItemPlaybackSpeedOptionItem.AudioAttributesCompatParcelizer(file);
        try {
            setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefault = setcompounddrawableswithintrinsicboundscompatdefaultAudioAttributesCompatParcelizer;
            try {
                optionItemPlaybackSpeedOptionItem.IconCompatParcelizer(file);
                MagicModuleMetaLSModel.IconCompatParcelizer(setcompounddrawableswithintrinsicboundscompatdefaultAudioAttributesCompatParcelizer, null);
                return true;
            } catch (IOException unused) {
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(setcompounddrawableswithintrinsicboundscompatdefaultAudioAttributesCompatParcelizer, null);
                optionItemPlaybackSpeedOptionItem.IconCompatParcelizer(file);
                return false;
            }
        } finally {
        }
    }

    public static final <E> void write(List<E> list, E e) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final Throwable write(Exception exc, List<? extends Exception> list) {
        toMagicModuleMetaRepoModel.write(exc, "");
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            getPlanName.IconCompatParcelizer(exc, it.next());
        }
        return exc;
    }

    public static final int write(String[] strArr, String str, Comparator<String> comparator) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(comparator, "");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppThemeKt AudioAttributesCompatParcelizer(AppThemeKt appThemeKt, toDownloadInfo todownloadinfo) {
        toMagicModuleMetaRepoModel.write(appThemeKt, "");
        toMagicModuleMetaRepoModel.write(todownloadinfo, "");
        return appThemeKt;
    }
}
