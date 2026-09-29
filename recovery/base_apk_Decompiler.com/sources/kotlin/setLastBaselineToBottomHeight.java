package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\r\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u000e\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000b"}, d2 = {"Lo/setLastBaselineToBottomHeight;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "<init>", "()V", "Lo/getValueHandler;", "Lo/hasHandlers;", "p0", "", "p1", "read", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setLastBaselineToBottomHeight extends _handleOddName.IconCompatParcelizer implements _initForReading {
    public static final int RemoteActionCompatParcelizer = _handleOddName.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver;

    @Override // kotlin._initForReading
    public int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return hashandlers.AudioAttributesCompatParcelizer(i);
    }

    @Override // kotlin._initForReading
    public int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return hashandlers.read(i);
    }

    @Override // kotlin._initForReading
    public int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return hashandlers.write(i);
    }

    @Override // kotlin._initForReading
    public int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return hashandlers.IconCompatParcelizer(i);
    }
}
