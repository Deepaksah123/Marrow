package kotlin;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class RecentUpdatesResponse {
    private static final Map<isHdPlaybackError<?>, String> write;

    public static final String AudioAttributesCompatParcelizer(isHdPlaybackError<?> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        String str = write.get(ishdplaybackerror);
        return str == null ? IconCompatParcelizer(ishdplaybackerror) : str;
    }

    private static String IconCompatParcelizer(isHdPlaybackError<?> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        SchemaDetailLessonV2 schemaDetailLessonV2 = SchemaDetailLessonV2.read;
        String strRemoteActionCompatParcelizer = SchemaDetailLessonV2.RemoteActionCompatParcelizer(ishdplaybackerror);
        write.put(ishdplaybackerror, strRemoteActionCompatParcelizer);
        return strRemoteActionCompatParcelizer;
    }

    static {
        SchemaDetailLessonV2 schemaDetailLessonV2 = SchemaDetailLessonV2.read;
        write = SchemaDetailLessonV2.write();
    }
}
