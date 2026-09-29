package kotlin;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getIconThumbnail<T> extends setSearchTimes<T> {
    private int AudioAttributesCompatParcelizer;
    private Object[] write;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    private getIconThumbnail(Object[] objArr) {
        super((byte) 0);
        this.write = objArr;
        this.AudioAttributesCompatParcelizer = 0;
    }

    public getIconThumbnail() {
        this(new Object[20]);
    }

    @Override // kotlin.setSearchTimes
    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    private final void write(int i) {
        Object[] objArr = this.write;
        if (objArr.length <= i) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length << 1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            this.write = objArrCopyOf;
        }
    }

    @Override // kotlin.setSearchTimes
    public final void AudioAttributesCompatParcelizer(int i, T t) {
        toMagicModuleMetaRepoModel.write(t, "");
        write(i);
        if (this.write[i] == null) {
            this.AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer() + 1;
        }
        this.write[i] = t;
    }

    @Override // kotlin.setSearchTimes
    public final T AudioAttributesCompatParcelizer(int i) {
        return (T) getOrderDetails.write(this.write, i);
    }

    public static final class RemoteActionCompatParcelizer extends UpgradePlanResponseCompanion<T> {
        private /* synthetic */ getIconThumbnail<T> AudioAttributesCompatParcelizer;
        private int write = -1;

        RemoteActionCompatParcelizer(getIconThumbnail<T> geticonthumbnail) {
            this.AudioAttributesCompatParcelizer = geticonthumbnail;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.UpgradePlanResponseCompanion
        public final void write() {
            do {
                int i = this.write + 1;
                this.write = i;
                if (i >= ((getIconThumbnail) this.AudioAttributesCompatParcelizer).write.length) {
                    break;
                }
            } while (((getIconThumbnail) this.AudioAttributesCompatParcelizer).write[this.write] == null);
            if (this.write < ((getIconThumbnail) this.AudioAttributesCompatParcelizer).write.length) {
                Object obj = ((getIconThumbnail) this.AudioAttributesCompatParcelizer).write[this.write];
                toMagicModuleMetaRepoModel.read(obj, "");
                RemoteActionCompatParcelizer(obj);
                return;
            }
            read();
        }
    }

    @Override // kotlin.setSearchTimes, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new RemoteActionCompatParcelizer(this);
    }

    static {
        new write((byte) 0);
    }
}
