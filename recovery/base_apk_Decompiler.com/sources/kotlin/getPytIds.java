package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getPytIds extends RuntimeException {
    private final List<Throwable> AudioAttributesCompatParcelizer;
    private final String read;
    private Throwable write;

    public getPytIds(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public getPytIds(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof getPytIds) {
                    linkedHashSet.addAll(((getPytIds) th).AudioAttributesCompatParcelizer());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.AudioAttributesCompatParcelizer = listUnmodifiableList;
        StringBuilder sb = new StringBuilder();
        sb.append(listUnmodifiableList.size());
        sb.append(" exceptions occurred. ");
        this.read = sb.toString();
    }

    private List<Throwable> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.read;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        Throwable th;
        synchronized (this) {
            if (this.write == null) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.AudioAttributesCompatParcelizer.iterator();
                Throwable thRemoteActionCompatParcelizer = remoteActionCompatParcelizer;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th2 : read(next)) {
                            if (hashSet.contains(th2)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            thRemoteActionCompatParcelizer.initCause(next);
                        } catch (Throwable unused) {
                        }
                        thRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(thRemoteActionCompatParcelizer);
                    }
                }
                this.write = remoteActionCompatParcelizer;
            }
            th = this.write;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        write(new read(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        write(new AudioAttributesCompatParcelizer(printWriter));
    }

    private void write(IconCompatParcelizer iconCompatParcelizer) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.AudioAttributesCompatParcelizer) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            AudioAttributesCompatParcelizer(sb, th, "\t");
            i++;
        }
        iconCompatParcelizer.IconCompatParcelizer(sb.toString());
    }

    private void AudioAttributesCompatParcelizer(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            AudioAttributesCompatParcelizer(sb, th.getCause(), "");
        }
    }

    static abstract class IconCompatParcelizer {
        abstract void IconCompatParcelizer(Object obj);

        IconCompatParcelizer() {
        }
    }

    static final class read extends IconCompatParcelizer {
        private final PrintStream write;

        read(PrintStream printStream) {
            this.write = printStream;
        }

        @Override // o.getPytIds.IconCompatParcelizer
        final void IconCompatParcelizer(Object obj) {
            this.write.println(obj);
        }
    }

    static final class AudioAttributesCompatParcelizer extends IconCompatParcelizer {
        private final PrintWriter RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(PrintWriter printWriter) {
            this.RemoteActionCompatParcelizer = printWriter;
        }

        @Override // o.getPytIds.IconCompatParcelizer
        final void IconCompatParcelizer(Object obj) {
            this.RemoteActionCompatParcelizer.println(obj);
        }
    }

    static final class RemoteActionCompatParcelizer extends RuntimeException {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    private static List<Throwable> read(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    private Throwable RemoteActionCompatParcelizer(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || this.write == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }
}
