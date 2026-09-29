package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class setFilters<E> implements Set<E>, getCurrentAnsweredMcqProgress {
    private final setButtonDrawable<E> AudioAttributesCompatParcelizer;

    public setFilters(setButtonDrawable<E> setbuttondrawable) {
        toMagicModuleMetaRepoModel.write(setbuttondrawable, "");
        this.AudioAttributesCompatParcelizer = setbuttondrawable;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return write();
    }

    private int write() {
        return this.AudioAttributesCompatParcelizer.read;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((E) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    static final class RemoteActionCompatParcelizer extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<setStateResult<? super E>, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private long AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        final /* synthetic */ setFilters<E> RemoteActionCompatParcelizer;
        private int read;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:23:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:20:0x0094). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.AudioAttributesImplBaseParcelizer
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.AudioAttributesCompatParcelizer
                int r6 = r0.read
                long r7 = r0.AudioAttributesImplApi26Parcelizer
                int r9 = r0.write
                int r10 = r0.IconCompatParcelizer
                java.lang.Object r11 = r0.AudioAttributesImplApi21Parcelizer
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.MediaBrowserCompatItemReceiver
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.MediaBrowserCompatCustomActionResultReceiver
                o.setStateResult r13 = (kotlin.setStateResult) r13
                kotlin.SdkPayloadData.IconCompatParcelizer(r21)
                goto L94
            L2b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L33:
                kotlin.SdkPayloadData.IconCompatParcelizer(r21)
                java.lang.Object r2 = r0.MediaBrowserCompatCustomActionResultReceiver
                o.setStateResult r2 = (kotlin.setStateResult) r2
                o.setFilters<E> r6 = r0.RemoteActionCompatParcelizer
                o.setButtonDrawable r6 = kotlin.setFilters.IconCompatParcelizer(r6)
                java.lang.Object[] r7 = r6.write
                long[] r6 = r6.AudioAttributesCompatParcelizer
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La2
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6b:
                if (r2 >= r6) goto L97
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L94
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.MediaBrowserCompatCustomActionResultReceiver = r13
                r0.MediaBrowserCompatItemReceiver = r12
                r0.AudioAttributesImplApi21Parcelizer = r11
                r0.IconCompatParcelizer = r10
                r0.write = r9
                r0.AudioAttributesImplApi26Parcelizer = r7
                r0.read = r6
                r0.AudioAttributesCompatParcelizer = r2
                r0.AudioAttributesImplBaseParcelizer = r5
                java.lang.Object r14 = r13.IconCompatParcelizer(r14, r0)
                if (r14 != r1) goto L94
                return r1
            L94:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6b
            L97:
                if (r6 != r4) goto La2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L9d:
                if (r9 == r8) goto La2
                int r9 = r9 + 1
                goto L4a
            La2:
                o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setFilters.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(setFilters<E> setfilters, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = setfilters;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
            remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = obj;
            return remoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(setStateResult<? super E> setstateresult, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(setstateresult, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return StateResult.write((MagicModuleSubmissionRequestBody) new RemoteActionCompatParcelizer(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((setFilters) obj).AudioAttributesCompatParcelizer);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    public String toString() {
        return this.AudioAttributesCompatParcelizer.toString();
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
