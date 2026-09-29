package kotlin;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/_writeGenericEscape;", "", "<init>", "()V", "", "p0", "", "p1", "", "read", "(ILjava/lang/String;)Lo/getShowPopup;", "", "Lo/_writeBytes;", "IconCompatParcelizer", "Ljava/util/Map;", "AudioAttributesCompatParcelizer", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _writeGenericEscape {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<Integer, _writeBytes> AudioAttributesCompatParcelizer = new LinkedHashMap();

    public final Map<Integer, _writeBytes> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final getShowPopup read(int p0, String p1) {
        getAnswerMap<String, getShowPopup> getanswermapWrite;
        _writeBytes _writebytes = this.AudioAttributesCompatParcelizer.get(Integer.valueOf(p0));
        if (_writebytes == null || (getanswermapWrite = _writebytes.write()) == null) {
            return null;
        }
        getanswermapWrite.invoke(p1);
        return getShowPopup.INSTANCE;
    }
}
