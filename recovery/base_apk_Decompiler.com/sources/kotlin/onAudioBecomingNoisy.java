package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/onAudioBecomingNoisy;", "Lo/setVisibleYRange;", "<init>", "()V", "Lo/setDrawSliceText;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/setDrawSliceText;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onAudioBecomingNoisy extends setVisibleYRange {
    public static final onAudioBecomingNoisy INSTANCE = new onAudioBecomingNoisy();

    private onAudioBecomingNoisy() {
        super(15, 16);
    }

    @Override // kotlin.setVisibleYRange
    public final void AudioAttributesCompatParcelizer(setDrawSliceText p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.AudioAttributesCompatParcelizer("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        p0.AudioAttributesCompatParcelizer("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        p0.AudioAttributesCompatParcelizer("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        p0.AudioAttributesCompatParcelizer("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        p0.AudioAttributesCompatParcelizer("DROP TABLE `SystemIdInfo`");
        p0.AudioAttributesCompatParcelizer("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
