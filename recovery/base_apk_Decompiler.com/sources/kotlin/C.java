package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/C;", "Lo/fromBundle;", "Lo/ValueClassSerializerStaticJsonValue;", "p0", "<init>", "(Lo/ValueClassSerializerStaticJsonValue;)V", "Lo/getList;", "", "write", "(Lo/getList;)V", "", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Z", "", "IconCompatParcelizer", "(Ljava/lang/String;)Ljava/util/List;", "Lo/ValueClassSerializerStaticJsonValue;", "AudioAttributesCompatParcelizer", "Lo/serializeE0BElUM;", "read", "Lo/serializeE0BElUM;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C implements fromBundle {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final ValueClassSerializerStaticJsonValue AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final serializeE0BElUM<getList> write;

    public C(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue) {
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        this.AudioAttributesCompatParcelizer = valueClassSerializerStaticJsonValue;
        this.write = new serializeE0BElUM<getList>() { // from class: o.C.4
            @Override // kotlin.serializeE0BElUM
            public final /* bridge */ /* synthetic */ void IconCompatParcelizer(setDrawEntryLabels setdrawentrylabels, getList getlist) {
                IconCompatParcelizer2(setdrawentrylabels, getlist);
            }

            @Override // kotlin.serializeE0BElUM
            public final String read() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
            private static void IconCompatParcelizer2(setDrawEntryLabels setdrawentrylabels, getList getlist) {
                toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
                toMagicModuleMetaRepoModel.write(getlist, "");
                setdrawentrylabels.RemoteActionCompatParcelizer(1, getlist.read());
                setdrawentrylabels.RemoteActionCompatParcelizer(2, getlist.IconCompatParcelizer());
            }
        };
    }

    @Override // kotlin.fromBundle
    public final void write(final getList p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true, new getAnswerMap() { // from class: o.getFormatSupportString
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return C.read(this.AudioAttributesCompatParcelizer, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(C c, getList getlist, setDrawHoleEnabled setdrawholeenabled) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        c.write.RemoteActionCompatParcelizer(setdrawholeenabled, getlist);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.fromBundle
    public final boolean RemoteActionCompatParcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        return ((Boolean) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.CAudioContentType
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C.write(str, p0, (setDrawHoleEnabled) obj));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean write(java.lang.String r3, java.lang.String r4, kotlin.setDrawHoleEnabled r5) {
        /*
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r5, r0)
            o.setDrawEntryLabels r3 = r5.IconCompatParcelizer(r3)
            r5 = 1
            r3.RemoteActionCompatParcelizer(r5, r4)     // Catch: java.lang.Throwable -> L21
            boolean r4 = r3.write()     // Catch: java.lang.Throwable -> L21
            r0 = 0
            if (r4 == 0) goto L1c
            long r1 = r3.IconCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L21
            int r4 = (int) r1
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r5 = r0
        L1d:
            r3.close()
            return r5
        L21:
            r4 = move-exception
            r3.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C.write(java.lang.String, java.lang.String, o.setDrawHoleEnabled):boolean");
    }

    @Override // kotlin.fromBundle
    public final List<String> IconCompatParcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.generateAudioSessionIdV21
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return C.IconCompatParcelizer(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List IconCompatParcelizer(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                arrayList.add(setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(0));
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.fromBundle
    public final boolean write(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?";
        return ((Boolean) setExtraBottomOffset.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, false, new getAnswerMap() { // from class: o.getErrorCodeForMediaDrmErrorCode
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C.AudioAttributesImplBaseParcelizer(str, p0, (setDrawHoleEnabled) obj));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean AudioAttributesImplBaseParcelizer(java.lang.String r3, java.lang.String r4, kotlin.setDrawHoleEnabled r5) {
        /*
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r5, r0)
            o.setDrawEntryLabels r3 = r5.IconCompatParcelizer(r3)
            r5 = 1
            r3.RemoteActionCompatParcelizer(r5, r4)     // Catch: java.lang.Throwable -> L21
            boolean r4 = r3.write()     // Catch: java.lang.Throwable -> L21
            r0 = 0
            if (r4 == 0) goto L1c
            long r1 = r3.IconCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L21
            int r4 = (int) r1
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r5 = r0
        L1d:
            r3.close()
            return r5
        L21:
            r4 = move-exception
            r3.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C.AudioAttributesImplBaseParcelizer(java.lang.String, java.lang.String, o.setDrawHoleEnabled):boolean");
    }

    /* JADX INFO: renamed from: o.C$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/C$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "Lo/isHdPlaybackError;", "write", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static List<isHdPlaybackError<?>> write() {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
