package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdastatic0 {
    private static final String write;

    static {
        String strWrite = n.write("DiagnosticsWrkr");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        write = strWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String write(CRoleFlags cRoleFlags, shouldStartPlayback shouldstartplayback, CColorRange cColorRange, List<CVideoChangeFrameRateStrategy> list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy : list) {
            CBufferFlags cBufferFlagsWrite = cColorRange.write(onReleased.read(cVideoChangeFrameRateStrategy));
            sb.append(write(cVideoChangeFrameRateStrategy, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(cRoleFlags.AudioAttributesCompatParcelizer(cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer), ",", null, null, 0, null, null, 62), cBufferFlagsWrite != null ? Integer.valueOf(cBufferFlagsWrite.read) : null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(shouldstartplayback.IconCompatParcelizer(cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer), ",", null, null, 0, null, null, 62)));
        }
        return sb.toString();
    }

    private static final String write(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, String str, Integer num, String str2) {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer);
        sb.append("\t ");
        sb.append(cVideoChangeFrameRateStrategy.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        sb.append("\t ");
        sb.append(num);
        sb.append("\t ");
        sb.append(cVideoChangeFrameRateStrategy.onCommand.name());
        sb.append("\t ");
        sb.append(str);
        sb.append("\t ");
        sb.append(str2);
        sb.append('\t');
        return sb.toString();
    }
}
