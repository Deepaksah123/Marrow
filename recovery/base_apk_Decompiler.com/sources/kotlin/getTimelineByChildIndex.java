package kotlin;

import kotlin.ValueClassSerializerStaticJsonValue;

/* JADX INFO: loaded from: classes2.dex */
public final class getTimelineByChildIndex extends ValueClassSerializerStaticJsonValue.read {
    private final setInstallerPackageName RemoteActionCompatParcelizer;

    public getTimelineByChildIndex(setInstallerPackageName setinstallerpackagename) {
        toMagicModuleMetaRepoModel.write(setinstallerpackagename, "");
        this.RemoteActionCompatParcelizer = setinstallerpackagename;
    }

    private final String read() {
        StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
        sb.append(IconCompatParcelizer());
        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return sb.toString();
    }

    private final long IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.read() - setVolumeMultiplier.RemoteActionCompatParcelizer;
    }

    @Override // o.ValueClassSerializerStaticJsonValue.read
    public final void AudioAttributesCompatParcelizer(setDrawSliceText setdrawslicetext) {
        toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        super.AudioAttributesCompatParcelizer(setdrawslicetext);
        setdrawslicetext.AudioAttributesCompatParcelizer();
        try {
            setdrawslicetext.AudioAttributesCompatParcelizer(read());
            setdrawslicetext.MediaBrowserCompatItemReceiver();
        } finally {
            setdrawslicetext.write();
        }
    }
}
