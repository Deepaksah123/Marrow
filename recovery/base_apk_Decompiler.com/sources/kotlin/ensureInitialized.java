package kotlin;

import android.content.Context;
import kotlin.Metadata;
import kotlin.getTestPattern;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\r\u0012\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u00138Gø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001e\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!"}, d2 = {"Lo/ensureInitialized;", "", "Landroid/content/Context;", "p0", "Lo/CurrentQuery;", "p1", "p2", "Lo/hasSamples;", "p3", "Lo/TextInformationFrame1;", "p4", "<init>", "(Landroid/content/Context;Lo/CurrentQuery;Lo/CurrentQuery;Lo/hasSamples;Lo/TextInformationFrame1;)V", "Lo/getDownload;", "(Lo/getDownload;Lo/getDownload;)V", "", "", "write", "(D)Z", "Lo/getTestPattern;", "read", "(J)Z", "", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getDownload;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "()D", "()J", "()Z"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ensureInitialized {
    private static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(null);

    @Deprecated
    private static final PlaybackConfigRootRequestBody<Context, collectAnnotations<AnnotatedMethod>> write = AnnotatedField.RemoteActionCompatParcelizer("firebase_session_settings");

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getDownload IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getDownload AudioAttributesCompatParcelizer;

    static final class read extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return ensureInitialized.this.RemoteActionCompatParcelizer(this);
        }
    }

    private static boolean write(double p0) {
        return 0.0d <= p0 && p0 <= 1.0d;
    }

    private ensureInitialized(getDownload getdownload, getDownload getdownload2) {
        toMagicModuleMetaRepoModel.write(getdownload, "");
        toMagicModuleMetaRepoModel.write(getdownload2, "");
        this.AudioAttributesCompatParcelizer = getdownload;
        this.IconCompatParcelizer = getdownload2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ensureInitialized(Context context, CurrentQuery currentQuery, CurrentQuery currentQuery2, hasSamples hassamples, TextInformationFrame1 textInformationFrame1) {
        this(new getStateQuery(context), new getDownloadForCurrentRowV2(currentQuery2, hassamples, textInformationFrame1, new getDownloadForCurrentRow(textInformationFrame1, currentQuery, null, 4, null), RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(context)));
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(currentQuery, "");
        toMagicModuleMetaRepoModel.write(currentQuery2, "");
        toMagicModuleMetaRepoModel.write(hassamples, "");
        toMagicModuleMetaRepoModel.write(textInformationFrame1, "");
    }

    public final boolean RemoteActionCompatParcelizer() {
        Boolean boolIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        if (boolIconCompatParcelizer != null) {
            return boolIconCompatParcelizer.booleanValue();
        }
        Boolean boolIconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer();
        if (boolIconCompatParcelizer2 != null) {
            return boolIconCompatParcelizer2.booleanValue();
        }
        return true;
    }

    public final double IconCompatParcelizer() {
        Double dRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        if (dRemoteActionCompatParcelizer != null) {
            double dDoubleValue = dRemoteActionCompatParcelizer.doubleValue();
            if (write(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dRemoteActionCompatParcelizer2 = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        if (dRemoteActionCompatParcelizer2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dRemoteActionCompatParcelizer2.doubleValue();
        if (write(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long AudioAttributesCompatParcelizer() {
        getTestPattern gettestpattern = this.AudioAttributesCompatParcelizer.read();
        if (gettestpattern != null) {
            long write2 = gettestpattern.getWrite();
            if (read(write2)) {
                return write2;
            }
        }
        getTestPattern gettestpattern2 = this.IconCompatParcelizer.read();
        if (gettestpattern2 != null) {
            long write3 = gettestpattern2.getWrite();
            if (read(write3)) {
                return write3;
            }
        }
        getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
        return getUserSubmissionTimestamp.IconCompatParcelizer(30, isAnonymous.IconCompatParcelizer);
    }

    private static boolean read(long p0) {
        return getTestPattern.AudioAttributesImplApi26Parcelizer(p0) && getTestPattern.IconCompatParcelizer(p0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r5.read(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o.ensureInitialized.read
            if (r0 == 0) goto L14
            r0 = r6
            o.ensureInitialized$read r0 = (o.ensureInitialized.read) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.IconCompatParcelizer
            int r6 = r6 + r2
            r0.IconCompatParcelizer = r6
            goto L19
        L14:
            o.ensureInitialized$read r0 = new o.ensureInitialized$read
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            o.ensureInitialized r5 = (kotlin.ensureInitialized) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L4c
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getDownload r6 = r5.AudioAttributesCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r5
            r0.IconCompatParcelizer = r4
            java.lang.Object r6 = r6.read(r0)
            if (r6 == r1) goto L5d
        L4c:
            o.getDownload r5 = r5.IconCompatParcelizer
            r6 = 0
            r0.AudioAttributesCompatParcelizer = r6
            r0.IconCompatParcelizer = r3
            java.lang.Object r5 = r5.read(r0)
            if (r5 != r1) goto L5a
            goto L5d
        L5a:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ensureInitialized.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lo/ensureInitialized$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "Lo/collectAnnotations;", "Lo/AnnotatedMethod;", "write", "Lo/PlaybackConfigRootRequestBody;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Lo/collectAnnotations;"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class RemoteActionCompatParcelizer {
        private static /* synthetic */ isResolutionNotSupported<Object>[] AudioAttributesCompatParcelizer = {toMagicModuleMetaDataUcModel.AudioAttributesCompatParcelizer(new MagicModuleMetaDataKt(RemoteActionCompatParcelizer.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

        private RemoteActionCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static collectAnnotations<AnnotatedMethod> RemoteActionCompatParcelizer(Context context) {
            return (collectAnnotations) ensureInitialized.write.read(context, AudioAttributesCompatParcelizer[0]);
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
