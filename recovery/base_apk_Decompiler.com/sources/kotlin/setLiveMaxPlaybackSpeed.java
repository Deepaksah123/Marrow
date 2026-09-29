package kotlin;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setLiveMaxPlaybackSpeed extends Exception {
    private static final StackTraceElement[] IconCompatParcelizer = new StackTraceElement[0];
    private String AudioAttributesCompatParcelizer;
    private onVolumeChanged AudioAttributesImplApi26Parcelizer;
    private Class<?> RemoteActionCompatParcelizer;
    private final List<Throwable> read;
    private onTracksChanged write;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public setLiveMaxPlaybackSpeed(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public setLiveMaxPlaybackSpeed(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public setLiveMaxPlaybackSpeed(String str, List<Throwable> list) {
        this.AudioAttributesCompatParcelizer = str;
        setStackTrace(IconCompatParcelizer);
        this.read = list;
    }

    final void RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, onTracksChanged ontrackschanged) {
        AudioAttributesCompatParcelizer(onvolumechanged, ontrackschanged, null);
    }

    final void AudioAttributesCompatParcelizer(onVolumeChanged onvolumechanged, onTracksChanged ontrackschanged, Class<?> cls) {
        this.AudioAttributesImplApi26Parcelizer = onvolumechanged;
        this.write = ontrackschanged;
        this.RemoteActionCompatParcelizer = cls;
    }

    private List<Throwable> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final List<Throwable> IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        AudioAttributesCompatParcelizer(this, arrayList);
        return arrayList;
    }

    public final void RemoteActionCompatParcelizer() {
        List<Throwable> listIconCompatParcelizer = IconCompatParcelizer();
        int size = listIconCompatParcelizer.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            listIconCompatParcelizer.get(i);
            i = i2;
        }
    }

    private void AudioAttributesCompatParcelizer(Throwable th, List<Throwable> list) {
        if (th instanceof setLiveMaxPlaybackSpeed) {
            Iterator<Throwable> it = ((setLiveMaxPlaybackSpeed) th).AudioAttributesCompatParcelizer().iterator();
            while (it.hasNext()) {
                AudioAttributesCompatParcelizer(it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        RemoteActionCompatParcelizer(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        RemoteActionCompatParcelizer(printWriter);
    }

    private void RemoteActionCompatParcelizer(Appendable appendable) {
        AudioAttributesCompatParcelizer(this, appendable);
        AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(), new AudioAttributesCompatParcelizer(appendable));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.AudioAttributesCompatParcelizer);
        String string3 = "";
        if (this.RemoteActionCompatParcelizer != null) {
            StringBuilder sb2 = new StringBuilder(", ");
            sb2.append(this.RemoteActionCompatParcelizer);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        if (this.write != null) {
            StringBuilder sb3 = new StringBuilder(", ");
            sb3.append(this.write);
            string2 = sb3.toString();
        } else {
            string2 = "";
        }
        sb.append(string2);
        if (this.AudioAttributesImplApi26Parcelizer != null) {
            StringBuilder sb4 = new StringBuilder(", ");
            sb4.append(this.AudioAttributesImplApi26Parcelizer);
            string3 = sb4.toString();
        }
        sb.append(string3);
        List<Throwable> listIconCompatParcelizer = IconCompatParcelizer();
        if (listIconCompatParcelizer.isEmpty()) {
            return sb.toString();
        }
        if (listIconCompatParcelizer.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listIconCompatParcelizer.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listIconCompatParcelizer) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    private static void AudioAttributesCompatParcelizer(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private static void AudioAttributesCompatParcelizer(List<Throwable> list, Appendable appendable) {
        try {
            write(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void write(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof setLiveMaxPlaybackSpeed) {
                ((setLiveMaxPlaybackSpeed) th).RemoteActionCompatParcelizer(appendable);
            } else {
                AudioAttributesCompatParcelizer(th, appendable);
            }
            i = i2;
        }
    }

    static final class AudioAttributesCompatParcelizer implements Appendable {
        private boolean AudioAttributesCompatParcelizer = true;
        private final Appendable RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(Appendable appendable) {
            this.RemoteActionCompatParcelizer = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            if (this.AudioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer = false;
                this.RemoteActionCompatParcelizer.append("  ");
            }
            this.AudioAttributesCompatParcelizer = c == '\n';
            this.RemoteActionCompatParcelizer.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            CharSequence charSequenceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(charSequence);
            return append(charSequenceAudioAttributesCompatParcelizer, 0, charSequenceAudioAttributesCompatParcelizer.length());
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence charSequenceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(charSequence);
            boolean z = false;
            if (this.AudioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer = false;
                this.RemoteActionCompatParcelizer.append("  ");
            }
            if (charSequenceAudioAttributesCompatParcelizer.length() > 0 && charSequenceAudioAttributesCompatParcelizer.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.AudioAttributesCompatParcelizer = z;
            this.RemoteActionCompatParcelizer.append(charSequenceAudioAttributesCompatParcelizer, i, i2);
            return this;
        }

        private static CharSequence AudioAttributesCompatParcelizer(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }
    }
}
