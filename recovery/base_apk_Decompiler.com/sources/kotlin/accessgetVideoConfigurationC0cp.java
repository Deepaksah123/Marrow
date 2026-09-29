package kotlin;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetVideoConfigurationC0cp {
    private static final String IconCompatParcelizer;
    private static final StackTraceElement read;
    private static final String write;

    static {
        Object obj;
        Object obj2;
        new AudioAttributesCompatParcelizer();
        read = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(Class.forName("o.getMonthName").getCanonicalName());
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        IconCompatParcelizer = (String) (C0177getRfBanners.IconCompatParcelizer(obj) == null ? obj : "o.getMonthName");
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer3 = C0177getRfBanners.IconCompatParcelizer;
            obj2 = C0177getRfBanners.read(Class.forName("o.accessgetVideoConfigurationC0cp").getCanonicalName());
        } catch (Throwable th2) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer4 = C0177getRfBanners.IconCompatParcelizer;
            obj2 = C0177getRfBanners.read(SdkPayloadData.write(th2));
        }
        write = (String) (C0177getRfBanners.IconCompatParcelizer(obj2) == null ? obj2 : "o.accessgetVideoConfigurationC0cp");
    }

    public static final <E extends Throwable> E AudioAttributesCompatParcelizer(E e) {
        Throwable thWrite;
        return (!getCollegeId.RemoteActionCompatParcelizer() || (thWrite = setAudioUnderrunDurationMs.write(e)) == null) ? e : (E) RemoteActionCompatParcelizer(thWrite);
    }

    private static final <E extends Throwable> E RemoteActionCompatParcelizer(E e) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i = length2 - 1;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) write, (Object) stackTrace[length2].getClassName())) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length2 = i;
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        int iWrite = write(stackTrace, IconCompatParcelizer);
        int i2 = (length - length2) - (iWrite == -1 ? 0 : length - iWrite);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                stackTraceElement = read;
            } else {
                stackTraceElement = stackTrace[((length2 + 1) + i3) - 1];
            }
            stackTraceElementArr[i3] = stackTraceElement;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E read(E e, getNextQuery getnextquery) {
        Pair pairWrite = write(e);
        Throwable th = (Throwable) pairWrite.RemoteActionCompatParcelizer();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pairWrite.read();
        Throwable thWrite = setAudioUnderrunDurationMs.write(th);
        if (thWrite == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> arrayDequeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getnextquery);
        if (arrayDequeAudioAttributesCompatParcelizer.isEmpty()) {
            return e;
        }
        if (th != e) {
            IconCompatParcelizer(stackTraceElementArr, arrayDequeAudioAttributesCompatParcelizer);
        }
        return (E) IconCompatParcelizer(th, thWrite, arrayDequeAudioAttributesCompatParcelizer);
    }

    private static final <E extends Throwable> E IconCompatParcelizer(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(read);
        StackTraceElement[] stackTrace = e.getStackTrace();
        int iWrite = write(stackTrace, IconCompatParcelizer);
        int i = 0;
        if (iWrite == -1) {
            e2.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iWrite];
        for (int i2 = 0; i2 < iWrite; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + iWrite] = (StackTraceElement) it.next();
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> write(E e) {
        Throwable cause = e.getCause();
        if (cause != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cause.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (IconCompatParcelizer(stackTraceElement)) {
                    return setAction.write(cause, stackTrace);
                }
            }
            return setAction.write(e, new StackTraceElement[0]);
        }
        return setAction.write(e, new StackTraceElement[0]);
    }

    public static final <E extends Throwable> E IconCompatParcelizer(E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(e2.getClass(), e.getClass())) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (IconCompatParcelizer(stackTraceElement)) {
                    return e2;
                }
            }
        }
        return e;
    }

    private static final ArrayDeque<StackTraceElement> AudioAttributesCompatParcelizer(getNextQuery getnextquery) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = getnextquery.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(getnextquery instanceof getNextQuery)) {
                getnextquery = null;
            }
            if (getnextquery == null || (getnextquery = getnextquery.getCallerFrame()) == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = getnextquery.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    private static boolean IconCompatParcelizer(StackTraceElement stackTraceElement) {
        return TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(stackTraceElement.getClassName(), IconCompatParcelizer.read());
    }

    private static final boolean IconCompatParcelizer(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) stackTraceElement.getClassName(), (Object) stackTraceElement2.getClassName());
    }

    private static final void IconCompatParcelizer(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (IconCompatParcelizer(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (IconCompatParcelizer(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            } else {
                length2--;
            }
        }
    }

    private static final int write(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
