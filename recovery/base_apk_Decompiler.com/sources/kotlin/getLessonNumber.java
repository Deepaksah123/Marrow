package kotlin;

import kotlin.getHighYieldIds;

/* JADX INFO: loaded from: classes4.dex */
final class getLessonNumber implements getLastAttemptedTimeMs<getHighYieldIds> {
    public static final getLessonNumber write = new getLessonNumber();

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[getShowNotesWatermark.values().length];
            try {
                iArr[getShowNotesWatermark.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getShowNotesWatermark.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getShowNotesWatermark.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getShowNotesWatermark.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getShowNotesWatermark.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[getShowNotesWatermark.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[getShowNotesWatermark.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[getShowNotesWatermark.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    private getLessonNumber() {
    }

    @Override // kotlin.getLastAttemptedTimeMs
    public final /* synthetic */ getHighYieldIds AudioAttributesCompatParcelizer(String str) {
        return IconCompatParcelizer(str);
    }

    @Override // kotlin.getLastAttemptedTimeMs
    public final /* synthetic */ getHighYieldIds AudioAttributesCompatParcelizer(getShowNotesWatermark getshownoteswatermark) {
        return write(getshownoteswatermark);
    }

    @Override // kotlin.getLastAttemptedTimeMs
    public final /* synthetic */ getHighYieldIds IconCompatParcelizer() {
        return read();
    }

    @Override // kotlin.getLastAttemptedTimeMs
    public final /* bridge */ /* synthetic */ getHighYieldIds write(getHighYieldIds gethighyieldids) {
        return write2(gethighyieldids);
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static getHighYieldIds write2(getHighYieldIds gethighyieldids) {
        toMagicModuleMetaRepoModel.write(gethighyieldids, "");
        if (!(gethighyieldids instanceof getHighYieldIds.RemoteActionCompatParcelizer)) {
            return gethighyieldids;
        }
        getHighYieldIds.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (getHighYieldIds.RemoteActionCompatParcelizer) gethighyieldids;
        if (remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer() == null) {
            return gethighyieldids;
        }
        String strAudioAttributesCompatParcelizer = setMcqType.read(remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer()).AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        return IconCompatParcelizer(strAudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getLastAttemptedTimeMs
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public getHighYieldIds write(String str) {
        setOption2AnsweredCount setoption2answeredcount;
        toMagicModuleMetaRepoModel.write(str, "");
        String str2 = str;
        char cCharAt = str.charAt(0);
        setOption2AnsweredCount[] setoption2answeredcountArrValues = setOption2AnsweredCount.values();
        int length = setoption2answeredcountArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                setoption2answeredcount = null;
                break;
            }
            setoption2answeredcount = setoption2answeredcountArrValues[i];
            if (setoption2answeredcount.AudioAttributesCompatParcelizer().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (setoption2answeredcount != null) {
            return new getHighYieldIds.RemoteActionCompatParcelizer(setoption2answeredcount);
        }
        if (cCharAt == 'V') {
            return new getHighYieldIds.RemoteActionCompatParcelizer(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            return new getHighYieldIds.IconCompatParcelizer(write(strSubstring));
        }
        if (cCharAt == 'L') {
            TestGroupLSModel.write((CharSequence) str2, ';', false);
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
        return new getHighYieldIds.write(strSubstring2);
    }

    private static getHighYieldIds write(getShowNotesWatermark getshownoteswatermark) {
        toMagicModuleMetaRepoModel.write(getshownoteswatermark, "");
        switch (RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[getshownoteswatermark.ordinal()]) {
            case 1:
                getHighYieldIds.read readVar = getHighYieldIds.AudioAttributesCompatParcelizer;
                return getHighYieldIds.read.AudioAttributesCompatParcelizer();
            case 2:
                getHighYieldIds.read readVar2 = getHighYieldIds.AudioAttributesCompatParcelizer;
                return getHighYieldIds.read.write();
            case 3:
                getHighYieldIds.read readVar3 = getHighYieldIds.AudioAttributesCompatParcelizer;
                return getHighYieldIds.read.read();
            case 4:
                getHighYieldIds.read readVar4 = getHighYieldIds.AudioAttributesCompatParcelizer;
                return getHighYieldIds.read.AudioAttributesImplApi26Parcelizer();
            case 5:
                getHighYieldIds.read readVar5 = getHighYieldIds.AudioAttributesCompatParcelizer;
                return getHighYieldIds.read.AudioAttributesImplApi21Parcelizer();
            case 6:
                getHighYieldIds.read readVar6 = getHighYieldIds.AudioAttributesCompatParcelizer;
                return getHighYieldIds.read.IconCompatParcelizer();
            case 7:
                getHighYieldIds.read readVar7 = getHighYieldIds.AudioAttributesCompatParcelizer;
                return getHighYieldIds.read.AudioAttributesImplBaseParcelizer();
            case 8:
                getHighYieldIds.read readVar8 = getHighYieldIds.AudioAttributesCompatParcelizer;
                return getHighYieldIds.read.RemoteActionCompatParcelizer();
            default:
                throw new RenewEligibleCreator();
        }
    }

    private static getHighYieldIds.write IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return new getHighYieldIds.write(str);
    }

    @Override // kotlin.getLastAttemptedTimeMs
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final String AudioAttributesCompatParcelizer(getHighYieldIds gethighyieldids) {
        String strAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(gethighyieldids, "");
        if (gethighyieldids instanceof getHighYieldIds.IconCompatParcelizer) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(AudioAttributesCompatParcelizer(((getHighYieldIds.IconCompatParcelizer) gethighyieldids).AudioAttributesImplApi21Parcelizer()));
            return sb.toString();
        }
        if (gethighyieldids instanceof getHighYieldIds.RemoteActionCompatParcelizer) {
            setOption2AnsweredCount setoption2answeredcountAudioAttributesImplApi21Parcelizer = ((getHighYieldIds.RemoteActionCompatParcelizer) gethighyieldids).AudioAttributesImplApi21Parcelizer();
            return (setoption2answeredcountAudioAttributesImplApi21Parcelizer == null || (strAudioAttributesCompatParcelizer = setoption2answeredcountAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer()) == null) ? "V" : strAudioAttributesCompatParcelizer;
        }
        if (!(gethighyieldids instanceof getHighYieldIds.write)) {
            throw new RenewEligibleCreator();
        }
        StringBuilder sb2 = new StringBuilder("L");
        sb2.append(((getHighYieldIds.write) gethighyieldids).AudioAttributesImplApi21Parcelizer());
        sb2.append(';');
        return sb2.toString();
    }

    private static getHighYieldIds read() {
        return IconCompatParcelizer("java/lang/Class");
    }
}
