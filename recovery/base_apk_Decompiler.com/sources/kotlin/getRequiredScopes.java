package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Locale;
import kotlin.JsonSerializableSchema;

/* JADX INFO: loaded from: classes3.dex */
public final class getRequiredScopes {
    public static final JsonSerializableSchema read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        JsonSerializableSchema.IconCompatParcelizer IconCompatParcelizer = new JsonSerializableSchema.IconCompatParcelizer().IconCompatParcelizer(str);
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str);
        if (strAudioAttributesCompatParcelizer != null) {
            IconCompatParcelizer.read(strAudioAttributesCompatParcelizer);
        }
        JsonSerializableSchema jsonSerializableSchemaIconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jsonSerializableSchemaIconCompatParcelizer, "");
        return jsonSerializableSchemaIconCompatParcelizer;
    }

    private static final String AudioAttributesCompatParcelizer(String str) {
        String strIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer(str, '?', str);
        String strIconCompatParcelizer2 = TestGroupLSModel.IconCompatParcelizer(strIconCompatParcelizer, '#', strIconCompatParcelizer);
        if (TestGroupLSModel.write(strIconCompatParcelizer2, ".mpd", true)) {
            return MimeTypes.APPLICATION_MPD;
        }
        if (TestGroupLSModel.write(strIconCompatParcelizer2, ".m3u8", true)) {
            return MimeTypes.APPLICATION_M3U8;
        }
        if (TestGroupLSModel.write(strIconCompatParcelizer2, ".mp4", true)) {
            return MimeTypes.VIDEO_MP4;
        }
        return null;
    }

    public static final String write(long j) {
        long jWrite = getQues.write(j / 1000, 0L);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jWrite / 60), Long.valueOf(jWrite % 60)}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }
}
