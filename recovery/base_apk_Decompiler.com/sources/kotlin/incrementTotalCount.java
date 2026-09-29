package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class incrementTotalCount extends setPublishedTime {
    public static final incrementTotalCount AudioAttributesCompatParcelizer;
    private static incrementTotalCount read;
    private final boolean RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public incrementTotalCount(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        toMagicModuleMetaRepoModel.write(iArr, "");
        this.RemoteActionCompatParcelizer = z;
    }

    public final boolean write() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public incrementTotalCount(int... iArr) {
        this(iArr, false);
        toMagicModuleMetaRepoModel.write(iArr, "");
    }

    public final incrementTotalCount write(boolean z) {
        incrementTotalCount incrementtotalcount = z ? AudioAttributesCompatParcelizer : read;
        return incrementtotalcount.AudioAttributesCompatParcelizer(this) ? incrementtotalcount : this;
    }

    public final boolean IconCompatParcelizer(incrementTotalCount incrementtotalcount) {
        toMagicModuleMetaRepoModel.write(incrementtotalcount, "");
        if (AudioAttributesCompatParcelizer() == 2 && read() == 0) {
            incrementTotalCount incrementtotalcount2 = AudioAttributesCompatParcelizer;
            if (incrementtotalcount2.AudioAttributesCompatParcelizer() == 1 && incrementtotalcount2.read() == 8) {
                return true;
            }
        }
        return read(incrementtotalcount.write(this.RemoteActionCompatParcelizer));
    }

    private final boolean read(incrementTotalCount incrementtotalcount) {
        if ((AudioAttributesCompatParcelizer() == 1 && read() == 0) || AudioAttributesCompatParcelizer() == 0) {
            return false;
        }
        return !AudioAttributesCompatParcelizer(incrementtotalcount);
    }

    private incrementTotalCount IconCompatParcelizer() {
        return (AudioAttributesCompatParcelizer() == 1 && read() == 9) ? new incrementTotalCount(2, 0, 0) : new incrementTotalCount(AudioAttributesCompatParcelizer(), read() + 1, 0);
    }

    private final boolean AudioAttributesCompatParcelizer(incrementTotalCount incrementtotalcount) {
        if (AudioAttributesCompatParcelizer() > incrementtotalcount.AudioAttributesCompatParcelizer()) {
            return true;
        }
        return AudioAttributesCompatParcelizer() >= incrementtotalcount.AudioAttributesCompatParcelizer() && read() > incrementtotalcount.read();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    static {
        new write((byte) 0);
        incrementTotalCount incrementtotalcount = new incrementTotalCount(1, 8, 0);
        AudioAttributesCompatParcelizer = incrementtotalcount;
        read = incrementtotalcount.IconCompatParcelizer();
        new incrementTotalCount(new int[0]);
    }
}
