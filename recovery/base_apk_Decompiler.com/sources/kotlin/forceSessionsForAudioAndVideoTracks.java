package kotlin;

import kotlin.getKeySetId;

/* JADX INFO: loaded from: classes2.dex */
public final class forceSessionsForAudioAndVideoTracks extends prepareChildSource<onVolumeChanged, setMimeType<?>> implements getKeySetId {
    private getKeySetId.IconCompatParcelizer IconCompatParcelizer;

    @Override // kotlin.getKeySetId
    public final /* synthetic */ setMimeType AudioAttributesCompatParcelizer(onVolumeChanged onvolumechanged) {
        return (setMimeType) super.write(onvolumechanged);
    }

    @Override // kotlin.getKeySetId
    public final /* synthetic */ setMimeType RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, setMimeType setmimetype) {
        return (setMimeType) super.IconCompatParcelizer(onvolumechanged, setmimetype);
    }

    @Override // kotlin.prepareChildSource
    public final /* bridge */ /* synthetic */ void read(onVolumeChanged onvolumechanged, setMimeType<?> setmimetype) {
        read(setmimetype);
    }

    public forceSessionsForAudioAndVideoTracks(long j) {
        super(j);
    }

    @Override // kotlin.getKeySetId
    public final void RemoteActionCompatParcelizer(getKeySetId.IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    private void read(setMimeType<?> setmimetype) {
        getKeySetId.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer == null || setmimetype == null) {
            return;
        }
        iconCompatParcelizer.IconCompatParcelizer(setmimetype);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.prepareChildSource
    public int IconCompatParcelizer(setMimeType<?> setmimetype) {
        if (setmimetype == null) {
            return super.IconCompatParcelizer((Object) null);
        }
        return setmimetype.write();
    }

    @Override // kotlin.getKeySetId
    public final void RemoteActionCompatParcelizer(int i) {
        if (i >= 40) {
            write();
        } else if (i >= 20 || i == 15) {
            RemoteActionCompatParcelizer(IconCompatParcelizer() / 2);
        }
    }
}
