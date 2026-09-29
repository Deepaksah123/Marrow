package kotlin;

import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001as\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"", "", "RemoteActionCompatParcelizer", "(F)I", "Lo/WebViewSubtitleOutput;", "p0", "Lo/AbstractDeserializer;", "p1", "Lo/deserializeWithObjectId;", "p2", "Lo/bufferMapProperty;", "p3", "Lo/_reportMissingSetter$write;", "p4", "", "p5", "Lo/paramName;", "p6", "p7", "p8", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p9", "read", "(Lo/WebViewSubtitleOutput;Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Lo/bufferMapProperty;Lo/_reportMissingSetter$write;ZIIILjava/util/List;)Lo/WebViewSubtitleOutput;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MediaRouteExpandCollapseButton {
    public static final int RemoteActionCompatParcelizer(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final WebViewSubtitleOutput read(WebViewSubtitleOutput webViewSubtitleOutput, AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, boolean z, int i, int i2, int i3, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(webViewSubtitleOutput.getIconCompatParcelizer(), abstractDeserializer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(webViewSubtitleOutput.getRead(), deserializewithobjectid) && webViewSubtitleOutput.getAudioAttributesCompatParcelizer() == z) {
            if (paramName.write(webViewSubtitleOutput.getAudioAttributesImplBaseParcelizer(), i)) {
                if (webViewSubtitleOutput.getRemoteActionCompatParcelizer() == i2) {
                    if (webViewSubtitleOutput.getWrite() == i3 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(webViewSubtitleOutput.getAudioAttributesImplApi26Parcelizer(), buffermapproperty)) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(webViewSubtitleOutput.MediaBrowserCompatCustomActionResultReceiver(), list) && webViewSubtitleOutput.getMediaBrowserCompatItemReceiver() == writeVar) {
                            return webViewSubtitleOutput;
                        }
                        return new WebViewSubtitleOutput(abstractDeserializer, deserializewithobjectid, i2, i3, z, i, buffermapproperty, writeVar, list, null);
                    }
                    return new WebViewSubtitleOutput(abstractDeserializer, deserializewithobjectid, i2, i3, z, i, buffermapproperty, writeVar, list, null);
                }
                return new WebViewSubtitleOutput(abstractDeserializer, deserializewithobjectid, i2, i3, z, i, buffermapproperty, writeVar, list, null);
            }
            return new WebViewSubtitleOutput(abstractDeserializer, deserializewithobjectid, i2, i3, z, i, buffermapproperty, writeVar, list, null);
        }
        return new WebViewSubtitleOutput(abstractDeserializer, deserializewithobjectid, i2, i3, z, i, buffermapproperty, writeVar, list, null);
    }
}
