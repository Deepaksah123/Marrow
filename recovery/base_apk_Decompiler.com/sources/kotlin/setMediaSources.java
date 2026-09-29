package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/setMediaSources;", "", "<init>", "()V", "p0", "Lo/getExecutor;", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Lo/getExecutor;", "Lo/setKeyListener;", "read", "Lo/setKeyListener;", "write", "Ljava/lang/Object;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/getExecutor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setMediaSources {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getExecutor write;
    private final setKeyListener<Object, getExecutor> read = setAutoSizeTextTypeUniformWithPresetSizes.read();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Object IconCompatParcelizer;

    public final getExecutor AudioAttributesCompatParcelizer(Object p0) {
        getExecutor getexecutor = this.write;
        if (this.IconCompatParcelizer == p0 && getexecutor != null) {
            return getexecutor;
        }
        setKeyListener<Object, getExecutor> setkeylistener = this.read;
        getExecutor getexecutorAudioAttributesImplApi26Parcelizer = setkeylistener.AudioAttributesImplApi26Parcelizer(p0);
        if (getexecutorAudioAttributesImplApi26Parcelizer == null) {
            getexecutorAudioAttributesImplApi26Parcelizer = new getExecutor();
            setkeylistener.RemoteActionCompatParcelizer(p0, getexecutorAudioAttributesImplApi26Parcelizer);
        }
        getExecutor getexecutor2 = getexecutorAudioAttributesImplApi26Parcelizer;
        this.IconCompatParcelizer = p0;
        this.write = getexecutor2;
        return getexecutor2;
    }
}
