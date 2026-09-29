package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getRelatedMcqCount {
    public static final getRelatedMcqCount read = new getRelatedMcqCount();

    private getRelatedMcqCount() {
    }

    public final boolean AudioAttributesCompatParcelizer(getFilterText getfiltertext, Preference preference, Preference preference2) {
        toMagicModuleMetaRepoModel.write(getfiltertext, "");
        toMagicModuleMetaRepoModel.write(preference, "");
        toMagicModuleMetaRepoModel.write(preference2, "");
        return write(getfiltertext, preference, preference2);
    }

    private final boolean write(getFilterText getfiltertext, Preference preference, Preference preference2) {
        if (preference == preference2) {
            return true;
        }
        TaxPercentInfoCompanion taxPercentInfoCompanion = getfiltertext.read(preference);
        TaxPercentInfoCompanion taxPercentInfoCompanion2 = getfiltertext.read(preference2);
        if (taxPercentInfoCompanion != null && taxPercentInfoCompanion2 != null) {
            return read(getfiltertext, taxPercentInfoCompanion, taxPercentInfoCompanion2);
        }
        TaxInfo taxInfoWrite = getfiltertext.write(preference);
        TaxInfo taxInfoWrite2 = getfiltertext.write(preference2);
        return taxInfoWrite != null && taxInfoWrite2 != null && read(getfiltertext, getfiltertext.AudioAttributesCompatParcelizer(taxInfoWrite), getfiltertext.AudioAttributesCompatParcelizer(taxInfoWrite2)) && read(getfiltertext, getfiltertext.read(taxInfoWrite), getfiltertext.read(taxInfoWrite2));
    }

    private final boolean read(getFilterText getfiltertext, TaxPercentInfoCompanion taxPercentInfoCompanion, TaxPercentInfoCompanion taxPercentInfoCompanion2) {
        TaxPercentInfoCompanion taxPercentInfoCompanion3 = taxPercentInfoCompanion;
        TaxPercentInfoCompanion taxPercentInfoCompanion4 = taxPercentInfoCompanion2;
        if (getfiltertext.IconCompatParcelizer((Preference) taxPercentInfoCompanion3) == getfiltertext.IconCompatParcelizer((Preference) taxPercentInfoCompanion4) && getfiltertext.MediaBrowserCompatItemReceiver(taxPercentInfoCompanion) == getfiltertext.MediaBrowserCompatItemReceiver(taxPercentInfoCompanion2)) {
            if ((getfiltertext.RemoteActionCompatParcelizer(taxPercentInfoCompanion) == null) == (getfiltertext.RemoteActionCompatParcelizer(taxPercentInfoCompanion2) == null) && getfiltertext.AudioAttributesCompatParcelizer(getfiltertext.MediaBrowserCompatMediaItem(taxPercentInfoCompanion), getfiltertext.MediaBrowserCompatMediaItem(taxPercentInfoCompanion2))) {
                if (getfiltertext.AudioAttributesCompatParcelizer(taxPercentInfoCompanion, taxPercentInfoCompanion2)) {
                    return true;
                }
                int iIconCompatParcelizer = getfiltertext.IconCompatParcelizer((Preference) taxPercentInfoCompanion3);
                for (int i = 0; i < iIconCompatParcelizer; i++) {
                    setPermanent setpermanentAudioAttributesCompatParcelizer = getfiltertext.AudioAttributesCompatParcelizer(taxPercentInfoCompanion3, i);
                    setPermanent setpermanentAudioAttributesCompatParcelizer2 = getfiltertext.AudioAttributesCompatParcelizer(taxPercentInfoCompanion4, i);
                    if (getfiltertext.write(setpermanentAudioAttributesCompatParcelizer) != getfiltertext.write(setpermanentAudioAttributesCompatParcelizer2)) {
                        return false;
                    }
                    if (!getfiltertext.write(setpermanentAudioAttributesCompatParcelizer) && (getfiltertext.RemoteActionCompatParcelizer(setpermanentAudioAttributesCompatParcelizer) != getfiltertext.RemoteActionCompatParcelizer(setpermanentAudioAttributesCompatParcelizer2) || !write(getfiltertext, getfiltertext.IconCompatParcelizer(setpermanentAudioAttributesCompatParcelizer), getfiltertext.IconCompatParcelizer(setpermanentAudioAttributesCompatParcelizer2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
