package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108!X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0011\u0082\u0001\u0001\u0014"}, d2 = {"Lo/setDropDownVerticalOffset;", "", "<init>", "()V", "p0", "RemoteActionCompatParcelizer", "(Lo/setDropDownVerticalOffset;)Lo/setDropDownVerticalOffset;", "", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/setSelector;", "()Lo/setSelector;", "write", "IconCompatParcelizer", "Lo/setPrompt;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setDropDownVerticalOffset {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final setDropDownVerticalOffset RemoteActionCompatParcelizer = new setPrompt(new setSelector(null, null, null, null, null, false, null, 127, null));

    public abstract setSelector RemoteActionCompatParcelizer();

    private setDropDownVerticalOffset() {
    }

    public final setDropDownVerticalOffset RemoteActionCompatParcelizer(setDropDownVerticalOffset p0) {
        AppCompatSpinnerSavedState remoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = RemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
        }
        AppCompatSpinnerSavedState appCompatSpinnerSavedState = remoteActionCompatParcelizer;
        AppCompatToggleButton read = p0.RemoteActionCompatParcelizer().getRead();
        if (read == null) {
            read = RemoteActionCompatParcelizer().getRead();
        }
        AppCompatToggleButton appCompatToggleButton = read;
        AppCompatImageView iconCompatParcelizer = p0.RemoteActionCompatParcelizer().getIconCompatParcelizer();
        if (iconCompatParcelizer == null) {
            iconCompatParcelizer = RemoteActionCompatParcelizer().getIconCompatParcelizer();
        }
        AppCompatImageView appCompatImageView = iconCompatParcelizer;
        setLineHeight write = p0.RemoteActionCompatParcelizer().getWrite();
        if (write == null) {
            write = RemoteActionCompatParcelizer().getWrite();
        }
        setLineHeight setlineheight = write;
        setDecorPadding audioAttributesCompatParcelizer = p0.RemoteActionCompatParcelizer().getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer == null) {
            audioAttributesCompatParcelizer = RemoteActionCompatParcelizer().getAudioAttributesCompatParcelizer();
        }
        return new setPrompt(new setSelector(appCompatSpinnerSavedState, appCompatToggleButton, appCompatImageView, setlineheight, audioAttributesCompatParcelizer, false, VideoTimelineResponseBody.read(RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(), p0.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer()), 32, null));
    }

    public String toString() {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this, RemoteActionCompatParcelizer)) {
            return "EnterTransition.None";
        }
        setSelector setselectorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        AppCompatSpinnerSavedState remoteActionCompatParcelizer = setselectorRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
        sb.append(remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.toString() : null);
        sb.append(",\nSlide - ");
        AppCompatToggleButton read = setselectorRemoteActionCompatParcelizer.getRead();
        sb.append(read != null ? read.toString() : null);
        sb.append(",\nShrink - ");
        AppCompatImageView iconCompatParcelizer = setselectorRemoteActionCompatParcelizer.getIconCompatParcelizer();
        sb.append(iconCompatParcelizer != null ? iconCompatParcelizer.toString() : null);
        sb.append(",\nScale - ");
        setLineHeight write = setselectorRemoteActionCompatParcelizer.getWrite();
        sb.append(write != null ? write.toString() : null);
        return sb.toString();
    }

    public boolean equals(Object p0) {
        return (p0 instanceof setDropDownVerticalOffset) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((setDropDownVerticalOffset) p0).RemoteActionCompatParcelizer(), RemoteActionCompatParcelizer());
    }

    public int hashCode() {
        return RemoteActionCompatParcelizer().hashCode();
    }

    /* JADX INFO: renamed from: o.setDropDownVerticalOffset$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setDropDownVerticalOffset$IconCompatParcelizer;", "", "<init>", "()V", "Lo/setDropDownVerticalOffset;", "RemoteActionCompatParcelizer", "Lo/setDropDownVerticalOffset;", "AudioAttributesCompatParcelizer", "()Lo/setDropDownVerticalOffset;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final setDropDownVerticalOffset AudioAttributesCompatParcelizer() {
            return setDropDownVerticalOffset.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ setDropDownVerticalOffset(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
