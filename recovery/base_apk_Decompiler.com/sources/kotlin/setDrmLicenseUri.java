package kotlin;

import java.io.File;
import kotlin.MediaItemClippingProperties;

/* JADX INFO: loaded from: classes2.dex */
final class setDrmLicenseUri<DataType> implements MediaItemClippingProperties.write {
    private final DataType AudioAttributesCompatParcelizer;
    private final r8lambda_r106e6zya8q8i_eKUnQWRolPk IconCompatParcelizer;
    private final onShuffleModeEnabledChanged<DataType> write;

    setDrmLicenseUri(onShuffleModeEnabledChanged<DataType> onshufflemodeenabledchanged, DataType datatype, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        this.write = onshufflemodeenabledchanged;
        this.AudioAttributesCompatParcelizer = datatype;
        this.IconCompatParcelizer = r8lambda_r106e6zya8q8i_ekunqwrolpk;
    }

    @Override // o.MediaItemClippingProperties.write
    public final boolean AudioAttributesCompatParcelizer(File file) {
        return this.write.write(this.AudioAttributesCompatParcelizer, file, this.IconCompatParcelizer);
    }
}
