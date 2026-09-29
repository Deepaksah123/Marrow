package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getObjectTypeFromMp4aRFC6381CodecString implements getMimeTypeFromMp4ObjectType {
    private final intersects IconCompatParcelizer;
    private final putBinder RemoteActionCompatParcelizer;
    private final unlockFolder read;
    private final LoaderReleaseTask write;

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplApi26Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object MediaBrowserCompatMediaItem;
        int MediaBrowserCompatSearchResultReceiver;
        Object MediaDescriptionCompat;
        Object MediaMetadataCompat;
        Object RatingCompat;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object onAddQueueItem;
        int read;
        int write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.onAddQueueItem = obj;
            this.MediaBrowserCompatSearchResultReceiver |= Integer.MIN_VALUE;
            return getObjectTypeFromMp4aRFC6381CodecString.this.write(null, null, null, null, this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplApi26Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        int MediaBrowserCompatItemReceiver;
        int MediaBrowserCompatMediaItem;
        /* synthetic */ Object MediaBrowserCompatSearchResultReceiver;
        Object MediaMetadataCompat;
        Object RatingCompat;
        int RemoteActionCompatParcelizer;
        int read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatSearchResultReceiver = obj;
            this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
            return getObjectTypeFromMp4aRFC6381CodecString.this.read(null, this);
        }
    }

    @setSdkPayload
    public getObjectTypeFromMp4aRFC6381CodecString(LoaderReleaseTask loaderReleaseTask, intersects intersectsVar, putBinder putbinder, unlockFolder unlockfolder) {
        toMagicModuleMetaRepoModel.write(loaderReleaseTask, "");
        toMagicModuleMetaRepoModel.write(intersectsVar, "");
        toMagicModuleMetaRepoModel.write(putbinder, "");
        toMagicModuleMetaRepoModel.write(unlockfolder, "");
        this.write = loaderReleaseTask;
        this.IconCompatParcelizer = intersectsVar;
        this.RemoteActionCompatParcelizer = putbinder;
        this.read = unlockfolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // kotlin.getMimeTypeFromMp4ObjectType
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(java.lang.String r18, kotlin.SampleVideos<? super java.util.Map<kotlin.getMediaMimeType, java.lang.Integer>> r19) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getObjectTypeFromMp4aRFC6381CodecString.read(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.getMimeTypeFromMp4ObjectType
    public final Object RemoteActionCompatParcelizer(String str, getMediaMimeType getmediamimetype) {
        boolean z = getmediamimetype == getMediaMimeType.read || getmediamimetype == getMediaMimeType.AudioAttributesImplApi26Parcelizer;
        boolean z2 = getmediamimetype == getMediaMimeType.RemoteActionCompatParcelizer || getmediamimetype == getMediaMimeType.MediaMetadataCompat;
        boolean z3 = getmediamimetype == getMediaMimeType.RemoteActionCompatParcelizer || getmediamimetype == getMediaMimeType.read;
        boolean z4 = getmediamimetype == getMediaMimeType.MediaBrowserCompatItemReceiver;
        boolean z5 = getmediamimetype == getMediaMimeType.MediaBrowserCompatCustomActionResultReceiver;
        boolean z6 = getmediamimetype == getMediaMimeType.write;
        boolean z7 = getmediamimetype == getMediaMimeType.AudioAttributesCompatParcelizer;
        if (getmediamimetype == getMediaMimeType.AudioAttributesImplApi21Parcelizer) {
            return this.write.write(str);
        }
        return this.write.read(str, z, z2, z4, z3, z5, z6, z7);
    }

    @Override // kotlin.getMimeTypeFromMp4ObjectType
    public final Object IconCompatParcelizer(String str, SampleVideos<? super List<putBinderByReflection>> sampleVideos) {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(str, sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // kotlin.getMimeTypeFromMp4ObjectType
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r30, kotlin.getMediaMimeType r31, java.lang.String r32, java.lang.String r33, kotlin.SampleVideos<? super java.util.List<java.lang.String>> r34) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getObjectTypeFromMp4aRFC6381CodecString.write(java.lang.String, o.getMediaMimeType, java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }
}
