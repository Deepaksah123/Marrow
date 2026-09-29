package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class setAllCaps<E> implements Set<E>, getCurrentAnsweredMcqProgress {
    private final setAutoSizeTextTypeUniformWithConfiguration<E> IconCompatParcelizer;

    public setAllCaps(setAutoSizeTextTypeUniformWithConfiguration<E> setautosizetexttypeuniformwithconfiguration) {
        toMagicModuleMetaRepoModel.write(setautosizetexttypeuniformwithconfiguration, "");
        this.IconCompatParcelizer = setautosizetexttypeuniformwithconfiguration;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return AudioAttributesCompatParcelizer();
    }

    private int AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.IconCompatParcelizer.IconCompatParcelizer((E) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.IconCompatParcelizer.IconCompatParcelizer(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.IconCompatParcelizer.write();
    }

    static final class write extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<setStateResult<? super E>, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        final /* synthetic */ setAllCaps<E> IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ Object read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            setStateResult setstateresult;
            Object[] objArr;
            long[] jArr;
            int i;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i2 = this.AudioAttributesImplBaseParcelizer;
            if (i2 == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setstateresult = (setStateResult) this.read;
                setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration = ((setAllCaps) this.IconCompatParcelizer).IconCompatParcelizer;
                objArr = setautosizetexttypeuniformwithconfiguration.AudioAttributesCompatParcelizer;
                jArr = setautosizetexttypeuniformwithconfiguration.MediaBrowserCompatItemReceiver;
                i = setautosizetexttypeuniformwithconfiguration.MediaBrowserCompatCustomActionResultReceiver;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.AudioAttributesCompatParcelizer;
                jArr = (long[]) this.RemoteActionCompatParcelizer;
                objArr = (Object[]) this.write;
                setstateresult = (setStateResult) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            while (i != Integer.MAX_VALUE) {
                int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                Object obj2 = objArr[i];
                this.read = setstateresult;
                this.write = objArr;
                this.RemoteActionCompatParcelizer = jArr;
                this.AudioAttributesCompatParcelizer = i3;
                this.AudioAttributesImplBaseParcelizer = 1;
                if (setstateresult.IconCompatParcelizer(obj2, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                i = i3;
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(setAllCaps<E> setallcaps, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = setallcaps;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.IconCompatParcelizer, sampleVideos);
            writeVar.read = obj;
            return writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(setStateResult<? super E> setstateresult, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(setstateresult, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return StateResult.write((MagicModuleSubmissionRequestBody) new write(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((setAllCaps) obj).IconCompatParcelizer);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public String toString() {
        return this.IconCompatParcelizer.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return markCompletelambda1.read(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
    }
}
