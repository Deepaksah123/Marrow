package kotlin;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B#\b\u0016\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00028\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001fJ!\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b \u0010\u0016J'\u0010\u001b\u001a\u00020\t2\u0016\u0010\u0004\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J!\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\u0016J\u0019\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u001fJ!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u0016J'\u0010%\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\u0006\u0010&\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010'J\u001f\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010\u0018J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001fR\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00102"}, d2 = {"Lo/AppCompatCheckBox;", "K", "V", "", "p0", "<init>", "(Lo/AppCompatCheckBox;)V", "", "(I)V", "", "clear", "()V", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "RemoteActionCompatParcelizer", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "p1", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "()I", "IconCompatParcelizer", "(Ljava/lang/Object;I)I", "write", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "(I)Ljava/lang/Object;", "put", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "AudioAttributesCompatParcelizer", "replace", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "(ILjava/lang/Object;)Ljava/lang/Object;", "size", "", "toString", "()Ljava/lang/String;", "", "[Ljava/lang/Object;", "", "read", "[I", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class AppCompatCheckBox<K, V> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Object[] write;
    private int[] read;

    public AppCompatCheckBox(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = setCheckMarkDrawable.write;
        } else {
            iArr = new int[i];
        }
        this.read = iArr;
        if (i == 0) {
            objArr = setCheckMarkDrawable.read;
        } else {
            objArr = new Object[i << 1];
        }
        this.write = objArr;
    }

    public /* synthetic */ AppCompatCheckBox(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public AppCompatCheckBox(AppCompatCheckBox<? extends K, ? extends V> appCompatCheckBox) {
        this(0, 1, null);
        if (appCompatCheckBox != null) {
            write((AppCompatCheckBox) appCompatCheckBox);
        }
    }

    private final int IconCompatParcelizer(K p0, int p1) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return -1;
        }
        int iIconCompatParcelizer = setCheckMarkDrawable.IconCompatParcelizer(this.read, i, p1);
        if (iIconCompatParcelizer < 0 || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write[iIconCompatParcelizer << 1])) {
            return iIconCompatParcelizer;
        }
        int i2 = iIconCompatParcelizer + 1;
        while (i2 < i && this.read[i2] == p1) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write[i2 << 1])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iIconCompatParcelizer - 1; i3 >= 0 && this.read[i3] == p1; i3--) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write[i3 << 1])) {
                return i3;
            }
        }
        return ~i2;
    }

    private final int RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return -1;
        }
        int iIconCompatParcelizer = setCheckMarkDrawable.IconCompatParcelizer(this.read, i, 0);
        if (iIconCompatParcelizer < 0 || this.write[iIconCompatParcelizer << 1] == null) {
            return iIconCompatParcelizer;
        }
        int i2 = iIconCompatParcelizer + 1;
        while (i2 < i && this.read[i2] == 0) {
            if (this.write[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iIconCompatParcelizer - 1; i3 >= 0 && this.read[i3] == 0; i3--) {
            if (this.write[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public void clear() {
        if (this.RemoteActionCompatParcelizer > 0) {
            this.read = setCheckMarkDrawable.write;
            this.write = setCheckMarkDrawable.read;
            this.RemoteActionCompatParcelizer = 0;
        }
        if (this.RemoteActionCompatParcelizer > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void RemoteActionCompatParcelizer(int p0) {
        int i = this.RemoteActionCompatParcelizer;
        int[] iArr = this.read;
        if (iArr.length < p0) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArrCopyOf, "");
            this.read = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.write, p0 << 1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            this.write = objArrCopyOf;
        }
        if (this.RemoteActionCompatParcelizer != i) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K p0) {
        return write(p0) >= 0;
    }

    public final int write(K p0) {
        if (p0 == null) {
            return RemoteActionCompatParcelizer();
        }
        return IconCompatParcelizer(p0, p0.hashCode());
    }

    public final int IconCompatParcelizer(V p0) {
        int i = this.RemoteActionCompatParcelizer << 1;
        Object[] objArr = this.write;
        if (p0 == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(V p0) {
        return IconCompatParcelizer(p0) >= 0;
    }

    public final K write(int p0) {
        if (p0 < 0 || p0 >= this.RemoteActionCompatParcelizer) {
            AppCompatImageButton.read("Expected index to be within 0..size()-1, but was ".concat(String.valueOf(p0)));
        }
        return (K) this.write[p0 << 1];
    }

    public final V IconCompatParcelizer(int p0) {
        if (p0 < 0 || p0 >= this.RemoteActionCompatParcelizer) {
            AppCompatImageButton.read("Expected index to be within 0..size()-1, but was ".concat(String.valueOf(p0)));
        }
        return (V) this.write[(p0 << 1) + 1];
    }

    public V RemoteActionCompatParcelizer(int p0, V p1) {
        if (p0 < 0 || p0 >= this.RemoteActionCompatParcelizer) {
            AppCompatImageButton.read("Expected index to be within 0..size()-1, but was ".concat(String.valueOf(p0)));
        }
        int i = (p0 << 1) + 1;
        Object[] objArr = this.write;
        V v = (V) objArr[i];
        objArr[i] = p1;
        return v;
    }

    public boolean isEmpty() {
        return this.RemoteActionCompatParcelizer <= 0;
    }

    public V put(K p0, V p1) {
        int i = this.RemoteActionCompatParcelizer;
        int iHashCode = p0 != null ? p0.hashCode() : 0;
        int iIconCompatParcelizer = p0 != null ? IconCompatParcelizer(p0, iHashCode) : RemoteActionCompatParcelizer();
        if (iIconCompatParcelizer >= 0) {
            int i2 = (iIconCompatParcelizer << 1) + 1;
            Object[] objArr = this.write;
            V v = (V) objArr[i2];
            objArr[i2] = p1;
            return v;
        }
        int i3 = ~iIconCompatParcelizer;
        int[] iArr = this.read;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArrCopyOf, "");
            this.read = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.write, i4 << 1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            this.write = objArrCopyOf;
            if (i != this.RemoteActionCompatParcelizer) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.read;
            int i5 = i3 + 1;
            getOrderDetails.read(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.write;
            getOrderDetails.RemoteActionCompatParcelizer(objArr2, objArr2, i5 << 1, i3 << 1, this.RemoteActionCompatParcelizer << 1);
        }
        int i6 = this.RemoteActionCompatParcelizer;
        if (i == i6) {
            int[] iArr3 = this.read;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.write;
                int i7 = i3 << 1;
                objArr3[i7] = p0;
                objArr3[i7 + 1] = p1;
                this.RemoteActionCompatParcelizer = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void write(AppCompatCheckBox<? extends K, ? extends V> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = p0.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer + i);
        if (this.RemoteActionCompatParcelizer != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(p0.write(i2), p0.IconCompatParcelizer(i2));
            }
        } else if (i > 0) {
            getOrderDetails.read(p0.read, this.read, 0, 0, i);
            getOrderDetails.RemoteActionCompatParcelizer(p0.write, this.write, 0, 0, i << 1);
            this.RemoteActionCompatParcelizer = i;
        }
    }

    public V putIfAbsent(K p0, V p1) {
        V v = get(p0);
        return v == null ? put(p0, p1) : v;
    }

    public V remove(K p0) {
        int iWrite = write(p0);
        if (iWrite >= 0) {
            return AudioAttributesCompatParcelizer(iWrite);
        }
        return null;
    }

    public boolean remove(K p0, V p1) {
        int iWrite = write(p0);
        if (iWrite < 0 || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, IconCompatParcelizer(iWrite))) {
            return false;
        }
        AudioAttributesCompatParcelizer(iWrite);
        return true;
    }

    public V AudioAttributesCompatParcelizer(int p0) {
        if (p0 < 0 || p0 >= this.RemoteActionCompatParcelizer) {
            AppCompatImageButton.read("Expected index to be within 0..size()-1, but was ".concat(String.valueOf(p0)));
        }
        Object[] objArr = this.write;
        int i = p0 << 1;
        V v = (V) objArr[i + 1];
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 <= 1) {
            clear();
            return v;
        }
        int i3 = i2 - 1;
        int[] iArr = this.read;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            int i4 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArrCopyOf, "");
            this.read = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.write, i4 << 1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            this.write = objArrCopyOf;
            if (i2 != this.RemoteActionCompatParcelizer) {
                throw new ConcurrentModificationException();
            }
            if (p0 > 0) {
                getOrderDetails.read(iArr, this.read, 0, 0, p0);
                getOrderDetails.RemoteActionCompatParcelizer(objArr, this.write, 0, 0, i);
            }
            if (p0 < i3) {
                int i5 = p0 + 1;
                getOrderDetails.read(iArr, this.read, p0, i5, i2);
                getOrderDetails.RemoteActionCompatParcelizer(objArr, this.write, i, i5 << 1, i2 << 1);
            }
        } else {
            if (p0 < i3) {
                int i6 = p0 + 1;
                getOrderDetails.read(iArr, iArr, p0, i6, i2);
                Object[] objArr2 = this.write;
                getOrderDetails.RemoteActionCompatParcelizer(objArr2, objArr2, i, i6 << 1, i2 << 1);
            }
            Object[] objArr3 = this.write;
            int i7 = i3 << 1;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        }
        if (i2 != this.RemoteActionCompatParcelizer) {
            throw new ConcurrentModificationException();
        }
        this.RemoteActionCompatParcelizer = i3;
        return v;
    }

    public V replace(K p0, V p1) {
        int iWrite = write(p0);
        if (iWrite >= 0) {
            return RemoteActionCompatParcelizer(iWrite, p1);
        }
        return null;
    }

    public boolean replace(K p0, V p1, V p2) {
        int iWrite = write(p0);
        if (iWrite < 0 || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, IconCompatParcelizer(iWrite))) {
            return false;
        }
        RemoteActionCompatParcelizer(iWrite, p2);
        return true;
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        try {
            if (p0 instanceof AppCompatCheckBox) {
                if (getRemoteActionCompatParcelizer() != ((AppCompatCheckBox) p0).getRemoteActionCompatParcelizer()) {
                    return false;
                }
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) p0;
                int i = this.RemoteActionCompatParcelizer;
                for (int i2 = 0; i2 < i; i2++) {
                    K kWrite = write(i2);
                    V vIconCompatParcelizer = IconCompatParcelizer(i2);
                    Object obj = appCompatCheckBox.get(kWrite);
                    if (vIconCompatParcelizer == null) {
                        if (obj != null || !appCompatCheckBox.containsKey(kWrite)) {
                            return false;
                        }
                    } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(vIconCompatParcelizer, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(p0 instanceof Map) || getRemoteActionCompatParcelizer() != ((Map) p0).size()) {
                return false;
            }
            int i3 = this.RemoteActionCompatParcelizer;
            for (int i4 = 0; i4 < i3; i4++) {
                K kWrite2 = write(i4);
                V vIconCompatParcelizer2 = IconCompatParcelizer(i4);
                Object obj2 = ((Map) p0).get(kWrite2);
                if (vIconCompatParcelizer2 == null) {
                    if (obj2 != null || !((Map) p0).containsKey(kWrite2)) {
                        return false;
                    }
                } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(vIconCompatParcelizer2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.read;
        Object[] objArr = this.write;
        int i = this.RemoteActionCompatParcelizer;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.RemoteActionCompatParcelizer * 28);
        sb.append('{');
        int i = this.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kWrite = write(i2);
            if (kWrite != sb) {
                sb.append(kWrite);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vIconCompatParcelizer = IconCompatParcelizer(i2);
            if (vIconCompatParcelizer != sb) {
                sb.append(vIconCompatParcelizer);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public V get(K p0) {
        int iWrite = write(p0);
        if (iWrite >= 0) {
            return (V) this.write[(iWrite << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object p0, V p1) {
        int iWrite = write(p0);
        return iWrite >= 0 ? (V) this.write[(iWrite << 1) + 1] : p1;
    }

    public AppCompatCheckBox() {
        this(0, 1, null);
    }
}
