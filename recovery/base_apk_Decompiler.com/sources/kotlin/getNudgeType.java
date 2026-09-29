package kotlin;

import java.io.IOException;
import java.util.Objects;
import kotlin.toDownloadInfo;

/* JADX INFO: loaded from: classes4.dex */
final class getNudgeType<T> implements SearchTextResponseBody<T> {
    private volatile boolean AudioAttributesCompatParcelizer;
    private toDownloadInfo AudioAttributesImplApi26Parcelizer;
    private final GTSubjectAnalyticsV2RSModelKt AudioAttributesImplBaseParcelizer;
    private Throwable IconCompatParcelizer;
    private final PlanSubscriptionRSModel<ActivityAdapterModule, T> MediaBrowserCompatItemReceiver;
    private final Object[] RemoteActionCompatParcelizer;
    private boolean read;
    private final toDownloadInfo.AudioAttributesCompatParcelizer write;

    getNudgeType(GTSubjectAnalyticsV2RSModelKt gTSubjectAnalyticsV2RSModelKt, Object[] objArr, toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, PlanSubscriptionRSModel<ActivityAdapterModule, T> planSubscriptionRSModel) {
        this.AudioAttributesImplBaseParcelizer = gTSubjectAnalyticsV2RSModelKt;
        this.RemoteActionCompatParcelizer = objArr;
        this.write = audioAttributesCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = planSubscriptionRSModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.SearchTextResponseBody
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public getNudgeType<T> clone() {
        return new getNudgeType<>(this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompatItemReceiver);
    }

    @Override // kotlin.SearchTextResponseBody
    public final ThemeKtExternalSyntheticLambda0 AudioAttributesCompatParcelizer() {
        ThemeKtExternalSyntheticLambda0 originalRequest;
        synchronized (this) {
            try {
                originalRequest = AudioAttributesImplApi21Parcelizer().getOriginalRequest();
            } catch (IOException e) {
                throw new RuntimeException("Unable to create request.", e);
            }
        }
        return originalRequest;
    }

    private toDownloadInfo AudioAttributesImplApi21Parcelizer() throws IOException {
        toDownloadInfo todownloadinfo = this.AudioAttributesImplApi26Parcelizer;
        if (todownloadinfo != null) {
            return todownloadinfo;
        }
        Throwable th = this.IconCompatParcelizer;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            toDownloadInfo todownloadinfoMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplApi26Parcelizer = todownloadinfoMediaBrowserCompatCustomActionResultReceiver;
            return todownloadinfoMediaBrowserCompatCustomActionResultReceiver;
        } catch (IOException | Error | RuntimeException e) {
            GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(e);
            this.IconCompatParcelizer = e;
            throw e;
        }
    }

    @Override // kotlin.SearchTextResponseBody
    public final void IconCompatParcelizer(final SubjectLSModel<T> subjectLSModel) {
        toDownloadInfo todownloadinfo;
        Throwable th;
        Objects.requireNonNull(subjectLSModel, "callback == null");
        synchronized (this) {
            if (this.read) {
                throw new IllegalStateException("Already executed.");
            }
            this.read = true;
            todownloadinfo = this.AudioAttributesImplApi26Parcelizer;
            th = this.IconCompatParcelizer;
            if (todownloadinfo == null && th == null) {
                try {
                    toDownloadInfo todownloadinfoMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                    this.AudioAttributesImplApi26Parcelizer = todownloadinfoMediaBrowserCompatCustomActionResultReceiver;
                    todownloadinfo = todownloadinfoMediaBrowserCompatCustomActionResultReceiver;
                } catch (Throwable th2) {
                    th = th2;
                    GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(th);
                    this.IconCompatParcelizer = th;
                }
            }
        }
        if (th != null) {
            subjectLSModel.AudioAttributesCompatParcelizer(this, th);
            return;
        }
        if (this.AudioAttributesCompatParcelizer) {
            todownloadinfo.RemoteActionCompatParcelizer();
        }
        dolbyVisionStringToProfile.read(todownloadinfo, new MarrowVideoDownloadException() { // from class: o.getNudgeType.3
            @Override // kotlin.MarrowVideoDownloadException
            public final void read(toDownloadInfo todownloadinfo2, C0156TypeKt c0156TypeKt) {
                try {
                    try {
                        subjectLSModel.read(getNudgeType.this, getNudgeType.this.AudioAttributesCompatParcelizer(c0156TypeKt));
                    } catch (Throwable th3) {
                        GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(th3);
                        th3.printStackTrace();
                    }
                } catch (Throwable th4) {
                    GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(th4);
                    AudioAttributesCompatParcelizer(th4);
                }
            }

            @Override // kotlin.MarrowVideoDownloadException
            public final void read(toDownloadInfo todownloadinfo2, IOException iOException) {
                AudioAttributesCompatParcelizer(iOException);
            }

            private void AudioAttributesCompatParcelizer(Throwable th3) {
                try {
                    subjectLSModel.AudioAttributesCompatParcelizer(getNudgeType.this, th3);
                } catch (Throwable th4) {
                    GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(th4);
                    th4.printStackTrace();
                }
            }
        });
    }

    @Override // kotlin.SearchTextResponseBody
    public final getTopicStat<T> read() throws IOException {
        toDownloadInfo todownloadinfoAudioAttributesImplApi21Parcelizer;
        synchronized (this) {
            if (this.read) {
                throw new IllegalStateException("Already executed.");
            }
            this.read = true;
            todownloadinfoAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        }
        if (this.AudioAttributesCompatParcelizer) {
            todownloadinfoAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        }
        return AudioAttributesCompatParcelizer(dolbyVisionStringToProfile.read(todownloadinfoAudioAttributesImplApi21Parcelizer));
    }

    private toDownloadInfo MediaBrowserCompatCustomActionResultReceiver() throws IOException {
        toDownloadInfo todownloadinfoIconCompatParcelizer = this.write.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer));
        if (todownloadinfoIconCompatParcelizer != null) {
            return todownloadinfoIconCompatParcelizer;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    final getTopicStat<T> AudioAttributesCompatParcelizer(C0156TypeKt c0156TypeKt) throws IOException {
        ActivityAdapterModule body = c0156TypeKt.getBody();
        C0156TypeKt c0156TypeKtIconCompatParcelizer = c0156TypeKt.MediaDescriptionCompat().write(new AudioAttributesCompatParcelizer(body.write(), body.read())).IconCompatParcelizer();
        int code = c0156TypeKtIconCompatParcelizer.getCode();
        if (code < 200 || code >= 300) {
            try {
                return getTopicStat.write(GTSubjectAnalyticsV2ResponseModel.write(body), c0156TypeKtIconCompatParcelizer);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return getTopicStat.write((Object) null, c0156TypeKtIconCompatParcelizer);
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(body);
        try {
            return getTopicStat.write(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(remoteActionCompatParcelizer), c0156TypeKtIconCompatParcelizer);
        } catch (RuntimeException e) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            throw e;
        }
    }

    @Override // kotlin.SearchTextResponseBody
    public final void RemoteActionCompatParcelizer() {
        toDownloadInfo todownloadinfo;
        this.AudioAttributesCompatParcelizer = true;
        synchronized (this) {
            todownloadinfo = this.AudioAttributesImplApi26Parcelizer;
        }
        if (todownloadinfo != null) {
            todownloadinfo.RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    @Override // kotlin.SearchTextResponseBody
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean IconCompatParcelizer() {
        /*
            r2 = this;
            boolean r0 = r2.AudioAttributesCompatParcelizer
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            monitor-enter(r2)
            o.toDownloadInfo r0 = r2.AudioAttributesImplApi26Parcelizer     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            boolean r0 = r0.getCanceled()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            monitor-exit(r2)
            return r1
        L15:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getNudgeType.IconCompatParcelizer():boolean");
    }

    static final class AudioAttributesCompatParcelizer extends ActivityAdapterModule {
        private final long IconCompatParcelizer;
        private final MediaType read;

        AudioAttributesCompatParcelizer(MediaType mediaType, long j) {
            this.read = mediaType;
            this.IconCompatParcelizer = j;
        }

        @Override // kotlin.ActivityAdapterModule
        public final MediaType write() {
            return this.read;
        }

        @Override // kotlin.ActivityAdapterModule
        public final long read() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.ActivityAdapterModule
        public final LessonCompletedDialog AudioAttributesCompatParcelizer() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    static final class RemoteActionCompatParcelizer extends ActivityAdapterModule {
        private final LessonCompletedDialog RemoteActionCompatParcelizer;
        private final ActivityAdapterModule read;
        IOException write;

        RemoteActionCompatParcelizer(ActivityAdapterModule activityAdapterModule) {
            this.read = activityAdapterModule;
            this.RemoteActionCompatParcelizer = CustomAppBarLayout.AudioAttributesCompatParcelizer(new setRelatedModuleAdapter(activityAdapterModule.AudioAttributesCompatParcelizer()) { // from class: o.getNudgeType.RemoteActionCompatParcelizer.5
                @Override // kotlin.setRelatedModuleAdapter, kotlin.setLockedFromSeek
                public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
                    try {
                        return super.AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
                    } catch (IOException e) {
                        RemoteActionCompatParcelizer.this.write = e;
                        throw e;
                    }
                }
            });
        }

        @Override // kotlin.ActivityAdapterModule
        public final MediaType write() {
            return this.read.write();
        }

        @Override // kotlin.ActivityAdapterModule
        public final long read() {
            return this.read.read();
        }

        @Override // kotlin.ActivityAdapterModule
        public final LessonCompletedDialog AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.ActivityAdapterModule, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.read.close();
        }

        final void RemoteActionCompatParcelizer() throws IOException {
            IOException iOException = this.write;
            if (iOException != null) {
                throw iOException;
            }
        }
    }
}
