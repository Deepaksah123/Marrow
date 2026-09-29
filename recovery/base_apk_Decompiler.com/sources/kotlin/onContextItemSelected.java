package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R+\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028A@AX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\r\u0010\u001d"}, d2 = {"Lo/onContextItemSelected;", "Lo/onCreateView;", "Lo/restoreViewState;", "p0", "", "p1", "<init>", "(Lo/restoreViewState;Ljava/lang/String;)V", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;)I", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;)I", "write", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "IconCompatParcelizer", "Lo/InputAccessor;", "()Lo/restoreViewState;", "(Lo/restoreViewState;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onContextItemSelected implements onCreateView {
    private final InputAccessor IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String write;

    public onContextItemSelected(restoreViewState restoreviewstate, String str) {
        this.write = str;
        this.IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(restoreviewstate, null, 2, null);
    }

    public final void AudioAttributesCompatParcelizer(restoreViewState restoreviewstate) {
        this.IconCompatParcelizer.write(restoreviewstate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final restoreViewState IconCompatParcelizer() {
        return (restoreViewState) this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return IconCompatParcelizer().getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.onCreateView
    public final int AudioAttributesCompatParcelizer(bufferMapProperty p0) {
        return IconCompatParcelizer().getRead();
    }

    @Override // kotlin.onCreateView
    public final int write(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return IconCompatParcelizer().getRemoteActionCompatParcelizer();
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0) {
        return IconCompatParcelizer().getIconCompatParcelizer();
    }

    public final boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (p0 instanceof onContextItemSelected) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(IconCompatParcelizer(), ((onContextItemSelected) p0).IconCompatParcelizer());
        }
        return false;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append("(left=");
        sb.append(IconCompatParcelizer().getAudioAttributesCompatParcelizer());
        sb.append(", top=");
        sb.append(IconCompatParcelizer().getRead());
        sb.append(", right=");
        sb.append(IconCompatParcelizer().getRemoteActionCompatParcelizer());
        sb.append(", bottom=");
        sb.append(IconCompatParcelizer().getIconCompatParcelizer());
        sb.append(')');
        return sb.toString();
    }
}
