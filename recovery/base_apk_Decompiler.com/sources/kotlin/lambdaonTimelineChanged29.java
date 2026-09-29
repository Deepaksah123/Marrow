package kotlin;

import android.content.Context;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import kotlin.lambdaonSkipSilenceEnabledChanged53;
import kotlin.lambdaonUpstreamDiscarded27;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\t\u001a\u00020\rH\u0007¢\u0006\u0004\b\t\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/lambdaonTimelineChanged29;", "", "<init>", "()V", "Lo/lambdaonSkipSilenceEnabledChanged53;", "p0", "Lo/lambdaonVideoSizeChanged56;", "p1", "", "write", "(Lo/lambdaonSkipSilenceEnabledChanged53;Lo/lambdaonVideoSizeChanged56;)V", "Lo/lambdaonSurfaceSizeChanged22;", "(Lo/lambdaonSurfaceSizeChanged22;)V", "Lo/lambdaonVolumeChanged12;", "()Lo/lambdaonVolumeChanged12;", "AudioAttributesCompatParcelizer", "(Lo/lambdaonVolumeChanged12;)V"}, k = 1, mv = {1, 4, 0})
public final class lambdaonTimelineChanged29 {
    public static final lambdaonTimelineChanged29 INSTANCE = new lambdaonTimelineChanged29();

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lambdaonTimelineChanged29.class.getName(), "");
    }

    private lambdaonTimelineChanged29() {
    }

    @getMagicModuleMeta
    public static final void write(lambdaonSkipSilenceEnabledChanged53 p0, lambdaonVideoSizeChanged56 p1) {
        synchronized (lambdaonTimelineChanged29.class) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTimelineChanged29.class)) {
                return;
            }
            try {
                toMagicModuleMetaRepoModel.write(p0, "");
                toMagicModuleMetaRepoModel.write(p1, "");
                DefaultAnalyticsCollectorExternalSyntheticLambda29.read();
                lambdaonVolumeChanged12 lambdaonvolumechanged12Write = write();
                lambdaonvolumechanged12Write.write(p0, p1.write());
                AudioAttributesCompatParcelizer(lambdaonvolumechanged12Write);
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, lambdaonTimelineChanged29.class);
            }
        }
    }

    @getMagicModuleMeta
    public static final void write(lambdaonSurfaceSizeChanged22 p0) {
        synchronized (lambdaonTimelineChanged29.class) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTimelineChanged29.class)) {
                return;
            }
            try {
                toMagicModuleMetaRepoModel.write(p0, "");
                DefaultAnalyticsCollectorExternalSyntheticLambda29.read();
                lambdaonVolumeChanged12 lambdaonvolumechanged12Write = write();
                for (lambdaonSkipSilenceEnabledChanged53 lambdaonskipsilenceenabledchanged53 : p0.IconCompatParcelizer()) {
                    lambdaonVideoSizeChanged56 lambdaonvideosizechanged56IconCompatParcelizer = p0.IconCompatParcelizer(lambdaonskipsilenceenabledchanged53);
                    if (lambdaonvideosizechanged56IconCompatParcelizer == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    lambdaonvolumechanged12Write.write(lambdaonskipsilenceenabledchanged53, lambdaonvideosizechanged56IconCompatParcelizer.write());
                }
                AudioAttributesCompatParcelizer(lambdaonvolumechanged12Write);
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, lambdaonTimelineChanged29.class);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096 A[Catch: all -> 0x009d, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x009d, blocks: (B:9:0x000e, B:14:0x0036, B:15:0x003b, B:49:0x0096, B:18:0x0046, B:29:0x005a, B:30:0x005f, B:33:0x006a, B:35:0x006e, B:36:0x0073, B:40:0x0080, B:39:0x007e, B:42:0x0082, B:43:0x0087), top: B:67:0x000e, outer: #3, inners: #1, #7 }] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.content.Context] */
    @kotlin.getMagicModuleMeta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.lambdaonVolumeChanged12 write() {
        /*
            java.lang.Class<o.lambdaonTimelineChanged29> r0 = kotlin.lambdaonTimelineChanged29.class
            monitor-enter(r0)
            java.lang.Class<o.lambdaonTimelineChanged29> r1 = kotlin.lambdaonTimelineChanged29.class
            boolean r1 = kotlin.getMinWindowSequenceNumber.IconCompatParcelizer(r1)     // Catch: java.lang.Throwable -> La5
            r2 = 0
            if (r1 == 0) goto Le
            monitor-exit(r0)
            return r2
        Le:
            kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda29.read()     // Catch: java.lang.Throwable -> L9d
            android.content.Context r1 = kotlin.lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56 java.io.FileNotFoundException -> L81
            java.lang.String r4 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r3, r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56 java.io.FileNotFoundException -> L81
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56 java.io.FileNotFoundException -> L81
            o.lambdaonTimelineChanged29$write r4 = new o.lambdaonTimelineChanged29$write     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56 java.io.FileNotFoundException -> L81
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56 java.io.FileNotFoundException -> L81
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56 java.io.FileNotFoundException -> L81
            java.io.InputStream r5 = (java.io.InputStream) r5     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56 java.io.FileNotFoundException -> L81
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56 java.io.FileNotFoundException -> L81
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L82
            if (r3 == 0) goto L49
            o.lambdaonVolumeChanged12 r3 = (kotlin.lambdaonVolumeChanged12) r3     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L82
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L9d
            kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            r1.delete()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            goto L94
        L45:
            r1 = move-exception
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L9d
            goto L94
        L49:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L82
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L82
            throw r3     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L6d java.io.FileNotFoundException -> L82
        L51:
            r3 = move-exception
            goto L58
        L53:
            r3 = move-exception
            r4 = r2
            goto L6e
        L56:
            r3 = move-exception
            r4 = r2
        L58:
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> L6d
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L9d
            kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L9d
            r1.delete()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L9d
            goto L93
        L69:
            r1 = move-exception
        L6a:
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L9d
            goto L93
        L6d:
            r3 = move-exception
        L6e:
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L9d
            kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L9d
            r1.delete()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L9d
            goto L80
        L7d:
            r1 = move-exception
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L9d
        L80:
            throw r3     // Catch: java.lang.Throwable -> L9d
        L81:
            r4 = r2
        L82:
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L9d
            kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> L9d
            r1.delete()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> L9d
            goto L93
        L91:
            r1 = move-exception
            goto L6a
        L93:
            r3 = r2
        L94:
            if (r3 != 0) goto L9b
            o.lambdaonVolumeChanged12 r3 = new o.lambdaonVolumeChanged12     // Catch: java.lang.Throwable -> L9d
            r3.<init>()     // Catch: java.lang.Throwable -> L9d
        L9b:
            monitor-exit(r0)
            return r3
        L9d:
            r1 = move-exception
            java.lang.Class<o.lambdaonTimelineChanged29> r3 = kotlin.lambdaonTimelineChanged29.class
            kotlin.getMinWindowSequenceNumber.read(r1, r3)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r0)
            return r2
        La5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.lambdaonTimelineChanged29.write():o.lambdaonVolumeChanged12");
    }

    @getMagicModuleMeta
    private static void AudioAttributesCompatParcelizer(lambdaonVolumeChanged12 p0) {
        ObjectOutputStream objectOutputStream;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTimelineChanged29.class)) {
            return;
        }
        try {
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            try {
                objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextAudioAttributesCompatParcelizer.openFileOutput("AppEventsLogger.persistedevents", 0)));
            } catch (Throwable unused) {
                objectOutputStream = null;
            }
            try {
                objectOutputStream.writeObject(p0);
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(objectOutputStream);
            } catch (Throwable unused2) {
                try {
                    contextAudioAttributesCompatParcelizer.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused3) {
                } catch (Throwable th) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(objectOutputStream);
                    throw th;
                }
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(objectOutputStream);
            }
        } catch (Throwable th2) {
            getMinWindowSequenceNumber.read(th2, lambdaonTimelineChanged29.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/lambdaonTimelineChanged29$write;", "Ljava/io/ObjectInputStream;", "Ljava/io/InputStream;", "p0", "<init>", "(Ljava/io/InputStream;)V", "Ljava/io/ObjectStreamClass;", "readClassDescriptor", "()Ljava/io/ObjectStreamClass;", "IconCompatParcelizer"}, k = 1, mv = {1, 4, 0})
    static final class write extends ObjectInputStream {
        public write(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected final ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass classDescriptor = super.readClassDescriptor();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(classDescriptor, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) classDescriptor.getName(), (Object) "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                classDescriptor = ObjectStreamClass.lookup(lambdaonSkipSilenceEnabledChanged53.write.class);
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) classDescriptor.getName(), (Object) "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                classDescriptor = ObjectStreamClass.lookup(lambdaonUpstreamDiscarded27.AudioAttributesCompatParcelizer.class);
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(classDescriptor, "");
            return classDescriptor;
        }
    }
}
