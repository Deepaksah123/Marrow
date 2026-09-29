package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class component13<T, U> extends getCurrency<T, U> {
    private getSubjectTitle<? super T, ? extends U> RemoteActionCompatParcelizer;

    public component13(findTheInteractiveElementWhichIsInBetween<T> findtheinteractiveelementwhichisinbetween, getSubjectTitle<? super T, ? extends U> getsubjecttitle) {
        super(findtheinteractiveelementwhichisinbetween);
        this.RemoteActionCompatParcelizer = getsubjecttitle;
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super U> getupdates) {
        this.write.write(new AudioAttributesCompatParcelizer(getupdates, this.RemoteActionCompatParcelizer));
    }

    static final class AudioAttributesCompatParcelizer<T, U> extends StepResponseBody<T, U> {
        private getSubjectTitle<? super T, ? extends U> AudioAttributesCompatParcelizer;

        AudioAttributesCompatParcelizer(getUpdates<? super U> getupdates, getSubjectTitle<? super T, ? extends U> getsubjecttitle) {
            super(getupdates);
            this.AudioAttributesCompatParcelizer = getsubjecttitle;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.getUpdates
        public final void read(T t) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            if (this.read != 0) {
                this.write.read(null);
                return;
            }
            try {
                this.write.read((Object) setHasPyt.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                RemoteActionCompatParcelizer(th);
            }
        }

        @Override // kotlin.isShown
        public final int write(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        @Override // kotlin.toLSModel
        public final U read() throws Exception {
            T t = this.IconCompatParcelizer.read();
            if (t != null) {
                return (U) setHasPyt.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.apply(t), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
