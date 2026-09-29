package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setPublishedTime {
    private final int[] AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final List<Integer> RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public setPublishedTime(int... iArr) {
        List<Integer> listRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(iArr, "");
        this.AudioAttributesCompatParcelizer = iArr;
        Integer num = getOrderDetails.read(iArr, 0);
        this.write = num != null ? num.intValue() : -1;
        Integer num2 = getOrderDetails.read(iArr, 1);
        this.read = num2 != null ? num2.intValue() : -1;
        Integer num3 = getOrderDetails.read(iArr, 2);
        this.IconCompatParcelizer = num3 != null ? num3.intValue() : -1;
        if (iArr.length > 3) {
            if (iArr.length > 1024) {
                StringBuilder sb = new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length ");
                sb.append(iArr.length);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString());
            }
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.onPlay(getOrderDetails.AudioAttributesCompatParcelizer(iArr).subList(3, iArr.length));
        } else {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer = listRemoteActionCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final int read() {
        return this.read;
    }

    private int[] write() {
        return this.AudioAttributesCompatParcelizer;
    }

    protected final boolean read(setPublishedTime setpublishedtime) {
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        int i = this.write;
        return i == 0 ? setpublishedtime.write == 0 && this.read == setpublishedtime.read : i == setpublishedtime.write && this.read <= setpublishedtime.read;
    }

    public final boolean write(setPublishedTime setpublishedtime) {
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        return write(setpublishedtime.write, setpublishedtime.read, setpublishedtime.IconCompatParcelizer);
    }

    public final boolean write(int i, int i2, int i3) {
        int i4 = this.write;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.read;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.IconCompatParcelizer >= i3;
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = this.write;
        if (i <= 0) {
            return true;
        }
        if (i > 1) {
            return false;
        }
        int i2 = this.read;
        if (i2 < 4) {
            return true;
        }
        return i2 <= 4 && this.IconCompatParcelizer <= 1;
    }

    public String toString() {
        int[] iArrWrite = write();
        ArrayList arrayList = new ArrayList();
        for (int i : iArrWrite) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        ArrayList arrayList2 = arrayList;
        return arrayList2.isEmpty() ? "unknown" : IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayList2, ".", null, null, 0, null, null, 62);
    }

    public boolean equals(Object obj) {
        if (obj == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), obj.getClass())) {
            return false;
        }
        setPublishedTime setpublishedtime = (setPublishedTime) obj;
        return this.write == setpublishedtime.write && this.read == setpublishedtime.read && this.IconCompatParcelizer == setpublishedtime.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setpublishedtime.RemoteActionCompatParcelizer);
    }

    public int hashCode() {
        int i = this.write;
        int i2 = i + (i * 31) + this.read;
        int i3 = i2 + (i2 * 31) + this.IconCompatParcelizer;
        return i3 + (i3 * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    static {
        new read((byte) 0);
    }
}
