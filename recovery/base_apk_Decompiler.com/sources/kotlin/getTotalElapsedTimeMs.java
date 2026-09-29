package kotlin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class getTotalElapsedTimeMs {
    public static final DefaultAudioSinkApi31 read(String str, String str2) {
        DefaultAudioSinkApi31 codecneedsdiscardchannelsworkaround;
        newHeaderTestItem newheadertestitemRemoteActionCompatParcelizer;
        setTestBeginTimestamp settestbegintimestampRemoteActionCompatParcelizer;
        newHeaderTestItem newheadertestitemRemoteActionCompatParcelizer2;
        setTestBeginTimestamp settestbegintimestampRemoteActionCompatParcelizer2;
        newHeaderTestItem newheadertestitemRemoteActionCompatParcelizer3;
        setTestBeginTimestamp settestbegintimestampRemoteActionCompatParcelizer3;
        try {
            String strWrite = getFrameSizeInSamples.write.write();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("(.*?)(");
            sb.append(strWrite);
            sb.append(')');
            newPrevYearTestContainer newprevyeartestcontainer = newYearNameItem.read(new newYearNameItem(sb.toString()), str);
            String strRemoteActionCompatParcelizer = null;
            String strRemoteActionCompatParcelizer2 = (newprevyeartestcontainer == null || (newheadertestitemRemoteActionCompatParcelizer3 = newprevyeartestcontainer.RemoteActionCompatParcelizer()) == null || (settestbegintimestampRemoteActionCompatParcelizer3 = newheadertestitemRemoteActionCompatParcelizer3.RemoteActionCompatParcelizer(3)) == null) ? null : settestbegintimestampRemoteActionCompatParcelizer3.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write((Object) strRemoteActionCompatParcelizer2);
            String strRemoteActionCompatParcelizer3 = (newprevyeartestcontainer == null || (newheadertestitemRemoteActionCompatParcelizer2 = newprevyeartestcontainer.RemoteActionCompatParcelizer()) == null || (settestbegintimestampRemoteActionCompatParcelizer2 = newheadertestitemRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(5)) == null) ? null : settestbegintimestampRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write((Object) strRemoteActionCompatParcelizer3);
            if (newprevyeartestcontainer != null && (newheadertestitemRemoteActionCompatParcelizer = newprevyeartestcontainer.RemoteActionCompatParcelizer()) != null && (settestbegintimestampRemoteActionCompatParcelizer = newheadertestitemRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(7)) != null) {
                strRemoteActionCompatParcelizer = settestbegintimestampRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
            codecneedsdiscardchannelsworkaround = new Ac4Util(IconCompatParcelizer(strRemoteActionCompatParcelizer2, strRemoteActionCompatParcelizer3, strRemoteActionCompatParcelizer));
        } catch (Throwable th) {
            codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(th);
        }
        return DefaultAudioSinkConfiguration.write(codecneedsdiscardchannelsworkaround);
    }

    private static DefaultAudioSinkApi31 IconCompatParcelizer(String str, String str2, String str3) {
        DefaultAudioSinkApi31 codecneedsdiscardchannelsworkaround;
        Long l;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(onOutputFormatChanged.write.write(), Locale.US);
            try {
                codecneedsdiscardchannelsworkaround = new Ac4Util(TimeZone.getTimeZone(getMeanSeekCount.read.write()));
            } catch (Throwable th) {
                codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(th);
            }
            simpleDateFormat.getCalendar().setTimeZone((TimeZone) setForHeaderData.read(codecneedsdiscardchannelsworkaround, TimeZone.getTimeZone(parseDtsFormat.IconCompatParcelizer.write())));
            Date date = simpleDateFormat.parse(str);
            toMagicModuleMetaRepoModel.write(date);
            return new Ac4Util(Long.valueOf((date.getTime() * 1000000) + Long.parseLong(str2) + ((str3 == null || (l = (Long) setForHeaderData.read(RemoteActionCompatParcelizer(str3))) == null) ? 0L : l.longValue())));
        } catch (Throwable th2) {
            return new codecNeedsDiscardChannelsWorkaround(th2);
        }
    }

    private static DefaultAudioSinkApi31 RemoteActionCompatParcelizer(String str) {
        try {
            if (str.length() != 5) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            boolean z = false;
            if (IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Character[]{'-', '+'}).contains(Character.valueOf(str.charAt(0)))) {
                String strWrite = TestGroupLSModel.write(str, new newEncryptedObject(1, 4));
                for (int i = 0; i < strWrite.length(); i++) {
                    if (!Character.isDigit(strWrite.charAt(i))) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                long j = Long.parseLong(TestGroupLSModel.write(str, new newEncryptedObject(1, 2)));
                if (0 <= j && j < 24) {
                    long j2 = Long.parseLong(TestGroupLSModel.write(str, new newEncryptedObject(3, 4)));
                    if (0 <= j2 && j2 < 60) {
                        char cCharAt = str.charAt(0);
                        if (cCharAt != '+') {
                            if (cCharAt != '-') {
                                throw new Exception();
                            }
                            z = true;
                        }
                        long j3 = ((j * 60) + j2) * 60000000000L;
                        if (!z) {
                            j3 = -j3;
                        }
                        return new Ac4Util(Long.valueOf(j3));
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        } catch (Throwable th) {
            return new codecNeedsDiscardChannelsWorkaround(th);
        }
    }
}
