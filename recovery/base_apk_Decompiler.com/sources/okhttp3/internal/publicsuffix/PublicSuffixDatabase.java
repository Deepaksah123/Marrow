package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.BookReferenceView;
import kotlin.CustomAppBarLayout;
import kotlin.FirebaseDataModule;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LessonCompletedDialog;
import kotlin.MagicModuleMetaLSModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.SettingsItem;
import kotlin.StateResult;
import kotlin.TestGroupLSModel;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\f\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\r\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "", "p0", "write", "(Ljava/util/List;)Ljava/util/List;", "(Ljava/lang/String;)Ljava/lang/String;", "", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "MediaBrowserCompatCustomActionResultReceiver", "[B", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Ljava/util/concurrent/CountDownLatch;", "MediaBrowserCompatItemReceiver", "Ljava/util/concurrent/CountDownLatch;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private byte[] write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private byte[] IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] read = {42};
    private static final List<String> AudioAttributesCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer("*");
    private static final PublicSuffixDatabase IconCompatParcelizer = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final CountDownLatch AudioAttributesCompatParcelizer = new CountDownLatch(1);

    public final String write(String p0) {
        int size;
        int size2;
        toMagicModuleMetaRepoModel.write(p0, "");
        String unicode = IDN.toUnicode(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(unicode, "");
        List<String> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(unicode);
        List<String> listWrite = write(listAudioAttributesCompatParcelizer);
        if (listAudioAttributesCompatParcelizer.size() == listWrite.size() && listWrite.get(0).charAt(0) != '!') {
            return null;
        }
        if (listWrite.get(0).charAt(0) == '!') {
            size = listAudioAttributesCompatParcelizer.size();
            size2 = listWrite.size();
        } else {
            size = listAudioAttributesCompatParcelizer.size();
            size2 = listWrite.size() + 1;
        }
        return StateResult.AudioAttributesCompatParcelizer(StateResult.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) AudioAttributesCompatParcelizer(p0)), size - size2), ".", "", "", -1, "...", null);
    }

    private static List<String> AudioAttributesCompatParcelizer(String p0) {
        List<String> listIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer(p0, new char[]{'.'}, false, 0);
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) listIconCompatParcelizer), (Object) "") ? IntermediateLoginResponseBody.MediaDescriptionCompat((List) listIconCompatParcelizer) : listIconCompatParcelizer;
    }

    private final List<String> write(List<String> p0) {
        String str;
        String strIconCompatParcelizer;
        String strIconCompatParcelizer2;
        List<String> listRemoteActionCompatParcelizer;
        List<String> listRemoteActionCompatParcelizer2;
        if (!this.RemoteActionCompatParcelizer.get() && this.RemoteActionCompatParcelizer.compareAndSet(false, true)) {
            RemoteActionCompatParcelizer();
        } else {
            try {
                this.AudioAttributesCompatParcelizer.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.write == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = p0.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str2 = p0.get(i);
            Charset charset = StandardCharsets.UTF_8;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset, "");
            byte[] bytes = str2.getBytes(charset);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            bArr[i] = bytes;
        }
        byte[][] bArr2 = bArr;
        int length = bArr2.length;
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= length) {
                strIconCompatParcelizer = null;
                break;
            }
            byte[] bArr3 = this.write;
            if (bArr3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                bArr3 = null;
            }
            strIconCompatParcelizer = Companion.IconCompatParcelizer(bArr3, bArr, i2);
            if (strIconCompatParcelizer != null) {
                break;
            }
            i2++;
        }
        if (bArr2.length > 1) {
            byte[][] bArr4 = (byte[][]) bArr2.clone();
            int length2 = bArr4.length;
            for (int i3 = 0; i3 < length2 - 1; i3++) {
                bArr4[i3] = read;
                byte[] bArr5 = this.write;
                if (bArr5 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    bArr5 = null;
                }
                strIconCompatParcelizer2 = Companion.IconCompatParcelizer(bArr5, bArr4, i3);
                if (strIconCompatParcelizer2 != null) {
                    break;
                }
            }
            strIconCompatParcelizer2 = null;
        } else {
            strIconCompatParcelizer2 = null;
        }
        if (strIconCompatParcelizer2 != null) {
            int length3 = bArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length3 - 1) {
                    break;
                }
                byte[] bArr6 = this.IconCompatParcelizer;
                if (bArr6 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    bArr6 = null;
                }
                String strIconCompatParcelizer3 = Companion.IconCompatParcelizer(bArr6, bArr, i4);
                if (strIconCompatParcelizer3 != null) {
                    str = strIconCompatParcelizer3;
                    break;
                }
                i4++;
            }
        }
        if (str != null) {
            return TestGroupLSModel.IconCompatParcelizer("!".concat(String.valueOf(str)), new char[]{'.'}, false, 0);
        }
        if (strIconCompatParcelizer == null && strIconCompatParcelizer2 == null) {
            return AudioAttributesCompatParcelizer;
        }
        if (strIconCompatParcelizer == null || (listRemoteActionCompatParcelizer = TestGroupLSModel.IconCompatParcelizer(strIconCompatParcelizer, new char[]{'.'}, false, 0)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (strIconCompatParcelizer2 == null || (listRemoteActionCompatParcelizer2 = TestGroupLSModel.IconCompatParcelizer(strIconCompatParcelizer2, new char[]{'.'}, false, 0)) == null) {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return listRemoteActionCompatParcelizer.size() <= listRemoteActionCompatParcelizer2.size() ? listRemoteActionCompatParcelizer2 : listRemoteActionCompatParcelizer;
    }

    private final void RemoteActionCompatParcelizer() {
        boolean z = false;
        while (true) {
            try {
                try {
                    read();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                    SettingsItem.IconCompatParcelizer.write();
                    SettingsItem.AudioAttributesCompatParcelizer("Failed to read public suffix list", 5, e);
                    if (!z) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, byte[]] */
    private final void read() throws IOException {
        try {
            MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
            MagicModuleUseCaseImplWhenMappings.write writeVar2 = new MagicModuleUseCaseImplWhenMappings.write();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = CustomAppBarLayout.AudioAttributesCompatParcelizer(new BookReferenceView(CustomAppBarLayout.AudioAttributesCompatParcelizer(resourceAsStream)));
                try {
                    LessonCompletedDialog lessonCompletedDialog = lessonCompletedDialogAudioAttributesCompatParcelizer;
                    writeVar.write = lessonCompletedDialog.AudioAttributesCompatParcelizer(lessonCompletedDialog.onCustomAction());
                    writeVar2.write = lessonCompletedDialog.AudioAttributesCompatParcelizer(lessonCompletedDialog.onCustomAction());
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    MagicModuleMetaLSModel.IconCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer, null);
                    synchronized (this) {
                        T t = writeVar.write;
                        toMagicModuleMetaRepoModel.write(t);
                        this.write = (byte[]) t;
                        T t2 = writeVar2.write;
                        toMagicModuleMetaRepoModel.write(t2);
                        this.IconCompatParcelizer = (byte[]) t2;
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    }
                } finally {
                }
            }
        } finally {
            this.AudioAttributesCompatParcelizer.countDown();
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "write", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "p0", "", "p1", "", "IconCompatParcelizer", "([B[[BI)Ljava/lang/String;", "", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "RemoteActionCompatParcelizer", "read", "[B", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static PublicSuffixDatabase write() {
            return PublicSuffixDatabase.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String IconCompatParcelizer(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int iWrite;
            int iWrite2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 >= 0 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iWrite = 46;
                        z = false;
                    } else {
                        z = z2;
                        iWrite = FirebaseDataModule.write(bArr2[i8][i9]);
                    }
                    iWrite2 = iWrite - FirebaseDataModule.write(bArr[i5 + i10]);
                    if (iWrite2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (iWrite2 >= 0) {
                    if (iWrite2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset, "");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
