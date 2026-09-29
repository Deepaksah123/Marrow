package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class setSupportBackgroundTintList<E> extends setFilters<E> implements Set<E>, FinalDataRsModel {
    private final setEmojiCompatEnabled<E> read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSupportBackgroundTintList(setEmojiCompatEnabled<E> setemojicompatenabled) {
        super(setemojicompatenabled);
        toMagicModuleMetaRepoModel.write(setemojicompatenabled, "");
        this.read = setemojicompatenabled;
    }

    @Override // kotlin.setFilters, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.read.write(e);
    }

    @Override // kotlin.setFilters, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return this.read.write((Iterable) collection);
    }

    @Override // kotlin.setFilters, java.util.Set, java.util.Collection
    public final void clear() {
        this.read.RemoteActionCompatParcelizer();
    }

    public static final class IconCompatParcelizer implements Iterator<E>, isModuleGeneratedVisible {
        private final Iterator<E> RemoteActionCompatParcelizer;
        final /* synthetic */ setSupportBackgroundTintList<E> read;
        private int write = -1;

        IconCompatParcelizer(setSupportBackgroundTintList<E> setsupportbackgroundtintlist) {
            this.read = setsupportbackgroundtintlist;
            this.RemoteActionCompatParcelizer = StateResult.write((MagicModuleSubmissionRequestBody) new read(setsupportbackgroundtintlist, this, null));
        }

        static final class read extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<setStateResult<? super E>, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private int AudioAttributesImplApi21Parcelizer;
            private Object AudioAttributesImplApi26Parcelizer;
            private Object AudioAttributesImplBaseParcelizer;
            final /* synthetic */ setSupportBackgroundTintList<E> IconCompatParcelizer;
            private long MediaBrowserCompatCustomActionResultReceiver;
            private /* synthetic */ Object MediaBrowserCompatItemReceiver;
            private Object MediaBrowserCompatSearchResultReceiver;
            private int MediaMetadataCompat;
            private int RemoteActionCompatParcelizer;
            final /* synthetic */ IconCompatParcelizer read;
            private int write;

            /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005f -> B:23:0x00b9). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0061 -> B:14:0x0077). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0080 -> B:20:0x00ab). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a8 -> B:20:0x00ab). Please report as a decompilation issue!!! */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    r22 = this;
                    r0 = r22
                    java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                    int r2 = r0.MediaMetadataCompat
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L36
                    if (r2 != r5) goto L2e
                    int r2 = r0.AudioAttributesImplApi21Parcelizer
                    int r6 = r0.RemoteActionCompatParcelizer
                    long r7 = r0.MediaBrowserCompatCustomActionResultReceiver
                    int r9 = r0.AudioAttributesCompatParcelizer
                    int r10 = r0.write
                    java.lang.Object r11 = r0.MediaBrowserCompatSearchResultReceiver
                    long[] r11 = (long[]) r11
                    java.lang.Object r12 = r0.AudioAttributesImplBaseParcelizer
                    o.setSupportBackgroundTintList r12 = (kotlin.setSupportBackgroundTintList) r12
                    java.lang.Object r13 = r0.AudioAttributesImplApi26Parcelizer
                    o.setSupportBackgroundTintList$IconCompatParcelizer r13 = (o.setSupportBackgroundTintList.IconCompatParcelizer) r13
                    java.lang.Object r14 = r0.MediaBrowserCompatItemReceiver
                    o.setStateResult r14 = (kotlin.setStateResult) r14
                    kotlin.SdkPayloadData.IconCompatParcelizer(r23)
                    goto Lab
                L2e:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L36:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r23)
                    java.lang.Object r2 = r0.MediaBrowserCompatItemReceiver
                    o.setStateResult r2 = (kotlin.setStateResult) r2
                    o.setSupportBackgroundTintList<E> r6 = r0.IconCompatParcelizer
                    o.setEmojiCompatEnabled r6 = kotlin.setSupportBackgroundTintList.read(r6)
                    o.setButtonDrawable r6 = (kotlin.setButtonDrawable) r6
                    o.setSupportBackgroundTintList$IconCompatParcelizer r7 = r0.read
                    o.setSupportBackgroundTintList<E> r8 = r0.IconCompatParcelizer
                    long[] r6 = r6.AudioAttributesCompatParcelizer
                    int r9 = r6.length
                    int r9 = r9 + (-2)
                    if (r9 < 0) goto Lbe
                    r10 = 0
                L51:
                    r11 = r6[r10]
                    long r13 = ~r11
                    r15 = 7
                    long r13 = r13 << r15
                    long r13 = r13 & r11
                    r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r13 = r13 & r15
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 == 0) goto Lb9
                    int r13 = r10 - r9
                    int r13 = ~r13
                    int r13 = r13 >>> 31
                    int r13 = 8 - r13
                    r14 = r2
                    r2 = 0
                    r19 = r11
                    r11 = r6
                    r12 = r8
                    r6 = r13
                    r13 = r7
                    r7 = r19
                    r21 = r10
                    r10 = r9
                    r9 = r21
                L77:
                    if (r2 >= r6) goto Lae
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r7
                    r17 = 128(0x80, double:6.3E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto Lab
                    int r15 = r9 << 3
                    int r15 = r15 + r2
                    r13.IconCompatParcelizer(r15)
                    o.setEmojiCompatEnabled r3 = kotlin.setSupportBackgroundTintList.read(r12)
                    java.lang.Object[] r3 = r3.write
                    r3 = r3[r15]
                    r0.MediaBrowserCompatItemReceiver = r14
                    r0.AudioAttributesImplApi26Parcelizer = r13
                    r0.AudioAttributesImplBaseParcelizer = r12
                    r0.MediaBrowserCompatSearchResultReceiver = r11
                    r0.write = r10
                    r0.AudioAttributesCompatParcelizer = r9
                    r0.MediaBrowserCompatCustomActionResultReceiver = r7
                    r0.RemoteActionCompatParcelizer = r6
                    r0.AudioAttributesImplApi21Parcelizer = r2
                    r0.MediaMetadataCompat = r5
                    java.lang.Object r3 = r14.IconCompatParcelizer(r3, r0)
                    if (r3 != r1) goto Lab
                    return r1
                Lab:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L77
                Lae:
                    if (r6 != r4) goto Lbe
                    r6 = r11
                    r8 = r12
                    r7 = r13
                    r2 = r14
                    r19 = r10
                    r10 = r9
                    r9 = r19
                Lb9:
                    if (r10 == r9) goto Lbe
                    int r10 = r10 + 1
                    goto L51
                Lbe:
                    o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setSupportBackgroundTintList.IconCompatParcelizer.read.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            read(setSupportBackgroundTintList<E> setsupportbackgroundtintlist, IconCompatParcelizer iconCompatParcelizer, SampleVideos<? super read> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = setsupportbackgroundtintlist;
                this.read = iconCompatParcelizer;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                read readVar = new read(this.IconCompatParcelizer, this.read, sampleVideos);
                readVar.MediaBrowserCompatItemReceiver = obj;
                return readVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(setStateResult<? super E> setstateresult, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((read) create(setstateresult, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        public final void IconCompatParcelizer(int i) {
            this.write = i;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return this.RemoteActionCompatParcelizer.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.write != -1) {
                ((setSupportBackgroundTintList) this.read).read.read(this.write);
                this.write = -1;
            }
        }
    }

    @Override // kotlin.setFilters, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new IconCompatParcelizer(this);
    }

    @Override // kotlin.setFilters, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.read.AudioAttributesCompatParcelizer(obj);
    }

    @Override // kotlin.setFilters, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return this.read.read((Collection) collection);
    }

    @Override // kotlin.setFilters, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return this.read.IconCompatParcelizer((Iterable) collection);
    }
}
