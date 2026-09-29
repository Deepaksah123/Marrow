package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class doLicense {
    private isEncrypted AudioAttributesCompatParcelizer;
    private String RemoteActionCompatParcelizer;
    private getMeanBandwidth read;

    public doLicense(getMeanBandwidth getmeanbandwidth, String str, isEncrypted isencrypted) {
        this.read = getmeanbandwidth;
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = isencrypted;
    }

    public final void IconCompatParcelizer(List list) {
        synchronized (this) {
            DefaultAudioSinkApi31 defaultAudioSinkApi31IconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(list);
            if (defaultAudioSinkApi31IconCompatParcelizer instanceof Ac4Util) {
                byte[] bArr = (byte[]) ((Ac4Util) defaultAudioSinkApi31IconCompatParcelizer).RemoteActionCompatParcelizer;
                ((getSkippedFrames) this.read).write(bArr, this.RemoteActionCompatParcelizer);
            } else if (!(defaultAudioSinkApi31IconCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
        }
    }

    public final DefaultAudioSinkApi31 AudioAttributesCompatParcelizer() {
        DefaultAudioSinkApi31 codecneedsdiscardchannelsworkaround;
        synchronized (this) {
            DefaultAudioSinkApi31 defaultAudioSinkApi31 = ((getSkippedFrames) this.read).read(this.RemoteActionCompatParcelizer);
            if (defaultAudioSinkApi31 instanceof Ac4Util) {
                codecneedsdiscardchannelsworkaround = this.AudioAttributesCompatParcelizer.read((byte[]) ((Ac4Util) defaultAudioSinkApi31).RemoteActionCompatParcelizer);
                if (!(codecneedsdiscardchannelsworkaround instanceof Ac4Util)) {
                    if (!(codecneedsdiscardchannelsworkaround instanceof codecNeedsDiscardChannelsWorkaround)) {
                        throw new RenewEligibleCreator();
                    }
                    codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(initForPrivateFrame.IconCompatParcelizer);
                }
            } else if (defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround) {
                getAudioUnderrunRate getaudiounderrunrate = (getAudioUnderrunRate) ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi31).IconCompatParcelizer;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getaudiounderrunrate, dispatchEvent.IconCompatParcelizer)) {
                    codecneedsdiscardchannelsworkaround = new Ac4Util(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
                } else {
                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getaudiounderrunrate, maybeUpdateMetricsBuilderValues.write)) {
                        throw new RenewEligibleCreator();
                    }
                    codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(initForPrivateFrame.IconCompatParcelizer);
                }
            } else {
                throw new RenewEligibleCreator();
            }
        }
        return codecneedsdiscardchannelsworkaround;
    }
}
