package kotlin;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class asUShort {
    private final boolean[] AudioAttributesCompatParcelizer;
    private final ReentrantLock RemoteActionCompatParcelizer = new ReentrantLock();
    private final long[] read;
    private boolean write;

    public asUShort(int i) {
        this.read = new long[i];
        this.AudioAttributesCompatParcelizer = new boolean[i];
    }

    public final IconCompatParcelizer[] read() {
        IconCompatParcelizer iconCompatParcelizer;
        ReentrantLock reentrantLock = this.RemoteActionCompatParcelizer;
        reentrantLock.lock();
        try {
            if (!this.write) {
                return null;
            }
            this.write = false;
            int length = this.read.length;
            IconCompatParcelizer[] iconCompatParcelizerArr = new IconCompatParcelizer[length];
            int i = 0;
            boolean z = false;
            while (i < length) {
                boolean z2 = true;
                boolean z3 = this.read[i] > 0;
                boolean[] zArr = this.AudioAttributesCompatParcelizer;
                if (z3 != zArr[i]) {
                    zArr[i] = z3;
                    iconCompatParcelizer = z3 ? IconCompatParcelizer.write : IconCompatParcelizer.RemoteActionCompatParcelizer;
                } else {
                    z2 = z;
                    iconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer;
                }
                iconCompatParcelizerArr[i] = iconCompatParcelizer;
                i++;
                z = z2;
            }
            return z ? iconCompatParcelizerArr : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean AudioAttributesCompatParcelizer(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        ReentrantLock reentrantLock = this.RemoteActionCompatParcelizer;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.read;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.write = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean write(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        ReentrantLock reentrantLock = this.RemoteActionCompatParcelizer;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.read;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    z = true;
                    this.write = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void write() {
        ReentrantLock reentrantLock = this.RemoteActionCompatParcelizer;
        reentrantLock.lock();
        try {
            boolean[] zArr = this.AudioAttributesCompatParcelizer;
            getOrderDetails.IconCompatParcelizer(zArr, false, 0, zArr.length);
            this.write = true;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        ReentrantLock reentrantLock = this.RemoteActionCompatParcelizer;
        reentrantLock.lock();
        try {
            this.write = true;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/asUShort$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private static final /* synthetic */ IconCompatParcelizer[] read;
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer("NO_OP", 0);
        public static final IconCompatParcelizer write = new IconCompatParcelizer("ADD", 1);
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer("REMOVE", 2);

        private IconCompatParcelizer(String str, int i) {
        }

        static {
            IconCompatParcelizer[] iconCompatParcelizerArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            read = iconCompatParcelizerArrAudioAttributesCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(iconCompatParcelizerArrAudioAttributesCompatParcelizer);
        }

        public static IconCompatParcelizer valueOf(String str) {
            return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
        }

        public static IconCompatParcelizer[] values() {
            return (IconCompatParcelizer[]) read.clone();
        }

        private static final /* synthetic */ IconCompatParcelizer[] AudioAttributesCompatParcelizer() {
            return new IconCompatParcelizer[]{IconCompatParcelizer, write, RemoteActionCompatParcelizer};
        }
    }
}
