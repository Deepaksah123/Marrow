package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.marrow2.ui.qbank.lesson_list.model.SealedLessonDetailsModel;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtocolVersionUnsupportedProtocolException {
    public static final registerEvent RemoteActionCompatParcelizer(SealedLessonDetailsModel.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        int remoteActionCompatParcelizer = audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        sb.append(remoteActionCompatParcelizer);
        sb.append(" module");
        String string = sb.toString();
        if (audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer() > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(CmcdHeadersFactory.STREAMING_FORMAT_SS);
            string = sb2.toString();
        }
        return new registerEvent(audioAttributesCompatParcelizer.getWrite(), audioAttributesCompatParcelizer.getRead(), string);
    }
}
