package kotlin;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.setUrl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\nB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u0013J\u000f\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000f\u0010\u0013J\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0013J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002¢\u0006\u0004\b\u000f\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b \u0010!J%\u0010 \u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b \u0010\"J\u0018\u0010#\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b'\u0010\u001bJ\u0017\u0010(\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010\u001bJ\u0017\u0010,\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010$J\u001d\u0010-\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b-\u0010!J\u001d\u0010.\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b.\u0010!J\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010\u0004J)\u00102\u001a\b\u0012\u0004\u0012\u00028\u000101\"\u0004\b\u0001\u001002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010401H\u0016¢\u0006\u0004\b2\u00105J\u001f\u00106\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0014¢\u0006\u0004\b6\u00107J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u00107J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u00107J\u001f\u0010,\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u00107J\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00108R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u000104018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00109R$\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b,\u0010:"}, d2 = {"Lo/setCardContent;", "E", "Lo/UpgradePlanResponseV2;", "<init>", "()V", "", "p0", "", "IconCompatParcelizer", "(I)V", "read", "AudioAttributesImplApi21Parcelizer", "(I)I", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "", "isEmpty", "()Z", "()Ljava/lang/Object;", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "AudioAttributesImplBaseParcelizer", "removeLast", "add", "(Ljava/lang/Object;)Z", "p1", "(ILjava/lang/Object;)V", "", "(ILjava/util/Collection;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "write", "removeAll", "retainAll", "clear", "T", "", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "(II)V", "I", "[Ljava/lang/Object;", "()I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setCardContent<E> extends UpgradePlanResponseV2<E> {
    private static final Object[] write = new Object[0];

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Object[] write = write;
    private int RemoteActionCompatParcelizer;

    @Override // kotlin.UpgradePlanResponseV2
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private final void IconCompatParcelizer(int p0) {
        if (p0 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.write;
        if (p0 <= objArr.length) {
            return;
        }
        if (objArr == write) {
            this.write = new Object[getQues.write(p0, 10)];
        } else {
            setUrl.Companion companion = setUrl.INSTANCE;
            read(setUrl.Companion.RemoteActionCompatParcelizer(this.write.length, p0));
        }
    }

    private final void read(int p0) {
        Object[] objArr = new Object[p0];
        Object[] objArr2 = this.write;
        getOrderDetails.RemoteActionCompatParcelizer(objArr2, objArr, 0, this.read, objArr2.length);
        Object[] objArr3 = this.write;
        int length = objArr3.length;
        int i = this.read;
        getOrderDetails.RemoteActionCompatParcelizer(objArr3, objArr, length - i, 0, i);
        this.read = 0;
        this.write = objArr;
    }

    private final int AudioAttributesImplApi21Parcelizer(int p0) {
        Object[] objArr = this.write;
        return p0 >= objArr.length ? p0 - objArr.length : p0;
    }

    private final int AudioAttributesImplApi26Parcelizer(int p0) {
        return p0 < 0 ? p0 + this.write.length : p0;
    }

    private final int AudioAttributesCompatParcelizer(int p0) {
        if (p0 == getOrderDetails.MediaDescriptionCompat(this.write)) {
            return 0;
        }
        return p0 + 1;
    }

    private final int RemoteActionCompatParcelizer(int p0) {
        return p0 == 0 ? getOrderDetails.MediaDescriptionCompat(this.write) : p0 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final E read() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.write[this.read];
    }

    public final E RemoteActionCompatParcelizer() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.write[this.read];
    }

    public final E AudioAttributesCompatParcelizer() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.write[AudioAttributesImplApi21Parcelizer(this.read + IntermediateLoginResponseBody.write((List) this))];
    }

    public final E IconCompatParcelizer() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.write[AudioAttributesImplApi21Parcelizer(this.read + IntermediateLoginResponseBody.write((List) this))];
    }

    public final void addFirst(E p0) {
        AudioAttributesImplApi26Parcelizer();
        IconCompatParcelizer(size() + 1);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.read);
        this.read = iRemoteActionCompatParcelizer;
        this.write[iRemoteActionCompatParcelizer] = p0;
        this.RemoteActionCompatParcelizer = size() + 1;
    }

    public final void addLast(E p0) {
        AudioAttributesImplApi26Parcelizer();
        IconCompatParcelizer(size() + 1);
        this.write[AudioAttributesImplApi21Parcelizer(this.read + size())] = p0;
        this.RemoteActionCompatParcelizer = size() + 1;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        AudioAttributesImplApi26Parcelizer();
        Object[] objArr = this.write;
        int i = this.read;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.read = AudioAttributesCompatParcelizer(i);
        this.RemoteActionCompatParcelizer = size() - 1;
        return e;
    }

    public final E AudioAttributesImplBaseParcelizer() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        AudioAttributesImplApi26Parcelizer();
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + IntermediateLoginResponseBody.write((List) this));
        Object[] objArr = this.write;
        E e = (E) objArr[iAudioAttributesImplApi21Parcelizer];
        objArr[iAudioAttributesImplApi21Parcelizer] = null;
        this.RemoteActionCompatParcelizer = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E p0) {
        addLast(p0);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int p0, E p1) {
        setUrl.Companion companion = setUrl.INSTANCE;
        setUrl.Companion.read(p0, size());
        if (p0 == size()) {
            addLast(p1);
            return;
        }
        if (p0 == 0) {
            addFirst(p1);
            return;
        }
        AudioAttributesImplApi26Parcelizer();
        IconCompatParcelizer(size() + 1);
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + p0);
        if (p0 < ((size() + 1) >> 1)) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer);
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.read);
            int i = this.read;
            if (iRemoteActionCompatParcelizer >= i) {
                Object[] objArr = this.write;
                objArr[iRemoteActionCompatParcelizer2] = objArr[i];
                getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr, i, i + 1, iRemoteActionCompatParcelizer + 1);
            } else {
                Object[] objArr2 = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr2, objArr2, i - 1, i, objArr2.length);
                Object[] objArr3 = this.write;
                objArr3[objArr3.length - 1] = objArr3[0];
                getOrderDetails.RemoteActionCompatParcelizer(objArr3, objArr3, 0, 1, iRemoteActionCompatParcelizer + 1);
            }
            this.write[iRemoteActionCompatParcelizer] = p1;
            this.read = iRemoteActionCompatParcelizer2;
        } else {
            int iAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer(this.read + size());
            if (iAudioAttributesImplApi21Parcelizer < iAudioAttributesImplApi21Parcelizer2) {
                Object[] objArr4 = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr4, objArr4, iAudioAttributesImplApi21Parcelizer + 1, iAudioAttributesImplApi21Parcelizer, iAudioAttributesImplApi21Parcelizer2);
            } else {
                Object[] objArr5 = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr5, objArr5, 1, 0, iAudioAttributesImplApi21Parcelizer2);
                Object[] objArr6 = this.write;
                objArr6[0] = objArr6[objArr6.length - 1];
                getOrderDetails.RemoteActionCompatParcelizer(objArr6, objArr6, iAudioAttributesImplApi21Parcelizer + 1, iAudioAttributesImplApi21Parcelizer, objArr6.length - 1);
            }
            this.write[iAudioAttributesImplApi21Parcelizer] = p1;
        }
        this.RemoteActionCompatParcelizer = size() + 1;
    }

    private final void RemoteActionCompatParcelizer(int p0, Collection<? extends E> p1) {
        Iterator<? extends E> it = p1.iterator();
        int length = this.write.length;
        while (p0 < length && it.hasNext()) {
            this.write[p0] = it.next();
            p0++;
        }
        int i = this.read;
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            this.write[i2] = it.next();
        }
        this.RemoteActionCompatParcelizer = size() + p1.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isEmpty()) {
            return false;
        }
        AudioAttributesImplApi26Parcelizer();
        IconCompatParcelizer(size() + p0.size());
        RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer(this.read + size()), p0);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int p0, Collection<? extends E> p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        setUrl.Companion companion = setUrl.INSTANCE;
        setUrl.Companion.read(p0, size());
        if (p1.isEmpty()) {
            return false;
        }
        if (p0 == size()) {
            return addAll(p1);
        }
        AudioAttributesImplApi26Parcelizer();
        IconCompatParcelizer(size() + p1.size());
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + size());
        int iAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer(this.read + p0);
        int size = p1.size();
        if (p0 < ((size() + 1) >> 1)) {
            int i = this.read;
            int length = i - size;
            if (iAudioAttributesImplApi21Parcelizer2 < i) {
                Object[] objArr = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr, length, i, objArr.length);
                if (size >= iAudioAttributesImplApi21Parcelizer2) {
                    Object[] objArr2 = this.write;
                    getOrderDetails.RemoteActionCompatParcelizer(objArr2, objArr2, objArr2.length - size, 0, iAudioAttributesImplApi21Parcelizer2);
                } else {
                    Object[] objArr3 = this.write;
                    getOrderDetails.RemoteActionCompatParcelizer(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.write;
                    getOrderDetails.RemoteActionCompatParcelizer(objArr4, objArr4, 0, size, iAudioAttributesImplApi21Parcelizer2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr5, objArr5, length, i, iAudioAttributesImplApi21Parcelizer2);
            } else {
                Object[] objArr6 = this.write;
                length += objArr6.length;
                int length2 = objArr6.length - length;
                if (length2 >= iAudioAttributesImplApi21Parcelizer2 - i) {
                    getOrderDetails.RemoteActionCompatParcelizer(objArr6, objArr6, length, i, iAudioAttributesImplApi21Parcelizer2);
                } else {
                    getOrderDetails.RemoteActionCompatParcelizer(objArr6, objArr6, length, i, i + length2);
                    Object[] objArr7 = this.write;
                    getOrderDetails.RemoteActionCompatParcelizer(objArr7, objArr7, 0, this.read + length2, iAudioAttributesImplApi21Parcelizer2);
                }
            }
            this.read = length;
            RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(iAudioAttributesImplApi21Parcelizer2 - size), p1);
        } else {
            int i2 = iAudioAttributesImplApi21Parcelizer2 + size;
            if (iAudioAttributesImplApi21Parcelizer2 < iAudioAttributesImplApi21Parcelizer) {
                int i3 = size + iAudioAttributesImplApi21Parcelizer;
                Object[] objArr8 = this.write;
                if (i3 <= objArr8.length) {
                    getOrderDetails.RemoteActionCompatParcelizer(objArr8, objArr8, i2, iAudioAttributesImplApi21Parcelizer2, iAudioAttributesImplApi21Parcelizer);
                } else if (i2 >= objArr8.length) {
                    getOrderDetails.RemoteActionCompatParcelizer(objArr8, objArr8, i2 - objArr8.length, iAudioAttributesImplApi21Parcelizer2, iAudioAttributesImplApi21Parcelizer);
                } else {
                    int length3 = iAudioAttributesImplApi21Parcelizer - (i3 - objArr8.length);
                    getOrderDetails.RemoteActionCompatParcelizer(objArr8, objArr8, 0, length3, iAudioAttributesImplApi21Parcelizer);
                    Object[] objArr9 = this.write;
                    getOrderDetails.RemoteActionCompatParcelizer(objArr9, objArr9, i2, iAudioAttributesImplApi21Parcelizer2, length3);
                }
            } else {
                Object[] objArr10 = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr10, objArr10, size, 0, iAudioAttributesImplApi21Parcelizer);
                Object[] objArr11 = this.write;
                if (i2 >= objArr11.length) {
                    getOrderDetails.RemoteActionCompatParcelizer(objArr11, objArr11, i2 - objArr11.length, iAudioAttributesImplApi21Parcelizer2, objArr11.length);
                } else {
                    getOrderDetails.RemoteActionCompatParcelizer(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.write;
                    getOrderDetails.RemoteActionCompatParcelizer(objArr12, objArr12, i2, iAudioAttributesImplApi21Parcelizer2, objArr12.length - size);
                }
            }
            RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer2, p1);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int p0) {
        setUrl.Companion companion = setUrl.INSTANCE;
        setUrl.Companion.IconCompatParcelizer(p0, size());
        return (E) this.write[AudioAttributesImplApi21Parcelizer(this.read + p0)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int p0, E p1) {
        setUrl.Companion companion = setUrl.INSTANCE;
        setUrl.Companion.IconCompatParcelizer(p0, size());
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + p0);
        Object[] objArr = this.write;
        E e = (E) objArr[iAudioAttributesImplApi21Parcelizer];
        objArr[iAudioAttributesImplApi21Parcelizer] = p1;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object p0) {
        return indexOf(p0) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object p0) {
        int i;
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + size());
        int length = this.read;
        if (length < iAudioAttributesImplApi21Parcelizer) {
            while (length < iAudioAttributesImplApi21Parcelizer) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write[length])) {
                    i = this.read;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iAudioAttributesImplApi21Parcelizer) {
            return -1;
        }
        int length2 = this.write.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iAudioAttributesImplApi21Parcelizer; i2++) {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write[i2])) {
                        length = i2 + this.write.length;
                        i = this.read;
                    }
                }
                return -1;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write[length])) {
                i = this.read;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object p0) {
        int iMediaDescriptionCompat;
        int i;
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + size());
        int i2 = this.read;
        if (i2 < iAudioAttributesImplApi21Parcelizer) {
            iMediaDescriptionCompat = iAudioAttributesImplApi21Parcelizer - 1;
            if (i2 <= iMediaDescriptionCompat) {
                while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write[iMediaDescriptionCompat])) {
                    if (iMediaDescriptionCompat != i2) {
                        iMediaDescriptionCompat--;
                    }
                }
                i = this.read;
                return iMediaDescriptionCompat - i;
            }
            return -1;
        }
        if (i2 > iAudioAttributesImplApi21Parcelizer) {
            int i3 = iAudioAttributesImplApi21Parcelizer - 1;
            while (true) {
                if (i3 >= 0) {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write[i3])) {
                        iMediaDescriptionCompat = i3 + this.write.length;
                        i = this.read;
                        break;
                    }
                    i3--;
                } else {
                    iMediaDescriptionCompat = getOrderDetails.MediaDescriptionCompat(this.write);
                    int i4 = this.read;
                    if (i4 <= iMediaDescriptionCompat) {
                        while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write[iMediaDescriptionCompat])) {
                            if (iMediaDescriptionCompat != i4) {
                                iMediaDescriptionCompat--;
                            }
                        }
                        i = this.read;
                    }
                }
            }
            return iMediaDescriptionCompat - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf == -1) {
            return false;
        }
        write(iIndexOf);
        return true;
    }

    @Override // kotlin.UpgradePlanResponseV2
    public final E write(int p0) {
        setUrl.Companion companion = setUrl.INSTANCE;
        setUrl.Companion.IconCompatParcelizer(p0, size());
        setCardContent<E> setcardcontent = this;
        if (p0 == IntermediateLoginResponseBody.write((List) setcardcontent)) {
            return removeLast();
        }
        if (p0 == 0) {
            return removeFirst();
        }
        AudioAttributesImplApi26Parcelizer();
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + p0);
        E e = (E) this.write[iAudioAttributesImplApi21Parcelizer];
        if (p0 < (size() >> 1)) {
            int i = this.read;
            if (iAudioAttributesImplApi21Parcelizer >= i) {
                Object[] objArr = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr, i + 1, i, iAudioAttributesImplApi21Parcelizer);
            } else {
                Object[] objArr2 = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr2, objArr2, 1, 0, iAudioAttributesImplApi21Parcelizer);
                Object[] objArr3 = this.write;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i2 = this.read;
                getOrderDetails.RemoteActionCompatParcelizer(objArr3, objArr3, i2 + 1, i2, objArr3.length - 1);
            }
            Object[] objArr4 = this.write;
            int i3 = this.read;
            objArr4[i3] = null;
            this.read = AudioAttributesCompatParcelizer(i3);
        } else {
            int iAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer(this.read + IntermediateLoginResponseBody.write((List) setcardcontent));
            if (iAudioAttributesImplApi21Parcelizer <= iAudioAttributesImplApi21Parcelizer2) {
                Object[] objArr5 = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr5, objArr5, iAudioAttributesImplApi21Parcelizer, iAudioAttributesImplApi21Parcelizer + 1, iAudioAttributesImplApi21Parcelizer2 + 1);
            } else {
                Object[] objArr6 = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr6, objArr6, iAudioAttributesImplApi21Parcelizer, iAudioAttributesImplApi21Parcelizer + 1, objArr6.length);
                Object[] objArr7 = this.write;
                objArr7[objArr7.length - 1] = objArr7[0];
                getOrderDetails.RemoteActionCompatParcelizer(objArr7, objArr7, 0, 1, iAudioAttributesImplApi21Parcelizer2 + 1);
            }
            this.write[iAudioAttributesImplApi21Parcelizer2] = null;
        }
        this.RemoteActionCompatParcelizer = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            AudioAttributesImplApi26Parcelizer();
            write(this.read, AudioAttributesImplApi21Parcelizer(this.read + size()));
        }
        this.read = 0;
        this.RemoteActionCompatParcelizer = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.length < size()) {
            p0 = (T[]) getOrderDetails.AudioAttributesCompatParcelizer(p0, size());
        }
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + size());
        int i = this.read;
        if (i < iAudioAttributesImplApi21Parcelizer) {
            getOrderDetails.read(this.write, p0, i, iAudioAttributesImplApi21Parcelizer, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.write;
            getOrderDetails.RemoteActionCompatParcelizer(objArr, p0, 0, this.read, objArr.length);
            Object[] objArr2 = this.write;
            getOrderDetails.RemoteActionCompatParcelizer(objArr2, p0, objArr2.length - this.read, 0, iAudioAttributesImplApi21Parcelizer);
        }
        return (T[]) IntermediateLoginResponseBody.read(size(), p0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int p0, int p1) {
        setUrl.Companion companion = setUrl.INSTANCE;
        setUrl.Companion.write(p0, p1, size());
        int i = p1 - p0;
        if (i == 0) {
            return;
        }
        if (i == size()) {
            clear();
            return;
        }
        if (i == 1) {
            write(p0);
            return;
        }
        AudioAttributesImplApi26Parcelizer();
        if (p0 < size() - p1) {
            IconCompatParcelizer(p0, p1);
            int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + i);
            write(this.read, iAudioAttributesImplApi21Parcelizer);
            this.read = iAudioAttributesImplApi21Parcelizer;
        } else {
            read(p0, p1);
            int iAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer(this.read + size());
            write(AudioAttributesImplApi26Parcelizer(iAudioAttributesImplApi21Parcelizer2 - i), iAudioAttributesImplApi21Parcelizer2);
        }
        this.RemoteActionCompatParcelizer = size() - i;
    }

    private final void IconCompatParcelizer(int p0, int p1) {
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + (p0 - 1));
        int iAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer(this.read + (p1 - 1));
        while (p0 > 0) {
            int i = iAudioAttributesImplApi21Parcelizer + 1;
            int iMin = Math.min(p0, Math.min(i, iAudioAttributesImplApi21Parcelizer2 + 1));
            Object[] objArr = this.write;
            int i2 = iAudioAttributesImplApi21Parcelizer2 - iMin;
            int i3 = iAudioAttributesImplApi21Parcelizer - iMin;
            getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr, i2 + 1, i3 + 1, i);
            iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi26Parcelizer(i3);
            iAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi26Parcelizer(i2);
            p0 -= iMin;
        }
    }

    private final void read(int p0, int p1) {
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.read + p1);
        int iAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer(this.read + p0);
        int size = size();
        while (true) {
            size -= p1;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.write;
            p1 = Math.min(size, Math.min(objArr.length - iAudioAttributesImplApi21Parcelizer, objArr.length - iAudioAttributesImplApi21Parcelizer2));
            Object[] objArr2 = this.write;
            int i = iAudioAttributesImplApi21Parcelizer + p1;
            getOrderDetails.RemoteActionCompatParcelizer(objArr2, objArr2, iAudioAttributesImplApi21Parcelizer2, iAudioAttributesImplApi21Parcelizer, i);
            iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i);
            iAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer(iAudioAttributesImplApi21Parcelizer2 + p1);
        }
    }

    private final void write(int p0, int p1) {
        if (p0 < p1) {
            getOrderDetails.AudioAttributesCompatParcelizer(this.write, (Object) null, p0, p1);
            return;
        }
        Object[] objArr = this.write;
        getOrderDetails.AudioAttributesCompatParcelizer(objArr, (Object) null, p0, objArr.length);
        getOrderDetails.AudioAttributesCompatParcelizer(this.write, (Object) null, 0, p1);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> p0) {
        int iAudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.write.length != 0) {
            int iAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer(this.read + size());
            int i = this.read;
            if (i < iAudioAttributesImplApi21Parcelizer2) {
                iAudioAttributesImplApi21Parcelizer = i;
                while (i < iAudioAttributesImplApi21Parcelizer2) {
                    Object obj = this.write[i];
                    if (p0.contains(obj)) {
                        z = true;
                    } else {
                        this.write[iAudioAttributesImplApi21Parcelizer] = obj;
                        iAudioAttributesImplApi21Parcelizer++;
                    }
                    i++;
                }
                getOrderDetails.AudioAttributesCompatParcelizer(this.write, (Object) null, iAudioAttributesImplApi21Parcelizer, iAudioAttributesImplApi21Parcelizer2);
            } else {
                int length = this.write.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.write;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (p0.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.write[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i2);
                for (int i3 = 0; i3 < iAudioAttributesImplApi21Parcelizer2; i3++) {
                    Object[] objArr2 = this.write;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (p0.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.write[iAudioAttributesImplApi21Parcelizer] = obj3;
                        iAudioAttributesImplApi21Parcelizer = AudioAttributesCompatParcelizer(iAudioAttributesImplApi21Parcelizer);
                    }
                }
                z = z2;
            }
            if (z) {
                AudioAttributesImplApi26Parcelizer();
                this.RemoteActionCompatParcelizer = AudioAttributesImplApi26Parcelizer(iAudioAttributesImplApi21Parcelizer - this.read);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> p0) {
        int iAudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.write.length != 0) {
            int iAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer(this.read + size());
            int i = this.read;
            if (i < iAudioAttributesImplApi21Parcelizer2) {
                iAudioAttributesImplApi21Parcelizer = i;
                while (i < iAudioAttributesImplApi21Parcelizer2) {
                    Object obj = this.write[i];
                    if (p0.contains(obj)) {
                        this.write[iAudioAttributesImplApi21Parcelizer] = obj;
                        iAudioAttributesImplApi21Parcelizer++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                getOrderDetails.AudioAttributesCompatParcelizer(this.write, (Object) null, iAudioAttributesImplApi21Parcelizer, iAudioAttributesImplApi21Parcelizer2);
            } else {
                int length = this.write.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.write;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (p0.contains(obj2)) {
                        this.write[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i2);
                for (int i3 = 0; i3 < iAudioAttributesImplApi21Parcelizer2; i3++) {
                    Object[] objArr2 = this.write;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (p0.contains(obj3)) {
                        this.write[iAudioAttributesImplApi21Parcelizer] = obj3;
                        iAudioAttributesImplApi21Parcelizer = AudioAttributesCompatParcelizer(iAudioAttributesImplApi21Parcelizer);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                AudioAttributesImplApi26Parcelizer();
                this.RemoteActionCompatParcelizer = AudioAttributesImplApi26Parcelizer(iAudioAttributesImplApi21Parcelizer - this.read);
            }
        }
        return z;
    }
}
