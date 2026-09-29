package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010"}, d2 = {"Lo/secondaryCount;", "", "<init>", "()V", "Lo/_checkNeedForRehash;", "p0", "", "RemoteActionCompatParcelizer", "(I)Z", "Lkotlin/Function1;", "Lo/_handleSpillOverflow;", "IconCompatParcelizer", "(Lo/getAnswerMap;)Z", "Lo/UTF32Reader;", "Lo/totalCount;", "Lo/UTF32Reader;", "()Lo/UTF32Reader;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class secondaryCount {
    private final UTF32Reader<totalCount> RemoteActionCompatParcelizer = new UTF32Reader<>(new totalCount[16], 0);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final secondaryCount IconCompatParcelizer = new secondaryCount();
    private static final secondaryCount AudioAttributesCompatParcelizer = new secondaryCount();
    private static final secondaryCount read = new secondaryCount();

    public final UTF32Reader<totalCount> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static /* synthetic */ boolean RemoteActionCompatParcelizer$default(secondaryCount secondarycount, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = _checkNeedForRehash.INSTANCE.RemoteActionCompatParcelizer();
        }
        return secondarycount.RemoteActionCompatParcelizer(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x006e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean RemoteActionCompatParcelizer(int r15) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.secondaryCount.RemoteActionCompatParcelizer(int):boolean");
    }

    /* JADX INFO: renamed from: o.secondaryCount$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_handleSpillOverflow;", "p0", "", "read", "(Lo/_handleSpillOverflow;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<_handleSpillOverflow, Boolean> {
        final /* synthetic */ int $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(_handleSpillOverflow _handlespilloverflow) {
            return Boolean.valueOf(_handlespilloverflow.IconCompatParcelizer(this.$RemoteActionCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(int i) {
            super(1);
            this.$RemoteActionCompatParcelizer = i;
        }
    }

    /* JADX INFO: renamed from: o.secondaryCount$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lo/secondaryCount$write;", "", "<init>", "()V", "Lo/secondaryCount;", "IconCompatParcelizer", "Lo/secondaryCount;", "AudioAttributesCompatParcelizer", "()Lo/secondaryCount;", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final secondaryCount AudioAttributesCompatParcelizer() {
            return secondaryCount.IconCompatParcelizer;
        }

        public final secondaryCount IconCompatParcelizer() {
            return secondaryCount.AudioAttributesCompatParcelizer;
        }

        public final secondaryCount write() {
            return secondaryCount.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x006a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean IconCompatParcelizer(kotlin.getAnswerMap<? super kotlin._handleSpillOverflow, java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.secondaryCount.IconCompatParcelizer(o.getAnswerMap):boolean");
    }
}
