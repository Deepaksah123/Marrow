package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001f2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001\u001fB5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u001a\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0012\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0018\u0010\u0011\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u001c\u0010\u0012\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e"}, d2 = {"Lo/toChars;", "", "", "Lo/SnapshotId;", "p0", "p1", "p2", "", "Lo/SnapshotIdArray;", "p3", "<init>", "(JJJ[J)V", "", "AudioAttributesCompatParcelizer", "(J)Z", "write", "(J)Lo/toChars;", "read", "RemoteActionCompatParcelizer", "(Lo/toChars;)Lo/toChars;", "AudioAttributesImplBaseParcelizer", "", "iterator", "()Ljava/util/Iterator;", "(J)J", "", "toString", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "J", "[J", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class toChars implements Iterable<Long>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final toChars read = new toChars(0, 0, 0, null);
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final long write;
    private final long[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long read;

    private toChars(long j, long j2, long j3, long[] jArr) {
        this.write = j;
        this.AudioAttributesCompatParcelizer = j2;
        this.read = j3;
        this.RemoteActionCompatParcelizer = jArr;
    }

    public final boolean AudioAttributesCompatParcelizer(long p0) {
        long[] jArr;
        long j = p0 - this.read;
        return (toMagicModuleMetaRepoModel.read(j, 0L) < 0 || toMagicModuleMetaRepoModel.read(j, 64L) >= 0) ? (toMagicModuleMetaRepoModel.read(j, 64L) < 0 || toMagicModuleMetaRepoModel.read(j, 128L) >= 0) ? toMagicModuleMetaRepoModel.read(j, 0L) <= 0 && (jArr = this.RemoteActionCompatParcelizer) != null && toDecimal.write(jArr, p0) >= 0 : ((1 << (((int) j) + (-64))) & this.write) != 0 : ((1 << ((int) j)) & this.AudioAttributesCompatParcelizer) != 0;
    }

    public final toChars write(long p0) {
        long j;
        long j2;
        long[] jArrRemoteActionCompatParcelizer;
        long j3 = p0 - this.read;
        long j4 = 1;
        if (toMagicModuleMetaRepoModel.read(j3, 0L) >= 0 && toMagicModuleMetaRepoModel.read(j3, 64L) < 0) {
            long j5 = 1 << ((int) j3);
            long j6 = this.AudioAttributesCompatParcelizer;
            if ((j6 & j5) == 0) {
                return new toChars(this.write, j6 | j5, this.read, this.RemoteActionCompatParcelizer);
            }
        } else if (toMagicModuleMetaRepoModel.read(j3, 64L) >= 0 && toMagicModuleMetaRepoModel.read(j3, 128L) < 0) {
            long j7 = 1 << (((int) j3) - 64);
            long j8 = this.write;
            if ((j8 & j7) == 0) {
                return new toChars(j8 | j7, this.AudioAttributesCompatParcelizer, this.read, this.RemoteActionCompatParcelizer);
            }
        } else if (toMagicModuleMetaRepoModel.read(j3, 128L) >= 0) {
            if (!AudioAttributesCompatParcelizer(p0)) {
                long j9 = this.write;
                long j10 = this.AudioAttributesCompatParcelizer;
                long j11 = this.read;
                long j12 = ((p0 + 1) / 64) << 6;
                if (toMagicModuleMetaRepoModel.read(j12, 0L) < 0) {
                    j12 = 9223372036854775680L;
                }
                rop ropVar = null;
                long j13 = j9;
                while (true) {
                    if (toMagicModuleMetaRepoModel.read(j11, j12) >= 0) {
                        j = j11;
                        j2 = j10;
                        break;
                    }
                    if (j10 != 0) {
                        rop ropVar2 = ropVar == null ? new rop(this.RemoteActionCompatParcelizer) : ropVar;
                        int i = 0;
                        while (i < 64) {
                            if ((j10 & (j4 << i)) != 0) {
                                ropVar2.AudioAttributesCompatParcelizer(((long) i) + j11);
                            }
                            i++;
                            j4 = 1;
                        }
                        ropVar = ropVar2;
                    }
                    if (j13 == 0) {
                        j2 = 0;
                        j = j12;
                        break;
                    }
                    j11 += 64;
                    j10 = j13;
                    j4 = 1;
                    j13 = 0;
                }
                return new toChars(j13, j2, j, (ropVar == null || (jArrRemoteActionCompatParcelizer = ropVar.RemoteActionCompatParcelizer()) == null) ? this.RemoteActionCompatParcelizer : jArrRemoteActionCompatParcelizer).write(p0);
            }
        } else {
            long[] jArr = this.RemoteActionCompatParcelizer;
            if (jArr == null) {
                return new toChars(this.write, this.AudioAttributesCompatParcelizer, this.read, new long[]{p0});
            }
            int iWrite = toDecimal.write(jArr, p0);
            if (iWrite < 0) {
                return new toChars(this.write, this.AudioAttributesCompatParcelizer, this.read, toDecimal.IconCompatParcelizer(jArr, -(iWrite + 1), p0));
            }
        }
        return this;
    }

    public final toChars read(long p0) {
        long[] jArr;
        int iWrite;
        long j = p0 - this.read;
        if (toMagicModuleMetaRepoModel.read(j, 0L) >= 0 && toMagicModuleMetaRepoModel.read(j, 64L) < 0) {
            long j2 = 1 << ((int) j);
            long j3 = this.AudioAttributesCompatParcelizer;
            return (j3 & j2) != 0 ? new toChars(this.write, j3 & (~j2), this.read, this.RemoteActionCompatParcelizer) : this;
        }
        if (toMagicModuleMetaRepoModel.read(j, 64L) < 0 || toMagicModuleMetaRepoModel.read(j, 128L) >= 0) {
            return (toMagicModuleMetaRepoModel.read(j, 0L) >= 0 || (jArr = this.RemoteActionCompatParcelizer) == null || (iWrite = toDecimal.write(jArr, p0)) < 0) ? this : new toChars(this.write, this.AudioAttributesCompatParcelizer, this.read, toDecimal.AudioAttributesCompatParcelizer(jArr, iWrite));
        }
        long j4 = 1 << (((int) j) - 64);
        long j5 = this.write;
        return (j5 & j4) != 0 ? new toChars(j5 & (~j4), this.AudioAttributesCompatParcelizer, this.read, this.RemoteActionCompatParcelizer) : this;
    }

    public final toChars RemoteActionCompatParcelizer(toChars p0) {
        toChars tochars = read;
        if (p0 == tochars) {
            return this;
        }
        if (this == tochars) {
            return tochars;
        }
        long j = p0.read;
        long j2 = this.read;
        if (j == j2) {
            long[] jArr = p0.RemoteActionCompatParcelizer;
            long[] jArr2 = this.RemoteActionCompatParcelizer;
            if (jArr == jArr2) {
                return new toChars(this.write & (~p0.write), this.AudioAttributesCompatParcelizer & (~p0.AudioAttributesCompatParcelizer), j2, jArr2);
            }
        }
        long[] jArr3 = p0.RemoteActionCompatParcelizer;
        if (jArr3 != null) {
            for (long j3 : jArr3) {
                this = this.read(j3);
            }
        }
        if (p0.AudioAttributesCompatParcelizer != 0) {
            for (int i = 0; i < 64; i++) {
                if ((p0.AudioAttributesCompatParcelizer & (1 << i)) != 0) {
                    this = this.read(p0.read + ((long) i));
                }
            }
        }
        if (p0.write != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((p0.write & (1 << i2)) != 0) {
                    this = this.read(p0.read + ((long) i2) + 64);
                }
            }
        }
        return this;
    }

    public final toChars AudioAttributesImplBaseParcelizer(toChars p0) {
        toChars tochars = read;
        if (p0 == tochars) {
            return this;
        }
        if (this == tochars) {
            return p0;
        }
        long j = p0.read;
        long j2 = this.read;
        if (j == j2) {
            long[] jArr = p0.RemoteActionCompatParcelizer;
            long[] jArr2 = this.RemoteActionCompatParcelizer;
            if (jArr == jArr2) {
                return new toChars(this.write | p0.write, this.AudioAttributesCompatParcelizer | p0.AudioAttributesCompatParcelizer, j2, jArr2);
            }
        }
        int i = 0;
        if (this.RemoteActionCompatParcelizer == null) {
            long[] jArr3 = this.RemoteActionCompatParcelizer;
            if (jArr3 != null) {
                for (long j3 : jArr3) {
                    p0 = p0.write(j3);
                }
            }
            if (this.AudioAttributesCompatParcelizer != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((this.AudioAttributesCompatParcelizer & (1 << i2)) != 0) {
                        p0 = p0.write(this.read + ((long) i2));
                    }
                }
            }
            if (this.write != 0) {
                while (i < 64) {
                    if ((this.write & (1 << i)) != 0) {
                        p0 = p0.write(this.read + ((long) i) + 64);
                    }
                    i++;
                }
            }
            return p0;
        }
        long[] jArr4 = p0.RemoteActionCompatParcelizer;
        if (jArr4 != null) {
            for (long j4 : jArr4) {
                this = this.write(j4);
            }
        }
        if (p0.AudioAttributesCompatParcelizer != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((p0.AudioAttributesCompatParcelizer & (1 << i3)) != 0) {
                    this = this.write(p0.read + ((long) i3));
                }
            }
        }
        if (p0.write != 0) {
            while (i < 64) {
                if ((p0.write & (1 << i)) != 0) {
                    this = this.write(p0.read + ((long) i) + 64);
                }
                i++;
            }
        }
        return this;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<setStateResult<? super Long>, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        private /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int write;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        
            if (r15.IconCompatParcelizer(r9, r18) != r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
        
            if (r13.IconCompatParcelizer(kotlin.QBankStatsResponse.RemoteActionCompatParcelizer(r18.read.read + ((long) r2)), r18) != r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:18:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:28:0x00b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00af -> B:28:0x00b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d1 -> B:41:0x00f6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f4 -> B:40:0x00f5). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.toChars.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = toChars.this.new read(sampleVideos);
            readVar.AudioAttributesImplBaseParcelizer = obj;
            return readVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setStateResult<? super Long> setstateresult, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(setstateresult, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return StateResult.IconCompatParcelizer((MagicModuleSubmissionRequestBody) new read(null)).write();
    }

    public final long RemoteActionCompatParcelizer(long p0) {
        long[] jArr = this.RemoteActionCompatParcelizer;
        if (jArr == null) {
            long j = this.AudioAttributesCompatParcelizer;
            if (j != 0) {
                return this.read + ((long) Long.numberOfTrailingZeros(j));
            }
            long j2 = this.write;
            return j2 != 0 ? this.read + 64 + ((long) Long.numberOfTrailingZeros(j2)) : p0;
        }
        return jArr[0];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        toChars tochars = this;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(tochars, 10));
        Iterator<Long> it = tochars.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb.append(JavaFloatBitsFromCharArray.write(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.toChars$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Lo/toChars$IconCompatParcelizer;", "", "<init>", "()V", "Lo/toChars;", "read", "Lo/toChars;", "()Lo/toChars;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final toChars read() {
            return toChars.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
