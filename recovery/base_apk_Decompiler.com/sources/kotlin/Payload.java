package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class Payload<T> extends getCurrency<T, T> {
    private isTagActive AudioAttributesCompatParcelizer;
    private getTimelineId<? super Throwable> IconCompatParcelizer;
    private isTagActive RemoteActionCompatParcelizer;
    private getTimelineId<? super T> read;

    public Payload(findTheInteractiveElementWhichIsInBetween<T> findtheinteractiveelementwhichisinbetween, getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2, isTagActive istagactive, isTagActive istagactive2) {
        super(findtheinteractiveelementwhichisinbetween);
        this.read = gettimelineid;
        this.IconCompatParcelizer = gettimelineid2;
        this.RemoteActionCompatParcelizer = istagactive;
        this.AudioAttributesCompatParcelizer = istagactive2;
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super T> getupdates) {
        this.write.write(new read(getupdates, this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer));
    }

    static final class read<T> implements getUpdates<T>, MarkIncompleteResponseBody {
        private getUpdates<? super T> AudioAttributesCompatParcelizer;
        private getTimelineId<? super T> AudioAttributesImplApi26Parcelizer;
        private MarkIncompleteResponseBody AudioAttributesImplBaseParcelizer;
        private isTagActive IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private getTimelineId<? super Throwable> read;
        private isTagActive write;

        read(getUpdates<? super T> getupdates, getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2, isTagActive istagactive, isTagActive istagactive2) {
            this.AudioAttributesCompatParcelizer = getupdates;
            this.AudioAttributesImplApi26Parcelizer = gettimelineid;
            this.read = gettimelineid2;
            this.write = istagactive;
            this.IconCompatParcelizer = istagactive2;
        }

        @Override // kotlin.getUpdates
        public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.read(this.AudioAttributesImplBaseParcelizer, markIncompleteResponseBody)) {
                this.AudioAttributesImplBaseParcelizer = markIncompleteResponseBody;
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this);
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.AudioAttributesImplBaseParcelizer.aL_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.AudioAttributesImplBaseParcelizer.write();
        }

        @Override // kotlin.getUpdates
        public final void read(T t) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            try {
                this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(t);
                this.AudioAttributesCompatParcelizer.read(t);
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                this.AudioAttributesImplBaseParcelizer.aL_();
                IconCompatParcelizer(th);
            }
        }

        @Override // kotlin.getUpdates
        public final void IconCompatParcelizer(Throwable th) {
            if (this.RemoteActionCompatParcelizer) {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            try {
                this.read.RemoteActionCompatParcelizer(th);
            } catch (Throwable th2) {
                getEndTimeMs.RemoteActionCompatParcelizer(th2);
                th = new getPytIds(th, th2);
            }
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(th);
            try {
                this.IconCompatParcelizer.write();
            } catch (Throwable th3) {
                getEndTimeMs.RemoteActionCompatParcelizer(th3);
                getPaymentRefIds.RemoteActionCompatParcelizer(th3);
            }
        }

        @Override // kotlin.getUpdates
        public final void aI_() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            try {
                this.write.write();
                this.RemoteActionCompatParcelizer = true;
                this.AudioAttributesCompatParcelizer.aI_();
                try {
                    this.IconCompatParcelizer.write();
                } catch (Throwable th) {
                    getEndTimeMs.RemoteActionCompatParcelizer(th);
                    getPaymentRefIds.RemoteActionCompatParcelizer(th);
                }
            } catch (Throwable th2) {
                getEndTimeMs.RemoteActionCompatParcelizer(th2);
                IconCompatParcelizer(th2);
            }
        }
    }
}
