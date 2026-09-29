package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class isYearUpdateRequired extends setReBufferCount implements getPassingYear {
    @Override // kotlin.getPassingYear
    /* JADX INFO: renamed from: bf_ */
    public final isYearUpdateRequired getAudioAttributesCompatParcelizer() {
        return this;
    }

    @Override // kotlin.getPassingYear
    public final boolean bi_() {
        return true;
    }

    public final String write(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        isYearUpdateRequired isyearupdaterequired = this;
        Object objAudioAttributesImplBaseParcelizer = isyearupdaterequired.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.read(objAudioAttributesImplBaseParcelizer, "");
        boolean z = true;
        for (setPrepareTimestampMs setpreparetimestampmsAudioAttributesImplApi21Parcelizer = (setPrepareTimestampMs) objAudioAttributesImplBaseParcelizer; !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setpreparetimestampmsAudioAttributesImplApi21Parcelizer, isyearupdaterequired); setpreparetimestampmsAudioAttributesImplApi21Parcelizer = setpreparetimestampmsAudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer()) {
            if (setpreparetimestampmsAudioAttributesImplApi21Parcelizer instanceof getDefaultCourseEdition) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(setpreparetimestampmsAudioAttributesImplApi21Parcelizer);
            }
        }
        sb.append("]");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @Override // kotlin.setPrepareTimestampMs
    public final String toString() {
        return getCollegeId.IconCompatParcelizer() ? write("Active") : super.toString();
    }
}
