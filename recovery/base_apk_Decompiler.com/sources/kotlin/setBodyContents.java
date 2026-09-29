package kotlin;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class setBodyContents {
    private static final Map<getNotesCount, NestfputmTitle> AudioAttributesCompatParcelizer;
    private static final Set<getNotesCount> read;
    private static final Map<getNotesCount, NestfputmTitle> write;
    private static final getNotesCount MediaBrowserCompatCustomActionResultReceiver = new getNotesCount("javax.annotation.meta.TypeQualifierNickname");
    private static final getNotesCount AudioAttributesImplBaseParcelizer = new getNotesCount("javax.annotation.meta.TypeQualifier");
    private static final getNotesCount IconCompatParcelizer = new getNotesCount("javax.annotation.meta.TypeQualifierDefault");
    private static final getNotesCount RemoteActionCompatParcelizer = new getNotesCount("kotlin.annotations.jvm.UnderMigration");

    static {
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new setSectionName[]{setSectionName.FIELD, setSectionName.METHOD_RETURN_TYPE, setSectionName.VALUE_PARAMETER, setSectionName.TYPE_PARAMETER_BOUNDS, setSectionName.TYPE_USE});
        Map<getNotesCount, NestfputmTitle> mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(CustomModule.RatingCompat(), new NestfputmTitle(new setDurationText(VideoSubModel.NOT_NULL), listRemoteActionCompatParcelizer, false)), setAction.write(CustomModule.AudioAttributesImplApi26Parcelizer(), new NestfputmTitle(new setDurationText(VideoSubModel.NOT_NULL), listRemoteActionCompatParcelizer, false)));
        write = mapRemoteActionCompatParcelizer;
        AudioAttributesCompatParcelizer = VideoTimelineResponseBody.read(VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(new getNotesCount("javax.annotation.ParametersAreNullableByDefault"), new NestfputmTitle(new setDurationText(VideoSubModel.NULLABLE), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setSectionName.VALUE_PARAMETER))), setAction.write(new getNotesCount("javax.annotation.ParametersAreNonnullByDefault"), new NestfputmTitle(new setDurationText(VideoSubModel.NOT_NULL), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setSectionName.VALUE_PARAMETER)))), mapRemoteActionCompatParcelizer);
        read = getKycMessage.IconCompatParcelizer(CustomModule.MediaBrowserCompatItemReceiver(), CustomModule.AudioAttributesCompatParcelizer());
    }

    public static final getNotesCount AudioAttributesImplBaseParcelizer() {
        return MediaBrowserCompatCustomActionResultReceiver;
    }

    public static final getNotesCount AudioAttributesImplApi26Parcelizer() {
        return AudioAttributesImplBaseParcelizer;
    }

    public static final getNotesCount AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static final getNotesCount write() {
        return RemoteActionCompatParcelizer;
    }

    public static final Map<getNotesCount, NestfputmTitle> RemoteActionCompatParcelizer() {
        return write;
    }

    public static final Map<getNotesCount, NestfputmTitle> read() {
        return AudioAttributesCompatParcelizer;
    }

    public static final Set<getNotesCount> IconCompatParcelizer() {
        return read;
    }
}
