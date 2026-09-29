package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0007\u001a\u0004\u0018\u00010\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\t\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b\u0005\u0010\u0014"}, d2 = {"Lo/findPositionOfDuplicate;", "", "<init>", "()V", "Lo/unshare;", "read", "Lo/unshare;", "RemoteActionCompatParcelizer", "()Lo/unshare;", "AudioAttributesCompatParcelizer", "(Lo/unshare;)V", "IconCompatParcelizer", "Lo/JsonParserDelegate;", "Lo/JsonParserDelegate;", "()Lo/JsonParserDelegate;", "(Lo/JsonParserDelegate;)V", "Lo/findRenameByField;", "write", "Lo/findRenameByField;", "()Lo/findRenameByField;", "(Lo/findRenameByField;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class findPositionOfDuplicate {
    public static final findPositionOfDuplicate INSTANCE = new findPositionOfDuplicate();
    private static JsonParserDelegate RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static unshare IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static findRenameByField read;

    private findPositionOfDuplicate() {
    }

    public final void AudioAttributesCompatParcelizer(unshare unshareVar) {
        IconCompatParcelizer = unshareVar;
    }

    public final unshare RemoteActionCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(JsonParserDelegate jsonParserDelegate) {
        RemoteActionCompatParcelizer = jsonParserDelegate;
    }

    public final JsonParserDelegate read() {
        return RemoteActionCompatParcelizer;
    }

    public final findRenameByField IconCompatParcelizer() {
        return read;
    }

    public final void read(findRenameByField findrenamebyfield) {
        read = findrenamebyfield;
    }
}
