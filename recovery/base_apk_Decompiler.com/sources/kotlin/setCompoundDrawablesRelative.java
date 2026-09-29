package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class setCompoundDrawablesRelative<E> extends setAllCaps<E> implements Set<E>, FinalDataRsModel {
    private final setCustomSelectionActionModeCallback<E> AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCompoundDrawablesRelative(setCustomSelectionActionModeCallback<E> setcustomselectionactionmodecallback) {
        super(setcustomselectionactionmodecallback);
        toMagicModuleMetaRepoModel.write(setcustomselectionactionmodecallback, "");
        this.AudioAttributesCompatParcelizer = setcustomselectionactionmodecallback;
    }

    @Override // kotlin.setAllCaps, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(e);
    }

    @Override // kotlin.setAllCaps, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((Iterable) collection);
    }

    @Override // kotlin.setAllCaps, java.util.Set, java.util.Collection
    public final void clear() {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public static final class RemoteActionCompatParcelizer implements Iterator<E>, isModuleGeneratedVisible {
        private final Iterator<E> IconCompatParcelizer;
        private int RemoteActionCompatParcelizer = -1;
        final /* synthetic */ setCompoundDrawablesRelative<E> write;

        RemoteActionCompatParcelizer(setCompoundDrawablesRelative<E> setcompounddrawablesrelative) {
            this.write = setcompounddrawablesrelative;
            this.IconCompatParcelizer = StateResult.write((MagicModuleSubmissionRequestBody) new AudioAttributesCompatParcelizer(setcompounddrawablesrelative, this, null));
        }

        static final class AudioAttributesCompatParcelizer extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<setStateResult<? super E>, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ Object AudioAttributesCompatParcelizer;
            private Object AudioAttributesImplApi26Parcelizer;
            private Object AudioAttributesImplBaseParcelizer;
            private Object IconCompatParcelizer;
            private int MediaBrowserCompatCustomActionResultReceiver;
            final /* synthetic */ setCompoundDrawablesRelative<E> RemoteActionCompatParcelizer;
            private int read;
            final /* synthetic */ RemoteActionCompatParcelizer write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                setStateResult setstateresult;
                RemoteActionCompatParcelizer remoteActionCompatParcelizer;
                setCompoundDrawablesRelative<E> setcompounddrawablesrelative;
                long[] jArr;
                int i;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
                if (i2 == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    setstateresult = (setStateResult) this.AudioAttributesCompatParcelizer;
                    setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = ((setCompoundDrawablesRelative) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer;
                    remoteActionCompatParcelizer = this.write;
                    setcompounddrawablesrelative = this.RemoteActionCompatParcelizer;
                    jArr = setcustomselectionactionmodecallback.MediaBrowserCompatItemReceiver;
                    i = setcustomselectionactionmodecallback.MediaBrowserCompatCustomActionResultReceiver;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.read;
                    jArr = (long[]) this.AudioAttributesImplBaseParcelizer;
                    setcompounddrawablesrelative = (setCompoundDrawablesRelative) this.AudioAttributesImplApi26Parcelizer;
                    remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) this.IconCompatParcelizer;
                    setstateresult = (setStateResult) this.AudioAttributesCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                while (i != Integer.MAX_VALUE) {
                    int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer(i);
                    Object obj2 = ((setCompoundDrawablesRelative) setcompounddrawablesrelative).AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[i];
                    this.AudioAttributesCompatParcelizer = setstateresult;
                    this.IconCompatParcelizer = remoteActionCompatParcelizer;
                    this.AudioAttributesImplApi26Parcelizer = setcompounddrawablesrelative;
                    this.AudioAttributesImplBaseParcelizer = jArr;
                    this.read = i3;
                    this.MediaBrowserCompatCustomActionResultReceiver = 1;
                    if (setstateresult.IconCompatParcelizer(obj2, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    i = i3;
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AudioAttributesCompatParcelizer(setCompoundDrawablesRelative<E> setcompounddrawablesrelative, RemoteActionCompatParcelizer remoteActionCompatParcelizer, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = setcompounddrawablesrelative;
                this.write = remoteActionCompatParcelizer;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = obj;
                return audioAttributesCompatParcelizer;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(setStateResult<? super E> setstateresult, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AudioAttributesCompatParcelizer) create(setstateresult, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        public final void RemoteActionCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.IconCompatParcelizer.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return this.IconCompatParcelizer.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.RemoteActionCompatParcelizer != -1) {
                ((setCompoundDrawablesRelative) this.write).AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
                this.RemoteActionCompatParcelizer = -1;
            }
        }
    }

    @Override // kotlin.setAllCaps, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.setAllCaps, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(obj);
    }

    @Override // kotlin.setAllCaps, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return this.AudioAttributesCompatParcelizer.read((Collection) collection);
    }

    @Override // kotlin.setAllCaps, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((Iterable) collection);
    }
}
