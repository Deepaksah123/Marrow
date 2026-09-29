package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010"}, d2 = {"Lo/hasAnyGetterAnnotation;", "", "<init>", "()V", "Lo/hasAnyGetter;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/hasAnyGetter;)Z", "IconCompatParcelizer", "Lo/hasAnyGetter;", "write", "Lo/setEmojiCompatEnabled;", "AudioAttributesCompatParcelizer", "Lo/setEmojiCompatEnabled;", "read", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasAnyGetterAnnotation {
    private setEmojiCompatEnabled<hasAnyGetter> AudioAttributesCompatParcelizer;
    private hasAnyGetter IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private setEmojiCompatEnabled<hasAnyGetter> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private hasAnyGetter RemoteActionCompatParcelizer;

    public final boolean RemoteActionCompatParcelizer(hasAnyGetter p0) {
        if (!this.read) {
            emptyAndGetCurrentSegment.AudioAttributesCompatParcelizer("Only add dependencies during a tracking");
        }
        setEmojiCompatEnabled<hasAnyGetter> setemojicompatenabled = this.AudioAttributesCompatParcelizer;
        if (setemojicompatenabled != null) {
            toMagicModuleMetaRepoModel.write(setemojicompatenabled);
            setemojicompatenabled.write(p0);
        } else if (this.IconCompatParcelizer != null) {
            setEmojiCompatEnabled<hasAnyGetter> setemojicompatenabledAudioAttributesCompatParcelizer = setSupportAllCaps.AudioAttributesCompatParcelizer();
            hasAnyGetter hasanygetter = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(hasanygetter);
            setemojicompatenabledAudioAttributesCompatParcelizer.write(hasanygetter);
            setemojicompatenabledAudioAttributesCompatParcelizer.write(p0);
            this.AudioAttributesCompatParcelizer = setemojicompatenabledAudioAttributesCompatParcelizer;
            this.IconCompatParcelizer = null;
        } else {
            this.IconCompatParcelizer = p0;
        }
        setEmojiCompatEnabled<hasAnyGetter> setemojicompatenabled2 = this.write;
        if (setemojicompatenabled2 != null) {
            toMagicModuleMetaRepoModel.write(setemojicompatenabled2);
            return !setemojicompatenabled2.AudioAttributesCompatParcelizer(p0);
        }
        if (this.RemoteActionCompatParcelizer != p0) {
            return true;
        }
        this.RemoteActionCompatParcelizer = null;
        return false;
    }
}
