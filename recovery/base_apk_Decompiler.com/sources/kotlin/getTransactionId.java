package kotlin;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.setUrl;

/* JADX INFO: loaded from: classes4.dex */
final class getTransactionId<T> extends setUrl<T> implements RandomAccess {
    private int AudioAttributesCompatParcelizer;
    private final Object[] IconCompatParcelizer;
    private int read;
    private final int write;

    private getTransactionId(Object[] objArr, int i) {
        toMagicModuleMetaRepoModel.write(objArr, "");
        this.IconCompatParcelizer = objArr;
        if (i < 0) {
            throw new IllegalArgumentException("ring buffer filled size should not be negative but it is ".concat(String.valueOf(i)).toString());
        }
        if (i > objArr.length) {
            StringBuilder sb = new StringBuilder("ring buffer filled size: ");
            sb.append(i);
            sb.append(" cannot be larger than the buffer size: ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        this.write = objArr.length;
        this.read = i;
    }

    public getTransactionId(int i) {
        this(new Object[i], 0);
    }

    @Override // kotlin.setBigButtonText
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final int getIconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.setUrl, java.util.List
    public final T get(int i) {
        setUrl.Companion.IconCompatParcelizer(i, size());
        return (T) this.IconCompatParcelizer[(this.AudioAttributesCompatParcelizer + i) % this.write];
    }

    public final boolean RemoteActionCompatParcelizer() {
        return size() == this.write;
    }

    public static final class RemoteActionCompatParcelizer extends UpgradePlanResponseCompanion<T> {
        private /* synthetic */ getTransactionId<T> AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int read;

        RemoteActionCompatParcelizer(getTransactionId<T> gettransactionid) {
            this.AudioAttributesCompatParcelizer = gettransactionid;
            this.RemoteActionCompatParcelizer = gettransactionid.size();
            this.read = ((getTransactionId) gettransactionid).AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.UpgradePlanResponseCompanion
        protected final void write() {
            if (this.RemoteActionCompatParcelizer != 0) {
                RemoteActionCompatParcelizer(((getTransactionId) this.AudioAttributesCompatParcelizer).IconCompatParcelizer[this.read]);
                this.read = (this.read + 1) % ((getTransactionId) this.AudioAttributesCompatParcelizer).write;
                this.RemoteActionCompatParcelizer--;
                return;
            }
            read();
        }
    }

    @Override // kotlin.setUrl, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        int length = tArr.length;
        Object[] objArr = tArr;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(tArr, size());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArr2, "");
            objArr = objArr2;
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.AudioAttributesCompatParcelizer; i2 < size && i3 < this.write; i3++) {
            objArr[i2] = this.IconCompatParcelizer[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.IconCompatParcelizer[i];
            i2++;
            i++;
        }
        return (T[]) IntermediateLoginResponseBody.read(size, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getTransactionId<T> IconCompatParcelizer(int i) {
        Object[] array;
        int i2 = this.write;
        int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(i2 + (i2 >> 1) + 1, i);
        if (this.AudioAttributesCompatParcelizer == 0) {
            array = Arrays.copyOf(this.IconCompatParcelizer, iRemoteActionCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(array, "");
        } else {
            array = toArray(new Object[iRemoteActionCompatParcelizer]);
        }
        return new getTransactionId<>(array, size());
    }

    public final void RemoteActionCompatParcelizer(T t) {
        if (RemoteActionCompatParcelizer()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.IconCompatParcelizer[(this.AudioAttributesCompatParcelizer + size()) % this.write] = t;
        this.read = size() + 1;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n shouldn't be negative but it is ".concat(String.valueOf(i)).toString());
        }
        if (i > size()) {
            StringBuilder sb = new StringBuilder("n shouldn't be greater than the buffer size: n = ");
            sb.append(i);
            sb.append(", size = ");
            sb.append(size());
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i > 0) {
            int i2 = this.AudioAttributesCompatParcelizer;
            int i3 = (i2 + i) % this.write;
            if (i2 > i3) {
                getOrderDetails.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (Object) null, i2, this.write);
                getOrderDetails.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (Object) null, 0, i3);
            } else {
                getOrderDetails.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (Object) null, i2, i3);
            }
            this.AudioAttributesCompatParcelizer = i3;
            this.read = size() - i;
        }
    }
}
