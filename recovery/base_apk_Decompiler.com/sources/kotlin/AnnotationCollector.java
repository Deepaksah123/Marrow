package kotlin;

import java.io.IOException;
import java.util.List;
import kotlin._ignorableAnnotation;

/* JADX INFO: loaded from: classes4.dex */
final class AnnotationCollector implements getGetter {
    private int AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer = 0;
    private final getOwner write;

    public static AnnotationCollector write(getOwner getowner) {
        if (getowner.AudioAttributesCompatParcelizer != null) {
            return getowner.AudioAttributesCompatParcelizer;
        }
        return new AnnotationCollector(getowner);
    }

    private AnnotationCollector(getOwner getowner) {
        getOwner getowner2 = (getOwner) forDeserialization.read(getowner, "input");
        this.write = getowner2;
        getowner2.AudioAttributesCompatParcelizer = this;
    }

    @Override // kotlin.getGetter
    public final int IconCompatParcelizer() throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = 0;
        } else {
            this.IconCompatParcelizer = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        int i2 = this.IconCompatParcelizer;
        if (i2 == 0 || i2 == this.AudioAttributesCompatParcelizer) {
            return Integer.MAX_VALUE;
        }
        return _ignorableAnnotation.read(i2);
    }

    @Override // kotlin.getGetter
    public final int read() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getGetter
    public final boolean onCommand() throws IOException {
        int i;
        if (this.write.read() || (i = this.IconCompatParcelizer) == this.AudioAttributesCompatParcelizer) {
            return false;
        }
        return this.write.write(i);
    }

    private void IconCompatParcelizer(int i) throws IOException {
        if (_ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer) != i) {
            throw _add.write();
        }
    }

    @Override // kotlin.getGetter
    public final double RemoteActionCompatParcelizer() throws IOException {
        IconCompatParcelizer(1);
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getGetter
    public final float MediaBrowserCompatItemReceiver() throws IOException {
        IconCompatParcelizer(5);
        return this.write.AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.getGetter
    public final long handleMediaPlayPauseIfPendingOnHandler() throws IOException {
        IconCompatParcelizer(0);
        return this.write.onPause();
    }

    @Override // kotlin.getGetter
    public final long MediaBrowserCompatMediaItem() throws IOException {
        IconCompatParcelizer(0);
        return this.write.MediaDescriptionCompat();
    }

    @Override // kotlin.getGetter
    public final int AudioAttributesImplApi26Parcelizer() throws IOException {
        IconCompatParcelizer(0);
        return this.write.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.getGetter
    public final long MediaBrowserCompatCustomActionResultReceiver() throws IOException {
        IconCompatParcelizer(1);
        return this.write.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.getGetter
    public final int AudioAttributesImplBaseParcelizer() throws IOException {
        IconCompatParcelizer(5);
        return this.write.MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.getGetter
    public final boolean write() throws IOException {
        IconCompatParcelizer(0);
        return this.write.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getGetter
    public final String onCustomAction() throws IOException {
        IconCompatParcelizer(2);
        return this.write.onCustomAction();
    }

    @Override // kotlin.getGetter
    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException {
        IconCompatParcelizer(2);
        return this.write.onAddQueueItem();
    }

    @Override // kotlin.getGetter
    public final <T> T AudioAttributesCompatParcelizer(Class<T> cls, asAnnotations asannotations) throws IOException {
        IconCompatParcelizer(2);
        return (T) IconCompatParcelizer(getAccessor.IconCompatParcelizer().read(cls), asannotations);
    }

    @Override // kotlin.getGetter
    public final <T> T RemoteActionCompatParcelizer(getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
        IconCompatParcelizer(2);
        return (T) IconCompatParcelizer(getprimarymember, asannotations);
    }

    @Override // kotlin.getGetter
    public final <T> T write(Class<T> cls, asAnnotations asannotations) throws IOException {
        IconCompatParcelizer(3);
        return (T) write(getAccessor.IconCompatParcelizer().read(cls), asannotations);
    }

    @Override // kotlin.getGetter
    public final <T> T read(getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
        IconCompatParcelizer(3);
        return (T) write(getprimarymember, asannotations);
    }

    private <T> T IconCompatParcelizer(getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
        int iOnCommand = this.write.onCommand();
        if (this.write.IconCompatParcelizer >= this.write.write) {
            throw _add.AudioAttributesImplApi21Parcelizer();
        }
        int iIconCompatParcelizer = this.write.IconCompatParcelizer(iOnCommand);
        T tWrite = getprimarymember.write();
        this.write.IconCompatParcelizer++;
        getprimarymember.AudioAttributesCompatParcelizer(tWrite, this, asannotations);
        getprimarymember.RemoteActionCompatParcelizer(tWrite);
        this.write.AudioAttributesCompatParcelizer(0);
        getOwner getowner = this.write;
        getowner.IconCompatParcelizer--;
        this.write.read(iIconCompatParcelizer);
        return tWrite;
    }

    private <T> T write(getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
        int i = this.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(_ignorableAnnotation.read(this.IconCompatParcelizer), 4);
        try {
            T tWrite = getprimarymember.write();
            getprimarymember.AudioAttributesCompatParcelizer(tWrite, this, asannotations);
            getprimarymember.RemoteActionCompatParcelizer(tWrite);
            if (this.IconCompatParcelizer == this.AudioAttributesCompatParcelizer) {
                return tWrite;
            }
            throw _add.AudioAttributesImplBaseParcelizer();
        } finally {
            this.AudioAttributesCompatParcelizer = i;
        }
    }

    @Override // kotlin.getGetter
    public final AnnotatedWithParams AudioAttributesCompatParcelizer() throws IOException {
        IconCompatParcelizer(2);
        return this.write.write();
    }

    @Override // kotlin.getGetter
    public final int onAddQueueItem() throws IOException {
        IconCompatParcelizer(0);
        return this.write.onCommand();
    }

    @Override // kotlin.getGetter
    public final int AudioAttributesImplApi21Parcelizer() throws IOException {
        IconCompatParcelizer(0);
        return this.write.AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.getGetter
    public final int MediaDescriptionCompat() throws IOException {
        IconCompatParcelizer(5);
        return this.write.MediaMetadataCompat();
    }

    @Override // kotlin.getGetter
    public final long MediaMetadataCompat() throws IOException {
        IconCompatParcelizer(1);
        return this.write.RatingCompat();
    }

    @Override // kotlin.getGetter
    public final int RatingCompat() throws IOException {
        IconCompatParcelizer(0);
        return this.write.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.getGetter
    public final long MediaBrowserCompatSearchResultReceiver() throws IOException {
        IconCompatParcelizer(0);
        return this.write.handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // kotlin.getGetter
    public final void IconCompatParcelizer(List<Double> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof asAnnotationMap) {
            asAnnotationMap asannotationmap = (asAnnotationMap) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 1) {
                do {
                    asannotationmap.RemoteActionCompatParcelizer(this.write.RemoteActionCompatParcelizer());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iOnCommand = this.write.onCommand();
                read(iOnCommand);
                int iIconCompatParcelizer = this.write.IconCompatParcelizer();
                do {
                    asannotationmap.RemoteActionCompatParcelizer(this.write.RemoteActionCompatParcelizer());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer + iOnCommand);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 1) {
            do {
                list.add(Double.valueOf(this.write.RemoteActionCompatParcelizer()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iOnCommand2 = this.write.onCommand();
            read(iOnCommand2);
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer();
            do {
                list.add(Double.valueOf(this.write.RemoteActionCompatParcelizer()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2 + iOnCommand2);
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void AudioAttributesImplApi26Parcelizer(List<Float> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof AnnotationIntrospectorPair) {
            AnnotationIntrospectorPair annotationIntrospectorPair = (AnnotationIntrospectorPair) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 2) {
                int iOnCommand = this.write.onCommand();
                RemoteActionCompatParcelizer(iOnCommand);
                int iIconCompatParcelizer = this.write.IconCompatParcelizer();
                do {
                    annotationIntrospectorPair.write(this.write.AudioAttributesImplApi26Parcelizer());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer + iOnCommand);
                return;
            }
            if (iRemoteActionCompatParcelizer == 5) {
                do {
                    annotationIntrospectorPair.write(this.write.AudioAttributesImplApi26Parcelizer());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iOnCommand2 = this.write.onCommand();
            RemoteActionCompatParcelizer(iOnCommand2);
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer();
            do {
                list.add(Float.valueOf(this.write.AudioAttributesImplApi26Parcelizer()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2 + iOnCommand2);
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 5) {
            do {
                list.add(Float.valueOf(this.write.AudioAttributesImplApi26Parcelizer()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void onCommand(List<Long> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof findFactoryMethodMetadata) {
            findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 0) {
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(this.write.onPause());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iIconCompatParcelizer = this.write.IconCompatParcelizer() + this.write.onCommand();
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(this.write.onPause());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer);
                AudioAttributesCompatParcelizer(iIconCompatParcelizer);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 0) {
            do {
                list.add(Long.valueOf(this.write.onPause()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer() + this.write.onCommand();
            do {
                list.add(Long.valueOf(this.write.onPause()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2);
            AudioAttributesCompatParcelizer(iIconCompatParcelizer2);
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void AudioAttributesImplBaseParcelizer(List<Long> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof findFactoryMethodMetadata) {
            findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 0) {
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(this.write.MediaDescriptionCompat());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iIconCompatParcelizer = this.write.IconCompatParcelizer() + this.write.onCommand();
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(this.write.MediaDescriptionCompat());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer);
                AudioAttributesCompatParcelizer(iIconCompatParcelizer);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 0) {
            do {
                list.add(Long.valueOf(this.write.MediaDescriptionCompat()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer() + this.write.onCommand();
            do {
                list.add(Long.valueOf(this.write.MediaDescriptionCompat()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2);
            AudioAttributesCompatParcelizer(iIconCompatParcelizer2);
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void MediaBrowserCompatItemReceiver(List<Integer> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof AnnotationCollectorOneCollector) {
            AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 0) {
                do {
                    annotationCollectorOneCollector.write(this.write.AudioAttributesImplBaseParcelizer());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iIconCompatParcelizer = this.write.IconCompatParcelizer() + this.write.onCommand();
                do {
                    annotationCollectorOneCollector.write(this.write.AudioAttributesImplBaseParcelizer());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer);
                AudioAttributesCompatParcelizer(iIconCompatParcelizer);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 0) {
            do {
                list.add(Integer.valueOf(this.write.AudioAttributesImplBaseParcelizer()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer() + this.write.onCommand();
            do {
                list.add(Integer.valueOf(this.write.AudioAttributesImplBaseParcelizer()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2);
            AudioAttributesCompatParcelizer(iIconCompatParcelizer2);
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void AudioAttributesImplApi21Parcelizer(List<Long> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof findFactoryMethodMetadata) {
            findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 1) {
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(this.write.MediaBrowserCompatCustomActionResultReceiver());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iOnCommand = this.write.onCommand();
                read(iOnCommand);
                int iIconCompatParcelizer = this.write.IconCompatParcelizer();
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(this.write.MediaBrowserCompatCustomActionResultReceiver());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer + iOnCommand);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 1) {
            do {
                list.add(Long.valueOf(this.write.MediaBrowserCompatCustomActionResultReceiver()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iOnCommand2 = this.write.onCommand();
            read(iOnCommand2);
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer();
            do {
                list.add(Long.valueOf(this.write.MediaBrowserCompatCustomActionResultReceiver()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2 + iOnCommand2);
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void RemoteActionCompatParcelizer(List<Integer> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof AnnotationCollectorOneCollector) {
            AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 2) {
                int iOnCommand = this.write.onCommand();
                RemoteActionCompatParcelizer(iOnCommand);
                int iIconCompatParcelizer = this.write.IconCompatParcelizer();
                do {
                    annotationCollectorOneCollector.write(this.write.MediaBrowserCompatItemReceiver());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer + iOnCommand);
                return;
            }
            if (iRemoteActionCompatParcelizer == 5) {
                do {
                    annotationCollectorOneCollector.write(this.write.MediaBrowserCompatItemReceiver());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iOnCommand2 = this.write.onCommand();
            RemoteActionCompatParcelizer(iOnCommand2);
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer();
            do {
                list.add(Integer.valueOf(this.write.MediaBrowserCompatItemReceiver()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2 + iOnCommand2);
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 5) {
            do {
                list.add(Integer.valueOf(this.write.MediaBrowserCompatItemReceiver()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void write(List<Boolean> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof collectMethods) {
            collectMethods collectmethods = (collectMethods) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 0) {
                do {
                    collectmethods.write(this.write.AudioAttributesCompatParcelizer());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iIconCompatParcelizer = this.write.IconCompatParcelizer() + this.write.onCommand();
                do {
                    collectmethods.write(this.write.AudioAttributesCompatParcelizer());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer);
                AudioAttributesCompatParcelizer(iIconCompatParcelizer);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 0) {
            do {
                list.add(Boolean.valueOf(this.write.AudioAttributesCompatParcelizer()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer() + this.write.onCommand();
            do {
                list.add(Boolean.valueOf(this.write.AudioAttributesCompatParcelizer()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2);
            AudioAttributesCompatParcelizer(iIconCompatParcelizer2);
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void RatingCompat(List<String> list) throws IOException {
        RemoteActionCompatParcelizer(list, false);
    }

    @Override // kotlin.getGetter
    public final void MediaBrowserCompatMediaItem(List<String> list) throws IOException {
        RemoteActionCompatParcelizer(list, true);
    }

    private void RemoteActionCompatParcelizer(List<String> list, boolean z) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (_ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer) != 2) {
            throw _add.write();
        }
        if ((list instanceof isFactoryMethod) && !z) {
            isFactoryMethod isfactorymethod = (isFactoryMethod) list;
            do {
                isfactorymethod.IconCompatParcelizer(AudioAttributesCompatParcelizer());
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
            return;
        }
        do {
            list.add(z ? MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() : onCustomAction());
            if (this.write.read()) {
                return;
            } else {
                iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getGetter
    public final <T> void read(List<T> list, getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (_ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer) != 2) {
            throw _add.write();
        }
        int i = this.IconCompatParcelizer;
        do {
            list.add(IconCompatParcelizer(getprimarymember, asannotations));
            if (this.write.read() || this.RemoteActionCompatParcelizer != 0) {
                return;
            } else {
                iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == i);
        this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getGetter
    public final <T> void AudioAttributesCompatParcelizer(List<T> list, getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (_ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer) != 3) {
            throw _add.write();
        }
        int i = this.IconCompatParcelizer;
        do {
            list.add(write(getprimarymember, asannotations));
            if (this.write.read() || this.RemoteActionCompatParcelizer != 0) {
                return;
            } else {
                iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == i);
        this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.getGetter
    public final void AudioAttributesCompatParcelizer(List<AnnotatedWithParams> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (_ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer) != 2) {
            throw _add.write();
        }
        do {
            list.add(AudioAttributesCompatParcelizer());
            if (this.write.read()) {
                return;
            } else {
                iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.getGetter
    public final void handleMediaPlayPauseIfPendingOnHandler(List<Integer> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof AnnotationCollectorOneCollector) {
            AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 0) {
                do {
                    annotationCollectorOneCollector.write(this.write.onCommand());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iIconCompatParcelizer = this.write.IconCompatParcelizer() + this.write.onCommand();
                do {
                    annotationCollectorOneCollector.write(this.write.onCommand());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer);
                AudioAttributesCompatParcelizer(iIconCompatParcelizer);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 0) {
            do {
                list.add(Integer.valueOf(this.write.onCommand()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer() + this.write.onCommand();
            do {
                list.add(Integer.valueOf(this.write.onCommand()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2);
            AudioAttributesCompatParcelizer(iIconCompatParcelizer2);
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void read(List<Integer> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof AnnotationCollectorOneCollector) {
            AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 0) {
                do {
                    annotationCollectorOneCollector.write(this.write.AudioAttributesImplApi21Parcelizer());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iIconCompatParcelizer = this.write.IconCompatParcelizer() + this.write.onCommand();
                do {
                    annotationCollectorOneCollector.write(this.write.AudioAttributesImplApi21Parcelizer());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer);
                AudioAttributesCompatParcelizer(iIconCompatParcelizer);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 0) {
            do {
                list.add(Integer.valueOf(this.write.AudioAttributesImplApi21Parcelizer()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer() + this.write.onCommand();
            do {
                list.add(Integer.valueOf(this.write.AudioAttributesImplApi21Parcelizer()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2);
            AudioAttributesCompatParcelizer(iIconCompatParcelizer2);
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void MediaBrowserCompatCustomActionResultReceiver(List<Integer> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof AnnotationCollectorOneCollector) {
            AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 2) {
                int iOnCommand = this.write.onCommand();
                RemoteActionCompatParcelizer(iOnCommand);
                int iIconCompatParcelizer = this.write.IconCompatParcelizer();
                do {
                    annotationCollectorOneCollector.write(this.write.MediaMetadataCompat());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer + iOnCommand);
                return;
            }
            if (iRemoteActionCompatParcelizer == 5) {
                do {
                    annotationCollectorOneCollector.write(this.write.MediaMetadataCompat());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iOnCommand2 = this.write.onCommand();
            RemoteActionCompatParcelizer(iOnCommand2);
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer();
            do {
                list.add(Integer.valueOf(this.write.MediaMetadataCompat()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2 + iOnCommand2);
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 5) {
            do {
                list.add(Integer.valueOf(this.write.MediaMetadataCompat()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void MediaMetadataCompat(List<Long> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof findFactoryMethodMetadata) {
            findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 1) {
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(this.write.RatingCompat());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iOnCommand = this.write.onCommand();
                read(iOnCommand);
                int iIconCompatParcelizer = this.write.IconCompatParcelizer();
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(this.write.RatingCompat());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer + iOnCommand);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 1) {
            do {
                list.add(Long.valueOf(this.write.RatingCompat()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iOnCommand2 = this.write.onCommand();
            read(iOnCommand2);
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer();
            do {
                list.add(Long.valueOf(this.write.RatingCompat()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2 + iOnCommand2);
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void MediaDescriptionCompat(List<Integer> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof AnnotationCollectorOneCollector) {
            AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 0) {
                do {
                    annotationCollectorOneCollector.write(this.write.MediaBrowserCompatSearchResultReceiver());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iIconCompatParcelizer = this.write.IconCompatParcelizer() + this.write.onCommand();
                do {
                    annotationCollectorOneCollector.write(this.write.MediaBrowserCompatSearchResultReceiver());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer);
                AudioAttributesCompatParcelizer(iIconCompatParcelizer);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 0) {
            do {
                list.add(Integer.valueOf(this.write.MediaBrowserCompatSearchResultReceiver()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer() + this.write.onCommand();
            do {
                list.add(Integer.valueOf(this.write.MediaBrowserCompatSearchResultReceiver()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2);
            AudioAttributesCompatParcelizer(iIconCompatParcelizer2);
            return;
        }
        throw _add.write();
    }

    @Override // kotlin.getGetter
    public final void MediaBrowserCompatSearchResultReceiver(List<Long> list) throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
        if (list instanceof findFactoryMethodMetadata) {
            findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 0) {
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(this.write.handleMediaPlayPauseIfPendingOnHandler());
                    if (this.write.read()) {
                        return;
                    } else {
                        iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int iIconCompatParcelizer = this.write.IconCompatParcelizer() + this.write.onCommand();
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(this.write.handleMediaPlayPauseIfPendingOnHandler());
                } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer);
                AudioAttributesCompatParcelizer(iIconCompatParcelizer);
                return;
            }
            throw _add.write();
        }
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == 0) {
            do {
                list.add(Long.valueOf(this.write.handleMediaPlayPauseIfPendingOnHandler()));
                if (this.write.read()) {
                    return;
                } else {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            } while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return;
        }
        if (iRemoteActionCompatParcelizer2 == 2) {
            int iIconCompatParcelizer2 = this.write.IconCompatParcelizer() + this.write.onCommand();
            do {
                list.add(Long.valueOf(this.write.handleMediaPlayPauseIfPendingOnHandler()));
            } while (this.write.IconCompatParcelizer() < iIconCompatParcelizer2);
            AudioAttributesCompatParcelizer(iIconCompatParcelizer2);
            return;
        }
        throw _add.write();
    }

    private static void read(int i) throws IOException {
        if ((i & 7) != 0) {
            throw _add.AudioAttributesImplBaseParcelizer();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getGetter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void write(java.util.Map<K, V> r8, o.BasicClassIntrospector.AudioAttributesCompatParcelizer<K, V> r9, kotlin.asAnnotations r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.IconCompatParcelizer(r0)
            o.getOwner r1 = r7.write
            int r1 = r1.onCommand()
            o.getOwner r2 = r7.write
            int r1 = r2.IconCompatParcelizer(r1)
            K r2 = r9.RemoteActionCompatParcelizer
            V r3 = r9.IconCompatParcelizer
        L14:
            int r4 = r7.IconCompatParcelizer()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            o.getOwner r5 = r7.write     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.read()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.onCommand()     // Catch: o._add.RemoteActionCompatParcelizer -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            o._add r4 = new o._add     // Catch: o._add.RemoteActionCompatParcelizer -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: o._add.RemoteActionCompatParcelizer -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: o._add.RemoteActionCompatParcelizer -> L4e java.lang.Throwable -> L64
        L39:
            o._ignorableAnnotation$IconCompatParcelizer r4 = r9.write     // Catch: o._add.RemoteActionCompatParcelizer -> L4e java.lang.Throwable -> L64
            V r5 = r9.IconCompatParcelizer     // Catch: o._add.RemoteActionCompatParcelizer -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: o._add.RemoteActionCompatParcelizer -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.write(r4, r5, r10)     // Catch: o._add.RemoteActionCompatParcelizer -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            o._ignorableAnnotation$IconCompatParcelizer r4 = r9.AudioAttributesCompatParcelizer     // Catch: o._add.RemoteActionCompatParcelizer -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.write(r4, r5, r5)     // Catch: o._add.RemoteActionCompatParcelizer -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.onCommand()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            o._add r8 = new o._add     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            o.getOwner r7 = r7.write
            r7.read(r1)
            return
        L64:
            r8 = move-exception
            o.getOwner r7 = r7.write
            r7.read(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AnnotationCollector.write(java.util.Map, o.BasicClassIntrospector$AudioAttributesCompatParcelizer, o.asAnnotations):void");
    }

    /* JADX INFO: renamed from: o.AnnotationCollector$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[_ignorableAnnotation.IconCompatParcelizer.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[_ignorableAnnotation.IconCompatParcelizer.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private Object write(_ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, Class<?> cls, asAnnotations asannotations) throws IOException {
        switch (AnonymousClass3.AudioAttributesCompatParcelizer[iconCompatParcelizer.ordinal()]) {
            case 1:
                return Boolean.valueOf(write());
            case 2:
                return AudioAttributesCompatParcelizer();
            case 3:
                return Double.valueOf(RemoteActionCompatParcelizer());
            case 4:
                return Integer.valueOf(AudioAttributesImplApi21Parcelizer());
            case 5:
                return Integer.valueOf(AudioAttributesImplBaseParcelizer());
            case 6:
                return Long.valueOf(MediaBrowserCompatCustomActionResultReceiver());
            case 7:
                return Float.valueOf(MediaBrowserCompatItemReceiver());
            case 8:
                return Integer.valueOf(AudioAttributesImplApi26Parcelizer());
            case 9:
                return Long.valueOf(MediaBrowserCompatMediaItem());
            case 10:
                return AudioAttributesCompatParcelizer(cls, asannotations);
            case 11:
                return Integer.valueOf(MediaDescriptionCompat());
            case 12:
                return Long.valueOf(MediaMetadataCompat());
            case 13:
                return Integer.valueOf(RatingCompat());
            case 14:
                return Long.valueOf(MediaBrowserCompatSearchResultReceiver());
            case 15:
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            case 16:
                return Integer.valueOf(onAddQueueItem());
            case 17:
                return Long.valueOf(handleMediaPlayPauseIfPendingOnHandler());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void RemoteActionCompatParcelizer(int i) throws IOException {
        if ((i & 3) != 0) {
            throw _add.AudioAttributesImplBaseParcelizer();
        }
    }

    private void AudioAttributesCompatParcelizer(int i) throws IOException {
        if (this.write.IconCompatParcelizer() != i) {
            throw _add.AudioAttributesImplApi26Parcelizer();
        }
    }
}
