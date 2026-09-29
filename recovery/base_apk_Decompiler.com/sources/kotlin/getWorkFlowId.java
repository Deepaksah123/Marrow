package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.setUrl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0000\u0018\u0000 Q*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0003QRSB\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0015\u0010'\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u001d\u0010'\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u001e\u0010+\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\b\u0010.\u001a\u00020)H\u0016J\u0015\u0010/\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001cJ\u0015\u00100\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u0016\u00101\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u0016\u00102\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0016J'\u00106\u001a\b\u0012\u0004\u0012\u0002H70\r\"\u0004\b\u0001\u001072\f\u00108\u001a\b\u0012\u0004\u0012\u0002H70\rH\u0016¢\u0006\u0002\u00109J\u0015\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\rH\u0016¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010=\u001a\u00020\tH\u0016J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020)H\u0002J\b\u0010A\u001a\u00020)H\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\tH\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020\tH\u0002J\u0014\u0010F\u001a\u00020\u00112\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J\u0018\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0002J\u001d\u0010I\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010*J&\u0010J\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010C\u001a\u00020\tH\u0002J\u0015\u0010K\u001a\u00028\u00002\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u001cJ\u0018\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\tH\u0002J.\u0010O\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010P\u001a\u00020\u0011H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006T"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initialCapacity", "", "<init>", "(I)V", "backing", "", "[Ljava/lang/Object;", SessionDescription.ATTR_LENGTH, "isReadOnly", "", "build", "", "writeReplace", "", "size", "getSize", "()I", "isEmpty", "get", "index", "(I)Ljava/lang/Object;", "set", "element", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "iterator", "", "listIterator", "", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "removeAt", "remove", "removeAll", "retainAll", "subList", "fromIndex", "toIndex", "toArray", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "other", "hashCode", "toString", "", "registerModification", "checkIsMutable", "ensureExtraCapacity", "n", "ensureCapacityInternal", "minCapacity", "contentEquals", "insertAtInternal", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "addAtInternal", "addAllInternal", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainOrRemoveAllInternal", "retain", "Companion", "Itr", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getWorkFlowId<E> extends UpgradePlanResponseV2<E> implements List<E>, RandomAccess, Serializable {
    private static final getWorkFlowId AudioAttributesCompatParcelizer;
    private static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    private E[] RemoteActionCompatParcelizer;
    private int read;
    private boolean write;

    public getWorkFlowId(int i) {
        this.RemoteActionCompatParcelizer = (E[]) ProResponse.RemoteActionCompatParcelizer(i);
    }

    public /* synthetic */ getWorkFlowId(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getWorkFlowId$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/getWorkFlowId;", "", "AudioAttributesCompatParcelizer", "Lo/getWorkFlowId;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        getWorkFlowId getworkflowid = new getWorkFlowId(0);
        getworkflowid.write = true;
        AudioAttributesCompatParcelizer = getworkflowid;
    }

    public final List<E> IconCompatParcelizer() {
        RemoteActionCompatParcelizer();
        this.write = true;
        return this.read > 0 ? this : AudioAttributesCompatParcelizer;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.write) {
            return new isMagicModuleEnabled(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.UpgradePlanResponseV2
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.read == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int index) {
        setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
        setUrl.Companion.IconCompatParcelizer(index, this.read);
        return this.RemoteActionCompatParcelizer[index];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int index, E element) {
        RemoteActionCompatParcelizer();
        setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
        setUrl.Companion.IconCompatParcelizer(index, this.read);
        E[] eArr = this.RemoteActionCompatParcelizer;
        E e = eArr[index];
        eArr[index] = element;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object element) {
        for (int i = 0; i < this.read; i++) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object element) {
        for (int i = this.read - 1; i >= 0; i--) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int index) {
        setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
        setUrl.Companion.read(index, this.read);
        return new IconCompatParcelizer(this, index);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E element) {
        RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(this.read, element);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int index, E element) {
        RemoteActionCompatParcelizer();
        setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
        setUrl.Companion.read(index, this.read);
        RemoteActionCompatParcelizer(index, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        toMagicModuleMetaRepoModel.write(elements, "");
        RemoteActionCompatParcelizer();
        int size = elements.size();
        RemoteActionCompatParcelizer(this.read, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int index, Collection<? extends E> elements) {
        toMagicModuleMetaRepoModel.write(elements, "");
        RemoteActionCompatParcelizer();
        setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
        setUrl.Companion.read(index, this.read);
        int size = elements.size();
        RemoteActionCompatParcelizer(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(0, this.read);
    }

    @Override // kotlin.UpgradePlanResponseV2
    public final E write(int i) {
        RemoteActionCompatParcelizer();
        setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
        setUrl.Companion.IconCompatParcelizer(i, this.read);
        return AudioAttributesCompatParcelizer(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object element) {
        RemoteActionCompatParcelizer();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            write(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> elements) {
        toMagicModuleMetaRepoModel.write(elements, "");
        RemoteActionCompatParcelizer();
        return write(0, this.read, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> elements) {
        toMagicModuleMetaRepoModel.write(elements, "");
        RemoteActionCompatParcelizer();
        return write(0, this.read, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int fromIndex, int toIndex) {
        setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
        setUrl.Companion.write(fromIndex, toIndex, this.read);
        return new read(this.RemoteActionCompatParcelizer, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        toMagicModuleMetaRepoModel.write(array, "");
        int length = array.length;
        int i = this.read;
        if (length < i) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.RemoteActionCompatParcelizer, 0, i, array.getClass());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tArr, "");
            return tArr;
        }
        getOrderDetails.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, array, 0, 0, i);
        return (T[]) IntermediateLoginResponseBody.read(this.read, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return getOrderDetails.IconCompatParcelizer(this.RemoteActionCompatParcelizer, 0, this.read);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object other) {
        if (other != this) {
            return (other instanceof List) && AudioAttributesCompatParcelizer((List<?>) other);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return ProResponse.read(this.RemoteActionCompatParcelizer, 0, this.read);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ProResponse.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, 0, this.read, this);
    }

    private final void AudioAttributesCompatParcelizer() {
        ((AbstractList) this).modCount++;
    }

    private final void RemoteActionCompatParcelizer() {
        if (this.write) {
            throw new UnsupportedOperationException();
        }
    }

    private final void RemoteActionCompatParcelizer(int i) {
        read(this.read + i);
    }

    private final void read(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > this.RemoteActionCompatParcelizer.length) {
            setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
            this.RemoteActionCompatParcelizer = (E[]) ProResponse.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setUrl.Companion.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.length, i));
        }
    }

    private final boolean AudioAttributesCompatParcelizer(List<?> list) {
        return ProResponse.read(this.RemoteActionCompatParcelizer, 0, this.read, list);
    }

    private final void write(int i, int i2) {
        RemoteActionCompatParcelizer(i2);
        E[] eArr = this.RemoteActionCompatParcelizer;
        getOrderDetails.RemoteActionCompatParcelizer(eArr, eArr, i + i2, i, this.read);
        this.read += i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(int i, E e) {
        AudioAttributesCompatParcelizer();
        write(i, 1);
        this.RemoteActionCompatParcelizer[i] = e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(int i, Collection<? extends E> collection, int i2) {
        AudioAttributesCompatParcelizer();
        write(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.RemoteActionCompatParcelizer[i + i3] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E AudioAttributesCompatParcelizer(int i) {
        AudioAttributesCompatParcelizer();
        E[] eArr = this.RemoteActionCompatParcelizer;
        E e = eArr[i];
        getOrderDetails.RemoteActionCompatParcelizer(eArr, eArr, i, i + 1, this.read);
        ProResponse.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.read - 1);
        this.read--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(int i, int i2) {
        if (i2 > 0) {
            AudioAttributesCompatParcelizer();
        }
        E[] eArr = this.RemoteActionCompatParcelizer;
        getOrderDetails.RemoteActionCompatParcelizer(eArr, eArr, i, i + i2, this.read);
        E[] eArr2 = this.RemoteActionCompatParcelizer;
        int i3 = this.read;
        ProResponse.write(eArr2, i3 - i2, i3);
        this.read -= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int write(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.RemoteActionCompatParcelizer[i5]) == z) {
                E[] eArr = this.RemoteActionCompatParcelizer;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.RemoteActionCompatParcelizer;
        getOrderDetails.RemoteActionCompatParcelizer(eArr2, eArr2, i4 + i, i2 + i, this.read);
        E[] eArr3 = this.RemoteActionCompatParcelizer;
        int i7 = this.read;
        ProResponse.write(eArr3, i7 - i6, i7);
        if (i6 > 0) {
            AudioAttributesCompatParcelizer();
        }
        this.read -= i6;
        return i6;
    }

    public getWorkFlowId() {
        this(0, 1, null);
    }

    static final class IconCompatParcelizer<E> implements ListIterator<E>, getOffline {
        private int AudioAttributesCompatParcelizer;
        private final getWorkFlowId<E> IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int read;

        public IconCompatParcelizer(getWorkFlowId<E> getworkflowid, int i) {
            toMagicModuleMetaRepoModel.write(getworkflowid, "");
            this.IconCompatParcelizer = getworkflowid;
            this.RemoteActionCompatParcelizer = i;
            this.read = -1;
            this.AudioAttributesCompatParcelizer = ((AbstractList) getworkflowid).modCount;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.RemoteActionCompatParcelizer > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer < ((getWorkFlowId) this.IconCompatParcelizer).read;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.RemoteActionCompatParcelizer - 1;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            AudioAttributesCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.RemoteActionCompatParcelizer = i2;
            this.read = i2;
            return (E) ((getWorkFlowId) this.IconCompatParcelizer).RemoteActionCompatParcelizer[this.read];
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            AudioAttributesCompatParcelizer();
            if (this.RemoteActionCompatParcelizer >= ((getWorkFlowId) this.IconCompatParcelizer).read) {
                throw new NoSuchElementException();
            }
            int i = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i + 1;
            this.read = i;
            return (E) ((getWorkFlowId) this.IconCompatParcelizer).RemoteActionCompatParcelizer[this.read];
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            AudioAttributesCompatParcelizer();
            int i = this.read;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.IconCompatParcelizer.set(i, e);
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            AudioAttributesCompatParcelizer();
            getWorkFlowId<E> getworkflowid = this.IconCompatParcelizer;
            int i = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i + 1;
            getworkflowid.add(i, e);
            this.read = -1;
            this.AudioAttributesCompatParcelizer = ((AbstractList) this.IconCompatParcelizer).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            AudioAttributesCompatParcelizer();
            int i = this.read;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.IconCompatParcelizer.write(i);
            this.RemoteActionCompatParcelizer = this.read;
            this.read = -1;
            this.AudioAttributesCompatParcelizer = ((AbstractList) this.IconCompatParcelizer).modCount;
        }

        private final void AudioAttributesCompatParcelizer() {
            if (((AbstractList) this.IconCompatParcelizer).modCount != this.AudioAttributesCompatParcelizer) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001TBC\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010%J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0096\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010*2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0015\u0010+\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010,J\u001d\u0010+\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u001e\u0010.\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\b\u00101\u001a\u00020\u0016H\u0016J\u0015\u00102\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010 J\u0015\u00103\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010,J\u0016\u00104\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u0016\u00105\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0016J'\u00109\u001a\b\u0012\u0004\u0012\u0002H:0\t\"\u0004\b\u0002\u0010:2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H:0\tH\u0016¢\u0006\u0002\u0010<J\u0015\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\tH\u0016¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u001d2\b\u0010?\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010@\u001a\u00020\u000bH\u0016J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020\u0016H\u0002J\b\u0010D\u001a\u00020\u0016H\u0002J\b\u0010E\u001a\u00020\u0016H\u0002J\u0014\u0010H\u001a\u00020\u001d2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030IH\u0002J\u001d\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010-J&\u0010L\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0001002\u0006\u0010M\u001a\u00020\u000bH\u0002J\u0015\u0010N\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010 J\u0018\u0010O\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000bH\u0002J.\u0010R\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0001002\u0006\u0010S\u001a\u00020\u001dH\u0002R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010F\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006U"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "backing", "", "offset", "", SessionDescription.ATTR_LENGTH, "parent", "root", "Lkotlin/collections/builders/ListBuilder;", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "size", "getSize", "()I", "isEmpty", "", "get", "index", "(I)Ljava/lang/Object;", "set", "element", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "iterator", "", "listIterator", "", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "removeAt", "remove", "removeAll", "retainAll", "subList", "fromIndex", "toIndex", "toArray", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "other", "hashCode", "toString", "", "registerModification", "checkForComodification", "checkIsMutable", "isReadOnly", "()Z", "contentEquals", "", "addAtInternal", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "addAllInternal", "n", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainOrRemoveAllInternal", "retain", "Itr", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read<E> extends UpgradePlanResponseV2<E> implements List<E>, RandomAccess, Serializable {
        private final getWorkFlowId<E> AudioAttributesCompatParcelizer;
        private E[] IconCompatParcelizer;
        private final read<E> RemoteActionCompatParcelizer;
        private int read;
        private final int write;

        public read(E[] eArr, int i, int i2, read<E> readVar, getWorkFlowId<E> getworkflowid) {
            toMagicModuleMetaRepoModel.write(eArr, "");
            toMagicModuleMetaRepoModel.write(getworkflowid, "");
            this.IconCompatParcelizer = eArr;
            this.write = i;
            this.read = i2;
            this.RemoteActionCompatParcelizer = readVar;
            this.AudioAttributesCompatParcelizer = getworkflowid;
            ((AbstractList) this).modCount = ((AbstractList) getworkflowid).modCount;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (IconCompatParcelizer()) {
                return new isMagicModuleEnabled(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final void readObject(ObjectInputStream input) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        @Override // kotlin.UpgradePlanResponseV2
        /* JADX INFO: renamed from: write */
        public final int getRemoteActionCompatParcelizer() {
            RemoteActionCompatParcelizer();
            return this.read;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            RemoteActionCompatParcelizer();
            return this.read == 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int index) {
            RemoteActionCompatParcelizer();
            setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
            setUrl.Companion.IconCompatParcelizer(index, this.read);
            return this.IconCompatParcelizer[this.write + index];
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int index, E element) {
            read();
            RemoteActionCompatParcelizer();
            setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
            setUrl.Companion.IconCompatParcelizer(index, this.read);
            E[] eArr = this.IconCompatParcelizer;
            int i = this.write + index;
            E e = eArr[i];
            eArr[i] = element;
            return e;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object element) {
            RemoteActionCompatParcelizer();
            for (int i = 0; i < this.read; i++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer[this.write + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object element) {
            RemoteActionCompatParcelizer();
            for (int i = this.read - 1; i >= 0; i--) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer[this.write + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int index) {
            RemoteActionCompatParcelizer();
            setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
            setUrl.Companion.read(index, this.read);
            return new write(this, index);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E element) {
            read();
            RemoteActionCompatParcelizer();
            read(this.write + this.read, element);
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int index, E element) {
            read();
            RemoteActionCompatParcelizer();
            setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
            setUrl.Companion.read(index, this.read);
            read(this.write + index, element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> elements) {
            toMagicModuleMetaRepoModel.write(elements, "");
            read();
            RemoteActionCompatParcelizer();
            int size = elements.size();
            RemoteActionCompatParcelizer(this.write + this.read, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int index, Collection<? extends E> elements) {
            toMagicModuleMetaRepoModel.write(elements, "");
            read();
            RemoteActionCompatParcelizer();
            setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
            setUrl.Companion.read(index, this.read);
            int size = elements.size();
            RemoteActionCompatParcelizer(this.write + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            read();
            RemoteActionCompatParcelizer();
            read(this.write, this.read);
        }

        @Override // kotlin.UpgradePlanResponseV2
        public final E write(int i) {
            read();
            RemoteActionCompatParcelizer();
            setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
            setUrl.Companion.IconCompatParcelizer(i, this.read);
            return read(this.write + i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object element) {
            read();
            RemoteActionCompatParcelizer();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                write(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<?> elements) {
            toMagicModuleMetaRepoModel.write(elements, "");
            read();
            RemoteActionCompatParcelizer();
            return read(this.write, this.read, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<?> elements) {
            toMagicModuleMetaRepoModel.write(elements, "");
            read();
            RemoteActionCompatParcelizer();
            return read(this.write, this.read, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int fromIndex, int toIndex) {
            setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
            setUrl.Companion.write(fromIndex, toIndex, this.read);
            return new read(this.IconCompatParcelizer, this.write + fromIndex, toIndex - fromIndex, this, this.AudioAttributesCompatParcelizer);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] array) {
            toMagicModuleMetaRepoModel.write(array, "");
            RemoteActionCompatParcelizer();
            int length = array.length;
            int i = this.read;
            if (length < i) {
                E[] eArr = this.IconCompatParcelizer;
                int i2 = this.write;
                T[] tArr = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, array.getClass());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tArr, "");
                return tArr;
            }
            E[] eArr2 = this.IconCompatParcelizer;
            int i3 = this.write;
            getOrderDetails.RemoteActionCompatParcelizer(eArr2, array, 0, i3, i + i3);
            return (T[]) IntermediateLoginResponseBody.read(this.read, array);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            RemoteActionCompatParcelizer();
            E[] eArr = this.IconCompatParcelizer;
            int i = this.write;
            return getOrderDetails.IconCompatParcelizer(eArr, i, this.read + i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object other) {
            RemoteActionCompatParcelizer();
            if (other != this) {
                return (other instanceof List) && AudioAttributesCompatParcelizer((List<?>) other);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            RemoteActionCompatParcelizer();
            return ProResponse.read(this.IconCompatParcelizer, this.write, this.read);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            RemoteActionCompatParcelizer();
            return ProResponse.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.write, this.read, this);
        }

        private final void AudioAttributesCompatParcelizer() {
            ((AbstractList) this).modCount++;
        }

        private final void RemoteActionCompatParcelizer() {
            if (((AbstractList) this.AudioAttributesCompatParcelizer).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void read() {
            if (IconCompatParcelizer()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean IconCompatParcelizer() {
            return ((getWorkFlowId) this.AudioAttributesCompatParcelizer).write;
        }

        private final boolean AudioAttributesCompatParcelizer(List<?> list) {
            return ProResponse.read(this.IconCompatParcelizer, this.write, this.read, list);
        }

        private final void read(int i, E e) {
            AudioAttributesCompatParcelizer();
            read<E> readVar = this.RemoteActionCompatParcelizer;
            if (readVar == null) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, e);
            } else {
                readVar.read(i, e);
            }
            this.IconCompatParcelizer = (E[]) ((getWorkFlowId) this.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer;
            this.read++;
        }

        private final void RemoteActionCompatParcelizer(int i, Collection<? extends E> collection, int i2) {
            AudioAttributesCompatParcelizer();
            read<E> readVar = this.RemoteActionCompatParcelizer;
            if (readVar == null) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, collection, i2);
            } else {
                readVar.RemoteActionCompatParcelizer(i, collection, i2);
            }
            this.IconCompatParcelizer = (E[]) ((getWorkFlowId) this.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer;
            this.read += i2;
        }

        private final E read(int i) {
            E e;
            AudioAttributesCompatParcelizer();
            read<E> readVar = this.RemoteActionCompatParcelizer;
            if (readVar == null) {
                e = (E) this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
            } else {
                e = readVar.read(i);
            }
            this.read--;
            return e;
        }

        private final void read(int i, int i2) {
            if (i2 > 0) {
                AudioAttributesCompatParcelizer();
            }
            read<E> readVar = this.RemoteActionCompatParcelizer;
            if (readVar == null) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, i2);
            } else {
                readVar.read(i, i2);
            }
            this.read -= i2;
        }

        private final int read(int i, int i2, Collection<? extends E> collection, boolean z) {
            int iWrite;
            read<E> readVar = this.RemoteActionCompatParcelizer;
            if (readVar == null) {
                iWrite = this.AudioAttributesCompatParcelizer.write(i, i2, collection, z);
            } else {
                iWrite = readVar.read(i, i2, collection, z);
            }
            if (iWrite > 0) {
                AudioAttributesCompatParcelizer();
            }
            this.read -= iWrite;
            return iWrite;
        }

        static final class write<E> implements ListIterator<E>, getOffline {
            private int AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;
            private final read<E> write;

            public write(read<E> readVar, int i) {
                toMagicModuleMetaRepoModel.write(readVar, "");
                this.write = readVar;
                this.AudioAttributesCompatParcelizer = i;
                this.RemoteActionCompatParcelizer = -1;
                this.IconCompatParcelizer = ((AbstractList) readVar).modCount;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.AudioAttributesCompatParcelizer > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.AudioAttributesCompatParcelizer < ((read) this.write).read;
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.AudioAttributesCompatParcelizer - 1;
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.AudioAttributesCompatParcelizer;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                read();
                int i = this.AudioAttributesCompatParcelizer;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.AudioAttributesCompatParcelizer = i2;
                this.RemoteActionCompatParcelizer = i2;
                return (E) ((read) this.write).IconCompatParcelizer[((read) this.write).write + this.RemoteActionCompatParcelizer];
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                read();
                if (this.AudioAttributesCompatParcelizer >= ((read) this.write).read) {
                    throw new NoSuchElementException();
                }
                int i = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i + 1;
                this.RemoteActionCompatParcelizer = i;
                return (E) ((read) this.write).IconCompatParcelizer[((read) this.write).write + this.RemoteActionCompatParcelizer];
            }

            @Override // java.util.ListIterator
            public final void set(E e) {
                read();
                int i = this.RemoteActionCompatParcelizer;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.write.set(i, e);
            }

            @Override // java.util.ListIterator
            public final void add(E e) {
                read();
                read<E> readVar = this.write;
                int i = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i + 1;
                readVar.add(i, e);
                this.RemoteActionCompatParcelizer = -1;
                this.IconCompatParcelizer = ((AbstractList) this.write).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                read();
                int i = this.RemoteActionCompatParcelizer;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                this.write.write(i);
                this.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = -1;
                this.IconCompatParcelizer = ((AbstractList) this.write).modCount;
            }

            private final void read() {
                if (((AbstractList) ((read) this.write).AudioAttributesCompatParcelizer).modCount != this.IconCompatParcelizer) {
                    throw new ConcurrentModificationException();
                }
            }
        }
    }
}
