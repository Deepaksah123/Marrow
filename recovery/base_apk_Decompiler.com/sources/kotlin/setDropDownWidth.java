package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b6\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108!X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0001\u0015"}, d2 = {"Lo/setDropDownWidth;", "", "<init>", "()V", "p0", "RemoteActionCompatParcelizer", "(Lo/setDropDownWidth;)Lo/setDropDownWidth;", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "Lo/setSelector;", "read", "()Lo/setSelector;", "AudioAttributesCompatParcelizer", "write", "Lo/setFirstBaselineToTopHeight;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setDropDownWidth {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final setDropDownWidth read = new setFirstBaselineToTopHeight(new setSelector(null, null, null, null, null, false, null, 127, null));
    private static final setDropDownWidth RemoteActionCompatParcelizer = new setFirstBaselineToTopHeight(new setSelector(null, null, null, null, null, true, null, 95, null));

    public abstract setSelector read();

    private setDropDownWidth() {
    }

    public final setDropDownWidth RemoteActionCompatParcelizer(setDropDownWidth p0) {
        AppCompatSpinnerSavedState remoteActionCompatParcelizer = p0.read().getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = read().getRemoteActionCompatParcelizer();
        }
        AppCompatSpinnerSavedState appCompatSpinnerSavedState = remoteActionCompatParcelizer;
        AppCompatToggleButton read2 = p0.read().getRead();
        if (read2 == null) {
            read2 = read().getRead();
        }
        AppCompatToggleButton appCompatToggleButton = read2;
        AppCompatImageView iconCompatParcelizer = p0.read().getIconCompatParcelizer();
        if (iconCompatParcelizer == null) {
            iconCompatParcelizer = read().getIconCompatParcelizer();
        }
        AppCompatImageView appCompatImageView = iconCompatParcelizer;
        setLineHeight write = p0.read().getWrite();
        if (write == null) {
            write = read().getWrite();
        }
        setLineHeight setlineheight = write;
        setDecorPadding audioAttributesCompatParcelizer = p0.read().getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer == null) {
            audioAttributesCompatParcelizer = read().getAudioAttributesCompatParcelizer();
        }
        return new setFirstBaselineToTopHeight(new setSelector(appCompatSpinnerSavedState, appCompatToggleButton, appCompatImageView, setlineheight, audioAttributesCompatParcelizer, p0.read().getMediaBrowserCompatItemReceiver() || read().getMediaBrowserCompatItemReceiver(), VideoTimelineResponseBody.read(read().AudioAttributesCompatParcelizer(), p0.read().AudioAttributesCompatParcelizer())));
    }

    public boolean equals(Object p0) {
        return (p0 instanceof setDropDownWidth) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((setDropDownWidth) p0).read(), read());
    }

    public String toString() {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this, read)) {
            return "ExitTransition.None";
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this, RemoteActionCompatParcelizer)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        setSelector setselector = read();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        AppCompatSpinnerSavedState remoteActionCompatParcelizer = setselector.getRemoteActionCompatParcelizer();
        sb.append(remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.toString() : null);
        sb.append(",\nSlide - ");
        AppCompatToggleButton read2 = setselector.getRead();
        sb.append(read2 != null ? read2.toString() : null);
        sb.append(",\nShrink - ");
        AppCompatImageView iconCompatParcelizer = setselector.getIconCompatParcelizer();
        sb.append(iconCompatParcelizer != null ? iconCompatParcelizer.toString() : null);
        sb.append(",\nScale - ");
        setLineHeight write = setselector.getWrite();
        sb.append(write != null ? write.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(setselector.getMediaBrowserCompatItemReceiver());
        return sb.toString();
    }

    public int hashCode() {
        return read().hashCode();
    }

    /* JADX INFO: renamed from: o.setDropDownWidth$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lo/setDropDownWidth$write;", "", "<init>", "()V", "Lo/setDropDownWidth;", "read", "Lo/setDropDownWidth;", "write", "()Lo/setDropDownWidth;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final setDropDownWidth write() {
            return setDropDownWidth.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ setDropDownWidth(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
