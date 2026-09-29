package kotlin;

import kotlin.getIds;

/* JADX INFO: loaded from: classes5.dex */
public final class getCustomerPhone<T> extends getCurrency<T, T> {
    private int AudioAttributesCompatParcelizer;
    private getIds IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;

    public getCustomerPhone(findTheInteractiveElementWhichIsInBetween<T> findtheinteractiveelementwhichisinbetween, getIds getids, boolean z, int i) {
        super(findtheinteractiveelementwhichisinbetween);
        this.IconCompatParcelizer = getids;
        this.RemoteActionCompatParcelizer = false;
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super T> getupdates) {
        getIds getids = this.IconCompatParcelizer;
        if (getids instanceof setCouponCode) {
            this.write.write(getupdates);
        } else {
            this.write.write(new write(getupdates, getids.IconCompatParcelizer(), this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer));
        }
    }

    static final class write<T> extends BookmarkResponseBody<T> implements getUpdates<T>, Runnable {
        private volatile boolean AudioAttributesCompatParcelizer;
        private MarkIncompleteResponseBody AudioAttributesImplApi21Parcelizer;
        private Throwable AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private getUpdates<? super T> IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private toLSModel<T> MediaBrowserCompatItemReceiver;
        private getIds.IconCompatParcelizer MediaDescriptionCompat;
        private volatile boolean RemoteActionCompatParcelizer;
        private boolean read;
        private int write;

        write(getUpdates<? super T> getupdates, getIds.IconCompatParcelizer iconCompatParcelizer, boolean z, int i) {
            this.IconCompatParcelizer = getupdates;
            this.MediaDescriptionCompat = iconCompatParcelizer;
            this.read = z;
            this.write = i;
        }

        @Override // kotlin.getUpdates
        public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.read(this.AudioAttributesImplApi21Parcelizer, markIncompleteResponseBody)) {
                this.AudioAttributesImplApi21Parcelizer = markIncompleteResponseBody;
                if (markIncompleteResponseBody instanceof VideoDeleteRecord) {
                    VideoDeleteRecord videoDeleteRecord = (VideoDeleteRecord) markIncompleteResponseBody;
                    int iWrite = videoDeleteRecord.write(7);
                    if (iWrite == 1) {
                        this.MediaBrowserCompatCustomActionResultReceiver = iWrite;
                        this.MediaBrowserCompatItemReceiver = videoDeleteRecord;
                        this.AudioAttributesCompatParcelizer = true;
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
                        MediaBrowserCompatCustomActionResultReceiver();
                        return;
                    }
                    if (iWrite == 2) {
                        this.MediaBrowserCompatCustomActionResultReceiver = iWrite;
                        this.MediaBrowserCompatItemReceiver = videoDeleteRecord;
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
                        return;
                    }
                }
                this.MediaBrowserCompatItemReceiver = new PaymentStatusResponseKt(this.write);
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
            }
        }

        @Override // kotlin.getUpdates
        public final void read(T t) {
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver != 2) {
                this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(t);
            }
            MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // kotlin.getUpdates
        public final void IconCompatParcelizer(Throwable th) {
            if (this.AudioAttributesCompatParcelizer) {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
                return;
            }
            this.AudioAttributesImplApi26Parcelizer = th;
            this.AudioAttributesCompatParcelizer = true;
            MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // kotlin.getUpdates
        public final void aI_() {
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            this.AudioAttributesCompatParcelizer = true;
            MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            this.AudioAttributesImplApi21Parcelizer.aL_();
            this.MediaDescriptionCompat.aL_();
            if (getAndIncrement() == 0) {
                this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.RemoteActionCompatParcelizer;
        }

        private void MediaBrowserCompatCustomActionResultReceiver() {
            if (getAndIncrement() == 0) {
                this.MediaDescriptionCompat.read(this);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        
            if (r3 != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void MediaBrowserCompatItemReceiver() {
            /*
                r7 = this;
                o.toLSModel<T> r0 = r7.MediaBrowserCompatItemReceiver
                o.getUpdates<? super T> r1 = r7.IconCompatParcelizer
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.AudioAttributesCompatParcelizer
                boolean r5 = r0.IconCompatParcelizer()
                boolean r4 = r7.RemoteActionCompatParcelizer(r4, r5, r1)
                if (r4 != 0) goto L45
            L12:
                boolean r4 = r7.AudioAttributesCompatParcelizer
                java.lang.Object r5 = r0.read()     // Catch: java.lang.Throwable -> L31
                if (r5 != 0) goto L1c
                r6 = r2
                goto L1d
            L1c:
                r6 = 0
            L1d:
                boolean r4 = r7.RemoteActionCompatParcelizer(r4, r6, r1)
                if (r4 != 0) goto L45
                if (r6 == 0) goto L2d
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
                goto L45
            L2d:
                r1.read(r5)
                goto L12
            L31:
                r2 = move-exception
                kotlin.getEndTimeMs.RemoteActionCompatParcelizer(r2)
                o.MarkIncompleteResponseBody r3 = r7.AudioAttributesImplApi21Parcelizer
                r3.aL_()
                r0.RemoteActionCompatParcelizer()
                r1.IconCompatParcelizer(r2)
                o.getIds$IconCompatParcelizer r7 = r7.MediaDescriptionCompat
                r7.aL_()
            L45:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getCustomerPhone.write.MediaBrowserCompatItemReceiver():void");
        }

        private void AudioAttributesImplBaseParcelizer() {
            int iAddAndGet = 1;
            while (!this.RemoteActionCompatParcelizer) {
                boolean z = this.AudioAttributesCompatParcelizer;
                Throwable th = this.AudioAttributesImplApi26Parcelizer;
                if (!this.read && z && th != null) {
                    this.IconCompatParcelizer.IconCompatParcelizer(th);
                    this.MediaDescriptionCompat.aL_();
                    return;
                }
                this.IconCompatParcelizer.read(null);
                if (z) {
                    Throwable th2 = this.AudioAttributesImplApi26Parcelizer;
                    if (th2 != null) {
                        this.IconCompatParcelizer.IconCompatParcelizer(th2);
                    } else {
                        this.IconCompatParcelizer.aI_();
                    }
                    this.MediaDescriptionCompat.aL_();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.AudioAttributesImplBaseParcelizer) {
                AudioAttributesImplBaseParcelizer();
            } else {
                MediaBrowserCompatItemReceiver();
            }
        }

        private boolean RemoteActionCompatParcelizer(boolean z, boolean z2, getUpdates<? super T> getupdates) {
            if (this.RemoteActionCompatParcelizer) {
                this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.AudioAttributesImplApi26Parcelizer;
            if (this.read) {
                if (!z2) {
                    return false;
                }
                if (th != null) {
                    getupdates.IconCompatParcelizer(th);
                } else {
                    getupdates.aI_();
                }
                this.MediaDescriptionCompat.aL_();
                return true;
            }
            if (th != null) {
                this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
                getupdates.IconCompatParcelizer(th);
                this.MediaDescriptionCompat.aL_();
                return true;
            }
            if (!z2) {
                return false;
            }
            getupdates.aI_();
            this.MediaDescriptionCompat.aL_();
            return true;
        }

        @Override // kotlin.isShown
        public final int write(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.AudioAttributesImplBaseParcelizer = true;
            return 2;
        }

        @Override // kotlin.toLSModel
        public final T read() throws Exception {
            return this.MediaBrowserCompatItemReceiver.read();
        }

        @Override // kotlin.toLSModel
        public final void RemoteActionCompatParcelizer() {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.toLSModel
        public final boolean IconCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        }
    }
}
