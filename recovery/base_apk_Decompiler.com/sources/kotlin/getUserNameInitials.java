package kotlin;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class getUserNameInitials<E> extends setTotalFramesDropped<getUserNameInitials<E>> {
    private final setAddressLine3<E> IconCompatParcelizer;
    private final /* synthetic */ AtomicReferenceArray read;

    public getUserNameInitials(long j, getUserNameInitials<E> getusernameinitials, setAddressLine3<E> setaddressline3, int i) {
        super(j, getusernameinitials, i);
        this.IconCompatParcelizer = setaddressline3;
        this.read = new AtomicReferenceArray(User.RemoteActionCompatParcelizer << 1);
    }

    public final setAddressLine3<E> write() {
        setAddressLine3<E> setaddressline3 = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(setaddressline3);
        return setaddressline3;
    }

    @Override // kotlin.setTotalFramesDropped
    public final int read() {
        return User.RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(int i, E e) {
        read(i, e);
    }

    public final E read(int i) {
        return (E) MediaDescriptionCompat().get(i << 1);
    }

    public final E AudioAttributesCompatParcelizer(int i) {
        E e = read(i);
        RemoteActionCompatParcelizer(i);
        return e;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        read(i, null);
    }

    private final void read(int i, Object obj) {
        MediaDescriptionCompat().set(i << 1, obj);
    }

    public final Object write(int i) {
        return MediaDescriptionCompat().get((i << 1) + 1);
    }

    public final void write(int i, Object obj) {
        MediaDescriptionCompat().set((i << 1) + 1, obj);
    }

    public final boolean RemoteActionCompatParcelizer(int i, Object obj, Object obj2) {
        return SefReader.RemoteActionCompatParcelizer(MediaDescriptionCompat(), (i << 1) + 1, obj, obj2);
    }

    public final Object RemoteActionCompatParcelizer(int i, Object obj) {
        return MediaDescriptionCompat().getAndSet((i << 1) + 1, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        RemoteActionCompatParcelizer(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        r4 = write().IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        kotlin.setSelectedUrlIndex.AudioAttributesCompatParcelizer(r4, r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return;
     */
    @Override // kotlin.setTotalFramesDropped
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(int r5, kotlin.CurrentQuery r6) {
        /*
            r4 = this;
            int r0 = kotlin.User.RemoteActionCompatParcelizer
            if (r5 < r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto Lc
            int r1 = kotlin.User.RemoteActionCompatParcelizer
            int r5 = r5 - r1
        Lc:
            java.lang.Object r1 = r4.read(r5)
        L10:
            java.lang.Object r2 = r4.write(r5)
            boolean r3 = r2 instanceof kotlin.setVerified
            if (r3 != 0) goto L6a
            boolean r3 = r2 instanceof kotlin.hasProPlan
            if (r3 != 0) goto L6a
            o.accessgetVideoConfigurationC2cp r3 = kotlin.User.AudioAttributesImplApi21Parcelizer()
            if (r2 == r3) goto L59
            o.accessgetVideoConfigurationC2cp r3 = kotlin.User.MediaBrowserCompatItemReceiver()
            if (r2 == r3) goto L59
            o.accessgetVideoConfigurationC2cp r3 = kotlin.User.RatingCompat()
            if (r2 == r3) goto L10
            o.accessgetVideoConfigurationC2cp r3 = kotlin.User.MediaDescriptionCompat()
            if (r2 == r3) goto L10
            o.accessgetVideoConfigurationC2cp r4 = kotlin.User.RemoteActionCompatParcelizer()
            if (r2 == r4) goto L90
            o.accessgetVideoConfigurationC2cp r4 = kotlin.User.write
            if (r2 == r4) goto L90
            o.accessgetVideoConfigurationC2cp r4 = kotlin.User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            if (r2 != r4) goto L45
            goto L90
        L45:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "unexpected state: "
            java.lang.String r6 = java.lang.String.valueOf(r2)
            java.lang.String r5 = r5.concat(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L59:
            r4.RemoteActionCompatParcelizer(r5)
            if (r0 == 0) goto L90
            o.setAddressLine3 r4 = r4.write()
            o.getAnswerMap<E, o.getShowPopup> r4 = r4.IconCompatParcelizer
            if (r4 == 0) goto L90
            kotlin.setSelectedUrlIndex.AudioAttributesCompatParcelizer(r4, r1, r6)
            return
        L6a:
            if (r0 == 0) goto L71
            o.accessgetVideoConfigurationC2cp r3 = kotlin.User.AudioAttributesImplApi21Parcelizer()
            goto L75
        L71:
            o.accessgetVideoConfigurationC2cp r3 = kotlin.User.MediaBrowserCompatItemReceiver()
        L75:
            boolean r2 = r4.RemoteActionCompatParcelizer(r5, r2, r3)
            if (r2 == 0) goto L10
            r4.RemoteActionCompatParcelizer(r5)
            r2 = r0 ^ 1
            r4.IconCompatParcelizer(r5, r2)
            if (r0 == 0) goto L90
            o.setAddressLine3 r4 = r4.write()
            o.getAnswerMap<E, o.getShowPopup> r4 = r4.IconCompatParcelizer
            if (r4 == 0) goto L90
            kotlin.setSelectedUrlIndex.AudioAttributesCompatParcelizer(r4, r1, r6)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getUserNameInitials.write(int, o.CurrentQuery):void");
    }

    public final void IconCompatParcelizer(int i, boolean z) {
        if (z) {
            write().IconCompatParcelizer((this.AudioAttributesCompatParcelizer * ((long) User.RemoteActionCompatParcelizer)) + ((long) i));
        }
        MediaBrowserCompatSearchResultReceiver();
    }

    private final /* synthetic */ AtomicReferenceArray MediaDescriptionCompat() {
        return this.read;
    }
}
