package kotlin;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.parseSpliceTime;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0007\u0010\u0012R@\u0010\n\u001a.\u0012\b\u0012\u0006*\u00020\u00040\u0004\u0012\b\u0012\u0006*\u00020\t0\t*\u0016\u0012\b\u0012\u0006*\u00020\u00040\u0004\u0012\b\u0012\u0006*\u00020\t0\t0\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/decodeStreamKeys;", "", "<init>", "()V", "Lo/parseSpliceTime$read;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/parseSpliceTime$read;)V", "Lo/decodeStreamKeys$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "(Lo/parseSpliceTime$read;)Lo/decodeStreamKeys$RemoteActionCompatParcelizer;", "", "Lo/parseSpliceTime;", "read", "(Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "(Lo/parseSpliceTime$read;)Lo/parseSpliceTime;", "(Lo/parseSpliceTime;)V", "", "Ljava/util/Map;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class decodeStreamKeys {
    public static final decodeStreamKeys INSTANCE = new decodeStreamKeys();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final Map<parseSpliceTime.read, RemoteActionCompatParcelizer> IconCompatParcelizer = Collections.synchronizedMap(new LinkedHashMap());

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        int MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return decodeStreamKeys.this.read(this);
        }
    }

    private decodeStreamKeys() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void AudioAttributesCompatParcelizer(parseSpliceTime.read p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Map<parseSpliceTime.read, RemoteActionCompatParcelizer> map = IconCompatParcelizer;
        if (map.containsKey(p0)) {
            Objects.toString(p0);
            return;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(map, "");
        map.put(p0, new RemoteActionCompatParcelizer(setEncryptSalt.AudioAttributesCompatParcelizer(true), null, 2, 0 == true ? 1 : 0));
    }

    public static void AudioAttributesCompatParcelizer(parseSpliceTime p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        parseSpliceTime.read readVarIconCompatParcelizer = p0.IconCompatParcelizer();
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(readVarIconCompatParcelizer);
        if (remoteActionCompatParcelizerIconCompatParcelizer.getAudioAttributesCompatParcelizer() != null) {
            Objects.toString(readVarIconCompatParcelizer);
        } else {
            remoteActionCompatParcelizerIconCompatParcelizer.write(p0);
            remoteActionCompatParcelizerIconCompatParcelizer.getRemoteActionCompatParcelizer().write(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a4 -> B:27:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super java.util.Map<o.parseSpliceTime.read, ? extends kotlin.parseSpliceTime>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof o.decodeStreamKeys.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r10
            o.decodeStreamKeys$IconCompatParcelizer r0 = (o.decodeStreamKeys.IconCompatParcelizer) r0
            int r1 = r0.MediaBrowserCompatItemReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.MediaBrowserCompatItemReceiver
            int r9 = r9 + r2
            r0.MediaBrowserCompatItemReceiver = r9
            goto L19
        L14:
            o.decodeStreamKeys$IconCompatParcelizer r0 = new o.decodeStreamKeys$IconCompatParcelizer
            r0.<init>(r10)
        L19:
            java.lang.Object r9 = r0.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Object r10 = kotlin.getYear.IconCompatParcelizer()
            int r1 = r0.MediaBrowserCompatItemReceiver
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L49
            if (r1 != r2) goto L41
            java.lang.Object r1 = r0.AudioAttributesImplApi26Parcelizer
            java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.read
            o.setDownloadPercent r5 = (kotlin.setDownloadPercent) r5
            java.lang.Object r6 = r0.write
            o.parseSpliceTime$read r6 = (o.parseSpliceTime.read) r6
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            java.util.Map r8 = (java.util.Map) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto La5
        L41:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L49:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            java.util.Map<o.parseSpliceTime$read, o.decodeStreamKeys$RemoteActionCompatParcelizer> r9 = kotlin.decodeStreamKeys.IconCompatParcelizer
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r9, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r4 = r9.size()
            int r4 = kotlin.VideoTimelineResponseBody.read(r4)
            r1.<init>(r4)
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r9 = r9.entrySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r7 = r9
            r4 = r1
        L6e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lb6
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.Object r5 = r9.getKey()
            r6 = r5
            o.parseSpliceTime$read r6 = (o.parseSpliceTime.read) r6
            java.lang.Object r9 = r9.getValue()
            o.decodeStreamKeys$RemoteActionCompatParcelizer r9 = (o.decodeStreamKeys.RemoteActionCompatParcelizer) r9
            o.setDownloadPercent r5 = r9.getRemoteActionCompatParcelizer()
            r0.RemoteActionCompatParcelizer = r4
            r0.IconCompatParcelizer = r7
            r0.write = r6
            r0.read = r5
            r0.AudioAttributesCompatParcelizer = r4
            r0.AudioAttributesImplApi26Parcelizer = r1
            r0.MediaBrowserCompatItemReceiver = r2
            java.lang.Object r9 = r5.RemoteActionCompatParcelizer(r3, r0)
            if (r9 != r10) goto La4
            return r10
        La4:
            r8 = r4
        La5:
            o.parseSpliceTime r9 = RemoteActionCompatParcelizer(r6)     // Catch: java.lang.Throwable -> Lb1
            r5.write(r3)
            r4.put(r1, r9)
            r4 = r8
            goto L6e
        Lb1:
            r9 = move-exception
            r5.write(r3)
            throw r9
        Lb6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.decodeStreamKeys.read(o.SampleVideos):java.lang.Object");
    }

    private static parseSpliceTime RemoteActionCompatParcelizer(parseSpliceTime.read p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        parseSpliceTime audioAttributesCompatParcelizer = IconCompatParcelizer(p0).getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("Subscriber ");
        sb.append(p0);
        sb.append(" has not been registered.");
        throw new IllegalStateException(sb.toString());
    }

    private static RemoteActionCompatParcelizer IconCompatParcelizer(parseSpliceTime.read p0) {
        Map<parseSpliceTime.read, RemoteActionCompatParcelizer> map = IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(map, "");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = map.get(p0);
        if (remoteActionCompatParcelizer != null) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, "");
            return remoteActionCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("Cannot get dependency ");
        sb.append(p0);
        sb.append(". Dependencies should be added at class load time.");
        throw new IllegalStateException(sb.toString());
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0011\u0010\u0018"}, d2 = {"Lo/decodeStreamKeys$RemoteActionCompatParcelizer;", "", "Lo/setDownloadPercent;", "p0", "Lo/parseSpliceTime;", "p1", "<init>", "(Lo/setDownloadPercent;Lo/parseSpliceTime;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "Lo/setDownloadPercent;", "RemoteActionCompatParcelizer", "()Lo/setDownloadPercent;", "Lo/parseSpliceTime;", "read", "()Lo/parseSpliceTime;", "(Lo/parseSpliceTime;)V", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final /* data */ class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private parseSpliceTime AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final setDownloadPercent RemoteActionCompatParcelizer;

        private RemoteActionCompatParcelizer(setDownloadPercent setdownloadpercent, parseSpliceTime parsesplicetime) {
            toMagicModuleMetaRepoModel.write(setdownloadpercent, "");
            this.RemoteActionCompatParcelizer = setdownloadpercent;
            this.AudioAttributesCompatParcelizer = parsesplicetime;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(setDownloadPercent setdownloadpercent, parseSpliceTime parsesplicetime, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(setdownloadpercent, (i & 2) != 0 ? null : parsesplicetime);
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final setDownloadPercent getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final parseSpliceTime getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void write(parseSpliceTime parsesplicetime) {
            this.AudioAttributesCompatParcelizer = parsesplicetime;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            parseSpliceTime parsesplicetime = this.AudioAttributesCompatParcelizer;
            return (iHashCode * 31) + (parsesplicetime == null ? 0 : parsesplicetime.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
