package kotlin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001dBm\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR(\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001f"}, d2 = {"Lo/getPausedModuleDate;", "Lo/getTopRankers;", "Ljava/io/File;", "p0", "Lo/isFirstModule;", "p1", "Lkotlin/Function1;", "", "p2", "", "p3", "Lkotlin/Function2;", "Ljava/io/IOException;", "p4", "", "p5", "<init>", "(Ljava/io/File;Lo/isFirstModule;Lo/getAnswerMap;Lo/getAnswerMap;Lo/MagicModuleSubmissionRequestBody;I)V", "(Ljava/io/File;Lo/isFirstModule;)V", "", "write", "()Ljava/util/Iterator;", "AudioAttributesImplApi21Parcelizer", "Ljava/io/File;", "AudioAttributesCompatParcelizer", "Lo/isFirstModule;", "read", "IconCompatParcelizer", "Lo/getAnswerMap;", "RemoteActionCompatParcelizer", "Lo/MagicModuleSubmissionRequestBody;", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getPausedModuleDate implements getTopRankers<File> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isFirstModule read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final File AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<File, Boolean> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<File, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<File, IOException, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private getPausedModuleDate(File file, isFirstModule isfirstmodule, getAnswerMap<? super File, Boolean> getanswermap, getAnswerMap<? super File, getShowPopup> getanswermap2, MagicModuleSubmissionRequestBody<? super File, ? super IOException, getShowPopup> magicModuleSubmissionRequestBody, int i) {
        this.AudioAttributesCompatParcelizer = file;
        this.read = isfirstmodule;
        this.write = getanswermap;
        this.IconCompatParcelizer = getanswermap2;
        this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    /* synthetic */ getPausedModuleDate(File file, isFirstModule isfirstmodule, getAnswerMap getanswermap, getAnswerMap getanswermap2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(file, (i2 & 2) != 0 ? isFirstModule.IconCompatParcelizer : isfirstmodule, getanswermap, getanswermap2, magicModuleSubmissionRequestBody, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getPausedModuleDate(File file, isFirstModule isfirstmodule) {
        this(file, isfirstmodule, null, null, null, 0, 32, null);
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(isfirstmodule, "");
    }

    @Override // kotlin.getTopRankers
    public final Iterator<File> write() {
        return new RemoteActionCompatParcelizer();
    }

    static abstract class read {
        private final File read;

        public abstract File RemoteActionCompatParcelizer();

        public read(File file) {
            toMagicModuleMetaRepoModel.write(file, "");
            this.read = file;
        }

        public final File IconCompatParcelizer() {
            return this.read;
        }
    }

    static abstract class IconCompatParcelizer extends read {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(File file) {
            super(file);
            toMagicModuleMetaRepoModel.write(file, "");
        }
    }

    final class RemoteActionCompatParcelizer extends UpgradePlanResponseCompanion<File> {
        private final ArrayDeque<read> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.getPausedModuleDate$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        public static final /* synthetic */ class C0100RemoteActionCompatParcelizer {
            public static final /* synthetic */ int[] IconCompatParcelizer;

            static {
                int[] iArr = new int[isFirstModule.values().length];
                try {
                    iArr[isFirstModule.IconCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[isFirstModule.AudioAttributesCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                IconCompatParcelizer = iArr;
            }
        }

        public RemoteActionCompatParcelizer() {
            ArrayDeque<read> arrayDeque = new ArrayDeque<>();
            this.RemoteActionCompatParcelizer = arrayDeque;
            if (getPausedModuleDate.this.AudioAttributesCompatParcelizer.isDirectory()) {
                arrayDeque.push(read(getPausedModuleDate.this.AudioAttributesCompatParcelizer));
            } else if (getPausedModuleDate.this.AudioAttributesCompatParcelizer.isFile()) {
                arrayDeque.push(new AudioAttributesCompatParcelizer(this, getPausedModuleDate.this.AudioAttributesCompatParcelizer));
            } else {
                read();
            }
        }

        @Override // kotlin.UpgradePlanResponseCompanion
        public final void write() {
            File fileRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (fileRemoteActionCompatParcelizer != null) {
                RemoteActionCompatParcelizer(fileRemoteActionCompatParcelizer);
            } else {
                read();
            }
        }

        private final IconCompatParcelizer read(File file) {
            int i = C0100RemoteActionCompatParcelizer.IconCompatParcelizer[getPausedModuleDate.this.read.ordinal()];
            if (i == 1) {
                return new IconCompatParcelizer(this, file);
            }
            if (i != 2) {
                throw new RenewEligibleCreator();
            }
            return new write(this, file);
        }

        private final File RemoteActionCompatParcelizer() {
            File fileRemoteActionCompatParcelizer;
            while (true) {
                read readVarPeek = this.RemoteActionCompatParcelizer.peek();
                if (readVarPeek == null) {
                    return null;
                }
                fileRemoteActionCompatParcelizer = readVarPeek.RemoteActionCompatParcelizer();
                if (fileRemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer.pop();
                } else {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(fileRemoteActionCompatParcelizer, readVarPeek.IconCompatParcelizer()) || !fileRemoteActionCompatParcelizer.isDirectory() || this.RemoteActionCompatParcelizer.size() >= getPausedModuleDate.this.AudioAttributesImplApi21Parcelizer) {
                        break;
                    }
                    this.RemoteActionCompatParcelizer.push(read(fileRemoteActionCompatParcelizer));
                }
            }
            return fileRemoteActionCompatParcelizer;
        }

        final class write extends IconCompatParcelizer {
            private boolean AudioAttributesCompatParcelizer;
            private boolean IconCompatParcelizer;
            private File[] RemoteActionCompatParcelizer;
            private int read;
            private /* synthetic */ RemoteActionCompatParcelizer write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public write(RemoteActionCompatParcelizer remoteActionCompatParcelizer, File file) {
                super(file);
                toMagicModuleMetaRepoModel.write(file, "");
                this.write = remoteActionCompatParcelizer;
            }

            @Override // o.getPausedModuleDate.read
            public final File RemoteActionCompatParcelizer() {
                if (!this.IconCompatParcelizer && this.RemoteActionCompatParcelizer == null) {
                    getAnswerMap getanswermap = getPausedModuleDate.this.write;
                    if (getanswermap != null && !((Boolean) getanswermap.invoke(IconCompatParcelizer())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = IconCompatParcelizer().listFiles();
                    this.RemoteActionCompatParcelizer = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = getPausedModuleDate.this.RemoteActionCompatParcelizer;
                        if (magicModuleSubmissionRequestBody != null) {
                            magicModuleSubmissionRequestBody.invoke(IconCompatParcelizer(), new MagicModuleLocalImpl_Factory(IconCompatParcelizer(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.IconCompatParcelizer = true;
                    }
                }
                File[] fileArr = this.RemoteActionCompatParcelizer;
                if (fileArr != null) {
                    int i = this.read;
                    toMagicModuleMetaRepoModel.write(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.RemoteActionCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(fileArr2);
                        int i2 = this.read;
                        this.read = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.AudioAttributesCompatParcelizer) {
                    getAnswerMap getanswermap2 = getPausedModuleDate.this.IconCompatParcelizer;
                    if (getanswermap2 != null) {
                        getanswermap2.invoke(IconCompatParcelizer());
                    }
                    return null;
                }
                this.AudioAttributesCompatParcelizer = true;
                return IconCompatParcelizer();
            }
        }

        final class IconCompatParcelizer extends IconCompatParcelizer {
            private boolean AudioAttributesCompatParcelizer;
            private /* synthetic */ RemoteActionCompatParcelizer IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;
            private File[] write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, File file) {
                super(file);
                toMagicModuleMetaRepoModel.write(file, "");
                this.IconCompatParcelizer = remoteActionCompatParcelizer;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
            
                if (r0.length == 0) goto L30;
             */
            @Override // o.getPausedModuleDate.read
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.io.File RemoteActionCompatParcelizer() {
                /*
                    r10 = this;
                    boolean r0 = r10.AudioAttributesCompatParcelizer
                    r1 = 0
                    if (r0 != 0) goto L28
                    o.getPausedModuleDate$RemoteActionCompatParcelizer r0 = r10.IconCompatParcelizer
                    o.getPausedModuleDate r0 = kotlin.getPausedModuleDate.this
                    o.getAnswerMap r0 = kotlin.getPausedModuleDate.AudioAttributesCompatParcelizer(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.IconCompatParcelizer()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.AudioAttributesCompatParcelizer = r0
                    java.io.File r10 = r10.IconCompatParcelizer()
                    return r10
                L28:
                    java.io.File[] r0 = r10.write
                    if (r0 == 0) goto L46
                    int r2 = r10.RemoteActionCompatParcelizer
                    kotlin.toMagicModuleMetaRepoModel.write(r0)
                    int r0 = r0.length
                    if (r2 < r0) goto L46
                    o.getPausedModuleDate$RemoteActionCompatParcelizer r0 = r10.IconCompatParcelizer
                    o.getPausedModuleDate r0 = kotlin.getPausedModuleDate.this
                    o.getAnswerMap r0 = kotlin.getPausedModuleDate.IconCompatParcelizer(r0)
                    if (r0 == 0) goto L45
                    java.io.File r10 = r10.IconCompatParcelizer()
                    r0.invoke(r10)
                L45:
                    return r1
                L46:
                    java.io.File[] r0 = r10.write
                    if (r0 != 0) goto L92
                    java.io.File r0 = r10.IconCompatParcelizer()
                    java.io.File[] r0 = r0.listFiles()
                    r10.write = r0
                    if (r0 != 0) goto L76
                    o.getPausedModuleDate$RemoteActionCompatParcelizer r0 = r10.IconCompatParcelizer
                    o.getPausedModuleDate r0 = kotlin.getPausedModuleDate.this
                    o.MagicModuleSubmissionRequestBody r0 = kotlin.getPausedModuleDate.RemoteActionCompatParcelizer(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r10.IconCompatParcelizer()
                    o.MagicModuleLocalImpl_Factory r9 = new o.MagicModuleLocalImpl_Factory
                    java.io.File r4 = r10.IconCompatParcelizer()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L76:
                    java.io.File[] r0 = r10.write
                    if (r0 == 0) goto L80
                    kotlin.toMagicModuleMetaRepoModel.write(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    o.getPausedModuleDate$RemoteActionCompatParcelizer r0 = r10.IconCompatParcelizer
                    o.getPausedModuleDate r0 = kotlin.getPausedModuleDate.this
                    o.getAnswerMap r0 = kotlin.getPausedModuleDate.IconCompatParcelizer(r0)
                    if (r0 == 0) goto L91
                    java.io.File r10 = r10.IconCompatParcelizer()
                    r0.invoke(r10)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r10.write
                    kotlin.toMagicModuleMetaRepoModel.write(r0)
                    int r1 = r10.RemoteActionCompatParcelizer
                    int r2 = r1 + 1
                    r10.RemoteActionCompatParcelizer = r2
                    r10 = r0[r1]
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getPausedModuleDate.RemoteActionCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer():java.io.File");
            }
        }

        final class AudioAttributesCompatParcelizer extends read {
            private boolean read;
            private /* synthetic */ RemoteActionCompatParcelizer write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, File file) {
                super(file);
                toMagicModuleMetaRepoModel.write(file, "");
                this.write = remoteActionCompatParcelizer;
            }

            @Override // o.getPausedModuleDate.read
            public final File RemoteActionCompatParcelizer() {
                if (this.read) {
                    return null;
                }
                this.read = true;
                return IconCompatParcelizer();
            }
        }
    }
}
