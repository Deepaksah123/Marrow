package kotlin;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.setVideoAspectRatio;

/* JADX INFO: loaded from: classes4.dex */
final class getFirstAnswer extends setVideoAspectRatio {
    private static final int[] IconCompatParcelizer;
    private final int AudioAttributesCompatParcelizer;
    private final setVideoAspectRatio AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private int RemoteActionCompatParcelizer;
    private final setVideoAspectRatio read;

    /* synthetic */ getFirstAnswer(setVideoAspectRatio setvideoaspectratio, setVideoAspectRatio setvideoaspectratio2, byte b) {
        this(setvideoaspectratio, setvideoaspectratio2);
    }

    @Override // kotlin.setVideoAspectRatio, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return iterator();
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i3 = i2;
            i2 = i + i2;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        IconCompatParcelizer = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = IconCompatParcelizer;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    private getFirstAnswer(setVideoAspectRatio setvideoaspectratio, setVideoAspectRatio setvideoaspectratio2) {
        this.RemoteActionCompatParcelizer = 0;
        this.read = setvideoaspectratio;
        this.AudioAttributesImplApi26Parcelizer = setvideoaspectratio2;
        int iMediaBrowserCompatCustomActionResultReceiver = setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver();
        this.AudioAttributesCompatParcelizer = iMediaBrowserCompatCustomActionResultReceiver;
        this.AudioAttributesImplBaseParcelizer = iMediaBrowserCompatCustomActionResultReceiver + setvideoaspectratio2.MediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatCustomActionResultReceiver = Math.max(setvideoaspectratio.IconCompatParcelizer(), setvideoaspectratio2.IconCompatParcelizer()) + 1;
    }

    static setVideoAspectRatio AudioAttributesCompatParcelizer(setVideoAspectRatio setvideoaspectratio, setVideoAspectRatio setvideoaspectratio2) {
        getFirstAnswer getfirstanswer = setvideoaspectratio instanceof getFirstAnswer ? (getFirstAnswer) setvideoaspectratio : null;
        if (setvideoaspectratio2.MediaBrowserCompatCustomActionResultReceiver() == 0) {
            return setvideoaspectratio;
        }
        if (setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver() == 0) {
            return setvideoaspectratio2;
        }
        int iMediaBrowserCompatCustomActionResultReceiver = setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver() + setvideoaspectratio2.MediaBrowserCompatCustomActionResultReceiver();
        if (iMediaBrowserCompatCustomActionResultReceiver < 128) {
            return write(setvideoaspectratio, setvideoaspectratio2);
        }
        if (getfirstanswer != null && getfirstanswer.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver() + setvideoaspectratio2.MediaBrowserCompatCustomActionResultReceiver() < 128) {
            return new getFirstAnswer(getfirstanswer.read, write(getfirstanswer.AudioAttributesImplApi26Parcelizer, setvideoaspectratio2));
        }
        if (getfirstanswer != null && getfirstanswer.read.IconCompatParcelizer() > getfirstanswer.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer() && getfirstanswer.IconCompatParcelizer() > setvideoaspectratio2.IconCompatParcelizer()) {
            return new getFirstAnswer(getfirstanswer.read, new getFirstAnswer(getfirstanswer.AudioAttributesImplApi26Parcelizer, setvideoaspectratio2));
        }
        if (iMediaBrowserCompatCustomActionResultReceiver >= IconCompatParcelizer[Math.max(setvideoaspectratio.IconCompatParcelizer(), setvideoaspectratio2.IconCompatParcelizer()) + 1]) {
            return new getFirstAnswer(setvideoaspectratio, setvideoaspectratio2);
        }
        return new AudioAttributesCompatParcelizer((byte) 0).write(setvideoaspectratio, setvideoaspectratio2);
    }

    private static MagicModuleTimeline write(setVideoAspectRatio setvideoaspectratio, setVideoAspectRatio setvideoaspectratio2) {
        int iMediaBrowserCompatCustomActionResultReceiver = setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver();
        int iMediaBrowserCompatCustomActionResultReceiver2 = setvideoaspectratio2.MediaBrowserCompatCustomActionResultReceiver();
        byte[] bArr = new byte[iMediaBrowserCompatCustomActionResultReceiver + iMediaBrowserCompatCustomActionResultReceiver2];
        setvideoaspectratio.RemoteActionCompatParcelizer(bArr, 0, 0, iMediaBrowserCompatCustomActionResultReceiver);
        setvideoaspectratio2.RemoteActionCompatParcelizer(bArr, 0, iMediaBrowserCompatCustomActionResultReceiver, iMediaBrowserCompatCustomActionResultReceiver2);
        return new MagicModuleTimeline(bArr);
    }

    @Override // kotlin.setVideoAspectRatio
    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.setVideoAspectRatio
    protected final int IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.setVideoAspectRatio
    protected final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer >= IconCompatParcelizer[this.MediaBrowserCompatCustomActionResultReceiver];
    }

    @Override // kotlin.setVideoAspectRatio
    protected final void write(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.AudioAttributesCompatParcelizer;
        if (i + i3 <= i4) {
            this.read.write(bArr, i, i2, i3);
        } else {
            if (i >= i4) {
                this.AudioAttributesImplApi26Parcelizer.write(bArr, i - i4, i2, i3);
                return;
            }
            int i5 = i4 - i;
            this.read.write(bArr, i, i2, i5);
            this.AudioAttributesImplApi26Parcelizer.write(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // kotlin.setVideoAspectRatio
    final void AudioAttributesCompatParcelizer(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = this.AudioAttributesCompatParcelizer;
        if (i + i2 <= i3) {
            this.read.AudioAttributesCompatParcelizer(outputStream, i, i2);
        } else {
            if (i >= i3) {
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(outputStream, i - i3, i2);
                return;
            }
            int i4 = i3 - i;
            this.read.AudioAttributesCompatParcelizer(outputStream, i, i4);
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(outputStream, 0, i2 - i4);
        }
    }

    @Override // kotlin.setVideoAspectRatio
    public final String read(String str) throws UnsupportedEncodingException {
        return new String(AudioAttributesImplApi26Parcelizer(), str);
    }

    @Override // kotlin.setVideoAspectRatio
    public final boolean read() {
        int iRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(0, 0, this.AudioAttributesCompatParcelizer);
        setVideoAspectRatio setvideoaspectratio = this.AudioAttributesImplApi26Parcelizer;
        return setvideoaspectratio.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, 0, setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver()) == 0;
    }

    @Override // kotlin.setVideoAspectRatio
    protected final int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        int i4 = this.AudioAttributesCompatParcelizer;
        if (i2 + i3 <= i4) {
            return this.read.RemoteActionCompatParcelizer(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer(i, i2, i5), 0, i3 - i5);
    }

    public final boolean equals(Object obj) {
        int iAudioAttributesImplBaseParcelizer;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setVideoAspectRatio)) {
            return false;
        }
        setVideoAspectRatio setvideoaspectratio = (setVideoAspectRatio) obj;
        if (this.AudioAttributesImplBaseParcelizer != setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver()) {
            return false;
        }
        if (this.AudioAttributesImplBaseParcelizer == 0) {
            return true;
        }
        if (this.RemoteActionCompatParcelizer == 0 || (iAudioAttributesImplBaseParcelizer = setvideoaspectratio.AudioAttributesImplBaseParcelizer()) == 0 || this.RemoteActionCompatParcelizer == iAudioAttributesImplBaseParcelizer) {
            return read(setvideoaspectratio);
        }
        return false;
    }

    private boolean read(setVideoAspectRatio setvideoaspectratio) {
        byte b = 0;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, b);
        MagicModuleTimeline next = iconCompatParcelizer.next();
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(setvideoaspectratio, b);
        MagicModuleTimeline next2 = iconCompatParcelizer2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iMediaBrowserCompatCustomActionResultReceiver = next.MediaBrowserCompatCustomActionResultReceiver() - i;
            int iMediaBrowserCompatCustomActionResultReceiver2 = next2.MediaBrowserCompatCustomActionResultReceiver() - i2;
            int iMin = Math.min(iMediaBrowserCompatCustomActionResultReceiver, iMediaBrowserCompatCustomActionResultReceiver2);
            if (!(i == 0 ? next.write(next2, i2, iMin) : next2.write(next, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.AudioAttributesImplBaseParcelizer;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iMediaBrowserCompatCustomActionResultReceiver) {
                next = iconCompatParcelizer.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iMediaBrowserCompatCustomActionResultReceiver2) {
                next2 = iconCompatParcelizer2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (iAudioAttributesCompatParcelizer == 0) {
            int i = this.AudioAttributesImplBaseParcelizer;
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i, 0, i);
            if (iAudioAttributesCompatParcelizer == 0) {
                iAudioAttributesCompatParcelizer = 1;
            }
            this.RemoteActionCompatParcelizer = iAudioAttributesCompatParcelizer;
        }
        return iAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setVideoAspectRatio
    protected final int AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setVideoAspectRatio
    protected final int AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        int i4 = this.AudioAttributesCompatParcelizer;
        if (i2 + i3 <= i4) {
            return this.read.AudioAttributesCompatParcelizer(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(this.read.AudioAttributesCompatParcelizer(i, i2, i5), 0, i3 - i5);
    }

    static class AudioAttributesCompatParcelizer {
        private final Stack<setVideoAspectRatio> read;

        private AudioAttributesCompatParcelizer() {
            this.read = new Stack<>();
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public setVideoAspectRatio write(setVideoAspectRatio setvideoaspectratio, setVideoAspectRatio setvideoaspectratio2) {
            IconCompatParcelizer(setvideoaspectratio);
            IconCompatParcelizer(setvideoaspectratio2);
            setVideoAspectRatio setvideoaspectratioPop = this.read.pop();
            while (!this.read.isEmpty()) {
                setvideoaspectratioPop = new getFirstAnswer(this.read.pop(), setvideoaspectratioPop, (byte) 0);
            }
            return setvideoaspectratioPop;
        }

        private void IconCompatParcelizer(setVideoAspectRatio setvideoaspectratio) {
            if (setvideoaspectratio.RemoteActionCompatParcelizer()) {
                RemoteActionCompatParcelizer(setvideoaspectratio);
                return;
            }
            if (setvideoaspectratio instanceof getFirstAnswer) {
                getFirstAnswer getfirstanswer = (getFirstAnswer) setvideoaspectratio;
                IconCompatParcelizer(getfirstanswer.read);
                IconCompatParcelizer(getfirstanswer.AudioAttributesImplApi26Parcelizer);
            } else {
                String strValueOf = String.valueOf(String.valueOf(setvideoaspectratio.getClass()));
                StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        private void RemoteActionCompatParcelizer(setVideoAspectRatio setvideoaspectratio) {
            byte b;
            int iIconCompatParcelizer = IconCompatParcelizer(setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver());
            int i = getFirstAnswer.IconCompatParcelizer[iIconCompatParcelizer + 1];
            if (!this.read.isEmpty() && this.read.peek().MediaBrowserCompatCustomActionResultReceiver() < i) {
                int i2 = getFirstAnswer.IconCompatParcelizer[iIconCompatParcelizer];
                setVideoAspectRatio setvideoaspectratioPop = this.read.pop();
                while (true) {
                    b = 0;
                    if (this.read.isEmpty() || this.read.peek().MediaBrowserCompatCustomActionResultReceiver() >= i2) {
                        break;
                    } else {
                        setvideoaspectratioPop = new getFirstAnswer(this.read.pop(), setvideoaspectratioPop, b);
                    }
                }
                getFirstAnswer getfirstanswer = new getFirstAnswer(setvideoaspectratioPop, setvideoaspectratio, b);
                while (!this.read.isEmpty()) {
                    if (this.read.peek().MediaBrowserCompatCustomActionResultReceiver() >= getFirstAnswer.IconCompatParcelizer[IconCompatParcelizer(getfirstanswer.MediaBrowserCompatCustomActionResultReceiver()) + 1]) {
                        break;
                    } else {
                        getfirstanswer = new getFirstAnswer(this.read.pop(), getfirstanswer, b);
                    }
                }
                this.read.push(getfirstanswer);
                return;
            }
            this.read.push(setvideoaspectratio);
        }

        private static int IconCompatParcelizer(int i) {
            int iBinarySearch = Arrays.binarySearch(getFirstAnswer.IconCompatParcelizer, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }
    }

    static class IconCompatParcelizer implements Iterator<MagicModuleTimeline> {
        private MagicModuleTimeline RemoteActionCompatParcelizer;
        private final Stack<getFirstAnswer> read;

        /* synthetic */ IconCompatParcelizer(setVideoAspectRatio setvideoaspectratio, byte b) {
            this(setvideoaspectratio);
        }

        private IconCompatParcelizer(setVideoAspectRatio setvideoaspectratio) {
            this.read = new Stack<>();
            this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(setvideoaspectratio);
        }

        private MagicModuleTimeline AudioAttributesCompatParcelizer(setVideoAspectRatio setvideoaspectratio) {
            while (setvideoaspectratio instanceof getFirstAnswer) {
                getFirstAnswer getfirstanswer = (getFirstAnswer) setvideoaspectratio;
                this.read.push(getfirstanswer);
                setvideoaspectratio = getfirstanswer.read;
            }
            return (MagicModuleTimeline) setvideoaspectratio;
        }

        private MagicModuleTimeline write() {
            while (!this.read.isEmpty()) {
                MagicModuleTimeline magicModuleTimelineAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.read.pop().AudioAttributesImplApi26Parcelizer);
                if (!magicModuleTimelineAudioAttributesCompatParcelizer.write()) {
                    return magicModuleTimelineAudioAttributesCompatParcelizer;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer != null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final MagicModuleTimeline next() {
            MagicModuleTimeline magicModuleTimeline = this.RemoteActionCompatParcelizer;
            if (magicModuleTimeline == null) {
                throw new NoSuchElementException();
            }
            this.RemoteActionCompatParcelizer = write();
            return magicModuleTimeline;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // kotlin.setVideoAspectRatio
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver */
    public final setVideoAspectRatio.AudioAttributesCompatParcelizer iterator() {
        return new write(this, (byte) 0);
    }

    class write implements setVideoAspectRatio.AudioAttributesCompatParcelizer {
        private int IconCompatParcelizer;
        private setVideoAspectRatio.AudioAttributesCompatParcelizer read;
        private final IconCompatParcelizer write;

        /* synthetic */ write(getFirstAnswer getfirstanswer, byte b) {
            this();
        }

        private write() {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(getFirstAnswer.this, (byte) 0);
            this.write = iconCompatParcelizer;
            this.read = iconCompatParcelizer.next().iterator();
            this.IconCompatParcelizer = getFirstAnswer.this.MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.IconCompatParcelizer > 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(AudioAttributesCompatParcelizer());
        }

        @Override // o.setVideoAspectRatio.AudioAttributesCompatParcelizer
        public final byte AudioAttributesCompatParcelizer() {
            if (!this.read.hasNext()) {
                this.read = this.write.next().iterator();
            }
            this.IconCompatParcelizer--;
            return this.read.AudioAttributesCompatParcelizer();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
