package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ProgramInformation {
    public final String copyright;
    public final String lang;
    public final String moreInformationURL;
    public final String source;
    public final String title;

    public ProgramInformation(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.source = str2;
        this.copyright = str3;
        this.moreInformationURL = str4;
        this.lang = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramInformation)) {
            return false;
        }
        ProgramInformation programInformation = (ProgramInformation) obj;
        return Util.areEqual(this.title, programInformation.title) && Util.areEqual(this.source, programInformation.source) && Util.areEqual(this.copyright, programInformation.copyright) && Util.areEqual(this.moreInformationURL, programInformation.moreInformationURL) && Util.areEqual(this.lang, programInformation.lang);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.source;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.copyright;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.moreInformationURL;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.lang;
        return ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }
}
